package com.incode.welcome_sdk.ui.signature_form.base;

import com.incode.welcome_sdk.ui.signature_form.base.BaseSignatureFormContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory implements Factory<BaseSignatureFormContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17478a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17479e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseSignatureFormPresenterModule f17480b;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17479e + 33;
        f17478a = i3 % 128;
        int i4 = i3 % 2;
        BaseSignatureFormContract.View view = get();
        int i5 = f17478a + 85;
        f17479e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return view;
    }

    public BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory(BaseSignatureFormPresenterModule baseSignatureFormPresenterModule) {
        this.f17480b = baseSignatureFormPresenterModule;
    }

    @Override // javax.inject.Provider
    public final BaseSignatureFormContract.View get() {
        int i2 = 2 % 2;
        int i3 = f17478a + 27;
        f17479e = i3 % 128;
        int i4 = i3 % 2;
        BaseSignatureFormContract.View viewProvideSignatureFormView = provideSignatureFormView(this.f17480b);
        int i5 = f17478a + 121;
        f17479e = i5 % 128;
        if (i5 % 2 == 0) {
            return viewProvideSignatureFormView;
        }
        throw null;
    }

    public static BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory create(BaseSignatureFormPresenterModule baseSignatureFormPresenterModule) {
        int i2 = 2 % 2;
        BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory baseSignatureFormPresenterModule_ProvideSignatureFormViewFactory = new BaseSignatureFormPresenterModule_ProvideSignatureFormViewFactory(baseSignatureFormPresenterModule);
        int i3 = f17479e + 55;
        f17478a = i3 % 128;
        int i4 = i3 % 2;
        return baseSignatureFormPresenterModule_ProvideSignatureFormViewFactory;
    }

    public static BaseSignatureFormContract.View provideSignatureFormView(BaseSignatureFormPresenterModule baseSignatureFormPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f17478a + 79;
        f17479e = i3 % 128;
        int i4 = i3 % 2;
        BaseSignatureFormContract.View view = (BaseSignatureFormContract.View) Preconditions.checkNotNullFromProvides(baseSignatureFormPresenterModule.e());
        if (i4 == 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
