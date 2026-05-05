package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^.\"13!36$&1+jylz", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {0, 0}, l = {718}, m = "4=:F", n = {"c^kY", "[WvKej+UFOZ="}, s = {"xQ^", "xQ_"})
final class AnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableKt.C07182.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt.C07182.AnonymousClass1<? super T> anonymousClass1, Continuation<? super AnchoredDraggableKt$restartable$2$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.emit(null, this);
    }
}
