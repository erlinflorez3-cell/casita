package bo.app;

import com.braze.BrazeUser;
import com.braze.support.ValidationUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class qk extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f1610a = brazeUser;
        this.f1611b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new qk(this.f1610a, this.f1611b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new qk(this.f1610a, this.f1611b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1610a.userCache;
        String key = this.f1611b;
        synchronized (uh0Var) {
            Intrinsics.checkNotNullParameter(key, "key");
            uh0Var.a(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
        }
        return Unit.INSTANCE;
    }
}
