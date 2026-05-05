package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerTutorialPassportComponent {

    /* JADX INFO: renamed from: c */
    private static int f17707c = 1;

    /* JADX INFO: renamed from: d */
    private static int f17708d = 0;

    private DaggerTutorialPassportComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17707c + 75;
        f17708d = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f17709a = 1;

        /* JADX INFO: renamed from: c */
        private static int f17710c = 0;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f17711b;

        /* JADX INFO: renamed from: d */
        private TutorialPresenterModule f17712d;

        Builder() {
        }

        public final Builder tutorialPresenterModule(TutorialPresenterModule tutorialPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17710c + 67;
            f17709a = i3 % 128;
            if (i3 % 2 != 0) {
                this.f17712d = (TutorialPresenterModule) Preconditions.checkNotNull(tutorialPresenterModule);
                return this;
            }
            this.f17712d = (TutorialPresenterModule) Preconditions.checkNotNull(tutorialPresenterModule);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17710c + 91;
            f17709a = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17711b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 94 / 0;
            } else {
                this.f17711b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            int i5 = f17709a + 35;
            f17710c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final TutorialPassportComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17712d, TutorialPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17711b, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f17712d, this.f17711b);
            int i3 = f17710c + 23;
            f17709a = i3 % 128;
            if (i3 % 2 != 0) {
                return eVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class e implements TutorialPassportComponent {

        /* JADX INFO: renamed from: c */
        private static int f17713c = 1;

        /* JADX INFO: renamed from: d */
        private static int f17714d = 0;

        /* JADX INFO: renamed from: a */
        private final e f17715a = this;

        /* JADX INFO: renamed from: b */
        private final TutorialPresenterModule f17716b;

        /* JADX INFO: renamed from: e */
        private final IncodeWelcomeRepositoryComponent f17717e;

        e(TutorialPresenterModule tutorialPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f17717e = incodeWelcomeRepositoryComponent;
            this.f17716b = tutorialPresenterModule;
        }

        private TutorialFrontPresenter c() {
            int i2 = 2 % 2;
            TutorialFrontPresenter tutorialFrontPresenter = new TutorialFrontPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f17717e.getIncodeRepository()), TutorialPresenterModule_ProvideTutorialPresenterViewFactory.provideTutorialPresenterView(this.f17716b));
            int i3 = f17713c + 91;
            f17714d = i3 % 128;
            int i4 = i3 % 2;
            return tutorialFrontPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.tutorial.TutorialPassportComponent
        public final void inject(TutorialPassportActivity tutorialPassportActivity) {
            int i2 = 2 % 2;
            int i3 = f17714d + 33;
            f17713c = i3 % 128;
            if (i3 % 2 != 0) {
                b(tutorialPassportActivity);
                int i4 = f17713c + 51;
                f17714d = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            b(tutorialPassportActivity);
            throw null;
        }

        private TutorialPassportActivity b(TutorialPassportActivity tutorialPassportActivity) {
            int i2 = 2 % 2;
            int i3 = f17713c + 23;
            f17714d = i3 % 128;
            int i4 = i3 % 2;
            TutorialPassportActivity_MembersInjector.injectMPresenter(tutorialPassportActivity, c());
            int i5 = f17714d + 121;
            f17713c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 35 / 0;
            }
            return tutorialPassportActivity;
        }
    }
}
