package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.PendingIntentCompat;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    GoogleApiAvailabilityLight() {
    }

    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    public int getApkVersion(Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    public int getClientVersion(Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @Deprecated
    public Intent getErrorResolutionIntent(int i2) {
        return getErrorResolutionIntent(null, i2, null);
    }

    public Intent getErrorResolutionIntent(Context context, int i2, String str) throws Throwable {
        String strKd = C1561oA.Kd("(54u09:393|1?6EC>:\u0005?FM", (short) (C1633zX.Xd() ^ (-16621)));
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            int i3 = com.google.android.gms.common.internal.zzu.zza;
            Uri uriFromParts = Uri.fromParts(Wg.Zd("$<?J!21", (short) (OY.Xd() ^ 22009), (short) (OY.Xd() ^ 26835)), strKd, null);
            Intent intent = new Intent(C1561oA.Xd("\u0004\u0012\t\u0018\u0016\u0011\rW\u001e\u0011!\"\u0018\u001e\u0018%`t\u0005\u0006\u0003\u0001{z\u000f\u0005\f\f\u001e\u0004\u0006\u0016\u0004\r\u0011\u0019&\u001b\u000e\u001e\u001f\u0015\u001b\u0015\"", (short) (OY.Xd() ^ 8248)));
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && DeviceProperties.isWearableWithoutPlayStore(context)) {
            int i4 = com.google.android.gms.common.internal.zzu.zza;
            Intent intent2 = new Intent(Wg.vd("BOJ\fBKHASM\u0013GQHSQ84z17;,5NGGA\u0001<@?$m\u0012\u000e~|\r~&\t\u0013\n\u0015\u0013\n\u0006\u000e\u0007qn|\u000bil\u000b\u0001\u0004\u0004", (short) (ZN.Xd() ^ 13049)));
            intent2.setPackage(Qg.kd("#.+j#*) $\u001cc\u0016\"\u0017$ \u0019\u0013[$\u0011\f\u001c\n\n\u0013\u000bR\u0005\u0013\u0012", (short) (ZN.Xd() ^ 53), (short) (ZN.Xd() ^ 13595)));
            return intent2;
        }
        StringBuilder sb = new StringBuilder(hg.Vd("!\u001c')\u001b\u0014", (short) (OY.Xd() ^ 18685), (short) (OY.Xd() ^ 11915)));
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        String strUd = C1561oA.ud(Global.COLON, (short) (C1607wl.Xd() ^ 24076));
        sb.append(strUd);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(strUd);
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u0011\u001f\u0012!#\u001e\u0016`\u000b\u0018\u0014\u001b\u0011\u001b\u001eXb\u0010\f\u0013\t\u001d\u0016", (short) (FB.Xd() ^ 30025))).getMethod(C1561oA.Yd("#\"2\u000f!$-$+*\u0014(5.", (short) (C1633zX.Xd() ^ (-65))), new Class[0]);
            try {
                method.setAccessible(true);
                sb.append((String) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        sb.append(strUd);
        if (context != null) {
            try {
                PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(context);
                Class<?> cls = Class.forName(Xg.qd("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\r  '\u0019-*", (short) (OY.Xd() ^ 27242), (short) (OY.Xd() ^ 10638)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd = (short) (C1633zX.Xd() ^ (-18090));
                short sXd2 = (short) (C1633zX.Xd() ^ (-22511));
                int[] iArr = new int["JO)X6\u000b\u001cb4\u00058^5\u007f".length()];
                QB qb = new QB("JO)X6\u000b\u001cb4\u00058^5\u007f");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK(xuXd.CK(iKK) - ((i5 * sXd2) ^ sXd));
                    i5++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i5), clsArr);
                try {
                    method2.setAccessible(true);
                    sb.append(packageManagerWrapperPackageManager.getPackageInfo((String) method2.invoke(context, objArr2), 0).versionCode);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i6 = com.google.android.gms.common.internal.zzu.zza;
        short sXd3 = (short) (ZN.Xd() ^ 30501);
        short sXd4 = (short) (ZN.Xd() ^ 30540);
        int[] iArr2 = new int["KXPS\u0012bYg(\u000babPry qR\u001d< \u0003,{@w".length()];
        QB qb2 = new QB("KXPS\u0012bYg(\u000babPry qR\u001d< \u0003,{@w");
        int i7 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd4) + sXd3)));
            i7++;
        }
        Intent intent3 = new Intent(new String(iArr2, 0, i7));
        Uri.Builder builderAppendQueryParameter = Uri.parse(C1626yg.Ud("Tt7m8%(c;o\r\u0019O\u0004\\ ", (short) (ZN.Xd() ^ 8057), (short) (ZN.Xd() ^ 20145))).buildUpon().appendQueryParameter(Ig.wd("\u0014?", (short) (Od.Xd() ^ (-31825))), strKd);
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter(EO.Od("\u00100b\f\u0012P\"\u0012D\u0001{", (short) (OY.Xd() ^ 1405)), string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage(C1561oA.Qd("Va^\u001eP\\Q^ZSM\u0016]KSHLPH", (short) (C1580rY.Xd() ^ (-6093))));
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3) {
        return getErrorResolutionPendingIntent(context, i2, i3, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i2, int i3, String str) throws Throwable {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i2, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntentCompat.getActivity(context, i3, errorResolutionIntent, 134217728, false);
    }

    public String getErrorString(int i2) {
        return GooglePlayServicesUtilLight.getErrorString(i2);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(Context context, int i2) {
        int iIsGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i2);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i2);
    }

    public boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i2);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    public boolean isUserResolvableError(int i2) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i2);
    }

    public void verifyGooglePlayServicesIsAvailable(Context context, int i2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i2);
    }
}
