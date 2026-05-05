package com.incode.welcome_sdk.commons.exceptions;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class NoConnectivityException extends IOException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5052a = 85 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5053e = 0;

    public NoConnectivityException() {
        super("An Internet connection could not be established");
    }

    static {
        int i2 = 85 % 2;
    }
}
