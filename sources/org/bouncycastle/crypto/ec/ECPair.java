package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes7.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    private final ECPoint f27528x;

    /* JADX INFO: renamed from: y */
    private final ECPoint f27529y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f27528x = eCPoint;
        this.f27529y = eCPoint2;
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
        return this.f27528x;
    }

    public ECPoint getY() {
        return this.f27529y;
    }

    public int hashCode() {
        return this.f27528x.hashCode() + (this.f27529y.hashCode() * 37);
    }
}
