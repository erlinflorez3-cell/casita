package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraPermissionDeniedException extends PermissionsDeniedException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5060c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5061d = 25 % 128;

    public CameraPermissionDeniedException() {
        super("User denied mandatory Camera permission");
    }

    static {
        int i2 = 25 % 2;
    }
}
