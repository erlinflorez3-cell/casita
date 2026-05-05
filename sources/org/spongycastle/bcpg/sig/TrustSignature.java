package org.spongycastle.bcpg.sig;

import org.spongycastle.bcpg.SignatureSubpacket;

/* JADX INFO: loaded from: classes2.dex */
public class TrustSignature extends SignatureSubpacket {
    public TrustSignature(boolean z2, int i2, int i3) {
        super(5, z2, false, intToByteArray(i2, i3));
    }

    public TrustSignature(boolean z2, boolean z3, byte[] bArr) {
        super(5, z2, z3, bArr);
    }

    private static byte[] intToByteArray(int i2, int i3) {
        return new byte[]{(byte) i2, (byte) i3};
    }

    public int getDepth() {
        byte b2 = this.data[0];
        return (b2 + 255) - (b2 | 255);
    }

    public int getTrustAmount() {
        byte b2 = this.data[1];
        return (b2 + 255) - (b2 | 255);
    }
}
