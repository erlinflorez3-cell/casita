package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerReferredToExecutiveComponent {

    /* JADX INFO: renamed from: a */
    private static int f11554a = 1;

    /* JADX INFO: renamed from: e */
    private static int f11555e = 0;

    private DaggerReferredToExecutiveComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11555e + 77;
        f11554a = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        private static int f11556d = 0;

        /* JADX INFO: renamed from: e */
        private static int f11557e = 1;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f11558b;

        /* JADX INFO: renamed from: c */
        private ReferredToExecutivePresenterModule f11559c;

        Builder() {
        }

        public final Builder referredToExecutivePresenterModule(ReferredToExecutivePresenterModule referredToExecutivePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11556d + 101;
            f11557e = i3 % 128;
            int i4 = i3 % 2;
            this.f11559c = (ReferredToExecutivePresenterModule) Preconditions.checkNotNull(referredToExecutivePresenterModule);
            int i5 = f11556d + 57;
            f11557e = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11557e + 65;
            f11556d = i3 % 128;
            int i4 = i3 % 2;
            this.f11558b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f11556d + 67;
            f11557e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final ReferredToExecutiveComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11559c, ReferredToExecutivePresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f11558b, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b(this.f11559c, this.f11558b);
            int i3 = f11556d + 3;
            f11557e = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            throw null;
        }
    }

    static final class b implements ReferredToExecutiveComponent {

        /* JADX INFO: renamed from: c */
        private static int f11560c = 1;

        /* JADX INFO: renamed from: e */
        private static int f11561e = 0;

        /* JADX INFO: renamed from: a */
        private final ReferredToExecutivePresenterModule f11562a;

        /* JADX INFO: renamed from: b */
        private final b f11563b = this;

        /* JADX INFO: renamed from: d */
        private final IncodeWelcomeRepositoryComponent f11564d;

        b(ReferredToExecutivePresenterModule referredToExecutivePresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f11564d = incodeWelcomeRepositoryComponent;
            this.f11562a = referredToExecutivePresenterModule;
        }

        private ReferredToExecutivePresenter d() {
            int i2 = 2 % 2;
            ReferredToExecutivePresenter referredToExecutivePresenter = new ReferredToExecutivePresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f11564d.getIncodeRepository()), ReferredToExecutivePresenterModule_ProvideReferredToExecutiveViewFactory.provideReferredToExecutiveView(this.f11562a));
            int i3 = f11561e + 7;
            f11560c = i3 % 128;
            int i4 = i3 % 2;
            return referredToExecutivePresenter;
        }

        @Override // com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveComponent
        public final void inject(ReferredToExecutiveActivity referredToExecutiveActivity) {
            int i2 = 2 % 2;
            int i3 = f11560c + 77;
            f11561e = i3 % 128;
            if (i3 % 2 == 0) {
                b(referredToExecutiveActivity);
                int i4 = f11561e + 9;
                f11560c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 57 / 0;
                    return;
                }
                return;
            }
            b(referredToExecutiveActivity);
            throw null;
        }

        private ReferredToExecutiveActivity b(ReferredToExecutiveActivity referredToExecutiveActivity) {
            int i2 = 2 % 2;
            int i3 = f11560c + 9;
            f11561e = i3 % 128;
            int i4 = i3 % 2;
            ReferredToExecutiveActivity_MembersInjector.injectMPresenter(referredToExecutiveActivity, d());
            int i5 = f11560c + 31;
            f11561e = i5 % 128;
            int i6 = i5 % 2;
            return referredToExecutiveActivity;
        }
    }
}
