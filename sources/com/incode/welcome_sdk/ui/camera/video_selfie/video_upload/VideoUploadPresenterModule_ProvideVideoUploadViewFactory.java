package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadPresenterModule_ProvideVideoUploadViewFactory implements Factory<VideoUploadContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12705b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12706e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoUploadPresenterModule f12707c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12705b + 37;
        f12706e = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadContract.View view = get();
        int i5 = f12705b + 31;
        f12706e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public VideoUploadPresenterModule_ProvideVideoUploadViewFactory(VideoUploadPresenterModule videoUploadPresenterModule) {
        this.f12707c = videoUploadPresenterModule;
    }

    @Override // javax.inject.Provider
    public final VideoUploadContract.View get() {
        int i2 = 2 % 2;
        int i3 = f12706e + 111;
        f12705b = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadContract.View viewProvideVideoUploadView = provideVideoUploadView(this.f12707c);
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
        return viewProvideVideoUploadView;
    }

    public static VideoUploadPresenterModule_ProvideVideoUploadViewFactory create(VideoUploadPresenterModule videoUploadPresenterModule) {
        int i2 = 2 % 2;
        VideoUploadPresenterModule_ProvideVideoUploadViewFactory videoUploadPresenterModule_ProvideVideoUploadViewFactory = new VideoUploadPresenterModule_ProvideVideoUploadViewFactory(videoUploadPresenterModule);
        int i3 = f12705b + 39;
        f12706e = i3 % 128;
        int i4 = i3 % 2;
        return videoUploadPresenterModule_ProvideVideoUploadViewFactory;
    }

    public static VideoUploadContract.View provideVideoUploadView(VideoUploadPresenterModule videoUploadPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f12705b + 123;
        f12706e = i3 % 128;
        int i4 = i3 % 2;
        VideoUploadContract.View view = (VideoUploadContract.View) Preconditions.checkNotNullFromProvides(videoUploadPresenterModule.provideVideoUploadView());
        int i5 = f12705b + 107;
        f12706e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return view;
    }
}
