package com.incode.welcome_sdk.ui.tutorial;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class TutorialBackActivity_MembersInjector implements MembersInjector<TutorialBackActivity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17789a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17790e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<TutorialBackPresenter> f17791d;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(TutorialBackActivity tutorialBackActivity) {
        int i2 = 2 % 2;
        int i3 = f17789a + 75;
        f17790e = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(tutorialBackActivity);
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        int i6 = f17789a + 53;
        f17790e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 58 / 0;
        }
    }

    public TutorialBackActivity_MembersInjector(Provider<TutorialBackPresenter> provider) {
        this.f17791d = provider;
    }

    public static MembersInjector<TutorialBackActivity> create(Provider<TutorialBackPresenter> provider) {
        int i2 = 2 % 2;
        TutorialBackActivity_MembersInjector tutorialBackActivity_MembersInjector = new TutorialBackActivity_MembersInjector(provider);
        int i3 = f17790e + 99;
        f17789a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 15 / 0;
        }
        return tutorialBackActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(TutorialBackActivity tutorialBackActivity) {
        int i2 = 2 % 2;
        int i3 = f17789a + 13;
        f17790e = i3 % 128;
        if (i3 % 2 == 0) {
            injectMPresenter(tutorialBackActivity, this.f17791d.get());
        } else {
            injectMPresenter(tutorialBackActivity, this.f17791d.get());
            throw null;
        }
    }

    public static void injectMPresenter(TutorialBackActivity tutorialBackActivity, TutorialBackPresenter tutorialBackPresenter) {
        int i2 = 2 % 2;
        int i3 = f17789a + 99;
        f17790e = i3 % 128;
        if (i3 % 2 != 0) {
            tutorialBackActivity.f17773b = tutorialBackPresenter;
            int i4 = 85 / 0;
        } else {
            tutorialBackActivity.f17773b = tutorialBackPresenter;
        }
        int i5 = f17790e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17789a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
    }
}
