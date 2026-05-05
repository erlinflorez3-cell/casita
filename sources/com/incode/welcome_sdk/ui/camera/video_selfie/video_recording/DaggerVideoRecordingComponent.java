package com.incode.welcome_sdk.ui.camera.video_selfie.video_recording;

import android.os.Process;
import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Preconditions;
import io.reactivex.Observable;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerVideoRecordingComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12440b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12441c = 0;

    private DaggerVideoRecordingComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f12441c + 37;
        f12440b = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f12442c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12443d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IncodeWelcomeRepositoryComponent f12444a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private VideoRecordingPresenterModule f12445e;

        Builder() {
        }

        public final Builder videoRecordingPresenterModule(VideoRecordingPresenterModule videoRecordingPresenterModule) {
            int i2 = 2 % 2;
            int i3 = f12443d + 115;
            f12442c = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12445e = (VideoRecordingPresenterModule) Preconditions.checkNotNull(videoRecordingPresenterModule);
                int i4 = 45 / 0;
            } else {
                this.f12445e = (VideoRecordingPresenterModule) Preconditions.checkNotNull(videoRecordingPresenterModule);
            }
            int i5 = f12443d + 29;
            f12442c = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 89 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f12443d + 55;
            f12442c = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12444a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
                int i4 = 32 / 0;
            } else {
                this.f12444a = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            }
            int i5 = f12443d + 99;
            f12442c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final VideoRecordingComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f12445e, VideoRecordingPresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f12444a, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b(this.f12445e, this.f12444a);
            int i3 = f12442c + 79;
            f12443d = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }
    }

    public static final class b implements VideoRecordingComponent {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f12446c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f12447e = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f12448h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f12449j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IncodeWelcomeRepositoryComponent f12450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final VideoRecordingPresenterModule f12451b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f12452d = this;

        b(VideoRecordingPresenterModule videoRecordingPresenterModule, IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            this.f12450a = incodeWelcomeRepositoryComponent;
            this.f12451b = videoRecordingPresenterModule;
        }

        private VideoRecordingPresenter e() {
            int i2 = 2 % 2;
            VideoRecordingPresenter videoRecordingPresenter = new VideoRecordingPresenter((IncodeWelcomeRepository) Preconditions.checkNotNullFromComponent(this.f12450a.getIncodeRepository()), (Observable) Preconditions.checkNotNullFromComponent(this.f12450a.getIdCaptureKitAndroidObservable()), (com.incode.welcome_sdk.commons.c.c.b) Preconditions.checkNotNullFromComponent(this.f12450a.getFaceDetector()), VideoRecordingPresenterModule_ProvidesVideoSelfieViewFactory.providesVideoSelfieView(this.f12451b), (RecogManager) Preconditions.checkNotNullFromComponent(this.f12450a.getRecogManager()));
            int i3 = f12448h + 63;
            f12449j = i3 % 128;
            if (i3 % 2 != 0) {
                return videoRecordingPresenter;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.incode.welcome_sdk.ui.camera.video_selfie.video_recording.VideoRecordingComponent
        public final void inject(VideoRecordingFragment videoRecordingFragment) {
            int i2 = 2 % 2;
            int i3 = f12448h + 79;
            f12449j = i3 % 128;
            int i4 = i3 % 2;
            d(videoRecordingFragment);
            int i5 = f12448h + 77;
            f12449j = i5 % 128;
            int i6 = i5 % 2;
        }

        private VideoRecordingFragment d(VideoRecordingFragment videoRecordingFragment) {
            int i2 = 2 % 2;
            int i3 = f12449j + 17;
            f12448h = i3 % 128;
            int i4 = i3 % 2;
            VideoRecordingFragment_MembersInjector.injectPresenter(videoRecordingFragment, e());
            int i5 = f12449j + 55;
            f12448h = i5 % 128;
            int i6 = i5 % 2;
            return videoRecordingFragment;
        }

        public static int d() {
            int i2 = f12447e;
            int i3 = i2 % 8066949;
            f12447e = i2 + 1;
            if (i3 != 0) {
                return f12446c;
            }
            int iMyPid = Process.myPid();
            f12446c = iMyPid;
            return iMyPid;
        }
    }
}
