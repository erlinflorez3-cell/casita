package com.incode.welcome_sdk.ui.tutorial;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialFrontActivity_MembersInjector implements MembersInjector<TutorialFrontActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17843a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17844c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<TutorialFrontPresenter> f17845d;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(TutorialFrontActivity tutorialFrontActivity) {
        int i2 = 2 % 2;
        int i3 = f17844c + 51;
        f17843a = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(tutorialFrontActivity);
        int i5 = f17843a + 81;
        f17844c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    public TutorialFrontActivity_MembersInjector(Provider<TutorialFrontPresenter> provider) {
        this.f17845d = provider;
    }

    public static MembersInjector<TutorialFrontActivity> create(Provider<TutorialFrontPresenter> provider) {
        int i2 = 2 % 2;
        TutorialFrontActivity_MembersInjector tutorialFrontActivity_MembersInjector = new TutorialFrontActivity_MembersInjector(provider);
        int i3 = f17843a + 45;
        f17844c = i3 % 128;
        int i4 = i3 % 2;
        return tutorialFrontActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(TutorialFrontActivity tutorialFrontActivity) {
        int i2 = 2 % 2;
        int i3 = f17844c + 121;
        f17843a = i3 % 128;
        int i4 = i3 % 2;
        injectMPresenter(tutorialFrontActivity, this.f17845d.get());
        int i5 = f17843a + 9;
        f17844c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void injectMPresenter(TutorialFrontActivity tutorialFrontActivity, TutorialFrontPresenter tutorialFrontPresenter) {
        int i2 = 2 % 2;
        int i3 = f17843a + 1;
        f17844c = i3 % 128;
        if (i3 % 2 == 0) {
            tutorialFrontActivity.f17823b = tutorialFrontPresenter;
            return;
        }
        tutorialFrontActivity.f17823b = tutorialFrontPresenter;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
