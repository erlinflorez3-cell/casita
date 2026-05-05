package com.incode.welcome_sdk.data.local;

import android.app.Application;
import android.content.SharedPreferences;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements Factory<l> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8625d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8626e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<SharedPreferences> f8627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Application> f8628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<WelcomeDatabase> f8629c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f8625d + 87;
        f8626e = i3 % 128;
        if (i3 % 2 == 0) {
            return c();
        }
        c();
        throw null;
    }

    private m(Provider<Application> provider, Provider<SharedPreferences> provider2, Provider<WelcomeDatabase> provider3) {
        this.f8628b = provider;
        this.f8627a = provider2;
        this.f8629c = provider3;
    }

    private l c() {
        int i2 = 2 % 2;
        int i3 = f8625d + 35;
        f8626e = i3 % 128;
        int i4 = i3 % 2;
        l lVarB = b(this.f8628b.get(), this.f8627a.get(), this.f8629c.get());
        int i5 = f8626e + 91;
        f8625d = i5 % 128;
        if (i5 % 2 != 0) {
            return lVarB;
        }
        throw null;
    }

    public static m c(Provider<Application> provider, Provider<SharedPreferences> provider2, Provider<WelcomeDatabase> provider3) {
        int i2 = 2 % 2;
        m mVar = new m(provider, provider2, provider3);
        int i3 = f8625d + 125;
        f8626e = i3 % 128;
        int i4 = i3 % 2;
        return mVar;
    }

    private static l b(Application application, SharedPreferences sharedPreferences, WelcomeDatabase welcomeDatabase) {
        int i2 = 2 % 2;
        l lVar = new l(application, sharedPreferences, welcomeDatabase);
        int i3 = f8625d + 121;
        f8626e = i3 % 128;
        if (i3 % 2 == 0) {
            return lVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
