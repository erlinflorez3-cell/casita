package com.incode.welcome_sdk.ui.camera.videostreaming;

import android.app.Application;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoStreamingManager_Factory implements Factory<VideoStreamingManager> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12814d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f12815e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<Application> f12816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f12817c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12815e + 17;
        f12814d = i3 % 128;
        int i4 = i3 % 2;
        VideoStreamingManager videoStreamingManager = get();
        int i5 = f12815e + 61;
        f12814d = i5 % 128;
        int i6 = i5 % 2;
        return videoStreamingManager;
    }

    public VideoStreamingManager_Factory(Provider<Application> provider, Provider<IncodeWelcomeRepository> provider2) {
        this.f12816b = provider;
        this.f12817c = provider2;
    }

    @Override // javax.inject.Provider
    public final VideoStreamingManager get() {
        int i2 = 2 % 2;
        int i3 = f12815e + 33;
        f12814d = i3 % 128;
        int i4 = i3 % 2;
        VideoStreamingManager videoStreamingManagerNewInstance = newInstance(this.f12816b.get(), this.f12817c.get());
        int i5 = f12814d + 7;
        f12815e = i5 % 128;
        int i6 = i5 % 2;
        return videoStreamingManagerNewInstance;
    }

    public static VideoStreamingManager_Factory create(Provider<Application> provider, Provider<IncodeWelcomeRepository> provider2) {
        int i2 = 2 % 2;
        VideoStreamingManager_Factory videoStreamingManager_Factory = new VideoStreamingManager_Factory(provider, provider2);
        int i3 = f12814d + 53;
        f12815e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
        return videoStreamingManager_Factory;
    }

    public static VideoStreamingManager newInstance(Application application, IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        VideoStreamingManager videoStreamingManager = new VideoStreamingManager(application, incodeWelcomeRepository);
        int i3 = f12814d + 109;
        f12815e = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return videoStreamingManager;
    }
}
