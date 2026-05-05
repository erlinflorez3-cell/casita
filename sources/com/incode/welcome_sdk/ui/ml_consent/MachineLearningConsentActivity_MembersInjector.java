package com.incode.welcome_sdk.ui.ml_consent;

import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsentActivity_MembersInjector implements MembersInjector<MachineLearningConsentActivity> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16409c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16410d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<MachineLearningConsentPresenter> f16411a;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(MachineLearningConsentActivity machineLearningConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f16409c + 113;
        f16410d = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(machineLearningConsentActivity);
        int i5 = f16409c + 29;
        f16410d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public MachineLearningConsentActivity_MembersInjector(Provider<MachineLearningConsentPresenter> provider) {
        this.f16411a = provider;
    }

    public static MembersInjector<MachineLearningConsentActivity> create(Provider<MachineLearningConsentPresenter> provider) {
        int i2 = 2 % 2;
        MachineLearningConsentActivity_MembersInjector machineLearningConsentActivity_MembersInjector = new MachineLearningConsentActivity_MembersInjector(provider);
        int i3 = f16409c + 57;
        f16410d = i3 % 128;
        int i4 = i3 % 2;
        return machineLearningConsentActivity_MembersInjector;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(MachineLearningConsentActivity machineLearningConsentActivity) {
        int i2 = 2 % 2;
        int i3 = f16410d + 93;
        f16409c = i3 % 128;
        if (i3 % 2 == 0) {
            injectPresenter(machineLearningConsentActivity, this.f16411a.get());
            int i4 = 64 / 0;
        } else {
            injectPresenter(machineLearningConsentActivity, this.f16411a.get());
        }
    }

    public static void injectPresenter(MachineLearningConsentActivity machineLearningConsentActivity, MachineLearningConsentPresenter machineLearningConsentPresenter) {
        int i2 = 2 % 2;
        int i3 = f16409c + 69;
        f16410d = i3 % 128;
        int i4 = i3 % 2;
        machineLearningConsentActivity.f16400d = machineLearningConsentPresenter;
        int i5 = f16409c + 121;
        f16410d = i5 % 128;
        int i6 = i5 % 2;
    }
}
