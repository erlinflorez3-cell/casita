package com.incode.welcome_sdk.ui.camera.review_photo;

import com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoContract;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes5.dex */
@Module
public class ReviewPhotoPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11958a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11959d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReviewPhotoContract.View f11960b;

    public ReviewPhotoPresenterModule(ReviewPhotoContract.View view) {
        this.f11960b = view;
    }

    @Provides
    ReviewPhotoContract.View d() {
        int i2 = 2 % 2;
        int i3 = f11958a;
        int i4 = i3 + 13;
        f11959d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ReviewPhotoContract.View view = this.f11960b;
        int i5 = i3 + 107;
        f11959d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}
