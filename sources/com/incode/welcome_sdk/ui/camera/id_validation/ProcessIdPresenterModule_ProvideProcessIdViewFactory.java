package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessIdPresenterModule_ProvideProcessIdViewFactory implements Factory<ProcessIdContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11599b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11600e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProcessIdPresenterModule f11601a;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f11599b + 43;
        f11600e = i3 % 128;
        int i4 = i3 % 2;
        ProcessIdContract.View view = get();
        if (i4 == 0) {
            int i5 = 27 / 0;
        }
        return view;
    }

    public ProcessIdPresenterModule_ProvideProcessIdViewFactory(ProcessIdPresenterModule processIdPresenterModule) {
        this.f11601a = processIdPresenterModule;
    }

    @Override // javax.inject.Provider
    public final ProcessIdContract.View get() {
        int i2 = 2 % 2;
        int i3 = f11599b + 61;
        f11600e = i3 % 128;
        int i4 = i3 % 2;
        ProcessIdContract.View viewProvideProcessIdView = provideProcessIdView(this.f11601a);
        if (i4 == 0) {
            int i5 = 74 / 0;
        }
        return viewProvideProcessIdView;
    }

    public static ProcessIdPresenterModule_ProvideProcessIdViewFactory create(ProcessIdPresenterModule processIdPresenterModule) {
        int i2 = 2 % 2;
        ProcessIdPresenterModule_ProvideProcessIdViewFactory processIdPresenterModule_ProvideProcessIdViewFactory = new ProcessIdPresenterModule_ProvideProcessIdViewFactory(processIdPresenterModule);
        int i3 = f11599b + 93;
        f11600e = i3 % 128;
        int i4 = i3 % 2;
        return processIdPresenterModule_ProvideProcessIdViewFactory;
    }

    public static ProcessIdContract.View provideProcessIdView(ProcessIdPresenterModule processIdPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f11599b + 101;
        f11600e = i3 % 128;
        int i4 = i3 % 2;
        ProcessIdContract.View view = (ProcessIdContract.View) Preconditions.checkNotNullFromProvides(processIdPresenterModule.provideProcessIdView());
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return view;
    }
}
