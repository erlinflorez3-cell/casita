package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory implements Factory<MachineLearningConsentContract.View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16435a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16436d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MachineLearningConsentPresenterModule f16437b;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f16435a + 45;
        f16436d = i3 % 128;
        int i4 = i3 % 2;
        MachineLearningConsentContract.View view = get();
        int i5 = f16436d + 11;
        f16435a = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        throw null;
    }

    public MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory(MachineLearningConsentPresenterModule machineLearningConsentPresenterModule) {
        this.f16437b = machineLearningConsentPresenterModule;
    }

    @Override // javax.inject.Provider
    public final MachineLearningConsentContract.View get() {
        int i2 = 2 % 2;
        int i3 = f16435a + 85;
        f16436d = i3 % 128;
        int i4 = i3 % 2;
        MachineLearningConsentContract.View viewProvideMachineLearningConsentView = provideMachineLearningConsentView(this.f16437b);
        int i5 = f16435a + 111;
        f16436d = i5 % 128;
        if (i5 % 2 != 0) {
            return viewProvideMachineLearningConsentView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory create(MachineLearningConsentPresenterModule machineLearningConsentPresenterModule) {
        int i2 = 2 % 2;
        MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory machineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory = new MachineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory(machineLearningConsentPresenterModule);
        int i3 = f16435a + 17;
        f16436d = i3 % 128;
        int i4 = i3 % 2;
        return machineLearningConsentPresenterModule_ProvideMachineLearningConsentViewFactory;
    }

    public static MachineLearningConsentContract.View provideMachineLearningConsentView(MachineLearningConsentPresenterModule machineLearningConsentPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f16436d + 5;
        f16435a = i3 % 128;
        int i4 = i3 % 2;
        MachineLearningConsentContract.View view = (MachineLearningConsentContract.View) Preconditions.checkNotNullFromProvides(machineLearningConsentPresenterModule.provideMachineLearningConsentView());
        if (i4 != 0) {
            int i5 = 36 / 0;
        }
        int i6 = f16435a + 35;
        f16436d = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
