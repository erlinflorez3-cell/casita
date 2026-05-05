package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfiePresenter_Factory implements Factory<VideoSelfiePresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12192a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12193b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<VideoSelfieContract.View> f12194e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12192a + 111;
        f12193b = i3 % 128;
        if (i3 % 2 == 0) {
            get();
            throw null;
        }
        VideoSelfiePresenter videoSelfiePresenter = get();
        int i4 = f12193b + 59;
        f12192a = i4 % 128;
        int i5 = i4 % 2;
        return videoSelfiePresenter;
    }

    public VideoSelfiePresenter_Factory(Provider<VideoSelfieContract.View> provider) {
        this.f12194e = provider;
    }

    @Override // javax.inject.Provider
    public final VideoSelfiePresenter get() {
        int i2 = 2 % 2;
        int i3 = f12193b + 109;
        f12192a = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfiePresenter videoSelfiePresenterNewInstance = newInstance(this.f12194e.get());
        int i5 = f12193b + 63;
        f12192a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return videoSelfiePresenterNewInstance;
    }

    public static VideoSelfiePresenter_Factory create(Provider<VideoSelfieContract.View> provider) {
        int i2 = 2 % 2;
        VideoSelfiePresenter_Factory videoSelfiePresenter_Factory = new VideoSelfiePresenter_Factory(provider);
        int i3 = f12193b + 33;
        f12192a = i3 % 128;
        if (i3 % 2 == 0) {
            return videoSelfiePresenter_Factory;
        }
        throw null;
    }

    public static VideoSelfiePresenter newInstance(VideoSelfieContract.View view) {
        int i2 = 2 % 2;
        VideoSelfiePresenter videoSelfiePresenter = new VideoSelfiePresenter(view);
        int i3 = f12192a + 77;
        f12193b = i3 % 128;
        int i4 = i3 % 2;
        return videoSelfiePresenter;
    }
}
