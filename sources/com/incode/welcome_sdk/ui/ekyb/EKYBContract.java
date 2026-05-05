package com.incode.welcome_sdk.ui.ekyb;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public interface EKYBContract {

    public interface Presenter extends BasePresenter {
        void processFormFields(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);
    }

    public interface View extends BaseView {
        void hideForm();

        void hideProcessing();

        void hideResult();

        void showForm();

        void showProcessing();

        void showResult(boolean z2);
    }
}
