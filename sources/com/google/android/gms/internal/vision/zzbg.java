package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbg {
    private static volatile zzcy<Boolean> zza = zzcy.zzc();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) throws Throwable {
        Object[] objArr;
        Method method;
        Object obj;
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(C1561oA.Xd("`netrmi4jww~pz\u0002<R\u007f\u007f\u0007x\r\n", (short) (Od.Xd() ^ (-17930)))).getMethod(Wg.vd("*)5\u0012 #(\u001f21\u0016+5),+%", (short) (FB.Xd() ^ 18138)), new Class[0]);
        try {
            method2.setAccessible(true);
            PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
            String strKd = Qg.kd("\u000e\u0019\u0016U\u000e\u0015\u0014\u000b\u000f\u0007N\u0001\r\u0002\u000f\u000b\u0004}F~\u0004\t", (short) (Od.Xd() ^ (-6182)), (short) (Od.Xd() ^ (-225)));
            try {
                Class<?> cls = Class.forName(hg.Vd("MYN[WPJ\u0013GRPUEMR\u000bLH\b)9:A6;8\u001f2>052>", (short) (C1607wl.Xd() ^ 19781), (short) (C1607wl.Xd() ^ 25353)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.ud("KAU?\u000bH<H@\u0006*JG=A9", (short) (C1633zX.Xd() ^ (-25382))));
                clsArr[1] = Integer.TYPE;
                objArr = new Object[]{strKd, 0};
                short sXd = (short) (C1633zX.Xd() ^ (-25729));
                int[] iArr = new int["\u001d\u001c,y\"# \u001e! 4*))\u0005+\f\u0016".length()];
                QB qb = new QB("\u001d\u001c,y\"# \u001e! 4*))\u0005+\f\u0016");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(packageManager, objArr);
                String strYd = C1561oA.Yd("ESJYWRN\u0019O\\\\cU_f!db$8hifd_^rhooKqjt", (short) (ZN.Xd() ^ 15335));
                String strQd = Xg.qd("gndkx", (short) (C1580rY.Xd() ^ (-10105)), (short) (C1580rY.Xd() ^ (-1075)));
                try {
                    Class<?> cls2 = Class.forName(strYd);
                    Field field = 1 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                int iIntValue = ((Integer) obj).intValue();
                return (iIntValue + 129) - (iIntValue | 129) != 0;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r11, android.net.Uri r12) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzbg.zza(android.content.Context, android.net.Uri):boolean");
    }
}
