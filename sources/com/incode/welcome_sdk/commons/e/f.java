package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Factory<com.incode.welcome_sdk.data.local.a.d.f.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4913a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4914e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4916c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4914e + 31;
        f4913a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.f.c cVarD = d();
        int i5 = f4914e + 9;
        f4913a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return cVarD;
    }

    private f(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        this.f4915b = aVar;
        this.f4916c = provider;
    }

    private com.incode.welcome_sdk.data.local.a.d.f.c d() {
        int i2 = 2 % 2;
        int i3 = f4914e + 115;
        f4913a = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.f.c cVarC = c(this.f4915b, this.f4916c.get());
        int i5 = f4914e + 77;
        f4913a = i5 % 128;
        int i6 = i5 % 2;
        return cVarC;
    }

    public static f c(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        int i2 = 2 % 2;
        f fVar = new f(aVar, provider);
        int i3 = f4914e + 107;
        f4913a = i3 % 128;
        if (i3 % 2 == 0) {
            return fVar;
        }
        throw null;
    }

    private static com.incode.welcome_sdk.data.local.a.d.f.c c(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        int i3 = f4913a + 79;
        f4914e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.f.c cVar = (com.incode.welcome_sdk.data.local.a.d.f.c) Preconditions.checkNotNullFromProvides(aVar.d(delayedOnboardingDatabase));
        int i5 = f4913a + 63;
        f4914e = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }
}
