package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.x509.ReasonFlags;

/* JADX INFO: loaded from: classes2.dex */
class ReasonsMask {
    static final ReasonsMask allReasons = new ReasonsMask(33023);
    private int _reasons;

    ReasonsMask() {
        this(0);
    }

    private ReasonsMask(int i2) {
        this._reasons = i2;
    }

    ReasonsMask(ReasonFlags reasonFlags) {
        this._reasons = reasonFlags.intValue();
    }

    void addReasons(ReasonsMask reasonsMask) {
        int i2 = this._reasons;
        int reasons = reasonsMask.getReasons();
        this._reasons = (reasons + i2) - (reasons & i2);
    }

    int getReasons() {
        return this._reasons;
    }

    boolean hasNewReasons(ReasonsMask reasonsMask) {
        int i2 = this._reasons;
        int reasons = reasonsMask.getReasons() ^ this._reasons;
        return (reasons + i2) - (reasons & i2) != 0;
    }

    ReasonsMask intersect(ReasonsMask reasonsMask) {
        ReasonsMask reasonsMask2 = new ReasonsMask();
        int i2 = this._reasons;
        int reasons = reasonsMask.getReasons();
        reasonsMask2.addReasons(new ReasonsMask((reasons + i2) - (reasons | i2)));
        return reasonsMask2;
    }

    boolean isAllReasons() {
        return this._reasons == allReasons._reasons;
    }
}
