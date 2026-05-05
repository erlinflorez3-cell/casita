package com.incode.welcome_sdk.ui.camera.review_photo;

import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoPresenterModule_ProvideIdValidationViewFactory implements Factory<ReviewPhotoContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11961b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11962e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReviewPhotoPresenterModule f11963d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11961b + 5;
        f11962e = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoContract.View view = get();
        int i5 = f11961b + 87;
        f11962e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public ReviewPhotoPresenterModule_ProvideIdValidationViewFactory(ReviewPhotoPresenterModule reviewPhotoPresenterModule) {
        this.f11963d = reviewPhotoPresenterModule;
    }

    @Override // javax.inject.Provider
    public final ReviewPhotoContract.View get() {
        int i2 = 2 % 2;
        int i3 = f11962e + 27;
        f11961b = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            provideIdValidationView(this.f11963d);
            obj.hashCode();
            throw null;
        }
        ReviewPhotoContract.View viewProvideIdValidationView = provideIdValidationView(this.f11963d);
        int i4 = f11962e + 13;
        f11961b = i4 % 128;
        if (i4 % 2 != 0) {
            return viewProvideIdValidationView;
        }
        obj.hashCode();
        throw null;
    }

    public static ReviewPhotoPresenterModule_ProvideIdValidationViewFactory create(ReviewPhotoPresenterModule reviewPhotoPresenterModule) {
        int i2 = 2 % 2;
        ReviewPhotoPresenterModule_ProvideIdValidationViewFactory reviewPhotoPresenterModule_ProvideIdValidationViewFactory = new ReviewPhotoPresenterModule_ProvideIdValidationViewFactory(reviewPhotoPresenterModule);
        int i3 = f11962e + 107;
        f11961b = i3 % 128;
        int i4 = i3 % 2;
        return reviewPhotoPresenterModule_ProvideIdValidationViewFactory;
    }

    public static ReviewPhotoContract.View provideIdValidationView(ReviewPhotoPresenterModule reviewPhotoPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11962e + 21;
        f11961b = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoContract.View view = (ReviewPhotoContract.View) Preconditions.checkNotNullFromProvides(reviewPhotoPresenterModule.d());
        int i5 = f11961b + 21;
        f11962e = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}
