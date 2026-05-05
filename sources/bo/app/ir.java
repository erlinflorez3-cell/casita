package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import yg.C1561oA;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class ir extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(Context context) {
        super(0);
        this.f930a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Context context = this.f930a;
        short sXd = (short) (OY.Xd() ^ 1251);
        int[] iArr = new int["\u0007\u0012\u000fN\t\u0017\u0016\u0007\u000b\u0014G|\u0005\u0015\u0007\u007f\u0019".length()];
        QB qb = new QB("\u0007\u0012\u000fN\t\u0017\u0016\u0007\u000b\u0014G|\u0005\u0015\u0007\u007f\u0019");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), 0};
        Method method = Class.forName(C1561oA.Yd("HVM\\ZUQ\u001cR__fXbi$:ggn`tq", (short) (Od.Xd() ^ (-31962)))).getMethod(Jg.Wd("W\u0007lZgn\u0017{M\f\"g{l\u0010\u0012rV/\u000f", (short) (FB.Xd() ^ 24674), (short) (FB.Xd() ^ 21336)), Class.forName(Xg.qd("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005", (short) (ZN.Xd() ^ 22800), (short) (ZN.Xd() ^ 10374))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
