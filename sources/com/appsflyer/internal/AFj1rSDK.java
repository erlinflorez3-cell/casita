package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1rSDK extends AFi1cSDK {
    private final ExecutorService getCurrencyIso4217Code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(ExecutorService executorService, AFc1oSDK aFc1oSDK, Runnable runnable) {
        super("preload", "samsung", aFc1oSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getCurrencyIso4217Code = executorService;
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-15));
        short sXd2 = (short) (C1499aX.Xd() ^ (-1937));
        int[] iArr = new int["\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52".length()];
        QB qb = new QB("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0013  '\u0019#*dz((/!52");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\u001a\b\u000fFO1-zxj*6\u0017\ngaF", (short) (OY.Xd() ^ 5660), (short) (OY.Xd() ^ 26815)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            short sXd3 = (short) (C1607wl.Xd() ^ 22801);
            short sXd4 = (short) (C1607wl.Xd() ^ 14338);
            int[] iArr2 = new int["ENM$\u0011}`\u007f\u000b@\u000e\u00062\"`3{\u0003FK*\u0002CJh\u0002Sv\fPW7wV\u0004\r?\u0005xtR\u000b`VmIv^<\u0014\u0015".length()];
            QB qb2 = new QB("ENM$\u0011}`\u007f\u000b@\u000e\u00062\"`3{\u0003FK*\u0002CJh\u0002Sv\fPW7wV\u0004\r?\u0005xtR\u000b`VmIv^<\u0014\u0015");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Object[] objArr2 = {new String(iArr2, 0, i3), 0};
            Method method2 = Class.forName(C1626yg.Ud("(k&O?RnZ)\"jw\u001c,uyJ(itt&INKl%\u0006\u001eT<'M", (short) (C1633zX.Xd() ^ (-28031)), (short) (C1633zX.Xd() ^ (-5282)))).getMethod(EO.Od("\n6&\u0003\u0018fy_^\">\u0015LD09Zs\u000fR\u0016O", (short) (OY.Xd() ^ 28427)), Class.forName(Ig.wd("c([boxU#xO~6\u0005y^q", (short) (OY.Xd() ^ 31846))), Integer.TYPE);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0341 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0346 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120 A[Catch: all -> 0x031b, TRY_LEAVE, TryCatch #3 {all -> 0x031b, blocks: (B:30:0x011a, B:39:0x014b, B:42:0x0167, B:45:0x0183, B:47:0x0189, B:49:0x0199, B:51:0x01b2, B:52:0x01b9, B:54:0x01ce, B:57:0x01e2, B:59:0x01fb, B:62:0x0217, B:64:0x0230, B:67:0x024d, B:69:0x025e, B:72:0x0272, B:73:0x0275, B:75:0x027b, B:77:0x028f, B:78:0x0292, B:84:0x02da, B:86:0x02f8, B:87:0x0300, B:89:0x0314, B:32:0x0120, B:34:0x013c), top: B:119:0x011a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void getRevenue(com.appsflyer.internal.AFj1rSDK r18, android.content.Context r19) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1rSDK.getRevenue(com.appsflyer.internal.AFj1rSDK, android.content.Context):void");
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    protected final void AFAdRevenueData() {
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1rSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1rSDK.getRevenue(this.f$0, context);
                }
            });
        }
    }
}
