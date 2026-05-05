package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerProcessIdComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11546c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11547e = 1;

    private DaggerProcessIdComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11547e + 73;
        f11546c = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11548b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11549e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private IncodeWelcomeRepositoryComponent f11550d;

        Builder() {
        }

        @Deprecated
        public final Builder processIdPresenterModule(ProcessIdPresenterModule processIdPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11548b + 27;
            f11549e = i3 % 128;
            int i4 = i3 % 2;
            Preconditions.checkNotNull(processIdPresenterModule);
            int i5 = f11549e + 77;
            f11548b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11549e + 17;
            f11548b = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11550d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                return this;
            }
            this.f11550d = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            throw null;
        }

        public final ProcessIdComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11550d, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b();
            int i3 = f11548b + 37;
            f11549e = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class b implements ProcessIdComponent {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11551c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11552d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f11553b = this;

        b() {
        }

        @Override // com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdComponent
        public final void inject(ProcessIdActivity processIdActivity) {
            int i2 = 2 % 2;
            int i3 = f11551c + 27;
            f11552d = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
