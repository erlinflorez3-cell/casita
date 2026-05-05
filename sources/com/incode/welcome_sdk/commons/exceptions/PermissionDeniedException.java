package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionDeniedException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5054b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5055d = 1;

    public PermissionDeniedException() {
        super("The user denied mandatory permissions for this step");
    }

    static {
        int i2 = 1 + 125;
        f5054b = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
    }
}
