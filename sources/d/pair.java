package d;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.cleafy.mobile.detection.agent.configuration.AutomaticUpdateAnalysis;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pair extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tongue f18370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pair(tongue tongueVar, Continuation continuation) {
        super(2, continuation);
        this.f18370a = tongueVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new pair(this.f18370a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new pair(this.f18370a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        x.apparatus apparatusVar = this.f18370a.f18377d;
        if (apparatusVar.f28412a != AutomaticUpdateAnalysis.NONE || apparatusVar.f28413b) {
            apparatusVar.f28416e.getLifecycle().addObserver((DefaultLifecycleObserver) apparatusVar.f28418g.getValue());
        }
        return Unit.INSTANCE;
    }
}
