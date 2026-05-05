package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessIdContract {

    public interface Presenter extends BasePresenter {
        void processId(boolean z2);

        void publishResult();

        void setEnableIdSummaryScreen(boolean z2);
    }

    public interface View extends BaseView {
    }
}
