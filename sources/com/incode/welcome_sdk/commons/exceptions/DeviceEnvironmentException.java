package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DeviceEnvironmentException extends IllegalAccessException {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5010a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5011d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceEnvironmentException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    static {
        int i2 = 1 + 41;
        f5011d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 4 / 0;
        }
    }
}
