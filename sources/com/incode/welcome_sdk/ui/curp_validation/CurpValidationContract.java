package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.results.CurpValidationResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface CurpValidationContract {

    public interface Presenter extends BasePresenter {
        void notifyResult(CurpValidationResult curpValidationResult);

        void publishResult(CurpValidationResult curpValidationResult);
    }

    public interface View extends BaseView {
    }
}
