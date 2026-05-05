package com.dynatrace.agent.communication;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class ServerDataMaintainer$updateServerData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerDataMaintainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServerDataMaintainer$updateServerData$1(ServerDataMaintainer serverDataMaintainer, Continuation<? super ServerDataMaintainer$updateServerData$1> continuation) {
        super(continuation);
        this.this$0 = serverDataMaintainer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.updateServerData$com_dynatrace_agent_release(null, this);
    }
}
