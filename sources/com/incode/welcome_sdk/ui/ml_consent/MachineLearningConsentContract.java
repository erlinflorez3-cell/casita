package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.results.MachineLearningConsentResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsentContract {

    public interface Presenter extends BasePresenter {
        void getConsent(String str, String str2, String str3);

        void publishResult(MachineLearningConsentResult machineLearningConsentResult);

        void submitConsent(boolean z2);
    }

    public interface View extends BaseView {
        void showConsent(String str, String str2);
    }
}
