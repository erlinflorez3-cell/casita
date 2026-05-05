package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public final class LittleEndianDataOutputStream extends FilterOutputStream implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream out) {
        super(new DataOutputStream((OutputStream) Preconditions.checkNotNull(out)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.DataOutput
    public void write(byte[] b2, int off, int len) throws IOException {
        this.out.write(b2, off, len);
    }

    @Override // java.io.DataOutput
    public void writeBoolean(boolean v2) throws IOException {
        ((DataOutputStream) this.out).writeBoolean(v2);
    }

    @Override // java.io.DataOutput
    public void writeByte(int v2) throws IOException {
        ((DataOutputStream) this.out).writeByte(v2);
    }

    @Override // java.io.DataOutput
    @Deprecated
    public void writeBytes(String s2) throws IOException {
        ((DataOutputStream) this.out).writeBytes(s2);
    }

    @Override // java.io.DataOutput
    public void writeChar(int v2) throws IOException {
        writeShort(v2);
    }

    @Override // java.io.DataOutput
    public void writeChars(String s2) throws IOException {
        for (int i2 = 0; i2 < s2.length(); i2++) {
            writeChar(s2.charAt(i2));
        }
    }

    @Override // java.io.DataOutput
    public void writeDouble(double v2) throws IOException {
        writeLong(Double.doubleToLongBits(v2));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float v2) throws IOException {
        writeInt(Float.floatToIntBits(v2));
    }

    @Override // java.io.DataOutput
    public void writeInt(int v2) throws IOException {
        this.out.write((-1) - (((-1) - v2) | ((-1) - 255)));
        this.out.write((v2 >> 8) & 255);
        this.out.write((v2 >> 16) & 255);
        this.out.write((v2 >> 24) & 255);
    }

    @Override // java.io.DataOutput
    public void writeLong(long v2) throws IOException {
        byte[] byteArray = Longs.toByteArray(Long.reverseBytes(v2));
        write(byteArray, 0, byteArray.length);
    }

    @Override // java.io.DataOutput
    public void writeShort(int v2) throws IOException {
        this.out.write((v2 + 255) - (255 | v2));
        this.out.write((-1) - (((-1) - (v2 >> 8)) | ((-1) - 255)));
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ((DataOutputStream) this.out).writeUTF(str);
    }
}
