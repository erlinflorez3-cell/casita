package com.incode.welcome_sdk.ui.custom_watchlist;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerCustomWatchlistComponent {

    /* JADX INFO: renamed from: b */
    private static int f13201b = 0;

    /* JADX INFO: renamed from: e */
    private static int f13202e = 1;

    private DaggerCustomWatchlistComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f13201b + 67;
        f13202e = i3 % 128;
        if (i3 % 2 != 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c */
        private static int f13203c = 0;

        /* JADX INFO: renamed from: d */
        private static int f13204d = 1;

        /* JADX INFO: renamed from: b */
        private IncodeWelcomeRepositoryComponent f13205b;

        /* JADX INFO: renamed from: e */
        private CustomWatchlistPresenterModule f13206e;

        Builder() {
        }

        public final Builder customWatchlistPresenterModule(CustomWatchlistPresenterModule customWatchlistPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f13204d + 73;
            f13203c = i3 % 128;
            if (i3 % 2 != 0) {
                this.f13206e = (CustomWatchlistPresenterModule) Preconditions.checkNotNull(customWatchlistPresenterModule);
                int i4 = 86 / 0;
            } else {
                this.f13206e = (CustomWatchlistPresenterModule) Preconditions.checkNotNull(customWatchlistPresenterModule);
            }
            int i5 = f13204d + 85;
            f13203c = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f13204d + 111;
            f13203c = i3 % 128;
            int i4 = i3 % 2;
            this.f13205b = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f13203c + 69;
            f13204d = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final CustomWatchlistComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f13206e, CustomWatchlistPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f13205b, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f13206e, this.f13205b);
            int i3 = f13203c + 87;
            f13204d = i3 % 128;
            if (i3 % 2 != 0) {
                return dVar;
            }
            throw null;
        }
    }

    static final class d implements CustomWatchlistComponent {

        /* JADX INFO: renamed from: b */
        private static int f13207b = 0;

        /* JADX INFO: renamed from: d */
        private static int f13208d = 1;

        /* JADX INFO: renamed from: a */
        private final IncodeWelcomeRepositoryComponent f13209a;

        /* JADX INFO: renamed from: c */
        private final d f13210c = this;

        /* JADX INFO: renamed from: e */
        private final CustomWatchlistPresenterModule f13211e;

        d(CustomWatchlistPresenterModule customWatchlistPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f13209a = incodeWelcomeRepositoryComponent;
            this.f13211e = customWatchlistPresenterModule;
        }

        private CustomWatchlistPresenter d() {
            int i2 = 2 % 2;
            CustomWatchlistPresenter customWatchlistPresenter = new CustomWatchlistPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f13209a.getIncodeRepository()), CustomWatchlistPresenterModule_ProvideCustomWatchlistViewFactory.provideCustomWatchlistView(this.f13211e));
            int i3 = f13208d + 51;
            f13207b = i3 % 128;
            int i4 = i3 % 2;
            return customWatchlistPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.custom_watchlist.CustomWatchlistComponent
        public final void inject(CustomWatchlistActivity customWatchlistActivity) {
            int i2 = 2 % 2;
            int i3 = f13208d + 67;
            f13207b = i3 % 128;
            if (i3 % 2 != 0) {
                d(customWatchlistActivity);
                int i4 = 61 / 0;
            } else {
                d(customWatchlistActivity);
            }
        }

        private CustomWatchlistActivity d(CustomWatchlistActivity customWatchlistActivity) {
            int i2 = 2 % 2;
            int i3 = f13208d + 103;
            f13207b = i3 % 128;
            int i4 = i3 % 2;
            CustomWatchlistActivity_MembersInjector.injectPresenter(customWatchlistActivity, d());
            int i5 = f13208d + 37;
            f13207b = i5 % 128;
            if (i5 % 2 == 0) {
                return customWatchlistActivity;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
