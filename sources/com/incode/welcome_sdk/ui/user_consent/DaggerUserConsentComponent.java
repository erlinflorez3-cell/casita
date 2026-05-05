package com.incode.welcome_sdk.ui.user_consent;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerUserConsentComponent {

    /* JADX INFO: renamed from: a */
    private static int f17992a = 0;

    /* JADX INFO: renamed from: d */
    private static int f17993d = 1;

    private DaggerUserConsentComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17993d + 35;
        f17992a = i3 % 128;
        if (i3 % 2 == 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: b */
        private static int f17994b = 1;

        /* JADX INFO: renamed from: e */
        private static int f17995e = 0;

        /* JADX INFO: renamed from: a */
        private IncodeWelcomeRepositoryComponent f17996a;

        /* JADX INFO: renamed from: c */
        private UserConsentPresenterModule f17997c;

        Builder() {
        }

        public final Builder userConsentPresenterModule(UserConsentPresenterModule userConsentPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17995e + 1;
            f17994b = i3 % 128;
            int i4 = i3 % 2;
            this.f17997c = (UserConsentPresenterModule) Preconditions.checkNotNull(userConsentPresenterModule);
            int i5 = f17995e + 117;
            f17994b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17994b + 89;
            f17995e = i3 % 128;
            int i4 = i3 % 2;
            this.f17996a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f17994b + 71;
            f17995e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final UserConsentComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17997c, UserConsentPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17996a, IncodeWelcomeRepositoryComponent.class);
            a aVar = new a(this.f17997c, this.f17996a);
            int i3 = f17995e + 103;
            f17994b = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }
    }

    static final class a implements UserConsentComponent {

        /* JADX INFO: renamed from: c */
        private static int f17998c = 1;

        /* JADX INFO: renamed from: e */
        private static int f17999e = 0;

        /* JADX INFO: renamed from: a */
        private final a f18000a = this;

        /* JADX INFO: renamed from: b */
        private final IncodeWelcomeRepositoryComponent f18001b;

        /* JADX INFO: renamed from: d */
        private final UserConsentPresenterModule f18002d;

        a(UserConsentPresenterModule userConsentPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f18001b = incodeWelcomeRepositoryComponent;
            this.f18002d = userConsentPresenterModule;
        }

        private UserConsentPresenter d() {
            int i2 = 2 % 2;
            UserConsentPresenter userConsentPresenter = new UserConsentPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f18001b.getIncodeRepository()), UserConsentPresenterModule_ProvideUserConsentViewFactory.provideUserConsentView(this.f18002d));
            int i3 = f17998c + 103;
            f17999e = i3 % 128;
            if (i3 % 2 == 0) {
                return userConsentPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.user_consent.UserConsentComponent
        public final void inject(UserConsentActivity userConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f17998c + 41;
            f17999e = i3 % 128;
            if (i3 % 2 != 0) {
                a(userConsentActivity);
                int i4 = 85 / 0;
            } else {
                a(userConsentActivity);
            }
        }

        private UserConsentActivity a(UserConsentActivity userConsentActivity) {
            int i2 = 2 % 2;
            int i3 = f17998c + 35;
            f17999e = i3 % 128;
            if (i3 % 2 != 0) {
                UserConsentActivity_MembersInjector.injectPresenter(userConsentActivity, d());
                int i4 = 13 / 0;
            } else {
                UserConsentActivity_MembersInjector.injectPresenter(userConsentActivity, d());
            }
            int i5 = f17999e + 125;
            f17998c = i5 % 128;
            if (i5 % 2 != 0) {
                return userConsentActivity;
            }
            throw null;
        }
    }
}
