package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class ApprovalForbiddenException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5004a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5005e = 0;

    public ApprovalForbiddenException() {
        super("It is forbidden to perform automatic approval when Video Conference is enabled. Please check your onboarding config.");
    }

    static {
        int i2 = 1 + 11;
        f5005e = i2 % 128;
        int i3 = i2 % 2;
    }
}
