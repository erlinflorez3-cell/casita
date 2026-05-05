package com.incode.welcome_sdk.commons.e;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class ai implements Factory<OkHttpClient> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f4867h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f4868i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> f4869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<HttpLoggingInterceptor> f4870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> f4871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> f4872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ad f4873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<IncodeWelcome.SSLConfig> f4874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> f4875g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> f4876j;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4868i + 125;
        f4867h = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClientB = b();
        int i5 = f4868i + 81;
        f4867h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return okHttpClientB;
    }

    private ai(ad adVar, Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> provider, Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> provider2, Provider<HttpLoggingInterceptor> provider3, Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> provider4, Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> provider5, Provider<IncodeWelcome.SSLConfig> provider6, Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> provider7) {
        this.f4873e = adVar;
        this.f4869a = provider;
        this.f4872d = provider2;
        this.f4870b = provider3;
        this.f4871c = provider4;
        this.f4876j = provider5;
        this.f4874f = provider6;
        this.f4875g = provider7;
    }

    private OkHttpClient b() {
        int i2 = 2 % 2;
        int i3 = f4867h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4868i = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClientD = d(this.f4873e, this.f4869a.get(), this.f4872d.get(), this.f4870b.get(), this.f4871c.get(), this.f4876j.get(), this.f4874f.get(), this.f4875g.get());
        int i5 = f4868i + 39;
        f4867h = i5 % 128;
        if (i5 % 2 != 0) {
            return okHttpClientD;
        }
        throw null;
    }

    public static ai a(ad adVar, Provider<com.incode.welcome_sdk.commons.httpinterceptors.h> provider, Provider<com.incode.welcome_sdk.commons.httpinterceptors.g> provider2, Provider<HttpLoggingInterceptor> provider3, Provider<com.incode.welcome_sdk.commons.httpinterceptors.b> provider4, Provider<com.incode.welcome_sdk.commons.httpinterceptors.e> provider5, Provider<IncodeWelcome.SSLConfig> provider6, Provider<com.incode.welcome_sdk.commons.httpinterceptors.n> provider7) {
        int i2 = 2 % 2;
        ai aiVar = new ai(adVar, provider, provider2, provider3, provider4, provider5, provider6, provider7);
        int i3 = f4868i + 7;
        f4867h = i3 % 128;
        int i4 = i3 % 2;
        return aiVar;
    }

    private static OkHttpClient d(ad adVar, com.incode.welcome_sdk.commons.httpinterceptors.h hVar, com.incode.welcome_sdk.commons.httpinterceptors.g gVar, HttpLoggingInterceptor httpLoggingInterceptor, com.incode.welcome_sdk.commons.httpinterceptors.b bVar, com.incode.welcome_sdk.commons.httpinterceptors.e eVar, IncodeWelcome.SSLConfig sSLConfig, com.incode.welcome_sdk.commons.httpinterceptors.n nVar) {
        int i2 = 2 % 2;
        int i3 = f4868i + 7;
        f4867h = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) Preconditions.checkNotNullFromProvides(adVar.e(hVar, gVar, httpLoggingInterceptor, bVar, eVar, sSLConfig, nVar));
        int i5 = f4867h + 85;
        f4868i = i5 % 128;
        int i6 = i5 % 2;
        return okHttpClient;
    }
}
