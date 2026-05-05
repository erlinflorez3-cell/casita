package com.incode.welcome_sdk.ui.name;

import com.incode.welcome_sdk.ui.name.NameContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class NamePresenterModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16487b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f16488d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final NameContract.View f16489e;

    public NamePresenterModule(NameContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f16489e = view;
    }

    @Provides
    public final NameContract.View provideNameView() {
        int i2 = 2 % 2;
        int i3 = f16488d;
        int i4 = i3 + 75;
        f16487b = i4 % 128;
        int i5 = i4 % 2;
        NameContract.View view = this.f16489e;
        int i6 = i3 + 121;
        f16487b = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        throw null;
    }
}
