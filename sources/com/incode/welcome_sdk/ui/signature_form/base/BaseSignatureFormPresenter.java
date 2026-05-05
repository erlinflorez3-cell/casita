package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.io.File;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes5.dex */
public class BaseSignatureFormPresenter extends BaseModulePresenter implements BaseSignatureFormContract.Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17470a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17471e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IncodeWelcomeRepository f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CompositeDisposable f17473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BaseSignatureFormContract.View f17474d;

    @Inject
    public BaseSignatureFormPresenter(IncodeWelcomeRepository incodeWelcomeRepository, BaseSignatureFormContract.View view) {
        super(view);
        this.f17472b = incodeWelcomeRepository;
        this.f17474d = view;
        this.f17473c = new CompositeDisposable();
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.Presenter
    public void onSignatureTouched() {
        int i2 = 2 % 2;
        int i3 = f17470a + 97;
        f17471e = i3 % 128;
        int i4 = i3 % 2;
        this.f17474d.onSignatureTouched();
        int i5 = f17470a + 53;
        f17471e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.Presenter
    public void onSignatureUpdated(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17470a + 117;
        f17471e = i3 % 128;
        if (i3 % 2 == 0) {
            this.f17474d.onSignatureUpdated(z2);
            int i4 = 65 / 0;
        } else {
            this.f17474d.onSignatureUpdated(z2);
        }
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.Presenter
    public File saveSignatureToFile() {
        int i2 = 2 % 2;
        int i3 = f17471e + 91;
        f17470a = i3 % 128;
        if (i3 % 2 == 0) {
            return BitmapUtils.saveBitmapToFile(this.f17474d.getSignatureBitmap(), this.f17472b.getImagesDirectory(), "signature.png");
        }
        int i4 = 52 / 0;
        return BitmapUtils.saveBitmapToFile(this.f17474d.getSignatureBitmap(), this.f17472b.getImagesDirectory(), "signature.png");
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.Presenter
    public Observable<ResponseSuccess> sendSignature(File file, j.b bVar) {
        int i2 = 2 % 2;
        int i3 = f17471e + 37;
        f17470a = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17472b.sendSignature(file, bVar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Observable<ResponseSuccess> observableSendSignature = this.f17472b.sendSignature(file, bVar);
        int i4 = f17470a + 115;
        f17471e = i4 % 128;
        int i5 = i4 % 2;
        return observableSendSignature;
    }

    @Override // com.incode.welcome_sdk.ui.BasePresenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f17471e + 77;
        f17470a = i3 % 128;
        if (i3 % 2 == 0) {
            this.f17473c.clear();
            return;
        }
        this.f17473c.clear();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IncodeWelcomeRepository getIncodeWelcomeRepository() {
        int i2 = 2 % 2;
        int i3 = f17470a + 97;
        int i4 = i3 % 128;
        f17471e = i4;
        int i5 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f17472b;
        int i6 = i4 + 47;
        f17470a = i6 % 128;
        int i7 = i6 % 2;
        return incodeWelcomeRepository;
    }

    public CompositeDisposable getCompositeDisposable() {
        int i2 = 2 % 2;
        int i3 = f17470a + 81;
        f17471e = i3 % 128;
        int i4 = i3 % 2;
        CompositeDisposable compositeDisposable = this.f17473c;
        if (i4 == 0) {
            int i5 = 14 / 0;
        }
        return compositeDisposable;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.Presenter
    public void publishResult(SignatureFormResult signatureFormResult) {
        int i2 = 2 % 2;
        int i3 = f17471e + 29;
        f17470a = i3 % 128;
        if (i3 % 2 != 0) {
            publishResult(IncodeWelcome.getInstance().getSignatureFormBus(), signatureFormResult);
            int i4 = 24 / 0;
        } else {
            publishResult(IncodeWelcome.getInstance().getSignatureFormBus(), signatureFormResult);
        }
    }
}
