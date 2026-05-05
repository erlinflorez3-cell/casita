package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class MicrophonePermissionDeniedException extends PermissionsDeniedException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5074a = 113 % 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5075b = 0;

    public MicrophonePermissionDeniedException() {
        super("User denied mandatory Microphone permission");
    }

    static {
        int i2 = 113 % 2;
    }
}
