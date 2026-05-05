package com.incode.welcome_sdk.ui.video_conference;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerVideoConferenceComponent {

    /* JADX INFO: renamed from: a */
    private static int f18057a = 0;

    /* JADX INFO: renamed from: d */
    private static int f18058d = 1;

    private DaggerVideoConferenceComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f18057a + 27;
        f18058d = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c */
        private static int f18059c = 1;

        /* JADX INFO: renamed from: d */
        private static int f18060d = 0;

        /* JADX INFO: renamed from: a */
        private IncodeWelcomeRepositoryComponent f18061a;

        /* JADX INFO: renamed from: b */
        private VideoConferencePresenterModule f18062b;

        Builder() {
        }

        public final Builder videoConferencePresenterModule(VideoConferencePresenterModule videoConferencePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f18060d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f18059c = i3 % 128;
            if (i3 % 2 == 0) {
                this.f18062b = (VideoConferencePresenterModule) Preconditions.checkNotNull(videoConferencePresenterModule);
                int i4 = 88 / 0;
            } else {
                this.f18062b = (VideoConferencePresenterModule) Preconditions.checkNotNull(videoConferencePresenterModule);
            }
            int i5 = f18060d + 75;
            f18059c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f18059c + 45;
            f18060d = i3 % 128;
            if (i3 % 2 != 0) {
                this.f18061a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 47 / 0;
            } else {
                this.f18061a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            int i5 = f18060d + 61;
            f18059c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 31 / 0;
            }
            return this;
        }

        public final VideoConferenceComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f18062b, VideoConferencePresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f18061a, IncodeWelcomeRepositoryComponent.class);
            c cVar = new c(this.f18062b, this.f18061a);
            int i3 = f18059c + 77;
            f18060d = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 1 / 0;
            }
            return cVar;
        }
    }

    static final class c implements VideoConferenceComponent {

        /* JADX INFO: renamed from: a */
        private static int f18063a = 1;

        /* JADX INFO: renamed from: b */
        private static int f18064b = 0;

        /* JADX INFO: renamed from: c */
        private final c f18065c = this;

        /* JADX INFO: renamed from: d */
        private final VideoConferencePresenterModule f18066d;

        /* JADX INFO: renamed from: e */
        private final IncodeWelcomeRepositoryComponent f18067e;

        c(VideoConferencePresenterModule videoConferencePresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f18067e = incodeWelcomeRepositoryComponent;
            this.f18066d = videoConferencePresenterModule;
        }

        private VideoConferencePresenter d() {
            int i2 = 2 % 2;
            VideoConferencePresenter videoConferencePresenter = new VideoConferencePresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f18067e.getIncodeRepository()), VideoConferencePresenterModule_ProvideVideoConferenceViewFactory.provideVideoConferenceView(this.f18066d));
            int i3 = f18064b + 107;
            f18063a = i3 % 128;
            int i4 = i3 % 2;
            return videoConferencePresenter;
        }

        @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceComponent
        public final void inject(VideoConferenceActivity videoConferenceActivity) {
            int i2 = 2 % 2;
            int i3 = f18063a + 15;
            f18064b = i3 % 128;
            int i4 = i3 % 2;
            c(videoConferenceActivity);
            int i5 = f18064b + 1;
            f18063a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        private VideoConferenceActivity c(VideoConferenceActivity videoConferenceActivity) {
            int i2 = 2 % 2;
            int i3 = f18064b + 27;
            f18063a = i3 % 128;
            if (i3 % 2 != 0) {
                VideoConferenceActivity_MembersInjector.injectMConferencePresenter(videoConferenceActivity, d());
                return videoConferenceActivity;
            }
            VideoConferenceActivity_MembersInjector.injectMConferencePresenter(videoConferenceActivity, d());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
