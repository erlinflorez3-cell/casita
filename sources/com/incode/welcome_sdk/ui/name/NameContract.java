package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.results.NameResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class NameContract {

    public interface Presenter extends BasePresenter {
        void publishResult(NameResult nameResult);

        void submitName(String str);
    }

    public interface View extends BaseView {
        void enableContinueButton(boolean z2);
    }
}
