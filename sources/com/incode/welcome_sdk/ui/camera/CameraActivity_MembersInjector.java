package com.incode.welcome_sdk.ui.camera;

import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraActivity_MembersInjector implements MembersInjector<CameraActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11209b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11210c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<VideoStreamingManager> f11211e;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(CameraActivity cameraActivity) {
        int i2 = 2 % 2;
        int i3 = f11209b + 93;
        f11210c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(cameraActivity);
        int i5 = f11209b + 121;
        f11210c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
    }

    public CameraActivity_MembersInjector(Provider<VideoStreamingManager> provider) {
        this.f11211e = provider;
    }

    public static MembersInjector<CameraActivity> create(Provider<VideoStreamingManager> provider) {
        int i2 = 2 % 2;
        CameraActivity_MembersInjector cameraActivity_MembersInjector = new CameraActivity_MembersInjector(provider);
        int i3 = f11210c + 117;
        f11209b = i3 % 128;
        int i4 = i3 % 2;
        return cameraActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(CameraActivity cameraActivity) {
        int i2 = 2 % 2;
        int i3 = f11210c + 9;
        f11209b = i3 % 128;
        if (i3 % 2 != 0) {
            injectVideoStreamingManager(cameraActivity, this.f11211e.get());
            int i4 = f11209b + 73;
            f11210c = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        injectVideoStreamingManager(cameraActivity, this.f11211e.get());
        throw null;
    }

    public static void injectVideoStreamingManager(CameraActivity cameraActivity, VideoStreamingManager videoStreamingManager) {
        int i2 = 2 % 2;
        int i3 = f11209b + 23;
        f11210c = i3 % 128;
        int i4 = i3 % 2;
        cameraActivity.f11180f = videoStreamingManager;
        int i5 = f11209b + 77;
        f11210c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }
}
