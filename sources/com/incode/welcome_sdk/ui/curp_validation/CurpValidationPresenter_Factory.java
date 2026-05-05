package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class CurpValidationPresenter_Factory implements Factory<CurpValidationPresenter> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13105c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13106d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<CurpValidationContract.View> f13107a;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f13105c + 103;
        f13106d = i3 % 128;
        int i4 = i3 % 2;
        CurpValidationPresenter curpValidationPresenter = get();
        int i5 = f13105c + 93;
        f13106d = i5 % 128;
        int i6 = i5 % 2;
        return curpValidationPresenter;
    }

    public CurpValidationPresenter_Factory(Provider<CurpValidationContract.View> provider) {
        this.f13107a = provider;
    }

    @Override // javax.inject.Provider
    public final CurpValidationPresenter get() {
        int i2 = 2 % 2;
        int i3 = f13106d + 59;
        f13105c = i3 % 128;
        int i4 = i3 % 2;
        CurpValidationContract.View view = this.f13107a.get();
        if (i4 != 0) {
            return newInstance(view);
        }
        newInstance(view);
        throw null;
    }

    public static CurpValidationPresenter_Factory create(Provider<CurpValidationContract.View> provider) {
        int i2 = 2 % 2;
        CurpValidationPresenter_Factory curpValidationPresenter_Factory = new CurpValidationPresenter_Factory(provider);
        int i3 = f13106d + 89;
        f13105c = i3 % 128;
        if (i3 % 2 != 0) {
            return curpValidationPresenter_Factory;
        }
        throw null;
    }

    public static CurpValidationPresenter newInstance(CurpValidationContract.View view) {
        int i2 = 2 % 2;
        CurpValidationPresenter curpValidationPresenter = new CurpValidationPresenter(view);
        int i3 = f13106d + 117;
        f13105c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return curpValidationPresenter;
    }
}
