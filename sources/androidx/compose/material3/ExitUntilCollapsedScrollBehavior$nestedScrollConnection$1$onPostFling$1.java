package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKc\u0018\n\u0016w\u0012\u0019\u000f\u0013j\u0018\u0016\u0017\r\u001d!\u0014\u0014\u0004\u0015%#!\"x\u001d!\u001b1%,0b.&57))\u0019*:867\u000f<<=54F<CCy\b", f = "\u000e<;\f*:t19", i = {0, 0}, l = {2467, 2469}, m = ">>!AFH\u001bB@F@\u0007-6\u000fG 6:", n = {"c^kY", "PlcO^WDS;"}, s = {"xQ^", "vQ^"})
final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, Continuation<? super ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.mo819onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
