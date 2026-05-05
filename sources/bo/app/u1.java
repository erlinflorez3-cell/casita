package bo.app;

import com.braze.Braze;
import com.braze.enums.CardKey;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f1901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Braze braze, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f1901b = braze;
        this.f1902c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        u1 u1Var = new u1(this.f1901b, this.f1902c, continuation);
        u1Var.f1900a = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f1900a;
        if (!((ci0) this.f1901b.getUdm$android_sdk_base_release()).f389h.w()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) s1.f1719a, 6, (Object) null);
            return null;
        }
        if (this.f1902c == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) t1.f1800a, 6, (Object) null);
            return null;
        }
        kn knVar = ((ci0) this.f1901b.getUdm$android_sdk_base_release()).B;
        JSONObject cardJson = this.f1902c;
        knVar.getClass();
        Intrinsics.checkNotNullParameter(cardJson, "cardJson");
        return xl.a(cardJson, CardKey.Provider.CONTENT_CARDS, knVar.f1124b, knVar, knVar.f1133k);
    }
}
