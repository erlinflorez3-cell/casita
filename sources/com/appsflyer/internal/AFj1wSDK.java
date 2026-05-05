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
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
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
public final class AFj1wSDK extends AFi1cSDK {
    private final AFd1zSDK getCurrencyIso4217Code;
    private final AFj1vSDK getMonetizationNetwork;

    public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFj1vSDK aFj1vSDK) {
        super("store", "huawei", aFd1zSDK.AFAdRevenueData(), runnable);
        this.getCurrencyIso4217Code = aFd1zSDK;
        this.getMonetizationNetwork = aFj1vSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Context context) throws Throwable {
        String strZd = C1593ug.zd("QQNbdbVqaciujmijjnqcc", (short) (OY.Xd() ^ 24379), (short) (OY.Xd() ^ 2839));
        String strOd = C1561oA.od("\u0016\b\u0015\u0011\u000f\r\u0011\u0002", (short) (C1499aX.Xd() ^ (-14240)));
        this.component1 = System.currentTimeMillis();
        this.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass1());
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (ZN.Xd() ^ 7503))).getMethod(Wg.Zd("\r[;g\u0005g@C\u001axpQ/C\u0016dB", (short) (C1499aX.Xd() ^ (-2835)), (short) (C1499aX.Xd() ^ (-17382))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {C1561oA.Xd("HUT\u0016Q_LcRW\u001dQab`Uga\\l']jijmmdbvd", (short) (OY.Xd() ^ IptcDirectory.TAG_JOB_ID)), 128};
            Method method2 = Class.forName(Wg.vd("jxkztog2t\u0002}\u0005r|\u007f:ig%HVY^UhgLak_ba\u001c", (short) (FB.Xd() ^ 18842))).getMethod(hg.Vd("K=JEAJ8\u0015@>C3;@\u001b<8>0**6", (short) (C1607wl.Xd() ^ 5281), (short) (C1607wl.Xd() ^ 5704)), Class.forName(Qg.kd("\u0003x\rvB\u007fs\u007fw=a\u0002~txp", (short) (ZN.Xd() ^ 29505), (short) (ZN.Xd() ^ 16146))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                String str = ((PackageItemInfo) ((ProviderInfo) method2.invoke(packageManager, objArr2))).packageName;
                this.getMediationNetwork.put(C1561oA.ud("\\jbWm[g", (short) (ZN.Xd() ^ 28077)), Long.valueOf(AFj1kSDK.AFAdRevenueData(context, str)));
                this.getMediationNetwork.put(C1561oA.yd("\u0018&\u001e\u00131\u001f+\u0017-\u001f*!", (short) (OY.Xd() ^ 10651)), AFj1kSDK.getRevenue(context, str));
                Cursor cursorQuery = null;
                try {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Yd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (C1499aX.Xd() ^ (-4162)))).getMethod(Xg.qd(",+;\u000b88?1;B!5DA?J:H", (short) (C1633zX.Xd() ^ (-18929)), (short) (C1633zX.Xd() ^ (-15145))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        ContentResolver contentResolver = (ContentResolver) method3.invoke(context, objArr3);
                        Uri uri = Uri.parse(Jg.Wd("g:\u0016j\u0014{NT \\O,~}\tt\u0015\nX)$8\u0016R(Z(oB\u0010\u0016,nI(z.\u0003P\"cqjB\nRbE", (short) (OY.Xd() ^ 19743), (short) (OY.Xd() ^ 11671)));
                        String[] strArr = new String[1];
                        Object[] objArr4 = new Object[0];
                        Method method4 = Class.forName(ZO.xd("\u001bl6\u001f\tDt\\d\fGIOz\r\u0015z\u0007\u0014\u0019WJ:", (short) (OY.Xd() ^ 23292), (short) (OY.Xd() ^ 19865))).getMethod(C1626yg.Ud("%\u0005\b[s\nq\u001c4\u000eO?9\u001a", (short) (OY.Xd() ^ 29125), (short) (OY.Xd() ^ 16016)), new Class[0]);
                        try {
                            method4.setAccessible(true);
                            strArr[0] = (String) method4.invoke(context, objArr4);
                            cursorQuery = contentResolver.query(uri, null, null, strArr, null);
                            if (cursorQuery == null) {
                                this.getMediationNetwork.put(strOd, Wg.vd("\u001b\u000e\u001c!\r\b\u000b&\u0015\u000f\u0003\u0019|\u0006\n\u007fy\u0005~", (short) (Od.Xd() ^ (-20970))));
                            } else if (cursorQuery.moveToFirst()) {
                                this.getMediationNetwork.put(strOd, Ig.wd("S\b", (short) (C1633zX.Xd() ^ (-12653))));
                                this.getMediationNetwork.put(EO.Od(">\u0002\u0005+h\u000eda", (short) (FB.Xd() ^ 12776)), cursorQuery.getString(0));
                                this.getMediationNetwork.put(C1561oA.Qd("NVRKREYW", (short) (FB.Xd() ^ SanyoMakernoteDirectory.TAG_FLICKER_REDUCE)), Long.valueOf(cursorQuery.getLong(1)));
                                this.getMediationNetwork.put(C1593ug.zd("\u001e$*,\u001a&'\u001b\",#\u001f55", (short) (C1499aX.Xd() ^ (-19650)), (short) (C1499aX.Xd() ^ (-20005))), Long.valueOf(cursorQuery.getLong(2)));
                                if (cursorQuery.getColumnCount() > 3) {
                                    this.getMediationNetwork.put(C1561oA.od("BFJJ6@?13567;+?=", (short) (C1580rY.Xd() ^ (-18437))), Long.valueOf(cursorQuery.getLong(3)));
                                    HashMap map = new HashMap();
                                    String string = cursorQuery.getString(4);
                                    if (string != null) {
                                        short sXd = (short) (C1633zX.Xd() ^ (-32130));
                                        int[] iArr = new int["FE58A6A=".length()];
                                        QB qb = new QB("FE58A6A=");
                                        int i2 = 0;
                                        while (qb.YK()) {
                                            int iKK = qb.KK();
                                            Xu xuXd = Xu.Xd(iKK);
                                            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                                            i2++;
                                        }
                                        map.put(new String(iArr, 0, i2), string);
                                    }
                                    map.put(Wg.Zd("aIV$A\u0010\u000fjg\u001c{", (short) (C1499aX.Xd() ^ (-14334)), (short) (C1499aX.Xd() ^ (-14846))), cursorQuery.getString(5));
                                    this.getMediationNetwork.put(C1561oA.Xd("ftaxglch{z|xw", (short) (OY.Xd() ^ 24103)), map);
                                }
                            } else {
                                this.getMediationNetwork.put(strOd, strZd);
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (Throwable th) {
                    try {
                        this.getMediationNetwork.put(strOd, strZd);
                        AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
                        if (0 != 0) {
                        }
                    } finally {
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                }
                getMediationNetwork();
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private boolean getRevenue(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMonetizationNetwork.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMonetizationNetwork.getRevenue(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getRevenue(context)) {
            this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.getMediationNetwork(context);
                }
            });
        }
    }
}
