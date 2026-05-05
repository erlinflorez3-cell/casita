package bo.app;

import androidx.autofill.HintConstants;
import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class kk extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f1118a = brazeUser;
        this.f1119b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new kk(this.f1118a, this.f1119b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new kk(this.f1118a, this.f1119b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1118a.userCache;
        String str = this.f1119b;
        synchronized (uh0Var) {
            uh0Var.b(HintConstants.AUTOFILL_HINT_PHONE, str);
        }
        return Unit.INSTANCE;
    }
}
