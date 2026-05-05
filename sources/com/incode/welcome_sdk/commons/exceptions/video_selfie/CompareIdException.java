package com.incode.welcome_sdk.commons.exceptions.video_selfie;

import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Video Selfie flow continues if ID match isn't successful.")
public final class CompareIdException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5062a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5063b = 1;

    public CompareIdException() {
        super("The ID from Video Selfie does not match the ID from ID Scan");
    }

    static {
        int i2 = 1 + 5;
        f5062a = i2 % 128;
        int i3 = i2 % 2;
    }
}
