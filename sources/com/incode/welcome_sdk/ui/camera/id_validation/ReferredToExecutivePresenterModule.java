package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.ui.camera.id_validation.ReferredToExecutiveContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class ReferredToExecutivePresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f11651b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f11652d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferredToExecutiveContract.View f11653a;

    public ReferredToExecutivePresenterModule(ReferredToExecutiveContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f11653a = view;
    }

    public final ReferredToExecutiveContract.View getMView() {
        ReferredToExecutiveContract.View view;
        int i2 = 2 % 2;
        int i3 = f11652d;
        int i4 = i3 + 53;
        f11651b = i4 % 128;
        if (i4 % 2 != 0) {
            view = this.f11653a;
            int i5 = 27 / 0;
        } else {
            view = this.f11653a;
        }
        int i6 = i3 + 75;
        f11651b = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    @Provides
    public final ReferredToExecutiveContract.View provideReferredToExecutiveView() {
        int i2 = 2 % 2;
        int i3 = f11651b + 83;
        int i4 = i3 % 128;
        f11652d = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        ReferredToExecutiveContract.View view = this.f11653a;
        int i5 = i4 + 29;
        f11651b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return view;
    }
}
