package com.incode.welcome_sdk.commons.exceptions.video_selfie;

/* JADX INFO: loaded from: classes5.dex */
public final class MaxVideoLengthReachedException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f5070a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5071b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f5072c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5073e = 1;

    public MaxVideoLengthReachedException() {
        super("Video Selfie recording time exceeded the configured maximum video length.");
    }

    public static int b() {
        int i2 = f5072c;
        int i3 = i2 % 6454367;
        f5072c = i2 + 1;
        if (i3 != 0) {
            return f5070a;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        f5070a = iMaxMemory;
        return iMaxMemory;
    }

    static {
        int i2 = 1 + 23;
        f5071b = i2 % 128;
        int i3 = i2 % 2;
    }
}
