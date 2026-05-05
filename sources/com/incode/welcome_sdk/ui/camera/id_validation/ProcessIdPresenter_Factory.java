package com.incode.welcome_sdk.ui.camera.id_validation;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessIdPresenter_Factory implements Factory<ProcessIdPresenter> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11602b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11603e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f11604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<ProcessIdContract.View> f11605d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11602b + 9;
        f11603e = i3 % 128;
        if (i3 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public ProcessIdPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<ProcessIdContract.View> provider2) {
        this.f11604c = provider;
        this.f11605d = provider2;
    }

    @Override // javax.inject.Provider
    public final ProcessIdPresenter get() {
        int i2 = 2 % 2;
        int i3 = f11602b + 45;
        f11603e = i3 % 128;
        int i4 = i3 % 2;
        ProcessIdPresenter processIdPresenterNewInstance = newInstance(this.f11604c.get(), this.f11605d.get());
        int i5 = f11602b + 25;
        f11603e = i5 % 128;
        int i6 = i5 % 2;
        return processIdPresenterNewInstance;
    }

    public static ProcessIdPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<ProcessIdContract.View> provider2) {
        int i2 = 2 % 2;
        ProcessIdPresenter_Factory processIdPresenter_Factory = new ProcessIdPresenter_Factory(provider, provider2);
        int i3 = f11603e + 29;
        f11602b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return processIdPresenter_Factory;
    }

    public static ProcessIdPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, ProcessIdContract.View view) {
        int i2 = 2 % 2;
        ProcessIdPresenter processIdPresenter = new ProcessIdPresenter(incodeWelcomeRepository, view);
        int i3 = f11602b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f11603e = i3 % 128;
        int i4 = i3 % 2;
        return processIdPresenter;
    }
}
