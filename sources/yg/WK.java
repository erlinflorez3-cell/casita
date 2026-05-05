package yg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WK {
    private static long Kd = 0;
    private static final int Xd = 5000;
    private static List<PackageInfo> Yd = new ArrayList();
    private static final Object ud = new Object();

    private WK() {
    }

    public static List<PackageInfo> Xd(Context context) {
        synchronized (ud) {
            if (SystemClock.elapsedRealtime() < Kd + ((7016106699640339558L ^ 1502853339197755369L) ^ 8468177941101584391L)) {
                return Yd;
            }
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Xg.qd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (Od.Xd() ^ (1122892925 ^ (-1122887523))), (short) (Od.Xd() ^ (1012091571 ^ (-1012102576))))).getMethod(Jg.Wd("S=\u000e1\u0004M\u0017T\u001ca\u000b&t/v<\u000b", (short) (C1580rY.Xd() ^ (1051258261 ^ (-1051254550))), (short) (C1580rY.Xd() ^ ((1777621706 ^ 511992487) ^ (-2003858319)))), new Class[0]);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    Object[] objArr2 = {0};
                    Method method2 = Class.forName(ZO.xd("nVs.n\tY\f\u000f-[4^YLx[g6T\u0014\u0012t_s3N$\"vugg", (short) (C1633zX.Xd() ^ (1792246895 ^ (-1792254685))), (short) (C1633zX.Xd() ^ ((529585143 ^ 2110826028) ^ (-1648387697))))).getMethod(C1626yg.Ud("P-\u00169rrpGN\u001aa\u0015\u0005m\u001cld8z\u000b", (short) (C1499aX.Xd() ^ ((204206660 ^ 1281865044) ^ (-1078729681))), (short) (C1499aX.Xd() ^ ((545199914 ^ 1558545399) ^ (-2090507185)))), Integer.TYPE);
                    try {
                        method2.setAccessible(true);
                        Yd = (List) method2.invoke(packageManager, objArr2);
                        Kd = SystemClock.elapsedRealtime();
                        return Yd;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                return Yd;
            }
        }
    }
}
