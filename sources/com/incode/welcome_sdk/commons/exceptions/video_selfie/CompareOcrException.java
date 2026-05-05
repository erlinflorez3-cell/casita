package com.incode.welcome_sdk.commons.exceptions.video_selfie;

import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Video Selfie flow continues if ID OCR match isn't successful.")
public final class CompareOcrException extends VideoSelfieException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5064b = 115 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f5065c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5066d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f5067e = 0;

    public CompareOcrException() {
        super("The OCR from Video Selfie does not match the OCR from ID Scan");
    }

    public static int e() {
        int i2 = f5067e;
        int i3 = i2 % 7591979;
        f5067e = i2 + 1;
        if (i3 != 0) {
            return f5065c;
        }
        int i4 = (int) Runtime.getRuntime().totalMemory();
        f5065c = i4;
        return i4;
    }

    static {
        if (115 % 2 == 0) {
            throw null;
        }
    }
}
