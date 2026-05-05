package com.incode.welcome_sdk.commons.components;

import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.e.al;
import com.incode.welcome_sdk.commons.e.l;
import com.incode.welcome_sdk.commons.e.p;
import com.incode.welcome_sdk.commons.e.v;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.e.f;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import com.incode.welcome_sdk.ui.geolocation.GeolocationManager;
import com.incode.welcome_sdk.ui.geolocation.LocationFetcher;
import dagger.Component;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Named;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {e.class}, modules = {v.class, al.class, p.class, l.class, com.incode.welcome_sdk.data.e.e.class})
public interface IncodeWelcomeRepositoryComponent {
    BarcodeDetector getBarcodeDetector();

    PublishSubject<com.incode.welcome_sdk.data.remote.d> getDownloadProgressBus();

    com.incode.welcome_sdk.commons.c.c.b getFaceDetector();

    f getFieldEncryptor();

    GeolocationManager getGeolocationManager();

    LocationFetcher getILocationFetcher();

    IdCaptureKitAndroid getIdCaptureKitAndroid();

    Observable<IdCaptureKitAndroid> getIdCaptureKitAndroidObservable();

    IncodeWelcomeRepository getIncodeRepository();

    RecogManager getRecogManager();

    @Named("securedRetrofit")
    Retrofit getRetrofitApi();

    @Named("unsecuredRetrofit")
    Retrofit getRetrofitApiUnsecure();

    VideoStreamingManager videoStreamingManager();
}
