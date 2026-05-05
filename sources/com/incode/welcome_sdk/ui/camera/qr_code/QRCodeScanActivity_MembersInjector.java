package com.incode.welcome_sdk.ui.camera.qr_code;

import com.incode.welcome_sdk.ui.camera.CameraActivity_MembersInjector;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class QRCodeScanActivity_MembersInjector implements MembersInjector<QRCodeScanActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11889b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11890e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<VideoStreamingManager> f11891a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<QRCodeScanPresenter> f11892c;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(QRCodeScanActivity qRCodeScanActivity) {
        int i2 = 2 % 2;
        int i3 = f11889b + 63;
        f11890e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(qRCodeScanActivity);
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = f11890e + 13;
        f11889b = i6 % 128;
        int i7 = i6 % 2;
    }

    public QRCodeScanActivity_MembersInjector(Provider<VideoStreamingManager> provider, Provider<QRCodeScanPresenter> provider2) {
        this.f11891a = provider;
        this.f11892c = provider2;
    }

    public static MembersInjector<QRCodeScanActivity> create(Provider<VideoStreamingManager> provider, Provider<QRCodeScanPresenter> provider2) {
        int i2 = 2 % 2;
        QRCodeScanActivity_MembersInjector qRCodeScanActivity_MembersInjector = new QRCodeScanActivity_MembersInjector(provider, provider2);
        int i3 = f11889b + 85;
        f11890e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
        return qRCodeScanActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(QRCodeScanActivity qRCodeScanActivity) {
        int i2 = 2 % 2;
        int i3 = f11890e + 75;
        f11889b = i3 % 128;
        if (i3 % 2 == 0) {
            CameraActivity_MembersInjector.injectVideoStreamingManager(qRCodeScanActivity, this.f11891a.get());
            injectQrCodeScanPresenter(qRCodeScanActivity, this.f11892c.get());
            int i4 = f11889b + 21;
            f11890e = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        CameraActivity_MembersInjector.injectVideoStreamingManager(qRCodeScanActivity, this.f11891a.get());
        injectQrCodeScanPresenter(qRCodeScanActivity, this.f11892c.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void injectQrCodeScanPresenter(QRCodeScanActivity qRCodeScanActivity, QRCodeScanPresenter qRCodeScanPresenter) {
        int i2 = 2 % 2;
        int i3 = f11890e + 91;
        f11889b = i3 % 128;
        int i4 = i3 % 2;
        qRCodeScanActivity.f11882h = qRCodeScanPresenter;
        int i5 = f11889b + 115;
        f11890e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
    }
}
