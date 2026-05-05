package com.incode.welcome_sdk.ui.phone_number;

import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class OtpContract {

    public interface View extends BaseView {
        void hideProgressAndUnblockInteraction();

        void sendCorrectOtpSubmittedEvent();

        void showProgressAndBlockInteraction();

        void showTryAgainOrChangeInputMessage();

        void updateTryAgainTimer(long j2);

        void updateUiAfterWrongOtpProvided();
    }
}
