package com.incode.welcome_sdk.ui.camera.qr_code;

import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCodeScanPresenter_Factory implements Factory<QRCodeScanPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11908a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11909b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<QRCodeScanContract.View> f11910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f11911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<BarcodeDetector> f11912e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11909b + 77;
        f11908a = i3 % 128;
        if (i3 % 2 == 0) {
            return get();
        }
        get();
        throw null;
    }

    public QRCodeScanPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<BarcodeDetector> provider2, Provider<QRCodeScanContract.View> provider3) {
        this.f11911d = provider;
        this.f11912e = provider2;
        this.f11910c = provider3;
    }

    @Override // javax.inject.Provider
    public final QRCodeScanPresenter get() {
        int i2 = 2 % 2;
        int i3 = f11908a + 73;
        f11909b = i3 % 128;
        int i4 = i3 % 2;
        QRCodeScanPresenter qRCodeScanPresenterNewInstance = newInstance(this.f11911d.get(), this.f11912e.get(), this.f11910c.get());
        int i5 = f11908a + 13;
        f11909b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return qRCodeScanPresenterNewInstance;
    }

    public static QRCodeScanPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<BarcodeDetector> provider2, Provider<QRCodeScanContract.View> provider3) {
        int i2 = 2 % 2;
        QRCodeScanPresenter_Factory qRCodeScanPresenter_Factory = new QRCodeScanPresenter_Factory(provider, provider2, provider3);
        int i3 = f11909b + 9;
        f11908a = i3 % 128;
        if (i3 % 2 == 0) {
            return qRCodeScanPresenter_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QRCodeScanPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, BarcodeDetector barcodeDetector, QRCodeScanContract.View view) {
        int i2 = 2 % 2;
        QRCodeScanPresenter qRCodeScanPresenter = new QRCodeScanPresenter(incodeWelcomeRepository, barcodeDetector, view);
        int i3 = f11908a + 59;
        f11909b = i3 % 128;
        int i4 = i3 % 2;
        return qRCodeScanPresenter;
    }
}
