package com.dynatrace.agent.communication;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class ResponseProcessorImpl$obtainDisabledContext$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ResponseProcessorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResponseProcessorImpl$obtainDisabledContext$1(ResponseProcessorImpl responseProcessorImpl, Continuation<? super ResponseProcessorImpl$obtainDisabledContext$1> continuation) {
        super(continuation);
        this.this$0 = responseProcessorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.m7108obtainDisabledContextbz6L7rs(0L, null, null, null, null, this);
    }
}
