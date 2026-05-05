package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    private static final class NullWriter extends Writer {
        private static final NullWriter INSTANCE = new NullWriter();

        private NullWriter() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c2) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence csq) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@CheckForNull CharSequence csq, int start, int end) {
            Preconditions.checkPositionIndexes(start, end, csq == null ? "null".length() : csq.length());
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int c2) {
        }

        @Override // java.io.Writer
        public void write(String str) {
            Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public void write(String str, int off, int len) {
            Preconditions.checkPositionIndexes(off, len + off, str.length());
        }

        @Override // java.io.Writer
        public void write(char[] cbuf) {
            Preconditions.checkNotNull(cbuf);
        }

        @Override // java.io.Writer
        public void write(char[] cbuf, int off, int len) {
            Preconditions.checkPositionIndexes(off, len + off, cbuf.length);
        }
    }

    private CharStreams() {
    }

    public static Writer asWriter(Appendable target) {
        return target instanceof Writer ? (Writer) target : new AppendableWriter(target);
    }

    public static long copy(Readable from, Appendable to) throws IOException {
        if (from instanceof Reader) {
            return to instanceof StringBuilder ? copyReaderToBuilder((Reader) from, (StringBuilder) to) : copyReaderToWriter((Reader) from, asWriter(to));
        }
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);
        CharBuffer charBufferCreateBuffer = createBuffer();
        long jRemaining = 0;
        while (from.read(charBufferCreateBuffer) != -1) {
            Java8Compatibility.flip(charBufferCreateBuffer);
            to.append(charBufferCreateBuffer);
            jRemaining += (long) charBufferCreateBuffer.remaining();
            Java8Compatibility.clear(charBufferCreateBuffer);
        }
        return jRemaining;
    }

    static long copyReaderToBuilder(Reader from, StringBuilder to) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);
        char[] cArr = new char[2048];
        long j2 = 0;
        while (true) {
            int i2 = from.read(cArr);
            if (i2 == -1) {
                return j2;
            }
            to.append(cArr, 0, i2);
            j2 += (long) i2;
        }
    }

    static long copyReaderToWriter(Reader from, Writer to) throws IOException {
        Preconditions.checkNotNull(from);
        Preconditions.checkNotNull(to);
        char[] cArr = new char[2048];
        long j2 = 0;
        while (true) {
            int i2 = from.read(cArr);
            if (i2 == -1) {
                return j2;
            }
            to.write(cArr, 0, i2);
            j2 += (long) i2;
        }
    }

    static CharBuffer createBuffer() {
        return CharBuffer.allocate(2048);
    }

    public static long exhaust(Readable readable) throws IOException {
        CharBuffer charBufferCreateBuffer = createBuffer();
        long j2 = 0;
        while (true) {
            long j3 = readable.read(charBufferCreateBuffer);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            Java8Compatibility.clear(charBufferCreateBuffer);
        }
    }

    public static Writer nullWriter() {
        return NullWriter.INSTANCE;
    }

    @ParametricNullness
    public static <T> T readLines(Readable readable, LineProcessor<T> processor) throws IOException {
        String line;
        Preconditions.checkNotNull(readable);
        Preconditions.checkNotNull(processor);
        LineReader lineReader = new LineReader(readable);
        do {
            line = lineReader.readLine();
            if (line == null) {
                break;
            }
        } while (processor.processLine(line));
        return processor.getResult();
    }

    public static List<String> readLines(Readable r2) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(r2);
        while (true) {
            String line = lineReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    public static void skipFully(Reader reader, long n2) throws IOException {
        Preconditions.checkNotNull(reader);
        while (n2 > 0) {
            long jSkip = reader.skip(n2);
            if (jSkip == 0) {
                throw new EOFException();
            }
            n2 -= jSkip;
        }
    }

    public static String toString(Readable r2) throws IOException {
        return toStringBuilder(r2).toString();
    }

    private static StringBuilder toStringBuilder(Readable r2) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (r2 instanceof Reader) {
            copyReaderToBuilder((Reader) r2, sb);
        } else {
            copy(r2, sb);
        }
        return sb;
    }
}
