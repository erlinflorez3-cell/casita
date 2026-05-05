package com.incode.welcome_sdk.data;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceLoginAttemptSyncErrorWrapper extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7464c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7465e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7466a;

    public final int e() {
        int i2 = 2 % 2;
        int i3 = f7465e + 125;
        int i4 = i3 % 128;
        f7464c = i4;
        int i5 = i3 % 2;
        int i6 = this.f7466a;
        int i7 = i4 + 103;
        f7465e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 57 / 0;
        }
        return i6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceLoginAttemptSyncErrorWrapper(Throwable th, int i2) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
        this.f7466a = i2;
    }
}
