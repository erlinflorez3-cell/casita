package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: NestedScrollNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u0001\u0007\n\u0010\u0010J\f\u0004\u0013\u0015\u0007\u0007\u0017\b\u0018\u0016\u0014\u0015Wx\u0011 \"\u0014\u0014\u0004\u0015%#!\"\u0005'\u001d\u001f", f = "\u001b1>>.,\u001a)73/.\u000f/##j'/", i = {0, 0, 1}, l = {97, 98}, m = ">>!D8\u001aA?E?\u0006+2KJ\u000f,O", n = {"c^kY", "PlcO^WDS;", "_WtK`j2Y;\u001dU8JO,+\u0017"}, s = {"xQ^", "vQ^", "vQ^"})
final class NestedScrollNode$onPreFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollNode$onPreFling$1(NestedScrollNode nestedScrollNode, Continuation<? super NestedScrollNode$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.mo1093onPreFlingQWom1Mo(0L, this);
    }
}
