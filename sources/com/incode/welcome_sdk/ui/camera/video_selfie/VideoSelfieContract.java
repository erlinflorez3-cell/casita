package com.incode.welcome_sdk.ui.camera.video_selfie;

import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface VideoSelfieContract {

    public interface Presenter extends BasePresenter {
        void publishResult(VideoSelfieResult videoSelfieResult);
    }

    public interface View extends BaseView {
    }
}
