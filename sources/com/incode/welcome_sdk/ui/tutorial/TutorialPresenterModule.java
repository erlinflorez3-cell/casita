package com.incode.welcome_sdk.ui.tutorial;

import com.incode.welcome_sdk.ui.tutorial.TutorialContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class TutorialPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17878a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f17879b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f17880d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17881e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TutorialContract.View f17882c;

    public TutorialPresenterModule(TutorialContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f17882c = view;
    }

    public final TutorialContract.View getMView() {
        int i2 = 2 % 2;
        int i3 = f17878a + 29;
        f17881e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f17882c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    public final TutorialContract.View provideTutorialPresenterView() {
        int i2 = 2 % 2;
        int i3 = f17881e;
        int i4 = i3 + 75;
        f17878a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        TutorialContract.View view = this.f17882c;
        int i5 = i3 + 63;
        f17878a = i5 % 128;
        if (i5 % 2 != 0) {
            return view;
        }
        throw null;
    }

    public static int b() {
        int i2 = f17880d;
        int i3 = i2 % 8211139;
        f17880d = i2 + 1;
        if (i3 != 0) {
            return f17879b;
        }
        int i4 = (int) Runtime.getRuntime().totalMemory();
        f17879b = i4;
        return i4;
    }
}
