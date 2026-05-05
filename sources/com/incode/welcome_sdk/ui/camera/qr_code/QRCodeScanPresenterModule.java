package com.incode.welcome_sdk.ui.camera.qr_code;

import com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class QRCodeScanPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11902b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11903e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QRCodeScanContract.View f11904c;

    public QRCodeScanPresenterModule(QRCodeScanContract.View view) {
        this.f11904c = view;
    }

    @Provides
    QRCodeScanContract.View a() {
        int i2 = 2 % 2;
        int i3 = f11903e;
        int i4 = i3 + 105;
        f11902b = i4 % 128;
        int i5 = i4 % 2;
        QRCodeScanContract.View view = this.f11904c;
        int i6 = i3 + 79;
        f11902b = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }
}
