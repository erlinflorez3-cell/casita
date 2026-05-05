package com.incode.welcome_sdk.ui.camera.qr_code;

import android.content.Intent;
import com.incode.welcome_sdk.results.QRScanResult;
import com.incode.welcome_sdk.ui.camera.CameraContract;

/* JADX INFO: loaded from: classes5.dex */
public class QRCodeScanContract {

    public interface Presenter extends CameraContract.Presenter {
        QRScanState getQRScanState();

        void init(Intent intent);

        void onBtnHelpContinue();

        void onBtnNeedHelp();

        @Override // com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
        void onDestroy();

        void publishResult(QRScanResult qRScanResult);

        void restartQRScan();
    }

    public interface View extends CameraContract.View {
        @Override // com.incode.welcome_sdk.ui.BaseView
        void closeScreen();

        void initializeUiBasedOnScreenDimensions();

        void onQRScanStateChanged(QRScanState qRScanState);

        void setHelpScreenVisible(boolean z2);

        void setNeedHelpButtonVisible(boolean z2);
    }
}
