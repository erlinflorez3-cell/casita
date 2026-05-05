package com.incode.welcome_sdk.ui.camera.id_validation.base;

import com.incode.welcome_sdk.ui.camera.CameraActivity_MembersInjector;
import com.incode.welcome_sdk.ui.camera.videostreaming.VideoStreamingManager;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseValidationActivity_MembersInjector implements MembersInjector<BaseValidationActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11756a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11757c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<VideoStreamingManager> f11758b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<BaseValidationPresenter> f11759e;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(BaseValidationActivity baseValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f11756a + 25;
        f11757c = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        injectMembers2(baseValidationActivity);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f11757c + 71;
        f11756a = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public BaseValidationActivity_MembersInjector(Provider<VideoStreamingManager> provider, Provider<BaseValidationPresenter> provider2) {
        this.f11758b = provider;
        this.f11759e = provider2;
    }

    public static MembersInjector<BaseValidationActivity> create(Provider<VideoStreamingManager> provider, Provider<BaseValidationPresenter> provider2) {
        int i2 = 2 % 2;
        BaseValidationActivity_MembersInjector baseValidationActivity_MembersInjector = new BaseValidationActivity_MembersInjector(provider, provider2);
        int i3 = f11756a + 99;
        f11757c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return baseValidationActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(BaseValidationActivity baseValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f11757c + 77;
        f11756a = i3 % 128;
        if (i3 % 2 != 0) {
            CameraActivity_MembersInjector.injectVideoStreamingManager(baseValidationActivity, this.f11758b.get());
            injectMBaseValidationPresenter(baseValidationActivity, this.f11759e.get());
        } else {
            CameraActivity_MembersInjector.injectVideoStreamingManager(baseValidationActivity, this.f11758b.get());
            injectMBaseValidationPresenter(baseValidationActivity, this.f11759e.get());
            throw null;
        }
    }

    public static void injectMBaseValidationPresenter(BaseValidationActivity baseValidationActivity, BaseValidationPresenter baseValidationPresenter) {
        int i2 = 2 % 2;
        int i3 = f11756a + 99;
        f11757c = i3 % 128;
        if (i3 % 2 != 0) {
            baseValidationActivity.f11735k = baseValidationPresenter;
            int i4 = 50 / 0;
        } else {
            baseValidationActivity.f11735k = baseValidationPresenter;
        }
    }
}
