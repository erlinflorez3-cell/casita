package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerCurpValidationComponent {

    /* JADX INFO: renamed from: c */
    private static int f13108c = 1;

    /* JADX INFO: renamed from: d */
    private static int f13109d = 0;

    private DaggerCurpValidationComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f13109d + 51;
        f13108c = i3 % 128;
        if (i3 % 2 != 0) {
            return builder;
        }
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f13110a = 1;

        /* JADX INFO: renamed from: c */
        private static int f13111c = 0;

        /* JADX INFO: renamed from: d */
        private IncodeWelcomeRepositoryComponent f13112d;

        /* JADX INFO: renamed from: e */
        private CurpValidationModule f13113e;

        Builder() {
        }

        public final Builder curpValidationModule(CurpValidationModule curpValidationModule) {
            int i2 = 2 % 2;
            int i3 = f13111c + 61;
            f13110a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.f13113e = (CurpValidationModule) Preconditions.checkNotNull(curpValidationModule);
                int i4 = f13110a + 15;
                f13111c = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                obj.hashCode();
                throw null;
            }
            this.f13113e = (CurpValidationModule) Preconditions.checkNotNull(curpValidationModule);
            obj.hashCode();
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f13110a + 75;
            f13111c = i3 % 128;
            int i4 = i3 % 2;
            this.f13112d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f13110a + 3;
            f13111c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final CurpValidationComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f13113e, CurpValidationModule.class);
            Preconditions.checkBuilderRequirement(this.f13112d, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f13113e);
            int i3 = f13111c + 19;
            f13110a = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }
    }

    static final class d implements CurpValidationComponent {

        /* JADX INFO: renamed from: a */
        private static int f13114a = 0;

        /* JADX INFO: renamed from: e */
        private static int f13115e = 1;

        /* JADX INFO: renamed from: b */
        private final d f13116b = this;

        /* JADX INFO: renamed from: d */
        private final CurpValidationModule f13117d;

        d(CurpValidationModule curpValidationModule) {
            this.f13117d = curpValidationModule;
        }

        private CurpValidationPresenter b() {
            int i2 = 2 % 2;
            CurpValidationPresenter curpValidationPresenter = new CurpValidationPresenter(CurpValidationModule_ProvideCurpValidationViewFactory.provideCurpValidationView(this.f13117d));
            int i3 = f13114a + 13;
            f13115e = i3 % 128;
            if (i3 % 2 != 0) {
                return curpValidationPresenter;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.curp_validation.CurpValidationComponent
        public final void inject(CurpValidationActivity curpValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f13114a + 63;
            f13115e = i3 % 128;
            if (i3 % 2 != 0) {
                b(curpValidationActivity);
            } else {
                b(curpValidationActivity);
                throw null;
            }
        }

        private CurpValidationActivity b(CurpValidationActivity curpValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f13115e + 69;
            f13114a = i3 % 128;
            if (i3 % 2 == 0) {
                CurpValidationActivity_MembersInjector.injectPresenter(curpValidationActivity, b());
                int i4 = f13115e + 45;
                f13114a = i4 % 128;
                int i5 = i4 % 2;
                return curpValidationActivity;
            }
            CurpValidationActivity_MembersInjector.injectPresenter(curpValidationActivity, b());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
