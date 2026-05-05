package com.incode.welcome_sdk.ui.government_validation;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidationActivity_MembersInjector implements MembersInjector<GovernmentValidationActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14463b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14464e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<GovernmentValidationPresenter> f14465a;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(GovernmentValidationActivity governmentValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f14463b + 43;
        f14464e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(governmentValidationActivity);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f14464e + 79;
        f14463b = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
    }

    public GovernmentValidationActivity_MembersInjector(Provider<GovernmentValidationPresenter> provider) {
        this.f14465a = provider;
    }

    public static MembersInjector<GovernmentValidationActivity> create(Provider<GovernmentValidationPresenter> provider) {
        int i2 = 2 % 2;
        GovernmentValidationActivity_MembersInjector governmentValidationActivity_MembersInjector = new GovernmentValidationActivity_MembersInjector(provider);
        int i3 = f14463b + 39;
        f14464e = i3 % 128;
        int i4 = i3 % 2;
        return governmentValidationActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(GovernmentValidationActivity governmentValidationActivity) {
        int i2 = 2 % 2;
        int i3 = f14464e + 79;
        f14463b = i3 % 128;
        if (i3 % 2 != 0) {
            injectMPresenter(governmentValidationActivity, this.f14465a.get());
            int i4 = f14463b + 91;
            f14464e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
                return;
            }
            return;
        }
        injectMPresenter(governmentValidationActivity, this.f14465a.get());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void injectMPresenter(GovernmentValidationActivity governmentValidationActivity, GovernmentValidationPresenter governmentValidationPresenter) {
        int i2 = 2 % 2;
        int i3 = f14463b + 47;
        f14464e = i3 % 128;
        int i4 = i3 % 2;
        governmentValidationActivity.f14427c = governmentValidationPresenter;
        int i5 = f14464e + 87;
        f14463b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
