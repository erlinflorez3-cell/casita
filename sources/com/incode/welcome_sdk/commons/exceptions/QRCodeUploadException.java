package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCodeUploadException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5056b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5057c = 0;

    public QRCodeUploadException() {
        super("QR Code could not be uploaded to server. Please try again later.");
    }

    static {
        int i2 = 1 + 23;
        f5057c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
