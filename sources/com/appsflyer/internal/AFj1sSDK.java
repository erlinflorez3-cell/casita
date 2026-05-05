package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1tSDK;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class AFj1sSDK {
    public final AFd1zSDK getCurrencyIso4217Code;
    public final CopyOnWriteArrayList<AFj1tSDK> getRevenue = new CopyOnWriteArrayList<>();

    public AFj1sSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK_LITE, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFj1sSDK.getRevenue();
            }
        });
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    public /* synthetic */ void component1(final Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.AFAdRevenueData(runnable);
            }
        });
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    public /* synthetic */ void getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        boolean mediationNetwork = aFc1qSDKComponent4.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false);
        boolean z2 = aFi1aSDK.component4 == AFj1tSDK.AFa1tSDK.NOT_STARTED;
        if (revenue == 1) {
            if (z2 || mediationNetwork) {
                runnable.run();
            }
        }
    }

    public /* synthetic */ void getMonetizationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) throws Throwable {
        Intent intent = new Intent(Wg.vd("\u001d()h\u001f-02(-=(8r:,0.>=3?}\u0018 $(\u0014\"!7',(2$\"\"2", (short) (C1580rY.Xd() ^ (-30561))));
        short sXd = (short) (C1580rY.Xd() ^ (-28231));
        short sXd2 = (short) (C1580rY.Xd() ^ (-30660));
        int[] iArr = new int["9E:GC<6~3><A19>v\u000b649);6".length()];
        QB qb = new QB("9E:GC<6~3><A19>v\u000b649);6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (FB.Xd() ^ 31157);
        short sXd4 = (short) (FB.Xd() ^ 5801);
        int[] iArr2 = new int["%\"0\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ".length()];
        QB qb2 = new QB("%\"0\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = {intent, 0};
            Method method2 = Class.forName(C1561oA.ud(",8-:6/)q&1/4$,1i+'f\b\u0018\u0019 \u0015\u001a\u0017}\u0011\u001d\u000f\u0014\u0011\u001d", (short) (OY.Xd() ^ 6397))).getMethod(C1561oA.Yd("GL=KS$JQCMT$QQXJT[8[YaUQSac", (short) (Od.Xd() ^ (-30112))), Class.forName(C1561oA.yd("\u0019%\u001e++$\"j#.05)1:r\u00115>.:?", (short) (ZN.Xd() ^ PhotoshopDirectory.TAG_COLOR_SAMPLERS))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                List list = (List) method2.invoke(packageManager, objArr2);
                if (list == null || list.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ProviderInfo providerInfo = ((ResolveInfo) it.next()).providerInfo;
                    if (providerInfo != null) {
                        arrayList.add(new AFj1uSDK(providerInfo, runnable, aFd1zSDK));
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, Xg.qd("n{z<p\u0001\u0002\u0006y\u0001\u000f{\nF\f\u007f\u0002\u0002\u0010\u0011\u0005\u0013Okqwygst\tz}{\u0004wsu\u0004Rt\u0018* ''Y$/\\1$4`(26d466h\r::A3=D!DBJ>:<Jx=JIMMMEOV", (short) (C1633zX.Xd() ^ (-1570)), (short) (C1633zX.Xd() ^ (-2376))));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.getRevenue.addAll(arrayList);
                AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, new StringBuilder(Jg.Wd("{hB]&\"]\u0007|", (short) (ZN.Xd() ^ 14680), (short) (ZN.Xd() ^ 24841))).append(arrayList.size()).append(ZO.xd(";7AdE\u0010cjM!~\u001b\u0005\u0001z\u0012rb8\u0002\u001ci&j\u0011`\u0004\u0011r", (short) (C1499aX.Xd() ^ (-22927)), (short) (C1499aX.Xd() ^ (-10572)))).toString());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AFj1tSDK) it2.next()).getMonetizationNetwork(aFd1zSDK.AFInAppEventParameterName().getMonetizationNetwork);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void getRevenue() {
    }

    public /* synthetic */ void getRevenue(final Runnable runnable) {
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.getMonetizationNetwork(runnable);
            }
        });
    }

    public final Runnable AFAdRevenueData(final AFi1aSDK aFi1aSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.getCurrencyIso4217Code(aFi1aSDK, runnable);
            }
        };
    }

    public final AFi1aSDK getCurrencyIso4217Code(final Runnable runnable) {
        return new AFi1aSDK(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.getRevenue(runnable);
            }
        }, this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData());
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    public final void getMediationNetwork(final Runnable runnable) {
        this.getRevenue.add(new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.component1(runnable);
            }
        }));
    }

    public final boolean getMediationNetwork() {
        Iterator<AFj1tSDK> it = this.getRevenue.iterator();
        while (it.hasNext()) {
            if (it.next().component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    public final boolean getMediationNetwork(AFh1mSDK aFh1mSDK) {
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.component4().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT, false) && revenue == 1) || (revenue == 1 && !(aFh1mSDK instanceof AFh1kSDK));
    }

    public final void getRevenue(final Context context, final Runnable runnable, final AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1sSDK$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.getMonetizationNetwork(context, runnable, aFd1zSDK);
                }
            });
        }
    }
}
