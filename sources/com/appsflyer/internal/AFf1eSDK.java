package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1dSDK;
import com.drew.metadata.exif.ExifDirectoryBase;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char areAllFieldsValid = 28972;
    private static char component4 = 39723;
    private static char copydefault = 3892;
    private static int equals = 0;
    private static int hashCode = 1;
    private static char toString = 50688;
    private volatile String component1;
    private volatile String component2;
    private final AFf1dSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private final AFc1hSDK getMonetizationNetwork;
    private long getRevenue;
    private boolean AFAdRevenueData = false;
    private volatile boolean component3 = false;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1eSDK$3 */
    final class AnonymousClass3 implements AFf1dSDK.AFa1tSDK {
        AnonymousClass3() {
        }

        @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
        public final void getMonetizationNetwork(String str, String str2) {
            AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
            AFf1eSDK.this.getMediationNetwork.put("signedData", str);
            AFf1eSDK.this.getMediationNetwork.put("signature", str2);
            AFf1eSDK.this.component4();
            AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
        }

        @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
        public final void getRevenue(String str, Exception exc) {
            AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            AFf1eSDK.this.component4();
            AFf1eSDK.this.getMediationNetwork.put("error", message);
            AFLogger.afErrorLog(str, exc, true, true, false);
        }
    }

    public AFf1eSDK(AFc1hSDK aFc1hSDK, AFf1dSDK aFf1dSDK) {
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1dSDK;
    }

    private static void a(String str, int i2, Object[] objArr) {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr3 = new char[2];
        while (aFk1qSDK.getRevenue < cArr.length) {
            int i4 = $11 + 39;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[aFk1qSDK.getRevenue];
            cArr3[1] = cArr[aFk1qSDK.getRevenue + 1];
            int i6 = 58224;
            for (int i7 = 0; i7 < 16; i7++) {
                int i8 = $10 + 91;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i6) ^ ((c3 << 4) + ((char) (((long) copydefault) ^ (-1199070254561146252L))))) ^ ((c3 >>> 5) + ((char) (((long) toString) ^ (-1199070254561146252L))))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) areAllFieldsValid) ^ (-1199070254561146252L)))) ^ ((c4 + i6) ^ ((c4 << 4) + ((char) (((long) component4) ^ (-1199070254561146252L)))))));
                i6 -= 40503;
            }
            cArr2[aFk1qSDK.getRevenue] = cArr3[0];
            cArr2[aFk1qSDK.getRevenue + 1] = cArr3[1];
            aFk1qSDK.getRevenue += 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private boolean component1() {
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 83;
        equals = i4 % 128;
        int i5 = i4 % 2;
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null) {
            return false;
        }
        int i6 = i3 + 69;
        equals = i6 % 128;
        int i7 = i6 % 2;
        if (map.isEmpty()) {
            return false;
        }
        int i8 = equals + 47;
        hashCode = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    private long component2() {
        return ((Long) getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this))).longValue();
    }

    private long getCurrencyIso4217Code(AFc1oSDK aFc1oSDK) {
        return ((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue();
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i2, int i3, int i4) {
        int i5 = (i2 * (-337)) + (i3 * ExifDirectoryBase.TAG_SAMPLE_FORMAT);
        int i6 = ~i2;
        int i7 = ~i4;
        int i8 = ~((i7 + i6) - (i7 & i6));
        int i9 = i5 + (((~((-1) - (((-1) - (~i3)) & ((-1) - i2)))) | i8 | (~(i2 | i4))) * (-338)) + ((~((i6 + i3) - (i6 & i3))) * ExifDirectoryBase.TAG_EXTRA_SAMPLES);
        int i10 = ~((-1) - (((-1) - (i2 | i3)) & ((-1) - i4)));
        int i11 = i9 + (((i10 + i8) - (i10 & i8)) * ExifDirectoryBase.TAG_EXTRA_SAMPLES);
        if (i11 == 1) {
            AFf1eSDK aFf1eSDK = (AFf1eSDK) objArr[0];
            int i12 = 2 % 2;
            long revenue = AFj1dSDK.getRevenue(AFj1dSDK.AFAdRevenueData(new StringBuilder().append(AFb1kSDK.getCurrencyIso4217Code(((AFc1oSDK) objArr[1]).getMediationNetwork)).append(((Long) getCurrencyIso4217Code(new Object[]{aFf1eSDK}, -518249890, 518249890, System.identityHashCode(aFf1eSDK))).longValue()).toString()));
            int i13 = hashCode + 35;
            equals = i13 % 128;
            int i14 = i13 % 2;
            return Long.valueOf(revenue);
        }
        if (i11 != 2) {
            AFf1eSDK aFf1eSDK2 = (AFf1eSDK) objArr[0];
            int i15 = 2 % 2;
            int i16 = hashCode;
            int i17 = i16 + 117;
            equals = i17 % 128;
            int i18 = i17 % 2;
            long j2 = aFf1eSDK2.getRevenue;
            int i19 = i16 + 51;
            equals = i19 % 128;
            int i20 = i19 % 2;
            return Long.valueOf(j2);
        }
        AFf1eSDK aFf1eSDK3 = (AFf1eSDK) objArr[0];
        String str = (String) objArr[1];
        int i21 = 2 % 2;
        int i22 = hashCode + 91;
        equals = i22 % 128;
        int i23 = i22 % 2;
        aFf1eSDK3.component2 = str;
        int i24 = equals + 53;
        hashCode = i24 % 128;
        int i25 = i24 % 2;
        return null;
    }

    public static void getMonetizationNetwork(AFh1mSDK aFh1mSDK, byte[] bArr) {
        int i2 = 2 % 2;
        try {
            new AFb1sSDK(aFh1mSDK, bArr).afInfoLog();
            int i3 = equals + 105;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e2, false, false, true);
        }
    }

    private static boolean getRevenue(Context context) {
        int i2 = 2 % 2;
        int i3 = hashCode + 63;
        equals = i3 % 128;
        int i4 = i3 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        int i5 = hashCode + 3;
        equals = i5 % 128;
        int i6 = i5 % 2;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i7 = hashCode + 123;
        equals = i7 % 128;
        int i8 = i7 % 2;
        AFa1ySDK.getRevenue();
        if (!AFa1ySDK.getRevenue(context)) {
            return true;
        }
        int i9 = equals + 75;
        hashCode = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public static boolean getRevenue(AFh1mSDK aFh1mSDK, AFc1oSDK aFc1oSDK) throws Throwable {
        String str;
        int i2 = 2 % 2;
        int i3 = hashCode + 115;
        equals = i3 % 128;
        int i4 = i3 % 2;
        if (AFk1wSDK.getMonetizationNetwork(aFc1oSDK.AFAdRevenueData)) {
            short sXd = (short) (ZN.Xd() ^ 9729);
            short sXd2 = (short) (ZN.Xd() ^ 23350);
            int[] iArr = new int["\u001a'&g\u001c,-1%,:'5q8+*=;3?EzCD95".length()];
            QB qb = new QB("\u001a'&g\u001c,-1%,:'5q8+*=;3?EzCD95");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
                i5++;
            }
            String currencyIso4217Code = aFc1oSDK.getCurrencyIso4217Code(new String(iArr, 0, i5));
            if (AFk1wSDK.getMonetizationNetwork(currencyIso4217Code)) {
                str = null;
            } else {
                aFc1oSDK.AFAdRevenueData = currencyIso4217Code.substring(0, 8);
                str = aFc1oSDK.AFAdRevenueData;
            }
        } else {
            str = aFc1oSDK.AFAdRevenueData;
            int i6 = equals + 1;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
        }
        if (str != null) {
            int i8 = equals + 83;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                    Object[] objArr = new Object[1];
                    a(C1561oA.od("䘀쪑Ϡ㟧\uebf3듻鸮츒ⱞ⺀ⳣἐ", (short) (ZN.Xd() ^ 6060)), '<' - AndroidCharacter.getMirror('0'), objArr);
                    long j2 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i10 = ((int) (j2 % 94)) + 33;
                    for (int i11 = 0; i11 < charArray.length; i11++) {
                        charArray[i11] = (char) (charArray[i11] ^ i10);
                    }
                    Object[] objArr2 = {new String(charArray).getBytes(Charset.defaultCharset()), 2};
                    Method declaredMethod = Class.forName(C1561oA.Kd("1?6EC>:\u0005MMCG\n\u001f?RE\u0017\u0016", (short) (OY.Xd() ^ 29208))).getDeclaredMethod(Wg.Zd("4\u0012'E>\u0015$Q9+OZa*", (short) (C1580rY.Xd() ^ (-18197)), (short) (C1580rY.Xd() ^ (-18475))), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        aFh1mSDK.getMediationNetwork.put(C1561oA.Xd("28\u007fG9A\u0004K;C?", (short) (OY.Xd() ^ 30394)), (String) declaredMethod.invoke(null, objArr2));
                        return true;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Exception e3) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, Wg.vd("\u00068\"#58,1'W&\u0019 1-,64nE==?7h/,42>,>JNF}XFLFx", (short) (ZN.Xd() ^ 15172)), e3);
                }
            }
        }
        return false;
    }

    public final String AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = equals + 89;
        hashCode = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = equals + 81;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void AFAdRevenueData(String str) {
        int i2 = 2 % 2;
        int i3 = equals + 17;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            this.component1 = str;
        } else {
            this.component1 = str;
            int i4 = 0 / 0;
        }
    }

    final void component4() {
        Map<String, Object> map;
        Object currencyIso4217Code;
        int i2 = 2 % 2;
        int i3 = equals + 55;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() / this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            currencyIso4217Code = getCurrencyIso4217Code(new Object[]{this}, -518249890, 518249890, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) currencyIso4217Code).longValue()));
    }

    public final boolean getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        int i3 = hashCode + 39;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.component3;
        int i4 = equals + 39;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return z2;
    }

    public final String getMediationNetwork() {
        int i2 = 2 % 2;
        int i3 = equals + 51;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        try {
            try {
                Object[] objArr = {map, this.getMonetizationNetwork.getMonetizationNetwork};
                Object declaredConstructor = AFa1hSDK.f2584d.get(-532394666);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1hSDK.getRevenue(Process.getGidForName("") + 126, (char) TextUtils.getCapsMode("", 0, 0), 36 - (Process.myTid() >> 22))).getDeclaredConstructor(Map.class, Context.class);
                    AFa1hSDK.f2584d.put(-532394666, declaredConstructor);
                }
                Map<String, Object> map2 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i3 = equals + 115;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                return map2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false, true);
            return new HashMap();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0240 A[Catch: Exception -> 0x0253, InvocationTargetException -> 0x0287, TryCatch #4 {InvocationTargetException -> 0x0287, Exception -> 0x0253, blocks: (B:119:0x0128, B:121:0x0147, B:127:0x01a5, B:128:0x01aa, B:129:0x01b1, B:146:0x0240, B:133:0x01cd, B:134:0x01d1, B:136:0x01e8, B:138:0x01fe, B:140:0x0218, B:141:0x021d, B:142:0x0224, B:148:0x024e, B:149:0x0252), top: B:175:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMonetizationNetwork(com.appsflyer.internal.AFc1qSDK r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1eSDK.getMonetizationNetwork(com.appsflyer.internal.AFc1qSDK):java.lang.String");
    }

    public final void getMonetizationNetwork(boolean z2) {
        int i2 = 2 % 2;
        int i3 = equals + 47;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            this.component3 = z2;
        } else {
            this.component3 = z2;
            int i4 = 23 / 0;
        }
    }

    public final boolean getMonetizationNetwork() {
        int i2 = 2 % 2;
        int i3 = hashCode + 37;
        equals = i3 % 128;
        int i4 = i3 % 2;
        if (!this.AFAdRevenueData || component1()) {
            return false;
        }
        int i5 = hashCode + 21;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final Map<String, Object> getRevenue() {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        if (component1()) {
            int i3 = equals + 53;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
            map.put("lvl", this.getMediationNetwork);
            int i5 = equals + 55;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
        } else if (this.AFAdRevenueData) {
            this.getMediationNetwork = new HashMap();
            component4();
            this.getMediationNetwork.put("error", "pending LVL response");
            map.put("lvl", this.getMediationNetwork);
        }
        return map;
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        int i2 = 2 % 2;
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getMonetizationNetwork);
        int i3 = hashCode + 77;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return aFc1iSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void getRevenue(AFc1oSDK aFc1oSDK) {
        int i2 = 2 % 2;
        this.getRevenue = System.currentTimeMillis();
        this.AFAdRevenueData = this.getCurrencyIso4217Code.getRevenue(((Long) getCurrencyIso4217Code(new Object[]{this, aFc1oSDK}, 1277266909, -1277266908, System.identityHashCode(this))).longValue(), this.getMonetizationNetwork.getMonetizationNetwork, new AFf1dSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1eSDK.3
            AnonymousClass3() {
            }

            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getMonetizationNetwork(String str, String str2) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1eSDK.this.getMediationNetwork.put("signedData", str);
                AFf1eSDK.this.getMediationNetwork.put("signature", str2);
                AFf1eSDK.this.component4();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1dSDK.AFa1tSDK
            public final void getRevenue(String str, Exception exc) {
                AFf1eSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1eSDK.this.component4();
                AFf1eSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i3 = equals + 69;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
    }

    public final void getRevenue(String str) {
        getCurrencyIso4217Code(new Object[]{this, str}, -1410448561, 1410448563, System.identityHashCode(this));
    }
}
