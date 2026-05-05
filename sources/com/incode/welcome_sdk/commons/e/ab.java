package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ab implements Factory<SharedPreferences> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4830b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4831d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f4832c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Application> f4833e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4830b + 117;
        f4831d = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences sharedPreferencesD = d();
        int i5 = f4831d + 81;
        f4830b = i5 % 128;
        if (i5 % 2 != 0) {
            return sharedPreferencesD;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ab(x xVar, Provider<Application> provider) {
        this.f4832c = xVar;
        this.f4833e = provider;
    }

    private SharedPreferences d() {
        int i2 = 2 % 2;
        int i3 = f4830b + 91;
        f4831d = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences sharedPreferencesD = d(this.f4832c, this.f4833e.get());
        int i5 = f4831d + 37;
        f4830b = i5 % 128;
        int i6 = i5 % 2;
        return sharedPreferencesD;
    }

    public static ab e(x xVar, Provider<Application> provider) {
        int i2 = 2 % 2;
        ab abVar = new ab(xVar, provider);
        int i3 = f4831d + 29;
        f4830b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return abVar;
    }

    private static SharedPreferences d(x xVar, Application application) {
        int i2 = 2 % 2;
        int i3 = f4830b + 115;
        f4831d = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences sharedPreferences = (SharedPreferences) Preconditions.checkNotNullFromProvides(xVar.d(application));
        int i5 = f4830b + 65;
        f4831d = i5 % 128;
        int i6 = i5 % 2;
        return sharedPreferences;
    }
}
