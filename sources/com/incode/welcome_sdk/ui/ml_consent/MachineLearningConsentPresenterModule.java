package com.incode.welcome_sdk.ui.ml_consent;

import com.incode.welcome_sdk.ui.ml_consent.MachineLearningConsentContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class MachineLearningConsentPresenterModule {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16432d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f16433e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MachineLearningConsentContract.View f16434b;

    public MachineLearningConsentPresenterModule(MachineLearningConsentContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f16434b = view;
    }

    public final MachineLearningConsentContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f16433e + 125;
        int i4 = i3 % 128;
        f16432d = i4;
        int i5 = i3 % 2;
        MachineLearningConsentContract.View view = this.f16434b;
        int i6 = i4 + 17;
        f16433e = i6 % 128;
        int i7 = i6 % 2;
        return view;
    }

    @Provides
    public final MachineLearningConsentContract.View provideMachineLearningConsentView() {
        int i2 = 2 % 2;
        int i3 = f16433e;
        int i4 = i3 + 31;
        f16432d = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MachineLearningConsentContract.View view = this.f16434b;
        int i5 = i3 + 91;
        f16432d = i5 % 128;
        if (i5 % 2 == 0) {
            return view;
        }
        obj.hashCode();
        throw null;
    }
}
