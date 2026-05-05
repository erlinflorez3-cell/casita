package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.ui.camera.id_validation.ProcessIdContract;
import dagger.Module;
import dagger.Provides;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Module
public final class ProcessIdPresenterModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11596a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11597e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProcessIdContract.View f11598b;

    public ProcessIdPresenterModule(ProcessIdContract.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.f11598b = view;
    }

    public final ProcessIdContract.View getMView() {
        int i2 = 2 % 2;
        int i3 = f11597e + 7;
        int i4 = i3 % 128;
        f11596a = i4;
        int i5 = i3 % 2;
        ProcessIdContract.View view = this.f11598b;
        int i6 = i4 + 121;
        f11597e = i6 % 128;
        if (i6 % 2 == 0) {
            return view;
        }
        throw null;
    }

    @Provides
    public final ProcessIdContract.View provideProcessIdView() {
        int i2 = 2 % 2;
        int i3 = f11596a + 109;
        f11597e = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f11598b;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
