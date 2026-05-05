package com.incode.welcome_sdk.ui.signature_form.base;

import android.graphics.Bitmap;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.j;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;
import io.reactivex.Observable;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class BaseSignatureFormContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f17468a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f17469e = 0;

    public interface Presenter extends BasePresenter {
        void onSignatureTouched();

        void onSignatureUpdated(boolean z2);

        void publishResult(SignatureFormResult signatureFormResult);

        File saveSignatureToFile();

        Observable<ResponseSuccess> sendSignature(File file, j.b bVar);
    }

    public interface View extends BaseView {
        void clearSignature();

        void disableDrawing();

        Bitmap getSignatureBitmap();

        void goToNextStep(SignatureFormResult signatureFormResult);

        void onSignatureTouched();

        void onSignatureUpdated(boolean z2);

        File saveSignatureToFile();

        Observable<ResponseSuccess> sendSignature(File file, j.b bVar);
    }

    public static int c() {
        int i2 = f17469e;
        int i3 = i2 % 7310120;
        f17469e = i2 + 1;
        if (i3 != 0) {
            return f17468a;
        }
        int i4 = (int) Runtime.getRuntime().totalMemory();
        f17468a = i4;
        return i4;
    }
}
