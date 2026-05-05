package com.incode.welcome_sdk.ui.id_info;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.id_info.IdInfoContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfoPresenter_Factory implements Factory<IdInfoPresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16362c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16363e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f16364a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<IdInfoContract.View> f16365d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f16363e + 29;
        f16362c = i3 % 128;
        int i4 = i3 % 2;
        IdInfoPresenter idInfoPresenter = get();
        int i5 = f16362c + 107;
        f16363e = i5 % 128;
        int i6 = i5 % 2;
        return idInfoPresenter;
    }

    public IdInfoPresenter_Factory(Provider<IdInfoContract.View> provider, Provider<IncodeWelcomeRepository> provider2) {
        this.f16365d = provider;
        this.f16364a = provider2;
    }

    @Override // javax.inject.Provider
    public final IdInfoPresenter get() {
        int i2 = 2 % 2;
        int i3 = f16362c + 45;
        f16363e = i3 % 128;
        int i4 = i3 % 2;
        IdInfoContract.View view = this.f16365d.get();
        if (i4 == 0) {
            return newInstance(view, this.f16364a.get());
        }
        int i5 = 20 / 0;
        return newInstance(view, this.f16364a.get());
    }

    public static IdInfoPresenter_Factory create(Provider<IdInfoContract.View> provider, Provider<IncodeWelcomeRepository> provider2) {
        int i2 = 2 % 2;
        IdInfoPresenter_Factory idInfoPresenter_Factory = new IdInfoPresenter_Factory(provider, provider2);
        int i3 = f16363e + 71;
        f16362c = i3 % 128;
        int i4 = i3 % 2;
        return idInfoPresenter_Factory;
    }

    public static IdInfoPresenter newInstance(IdInfoContract.View view, IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        IdInfoPresenter idInfoPresenter = new IdInfoPresenter(view, incodeWelcomeRepository);
        int i3 = f16362c + 23;
        f16363e = i3 % 128;
        int i4 = i3 % 2;
        return idInfoPresenter;
    }
}
