package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL`\u000f\u0006\u0015\u0013\u000e\nk\f\u0010\u000fo\u0012\u0013\u0013\u0012$\u007f(\u0018&(\u0019)'%&\u007f\"##\"4", f = "\u000e:/<81+\u0015;)55$2.*)i\u001c(\u001d*&\u001f\u0019a\u001e&", i = {1, 1}, l = {533, 559}, m = "0@A>L(D\u001cCAGA\b\u001e*06\u0014F3", n = {"c^kY", "a[oG[dKU=0K6F=(:,"}, s = {"xQ^", "vQ^"})
final class AndroidEdgeEffectOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEdgeEffectOverscrollEffect$applyToFling$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super AndroidEdgeEffectOverscrollEffect$applyToFling$1> continuation) {
        super(continuation);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.mo554applyToFlingBMRW4eQ(0L, null, this);
    }
}
