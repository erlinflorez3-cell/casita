package com.incode.welcome_sdk.ui.signature_form.base;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseSignatureFormActivity_MembersInjector implements MembersInjector<BaseSignatureFormActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17465a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17466c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<BaseSignatureFormPresenter> f17467e;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(BaseSignatureFormActivity baseSignatureFormActivity) {
        int i2 = 2 % 2;
        int i3 = f17466c + 79;
        f17465a = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(baseSignatureFormActivity);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseSignatureFormActivity_MembersInjector(Provider<BaseSignatureFormPresenter> provider) {
        this.f17467e = provider;
    }

    public static MembersInjector<BaseSignatureFormActivity> create(Provider<BaseSignatureFormPresenter> provider) {
        int i2 = 2 % 2;
        BaseSignatureFormActivity_MembersInjector baseSignatureFormActivity_MembersInjector = new BaseSignatureFormActivity_MembersInjector(provider);
        int i3 = f17466c + 7;
        f17465a = i3 % 128;
        if (i3 % 2 == 0) {
            return baseSignatureFormActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(BaseSignatureFormActivity baseSignatureFormActivity) {
        int i2 = 2 % 2;
        int i3 = f17466c + 17;
        f17465a = i3 % 128;
        int i4 = i3 % 2;
        injectMBaseSignatureFormPresenter(baseSignatureFormActivity, this.f17467e.get());
        int i5 = f17466c + 37;
        f17465a = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectMBaseSignatureFormPresenter(BaseSignatureFormActivity baseSignatureFormActivity, BaseSignatureFormPresenter baseSignatureFormPresenter) {
        int i2 = 2 % 2;
        int i3 = f17466c + 93;
        f17465a = i3 % 128;
        int i4 = i3 % 2;
        baseSignatureFormActivity.f17461e = baseSignatureFormPresenter;
        int i5 = f17465a + 43;
        f17466c = i5 % 128;
        int i6 = i5 % 2;
    }
}
