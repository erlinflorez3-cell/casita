package org.spongycastle.crypto.ec;

import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    private final ECPoint f27891x;

    /* JADX INFO: renamed from: y */
    private final ECPoint f27892y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f27891x = eCPoint;
        this.f27892y = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f27891x;
    }

    public ECPoint getY() {
        return this.f27892y;
    }

    public int hashCode() {
        return this.f27891x.hashCode() + (this.f27892y.hashCode() * 37);
    }
}
