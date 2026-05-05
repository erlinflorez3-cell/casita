package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes.dex */
class PackageUtils {
    private PackageUtils() {
    }

    static boolean hasSystemFeatureFingerprint(Context context) throws Throwable {
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("\u0002U&d/D!'e:>u\u000e}|ylv\u0015)\u0007\r8", (short) (C1499aX.Xd() ^ (-15738)), (short) (C1499aX.Xd() ^ (-29793)))).getMethod(C1626yg.Ud("\u001f4_>;\u0002SgS+~W!5!r\u0011", (short) (FB.Xd() ^ 19050), (short) (FB.Xd() ^ 4777)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((PackageManager) method.invoke(context, objArr)) != null) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Ig.wd("\u0007d,\u001f\u0004(K=/ %\u0005\"%?W\u0013A\tr \u0004]", (short) (C1499aX.Xd() ^ (-9613)))).getMethod(EO.Od("4YZ\u001aS#;h\u001a\bmc \r;\u0017Y", (short) (C1580rY.Xd() ^ (-7772))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (Api23Impl.hasSystemFeatureFingerprint((PackageManager) method2.invoke(context, objArr2))) {
                            return true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }

    static boolean hasSystemFeatureFace(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29 && context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u001d+\"1'\"\u001eh'44;%/6pn\u001c\u001c#\r!\u001e", (short) (Od.Xd() ^ (-26655)))).getMethod(C1561oA.Yd("PO_<NQZQXW@UcW^]k", (short) (C1580rY.Xd() ^ (-7462))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((PackageManager) method.invoke(context, objArr)) != null) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Xg.qd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (ZN.Xd() ^ 28841), (short) (ZN.Xd() ^ 31985))).getMethod(Jg.Wd("\u007ff&%FS{Dk4-c\"?e\u0017D", (short) (C1607wl.Xd() ^ 9713), (short) (C1607wl.Xd() ^ 3521)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (Api29Impl.hasSystemFeatureFace((PackageManager) method2.invoke(context, objArr2))) {
                            return true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }

    static boolean hasSystemFeatureIris(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 29 && context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (OY.Xd() ^ 26623))).getMethod(C1593ug.zd("ihxUgjsjqpYn|pwv\u0005", (short) (C1499aX.Xd() ^ (-14492)), (short) (C1499aX.Xd() ^ (-25379))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((PackageManager) method.invoke(context, objArr)) != null) {
                    short sXd = (short) (C1580rY.Xd() ^ (-28765));
                    int[] iArr = new int["IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF".length()];
                    QB qb = new QB("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("vu\u0006btw\u0001w~}f{\n}\u0005\u0004\u0012", (short) (Od.Xd() ^ (-27376))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (Api29Impl.hasSystemFeatureIris((PackageManager) method2.invoke(context, objArr2))) {
                            return true;
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasSystemFeatureFingerprint(PackageManager packageManager) throws Throwable {
            Object[] objArr = {Xg.qd("1?6EC>:\u0005@:L?S>PD\u000eGKQKJXWZRX_", (short) (OY.Xd() ^ 10712), (short) (OY.Xd() ^ 6806))};
            Method method = Class.forName(Jg.Wd("\u007f<g-S|-.\rP|y\u0014T\bxd\u0019\u000f`\u001b\u0013R\u0002'ZyGs\u001cYP\u0005", (short) (OY.Xd() ^ 22801), (short) (OY.Xd() ^ 10618))).getMethod(C1626yg.Ud(")\u001f{\u0004&),%\u0002=,X)w~\u001b", (short) (C1499aX.Xd() ^ (-30638)), (short) (C1499aX.Xd() ^ (-1532))), Class.forName(ZO.xd("\u000bctLh^@q\u0011!k\u001e* gB", (short) (C1607wl.Xd() ^ 4163), (short) (C1607wl.Xd() ^ 25974))));
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(packageManager, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static boolean hasSystemFeatureFace(PackageManager packageManager) throws Throwable {
            String strZd = C1593ug.zd("\u001c*!0.)%o+%7*>);/x.6=<5ED<7H\u0004=9<?", (short) (OY.Xd() ^ 15713), (short) (OY.Xd() ^ 9602));
            short sXd = (short) (C1607wl.Xd() ^ 10582);
            int[] iArr = new int["]i^kg`Z#Wb`eU]b\u001b\\X\u00189IJQFKH/BN@EBN".length()];
            QB qb = new QB("]i^kg`Z#Wb`eU]b\u001b\\X\u00189IJQFKH/BN@EBN");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = {Class.forName(C1561oA.Kd("\t\u0001\u0017\u0003P\u0010\u0006\u0014\u000eU{\u001e\u001d\u0015\u001b\u0015", (short) (OY.Xd() ^ 7310)))};
            Object[] objArr = {strZd};
            short sXd2 = (short) (FB.Xd() ^ 9562);
            short sXd3 = (short) (FB.Xd() ^ 2964);
            int[] iArr2 = new int["i5DbKHFM0y\u001eZ(\"yO".length()];
            QB qb2 = new QB("i5DbKHFM0y\u001eZ(\"yO");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(packageManager, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static boolean hasSystemFeatureIris(PackageManager packageManager) throws Throwable {
            Object[] objArr = {C1561oA.Xd("x\u0007}\r\u000b\u0006\u0002L\b\u0002\u0014\u0007\u001b\u0006\u0018\fU\u000b\u0013\u001a\u0019\u0012\"!\u0019\u0014%`\u001d'\u001f*", (short) (Od.Xd() ^ (-5427)))};
            Method method = Class.forName(Wg.vd("DRETVQI\u0014>KGNDNQ\fca\u001fBX[`WRQ6K]QTS5", (short) (C1607wl.Xd() ^ 20559))).getMethod(hg.Vd("?7H'LEE5<\u00142-??;-", (short) (C1607wl.Xd() ^ 14522), (short) (C1607wl.Xd() ^ 9695)), Class.forName(Qg.kd(";1E/z8,80u\u001a:7-1)", (short) (ZN.Xd() ^ 14730), (short) (ZN.Xd() ^ 4361))));
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(packageManager, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
