package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.firebase.FirebaseError;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Pair;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1kSDK {
    public static long AFAdRevenueData(Context context, String str) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("dpernga*^igl\\di\"6a_dTfa", (short) (Od.Xd() ^ (-23477)))).getMethod(C1593ug.zd("('7\u0014&)2)0/\u0018-;/65C", (short) (ZN.Xd() ^ 17735), (short) (ZN.Xd() ^ 13705)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (ZN.Xd() ^ 8799);
                int[] iArr = new int["\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015M\u000f\u000bJk{|\u0004x}zat\u0001rwt\u0001".length()];
                QB qb = new QB("\u0010\u001c\u0011\u001e\u001a\u0013\rU\n\u0015\u0013\u0018\b\u0010\u0015M\u000f\u000bJk{|\u0004x}zat\u0001rwt\u0001");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(C1561oA.Kd("D<R>\fKAOI\u00117YXPVP", (short) (C1607wl.Xd() ^ 402)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls.getMethod(Wg.Zd("OE\f/\u00181\u0001N\u001cQ-\u001aI*", (short) (Od.Xd() ^ (-25507)), (short) (Od.Xd() ^ (-21906))), clsArr);
                try {
                    method2.setAccessible(true);
                    return Build.VERSION.SDK_INT >= 28 ? ((PackageInfo) method2.invoke(packageManager, objArr2)).getLongVersionCode() : r2.versionCode;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            return 0L;
        }
    }

    public static boolean L_(Context context, Intent intent) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("`netrmi4jww~pz\u0002<R\u007f\u007f\u0007x\r\n", (short) (C1633zX.Xd() ^ (-24897)))).getMethod(Wg.vd("\u0018\u0017#\u007f\u0016\u0019\u001e\u0015 \u001f\u0004\u0019+\u001f\"!3", (short) (C1580rY.Xd() ^ (-7460))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {intent, 0};
            Method method2 = Class.forName(Qg.kd("DPERNGA\n>IGL<DI\u0002C?~ 018-2/\u0016)5',)5", (short) (C1499aX.Xd() ^ (-14000)), (short) (C1499aX.Xd() ^ (-15646)))).getMethod(C1561oA.ud("CF5AG\u0016:?/7<\u001a+7:,%&3", (short) (Od.Xd() ^ (-14381))), Class.forName(hg.Vd("BNCPLE?\b<GEJ:BG\u007f\u001a>C3;@", (short) (C1607wl.Xd() ^ 24588), (short) (C1607wl.Xd() ^ 28478))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                return ((List) method2.invoke(packageManager, objArr2)).size() > 0;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> M_(android.content.pm.PackageInfo r10, java.util.Map<java.lang.String, java.lang.String> r11, android.net.Uri r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1kSDK.M_(android.content.pm.PackageInfo, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static String N_(PackageManager packageManager, String str) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.yd("z\t{\u000b\r\b\u007fJ\u0005\u0012\u000e\u0015\u000b\u0015\u0018R\u001a\u0018Ux\u000f\u0012\u0017\u000e\u0019\u0018|\u0012$\u0018\u001b\u001a,", (short) (ZN.Xd() ^ 13682)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (C1580rY.Xd() ^ (-31717));
        int[] iArr = new int["}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n".length()];
        QB qb = new QB("}u\fwE\u0005z\t\u0003Jp\u0013\u0012\n\u0010\n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {str, 64};
        Method method = cls.getMethod(Xg.qd("wv\u0007cux\u0002x\u007f~c\n\u0003\r", (short) (C1607wl.Xd() ^ 3489), (short) (C1607wl.Xd() ^ 20150)), clsArr);
        try {
            method.setAccessible(true);
            Signature[] signatureArr = ((PackageInfo) method.invoke(packageManager, objArr)).signatures;
            if (signatureArr == null) {
                return null;
            }
            short sXd2 = (short) (Od.Xd() ^ (-31657));
            short sXd3 = (short) (Od.Xd() ^ (-8192));
            int[] iArr2 = new int["zORL\u0019".length()];
            QB qb2 = new QB("zORL\u0019");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                i3++;
            }
            String str2 = new String(iArr2, 0, i3);
            Class<?> cls2 = Class.forName(ZO.xd("\u001d\nJAS\u0010\u001cHS{\u0012th\u0011O\bh9onHN{H.\u001aXY\u001b\u0012Z@b\u001d\u001c*\u000e", (short) (C1607wl.Xd() ^ 10598), (short) (C1607wl.Xd() ^ 4460)));
            Class<?>[] clsArr2 = {Class.forName(C1626yg.Ud("\u001c\u0014u\u000bnz=;\fj(TR~\u001cM", (short) (C1499aX.Xd() ^ (-7459)), (short) (C1499aX.Xd() ^ (-28782))))};
            Object[] objArr2 = {str2};
            short sXd4 = (short) (OY.Xd() ^ 16877);
            int[] iArr3 = new int["\u007fPkj\u000eM$\b=d^".length()];
            QB qb3 = new QB("\u007fPkj\u000eM$\b=d^");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                i4++;
            }
            Method declaredMethod = cls2.getDeclaredMethod(new String(iArr3, 0, i4), clsArr2);
            try {
                declaredMethod.setAccessible(true);
                CertificateFactory certificateFactory = (CertificateFactory) declaredMethod.invoke(null, objArr2);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signatureArr[0].toByteArray());
                Class<?> cls3 = Class.forName(EO.Od("V}GO}\u0011L<y8/V\u000b;\u0007(j\roZ8\u0003QD\u001c\u0001_\"\u0015z5/\u001b\rW\u001b\u0005", (short) (C1607wl.Xd() ^ 27215)));
                Class<?>[] clsArr3 = {Class.forName(C1561oA.Qd("~t\tr>x};Uyz~|Zzwido", (short) (C1633zX.Xd() ^ (-27659))))};
                Object[] objArr3 = {byteArrayInputStream};
                short sXd5 = (short) (FB.Xd() ^ 31195);
                short sXd6 = (short) (FB.Xd() ^ 13434);
                int[] iArr4 = new int["~}\b\u007f\u000e}\u0012\u0004b\u0006\u0014\u0017\r\u000b\u000f\n\t\u001d\u000f".length()];
                QB qb4 = new QB("~}\b\u007f\u000e}\u0012\u0004b\u0006\u0014\u0017\r\u000b\u000f\n\t\u001d\u000f");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) - sXd6);
                    i5++;
                }
                Method method2 = cls3.getMethod(new String(iArr4, 0, i5), clsArr3);
                try {
                    method2.setAccessible(true);
                    X509Certificate x509Certificate = (X509Certificate) ((Certificate) method2.invoke(certificateFactory, objArr3));
                    MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.od("nbZJLL", (short) (C1607wl.Xd() ^ 18592)));
                    Object[] objArr4 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Kd("0(>*w>10CA9EK\u00017:HK\u0006\u001c?MPFDHCBVH", (short) (OY.Xd() ^ 19633))).getMethod(Wg.Zd("t@)_sG=\baB", (short) (ZN.Xd() ^ 26059), (short) (ZN.Xd() ^ 2051)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        messageDigest.update((byte[]) method3.invoke(x509Certificate, objArr4));
                        return String.format(C1561oA.Xd("[gkk\u0013", (short) (OY.Xd() ^ 22652)), new BigInteger(1, messageDigest.digest()));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public static Application O_(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            Class<?> cls = Class.forName(Wg.vd("ESJYOJF\u0011O\\\\cMW^\u00197ddkUif", (short) (FB.Xd() ^ 20328)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (FB.Xd() ^ 8147);
            short sXd2 = (short) (FB.Xd() ^ IDStepResponseCodes.STEP_RESULT_BIOMETRY_NOT_MET);
            int[] iArr = new int["HES\u001fMLGC<9K?DB\u0016A?D4FA".length()];
            QB qb = new QB("HES\u001fMLGC<9K?DB\u0016A?D4FA");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                return (Application) ((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog(hg.Vd("~-,'#\u001c\u0019+\u001f$\"R!#Oo\u0011!\u0015!\u0013\u001d!Fh\u0014\u0012\u0017\u0007\u0019\u0014>\u0011\u0005\u000b\u0010\u0006|7xz4\t\u0006vt", (short) (C1580rY.Xd() ^ (-18193)), (short) (C1580rY.Xd() ^ (-6509))), new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Pair<Long, String> getMediationNetwork(Context context, String str) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("`lanjc]&ZechX`e\u001e2][`Pb]", (short) (C1499aX.Xd() ^ (-23707)))).getMethod(C1561oA.yd("jiyVhktkbaJ_mahge", (short) (ZN.Xd() ^ 31240)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd = (short) (C1580rY.Xd() ^ (-15681));
                int[] iArr = new int["u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Q\u0015\u0013Tw\n\r\u0016\r\u0014\u0013{\u0011\u001f\u0013\u001a\u0019'".length()];
                QB qb = new QB("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Q\u0015\u0013Tw\n\r\u0016\r\u0014\u0013{\u0011\u001f\u0013\u001a\u0019'");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Xg.qd("QI_K\u0019XN\\V\u001eDfe]c]", (short) (C1607wl.Xd() ^ 27755), (short) (C1607wl.Xd() ^ 26632)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                short sXd2 = (short) (C1607wl.Xd() ^ 26733);
                short sXd3 = (short) (C1607wl.Xd() ^ FirebaseError.ERROR_WRONG_PASSWORD);
                int[] iArr2 = new int["\u0018V\u000b&{\u0013J\u0005Pm\u0006`\bU".length()];
                QB qb2 = new QB("\u0018V\u000b&{\u0013J\u0005Pm\u0006`\bU");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    PackageInfo packageInfo = (PackageInfo) method2.invoke(packageManager, objArr2);
                    return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    public static boolean getMediationNetwork(Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMonetizationNetwork(Context context, String str) throws Throwable {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        Class<?> cls = Class.forName(ZO.xd("qj@\u001bJMmz)WtewZ\u001d\u001aua\u0019C;\tQ", (short) (C1580rY.Xd() ^ (-11393)), (short) (C1580rY.Xd() ^ (-8068))));
        Class<?>[] clsArr = new Class[3];
        short sXd = (short) (OY.Xd() ^ 16817);
        short sXd2 = (short) (OY.Xd() ^ 12521);
        int[] iArr = new int["\u0011h\u001d3\u0001i/\n/\u0012&Yse~(".length()];
        QB qb = new QB("\u0011h\u001d3\u0001i/\n/\u0012&Yse~(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        clsArr[2] = Integer.TYPE;
        Object[] objArr = {str, Integer.valueOf(iMyPid), Integer.valueOf(iMyUid)};
        Method method = cls.getMethod(Ig.wd("nLYq '*\u0016A{\n*TJO", (short) (FB.Xd() ^ 10803)), clsArr);
        try {
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(context, objArr)).intValue();
            short sXd3 = (short) (OY.Xd() ^ 9588);
            int[] iArr2 = new int["yS\u0010]\u0016P-\u0013{^P6\u007f1,F}\u0002O\u001aY>\u001fq6".length()];
            QB qb2 = new QB("yS\u0010]\u0016P-\u0013{^P6\u007f1,F}\u0002O\u001aY>\u001fq6");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
                i3++;
            }
            AFLogger.afRDLog(new StringBuilder(new String(iArr2, 0, i3)).append(str).append(C1561oA.Qd("\u001f\u0003TFS\u0019}", (short) (C1580rY.Xd() ^ (-19329)))).append(iIntValue).toString());
            return iIntValue == 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String getRevenue(Context context, String str) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1593ug.zd("\u001a(\u001f.,'#m$118*4;u\f99@2FC", (short) (C1633zX.Xd() ^ (-29484)), (short) (C1633zX.Xd() ^ (-7491))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (OY.Xd() ^ 7521);
            int[] iArr = new int["~{\ndtu|qvsZmykpmy".length()];
            QB qb = new QB("~{\ndtu|qvsZmykpmy");
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
                Class<?> cls2 = Class.forName(C1561oA.Kd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o31r\u0016(+4+21\u001a/=187E", (short) (C1580rY.Xd() ^ (-8370))));
                Class<?>[] clsArr2 = new Class[2];
                short sXd2 = (short) (OY.Xd() ^ 2139);
                short sXd3 = (short) (OY.Xd() ^ 9522);
                int[] iArr2 = new int["6\u001d8\u0010`,\u0007$\"V\u0001\u000e\u0012\u0016\u0003\t".length()];
                QB qb2 = new QB("6\u001d8\u0010`,\u0007$\"V\u0001\u000e\u0012\u0016\u0003\t");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i3));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls2.getMethod(C1561oA.Xd("\u0017\u0016&\u0003\u0015\u0018!\u0018\u001f\u001e\u0003)\",", (short) (C1580rY.Xd() ^ (-27184))), clsArr2);
                try {
                    method2.setAccessible(true);
                    return ((PackageInfo) method2.invoke(packageManager, objArr2)).versionName;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4);
            return "";
        }
    }

    public static boolean getRevenue() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean getRevenue(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(Wg.vd("\u0012 \u0017&$\u001f\u001be\u001c))0\",3mc\u0011\u0011\u0018\n\u001e\u001b", (short) (FB.Xd() ^ 20284))).getMethod(Qg.kd("sp~JxwrngdvjomAljo_ql", (short) (Od.Xd() ^ (-15745)), (short) (Od.Xd() ^ (-5084))), new Class[0]);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    short sXd = (short) (C1607wl.Xd() ^ 12770);
                    short sXd2 = (short) (C1607wl.Xd() ^ 25528);
                    int[] iArr = new int[" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d".length()];
                    QB qb = new QB(" ,!.*#\u001de\u001a%#(\u0018 %]q\u001d\u001b \u0010\"\u001d");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                        i2++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(C1561oA.ud("yo\u0004m9vjvn4Hpdut", (short) (OY.Xd() ^ 20107)));
                    Object[] objArr2 = {MeasurementManager.class};
                    Method method2 = cls.getMethod(C1561oA.yd("=:L*SLP@K0EQXJGH", (short) (C1580rY.Xd() ^ (-24032))), clsArr);
                    try {
                        method2.setAccessible(true);
                        return ((MeasurementManager) method2.invoke(context2, objArr2)) != null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }
}
