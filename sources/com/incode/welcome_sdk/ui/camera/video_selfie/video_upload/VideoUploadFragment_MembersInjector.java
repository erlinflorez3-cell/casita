package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadFragment_MembersInjector implements MembersInjector<VideoUploadFragment> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12661b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12662c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<VideoUploadPresenter> f12663d;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(VideoUploadFragment videoUploadFragment) {
        int i2 = 2 % 2;
        int i3 = f12661b + 53;
        f12662c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(videoUploadFragment);
        int i5 = f12661b + 21;
        f12662c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
    }

    public VideoUploadFragment_MembersInjector(Provider<VideoUploadPresenter> provider) {
        this.f12663d = provider;
    }

    public static MembersInjector<VideoUploadFragment> create(Provider<VideoUploadPresenter> provider) {
        int i2 = 2 % 2;
        VideoUploadFragment_MembersInjector videoUploadFragment_MembersInjector = new VideoUploadFragment_MembersInjector(provider);
        int i3 = f12662c + 7;
        f12661b = i3 % 128;
        int i4 = i3 % 2;
        return videoUploadFragment_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(VideoUploadFragment videoUploadFragment) {
        int i2 = 2 % 2;
        int i3 = f12661b + 121;
        f12662c = i3 % 128;
        if (i3 % 2 != 0) {
            injectMPresenter(videoUploadFragment, this.f12663d.get());
            int i4 = 60 / 0;
        } else {
            injectMPresenter(videoUploadFragment, this.f12663d.get());
        }
    }

    public static void injectMPresenter(VideoUploadFragment videoUploadFragment, VideoUploadPresenter videoUploadPresenter) {
        int i2 = 2 % 2;
        int i3 = f12661b + 47;
        f12662c = i3 % 128;
        int i4 = i3 % 2;
        videoUploadFragment.f12653c = videoUploadPresenter;
        int i5 = f12661b + 53;
        f12662c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
    }
}
