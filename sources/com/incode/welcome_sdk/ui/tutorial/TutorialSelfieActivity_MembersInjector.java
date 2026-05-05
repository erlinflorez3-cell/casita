package com.incode.welcome_sdk.ui.tutorial;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialSelfieActivity_MembersInjector implements MembersInjector<TutorialSelfieActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17898a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17899c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<TutorialSelfiePresenter> f17900d;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(TutorialSelfieActivity tutorialSelfieActivity) {
        int i2 = 2 % 2;
        int i3 = f17899c + 107;
        f17898a = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(tutorialSelfieActivity);
        int i5 = f17899c + 43;
        f17898a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public TutorialSelfieActivity_MembersInjector(Provider<TutorialSelfiePresenter> provider) {
        this.f17900d = provider;
    }

    public static MembersInjector<TutorialSelfieActivity> create(Provider<TutorialSelfiePresenter> provider) {
        int i2 = 2 % 2;
        TutorialSelfieActivity_MembersInjector tutorialSelfieActivity_MembersInjector = new TutorialSelfieActivity_MembersInjector(provider);
        int i3 = f17898a + 33;
        f17899c = i3 % 128;
        if (i3 % 2 == 0) {
            return tutorialSelfieActivity_MembersInjector;
        }
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(TutorialSelfieActivity tutorialSelfieActivity) {
        int i2 = 2 % 2;
        int i3 = f17898a + 65;
        f17899c = i3 % 128;
        if (i3 % 2 == 0) {
            injectPresenter(tutorialSelfieActivity, this.f17900d.get());
            int i4 = f17898a + 107;
            f17899c = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        injectPresenter(tutorialSelfieActivity, this.f17900d.get());
        throw null;
    }

    public static void injectPresenter(TutorialSelfieActivity tutorialSelfieActivity, TutorialSelfiePresenter tutorialSelfiePresenter) {
        int i2 = 2 % 2;
        int i3 = f17898a + 39;
        f17899c = i3 % 128;
        if (i3 % 2 == 0) {
            tutorialSelfieActivity.f17888b = tutorialSelfiePresenter;
            int i4 = f17899c + 73;
            f17898a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        tutorialSelfieActivity.f17888b = tutorialSelfiePresenter;
        throw null;
    }
}
