package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1lSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component3 = null;
    private static boolean copy = false;
    private static int copydefault = 1;
    private static int equals = 0;
    private static final int getCurrencyIso4217Code;
    private static int hashCode = 0;
    private static boolean toString = false;
    private SecureRandom areAllFieldsValid;
    private boolean component1;
    private final AFd1zSDK component2;
    private boolean component4;
    private int getMonetizationNetwork;
    private List<String> AFAdRevenueData = new ArrayList();
    private boolean getRevenue = true;
    private final Map<String, Object> getMediationNetwork = new HashMap();

    static {
        component3();
        getCurrencyIso4217Code = 98166;
        int i2 = copydefault + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFd1lSDK(AFd1zSDK aFd1zSDK) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Kd("D<R>\fREDWUMY_\u0015;NM`^R@P^Ua`", (short) (FB.Xd() ^ 20957))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.areAllFieldsValid = (SecureRandom) constructor.newInstance(objArr);
            this.component1 = true ^ AppsFlyerProperties.getInstance().getBoolean(Wg.Zd("GD\u0017|E\b\t-\u0018\r]V", (short) (C1499aX.Xd() ^ (-6836)), (short) (C1499aX.Xd() ^ (-27912))), false);
            this.getMonetizationNetwork = 0;
            this.component4 = false;
            this.component2 = aFd1zSDK;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i2, int i3, int i4) {
        int i5 = i2 | i3;
        int i6 = ~i2;
        int i7 = ~((~i3) | i6);
        int i8 = i6 | (~i4);
        int i9 = ~i8;
        int i10 = (i7 + i9) - (i7 & i9);
        int i11 = ~(i4 | i5);
        int i12 = (i2 * 503) + (i3 * 503) + (i5 * (-502)) + (((i10 + i11) - (i10 & i11)) * (-502));
        int i13 = ~((-1) - (((-1) - i8) & ((-1) - i3)));
        int i14 = i12 + (((i13 + i11) - (i13 & i11)) * 502);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? getMonetizationNetwork(objArr) : getRevenue(objArr) : getMediationNetwork(objArr) : getCurrencyIso4217Code(objArr);
    }

    private Map<String, Object> AFAdRevenueData(String str) {
        int i2 = 2 % 2;
        int i3 = equals + 7;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
            return copydefault();
        }
        AFAdRevenueData(str, this.component2.AFInAppEventType(), this.component2.force());
        copydefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private synchronized void AFAdRevenueData(String str, AFf1eSDK aFf1eSDK, AFc1eSDK aFc1eSDK) {
        int i2 = 2 % 2;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getMediationNetwork.clear();
        if (string != null) {
            try {
                this.getMediationNetwork.putAll(AFg1eSDK.getRevenue(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            getCurrencyIso4217Code(this.component2.AFAdRevenueData().areAllFieldsValid(), aFf1eSDK.AFAdRevenueData(), aFc1eSDK.getCurrencyIso4217Code);
            getCurrencyIso4217Code(new StringBuilder("6.17.6.").append(AFa1ySDK.getMonetizationNetwork).toString(), this.component2.AFInAppEventType().getMediationNetwork(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1kSDK.getCurrencyIso4217Code(this.component2.AFAdRevenueData().getMediationNetwork));
            try {
                int i3 = this.component2.AFAdRevenueData().n_().versionCode;
                getRevenue(str, String.valueOf(i3), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
                int i4 = equals + 29;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMediationNetwork).toString());
        }
        this.getMediationNetwork.put("launch_counter", String.valueOf(this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0)));
        int i7 = equals + 41;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
    }

    private boolean AFAdRevenueData(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, aFi1xSDK, aFi1xSDK2}, 322554097, -322554095, System.identityHashCode(this))).booleanValue();
    }

    private void AFInAppEventType() {
        int i2 = 2 % 2;
        int i3 = equals + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.component2.component4().AFAdRevenueData("participantInProxy");
        int i5 = copydefault + 89;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 31 / 0;
        }
    }

    private boolean AFLogger() {
        return ((Boolean) AFAdRevenueData(new Object[]{this}, -916590221, 916590222, System.identityHashCode(this))).booleanValue();
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        int i3;
        int i4 = 2 % 2;
        int i5 = $11 + 29;
        int i6 = i5 % 128;
        $10 = i6;
        int i7 = i5 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i8 = i6 + 95;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr3[i9] = (char) (((long) cArr2[i9]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i10 = (int) (1825820251896122634L ^ ((long) hashCode));
        if (copy) {
            aFk1oSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr4[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[bArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i2] - i10);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!toString) {
            aFk1oSDK.getMonetizationNetwork = iArr.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i10);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = cArr.length;
        char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            int i11 = $11 + 55;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1oSDK.getMonetizationNetwork % 1) / aFk1oSDK.AFAdRevenueData] - i2] % i10);
                i3 = aFk1oSDK.AFAdRevenueData;
            } else {
                cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i10);
                i3 = aFk1oSDK.AFAdRevenueData + 1;
            }
            aFk1oSDK.AFAdRevenueData = i3;
        }
        String str3 = new String(cArr6);
        int i12 = $10 + 51;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str3;
    }

    private synchronized void component1() {
        int i2 = 2 % 2;
        int i3 = copydefault + 51;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.component4) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i4 = copydefault + 83;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
            return;
        }
    }

    private float component2() {
        int i2 = 2 % 2;
        int i3 = copydefault + 115;
        equals = i3 % 128;
        int i4 = i3 % 2;
        SecureRandom secureRandom = this.areAllFieldsValid;
        if (i4 == 0) {
            return secureRandom.nextFloat();
        }
        secureRandom.nextFloat();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component3 = new char[]{36322, 36338, 36333, 36350, 36320};
        hashCode = 1912311180;
        toString = true;
        copy = true;
    }

    private static String component4() {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 83;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return "6.17.6";
        }
        throw null;
    }

    private synchronized void copy() {
        int i2 = 2 % 2;
        this.AFAdRevenueData = new ArrayList();
        this.getMonetizationNetwork = 0;
        int i3 = equals + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    private synchronized Map<String, Object> copydefault() {
        Map<String, Object> map;
        int i2 = 2 % 2;
        int i3 = equals + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.getMediationNetwork.put("data", this.AFAdRevenueData);
        copy();
        map = this.getMediationNetwork;
        int i5 = equals + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    private boolean equals() {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.component1) {
            int i3 = copydefault;
            int i4 = i3 + 31;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (this.getRevenue) {
                return true;
            }
            int i6 = i3 + 37;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.component4) {
                return true;
            }
        }
        int i7 = copydefault + 39;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = equals + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean mediationNetwork = aFd1lSDK.component2.component4().getMediationNetwork("participantInProxy", false);
        int i5 = copydefault + 37;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        throw null;
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        int i2 = 2 % 2;
        try {
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a("\u0085\u0084\u0083\u0082\u0081", null, null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMediationNetwork.put(Device.JsonKeys.MODEL, Build.MODEL);
            this.getMediationNetwork.put("platform", EventMetricsAggregator.OS_NAME);
            this.getMediationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                int i3 = copydefault + 19;
                equals = i3 % 128;
                if (i3 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    this.getMediationNetwork.put("advertiserId", str);
                    int i4 = equals + 55;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.getMediationNetwork.put("imei", str2);
            }
            if (str3 != null) {
                int i7 = copydefault + 111;
                equals = i7 % 128;
                int i8 = i7 % 2;
                if (str3.length() > 0) {
                    this.getMediationNetwork.put("android_id", str3);
                    int i9 = copydefault + 123;
                    equals = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 2 % 2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        int i3 = equals + 5;
        copydefault = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                this.getMediationNetwork.put("sdk_version", str);
                throw null;
            }
            this.getMediationNetwork.put("sdk_version", str);
            if (str2 != null) {
                int i4 = copydefault + 29;
                equals = i4 % 128;
                int i5 = i4 % 2;
                if (str2.length() > 0) {
                    this.getMediationNetwork.put("devkey", str2);
                }
            }
            if (str3 != null && str3.length() > 0) {
                int i6 = copydefault + 61;
                equals = i6 % 128;
                if (i6 % 2 != 0) {
                    this.getMediationNetwork.put("originalAppsFlyerId", str3);
                    obj.hashCode();
                    throw null;
                }
                this.getMediationNetwork.put("originalAppsFlyerId", str3);
            }
            if (str4 != null) {
                int i7 = equals + 79;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    str4.length();
                    throw null;
                }
                if (str4.length() > 0) {
                    this.getMediationNetwork.put("uid", str4);
                    int i8 = 2 % 2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        int i2 = 2 % 2;
        if (equals() && this.getMonetizationNetwork < 98304) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strJoin = TextUtils.join(", ", strArr);
                String string = str != null ? new StringBuilder().append(jCurrentTimeMillis).append(Global.BLANK).append(Thread.currentThread().getId()).append(" _/AppsFlyer_6.17.6 [").append(str).append("] ").append(str2).append(Global.BLANK).append(strJoin).toString() : new StringBuilder().append(jCurrentTimeMillis).append(Global.BLANK).append(Thread.currentThread().getId()).append(Global.BLANK).append(str2).append("/AppsFlyer_6.17.6 ").append(strJoin).toString();
                int i3 = 2 % 2;
                int length = this.getMonetizationNetwork + (string.length() << 1);
                int i4 = getCurrencyIso4217Code;
                boolean z2 = false;
                if (length > i4) {
                    int i5 = equals + 55;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    string = string.substring(0, (i4 - this.getMonetizationNetwork) / 2);
                    z2 = true;
                }
                this.AFAdRevenueData.add(string);
                this.getMonetizationNetwork += string.length() << 1;
                if (z2) {
                    int i7 = equals + 113;
                    copydefault = i7 % 128;
                    if (i7 % 2 == 0) {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork *= 26120;
                    } else {
                        this.AFAdRevenueData.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getMonetizationNetwork += 138;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        return ((Boolean) AFAdRevenueData(new Object[]{str}, -1244422585, 1244422588, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r2 = new java.lang.String[r6.length + 1];
        r2[0] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r3 >= r6.length) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r1 = com.appsflyer.internal.AFd1lSDK.copydefault + 61;
        com.appsflyer.internal.AFd1lSDK.equals = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r1 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r2[r3] = r6[r3].toString();
        r3 = r3 + 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r2[r3] = r6[r3].toString();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        return new java.lang.String[]{r5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r6 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] getCurrencyIso4217Code(java.lang.String r5, java.lang.StackTraceElement[] r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r2 = r0 + 105
            int r0 = r2 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r0
            int r2 = r2 % r4
            r1 = 0
            r3 = 1
            if (r2 == 0) goto L1a
            r0 = 86
            int r0 = r0 / r1
            if (r6 != 0) goto L1d
        L15:
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r1] = r5
            return r0
        L1a:
            if (r6 != 0) goto L1d
            goto L15
        L1d:
            int r0 = r6.length
            int r0 = r0 + r3
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r1] = r5
        L23:
            int r0 = r6.length
            if (r3 >= r0) goto L47
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L3c
            r0 = r6[r3]
            java.lang.String r0 = r0.toString()
            r2[r3] = r0
            int r3 = r3 + 43
            goto L23
        L3c:
            r0 = r6[r3]
            java.lang.String r0 = r0.toString()
            r2[r3] = r0
            int r3 = r3 + 1
            goto L23
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getCurrencyIso4217Code(java.lang.String, java.lang.StackTraceElement[]):java.lang.String[]");
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        boolean mediationNetwork;
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFi1xSDK aFi1xSDK = (AFi1xSDK) objArr[1];
        AFi1xSDK aFi1xSDK2 = (AFi1xSDK) objArr[2];
        int i2 = 2 % 2;
        int i3 = equals + 87;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            aFi1xSDK.equals(aFi1xSDK2);
            throw null;
        }
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            mediationNetwork = aFd1lSDK.AFLogger();
        } else {
            mediationNetwork = aFd1lSDK.getMediationNetwork(aFi1xSDK.getMediationNetwork);
            aFd1lSDK.getMediationNetwork(mediationNetwork);
        }
        int i4 = copydefault + 63;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return Boolean.valueOf(mediationNetwork);
        }
        obj.hashCode();
        throw null;
    }

    private void getMediationNetwork(boolean z2) {
        int i2 = 2 % 2;
        int i3 = equals + 57;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            this.component2.component4().AFAdRevenueData("participantInProxy", z2);
        } else {
            this.component2.component4().AFAdRevenueData("participantInProxy", z2);
            throw null;
        }
    }

    private boolean getMediationNetwork(float f2) {
        return ((Boolean) AFAdRevenueData(new Object[]{this, Float.valueOf(f2)}, 1140261820, -1140261820, System.identityHashCode(this))).booleanValue();
    }

    private static AFi1xSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK) {
        int i2 = 2 % 2;
        int i3 = copydefault + 83;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
            if (aFi1vSDK == null) {
                return null;
            }
        } else if (aFi1vSDK == null) {
            return null;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        int i5 = equals + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return aFi1zSDK.getMediationNetwork;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i2 = 2 % 2;
        double d2 = fFloatValue;
        if (d2 >= 1.0d) {
            int i3 = copydefault + 109;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (d2 <= 0.0d) {
            return false;
        }
        if (aFd1lSDK.component2() <= fFloatValue) {
            int i4 = equals + 47;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = equals + 71;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return false;
    }

    private synchronized boolean getMonetizationNetwork(AFi1xSDK aFi1xSDK, AFi1xSDK aFi1xSDK2) {
        int i2 = 2 % 2;
        if (aFi1xSDK == null) {
            AFInAppEventType();
            return false;
        }
        if (!aFi1xSDK.AFAdRevenueData()) {
            return false;
        }
        if (this.component2.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
            return false;
        }
        int i3 = copydefault + 113;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 2;
        }
        if (!AFAdRevenueData(aFi1xSDK, aFi1xSDK2)) {
            return false;
        }
        if (!getMonetizationNetwork(aFi1xSDK.getCurrencyIso4217Code)) {
            return false;
        }
        if (getCurrencyIso4217Code(aFi1xSDK.component4)) {
            return true;
        }
        int i5 = copydefault + 115;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r1 = com.appsflyer.internal.AFd1lSDK.copydefault + 89;
        com.appsflyer.internal.AFd1lSDK.equals = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r5) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r2 = r5.equals(r4.component2.AFAdRevenueData().n_().versionName);
        r1 = com.appsflyer.internal.AFd1lSDK.equals + 83;
        com.appsflyer.internal.AFd1lSDK.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean getMonetizationNetwork(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L30
            boolean r1 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r5)
            int r0 = r3 / 0
            if (r1 != 0) goto L36
        L16:
            com.appsflyer.internal.AFd1zSDK r0 = r4.component2
            com.appsflyer.internal.AFc1oSDK r0 = r0.AFAdRevenueData()
            android.content.pm.PackageInfo r0 = r0.n_()
            java.lang.String r0 = r0.versionName
            boolean r2 = r5.equals(r0)
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0
            int r1 = r1 % r3
            return r2
        L30:
            boolean r0 = com.appsflyer.internal.AFk1wSDK.getCurrencyIso4217Code(r5)
            if (r0 == 0) goto L16
        L36:
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r0
            int r1 = r1 % r3
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getMonetizationNetwork(java.lang.String):boolean");
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String str = (String) objArr[0];
        int i2 = 2 % 2;
        int i3 = equals + 87;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            AFk1wSDK.getCurrencyIso4217Code(str);
            throw null;
        }
        if (!AFk1wSDK.getCurrencyIso4217Code(str)) {
            new AFd1pSDK();
            return Boolean.valueOf(AFd1pSDK.getCurrencyIso4217Code(component4(), str));
        }
        int i4 = equals + 123;
        copydefault = i4 % 128;
        return Boolean.valueOf(i4 % 2 != 0);
    }

    private synchronized void getRevenue(String str, String str2, String str3, String str4) {
        int i2 = 2 % 2;
        if (str != null) {
            try {
                if (str.length() > 0) {
                    int i3 = equals + 65;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    this.getMediationNetwork.put("app_id", str);
                    int i5 = copydefault + 37;
                    equals = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        Object obj = null;
        if (str2 != null && str2.length() > 0) {
            int i8 = equals + 19;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                this.getMediationNetwork.put(App.JsonKeys.APP_VERSION, str2);
                obj.hashCode();
                throw null;
            }
            this.getMediationNetwork.put(App.JsonKeys.APP_VERSION, str2);
            int i9 = 2 % 2;
        }
        if (str3 != null) {
            int i10 = copydefault + 105;
            equals = i10 % 128;
            int i11 = i10 % 2;
            if (str3.length() > 0) {
                int i12 = equals + 123;
                copydefault = i12 % 128;
                if (i12 % 2 == 0) {
                    this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
                    obj.hashCode();
                    throw null;
                }
                this.getMediationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
            }
        }
        if (str4 != null && str4.length() > 0) {
            this.getMediationNetwork.put("preInstall", str4);
        }
        int i13 = equals + 57;
        copydefault = i13 % 128;
        int i14 = i13 % 2;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void AFAdRevenueData(String str, int i2, String str2) {
        int i3 = 2 % 2;
        int i4 = copydefault + 3;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            String[] strArr = new String[4];
            strArr[1] = String.valueOf(i2);
            strArr[0] = str2;
            getCurrencyIso4217Code("server_response", str, strArr);
        } else {
            getCurrencyIso4217Code("server_response", str, String.valueOf(i2), str2);
        }
        int i5 = copydefault + 113;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean monetizationNetwork = getMonetizationNetwork(getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getCurrencyIso4217Code), getMonetizationNetwork(this.component2.component1().AFAdRevenueData.getMediationNetwork));
        if (monetizationNetwork) {
            int i5 = copydefault + 13;
            equals = i5 % 128;
            int i6 = i5 % 2;
            component1();
        } else {
            getRevenue();
            getMediationNetwork();
        }
        int i7 = equals + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean areAllFieldsValid() {
        int i2 = 2 % 2;
        int i3 = copydefault + 105;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.component4;
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
        return z2;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 53;
        equals = i4 % 128;
        int i5 = i4 % 2;
        this.component1 = false;
        int i6 = i3 + 13;
        equals = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMediationNetwork() {
        int i2 = 2 % 2;
        if (!this.component4 && !this.getRevenue) {
            int i3 = equals + 85;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.component4 = false;
        this.getRevenue = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i5 = copydefault + 91;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        int i2 = 2 % 2;
        int i3 = copydefault + 29;
        equals = i3 % 128;
        int i4 = i3 % 2;
        this.getMediationNetwork.clear();
        this.AFAdRevenueData.clear();
        this.getMonetizationNetwork = 0;
        int i5 = equals + 61;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = equals + 109;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            getCurrencyIso4217Code((String) null, str, str2);
        } else {
            getCurrencyIso4217Code((String) null, str, str2);
        }
        int i4 = equals + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        int i2 = 2 % 2;
        int i3 = copydefault + 23;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            this.getRevenue = false;
            getMonetizationNetwork();
        } else {
            this.getRevenue = false;
            getMonetizationNetwork();
        }
        copy();
        int i4 = equals + 31;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = equals + 19;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i4 = copydefault + 115;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String... strArr) {
        int i2 = 2 % 2;
        int i3 = copydefault + 47;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            getCurrencyIso4217Code("public_api_call", str, strArr);
            int i4 = 67 / 0;
        } else {
            getCurrencyIso4217Code("public_api_call", str, strArr);
        }
        int i5 = copydefault + 3;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[PHI: r1 r4
  0x0052: PHI (r1v3 java.lang.Throwable) = (r1v2 java.lang.Throwable), (r1v9 java.lang.Throwable) binds: [B:13:0x004f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:13:0x004f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020 A[PHI: r1 r4
  0x0020: PHI (r1v8 java.lang.Throwable) = (r1v2 java.lang.Throwable), (r1v9 java.lang.Throwable) binds: [B:13:0x004f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0020: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:13:0x004f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFd1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getRevenue(java.lang.Throwable r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.appsflyer.internal.AFd1lSDK.equals
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.copydefault = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L43
            java.lang.Throwable r1 = r7.getCause()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r4 = r0.getSimpleName()
            r0 = 82
            int r0 = r0 / 0
            if (r1 != 0) goto L52
        L20:
            java.lang.String r3 = r7.getMessage()
        L24:
            if (r1 != 0) goto L35
            java.lang.StackTraceElement[] r2 = r7.getStackTrace()
        L2a:
            java.lang.String[] r1 = getCurrencyIso4217Code(r3, r2)
            java.lang.String r0 = "exception"
            r6.getCurrencyIso4217Code(r0, r4, r1)
            return
        L35:
            java.lang.StackTraceElement[] r2 = r1.getStackTrace()
            int r0 = com.appsflyer.internal.AFd1lSDK.copydefault
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1lSDK.equals = r0
            int r1 = r1 % r5
            goto L2a
        L43:
            java.lang.Throwable r1 = r7.getCause()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r4 = r0.getSimpleName()
            if (r1 != 0) goto L52
            goto L20
        L52:
            java.lang.String r3 = r1.getMessage()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getRevenue(java.lang.Throwable):void");
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        int i2 = 2 % 2;
        int i3 = copydefault + 33;
        equals = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
                throw null;
            }
            final AFd1kSDK mediationNetwork = this.component2.getRevenue().getMediationNetwork(AFAdRevenueData(str), this.component2.AFInAppEventType().getMediationNetwork());
            if (mediationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            ExecutorService monetizationNetwork = this.component2.getMonetizationNetwork();
            Objects.requireNonNull(mediationNetwork);
            monetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    mediationNetwork.AFAdRevenueData();
                }
            });
            int i4 = copydefault + 61;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }
}
