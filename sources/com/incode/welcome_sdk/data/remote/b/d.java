package com.incode.welcome_sdk.data.remote.b;

import com.incode.welcome_sdk.data.local.o;

/* JADX INFO: loaded from: classes5.dex */
public class d extends Throwable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9059b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9060e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f9061a;

    public d(o oVar) {
        this.f9061a = oVar;
    }

    public final o b() {
        int i2 = 2 % 2;
        int i3 = f9059b + 89;
        int i4 = i3 % 128;
        f9060e = i4;
        int i5 = i3 % 2;
        o oVar = this.f9061a;
        int i6 = i4 + 97;
        f9059b = i6 % 128;
        int i7 = i6 % 2;
        return oVar;
    }
}
