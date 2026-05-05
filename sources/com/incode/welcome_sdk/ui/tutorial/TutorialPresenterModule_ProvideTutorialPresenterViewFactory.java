package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialPresenterModule_ProvideTutorialPresenterViewFactory implements Factory<TutorialContract.View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17883b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17884e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TutorialPresenterModule f17885c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17883b + 103;
        f17884e = i3 % 128;
        if (i3 % 2 != 0) {
            get();
            throw null;
        }
        TutorialContract.View view = get();
        int i4 = f17884e + 51;
        f17883b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return view;
    }

    public TutorialPresenterModule_ProvideTutorialPresenterViewFactory(TutorialPresenterModule tutorialPresenterModule) {
        this.f17885c = tutorialPresenterModule;
    }

    @Override // javax.inject.Provider
    public final TutorialContract.View get() {
        int i2 = 2 % 2;
        int i3 = f17884e + 91;
        f17883b = i3 % 128;
        int i4 = i3 % 2;
        TutorialContract.View viewProvideTutorialPresenterView = provideTutorialPresenterView(this.f17885c);
        int i5 = f17884e + 15;
        f17883b = i5 % 128;
        int i6 = i5 % 2;
        return viewProvideTutorialPresenterView;
    }

    public static TutorialPresenterModule_ProvideTutorialPresenterViewFactory create(TutorialPresenterModule tutorialPresenterModule) {
        int i2 = 2 % 2;
        TutorialPresenterModule_ProvideTutorialPresenterViewFactory tutorialPresenterModule_ProvideTutorialPresenterViewFactory = new TutorialPresenterModule_ProvideTutorialPresenterViewFactory(tutorialPresenterModule);
        int i3 = f17884e + 11;
        f17883b = i3 % 128;
        int i4 = i3 % 2;
        return tutorialPresenterModule_ProvideTutorialPresenterViewFactory;
    }

    public static TutorialContract.View provideTutorialPresenterView(TutorialPresenterModule tutorialPresenterModule) {
        int i2 = 2 % 2;
        int i3 = f17884e + 67;
        f17883b = i3 % 128;
        int i4 = i3 % 2;
        TutorialContract.View view = (TutorialContract.View) Preconditions.checkNotNullFromProvides(tutorialPresenterModule.provideTutorialPresenterView());
        int i5 = f17883b + 91;
        f17884e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return view;
    }
}
