package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.ui.name.NameContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class NamePresenterModule_ProvideNameViewFactory implements Factory<NameContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16490a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16491d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NamePresenterModule f16492c;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f16491d + 75;
        f16490a = i3 % 128;
        if (i3 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public NamePresenterModule_ProvideNameViewFactory(NamePresenterModule namePresenterModule) {
        this.f16492c = namePresenterModule;
    }

    @Override // javax.inject.Provider
    public final NameContract.View get() {
        int i2 = 2 % 2;
        int i3 = f16490a + 113;
        f16491d = i3 % 128;
        int i4 = i3 % 2;
        NameContract.View viewProvideNameView = provideNameView(this.f16492c);
        int i5 = f16491d + 89;
        f16490a = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideNameView;
    }

    public static NamePresenterModule_ProvideNameViewFactory create(NamePresenterModule namePresenterModule) {
        int i2 = 2 % 2;
        NamePresenterModule_ProvideNameViewFactory namePresenterModule_ProvideNameViewFactory = new NamePresenterModule_ProvideNameViewFactory(namePresenterModule);
        int i3 = f16491d + 121;
        f16490a = i3 % 128;
        int i4 = i3 % 2;
        return namePresenterModule_ProvideNameViewFactory;
    }

    public static NameContract.View provideNameView(NamePresenterModule namePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f16491d + 49;
        f16490a = i3 % 128;
        int i4 = i3 % 2;
        NameContract.View view = (NameContract.View) Preconditions.checkNotNullFromProvides(namePresenterModule.provideNameView());
        if (i4 == 0) {
            int i5 = 5 / 0;
        }
        return view;
    }
}
