package com.incode.welcome_sdk.ui.camera.qr_code;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory implements Factory<QRCodeScanContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11905a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11906e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QRCodeScanPresenterModule f11907d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11905a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11906e = i3 % 128;
        if (i3 % 2 != 0) {
            get();
            throw null;
        }
        QRCodeScanContract.View view = get();
        int i4 = f11906e + 37;
        f11905a = i4 % 128;
        int i5 = i4 % 2;
        return view;
    }

    public QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory(QRCodeScanPresenterModule qRCodeScanPresenterModule) {
        this.f11907d = qRCodeScanPresenterModule;
    }

    @Override // javax.inject.Provider
    public final QRCodeScanContract.View get() {
        QRCodeScanContract.View viewProvideQRCodeScanView;
        int i2 = 2 % 2;
        int i3 = f11906e + 43;
        f11905a = i3 % 128;
        if (i3 % 2 == 0) {
            viewProvideQRCodeScanView = provideQRCodeScanView(this.f11907d);
            int i4 = 30 / 0;
        } else {
            viewProvideQRCodeScanView = provideQRCodeScanView(this.f11907d);
        }
        int i5 = f11905a + 55;
        f11906e = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideQRCodeScanView;
    }

    public static QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory create(QRCodeScanPresenterModule qRCodeScanPresenterModule) {
        int i2 = 2 % 2;
        QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory qRCodeScanPresenterModule_ProvideQRCodeScanViewFactory = new QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory(qRCodeScanPresenterModule);
        int i3 = f11905a + 97;
        f11906e = i3 % 128;
        if (i3 % 2 == 0) {
            return qRCodeScanPresenterModule_ProvideQRCodeScanViewFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QRCodeScanContract.View provideQRCodeScanView(QRCodeScanPresenterModule qRCodeScanPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11906e + 93;
        f11905a = i3 % 128;
        int i4 = i3 % 2;
        QRCodeScanContract.View view = (QRCodeScanContract.View) Preconditions.checkNotNullFromProvides(qRCodeScanPresenterModule.a());
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return view;
    }
}
