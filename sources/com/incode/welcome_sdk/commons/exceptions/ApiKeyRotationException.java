package com.incode.welcome_sdk.commons.exceptions;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class ApiKeyRotationException extends IOException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5002d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5003e = 1;

    public ApiKeyRotationException() {
        super("This API Key was revoked externally. Please check your API Key.");
    }

    static {
        int i2 = 1 + 83;
        f5002d = i2 % 128;
        int i3 = i2 % 2;
    }
}
