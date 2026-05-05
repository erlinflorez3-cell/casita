package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class KeyFlags extends SignatureSubpacket {
    public static final int AUTHENTICATION = 32;
    public static final int CERTIFY_OTHER = 1;
    public static final int ENCRYPT_COMMS = 4;
    public static final int ENCRYPT_STORAGE = 8;
    public static final int SHARED = 128;
    public static final int SIGN_DATA = 2;
    public static final int SPLIT = 16;

    public KeyFlags(boolean z2, int i2) {
        super(27, z2, false, intToByteArray(i2));
    }

    public KeyFlags(boolean z2, boolean z3, byte[] bArr) {
        super(27, z2, z3, bArr);
    }

    private static byte[] intToByteArray(int i2) {
        byte[] bArr = new byte[4];
        int i3 = 0;
        for (int i4 = 0; i4 != 4; i4++) {
            byte b2 = (byte) (i2 >> (i4 * 8));
            bArr[i4] = b2;
            if (b2 != 0) {
                i3 = i4;
            }
        }
        int i5 = i3 + 1;
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return bArr2;
    }

    public int getFlags() {
        int i2 = 0;
        for (int i3 = 0; i3 != this.data.length; i3++) {
            byte b2 = this.data[i3];
            int i4 = ((b2 + 255) - (b2 | 255)) << (i3 * 8);
            i2 = (i2 + i4) - (i2 & i4);
        }
        return i2;
    }
}
