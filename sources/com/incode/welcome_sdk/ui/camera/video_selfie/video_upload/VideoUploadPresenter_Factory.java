package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadPresenter_Factory implements Factory<VideoUploadPresenter> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12708b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12709c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f12710a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<VideoUploadContract.View> f12711d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12708b + 79;
        f12709c = i3 % 128;
        if (i3 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public VideoUploadPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<VideoUploadContract.View> provider2) {
        this.f12710a = provider;
        this.f12711d = provider2;
    }

    @Override // javax.inject.Provider
    public final VideoUploadPresenter get() {
        int i2 = 2 % 2;
        int i3 = f12709c + 85;
        f12708b = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadPresenter videoUploadPresenterNewInstance = newInstance(this.f12710a.get(), this.f12711d.get());
        int i5 = f12709c + 19;
        f12708b = i5 % 128;
        if (i5 % 2 == 0) {
            return videoUploadPresenterNewInstance;
        }
        throw null;
    }

    public static VideoUploadPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<VideoUploadContract.View> provider2) {
        int i2 = 2 % 2;
        VideoUploadPresenter_Factory videoUploadPresenter_Factory = new VideoUploadPresenter_Factory(provider, provider2);
        int i3 = f12708b + 103;
        f12709c = i3 % 128;
        int i4 = i3 % 2;
        return videoUploadPresenter_Factory;
    }

    public static VideoUploadPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, VideoUploadContract.View view) {
        int i2 = 2 % 2;
        VideoUploadPresenter videoUploadPresenter = new VideoUploadPresenter(incodeWelcomeRepository, view);
        int i3 = f12709c + 81;
        f12708b = i3 % 128;
        int i4 = i3 % 2;
        return videoUploadPresenter;
    }
}
