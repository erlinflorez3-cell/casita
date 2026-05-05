package com.incode.welcome_sdk.ui.curp_validation;

import com.incode.welcome_sdk.ui.curp_validation.CurpValidationContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class CurpValidationModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13096a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13097c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CurpValidationContract.View f13098e;

    public CurpValidationModule(CurpValidationContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f13098e = view;
    }

    @Provides
    public final CurpValidationContract.View provideCurpValidationView() {
        int i2 = 2 % 2;
        int i3 = f13097c + 109;
        f13096a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f13098e;
        }
        throw null;
    }
}
