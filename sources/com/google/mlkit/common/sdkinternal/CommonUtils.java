package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public class CommonUtils {
    private static final GmsLogger zza = new GmsLogger("CommonUtils", "");

    private CommonUtils() {
    }

    public static String getAppVersion(Context context) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-29039));
        short sXd2 = (short) (C1499aX.Xd() ^ (-27051));
        int[] iArr = new int["5C:IGB>\t?LLSEOV\u0011'TT[Ma^".length()];
        QB qb = new QB("5C:IGB>\t?LLSEOV\u0011'TT[Ma^");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (Od.Xd() ^ (-7474));
            short sXd4 = (short) (Od.Xd() ^ (-20318));
            int[] iArr2 = new int["qwi\u007fvK\u0016*2\u0013\u001d/\u001f$p\u000bZ".length()];
            QB qb2 = new QB("qwi\u007fvK\u0016*2\u0013\u001d/\u001f$p\u000bZ");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(ZO.xd("S\rd_}b\u0001Ry\u0017\faSd8E\u0013g-\u001ex3F", (short) (FB.Xd() ^ 5323), (short) (FB.Xd() ^ 32515))).getMethod(C1626yg.Ud("\u0005:}\u0007Q'Z?b\t]\u00168U", (short) (OY.Xd() ^ 15266), (short) (OY.Xd() ^ 23480)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr2);
                    Class<?> cls2 = Class.forName(Ig.wd("$w?2f\u001b&0\u000e\u001b\u0018\u007f%8*J_R[1\u000biKE$yD+\u0007\u000b!Dy", (short) (Od.Xd() ^ (-9487))));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(EO.Od("7eh3(,MY*4[V \rF\u0019", (short) (ZN.Xd() ^ 13618)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr3 = {str, 0};
                    Method method3 = cls2.getMethod(C1561oA.Qd("%\"0\u000b\u001b\u001c#\u0018\u001d\u001a|!\u0018 ", (short) (FB.Xd() ^ 13288)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        return String.valueOf(((PackageInfo) method3.invoke(packageManager, objArr3)).versionCode);
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
            zza.e(C1561oA.od("r\u001e\u001b\u001a\u001b\u0019~\u001d\u0011\u0013\u0019", (short) (C1633zX.Xd() ^ (-24748))), C1593ug.zd("\u0007;'*6;188j@5@>G?qJ<:DvLKSDJD}SO\u0001IHX\u0005GWX\t`P^`W^^\u0011", (short) (C1499aX.Xd() ^ (-23911)), (short) (C1499aX.Xd() ^ (-11055))).concat(e5.toString()));
            return "";
        }
    }

    public static String languageTagFromLocale(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append(Global.HYPHEN);
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append(Global.HYPHEN);
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
