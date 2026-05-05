package com.incode.welcome_sdk.commons.e;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements Factory<com.incode.welcome_sdk.data.remote.h> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f4979g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f4980i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.data.remote.e.c> f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f4982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.data.remote.e.a> f4983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.data.remote.e.c> f4984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<com.incode.welcome_sdk.data.remote.e.a> f4985e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4979g + 59;
        f4980i = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.h hVarB = b();
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        return hVarB;
    }

    private u(v vVar, Provider<com.incode.welcome_sdk.data.remote.e.c> provider, Provider<com.incode.welcome_sdk.data.remote.e.a> provider2, Provider<com.incode.welcome_sdk.data.remote.e.c> provider3, Provider<com.incode.welcome_sdk.data.remote.e.a> provider4) {
        this.f4982b = vVar;
        this.f4981a = provider;
        this.f4983c = provider2;
        this.f4984d = provider3;
        this.f4985e = provider4;
    }

    private com.incode.welcome_sdk.data.remote.h b() {
        int i2 = 2 % 2;
        int i3 = f4980i + 43;
        f4979g = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.h hVarB = b(this.f4982b, this.f4981a.get(), this.f4983c.get(), this.f4984d.get(), this.f4985e.get());
        int i5 = f4980i + 73;
        f4979g = i5 % 128;
        int i6 = i5 % 2;
        return hVarB;
    }

    public static u e(v vVar, Provider<com.incode.welcome_sdk.data.remote.e.c> provider, Provider<com.incode.welcome_sdk.data.remote.e.a> provider2, Provider<com.incode.welcome_sdk.data.remote.e.c> provider3, Provider<com.incode.welcome_sdk.data.remote.e.a> provider4) {
        int i2 = 2 % 2;
        u uVar = new u(vVar, provider, provider2, provider3, provider4);
        int i3 = f4980i + 1;
        f4979g = i3 % 128;
        int i4 = i3 % 2;
        return uVar;
    }

    private static com.incode.welcome_sdk.data.remote.h b(v vVar, com.incode.welcome_sdk.data.remote.e.c cVar, com.incode.welcome_sdk.data.remote.e.a aVar, com.incode.welcome_sdk.data.remote.e.c cVar2, com.incode.welcome_sdk.data.remote.e.a aVar2) {
        int i2 = 2 % 2;
        int i3 = f4980i + 23;
        f4979g = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.h hVar = (com.incode.welcome_sdk.data.remote.h) Preconditions.checkNotNullFromProvides(vVar.a(cVar, aVar, cVar2, aVar2));
        int i5 = f4980i + 21;
        f4979g = i5 % 128;
        if (i5 % 2 == 0) {
            return hVar;
        }
        throw null;
    }
}
