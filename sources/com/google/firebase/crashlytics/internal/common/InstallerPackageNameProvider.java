package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
class InstallerPackageNameProvider {
    private static final String NO_INSTALLER_PACKAGE_NAME = "";
    private String installerPackageName;

    InstallerPackageNameProvider() {
    }

    private static String loadInstallerPackageName(Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-21957));
        int[] iArr = new int["@\u0004(MR \u000f\u007fjRS;]lz\u0016V\t?M\u0004:(".length()];
        QB qb = new QB("@\u0004(MR \u000f\u007fjRS;]lz\u0016V\t?M\u0004:(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-82));
        int[] iArr2 = new int["wFWV\u0017nN$m\u000bh'\u0004xNqT".length()];
        QB qb2 = new QB("wFWV\u0017nN$m\u000bh'\u0004xNqT");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Class<?> cls2 = Class.forName(C1561oA.Qd("\u0018$\u0019&\"\u001b\u0015]\u0012\u001d\u001b \u0010\u0018\u001dUi\u0015\u0013\u0018\b\u001a\u0015", (short) (Od.Xd() ^ (-689))));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (C1607wl.Xd() ^ 7020);
            short sXd4 = (short) (C1607wl.Xd() ^ 2889);
            int[] iArr3 = new int["sr\u0003_qt}t{zdx\u0006~".length()];
            QB qb3 = new QB("sr\u0003_qt}t{zdx\u0006~");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                i4++;
            }
            Method method2 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
            try {
                method2.setAccessible(true);
                Object[] objArr3 = {(String) method2.invoke(context, objArr2)};
                Method method3 = Class.forName(C1561oA.od("-9.;70*r'205%-2j,(g\t\u0019\u001a!\u0016\u001b\u0018~\u0012\u001e\u0010\u0015\u0012\u001e", (short) (Od.Xd() ^ (-22682)))).getMethod(Wg.Zd("\u001f$\r[(fauZ4T;\u0013+\u0007\t%e]lZ@^", (short) (C1499aX.Xd() ^ (-27682)), (short) (C1499aX.Xd() ^ (-32192))), Class.forName(C1561oA.Kd("'\u001f5!n.$2,s\u001a<;393", (short) (ZN.Xd() ^ 7337))));
                try {
                    method3.setAccessible(true);
                    String str = (String) method3.invoke(packageManager, objArr3);
                    return str == null ? "" : str;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    synchronized String getInstallerPackageName(Context context) {
        if (this.installerPackageName == null) {
            this.installerPackageName = loadInstallerPackageName(context);
        }
        return "".equals(this.installerPackageName) ? null : this.installerPackageName;
    }
}
