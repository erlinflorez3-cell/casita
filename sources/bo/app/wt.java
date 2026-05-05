package bo.app;

import com.dynatrace.android.callback.Callback;
import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wt extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(String str, Continuation continuation) {
        super(2, continuation);
        this.f2163a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new wt(this.f2163a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new wt(this.f2163a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URLConnection uRLConnectionOpenConnection = new URL(this.f2163a).openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        uRLConnectionOpenConnection.setRequestProperty("Accept", "text/event-stream");
        uRLConnectionOpenConnection.setDoInput(true);
        Callback.connect(uRLConnectionOpenConnection);
        return uRLConnectionOpenConnection;
    }
}
