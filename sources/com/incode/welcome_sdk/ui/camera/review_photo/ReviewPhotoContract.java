package com.incode.welcome_sdk.ui.camera.review_photo;

import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoContract {

    public interface Presenter {
        void deleteTempFiles(DocumentType documentType);

        File getImageFile(DocumentType documentType);

        void sendEvent(Event event, Modules modules, ScreenName screenName);
    }

    public interface View {
    }
}
