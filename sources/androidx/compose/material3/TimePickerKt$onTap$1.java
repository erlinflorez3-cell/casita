package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKr\t\u000e\u0007r\r\b\u0011\f\u001as\u001e", f = "!58/\u00191*1*6p-5", i = {0, 0, 1, 1}, l = {894, 897}, m = ">>%3C\u0001G%N;,\u001cJ", n = {"\u0013jjOe\u001aQU*;V)L\f#8\u0002.%ys&", "PkvUEmK[9B:9$C-;'\u001c", "\u0013jjOe\u001aQU*;V)L\f#8\u0002.%ys&", "PkvUEmK[9B:9$C-;'\u001c"}, s = {"xQ^", "\u0007Q^", "xQ^", "\u0007Q^"})
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    TimePickerKt$onTap$1(Continuation<? super TimePickerKt$onTap$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return TimePickerKt.m2749onTaprOwcSBo(null, 0.0f, 0.0f, 0.0f, false, 0L, this);
    }
}
