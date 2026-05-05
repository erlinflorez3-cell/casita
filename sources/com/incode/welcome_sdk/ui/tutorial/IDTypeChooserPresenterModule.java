package com.incode.welcome_sdk.ui.tutorial;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.tutorial.IDTypeChooserContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class IDTypeChooserPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17761a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17762e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IDTypeChooserContract.View f17763c;

    public IDTypeChooserPresenterModule(IDTypeChooserContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f17763c = view;
    }

    public final IDTypeChooserContract.View getMView() {
        int i2 = 2 % 2;
        int i3 = f17762e;
        int i4 = i3 + 1;
        f17761a = i4 % 128;
        int i5 = i4 % 2;
        IDTypeChooserContract.View view = this.f17763c;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f17761a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
        }
        return view;
    }

    @Provides
    public final IDTypeChooserContract.View provideIDTypeChooserView() {
        int i2 = 2 % 2;
        int i3 = f17762e + 75;
        int i4 = i3 % 128;
        f17761a = i4;
        int i5 = i3 % 2;
        IDTypeChooserContract.View view = this.f17763c;
        int i6 = i4 + 9;
        f17762e = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        throw null;
    }
}
