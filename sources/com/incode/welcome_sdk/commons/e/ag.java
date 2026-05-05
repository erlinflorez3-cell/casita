package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class ag implements Factory<Retrofit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4853a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4854d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad f4855b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<OkHttpClient> f4856e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4854d + 51;
        f4853a = i3 % 128;
        if (i3 % 2 != 0) {
            return b();
        }
        b();
        throw null;
    }

    private ag(ad adVar, Provider<OkHttpClient> provider) {
        this.f4855b = adVar;
        this.f4856e = provider;
    }

    private Retrofit b() {
        int i2 = 2 % 2;
        int i3 = f4854d + 65;
        f4853a = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofitD = d(this.f4855b, this.f4856e.get());
        int i5 = f4853a + 93;
        f4854d = i5 % 128;
        int i6 = i5 % 2;
        return retrofitD;
    }

    public static ag c(ad adVar, Provider<OkHttpClient> provider) {
        int i2 = 2 % 2;
        ag agVar = new ag(adVar, provider);
        int i3 = f4853a + 3;
        f4854d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return agVar;
    }

    private static Retrofit d(ad adVar, OkHttpClient okHttpClient) {
        int i2 = 2 % 2;
        int i3 = f4853a + 81;
        f4854d = i3 % 128;
        int i4 = i3 % 2;
        Retrofit retrofit = (Retrofit) Preconditions.checkNotNullFromProvides(adVar.a(okHttpClient));
        int i5 = f4853a + 33;
        f4854d = i5 % 128;
        int i6 = i5 % 2;
        return retrofit;
    }
}
