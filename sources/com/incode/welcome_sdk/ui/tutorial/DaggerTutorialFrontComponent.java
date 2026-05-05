package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerTutorialFrontComponent {

    /* JADX INFO: renamed from: c */
    private static int f17696c = 0;

    /* JADX INFO: renamed from: d */
    private static int f17697d = 1;

    private DaggerTutorialFrontComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17697d + 5;
        f17696c = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c */
        private static int f17698c = 0;

        /* JADX INFO: renamed from: d */
        private static int f17699d = 1;

        /* JADX INFO: renamed from: a */
        private IncodeWelcomeRepositoryComponent f17700a;

        /* JADX INFO: renamed from: e */
        private TutorialPresenterModule f17701e;

        Builder() {
        }

        public final Builder tutorialPresenterModule(TutorialPresenterModule tutorialPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17699d + 89;
            f17698c = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17701e = (TutorialPresenterModule) Preconditions.checkNotNull(tutorialPresenterModule);
                int i4 = f17699d + 37;
                f17698c = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f17701e = (TutorialPresenterModule) Preconditions.checkNotNull(tutorialPresenterModule);
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17698c + 45;
            f17699d = i3 % 128;
            int i4 = i3 % 2;
            this.f17700a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f17698c + 57;
            f17699d = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final TutorialFrontComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17701e, TutorialPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17700a, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f17701e, this.f17700a);
            int i3 = f17699d + 61;
            f17698c = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }
    }

    static final class e implements TutorialFrontComponent {

        /* JADX INFO: renamed from: c */
        private static int f17702c = 1;

        /* JADX INFO: renamed from: e */
        private static int f17703e = 0;

        /* JADX INFO: renamed from: a */
        private final e f17704a = this;

        /* JADX INFO: renamed from: b */
        private final TutorialPresenterModule f17705b;

        /* JADX INFO: renamed from: d */
        private final IncodeWelcomeRepositoryComponent f17706d;

        e(TutorialPresenterModule tutorialPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f17706d = incodeWelcomeRepositoryComponent;
            this.f17705b = tutorialPresenterModule;
        }

        private TutorialFrontPresenter a() {
            int i2 = 2 % 2;
            TutorialFrontPresenter tutorialFrontPresenter = new TutorialFrontPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f17706d.getIncodeRepository()), TutorialPresenterModule_ProvideTutorialPresenterViewFactory.provideTutorialPresenterView(this.f17705b));
            int i3 = f17703e + 111;
            f17702c = i3 % 128;
            if (i3 % 2 != 0) {
                return tutorialFrontPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.tutorial.TutorialFrontComponent
        public final void inject(TutorialFrontActivity tutorialFrontActivity) {
            int i2 = 2 % 2;
            int i3 = f17703e + 5;
            f17702c = i3 % 128;
            int i4 = i3 % 2;
            b(tutorialFrontActivity);
            int i5 = f17703e + 7;
            f17702c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private TutorialFrontActivity b(TutorialFrontActivity tutorialFrontActivity) {
            int i2 = 2 % 2;
            int i3 = f17703e + 73;
            f17702c = i3 % 128;
            if (i3 % 2 != 0) {
                TutorialFrontActivity_MembersInjector.injectMPresenter(tutorialFrontActivity, a());
                int i4 = f17702c + 113;
                f17703e = i4 % 128;
                int i5 = i4 % 2;
                return tutorialFrontActivity;
            }
            TutorialFrontActivity_MembersInjector.injectMPresenter(tutorialFrontActivity, a());
            throw null;
        }
    }
}
