package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.TutorialSelfieContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class TutorialSelfiePresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17904b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17905c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TutorialSelfieContract.View f17906d;

    public TutorialSelfiePresenterModule(TutorialSelfieContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f17906d = view;
    }

    public final TutorialSelfieContract.View getView() {
        int i2 = 2 % 2;
        int i3 = f17904b + 63;
        f17905c = i3 % 128;
        int i4 = i3 % 2;
        TutorialSelfieContract.View view = this.f17906d;
        if (i4 == 0) {
            int i5 = 82 / 0;
        }
        return view;
    }

    @Provides
    public final TutorialSelfieContract.View provideTutorialSelfieView() {
        TutorialSelfieContract.View view;
        int i2 = 2 % 2;
        int i3 = f17905c + 87;
        int i4 = i3 % 128;
        f17904b = i4;
        if (i3 % 2 != 0) {
            view = this.f17906d;
            int i5 = 61 / 0;
        } else {
            view = this.f17906d;
        }
        int i6 = i4 + 85;
        f17905c = i6 % 128;
        if (i6 % 2 != 0) {
            return view;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
