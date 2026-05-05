package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import com.incode.recogkitandroid.IdCaptureKitAndroid;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import dagger.internal.Factory;
import io.reactivex.Observable;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordingPresenter_Factory implements Factory<VideoRecordingPresenter> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12575f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f12576j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<Observable<IdCaptureKitAndroid>> f12577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<RecogManager> f12578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b> f12579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<VideoRecordingContract.View> f12580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f12581e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12575f + 81;
        f12576j = i3 % 128;
        if (i3 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoRecordingPresenter videoRecordingPresenter = get();
        int i4 = f12575f + 27;
        f12576j = i4 % 128;
        int i5 = i4 % 2;
        return videoRecordingPresenter;
    }

    public VideoRecordingPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<Observable<IdCaptureKitAndroid>> provider2, Provider<b> provider3, Provider<VideoRecordingContract.View> provider4, Provider<RecogManager> provider5) {
        this.f12581e = provider;
        this.f12577a = provider2;
        this.f12579c = provider3;
        this.f12580d = provider4;
        this.f12578b = provider5;
    }

    @Override // javax.inject.Provider
    public final VideoRecordingPresenter get() {
        int i2 = 2 % 2;
        int i3 = f12576j + 33;
        f12575f = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordingPresenter videoRecordingPresenterNewInstance = newInstance(this.f12581e.get(), this.f12577a.get(), this.f12579c.get(), this.f12580d.get(), this.f12578b.get());
        int i5 = f12576j + 59;
        f12575f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return videoRecordingPresenterNewInstance;
    }

    public static VideoRecordingPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<Observable<IdCaptureKitAndroid>> provider2, Provider<b> provider3, Provider<VideoRecordingContract.View> provider4, Provider<RecogManager> provider5) {
        int i2 = 2 % 2;
        VideoRecordingPresenter_Factory videoRecordingPresenter_Factory = new VideoRecordingPresenter_Factory(provider, provider2, provider3, provider4, provider5);
        int i3 = f12576j + 75;
        f12575f = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordingPresenter_Factory;
    }

    public static VideoRecordingPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, Observable<IdCaptureKitAndroid> observable, b bVar, VideoRecordingContract.View view, RecogManager recogManager) {
        int i2 = 2 % 2;
        VideoRecordingPresenter videoRecordingPresenter = new VideoRecordingPresenter(incodeWelcomeRepository, observable, bVar, view, recogManager);
        int i3 = f12575f + 93;
        f12576j = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordingPresenter;
    }
}
