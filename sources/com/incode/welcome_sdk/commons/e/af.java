package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class af implements Factory<HttpLoggingInterceptor> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4850b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4851e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ad f4852c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4850b + 67;
        f4851e = i3 % 128;
        int i4 = i3 % 2;
        HttpLoggingInterceptor httpLoggingInterceptorD = d();
        if (i4 != 0) {
            int i5 = 22 / 0;
        }
        return httpLoggingInterceptorD;
    }

    private af(ad adVar) {
        this.f4852c = adVar;
    }

    private HttpLoggingInterceptor d() {
        int i2 = 2 % 2;
        int i3 = f4850b + 121;
        f4851e = i3 % 128;
        int i4 = i3 % 2;
        HttpLoggingInterceptor httpLoggingInterceptorA = a(this.f4852c);
        int i5 = f4850b + 23;
        f4851e = i5 % 128;
        int i6 = i5 % 2;
        return httpLoggingInterceptorA;
    }

    public static af b(ad adVar) {
        int i2 = 2 % 2;
        af afVar = new af(adVar);
        int i3 = f4850b + 75;
        f4851e = i3 % 128;
        int i4 = i3 % 2;
        return afVar;
    }

    private static HttpLoggingInterceptor a(ad adVar) {
        int i2 = 2 % 2;
        int i3 = f4851e + 15;
        f4850b = i3 % 128;
        int i4 = i3 % 2;
        HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) Preconditions.checkNotNullFromProvides(adVar.c());
        if (i4 != 0) {
            return httpLoggingInterceptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
