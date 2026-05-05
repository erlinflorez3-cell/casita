package com.incode.welcome_sdk.commons.components;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.e.ad;
import com.incode.welcome_sdk.commons.e.g;
import com.incode.welcome_sdk.commons.e.n;
import com.incode.welcome_sdk.data.local.db.DelayedOnboardingDatabase;
import com.incode.welcome_sdk.data.local.db.WelcomeDatabase;
import dagger.Component;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Named;
import javax.inject.Singleton;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
@Component(modules = {com.incode.welcome_sdk.commons.e.e.class, ad.class, g.class, n.class})
@Singleton
public interface e {
    com.incode.welcome_sdk.commons.c.c.b a();

    WelcomeDatabase b();

    DelayedOnboardingDatabase c();

    SharedPreferences d();

    Application e();

    @Named("unsecuredRetrofit")
    Retrofit f();

    @Named("securedRetrofit")
    Retrofit g();

    RecogManager h();

    BarcodeDetector i();

    PublishSubject<com.incode.welcome_sdk.data.remote.d> j();
}
