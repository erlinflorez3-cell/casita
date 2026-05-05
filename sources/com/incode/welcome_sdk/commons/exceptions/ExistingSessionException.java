package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class ExistingSessionException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5012a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5013c = 0;

    public ExistingSessionException() {
        super("The session already exists. Resuming...");
    }

    static {
        int i2 = 1 + 77;
        f5013c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
