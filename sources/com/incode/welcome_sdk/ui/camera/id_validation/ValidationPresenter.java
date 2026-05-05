package com.incode.welcome_sdk.ui.camera.id_validation;

import android.content.Intent;
import android.graphics.Bitmap;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase;
import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoResult;
import io.reactivex.Completable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class ValidationPresenter implements ValidationContract.Presenter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11722d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f11723f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownLatch f11724a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValidationContract.View f11726c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompositeDisposable f11725b = new CompositeDisposable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f11727e = new Object();

    public ValidationPresenter(ValidationContract.View view) {
        this.f11726c = view;
    }

    private void a() {
        if (this.f11724a == null) {
            synchronized (this.f11727e) {
                if (this.f11724a == null) {
                    this.f11724a = new CountDownLatch(1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Bitmap bitmap, File file, DocumentType documentType) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11722d + 105;
        f11723f = i3 % 128;
        int i4 = i3 % 2;
        BitmapUtils.saveBitmapToFile(bitmap, file, documentType.getRoundedImageFilename(), 100, Bitmap.CompressFormat.PNG);
        int i5 = f11723f + 15;
        f11722d = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() throws Exception {
        int i2 = 2 % 2;
        int i3 = f11722d + 99;
        int i4 = i3 % 128;
        f11723f = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            CountDownLatch countDownLatch = this.f11724a;
            if (countDownLatch != null) {
                int i5 = i4 + 75;
                f11722d = i5 % 128;
                if (i5 % 2 == 0) {
                    countDownLatch.countDown();
                } else {
                    countDownLatch.countDown();
                    throw null;
                }
            }
            Timber.d("saved rounded bitmap", new Object[0]);
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = f11723f + 35;
        f11722d = i3 % 128;
        int i4 = i3 % 2;
        Timber.e(th, "Couldn't save rounded bitmap", new Object[0]);
        int i5 = f11722d + 75;
        f11723f = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.Presenter
    public void saveRoundedImage(final File file, final DocumentType documentType, final Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f11722d + 63;
        f11723f = i3 % 128;
        if (i3 % 2 != 0) {
            a();
            this.f11725b.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    ValidationPresenter.a(bitmap, file, documentType);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.c();
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    ValidationPresenter.d((Throwable) obj);
                }
            }));
        } else {
            a();
            this.f11725b.add(Completable.fromAction(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    ValidationPresenter.a(bitmap, file, documentType);
                }
            }).subscribeOn(Schedulers.io()).subscribe(new Action() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda1
                @Override // io.reactivex.functions.Action
                public final void run() throws Exception {
                    this.f$0.c();
                }
            }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$$ExternalSyntheticLambda2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    ValidationPresenter.d((Throwable) obj);
                }
            }));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.Presenter
    public void waitUntilRoundedImageSaved() {
        int i2 = 2 % 2;
        int i3 = f11723f + 41;
        f11722d = i3 % 128;
        try {
        } catch (InterruptedException e2) {
            Timber.e(e2);
        }
        if (i3 % 2 == 0) {
            a();
            this.f11724a.await(10L, TimeUnit.SECONDS);
            this.f11724a = null;
        } else {
            a();
            this.f11724a.await(10L, TimeUnit.SECONDS);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.ValidationPresenter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11728b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11730d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f11731e;

        static {
            int[] iArr = new int[ReviewPhotoResult.valuesCustom().length];
            f11729c = iArr;
            try {
                iArr[ReviewPhotoResult.CONTINUE.ordinal()] = 1;
                int i2 = f11730d + 7;
                f11728b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11729c[ReviewPhotoResult.SCAN_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ValidationPhase.values().length];
            f11731e = iArr2;
            try {
                iArr2[ValidationPhase.SCAN_ID_FRONT.ordinal()] = 1;
                int i5 = f11730d + 115;
                f11728b = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11731e[ValidationPhase.SCAN_ID_BACK.ordinal()] = 2;
                int i8 = f11728b + 51;
                f11730d = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11731e[ValidationPhase.SCAN_PASSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11731e[ValidationPhase.SCAN_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.Presenter
    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = 2 % 2;
        int i5 = f11723f + 43;
        int i6 = i5 % 128;
        f11722d = i6;
        if (i5 % 2 != 0) {
            if (i2 != 11334) {
                return;
            }
        } else if (i2 != 18087) {
            return;
        }
        if (i3 == -1) {
            int i7 = i6 + 111;
            f11723f = i7 % 128;
            int i8 = i7 % 2;
            if (intent != null) {
                int i9 = AnonymousClass1.f11729c[((ReviewPhotoResult) intent.getSerializableExtra("extraReviewPhotoResult")).ordinal()];
                if (i9 == 1) {
                    this.f11726c.onReviewContinueClicked();
                    return;
                }
                if (i9 != 2) {
                    return;
                }
                int i10 = AnonymousClass1.f11731e[this.f11726c.getValidationPhase().ordinal()];
                if (i10 == 1) {
                    this.f11726c.scanAgainFront();
                    return;
                }
                if (i10 == 2) {
                    this.f11726c.scanAgainBack();
                    return;
                }
                if (i10 == 3) {
                    this.f11726c.scanAgainPassport();
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    this.f11726c.scanAgainDocument();
                    int i11 = f11722d + 57;
                    f11723f = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.ValidationContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f11722d + 45;
        f11723f = i3 % 128;
        int i4 = i3 % 2;
        this.f11725b.clear();
        int i5 = f11723f + 31;
        f11722d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
