package com.dynatrace.agent.communication.di;

import com.dynatrace.agent.common.time.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
/* synthetic */ class CommunicationModule$provideCommunicationManager$networkDataSource$1 extends FunctionReferenceImpl implements Function0<Long> {
    CommunicationModule$provideCommunicationManager$networkDataSource$1(Object obj) {
        super(0, obj, TimeProvider.class, "millisSinceEpoch", "millisSinceEpoch()J", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(((TimeProvider) this.receiver).millisSinceEpoch());
    }
}
