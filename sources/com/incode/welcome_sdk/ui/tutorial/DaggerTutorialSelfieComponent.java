package com.incode.welcome_sdk.ui.tutorial;

import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerTutorialSelfieComponent {

    /* JADX INFO: renamed from: d */
    private static int f17718d = 1;

    /* JADX INFO: renamed from: e */
    private static int f17719e = 0;

    private DaggerTutorialSelfieComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17719e + 99;
        f17718d = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: b */
        private static int f17720b = 0;

        /* JADX INFO: renamed from: c */
        private static int f17721c = 1;

        /* JADX INFO: renamed from: e */
        private TutorialSelfiePresenterModule f17722e;

        Builder() {
        }

        public final Builder tutorialSelfiePresenterModule(TutorialSelfiePresenterModule tutorialSelfiePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17721c + 99;
            f17720b = i3 % 128;
            int i4 = i3 % 2;
            this.f17722e = (TutorialSelfiePresenterModule) Preconditions.checkNotNull(tutorialSelfiePresenterModule);
            int i5 = f17721c + 15;
            f17720b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final TutorialSelfieComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17722e, TutorialSelfiePresenterModule.class);
            e eVar = new e(this.f17722e);
            int i3 = f17721c + 121;
            f17720b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 67 / 0;
            }
            return eVar;
        }
    }

    static final class e implements TutorialSelfieComponent {

        /* JADX INFO: renamed from: b */
        private static int f17723b = 0;

        /* JADX INFO: renamed from: d */
        private static int f17724d = 1;

        /* JADX INFO: renamed from: a */
        private final TutorialSelfiePresenterModule f17725a;

        /* JADX INFO: renamed from: e */
        private final e f17726e = this;

        e(TutorialSelfiePresenterModule tutorialSelfiePresenterModule) {
            this.f17725a = tutorialSelfiePresenterModule;
        }

        private TutorialSelfiePresenter a() {
            int i2 = 2 % 2;
            TutorialSelfiePresenter tutorialSelfiePresenter = new TutorialSelfiePresenter(TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory.provideTutorialSelfieView(this.f17725a));
            int i3 = f17723b + 15;
            f17724d = i3 % 128;
            int i4 = i3 % 2;
            return tutorialSelfiePresenter;
        }

        @Override // com.incode.welcome_sdk.ui.tutorial.TutorialSelfieComponent
        public final void inject(TutorialSelfieActivity tutorialSelfieActivity) {
            int i2 = 2 % 2;
            int i3 = f17724d + 113;
            f17723b = i3 % 128;
            int i4 = i3 % 2;
            a(tutorialSelfieActivity);
            int i5 = f17723b + 31;
            f17724d = i5 % 128;
            int i6 = i5 % 2;
        }

        private TutorialSelfieActivity a(TutorialSelfieActivity tutorialSelfieActivity) {
            int i2 = 2 % 2;
            int i3 = f17723b + 123;
            f17724d = i3 % 128;
            int i4 = i3 % 2;
            TutorialSelfieActivity_MembersInjector.injectPresenter(tutorialSelfieActivity, a());
            int i5 = f17724d + 109;
            f17723b = i5 % 128;
            int i6 = i5 % 2;
            return tutorialSelfieActivity;
        }
    }
}
