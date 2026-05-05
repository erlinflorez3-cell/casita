package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class VideoUploadPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12702b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12703d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VideoUploadContract.View f12704a;

    public VideoUploadPresenterModule(VideoUploadContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f12704a = view;
    }

    public final VideoUploadContract.View getMView() {
        int i2 = 2 % 2;
        int i3 = f12702b;
        int i4 = i3 + 15;
        f12703d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoUploadContract.View view = this.f12704a;
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f12703d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return view;
    }

    @Provides
    public final VideoUploadContract.View provideVideoUploadView() {
        int i2 = 2 % 2;
        int i3 = f12703d;
        int i4 = i3 + 61;
        f12702b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        VideoUploadContract.View view = this.f12704a;
        int i5 = i3 + 37;
        f12702b = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}
