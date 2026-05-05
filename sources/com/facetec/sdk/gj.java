package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class gj extends RuntimeException {
    private IOException Code;
    private IOException Z;

    public gj(IOException iOException) {
        super(iOException);
        this.Z = iOException;
        this.Code = iOException;
    }

    public final IOException V() {
        return this.Z;
    }

    public final void V(IOException iOException) {
        gg.V((Throwable) this.Z, (Throwable) iOException);
        this.Code = iOException;
    }

    public final IOException Z() {
        return this.Code;
    }
}
