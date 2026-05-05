package p;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class taste extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ misplace f28235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taste(misplace misplaceVar, Continuation continuation) {
        super(2, continuation);
        this.f28235a = misplaceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new taste(this.f28235a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new taste(this.f28235a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        misplace misplaceVar = this.f28235a;
        if (misplaceVar.f28216d) {
            int i2 = 0;
            for (float[] fArr : misplaceVar.f28214b) {
                int length = fArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (r8[i3] > 0.06d) {
                        i2++;
                        break;
                    }
                    i3++;
                }
            }
            boolValueOf = Boolean.valueOf(i2 > 2);
        } else {
            boolValueOf = null;
        }
        misplace misplaceVar2 = this.f28235a;
        if (misplaceVar2.f28219g) {
            int i4 = 0;
            for (float[] fArr2 : misplaceVar2.f28217e) {
                int length2 = fArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        break;
                    }
                    if (r8[i5] > 0.012d) {
                        i4++;
                        break;
                    }
                    i5++;
                }
            }
            boolValueOf2 = Boolean.valueOf(i4 > 2);
        } else {
            boolValueOf2 = null;
        }
        misplace misplaceVar3 = this.f28235a;
        return new j0.pair(boolValueOf, boolValueOf2, misplaceVar3.f28222j ? Boolean.valueOf(ArraysKt.average(misplaceVar3.f28220h) < 20.0d) : null, misplace.a(this.f28235a), null, null);
    }
}
