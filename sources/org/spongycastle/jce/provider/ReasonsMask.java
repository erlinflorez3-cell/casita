package org.spongycastle.jce.provider;

import org.spongycastle.asn1.x509.ReasonFlags;

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
        this._reasons = reasonsMask.getReasons() | this._reasons;
    }

    int getReasons() {
        return this._reasons;
    }

    boolean hasNewReasons(ReasonsMask reasonsMask) {
        return (-1) - (((-1) - (reasonsMask.getReasons() ^ this._reasons)) & ((-1) - this._reasons)) != 0;
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
