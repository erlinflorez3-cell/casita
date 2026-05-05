package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements Factory<DelayedOnboardingDatabase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4995a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4996e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<Application> f4997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f4998d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4996e + 23;
        f4995a = i3 % 128;
        int i4 = i3 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabaseC = c();
        int i5 = f4995a + 59;
        f4996e = i5 % 128;
        int i6 = i5 % 2;
        return delayedOnboardingDatabaseC;
    }

    private y(x xVar, Provider<Application> provider) {
        this.f4998d = xVar;
        this.f4997c = provider;
    }

    private DelayedOnboardingDatabase c() {
        int i2 = 2 % 2;
        int i3 = f4995a + 111;
        f4996e = i3 % 128;
        int i4 = i3 % 2;
        x xVar = this.f4998d;
        if (i4 == 0) {
            return b(xVar, this.f4997c.get());
        }
        int i5 = 23 / 0;
        return b(xVar, this.f4997c.get());
    }

    public static y b(x xVar, Provider<Application> provider) {
        int i2 = 2 % 2;
        y yVar = new y(xVar, provider);
        int i3 = f4995a + 39;
        f4996e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 20 / 0;
        }
        return yVar;
    }

    private static DelayedOnboardingDatabase b(x xVar, Application application) {
        int i2 = 2 % 2;
        int i3 = f4995a + 115;
        f4996e = i3 % 128;
        int i4 = i3 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = (DelayedOnboardingDatabase) Preconditions.checkNotNullFromProvides(xVar.e(application));
        if (i4 != 0) {
            throw null;
        }
        int i5 = f4995a + 121;
        f4996e = i5 % 128;
        int i6 = i5 % 2;
        return delayedOnboardingDatabase;
    }
}
