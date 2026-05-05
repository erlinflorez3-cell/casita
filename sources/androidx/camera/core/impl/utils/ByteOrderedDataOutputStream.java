package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    final OutputStream mOutputStream;

    ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.mOutputStream.write(bArr, i2, i3);
    }

    public void writeByte(int i2) throws IOException {
        this.mOutputStream.write(i2);
    }

    public void writeShort(short s2) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((s2 + 255) - (255 | s2));
            this.mOutputStream.write((-1) - (((-1) - (s2 >>> 8)) | ((-1) - 255)));
        } else if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((-1) - (((-1) - (s2 >>> 8)) | ((-1) - 255)));
            this.mOutputStream.write((-1) - (((-1) - s2) | ((-1) - 255)));
        }
    }

    public void writeInt(int i2) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((i2 + 255) - (255 | i2));
            this.mOutputStream.write((-1) - (((-1) - (i2 >>> 8)) | ((-1) - 255)));
            int i3 = i2 >>> 16;
            this.mOutputStream.write((i3 + 255) - (i3 | 255));
            this.mOutputStream.write((-1) - (((-1) - (i2 >>> 24)) | ((-1) - 255)));
            return;
        }
        if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((-1) - (((-1) - (i2 >>> 24)) | ((-1) - 255)));
            int i4 = i2 >>> 16;
            this.mOutputStream.write((i4 + 255) - (i4 | 255));
            int i5 = i2 >>> 8;
            this.mOutputStream.write((i5 + 255) - (i5 | 255));
            this.mOutputStream.write((-1) - (((-1) - i2) | ((-1) - 255)));
        }
    }

    public void writeUnsignedShort(int i2) throws IOException {
        writeShort((short) i2);
    }

    public void writeUnsignedInt(long j2) throws IOException {
        writeInt((int) j2);
    }
}
