package com.incode.welcome_sdk.ui.camera.video_selfie.video_upload;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerVideoUploadComponent {

    /* JADX INFO: renamed from: c */
    private static int f12633c = 1;

    /* JADX INFO: renamed from: e */
    private static int f12634e = 0;

    private DaggerVideoUploadComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f12633c + 13;
        f12634e = i3 % 128;
        if (i3 % 2 == 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        private static int f12635d = 1;

        /* JADX INFO: renamed from: e */
        private static int f12636e = 0;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f12637b;

        /* JADX INFO: renamed from: c */
        private VideoUploadPresenterModule f12638c;

        Builder() {
        }

        public final Builder videoUploadPresenterModule(VideoUploadPresenterModule videoUploadPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f12635d + 3;
            f12636e = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12638c = (VideoUploadPresenterModule) Preconditions.checkNotNull(videoUploadPresenterModule);
                return this;
            }
            this.f12638c = (VideoUploadPresenterModule) Preconditions.checkNotNull(videoUploadPresenterModule);
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f12635d + 99;
            f12636e = i3 % 128;
            if (i3 % 2 != 0) {
                this.f12637b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 12 / 0;
            } else {
                this.f12637b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            return this;
        }

        public final VideoUploadComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f12638c, VideoUploadPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f12637b, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f12638c, this.f12637b);
            int i3 = f12636e + 29;
            f12635d = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }
    }

    static final class d implements VideoUploadComponent {

        /* JADX INFO: renamed from: d */
        private static int f12639d = 0;

        /* JADX INFO: renamed from: e */
        private static int f12640e = 1;

        /* JADX INFO: renamed from: a */
        private final VideoUploadPresenterModule f12641a;

        /* JADX INFO: renamed from: b */
        private final d f12642b = this;

        /* JADX INFO: renamed from: c */
        private final IncodeWelcomeRepositoryComponent f12643c;

        d(VideoUploadPresenterModule videoUploadPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f12643c = incodeWelcomeRepositoryComponent;
            this.f12641a = videoUploadPresenterModule;
        }

        private VideoUploadPresenter a() {
            int i2 = 2 % 2;
            VideoUploadPresenter videoUploadPresenter = new VideoUploadPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f12643c.getIncodeRepository()), VideoUploadPresenterModule_ProvideVideoUploadViewFactory.provideVideoUploadView(this.f12641a));
            int i3 = f12640e + 23;
            f12639d = i3 % 128;
            if (i3 % 2 == 0) {
                return videoUploadPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_upload.VideoUploadComponent
        public final void inject(VideoUploadFragment videoUploadFragment) {
            int i2 = 2 % 2;
            int i3 = f12639d + 49;
            f12640e = i3 % 128;
            if (i3 % 2 != 0) {
                a(videoUploadFragment);
                return;
            }
            a(videoUploadFragment);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private VideoUploadFragment a(VideoUploadFragment videoUploadFragment) {
            int i2 = 2 % 2;
            int i3 = f12639d + 87;
            f12640e = i3 % 128;
            if (i3 % 2 != 0) {
                VideoUploadFragment_MembersInjector.injectMPresenter(videoUploadFragment, a());
                return videoUploadFragment;
            }
            VideoUploadFragment_MembersInjector.injectMPresenter(videoUploadFragment, a());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
