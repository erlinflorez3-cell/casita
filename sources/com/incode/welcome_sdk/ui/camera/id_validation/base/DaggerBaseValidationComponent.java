package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.CameraActivity_MembersInjector;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.internal.Preconditions;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerBaseValidationComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11802b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11803c = 1;

    private DaggerBaseValidationComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f11802b + 93;
        f11803c = i3 % 128;
        if (i3 % 2 != 0) {
            return builder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11804c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11805d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IncodeWelcomeRepositoryComponent f11806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BaseValidationPresenterModule f11807b;

        Builder() {
        }

        public final Builder baseValidationPresenterModule(BaseValidationPresenterModule baseValidationPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f11804c + 63;
            f11805d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11807b = (BaseValidationPresenterModule) Preconditions.checkNotNull(baseValidationPresenterModule);
                int i4 = 30 / 0;
            } else {
                this.f11807b = (BaseValidationPresenterModule) Preconditions.checkNotNull(baseValidationPresenterModule);
            }
            int i5 = f11804c + 117;
            f11805d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f11804c + 27;
            f11805d = i3 % 128;
            if (i3 % 2 == 0) {
                this.f11806a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 4 / 0;
            } else {
                this.f11806a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            return this;
        }

        public final BaseValidationComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f11807b, BaseValidationPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f11806a, IncodeWelcomeRepositoryComponent.class);
            e eVar = new e(this.f11807b, this.f11806a);
            int i3 = f11804c + 115;
            f11805d = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }
    }

    static final class e implements BaseValidationComponent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11808a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11809d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IncodeWelcomeRepositoryComponent f11810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f11811c = this;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final BaseValidationPresenterModule f11812e;

        e(BaseValidationPresenterModule baseValidationPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f11810b = incodeWelcomeRepositoryComponent;
            this.f11812e = baseValidationPresenterModule;
        }

        private BaseValidationPresenter b() {
            int i2 = 2 % 2;
            BaseValidationPresenter baseValidationPresenter = new BaseValidationPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f11810b.getIncodeRepository()), (PublishSubject) Preconditions.checkNotNullFromComponent(this.f11810b.getDownloadProgressBus()), (Observable) Preconditions.checkNotNullFromComponent(this.f11810b.getIdCaptureKitAndroidObservable()), BaseValidationPresenterModule_ProvideBaseValidationViewFactory.provideBaseValidationView(this.f11812e));
            int i3 = f11809d + 115;
            f11808a = i3 % 128;
            int i4 = i3 % 2;
            return baseValidationPresenter;
        }

        @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationComponent
        public final void inject(BaseValidationActivity baseValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f11809d + 33;
            f11808a = i3 % 128;
            int i4 = i3 % 2;
            b(baseValidationActivity);
            int i5 = f11808a + 1;
            f11809d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationComponent
        public final void inject(VideoStreamingManager videoStreamingManager) {
            int i2 = 2 % 2;
            int i3 = f11809d + 49;
            f11808a = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private BaseValidationActivity b(BaseValidationActivity baseValidationActivity) {
            int i2 = 2 % 2;
            int i3 = f11809d + 81;
            f11808a = i3 % 128;
            int i4 = i3 % 2;
            CameraActivity_MembersInjector.injectVideoStreamingManager(baseValidationActivity, (VideoStreamingManager) Preconditions.checkNotNullFromComponent(this.f11810b.videoStreamingManager()));
            BaseValidationActivity_MembersInjector.injectMBaseValidationPresenter(baseValidationActivity, b());
            int i5 = f11809d + 49;
            f11808a = i5 % 128;
            int i6 = i5 % 2;
            return baseValidationActivity;
        }
    }
}
