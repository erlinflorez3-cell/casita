package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfiePresenter_Factory implements Factory<TutorialSelfiePresenter> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17910d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17911e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<TutorialSelfieContract.View> f17912c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17910d + 89;
        f17911e = i3 % 128;
        int i4 = i3 % 2;
        TutorialSelfiePresenter tutorialSelfiePresenter = get();
        int i5 = f17911e + 29;
        f17910d = i5 % 128;
        int i6 = i5 % 2;
        return tutorialSelfiePresenter;
    }

    public TutorialSelfiePresenter_Factory(Provider<TutorialSelfieContract.View> provider) {
        this.f17912c = provider;
    }

    @Override // javax.inject.Provider
    public final TutorialSelfiePresenter get() {
        TutorialSelfiePresenter tutorialSelfiePresenterNewInstance;
        int i2 = 2 % 2;
        int i3 = f17910d + 89;
        f17911e = i3 % 128;
        if (i3 % 2 == 0) {
            tutorialSelfiePresenterNewInstance = newInstance(this.f17912c.get());
            int i4 = 22 / 0;
        } else {
            tutorialSelfiePresenterNewInstance = newInstance(this.f17912c.get());
        }
        int i5 = f17911e + 117;
        f17910d = i5 % 128;
        int i6 = i5 % 2;
        return tutorialSelfiePresenterNewInstance;
    }

    public static TutorialSelfiePresenter_Factory create(Provider<TutorialSelfieContract.View> provider) {
        int i2 = 2 % 2;
        TutorialSelfiePresenter_Factory tutorialSelfiePresenter_Factory = new TutorialSelfiePresenter_Factory(provider);
        int i3 = f17910d + 97;
        f17911e = i3 % 128;
        int i4 = i3 % 2;
        return tutorialSelfiePresenter_Factory;
    }

    public static TutorialSelfiePresenter newInstance(TutorialSelfieContract.View view) {
        int i2 = 2 % 2;
        TutorialSelfiePresenter tutorialSelfiePresenter = new TutorialSelfiePresenter(view);
        int i3 = f17911e + 109;
        f17910d = i3 % 128;
        int i4 = i3 % 2;
        return tutorialSelfiePresenter;
    }
}
