package com.incode.welcome_sdk.ui;

import androidx.lifecycle.ViewModel;
import com.incode.welcome_sdk.results.BaseResult;
import io.reactivex.subjects.Subject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10823a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10824c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StateFlow<Boolean> f10825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableStateFlow<Boolean> f10826e;

    public BaseViewModel() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f10826e = MutableStateFlow;
        this.f10825d = MutableStateFlow;
    }

    public final StateFlow<Boolean> getModuleResultProcessedState() {
        int i2 = 2 % 2;
        int i3 = f10824c;
        int i4 = i3 + 43;
        f10823a = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<Boolean> stateFlow = this.f10825d;
        int i6 = i3 + 35;
        f10823a = i6 % 128;
        if (i6 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final <R extends BaseResult> void publishResult(Subject<R> subject, R r2) {
        int i2 = 2 % 2;
        int i3 = f10824c + 35;
        f10823a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(subject, "");
        Intrinsics.checkNotNullParameter(r2, "");
        subject.onNext(r2);
        MutableStateFlow<Boolean> mutableStateFlow = this.f10826e;
        int i5 = f10823a + 105;
        f10824c = i5 % 128;
        int i6 = i5 % 2;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), Boolean.TRUE)) {
        }
    }
}
