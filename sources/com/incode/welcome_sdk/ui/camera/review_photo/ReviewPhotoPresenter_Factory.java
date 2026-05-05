package com.incode.welcome_sdk.ui.camera.review_photo;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ReviewPhotoPresenter_Factory implements Factory<ReviewPhotoPresenter> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11964d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11965e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f11966a;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11965e + 73;
        f11964d = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoPresenter reviewPhotoPresenter = get();
        int i5 = f11964d + 77;
        f11965e = i5 % 128;
        if (i5 % 2 != 0) {
            return reviewPhotoPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ReviewPhotoPresenter_Factory(Provider<IncodeWelcomeRepository> provider) {
        this.f11966a = provider;
    }

    @Override // javax.inject.Provider
    public final ReviewPhotoPresenter get() {
        int i2 = 2 % 2;
        int i3 = f11965e + 53;
        f11964d = i3 % 128;
        int i4 = i3 % 2;
        ReviewPhotoPresenter reviewPhotoPresenterNewInstance = newInstance(this.f11966a.get());
        int i5 = f11964d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11965e = i5 % 128;
        if (i5 % 2 != 0) {
            return reviewPhotoPresenterNewInstance;
        }
        throw null;
    }

    public static ReviewPhotoPresenter_Factory create(Provider<IncodeWelcomeRepository> provider) {
        int i2 = 2 % 2;
        ReviewPhotoPresenter_Factory reviewPhotoPresenter_Factory = new ReviewPhotoPresenter_Factory(provider);
        int i3 = f11964d + 75;
        f11965e = i3 % 128;
        int i4 = i3 % 2;
        return reviewPhotoPresenter_Factory;
    }

    public static ReviewPhotoPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        ReviewPhotoPresenter reviewPhotoPresenter = new ReviewPhotoPresenter(incodeWelcomeRepository);
        int i3 = f11964d + 97;
        f11965e = i3 % 128;
        int i4 = i3 % 2;
        return reviewPhotoPresenter;
    }
}
