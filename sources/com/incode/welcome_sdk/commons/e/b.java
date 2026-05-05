package com.incode.welcome_sdk.commons.e;

import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Factory<com.incode.welcome_sdk.data.local.a.d.d.d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4898d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4899e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4900a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f4901c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4899e + 5;
        f4898d = i3 % 128;
        if (i3 % 2 == 0) {
            b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        com.incode.welcome_sdk.data.local.a.d.d.d dVarB = b();
        int i4 = f4898d + 49;
        f4899e = i4 % 128;
        int i5 = i4 % 2;
        return dVarB;
    }

    private b(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        this.f4901c = aVar;
        this.f4900a = provider;
    }

    private com.incode.welcome_sdk.data.local.a.d.d.d b() {
        int i2 = 2 % 2;
        int i3 = f4899e + 11;
        f4898d = i3 % 128;
        int i4 = i3 % 2;
        a aVar = this.f4901c;
        if (i4 != 0) {
            return c(aVar, this.f4900a.get());
        }
        c(aVar, this.f4900a.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static b c(a aVar, Provider<DelayedOnboardingDatabase> provider) {
        int i2 = 2 % 2;
        b bVar = new b(aVar, provider);
        int i3 = f4898d + 13;
        f4899e = i3 % 128;
        if (i3 % 2 == 0) {
            return bVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static com.incode.welcome_sdk.data.local.a.d.d.d c(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        int i3 = f4899e + 117;
        f4898d = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.d.d.d dVar = (com.incode.welcome_sdk.data.local.a.d.d.d) Preconditions.checkNotNullFromProvides(aVar.a(delayedOnboardingDatabase));
        int i5 = f4898d + 51;
        f4899e = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }
}
