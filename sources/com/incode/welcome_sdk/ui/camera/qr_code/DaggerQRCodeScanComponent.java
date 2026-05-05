package com.incode.welcome_sdk.ui.camera.qr_code;

import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.CameraActivity_MembersInjector;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerQRCodeScanComponent {

    /* JADX INFO: renamed from: c */
    private static int f11869c = 0;

    /* JADX INFO: renamed from: e */
    private static int f11870e = 1;

    private DaggerQRCodeScanComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11869c + 5;
        f11870e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 59 / 0;
        }
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c */
        private static int f11871c = 0;

        /* JADX INFO: renamed from: e */
        private static int f11872e = 1;

        /* JADX INFO: renamed from: b */
        private QRCodeScanPresenterModule f11873b;

        /* JADX INFO: renamed from: d */
        private IncodeWelcomeRepositoryComponent f11874d;

        Builder() {
        }

        public final Builder qRCodeScanPresenterModule(QRCodeScanPresenterModule qRCodeScanPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11871c + 11;
            f11872e = i3 % 128;
            int i4 = i3 % 2;
            this.f11873b = (QRCodeScanPresenterModule) Preconditions.checkNotNull(qRCodeScanPresenterModule);
            int i5 = f11872e + 111;
            f11871c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11871c + 45;
            f11872e = i3 % 128;
            int i4 = i3 % 2;
            this.f11874d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f11872e + 25;
            f11871c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final QRCodeScanComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11873b, QRCodeScanPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f11874d, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f11873b, this.f11874d);
            int i3 = f11871c + 1;
            f11872e = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }
    }

    static final class d implements QRCodeScanComponent {

        /* JADX INFO: renamed from: a */
        private static int f11875a = 0;

        /* JADX INFO: renamed from: e */
        private static int f11876e = 1;

        /* JADX INFO: renamed from: b */
        private final d f11877b = this;

        /* JADX INFO: renamed from: c */
        private final QRCodeScanPresenterModule f11878c;

        /* JADX INFO: renamed from: d */
        private final IncodeWelcomeRepositoryComponent f11879d;

        d(QRCodeScanPresenterModule qRCodeScanPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f11879d = incodeWelcomeRepositoryComponent;
            this.f11878c = qRCodeScanPresenterModule;
        }

        private QRCodeScanPresenter a() {
            int i2 = 2 % 2;
            QRCodeScanPresenter qRCodeScanPresenter = new QRCodeScanPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f11879d.getIncodeRepository()), (BarcodeDetector) Preconditions.checkNotNullFromComponent(this.f11879d.getBarcodeDetector()), QRCodeScanPresenterModule_ProvideQRCodeScanViewFactory.provideQRCodeScanView(this.f11878c));
            int i3 = f11875a + 95;
            f11876e = i3 % 128;
            int i4 = i3 % 2;
            return qRCodeScanPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanComponent
        public final void inject(QRCodeScanActivity qRCodeScanActivity) {
            int i2 = 2 % 2;
            int i3 = f11876e + 57;
            f11875a = i3 % 128;
            int i4 = i3 % 2;
            b(qRCodeScanActivity);
            int i5 = f11875a + 47;
            f11876e = i5 % 128;
            int i6 = i5 % 2;
        }

        private QRCodeScanActivity b(QRCodeScanActivity qRCodeScanActivity) {
            int i2 = 2 % 2;
            int i3 = f11876e + 105;
            f11875a = i3 % 128;
            int i4 = i3 % 2;
            CameraActivity_MembersInjector.injectVideoStreamingManager(qRCodeScanActivity, (VideoStreamingManager) Preconditions.checkNotNullFromComponent(this.f11879d.videoStreamingManager()));
            QRCodeScanActivity_MembersInjector.injectQrCodeScanPresenter(qRCodeScanActivity, a());
            int i5 = f11876e + 17;
            f11875a = i5 % 128;
            if (i5 % 2 == 0) {
                return qRCodeScanActivity;
            }
            throw null;
        }
    }
}
