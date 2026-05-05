package com.incode.welcome_sdk.commons;

import com.incode.welcome_sdk.ScreenName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5315a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5316d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StateFlow<ScreenName> f5317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableStateFlow<ScreenName> f5318c;

    public n() {
        MutableStateFlow<ScreenName> MutableStateFlow = StateFlowKt.MutableStateFlow(ScreenName.UNUSED);
        this.f5318c = MutableStateFlow;
        this.f5317b = MutableStateFlow;
    }

    public final StateFlow<ScreenName> b() {
        int i2 = 2 % 2;
        int i3 = f5315a + 1;
        int i4 = i3 % 128;
        f5316d = i4;
        int i5 = i3 % 2;
        StateFlow<ScreenName> stateFlow = this.f5317b;
        int i6 = i4 + 45;
        f5315a = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    public final void e(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f5315a + 31;
        f5316d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        MutableStateFlow<ScreenName> mutableStateFlow = this.f5318c;
        int i5 = f5316d + 123;
        f5315a = i5 % 128;
        int i6 = i5 % 2;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), screenName)) {
        }
    }
}
