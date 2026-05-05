package com.incode.welcome_sdk.ui.camera.qr_code;

import android.content.Intent;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.widget.Toast;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.NoConnectivityException;
import com.incode.welcome_sdk.commons.exceptions.QRCodeUploadException;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.QRScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.CameraPresenter;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter$$ExternalSyntheticLambda25;
import com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import javax.inject.Inject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class QRCodeScanPresenter extends CameraPresenter implements QRCodeScanContract.Presenter {

    /* JADX INFO: renamed from: r */
    private static int f11893r = 1;

    /* JADX INFO: renamed from: t */
    private static int f11894t = 0;

    /* JADX INFO: renamed from: h */
    private final IncodeWelcomeRepository f11895h;

    /* JADX INFO: renamed from: j */
    private final QRCodeScanContract.View f11896j;

    /* JADX INFO: renamed from: k */
    private final BarcodeDetector f11897k;

    /* JADX INFO: renamed from: l */
    private String f11898l;

    /* JADX INFO: renamed from: m */
    private QRScanState f11899m;

    /* JADX INFO: renamed from: n */
    private int f11900n;

    /* JADX INFO: renamed from: o */
    private CompositeDisposable f11901o;

    @Inject
    public QRCodeScanPresenter(IncodeWelcomeRepository incodeWelcomeRepository, BarcodeDetector barcodeDetector, QRCodeScanContract.View view) {
        super(view, incodeWelcomeRepository);
        this.f11899m = QRScanState.NO_QR_DETECTED;
        this.f11895h = incodeWelcomeRepository;
        this.f11896j = view;
        this.f11897k = barcodeDetector;
        this.f11901o = new CompositeDisposable();
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public void init(Intent intent) {
        int i2 = 2 % 2;
        int i3 = f11893r + 37;
        f11894t = i3 % 128;
        int i4 = i3 % 2;
        enableProcessing(true);
        this.f11896j.setNeedHelpButtonVisible(true);
        int i5 = f11893r + 67;
        f11894t = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public QRScanState getQRScanState() {
        int i2 = 2 % 2;
        int i3 = f11894t;
        int i4 = i3 + 53;
        f11893r = i4 % 128;
        int i5 = i4 % 2;
        QRScanState qRScanState = this.f11899m;
        int i6 = i3 + 63;
        f11893r = i6 % 128;
        int i7 = i6 % 2;
        return qRScanState;
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public void onBtnNeedHelp() {
        int i2 = 2 % 2;
        enableProcessing(false);
        this.f11896j.setNeedHelpButtonVisible(false);
        this.f11896j.setHelpScreenVisible(true);
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), ScreenName.QR_SCAN.name());
        EventUtils.sendEvent(getRepository(), Event.NEED_HELP_QR_SCAN, Modules.QR_SCAN, (HashMap<String, Object>) map);
        int i3 = f11894t + 109;
        f11893r = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public void onBtnHelpContinue() {
        int i2 = 2 % 2;
        enableProcessing(true);
        this.f11896j.setHelpScreenVisible(false);
        this.f11896j.setNeedHelpButtonVisible(true);
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), ScreenName.QR_SCAN.name());
        EventUtils.sendEvent(getRepository(), Event.CLOSE_NEED_HELP_QR_SCAN, Modules.QR_SCAN, (HashMap<String, Object>) map);
        int i3 = f11894t + 93;
        f11893r = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public void publishResult(QRScanResult qRScanResult) {
        int i2 = 2 % 2;
        int i3 = f11893r + 101;
        f11894t = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.getInstance().getQrScanBus().onNext(qRScanResult);
        int i5 = f11894t + 97;
        f11893r = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public Observable<Object> processPreviewFrame(Observable<Bitmap> observable, final Runnable runnable) {
        int i2 = 2 % 2;
        int i3 = f11893r + 43;
        f11894t = i3 % 128;
        int i4 = i3 % 2;
        Observable<Object> map = observable.map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((Bitmap) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.c(runnable, (QRScanState) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(runnable, (QRScanState) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return QRCodeScanPresenter.b((ResponseSuccess) obj);
            }
        });
        int i5 = f11894t + 73;
        f11893r = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public /* synthetic */ QRScanState b(Bitmap bitmap) throws Exception {
        int i2 = 2 % 2;
        Frame frameBuild = new Frame.Builder().setBitmap(bitmap).build();
        if (this.f11897k.isOperational()) {
            SparseArray<Barcode> sparseArrayDetect = this.f11897k.detect(frameBuild);
            if (sparseArrayDetect.size() == 1) {
                int i3 = f11893r + 27;
                f11894t = i3 % 128;
                int i4 = i3 % 2;
                this.f11898l = sparseArrayDetect.get(sparseArrayDetect.keyAt(0)).displayValue;
                this.f11899m = QRScanState.QR_DETECTED;
            }
            return this.f11899m;
        }
        QRScanState qRScanState = QRScanState.NOT_OPERATIONAL;
        this.f11899m = qRScanState;
        int i5 = f11893r + 25;
        f11894t = i5 % 128;
        if (i5 % 2 == 0) {
            return qRScanState;
        }
        throw null;
    }

    public /* synthetic */ boolean c(Runnable runnable, QRScanState qRScanState) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11894t + 115;
        f11893r = i3 % 128;
        int i4 = i3 % 2;
        this.f11896j.onQRScanStateChanged(this.f11899m);
        if (this.f11899m != QRScanState.QR_DETECTED) {
            runnable.run();
            return false;
        }
        int i5 = f11893r + 23;
        f11894t = i5 % 128;
        int i6 = i5 % 2;
        this.f11896j.setNeedHelpButtonVisible(false);
        this.f11896j.onQRScanStateChanged(QRScanState.QR_VALIDATION_IN_PROGRESS);
        int i7 = f11894t + 53;
        f11893r = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        return true;
    }

    public /* synthetic */ ObservableSource e(final Runnable runnable, QRScanState qRScanState) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11893r + 107;
        f11894t = i3 % 128;
        int i4 = i3 % 2;
        Observable<ResponseSuccess> observableFilter = this.f11895h.addQrCodeText(this.f11898l).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c((ResponseSuccess) obj);
            }
        }).onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanPresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.e(runnable, (Throwable) obj);
            }
        }).filter(new BaseValidationPresenter$$ExternalSyntheticLambda25());
        int i5 = f11894t + 27;
        f11893r = i5 % 128;
        int i6 = i5 % 2;
        return observableFilter;
    }

    public /* synthetic */ void c(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11894t + 107;
        f11893r = i3 % 128;
        int i4 = i3 % 2;
        if (!responseSuccess.isSuccess()) {
            throw Exceptions.propagate(new QRCodeUploadException());
        }
        this.f11896j.onQRScanStateChanged(QRScanState.QR_VALIDATION_COMPLETED);
        IncodeWelcome.getInstance().getQrScanBus().onNext(new QRScanResult(ResultCode.SUCCESS, null, this.f11898l));
        int i5 = f11893r + 107;
        f11894t = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
    }

    public /* synthetic */ ObservableSource e(Runnable runnable, Throwable th) throws Exception {
        int i2 = 2 % 2;
        if (!(th instanceof NoConnectivityException)) {
            Timber.e(th, "Couldn't upload QR Code", new Object[0]);
            this.f11900n++;
            this.f11899m = QRScanState.NO_QR_DETECTED;
            if (this.f11900n < 3) {
                this.f11896j.onQRScanStateChanged(QRScanState.QR_VALIDATION_ERROR);
            } else {
                this.f11896j.onQRScanStateChanged(QRScanState.QR_VALIDATION_TOTAL_FAILURE);
                IncodeWelcome.getInstance().getQrScanBus().onNext(new QRScanResult(ResultCode.ERROR));
            }
            runnable.run();
            enableProcessing(false);
        } else {
            int i3 = f11893r + 45;
            f11894t = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11896j.showNoNetworkMessage();
                int i4 = f11893r + 65;
                f11894t = i4 % 128;
                int i5 = i4 % 2;
            } else {
                this.f11896j.showNoNetworkMessage();
                throw null;
            }
        }
        return Observable.just(new ResponseSuccess(false));
    }

    public static /* synthetic */ Object b(ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11894t + 77;
        int i4 = i3 % 128;
        f11893r = i4;
        if (i3 % 2 == 0) {
            int i5 = 60 / 0;
        }
        int i6 = i4 + 103;
        f11894t = i6 % 128;
        int i7 = i6 % 2;
        return responseSuccess;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter
    public void onDetectionError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f11893r + 93;
        int i4 = i3 % 128;
        f11894t = i4;
        int i5 = i3 % 2;
        if (!(!(th instanceof NoConnectivityException))) {
            int i6 = i4 + 93;
            f11893r = i6 % 128;
            int i7 = i6 % 2;
            Toast.makeText(this.f11896j.getContext(), R.string.onboard_sdk_no_internet_connection, 1).show();
        }
        Timber.e(th, "Couldn't process QR code", new Object[0]);
        int i8 = f11894t + 11;
        f11893r = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.qr_code.QRCodeScanContract.Presenter
    public void restartQRScan() {
        int i2 = 2 % 2;
        int i3 = f11894t + 85;
        f11893r = i3 % 128;
        int i4 = i3 % 2;
        this.f11896j.setNeedHelpButtonVisible(true);
        enableProcessing(true);
        int i5 = f11893r + 37;
        f11894t = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraPresenter, com.incode.welcome_sdk.ui.camera.CameraContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11894t + 105;
        f11893r = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11901o.clear();
            int i4 = 42 / 0;
        } else {
            this.f11901o.clear();
        }
        int i5 = f11893r + 61;
        f11894t = i5 % 128;
        int i6 = i5 % 2;
    }
}
