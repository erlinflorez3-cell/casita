package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoRecordingFragment_MembersInjector implements MembersInjector<VideoRecordingFragment> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12544b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12545e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<VideoRecordingPresenter> f12546d;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = f12545e + 79;
        f12544b = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(videoRecordingFragment);
        int i5 = f12544b + 55;
        f12545e = i5 % 128;
        int i6 = i5 % 2;
    }

    public VideoRecordingFragment_MembersInjector(Provider<VideoRecordingPresenter> provider) {
        this.f12546d = provider;
    }

    public static MembersInjector<VideoRecordingFragment> create(Provider<VideoRecordingPresenter> provider) {
        int i2 = 2 % 2;
        VideoRecordingFragment_MembersInjector videoRecordingFragment_MembersInjector = new VideoRecordingFragment_MembersInjector(provider);
        int i3 = f12544b + 59;
        f12545e = i3 % 128;
        int i4 = i3 % 2;
        return videoRecordingFragment_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(VideoRecordingFragment videoRecordingFragment) {
        int i2 = 2 % 2;
        int i3 = f12544b + 37;
        f12545e = i3 % 128;
        int i4 = i3 % 2;
        injectPresenter(videoRecordingFragment, this.f12546d.get());
        int i5 = f12545e + 31;
        f12544b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectPresenter(VideoRecordingFragment videoRecordingFragment, VideoRecordingPresenter videoRecordingPresenter) {
        int i2 = 2 % 2;
        int i3 = f12544b + 21;
        f12545e = i3 % 128;
        if (i3 % 2 == 0) {
            videoRecordingFragment.f12456d = videoRecordingPresenter;
        } else {
            videoRecordingFragment.f12456d = videoRecordingPresenter;
            throw null;
        }
    }
}
