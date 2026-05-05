package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class NoApiKeyException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5050d = 115 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5051e = 0;

    public NoApiKeyException() {
        super("No API Key provided");
    }

    static {
        int i2 = 115 % 2;
    }
}
