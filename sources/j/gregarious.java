package j;

import android.app.Application;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gregarious {
    public static final boolean a(Application application, String str, String str2) throws Throwable {
        Class<?> cls = Class.forName(Ig.wd(">\u0006gPR\u001f8\u007ff\u0014\u0013=_ltU\u0012J~O\u0002:N", (short) (FB.Xd() ^ 15882)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-13686));
        int[] iArr = new int["+yJ\u000f_6Rh1\u0004a[7,\u0012vX".length()];
        QB qb = new QB("+yJ\u000f_6Rh1\u0004a[7,\u0012vX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
            Object[] objArr2 = {str, str2};
            Method method2 = Class.forName(C1561oA.Qd("JVKXTMG\u0010DOMRBJO\bIE\u0005&67>385\u001c/;-2/;", (short) (C1580rY.Xd() ^ (-24921)))).getMethod(C1561oA.Kd("\"(&%.\u0014*841<=4;;", (short) (ZN.Xd() ^ 27039)), Class.forName(C1593ug.zd("UMcO\u001d\\R`Z\"Hjiaga", (short) (ZN.Xd() ^ 21443), (short) (ZN.Xd() ^ 12233))), Class.forName(C1561oA.od("=3G1|:.:2w\u001c<9/3+", (short) (C1580rY.Xd() ^ (-23771)))));
            try {
                method2.setAccessible(true);
                if (((Integer) method2.invoke(packageManager, objArr2)).intValue() != 0) {
                    return false;
                }
                short sXd2 = (short) (FB.Xd() ^ 24768);
                short sXd3 = (short) (FB.Xd() ^ 4951);
                int[] iArr2 = new int["=a6\u0011y\u0013cp".length()];
                QB qb2 = new QB("=a6\u0011y\u0013cp");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str3 = new String(iArr2, 0, i3) + str2 + C1561oA.Xd("\u0003LFY\u0007", (short) (C1607wl.Xd() ^ 11711)) + str;
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final boolean a(e0.pair pairVar, Application application, String str) {
        if (a(application, str, pairVar.f18457a)) {
            return true;
        }
        List list = pairVar.f18464h;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((e0.apparatus) it.next()).f18451a, str)) {
                return true;
            }
        }
        return false;
    }
}
