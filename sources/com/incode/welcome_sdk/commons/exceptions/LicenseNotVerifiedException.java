package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class LicenseNotVerifiedException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5038b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5039e = 1;

    public LicenseNotVerifiedException() {
        super("License not verified. This can happen because there is no valid license, or the Internet connection is not working.");
    }

    static {
        int i2 = 1 + 15;
        f5038b = i2 % 128;
        int i3 = i2 % 2;
    }
}
