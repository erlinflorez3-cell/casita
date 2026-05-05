package com.facetec.sdk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ih extends im {
    private im B;

    public ih(im imVar) {
        if (imVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.B = imVar;
    }

    @Override // com.facetec.sdk.im
    public final im B(long j2, TimeUnit timeUnit) {
        return this.B.B(j2, timeUnit);
    }

    public final im Code() {
        return this.B;
    }

    @Override // com.facetec.sdk.im
    public final im L() {
        return this.B.L();
    }

    @Override // com.facetec.sdk.im
    public final void S() throws IOException {
        this.B.S();
    }

    public final ih Z(im imVar) {
        if (imVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.B = imVar;
        return this;
    }

    @Override // com.facetec.sdk.im
    public final im Z(long j2) {
        return this.B.Z(j2);
    }

    @Override // com.facetec.sdk.im
    public final long a_() {
        return this.B.a_();
    }

    @Override // com.facetec.sdk.im
    public final long b_() {
        return this.B.b_();
    }

    @Override // com.facetec.sdk.im
    public final im c_() {
        return this.B.c_();
    }

    @Override // com.facetec.sdk.im
    public final boolean d_() {
        return this.B.d_();
    }
}
