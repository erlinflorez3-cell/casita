package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Factory<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4907a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4908b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f4909d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f4907a + 81;
        f4908b = i3 % 128;
        int i4 = i3 % 2;
        Application applicationB = b();
        int i5 = f4908b + 23;
        f4907a = i5 % 128;
        int i6 = i5 % 2;
        return applicationB;
    }

    private d(e eVar) {
        this.f4909d = eVar;
    }

    private Application b() {
        int i2 = 2 % 2;
        int i3 = f4908b + 15;
        f4907a = i3 % 128;
        int i4 = i3 % 2;
        Application applicationE = e(this.f4909d);
        int i5 = f4908b + 125;
        f4907a = i5 % 128;
        int i6 = i5 % 2;
        return applicationE;
    }

    public static d d(e eVar) {
        int i2 = 2 % 2;
        d dVar = new d(eVar);
        int i3 = f4907a + 113;
        f4908b = i3 % 128;
        if (i3 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    private static Application e(e eVar) {
        int i2 = 2 % 2;
        int i3 = f4907a + 89;
        f4908b = i3 % 128;
        int i4 = i3 % 2;
        Application application = (Application) Preconditions.checkNotNullFromProvides(eVar.e());
        if (i4 == 0) {
            int i5 = 49 / 0;
        }
        int i6 = f4908b + 31;
        f4907a = i6 % 128;
        int i7 = i6 % 2;
        return application;
    }
}
