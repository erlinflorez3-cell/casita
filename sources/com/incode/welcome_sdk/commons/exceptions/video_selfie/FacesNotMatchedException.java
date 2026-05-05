package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class FacesNotMatchedException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5068d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5069e = 0;

    public FacesNotMatchedException() {
        super("Faces from Selfie and Voice Consent didn't match");
    }

    static {
        int i2 = 1 + 69;
        f5069e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
        }
    }
}
