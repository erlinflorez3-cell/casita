package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: DragGestureDetectorCopy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Tk\u001b\u000b\u0012r\u0012!#%#\u0017v\u0019)\u001b\u001a,(,}+-7\n4", f = "\u0011>,1\u0010-:::6(\u0006&4$!1+-|((0c (", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {145, 183}, m = "0G2;G\u001cDH@RHHO=I.NIOVHV8RVX8\\.M[QT\\]Sg]dd$_=>g@iC", n = {"^dRU[dVLH-R9G,$'\u0016\u001f'\u000b", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "cewIZINVF}O@", "cevG^FQZ?NO9E\u001d''!\u001e'J\u001b-", "^dRU[dVLH-R9G,$'\u0016\u001f'\u000b", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0015\u0013!'u\u001dY{\u0015es\u0003ngg_rTUo\u0018OFA\u0015\b\u0017/\u0010i\u001c-", "_ekTf[T\u000b?P", "ShcM7lGUJ}O@", "cewIZINVF}O@", "cevG^FQZ?NO9E\u001d''!\u001e'J\u001b-"}, s = {"xQ^", "xQ_", "xQ`", "rQ^", "rQ_", "xQ^", "xQ_", "xQ`", "xQa", "rQ^", "rQ_"})
final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(Continuation<? super DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return DragGestureDetectorCopyKt.m2911awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
