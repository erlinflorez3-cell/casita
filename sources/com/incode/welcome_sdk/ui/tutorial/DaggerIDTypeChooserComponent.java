package com.incode.welcome_sdk.ui.tutorial;

import android.os.Process;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerIDTypeChooserComponent {

    /* JADX INFO: renamed from: b */
    private static int f17672b = 0;

    /* JADX INFO: renamed from: e */
    private static int f17673e = 1;

    private DaggerIDTypeChooserComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f17673e + 21;
        f17672b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f17674a = 1;

        /* JADX INFO: renamed from: c */
        private static int f17675c = 0;

        /* JADX INFO: renamed from: b */
        private IDTypeChooserPresenterModule f17676b;

        /* JADX INFO: renamed from: e */
        private IncodeWelcomeRepositoryComponent f17677e;

        Builder() {
        }

        public final Builder iDTypeChooserPresenterModule(IDTypeChooserPresenterModule iDTypeChooserPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f17675c + 77;
            f17674a = i3 % 128;
            if (i3 % 2 == 0) {
                this.f17676b = (IDTypeChooserPresenterModule) Preconditions.checkNotNull(iDTypeChooserPresenterModule);
                int i4 = 0 / 0;
            } else {
                this.f17676b = (IDTypeChooserPresenterModule) Preconditions.checkNotNull(iDTypeChooserPresenterModule);
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f17675c + 91;
            f17674a = i3 % 128;
            if (i3 % 2 != 0) {
                this.f17677e = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                return this;
            }
            this.f17677e = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IDTypeChooserComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f17676b, IDTypeChooserPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f17677e, IncodeWelcomeRepositoryComponent.class);
            d dVar = new d(this.f17676b, this.f17677e);
            int i3 = f17674a + 85;
            f17675c = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }
    }

    public static final class d implements IDTypeChooserComponent {

        /* JADX INFO: renamed from: a */
        public static int f17678a = 0;

        /* JADX INFO: renamed from: d */
        public static int f17679d = 0;

        /* JADX INFO: renamed from: g */
        private static int f17680g = 1;

        /* JADX INFO: renamed from: h */
        private static int f17681h = 0;

        /* JADX INFO: renamed from: b */
        private final IncodeWelcomeRepositoryComponent f17682b;

        /* JADX INFO: renamed from: c */
        private final d f17683c = this;

        /* JADX INFO: renamed from: e */
        private final IDTypeChooserPresenterModule f17684e;

        d(IDTypeChooserPresenterModule iDTypeChooserPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f17682b = incodeWelcomeRepositoryComponent;
            this.f17684e = iDTypeChooserPresenterModule;
        }

        private IDTypeChooserPresenter a() {
            int i2 = 2 % 2;
            IDTypeChooserPresenter iDTypeChooserPresenter = new IDTypeChooserPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f17682b.getIncodeRepository()), IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory.provideIDTypeChooserView(this.f17684e));
            int i3 = f17680g + 97;
            f17681h = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return iDTypeChooserPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.tutorial.IDTypeChooserComponent
        public final void inject(IDTypeChooserActivity iDTypeChooserActivity) {
            int i2 = 2 % 2;
            int i3 = f17680g + 63;
            f17681h = i3 % 128;
            int i4 = i3 % 2;
            b(iDTypeChooserActivity);
            int i5 = f17681h + 93;
            f17680g = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private IDTypeChooserActivity b(IDTypeChooserActivity iDTypeChooserActivity) {
            int i2 = 2 % 2;
            int i3 = f17680g + 49;
            f17681h = i3 % 128;
            if (i3 % 2 == 0) {
                IDTypeChooserActivity_MembersInjector.injectMPresenter(iDTypeChooserActivity, a());
                return iDTypeChooserActivity;
            }
            IDTypeChooserActivity_MembersInjector.injectMPresenter(iDTypeChooserActivity, a());
            throw null;
        }

        public static int b() {
            int i2 = f17678a;
            int i3 = i2 % 6432980;
            f17678a = i2 + 1;
            if (i3 != 0) {
                return f17679d;
            }
            int iMyTid = Process.myTid();
            f17679d = iMyTid;
            return iMyTid;
        }
    }
}
