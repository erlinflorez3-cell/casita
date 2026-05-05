package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1tSDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
public final class AFj1uSDK extends AFj1tSDK {
    private final AFd1zSDK AFAdRevenueData;
    final ProviderInfo getCurrencyIso4217Code;

    public AFj1uSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.AFAdRevenueData = aFd1zSDK;
        this.getCurrencyIso4217Code = providerInfo;
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("TABP\u001e\u0016Lc)9 \u000f\u0011\u000ebqE<nb3>n", (short) (Od.Xd() ^ (-7119)), (short) (Od.Xd() ^ (-26133)))).getMethod(Ig.wd("Y\u0014\u000f;=\u007f0.xT2%\u0005tcv\u001c7", (short) (Od.Xd() ^ (-27612))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((ContentResolver) method.invoke(context, objArr)).acquireUnstableContentProviderClient(uri);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (SecurityException e3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, C1561oA.Qd("Zt{}us.\u0002{+kly|owi#woss__h`\u001a\\gejZbg\u0012ab^dVPP\\,TPKSX\u0003FVE~RL{.?<MI?IM\u0018J45?B6;9", (short) (FB.Xd() ^ 26127)), e3, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
            short sXd = (short) (C1633zX.Xd() ^ (-26438));
            int[] iArr = new int["V![z\u0014o\u000b u&e\nft\u0001(?\b\u0016;z$30d\u001ezf!2\u0005U8\u001ej\u000b`?sRO*\u0007G\u001c\u0003G\u001es|C\u0012\u0014\b\fh\u0015Jnu#~\u0011ze\\\u001b \r~\u0018W~:G\u0001\f".length()];
            QB qb = new QB("V![z\u0014o\u000b u&e\nft\u0001(?\b\u0016;z$30d\u001ezf!2\u0005U8\u001ej\u000b`?sRO*\u0007G\u001c\u0003G\u001es|C\u0012\u0014\b\fh\u0015Jnu#~\u0011ze\\\u001b \r~\u0018W~:G\u0001\f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            aFLogger.e(aFg1cSDK, new String(iArr, 0, i2), th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        this.AFAdRevenueData.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.5
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Cursor cursorQuery;
                AFj1uSDK aFj1uSDK = AFj1uSDK.this;
                aFj1uSDK.component1 = System.currentTimeMillis();
                aFj1uSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
                aFj1uSDK.addObserver(new AFj1tSDK.AnonymousClass1());
                Uri uri = Uri.parse(new StringBuilder(C1626yg.Ud("I\u0006w|>\u0015\u0004yXM", (short) (C1633zX.Xd() ^ (-29674)), (short) (C1633zX.Xd() ^ (-29750)))).append(AFj1uSDK.this.getCurrencyIso4217Code.authority).append(Ig.wd("Qg3\u0002\u000e6P\n<19\u001a<<W", (short) (OY.Xd() ^ 22281))).toString());
                ContentProviderClient contentProviderClientB_ = AFj1uSDK.B_(context, uri);
                try {
                    if (contentProviderClientB_ != null) {
                        try {
                            StringBuilder sb = new StringBuilder(EO.Od("E\u0005vF?\u0017\f", (short) (C1580rY.Xd() ^ (-16896))));
                            Context context2 = context;
                            Class<?> cls = Class.forName(C1561oA.Qd("?K@MIB<\u00059DBG7?D|\u0011<:?/A<", (short) (ZN.Xd() ^ 25557)));
                            Class<?>[] clsArr = new Class[0];
                            Object[] objArr = new Object[0];
                            short sXd = (short) (C1633zX.Xd() ^ (-14931));
                            short sXd2 = (short) (C1633zX.Xd() ^ (-28400));
                            int[] iArr = new int["|{\fhz}\u0007}\u0005\u0004m\u0002\u000f\b".length()];
                            QB qb = new QB("|{\fhz}\u0007}\u0005\u0004m\u0002\u000f\b");
                            int i2 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                                i2++;
                            }
                            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                            try {
                                method.setAccessible(true);
                                cursorQuery = contentProviderClientB_.query(uri, null, sb.append((String) method.invoke(context2, objArr)).toString(), null, null);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (DeadObjectException e3) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                            short sXd3 = (short) (OY.Xd() ^ 30784);
                            short sXd4 = (short) (OY.Xd() ^ 19620);
                            int[] iArr2 = new int[";\u0013E%\u0005@eTxgQ-&fA#\u0004tv\u000b<sN(\u001dN7\u0011I\u00032=0r\u00052^\u0018EV:6k\u001ai_Jk[".length()];
                            QB qb2 = new QB(";\u0013E%\u0005@eTxgQ-&fA#\u0004tv\u000b<sN(\u001dN7\u0011I\u00032=0r\u00052^\u0018EV:6k\u001ai_Jk[");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                                i3++;
                            }
                            aFLogger.e(aFg1cSDK, new String(iArr2, 0, i3), e3, false, true, false);
                            contentProviderClientB_.close();
                            cursorQuery = null;
                        } catch (RemoteException e4) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, C1561oA.Kd(":V_c]]\u001aok\u001dotes{#ysy{ikvp,p}}\u0005v\u0001\b4\u0006\t\u0007\u000f\u0003~\u0001\u000f`\u000b\t\u0006\u0010\u0017", (short) (ZN.Xd() ^ 12332)), e4, false, true, false);
                            contentProviderClientB_.close();
                            cursorQuery = null;
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, C1561oA.od("5a`\\^\u000b^X\bNKY\u0004GCUA~DOKHyIJFL>88D\u0014<83;@j", (short) (C1580rY.Xd() ^ (-11659))), th, false, true, false);
                            contentProviderClientB_.close();
                            cursorQuery = null;
                        }
                    } else {
                        cursorQuery = null;
                    }
                    String strXd = C1561oA.Xd("OCRPPPVI", (short) (Od.Xd() ^ (-5750)));
                    if (cursorQuery != null) {
                        int columnIndex = cursorQuery.getColumnIndex(Wg.vd("TQ?KWDEUAFD4E?", (short) (C1607wl.Xd() ^ 18094)));
                        if (columnIndex == -1) {
                            AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, Qg.kd("Xrnld\u001c^iemdd\u0015bT_V", (short) (FB.Xd() ^ 7376), (short) (FB.Xd() ^ 14865)));
                            AFj1uSDK.this.getMediationNetwork.put(strXd, hg.Vd("xvq\u0004\u0004\u007fq\u000bxx|\u0007yztsqstdb", (short) (C1607wl.Xd() ^ 24086), (short) (C1607wl.Xd() ^ 27967)));
                        } else {
                            AFj1uSDK.this.getMediationNetwork.put(strXd, C1561oA.ud("\u0012\r", (short) (C1633zX.Xd() ^ (-32191))));
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(columnIndex);
                                cursorQuery.close();
                                if (string != null && !string.isEmpty()) {
                                    AFj1uSDK.this.getMediationNetwork.put(C1561oA.yd("~rpp\u0003\u0004s\u0002", (short) (C1633zX.Xd() ^ (-16631))), string);
                                }
                            }
                        }
                        cursorQuery.close();
                    } else {
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.PREINSTALL;
                        short sXd5 = (short) (ZN.Xd() ^ 11850);
                        int[] iArr3 = new int["V\u0004\u0004\u000b|\u0007\u000ej\u000e\f\u0014\b\u0004\u0006\u0014B\u0015\u001a\u000b\u0019!H\u0010\f\u0015\u0019\u0013\u0013[P\u0019\"(T$,$%Y}1/1.2".length()];
                        QB qb3 = new QB("V\u0004\u0004\u000b|\u0007\u000ej\u000e\f\u0014\b\u0004\u0006\u0014B\u0015\u001a\u000b\u0019!H\u0010\f\u0015\u0019\u0013\u0013[P\u0019\"(T$,$%Y}1/1.2");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd5 + sXd5) + sXd5) + i4));
                            i4++;
                        }
                        aFLogger2.w(aFg1cSDK2, new String(iArr3, 0, i4));
                        AFj1uSDK.this.getMediationNetwork.put(strXd, Xg.qd("^Q_dXSVqhbVlXae[]hb", (short) (Od.Xd() ^ (-18126)), (short) (Od.Xd() ^ (-10649))));
                    }
                    AFj1uSDK.this.getMediationNetwork.put(Jg.Wd("m?@\u001f7\u000f(", (short) (Od.Xd() ^ (-542)), (short) (Od.Xd() ^ (-31955))), Long.valueOf(AFj1kSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName)));
                    AFj1uSDK.this.getMediationNetwork.put(ZO.xd(" d\u0012Ay8t\\+3^X", (short) (C1499aX.Xd() ^ (-32671)), (short) (C1499aX.Xd() ^ (-4965))), AFj1kSDK.getRevenue(context, ((PackageItemInfo) AFj1uSDK.this.getCurrencyIso4217Code).packageName));
                    AFj1uSDK.this.getMediationNetwork();
                } finally {
                    contentProviderClientB_.close();
                }
            }
        });
    }
}
