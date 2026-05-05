package org.spongycastle.bcpg;

import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class UserAttributeSubpacket {
    protected byte[] data;
    private boolean forceLongLength;
    int type;

    protected UserAttributeSubpacket(int i2, boolean z2, byte[] bArr) {
        this.type = i2;
        this.forceLongLength = z2;
        this.data = bArr;
    }

    protected UserAttributeSubpacket(int i2, byte[] bArr) {
        this(i2, false, bArr);
    }

    public void encode(OutputStream outputStream) throws IOException {
        int length = this.data.length;
        int i2 = length + 1;
        if (i2 < 192 && !this.forceLongLength) {
            outputStream.write((byte) i2);
        } else if (i2 > 8383 || this.forceLongLength) {
            outputStream.write(255);
            outputStream.write((byte) (i2 >> 24));
            outputStream.write((byte) (i2 >> 16));
            outputStream.write((byte) (i2 >> 8));
            outputStream.write((byte) i2);
        } else {
            int i3 = length - 191;
            int i4 = i3 >> 8;
            outputStream.write((byte) (((i4 + 255) - (i4 | 255)) + 192));
            outputStream.write((byte) i3);
        }
        outputStream.write(this.type);
        outputStream.write(this.data);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserAttributeSubpacket)) {
            return false;
        }
        UserAttributeSubpacket userAttributeSubpacket = (UserAttributeSubpacket) obj;
        return this.type == userAttributeSubpacket.type && Arrays.areEqual(this.data, userAttributeSubpacket.data);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type ^ Arrays.hashCode(this.data);
    }
}
