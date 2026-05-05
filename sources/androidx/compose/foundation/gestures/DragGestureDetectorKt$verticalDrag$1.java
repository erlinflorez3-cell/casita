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
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 0, 0, 0, 0}, l = {973}, m = "E5CF<76B\u001bJ:A\bF,\u0013\u0010T\u0019\u001a", n = {"^dFXS]", "\u0013jjOe\u001aFY7AE?\t>\u00154s\u00103W\u0019Z\u0010!", "^hkK`jC[?ITm@P", "\u0013jjOe\u001aC^7CZ\u000eI;&\u0015%\f2\u0006'h\u000b\u0015eOWvFN&oi\u001al\\", "_ekTf[T\u000b?P\n3M"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "xQb"})
final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$verticalDrag$1(Continuation<? super DragGestureDetectorKt$verticalDrag$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m763verticalDragjO51t88(null, 0L, null, this);
    }
}
