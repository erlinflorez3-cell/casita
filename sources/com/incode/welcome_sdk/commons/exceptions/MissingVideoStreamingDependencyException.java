package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class MissingVideoStreamingDependencyException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5048d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5049e = 0;

    public MissingVideoStreamingDependencyException() {
        super("Video Streaming dependency not found. In order to use this feature, you need to add `com.incode.sdk:video-streaming:x.y.z` dependency to your build. Check the documentation for more information.");
    }

    static {
        int i2 = 1 + 15;
        f5049e = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
