package com.incode.welcome_sdk.ui.name;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class NameActivity_MembersInjector implements MembersInjector<NameActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16467b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f16468c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<NamePresenter> f16469e;

    @Override // dagger.MembersInjector
    public final /* bridge */ /* synthetic */ void injectMembers(NameActivity nameActivity) {
        int i2 = 2 % 2;
        int i3 = f16467b + 53;
        f16468c = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(nameActivity);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f16467b + 89;
        f16468c = i5 % 128;
        int i6 = i5 % 2;
    }

    public NameActivity_MembersInjector(Provider<NamePresenter> provider) {
        this.f16469e = provider;
    }

    public static MembersInjector<NameActivity> create(Provider<NamePresenter> provider) {
        int i2 = 2 % 2;
        NameActivity_MembersInjector nameActivity_MembersInjector = new NameActivity_MembersInjector(provider);
        int i3 = f16467b + 85;
        f16468c = i3 % 128;
        if (i3 % 2 == 0) {
            return nameActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(NameActivity nameActivity) {
        int i2 = 2 % 2;
        int i3 = f16467b + 13;
        f16468c = i3 % 128;
        if (i3 % 2 == 0) {
            injectPresenter(nameActivity, this.f16469e.get());
        } else {
            injectPresenter(nameActivity, this.f16469e.get());
            throw null;
        }
    }

    public static void injectPresenter(NameActivity nameActivity, NamePresenter namePresenter) {
        int i2 = 2 % 2;
        int i3 = f16468c + 37;
        f16467b = i3 % 128;
        if (i3 % 2 != 0) {
            nameActivity.f16458c = namePresenter;
            int i4 = f16468c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16467b = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        nameActivity.f16458c = namePresenter;
        throw null;
    }
}
