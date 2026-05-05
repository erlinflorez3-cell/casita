package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerBaseSignatureFormComponent {

    /* JADX INFO: renamed from: b */
    private static int f17485b = 1;

    /* JADX INFO: renamed from: c */
    private static int f17486c = 0;

    private DaggerBaseSignatureFormComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17485b + 101;
        f17486c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f17487a = 1;

        /* JADX INFO: renamed from: c */
        private static int f17488c = 0;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f17489b;

        /* JADX INFO: renamed from: e */
        private BaseSignatureFormPresenterModule f17490e;

        Builder() {
        }

        public final Builder baseSignatureFormPresenterModule(BaseSignatureFormPresenterModule baseSignatureFormPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17487a + 83;
            f17488c = i3 % 128;
            int i4 = i3 % 2;
            this.f17490e = (BaseSignatureFormPresenterModule) Preconditions.checkNotNull(baseSignatureFormPresenterModule);
            int i5 = f17488c + 65;
            f17487a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 60 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17488c + 45;
            f17487a = i3 % 128;
            int i4 = i3 % 2;
            this.f17489b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f17488c + 73;
            f17487a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final BaseSignatureFormComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17490e, BaseSignatureFormPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17489b, IncodeWelcomeRepositoryComponent.class);
            c cVar = new c(this.f17490e, this.f17489b);
            int i3 = f17488c + 87;
            f17487a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 93 / 0;
            }
            return cVar;
        }
    }

    static final class c implements BaseSignatureFormComponent {

        /* JADX INFO: renamed from: a */
        private static int f17491a = 0;

        /* JADX INFO: renamed from: d */
        private static int f17492d = 1;

        /* JADX INFO: renamed from: b */
        private final IncodeWelcomeRepositoryComponent f17493b;

        /* JADX INFO: renamed from: c */
        private final c f17494c = this;

        /* JADX INFO: renamed from: e */
        private final BaseSignatureFormPresenterModule f17495e;

        c(BaseSignatureFormPresenterModule baseSignatureFormPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f17493b = incodeWelcomeRepositoryComponent;
            this.f17495e = baseSignatureFormPresenterModule;
        }

        private BaseSignatureFormPresenter d() {
            int i2 = 2 % 2;
            BaseSignatureFormPresenter baseSignatureFormPresenter = new BaseSignatureFormPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f17493b.getIncodeRepository()), BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory.provideSignatureFormView(this.f17495e));
            int i3 = f17492d + 125;
            f17491a = i3 % 128;
            if (i3 % 2 == 0) {
                return baseSignatureFormPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormComponent
        public final void inject(BaseSignatureFormActivity baseSignatureFormActivity) {
            int i2 = 2 % 2;
            int i3 = f17492d + 79;
            f17491a = i3 % 128;
            int i4 = i3 % 2;
            a(baseSignatureFormActivity);
            int i5 = f17492d + 79;
            f17491a = i5 % 128;
            int i6 = i5 % 2;
        }

        private BaseSignatureFormActivity a(BaseSignatureFormActivity baseSignatureFormActivity) {
            int i2 = 2 % 2;
            int i3 = f17491a + 83;
            f17492d = i3 % 128;
            if (i3 % 2 != 0) {
                BaseSignatureFormActivity_MembersInjector.injectMBaseSignatureFormPresenter(baseSignatureFormActivity, d());
                int i4 = f17492d + 91;
                f17491a = i4 % 128;
                int i5 = i4 % 2;
                return baseSignatureFormActivity;
            }
            BaseSignatureFormActivity_MembersInjector.injectMBaseSignatureFormPresenter(baseSignatureFormActivity, d());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
