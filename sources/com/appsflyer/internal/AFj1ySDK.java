package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.internal.AFj1qSDK;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import io.sentry.protocol.App;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1ySDK extends AFi1cSDK {
    private final AFj1zSDK AFAdRevenueData;
    private final Runnable component2;
    private final AFc1oSDK getCurrencyIso4217Code;
    private final ExecutorService getMonetizationNetwork;
    private String hashCode;

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1ySDK(AFc1oSDK aFc1oSDK, ExecutorService executorService, AFj1zSDK aFj1zSDK, Runnable runnable, Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i2 = AFj1qSDK.AFa1tSDK.getCurrencyIso4217Code[aFj1zSDK.ordinal()];
        if (i2 == 1) {
            str = "facebook";
        } else if (i2 == 2) {
            str = "instagram";
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "facebook_lite";
        }
        super(App.TYPE, str, aFc1oSDK, runnable);
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getMonetizationNetwork = executorService;
        this.AFAdRevenueData = aFj1zSDK;
        this.component2 = runnable2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[PHI: r3
  0x00b8: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v11 java.lang.String), (r3v16 java.lang.String) binds: [B:14:0x0045, B:23:0x0073, B:32:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean AFAdRevenueData(android.content.Context r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1ySDK.AFAdRevenueData(android.content.Context):boolean");
    }

    private static boolean component3(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f", (short) (FB.Xd() ^ LeicaMakernoteDirectory.TAG_IMAGE_ID_NUMBER), (short) (FB.Xd() ^ 2128))).getMethod(C1561oA.od("30>\u0019)*1&+(\u000f\". %\".", (short) (C1499aX.Xd() ^ (-4900))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {C1561oA.Kd("t\u0002\u0001B{wz}{\n\u000b\bK\u000b\t\u0015\u0007P\u0014\u0017\u0015\u001d\u0011\r\u000f\u001dYu\u001c\"$\u0012\u001e\u001f\u0006\u001a\u001c\u001c*+\u001f-\f/-5)%'5", (short) (ZN.Xd() ^ 21888)), 0};
            Method method2 = Class.forName(Wg.Zd(" qY.|M\u001aJ1\u0015\tP\u0018bOjdBjQ2|vCz`\u0019\u0005f\u0019\u0018W,", (short) (C1499aX.Xd() ^ (-24025)), (short) (C1499aX.Xd() ^ (-15352)))).getMethod(Wg.vd("aSd__hZ7fdm]inMnntjdht", (short) (C1580rY.Xd() ^ (-27777))), Class.forName(C1561oA.Xd("UMcO\u001d\\R`Z\"Hjiaga", (short) (OY.Xd() ^ 5209))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                return ((ProviderInfo) method2.invoke(packageManager, objArr2)) != null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static boolean getCurrencyIso4217Code(Context context) throws Throwable {
        Class<?> cls = Class.forName(Qg.kd("lxmzvoi2fqotdlq*>igl\\ni", (short) (C1633zX.Xd() ^ (-19042)), (short) (C1633zX.Xd() ^ (-4581))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (OY.Xd() ^ 17982);
        short sXd2 = (short) (OY.Xd() ^ 29313);
        int[] iArr = new int["\u0013\u0010\u001ex\t\n\u0011\u0006\u000b\bn\u0002\u000e\u007f\u0005\u0002\u000e".length()];
        QB qb = new QB("\u0013\u0010\u001ex\t\n\u0011\u0006\u000b\bn\u0002\u000e\u007f\u0005\u0002\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strUd = C1561oA.ud("DOL\fFJNN:?I7B\u00026A?D4<A<=9?1++7q\f044 *)\u000e  \u001e*)\u001b'\u0004%!'\u0019\u0013\u0013\u001f", (short) (C1607wl.Xd() ^ 28542));
            short sXd3 = (short) (C1580rY.Xd() ^ (-23854));
            int[] iArr2 = new int["(4)6:3-u2=;@8@E}'#b\u0004\u001c\u001d$\u0019&#\n\u001d1#(%\u0019".length()];
            QB qb2 = new QB("(4)6:3-u2=;@8@E}'#b\u0004\u001c\u001d$\u0019&#\n\u001d1#(%\u0019");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                i3++;
            }
            Object[] objArr2 = {strUd, 0};
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd("bVeb`k[:ggn`jqNqowkgiw", (short) (C1580rY.Xd() ^ (-28321)), (short) (C1580rY.Xd() ^ (-7339))), Class.forName(C1561oA.Yd(" \u0018.\u001ag'\u001d+%l\u001354,2,", (short) (C1607wl.Xd() ^ 3364))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                return ((ProviderInfo) method2.invoke(packageManager, objArr2)) != null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final boolean getMediationNetwork(Context context) {
        int i2 = AFa1vSDK.getRevenue[this.AFAdRevenueData.ordinal()];
        if (i2 == 1) {
            return getRevenue(context);
        }
        if (i2 == 2) {
            return getCurrencyIso4217Code(context);
        }
        if (i2 == 3) {
            return component3(context);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0559 A[PHI: r22
  0x0559: PHI (r22v3 android.content.ContentProviderClient) = 
  (r22v2 android.content.ContentProviderClient)
  (r22v6 android.content.ContentProviderClient)
  (r22v6 android.content.ContentProviderClient)
 binds: [B:52:0x02a4, B:128:0x0557, B:76:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031b A[Catch: all -> 0x0564, TRY_LEAVE, TryCatch #0 {all -> 0x0564, blocks: (B:69:0x0315, B:78:0x033e, B:80:0x0345, B:83:0x036e, B:89:0x03c4, B:95:0x0441, B:97:0x0457, B:99:0x0462, B:102:0x046e, B:104:0x0484, B:105:0x048b, B:107:0x0493, B:110:0x049f, B:112:0x04c7, B:113:0x04ca, B:122:0x0510, B:124:0x052b, B:126:0x054b, B:130:0x055e, B:131:0x0563, B:81:0x034a, B:71:0x031b, B:73:0x032f), top: B:144:0x0315 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getRevenue(com.appsflyer.internal.AFj1ySDK r28, android.content.Context r29) {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1ySDK.getRevenue(com.appsflyer.internal.AFj1ySDK, android.content.Context):void");
    }

    private static boolean getRevenue(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\p\u001c\u001a\u001f\u000f!\u001c", (short) (ZN.Xd() ^ 11683), (short) (ZN.Xd() ^ 4520))).getMethod(hg.Vd("{x\u0007aqrynspWjvhmjv", (short) (FB.Xd() ^ 28246), (short) (FB.Xd() ^ 3470)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strUd = C1561oA.ud("*52q)#$%!-,'h%\u001a,\u0018$\u0016a#$ &\u0018\u0012\u0012\u001eXr\u0017\u001b\u001b\u0007\u0011\u0010t\u0007\u0007\u0005\u0011\u0010\u0002\u000ej\f\b\u000e\u007fyy\u0006", (short) (ZN.Xd() ^ 20006));
            short sXd = (short) (C1607wl.Xd() ^ 1604);
            int[] iArr = new int["+9,;50(r%2.5#-0j*(e\t\u0017\u001a\u001f\u0016\u0019\u0018|\u0012\u001c\u0010\u0013\u0012\\".length()];
            QB qb = new QB("+9,;50(r%2.5#-0j*(e\t\u0017\u001a\u001f\u0016\u0019\u0018|\u0012\u001c\u0010\u0013\u0012\\");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            short sXd2 = (short) (Od.Xd() ^ (-27272));
            int[] iArr2 = new int["xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005".length()];
            QB qb2 = new QB("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {strUd, 0};
            Method method2 = cls.getMethod(Xg.qd("%\u0019(%#.\u001e|**1#-4\u001142:.*,:", (short) (C1633zX.Xd() ^ (-26286)), (short) (C1633zX.Xd() ^ (-17067))), clsArr);
            try {
                method2.setAccessible(true);
                return ((ProviderInfo) method2.invoke(packageManager, objArr2)) != null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1ySDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1ySDK.getRevenue(this.f$0, context);
                }
            });
        } else {
            this.component2.run();
        }
    }
}
