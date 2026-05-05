package com.incode.welcome_sdk.ui.government_validation;

import com.incode.welcome_sdk.ui.government_validation.GovernmentValidationContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class GovernmentValidationPresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f14482b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f14483e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GovernmentValidationContract.View f14484d;

    public GovernmentValidationPresenterModule(GovernmentValidationContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f14484d = view;
    }

    @Provides
    public final GovernmentValidationContract.View provideLoginView() {
        int i2 = 2 % 2;
        int i3 = f14483e + 13;
        f14482b = i3 % 128;
        int i4 = i3 % 2;
        GovernmentValidationContract.View view = this.f14484d;
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        return view;
    }
}
