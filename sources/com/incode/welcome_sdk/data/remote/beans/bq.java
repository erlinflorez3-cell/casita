package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9538c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9539e = 0;

    public static final com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c a(bn bnVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(bnVar, "");
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c cVar = new com.incode.welcome_sdk.data.local.model.delayed_onboarding.a.c(bnVar.c(), bnVar.b(), 25);
        int i3 = f9539e + 107;
        f9538c = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }
}
