package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferredToExecutiveContract {

    public interface Presenter extends BasePresenter {
        int getBackIdResult();

        int getFrontIdResult();

        File getImageFile(IdScan.IdType idType, IdScan.ScanStep scanStep);

        void init();
    }

    public interface View extends BaseView {
        void showResults(IdScan.IdType idType);
    }
}
