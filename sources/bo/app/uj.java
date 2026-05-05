package bo.app;

import androidx.autofill.HintConstants;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class uj extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gender f1953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj(BrazeUser brazeUser, Gender gender, Continuation continuation) {
        super(2, continuation);
        this.f1952a = brazeUser;
        this.f1953b = gender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new uj(this.f1952a, this.f1953b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new uj(this.f1952a, this.f1953b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1952a.userCache;
        Gender gender = this.f1953b;
        synchronized (uh0Var) {
            uh0Var.b(HintConstants.AUTOFILL_HINT_GENDER, gender != null ? gender.forJsonPut() : null);
        }
        return Unit.INSTANCE;
    }
}
