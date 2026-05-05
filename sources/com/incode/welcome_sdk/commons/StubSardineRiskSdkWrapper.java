package com.incode.welcome_sdk.commons;

import io.reactivex.Completable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class StubSardineRiskSdkWrapper implements ISardineRiskSdkWrapper {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4622a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4623b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4624c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4625e = 1;

    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    public final Completable downloadConfigAndInitIfAvailable() {
        int i2 = 2 % 2;
        int i3 = f4624c + 71;
        f4625e = i3 % 128;
        if (i3 % 2 != 0) {
            Completable completableComplete = Completable.complete();
            Intrinsics.checkNotNullExpressionValue(completableComplete, "");
            return completableComplete;
        }
        Completable completableComplete2 = Completable.complete();
        Intrinsics.checkNotNullExpressionValue(completableComplete2, "");
        int i4 = 85 / 0;
        return completableComplete2;
    }

    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    public final void logScreenShown(String str) {
        int i2 = 2 % 2;
        int i3 = f4625e + 81;
        f4624c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = f4625e + 23;
        f4624c = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper
    public final Completable uploadEvents() {
        int i2 = 2 % 2;
        int i3 = f4625e + 61;
        f4624c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(Completable.complete(), "");
            throw null;
        }
        Completable completableComplete = Completable.complete();
        Intrinsics.checkNotNullExpressionValue(completableComplete, "");
        return completableComplete;
    }

    static {
        int i2 = 1 + 79;
        f4623b = i2 % 128;
        int i3 = i2 % 2;
    }
}
