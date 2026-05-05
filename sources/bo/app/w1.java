package bo.app;

import com.braze.Braze;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f2092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f2091a = str;
        this.f2092b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w1(this.f2092b, this.f2091a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = this.f2091a;
        return new w1(this.f2092b, str, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String inAppMessageJsonString = this.f2091a;
        InAppMessageBase inAppMessageBaseA = null;
        if (inAppMessageJsonString == null) {
            return null;
        }
        tf brazeManager = ((ci0) this.f2092b.getUdm$android_sdk_base_release()).f403v;
        String str = com.braze.support.j.f2709a;
        Intrinsics.checkNotNullParameter(inAppMessageJsonString, "inAppMessageJsonString");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        if (StringsKt.isBlank(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, com.braze.support.j.f2709a, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) b30.f238a, 12, (Object) null);
            return null;
        }
        try {
            inAppMessageBaseA = com.braze.support.j.a(new JSONObject(inAppMessageJsonString), brazeManager);
            return inAppMessageBaseA;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, com.braze.support.j.f2709a, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new c30(inAppMessageJsonString), 8, (Object) null);
            return inAppMessageBaseA;
        }
    }
}
