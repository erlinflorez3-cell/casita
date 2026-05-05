package bo.app;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class zs extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public fu f2429a;

    /* JADX INFO: renamed from: b */
    public CoroutineScope f2430b;

    /* JADX INFO: renamed from: c */
    public ReceiveChannel f2431c;

    /* JADX INFO: renamed from: d */
    public Function1 f2432d;

    /* JADX INFO: renamed from: e */
    public Ref.ObjectRef f2433e;

    /* JADX INFO: renamed from: f */
    public Ref.ObjectRef f2434f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2435g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ fu f2436h;

    /* JADX INFO: renamed from: i */
    public int f2437i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs(fu fuVar, Continuation continuation) {
        super(continuation);
        this.f2436h = fuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2435g = obj;
        int i2 = this.f2437i;
        this.f2437i = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
        return fu.a(this.f2436h, null, null, null, this);
    }
}
