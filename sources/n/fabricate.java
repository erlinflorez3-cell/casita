package n;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function1;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class fabricate implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f19872a;

    public fabricate(Application application) {
        this.f19872a = application;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        String str = (String) obj;
        Application application = this.f19872a;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd(" \u007f\u00066h\ru&\u0018VY\u007f\u001d\u001eJ [\u0018]]\u000bx\u0019", (short) (OY.Xd() ^ 22039))).getMethod(EO.Od("\u0013V9{v5Ww8)\u0011\u0001<;g\u0006W", (short) (C1499aX.Xd() ^ (-26555))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
            Class<?> cls = Class.forName(C1561oA.Qd("S_Ta]VP\u0019MXV[KSX\u0011RN\u000e/?@G<A>%8D6;8D", (short) (C1607wl.Xd() ^ 27494)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1633zX.Xd() ^ (-1099));
            short sXd2 = (short) (C1633zX.Xd() ^ (-28579));
            int[] iArr = new int["XPfR _Uc]%Kmldjd".length()];
            QB qb = new QB("XPfR _Uc]%Kmldjd");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {str};
            Method method2 = cls.getMethod(C1561oA.od("0-;\u0012&91%)\t-2\"*/\u007f(*\u0007\u0017\u0018\u001f\u0014\u0019\u0016", (short) (C1580rY.Xd() ^ (-13961))), clsArr);
            try {
                method2.setAccessible(true);
                Intent intent = (Intent) method2.invoke(packageManager, objArr2);
                if (intent == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT < 33) {
                    Object[] objArr3 = {intent, 65536};
                    Method method3 = Class.forName(Qg.kd("3?4A=60x-86;+38p2.m\u000f\u001f '\u001c!\u001e\u0005\u0018$\u0016\u001b\u0018$", (short) (OY.Xd() ^ 4433), (short) (OY.Xd() ^ 12038))).getMethod(C1561oA.ud(";>-9?\u000e27'/4\u007f!1%1#-!\u001c)", (short) (C1499aX.Xd() ^ (-16151))), Class.forName(hg.Vd(",8-:6/)q&1/4$,1i\u0004(-\u001d%*", (short) (OY.Xd() ^ 10809), (short) (OY.Xd() ^ 10199))), Integer.TYPE);
                    try {
                        method3.setAccessible(true);
                        return (List) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Object[] objArr4 = {intent, PackageManager.ResolveInfoFlags.of(65536L)};
                Method method4 = Class.forName(C1561oA.Kd("FTKZXSO\u001aP]]dV`g\"ec%HZ]f]dcLaocjiw", (short) (C1633zX.Xd() ^ (-18137)))).getMethod(Wg.vd("]`O[a0TYYaf2ScWcEOC>K", (short) (FB.Xd() ^ 19195)), Class.forName(Wg.Zd(".r@C Q\u001d^t4\u000b\u000eZ\u001by'\u001f<U~(v", (short) (Od.Xd() ^ (-375)), (short) (Od.Xd() ^ (-18332)))), Class.forName(C1561oA.Xd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")c'%f\n\u001c\u001f(\u001f&%\u000e#1%,+9k\u001b/>;9D4\u0019?8B\u001aA7>K", (short) (C1499aX.Xd() ^ (-3396)))));
                try {
                    method4.setAccessible(true);
                    return (List) method4.invoke(packageManager, objArr4);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }
}
