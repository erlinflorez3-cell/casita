package com.incode.welcome_sdk.ui.curp_validation;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class CurpValidationActivity_MembersInjector implements MembersInjector<CurpValidationActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13093a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13094c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<CurpValidationPresenter> f13095e;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(CurpValidationActivity curpValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f13093a + 101;
        f13094c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(curpValidationActivity);
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f13093a + 19;
        f13094c = i5 % 128;
        int i6 = i5 % 2;
    }

    public CurpValidationActivity_MembersInjector(Provider<CurpValidationPresenter> provider) {
        this.f13095e = provider;
    }

    public static MembersInjector<CurpValidationActivity> create(Provider<CurpValidationPresenter> provider) {
        int i2 = 2 % 2;
        CurpValidationActivity_MembersInjector curpValidationActivity_MembersInjector = new CurpValidationActivity_MembersInjector(provider);
        int i3 = f13094c + 33;
        f13093a = i3 % 128;
        if (i3 % 2 == 0) {
            return curpValidationActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(CurpValidationActivity curpValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f13093a + 79;
        f13094c = i3 % 128;
        int i4 = i3 % 2;
        injectPresenter(curpValidationActivity, this.f13095e.get());
        int i5 = f13093a + 75;
        f13094c = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectPresenter(CurpValidationActivity curpValidationActivity, CurpValidationPresenter curpValidationPresenter) {
        int i2 = 2 % 2;
        int i3 = f13093a + 99;
        f13094c = i3 % 128;
        int i4 = i3 % 2;
        curpValidationActivity.f13090c = curpValidationPresenter;
        int i5 = f13093a + 3;
        f13094c = i5 % 128;
        int i6 = i5 % 2;
    }
}
