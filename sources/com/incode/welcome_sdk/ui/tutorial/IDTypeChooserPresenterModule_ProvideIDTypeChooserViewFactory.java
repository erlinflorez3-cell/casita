package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory implements Factory<IDTypeChooserContract.View> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17764c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17765e = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IDTypeChooserPresenterModule f17766d;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17765e + 109;
        f17764c = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserContract.View view = get();
        int i5 = f17765e + 67;
        f17764c = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory(IDTypeChooserPresenterModule iDTypeChooserPresenterModule) {
        this.f17766d = iDTypeChooserPresenterModule;
    }

    @Override // javax.inject.Provider
    public final IDTypeChooserContract.View get() {
        int i2 = 2 % 2;
        int i3 = f17764c + 107;
        f17765e = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserPresenterModule iDTypeChooserPresenterModule = this.f17766d;
        if (i4 != 0) {
            return provideIDTypeChooserView(iDTypeChooserPresenterModule);
        }
        provideIDTypeChooserView(iDTypeChooserPresenterModule);
        throw null;
    }

    public static IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory create(IDTypeChooserPresenterModule iDTypeChooserPresenterModule) {
        int i2 = 2 % 2;
        IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory iDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory = new IDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory(iDTypeChooserPresenterModule);
        int i3 = f17765e + 91;
        f17764c = i3 % 128;
        if (i3 % 2 == 0) {
            return iDTypeChooserPresenterModule_ProvideIDTypeChooserViewFactory;
        }
        throw null;
    }

    public static IDTypeChooserContract.View provideIDTypeChooserView(IDTypeChooserPresenterModule iDTypeChooserPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f17764c + 45;
        f17765e = i3 % 128;
        int i4 = i3 % 2;
        IDTypeChooserContract.View view = (IDTypeChooserContract.View) Preconditions.checkNotNullFromProvides(iDTypeChooserPresenterModule.provideIDTypeChooserView());
        int i5 = f17765e + 87;
        f17764c = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }
}
