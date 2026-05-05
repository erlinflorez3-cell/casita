package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
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

/* JADX INFO: loaded from: classes8.dex */
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static boolean zza = false;
    private static boolean zzb = false;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    GooglePlayServicesUtilLight() {
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        String strUd = C1561oA.ud("ddh\\XZSPbV[Y", (short) (FB.Xd() ^ 30699));
        try {
            Class<?> cls = Class.forName(C1561oA.yd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I}\t\u0007\f{\u0004\tAu!\u001f$\u0014&!", (short) (FB.Xd() ^ 9788)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Yd("VNdP\u001e]Sa[#Ikjbhb", (short) (C1580rY.Xd() ^ (-28489))));
            Object[] objArr = {strUd};
            Method method = cls.getMethod(Xg.qd("21A!HCE7@':HMA<?", (short) (C1633zX.Xd() ^ (-14045)), (short) (C1633zX.Xd() ^ (-13995))), clsArr);
            try {
                method.setAccessible(true);
                NotificationManager notificationManager = (NotificationManager) method.invoke(context, objArr);
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (SecurityException e3) {
            Jg.Wd("\t\rTl=\u0012\bs\u0015x*O$D\u0007\\yWQ@\r\u001f", (short) (C1499aX.Xd() ^ (-3062)), (short) (C1499aX.Xd() ^ (-16755)));
            ZO.xd("gAk\u0018\u0011=!\u001b.\u0018X6\u0002JCnys\u0015.\u0010\u00048m\u000bOm-.^F{eCK\u0003M0\u0013-8\u001cf\u0015R|\u0014K9\u001c e\u0005*RD;!5H(HICg1i7%BM\u001f~\b", (short) (OY.Xd() ^ 5553), (short) (OY.Xd() ^ 31734));
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i2);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            String str = "GooglePlayServices not available due to error " + iIsGooglePlayServicesAvailable;
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) throws Throwable {
        try {
            Class<?> cls = Class.forName(C1626yg.Ud("?`$\u0017L%L6S\u0013\u0017[w7\u0004\u0018zh<iHp\u000f", (short) (Od.Xd() ^ (-24785)), (short) (Od.Xd() ^ (-9484))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1633zX.Xd() ^ (-7547));
            int[] iArr = new int["*w#\u0018W%\u001bN2-\u001dM,\u001b3H!".length()];
            QB qb = new QB("*w#\u0018W%\u001bN2-\u001dM,\u001b3H!");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                short sXd2 = (short) (OY.Xd() ^ 9073);
                int[] iArr2 = new int["\u0002]oM\nO)\u0003C]&u24wU\u0014~#\"b7".length()];
                QB qb2 = new QB("\u0002]oM\nO)\u0003C]&u24wU\u0014~#\"b7");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str = new String(iArr2, 0, i3);
                Class<?> cls2 = Class.forName(C1561oA.Qd("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L\u000e\nIjz{\u0003w|y`s\u007fqvs\u007f", (short) (Od.Xd() ^ (-31852))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(C1593ug.zd("yq\bsA\u0001v\u0005~Fl\u000f\u000e\u0006\f\u0006", (short) (C1607wl.Xd() ^ 22089), (short) (C1607wl.Xd() ^ 13817)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls2.getMethod(C1561oA.od("41?\u001a*+2',)\f0'/", (short) (C1580rY.Xd() ^ (-13447))), clsArr2);
                try {
                    method2.setAccessible(true);
                    return ((PackageInfo) method2.invoke(packageManager, objArr2)).versionCode;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            C1561oA.Kd("\u0017@A:@:&C9R-@NSGBET7WMQ", (short) (C1633zX.Xd() ^ (-7361)));
            short sXd3 = (short) (C1499aX.Xd() ^ (-2191));
            short sXd4 = (short) (C1499aX.Xd() ^ (-15178));
            int[] iArr3 = new int["I@\u0015Y5;\u000b\u0006z{h\u001eF\u0005%yAF`;<P4-M\u0016xC\u000ec1\u0003".length()];
            QB qb3 = new QB("I@\u0015Y5;\u000b\u0006z{h\u001eF\u0005%yAF`;<P4-M\u0016xC\u000ec1\u0003");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                i4++;
            }
            new String(iArr3, 0, i4);
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) throws Throwable {
        Preconditions.checkState(true);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("\u0005\u0013\n\u0019\u0017\u0012\u000eX\u000f\u001c\u001c#\u0015\u001f&`v$$+\u001d1.", (short) (Od.Xd() ^ (-6806)))).getMethod(Wg.vd("1.<\u0017'(/$)&\u000e +\"", (short) (ZN.Xd() ^ 19616)), new Class[0]);
        try {
            method.setAccessible(true);
            return ClientLibraryUtils.getClientVersion(context, (String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i2, i3);
    }

    @Deprecated
    public static String getErrorString(int i2) {
        return ConnectionResult.zza(i2);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i2, null);
    }

    public static Context getRemoteContext(Context context) throws Throwable {
        String strKd = Qg.kd("v\u0002~>v}|swo7iujwslf/glq", (short) (ZN.Xd() ^ 31932), (short) (ZN.Xd() ^ 11827));
        try {
            Class<?> cls = Class.forName(hg.Vd("5A6C?82z/:8=-5:r\u0007205%72", (short) (FB.Xd() ^ 17220), (short) (FB.Xd() ^ 24393)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.ud("e[oY%bVbZ DdaW[S", (short) (C1607wl.Xd() ^ 4389)));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {strKd, 3};
            Method method = cls.getMethod(C1561oA.yd("q\u007fup\u0007vdtipinoL{yrbxs", (short) (ZN.Xd() ^ 18281)), clsArr);
            try {
                method.setAccessible(true);
                return (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-2931));
        int[] iArr = new int["cqhwupl7mzz\u0002s}\u0005?U\u0003\u0003\n{\u0010\r".length()];
        QB qb = new QB("cqhwupl7mzz\u0002s}\u0005?U\u0003\u0003\n{\u0010\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1499aX.Xd() ^ (-1787));
            short sXd3 = (short) (C1499aX.Xd() ^ (-19793));
            int[] iArr2 = new int["}|\ri{~\b~\u0006\u0005m\u0003\u0011\u0005\f\u000b\u0019".length()];
            QB qb2 = new QB("}|\ri{~\b~\u0006\u0005m\u0003\u0011\u0005\f\u000b\u0019");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String strWd = Jg.Wd("\u00107_;\t<V\u0007/B\u0016u&f=eaw}R\u001b9", (short) (OY.Xd() ^ 25532), (short) (OY.Xd() ^ 2509));
                Class<?> cls2 = Class.forName(ZO.xd("\b\u0010~\u001er\u0018c;~\u0013#J\u0017?!>\u001a\u001dj}\u00024\b$&\u0003'\u0001C\r\u001f7\u0010", (short) (ZN.Xd() ^ 31078), (short) (ZN.Xd() ^ 21438)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1626yg.Ud("l#\u0003\n\"\u0014W2:dwg)W[~", (short) (OY.Xd() ^ 1037), (short) (OY.Xd() ^ 21202)));
                Object[] objArr2 = {strWd};
                Method method2 = cls2.getMethod(Ig.wd("\u0003[<q\u0004Me\u001bE\u0006\u000ey\u001aMT\u0001\bmAF}G,!\u0001j", (short) (C1633zX.Xd() ^ (-32212))), clsArr2);
                try {
                    method2.setAccessible(true);
                    return (Resources) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zza) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            } finally {
                zza = true;
            }
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x0418  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r21, int r22) {
        /*
            Method dump skipped, instruction units count: 1531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i2) {
        return UidVerifier.isGooglePlayServicesUid(context, i2);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        if (i2 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-8414));
        short sXd2 = (short) (C1580rY.Xd() ^ (-7552));
        int[] iArr = new int["#\u00123%".length()];
        QB qb = new QB("#\u00123%");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(ZO.xd("Dm\u0006%\u0017]\u0002\u0003\b=.$W\u0012\u000fcPg\u0005r\u0003<.", (short) (C1499aX.Xd() ^ (-30776)), (short) (C1499aX.Xd() ^ (-15271)))).getMethod(Ig.wd("\u0013KH\u0003\u0010]vh!);l!\u00184^", (short) (FB.Xd() ^ 30666)), Class.forName(C1626yg.Ud("\u0019A\u0010&\u001c#EH|\f\u0016)\\,%l", (short) (C1499aX.Xd() ^ (-8650)), (short) (C1499aX.Xd() ^ (-26821)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Preconditions.checkNotNull(objInvoke);
            UserManager userManager = (UserManager) objInvoke;
            Class<?> cls = Class.forName(EO.Od("0\u000b\u00059i\bd!\t7\rx94*I$:\u0001n#\u0002c", (short) (C1633zX.Xd() ^ (-27280))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (Od.Xd() ^ (-11115));
            int[] iArr2 = new int[" \u001d+\u0006\u0016\u0017\u001e\u0013\u0018\u0015|\u000f\u001a\u0011".length()];
            QB qb2 = new QB(" \u001d+\u0006\u0016\u0017\u001e\u0013\u0018\u0015|\u000f\u001a\u0011");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                Bundle applicationRestrictions = userManager.getApplicationRestrictions((String) method2.invoke(context, objArr2));
                return applicationRestrictions != null && C1593ug.zd("QPTE", (short) (C1499aX.Xd() ^ (-11832)), (short) (C1499aX.Xd() ^ (-2389))).equals(applicationRestrictions.getString(C1561oA.od("`R__\\RK[KICSTPFHJB", (short) (OY.Xd() ^ 15560))));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i2, String str) {
        return UidVerifier.uidHasPackageName(context, i2, str);
    }

    static boolean zza(Context context, String str) throws Throwable {
        Object[] objArr;
        Method method;
        Object obj;
        Object obj2;
        boolean zEquals = str.equals(C1561oA.Kd("O\\[\u001dW`aZ`Z$Xf]ljea,fmt", (short) (C1633zX.Xd() ^ (-4669))));
        try {
            Class<?> cls = Class.forName(Wg.Zd("V\u0011>y\u001aAsjC~3dz5pU\u0012k\u001eQi*Y", (short) (C1607wl.Xd() ^ 20831), (short) (C1607wl.Xd() ^ 14288)));
            Class<?>[] clsArr = new Class[0];
            objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-8581));
            int[] iArr = new int["+*:\u0017),5,32\u001b0>298F".length()];
            QB qb = new QB("+*:\u0017),5,32\u001b0>298F");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.vd("\u0007\u0015\b\u0017\u0019\u0014\fV\u0001\u000e\n\u0011\u0007\u0011\u0014N&$a\u0005\u001b\u001e#\u001a\u0015\u0014x\u000e \u0014\u0017\u0016w", (short) (ZN.Xd() ^ 7269))).getMethod(Qg.kd("\u0011\u000e\u001cv\u0007\b\u000f\u0004\t\u0006h\r\u0011\u0011|\u0007\u0006}\n", (short) (C1633zX.Xd() ^ (-22382)), (short) (C1633zX.Xd() ^ (-3617))), new Class[0]);
            try {
                method2.setAccessible(true);
                Iterator<PackageInstaller.SessionInfo> it = ((PackageInstaller) method2.invoke(packageManager, objArr2)).getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(hg.Vd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1580rY.Xd() ^ (-3953)), (short) (C1580rY.Xd() ^ (-9425)))).getMethod(C1561oA.ud("_\\jEUV]RWT;NZLQNZ", (short) (C1580rY.Xd() ^ (-27157))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                    Class<?> cls2 = Class.forName(C1561oA.yd("\n\u0018\u000f\u001e\u0014\u000f\u000bU\u0004\u0011\u0011\u0018\u0002\f\u0013M)'h\f\u0016\u0019\"\u0019\u0018\u0017\u007f\u0015\u001b\u000f\u0016\u0015;", (short) (C1499aX.Xd() ^ (-10912))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1561oA.Yd("\u0003z\u0011|J\n\u007f\u000e\bOu\u0018\u0017\u000f\u0015\u000f", (short) (C1633zX.Xd() ^ (-5393))));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr4 = {str, 8192};
                    Method method4 = cls2.getMethod(Xg.qd("\\[k9ijge`_sippLrku", (short) (Od.Xd() ^ (-17424)), (short) (Od.Xd() ^ (-12077))), clsArr2);
                    try {
                        method4.setAccessible(true);
                        ApplicationInfo applicationInfo = (ApplicationInfo) method4.invoke(packageManager2, objArr4);
                        if (!zEquals) {
                            String strUd = C1626yg.Ud("Y\u0010\u007fk\"<\u0016>*VT\u0002\u0003\r\"oZfg\u001c\fFg\u000e\n%N\u0018;b\\.3b", (short) (Od.Xd() ^ (-31561)), (short) (Od.Xd() ^ (-5590)));
                            String strWd = Ig.wd("_58Z2nS", (short) (Od.Xd() ^ (-31970)));
                            try {
                                Class<?> cls3 = Class.forName(strUd);
                                Field field = 1 != 0 ? cls3.getField(strWd) : cls3.getDeclaredField(strWd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            return ((Boolean) obj).booleanValue() && !isRestrictedUserProfile(context);
                        }
                        short sXd2 = (short) (ZN.Xd() ^ 621);
                        short sXd3 = (short) (ZN.Xd() ^ 28861);
                        int[] iArr2 = new int["x&.\u001d(\u0003\u0012m\u007f\u001c\u0002\u0018#|\u001b3\u0002!8igw\u0016e}J\u0002\u000b]z,q6_".length()];
                        QB qb2 = new QB("x&.\u001d(\u0003\u0012m\u007f\u001c\u0002\u0018#|\u001b3\u0002!8igw\u0016e}J\u0002\u000b]z,q6_");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                            i3++;
                        }
                        String str2 = new String(iArr2, 0, i3);
                        String strXd = ZO.xd("\\^\u0019A\b\u0015a", (short) (OY.Xd() ^ 10462), (short) (OY.Xd() ^ 3113));
                        try {
                            Class<?> cls4 = Class.forName(str2);
                            Field field2 = 1 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                            field2.setAccessible(true);
                            obj2 = field2.get(applicationInfo);
                        } catch (Throwable th2) {
                            obj2 = null;
                        }
                        return ((Boolean) obj2).booleanValue();
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
}
