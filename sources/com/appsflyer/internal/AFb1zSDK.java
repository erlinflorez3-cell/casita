package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1bSDK;
import com.braze.models.inappmessage.InAppMessageBase;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1zSDK implements AFa1cSDK {
    private boolean AFAdRevenueData;
    private final AFc1hSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public static final class AFa1zSDK implements AFa1bSDK.AFa1uSDK {
        private /* synthetic */ long getMonetizationNetwork;

        AFa1zSDK(long j2) {
            this.getMonetizationNetwork = j2;
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFb1zSDK.this.getRevenue;
            if (map != null) {
                map.put("error", str);
            }
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: " + str);
                Map<String, Object> map2 = AFb1zSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1zSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1zSDK.getRevenue;
                    if (map3 != null) {
                        map3.put(InAppMessageBase.EXTRAS, linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1zSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork);
            Map<String, Object> map5 = AFb1zSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }
    }

    public AFb1zSDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final boolean AFAdRevenueData() {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getCurrencyIso4217Code(boolean z2) {
        this.AFAdRevenueData = z2;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final Map<String, Object> getMediationNetwork() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getMonetizationNetwork() throws Throwable {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class<?> cls = Class.forName(C1561oA.od("x\u0004\u0001@wqrso{zu7NhijfrqlSci", (short) (C1499aX.Xd() ^ (-6953))));
                short sXd = (short) (C1499aX.Xd() ^ (-23753));
                int[] iArr = new int["\u001b\r\u0015s\u001a\u0016\"\u0018\u0011\u001d\u001b-\u0019".length()];
                QB qb = new QB("\u001b\r\u0015s\u001a\u0016\"\u0018\u0011\u001d\u001b-\u0019");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                cls.getMethod(new String(iArr, 0, i2), Context.class).invoke(null, context);
                Class<?> cls2 = Class.forName(Wg.Zd("\u007f&J\u0015q\u0007Oy\r4Z\u001f\bUh\u0013ez&-[.\bauk/| \u00136q5", (short) (C1607wl.Xd() ^ 10019), (short) (C1607wl.Xd() ^ 16603)));
                Class<?> cls3 = Class.forName(C1561oA.Xd("]ji+d`cfdrsp4hxyvtzx\u0002=Q\u0002\u0003_}\u0004\u0002[y\u000e{?_\r\f\u0010\r\u0007\u0017\r\u0014\u0014n\t\u0017\u000e\u0017\u0011\u001f", (short) (C1607wl.Xd() ^ 28779)));
                short sXd2 = (short) (C1607wl.Xd() ^ 27886);
                int[] iArr2 = new int["20>,8\u001333)54&,\b65(DHD$@R>".length()];
                QB qb2 = new QB("20>,8\u001333)54&,\b65(DHD$@R>");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method = cls2.getMethod(new String(iArr2, 0, i3), Context.class, String.class, cls3);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.5
                    private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMonetizationNetwork;

                    AnonymousClass5(Class cls22, AFa1uSDK aFa1zSDK2) {
                        cls = cls22;
                        aFa1uSDK = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) throws Throwable {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1uSDK aFa1uSDK = aFa1uSDK;
                            if (aFa1uSDK != null) {
                                aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle(InAppMessageBase.EXTRAS);
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1uSDK aFa1uSDK2 = aFa1uSDK;
                            if (aFa1uSDK2 != null) {
                                aFa1uSDK2.getRevenue(string2, string3, string);
                            }
                        } else {
                            AFa1uSDK aFa1uSDK3 = aFa1uSDK;
                            if (aFa1uSDK3 != null) {
                                aFa1uSDK3.getRevenue(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                short sXd3 = (short) (OY.Xd() ^ 4457);
                short sXd4 = (short) (OY.Xd() ^ 30015);
                int[] iArr3 = new int["\u0002\u000e\u0003\u0010\f\u0005~G{\u0007\u0005\ny\u0002\u0007?S~|\u0002q\u0004~".length()];
                QB qb3 = new QB("\u0002\u000e\u0003\u0010\f\u0005~G{\u0007\u0005\ny\u0002\u0007?S~|\u0002q\u0004~");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd3 + i4) + xuXd3.CK(iKK3)) - sXd4);
                    i4++;
                }
                Object[] objArr = new Object[0];
                Method method2 = Class.forName(new String(iArr3, 0, i4)).getMethod(hg.Vd("[XfCUb]b^NO\\", (short) (C1607wl.Xd() ^ 14131), (short) (C1607wl.Xd() ^ 29645)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    Resources resources = (Resources) method2.invoke(context, objArr);
                    String strUd = C1561oA.ud("QKLMIUTOBCQP>GA", (short) (ZN.Xd() ^ 7969));
                    short sXd5 = (short) (OY.Xd() ^ 16776);
                    int[] iArr4 = new int["gih`f`".length()];
                    QB qb4 = new QB("gih`f`");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i5));
                        i5++;
                    }
                    String str = new String(iArr4, 0, i5);
                    Class<?> cls4 = Class.forName(C1561oA.Yd("7E<KID@\u000bANNUGQX\u0013)VV]Oc`", (short) (C1499aX.Xd() ^ (-5146))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd6 = (short) (C1607wl.Xd() ^ 22188);
                    short sXd7 = (short) (C1607wl.Xd() ^ 29991);
                    int[] iArr5 = new int["\u001d\u001c,\t\u001b\u001e'\u001e%$\u000e\"/(".length()];
                    QB qb5 = new QB("\u001d\u001c,\t\u001b\u001e'\u001e%$\u000e\"/(");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd6 + i6)) + sXd7);
                        i6++;
                    }
                    Method method3 = cls4.getMethod(new String(iArr5, 0, i6), clsArr);
                    try {
                        method3.setAccessible(true);
                        int identifier = resources.getIdentifier(strUd, str, (String) method3.invoke(context, objArr2));
                        Class<?> cls5 = Class.forName(Jg.Wd("D>hi\u0017\u00043oUT\b\u0001\"\u001eX\u0005J)\u0019Q3xi", (short) (C1580rY.Xd() ^ (-21759)), (short) (C1580rY.Xd() ^ (-19440))));
                        Class<?>[] clsArr2 = {Integer.TYPE};
                        Object[] objArr3 = {Integer.valueOf(identifier)};
                        Method method4 = cls5.getMethod(ZO.xd("\u000f\u0001\u0019\u0001_\u0001Phw", (short) (OY.Xd() ^ 20081), (short) (OY.Xd() ^ 22276)), clsArr2);
                        try {
                            method4.setAccessible(true);
                            String str2 = (String) method4.invoke(context, objArr3);
                            if (TextUtils.isEmpty(str2)) {
                                aFa1zSDK2.getRevenue(C1626yg.Ud("\\Uy'Oq+5\u001d\u0013\fXDu\u0007o\u000b-\u001ftY]Z\u0014?\u0007:*5<Y\u0016\u0003l\u0014U `[e", (short) (C1499aX.Xd() ^ (-2309)), (short) (C1499aX.Xd() ^ (-20625))));
                            } else {
                                method.invoke(null, context, str2, objNewProxyInstance);
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (ClassNotFoundException e5) {
                AFLogger.afErrorLogForExcManagerOnly(EO.Od(">\u000b8U0b\u000bD [SAlra>\u0014Q8\u0012N'", (short) (C1499aX.Xd() ^ (-6684))), e5);
                aFa1zSDK2.getRevenue(e5.toString());
            } catch (IllegalAccessException e6) {
                short sXd8 = (short) (OY.Xd() ^ 19446);
                int[] iArr6 = new int["k\u0010i\u0016~)Px/\u0019Tq$ 4\u001bE".length()];
                QB qb6 = new QB("k\u0010i\u0016~)Px/\u0019Tq$ 4\u001bE");
                int i7 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd8 + i7)));
                    i7++;
                }
                AFLogger.afErrorLogForExcManagerOnly(new String(iArr6, 0, i7), e6);
                aFa1zSDK2.getRevenue(e6.toString());
            } catch (NoSuchMethodException e7) {
                AFLogger.afErrorLogForExcManagerOnly(C1593ug.zd("YV5\u0004|\r\u0002\n\u007f<\u000b\b\u0013\u0014\u000b\u0011\u000bD\u000b\u0019\u001a\u0018\u001c", (short) (C1580rY.Xd() ^ (-31448)), (short) (C1580rY.Xd() ^ (-8142))), e7);
                aFa1zSDK2.getRevenue(e7.toString());
            } catch (InvocationTargetException e8) {
                AFLogger.afErrorLogForExcManagerOnly(C1561oA.Qd("toL\u0015\u0019 \u0018\u000b\b\u001a\u000e\u0013\u0011A\u0006\u0012\u0011\r\u000f", (short) (FB.Xd() ^ 2430)), e8);
                aFa1zSDK2.getRevenue(e8.toString());
            }
        }
    }
}
