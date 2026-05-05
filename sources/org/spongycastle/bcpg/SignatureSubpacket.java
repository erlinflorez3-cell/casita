package org.spongycastle.bcpg;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureSubpacket {
    boolean critical;
    protected byte[] data;
    boolean isLongLength;
    int type;

    protected SignatureSubpacket(int i2, boolean z2, boolean z3, byte[] bArr) {
        this.type = i2;
        this.critical = z2;
        this.isLongLength = z3;
        this.data = bArr;
    }

    public void encode(OutputStream outputStream) throws IOException {
        int length = this.data.length;
        int i2 = length + 1;
        if (this.isLongLength) {
            outputStream.write(255);
            outputStream.write((byte) (i2 >> 24));
            outputStream.write((byte) (i2 >> 16));
            outputStream.write((byte) (i2 >> 8));
            outputStream.write((byte) i2);
        } else if (i2 < 192) {
            outputStream.write((byte) i2);
        } else if (i2 <= 8383) {
            int i3 = length - 191;
            outputStream.write((byte) (((i3 >> 8) & 255) + 192));
            outputStream.write((byte) i3);
        } else {
            outputStream.write(255);
            outputStream.write((byte) (i2 >> 24));
            outputStream.write((byte) (i2 >> 16));
            outputStream.write((byte) (i2 >> 8));
            outputStream.write((byte) i2);
        }
        if (this.critical) {
            int i4 = this.type;
            outputStream.write((i4 + 128) - (i4 & 128));
        } else {
            outputStream.write(this.type);
        }
        outputStream.write(this.data);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public boolean isCritical() {
        return this.critical;
    }

    public boolean isLongLength() {
        return this.isLongLength;
    }
}
