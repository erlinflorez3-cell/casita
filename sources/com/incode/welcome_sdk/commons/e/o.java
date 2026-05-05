package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import com.incode.welcome_sdk.commons.RecogManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements Factory<RecogManager> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4943c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4944d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Application> f4945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<SharedPreferences> f4946b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f4947e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4943c + 73;
        f4944d = i3 % 128;
        if (i3 % 2 != 0) {
            return d();
        }
        d();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private o(n nVar, Provider<Application> provider, Provider<SharedPreferences> provider2) {
        this.f4947e = nVar;
        this.f4945a = provider;
        this.f4946b = provider2;
    }

    private RecogManager d() {
        RecogManager recogManagerB;
        int i2 = 2 % 2;
        int i3 = f4943c + 71;
        f4944d = i3 % 128;
        if (i3 % 2 == 0) {
            recogManagerB = b(this.f4947e, this.f4945a.get(), this.f4946b.get());
            int i4 = 63 / 0;
        } else {
            recogManagerB = b(this.f4947e, this.f4945a.get(), this.f4946b.get());
        }
        int i5 = f4943c + 43;
        f4944d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return recogManagerB;
    }

    public static o a(n nVar, Provider<Application> provider, Provider<SharedPreferences> provider2) {
        int i2 = 2 % 2;
        o oVar = new o(nVar, provider, provider2);
        int i3 = f4943c + 95;
        f4944d = i3 % 128;
        int i4 = i3 % 2;
        return oVar;
    }

    private static RecogManager b(n nVar, Application application, SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = f4943c + 67;
        f4944d = i3 % 128;
        int i4 = i3 % 2;
        RecogManager recogManager = (RecogManager) Preconditions.checkNotNullFromProvides(nVar.b(application, sharedPreferences));
        int i5 = f4944d + 37;
        f4943c = i5 % 128;
        int i6 = i5 % 2;
        return recogManager;
    }
}
