package bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;

/* JADX INFO: loaded from: classes4.dex */
public final class bi0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci0 f287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(ci0 ci0Var, Continuation continuation) {
        super(2, continuation);
        this.f287b = ci0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        bi0 bi0Var = new bi0(this.f287b, continuation);
        bi0Var.f286a = obj;
        return bi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        bi0 bi0Var = new bi0(this.f287b, (Continuation) obj2);
        bi0Var.f286a = (CoroutineScope) obj;
        return bi0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f286a;
        try {
            if (this.f287b.x().f600a.getAvailablePermits() == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) vh0.f2047a, 6, (Object) null);
                uh0 uh0VarX = this.f287b.x();
                uh0VarX.getClass();
                BuildersKt__BuildersKt.runBlocking$default(null, new e(uh0VarX, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wh0.f2148a, 7, (Object) null);
            }
            if (this.f287b.j().f600a.getAvailablePermits() == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) xh0.f2214a, 6, (Object) null);
                zq zqVarJ = this.f287b.j();
                zqVarJ.getClass();
                BuildersKt__BuildersKt.runBlocking$default(null, new e(zqVarJ, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) yh0.f2314a, 7, (Object) null);
            }
            this.f287b.E.b();
            this.f287b.f392k.a();
            ci ciVar = this.f287b.f396o;
            ciVar.getClass();
            try {
                nh nhVar = ciVar.f379j;
                if (nhVar != null) {
                    Context context = ciVar.f370a;
                    Class<?> cls = Class.forName(yg.hg.Vd("\u0006\u0012\u0007\u0014\u0010\t\u0003K\u007f\u000b\t\u000e}\u0006\u000bCW\u0003\u0001\u0006u\b\u0003", (short) (C1633zX.Xd() ^ (-9120)), (short) (C1633zX.Xd() ^ (-8871))));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(C1561oA.ud("NZO\\XQK\u0014HSQVFNS\f\u001fNJ;=;8II&8569E3?", (short) (C1499aX.Xd() ^ (-15949))));
                    Object[] objArr = {nhVar};
                    Method method = cls.getMethod(C1561oA.yd("\u0015\r\u0014\u0006\u000b\f\u0019\u0019|\tk}~\u007f\u0007\u0013\u0015!", (short) (C1580rY.Xd() ^ (-3832))), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(context, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ciVar, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) yh.f2313a, 4, (Object) null);
            }
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e4, false, (Function0) zh0.f2399a, 4, (Object) null);
        }
        try {
            this.f287b.f395n.c();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) ai0.f211a, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
