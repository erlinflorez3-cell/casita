package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerMachineLearningConsentComponent {

    /* JADX INFO: renamed from: c */
    private static int f16383c = 0;

    /* JADX INFO: renamed from: e */
    private static int f16384e = 1;

    private DaggerMachineLearningConsentComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f16384e + 57;
        f16383c = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        private static int f16385d = 0;

        /* JADX INFO: renamed from: e */
        private static int f16386e = 1;

        /* JADX INFO: renamed from: a */
        private IncodeWelcomeRepositoryComponent f16387a;

        /* JADX INFO: renamed from: b */
        private MachineLearningConsentPresenterModule f16388b;

        Builder() {
        }

        public final Builder machineLearningConsentPresenterModule(MachineLearningConsentPresenterModule machineLearningConsentPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f16386e + 61;
            f16385d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f16388b = (MachineLearningConsentPresenterModule) Preconditions.checkNotNull(machineLearningConsentPresenterModule);
                int i4 = f16385d + 49;
                f16386e = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.f16388b = (MachineLearningConsentPresenterModule) Preconditions.checkNotNull(machineLearningConsentPresenterModule);
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f16386e + 43;
            f16385d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f16387a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = f16386e + 33;
                f16385d = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 6 / 0;
                }
                return this;
            }
            this.f16387a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final MachineLearningConsentComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f16388b, MachineLearningConsentPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f16387a, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f16388b, this.f16387a);
            int i3 = f16385d + 67;
            f16386e = i3 % 128;
            if (i3 % 2 != 0) {
                return eVar;
            }
            throw null;
        }
    }

    static final class e implements MachineLearningConsentComponent {

        /* JADX INFO: renamed from: b */
        private static int f16389b = 0;

        /* JADX INFO: renamed from: c */
        private static int f16390c = 1;

        /* JADX INFO: renamed from: a */
        private final IncodeWelcomeRepositoryComponent f16391a;

        /* JADX INFO: renamed from: d */
        private final MachineLearningConsentPresenterModule f16392d;

        /* JADX INFO: renamed from: e */
        private final e f16393e = this;

        e(MachineLearningConsentPresenterModule machineLearningConsentPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f16391a = incodeWelcomeRepositoryComponent;
            this.f16392d = machineLearningConsentPresenterModule;
        }

        private MachineLearningConsentPresenter a() {
            int i2 = 2 % 2;
            MachineLearningConsentPresenter machineLearningConsentPresenter = new MachineLearningConsentPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f16391a.getIncodeRepository()), MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory.provideMachineLearningConsentView(this.f16392d));
            int i3 = f16390c + 121;
            f16389b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 14 / 0;
            }
            return machineLearningConsentPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentComponent
        public final void inject(MachineLearningConsentActivity machineLearningConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f16389b + 45;
            f16390c = i3 % 128;
            if (i3 % 2 != 0) {
                d(machineLearningConsentActivity);
            } else {
                d(machineLearningConsentActivity);
                throw null;
            }
        }

        private MachineLearningConsentActivity d(MachineLearningConsentActivity machineLearningConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f16390c + 95;
            f16389b = i3 % 128;
            if (i3 % 2 != 0) {
                MachineLearningConsentActivity_MembersInjector.injectPresenter(machineLearningConsentActivity, a());
                int i4 = 15 / 0;
            } else {
                MachineLearningConsentActivity_MembersInjector.injectPresenter(machineLearningConsentActivity, a());
            }
            return machineLearningConsentActivity;
        }
    }
}
