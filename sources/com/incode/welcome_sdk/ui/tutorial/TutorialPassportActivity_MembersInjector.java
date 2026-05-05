package com.incode.welcome_sdk.ui.tutorial;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialPassportActivity_MembersInjector implements MembersInjector<TutorialPassportActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17875b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17876d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<TutorialFrontPresenter> f17877e;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(TutorialPassportActivity tutorialPassportActivity) {
        int i2 = 2 % 2;
        int i3 = f17875b + 41;
        f17876d = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(tutorialPassportActivity);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f17876d + 37;
        f17875b = i5 % 128;
        int i6 = i5 % 2;
    }

    public TutorialPassportActivity_MembersInjector(Provider<TutorialFrontPresenter> provider) {
        this.f17877e = provider;
    }

    public static MembersInjector<TutorialPassportActivity> create(Provider<TutorialFrontPresenter> provider) {
        int i2 = 2 % 2;
        TutorialPassportActivity_MembersInjector tutorialPassportActivity_MembersInjector = new TutorialPassportActivity_MembersInjector(provider);
        int i3 = f17875b + 121;
        f17876d = i3 % 128;
        int i4 = i3 % 2;
        return tutorialPassportActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(TutorialPassportActivity tutorialPassportActivity) {
        int i2 = 2 % 2;
        int i3 = f17875b + 93;
        f17876d = i3 % 128;
        if (i3 % 2 == 0) {
            injectMPresenter(tutorialPassportActivity, this.f17877e.get());
            int i4 = f17875b + 59;
            f17876d = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        injectMPresenter(tutorialPassportActivity, this.f17877e.get());
        throw null;
    }

    public static void injectMPresenter(TutorialPassportActivity tutorialPassportActivity, TutorialFrontPresenter tutorialFrontPresenter) {
        int i2 = 2 % 2;
        int i3 = f17875b + 105;
        f17876d = i3 % 128;
        int i4 = i3 % 2;
        tutorialPassportActivity.f17856c = tutorialFrontPresenter;
        int i5 = f17876d + 117;
        f17875b = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
