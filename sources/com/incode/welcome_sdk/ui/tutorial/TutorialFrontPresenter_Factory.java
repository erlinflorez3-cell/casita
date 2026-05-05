package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialFrontPresenter_Factory implements Factory<TutorialFrontPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17849a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17850e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f17851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<TutorialContract.View> f17852c;

    @Override // javax.inject.Provider
    public final /* bridge */ /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17849a + 23;
        f17850e = i3 % 128;
        if (i3 % 2 != 0) {
            return get();
        }
        get();
        throw null;
    }

    public TutorialFrontPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<TutorialContract.View> provider2) {
        this.f17851b = provider;
        this.f17852c = provider2;
    }

    @Override // javax.inject.Provider
    public final TutorialFrontPresenter get() {
        int i2 = 2 % 2;
        int i3 = f17850e + 55;
        f17849a = i3 % 128;
        int i4 = i3 % 2;
        TutorialFrontPresenter tutorialFrontPresenterNewInstance = newInstance(this.f17851b.get(), this.f17852c.get());
        int i5 = f17849a + 49;
        f17850e = i5 % 128;
        int i6 = i5 % 2;
        return tutorialFrontPresenterNewInstance;
    }

    public static TutorialFrontPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<TutorialContract.View> provider2) {
        int i2 = 2 % 2;
        TutorialFrontPresenter_Factory tutorialFrontPresenter_Factory = new TutorialFrontPresenter_Factory(provider, provider2);
        int i3 = f17849a + 59;
        f17850e = i3 % 128;
        int i4 = i3 % 2;
        return tutorialFrontPresenter_Factory;
    }

    public static TutorialFrontPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, TutorialContract.View view) {
        int i2 = 2 % 2;
        TutorialFrontPresenter tutorialFrontPresenter = new TutorialFrontPresenter(incodeWelcomeRepository, view);
        int i3 = f17850e + 117;
        f17849a = i3 % 128;
        int i4 = i3 % 2;
        return tutorialFrontPresenter;
    }
}
