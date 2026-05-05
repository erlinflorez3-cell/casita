package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes4.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    static PackageManager.ComponentInfoFlags of(long j2) {
        return PackageManager.ComponentInfoFlags.of(j2);
    }

    static ServiceInfo getServiceInfo(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws Throwable {
        short sXd = (short) (OY.Xd() ^ 4671);
        int[] iArr = new int["G\u0005\u001dRO~M\u0017o/$Pp{\"\u0001x\u007fXB\u0016dB<\u0015\u0007Q:\tnH-\u001a".length()];
        QB qb = new QB("G\u0005\u001dRO~M\u0017o/$Pp{\"\u0001x\u007fXB\u0016dB<\u0015\u0007Q:\tnH-\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[2];
        clsArr[0] = Class.forName(C1561oA.Qd("\u0001\r\u0002\u000f\u000b\u0004}Fz\u0006\u0004\tx\u0001\u0006>R}z|zxnv{Tfqh", (short) (C1580rY.Xd() ^ (-16878))));
        short sXd2 = (short) (C1607wl.Xd() ^ 2163);
        short sXd3 = (short) (C1607wl.Xd() ^ 7572);
        int[] iArr2 = new int["-;2A?:6\u00017DDK=GN\tLJ\f/ADMDKJ3HVJQP^\u00111^]aaaYcj@f_iAh^er".length()];
        QB qb2 = new QB("-;2A?:6\u00017DDK=GN\tLJ\f/ADMDKJ3HVJQP^\u00111^]aaaYcj@f_iAh^er");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {componentName, componentInfoFlags};
        Method method = cls.getMethod(C1561oA.od("`]kIZfi[TU8\\S[", (short) (C1607wl.Xd() ^ 9019)), clsArr);
        try {
            method.setAccessible(true);
            return (ServiceInfo) method.invoke(packageManager, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
