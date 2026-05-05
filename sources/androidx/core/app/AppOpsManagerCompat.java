package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    public static String permissionToOp(String str) {
        return Api23Impl.permissionToOp(str);
    }

    public static int noteOp(Context context, String str, int i2, String str2) throws Throwable {
        Object[] objArr = {Qg.kd("%32002", (short) (ZN.Xd() ^ 21698), (short) (ZN.Xd() ^ 17057))};
        Method method = Class.forName(hg.Vd("frgtpic,`kin^fk$8cafVhc", (short) (C1607wl.Xd() ^ 20017), (short) (C1607wl.Xd() ^ 16496))).getMethod(C1561oA.yd("%$4\u0014;68*#\n\u001d+0$\u001f\"", (short) (C1580rY.Xd() ^ (-19991))), Class.forName(C1561oA.ud("[QeO\u001bXLXP\u0016:ZWMQI", (short) (C1633zX.Xd() ^ (-5789)))));
        try {
            method.setAccessible(true);
            return ((AppOpsManager) method.invoke(context, objArr)).noteOp(str, i2, str2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int noteOpNoThrow(Context context, String str, int i2, String str2) throws Throwable {
        Object[] objArr = {C1561oA.Yd("@PQQSW", (short) (C1580rY.Xd() ^ (-11291)))};
        Method method = Class.forName(Xg.qd("'5,;940z1>>E7AH\u0003\u0019FFM?SP", (short) (ZN.Xd() ^ 13589), (short) (ZN.Xd() ^ 9846))).getMethod(ZO.xd("UAv{j\tH;WZ_P\u007f\u0018d\u0014", (short) (ZN.Xd() ^ 285), (short) (ZN.Xd() ^ 18105)), Class.forName(Jg.Wd("OD\u001b\u007f\u000eT\u000b\u0012L]\u0004^^\u001e$V", (short) (Od.Xd() ^ (-30998)), (short) (Od.Xd() ^ (-29532)))));
        try {
            method.setAccessible(true);
            return ((AppOpsManager) method.invoke(context, objArr)).noteOpNoThrow(str, i2, str2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        return Api23Impl.noteProxyOp((AppOpsManager) Api23Impl.getSystemService(context, AppOpsManager.class), str, str2);
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        return Api23Impl.noteProxyOpNoThrow((AppOpsManager) Api23Impl.getSystemService(context, AppOpsManager.class), str, str2);
    }

    public static int checkOrNoteProxyOp(Context context, int i2, String str, String str2) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager systemService = Api29Impl.getSystemService(context);
            int iCheckOpNoThrow = Api29Impl.checkOpNoThrow(systemService, str, Binder.getCallingUid(), str2);
            return iCheckOpNoThrow != 0 ? iCheckOpNoThrow : Api29Impl.checkOpNoThrow(systemService, str, i2, Api29Impl.getOpPackageName(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static AppOpsManager getSystemService(Context context) throws Throwable {
            Object[] objArr = {AppOpsManager.class};
            Method method = Class.forName(Wg.Zd("JErj\u001fP9:'\u001dS\u0015o0q\u0011]E.o\u0018\u0011H", (short) (C1580rY.Xd() ^ (-22755)), (short) (C1580rY.Xd() ^ (-32447)))).getMethod(Wg.vd("&#1\u000f<55%4\u0019*6A3,-", (short) (OY.Xd() ^ TapAndPayStatusCodes.TAP_AND_PAY_ENROLL_FOR_VIRTUAL_CARDS_FAILED)), Class.forName(C1561oA.Xd("ph~j8wm{u=S}s\u0007\b", (short) (ZN.Xd() ^ 26147))));
            try {
                method.setAccessible(true);
                return (AppOpsManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static int checkOpNoThrow(AppOpsManager appOpsManager, String str, int i2, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        static String getOpPackageName(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("CODQMF@\t=HFK;CH\u0001\u0015@>C3E@", (short) (ZN.Xd() ^ 31216))).getMethod(C1561oA.Kd("@?O+M.@CLCJI3GTM", (short) (Od.Xd() ^ (-24894))), new Class[0]);
            try {
                method.setAccessible(true);
                return (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static String permissionToOp(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        static <T> T getSystemService(Context context, Class<T> cls) throws Throwable {
            short sXd = (short) (C1580rY.Xd() ^ (-25069));
            int[] iArr = new int["\"i\u000e<p/\u0016 ,LMm)(2\u0006G\u0012I\b/z\u0019".length()];
            QB qb = new QB("\"i\u000e<p/\u0016 ,LMm)(2\u0006G\u0012I\b/z\u0019");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {cls};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("vu\u0006e\r\b\n{\u0005k~\r\u0012\u0006\u0001\u0004", (short) (C1580rY.Xd() ^ (-18834)), (short) (C1580rY.Xd() ^ (-15469))), Class.forName(C1561oA.Qd("\u007fu\ns?|p|t:Nvj{z", (short) (FB.Xd() ^ 25427))));
            try {
                method.setAccessible(true);
                return (T) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static int noteProxyOp(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        static int noteProxyOpNoThrow(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }
}
