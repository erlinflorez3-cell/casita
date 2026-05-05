package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioNotMatchedException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5058c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5059d = 53 % 128;

    public AudioNotMatchedException() {
        super("Spoken audio doesn't match the requested statement");
    }

    static {
        if (53 % 2 == 0) {
            throw null;
        }
    }
}
