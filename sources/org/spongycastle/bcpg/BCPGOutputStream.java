package org.spongycastle.bcpg;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class BCPGOutputStream extends OutputStream implements PacketTags, CompressionAlgorithmTags {
    private static final int BUF_SIZE_POWER = 16;
    OutputStream out;
    private byte[] partialBuffer;
    private int partialBufferLength;
    private int partialOffset;
    private int partialPower;

    public BCPGOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public BCPGOutputStream(OutputStream outputStream, int i2) throws IOException {
        this.out = outputStream;
        writeHeader(i2, true, true, 0L);
    }

    public BCPGOutputStream(OutputStream outputStream, int i2, long j2) throws IOException {
        this.out = outputStream;
        writeHeader(i2, false, false, j2);
    }

    public BCPGOutputStream(OutputStream outputStream, int i2, long j2, boolean z2) throws IOException {
        this.out = outputStream;
        if (j2 <= 4294967295L) {
            writeHeader(i2, z2, false, j2);
            return;
        }
        writeHeader(i2, false, true, 0L);
        this.partialBufferLength = 65536;
        this.partialBuffer = new byte[65536];
        this.partialPower = 16;
        this.partialOffset = 0;
    }

    public BCPGOutputStream(OutputStream outputStream, int i2, byte[] bArr) throws IOException {
        this.out = outputStream;
        writeHeader(i2, false, true, 0L);
        this.partialBuffer = bArr;
        int length = bArr.length;
        this.partialPower = 0;
        while (length != 1) {
            length >>>= 1;
            this.partialPower++;
        }
        int i3 = this.partialPower;
        if (i3 > 30) {
            throw new IOException("Buffer cannot be greater than 2^30 in length.");
        }
        this.partialBufferLength = 1 << i3;
        this.partialOffset = 0;
    }

    private void partialFlush(boolean z2) throws IOException {
        if (z2) {
            writeNewPacketLength(this.partialOffset);
            this.out.write(this.partialBuffer, 0, this.partialOffset);
        } else {
            this.out.write(this.partialPower | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
            this.out.write(this.partialBuffer, 0, this.partialBufferLength);
        }
        this.partialOffset = 0;
    }

    private void writeHeader(int i2, boolean z2, boolean z3, long j2) throws IOException {
        if (this.partialBuffer != null) {
            partialFlush(true);
            this.partialBuffer = null;
        }
        if (!z2) {
            write((-1) - (((-1) - i2) & ((-1) - 192)));
            if (z3) {
                this.partialOffset = 0;
                return;
            } else {
                writeNewPacketLength(j2);
                return;
            }
        }
        int i3 = i2 << 2;
        int i4 = (i3 + 128) - (128 & i3);
        if (z3) {
            write(i3 | 131);
            return;
        }
        if (j2 <= 255) {
            write(i4);
            write((byte) j2);
        } else if (j2 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            write((-1) - (((-1) - i3) & ((-1) - 129)));
            write((byte) (j2 >> 8));
            write((byte) j2);
        } else {
            write(i3 | 130);
            write((byte) (j2 >> 24));
            write((byte) (j2 >> 16));
            write((byte) (j2 >> 8));
            write((byte) j2);
        }
    }

    private void writeNewPacketLength(long j2) throws IOException {
        if (j2 < 192) {
            this.out.write((byte) j2);
            return;
        }
        if (j2 <= 8383) {
            this.out.write((byte) (((-1) - (((-1) - (r12 >> 8)) | ((-1) - 255))) + 192));
            this.out.write((byte) (j2 - 192));
        } else {
            this.out.write(255);
            this.out.write((byte) (j2 >> 24));
            this.out.write((byte) (j2 >> 16));
            this.out.write((byte) (j2 >> 8));
            this.out.write((byte) j2);
        }
    }

    private void writePartial(byte b2) throws IOException {
        if (this.partialOffset == this.partialBufferLength) {
            partialFlush(false);
        }
        byte[] bArr = this.partialBuffer;
        int i2 = this.partialOffset;
        this.partialOffset = i2 + 1;
        bArr[i2] = b2;
    }

    private void writePartial(byte[] bArr, int i2, int i3) throws IOException {
        if (this.partialOffset == this.partialBufferLength) {
            partialFlush(false);
        }
        int i4 = this.partialBufferLength;
        int i5 = this.partialOffset;
        if (i3 <= i4 - i5) {
            System.arraycopy(bArr, i2, this.partialBuffer, i5, i3);
            this.partialOffset += i3;
            return;
        }
        System.arraycopy(bArr, i2, this.partialBuffer, i5, i4 - i5);
        int i6 = this.partialBufferLength;
        int i7 = this.partialOffset;
        int i8 = i2 + (i6 - i7);
        int i9 = i3 - (i6 - i7);
        partialFlush(false);
        while (true) {
            int i10 = this.partialBufferLength;
            if (i9 <= i10) {
                System.arraycopy(bArr, i8, this.partialBuffer, 0, i9);
                this.partialOffset += i9;
                return;
            } else {
                System.arraycopy(bArr, i8, this.partialBuffer, 0, i10);
                int i11 = this.partialBufferLength;
                i8 += i11;
                i9 -= i11;
                partialFlush(false);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        finish();
        this.out.flush();
        this.out.close();
    }

    public void finish() throws IOException {
        if (this.partialBuffer != null) {
            partialFlush(true);
            this.partialBuffer = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        if (this.partialBuffer != null) {
            writePartial((byte) i2);
        } else {
            this.out.write(i2);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        if (this.partialBuffer != null) {
            writePartial(bArr, i2, i3);
        } else {
            this.out.write(bArr, i2, i3);
        }
    }

    public void writeObject(BCPGObject bCPGObject) throws IOException {
        bCPGObject.encode(this);
    }

    void writePacket(int i2, byte[] bArr, boolean z2) throws IOException {
        writeHeader(i2, z2, false, bArr.length);
        write(bArr);
    }

    public void writePacket(ContainedPacket containedPacket) throws IOException {
        containedPacket.encode(this);
    }
}
