package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMa\u0010\u0007\u0016\u0014\u000f\u000bj\u0018\u0017\u001b\u001b \u0013\u0005\u0019\u0016)s\u0017\u0018\u001b*+\"\u001c$(&28\u0004&.(+&:,\u000b87;-A", f = "\u000e:/<81+\t41314%\u0015'\"3{\u001d\u001c\u001d*)\u001e\u0016\u001c\u001e\u001a$(q\u0012\u0018\u0010\u0011\n\u001c\fh\u0014\u0011\u0013\u0003\u0015M\u007f\f\u0001\u000e\n\u0003|E\u0002\n", i = {0, 0, 1, 1}, l = {2247, 2280}, m = "1?F@7G*F;9M?N!SCMT-QRT\t[PG[OWQNaT", n = {"c^kY", "bkdZd[G*>;T1<>\u0012+ \u00180\u001b\u001b\u001a\u001ax\u0006~\fuWzu", "c^kY", "bkdZd[G*>;T1<>\u0012+ \u00180\u001b\u001b\u001a\u001ax\u0006~\fuWzu"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Continuation<? super AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> continuation) {
        super(continuation);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.boundsUpdatesEventLoop$ui_release(this);
    }
}
