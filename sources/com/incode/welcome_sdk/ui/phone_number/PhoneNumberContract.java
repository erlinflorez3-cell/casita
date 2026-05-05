package com.incode.welcome_sdk.ui.phone_number;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneNumberContract {

    public interface Presenter extends BasePresenter {
        void onCreateView();
    }

    public interface View extends BaseView {
        void enableContinueButton(boolean z2);

        void prefillPhoneNumber(String str);
    }
}
