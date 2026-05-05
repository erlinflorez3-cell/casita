package b0;

import j.misplace;
import j.slide;
import java.util.List;
import java.util.Set;
import k.skate;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public final class civilian extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ taste f139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public civilian(taste tasteVar, Continuation continuation) {
        super(2, continuation);
        this.f139b = tasteVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new civilian(this.f139b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new civilian(this.f139b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f138a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            slide slideVar = this.f139b.f142a;
            this.f138a = 1;
            obj = slideVar.f19796b.isEmpty() ? j.civilian.f19786a : BuildersKt.withContext(slideVar.f19800f, new misplace(slideVar, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List listA = ((j.tongue) obj).a(skate.f19823c);
        if (listA == null) {
            listA = CollectionsKt.emptyList();
        }
        e0.misplace misplaceVar = new e0.misplace(listA);
        taste tasteVar = this.f139b;
        r0.apparatus apparatusVar = tasteVar.f143b;
        String str = apparatusVar.f28261c;
        String str2 = apparatusVar.f28262d;
        String str3 = apparatusVar.f28263e;
        k0.pair pairVar = new k0.pair(str, str2, str3, apparatusVar.f28264f, apparatusVar.f28259a);
        Pair pair = tasteVar.f147f;
        if (pair != null) {
            CharSequence charSequence = (CharSequence) pair.component1();
            Set set = (Set) pair.component2();
            if (Intrinsics.areEqual(charSequence, str3) && listA.size() == set.size() && set.containsAll(listA)) {
                return Unit.INSTANCE;
            }
        }
        this.f139b.f147f = TuplesKt.to(str3, CollectionsKt.toSet(listA));
        this.f139b.f144c.a(pairVar, misplaceVar);
        return Unit.INSTANCE;
    }
}
