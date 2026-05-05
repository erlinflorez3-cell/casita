package com.incode.welcome_sdk.ui.camera.review_photo;

import android.os.Process;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerReviewPhotoComponent {

    /* JADX INFO: renamed from: a */
    private static int f11918a = 0;

    /* JADX INFO: renamed from: b */
    private static int f11919b = 1;

    private DaggerReviewPhotoComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11919b + 75;
        f11918a = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public static int f11920a = 0;

        /* JADX INFO: renamed from: c */
        private static int f11921c = 1;

        /* JADX INFO: renamed from: d */
        public static int f11922d = 0;

        /* JADX INFO: renamed from: e */
        private static int f11923e = 0;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f11924b;

        Builder() {
        }

        @Deprecated
        public final Builder reviewPhotoPresenterModule(ReviewPhotoPresenterModule reviewPhotoPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11923e + 69;
            f11921c = i3 % 128;
            if (i3 % 2 != 0) {
                Preconditions.checkNotNull(reviewPhotoPresenterModule);
                return this;
            }
            Preconditions.checkNotNull(reviewPhotoPresenterModule);
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11923e + 51;
            f11921c = i3 % 128;
            int i4 = i3 % 2;
            this.f11924b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f11923e + 7;
            f11921c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final ReviewPhotoComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11924b, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f11924b);
            int i3 = f11923e + 59;
            f11921c = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }

        public static int a() {
            int i2 = f11920a;
            int i3 = i2 % 5802274;
            f11920a = i2 + 1;
            if (i3 != 0) {
                return f11922d;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            f11922d = elapsedCpuTime;
            return elapsedCpuTime;
        }
    }

    static final class e implements ReviewPhotoComponent {

        /* JADX INFO: renamed from: a */
        private static int f11925a = 0;

        /* JADX INFO: renamed from: d */
        private static int f11926d = 1;

        /* JADX INFO: renamed from: c */
        private final IncodeWelcomeRepositoryComponent f11927c;

        /* JADX INFO: renamed from: e */
        private final e f11928e = this;

        e(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f11927c = incodeWelcomeRepositoryComponent;
        }

        private ReviewPhotoPresenter e() {
            int i2 = 2 % 2;
            ReviewPhotoPresenter reviewPhotoPresenter = new ReviewPhotoPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f11927c.getIncodeRepository()));
            int i3 = f11926d + 121;
            f11925a = i3 % 128;
            if (i3 % 2 == 0) {
                return reviewPhotoPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.camera.review_photo.ReviewPhotoComponent
        public final void inject(ReviewPhotoActivity reviewPhotoActivity) {
            int i2 = 2 % 2;
            int i3 = f11925a + 19;
            f11926d = i3 % 128;
            int i4 = i3 % 2;
            d(reviewPhotoActivity);
            int i5 = f11926d + 1;
            f11925a = i5 % 128;
            int i6 = i5 % 2;
        }

        private ReviewPhotoActivity d(ReviewPhotoActivity reviewPhotoActivity) {
            int i2 = 2 % 2;
            int i3 = f11925a + 49;
            f11926d = i3 % 128;
            int i4 = i3 % 2;
            ReviewPhotoActivity_MembersInjector.injectMReviewPhotoPresenter(reviewPhotoActivity, e());
            int i5 = f11926d + 85;
            f11925a = i5 % 128;
            int i6 = i5 % 2;
            return reviewPhotoActivity;
        }
    }
}
