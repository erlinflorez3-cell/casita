package com.incode.welcome_sdk.ui.tutorial;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class IDTypeChooserActivity_MembersInjector implements MembersInjector<IDTypeChooserActivity> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17755b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17756c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<IDTypeChooserPresenter> f17757d;

    @Override // dagger.MembersInjector
    public final /* synthetic */ void injectMembers(IDTypeChooserActivity iDTypeChooserActivity) {
        int i2 = 2 % 2;
        int i3 = f17756c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17755b = i3 % 128;
        int i4 = i3 % 2;
        injectMembers2(iDTypeChooserActivity);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = f17756c + 19;
        f17755b = i5 % 128;
        int i6 = i5 % 2;
    }

    public IDTypeChooserActivity_MembersInjector(Provider<IDTypeChooserPresenter> provider) {
        this.f17757d = provider;
    }

    public static MembersInjector<IDTypeChooserActivity> create(Provider<IDTypeChooserPresenter> provider) {
        int i2 = 2 % 2;
        IDTypeChooserActivity_MembersInjector iDTypeChooserActivity_MembersInjector = new IDTypeChooserActivity_MembersInjector(provider);
        int i3 = f17756c + 61;
        f17755b = i3 % 128;
        if (i3 % 2 == 0) {
            return iDTypeChooserActivity_MembersInjector;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: injectMembers, reason: avoid collision after fix types in other method */
    public final void injectMembers2(IDTypeChooserActivity iDTypeChooserActivity) {
        int i2 = 2 % 2;
        int i3 = f17756c + 99;
        f17755b = i3 % 128;
        int i4 = i3 % 2;
        injectMPresenter(iDTypeChooserActivity, this.f17757d.get());
        int i5 = f17756c + 115;
        f17755b = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void injectMPresenter(IDTypeChooserActivity iDTypeChooserActivity, IDTypeChooserPresenter iDTypeChooserPresenter) {
        int i2 = 2 % 2;
        int i3 = f17756c + 41;
        f17755b = i3 % 128;
        int i4 = i3 % 2;
        iDTypeChooserActivity.f17736c = iDTypeChooserPresenter;
        int i5 = f17756c + 41;
        f17755b = i5 % 128;
        int i6 = i5 % 2;
    }
}
