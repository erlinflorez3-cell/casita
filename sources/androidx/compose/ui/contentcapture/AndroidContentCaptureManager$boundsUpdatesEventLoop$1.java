package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~Dz\b\b\u000f\u0001\u000b\u0012\u0002\u0001\u0011\u0016\u0018\u0016\nSg\u0016\r\u001c\u001a\u0015\u0011p\u001e\u001e%\u0017!(w\u0017',., \t\u001e, '&4", f = "\u000e:/<81+\t427'/4\u0002\u001f-00,\u001e\u0005\u0018$\u0016\u001b\u0018$^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b", i = {0, 1}, l = {186, 196}, m = "1?F@7G*F;9M?N!SCMT-QRT\t[PG[OWQNaT", n = {"c^kY", "c^kY"}, s = {"xQ^", "xQ^"})
final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, Continuation<? super AndroidContentCaptureManager$boundsUpdatesEventLoop$1> continuation) {
        super(continuation);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i2 = this.label;
        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return this.this$0.boundsUpdatesEventLoop$ui_release(this);
    }
}
