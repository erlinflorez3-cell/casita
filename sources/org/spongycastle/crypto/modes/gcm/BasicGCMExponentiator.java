package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f27930x;

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j2, byte[] bArr) {
        int[] iArrOneAsInts = GCMUtil.oneAsInts();
        if (j2 > 0) {
            int[] iArrClone = Arrays.clone(this.f27930x);
            do {
                if ((-1) - (((-1) - 1) | ((-1) - j2)) != 0) {
                    GCMUtil.multiply(iArrOneAsInts, iArrClone);
                }
                GCMUtil.multiply(iArrClone, iArrClone);
                j2 >>>= 1;
            } while (j2 > 0);
        }
        GCMUtil.asBytes(iArrOneAsInts, bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f27930x = GCMUtil.asInts(bArr);
    }
}
