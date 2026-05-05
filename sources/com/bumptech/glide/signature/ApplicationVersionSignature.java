package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bumptech.glide.load.Key;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationVersionSignature {
    private static final ConcurrentMap<String, Key> PACKAGE_NAME_TO_KEY = new ConcurrentHashMap();
    private static final String TAG = "AppVersionSignature";

    private ApplicationVersionSignature() {
    }

    private static PackageInfo getPackageInfo(Context context) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1593ug.zd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (C1499aX.Xd() ^ (-5206)), (short) (C1499aX.Xd() ^ (-26180))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-1356));
            int[] iArr = new int["fcqL\\]dY^[BUaSXUa".length()];
            QB qb = new QB("fcqL\\]dY^[BUaSXUa");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls2 = Class.forName(C1561oA.Kd("\u001d+\"1/*&p'44;-7>x\u000f<<C5IF", (short) (C1499aX.Xd() ^ (-18925))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (OY.Xd() ^ 16552);
                short sXd3 = (short) (OY.Xd() ^ 1616);
                int[] iArr2 = new int["\u0016^\u0019\u001eZ\b;:k\u0012$b\u0018[".length()];
                QB qb2 = new QB("\u0016^\u0019\u001eZ\b;:k\u0012$b\u0018[");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls3 = Class.forName(C1561oA.Xd("+90?=84~5BBI;EL\u0007JH\n-?BKBIH1FTHON\\", (short) (Od.Xd() ^ (-4054))));
                    Class<?>[] clsArr3 = new Class[2];
                    short sXd4 = (short) (ZN.Xd() ^ 5410);
                    int[] iArr3 = new int["@6N8\u007f=5A5z#C<2:2".length()];
                    QB qb3 = new QB("@6N8\u007f=5A5z#C<2:2");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                        i4++;
                    }
                    clsArr3[0] = Class.forName(new String(iArr3, 0, i4));
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls3.getMethod(Qg.kd("30>\u0019)*1&+(\u000b/&.", (short) (ZN.Xd() ^ 19897), (short) (ZN.Xd() ^ 28847)), clsArr3);
                    try {
                        method3.setAccessible(true);
                        return (PackageInfo) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            StringBuilder sb = new StringBuilder(hg.Vd("*GSRRV\u0001RDQLHQ?xAE<Ds9AC", (short) (ZN.Xd() ^ 17745), (short) (ZN.Xd() ^ 1012)));
            Object[] objArr4 = new Object[0];
            Method method4 = Class.forName(C1561oA.ud("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (ZN.Xd() ^ 19300))).getMethod(C1561oA.yd("\u0006\u0005\u0011m{~\u0004z}|bv\u007fx", (short) (C1499aX.Xd() ^ (-22670))), new Class[0]);
            try {
                method4.setAccessible(true);
                sb.append((String) method4.invoke(context, objArr4)).toString();
                C1561oA.Yd("&VW>N\\^U\\\\BYX`Thjh\\", (short) (C1580rY.Xd() ^ (-19675)));
                return null;
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        }
    }

    private static String getVersionCode(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static Key obtain(Context context) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 28972);
        short sXd2 = (short) (C1607wl.Xd() ^ 14724);
        int[] iArr = new int["kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG]\u000b\u000b\u0012\u0004\u0018\u0015".length()];
        QB qb = new QB("kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG]\u000b\u000b\u0012\u0004\u0018\u0015");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("9D\u001fA]-\u007f=N\u0019Mg>\u0004", (short) (FB.Xd() ^ 22254), (short) (FB.Xd() ^ 7972)), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            ConcurrentMap<String, Key> concurrentMap = PACKAGE_NAME_TO_KEY;
            Key key = concurrentMap.get(str);
            if (key != null) {
                return key;
            }
            Key keyObtainVersionSignature = obtainVersionSignature(context);
            Key keyPutIfAbsent = concurrentMap.putIfAbsent(str, keyObtainVersionSignature);
            return keyPutIfAbsent == null ? keyObtainVersionSignature : keyPutIfAbsent;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Key obtainVersionSignature(Context context) {
        return new ObjectKey(getVersionCode(getPackageInfo(context)));
    }

    static void reset() {
        PACKAGE_NAME_TO_KEY.clear();
    }
}
