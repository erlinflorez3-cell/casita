package bo.app;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1405a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f1405a = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f1405a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o(this.f1405a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        q qVar = this.f1405a;
        Context context = qVar.f1557a;
        qVar.getClass();
        short sXd = (short) (C1633zX.Xd() ^ (-28744));
        short sXd2 = (short) (C1633zX.Xd() ^ (-18602));
        int[] iArr = new int["K?KK@II9AF~3>;z-;:+7@s8824\"'$k0 &\u0019\u001e&\u0018\u0018!\u0019\u0017\u0011\u0014\u0011\u0012\u0016\u0012".length()];
        QB qb = new QB("K?KK@II9AF~3>;z-;:+7@s8824\"'$k0 &\u0019\u001e&\u0018\u0018!\u0019\u0017\u0011\u0014\u0011\u0012\u0016\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), 0};
        Method method = Class.forName(yg.hg.Vd("FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC", (short) (C1633zX.Xd() ^ (-17518)), (short) (C1633zX.Xd() ^ (-15349)))).getMethod(C1561oA.yd("a^pNf^rdfQvhljzlXLQ^", (short) (FB.Xd() ^ 23330)), Class.forName(C1561oA.ud(")\u001f3\u001dh&\u001a&\u001ec\b(%\u001b\u001f\u0017", (short) (C1633zX.Xd() ^ (-10904)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
            return Unit.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
