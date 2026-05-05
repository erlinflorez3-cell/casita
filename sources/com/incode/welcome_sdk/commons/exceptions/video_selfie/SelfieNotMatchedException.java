package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfieNotMatchedException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5080a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5081b = 0;

    public SelfieNotMatchedException() {
        super("Selfie captured during Video Selfie step doesn't match the one taken in the Selfie Scan step");
    }

    static {
        int i2 = 1 + 19;
        f5081b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
