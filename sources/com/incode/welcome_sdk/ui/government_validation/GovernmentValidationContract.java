package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.results.GovernmentValidationResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidationContract {

    public interface Presenter extends BasePresenter {
        void publishResult(GovernmentValidationResult governmentValidationResult);

        void validate();
    }

    public interface View extends BaseView {
        void onError(Throwable th);

        void onGovernmentValidationError(int i2);

        void onIdentityNotVerified();

        void onIdentityVerified();
    }
}
