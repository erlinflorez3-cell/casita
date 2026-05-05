package bo.app;

import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qt extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f1624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f1625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt(BufferedReader bufferedReader, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.f1624c = bufferedReader;
        this.f1625d = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        qt qtVar = new qt(this.f1624c, this.f1625d, continuation);
        qtVar.f1623b = obj;
        return qtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qt) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x003c: INVOKE (r0 I:boolean) = (r2 I:kotlinx.coroutines.CoroutineScope) STATIC call: kotlinx.coroutines.CoroutineScopeKt.isActive(kotlinx.coroutines.CoroutineScope):boolean A[MD:(kotlinx.coroutines.CoroutineScope):boolean (m)], block:B:18:0x003c */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? IsActive;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f1622a;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f1623b;
                String line = this.f1624c.readLine();
                if (line == null) {
                    return Unit.INSTANCE;
                }
                ProducerScope producerScope = this.f1625d;
                this.f1623b = coroutineScope;
                this.f1622a = 1;
                if (producerScope.send(line, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e2) {
            if (CoroutineScopeKt.isActive(IsActive)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, fu.f686b, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) ot.f1460a, 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, fu.f686b, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pt(e2), 14, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
