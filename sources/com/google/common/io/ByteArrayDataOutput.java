package com.google.common.io;

import java.io.DataOutput;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int b2);

    @Override // java.io.DataOutput
    void write(byte[] b2);

    @Override // java.io.DataOutput
    void write(byte[] b2, int off, int len);

    @Override // java.io.DataOutput
    void writeBoolean(boolean v2);

    @Override // java.io.DataOutput
    void writeByte(int v2);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String s2);

    @Override // java.io.DataOutput
    void writeChar(int v2);

    @Override // java.io.DataOutput
    void writeChars(String s2);

    @Override // java.io.DataOutput
    void writeDouble(double v2);

    @Override // java.io.DataOutput
    void writeFloat(float v2);

    @Override // java.io.DataOutput
    void writeInt(int v2);

    @Override // java.io.DataOutput
    void writeLong(long v2);

    @Override // java.io.DataOutput
    void writeShort(int v2);

    @Override // java.io.DataOutput
    void writeUTF(String s2);
}
