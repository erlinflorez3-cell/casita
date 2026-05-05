package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Factory<com.incode.welcome_sdk.data.local.a.d.c.e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4927c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4928d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f4929a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4930e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4927c + 3;
        f4928d = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.c.e eVarE = e();
        int i5 = f4927c + 115;
        f4928d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return eVarE;
    }

    private j(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        this.f4929a = aVar;
        this.f4930e = provider;
    }

    private com.incode.welcome_sdk.data.local.a.d.c.e e() {
        int i2 = 2 % 2;
        int i3 = f4928d + 63;
        f4927c = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.c.e eVarE = e(this.f4929a, this.f4930e.get());
        int i5 = f4928d + 87;
        f4927c = i5 % 128;
        int i6 = i5 % 2;
        return eVarE;
    }

    public static j d(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        int i2 = 2 % 2;
        j jVar = new j(aVar, provider);
        int i3 = f4927c + 23;
        f4928d = i3 % 128;
        int i4 = i3 % 2;
        return jVar;
    }

    private static com.incode.welcome_sdk.data.local.a.d.c.e e(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        int i3 = f4928d + 47;
        f4927c = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.c.e eVar = (com.incode.welcome_sdk.data.local.a.d.c.e) Preconditions.checkNotNullFromProvides(aVar.c(delayedOnboardingDatabase));
        int i5 = f4928d + 103;
        f4927c = i5 % 128;
        if (i5 % 2 != 0) {
            return eVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
