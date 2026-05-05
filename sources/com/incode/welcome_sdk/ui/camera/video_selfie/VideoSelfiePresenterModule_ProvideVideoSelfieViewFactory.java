package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory implements Factory<VideoSelfieContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12189b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12190e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoSelfiePresenterModule f12191a;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12189b + 67;
        f12190e = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory(VideoSelfiePresenterModule videoSelfiePresenterModule) {
        this.f12191a = videoSelfiePresenterModule;
    }

    @Override // javax.inject.Provider
    public final VideoSelfieContract.View get() {
        int i2 = 2 % 2;
        int i3 = f12190e + 71;
        f12189b = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieContract.View viewProvideVideoSelfieView = provideVideoSelfieView(this.f12191a);
        int i5 = f12190e + 71;
        f12189b = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideVideoSelfieView;
    }

    public static VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory create(VideoSelfiePresenterModule videoSelfiePresenterModule) {
        int i2 = 2 % 2;
        VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory videoSelfiePresenterModule_ProvideVideoSelfieViewFactory = new VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory(videoSelfiePresenterModule);
        int i3 = f12189b + 61;
        f12190e = i3 % 128;
        int i4 = i3 % 2;
        return videoSelfiePresenterModule_ProvideVideoSelfieViewFactory;
    }

    public static VideoSelfieContract.View provideVideoSelfieView(VideoSelfiePresenterModule videoSelfiePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f12189b + 111;
        f12190e = i3 % 128;
        int i4 = i3 % 2;
        VideoSelfieContract.View view = (VideoSelfieContract.View) Preconditions.checkNotNullFromProvides(videoSelfiePresenterModule.provideVideoSelfieView());
        int i5 = f12190e + 47;
        f12189b = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}
