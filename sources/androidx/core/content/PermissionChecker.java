package androidx.core.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkPermission(Context context, String str, int i2, int i3, String str2) throws Throwable {
        Class<?> cls = Class.forName(C1626yg.Ud("[><\u007f\u0019VUF&UVb\t~\u0018@\u007f*Y0%5;", (short) (ZN.Xd() ^ 14470), (short) (ZN.Xd() ^ 1270)));
        Class<?>[] clsArr = {Class.forName(Ig.wd("6v[(#\u0015 j\tAbk\u0017\u001e\u0001]", (short) (ZN.Xd() ^ 19859))), Integer.TYPE, Integer.TYPE};
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(EO.Od("d7\u0004\\'Hs;d?E)I_x", (short) (OY.Xd() ^ 17344)), clsArr);
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(context, objArr)).intValue() == -1) {
                return -1;
            }
            String strPermissionToOp = AppOpsManagerCompat.permissionToOp(str);
            if (strPermissionToOp == null) {
                return 0;
            }
            if (str2 == null) {
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Qd("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (C1499aX.Xd() ^ (-6051)))).getMethod(C1593ug.zd("\u001c\u001b+\b\u001a\u001d&\u001d$#\f!/#*)7", (short) (C1499aX.Xd() ^ (-26068)), (short) (C1499aX.Xd() ^ (-21270))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(C1561oA.od("\u0016\"\u0017$ \u0019\u0013[\u0010\u001b\u0019\u001e\u000e\u0016\u001bS\u0015\u0011Pq\u0002\u0003\n~\u0004\u0001gz\u0007x}z\u0007", (short) (Od.Xd() ^ (-28677))));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr3 = {Integer.valueOf(i3)};
                    Method method3 = cls2.getMethod(C1561oA.Kd("\u001e\u001d-\n\u001c\u001f(\u001f&%4\b26\u001a/+", (short) (Od.Xd() ^ (-10560))), clsArr2);
                    try {
                        method3.setAccessible(true);
                        String[] strArr = (String[]) method3.invoke(packageManager, objArr3);
                        if (strArr == null || strArr.length <= 0) {
                            return -1;
                        }
                        str2 = strArr[0];
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            int iMyUid = Process.myUid();
            short sXd = (short) (C1580rY.Xd() ^ (-23340));
            short sXd2 = (short) (C1580rY.Xd() ^ (-16402));
            int[] iArr = new int["\r}gq$\r\u007fC,;0.VPJ\u007fJVPNt{j".length()];
            QB qb = new QB("\r}gq$\r\u007fC,;0.VPJ\u007fJVPNt{j");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i4++;
            }
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Xd(",+;\u0018*-6-43\u001d1>7", (short) (C1499aX.Xd() ^ (-4938))), new Class[0]);
            try {
                method4.setAccessible(true);
                return ((iMyUid != i3 || !ObjectsCompat.equals((String) method4.invoke(context, objArr4), str2)) ? AppOpsManagerCompat.noteProxyOpNoThrow(context, strPermissionToOp, str2) : AppOpsManagerCompat.checkOrNoteProxyOp(context, i3, strPermissionToOp, str2)) == 0 ? 0 : -2;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static int checkSelfPermission(Context context, String str) throws Throwable {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\u001b' -%\u001e\u001cd%027#+4ll\u0018\u001a\u001f\u000b\u001d\u001c", (short) (Od.Xd() ^ (-5857)))).getMethod(Qg.kd("liwRbcj_daI[f]", (short) (C1499aX.Xd() ^ (-26274)), (short) (C1499aX.Xd() ^ (-26023))), new Class[0]);
        try {
            method.setAccessible(true);
            return checkPermission(context, str, iMyPid, iMyUid, (String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int checkCallingPermission(Context context, String str, String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int checkCallingOrSelfPermission(Context context, String str) throws Throwable {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            Class<?> cls = Class.forName(Jg.Wd("7hv=ZL[a''>\u0001\u000e\u000f-\u001fd9,N\u007f'\u001b", (short) (C1580rY.Xd() ^ (-24821)), (short) (C1580rY.Xd() ^ (-18400))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ (-2867));
            short sXd2 = (short) (C1580rY.Xd() ^ (-18397));
            int[] iArr = new int["R\u0002W\u0003\u0018x>aJ4m%\u0010\u0012".length()];
            QB qb = new QB("R\u0002W\u0003\u0018x>aJ4m%\u0010\u0012");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                str2 = (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            str2 = null;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }
}
