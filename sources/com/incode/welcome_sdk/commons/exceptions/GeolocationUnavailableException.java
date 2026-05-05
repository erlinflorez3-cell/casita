package com.incode.welcome_sdk.commons.exceptions;

/* JADX INFO: loaded from: classes5.dex */
public final class GeolocationUnavailableException extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5026a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5027e = 1;

    public GeolocationUnavailableException() {
        super("Unable to determine the user's geolocation");
    }

    static {
        int i2 = 1 + 27;
        f5026a = i2 % 128;
        int i3 = i2 % 2;
    }
}
