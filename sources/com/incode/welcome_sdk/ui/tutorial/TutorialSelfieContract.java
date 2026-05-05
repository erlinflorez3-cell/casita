package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfieContract {

    public interface Presenter extends BasePresenter {
        void setupUI(boolean z2);
    }

    public interface View extends BaseView {
        void showAgeAssuranceUI();

        void showTutorialUI();
    }
}
