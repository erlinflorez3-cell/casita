package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class RevocationKey extends SignatureSubpacket {
    public RevocationKey(boolean z2, byte b2, int i2, byte[] bArr) {
        super(12, z2, false, createData(b2, (byte) (i2 & 255), bArr));
    }

    public RevocationKey(boolean z2, boolean z3, byte[] bArr) {
        super(12, z2, z3, bArr);
    }

    private static byte[] createData(byte b2, byte b3, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 2];
        bArr2[0] = b2;
        bArr2[1] = b3;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    public int getAlgorithm() {
        return getData()[1];
    }

    public byte[] getFingerprint() {
        byte[] data = getData();
        int length = data.length - 2;
        byte[] bArr = new byte[length];
        System.arraycopy(data, 2, bArr, 0, length);
        return bArr;
    }

    public byte getSignatureClass() {
        return getData()[0];
    }
}
