package com.dynatrace.agent.communication.preprocessing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class DispatchableDataProvider$loadEventData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DispatchableDataProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DispatchableDataProvider$loadEventData$1(DispatchableDataProvider dispatchableDataProvider, Continuation<? super DispatchableDataProvider$loadEventData$1> continuation) {
        super(continuation);
        this.this$0 = dispatchableDataProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.loadEventData$com_dynatrace_agent_release(null, null, this);
    }
}
