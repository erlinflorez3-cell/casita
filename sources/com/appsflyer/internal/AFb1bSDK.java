package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFb1aSDK;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1bSDK implements AFb1aSDK {
    private final ScheduledExecutorService AFAdRevenueData;
    private final AFa1mSDK getCurrencyIso4217Code;
    private AFb1iSDK getMonetizationNetwork;
    private final AFi1oSDK getRevenue;

    public AFb1bSDK(ScheduledExecutorService scheduledExecutorService, AFa1mSDK aFa1mSDK, AFi1oSDK aFi1oSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        this.AFAdRevenueData = scheduledExecutorService;
        this.getCurrencyIso4217Code = aFa1mSDK;
        this.getRevenue = aFi1oSDK;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void AFAdRevenueData(Context context, AFb1aSDK.AFa1tSDK aFa1tSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.getMonetizationNetwork != null) {
            short sXd = (short) (C1607wl.Xd() ^ 8221);
            int[] iArr = new int["S_Ta]VP\u0019MXV[KSX\u0011%PNSCUP".length()];
            QB qb = new QB("S_Ta]VP\u0019MXV[KSX\u0011%PNSCUP");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("GFV$TURPKJ^T[[1^^eWkh", (short) (ZN.Xd() ^ 18622), (short) (ZN.Xd() ^ Mp4VideoDirectory.TAG_FRAME_RATE)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Intrinsics.checkNotNull(context2, "");
                ((Application) context2).unregisterActivityLifecycleCallbacks(this.getMonetizationNetwork);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.getMonetizationNetwork = null;
        AFb1iSDK aFb1iSDK = new AFb1iSDK(this.AFAdRevenueData, this.getCurrencyIso4217Code, this.getRevenue, aFa1tSDK);
        this.getMonetizationNetwork = aFb1iSDK;
        if (context instanceof Activity) {
            aFb1iSDK.onActivityResumed((Activity) context);
        }
        Application applicationO_ = AFj1kSDK.O_(context);
        if (applicationO_ != null) {
            Object[] objArr2 = {this.getMonetizationNetwork};
            Method method2 = Class.forName(C1561oA.od("htivrke.`nm*<jid`YVh\\a_", (short) (C1607wl.Xd() ^ 19622))).getMethod(Wg.Zd("'h)Y\u0019Xw\"'wFi-]7z\u0003N\n6j\u001f6}-8\u0015N$X\u0006E\u0004:", (short) (C1580rY.Xd() ^ (-7206)), (short) (C1580rY.Xd() ^ (-23244))), Class.forName(C1561oA.Kd("v\u0005{\u000b\t\u0004\u007fJ~\u000f\u0010Nb\u0013\u0014\u0011\u000f\n\t\u001d\u0013\u001a\u001aPn\u0012$\u001a(\u001c(.\u0002 \u001e\u001e\u001d4\u001f)#\u0002!-.%%(1:", (short) (OY.Xd() ^ 18371))));
            try {
                method2.setAccessible(true);
                method2.invoke(applicationO_, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean getMediationNetwork() {
        return this.getMonetizationNetwork != null;
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void getMonetizationNetwork() {
        AFb1aSDK.AFa1tSDK aFa1tSDK;
        AFb1iSDK aFb1iSDK = this.getMonetizationNetwork;
        if (aFb1iSDK == null || (aFa1tSDK = aFb1iSDK.getRevenue) == null) {
            return;
        }
        aFa1tSDK.getMediationNetwork();
    }
}
