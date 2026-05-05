package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class UserConsentContract {

    public interface Presenter extends BasePresenter {
        void submitUserConsent(String str, String str2, boolean z2);
    }

    public interface View extends BaseView {
        void showCancelDialog();
    }
}
