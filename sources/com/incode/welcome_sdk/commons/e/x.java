package com.incode.welcome_sdk.commons.e;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.room.Room;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4993d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4994e = 1;

    @Provides
    @Singleton
    final SharedPreferences d(Application application) {
        int i2 = 2 % 2;
        int i3 = f4993d + 109;
        f4994e = i3 % 128;
        int i4 = i3 % 2;
        return application.getSharedPreferences("com.incode.welcome_sdk.PREFERENCE_FILE", 0);
    }

    @Provides
    @Singleton
    final WelcomeDatabase c(Application application) {
        int i2 = 2 % 2;
        int i3 = f4994e + 43;
        f4993d = i3 % 128;
        int i4 = i3 % 2;
        WelcomeDatabase welcomeDatabase = (WelcomeDatabase) Room.databaseBuilder(application, WelcomeDatabase.class, "welcome-db").addMigrations(WelcomeDatabase.f7994b).addMigrations(WelcomeDatabase.f7993a).build();
        int i5 = f4993d + 7;
        f4994e = i5 % 128;
        int i6 = i5 % 2;
        return welcomeDatabase;
    }

    @Provides
    @Singleton
    final DelayedOnboardingDatabase e(Application application) {
        int i2 = 2 % 2;
        DelayedOnboardingDatabase delayedOnboardingDatabase = (DelayedOnboardingDatabase) Room.databaseBuilder(application, DelayedOnboardingDatabase.class, "delayed-onboarding-db").addCallback(new com.incode.welcome_sdk.data.local.db.e()).build();
        int i3 = f4993d + 61;
        f4994e = i3 % 128;
        if (i3 % 2 != 0) {
            return delayedOnboardingDatabase;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final BarcodeDetector a(Application application) {
        int i2 = 2 % 2;
        BarcodeDetector barcodeDetectorBuild = new BarcodeDetector.Builder(application).build();
        int i3 = f4993d + 11;
        f4994e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return barcodeDetectorBuild;
    }
}
