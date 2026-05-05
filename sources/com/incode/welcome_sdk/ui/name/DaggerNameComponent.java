package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerNameComponent {

    /* JADX INFO: renamed from: a */
    private static int f16442a = 1;

    /* JADX INFO: renamed from: c */
    private static int f16443c = 0;

    private DaggerNameComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f16442a + 89;
        f16443c = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: d */
        private static int f16444d = 1;

        /* JADX INFO: renamed from: e */
        private static int f16445e = 0;

        /* JADX INFO: renamed from: b */
        private NamePresenterModule f16446b;

        /* JADX INFO: renamed from: c */
        private IncodeWelcomeRepositoryComponent f16447c;

        Builder() {
        }

        public final Builder namePresenterModule(NamePresenterModule namePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f16444d + 57;
            f16445e = i3 % 128;
            int i4 = i3 % 2;
            this.f16446b = (NamePresenterModule) Preconditions.checkNotNull(namePresenterModule);
            int i5 = f16445e + 53;
            f16444d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f16445e + 125;
            f16444d = i3 % 128;
            int i4 = i3 % 2;
            this.f16447c = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f16444d + 39;
            f16445e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final NameComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f16446b, NamePresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f16447c, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f16446b, this.f16447c);
            int i3 = f16445e + 29;
            f16444d = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }
    }

    static final class e implements NameComponent {

        /* JADX INFO: renamed from: a */
        private static int f16448a = 1;

        /* JADX INFO: renamed from: c */
        private static int f16449c = 0;

        /* JADX INFO: renamed from: b */
        private final e f16450b = this;

        /* JADX INFO: renamed from: d */
        private final IncodeWelcomeRepositoryComponent f16451d;

        /* JADX INFO: renamed from: e */
        private final NamePresenterModule f16452e;

        e(NamePresenterModule namePresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f16451d = incodeWelcomeRepositoryComponent;
            this.f16452e = namePresenterModule;
        }

        private NamePresenter b() {
            int i2 = 2 % 2;
            NamePresenter namePresenter = new NamePresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f16451d.getIncodeRepository()), NamePresenterModule_ProvideNameViewFactory.provideNameView(this.f16452e));
            int i3 = f16449c + 69;
            f16448a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 8 / 0;
            }
            return namePresenter;
        }

        @Override // com.incode.welcome_sdk.ui.name.NameComponent
        public final void inject(NameActivity nameActivity) {
            int i2 = 2 % 2;
            int i3 = f16448a + 59;
            f16449c = i3 % 128;
            if (i3 % 2 != 0) {
                d(nameActivity);
                int i4 = 98 / 0;
            } else {
                d(nameActivity);
            }
            int i5 = f16448a + 39;
            f16449c = i5 % 128;
            int i6 = i5 % 2;
        }

        private NameActivity d(NameActivity nameActivity) {
            int i2 = 2 % 2;
            int i3 = f16449c + 73;
            f16448a = i3 % 128;
            int i4 = i3 % 2;
            NameActivity_MembersInjector.injectPresenter(nameActivity, b());
            int i5 = f16449c + 7;
            f16448a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return nameActivity;
        }
    }
}
