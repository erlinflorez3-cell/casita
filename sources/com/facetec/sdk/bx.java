package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
final class bx extends Exception {
    bx(String str) {
        super(str);
    }

    bx(String str, Throwable th) {
        super(str, th);
    }

    bx(Throwable th) {
        super(th.getMessage(), th);
    }

    final boolean Code() {
        return getCause() instanceof IllegalAccessException;
    }
}
