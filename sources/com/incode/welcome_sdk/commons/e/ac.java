package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ac implements Factory<WelcomeDatabase> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4834b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4835c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f4836a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f4837e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        WelcomeDatabase welcomeDatabaseB;
        int i2 = 2 % 2;
        int i3 = f4834b + 1;
        f4835c = i3 % 128;
        if (i3 % 2 == 0) {
            welcomeDatabaseB = b();
            int i4 = 27 / 0;
        } else {
            welcomeDatabaseB = b();
        }
        int i5 = f4835c + 19;
        f4834b = i5 % 128;
        int i6 = i5 % 2;
        return welcomeDatabaseB;
    }

    private ac(x xVar, Provider<Application> provider) {
        this.f4837e = xVar;
        this.f4836a = provider;
    }

    private WelcomeDatabase b() {
        int i2 = 2 % 2;
        int i3 = f4835c + 63;
        f4834b = i3 % 128;
        int i4 = i3 % 2;
        WelcomeDatabase welcomeDatabaseD = d(this.f4837e, this.f4836a.get());
        int i5 = f4834b + 95;
        f4835c = i5 % 128;
        if (i5 % 2 != 0) {
            return welcomeDatabaseD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ac b(x xVar, Provider<Application> provider) {
        int i2 = 2 % 2;
        ac acVar = new ac(xVar, provider);
        int i3 = f4835c + 101;
        f4834b = i3 % 128;
        int i4 = i3 % 2;
        return acVar;
    }

    private static WelcomeDatabase d(x xVar, Application application) {
        int i2 = 2 % 2;
        int i3 = f4834b + 117;
        f4835c = i3 % 128;
        int i4 = i3 % 2;
        WelcomeDatabase welcomeDatabase = (WelcomeDatabase) Preconditions.checkNotNullFromProvides(xVar.c(application));
        int i5 = f4835c + 17;
        f4834b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return welcomeDatabase;
    }
}
