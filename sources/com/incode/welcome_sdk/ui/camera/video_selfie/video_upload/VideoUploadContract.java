package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadContract {

    public interface Presenter extends BasePresenter {
        void publishResult(VideoSelfieResult videoSelfieResult);

        void uploadVideo();
    }

    public interface View extends BaseView {
        void showError(boolean z2);

        void showNetworkError();

        void startNextStep(boolean z2);

        public static final class DefaultImpls {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f12644a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f12645b = 0;

            public static /* synthetic */ void showError$default(View view, boolean z2, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = f12644a + 33;
                int i5 = i4 % 128;
                f12645b = i5;
                int i6 = i4 % 2;
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showError");
                }
                if ((i2 & 1) != 0) {
                    int i7 = i5 + 49;
                    f12644a = i7 % 128;
                    int i8 = i7 % 2;
                    z2 = true;
                }
                view.showError(z2);
                int i9 = f12644a + 7;
                f12645b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }
}
