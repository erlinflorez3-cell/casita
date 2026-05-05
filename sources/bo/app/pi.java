package bo.app;

import com.braze.BrazeUser;
import com.braze.models.outgoing.AttributionData;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pi extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f1518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttributionData f1519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(BrazeUser brazeUser, AttributionData attributionData, Continuation continuation) {
        super(2, continuation);
        this.f1518a = brazeUser;
        this.f1519b = attributionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pi(this.f1518a, this.f1519b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pi(this.f1518a, this.f1519b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        uh0 uh0Var = this.f1518a.userCache;
        AttributionData attributionData = this.f1519b;
        synchronized (uh0Var) {
            JSONObject jSONObjectForJsonPut = attributionData != null ? attributionData.forJsonPut() : null;
            Intrinsics.checkNotNullParameter("ab_install_attribution", "key");
            JSONObject jSONObjectC = uh0Var.c();
            try {
                if (jSONObjectForJsonPut == null) {
                    jSONObjectC.put("ab_install_attribution", JSONObject.NULL);
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject("ab_install_attribution");
                    if (jSONObjectOptJSONObject != null) {
                        jSONObjectC.put("ab_install_attribution", JsonUtils.plus(jSONObjectOptJSONObject, jSONObjectForJsonPut));
                    } else {
                        jSONObjectC.put("ab_install_attribution", jSONObjectForJsonPut);
                    }
                }
                uh0Var.a(jSONObjectC);
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uh0Var, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new qh0(jSONObjectForJsonPut), 4, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
