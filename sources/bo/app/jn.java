package bo.app;

import android.content.SharedPreferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class jn extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kn f1023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(kn knVar, JSONObject jSONObject, String str, Continuation continuation) {
        super(2, continuation);
        this.f1023a = knVar;
        this.f1024b = jSONObject;
        this.f1025c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new jn(this.f1023a, this.f1024b, this.f1025c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jn) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SharedPreferences.Editor editorEdit = this.f1023a.f1131i.edit();
        JSONObject jSONObject = this.f1024b;
        if (jSONObject != null) {
            editorEdit.putString(this.f1025c, jSONObject.toString());
        } else {
            editorEdit.remove(this.f1025c);
        }
        editorEdit.apply();
        return Unit.INSTANCE;
    }
}
