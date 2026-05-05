package com.incode.welcome_sdk.ui.camera.selfie;

import com.incode.welcome_sdk.ui.camera.selfie.SelfieContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class SelfiePresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12059a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f12060c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SelfieContract.View f12061e;

    public SelfiePresenterModule(SelfieContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f12061e = view;
    }

    @Provides
    public final SelfieContract.View provideSelfieView() {
        int i2 = 2 % 2;
        int i3 = f12060c + 37;
        f12059a = i3 % 128;
        int i4 = i3 % 2;
        SelfieContract.View view = this.f12061e;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        return view;
    }
}
