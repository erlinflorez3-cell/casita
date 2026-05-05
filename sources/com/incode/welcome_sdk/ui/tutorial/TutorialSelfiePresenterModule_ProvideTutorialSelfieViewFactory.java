package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory implements Factory<TutorialSelfieContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17907b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17908d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TutorialSelfiePresenterModule f17909e;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        TutorialSelfieContract.View view;
        int i2 = 2 % 2;
        int i3 = f17908d + 53;
        f17907b = i3 % 128;
        if (i3 % 2 != 0) {
            view = get();
            int i4 = 18 / 0;
        } else {
            view = get();
        }
        int i5 = f17907b + 5;
        f17908d = i5 % 128;
        int i6 = i5 % 2;
        return view;
    }

    public TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory(TutorialSelfiePresenterModule tutorialSelfiePresenterModule) {
        this.f17909e = tutorialSelfiePresenterModule;
    }

    @Override // javax.inject.Provider
    public final TutorialSelfieContract.View get() {
        int i2 = 2 % 2;
        int i3 = f17908d + 121;
        f17907b = i3 % 128;
        int i4 = i3 % 2;
        TutorialSelfieContract.View viewProvideTutorialSelfieView = provideTutorialSelfieView(this.f17909e);
        int i5 = f17907b + 53;
        f17908d = i5 % 128;
        if (i5 % 2 != 0) {
            return viewProvideTutorialSelfieView;
        }
        throw null;
    }

    public static TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory create(TutorialSelfiePresenterModule tutorialSelfiePresenterModule) {
        int i2 = 2 % 2;
        TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory tutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory = new TutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory(tutorialSelfiePresenterModule);
        int i3 = f17908d + 37;
        f17907b = i3 % 128;
        int i4 = i3 % 2;
        return tutorialSelfiePresenterModule_ProvideTutorialSelfieViewFactory;
    }

    public static TutorialSelfieContract.View provideTutorialSelfieView(TutorialSelfiePresenterModule tutorialSelfiePresenterModule) {
        int i2 = 2 % 2;
        int i3 = f17908d + 63;
        f17907b = i3 % 128;
        int i4 = i3 % 2;
        TutorialSelfieContract.View view = (TutorialSelfieContract.View) Preconditions.checkNotNullFromProvides(tutorialSelfiePresenterModule.provideTutorialSelfieView());
        int i5 = f17907b + 21;
        f17908d = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }
}
