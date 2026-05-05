package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class VideoSelfiePresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12186a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12187e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoSelfieContract.View f12188c;

    public VideoSelfiePresenterModule(VideoSelfieContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f12188c = view;
    }

    public final VideoSelfieContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f12187e;
        int i4 = i3 + 105;
        f12186a = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieContract.View view = this.f12188c;
        int i6 = i3 + 49;
        f12186a = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    @Provides
    public final VideoSelfieContract.View provideVideoSelfieView() {
        int i2 = 2 % 2;
        int i3 = f12187e;
        int i4 = i3 + 91;
        f12186a = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieContract.View view = this.f12188c;
        int i6 = i3 + 63;
        f12186a = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
