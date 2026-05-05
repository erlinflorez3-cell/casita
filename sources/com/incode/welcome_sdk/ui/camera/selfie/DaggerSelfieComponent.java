package com.incode.welcome_sdk.ui.camera.selfie;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerSelfieComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11974b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11975d = 0;

    private DaggerSelfieComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11974b + 33;
        f11975d = i3 % 128;
        if (i3 % 2 == 0) {
            return builder;
        }
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11976b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11977e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IncodeWelcomeRepositoryComponent f11978d;

        Builder() {
        }

        @Deprecated
        public final Builder selfiePresenterModule(SelfiePresenterModule selfiePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11977e + 77;
            f11976b = i3 % 128;
            if (i3 % 2 != 0) {
                Preconditions.checkNotNull(selfiePresenterModule);
                return this;
            }
            Preconditions.checkNotNull(selfiePresenterModule);
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11977e + 113;
            f11976b = i3 % 128;
            int i4 = i3 % 2;
            this.f11978d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f11976b + 15;
            f11977e = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final SelfieComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11978d, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b();
            int i3 = f11977e + 1;
            f11976b = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }
    }

    static final class b implements SelfieComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11979a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11980c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f11981b = this;

        b() {
        }

        @Override // com.incode.welcome_sdk.ui.camera.selfie.SelfieComponent
        public final void inject(SelfieActivity selfieActivity) {
            int i2 = 2 % 2;
            int i3 = f11979a + 33;
            f11980c = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
