package com.incode.welcome_sdk.data;

import com.incode.welcome_sdk.data.local.l;
import com.incode.welcome_sdk.data.remote.h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Factory<IncodeWelcomeRepository> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7587b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7588d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<l> f7589a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<h> f7590e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f7587b + 43;
        f7588d = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepositoryB = b();
        int i5 = f7588d + 105;
        f7587b = i5 % 128;
        int i6 = i5 % 2;
        return incodeWelcomeRepositoryB;
    }

    private a(Provider<l> provider, Provider<h> provider2) {
        this.f7589a = provider;
        this.f7590e = provider2;
    }

    private IncodeWelcomeRepository b() {
        int i2 = 2 % 2;
        int i3 = f7588d + 19;
        f7587b = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepositoryC = c(this.f7589a.get(), this.f7590e.get());
        int i5 = f7587b + 3;
        f7588d = i5 % 128;
        int i6 = i5 % 2;
        return incodeWelcomeRepositoryC;
    }

    public static a d(Provider<l> provider, Provider<h> provider2) {
        int i2 = 2 % 2;
        a aVar = new a(provider, provider2);
        int i3 = f7587b + 23;
        f7588d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 74 / 0;
        }
        return aVar;
    }

    private static IncodeWelcomeRepository c(l lVar, h hVar) {
        int i2 = 2 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = new IncodeWelcomeRepository(lVar, hVar);
        int i3 = f7588d + 11;
        f7587b = i3 % 128;
        int i4 = i3 % 2;
        return incodeWelcomeRepository;
    }
}
