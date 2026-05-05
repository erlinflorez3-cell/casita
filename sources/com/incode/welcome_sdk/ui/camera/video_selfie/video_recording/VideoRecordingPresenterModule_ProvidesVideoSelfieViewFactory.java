package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory implements Factory<VideoRecordingContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12572a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12573c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoRecordingPresenterModule f12574e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12573c + 107;
        f12572a = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory(VideoRecordingPresenterModule videoRecordingPresenterModule) {
        this.f12574e = videoRecordingPresenterModule;
    }

    @Override // javax.inject.Provider
    public final VideoRecordingContract.View get() {
        int i2 = 2 % 2;
        int i3 = f12572a + 17;
        f12573c = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordingPresenterModule videoRecordingPresenterModule = this.f12574e;
        if (i4 != 0) {
            return providesVideoSelfieView(videoRecordingPresenterModule);
        }
        providesVideoSelfieView(videoRecordingPresenterModule);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory create(VideoRecordingPresenterModule videoRecordingPresenterModule) {
        int i2 = 2 % 2;
        VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory videoRecordingPresenterModule_ProvidesVideoSelfieViewFactory = new VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory(videoRecordingPresenterModule);
        int i3 = f12573c + 19;
        f12572a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 57 / 0;
        }
        return videoRecordingPresenterModule_ProvidesVideoSelfieViewFactory;
    }

    public static VideoRecordingContract.View providesVideoSelfieView(VideoRecordingPresenterModule videoRecordingPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f12573c + 43;
        f12572a = i3 % 128;
        int i4 = i3 % 2;
        VideoRecordingContract.View view = (VideoRecordingContract.View) Preconditions.checkNotNullFromProvides(videoRecordingPresenterModule.a());
        if (i4 != 0) {
            int i5 = 98 / 0;
        }
        int i6 = f12572a + 5;
        f12573c = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }
}
