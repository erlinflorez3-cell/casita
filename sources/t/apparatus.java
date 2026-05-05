package t;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes2.dex */
public final class apparatus extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mutex f28290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public misplace f28291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0.pair f28292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0.civilian f28293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ misplace f28295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0.pair f28296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.civilian f28297h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apparatus(misplace misplaceVar, k0.pair pairVar, m0.civilian civilianVar, Continuation continuation) {
        super(2, continuation);
        this.f28295f = misplaceVar;
        this.f28296g = pairVar;
        this.f28297h = civilianVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new apparatus(this.f28295f, this.f28296g, this.f28297h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((apparatus) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        misplace misplaceVar;
        Mutex mutex;
        k0.pair pairVar;
        m0.civilian civilianVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f28294e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            misplaceVar = this.f28295f;
            mutex = misplaceVar.f28314d;
            pairVar = this.f28296g;
            civilianVar = this.f28297h;
            this.f28290a = mutex;
            this.f28291b = misplaceVar;
            this.f28292c = pairVar;
            this.f28293d = civilianVar;
            this.f28294e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            civilianVar = this.f28293d;
            pairVar = this.f28292c;
            misplaceVar = this.f28291b;
            mutex = this.f28290a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            HashMap map = misplaceVar.f28315e;
            String str = pairVar.f19829a;
            Object map2 = map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(str, map2);
            }
            Map map3 = (Map) map2;
            String str2 = pairVar.f19831c;
            Object tongueVar = map3.get(str2);
            if (tongueVar == null) {
                tongueVar = new tongue();
                map3.put(str2, tongueVar);
            }
            ((tongue) tongueVar).a(pairVar, civilianVar);
            Job job = misplaceVar.f28316f;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            misplaceVar.f28316f = BuildersKt__Builders_commonKt.launch$default(misplaceVar.f28313c, null, null, new taste(misplaceVar, null), 3, null);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
