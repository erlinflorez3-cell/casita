package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: DragGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {972, 1014}, m = "0G2;G(DK:@,FJL,P\"AOEHPQG[QXX\u0018V<# d)*", n = {"^dVUgYJ:BIV\u001c<;\".\u0018\u001b", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "cewIZINVF\u001eK><=35%Z+\u001d", "cewIZINVF}O@", "^dVUgYJ:BIV\u001c<;\".\u0018\u001b", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "cewIZINVF\u001eK><=35%Z+\u001d", "ShcM7lGUJ}O@", "cewIZINVF}O@"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "rQ^", "xQ^", "xQ_", "xQ`", "xQa", "xQb", "rQ^"})
final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitTouchSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return DragGestureDetectorKt.m753awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}
