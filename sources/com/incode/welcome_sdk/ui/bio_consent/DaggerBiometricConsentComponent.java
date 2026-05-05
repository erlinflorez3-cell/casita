package com.incode.welcome_sdk.ui.bio_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerBiometricConsentComponent {

    /* JADX INFO: renamed from: b */
    private static int f11165b = 1;

    /* JADX INFO: renamed from: c */
    private static int f11166c = 0;

    private DaggerBiometricConsentComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11166c + 55;
        f11165b = i3 % 128;
        if (i3 % 2 != 0) {
            return builder;
        }
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f11167a = 0;

        /* JADX INFO: renamed from: b */
        private static int f11168b = 1;

        /* JADX INFO: renamed from: c */
        private BiometricConsentPresenterModule f11169c;

        /* JADX INFO: renamed from: d */
        private IncodeWelcomeRepositoryComponent f11170d;

        Builder() {
        }

        public final Builder biometricConsentPresenterModule(BiometricConsentPresenterModule biometricConsentPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11167a + 123;
            f11168b = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11169c = (BiometricConsentPresenterModule) Preconditions.checkNotNull(biometricConsentPresenterModule);
                int i4 = 51 / 0;
            } else {
                this.f11169c = (BiometricConsentPresenterModule) Preconditions.checkNotNull(biometricConsentPresenterModule);
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11167a + 51;
            f11168b = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11170d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 39 / 0;
            } else {
                this.f11170d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            return this;
        }

        public final BiometricConsentComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11169c, BiometricConsentPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f11170d, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b(this.f11169c, this.f11170d);
            int i3 = f11167a + 71;
            f11168b = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }
    }

    static final class b implements BiometricConsentComponent {

        /* JADX INFO: renamed from: b */
        private static int f11171b = 0;

        /* JADX INFO: renamed from: c */
        private static int f11172c = 1;

        /* JADX INFO: renamed from: a */
        private final BiometricConsentPresenterModule f11173a;

        /* JADX INFO: renamed from: d */
        private final b f11174d = this;

        /* JADX INFO: renamed from: e */
        private final IncodeWelcomeRepositoryComponent f11175e;

        b(BiometricConsentPresenterModule biometricConsentPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f11175e = incodeWelcomeRepositoryComponent;
            this.f11173a = biometricConsentPresenterModule;
        }

        private BiometricConsentPresenter e() {
            int i2 = 2 % 2;
            BiometricConsentPresenter biometricConsentPresenter = new BiometricConsentPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f11175e.getIncodeRepository()), BiometricConsentPresenterModule_ProvideBiometricConsentViewFactory.provideBiometricConsentView(this.f11173a));
            int i3 = f11172c + 47;
            f11171b = i3 % 128;
            int i4 = i3 % 2;
            return biometricConsentPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.bio_consent.BiometricConsentComponent
        public final void inject(BiometricConsentActivity biometricConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f11171b + 29;
            f11172c = i3 % 128;
            if (i3 % 2 != 0) {
                a(biometricConsentActivity);
                return;
            }
            a(biometricConsentActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private BiometricConsentActivity a(BiometricConsentActivity biometricConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f11172c + 85;
            f11171b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                BiometricConsentActivity_MembersInjector.injectPresenter(biometricConsentActivity, e());
                int i4 = f11171b + 41;
                f11172c = i4 % 128;
                if (i4 % 2 != 0) {
                    return biometricConsentActivity;
                }
                obj.hashCode();
                throw null;
            }
            BiometricConsentActivity_MembersInjector.injectPresenter(biometricConsentActivity, e());
            throw null;
        }
    }
}
