package com.incode.welcome_sdk.ui.camera.selfie;

import com.incode.welcome_sdk.commons.RecogManager;
import com.incode.welcome_sdk.commons.c.c.b;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.selfie.SelfieContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfiePresenter_Factory implements Factory<SelfiePresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12065c = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f12066h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<SelfieContract.View> f12067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f12068b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<b> f12069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<RecogManager> f12070e;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f12066h + 5;
        f12065c = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            get();
            obj.hashCode();
            throw null;
        }
        SelfiePresenter selfiePresenter = get();
        int i4 = f12065c + 105;
        f12066h = i4 % 128;
        if (i4 % 2 != 0) {
            return selfiePresenter;
        }
        throw null;
    }

    public SelfiePresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<b> provider2, Provider<RecogManager> provider3, Provider<SelfieContract.View> provider4) {
        this.f12068b = provider;
        this.f12069d = provider2;
        this.f12070e = provider3;
        this.f12067a = provider4;
    }

    @Override // javax.inject.Provider
    public final SelfiePresenter get() {
        int i2 = 2 % 2;
        int i3 = f12065c + 45;
        f12066h = i3 % 128;
        int i4 = i3 % 2;
        SelfiePresenter selfiePresenterNewInstance = newInstance(this.f12068b.get(), this.f12069d.get(), this.f12070e.get(), this.f12067a.get());
        int i5 = f12065c + 59;
        f12066h = i5 % 128;
        if (i5 % 2 != 0) {
            return selfiePresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SelfiePresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<b> provider2, Provider<RecogManager> provider3, Provider<SelfieContract.View> provider4) {
        int i2 = 2 % 2;
        SelfiePresenter_Factory selfiePresenter_Factory = new SelfiePresenter_Factory(provider, provider2, provider3, provider4);
        int i3 = f12065c + 41;
        f12066h = i3 % 128;
        int i4 = i3 % 2;
        return selfiePresenter_Factory;
    }

    public static SelfiePresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, b bVar, RecogManager recogManager, SelfieContract.View view) {
        int i2 = 2 % 2;
        SelfiePresenter selfiePresenter = new SelfiePresenter(incodeWelcomeRepository, bVar, recogManager, view);
        int i3 = f12065c + 83;
        f12066h = i3 % 128;
        int i4 = i3 % 2;
        return selfiePresenter;
    }
}
