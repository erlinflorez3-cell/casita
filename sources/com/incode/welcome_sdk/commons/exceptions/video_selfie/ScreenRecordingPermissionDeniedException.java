package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class ScreenRecordingPermissionDeniedException extends PermissionsDeniedException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5078a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5079b = 0;

    public ScreenRecordingPermissionDeniedException() {
        super("User denied mandatory Screen Recording permission");
    }

    static {
        int i2 = 1 + 29;
        f5079b = i2 % 128;
        int i3 = i2 % 2;
    }
}
