package bo.app;

import com.facebook.react.uimanager.UIManagerModuleConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lm extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kn f1203a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(kn knVar, Continuation continuation) {
        super(2, continuation);
        this.f1203a = knVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lm(this.f1203a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lm(this.f1203a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f1203a.f1132j.edit().putStringSet(UIManagerModuleConstants.ACTION_DISMISSED, this.f1203a.f1127e).apply();
        return Unit.INSTANCE;
    }
}
