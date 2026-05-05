package com.incode.welcome_sdk.ui.video_conference;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoConferenceActivity_MembersInjector implements MembersInjector<VideoConferenceActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18081b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18082e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<VideoConferencePresenter> f18083a;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(VideoConferenceActivity videoConferenceActivity) {
        int i2 = 2 % 2;
        int i3 = f18081b + 43;
        f18082e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(videoConferenceActivity);
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
    }

    public VideoConferenceActivity_MembersInjector(Provider<VideoConferencePresenter> provider) {
        this.f18083a = provider;
    }

    public static MembersInjector<VideoConferenceActivity> create(Provider<VideoConferencePresenter> provider) {
        int i2 = 2 % 2;
        VideoConferenceActivity_MembersInjector videoConferenceActivity_MembersInjector = new VideoConferenceActivity_MembersInjector(provider);
        int i3 = f18082e + 25;
        f18081b = i3 % 128;
        int i4 = i3 % 2;
        return videoConferenceActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(VideoConferenceActivity videoConferenceActivity) {
        int i2 = 2 % 2;
        int i3 = f18082e + 95;
        f18081b = i3 % 128;
        int i4 = i3 % 2;
        injectMConferencePresenter(videoConferenceActivity, this.f18083a.get());
        int i5 = f18081b + 103;
        f18082e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void injectMConferencePresenter(VideoConferenceActivity videoConferenceActivity, VideoConferencePresenter videoConferencePresenter) {
        int i2 = 2 % 2;
        int i3 = f18082e + 53;
        f18081b = i3 % 128;
        if (i3 % 2 == 0) {
            videoConferenceActivity.f18072d = videoConferencePresenter;
            int i4 = f18082e + 69;
            f18081b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 62 / 0;
                return;
            }
            return;
        }
        videoConferenceActivity.f18072d = videoConferencePresenter;
        throw null;
    }
}
