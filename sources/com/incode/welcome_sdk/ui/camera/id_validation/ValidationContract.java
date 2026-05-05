package com.incode.welcome_sdk.ui.camera.id_validation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Camera;
import androidx.transition.Transition;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ValidationContract {

    public interface Presenter {
        void onActivityResult(int i2, int i3, Intent intent);

        void onDestroy();

        void saveRoundedImage(File file, DocumentType documentType, Bitmap bitmap);

        void waitUntilRoundedImageSaved();
    }

    public interface View {
        void flashPreview(Bitmap bitmap);

        Camera getCamera();

        DocumentType getDocumentType();

        ValidationPhase getValidationPhase();

        void hideFeedback();

        void onReviewContinueClicked();

        void removePreview();

        void scanAgainBack();

        void scanAgainDocument();

        void scanAgainFront();

        void scanAgainPassport();

        void setCameraUIVisibility(boolean z2);

        void setCameraUIVisibility(boolean z2, Transition.TransitionListener transitionListener);

        void showFeedback(ValidationFeedback validationFeedback);
    }
}
