package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public class UncheckedTimeoutException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(@CheckForNull String message) {
        super(message);
    }

    public UncheckedTimeoutException(@CheckForNull String message, @CheckForNull Throwable cause) {
        super(message, cause);
    }

    public UncheckedTimeoutException(@CheckForNull Throwable cause) {
        super(cause);
    }
}
