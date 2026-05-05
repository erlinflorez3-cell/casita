package com.incode.welcome_sdk.ui.ekyc;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface EKYCContract {

    public interface Presenter extends BasePresenter {
        void processEkycForm(EKYCForm eKYCForm);
    }

    public interface View extends BaseView {
        void showLoading();

        void showResult(boolean z2);
    }
}
