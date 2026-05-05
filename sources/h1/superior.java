package h1;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public abstract class superior {
    public static final PackageInfo a(PackageManager packageManager, String str, int i2) {
        try {
            if (!i1.pair.h()) {
                Class<?> cls = Class.forName(C1561oA.od("!-\"/+$\u001ef\u001b&$)\u0019!&^ \u001c[|\r\u000e\u0015\n\u000f\fr\u0006\u0012\u0004\t\u0006\u0012", (short) (C1633zX.Xd() ^ (-29637))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Kd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSy\u001c\u001b\u0013\u0019\u0013", (short) (C1499aX.Xd() ^ (-16558))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {str, Integer.valueOf(i2)};
                Method method = cls.getMethod(Wg.Zd("G\bK8\u000b\u0011jV /5.'f", (short) (Od.Xd() ^ (-16612)), (short) (Od.Xd() ^ (-15489))), clsArr);
                try {
                    method.setAccessible(true);
                    return (PackageInfo) method.invoke(packageManager, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(i2);
            Class<?> cls2 = Class.forName(Ig.wd("hGK}+W*\\b\u0003\u0004(ixnR[Ng}O.H\u001e\tvA\b\u0003H&\rm", (short) (ZN.Xd() ^ 121)));
            Class<?>[] clsArr2 = new Class[2];
            clsArr2[0] = Class.forName(EO.Od("\u00165x\b<W$\u0012Y0O\u0017_d5P", (short) (C1607wl.Xd() ^ 20394)));
            clsArr2[1] = Class.forName(C1561oA.Qd("Zf[hd]W T_]bRZ_\u0018YU\u00156FGNCHE,?K=B?K{'78?496\u0019=4<\u00127+0;", (short) (C1580rY.Xd() ^ (-24415))));
            Object[] objArr2 = {str, packageInfoFlagsOf};
            Method method2 = cls2.getMethod(C1593ug.zd("po\u007f\\nqzqxw\\\u0003{\u0006", (short) (C1499aX.Xd() ^ (-17555)), (short) (C1499aX.Xd() ^ (-8356))), clsArr2);
            try {
                method2.setAccessible(true);
                return (PackageInfo) method2.invoke(packageManager, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Throwable unused) {
            String str2 = C1561oA.Xd("\u0004180)e57=i21Am\u001f14=4;:\u001fE>HyAKO}", (short) (OY.Xd() ^ 19550)) + str;
            return null;
        }
        String str22 = C1561oA.Xd("\u0004180)e57=i21Am\u001f14=4;:\u001fE>HyAKO}", (short) (OY.Xd() ^ 19550)) + str;
        return null;
    }
}
