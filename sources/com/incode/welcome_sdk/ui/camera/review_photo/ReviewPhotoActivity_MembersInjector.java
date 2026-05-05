package com.incode.welcome_sdk.ui.camera.review_photo;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoActivity_MembersInjector implements MembersInjector<ReviewPhotoActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11949b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11950d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<ReviewPhotoPresenter> f11951e;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11950d + 125;
        f11949b = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(reviewPhotoActivity);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f11950d + 69;
        f11949b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public ReviewPhotoActivity_MembersInjector(Provider<ReviewPhotoPresenter> provider) {
        this.f11951e = provider;
    }

    public static MembersInjector<ReviewPhotoActivity> create(Provider<ReviewPhotoPresenter> provider) {
        int i2 = 2 % 2;
        ReviewPhotoActivity_MembersInjector reviewPhotoActivity_MembersInjector = new ReviewPhotoActivity_MembersInjector(provider);
        int i3 = f11950d + 1;
        f11949b = i3 % 128;
        int i4 = i3 % 2;
        return reviewPhotoActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(ReviewPhotoActivity reviewPhotoActivity) {
        int i2 = 2 % 2;
        int i3 = f11949b + 69;
        f11950d = i3 % 128;
        if (i3 % 2 != 0) {
            injectMReviewPhotoPresenter(reviewPhotoActivity, this.f11951e.get());
            int i4 = 46 / 0;
        } else {
            injectMReviewPhotoPresenter(reviewPhotoActivity, this.f11951e.get());
        }
        int i5 = f11949b + 123;
        f11950d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectMReviewPhotoPresenter(ReviewPhotoActivity reviewPhotoActivity, ReviewPhotoPresenter reviewPhotoPresenter) {
        int i2 = 2 % 2;
        int i3 = f11949b + 75;
        f11950d = i3 % 128;
        int i4 = i3 % 2;
        reviewPhotoActivity.f11935d = reviewPhotoPresenter;
        int i5 = f11950d + 65;
        f11949b = i5 % 128;
        int i6 = i5 % 2;
    }
}
