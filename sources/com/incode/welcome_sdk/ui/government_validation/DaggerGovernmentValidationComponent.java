package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerGovernmentValidationComponent {

    /* JADX INFO: renamed from: b */
    private static int f14411b = 0;

    /* JADX INFO: renamed from: c */
    private static int f14412c = 1;

    private DaggerGovernmentValidationComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f14411b + 125;
        f14412c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        private static int f14413d = 1;

        /* JADX INFO: renamed from: e */
        private static int f14414e = 0;

        /* JADX INFO: renamed from: a */
        private GovernmentValidationPresenterModule f14415a;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f14416b;

        Builder() {
        }

        public final Builder governmentValidationPresenterModule(GovernmentValidationPresenterModule governmentValidationPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f14414e + 37;
            f14413d = i3 % 128;
            int i4 = i3 % 2;
            this.f14415a = (GovernmentValidationPresenterModule) Preconditions.checkNotNull(governmentValidationPresenterModule);
            int i5 = f14414e + 63;
            f14413d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 17 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f14414e + 111;
            f14413d = i3 % 128;
            int i4 = i3 % 2;
            this.f14416b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f14414e + 123;
            f14413d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final GovernmentValidationComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f14415a, GovernmentValidationPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f14416b, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f14415a, this.f14416b);
            int i3 = f14413d + 69;
            f14414e = i3 % 128;
            if (i3 % 2 == 0) {
                return eVar;
            }
            throw null;
        }
    }

    static final class e implements GovernmentValidationComponent {

        /* JADX INFO: renamed from: b */
        private static int f14417b = 0;

        /* JADX INFO: renamed from: e */
        private static int f14418e = 1;

        /* JADX INFO: renamed from: a */
        private final GovernmentValidationPresenterModule f14419a;

        /* JADX INFO: renamed from: c */
        private final e f14420c = this;

        /* JADX INFO: renamed from: d */
        private final IncodeWelcomeRepositoryComponent f14421d;

        e(GovernmentValidationPresenterModule governmentValidationPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f14421d = incodeWelcomeRepositoryComponent;
            this.f14419a = governmentValidationPresenterModule;
        }

        private GovernmentValidationPresenter d() {
            int i2 = 2 % 2;
            GovernmentValidationPresenter governmentValidationPresenter = new GovernmentValidationPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f14421d.getIncodeRepository()), GovernmentValidationPresenterModule_ProvideLoginViewFactory.provideLoginView(this.f14419a));
            int i3 = f14417b + 25;
            f14418e = i3 % 128;
            int i4 = i3 % 2;
            return governmentValidationPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.government_validation.GovernmentValidationComponent
        public final void inject(GovernmentValidationActivity governmentValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f14417b + 53;
            f14418e = i3 % 128;
            if (i3 % 2 == 0) {
                a(governmentValidationActivity);
                int i4 = 52 / 0;
            } else {
                a(governmentValidationActivity);
            }
            int i5 = f14417b + 1;
            f14418e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
        }

        private GovernmentValidationActivity a(GovernmentValidationActivity governmentValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f14417b + 45;
            f14418e = i3 % 128;
            int i4 = i3 % 2;
            GovernmentValidationActivity_MembersInjector.injectMPresenter(governmentValidationActivity, d());
            int i5 = f14417b + 97;
            f14418e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 49 / 0;
            }
            return governmentValidationActivity;
        }
    }
}
