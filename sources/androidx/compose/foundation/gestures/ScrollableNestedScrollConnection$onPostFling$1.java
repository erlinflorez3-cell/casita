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
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001a\u0010\u0012\u001d\u0017\u0001\u0019(*\u001c\u001c\f\u001d-+)*\u0002//0('9/66", f = " /=954((1)p-5", i = {0}, l = {865}, m = ">>!AFH\u001bB@F@\u0007-6\u000fG 6:", n = {"PlcO^WDS;"}, s = {"vQ^"})
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, Continuation<? super ScrollableNestedScrollConnection$onPostFling$1> continuation) {
        super(continuation);
        this.this$0 = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.mo819onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
