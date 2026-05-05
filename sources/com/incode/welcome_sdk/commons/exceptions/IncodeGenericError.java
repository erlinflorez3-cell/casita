package com.incode.welcome_sdk.commons.exceptions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeGenericError extends Exception {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5028b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5029e = 0;

    public /* synthetic */ IncodeGenericError(String str, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "An unknown error has occurred. Please check stack trace in log." : str, (i2 & 2) != 0 ? null : th);
    }

    public IncodeGenericError(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeGenericError(String str) {
        this(str, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    static {
        int i2 = 1 + 17;
        f5029e = i2 % 128;
        int i3 = i2 % 2;
    }

    public IncodeGenericError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
