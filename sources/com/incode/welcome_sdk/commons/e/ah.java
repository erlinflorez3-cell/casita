package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.IncodeWelcome;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class ah implements Factory<OkHttpClient> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f4857g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f4858h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<HttpLoggingInterceptor> f4859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> f4860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> f4861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> f4862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ad f4863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> f4864f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<IncodeWelcome.SSLConfig> f4865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> f4866j;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4857g + 115;
        f4858h = i3 % 128;
        if (i3 % 2 != 0) {
            a();
            throw null;
        }
        OkHttpClient okHttpClientA = a();
        int i4 = f4857g + 57;
        f4858h = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return okHttpClientA;
    }

    private ah(ad adVar, Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> provider, Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> provider2, Provider<HttpLoggingInterceptor> provider3, Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> provider4, Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> provider5, Provider<IncodeWelcome.SSLConfig> provider6, Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> provider7) {
        this.f4863e = adVar;
        this.f4861c = provider;
        this.f4862d = provider2;
        this.f4859a = provider3;
        this.f4860b = provider4;
        this.f4864f = provider5;
        this.f4865i = provider6;
        this.f4866j = provider7;
    }

    private OkHttpClient a() {
        int i2 = 2 % 2;
        int i3 = f4858h + 83;
        f4857g = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClientE = e(this.f4863e, this.f4861c.get(), this.f4862d.get(), this.f4859a.get(), this.f4860b.get(), this.f4864f.get(), this.f4865i.get(), this.f4866j.get());
        int i5 = f4857g + 81;
        f4858h = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClientE;
    }

    public static ah e(ad adVar, Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> provider, Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> provider2, Provider<HttpLoggingInterceptor> provider3, Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> provider4, Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> provider5, Provider<IncodeWelcome.SSLConfig> provider6, Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> provider7) {
        int i2 = 2 % 2;
        ah ahVar = new ah(adVar, provider, provider2, provider3, provider4, provider5, provider6, provider7);
        int i3 = f4858h + 85;
        f4857g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return ahVar;
    }

    private static OkHttpClient e(ad adVar, com.incode.welcome_sdk.commons.httpinterceptors.h hVar, com.incode.welcome_sdk.commons.httpinterceptors.g gVar, HttpLoggingInterceptor httpLoggingInterceptor, com.incode.welcome_sdk.commons.httpinterceptors.b bVar, com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig, com.incode.welcome_sdk.commons.httpinterceptors.n nVar) {
        int i2 = 2 % 2;
        int i3 = f4857g + 83;
        f4858h = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) Preconditions.checkNotNullFromProvides(adVar.d(hVar, gVar, httpLoggingInterceptor, bVar, eVar, sSLConfig, nVar));
        int i5 = f4857g + 93;
        f4858h = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClient;
    }
}
