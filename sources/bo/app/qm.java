package bo.app;

import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class qm extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kn f1614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(kn knVar, List list, Continuation continuation) {
        super(2, continuation);
        this.f1614b = knVar;
        this.f1615c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        qm qmVar = new qm(this.f1614b, this.f1615c, continuation);
        qmVar.f1613a = obj;
        return qmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f1613a;
        SharedPreferences.Editor editorEdit = this.f1614b.f1131i.edit();
        for (String str : this.f1615c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pm(str), 7, (Object) null);
            editorEdit.remove(str);
        }
        editorEdit.apply();
        return Unit.INSTANCE;
    }
}
