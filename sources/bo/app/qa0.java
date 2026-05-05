package bo.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class qa0 implements CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qa0 f1589a = new qa0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static v00 f1590b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineContext f1591c;

    static {
        pa0 pa0Var = new pa0(CoroutineExceptionHandler.Key);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("WOeQ\u001fgg]a$Zgg]pnocmt/G{ih{{w{}", (short) (C1633zX.Xd() ^ (-19551)), (short) (C1633zX.Xd() ^ (-16435)))).getDeclaredMethod(Jg.Wd("P\u0011\u001c54thx-%di\u0018\u000f\u001d7e\u000e\u0007T\\T\u0011", (short) (C1580rY.Xd() ^ (-8295)), (short) (C1580rY.Xd() ^ (-19754))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ExecutorService executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(executorService, ZO.xd("1.?\u0019\u0014#W&\u00146\u0004B9{\u001d{qsH>S\u0003H\u000b\u0012", (short) (C1607wl.Xd() ^ 24317), (short) (C1607wl.Xd() ^ 15661)));
            f1591c = ExecutorsKt.from(executorService).plus(pa0Var).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return f1591c;
    }
}
