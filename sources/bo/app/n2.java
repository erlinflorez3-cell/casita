package bo.app;

import com.braze.Braze;
import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f1332a = braze;
        this.f1333b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n2(this.f1332a, this.f1333b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n2(this.f1332a, this.f1333b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((ci0) this.f1332a.getUdm$android_sdk_base_release()).f389h.z()) {
            return (FeatureFlag) CollectionsKt.firstOrNull((List) ((ci0) this.f1332a.getUdm$android_sdk_base_release()).f407z.b(this.f1333b));
        }
        return null;
    }
}
