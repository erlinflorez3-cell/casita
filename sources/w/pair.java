package w;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.OY;

/* JADX INFO: loaded from: classes2.dex */
public final class pair extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Application f28371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pair(Application application) {
        super(1);
        this.f28371a = application;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Application application = this.f28371a;
        Object[] objArr = {(Application.ActivityLifecycleCallbacks) obj};
        Method method = Class.forName(C1561oA.Qd("\u001d)\u001e+' \u001ab\u0015#\"^p\u001f\u001e\u0019\u0015\u000e\u000b\u001d\u0011\u0016\u0014", (short) (FB.Xd() ^ 32175))).getMethod(C1561oA.od("fXYZccS_-N^R^PZ^0LHFCXAIA\u001e;ED978?F", (short) (FB.Xd() ^ 4532)), Class.forName(C1593ug.zd("w\u0006|\f\n\u0005\u0001K\u007f\u0010\u0011Oc\u0014\u0015\u0012\u0010\u000b\n\u001e\u0014\u001b\u001bQo\u0013%\u001b)\u001d)/\u0003!\u001f\u001f\u001e5 *$\u0003\"./&&)2;", (short) (OY.Xd() ^ 10194), (short) (OY.Xd() ^ 20103))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
            return Unit.INSTANCE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
