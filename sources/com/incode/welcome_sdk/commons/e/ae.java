package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class ae implements Factory<Retrofit> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4846c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4847e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<OkHttpClient> f4848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad f4849b;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4847e + 111;
        f4846c = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofitD = d();
        int i5 = f4847e + 41;
        f4846c = i5 % 128;
        int i6 = i5 % 2;
        return retrofitD;
    }

    private ae(ad adVar, Provider<OkHttpClient> provider) {
        this.f4849b = adVar;
        this.f4848a = provider;
    }

    private Retrofit d() {
        int i2 = 2 % 2;
        int i3 = f4846c + 79;
        f4847e = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofitE = e(this.f4849b, this.f4848a.get());
        int i5 = f4846c + 35;
        f4847e = i5 % 128;
        int i6 = i5 % 2;
        return retrofitE;
    }

    public static ae d(ad adVar, Provider<OkHttpClient> provider) {
        int i2 = 2 % 2;
        ae aeVar = new ae(adVar, provider);
        int i3 = f4847e + 77;
        f4846c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return aeVar;
    }

    private static Retrofit e(ad adVar, OkHttpClient okHttpClient) {
        int i2 = 2 % 2;
        int i3 = f4847e + 47;
        f4846c = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromProvides(adVar.e(okHttpClient));
        int i5 = f4847e + 71;
        f4846c = i5 % 128;
        int i6 = i5 % 2;
        return retrofit;
    }
}
