package com.incode.welcome_sdk.ui.id_info;

import com.incode.welcome_sdk.results.IdInfoResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfoContract {

    public interface Presenter extends BasePresenter {
        void addOcrData(IdInfoModel idInfoModel, boolean z2);

        void publishResult(IdInfoResult idInfoResult);
    }

    public interface View extends BaseView {
        void showError();
    }
}
