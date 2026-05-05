package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class hp extends IOException {
    public final gx I;

    public hp(gx gxVar) {
        super("stream was reset: ".concat(String.valueOf(gxVar)));
        this.I = gxVar;
    }
}
