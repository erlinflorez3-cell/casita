package com.incode.welcome_sdk.ui.camera.qr_code;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.Component;

/* JADX INFO: loaded from: classes5.dex */
@Component(dependencies = {IncodeWelcomeRepositoryComponent.class}, modules = {QRCodeScanPresenterModule.class})
public interface QRCodeScanComponent {
    void inject(QRCodeScanActivity qRCodeScanActivity);
}
