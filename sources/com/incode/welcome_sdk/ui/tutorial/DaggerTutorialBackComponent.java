package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerTutorialBackComponent {

    /* JADX INFO: renamed from: b */
    private static int f17685b = 0;

    /* JADX INFO: renamed from: e */
    private static int f17686e = 1;

    private DaggerTutorialBackComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17685b + 103;
        f17686e = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f17687a = 0;

        /* JADX INFO: renamed from: b */
        private static int f17688b = 1;

        /* JADX INFO: renamed from: c */
        private TutorialPresenterModule f17689c;

        /* JADX INFO: renamed from: d */
        private IncodeWelcomeRepositoryComponent f17690d;

        Builder() {
        }

        public final Builder tutorialPresenterModule(TutorialPresenterModule tutorialPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17688b + 107;
            f17687a = i3 % 128;
            int i4 = i3 % 2;
            this.f17689c = (TutorialPresenterModule) Preconditions.checkNotNull(tutorialPresenterModule);
            int i5 = f17687a + 5;
            f17688b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 62 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17687a + 29;
            f17688b = i3 % 128;
            if (i3 % 2 != 0) {
                this.f17690d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                return this;
            }
            this.f17690d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TutorialBackComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17689c, TutorialPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17690d, IncodeWelcomeRepositoryComponent.class);
            a aVar = new a(this.f17689c, this.f17690d);
            int i3 = f17688b + 29;
            f17687a = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }
    }

    static final class a implements TutorialBackComponent {

        /* JADX INFO: renamed from: a */
        private static int f17691a = 0;

        /* JADX INFO: renamed from: d */
        private static int f17692d = 1;

        /* JADX INFO: renamed from: b */
        private final a f17693b = this;

        /* JADX INFO: renamed from: c */
        private final TutorialPresenterModule f17694c;

        /* JADX INFO: renamed from: e */
        private final IncodeWelcomeRepositoryComponent f17695e;

        a(TutorialPresenterModule tutorialPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f17695e = incodeWelcomeRepositoryComponent;
            this.f17694c = tutorialPresenterModule;
        }

        private TutorialBackPresenter c() {
            int i2 = 2 % 2;
            TutorialBackPresenter tutorialBackPresenter = new TutorialBackPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f17695e.getIncodeRepository()), TutorialPresenterModule_ProvideTutorialPresenterViewFactory.provideTutorialPresenterView(this.f17694c));
            int i3 = f17692d + 17;
            f17691a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
            }
            return tutorialBackPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.tutorial.TutorialBackComponent
        public final void inject(TutorialBackActivity tutorialBackActivity) {
            int i2 = 2 % 2;
            int i3 = f17691a + 117;
            f17692d = i3 % 128;
            int i4 = i3 % 2;
            a(tutorialBackActivity);
            int i5 = f17691a + 39;
            f17692d = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private TutorialBackActivity a(TutorialBackActivity tutorialBackActivity) {
            int i2 = 2 % 2;
            int i3 = f17692d + 81;
            f17691a = i3 % 128;
            if (i3 % 2 == 0) {
                TutorialBackActivity_MembersInjector.injectMPresenter(tutorialBackActivity, c());
                int i4 = f17691a + 55;
                f17692d = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 21 / 0;
                }
                return tutorialBackActivity;
            }
            TutorialBackActivity_MembersInjector.injectMPresenter(tutorialBackActivity, c());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
