package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements Factory<IdCaptureKitAndroid> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4965b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4966c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f4967a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<SharedPreferences> f4968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<Application> f4969e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4965b + 115;
        f4966c = i3 % 128;
        if (i3 % 2 != 0) {
            return c();
        }
        c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r(p pVar, Provider<Application> provider, Provider<SharedPreferences> provider2) {
        this.f4967a = pVar;
        this.f4969e = provider;
        this.f4968d = provider2;
    }

    private IdCaptureKitAndroid c() {
        int i2 = 2 % 2;
        int i3 = f4966c + 105;
        f4965b = i3 % 128;
        int i4 = i3 % 2;
        IdCaptureKitAndroid idCaptureKitAndroidE = e(this.f4967a, this.f4969e.get(), this.f4968d.get());
        int i5 = f4966c + 83;
        f4965b = i5 % 128;
        int i6 = i5 % 2;
        return idCaptureKitAndroidE;
    }

    public static r d(p pVar, Provider<Application> provider, Provider<SharedPreferences> provider2) {
        int i2 = 2 % 2;
        r rVar = new r(pVar, provider, provider2);
        int i3 = f4965b + 5;
        f4966c = i3 % 128;
        int i4 = i3 % 2;
        return rVar;
    }

    private static IdCaptureKitAndroid e(p pVar, Application application, SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = f4966c + 107;
        f4965b = i3 % 128;
        int i4 = i3 % 2;
        IdCaptureKitAndroid idCaptureKitAndroid = (IdCaptureKitAndroid) Preconditions.checkNotNullFromProvides(pVar.a(application, sharedPreferences));
        if (i4 != 0) {
            int i5 = 64 / 0;
        }
        return idCaptureKitAndroid;
    }
}
