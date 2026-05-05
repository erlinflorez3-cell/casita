package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Factory<com.incode.welcome_sdk.data.local.a.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4902a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4903e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Application> f4905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<DelayedOnboardingDatabase> f4906d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4902a + 99;
        f4903e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.e eVarC = c();
        int i5 = f4902a + 43;
        f4903e = i5 % 128;
        int i6 = i5 % 2;
        return eVarC;
    }

    private c(a aVar, Provider<DelayedOnboardingDatabase> provider, Provider<Application> provider2) {
        this.f4904b = aVar;
        this.f4906d = provider;
        this.f4905c = provider2;
    }

    private com.incode.welcome_sdk.data.local.a.e c() {
        int i2 = 2 % 2;
        int i3 = f4902a + 77;
        f4903e = i3 % 128;
        int i4 = i3 % 2;
        a aVar = this.f4904b;
        if (i4 != 0) {
            return b(aVar, this.f4906d.get(), this.f4905c.get());
        }
        b(aVar, this.f4906d.get(), this.f4905c.get());
        throw null;
    }

    public static c c(a aVar, Provider<DelayedOnboardingDatabase> provider, Provider<Application> provider2) {
        int i2 = 2 % 2;
        c cVar = new c(aVar, provider, provider2);
        int i3 = f4903e + 27;
        f4902a = i3 % 128;
        if (i3 % 2 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static com.incode.welcome_sdk.data.local.a.e b(a aVar, DelayedOnboardingDatabase delayedOnboardingDatabase, Application application) {
        int i2 = 2 % 2;
        int i3 = f4902a + 3;
        f4903e = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.local.a.e eVar = (com.incode.welcome_sdk.data.local.a.e) Preconditions.checkNotNullFromProvides(aVar.c(delayedOnboardingDatabase, application));
        if (i4 == 0) {
            throw null;
        }
        int i5 = f4902a + 47;
        f4903e = i5 % 128;
        if (i5 % 2 != 0) {
            return eVar;
        }
        throw null;
    }
}
