package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4910a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4911d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Application f4912e;

    public e(Application application) {
        this.f4912e = application;
    }

    @Provides
    @Singleton
    Application e() {
        int i2 = 2 % 2;
        int i3 = f4911d;
        int i4 = i3 + 55;
        f4910a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        Application application = this.f4912e;
        int i5 = i3 + 59;
        f4910a = i5 % 128;
        if (i5 % 2 != 0) {
            return application;
        }
        obj.hashCode();
        throw null;
    }
}
