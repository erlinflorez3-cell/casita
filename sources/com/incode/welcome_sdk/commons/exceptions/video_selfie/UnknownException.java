package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class UnknownException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5085b = 95 % 128;

    public UnknownException() {
        super("An unknown error has occurred in Video Selfie");
    }

    static {
        int i2 = 95 % 2;
    }
}
