package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.yz;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public static final h f2706a = new h();

    public static final boolean a(Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-29656));
        short sXd2 = (short) (C1633zX.Xd() ^ (-30392));
        int[] iArr = new int["vu{}w%'".length()];
        QB qb = new QB("vu{}w%'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        try {
            int i3 = Build.VERSION.SDK_INT;
            String strUd = C1626yg.Ud("49@\u0018{~\u0014Y\tl-\u0010\u001f\fO\u00024cT=\u0015t", (short) (FB.Xd() ^ 7260), (short) (FB.Xd() ^ 8833));
            if (i3 >= 33) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Ig.wd("\u0012y\u0002,x\u001d\u007f*\u001cLQq\u000f\u0012L$_\u0016]g\u0015x\u0013", (short) (FB.Xd() ^ 30540))).getMethod(EO.Od(":\u0007&\u001bN\u000ek[\u0011,\u0010H\u0001\u0004\u0004%O", (short) (C1580rY.Xd() ^ (-2823))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                    Class<?> cls = Class.forName(C1561oA.Qd("VbWd`YS\u001cP[Y^NV[\u0014UQ\u00112BCJ?DA(;G9>;G", (short) (C1633zX.Xd() ^ (-23451))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1593ug.zd(":2H4\u0002A7E?\u0007-ONFLF", (short) (Od.Xd() ^ (-309)), (short) (Od.Xd() ^ (-29198))));
                    short sXd3 = (short) (ZN.Xd() ^ 18952);
                    int[] iArr2 = new int["\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fW\u0019\u0015Tu\u0006\u0007\u000e\u0003\b\u0005k~\u000b|\u0002~\u000b;fvw~sxuX|s{Qvjoz".length()];
                    QB qb2 = new QB("\u001a&\u001b($\u001d\u0017_\u0014\u001f\u001d\"\u0012\u001a\u001fW\u0019\u0015Tu\u0006\u0007\u000e\u0003\b\u0005k~\u000b|\u0002~\u000b;fvw~sxuX|s{Qvjoz");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    clsArr[1] = Class.forName(new String(iArr2, 0, i4));
                    Object[] objArr2 = {strUd, packageInfoFlagsOf};
                    Method method2 = cls.getMethod(C1561oA.Kd("sr\u0003_qt}t{z_\u0006~\t", (short) (ZN.Xd() ^ 32013)), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Wg.Zd("+\u0006C]#14FG#n<9S!fD}\r[\u0018sD", (short) (C1580rY.Xd() ^ (-31303)), (short) (C1580rY.Xd() ^ (-24167)))).getMethod(C1561oA.Xd("`_oL^ajahgPesgnm{", (short) (C1580rY.Xd() ^ (-4723))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                    Class<?> cls2 = Class.forName(Wg.vd("KWLYUNH\u0011U`^cS[`\u0019JF\u0006'78?4IF-@L>C@|", (short) (FB.Xd() ^ 22939)));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Qg.kd("YOcM\u0019VJVN\u00148XUKOG", (short) (FB.Xd() ^ 18679), (short) (FB.Xd() ^ 27594)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr4 = {strUd, 0};
                    Method method4 = cls2.getMethod(hg.Vd("UR`;KLSHMJ-QHP", (short) (C1633zX.Xd() ^ (-10835)), (short) (C1633zX.Xd() ^ (-19466))), clsArr2);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(packageManager2, objArr4);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f2706a, BrazeLogger.Priority.W, (Throwable) e6, false, (Function0) yz.f2335a, 4, (Object) null);
            return false;
        }
    }
}
