package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Factory<com.incode.welcome_sdk.data.local.a.d.e.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4923b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4924c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f4926e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4923b + 25;
        f4924c = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.e.c cVarE = e();
        if (i4 == 0) {
            int i5 = 58 / 0;
        }
        return cVarE;
    }

    private i(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        this.f4926e = aVar;
        this.f4925d = provider;
    }

    private com.incode.welcome_sdk.data.local.a.d.e.c e() {
        int i2 = 2 % 2;
        int i3 = f4924c + 71;
        f4923b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            e(this.f4926e, this.f4925d.get());
            obj.hashCode();
            throw null;
        }
        com.incode.welcome_sdk.data.local.a.d.e.c cVarE = e(this.f4926e, this.f4925d.get());
        int i4 = f4923b + 65;
        f4924c = i4 % 128;
        if (i4 % 2 != 0) {
            return cVarE;
        }
        throw null;
    }

    public static i e(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        int i2 = 2 % 2;
        i iVar = new i(aVar, provider);
        int i3 = f4923b + 69;
        f4924c = i3 % 128;
        int i4 = i3 % 2;
        return iVar;
    }

    private static com.incode.welcome_sdk.data.local.a.d.e.c e(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        int i3 = f4924c + 13;
        f4923b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.e.c cVar = (com.incode.welcome_sdk.data.local.a.d.e.c) Preconditions.checkNotNullFromProvides(aVar.e(delayedOnboardingDatabase));
        int i5 = f4924c + 17;
        f4923b = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }
}
