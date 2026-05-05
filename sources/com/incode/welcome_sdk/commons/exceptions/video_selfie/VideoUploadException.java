package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5088a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5089e = 1;

    public VideoUploadException() {
        super("Video recording of the Video Selfie step couldn't be uploaded");
    }

    static {
        int i2 = 1 + 43;
        f5088a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
