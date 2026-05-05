package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes6.dex */
public class BasicGCMMultiplier implements GCMMultiplier {
    private int[] H;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.H = GCMUtil.asInts(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArrAsInts = GCMUtil.asInts(bArr);
        GCMUtil.multiply(iArrAsInts, this.H);
        GCMUtil.asBytes(iArrAsInts, bArr);
    }
}
