package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8666b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8667e = 0;

    public static com.incode.welcome_sdk.data.remote.beans.f c(int i2) {
        int i3 = 2 % 2;
        int i4 = f8667e + 19;
        f8666b = i4 % 128;
        if (i4 % 2 != 0) {
            return com.incode.welcome_sdk.data.remote.beans.f.values()[i2];
        }
        com.incode.welcome_sdk.data.remote.beans.f fVar = com.incode.welcome_sdk.data.remote.beans.f.values()[i2];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int a(com.incode.welcome_sdk.data.remote.beans.f fVar) {
        int i2 = 2 % 2;
        int i3 = f8667e + 17;
        f8666b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(fVar, "");
        int iOrdinal = fVar.ordinal();
        int i5 = f8667e + 15;
        f8666b = i5 % 128;
        int i6 = i5 % 2;
        return iOrdinal;
    }
}
