package org.springframework.core;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class NestedIOException extends IOException {
    public NestedIOException(String str) {
        super(str);
    }

    public NestedIOException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return NestedExceptionUtils.buildMessage(super.getMessage(), getCause());
    }
}
