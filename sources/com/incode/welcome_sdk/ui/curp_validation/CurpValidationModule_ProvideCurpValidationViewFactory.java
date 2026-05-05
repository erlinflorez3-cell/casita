package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class CurpValidationModule_ProvideCurpValidationViewFactory implements Factory<CurpValidationContract.View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13099c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13100e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CurpValidationModule f13101a;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f13099c + 77;
        f13100e = i3 % 128;
        if (i3 % 2 == 0) {
            get();
            throw null;
        }
        CurpValidationContract.View view = get();
        int i4 = f13100e + 5;
        f13099c = i4 % 128;
        if (i4 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public CurpValidationModule_ProvideCurpValidationViewFactory(CurpValidationModule curpValidationModule) {
        this.f13101a = curpValidationModule;
    }

    @Override // javax.inject.Provider
    public final CurpValidationContract.View get() {
        int i2 = 2 % 2;
        int i3 = f13099c + 1;
        f13100e = i3 % 128;
        int i4 = i3 % 2;
        CurpValidationModule curpValidationModule = this.f13101a;
        if (i4 != 0) {
            return provideCurpValidationView(curpValidationModule);
        }
        provideCurpValidationView(curpValidationModule);
        throw null;
    }

    public static CurpValidationModule_ProvideCurpValidationViewFactory create(CurpValidationModule curpValidationModule) {
        int i2 = 2 % 2;
        CurpValidationModule_ProvideCurpValidationViewFactory curpValidationModule_ProvideCurpValidationViewFactory = new CurpValidationModule_ProvideCurpValidationViewFactory(curpValidationModule);
        int i3 = f13100e + 121;
        f13099c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 36 / 0;
        }
        return curpValidationModule_ProvideCurpValidationViewFactory;
    }

    public static CurpValidationContract.View provideCurpValidationView(CurpValidationModule curpValidationModule) {
        int i2 = 2 % 2;
        int i3 = f13100e + 59;
        f13099c = i3 % 128;
        int i4 = i3 % 2;
        CurpValidationContract.View view = (CurpValidationContract.View) Preconditions.checkNotNullFromProvides(curpValidationModule.provideCurpValidationView());
        int i5 = f13100e + 51;
        f13099c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return view;
    }
}
