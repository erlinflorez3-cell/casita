package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class cx extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ex f440c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f441d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(Function0 function0, ex exVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f439b = function0;
        this.f440c = exVar;
        this.f441d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        cx cxVar = new cx(this.f439b, this.f440c, this.f441d, continuation);
        cxVar.f438a = obj;
        return cxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cx) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f438a;
        try {
            this.f439b.invoke();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new bx(this.f441d), 4, (Object) null);
            this.f440c.a(e2);
        }
        return Unit.INSTANCE;
    }
}
