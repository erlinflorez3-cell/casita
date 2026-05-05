package com.incode.welcome_sdk.ui.signature_form.base;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.ui.SignatureView;
import com.incode.welcome_sdk.d.ac;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import io.reactivex.Observable;
import java.io.File;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseSignatureFormActivity extends BaseActivity implements BaseSignatureFormContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17458b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17459d = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ac f17460c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public BaseSignatureFormPresenter f17461e;

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        ac acVarA = ac.a(getLayoutInflater());
        this.f17460c = acVarA;
        setContentView(acVarA.a());
        DaggerBaseSignatureFormComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).baseSignatureFormPresenterModule(new BaseSignatureFormPresenterModule(this)).build().inject(this);
        this.f17460c.f6803e.setOnSignatureUpdatedListener(new SignatureView.OnSignatureUpdatedListener() { // from class: com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormActivity.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17462a = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f17463c = 1;

            @Override // com.incode.welcome_sdk.commons.ui.SignatureView.OnSignatureUpdatedListener
            public final void e() {
                int i3 = 2 % 2;
                int i4 = f17463c + 15;
                f17462a = i4 % 128;
                if (i4 % 2 == 0) {
                    BaseSignatureFormActivity.this.f17461e.onSignatureTouched();
                    return;
                }
                BaseSignatureFormActivity.this.f17461e.onSignatureTouched();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // com.incode.welcome_sdk.commons.ui.SignatureView.OnSignatureUpdatedListener
            public final void b(boolean z2) {
                int i3 = 2 % 2;
                int i4 = f17463c + 117;
                f17462a = i4 % 128;
                if (i4 % 2 == 0) {
                    BaseSignatureFormActivity.this.f17461e.onSignatureUpdated(z2);
                    int i5 = f17462a + 93;
                    f17463c = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                BaseSignatureFormActivity.this.f17461e.onSignatureUpdated(z2);
                throw null;
            }
        });
        int i3 = f17458b + 97;
        f17459d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public void clearSignature() {
        int i2 = 2 % 2;
        int i3 = f17458b + 11;
        f17459d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f17460c.f6803e.d();
            int i4 = f17458b + 107;
            f17459d = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.f17460c.f6803e.d();
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public void disableDrawing() {
        SignatureView signatureView;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f17459d + 57;
        f17458b = i3 % 128;
        if (i3 % 2 != 0) {
            signatureView = this.f17460c.f6803e;
            z2 = true;
        } else {
            signatureView = this.f17460c.f6803e;
            z2 = false;
        }
        signatureView.setDrawingEnabled(z2);
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public Bitmap getSignatureBitmap() {
        int i2 = 2 % 2;
        int i3 = f17458b + 27;
        f17459d = i3 % 128;
        int i4 = i3 % 2;
        Bitmap bitmapA = this.f17460c.f6803e.a();
        int i5 = f17458b + 35;
        f17459d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return bitmapA;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public File saveSignatureToFile() {
        int i2 = 2 % 2;
        int i3 = f17459d + 27;
        f17458b = i3 % 128;
        int i4 = i3 % 2;
        File fileSaveSignatureToFile = this.f17461e.saveSignatureToFile();
        int i5 = f17459d + 61;
        f17458b = i5 % 128;
        if (i5 % 2 == 0) {
            return fileSaveSignatureToFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public Observable<ResponseSuccess> sendSignature(File file, j.b bVar) {
        int i2 = 2 % 2;
        int i3 = f17459d + 49;
        f17458b = i3 % 128;
        int i4 = i3 % 2;
        BaseSignatureFormPresenter baseSignatureFormPresenter = this.f17461e;
        if (i4 == 0) {
            return baseSignatureFormPresenter.sendSignature(file, bVar);
        }
        baseSignatureFormPresenter.sendSignature(file, bVar);
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f17458b + 1;
        f17459d = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnDestroy();
        this.f17461e.onDestroy();
        int i5 = f17459d + 61;
        f17458b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract.View
    public void goToNextStep(SignatureFormResult signatureFormResult) {
        int i2 = 2 % 2;
        int i3 = f17459d + 55;
        f17458b = i3 % 128;
        int i4 = i3 % 2;
        this.f17461e.publishResult(signatureFormResult);
        int i5 = f17459d + 59;
        f17458b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        this.f17461e.publishResult(new SignatureFormResult(ResultCode.USER_CANCELLED));
        int i4 = f17459d + 45;
        f17458b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f17459d + 59;
        f17458b = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    this.f$0.c(dialogInterface, i4);
                }
            });
        } else {
            handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormActivity$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    this.f$0.c(dialogInterface, i4);
                }
            });
            throw null;
        }
    }
}
