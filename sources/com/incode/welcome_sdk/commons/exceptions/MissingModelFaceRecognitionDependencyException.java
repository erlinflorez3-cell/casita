package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class MissingModelFaceRecognitionDependencyException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5044b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5045c = 0;

    public MissingModelFaceRecognitionDependencyException() {
        super("Model Face Recognition dependency not found. In order to use this feature, you need to add `com.incode.sdk:model-face-recognition:x.y.z` dependency to your build. Check the documentation for more information.");
    }

    static {
        int i2 = 1 + 121;
        f5045c = i2 % 128;
        int i3 = i2 % 2;
    }
}
