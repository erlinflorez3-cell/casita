package androidx.compose.foundation.layout;

import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001b\u0012\u0019\u0019S}\u0011\u0017\u000e\u001a#u\u001c\"\u0015%%\u0001\u0019(*\u001c\u001c\f\u001d-+)*\u0002//0('9/66", f = "$59.8?\u001048)75\u0004/-,\"\u001f/#(&d\u0017#\u0018%!\u001a\u0014\\\u0019!", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {AviDirectory.TAG_DATETIME_ORIGINAL, IptcDirectory.TAG_CODED_CHARACTER_SET, 371}, m = "5<:@:\u0001=K0DL+ ", n = {"c^kY", "PlcO^WDS;", "UbkTY7OVKHZ", "c^kY", "Tdf<WbQJ?N_", "PlcO^WDS;", "c^kY", "PlcO^WDS;"}, s = {"xQ^", "vQ^", "rQ^", "xQ^", "xQ_", "vQ^", "xQ^", "vQ^"})
final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, Continuation<? super WindowInsetsNestedScrollConnection$fling$1> continuation) {
        super(continuation);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.m1091flinghuYlsQE(0L, 0.0f, false, this);
    }
}
