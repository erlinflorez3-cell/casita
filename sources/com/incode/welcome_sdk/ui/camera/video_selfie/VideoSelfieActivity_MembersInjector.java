package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieActivity_MembersInjector implements MembersInjector<VideoSelfieActivity> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12181c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12182e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<VideoSelfiePresenter> f12183b;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(VideoSelfieActivity videoSelfieActivity) {
        int i2 = 2 % 2;
        int i3 = f12182e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12181c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(videoSelfieActivity);
        int i5 = f12182e + 79;
        f12181c = i5 % 128;
        int i6 = i5 % 2;
    }

    public VideoSelfieActivity_MembersInjector(Provider<VideoSelfiePresenter> provider) {
        this.f12183b = provider;
    }

    public static MembersInjector<VideoSelfieActivity> create(Provider<VideoSelfiePresenter> provider) {
        int i2 = 2 % 2;
        VideoSelfieActivity_MembersInjector videoSelfieActivity_MembersInjector = new VideoSelfieActivity_MembersInjector(provider);
        int i3 = f12182e + 87;
        f12181c = i3 % 128;
        if (i3 % 2 != 0) {
            return videoSelfieActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(VideoSelfieActivity videoSelfieActivity) {
        int i2 = 2 % 2;
        int i3 = f12182e + 103;
        f12181c = i3 % 128;
        int i4 = i3 % 2;
        injectPresenter(videoSelfieActivity, this.f12183b.get());
        int i5 = f12181c + 13;
        f12182e = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectPresenter(VideoSelfieActivity videoSelfieActivity, VideoSelfiePresenter videoSelfiePresenter) {
        int i2 = 2 % 2;
        int i3 = f12181c + 71;
        f12182e = i3 % 128;
        if (i3 % 2 == 0) {
            videoSelfieActivity.f12167e = videoSelfiePresenter;
            int i4 = f12181c + 97;
            f12182e = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        videoSelfieActivity.f12167e = videoSelfiePresenter;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
