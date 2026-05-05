package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfiePresenter extends BaseModulePresenter implements VideoSelfieContract.Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12184a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12185c = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public VideoSelfiePresenter(VideoSelfieContract.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public final void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f12185c + 51;
        f12184a = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 31 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieContract.Presenter
    public final void publishResult(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f12185c + 59;
        f12184a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieResult, "");
        publishResult(IncodeWelcome.Companion.getInstance().getVideoSelfieBus(), videoSelfieResult);
        int i5 = f12184a + 71;
        f12185c = i5 % 128;
        int i6 = i5 % 2;
    }
}
