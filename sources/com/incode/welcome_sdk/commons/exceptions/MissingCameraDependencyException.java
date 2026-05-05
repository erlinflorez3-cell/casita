package com.incode.welcome_sdk.commons.exceptions;

import kotlin.Deprecated;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Only applicable to Special Versions with the -nu suffix.")
public final class MissingCameraDependencyException extends RuntimeException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5040b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5041e = 7 % 128;

    public MissingCameraDependencyException() {
        super("Camera dependency not found. In order to use this feature, you need to add the `com.incode.sdk:camera:1.2.0-nu` dependency to your build. Check the documentation for more information.");
    }

    static {
        if (7 % 2 == 0) {
            throw null;
        }
    }
}
