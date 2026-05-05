package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1zSDK {
    private final String AFAdRevenueData;
    private final Map<String, Object> getCurrencyIso4217Code;
    private final PackageManager getMediationNetwork;

    public AFg1zSDK(AFc1hSDK aFc1hSDK, AFc1oSDK aFc1oSDK) throws Throwable {
        PackageManager packageManager;
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        this.getCurrencyIso4217Code = new LinkedHashMap();
        Context context = aFc1hSDK.getMonetizationNetwork;
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("Av`UK\u0012\u0017\u001bz\n\tj\n\u000f\u000b%n3\\\u0019D\u0016\u001e", (short) (C1633zX.Xd() ^ (-4242)))).getMethod(C1561oA.Qd("sp~YijqfkhObn`ebn", (short) (C1633zX.Xd() ^ (-9795))), new Class[0]);
            try {
                method.setAccessible(true);
                packageManager = (PackageManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            packageManager = null;
        }
        this.getMediationNetwork = packageManager;
        Context context2 = aFc1oSDK.getCurrencyIso4217Code.getMonetizationNetwork;
        Class<?> cls = Class.forName(C1593ug.zd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (Od.Xd() ^ (-32168)), (short) (Od.Xd() ^ (-5547))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 9123);
        int[] iArr = new int["KHV1ABI>C@(:E<".length()];
        QB qb = new QB("KHV1ABI>C@(:E<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method2.setAccessible(true);
            String str = (String) method2.invoke(context2, objArr2);
            Intrinsics.checkNotNullExpressionValue(str, "");
            this.AFAdRevenueData = str;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final Map<String, Object> getRevenue() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.AFAdRevenueData;
            PackageManager packageManager = this.getMediationNetwork;
            if (packageManager == null) {
                return linkedHashMap;
            }
            Class<?> cls = Class.forName(C1561oA.Kd("KYP_]XT\u001fUbbi[el'jh*M_bkbihQfthon|", (short) (Od.Xd() ^ (-11097))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd(".lQ\u000e*.rQ\u001a&\u001b\u000fZ\u0015k8", (short) (FB.Xd() ^ 12169), (short) (FB.Xd() ^ 21749)));
            Object[] objArr = {str};
            Method method = cls.getMethod(C1561oA.Xd("$#3\t/57%12\u001a7><.1\u0016<5?", (short) (C1607wl.Xd() ^ 9367)), clsArr);
            try {
                method.setAccessible(true);
                InstallSourceInfo installSourceInfo = (InstallSourceInfo) method.invoke(packageManager, objArr);
                if (installSourceInfo == null) {
                    return linkedHashMap;
                }
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String strVd = Wg.vd("\u0019\u001f\u0017#\u001d\u0016&\u001c& \u0015'\u001d %\u001c'&", (short) (C1580rY.Xd() ^ (-31972)));
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put(strVd, initiatingPackageName);
                }
                String strKd = Qg.kd("koss_ihdh`WgWX_TYV", (short) (FB.Xd() ^ 24097), (short) (FB.Xd() ^ 22071));
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put(strKd, installingPackageName);
                }
                short sXd = (short) (OY.Xd() ^ 16824);
                short sXd2 = (short) (OY.Xd() ^ 12853);
                int[] iArr = new int["8:0-.2$6*.&\u001d-\u001d\u001e%\u001a\u001f\u001c".length()];
                QB qb = new QB("8:0-.2$6*.&\u001d-\u001d\u001e%\u001a\u001f\u001c");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                    i2++;
                }
                String str2 = new String(iArr, 0, i2);
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put(str2, originatingPackageName);
                }
                return linkedHashMap2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, C1561oA.ud("\u0013-46.,f:4c*'5_3&\"[\u001c*)W $((\u0014\u001e\u001dO\"\u001d\"\u001e\u000e\u000fH\u0011\u0015\f\u0014", (short) (C1633zX.Xd() ^ (-9755))), th, true, false, true, true, 16, null);
            return linkedHashMap;
        }
    }

    public final Map<String, Object> AFAdRevenueData() throws Throwable {
        if (this.getCurrencyIso4217Code.isEmpty()) {
            try {
                PackageManager packageManager = this.getMediationNetwork;
                if (packageManager != null) {
                    String str = this.AFAdRevenueData;
                    Class<?> cls = Class.forName(C1561oA.yd("\u007f\f\u0005\u0012\n\u0003\u0001Iy\u0005\u0007\fw\u007f\tA~z>_klwlmjUhpbkh1", (short) (FB.Xd() ^ 4270)));
                    Class<?>[] clsArr = new Class[1];
                    short sXd = (short) (ZN.Xd() ^ OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE_VALID);
                    int[] iArr = new int["TLbN\u001c[Q_Y!Gih`f`".length()];
                    QB qb = new QB("TLbN\u001c[Q_Y!Gih`f`");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    Object[] objArr = {str};
                    Method method = cls.getMethod(Xg.qd("{z\u000b`\u0007\r\u000f|\t\n\u0004\u0012p\u0003\u0006\u000f\u0006\r\fu\n\u0017\u0010", (short) (ZN.Xd() ^ 26158), (short) (ZN.Xd() ^ 11557)), clsArr);
                    try {
                        method.setAccessible(true);
                        String str2 = (String) method.invoke(packageManager, objArr);
                        if (str2 != null) {
                            Map<String, Object> map = this.getCurrencyIso4217Code;
                            short sXd2 = (short) (Od.Xd() ^ (-4091));
                            short sXd3 = (short) (Od.Xd() ^ (-373));
                            int[] iArr2 = new int["\u0004\u001aF\r/`'B\u0005W\u00107}(e!D".length()];
                            QB qb2 = new QB("\u0004\u001aF\r/`'B\u0005W\u00107}(e!D");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
                                i3++;
                            }
                            map.put(new String(iArr2, 0, i3), str2);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (Exception e3) {
                short sXd4 = (short) (C1607wl.Xd() ^ 11535);
                short sXd5 = (short) (C1607wl.Xd() ^ 28229);
                int[] iArr3 = new int["\u0019\u001bM\u000fx3W=TRfTc\\IQj\u0010lPfL(Co\tP[\u001c6+f0c\u0016I\u000eb\u001b\u0016%-\u000fa[CI7 #\u0012ml".length()];
                QB qb3 = new QB("\u0019\u001bM\u000fx3W=TRfTc\\IQj\u0010lPfL(Co\tP[\u001c6+f0c\u0016I\u000eb\u001b\u0016%-\u000fa[CI7 #\u0012ml");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((i4 * sXd5) + sXd4)));
                    i4++;
                }
                AFLogger.afErrorLog(new String(iArr3, 0, i4), e3);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.getCurrencyIso4217Code.put(C1626yg.Ud("\u0013UNaB\r\u0010\u0007Q]*u G8i!C6", (short) (ZN.Xd() ^ 11765), (short) (ZN.Xd() ^ 3905)), getRevenue());
            }
        }
        return this.getCurrencyIso4217Code;
    }
}
