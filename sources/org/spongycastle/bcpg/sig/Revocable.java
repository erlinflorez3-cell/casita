package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class Revocable extends SignatureSubpacket {
    public Revocable(boolean z2, boolean z3) {
        super(7, z2, false, booleanToByteArray(z3));
    }

    public Revocable(boolean z2, boolean z3, byte[] bArr) {
        super(7, z2, z3, bArr);
    }

    private static byte[] booleanToByteArray(boolean z2) {
        byte[] bArr = new byte[1];
        if (z2) {
            bArr[0] = 1;
        }
        return bArr;
    }

    public boolean isRevocable() {
        return this.data[0] != 0;
    }
}
