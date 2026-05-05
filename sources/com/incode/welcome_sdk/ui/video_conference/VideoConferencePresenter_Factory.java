package com.incode.welcome_sdk.ui.video_conference;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoConferencePresenter_Factory implements Factory<VideoConferencePresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f18145c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18146d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<VideoConferenceContract.View> f18147b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f18148e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f18146d + 115;
        f18145c = i3 % 128;
        if (i3 % 2 == 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VideoConferencePresenter videoConferencePresenter = get();
        int i4 = f18145c + 121;
        f18146d = i4 % 128;
        int i5 = i4 % 2;
        return videoConferencePresenter;
    }

    public VideoConferencePresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<VideoConferenceContract.View> provider2) {
        this.f18148e = provider;
        this.f18147b = provider2;
    }

    @Override // javax.inject.Provider
    public final VideoConferencePresenter get() {
        VideoConferencePresenter videoConferencePresenterNewInstance;
        int i2 = 2 % 2;
        int i3 = f18146d + 117;
        f18145c = i3 % 128;
        if (i3 % 2 == 0) {
            videoConferencePresenterNewInstance = newInstance(this.f18148e.get(), this.f18147b.get());
            int i4 = 20 / 0;
        } else {
            videoConferencePresenterNewInstance = newInstance(this.f18148e.get(), this.f18147b.get());
        }
        int i5 = f18145c + 91;
        f18146d = i5 % 128;
        if (i5 % 2 == 0) {
            return videoConferencePresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VideoConferencePresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<VideoConferenceContract.View> provider2) {
        int i2 = 2 % 2;
        VideoConferencePresenter_Factory videoConferencePresenter_Factory = new VideoConferencePresenter_Factory(provider, provider2);
        int i3 = f18145c + 101;
        f18146d = i3 % 128;
        if (i3 % 2 == 0) {
            return videoConferencePresenter_Factory;
        }
        throw null;
    }

    public static VideoConferencePresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, VideoConferenceContract.View view) {
        int i2 = 2 % 2;
        VideoConferencePresenter videoConferencePresenter = new VideoConferencePresenter(incodeWelcomeRepository, view);
        int i3 = f18146d + 9;
        f18145c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return videoConferencePresenter;
    }
}
