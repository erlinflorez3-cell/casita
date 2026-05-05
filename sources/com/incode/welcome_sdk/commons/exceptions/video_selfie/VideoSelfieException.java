package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public class VideoSelfieException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5086c = 103 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5087e = 0;

    public VideoSelfieException(String str) {
        super(str);
    }

    static {
        if (103 % 2 == 0) {
            throw null;
        }
    }
}
