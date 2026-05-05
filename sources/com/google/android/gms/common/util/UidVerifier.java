package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean isGooglePlayServicesUid(Context context, int i2) throws Throwable {
        String strWd = Ig.wd("\u000fO}\\{&Hf \u007fD[\u0015\u000bG)IPPo:n", (short) (ZN.Xd() ^ 14059));
        if (!uidHasPackageName(context, i2, strWd)) {
            return false;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("hC=m-{Lxp\u000b\u00020o|`B,<uFy7K", (short) (C1499aX.Xd() ^ (-8509)))).getMethod(C1561oA.Qd("fcqL\\]dY^[BUaSXUa", (short) (C1633zX.Xd() ^ (-10249))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Class<?> cls = Class.forName(C1593ug.zd("\b\u0016\r\u001c\u001a\u0015\u0011[\u0012\u001f\u001f&\u0018\")c'%f\n\u001c\u001f(\u001f&%\u000e#1%,+9", (short) (C1633zX.Xd() ^ (-17966)), (short) (C1633zX.Xd() ^ (-20421))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (FB.Xd() ^ 10365);
                int[] iArr = new int["/%9#n, ,$i\u000e.+!%\u001d".length()];
                QB qb = new QB("/%9#n, ,$i\u000e.+!%\u001d");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strWd, 64};
                Method method2 = cls.getMethod(C1561oA.Kd("TSc@RU^U\\[@f_i", (short) (FB.Xd() ^ 29901)), clsArr);
                try {
                    method2.setAccessible(true);
                    return GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage((PackageInfo) method2.invoke(packageManager, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (!Log.isLoggable(Wg.Zd("VXE%&!\ntiSR", (short) (C1633zX.Xd() ^ (-25929)), (short) (C1633zX.Xd() ^ (-27830))), 3)) {
                    return false;
                }
                C1561oA.Xd("\u001e03<3:9tC8F:A@N|A@N\bV\u0003JNTK\bPYZSYS\u000f`]Sl\u0014h[inb]`o\u001dn`clcji1&kmok\u0001x\u0002w}w1\u0007\u00034{w\u0004\f~", (short) (Od.Xd() ^ (-14606)));
                return false;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static boolean uidHasPackageName(Context context, int i2, String str) {
        return Wrappers.packageManager(context).zza(i2, str);
    }
}
