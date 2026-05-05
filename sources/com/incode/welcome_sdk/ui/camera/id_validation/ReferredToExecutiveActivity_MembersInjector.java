package com.incode.welcome_sdk.ui.camera.id_validation;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferredToExecutiveActivity_MembersInjector implements MembersInjector<ReferredToExecutiveActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11621a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f11622c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<ReferredToExecutivePresenter> f11623b;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(ReferredToExecutiveActivity referredToExecutiveActivity) {
        int i2 = 2 % 2;
        int i3 = f11622c + 31;
        f11621a = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(referredToExecutiveActivity);
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        int i6 = f11621a + 23;
        f11622c = i6 % 128;
        int i7 = i6 % 2;
    }

    public ReferredToExecutiveActivity_MembersInjector(Provider<ReferredToExecutivePresenter> provider) {
        this.f11623b = provider;
    }

    public static MembersInjector<ReferredToExecutiveActivity> create(Provider<ReferredToExecutivePresenter> provider) {
        int i2 = 2 % 2;
        ReferredToExecutiveActivity_MembersInjector referredToExecutiveActivity_MembersInjector = new ReferredToExecutiveActivity_MembersInjector(provider);
        int i3 = f11621a + 35;
        f11622c = i3 % 128;
        if (i3 % 2 == 0) {
            return referredToExecutiveActivity_MembersInjector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(ReferredToExecutiveActivity referredToExecutiveActivity) {
        int i2 = 2 % 2;
        int i3 = f11622c + 57;
        f11621a = i3 % 128;
        int i4 = i3 % 2;
        injectMPresenter(referredToExecutiveActivity, this.f11623b.get());
        int i5 = f11622c + 39;
        f11621a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectMPresenter(ReferredToExecutiveActivity referredToExecutiveActivity, ReferredToExecutivePresenter referredToExecutivePresenter) {
        int i2 = 2 % 2;
        int i3 = f11622c + 7;
        f11621a = i3 % 128;
        if (i3 % 2 == 0) {
            referredToExecutiveActivity.f11611b = referredToExecutivePresenter;
            int i4 = 5 / 0;
        } else {
            referredToExecutiveActivity.f11611b = referredToExecutivePresenter;
        }
    }
}
