package com.incode.welcome_sdk.ui.video_conference;

import com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class VideoConferencePresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18139a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18140b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final VideoConferenceContract.View f18141e;

    public VideoConferencePresenterModule(VideoConferenceContract.View view) {
        this.f18141e = view;
    }

    @Provides
    VideoConferenceContract.View e() {
        int i2 = 2 % 2;
        int i3 = f18140b + 105;
        int i4 = i3 % 128;
        f18139a = i4;
        int i5 = i3 % 2;
        VideoConferenceContract.View view = this.f18141e;
        int i6 = i4 + 9;
        f18140b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 13 / 0;
        }
        return view;
    }
}
