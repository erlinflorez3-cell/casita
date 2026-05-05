package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserPresenter_Factory implements Factory<IDTypeChooserPresenter> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17767b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17768e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<IDTypeChooserContract.View> f17769a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f17770c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17768e + 65;
        f17767b = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserPresenter iDTypeChooserPresenter = get();
        int i5 = f17767b + 29;
        f17768e = i5 % 128;
        int i6 = i5 % 2;
        return iDTypeChooserPresenter;
    }

    public IDTypeChooserPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<IDTypeChooserContract.View> provider2) {
        this.f17770c = provider;
        this.f17769a = provider2;
    }

    @Override // javax.inject.Provider
    public final IDTypeChooserPresenter get() {
        int i2 = 2 % 2;
        int i3 = f17767b + 25;
        f17768e = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserPresenter iDTypeChooserPresenterNewInstance = newInstance(this.f17770c.get(), this.f17769a.get());
        int i5 = f17768e + 75;
        f17767b = i5 % 128;
        int i6 = i5 % 2;
        return iDTypeChooserPresenterNewInstance;
    }

    public static IDTypeChooserPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<IDTypeChooserContract.View> provider2) {
        int i2 = 2 % 2;
        IDTypeChooserPresenter_Factory iDTypeChooserPresenter_Factory = new IDTypeChooserPresenter_Factory(provider, provider2);
        int i3 = f17768e + 39;
        f17767b = i3 % 128;
        int i4 = i3 % 2;
        return iDTypeChooserPresenter_Factory;
    }

    public static IDTypeChooserPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, IDTypeChooserContract.View view) {
        int i2 = 2 % 2;
        IDTypeChooserPresenter iDTypeChooserPresenter = new IDTypeChooserPresenter(incodeWelcomeRepository, view);
        int i3 = f17768e + 55;
        f17767b = i3 % 128;
        int i4 = i3 % 2;
        return iDTypeChooserPresenter;
    }
}
