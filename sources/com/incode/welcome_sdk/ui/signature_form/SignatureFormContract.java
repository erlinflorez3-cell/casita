package com.incode.welcome_sdk.ui.signature_form;

import android.graphics.Bitmap;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.ui.BaseView;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureFormContract {

    public interface Presenter {
        void onClickClear();

        void onClickDone();
    }

    public interface View extends BaseView {
        void clearSignature();

        void disableDrawing();

        Bitmap getSignatureBitmap();

        void onUploadFinished(SignatureFormResult signatureFormResult);

        void setClearButtonEnabled(boolean z2);

        void setDoneButtonEnabled(boolean z2);

        void setSignHereLabelVisibility(boolean z2);

        void setUploadProgress(int i2);
    }
}
