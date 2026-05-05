package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class MissingNfcDependencyException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5046b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5047d = 1;

    public MissingNfcDependencyException() {
        super("NFC dependency not found. In order to use this feature, you need to add `com.incode.sdk:nfc:x.y.z` dependency to your build. Check the documentation for more information.");
    }

    static {
        int i2 = 1 + 17;
        f5046b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
    }
}
