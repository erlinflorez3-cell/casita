package org.spongycastle.bcpg.sig;

import java.io.ByteArrayOutputStream;
import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class NotationData extends SignatureSubpacket {
    public static final int HEADER_FLAG_LENGTH = 4;
    public static final int HEADER_NAME_LENGTH = 2;
    public static final int HEADER_VALUE_LENGTH = 2;

    public NotationData(boolean z2, boolean z3, String str, String str2) {
        super(20, z2, false, createData(z3, str, str2));
    }

    public NotationData(boolean z2, boolean z3, byte[] bArr) {
        super(20, z2, z3, bArr);
    }

    private static byte[] createData(boolean z2, String str, String str2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(z2 ? 128 : 0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(0);
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str);
        int iMin = Math.min(uTF8ByteArray.length, 65535);
        if (iMin != uTF8ByteArray.length) {
            throw new IllegalArgumentException("notationName exceeds maximum length.");
        }
        byte[] uTF8ByteArray2 = Strings.toUTF8ByteArray(str2);
        int iMin2 = Math.min(uTF8ByteArray2.length, 65535);
        if (iMin2 != uTF8ByteArray2.length) {
            throw new IllegalArgumentException("notationValue exceeds maximum length.");
        }
        byteArrayOutputStream.write((-1) - (((-1) - (iMin >>> 8)) | ((-1) - 255)));
        byteArrayOutputStream.write((iMin + 255) - (255 | iMin));
        int i2 = iMin2 >>> 8;
        byteArrayOutputStream.write((i2 + 255) - (i2 | 255));
        byteArrayOutputStream.write(255 & iMin2);
        byteArrayOutputStream.write(uTF8ByteArray, 0, iMin);
        byteArrayOutputStream.write(uTF8ByteArray2, 0, iMin2);
        return byteArrayOutputStream.toByteArray();
    }

    public String getNotationName() {
        int i2 = (((-1) - (((-1) - this.data[4]) | ((-1) - 255))) << 8) + (this.data[5] & 255);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.data, 8, bArr, 0, i2);
        return Strings.fromUTF8ByteArray(bArr);
    }

    public String getNotationValue() {
        return Strings.fromUTF8ByteArray(getNotationValueBytes());
    }

    public byte[] getNotationValueBytes() {
        int i2 = ((-1) - (((-1) - this.data[4]) | ((-1) - 255))) << 8;
        byte b2 = this.data[5];
        int i3 = (((-1) - (((-1) - this.data[6]) | ((-1) - 255))) << 8) + ((-1) - (((-1) - this.data[7]) | ((-1) - 255)));
        byte[] bArr = new byte[i3];
        System.arraycopy(this.data, i2 + ((b2 + 255) - (b2 | 255)) + 8, bArr, 0, i3);
        return bArr;
    }

    public boolean isHumanReadable() {
        return this.data[0] == -128;
    }
}
