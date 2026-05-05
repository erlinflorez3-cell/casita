package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class VideoRecordingPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12569b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12570e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoRecordingContract.View f12571c;

    public VideoRecordingPresenterModule(VideoRecordingContract.View view) {
        this.f12571c = view;
    }

    @Provides
    VideoRecordingContract.View a() {
        int i2 = 2 % 2;
        int i3 = f12569b;
        int i4 = i3 + 99;
        f12570e = i4 % 128;
        int i5 = i4 % 2;
        VideoRecordingContract.View view = this.f12571c;
        int i6 = i3 + 17;
        f12570e = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }
}
