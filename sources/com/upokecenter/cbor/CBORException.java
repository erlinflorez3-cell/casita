package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
public final class CBORException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public CBORException() {
    }

    public CBORException(String str) {
        super(str);
    }

    public CBORException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
