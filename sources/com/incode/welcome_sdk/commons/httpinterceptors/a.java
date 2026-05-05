package com.incode.welcome_sdk.commons.httpinterceptors;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Factory<e> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5167c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5168d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Application> f5169e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f5168d + 51;
        f5167c = i3 % 128;
        int i4 = i3 % 2;
        e eVarA = a();
        int i5 = f5167c + 105;
        f5168d = i5 % 128;
        if (i5 % 2 != 0) {
            return eVarA;
        }
        throw null;
    }

    private a(Provider<Application> provider) {
        this.f5169e = provider;
    }

    private e a() {
        int i2 = 2 % 2;
        int i3 = f5167c + 109;
        f5168d = i3 % 128;
        int i4 = i3 % 2;
        e eVarC = c(this.f5169e.get());
        int i5 = f5168d + 111;
        f5167c = i5 % 128;
        if (i5 % 2 == 0) {
            return eVarC;
        }
        throw null;
    }

    public static a d(Provider<Application> provider) {
        int i2 = 2 % 2;
        a aVar = new a(provider);
        int i3 = f5167c + 69;
        f5168d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 72 / 0;
        }
        return aVar;
    }

    private static e c(Application application) {
        int i2 = 2 % 2;
        e eVar = new e(application);
        int i3 = f5168d + 19;
        f5167c = i3 % 128;
        int i4 = i3 % 2;
        return eVar;
    }
}
