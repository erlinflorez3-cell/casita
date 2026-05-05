package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class PreferredAlgorithms extends SignatureSubpacket {
    public PreferredAlgorithms(int i2, boolean z2, boolean z3, byte[] bArr) {
        super(i2, z2, z3, bArr);
    }

    public PreferredAlgorithms(int i2, boolean z2, int[] iArr) {
        super(i2, z2, false, intToByteArray(iArr));
    }

    private static byte[] intToByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i2 = 0; i2 != iArr.length; i2++) {
            bArr[i2] = (byte) iArr[i2];
        }
        return bArr;
    }

    public int[] getPreferences() {
        int length = this.data.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 != length; i2++) {
            iArr[i2] = this.data[i2] & 255;
        }
        return iArr;
    }

    public int[] getPreferrences() {
        return getPreferences();
    }
}
