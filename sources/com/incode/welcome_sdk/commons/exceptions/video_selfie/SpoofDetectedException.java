package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class SpoofDetectedException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5082c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5083d = 125 % 128;

    public SpoofDetectedException() {
        super("Selfie captured during Video Selfie step did not pass liveness check");
    }

    static {
        if (125 % 2 == 0) {
            throw null;
        }
    }
}
