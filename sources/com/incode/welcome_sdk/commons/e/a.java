package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4824a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4825d = 0;

    @Provides
    public final com.incode.welcome_sdk.data.local.a.e c(DelayedOnboardingDatabase delayedOnboardingDatabase, Application application) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        Intrinsics.checkNotNullParameter(application, "");
        com.incode.welcome_sdk.data.local.a.e eVar = new com.incode.welcome_sdk.data.local.a.e(delayedOnboardingDatabase, application);
        int i3 = f4824a + 95;
        f4825d = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }

    @Provides
    public final com.incode.welcome_sdk.data.local.a.d.f.c d(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        com.incode.welcome_sdk.data.local.a.d.f.c cVar = new com.incode.welcome_sdk.data.local.a.d.f.c(delayedOnboardingDatabase);
        int i3 = f4824a + 95;
        f4825d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 0;
        }
        return cVar;
    }

    @Provides
    public final com.incode.welcome_sdk.data.local.a.d.c.e c(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        com.incode.welcome_sdk.data.local.a.d.c.e eVar = new com.incode.welcome_sdk.data.local.a.d.c.e(delayedOnboardingDatabase);
        int i3 = f4825d + 43;
        f4824a = i3 % 128;
        if (i3 % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    @Provides
    public final com.incode.welcome_sdk.data.local.a.d.b.c b(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        com.incode.welcome_sdk.data.local.a.d.b.c cVar = new com.incode.welcome_sdk.data.local.a.d.b.c(delayedOnboardingDatabase);
        int i3 = f4824a + 107;
        f4825d = i3 % 128;
        int i4 = i3 % 2;
        return cVar;
    }

    @Provides
    public final com.incode.welcome_sdk.data.local.a.d.e.c e(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        com.incode.welcome_sdk.data.local.a.d.e.c cVar = new com.incode.welcome_sdk.data.local.a.d.e.c(delayedOnboardingDatabase);
        int i3 = f4824a + 33;
        f4825d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        return cVar;
    }

    @Provides
    public final com.incode.welcome_sdk.data.local.a.d.d.d a(DelayedOnboardingDatabase delayedOnboardingDatabase) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(delayedOnboardingDatabase, "");
        com.incode.welcome_sdk.data.local.a.d.d.d dVar = new com.incode.welcome_sdk.data.local.a.d.d.d(delayedOnboardingDatabase);
        int i3 = f4825d + 3;
        f4824a = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }
}
