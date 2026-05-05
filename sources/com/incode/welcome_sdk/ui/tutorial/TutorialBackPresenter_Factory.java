package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialBackPresenter_Factory implements Factory<TutorialBackPresenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17796a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17797e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<IncodeWelcomeRepository> f17798b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<TutorialContract.View> f17799d;

    @Override // javax.inject.Provider
    public final /* synthetic */ Object get() {
        int i2 = 2 % 2;
        int i3 = f17796a + 45;
        f17797e = i3 % 128;
        int i4 = i3 % 2;
        TutorialBackPresenter tutorialBackPresenter = get();
        int i5 = f17797e + 51;
        f17796a = i5 % 128;
        if (i5 % 2 == 0) {
            return tutorialBackPresenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TutorialBackPresenter_Factory(Provider<IncodeWelcomeRepository> provider, Provider<TutorialContract.View> provider2) {
        this.f17798b = provider;
        this.f17799d = provider2;
    }

    @Override // javax.inject.Provider
    public final TutorialBackPresenter get() {
        int i2 = 2 % 2;
        int i3 = f17796a + 29;
        f17797e = i3 % 128;
        int i4 = i3 % 2;
        TutorialBackPresenter tutorialBackPresenterNewInstance = newInstance(this.f17798b.get(), this.f17799d.get());
        int i5 = f17797e + 79;
        f17796a = i5 % 128;
        if (i5 % 2 == 0) {
            return tutorialBackPresenterNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TutorialBackPresenter_Factory create(Provider<IncodeWelcomeRepository> provider, Provider<TutorialContract.View> provider2) {
        int i2 = 2 % 2;
        TutorialBackPresenter_Factory tutorialBackPresenter_Factory = new TutorialBackPresenter_Factory(provider, provider2);
        int i3 = f17796a + 51;
        f17797e = i3 % 128;
        int i4 = i3 % 2;
        return tutorialBackPresenter_Factory;
    }

    public static TutorialBackPresenter newInstance(IncodeWelcomeRepository incodeWelcomeRepository, TutorialContract.View view) {
        int i2 = 2 % 2;
        TutorialBackPresenter tutorialBackPresenter = new TutorialBackPresenter(incodeWelcomeRepository, view);
        int i3 = f17796a + 57;
        f17797e = i3 % 128;
        if (i3 % 2 != 0) {
            return tutorialBackPresenter;
        }
        throw null;
    }
}
