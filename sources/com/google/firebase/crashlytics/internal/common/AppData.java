package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class AppData {
    public final String buildId;
    public final List<BuildIdInfo> buildIdInfoList;
    public final DevelopmentPlatformProvider developmentPlatformProvider;
    public final String googleAppId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public AppData(String str, String str2, List<BuildIdInfo> list, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.googleAppId = str;
        this.buildId = str2;
        this.buildIdInfoList = list;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
        this.developmentPlatformProvider = developmentPlatformProvider;
    }

    public static AppData create(Context context, IdManager idManager, String str, String str2, List<BuildIdInfo> list, DevelopmentPlatformProvider developmentPlatformProvider) throws Throwable {
        String str3;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("Q'/d9pGxi\u0019\u0016:Zm\u000b#|\u0013j\u0019D$}", (short) (C1499aX.Xd() ^ (-12747)))).getMethod(C1561oA.Qd("ebpK[\\cX]ZBT_V", (short) (Od.Xd() ^ (-25022))), new Class[0]);
        try {
            method.setAccessible(true);
            String str4 = (String) method.invoke(context, objArr);
            String installerPackageName = idManager.getInstallerPackageName();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (FB.Xd() ^ 21058), (short) (FB.Xd() ^ 3679))).getMethod(C1561oA.od("\r\n\u0018r\u0003\u0004\u000b\u007f\u0005\u0002h{\by~{\b", (short) (C1580rY.Xd() ^ (-27313))), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                Class<?> cls = Class.forName(C1561oA.Kd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Z\u001e\u001c]\u0001\u0013\u0016\u001f\u0016\u001d\u001c\u0005\u001a(\u001c#\"0", (short) (ZN.Xd() ^ 31183)));
                Class<?>[] clsArr = {Class.forName(Wg.Zd("4Sx\n\u000fby;N9\u0010Wo\u001dCP", (short) (Od.Xd() ^ (-19424)), (short) (Od.Xd() ^ (-3424)))), Integer.TYPE};
                Object[] objArr3 = {str4, 0};
                short sXd = (short) (ZN.Xd() ^ 25779);
                int[] iArr = new int["`_oL^ajahgLrku".length()];
                QB qb = new QB("`_oL^ajahgLrku");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                Method method3 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method3.setAccessible(true);
                    PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                    String appBuildVersion = getAppBuildVersion(packageInfo);
                    if (packageInfo.versionName == null) {
                        short sXd2 = (short) (C1607wl.Xd() ^ 28771);
                        int[] iArr2 = new int[".-,".length()];
                        QB qb2 = new QB(".-,");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        str3 = new String(iArr2, 0, i3);
                    } else {
                        str3 = packageInfo.versionName;
                    }
                    return new AppData(str, str2, list, installerPackageName, str4, appBuildVersion, str3, developmentPlatformProvider);
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

    private static String getAppBuildVersion(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
