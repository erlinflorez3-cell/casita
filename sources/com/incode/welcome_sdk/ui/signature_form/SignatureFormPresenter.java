package com.incode.welcome_sdk.ui.signature_form;

import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.signature_form.SignatureFormContract;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormPresenter;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import java.io.File;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureFormPresenter implements SignatureFormContract.Presenter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17453b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17454e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SignatureFormContract.View f17455a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompositeDisposable f17456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f17457d;

    public SignatureFormPresenter(BaseSignatureFormPresenter baseSignatureFormPresenter, SignatureFormContract.View view) {
        this.f17457d = baseSignatureFormPresenter.getIncodeWelcomeRepository();
        this.f17456c = baseSignatureFormPresenter.getCompositeDisposable();
        this.f17455a = view;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.Presenter
    public void onClickClear() {
        int i2 = 2 % 2;
        int i3 = f17454e + 73;
        f17453b = i3 % 128;
        int i4 = i3 % 2;
        this.f17455a.clearSignature();
        int i5 = f17453b + 9;
        f17454e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ File d() throws Exception {
        File fileSaveBitmapToFile;
        int i2 = 2 % 2;
        int i3 = f17453b + 53;
        f17454e = i3 % 128;
        if (i3 % 2 == 0) {
            fileSaveBitmapToFile = BitmapUtils.saveBitmapToFile(this.f17455a.getSignatureBitmap(), this.f17457d.getImagesDirectory(), "signature.png");
            int i4 = 78 / 0;
        } else {
            fileSaveBitmapToFile = BitmapUtils.saveBitmapToFile(this.f17455a.getSignatureBitmap(), this.f17457d.getImagesDirectory(), "signature.png");
        }
        int i5 = f17454e + 71;
        f17453b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return fileSaveBitmapToFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SignatureFormResult d(File file) throws Exception {
        int i2 = 2 % 2;
        SignatureFormResult signatureFormResult = new SignatureFormResult(ResultCode.SUCCESS, null, file.getPath());
        int i3 = f17454e + 105;
        f17453b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
        return signatureFormResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) throws Exception {
        int i2 = 2 % 2;
        this.f17455a.onUploadFinished(new SignatureFormResult(ResultCode.ERROR, th));
        Timber.e(th);
        int i3 = f17453b + 113;
        f17454e = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(long j2, long j3) {
        int i2 = 2 % 2;
        int i3 = f17454e + 121;
        f17453b = i3 % 128;
        this.f17455a.setUploadProgress(Math.round(i3 % 2 != 0 ? j2 * 100.0f * j3 : (j2 * 100.0f) / j3));
        int i4 = f17454e + 79;
        f17453b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ File b() throws Exception {
        int i2 = 2 % 2;
        int i3 = f17453b + 9;
        f17454e = i3 % 128;
        int i4 = i3 % 2;
        File fileSaveBitmapToFile = BitmapUtils.saveBitmapToFile(BitmapUtils.replaceAlphaWithColor(this.f17455a.getSignatureBitmap(), -1), this.f17457d.getImagesDirectory(), "signature.jpg");
        int i5 = f17454e + 93;
        f17453b = i5 % 128;
        int i6 = i5 % 2;
        return fileSaveBitmapToFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(j.b bVar, final File file) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17453b + 21;
        f17454e = i3 % 128;
        int i4 = i3 % 2;
        ObservableSource map = this.f17457d.sendSignature(file, bVar).map(new Function() { // from class: com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return SignatureFormPresenter.c(file, (ResponseSuccess) obj);
            }
        });
        int i5 = f17454e + 37;
        f17453b = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File c(File file, ResponseSuccess responseSuccess) throws Exception {
        int i2 = 2 % 2;
        int i3 = f17453b + 9;
        int i4 = i3 % 128;
        f17454e = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 31;
        f17453b = i6 % 128;
        int i7 = i6 % 2;
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SignatureFormResult a(File file) throws Exception {
        int i2 = 2 % 2;
        SignatureFormResult signatureFormResult = new SignatureFormResult(ResultCode.SUCCESS, null, file.getPath());
        int i3 = f17454e + 83;
        f17453b = i3 % 128;
        int i4 = i3 % 2;
        return signatureFormResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) throws Exception {
        int i2 = 2 % 2;
        this.f17455a.onUploadFinished(new SignatureFormResult(ResultCode.ERROR, th));
        Timber.e(th);
        int i3 = f17453b + 57;
        f17454e = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        r2 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda4(r5);
        r3 = r5.f17456c;
        r2 = io.reactivex.Observable.fromCallable(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda5(r5)).flatMap(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda6(r5, r2)).map(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda7()).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
        r0 = r5.f17455a;
        java.util.Objects.requireNonNull(r0);
        r3.add(r2.subscribe(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2(r0), new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda8(r5)));
        r1 = com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17454e + 3;
        com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17453b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (com.incode.welcome_sdk.IncodeWelcome.getInstance().isCaptureOnlyMode() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        r1 = com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17453b + 61;
        com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17454e = r1 % 128;
        r1 = r1 % 2;
        r3 = r5.f17456c;
        r2 = io.reactivex.Observable.fromCallable(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda0(r5)).map(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda1()).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
        r0 = r5.f17455a;
        java.util.Objects.requireNonNull(r0);
        r3.add(r2.subscribe(new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2(r0), new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda3(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (com.incode.welcome_sdk.IncodeWelcome.getInstance().isCaptureOnlyMode() != false) goto L6;
     */
    @Override // com.incode.welcome_sdk.ui.signature_form.SignatureFormContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClickDone() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17454e
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17453b = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L63
            com.incode.welcome_sdk.ui.signature_form.SignatureFormContract$View r0 = r5.f17455a
            r0.disableDrawing()
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r1 = r0.isCaptureOnlyMode()
            r0 = 0
            int r0 = r0 / r0
            if (r1 == 0) goto L73
        L1f:
            int r0 = com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17453b
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17454e = r0
            int r1 = r1 % r4
            io.reactivex.disposables.CompositeDisposable r3 = r5.f17456c
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda0 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda0
            r0.<init>()
            io.reactivex.Observable r1 = io.reactivex.Observable.fromCallable(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda1 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda1
            r0.<init>()
            io.reactivex.Observable r1 = r1.map(r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r1 = r1.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormContract$View r0 = r5.f17455a
            java.util.Objects.requireNonNull(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2 r1 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2
            r1.<init>()
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda3 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda3
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            return
        L63:
            com.incode.welcome_sdk.ui.signature_form.SignatureFormContract$View r0 = r5.f17455a
            r0.disableDrawing()
            com.incode.welcome_sdk.IncodeWelcome r0 = com.incode.welcome_sdk.IncodeWelcome.getInstance()
            boolean r0 = r0.isCaptureOnlyMode()
            if (r0 == 0) goto L73
            goto L1f
        L73:
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda4 r2 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda4
            r2.<init>()
            io.reactivex.disposables.CompositeDisposable r3 = r5.f17456c
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda5 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda5
            r0.<init>()
            io.reactivex.Observable r1 = io.reactivex.Observable.fromCallable(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda6 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda6
            r0.<init>()
            io.reactivex.Observable r1 = r1.flatMap(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda7 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda7
            r0.<init>()
            io.reactivex.Observable r1 = r1.map(r0)
            io.reactivex.Scheduler r0 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r1 = r1.subscribeOn(r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r2 = r1.observeOn(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormContract$View r0 = r5.f17455a
            java.util.Objects.requireNonNull(r0)
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2 r1 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda2
            r1.<init>()
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda8 r0 = new com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter$$ExternalSyntheticLambda8
            r0.<init>()
            io.reactivex.disposables.Disposable r0 = r2.subscribe(r1, r0)
            r3.add(r0)
            int r0 = com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17454e
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.f17453b = r0
            int r1 = r1 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.signature_form.SignatureFormPresenter.onClickDone():void");
    }
}
