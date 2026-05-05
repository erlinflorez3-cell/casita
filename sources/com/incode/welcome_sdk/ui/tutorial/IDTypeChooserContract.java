package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserContract {

    public interface Presenter extends BasePresenter {
        void persistIdType(IdScan.IdType idType, IdCategory idCategory);

        void persistNfcIdType(IdScan.IdType idType);

        void submitCancelledResult();
    }

    public interface View extends BaseView {
        void goBack();
    }
}
