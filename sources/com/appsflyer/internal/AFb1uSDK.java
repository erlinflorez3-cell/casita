package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFb1uSDK<T> {
    public final Executor AFAdRevenueData;
    private final String[] getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final Context getMonetizationNetwork;
    public final FutureTask<T> getRevenue = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1uSDK.1
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1uSDK.this.getCurrencyIso4217Code()) {
                return (T) AFb1uSDK.this.getRevenue();
            }
            return null;
        }
    });

    public AFb1uSDK(Context context, Executor executor, String str, String... strArr) {
        this.getMonetizationNetwork = context;
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = strArr;
        this.AFAdRevenueData = executor;
    }

    public final boolean getCurrencyIso4217Code() {
        try {
            Context context = this.getMonetizationNetwork;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\b\u0013\u0011\u0016\u0006\u000e\u0013K_\u000b\t\u000e}\u0010\u000b", (short) (C1580rY.Xd() ^ (-24239)))).getMethod(C1593ug.zd(">=M*<?H?FE.CQELKY", (short) (C1580rY.Xd() ^ (-22020)), (short) (C1580rY.Xd() ^ (-28582))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String str = this.getMediationNetwork;
                Class<?> cls = Class.forName(C1561oA.od("iujwslf/cnlqain'hd$EUV]RWT;NZLQNZ", (short) (OY.Xd() ^ 24641)));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (C1607wl.Xd() ^ 18049);
                int[] iArr = new int["xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005".length()];
                QB qb = new QB("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 128};
                Method method2 = cls.getMethod(Wg.Zd("PL_dfx-\u0014EMW\u0012 /\u0010:|\r\u0005\t\u0012`", (short) (C1499aX.Xd() ^ (-5678)), (short) (C1499aX.Xd() ^ (-25631))), clsArr);
                try {
                    method2.setAccessible(true);
                    ProviderInfo providerInfo = (ProviderInfo) method2.invoke(packageManager, objArr2);
                    if (providerInfo != null) {
                        List listAsList = Arrays.asList(this.getCurrencyIso4217Code);
                        Context context2 = this.getMonetizationNetwork;
                        short sXd2 = (short) (C1499aX.Xd() ^ (-877));
                        int[] iArr2 = new int["+90?=84~5BBI;EL\u0007\u001dJJQCWT".length()];
                        QB qb2 = new QB("+90?=84~5BBI;EL\u0007\u001dJJQCWT");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
                            i3++;
                        }
                        Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                        Object[] objArr3 = new Object[0];
                        Method method3 = cls2.getMethod(Wg.vd("WTb=UV]R_\\CVj\\a^R", (short) (C1499aX.Xd() ^ (-25888))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            if (listAsList.contains(AFj1kSDK.N_((PackageManager) method3.invoke(context2, objArr3), ((PackageItemInfo) providerInfo).packageName))) {
                                return true;
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    return false;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e5) {
            AFLogger.afErrorLog(e5.getMessage(), e5, false, true);
            return false;
        }
    }

    public T getMonetizationNetwork() {
        try {
            return this.getRevenue.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e4) {
            AFLogger.afErrorLog(e4.getMessage(), e4, false, false);
            return null;
        }
    }

    protected abstract T getRevenue();
}
