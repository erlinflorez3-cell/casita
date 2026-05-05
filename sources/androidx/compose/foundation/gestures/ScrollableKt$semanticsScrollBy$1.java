package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001a\u0010\u0012\u001d\u0017}(", f = " /=954((1)p-5", i = {0, 0}, l = {966}, m = "B5>3AH>9J+<LJHI X\rE\u000f\u0017IH\u001d0", n = {"\u0013jjOe\u001aULC;T>@=2\u0019\u0016)1\u0013\u001ex \n\fL\u000bfm\f4j'[f\u001d?", "_hg\\[eWZ,;R?<"}, s = {"xQ^", "xQ_"})
final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ScrollableKt$semanticsScrollBy$1(Continuation<? super ScrollableKt$semanticsScrollBy$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return ScrollableKt.m818semanticsScrollByd4ec7I(null, 0L, this);
    }
}
