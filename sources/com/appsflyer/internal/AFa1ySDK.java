package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFj1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.common.GoogleApiAvailability;
import io.sentry.Session;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
public final class AFa1ySDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFInAppEventParameterName = false;
    private static boolean AFInAppEventType = false;
    private static int AFKeystoreWrapper = 0;
    private static char[] AFLogger = null;
    private static AFa1ySDK areAllFieldsValid = null;
    static AppsFlyerInAppPurchaseValidatorListener getCurrencyIso4217Code = null;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;

    /* JADX INFO: renamed from: i */
    private static int f2589i = 1;
    private static int registerClient = 0;
    Application component2;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private boolean hashCode;
    private volatile SharedPreferences toString;
    public volatile AppsFlyerConversionListener getRevenue = null;
    private long component3 = -1;
    long AFAdRevenueData = -1;
    private long component4 = TimeUnit.SECONDS.toMillis(5);
    boolean component1 = false;
    private final AFc1bSDK copy = new AFc1bSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$2 */
    final class AnonymousClass2 implements AFb1aSDK.AFa1tSDK {
        private /* synthetic */ AFh1xSDK AFAdRevenueData;
        private /* synthetic */ AppsFlyerRequestListener getMediationNetwork;

        AnonymousClass2(AFh1xSDK aFh1xSDK, AppsFlyerRequestListener appsFlyerRequestListener) {
            aFh1xSDK = aFh1xSDK;
            appsFlyerRequestListener = appsFlyerRequestListener;
        }

        @Override // com.appsflyer.internal.AFb1aSDK.AFa1tSDK
        public final void getMediationNetwork() throws Throwable {
            Context context = AFa1ySDK.this.getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
            AFLogger.afInfoLog(hg.Vd("a_2TQNYP,JKRMWSXPE", (short) (C1633zX.Xd() ^ (-30134)), (short) (C1633zX.Xd() ^ (-25321))));
            AFh1xSDK aFh1xSDK = aFh1xSDK;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aFh1xSDK.component4 != 0) {
                long j2 = jCurrentTimeMillis - aFh1xSDK.component4;
                if (j2 > 0 && j2 < 1000) {
                    j2 = 1000;
                }
                aFh1xSDK.copydefault = TimeUnit.MILLISECONDS.toSeconds(j2);
                aFh1xSDK.getMonetizationNetwork.AFAdRevenueData(C1561oA.ud("78*:\"5&32',*\u001a\u001e.*", (short) (C1499aX.Xd() ^ (-22348))), aFh1xSDK.copydefault);
            } else {
                short sXd = (short) (ZN.Xd() ^ 1853);
                int[] iArr = new int["\u000f&85' 3xY\u001f#Z*(W EpA<A@9=1".length()];
                QB qb = new QB("\u000f&85' 3xY\u001f#Z*(W EpA<A@9=1");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                AFLogger.afInfoLog(new String(iArr, 0, i2));
            }
            AFLogger.afInfoLog(C1561oA.Yd(",+78 B0DD\u001447@=IGNH?{??BKHTRYSJ\u0007KJVW", (short) (OY.Xd() ^ 10810)));
            AFa1ySDK.this.getMonetizationNetwork().afErrorLogForExcManagerOnly().AFAdRevenueData();
            AFd1oSDK aFd1oSDKCopy = AFa1ySDK.this.getMonetizationNetwork().copy();
            if (aFd1oSDKCopy.areAllFieldsValid()) {
                aFd1oSDKCopy.getMediationNetwork();
                if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Xg.qd("-;2A?:6\u00017DDK=GN\t\u001fLLSEYV", (short) (OY.Xd() ^ 28051), (short) (OY.Xd() ^ 24355))).getMethod(Jg.Wd("8s^\u0018\tH,\u0002d\u001edW?t", (short) (C1499aX.Xd() ^ (-8404)), (short) (C1499aX.Xd() ^ (-16667))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        String str = (String) method.invoke(context, objArr);
                        short sXd2 = (short) (ZN.Xd() ^ 12655);
                        short sXd3 = (short) (ZN.Xd() ^ 24884);
                        int[] iArr2 = new int[" \u0001ABn'J)*75l\u000e)\u001f\u0005n5YZ\fK0".length()];
                        QB qb2 = new QB(" \u0001ABn'J)*75l\u000e)\u001f\u0005n5YZ\fK0");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                            i3++;
                        }
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1626yg.Ud("D\b\u000bP\fC{R\u001b\r;%q(\u001dBe", (short) (OY.Xd() ^ 471), (short) (OY.Xd() ^ 2817)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            aFd1oSDKCopy.q_(str, (PackageManager) method2.invoke(context, objArr2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                aFd1oSDKCopy.getMonetizationNetwork();
            } else {
                AFLogger.afDebugLog(Ig.wd("j\u0007\u0015\r\u001e]@\"d%l\u0019\u0012\u0013\u0006l", (short) (C1633zX.Xd() ^ (-26280))));
            }
            AFa1ySDK.this.getMonetizationNetwork().equals().getMonetizationNetwork();
            AFa1ySDK.this.getMonetizationNetwork().afVerboseLog().AFAdRevenueData();
            AFa1ySDK.this.getMonetizationNetwork().getCurrencyIso4217Code().getMediationNetwork();
            AFh1pSDK aFh1pSDKAfWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
            if (aFh1pSDKAfWarnLog != null) {
                aFh1pSDKAfWarnLog.AFAdRevenueData();
            }
        }

        @Override // com.appsflyer.internal.AFb1aSDK.AFa1tSDK
        public final void getRevenue(AFh1qSDK aFh1qSDK) throws Throwable {
            aFh1xSDK.getMonetizationNetwork();
            AFd1zSDK monetizationNetwork = AFa1ySDK.this.getMonetizationNetwork();
            monetizationNetwork.component1().AFAdRevenueData(AFa1ySDK.this.AFAdRevenueData());
            AFa1ySDK.this.component1();
            int revenue = monetizationNetwork.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
            AFLogger.afInfoLog("onBecameForeground");
            if (revenue < 2) {
                AFa1ySDK.this.getMonetizationNetwork().equals().AFAdRevenueData();
            }
            AFh1eSDK aFh1eSDK = new AFh1eSDK();
            if (aFh1qSDK != null) {
                AFa1ySDK.this.getMonetizationNetwork().i().f_(AFa1jSDK.getCurrencyIso4217Code(aFh1eSDK), aFh1qSDK.getMonetizationNetwork, monetizationNetwork.AFInAppEventParameterName().getMonetizationNetwork);
                AFh1pSDK aFh1pSDKAfWarnLog = monetizationNetwork.afWarnLog();
                if (aFh1pSDKAfWarnLog != null && aFh1qSDK.getMonetizationNetwork != null) {
                    aFh1pSDKAfWarnLog.u_(aFh1qSDK.getMonetizationNetwork, AFa1ySDK.this.getMonetizationNetwork().i());
                }
            }
            AFa1ySDK aFa1ySDK = AFa1ySDK.this;
            aFh1eSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
            aFa1ySDK.getCurrencyIso4217Code(aFh1eSDK, aFh1qSDK);
            AFa1ySDK.this.getMonetizationNetwork().getCurrencyIso4217Code().getMediationNetwork();
            AFa1ySDK.this.getMonetizationNetwork().getCurrencyIso4217Code().getMonetizationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", false);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getCurrencyIso4217Code = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getCurrencyIso4217Code[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1zSDK implements AFe1qSDK {
        AFa1zSDK() {
        }

        public /* synthetic */ Unit getMediationNetwork() throws Throwable {
            AFa1ySDK.this.getMediationNetwork(new AFh1kSDK());
            return Unit.INSTANCE;
        }

        private boolean getRevenue() {
            return AFa1ySDK.this.getRevenue != null;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1mSDK<?> aFe1mSDK) {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getRevenue(AFe1mSDK<?> aFe1mSDK, AFe1uSDK aFe1uSDK) {
            JSONObject monetizationNetwork;
            AFf1aSDK revenue;
            if (!(aFe1mSDK instanceof AFf1sSDK)) {
                if (!(aFe1mSDK instanceof AFg1kSDK) || aFe1uSDK == AFe1uSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1ySDK.this.getMonetizationNetwork());
                AFe1oSDK aFe1oSDKCopydefault = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFg1pSDK));
                return;
            }
            AFf1sSDK aFf1sSDK = (AFf1sSDK) aFe1mSDK;
            boolean z2 = aFe1mSDK instanceof AFf1rSDK;
            if (z2 && getRevenue()) {
                AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1mSDK;
                if (aFf1rSDK.getMonetizationNetwork == AFe1uSDK.SUCCESS || aFf1rSDK.getMediationNetwork == 1) {
                    AFg1kSDK aFg1kSDK = new AFg1kSDK(aFf1rSDK, AFa1ySDK.this.getMonetizationNetwork().component4());
                    AFe1oSDK aFe1oSDKCopydefault2 = AFa1ySDK.this.getMonetizationNetwork().copydefault();
                    aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new AnonymousClass1(aFg1kSDK));
                }
            }
            AFh1pSDK aFh1pSDKAfWarnLog = AFa1ySDK.this.getMonetizationNetwork().afWarnLog();
            if (aFh1pSDKAfWarnLog != null && z2) {
                aFh1pSDKAfWarnLog.getMonetizationNetwork((AFf1rSDK) aFe1mSDK, new Function0() { // from class: com.appsflyer.internal.AFa1ySDK$AFa1zSDK$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f$0.getMediationNetwork();
                    }
                });
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                aFa1ySDK.getMonetizationNetwork(aFa1ySDK.component2).getRevenue("sentSuccessfully", "true");
                if (!(aFe1mSDK instanceof AFf1oSDK) && (revenue = new AFg1sSDK(AFa1ySDK.this.component2).getRevenue()) != null && revenue.getMediationNetwork) {
                    String str = revenue.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK monetizationNetwork2 = AFa1ySDK.getRevenue().getMonetizationNetwork();
                    AFf1oSDK aFf1oSDK = new AFf1oSDK(str, monetizationNetwork2);
                    AFe1oSDK aFe1oSDKCopydefault3 = monetizationNetwork2.copydefault();
                    aFe1oSDKCopydefault3.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault3.new AnonymousClass1(aFf1oSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1fSDK) aFf1sSDK).areAllFieldsValid;
                if (responseNetwork != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork((String) responseNetwork.getBody())) != null) {
                    AFa1ySDK.this.component1 = monetizationNetwork.optBoolean("send_background", false);
                }
                if (z2) {
                    AFa1ySDK.this.AFAdRevenueData = System.currentTimeMillis();
                }
            }
        }
    }

    static {
        component2();
        getMonetizationNetwork = "372";
        getMediationNetwork = "6.17.6".substring(0, "6.17.6".lastIndexOf("."));
        getCurrencyIso4217Code = null;
        areAllFieldsValid = new AFa1ySDK();
        int i2 = AFKeystoreWrapper + 87;
        f2589i = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFa1ySDK() {
        getMonetizationNetwork().afInfoLog().getRevenue();
        getMonetizationNetwork().afInfoLog().getMonetizationNetwork();
        AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
        aFe1oSDKCopydefault.getMediationNetwork.add(new AFa1zSDK());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 5;
        f2589i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        aFa1ySDK.setLogLevel(!zBooleanValue ? AFLogger.LogLevel.NONE : AFLogger.LogLevel.DEBUG);
        int i4 = f2589i + 117;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 71;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        String monetizationNetwork = aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", (String) null);
        if (monetizationNetwork != null) {
            int i5 = f2589i + 87;
            AFKeystoreWrapper = i5 % 128;
            if (i5 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        aFc1qSDK.getRevenue("CACHED_CHANNEL", str);
        int i6 = AFKeystoreWrapper + 37;
        f2589i = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) throws Throwable {
        int i2 = 2 % 2;
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getRevenue = map;
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
        int i3 = AFKeystoreWrapper + 125;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
    }

    public /* synthetic */ void AFAdRevenueData(AFf1pSDK aFf1pSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 77;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            getMonetizationNetwork();
            AFf1pSDK aFf1pSDK2 = AFf1pSDK.SUCCESS;
            throw null;
        }
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        if (aFf1pSDK == AFf1pSDK.SUCCESS) {
            monetizationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork();
        }
        if (monetizationNetwork.copy().AFAdRevenueData()) {
            monetizationNetwork.afInfoLog().getRevenue();
            return;
        }
        int i4 = AFKeystoreWrapper + 7;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
        monetizationNetwork.afInfoLog().getCurrencyIso4217Code();
        int i6 = f2589i + 103;
        AFKeystoreWrapper = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        if (aFh1mSDK.areAllFieldsValid == null) {
            int i3 = f2589i + 73;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getCurrencyIso4217Code()) {
            int i5 = AFKeystoreWrapper + 33;
            f2589i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z2) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                int i7 = AFKeystoreWrapper + 7;
                f2589i = i7 % 128;
                int i8 = i7 % 2;
                if (component4()) {
                    int i9 = f2589i + 39;
                    AFKeystoreWrapper = i9 % 128;
                    int i10 = i9 % 2;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.component3 = System.currentTimeMillis();
        }
        getMediationNetwork(aFh1mSDK);
    }

    public /* synthetic */ void AFAdRevenueData(AFi1hSDK aFi1hSDK) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 25;
        f2589i = i3 % 128;
        Object[] objArr = {this, aFi1hSDK};
        if (i3 % 2 == 0) {
            getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
            throw null;
        }
        getRevenue(objArr, 608861720, -608861711, System.identityHashCode(this));
        int i4 = f2589i + 15;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AFAdRevenueData(String str) {
        int i2 = 2 % 2;
        final AFh1mSDK aFh1mSDKAFAdRevenueData = new AFh1nSDK().AFAdRevenueData(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0));
        aFh1mSDKAFAdRevenueData.component1 = str;
        if (str == null || str.length() <= 5 || !getMonetizationNetwork().AFLogger().getMediationNetwork(aFh1mSDKAFAdRevenueData)) {
            return;
        }
        int i3 = f2589i + 15;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.getCurrencyIso4217Code(aFh1mSDKAFAdRevenueData);
                }
            }, 5L, TimeUnit.MILLISECONDS);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.getCurrencyIso4217Code(aFh1mSDKAFAdRevenueData);
            }
        }, 5L, TimeUnit.MILLISECONDS);
        int i4 = AFKeystoreWrapper + 21;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void AFAdRevenueData(String str, boolean z2) throws Throwable {
        getRevenue(new Object[]{str, Boolean.valueOf(z2)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
    }

    private static void AFAdRevenueData(JSONObject jSONObject) {
        String str;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i3)));
                }
            } catch (JSONException e2) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e2);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext()) {
                int i4 = AFKeystoreWrapper + 7;
                f2589i = i4 % 128;
                int i5 = i4 % 2;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i6 = 0;
                    while (i6 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i6) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i6) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        int i7 = f2589i + 61;
                        AFKeystoreWrapper = i7 % 128;
                        int i8 = i7 % 2;
                        if (jSONArray2.getLong(i6) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i6++;
                        str = next;
                    }
                } catch (JSONException e3) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e3);
                }
            }
            break loop2;
        }
        if (str != null) {
            int i9 = f2589i + 111;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            jSONObject.remove(str);
        }
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 41 / 0;
                bytes = str.getBytes("ISO-8859-1");
            } else {
                bytes = str.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = AFLogger;
        if (cArr2 != null) {
            int i6 = $10 + 29;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr3[i8] = (char) (((long) cArr2[i8]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i9 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFInAppEventType) {
            aFk1oSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            int i10 = $10 + 43;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr4[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[bArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i2] - i9);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (AFInAppEventParameterName) {
            aFk1oSDK.getMonetizationNetwork = cArr.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i9);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i9);
            aFk1oSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr6);
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 37;
        f2589i = i3 % 128;
        if (i3 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, zBooleanValue);
            return null;
        }
        AppsFlyerProperties.getInstance().set(str, zBooleanValue);
        throw null;
    }

    private void areAllFieldsValid() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 73;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        try {
            final AFi1hSDK aFi1hSDKAfErrorLog = getMonetizationNetwork().afErrorLog();
            if (aFi1hSDKAfErrorLog == null) {
                return;
            }
            if (!aFi1hSDKAfErrorLog.getCurrencyIso4217Code()) {
                if (aFi1hSDKAfErrorLog.AFAdRevenueData()) {
                    return;
                }
                getRevenue(new Object[]{this, aFi1hSDKAfErrorLog}, 608861720, -608861711, System.identityHashCode(this));
            } else {
                int i5 = f2589i + 101;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 == 0) {
                    aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda0
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() throws Throwable {
                            this.f$0.AFAdRevenueData(aFi1hSDKAfErrorLog);
                        }
                    });
                } else {
                    aFi1hSDKAfErrorLog.getMediationNetwork(new AFi1dSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda0
                        @Override // com.appsflyer.internal.AFi1dSDK
                        public final void onRequestFinished() throws Throwable {
                            this.f$0.AFAdRevenueData(aFi1hSDKAfErrorLog);
                        }
                    });
                    throw null;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    private static void areAllFieldsValid(Context context) throws Throwable {
        getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
    }

    private static void c_(Context context, PackageInfo packageInfo) {
        Object obj;
        int i2 = 2 % 2;
        try {
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, Ig.wd("/\u001cvVG\u000f.1\u0002\u0015p=\u0014\u0007\u0006\u001cCf\f\u001ef!H=&p2V\u001d9\\Z.C\u0011]LJ", (short) (OY.Xd() ^ 13464)), th);
        }
        if (packageInfo.applicationInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            short sXd = (short) (FB.Xd() ^ 9490);
            int[] iArr = new int["t'\u0011\u0002\u0019o\t\\l76\u001c[p\r'\u000e\u000f\n\u0007p\u001bvy^RJoY-\u0016Yk\u0019".length()];
            QB qb = new QB("t'\u0011\u0002\u0019o\t\\l76\u001c[p\r'\u000e\u000f\n\u0007p\u001bvy^RJoY-\u0016Yk\u0019");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            String str = new String(iArr, 0, i3);
            String strQd = C1561oA.Qd("\u0014\u0019\r\u0012\u001d", (short) (C1580rY.Xd() ^ (-13248)));
            try {
                Class<?> cls = Class.forName(str);
                Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th2) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            if ((iIntValue + 32768) - (iIntValue | 32768) != 0) {
                int i4 = Build.VERSION.SDK_INT;
                String strZd = C1593ug.zd("?55", (short) (OY.Xd() ^ 12047), (short) (OY.Xd() ^ 30328));
                if (i4 < 31) {
                    short sXd2 = (short) (ZN.Xd() ^ 5734);
                    int[] iArr2 = new int["y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v".length()];
                    QB qb2 = new QB("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v");
                    int i5 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i5] = xuXd2.fK(sXd2 + i5 + xuXd2.CK(iKK2));
                        i5++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i5));
                    Object[] objArr = new Object[0];
                    Method method = cls2.getMethod(C1561oA.yd("DCS2FURYG9<K", (short) (C1580rY.Xd() ^ (-25959))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Resources resources = (Resources) method.invoke(context, objArr);
                        String strYd = C1561oA.Yd("M]^bV]kXfTXX[dok[osket", (short) (ZN.Xd() ^ OlympusFocusInfoMakernoteDirectory.TagExternalFlashBounce));
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(Xg.qd("GUL[YTP\u001bQ^^eWah#9ffm_sp", (short) (FB.Xd() ^ 18525), (short) (FB.Xd() ^ 13585))).getMethod(Jg.Wd("`\u001a\u0007;(#\tW=\u0004J6\u001e\u000f", (short) (C1633zX.Xd() ^ (-14182)), (short) (C1633zX.Xd() ^ (-29769))), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            if (resources.getIdentifier(strYd, strZd, (String) method2.invoke(context, objArr2)) == 0) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, C1626yg.Ud("Z7g\u0018&{\u001b\u000bi\u0002B/Kylr*\u001bK\u000ba\u001dTqg\u001fhRi{c%Z\u0013w`~w-1c\u00064\u0006cpl!?i\u0016q\u007f\u001eo\u007fb@\u0011qge8cY}s\n@\u007fRj|^I&J\u0002\fi\u000ePr-\tW}qY\u0002f\fYl\u000b?\u001e_:\u007fa\u0003]H\u007f<j\\_=o7\u001fG\u0013j\u0015Y\r\u0014H!\u001aZ\rF1Ezx iWy0$Qt`GxV\tX0\u007fbpsiO,\u0007_C0O/X>W,\u0004)vGcP{\u0019i\u0018pQpfs\t0aG\n\u001f\\<\u0013G\u0004\u0019Y6\fdo`*j3I5 D&{\"9X!?9!R\u000e'Zx<|rKk\u001f\u001c_Kz6\u001d@#Vo\u001dP\u0013[kohh %t->\r;\u0016N*aA'=<\u0017^,g\u0006-W.In\bi\u0013UT^PJd\"xm+\u00040\u000bN\u001ew`fB%\u0012SGw\u0004qo&\f3\u007fS}rr\u0007:\u0012\u00043\u007f-\u0017Gbo\u0015Wdj!@(R\r`U\u000e\u0003P,\u0007U^\bP\r\u001b#\\-\u000fN\u001a\u001c.C+zft-\u0006DW\u0015]\u007fYxJfh6IO\u0013\u001d@mb\u0014,[\u0003R\u001eo\b%\r\u0010\u0006\u000e\u001c\u001c'cci\bdNf55\u001f>l\u000b6e-T\u001c6DbyQ. NWy\"z:~EoF#eC\u001fv\u0016z\u0003bD\u001e1%\u0015OQl\\0K04Hb\u001aBNjS/N`e0B\\E`8'\u00196\u0016XI", (short) (C1580rY.Xd() ^ (-10292)), (short) (C1580rY.Xd() ^ (-25055))), true);
                                return;
                            }
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                            short sXd3 = (short) (OY.Xd() ^ 10297);
                            short sXd4 = (short) (OY.Xd() ^ 11572);
                            int[] iArr3 = new int["tq<\u0001r+,x6\u0019,Okn6rY`@g4\u0001e *\u0017 :`K\u0018Q<hV3-xk\u0010\rlgK~\u0012Eqp=l}f\u0004\u0019\u0001\u0014zk4AUJ72~\ns\u0014IeJ\u000e\"\f\u001e\u001bJ9:Z\tCoJ\u0006\u0005+!PW\u0011tF8f".length()];
                            QB qb3 = new QB("tq<\u0001r+,x6\u0019,Okn6rY`@g4\u0001e *\u0017 :`K\u0018Q<hV3-xk\u0010\rlgK~\u0012Eqp=l}f\u0004\u0019\u0001\u0014zk4AUJ72~\ns\u0014IeJ\u000e\"\f\u001e\u001bJ9:Z\tCoJ\u0006\u0005+!PW\u0011tF8f");
                            int i6 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd4) + sXd3)));
                                i6++;
                            }
                            aFLogger.i(aFg1cSDK, new String(iArr3, 0, i6), true);
                            return;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                short sXd5 = (short) (C1499aX.Xd() ^ (-20872));
                int[] iArr4 = new int["]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z".length()];
                QB qb4 = new QB("]i^kg`Z#Wb`eU]b\u001b/ZX]M_Z");
                int i7 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i7] = xuXd4.fK(sXd5 + sXd5 + i7 + xuXd4.CK(iKK4));
                    i7++;
                }
                Class<?> cls3 = Class.forName(new String(iArr4, 0, i7));
                Object[] objArr3 = new Object[0];
                Method method3 = cls3.getMethod(C1561oA.Kd("-,<\u001b/>;B@25D", (short) (C1580rY.Xd() ^ (-2617))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Resources resources2 = (Resources) method3.invoke(context, objArr3);
                    short sXd6 = (short) (C1607wl.Xd() ^ 31125);
                    short sXd7 = (short) (C1607wl.Xd() ^ 17776);
                    int[] iArr5 = new int["<\u0011Di\u0019\u0012a\n\nY[+`J\u001b#s\u0003\"nc6H\u0002\"0v\u001cO;\f".length()];
                    QB qb5 = new QB("<\u0011Di\u0019\u0012a\n\nY[+`J\u001b#s\u0003\"nc6H\u0002\"0v\u001cO;\f");
                    int i8 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i8] = xuXd5.fK(((i8 * sXd7) ^ sXd6) + xuXd5.CK(iKK5));
                        i8++;
                    }
                    String str2 = new String(iArr5, 0, i8);
                    short sXd8 = (short) (C1580rY.Xd() ^ (-7837));
                    int[] iArr6 = new int["x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"".length()];
                    QB qb6 = new QB("x\u0007}\r\u000b\u0006\u0002L\u0003\u0010\u0010\u0017\t\u0013\u001aTj\u0018\u0018\u001f\u0011%\"");
                    int i9 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i9] = xuXd6.fK(xuXd6.CK(iKK6) - (sXd8 + i9));
                        i9++;
                    }
                    Class<?> cls4 = Class.forName(new String(iArr6, 0, i9));
                    Object[] objArr4 = new Object[0];
                    Method method4 = cls4.getMethod(Wg.vd("FCU0DEPENK7IXO", (short) (C1633zX.Xd() ^ (-7323))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        if (resources2.getIdentifier(str2, strZd, (String) method4.invoke(context, objArr4)) != 0) {
                            int i10 = f2589i + 65;
                            AFKeystoreWrapper = i10 % 128;
                            int i11 = i10 % 2;
                            String strKd = Qg.kd("GUTVHMYDP<@<N:7<NIF45E9><,>@6.;t>20b&&4$!1!\u001feX-*\u001f#\u001bRr! \"s\u0019%\u0010\u001cH\f\b\u001a\u0006C\b\u001a\u0015\u0012\u007f\u0001\u0011\u0005\n\b8\n\f\u0002y\u00072w\u007f\u0002.N|{}Ot\u0001kw$VFL c_q]", (short) (C1580rY.Xd() ^ (-10932)), (short) (C1580rY.Xd() ^ (-30421)));
                            if (i11 != 0) {
                                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, strKd, true);
                                return;
                            } else {
                                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, strKd, true);
                                return;
                            }
                        }
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.GENERAL;
                        short sXd9 = (short) (OY.Xd() ^ 27308);
                        short sXd10 = (short) (OY.Xd() ^ 25067);
                        int[] iArr7 = new int["F\u007f\n\t\u000b\u0012[yz\u0002\u000b\u0005:2z\u0004/\u0002r\u0001+~x({xzi>\"bpoqcht_kW[WiURWidaOP`TYWGY[QIV\u0010YMK}FOz((,v::H85E53{V\r;:<\u000e3?*6b5)!1#![+,\u001e\u001e\u001c(\u001a\"\u0016\u0017$O\"\u0016\u001c!\u0017\u000eH\n\fE\n\u001c\u0006\u000e\u0016\u0004\u0004\u0002<\u0002\r\t\u00067w\u000b\t\u00032sqry\u0003|+l\u0003(hjimqi; ;cu_go]]\u0017ZdaT[_-\u0011aUM]OMXYKK\u0006\u0003RBTG\u001b~=KJL>CO:F\u007f62D0o{\nj>8g;.*c\u000421,(!\u001e0$)'^*Up\u0018\u0014&\u0012\\\u0014&!\u001e\f\r\u001d\u0011\u0016\u0014Q\u0016\u0018\u000e\u0006\u0013\\=~\u000b\u000f\u00028\u0001\u00055Pww\byrs:\u0001}kw{mkwB#cod\u001f:`hjo]%YWX_hb/\u001ex7S\f,ZY[MR^IU\tT\u007f/SO?C;L=v\u0019DBA74D>@l5>i26f;8)b6)%-]6+0Y\u001a$*%T!(%%O\u0010\u0012\u0011K\u001f\u0019Hc\u000b\u000b\u001b\r\u0006\u0007M\u0014\u0011~\u000b\u000f\u0001~\u000bU6v\u0003w2Ms{}\u0003p8ljkr{uB#vie\u001fdlhgipae]\u0015YkU]eSS`&\u000b&N`JRZHH\u0002EOL?FJ\u0018{L@8H:8CD66pm=-?2\u0006i(657).:%1j-1-\u001d!\u0019*\u001ba\u0018\u0014&\u0012Q]kLlxmHc\f\u001e\b\u0010\u0018\u0006\u0006?\u0003\r\n|\u0004\bU9zv\tttr\u0004t0-|l~qE)gktxtdh`qbo)^[\u001a&4".length()];
                        QB qb7 = new QB("F\u007f\n\t\u000b\u0012[yz\u0002\u000b\u0005:2z\u0004/\u0002r\u0001+~x({xzi>\"bpoqcht_kW[WiURWidaOP`TYWGY[QIV\u0010YMK}FOz((,v::H85E53{V\r;:<\u000e3?*6b5)!1#![+,\u001e\u001e\u001c(\u001a\"\u0016\u0017$O\"\u0016\u001c!\u0017\u000eH\n\fE\n\u001c\u0006\u000e\u0016\u0004\u0004\u0002<\u0002\r\t\u00067w\u000b\t\u00032sqry\u0003|+l\u0003(hjimqi; ;cu_go]]\u0017ZdaT[_-\u0011aUM]OMXYKK\u0006\u0003RBTG\u001b~=KJL>CO:F\u007f62D0o{\nj>8g;.*c\u000421,(!\u001e0$)'^*Up\u0018\u0014&\u0012\\\u0014&!\u001e\f\r\u001d\u0011\u0016\u0014Q\u0016\u0018\u000e\u0006\u0013\\=~\u000b\u000f\u00028\u0001\u00055Pww\byrs:\u0001}kw{mkwB#cod\u001f:`hjo]%YWX_hb/\u001ex7S\f,ZY[MR^IU\tT\u007f/SO?C;L=v\u0019DBA74D>@l5>i26f;8)b6)%-]6+0Y\u001a$*%T!(%%O\u0010\u0012\u0011K\u001f\u0019Hc\u000b\u000b\u001b\r\u0006\u0007M\u0014\u0011~\u000b\u000f\u0001~\u000bU6v\u0003w2Ms{}\u0003p8ljkr{uB#vie\u001fdlhgipae]\u0015YkU]eSS`&\u000b&N`JRZHH\u0002EOL?FJ\u0018{L@8H:8CD66pm=-?2\u0006i(657).:%1j-1-\u001d!\u0019*\u001ba\u0018\u0014&\u0012Q]kLlxmHc\f\u001e\b\u0010\u0018\u0006\u0006?\u0003\r\n|\u0004\bU9zv\tttr\u0004t0-|l~qE)gktxtdh`qbo)^[\u001a&4");
                        int i12 = 0;
                        while (qb7.YK()) {
                            int iKK7 = qb7.KK();
                            Xu xuXd7 = Xu.Xd(iKK7);
                            iArr7[i12] = xuXd7.fK(sXd9 + i12 + xuXd7.CK(iKK7) + sXd10);
                            i12++;
                        }
                        aFLogger2.w(aFg1cSDK2, new String(iArr7, 0, i12), true);
                        int i13 = f2589i + 49;
                        AFKeystoreWrapper = i13 % 128;
                        int i14 = i13 % 2;
                        return;
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, Ig.wd("/\u001cvVG\u000f.1\u0002\u0015p=\u0014\u0007\u0006\u001cCf\f\u001ef!H=&p2V\u001d9\\Z.C\u0011]LJ", (short) (OY.Xd() ^ 13464)), th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object component1(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.component1(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        try {
            if (new JSONObject(str).has("pid")) {
                int i3 = f2589i + 97;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 == 0) {
                    getMediationNetwork("preInstallName", str);
                    return null;
                }
                getMediationNetwork("preInstallName", str);
                throw null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i4 = AFKeystoreWrapper + 113;
            f2589i = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e2);
            return null;
        }
    }

    static void component2() {
        AFLogger = new char[]{35848, 35853, 35850, 35871, 35840, 35844, 35852, 35870, 35867};
        registerClient = 1912311211;
        AFInAppEventParameterName = true;
        AFInAppEventType = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035 A[PHI: r3 r4
  0x0035: PHI (r3v3 com.appsflyer.internal.AFh1vSDK) = (r3v2 com.appsflyer.internal.AFh1vSDK), (r3v4 com.appsflyer.internal.AFh1vSDK) binds: [B:32:0x0071, B:23:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r4v2 com.appsflyer.internal.AFh1xSDK) = (r4v0 com.appsflyer.internal.AFh1xSDK), (r4v3 com.appsflyer.internal.AFh1xSDK) binds: [B:32:0x0071, B:23:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object component3(java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            r8 = 0
            r3 = r9[r8]
            com.appsflyer.internal.AFa1ySDK r3 = (com.appsflyer.internal.AFa1ySDK) r3
            r0 = 1
            r2 = r9[r0]
            android.content.Context r2 = (android.content.Context) r2
            r7 = 2
            r6 = r9[r7]
            com.appsflyer.internal.AFh1tSDK r6 = (com.appsflyer.internal.AFh1tSDK) r6
            int r0 = r7 % r7
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r7
            r5 = 0
            if (r1 != 0) goto L5e
            r3.AFAdRevenueData(r2)
            com.appsflyer.internal.AFd1zSDK r0 = r3.getMonetizationNetwork()
            com.appsflyer.internal.AFh1xSDK r4 = r0.areAllFieldsValid()
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r2)
            boolean r1 = r4.AFAdRevenueData()
            r0 = 14
            int r0 = r0 / r8
            if (r1 == 0) goto L4e
        L35:
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r7
            java.lang.String r2 = "api_name"
            if (r1 == 0) goto L74
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.AFAdRevenueData
            java.lang.String r0 = r6.toString()
            r1.put(r2, r0)
            r4.getRevenue(r3)
        L4e:
            r4.getMonetizationNetwork()
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L5d
            int r7 = r7 / r8
        L5d:
            return r5
        L5e:
            r3.AFAdRevenueData(r2)
            com.appsflyer.internal.AFd1zSDK r0 = r3.getMonetizationNetwork()
            com.appsflyer.internal.AFh1xSDK r4 = r0.areAllFieldsValid()
            com.appsflyer.internal.AFh1vSDK r3 = com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r2)
            boolean r0 = r4.AFAdRevenueData()
            if (r0 == 0) goto L4e
            goto L35
        L74:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.AFAdRevenueData
            java.lang.String r0 = r6.toString()
            r1.put(r2, r0)
            r4.getRevenue(r3)
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.component3(java.lang.Object[]):java.lang.Object");
    }

    private AFj1tSDK[] component3() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 71;
        f2589i = i3 % 128;
        AFj1tSDK[] aFj1tSDKArr = (AFj1tSDK[]) (i3 % 2 == 0 ? getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]) : getMonetizationNetwork().AFLogger().getRevenue.toArray(new AFj1tSDK[0]));
        int i4 = AFKeystoreWrapper + 107;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
        return aFj1tSDKArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0073 A[Catch: all -> 0x00cb, JSONException -> 0x00e5, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00e5, all -> 0x00cb, blocks: (B:41:0x002e, B:47:0x0059, B:48:0x0063, B:54:0x008e, B:57:0x009e, B:58:0x00a1, B:61:0x00b5, B:62:0x00b8, B:49:0x0068, B:51:0x0073, B:53:0x0088, B:45:0x004b), top: B:70:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088 A[Catch: all -> 0x00cb, JSONException -> 0x00e5, TRY_ENTER, TryCatch #2 {JSONException -> 0x00e5, all -> 0x00cb, blocks: (B:41:0x002e, B:47:0x0059, B:48:0x0063, B:54:0x008e, B:57:0x009e, B:58:0x00a1, B:61:0x00b5, B:62:0x00b8, B:49:0x0068, B:51:0x0073, B:53:0x0088, B:45:0x004b), top: B:70:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object component4(java.lang.Object[] r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.component4(java.lang.Object[]):java.lang.Object");
    }

    private boolean component4() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 101;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        if (this.component3 <= 0) {
            if (!(!isStopped())) {
                return false;
            }
            int i5 = AFKeystoreWrapper + 113;
            f2589i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.afInfoLog("Sending first launch for this session!");
            int i7 = AFKeystoreWrapper + 121;
            f2589i = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.component3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
        String monetizationNetwork = getMonetizationNetwork(simpleDateFormat, this.component3);
        String monetizationNetwork2 = getMonetizationNetwork(simpleDateFormat, this.AFAdRevenueData);
        if (jCurrentTimeMillis >= this.component4 || isStopped()) {
            if (isStopped()) {
                return false;
            }
            AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", monetizationNetwork, monetizationNetwork2, Long.valueOf(jCurrentTimeMillis)));
            return false;
        }
        int i9 = f2589i + 25;
        AFKeystoreWrapper = i9 % 128;
        int i10 = i9 % 2;
        AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", monetizationNetwork, monetizationNetwork2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.component4)));
        return true;
    }

    private static /* synthetic */ Object copy(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i2 = 2 % 2;
        try {
            Object[] objArr2 = new Object[0];
            Method method = Class.forName(C1561oA.Xd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (C1633zX.Xd() ^ (-31871)))).getMethod(Wg.vd("\t\b\u0018t~\u0002\u000b\u0002\u0011\u0010x\u000e\u0014\b\u000f\u000e$", (short) (C1580rY.Xd() ^ (-29958))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr2);
                Class<?> cls = Class.forName(Qg.kd("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=Q|z\u007fo\u0002|", (short) (C1580rY.Xd() ^ (-23127)), (short) (C1580rY.Xd() ^ (-16307))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 3760);
                short sXd2 = (short) (ZN.Xd() ^ 21661);
                int[] iArr = new int["\u0003\u007f\u000ehxy\u0001uzw_q|s".length()];
                QB qb = new QB("\u0003\u007f\u000ehxy\u0001uzw_q|s");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    String str = (String) method2.invoke(context, objArr3);
                    short sXd3 = (short) (FB.Xd() ^ 6443);
                    int[] iArr2 = new int["[g\\ie^X!U`^cS[`\u0019ZV\u00167GHODIF-@L>C@L".length()];
                    QB qb2 = new QB("[g\\ie^X!U`^cS[`\u0019ZV\u00167GHODIF-@L>C@L");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1561oA.yd("^VlX\u001e]SaS\u001bAcZRXR", (short) (OY.Xd() ^ 11076)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr4 = {str, 4096};
                    Method method3 = cls2.getMethod(C1561oA.Yd("\f\u000b\u001bw\n\r\u0016\r\u0014\u0013w\u001e\u0017!", (short) (C1607wl.Xd() ^ 12572)), clsArr2);
                    try {
                        method3.setAccessible(true);
                        List listAsList = Arrays.asList(((PackageInfo) method3.invoke(packageManager, objArr4)).requestedPermissions);
                        if (!listAsList.contains(Xg.qd("$2)861-w;1?;8CD;BB\u0003\u001f%,\u001e,)!1", (short) (C1633zX.Xd() ^ (-5189)), (short) (C1633zX.Xd() ^ (-15205))))) {
                            int i5 = AFKeystoreWrapper + 73;
                            f2589i = i5 % 128;
                            int i6 = i5 % 2;
                            short sXd4 = (short) (Od.Xd() ^ (-31808));
                            short sXd5 = (short) (Od.Xd() ^ (-13239));
                            int[] iArr3 = new int["\u0015\u000fqrDqGC\u001f\u0003\bO2M/2\u0002a\u0001G\u0012D\u0015\u0015tY%1\u0004hYd>\u0014vxEw\u0019hHYz|\\\u0002KV%Bajqk56FLOK-O\u001f \\U89\f.\u0012\u0019(W@\u0005".length()];
                            QB qb3 = new QB("\u0015\u000fqrDqGC\u001f\u0003\bO2M/2\u0002a\u0001G\u0012D\u0015\u0015tY%1\u0004hYd>\u0014vxEw\u0019hHYz|\\\u0002KV%Bajqk56FLOK-O\u001f \\U89\f.\u0012\u0019(W@\u0005");
                            int i7 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - ((i7 * sXd5) ^ sXd4));
                                i7++;
                            }
                            String str2 = new String(iArr3, 0, i7);
                            if (i6 == 0) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, str2);
                                int i8 = 51 / 0;
                            } else {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, str2);
                            }
                        }
                        short sXd6 = (short) (ZN.Xd() ^ 2501);
                        short sXd7 = (short) (ZN.Xd() ^ 3874);
                        int[] iArr4 = new int["\u0006\u0018X<:6\rX\u0017\u000f\u001bGN?H;TaE:\u000b\fmX2#:#OO9\r'Lb\u0007\u000fN\u0004".length()];
                        QB qb4 = new QB("\u0006\u0018X<:6\rX\u0017\u000f\u001bGN?H;TaE:\u000b\fmX2#:#OO9\r'Lb\u0007\u000fN\u0004");
                        int i9 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i9] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((i9 * sXd7) + sXd6)));
                            i9++;
                        }
                        if (!listAsList.contains(new String(iArr4, 0, i9))) {
                            AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, C1626yg.Ud("4H\u001act\bNd\u0006D\fw\u0004sR\u007f?\u0006%\n\n\u0005\u007f,^\u0006ik2Oj\u0006] c\u0001lO\u0015`5H\ra\u0011_i:fm\u0007xD\u007fDPG\\t4\u0019@/-rl*\u001bctl\u0014\u000e!F=gKq\u0002ch\u0019I4^%[", (short) (C1633zX.Xd() ^ (-16625)), (short) (C1633zX.Xd() ^ (-11164))));
                        }
                        if (Build.VERSION.SDK_INT > 32) {
                            int i10 = AFKeystoreWrapper + 11;
                            f2589i = i10 % 128;
                            int i11 = i10 % 2;
                            if (!listAsList.contains(Ig.wd("$\u000bXwf\u0011;Q\u0007r?N\u0010u\u001as0\u001b+\u000bQ\"@|B)\u0005C\u001d\u000emP}\\\u0017U\u001a\u001e\u0004", (short) (Od.Xd() ^ (-31627))))) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, EO.Od("+\u001b*AT3\u000bY\"AhV11aA\u001e\u001cLm)*w\u0001)_~)Z6\b4Z3v3\u001cp\u0012\u0010\ni7.\u0011\u0016pD\u001ev;:^<1/=\u00156CNbi\u000beP[2|\u001c`\u0001.t\u0013=@o'=\u0013M\u000b&hC2Z", (short) (Od.Xd() ^ (-23238))));
                            }
                        }
                        int i12 = f2589i + 61;
                        AFKeystoreWrapper = i12 % 128;
                        int i13 = i12 % 2;
                        return null;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (Exception e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, C1561oA.Qd("'YCDNQEJHxO??A9rH2<82.@497g7+71,54).,0iZ", (short) (ZN.Xd() ^ 26796)), e5);
            return null;
        }
    }

    public /* synthetic */ void copy() {
        int i2 = 2 % 2;
        int i3 = f2589i + 121;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().afLogForce().AFAdRevenueData();
            throw null;
        }
        if (getMonetizationNetwork().afLogForce().AFAdRevenueData()) {
            int i4 = f2589i + 21;
            AFKeystoreWrapper = i4 % 128;
            int i5 = i4 % 2;
            getMonetizationNetwork().afLogForce().getMonetizationNetwork();
        }
        AFi1pSDK aFi1pSDKD = getMonetizationNetwork().d();
        aFi1pSDKD.getMonetizationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1mSDK(aFi1pSDKD.getMediationNetwork) : new AFi1tSDK(aFi1pSDKD.getMediationNetwork);
        getMonetizationNetwork().AFInAppEventType().getRevenue(getMonetizationNetwork().AFAdRevenueData());
        AFh1xSDK aFh1xSDKAreAllFieldsValid = getMonetizationNetwork().areAllFieldsValid();
        aFh1xSDKAreAllFieldsValid.areAllFieldsValid = System.currentTimeMillis();
        int revenue = aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0);
        if (revenue == 1) {
            int i6 = f2589i + 89;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            if (aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("first_launch")) {
                aFh1xSDKAreAllFieldsValid.AFAdRevenueData.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("first_launch"));
            }
        }
        if (revenue > 0 && aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("gcd")) {
            int i8 = AFKeystoreWrapper + 85;
            f2589i = i8 % 128;
            if (i8 % 2 == 0) {
                aFh1xSDKAreAllFieldsValid.getRevenue.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
                int i9 = 79 / 0;
            } else {
                aFh1xSDKAreAllFieldsValid.getRevenue.putAll(aFh1xSDKAreAllFieldsValid.getCurrencyIso4217Code("gcd"));
            }
        }
        aFh1xSDKAreAllFieldsValid.copydefault = aFh1xSDKAreAllFieldsValid.getMonetizationNetwork.getMonetizationNetwork("prev_session_dur", 0L);
        areAllFieldsValid();
        getMonetizationNetwork().registerClient().getMediationNetwork();
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 121;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i5 = f2589i + 115;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return currencyIso4217Code;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void copydefault() throws Throwable {
        getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
    }

    public static SharedPreferences d_(Context context) {
        return (SharedPreferences) getRevenue(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void e_(android.content.Context r10, android.content.Intent r11) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r8
            r9.AFAdRevenueData(r10)
            com.appsflyer.internal.AFd1zSDK r0 = r9.getMonetizationNetwork()
            com.appsflyer.internal.AFa1mSDK r2 = r0.i()
            com.appsflyer.internal.AFd1zSDK r0 = r9.getMonetizationNetwork()
            com.appsflyer.internal.AFc1qSDK r6 = r0.component4()
            r4 = 0
            if (r11 == 0) goto L7a
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r8
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r0 = r11.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7a
            android.net.Uri r7 = r11.getData()
        L3b:
            r5 = 1
            r3 = 0
            if (r7 == 0) goto L5d
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r8
            java.lang.String r0 = r7.toString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5d
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r8
            if (r1 == 0) goto L78
        L5d:
            r1 = r3
        L5e:
            java.lang.String r0 = "ddl_sent"
            boolean r0 = r6.getMediationNetwork(r0, r3)
            if (r0 != 0) goto L74
        L66:
            com.appsflyer.internal.AFd1zSDK r0 = r2.areAllFieldsValid
            com.appsflyer.internal.AFa1lSDK r0 = r0.afVerboseLog()
            com.appsflyer.internal.AFa1jSDK r0 = com.appsflyer.internal.AFa1jSDK.getMediationNetwork(r0)
            r2.f_(r0, r11, r10)
            return
        L74:
            r1 = r1 ^ r5
            if (r1 == r5) goto L7c
            goto L66
        L78:
            r1 = r5
            goto L5e
        L7a:
            r7 = r4
            goto L3b
        L7c:
            java.lang.String r0 = "No direct deep link"
            r2.getMediationNetwork(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.e_(android.content.Context, android.content.Intent):void");
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 93;
        f2589i = i3 % 128;
        if (i3 % 2 != 0) {
            aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
            return null;
        }
        aFa1ySDK.getMonetizationNetwork().v().getMonetizationNetwork();
        throw null;
    }

    public /* synthetic */ void equals() throws Throwable {
        int i2 = 2 % 2;
        getMediationNetwork(new AFh1kSDK());
        int i3 = f2589i + 81;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    public static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z2) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 65;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerCount", z2);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerCount", z2);
        int i4 = f2589i + 71;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 123;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        int i5 = AFKeystoreWrapper + 113;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private String getCurrencyIso4217Code(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 55;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (context == null) {
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = getMonetizationNetwork().AFAdRevenueData().getCurrencyIso4217Code(str);
        int i4 = f2589i + 89;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    private static String getCurrencyIso4217Code(String str) {
        String string;
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 59;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            string = AppsFlyerProperties.getInstance().getString(str);
            int i4 = 57 / 0;
        } else {
            string = AppsFlyerProperties.getInstance().getString(str);
        }
        int i5 = AFKeystoreWrapper + 41;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public /* synthetic */ void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) throws Throwable {
        getRevenue(new Object[]{this, aFh1mSDK}, -316162006, 316162006, System.identityHashCode(this));
    }

    private static int getMediationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z2) {
        int revenue;
        int i2 = 2 % 2;
        int i3 = f2589i + 15;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z2) {
                return revenue;
            }
        } else {
            revenue = aFc1qSDK.getRevenue(str, 0);
            if (!z2) {
                return revenue;
            }
        }
        int i4 = f2589i + 13;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        int i6 = revenue + 1;
        aFc1qSDK.getMediationNetwork(str, i6);
        return i6;
    }

    private AFh1qSDK getMediationNetwork(Context context) {
        return (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) throws Throwable {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
        int i2 = 2 % 2;
        int i3 = f2589i + 31;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMediationNetwork(aFh1mSDK);
        int i5 = f2589i + 27;
        AFKeystoreWrapper = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static String getMediationNetwork() {
        return (String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis());
    }

    @Deprecated
    public static Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        if (!map.containsKey("meta")) {
            HashMap map2 = new HashMap();
            map.put("meta", map2);
            return map2;
        }
        int i3 = AFKeystoreWrapper + 115;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map3 = (Map) map.get("meta");
        int i5 = f2589i + 81;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        return map3;
    }

    private void getMediationNetwork(Context context, AFh1tSDK aFh1tSDK) throws Throwable {
        getRevenue(new Object[]{this, context, aFh1tSDK}, -268043806, 268043817, System.identityHashCode(this));
    }

    public static /* synthetic */ void getMediationNetwork(AFd1zSDK aFd1zSDK) throws Throwable {
        getRevenue(new Object[]{aFd1zSDK}, 757923489, -757923475, (int) System.currentTimeMillis());
    }

    private static void getMediationNetwork(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 61;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        if (aFh1qSDK != null) {
            aFh1mSDK.getMonetizationNetwork = aFh1qSDK.getCurrencyIso4217Code;
            aFh1mSDK.copydefault = aFh1qSDK.AFAdRevenueData;
        }
        int i5 = f2589i + 41;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void getMediationNetwork(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f2589i + 19;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i4 = 77 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        int i5 = AFKeystoreWrapper + 73;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void getMediationNetwork(boolean z2) {
        int i2 = 2 % 2;
        if (!z2) {
            getMonetizationNetwork().afInfoLog().AFAdRevenueData();
            int i3 = f2589i + 7;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = AFKeystoreWrapper + 67;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            getMonetizationNetwork().afInfoLog().getMediationNetwork();
        } else {
            getMonetizationNetwork().afInfoLog().getMediationNetwork();
            throw null;
        }
    }

    private static boolean getMediationNetwork(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 51;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str, false);
        int i5 = AFKeystoreWrapper + 117;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[PHI: r1
  0x0039: PHI (r1v5 com.appsflyer.PurchaseHandler) = (r1v2 com.appsflyer.PurchaseHandler), (r1v7 com.appsflyer.PurchaseHandler) binds: [B:26:0x006c, B:20:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r10) throws java.lang.Throwable {
        /*
            r9 = 0
            r8 = r10[r9]
            com.appsflyer.internal.AFa1ySDK r8 = (com.appsflyer.internal.AFa1ySDK) r8
            r7 = 1
            r3 = r10[r7]
            android.content.Context r3 = (android.content.Context) r3
            r6 = 2
            r4 = r10[r6]
            java.util.Map r4 = (java.util.Map) r4
            r0 = 3
            r5 = r10[r0]
            com.appsflyer.PurchaseHandler$PurchaseValidationCallback r5 = (com.appsflyer.PurchaseHandler.PurchaseValidationCallback) r5
            int r0 = r6 % r6
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r6
            java.lang.String r2 = "purchases"
            if (r1 == 0) goto L59
            r8.AFAdRevenueData(r3)
            com.appsflyer.internal.AFd1zSDK r0 = r8.getMonetizationNetwork()
            com.appsflyer.PurchaseHandler r1 = r0.component2()
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r7] = r2
            boolean r0 = r1.getRevenue(r4, r5, r0)
            if (r0 == 0) goto L4c
        L39:
            com.appsflyer.internal.AFe1cSDK r3 = new com.appsflyer.internal.AFe1cSDK
            com.appsflyer.internal.AFd1zSDK r0 = r1.AFAdRevenueData
            r3.<init>(r4, r5, r0)
            com.appsflyer.internal.AFe1oSDK r2 = r1.getCurrencyIso4217Code
            java.util.concurrent.Executor r1 = r2.getCurrencyIso4217Code
            com.appsflyer.internal.AFe1oSDK$1 r0 = new com.appsflyer.internal.AFe1oSDK$1
            r0.<init>(r3)
            r1.execute(r0)
        L4c:
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r6
            r0 = 0
            if (r1 == 0) goto L6f
            return r0
        L59:
            r8.AFAdRevenueData(r3)
            com.appsflyer.internal.AFd1zSDK r0 = r8.getMonetizationNetwork()
            com.appsflyer.PurchaseHandler r1 = r0.component2()
            java.lang.String[] r0 = new java.lang.String[r7]
            r0[r9] = r2
            boolean r0 = r1.getRevenue(r4, r5, r0)
            if (r0 == 0) goto L4c
            goto L39
        L6f:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    public static String getMonetizationNetwork(SimpleDateFormat simpleDateFormat, long j2) {
        int i2 = 2 % 2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j2));
        int i3 = f2589i + 3;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    private void getMonetizationNetwork(AFi1hSDK aFi1hSDK) throws Throwable {
        getRevenue(new Object[]{this, aFi1hSDK}, 608861720, -608861711, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(String str) throws Throwable {
        getRevenue(new Object[]{str}, -374487647, 374487663, (int) System.currentTimeMillis());
    }

    private static int getRevenue(AFc1qSDK aFc1qSDK, boolean z2) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 125;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z2);
            throw null;
        }
        int mediationNetwork = getMediationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z2);
        int i4 = AFKeystoreWrapper + 33;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
        return mediationNetwork;
    }

    public static AFa1ySDK getRevenue() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper;
        int i4 = i3 + 115;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
        AFa1ySDK aFa1ySDK = areAllFieldsValid;
        int i6 = i3 + 9;
        f2589i = i6 % 128;
        if (i6 % 2 != 0) {
            return aFa1ySDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f2589i + 11;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectIMEI", String.valueOf(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(zBooleanValue));
        int i5 = f2589i + 115;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) throws Throwable {
        String strConcat;
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = ~((i5 + i6) - (i5 & i6));
        int i8 = (-1) - (((-1) - i2) & ((-1) - i3));
        boolean z2 = true;
        switch ((i2 * (-755)) + (i3 * (-755)) + (i7 * 1512) + (((~((-1) - (((-1) - i8) & ((-1) - i4)))) | i7) * (-756)) + ((i8 | (~i4)) * 756)) {
            case 1:
                AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
                String str = (String) objArr[1];
                Map map = (Map) objArr[2];
                int i9 = 2 % 2;
                int i10 = AFKeystoreWrapper + 117;
                f2589i = i10 % 128;
                int i11 = i10 % 2;
                AFc1eSDK aFc1eSDKForce = aFa1ySDK.getMonetizationNetwork().force();
                if (aFc1eSDKForce.AFAdRevenueData == null) {
                    aFc1eSDKForce.AFAdRevenueData = new AFb1rSDK();
                }
                AFb1rSDK aFb1rSDK = aFc1eSDKForce.AFAdRevenueData;
                if (str == null || str.isEmpty()) {
                    AFLogger.afWarnLog("Partner ID is missing or `null`");
                    return null;
                }
                if (map == null || map.isEmpty()) {
                    if (aFb1rSDK.getCurrencyIso4217Code.remove(str) == null) {
                        int i12 = f2589i + 39;
                        AFKeystoreWrapper = i12 % 128;
                        int i13 = i12 % 2;
                        strConcat = "Partner data is missing or `null`";
                    } else {
                        strConcat = "Cleared partner data for ".concat(String.valueOf(str));
                    }
                    AFLogger.afWarnLog(strConcat);
                    return null;
                }
                AFLogger.afDebugLog(new StringBuilder("Setting partner data for ").append(str).append(": ").append(map).toString());
                int length = new JSONObject(map).toString().length();
                if (length <= 1000) {
                    aFb1rSDK.getCurrencyIso4217Code.put(str, map);
                    aFb1rSDK.getMonetizationNetwork.remove(str);
                    return null;
                }
                AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                HashMap map2 = new HashMap();
                map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                aFb1rSDK.getMonetizationNetwork.put(str, map2);
                return null;
            case 2:
                return getMonetizationNetwork(objArr);
            case 3:
                AFa1ySDK aFa1ySDK2 = (AFa1ySDK) objArr[0];
                String[] strArr = (String[]) objArr[1];
                int i14 = 2 % 2;
                int i15 = AFKeystoreWrapper + 19;
                f2589i = i15 % 128;
                int i16 = i15 % 2;
                aFa1ySDK2.setSharingFilterForPartners(strArr);
                int i17 = AFKeystoreWrapper + 21;
                f2589i = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 4:
                return getCurrencyIso4217Code(objArr);
            case 5:
                AFa1ySDK aFa1ySDK3 = (AFa1ySDK) objArr[0];
                Context context = (Context) objArr[1];
                String str2 = (String) objArr[2];
                int i19 = 2 % 2;
                int i20 = AFKeystoreWrapper + 77;
                f2589i = i20 % 128;
                int i21 = i20 % 2;
                aFa1ySDK3.start(context, str2, null);
                int i22 = f2589i + 65;
                AFKeystoreWrapper = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 6:
                return getRevenue(objArr);
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                AFa1ySDK aFa1ySDK4 = (AFa1ySDK) objArr[0];
                String str3 = (String) objArr[1];
                int i24 = 2 % 2;
                int i25 = f2589i + 91;
                AFKeystoreWrapper = i25 % 128;
                if (i25 % 2 != 0) {
                    AFd1oSDK aFd1oSDKCopy = aFa1ySDK4.getMonetizationNetwork().copy();
                    String[] strArr2 = new String[0];
                    strArr2[1] = str3;
                    aFd1oSDKCopy.getRevenue("setCurrencyCode", strArr2);
                } else {
                    aFa1ySDK4.getMonetizationNetwork().copy().getRevenue("setCurrencyCode", str3);
                }
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str3);
                return null;
            case 9:
                AFa1ySDK aFa1ySDK5 = (AFa1ySDK) objArr[0];
                int i26 = 2 % 2;
                AFe1aSDK aFe1aSDK = new AFe1aSDK((AFi1hSDK) objArr[1], aFa1ySDK5.getMonetizationNetwork().AFAdRevenueData(), aFa1ySDK5.getMonetizationNetwork(), aFa1ySDK5.getMonetizationNetwork().component3(), aFa1ySDK5.getMonetizationNetwork().AFInAppEventParameterName());
                AFe1oSDK aFe1oSDKCopydefault = aFa1ySDK5.getMonetizationNetwork().copydefault();
                aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(aFe1aSDK));
                int i27 = AFKeystoreWrapper + 77;
                f2589i = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 10:
                return areAllFieldsValid(objArr);
            case 11:
                return component3(objArr);
            case 12:
                AFa1ySDK aFa1ySDK6 = (AFa1ySDK) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i29 = 2 % 2;
                aFa1ySDK6.AFAdRevenueData((Context) objArr[2]);
                final AFd1zSDK monetizationNetwork = aFa1ySDK6.getMonetizationNetwork();
                monetizationNetwork.AFInAppEventType().getMonetizationNetwork(zBooleanValue);
                monetizationNetwork.getMonetizationNetwork().submit(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        AFa1ySDK.getMediationNetwork(monetizationNetwork);
                    }
                });
                if (!zBooleanValue) {
                    return null;
                }
                int i30 = f2589i + 81;
                AFKeystoreWrapper = i30 % 128;
                int i31 = i30 % 2;
                monetizationNetwork.component4().AFAdRevenueData("is_stop_tracking_used", true);
                int i32 = AFKeystoreWrapper + 73;
                f2589i = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 13:
                return component1(objArr);
            case 14:
                AFd1zSDK aFd1zSDK = (AFd1zSDK) objArr[0];
                int i34 = 2 % 2;
                int i35 = f2589i + 79;
                AFKeystoreWrapper = i35 % 128;
                int i36 = i35 % 2;
                aFd1zSDK.registerClient().getRevenue();
                int i37 = AFKeystoreWrapper + 121;
                f2589i = i37 % 128;
                int i38 = i37 % 2;
                return null;
            case 15:
                return component4(objArr);
            case 16:
                return component2(objArr);
            case 17:
                AFa1ySDK aFa1ySDK7 = (AFa1ySDK) objArr[0];
                Context context2 = (Context) objArr[1];
                int i39 = 2 % 2;
                int i40 = AFKeystoreWrapper;
                int i41 = i40 + 69;
                f2589i = i41 % 128;
                int i42 = i41 % 2;
                if (context2 instanceof Activity) {
                    return new AFh1qSDK((Activity) context2, aFa1ySDK7.getMonetizationNetwork().w());
                }
                int i43 = i40 + 105;
                f2589i = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 18:
                AFa1ySDK aFa1ySDK8 = (AFa1ySDK) objArr[0];
                Context context3 = (Context) objArr[1];
                String str4 = (String) objArr[2];
                aFa1ySDK8.AFAdRevenueData(context3);
                AFg1sSDK aFg1sSDK = new AFg1sSDK(context3);
                if (str4 == null || str4.trim().isEmpty()) {
                    AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
                    return null;
                }
                AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(String.valueOf(str4)));
                AFf1aSDK revenue = aFg1sSDK.getRevenue();
                if (revenue != null && str4.equals(revenue.getRevenue)) {
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (revenue != null && jCurrentTimeMillis - revenue.getMonetizationNetwork <= TimeUnit.SECONDS.toMillis(2L)) {
                    z2 = false;
                }
                AFf1aSDK aFf1aSDK = new AFf1aSDK(str4, jCurrentTimeMillis, !z2);
                aFg1sSDK.getCurrencyIso4217Code.getRevenue("afUninstallToken", aFf1aSDK.getRevenue);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_received_time", aFf1aSDK.getMonetizationNetwork);
                aFg1sSDK.getCurrencyIso4217Code.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
                if (!z2) {
                    return null;
                }
                AFd1zSDK monetizationNetwork2 = getRevenue().getMonetizationNetwork();
                AFf1oSDK aFf1oSDK = new AFf1oSDK(str4, monetizationNetwork2);
                AFe1oSDK aFe1oSDKCopydefault2 = monetizationNetwork2.copydefault();
                aFe1oSDKCopydefault2.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault2.new AnonymousClass1(aFf1oSDK));
                return null;
            case 19:
                return copy(objArr);
            case 20:
                AFa1ySDK aFa1ySDK9 = (AFa1ySDK) objArr[0];
                Context context4 = (Context) objArr[1];
                int i45 = 2 % 2;
                AFj1gSDK aFj1gSDK = new AFj1gSDK((Intent) objArr[2]);
                if (aFj1gSDK.AFAdRevenueData("appsflyer_preinstall") != null) {
                    int i46 = f2589i + 105;
                    AFKeystoreWrapper = i46 % 128;
                    int i47 = i46 % 2;
                    getRevenue(new Object[]{aFj1gSDK.AFAdRevenueData("appsflyer_preinstall")}, -374487647, 374487663, (int) System.currentTimeMillis());
                    int i48 = f2589i + 29;
                    AFKeystoreWrapper = i48 % 128;
                    int i49 = i48 % 2;
                }
                AFLogger.afInfoLog("****** onReceive called *******");
                AppsFlyerProperties.getInstance();
                String strAFAdRevenueData = aFj1gSDK.AFAdRevenueData("referrer");
                AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(strAFAdRevenueData)));
                if (strAFAdRevenueData == null) {
                    return null;
                }
                aFa1ySDK9.getMonetizationNetwork(context4).getRevenue("referrer", strAFAdRevenueData);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", strAFAdRevenueData);
                appsFlyerProperties.getRevenue = strAFAdRevenueData;
                if (!AppsFlyerProperties.getInstance().getMediationNetwork()) {
                    return null;
                }
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getRevenue(new Object[]{aFa1ySDK9, context4, AFh1tSDK.onReceive}, -268043806, 268043817, System.identityHashCode(aFa1ySDK9));
                aFa1ySDK9.AFAdRevenueData(strAFAdRevenueData);
                return null;
            case 21:
                AFa1ySDK aFa1ySDK10 = (AFa1ySDK) objArr[0];
                int i50 = 2 % 2;
                int i51 = AFKeystoreWrapper + 9;
                f2589i = i51 % 128;
                if (i51 % 2 == 0) {
                    aFa1ySDK10.setSharingFilterForPartners("all");
                    return null;
                }
                aFa1ySDK10.setSharingFilterForPartners("all");
                return null;
            case 22:
                return copydefault(objArr);
            case 23:
                return hashCode(objArr);
            case 24:
                return equals(objArr);
            default:
                return getMediationNetwork(objArr);
        }
    }

    private static String getRevenue(Activity activity) {
        Intent intent;
        int i2 = 2 % 2;
        int i3 = f2589i + 117;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        String string = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i5 = AFKeystoreWrapper + 75;
                    f2589i = i5 % 128;
                    if (i5 % 2 == 0) {
                        String string2 = extras.getString("af");
                        try {
                            string.hashCode();
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            string = string2;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return string;
                        }
                    }
                    string = extras.getString("af");
                    if (string != null) {
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(String.valueOf(string)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        int i6 = f2589i + 45;
                        AFKeystoreWrapper = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return string;
    }

    private void getRevenue(Context context, String str) throws Throwable {
        int i2 = 2 % 2;
        AFh1eSDK aFh1eSDK = new AFh1eSDK();
        AFAdRevenueData(context);
        aFh1eSDK.areAllFieldsValid = null;
        aFh1eSDK.getRevenue = null;
        aFh1eSDK.component1 = str;
        aFh1eSDK.getMonetizationNetwork = null;
        AFAdRevenueData(aFh1eSDK);
        int i3 = AFKeystoreWrapper + 29;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i2 = 2 % 2;
        int i3 = f2589i + 53;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        if (appsFlyerConversionListener == null) {
            return;
        }
        this.getRevenue = appsFlyerConversionListener;
        int i5 = AFKeystoreWrapper + 101;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void getRevenue(String str) {
        int i2 = 2 % 2;
        AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '").append(str).append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.").toString());
        int i3 = AFKeystoreWrapper + 99;
        f2589i = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void getRevenue(Map<String, Object> map) {
        int i2 = 2 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        int i3 = f2589i + 115;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        if (!(!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            return;
        }
        int i5 = AFKeystoreWrapper + 115;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
        if (map.get("advertiserId") != null) {
            try {
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().force().getCurrencyIso4217Code) && map.remove("android_id") != null) {
                    int i7 = f2589i + 65;
                    AFKeystoreWrapper = i7 % 128;
                    int i8 = i7 % 2;
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                }
                if (AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().AFAdRevenueData())) {
                    int i9 = AFKeystoreWrapper + 67;
                    f2589i = i9 % 128;
                    int i10 = i9 % 2;
                    if (map.remove("imei") != null) {
                        int i11 = f2589i + 33;
                        AFKeystoreWrapper = i11 % 128;
                        if (i11 % 2 == 0) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        } else {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                            throw null;
                        }
                    }
                }
            } catch (Exception e2) {
                AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e2);
            }
        }
    }

    public static boolean getRevenue(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 103;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i5 = f2589i + 83;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(C1593ug.zd("kVheagaU<=e\u000f\u0010\t\u000f\tD\u0016\u0013\t\"I\u001e\u0011\u001f$\u0018\u0013\u0016%R\u001d(U,&\u001a0\u001c%)\u001f!,&ob", (short) (C1580rY.Xd() ^ (-22363)), (short) (C1580rY.Xd() ^ (-32754))), th);
        }
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.od("AMBOKD>\u0007;FDI9AF~\u0013><A1C>", (short) (C1633zX.Xd() ^ (-14435)))).getMethod(C1561oA.Kd("\b\u0007\u0017s\u0006\t\u0012\t\u0010\u000fw\r\u001b\u000f\u0016\u0015#", (short) (OY.Xd() ^ 26790)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                String strZd = Wg.Zd("\u000e:\b)R;\u000bcXq\u000b\u001e\u001cqP-\u00183Lv\\3", (short) (C1499aX.Xd() ^ (-23759)), (short) (C1499aX.Xd() ^ (-25872)));
                Class<?> cls = Class.forName(C1561oA.Xd("iwn}{vr=s\u0001\u0001\by\u0004\u000bE\t\u0007Hk}\u0001\n\u0001\b\u0007o\u0005\u0013\u0007\u000e\r\u001b", (short) (C1499aX.Xd() ^ (-22200))));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (ZN.Xd() ^ 29291);
                int[] iArr = new int["5-C/t4*8:\u0002(JA9?9".length()];
                QB qb = new QB("5-C/t4*8:\u0002(JA9?9");
                int i7 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i7] = xuXd.fK((sXd ^ i7) + xuXd.CK(iKK));
                    i7++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i7));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strZd, 0};
                Method method2 = cls.getMethod(Qg.kd("JGU0@AH=B?\"F=E", (short) (FB.Xd() ^ 4567), (short) (FB.Xd() ^ 17629)), clsArr);
                try {
                    method2.setAccessible(true);
                    method2.invoke(packageManager, objArr2);
                    return true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, hg.Vd("\u0006n~yswoaFEk\u0013\u0012\t\r\u0005>m\t|\u00149k|\t\f}vw\u00050x\u0002-\u0002yk\u007fiprffog/ ", (short) (FB.Xd() ^ 13624), (short) (FB.Xd() ^ 2678)), e4);
            return false;
        }
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1ySDK aFa1ySDK = (AFa1ySDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 93;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        aFa1ySDK.getMonetizationNetwork().copy().getRevenue("setCollectOaid", String.valueOf(zBooleanValue));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(zBooleanValue));
        int i5 = f2589i + 89;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    final synchronized AFf1mSDK AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = f2589i + 11;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 9 / 0;
            if (this.equals == null) {
                this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda7
                    @Override // com.appsflyer.internal.AFf1mSDK
                    public final void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
                        this.f$0.AFAdRevenueData(aFf1pSDK);
                    }
                };
                int i5 = AFKeystoreWrapper + 81;
                f2589i = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
        } else if (this.equals == null) {
            this.equals = new AFf1mSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda7
                @Override // com.appsflyer.internal.AFf1mSDK
                public final void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
                    this.f$0.AFAdRevenueData(aFf1pSDK);
                }
            };
            int i52 = AFKeystoreWrapper + 81;
            f2589i = i52 % 128;
            int i62 = i52 % 2;
            int i72 = 2 % 2;
        }
        return this.equals;
    }

    public final void AFAdRevenueData(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2589i + 27;
        int i4 = i3 % 128;
        AFKeystoreWrapper = i4;
        int i5 = i3 % 2;
        AFc1bSDK aFc1bSDK = this.copy;
        if (context != null) {
            int i6 = i4 + 101;
            f2589i = i6 % 128;
            if (i6 % 2 == 0) {
                AFc1hSDK aFc1hSDK = aFc1bSDK.getCurrencyIso4217Code;
                throw null;
            }
            AFc1hSDK aFc1hSDK2 = aFc1bSDK.getCurrencyIso4217Code;
            if (context != null) {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.ud("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (ZN.Xd() ^ 7410))).getMethod(C1561oA.yd(" \u001d/z%$#\u001f$!7+,*\u0002-7<0B9", (short) (C1607wl.Xd() ^ 6783)), new Class[0]);
                try {
                    method.setAccessible(true);
                    aFc1hSDK2.getMonetizationNetwork = (Context) method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    public final void AFAdRevenueData(Context context, String str) throws Throwable {
        getRevenue(new Object[]{this, context, str}, 1454368071, -1454368056, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 83;
        f2589i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            getMonetizationNetwork().i().getRevenue.contains(Arrays.asList(strArr));
            obj.hashCode();
            throw null;
        }
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getMonetizationNetwork().i().getRevenue;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        int i4 = AFKeystoreWrapper + 97;
        f2589i = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f2589i + 91;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z2);
            aFd1oSDKCopy.getRevenue("anonymizeUser", strArr);
        } else {
            getMonetizationNetwork().copy().getRevenue("anonymizeUser", String.valueOf(z2));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z2);
        int i4 = f2589i + 35;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 53;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
            aFa1mSDKI.getMonetizationNetwork = str;
            aFa1mSDKI.getMediationNetwork = map;
            int i4 = 47 / 0;
        } else {
            AFa1mSDK aFa1mSDKI2 = getMonetizationNetwork().i();
            aFa1mSDKI2.getMonetizationNetwork = str;
            aFa1mSDKI2.getMediationNetwork = map;
        }
        int i5 = f2589i + 113;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b_(Context context, Intent intent) throws Throwable {
        getRevenue(new Object[]{this, context, intent}, -1498667330, 1498667350, System.identityHashCode(this));
    }

    final void component1() {
        int i2 = 2 % 2;
        if (AFe1bSDK.component3()) {
            int i3 = AFKeystoreWrapper + 107;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1bSDK(monetizationNetwork)));
        int i5 = AFKeystoreWrapper + 13;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 87;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().force().areAllFieldsValid = true;
        int i5 = AFKeystoreWrapper + 111;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z2) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 69;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().e().getCurrencyIso4217Code(z2);
        int i5 = AFKeystoreWrapper + 75;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z2) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 43;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z2));
            int i4 = 6 / 0;
        } else {
            getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z2));
        }
        int i5 = f2589i + 39;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) throws Throwable {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("getAppsFlyerUID", new String[0]);
        Object obj = null;
        if (context == null) {
            int i3 = AFKeystoreWrapper + 45;
            f2589i = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 58 / 0;
            }
            return null;
        }
        AFAdRevenueData(context);
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(getMonetizationNetwork().AFAdRevenueData().getMediationNetwork);
        int i5 = f2589i + 117;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return currencyIso4217Code;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2589i + 21;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        String strAFAdRevenueData = getMonetizationNetwork().AFAdRevenueData().AFAdRevenueData(context);
        int i5 = f2589i + 19;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return strAFAdRevenueData;
    }

    final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK, AFh1qSDK aFh1qSDK) throws Throwable {
        int i2 = 2 % 2;
        getMediationNetwork(aFh1mSDK, aFh1qSDK);
        if (getMonetizationNetwork().AFInAppEventType().getMediationNetwork() == null) {
            AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
            if (appsFlyerRequestListener != null) {
                int i3 = AFKeystoreWrapper + 5;
                f2589i = i3 % 128;
                int i4 = i3 % 2;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
        if (referrer == null) {
            referrer = "";
        } else {
            int i5 = AFKeystoreWrapper + 65;
            f2589i = i5 % 128;
            int i6 = i5 % 2;
        }
        aFh1mSDK.component1 = referrer;
        AFAdRevenueData(aFh1mSDK);
    }

    public final boolean getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        if ((!getMediationNetwork(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) || ((String) getRevenue(new Object[0], 131288073, -131288051, (int) System.currentTimeMillis())) != null) {
            int i3 = AFKeystoreWrapper + 41;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = AFKeystoreWrapper + 123;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i2 = 2 % 2;
        int i3 = f2589i + 29;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        String strAFAdRevenueData = getMonetizationNetwork().AFKeystoreWrapper().AFAdRevenueData();
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
        return strAFAdRevenueData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        int i2 = 2 % 2;
        int i3 = f2589i + 17;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFe1vSDK aFe1vSDKAFKeystoreWrapper = getMonetizationNetwork().AFKeystoreWrapper();
        if (i4 == 0) {
            return aFe1vSDKAFKeystoreWrapper.getCurrencyIso4217Code();
        }
        aFe1vSDKAFKeystoreWrapper.getCurrencyIso4217Code();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final void getMediationNetwork(AFh1mSDK aFh1mSDK) throws Throwable {
        int i2 = 2 % 2;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        boolean z2 = true;
        if (context == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
            return;
        }
        String mediationNetwork = getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1mSDK.getCurrencyIso4217Code;
        if (mediationNetwork != null) {
            int i3 = AFKeystoreWrapper + 49;
            f2589i = i3 % 128;
            if (i3 % 2 == 0) {
                mediationNetwork.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (mediationNetwork.length() != 0) {
                AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
                AppsFlyerProperties.getInstance().saveProperties(monetizationNetwork);
                if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, new StringBuilder("sendWithEvent from activity: ").append(context.getClass().getName()).toString(), true);
                }
                boolean revenue = aFh1mSDK.getRevenue();
                Map<String, ?> monetizationNetwork2 = getMonetizationNetwork(aFh1mSDK);
                if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
                    int i4 = f2589i + 31;
                    AFKeystoreWrapper = i4 % 128;
                    int i5 = i4 % 2;
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
                }
                int currencyIso4217Code = getCurrencyIso4217Code(monetizationNetwork, false);
                getRevenue(monetizationNetwork2);
                AFa1tSDK aFa1tSDK = new AFa1tSDK(getMonetizationNetwork(), aFh1mSDK.AFAdRevenueData(monetizationNetwork2).AFAdRevenueData(currencyIso4217Code), getMonetizationNetwork().e().getMediationNetwork());
                if (revenue) {
                    boolean z3 = false;
                    for (AFj1tSDK aFj1tSDK : component3()) {
                        if (aFj1tSDK.component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, new StringBuilder("Failed to get ").append(aFj1tSDK.component3).append(" referrer, wait ...").toString());
                            z3 = true;
                        }
                    }
                    if (getMonetizationNetwork().e().AFAdRevenueData()) {
                        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                        z3 = true;
                    }
                    if (!getMonetizationNetwork().AFInAppEventType().getMonetizationNetwork()) {
                        z2 = z3;
                    }
                } else {
                    z2 = false;
                }
                AFj1aSDK.getCurrencyIso4217Code(getMonetizationNetwork().getMediationNetwork(), aFa1tSDK, !z2 ? 0L : 500L, TimeUnit.MILLISECONDS);
                return;
            }
        }
        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
        int i6 = f2589i + 35;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
    }

    public final AFc1qSDK getMonetizationNetwork(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 13;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        AFc1qSDK aFc1qSDKComponent4 = getMonetizationNetwork().component4();
        int i5 = AFKeystoreWrapper + 85;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return aFc1qSDKComponent4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AFd1zSDK getMonetizationNetwork() {
        int i2 = 2 % 2;
        int i3 = f2589i + 91;
        int i4 = i3 % 128;
        AFKeystoreWrapper = i4;
        int i5 = i3 % 2;
        AFc1bSDK aFc1bSDK = this.copy;
        int i6 = i4 + 109;
        f2589i = i6 % 128;
        int i7 = i6 % 2;
        return aFc1bSDK;
    }

    final Map<String, Object> getMonetizationNetwork(AFh1mSDK aFh1mSDK) throws Throwable {
        String str;
        int i2 = 2 % 2;
        Context context = getMonetizationNetwork().AFInAppEventParameterName().getMonetizationNetwork;
        AFc1qSDK monetizationNetwork = getMonetizationNetwork(context);
        AFg1nSDK aFg1nSDKComponent3 = getMonetizationNetwork().component3();
        boolean currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        boolean revenue = aFh1mSDK.getRevenue();
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        long time = new Date().getTime();
        boolean z2 = false;
        Object[] objArr = new Object[1];
        a("\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (currencyIso4217Code) {
                int i3 = f2589i + 63;
                AFKeystoreWrapper = i3 % 128;
                if (i3 % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
                }
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (revenue) {
                    int i4 = f2589i + 105;
                    AFKeystoreWrapper = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 15 / 0;
                    }
                    str = "Launch";
                } else {
                    str = aFh1mSDK.areAllFieldsValid;
                }
                aFLogger.i(aFg1cSDK, sb.append(str).toString(), true);
                int i6 = AFKeystoreWrapper + 71;
                f2589i = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 3;
                }
            }
            getRevenue(new Object[]{context}, 750744286, -750744267, (int) System.currentTimeMillis());
            int currencyIso4217Code2 = getCurrencyIso4217Code(monetizationNetwork, revenue);
            if (aFh1mSDK.areAllFieldsValid != null) {
                int i8 = f2589i + 75;
                AFKeystoreWrapper = i8 % 128;
                if (i8 % 2 == 0) {
                    z2 = true;
                }
            }
            int revenue2 = getRevenue(monetizationNetwork, z2);
            if (!(!revenue) && currencyIso4217Code2 == 1) {
                AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
            }
            aFg1nSDKComponent3.getCurrencyIso4217Code(map, currencyIso4217Code2, revenue2);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
        }
        return map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) throws Throwable {
        int i2 = 2 % 2;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i3 = AFKeystoreWrapper + 99;
            f2589i = i3 % 128;
            if (i3 % 2 != 0) {
                return string;
            }
            throw null;
        }
        String currencyIso4217Code = getCurrencyIso4217Code(context, "AF_STORE");
        if (currencyIso4217Code == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i4 = AFKeystoreWrapper + 51;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i2 = 2 % 2;
        int i3 = f2589i + 9;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[1]);
        } else {
            getMonetizationNetwork().copy().getRevenue("getSdkVersion", new String[0]);
        }
        String strComponent4 = AFc1oSDK.component4();
        int i4 = f2589i + 87;
        AFKeystoreWrapper = i4 % 128;
        int i5 = i4 % 2;
        return strComponent4;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) throws Throwable {
        String str2;
        int i2 = 2 % 2;
        if (this.hashCode) {
            int i3 = f2589i + 123;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }
        this.hashCode = true;
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(str);
        if (context != null) {
            AFAdRevenueData(context);
            Application applicationO_ = AFj1kSDK.O_(context);
            if (applicationO_ == null) {
                return this;
            }
            int i5 = f2589i;
            int i6 = i5 + 77;
            AFKeystoreWrapper = i6 % 128;
            if (i6 % 2 != 0) {
                this.component2 = applicationO_;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.component2 = applicationO_;
            int i7 = i5 + 91;
            AFKeystoreWrapper = i7 % 128;
            int i8 = i7 % 2;
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.copy();
                }
            });
            AFe1oSDK aFe1oSDKCopydefault = getMonetizationNetwork().copydefault();
            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
            getMonetizationNetwork().afErrorLogForExcManagerOnly().getMonetizationNetwork(new AFd1xSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda3
                @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
                public final void onConfigurationChanged(boolean z2) {
                    this.f$0.getMediationNetwork(z2);
                }
            });
            getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
            AFj1sSDK aFj1sSDKAFLogger = getMonetizationNetwork().AFLogger();
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.equals();
                }
            };
            AFi1aSDK currencyIso4217Code = aFj1sSDKAFLogger.getCurrencyIso4217Code(runnable);
            Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(currencyIso4217Code, runnable);
            aFj1sSDKAFLogger.getRevenue.add(currencyIso4217Code);
            aFj1sSDKAFLogger.getRevenue.add(new AFj1oSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1wSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code, new AFj1xSDK()));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1mSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code));
            aFj1sSDKAFLogger.getRevenue.add(new AFj1rSDK(aFj1sSDKAFLogger.getCurrencyIso4217Code.getMonetizationNetwork(), aFj1sSDKAFLogger.getCurrencyIso4217Code.AFAdRevenueData(), runnableAFAdRevenueData));
            aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
            for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) aFj1sSDKAFLogger.getRevenue.toArray(new AFj1tSDK[0])) {
                aFj1tSDK.getMonetizationNetwork(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
            }
            if (!aFj1sSDKAFLogger.getCurrencyIso4217Code()) {
                int i9 = f2589i + 67;
                AFKeystoreWrapper = i9 % 128;
                int i10 = i9 % 2;
                aFj1sSDKAFLogger.getRevenue(aFj1sSDKAFLogger.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork, runnableAFAdRevenueData, aFj1sSDKAFLogger.getCurrencyIso4217Code);
            }
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
        }
        AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            int i11 = f2589i;
            int i12 = i11 + 45;
            AFKeystoreWrapper = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 87;
            AFKeystoreWrapper = i14 % 128;
            int i15 = i14 % 2;
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        aFd1oSDKCopy.getRevenue(Session.JsonKeys.INIT, strArr);
        AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.17.6", getMonetizationNetwork));
        this.getRevenue = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2589i + 77;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            AFAdRevenueData(context);
            return getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        }
        AFAdRevenueData(context);
        getMonetizationNetwork().AFAdRevenueData().getMonetizationNetwork(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        boolean currencyIso4217Code;
        int i2 = 2 % 2;
        int i3 = f2589i + 123;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
            int i4 = 45 / 0;
        } else {
            currencyIso4217Code = getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code();
        }
        int i5 = AFKeystoreWrapper + 55;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) throws Throwable {
        int i2 = 2 % 2;
        if (!this.hashCode) {
            getRevenue("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i3 = AFKeystoreWrapper + 91;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            return;
        }
        if (!AFk1wSDK.getMonetizationNetwork(getMonetizationNetwork().AFInAppEventType().getMediationNetwork())) {
            AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
            return;
        }
        int i5 = AFKeystoreWrapper + 23;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
        getRevenue(new Object[0], -516060765, 516060769, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f2589i + 87;
        AFKeystoreWrapper = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            logEvent(context, str, map, null);
            throw null;
        }
        logEvent(context, str, map, null);
        int i4 = AFKeystoreWrapper + 27;
        f2589i = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) throws Throwable {
        HashMap map2 = map == null ? null : new HashMap(map);
        AFAdRevenueData(context);
        AFh1hSDK aFh1hSDK = new AFh1hSDK();
        aFh1hSDK.areAllFieldsValid = str;
        aFh1hSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1hSDK.AFAdRevenueData(mapSingletonMap);
        }
        aFh1hSDK.getRevenue = map2;
        AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFh1hSDK.getRevenue == null ? new HashMap() : aFh1hSDK.getRevenue).toString();
        aFd1oSDKCopy.getRevenue("logEvent", strArr);
        if (str == null) {
            getRevenue(new Object[]{this, context, AFh1tSDK.logEvent}, -268043806, 268043817, System.identityHashCode(this));
        }
        getCurrencyIso4217Code(aFh1hSDK, (AFh1qSDK) getRevenue(new Object[]{this, context}, 348348548, -348348531, System.identityHashCode(this)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d3) throws Throwable {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("logLocation", String.valueOf(d2), String.valueOf(d3));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d3));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i3 = f2589i + 3;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 15;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("logSession", new String[0]);
        getMonetizationNetwork().copy().getCurrencyIso4217Code();
        getRevenue(new Object[]{this, context, AFh1tSDK.logSession}, -268043806, 268043817, System.identityHashCode(this));
        AFAdRevenueData(context, null, null);
        int i5 = AFKeystoreWrapper + 33;
        f2589i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) throws Throwable {
        getRevenue(new Object[]{this, context}, 537134056, -537134032, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) throws Throwable {
        int i2 = 2 % 2;
        if (uri != null) {
            int i3 = f2589i + 5;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            if (!uri.toString().isEmpty()) {
                if (context == null) {
                    getMonetizationNetwork().i().getMediationNetwork(new StringBuilder("Context is \"").append(context).append("\"").toString(), DeepLinkResult.Error.NETWORK);
                    return;
                }
                AFAdRevenueData(context);
                getMonetizationNetwork().i().g_(AFa1jSDK.getMediationNetwork(getMonetizationNetwork().afVerboseLog()), Uri.parse(uri.toString()));
                int i5 = f2589i + 73;
                AFKeystoreWrapper = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        getMonetizationNetwork().i().getMediationNetwork(new StringBuilder("Link is \"").append(uri).append("\"").toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) throws Throwable {
        int i2 = 2 % 2;
        if (intent == null) {
            int i3 = f2589i + 15;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
            AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
            short sXd = (short) (C1633zX.Xd() ^ (-2092));
            int[] iArr = new int["[Q_T^b^Aa8Z[gDbhfeke\u001fwbu#gfrsmm*\u0003u\u0002v/~\u0007~\u007f4~\u0005\f}\b\u000f".length()];
            QB qb = new QB("[Q_T^b^Aa8Z[gDbhfeke\u001fwbu#gfrsmm*\u0003u\u0002v/~\u0007~\u007f4~\u0005\f}\b\u000f");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
                i5++;
            }
            aFa1mSDKI.getMediationNetwork(new String(iArr, 0, i5), DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            int i6 = f2589i + 115;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            String strQd = Xg.qd("siwlvzvYyPrs\u007f\\z\u0001~}\u0004}7\u0010z\u000e;\u007f~\u000b\f\u0006\u0006B\u001b\u000e\u001a\u000fG\u0017\u001f\u0017\u0018L\u0011\u001e\u001e%\u0017+(", (short) (FB.Xd() ^ 25659), (short) (FB.Xd() ^ 11170));
            if (i7 == 0) {
                getMonetizationNetwork().i().getMediationNetwork(strQd, DeepLinkResult.Error.DEVELOPER_ERROR);
                return;
            } else {
                getMonetizationNetwork().i().getMediationNetwork(strQd, DeepLinkResult.Error.DEVELOPER_ERROR);
                throw null;
            }
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("Y\u0007\u001d<Ye\u0001jq]n\u0015\u0016\u0001f2($\u0005Zma-", (short) (OY.Xd() ^ 9463), (short) (OY.Xd() ^ 20828))).getMethod(ZO.xd("\u0015cyW/_\u000fKp:Jw%3\u0011}\u001dX\f}\u001a", (short) (C1580rY.Xd() ^ (-27944)), (short) (C1580rY.Xd() ^ (-25496))), new Class[0]);
        try {
            method.setAccessible(true);
            final Context context2 = (Context) method.invoke(context, objArr);
            AFAdRevenueData(context2);
            getMonetizationNetwork().getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFa1ySDK$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.e_(context2, intent);
                }
            });
            int i8 = f2589i + 121;
            AFKeystoreWrapper = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i2 = 2 % 2;
        int i3 = f2589i + 23;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("registerConversionListener", new String[0]);
        getRevenue(appsFlyerConversionListener);
        int i5 = AFKeystoreWrapper + 77;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r1 = com.appsflyer.internal.AFa1ySDK.f2589i + 113;
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r7 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void registerValidatorListener(android.content.Context r6, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r7) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r4
            java.lang.String r3 = "registerValidatorListener called"
            java.lang.String r2 = "registerValidatorListener"
            if (r1 != 0) goto L37
            com.appsflyer.internal.AFd1zSDK r0 = r5.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r1 = r0.copy()
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.getRevenue(r2, r0)
            com.appsflyer.AFLogger.afDebugLog(r3)
            if (r7 != 0) goto L4b
        L27:
            java.lang.String r0 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r0)
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r4
            return
        L37:
            com.appsflyer.internal.AFd1zSDK r0 = r5.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r1 = r0.copy()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.getRevenue(r2, r0)
            com.appsflyer.AFLogger.afDebugLog(r3)
            if (r7 != 0) goto L4b
            goto L27
        L4b:
            com.appsflyer.internal.AFa1ySDK.getCurrencyIso4217Code = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) throws Throwable {
        getRevenue(new Object[]{this, context, map, purchaseValidationCallback}, 1567165248, -1567165246, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2589i + 63;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFAdRevenueData(context);
        PurchaseHandler purchaseHandlerComponent2 = getMonetizationNetwork().component2();
        if (purchaseHandlerComponent2.getRevenue(map, purchaseValidationCallback, "subscriptions")) {
            AFe1kSDK aFe1kSDK = new AFe1kSDK(map, purchaseValidationCallback, purchaseHandlerComponent2.AFAdRevenueData);
            AFe1oSDK aFe1oSDK = purchaseHandlerComponent2.getCurrencyIso4217Code;
            aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFe1kSDK));
            int i5 = f2589i + 43;
            AFKeystoreWrapper = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) {
        long jLongValue;
        int i2 = 2 % 2;
        if (activity != null && activity.getIntent() != null) {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), new StringBuilder("activity_intent_").append(activity.getIntent().toString()).toString());
        } else if (activity != null) {
            int i3 = AFKeystoreWrapper + 55;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getMonetizationNetwork().copy().getRevenue("sendPushNotificationData", "activity_null");
            int i5 = AFKeystoreWrapper + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f2589i = i5 % 128;
            int i6 = i5 % 2;
        }
        AFc1eSDK aFc1eSDKForce = getMonetizationNetwork().force();
        aFc1eSDKForce.getMonetizationNetwork = getRevenue(activity);
        if (aFc1eSDKForce.getMonetizationNetwork != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copydefault == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copydefault = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
            } else {
                try {
                    long j2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l2 : this.copydefault.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(aFc1eSDKForce.getMonetizationNetwork);
                            JSONObject jSONObject2 = new JSONObject(this.copydefault.get(l2));
                            if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                AFLogger.afInfoLog(new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ").append(jSONObject2).append(", new: ").append(jSONObject).append(")").toString());
                                aFc1eSDKForce.getMonetizationNetwork = null;
                                return;
                            }
                            if (jCurrentTimeMillis - l2.longValue() > j2) {
                                int i7 = f2589i + 69;
                                AFKeystoreWrapper = i7 % 128;
                                int i8 = i7 % 2;
                                this.copydefault.remove(l2);
                            }
                            if (l2.longValue() <= jLongValue) {
                                jLongValue = l2.longValue();
                            }
                        } catch (Throwable th) {
                            th = th;
                            AFLogger.afErrorLog(new StringBuilder("Error while handling push notification measurement: ").append(th.getClass().getSimpleName()).toString(), th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jLongValue = jCurrentTimeMillis;
                }
            }
            if (this.copydefault.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", 2)) {
                AFLogger.afInfoLog(new StringBuilder("pushes: removing oldest overflowing push (oldest push:").append(jLongValue).append(")").toString());
                this.copydefault.remove(Long.valueOf(jLongValue));
            }
            this.copydefault.put(Long.valueOf(jCurrentTimeMillis), aFc1eSDKForce.getMonetizationNetwork);
            start(activity);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0014  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAdditionalData(java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r4
            r3 = 0
            if (r1 == 0) goto L45
            r0 = 94
            int r0 = r0 / r3
            if (r6 == 0) goto L3b
        L14:
            com.appsflyer.internal.AFd1zSDK r0 = r5.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r2 = r0.copy()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = r6.toString()
            r1[r3] = r0
            java.lang.String r0 = "setAdditionalData"
            r2.getRevenue(r0, r1)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r6)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.toString()
            r1.setCustomData(r0)
        L3b:
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r4
            return
        L45:
            if (r6 == 0) goto L3b
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.setAdditionalData(java.util.Map):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 23;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setAndroidIdData", str);
        getMonetizationNetwork().force().getCurrencyIso4217Code = str;
        int i5 = f2589i + 29;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i2 = 2 % 2;
        int i3 = f2589i + 3;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        } else {
            getMonetizationNetwork().copy().getRevenue("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAppInviteOneLink(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            com.appsflyer.internal.AFd1zSDK r0 = r4.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r2 = r0.copy()
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r5
            java.lang.String r0 = "setAppInviteOneLink"
            r2.getRevenue(r0, r1)
            java.lang.String r1 = "setAppInviteOneLink = "
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.lang.String r2 = "oneLinkSlug"
            if (r5 == 0) goto L41
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r3
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r2)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L68
        L41:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkDomain"
            r1.remove(r0)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkVersion"
            r1.remove(r0)
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkScheme"
            r1.remove(r0)
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r3
        L68:
            getMediationNetwork(r2, r5)
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f2589i + 57;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setCollectAndroidID", String.valueOf(z2));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z2));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z2));
        int i5 = AFKeystoreWrapper + 13;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z2) throws Throwable {
        getRevenue(new Object[]{this, Boolean.valueOf(z2)}, -312979490, 312979496, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z2) throws Throwable {
        getRevenue(new Object[]{this, Boolean.valueOf(z2)}, -1241724786, 1241724809, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(AppsFlyerConsent appsFlyerConsent) {
        int i2 = 2 % 2;
        int i3 = f2589i + 41;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
        } else {
            Objects.requireNonNull(appsFlyerConsent);
            getMonetizationNetwork().force().component1 = appsFlyerConsent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) throws Throwable {
        getRevenue(new Object[]{this, str}, -1717702056, 1717702064, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 41;
        int i4 = i3 % 128;
        f2589i = i4;
        int i5 = i3 % 2;
        if (context != null) {
            int i6 = i4 + 35;
            AFKeystoreWrapper = i6 % 128;
            int i7 = i6 % 2;
            if (!getCurrencyIso4217Code()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog(new StringBuilder("CustomerUserId set: ").append(str).append(" - Initializing AppsFlyer Tacking").toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getMonetizationNetwork().component4());
            getRevenue(new Object[]{this, context, AFh1tSDK.setCustomerIdAndLogSession}, -268043806, 268043817, System.identityHashCode(this));
            getMonetizationNetwork().AFInAppEventType().getMediationNetwork();
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
            }
            getRevenue(context, referrer);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 53;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i5 = AFKeystoreWrapper + 117;
        f2589i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z2) throws Throwable {
        getRevenue(new Object[]{this, Boolean.valueOf(z2)}, -451136324, 451136331, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z2) {
        boolean z3;
        int i2 = 2 % 2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z2)));
        if (z2) {
            z3 = false;
        } else {
            int i3 = AFKeystoreWrapper + 39;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            z3 = true;
        }
        AFb1lSDK.AFAdRevenueData = Boolean.valueOf(z3);
        AFd1zSDK monetizationNetwork = getMonetizationNetwork();
        monetizationNetwork.force().component2 = z2;
        if (!z2) {
            AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
            aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFe1eSDK(getMonetizationNetwork())));
        } else {
            monetizationNetwork.force().component3 = null;
            int i5 = AFKeystoreWrapper + 25;
            f2589i = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 111;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z2)));
        getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, Boolean.valueOf(z2)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        int i5 = f2589i + 103;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i2 = 2 % 2;
        int i3 = f2589i + 23;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i5 = AFKeystoreWrapper + 123;
        f2589i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        String strTrim;
        int i2 = 2 % 2;
        if (AFk1wSDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        if (str != null) {
            strTrim = str.trim();
            int i3 = f2589i + 21;
            AFKeystoreWrapper = i3 % 128;
            int i4 = i3 % 2;
        } else {
            strTrim = "";
        }
        AFe1vSDK.getMonetizationNetwork(new AFe1ySDK(strTrim, str2.trim()));
        int i5 = f2589i + 63;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 57;
        f2589i = i3 % 128;
        if (i3 % 2 == 0) {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK aFf1eSDKAFInAppEventType = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType));
        } else {
            getMonetizationNetwork().copy().getRevenue("setImeiData", str);
            AFf1eSDK aFf1eSDKAFInAppEventType2 = getMonetizationNetwork().AFInAppEventType();
            AFf1eSDK.getCurrencyIso4217Code(new Object[]{aFf1eSDKAFInAppEventType2, str}, -1410448561, 1410448563, System.identityHashCode(aFf1eSDKAFInAppEventType2));
        }
        int i4 = AFKeystoreWrapper + 31;
        f2589i = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(String str) {
        int i2 = 2 % 2;
        getMonetizationNetwork().copy().getRevenue("setInstallId", new String[0]);
        if (!this.hashCode) {
            int i3 = AFKeystoreWrapper + 1;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!getMonetizationNetwork().AFAdRevenueData().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            int i5 = AFKeystoreWrapper + 47;
            f2589i = i5 % 128;
            int i6 = i5 % 2;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            int i7 = f2589i + 109;
            AFKeystoreWrapper = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            int i9 = f2589i + 75;
            AFKeystoreWrapper = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        AFb1kSDK.getCurrencyIso4217Code(str, getMonetizationNetwork().component4());
        int i11 = AFKeystoreWrapper + 41;
        f2589i = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f2589i + 87;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setIsUpdate", String.valueOf(z2));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z2);
        int i5 = f2589i + 57;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001c  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLogLevel(com.appsflyer.AFLogger.LogLevel r8) {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            int r1 = r8.getLevel()
            com.appsflyer.AFLogger$LogLevel r0 = com.appsflyer.AFLogger.LogLevel.NONE
            int r0 = r0.getLevel()
            r5 = 1
            r4 = 0
            if (r1 <= r0) goto L1c
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L5a
        L1c:
            r3 = r4
        L1d:
            com.appsflyer.internal.AFd1zSDK r0 = r7.getMonetizationNetwork()
            com.appsflyer.internal.AFd1oSDK r2 = r0.copy()
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r1[r4] = r0
            java.lang.String r0 = "log"
            r2.getRevenue(r0, r1)
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "logLevel"
            int r0 = r8.getLevel()
            r2.set(r1, r0)
            if (r3 != 0) goto L69
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 27
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L5c
            com.appsflyer.internal.AFd1zSDK r0 = r7.getMonetizationNetwork()
            com.appsflyer.internal.AFg1bSDK r0 = r0.afInfoLog()
            r0.getMonetizationNetwork()
            return
        L5a:
            r3 = r5
            goto L1d
        L5c:
            com.appsflyer.internal.AFd1zSDK r0 = r7.getMonetizationNetwork()
            com.appsflyer.internal.AFg1bSDK r0 = r0.afInfoLog()
            r0.getMonetizationNetwork()
            r0 = 0
            throw r0
        L69:
            com.appsflyer.internal.AFd1zSDK r0 = r7.getMonetizationNetwork()
            com.appsflyer.internal.AFg1bSDK r0 = r0.afInfoLog()
            r0.areAllFieldsValid()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.setLogLevel(com.appsflyer.AFLogger$LogLevel):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i2) {
        int i3 = 2 % 2;
        int i4 = f2589i + 65;
        AFKeystoreWrapper = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            this.component4 = TimeUnit.SECONDS.toMillis(i2);
            obj.hashCode();
            throw null;
        }
        this.component4 = TimeUnit.SECONDS.toMillis(i2);
        int i5 = AFKeystoreWrapper + 15;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i2 = 2 % 2;
        int i3 = f2589i + 77;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("setOaidData", str);
        AFb1lSDK.getMonetizationNetwork = str;
        int i5 = f2589i + 85;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 85;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        getMonetizationNetwork().i().component3 = strArr;
        int i5 = AFKeystoreWrapper + 103;
        f2589i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 19;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i5 = f2589i + 105;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) throws Throwable {
        getRevenue(new Object[]{this, str, map}, 252063752, -252063751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i2 = 2 % 2;
        int i3 = f2589i + 13;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
            int i4 = 11 / 0;
        } else {
            getMonetizationNetwork().force().getMediationNetwork = AFj1dSDK.getCurrencyIso4217Code(str);
        }
        int i5 = f2589i + 25;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i2 = 2 % 2;
        int i3 = f2589i + 3;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        Objects.requireNonNull(pluginInfo);
        getMonetizationNetwork().unregisterClient().getRevenue(pluginInfo);
        int i5 = f2589i + 115;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPreinstallAttribution(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            java.lang.String r0 = "setPreinstallAttribution API called"
            com.appsflyer.AFLogger.afDebugLog(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "pid"
            if (r6 == 0) goto L1f
            int r0 = com.appsflyer.internal.AFa1ySDK.f2589i
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r0
            int r1 = r1 % r4
            r2.put(r3, r6)     // Catch: org.json.JSONException -> L4d
        L1f:
            if (r7 == 0) goto L3c
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r4
            java.lang.String r0 = "c"
            if (r1 == 0) goto L32
            r2.put(r0, r7)     // Catch: org.json.JSONException -> L4d
            goto L3c
        L32:
            r2.put(r0, r7)     // Catch: org.json.JSONException -> L4d
            r0 = 0
            r0.hashCode()     // Catch: java.lang.Throwable -> L3a org.json.JSONException -> L4d
            throw r0     // Catch: java.lang.Throwable -> L3a org.json.JSONException -> L4d
        L3a:
            r0 = move-exception
            throw r0
        L3c:
            if (r8 == 0) goto L55
            int r0 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.appsflyer.internal.AFa1ySDK.f2589i = r0
            int r1 = r1 % r4
            java.lang.String r0 = "af_siteid"
            r2.put(r0, r8)     // Catch: org.json.JSONException -> L4d
            goto L55
        L4d:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L55:
            boolean r0 = r2.has(r3)
            if (r0 == 0) goto L66
            java.lang.String r1 = "preInstallName"
            java.lang.String r0 = r2.toString()
            getMediationNetwork(r1, r0)
            return
        L66:
            java.lang.String r0 = "Cannot set preinstall attribution data without a media source"
            com.appsflyer.AFLogger.afWarnLog(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.setPreinstallAttribution(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        int i2 = 2 % 2;
        int i3 = f2589i + 25;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1mSDK aFa1mSDKI = getMonetizationNetwork().i();
        aFa1mSDKI.component1.clear();
        aFa1mSDKI.component1.addAll(Arrays.asList(strArr));
        int i5 = AFKeystoreWrapper + 85;
        f2589i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(String... strArr) throws Throwable {
        getRevenue(new Object[]{this, strArr}, 1586087259, -1586087256, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() throws Throwable {
        getRevenue(new Object[]{this}, -1362959156, 1362959177, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        int i2 = 2 % 2;
        getMonetizationNetwork().force().getRevenue = new AFb1tSDK(strArr);
        int i3 = f2589i + 39;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getMonetizationNetwork().copy().getRevenue("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            int i3 = AFKeystoreWrapper + 107;
            f2589i = i3 % 128;
            int i4 = i3 % 2;
            if (AnonymousClass3.getCurrencyIso4217Code[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.getCurrencyIso4217Code(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                int i5 = AFKeystoreWrapper + 103;
                f2589i = i5 % 128;
                int i6 = i5 % 2;
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i7 = f2589i + 117;
        AFKeystoreWrapper = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        int i2 = 2 % 2;
        int i3 = f2589i + 61;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            int i4 = 44 / 0;
        } else {
            getMonetizationNetwork().copy().getRevenue("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        }
        int i5 = AFKeystoreWrapper + 71;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 39;
        f2589i = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            start(context, null);
            obj.hashCode();
            throw null;
        }
        start(context, null);
        int i4 = f2589i + 7;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) throws Throwable {
        getRevenue(new Object[]{this, context, str}, -973034294, 973034299, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x001d, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x001f, code lost:
    
        r1 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFa1ySDK.f2589i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0035, code lost:
    
        if (getMonetizationNetwork().v().getMediationNetwork() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0041, code lost:
    
        if (r10.hashCode != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0043, code lost:
    
        getRevenue(com.facebook.react.uimanager.ViewProps.START);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0046, code lost:
    
        if (r12 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0048, code lost:
    
        if (r13 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004a, code lost:
    
        r13.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004e, code lost:
    
        AFAdRevenueData(r11);
        r2 = getMonetizationNetwork().areAllFieldsValid();
        r2.getRevenue(com.appsflyer.internal.AFh1vSDK.getMediationNetwork(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0062, code lost:
    
        if (r10.component2 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0064, code lost:
    
        r1 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 53;
        com.appsflyer.internal.AFa1ySDK.f2589i = r1 % 128;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006e, code lost:
    
        if ((r1 % 2) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0070, code lost:
    
        r7 = com.appsflyer.internal.AFj1kSDK.O_(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0074, code lost:
    
        if (r7 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0076, code lost:
    
        r1 = com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper + 69;
        com.appsflyer.internal.AFa1ySDK.f2589i = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007f, code lost:
    
        if ((r1 % 2) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0081, code lost:
    
        r10.component2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0083, code lost:
    
        getMonetizationNetwork().copy().getRevenue(com.facebook.react.uimanager.ViewProps.START, r12);
        r7 = com.appsflyer.AFLogger.INSTANCE;
        r6 = com.appsflyer.internal.AFg1cSDK.GENERAL;
        r8 = com.appsflyer.internal.AFa1ySDK.getMonetizationNetwork;
        r7.i(r6, java.lang.String.format("Starting AppsFlyer: (v%s.%s)", "6.17.6", r8));
        com.appsflyer.AFLogger.INSTANCE.i(com.appsflyer.internal.AFg1cSDK.GENERAL, new java.lang.StringBuilder("Build Number: ").append(r8).toString());
        com.appsflyer.AppsFlyerProperties.getInstance().loadProperties(getMonetizationNetwork().component4());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d3, code lost:
    
        getMonetizationNetwork().AFInAppEventType().AFAdRevenueData(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00de, code lost:
    
        getMonetizationNetwork().component1().AFAdRevenueData(AFAdRevenueData());
        component1();
        c_(r10.component2.getBaseContext(), r10.copy.AFAdRevenueData().n_());
        getMonetizationNetwork().e().getMonetizationNetwork();
        r10.copy.v().AFAdRevenueData(r11, new com.appsflyer.internal.AFa1ySDK.AnonymousClass2(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012d, code lost:
    
        if (android.text.TextUtils.isEmpty(getMonetizationNetwork().AFInAppEventType().getMediationNetwork()) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012f, code lost:
    
        getRevenue(new java.lang.Object[0], -516060765, 516060769, (int) java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013f, code lost:
    
        if (r13 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
    
        r1 = com.appsflyer.internal.AFa1ySDK.f2589i + 49;
        com.appsflyer.internal.AFa1ySDK.AFKeystoreWrapper = r1 % 128;
        r1 = r1 % 2;
        r13.onError(41, "No dev key");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
    
        r10.component2 = r7;
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0155, code lost:
    
        com.appsflyer.internal.AFj1kSDK.O_(r11);
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void start(android.content.Context r11, java.lang.String r12, com.appsflyer.attribution.AppsFlyerRequestListener r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1ySDK.start(android.content.Context, java.lang.String, com.appsflyer.attribution.AppsFlyerRequestListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z2, Context context) throws Throwable {
        getRevenue(new Object[]{this, Boolean.valueOf(z2), context}, -1981102572, 1981102584, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 27;
        f2589i = i3 % 128;
        int i4 = i3 % 2;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        int i5 = AFKeystoreWrapper + 45;
        f2589i = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j2) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 89;
        f2589i = i3 % 128;
        if (i3 % 2 != 0) {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j2;
        } else {
            getMonetizationNetwork().i().getCurrencyIso4217Code = deepLinkListener;
            getMonetizationNetwork().i().component2 = j2;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        int i2 = 2 % 2;
        int i3 = f2589i + 91;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        getMonetizationNetwork().copy().getRevenue("unregisterConversionListener", new String[0]);
        this.getRevenue = null;
        int i5 = AFKeystoreWrapper + 21;
        f2589i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) throws Throwable {
        getRevenue(new Object[]{this, context, str}, -38035383, 38035401, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) throws Throwable {
        int i2 = 2 % 2;
        AFd1oSDK aFd1oSDKCopy = getMonetizationNetwork().copy();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? "" : map.toString();
        aFd1oSDKCopy.getRevenue(C1626yg.Ud("\u001b\u007f}~L\u007f\u001aF6<\u001e\u0013g5OP\u0005_\u001e\u001f>\u0014\u0006IKO_Tw", (short) (ZN.Xd() ^ 24538), (short) (ZN.Xd() ^ 940)), strArr);
        if (!getMonetizationNetwork().AFInAppEventType().getCurrencyIso4217Code()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            short sXd = (short) (FB.Xd() ^ 20749);
            int[] iArr = new int["\u0012F\u000e0a\n\u0007]UP]'\u001a%G\u000e|\u000f_U\f`D\u001e\u001dRahUq-5_zW\u007frU\u001b\r".length()];
            QB qb = new QB("\u0012F\u000e0a\n\u0007]UP]'\u001a%G\u000e|\u000f_U\f`D\u001e\u001dRahUq-5_zW\u007frU\u001b\r");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
                i3++;
            }
            StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i3)).append(str3);
            String strOd = EO.Od("1", (short) (ZN.Xd() ^ 6036));
            aFLogger.i(aFg1cSDK, sbAppend.append(strOd).append(str4).append(strOd).append(str5).toString());
        }
        Object obj = null;
        if (str != null && str4 != null) {
            int i4 = f2589i + 105;
            int i5 = i4 % 128;
            AFKeystoreWrapper = i5;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str2 != null && str5 != null) {
                int i6 = i5 + 5;
                f2589i = i6 % 128;
                int i7 = i6 % 2;
                if (str3 != null) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1561oA.Qd("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (ZN.Xd() ^ 27908))).getMethod(C1593ug.zd("\u0017\u0016&s$%\" \u001b\u001a.$++\u0001..5';8", (short) (Od.Xd() ^ (-29557)), (short) (Od.Xd() ^ (-18804))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        new Thread(new com.appsflyer.internal.AFa1zSDK((Context) method.invoke(context, objArr), getMonetizationNetwork().AFInAppEventType().getMediationNetwork(), str, str2, str3, str4, str5, map)).start();
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = getCurrencyIso4217Code;
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            int i8 = AFKeystoreWrapper + 91;
            f2589i = i8 % 128;
            int i9 = i8 % 2;
            String strOd2 = C1561oA.od("e\u0001xs\u0005u/~\u007f{\u0002smm'vzvfjbsd\u001em]m[f]k[gg", (short) (FB.Xd() ^ 23161));
            if (i9 != 0) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(strOd2);
            } else {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(strOd2);
                throw null;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        int i2 = 2 % 2;
        AFe1oSDK aFe1oSDKCopydefault = this.copy.copydefault();
        aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new AnonymousClass1(new AFf1ySDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i3 = f2589i + 111;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2589i + 67;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z2)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z2)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        } else {
            AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z2)), true);
            getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z2)}, -1569798316, 1569798326, (int) System.currentTimeMillis());
        }
    }
}
