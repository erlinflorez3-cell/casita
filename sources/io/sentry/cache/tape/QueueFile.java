package io.sentry.cache.tape;

import com.facebook.cache.disk.DefaultDiskStorage;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    static final int INITIAL_LENGTH = 4096;
    private static final int VERSIONED_HEADER = -2147483647;
    private static final byte[] ZEROES = new byte[4096];
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    private Element last;
    private final int maxElements;
    RandomAccessFile raf;
    private final boolean zero;
    final int headerLength = 32;
    private final byte[] buffer = new byte[32];
    int modCount = 0;

    public static final class Builder {
        final File file;
        boolean zero = true;
        int size = -1;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public QueueFile build() throws IOException {
            RandomAccessFile randomAccessFileInitializeFromFile = QueueFile.initializeFromFile(this.file);
            try {
                return new QueueFile(this.file, randomAccessFileInitializeFromFile, this.zero, this.size);
            } catch (Throwable th) {
                randomAccessFileInitializeFromFile.close();
                throw th;
            }
        }

        public Builder size(int i2) {
            this.size = i2;
            return this;
        }

        public Builder zero(boolean z2) {
            this.zero = z2;
            return this;
        }
    }

    static final class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        Element(long j2, int i2) {
            this.position = j2;
            this.length = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position=" + this.position + ", length=" + this.length + "]";
        }
    }

    private final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex >= QueueFile.this.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    Element element = QueueFile.this.readElement(this.nextElementPosition);
                    byte[] bArr = new byte[element.length];
                    long jWrapPosition = QueueFile.this.wrapPosition(element.position + 4);
                    this.nextElementPosition = jWrapPosition;
                    if (!QueueFile.this.ringRead(jWrapPosition, bArr, 0, element.length)) {
                        this.nextElementIndex = QueueFile.this.elementCount;
                        return QueueFile.ZEROES;
                    }
                    this.nextElementPosition = QueueFile.this.wrapPosition(element.position + 4 + ((long) element.length));
                    this.nextElementIndex++;
                    return bArr;
                } catch (IOException e2) {
                    throw ((Error) QueueFile.getSneakyThrowable(e2));
                } catch (OutOfMemoryError unused) {
                    QueueFile.this.resetFile();
                    this.nextElementIndex = QueueFile.this.elementCount;
                    return QueueFile.ZEROES;
                }
            } catch (IOException e3) {
                throw ((Error) QueueFile.getSneakyThrowable(e3));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e2) {
                throw ((Error) QueueFile.getSneakyThrowable(e2));
            }
        }
    }

    QueueFile(File file, RandomAccessFile randomAccessFile, boolean z2, int i2) throws IOException {
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z2;
        this.maxElements = i2;
        readInitialData();
    }

    private void expandIfNecessary(long j2) throws IOException {
        long j3;
        long j4 = j2 + 4;
        long jRemainingBytes = remainingBytes();
        if (jRemainingBytes >= j4) {
            return;
        }
        long j5 = this.fileLength;
        do {
            jRemainingBytes += j5;
            j5 <<= 1;
        } while (jRemainingBytes < j4);
        setLength(j5);
        long jWrapPosition = wrapPosition(this.last.position + 4 + ((long) this.last.length));
        if (jWrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            j3 = jWrapPosition - 32;
            if (channel.transferTo(32L, j3, channel) != j3) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j3 = 0;
        }
        if (this.last.position < this.first.position) {
            long j6 = (this.fileLength + this.last.position) - 32;
            writeHeader(j5, this.elementCount, this.first.position, j6);
            this.last = new Element(j6, this.last.length);
        } else {
            writeHeader(j5, this.elementCount, this.first.position, this.last.position);
        }
        this.fileLength = j5;
        if (this.zero) {
            ringErase(32L, j3);
        }
    }

    static <T extends Throwable> T getSneakyThrowable(Throwable th) throws Throwable {
        throw th;
    }

    static RandomAccessFile initializeFromFile(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + DefaultDiskStorage.FileType.TEMP);
            RandomAccessFile randomAccessFileOpen = open(file2);
            try {
                randomAccessFileOpen.setLength(4096L);
                randomAccessFileOpen.seek(0L);
                randomAccessFileOpen.writeInt(VERSIONED_HEADER);
                randomAccessFileOpen.writeLong(4096L);
                randomAccessFileOpen.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFileOpen.close();
                throw th;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private void readInitialData() throws IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        this.fileLength = readLong(this.buffer, 4);
        this.elementCount = readInt(this.buffer, 12);
        long j2 = readLong(this.buffer, 16);
        long j3 = readLong(this.buffer, 24);
        if (this.fileLength > this.raf.length()) {
            throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        if (this.fileLength <= 32) {
            throw new IOException("File is corrupt; length stored in header (" + this.fileLength + ") is invalid.");
        }
        this.first = readElement(j2);
        this.last = readElement(j3);
    }

    private static int readInt(byte[] bArr, int i2) {
        int i3 = (((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 24) + (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 16);
        byte b2 = bArr[i2 + 2];
        return i3 + (((b2 + 255) - (b2 | 255)) << 8) + (bArr[i2 + 3] & 255);
    }

    private static long readLong(byte[] bArr, int i2) {
        long j2 = bArr[i2];
        long j3 = (((j2 + 255) - (j2 | 255)) << 56) + ((((long) bArr[i2 + 1]) & 255) << 48) + (((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 40) + (((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 32) + ((((long) bArr[i2 + 4]) & 255) << 24);
        long j4 = bArr[i2 + 5];
        return j3 + (((j4 + 255) - (j4 | 255)) << 16) + (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 8) + (((long) bArr[i2 + 7]) & 255);
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetFile() throws IOException {
        this.raf.close();
        this.file.delete();
        this.raf = initializeFromFile(this.file);
        readInitialData();
    }

    private void ringErase(long j2, long j3) throws IOException {
        long j4 = j2;
        while (j3 > 0) {
            byte[] bArr = ZEROES;
            int iMin = (int) Math.min(j3, bArr.length);
            ringWrite(j4, bArr, 0, iMin);
            long j5 = iMin;
            j3 -= j5;
            j4 += j5;
        }
    }

    private void ringWrite(long j2, byte[] bArr, int i2, int i3) throws IOException {
        long jWrapPosition = wrapPosition(j2);
        long j3 = ((long) i3) + jWrapPosition;
        long j4 = this.fileLength;
        if (j3 <= j4) {
            this.raf.seek(jWrapPosition);
            this.raf.write(bArr, i2, i3);
            return;
        }
        int i4 = (int) (j4 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.write(bArr, i2, i4);
        this.raf.seek(32L);
        this.raf.write(bArr, i2 + i4, i3 - i4);
    }

    private void setLength(long j2) throws IOException {
        this.raf.setLength(j2);
        this.raf.getChannel().force(true);
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return 32L;
        }
        return this.last.position >= this.first.position ? (this.last.position - this.first.position) + 4 + ((long) this.last.length) + 32 : (((this.last.position + 4) + ((long) this.last.length)) + this.fileLength) - this.first.position;
    }

    private void writeHeader(long j2, int i2, long j3, long j4) throws IOException {
        this.raf.seek(0L);
        writeInt(this.buffer, 0, VERSIONED_HEADER);
        writeLong(this.buffer, 4, j2);
        writeInt(this.buffer, 12, i2);
        writeLong(this.buffer, 16, j3);
        writeLong(this.buffer, 24, j4);
        this.raf.write(this.buffer, 0, 32);
    }

    private static void writeInt(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void writeLong(byte[] bArr, int i2, long j2) {
        bArr[i2] = (byte) (j2 >> 56);
        bArr[i2 + 1] = (byte) (j2 >> 48);
        bArr[i2 + 2] = (byte) (j2 >> 40);
        bArr[i2 + 3] = (byte) (j2 >> 32);
        bArr[i2 + 4] = (byte) (j2 >> 24);
        bArr[i2 + 5] = (byte) (j2 >> 16);
        bArr[i2 + 6] = (byte) (j2 >> 8);
        bArr[i2 + 7] = (byte) j2;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public void add(byte[] bArr, int i2, int i3) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        expandIfNecessary(i3);
        boolean zIsEmpty = isEmpty();
        Element element = new Element(zIsEmpty ? 32L : wrapPosition(this.last.position + 4 + ((long) this.last.length)), i3);
        writeInt(this.buffer, 0, i3);
        ringWrite(element.position, this.buffer, 0, 4);
        ringWrite(element.position + 4, bArr, i2, i3);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element.position : this.first.position, element.position);
        this.last = element;
        this.elementCount++;
        this.modCount++;
        if (zIsEmpty) {
            this.first = element;
        }
    }

    public void clear() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(32L);
            this.raf.write(ZEROES, 0, 4064);
        }
        this.elementCount = 0;
        this.first = Element.NULL;
        this.last = Element.NULL;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.raf.close();
    }

    public File file() {
        return this.file;
    }

    public boolean isAtFullCapacity() {
        return this.maxElements != -1 && size() == this.maxElements;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    public byte[] peek() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        int i2 = this.first.length;
        byte[] bArr = new byte[i2];
        if (ringRead(this.first.position + 4, bArr, 0, i2)) {
            return bArr;
        }
        return null;
    }

    Element readElement(long j2) throws IOException {
        if (j2 != 0 && ringRead(j2, this.buffer, 0, 4)) {
            return new Element(j2, readInt(this.buffer, 0));
        }
        return Element.NULL;
    }

    public void remove() throws IOException {
        remove(1);
    }

    public void remove(int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i2 + ") number of elements.");
        }
        if (i2 == 0) {
            return;
        }
        if (i2 == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i2 > this.elementCount) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i2 + ") than present in queue (" + this.elementCount + ").");
        }
        long j2 = this.first.position;
        long jWrapPosition = this.first.position;
        int i3 = this.first.length;
        long j3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j3 += (long) (i3 + 4);
            jWrapPosition = wrapPosition(jWrapPosition + 4 + ((long) i3));
            if (!ringRead(jWrapPosition, this.buffer, 0, 4)) {
                return;
            }
            i3 = readInt(this.buffer, 0);
        }
        writeHeader(this.fileLength, this.elementCount - i2, jWrapPosition, this.last.position);
        this.elementCount -= i2;
        this.modCount++;
        this.first = new Element(jWrapPosition, i3);
        if (this.zero) {
            ringErase(j2, j3);
        }
    }

    boolean ringRead(long j2, byte[] bArr, int i2, int i3) throws IOException {
        try {
            long jWrapPosition = wrapPosition(j2);
            long j3 = ((long) i3) + jWrapPosition;
            long j4 = this.fileLength;
            if (j3 <= j4) {
                this.raf.seek(jWrapPosition);
                this.raf.readFully(bArr, i2, i3);
                return true;
            }
            int i4 = (int) (j4 - jWrapPosition);
            this.raf.seek(jWrapPosition);
            this.raf.readFully(bArr, i2, i4);
            this.raf.seek(32L);
            this.raf.readFully(bArr, i2 + i4, i3 - i4);
            return true;
        } catch (EOFException unused) {
            resetFile();
            return false;
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable unused2) {
            resetFile();
            return false;
        }
    }

    public int size() {
        return this.elementCount;
    }

    public String toString() {
        return "QueueFile{file=" + this.file + ", zero=" + this.zero + ", length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + AbstractJsonLexerKt.END_OBJ;
    }

    long wrapPosition(long j2) {
        long j3 = this.fileLength;
        return j2 < j3 ? j2 : (j2 + 32) - j3;
    }
}
