package com.incode.welcome_sdk.ui.camera.video_selfie;

import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.components.IncodeWelcomeRepositoryComponent;
import dagger.internal.Preconditions;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class DaggerVideoSelfieComponent {

    /* JADX INFO: renamed from: d */
    private static int f12115d = 0;

    /* JADX INFO: renamed from: e */
    private static int f12116e = 1;

    private DaggerVideoSelfieComponent() {
    }

    public static Builder builder() {
        int i2 = 2 % 2;
        Builder builder = new Builder();
        int i3 = f12116e + 105;
        f12115d = i3 % 128;
        int i4 = i3 % 2;
        return builder;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f12117a = 0;

        /* JADX INFO: renamed from: b */
        public static int f12118b = 0;

        /* JADX INFO: renamed from: c */
        public static int f12119c = 0;

        /* JADX INFO: renamed from: h */
        private static int f12120h = 1;

        /* JADX INFO: renamed from: d */
        private VideoSelfiePresenterModule f12121d;

        /* JADX INFO: renamed from: e */
        private IncodeWelcomeRepositoryComponent f12122e;

        Builder() {
        }

        public final Builder videoSelfiePresenterModule(VideoSelfiePresenterModule videoSelfiePresenterModule) {
            int i2 = 2 % 2;
            int i3 = f12117a + 17;
            f12120h = i3 % 128;
            if (i3 % 2 == 0) {
                this.f12121d = (VideoSelfiePresenterModule) Preconditions.checkNotNull(videoSelfiePresenterModule);
                int i4 = 17 / 0;
            } else {
                this.f12121d = (VideoSelfiePresenterModule) Preconditions.checkNotNull(videoSelfiePresenterModule);
            }
            int i5 = f12120h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f12117a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 97 / 0;
            }
            return this;
        }

        public final Builder incodeWelcomeRepositoryComponent(IncodeWelcomeRepositoryComponent incodeWelcomeRepositoryComponent) {
            int i2 = 2 % 2;
            int i3 = f12120h + 113;
            f12117a = i3 % 128;
            int i4 = i3 % 2;
            this.f12122e = (IncodeWelcomeRepositoryComponent) Preconditions.checkNotNull(incodeWelcomeRepositoryComponent);
            int i5 = f12120h + 81;
            f12117a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final VideoSelfieComponent build() {
            int i2 = 2 % 2;
            Preconditions.checkBuilderRequirement(this.f12121d, VideoSelfiePresenterModule.class);
            Preconditions.checkBuilderRequirement(this.f12122e, IncodeWelcomeRepositoryComponent.class);
            b bVar = new b(this.f12121d);
            int i3 = f12120h + 75;
            f12117a = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        public static int a() {
            int i2 = f12118b;
            int i3 = i2 % 9834897;
            f12118b = i2 + 1;
            if (i3 != 0) {
                return f12119c;
            }
            int iNextInt = new Random().nextInt();
            f12119c = iNextInt;
            return iNextInt;
        }
    }

    public static final class b implements VideoSelfieComponent {

        /* JADX INFO: renamed from: b */
        public static int f12123b = 0;

        /* JADX INFO: renamed from: c */
        public static int f12124c = 0;

        /* JADX INFO: renamed from: d */
        private static int f12125d = 0;

        /* JADX INFO: renamed from: f */
        private static int f12126f = 1;

        /* JADX INFO: renamed from: a */
        private final b f12127a = this;

        /* JADX INFO: renamed from: e */
        private final VideoSelfiePresenterModule f12128e;

        b(VideoSelfiePresenterModule videoSelfiePresenterModule) {
            this.f12128e = videoSelfiePresenterModule;
        }

        private VideoSelfiePresenter c() {
            int i2 = 2 % 2;
            VideoSelfiePresenter videoSelfiePresenter = new VideoSelfiePresenter(VideoSelfiePresenterModule_ProvideVideoSelfieViewFactory.provideVideoSelfieView(this.f12128e));
            int i3 = f12125d + 93;
            f12126f = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
            }
            return videoSelfiePresenter;
        }

        @Override // com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieComponent
        public final void inject(VideoSelfieActivity videoSelfieActivity) {
            int i2 = 2 % 2;
            int i3 = f12125d + 123;
            f12126f = i3 % 128;
            int i4 = i3 % 2;
            e(videoSelfieActivity);
            int i5 = f12125d + 67;
            f12126f = i5 % 128;
            int i6 = i5 % 2;
        }

        private VideoSelfieActivity e(VideoSelfieActivity videoSelfieActivity) {
            int i2 = 2 % 2;
            int i3 = f12125d + 121;
            f12126f = i3 % 128;
            int i4 = i3 % 2;
            VideoSelfieActivity_MembersInjector.injectPresenter(videoSelfieActivity, c());
            int i5 = f12126f + 23;
            f12125d = i5 % 128;
            if (i5 % 2 == 0) {
                return videoSelfieActivity;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static int b() {
            int i2 = f12124c;
            int i3 = i2 % 6755836;
            f12124c = i2 + 1;
            if (i3 != 0) {
                return f12123b;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            f12123b = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }
}
