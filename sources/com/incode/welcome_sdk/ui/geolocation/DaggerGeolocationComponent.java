package com.incode.welcome_sdk.ui.geolocation;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerGeolocationComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f14231a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f14232d = 1;

    private DaggerGeolocationComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f14231a + 21;
        f14232d = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14233c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14234d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IncodeWelcomeRepositoryComponent f14235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private GeolocationPresenterModule f14236b;

        Builder() {
        }

        public final Builder geolocationPresenterModule(GeolocationPresenterModule geolocationPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f14234d + 55;
            f14233c = i3 % 128;
            int i4 = i3 % 2;
            this.f14236b = (GeolocationPresenterModule) Preconditions.checkNotNull(geolocationPresenterModule);
            int i5 = f14234d + 61;
            f14233c = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f14234d + 107;
            f14233c = i3 % 128;
            if (i3 % 2 == 0) {
                this.f14235a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                return this;
            }
            this.f14235a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final GeolocationComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f14236b, GeolocationPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f14235a, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f14236b, this.f14235a);
            int i3 = f14233c + 59;
            f14234d = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }
    }

    static final class d implements GeolocationComponent {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14237c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14238d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GeolocationPresenterModule f14239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IncodeWelcomeRepositoryComponent f14240b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final d f14241e = this;

        d(GeolocationPresenterModule geolocationPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f14240b = incodeWelcomeRepositoryComponent;
            this.f14239a = geolocationPresenterModule;
        }

        private GeolocationPresenter b() {
            int i2 = 2 % 2;
            GeolocationPresenter geolocationPresenter = new GeolocationPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f14240b.getIncodeRepository()), GeolocationPresenterModule_ProvideGeolocationViewFactory.provideGeolocationView(this.f14239a));
            int i3 = f14237c + 97;
            f14238d = i3 % 128;
            if (i3 % 2 != 0) {
                return geolocationPresenter;
            }
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.geolocation.GeolocationComponent
        public final void inject(GeolocationActivity geolocationActivity) {
            int i2 = 2 % 2;
            int i3 = f14238d + 33;
            f14237c = i3 % 128;
            int i4 = i3 % 2;
            c(geolocationActivity);
            int i5 = f14237c + 65;
            f14238d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        private GeolocationActivity c(GeolocationActivity geolocationActivity) {
            int i2 = 2 % 2;
            int i3 = f14237c + 25;
            f14238d = i3 % 128;
            int i4 = i3 % 2;
            GeolocationActivity_MembersInjector.injectMPresenter(geolocationActivity, b());
            int i5 = f14237c + 27;
            f14238d = i5 % 128;
            int i6 = i5 % 2;
            return geolocationActivity;
        }
    }
}
