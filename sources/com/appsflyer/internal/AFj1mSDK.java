package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import com.drew.metadata.exif.makernotes.SonyType1MakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
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

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1mSDK extends AFi1eSDK {
    private final AFd1zSDK getCurrencyIso4217Code;

    public AFj1mSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", "samsung", runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(Context context) {
        AFb1uSDK<Map<String, Object>> aFb1uSDK = new AFb1uSDK<Map<String, Object>>(context, this.getCurrencyIso4217Code.getMonetizationNetwork(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1mSDK.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1uSDK
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getRevenue() throws Throwable {
                Context context2;
                Object[] objArr;
                Method method;
                String string;
                short sXd = (short) (C1499aX.Xd() ^ (-19370));
                int[] iArr = new int["\u0003\u0003\u007f\u0014\u0016\u0014\b#\u0013\u0015\u001b'\u001c\u001f\u001b\u001c\u001c #\u0015\u0015".length()];
                QB qb = new QB("\u0003\u0003\u007f\u0014\u0016\u0014\b#\u0013\u0015\u001b'\u001c\u001f\u001b\u001c\u001c #\u0015\u0015");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strQd = Xg.qd("\u0007z\n\b\b\b\u000e\u0001", (short) (C1499aX.Xd() ^ (-4163)), (short) (C1499aX.Xd() ^ (-6945)));
                Cursor cursorQuery = null;
                try {
                    try {
                        context2 = this.getMonetizationNetwork;
                        objArr = new Object[0];
                        method = Class.forName(Jg.Wd("ggTMA8&f\u0007\n\u0006~^ZW\u000e\u00161#(\u000e\u0014~", (short) (C1607wl.Xd() ^ 20955), (short) (C1607wl.Xd() ^ 24320))).getMethod(ZO.xd("\u000bYA]mntb~MnPw8\u001b\u0001k5", (short) (C1607wl.Xd() ^ 28934), (short) (C1607wl.Xd() ^ SonyType1MakernoteDirectory.TAG_FOCUS_MODE)), new Class[0]);
                    } catch (Exception e2) {
                        AFj1mSDK.this.getMediationNetwork.put(strQd, str);
                        AFLogger.afErrorLog(e2.getMessage(), e2, false, true);
                        if (0 != 0) {
                        }
                    }
                    try {
                        method.setAccessible(true);
                        cursorQuery = ((ContentResolver) method.invoke(context2, objArr)).query(Uri.parse(new StringBuilder(C1626yg.Ud("qx\u0002yC\u001ew\u0015b\u0003", (short) (C1499aX.Xd() ^ (-13762)), (short) (C1499aX.Xd() ^ (-20909)))).append(this.getMediationNetwork).toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1mSDK.this.getMediationNetwork.put(strQd, C1561oA.yd("XIUXRKLeRJ<PBIK?W`X", (short) (C1580rY.Xd() ^ (-22646))));
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1mSDK.this.getMediationNetwork.put(strQd, Ig.wd("i\u0010", (short) (OY.Xd() ^ 19197)));
                            E_(EO.Od("t\u0010Ee,\nZ1", (short) (FB.Xd() ^ 6434)), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_(C1561oA.Qd("HPLEL?SQ", (short) (C1580rY.Xd() ^ (-2774))), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_(C1593ug.zd("TZ`bP\\]QUY\\_eWmm", (short) (FB.Xd() ^ 4682), (short) (FB.Xd() ^ 26322)), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            D_(C1561oA.od("QUYYEON@EMB<PN", (short) (ZN.Xd() ^ 25891)), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            E_(C1561oA.Kd("bf\\Wea\\Yfavunreu", (short) (C1633zX.Xd() ^ (-21859))), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            E_(Wg.Zd("bka\u001e\u0001\f\u0007<'", (short) (Od.Xd() ^ (-23223)), (short) (Od.Xd() ^ (-11438))), AFj1mSDK.this.getMediationNetwork, cursorQuery);
                            HashMap map = new HashMap();
                            short sXd2 = (short) (Od.Xd() ^ (-954));
                            int[] iArr2 = new int["NTZ\\JX_".length()];
                            QB qb2 = new QB("NTZ\\JX_");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                                i3++;
                            }
                            String str2 = new String(iArr2, 0, i3);
                            int columnIndex = cursorQuery.getColumnIndex(str2);
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put(str2, Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_(Wg.vd("gqkfshyl~\u0004o}o\u0006\u0002", (short) (C1607wl.Xd() ^ 19815)), map, cursorQuery);
                            D_(Qg.kd("+/33\u001f)(\u001a\u001c\u001e\u001f $\u0014'\u0018$'\u0015!\r!\u001f", (short) (C1499aX.Xd() ^ (-14832)), (short) (C1499aX.Xd() ^ (-29250))), map, cursorQuery);
                            E_(hg.Vd("\n\u000e\u0012\u0012}\b\u0007x\u000f|\t\t}\u0003\u0001", (short) (C1633zX.Xd() ^ (-18259)), (short) (C1633zX.Xd() ^ (-32203))), map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1mSDK.this.getMediationNetwork.put(C1561oA.ud("?PMMGD", (short) (OY.Xd() ^ 14934)), map);
                            }
                        } else {
                            AFj1mSDK.this.getMediationNetwork.put(strQd, str);
                        }
                        Context context3 = this.getMonetizationNetwork;
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1561oA.Yd("?MDSQLH\u0013IVV]OY`\u001b1^^eWkh", (short) (C1633zX.Xd() ^ (-10807)))).getMethod(Xg.qd("dcsPbenelkTiwkrq\u007f", (short) (Od.Xd() ^ (-2062)), (short) (Od.Xd() ^ (-19982))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            PackageManager packageManager = (PackageManager) method2.invoke(context3, objArr2);
                            Object[] objArr3 = {this.getMediationNetwork, 128};
                            Method method3 = Class.forName(Jg.Wd(",_q6QqhH<^\nIT\u0016F\u001aVkf3^X>j\u001d1\u0017Az$H>%", (short) (C1580rY.Xd() ^ (-8320)), (short) (C1580rY.Xd() ^ (-14142)))).getMethod(C1626yg.Ud("\u0004\u00146mZc/XuF3\u0016\u001cUs\u0019L_\\s /", (short) (C1580rY.Xd() ^ (-4789)), (short) (C1580rY.Xd() ^ (-7553))), Class.forName(ZO.xd("~\u001cp\u0019U{U\u0003Y\u0012\u001by-\t$9", (short) (Od.Xd() ^ (-2940)), (short) (Od.Xd() ^ (-32031)))), Integer.TYPE);
                            try {
                                method3.setAccessible(true);
                                String str3 = ((PackageItemInfo) ((ProviderInfo) method3.invoke(packageManager, objArr3))).packageName;
                                AFj1mSDK.this.getMediationNetwork.put(Ig.wd("\u0013Sx\u0018}H+", (short) (C1607wl.Xd() ^ 32399)), Long.valueOf(AFj1kSDK.AFAdRevenueData(this.getMonetizationNetwork, str3)));
                                AFj1mSDK.this.getMediationNetwork.put(EO.Od("eD~]5Hy\u0017X@\"@", (short) (Od.Xd() ^ (-9026))), AFj1kSDK.getRevenue(this.getMonetizationNetwork, str3));
                                AFj1mSDK.this.getMediationNetwork();
                                return AFj1mSDK.this.getMediationNetwork;
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } finally {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                }
            }

            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j2 = cursor.getLong(columnIndex);
                if (j2 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j2));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
        AFa1ySDK.getRevenue();
        if (AFa1ySDK.getCurrencyIso4217Code(aFc1qSDKComponent4, false) > 0 || !aFb1uSDK.getCurrencyIso4217Code()) {
            return;
        }
        aFb1uSDK.AFAdRevenueData.execute(aFb1uSDK.getRevenue);
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
    }
}
