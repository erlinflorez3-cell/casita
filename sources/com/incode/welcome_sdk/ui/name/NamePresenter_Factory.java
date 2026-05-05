package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.name.NameContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class NamePresenter_Factory implements Factory<NamePresenter> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16493d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16494e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f16495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<NameContract.View> f16496c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f16494e + 37;
        f16493d = i3 % 128;
        int i4 = i3 % 2;
        NamePresenter namePresenter = get();
        int i5 = f16493d + 113;
        f16494e = i5 % 128;
        if (i5 % 2 != 0) {
            return namePresenter;
        }
        throw null;
    }

    public NamePresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<NameContract.View> provider2) {
        this.f16495b = provider;
        this.f16496c = provider2;
    }

    @Override // javax.inject.Provider
    public final NamePresenter get() {
        int i2 = 2 % 2;
        int i3 = f16493d + 53;
        f16494e = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f16495b.get();
        if (i4 != 0) {
            return newInstance(incodeWelcomeRepository, this.f16496c.get());
        }
        newInstance(incodeWelcomeRepository, this.f16496c.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static NamePresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<NameContract.View> provider2) {
        int i2 = 2 % 2;
        NamePresenter_Factory namePresenter_Factory = new NamePresenter_Factory(provider, provider2);
        int i3 = f16493d + 23;
        f16494e = i3 % 128;
        int i4 = i3 % 2;
        return namePresenter_Factory;
    }

    public static NamePresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, NameContract.View view) {
        int i2 = 2 % 2;
        NamePresenter namePresenter = new NamePresenter(incodeWelcomeRepository, view);
        int i3 = f16493d + 23;
        f16494e = i3 % 128;
        int i4 = i3 % 2;
        return namePresenter;
    }
}
