package j;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class misplace extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ slide f19790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public misplace(slide slideVar, Continuation continuation) {
        super(2, continuation);
        this.f19790a = slideVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new misplace(this.f19790a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new misplace(this.f19790a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Iterable iterable = (Iterable) this.f19790a.f19799e.invoke();
        slide slideVar = this.f19790a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (!Intrinsics.areEqual((String) obj2, slideVar.f19798d)) {
                arrayList.add(obj2);
            }
        }
        skate skateVar = this.f19790a.f19797c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            e0.pair pairVarA = skateVar.a((String) obj3);
            if (pairVarA != null) {
                arrayList2.add(pairVarA);
            }
        }
        return new taste(this.f19790a, arrayList2);
    }
}
