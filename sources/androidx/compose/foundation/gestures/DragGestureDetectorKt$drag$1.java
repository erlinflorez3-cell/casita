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
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u001c\f\u0013s\u0013\"$&$\u0018w\u001a*\u001c\u001b-)-\u00071", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-g$,", i = {0, 0}, l = {108}, m = "3B29\u007f>$\u000b\bL\u0011\u0012", n = {"\u0013jjOe\u001aFY7AE?\t>)\u0015gg6^i", "^dFXS]"}, s = {"xQ^", "xQ_"})
final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$drag$1(Continuation<? super DragGestureDetectorKt$drag$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return DragGestureDetectorKt.m759dragjO51t88(null, 0L, null, this);
    }
}
