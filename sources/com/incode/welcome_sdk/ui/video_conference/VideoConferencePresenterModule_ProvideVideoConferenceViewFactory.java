package com.incode.welcome_sdk.ui.video_conference;

import com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoConferencePresenterModule_ProvideVideoConferenceViewFactory implements Factory<VideoConferenceContract.View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18142c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18143e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoConferencePresenterModule f18144a;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f18143e + 95;
        f18142c = i3 % 128;
        if (i3 % 2 != 0) {
            get();
            throw null;
        }
        VideoConferenceContract.View view = get();
        int i4 = f18142c + 57;
        f18143e = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public VideoConferencePresenterModule_ProvideVideoConferenceViewFactory(VideoConferencePresenterModule videoConferencePresenterModule) {
        this.f18144a = videoConferencePresenterModule;
    }

    @Override // javax.inject.Provider
    public final VideoConferenceContract.View get() {
        int i2 = 2 % 2;
        int i3 = f18142c + 93;
        f18143e = i3 % 128;
        int i4 = i3 % 2;
        VideoConferenceContract.View viewProvideVideoConferenceView = provideVideoConferenceView(this.f18144a);
        int i5 = f18142c + 89;
        f18143e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return viewProvideVideoConferenceView;
    }

    public static VideoConferencePresenterModule_ProvideVideoConferenceViewFactory create(VideoConferencePresenterModule videoConferencePresenterModule) {
        int i2 = 2 % 2;
        VideoConferencePresenterModule_ProvideVideoConferenceViewFactory videoConferencePresenterModule_ProvideVideoConferenceViewFactory = new VideoConferencePresenterModule_ProvideVideoConferenceViewFactory(videoConferencePresenterModule);
        int i3 = f18142c + 63;
        f18143e = i3 % 128;
        int i4 = i3 % 2;
        return videoConferencePresenterModule_ProvideVideoConferenceViewFactory;
    }

    public static VideoConferenceContract.View provideVideoConferenceView(VideoConferencePresenterModule videoConferencePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f18143e + 53;
        f18142c = i3 % 128;
        int i4 = i3 % 2;
        VideoConferenceContract.View view = (VideoConferenceContract.View) Preconditions.checkNotNullFromProvides(videoConferencePresenterModule.e());
        if (i4 == 0) {
            return view;
        }
        throw null;
    }
}
