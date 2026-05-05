package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\f\n\u0006\b\u0016o\u001a", f = " 84..:t19", i = {0}, l = {1426}, m = "0G2;G'AEG\u0005\u0011P0J@@(", n = {"XdkZ[WN+;FZ+"}, s = {"xQ^"})
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SliderKt$awaitSlop$1(Continuation<? super SliderKt$awaitSlop$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return SliderKt.m2522awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
