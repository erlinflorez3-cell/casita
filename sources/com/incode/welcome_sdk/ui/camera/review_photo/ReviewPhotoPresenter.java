package com.incode.welcome_sdk.ui.camera.review_photo;

import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract;
import java.io.File;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoPresenter implements ReviewPhotoContract.Presenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11952d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11953e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcomeRepository f11954c;

    @Inject
    public ReviewPhotoPresenter(IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f11954c = incodeWelcomeRepository;
    }

    @Override // com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract.Presenter
    public final File getImageFile(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f11953e + 65;
        f11952d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(documentType, "");
            File imagesDirectory = this.f11954c.getImagesDirectory();
            Intrinsics.checkNotNullExpressionValue(imagesDirectory, "");
            String roundedImageFilename = documentType.getRoundedImageFilename();
            Intrinsics.checkNotNullExpressionValue(roundedImageFilename, "");
            return l.b(imagesDirectory, roundedImageFilename);
        }
        Intrinsics.checkNotNullParameter(documentType, "");
        File imagesDirectory2 = this.f11954c.getImagesDirectory();
        Intrinsics.checkNotNullExpressionValue(imagesDirectory2, "");
        String roundedImageFilename2 = documentType.getRoundedImageFilename();
        Intrinsics.checkNotNullExpressionValue(roundedImageFilename2, "");
        File fileB = l.b(imagesDirectory2, roundedImageFilename2);
        int i4 = 61 / 0;
        return fileB;
    }

    @Override // com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract.Presenter
    public final void deleteTempFiles(DocumentType documentType) {
        int i2 = 2 % 2;
        int i3 = f11952d + 19;
        f11953e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(documentType, "");
        int i5 = WhenMappings.f11955b[documentType.ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) {
            File imagesDirectory = this.f11954c.getImagesDirectory();
            Intrinsics.checkNotNullExpressionValue(imagesDirectory, "");
            String imageFilename = documentType.getImageFilename();
            Intrinsics.checkNotNullExpressionValue(imageFilename, "");
            l.e(imagesDirectory, imageFilename);
        }
        int i6 = f11953e + 11;
        f11952d = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract.Presenter
    public final void sendEvent(Event event, Modules modules, ScreenName screenName) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        Intrinsics.checkNotNullParameter(modules, "");
        Intrinsics.checkNotNullParameter(screenName, "");
        HashMap map = new HashMap();
        map.put(EventValues.SCREEN_NAME.getValue(), screenName.name());
        EventUtils.sendEvent(this.f11954c, event, modules, (HashMap<String, Object>) map);
        int i3 = f11952d + 35;
        f11953e = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11956c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11957e = 1;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
                int i2 = f11957e + 77;
                f11956c = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 5 % 3;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.MEDICAL_DOC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 3;
                int i5 = f11956c + 13;
                f11957e = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 4;
                int i8 = f11956c + 19;
                f11957e = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11955b = iArr;
        }
    }
}
