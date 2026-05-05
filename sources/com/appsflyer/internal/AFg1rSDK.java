package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFg1uSDK;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.protocol.Device;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
public final class AFg1rSDK implements AFg1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f2602e = 1;
    private static int unregisterClient = 0;
    private final String AFAdRevenueData;
    private final Lazy AFKeystoreWrapper;
    private final AFh1xSDK areAllFieldsValid;
    private final AFc1qSDK component1;
    private final AFg1vSDK component2;
    private final AFi1pSDK component3;
    private final AFc1oSDK component4;
    private final AFc1hSDK copy;
    private final AFg1zSDK copydefault;
    private final Lazy equals;
    private final Context getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final AFg1uSDK getMonetizationNetwork;
    private final AFj1lSDK getRevenue;
    private final AFf1eSDK hashCode;
    private final AFc1eSDK toString;
    private static char[] AFInAppEventParameterName = {35909, 35928, 35921, 35926, 35927, 35903, 35904, 35924, 35933, 35910, 35931, 35879, 35908, 35905, 35911};
    private static int registerClient = 1912311267;
    private static boolean AFLogger = true;
    private static boolean AFInAppEventType = true;

    public AFg1rSDK(String str, Context context, AFi1kSDK aFi1kSDK, AFg1uSDK aFg1uSDK, AFj1lSDK aFj1lSDK, AFg1vSDK aFg1vSDK, AFh1xSDK aFh1xSDK, AFc1qSDK aFc1qSDK, AFc1oSDK aFc1oSDK, AFi1pSDK aFi1pSDK, AFf1eSDK aFf1eSDK, AFc1hSDK aFc1hSDK, AFg1zSDK aFg1zSDK, AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFg1uSDK, "");
        Intrinsics.checkNotNullParameter(aFj1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1pSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = context;
        this.getMediationNetwork = aFi1kSDK;
        this.getMonetizationNetwork = aFg1uSDK;
        this.getRevenue = aFj1lSDK;
        this.component2 = aFg1vSDK;
        this.areAllFieldsValid = aFh1xSDK;
        this.component1 = aFc1qSDK;
        this.component4 = aFc1oSDK;
        this.component3 = aFi1pSDK;
        this.hashCode = aFf1eSDK;
        this.copy = aFc1hSDK;
        this.copydefault = aFg1zSDK;
        this.toString = aFc1eSDK;
        this.equals = LazyKt.lazy(new Function0<AppsFlyerProperties>() { // from class: com.appsflyer.internal.AFg1rSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerProperties invoke() {
                return AppsFlyerProperties.getInstance();
            }
        });
        this.AFKeystoreWrapper = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.appsflyer.internal.AFg1rSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final SimpleDateFormat invoke() {
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            }
        });
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        Object objM8980constructorimpl;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String str = aFg1rSDK.toString.getMonetizationNetwork;
        if (str != null) {
            int i3 = unregisterClient + 83;
            f2602e = i3 % 128;
            if (i3 % 2 == 0) {
                map.get("af_deeplink");
                throw null;
            }
            if (map.get("af_deeplink") != null) {
                AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("isPush", "true");
                    map.put("af_deeplink", jSONObject.toString());
                    objM8980constructorimpl = Result.m8980constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(objM8980constructorimpl);
                if (thM8983exceptionOrNullimpl != null) {
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thM8983exceptionOrNullimpl, false, false, false, false, 120, null);
                    int i4 = f2602e + 33;
                    unregisterClient = i4 % 128;
                    int i5 = i4 % 2;
                }
                Result.m8979boximpl(objM8980constructorimpl);
            }
        }
        aFg1rSDK.toString.getMonetizationNetwork = null;
        return null;
    }

    private String AFAdRevenueData() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2602e + 31;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Context context = this.getCurrencyIso4217Code;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("{\u001edQp\u0002IY\"1s~bF\u0004\u0010\u0018{}\u007fkf\"", (short) (ZN.Xd() ^ 774), (short) (ZN.Xd() ^ 26100))).getMethod(Ig.wd("\"jU\tm8^a8\t$pGBx}GA\u0018!Z", (short) (OY.Xd() ^ 3782)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd = (short) (FB.Xd() ^ 15889);
            int[] iArr = new int["V\u001a\u007fh>|&q}X[=xy\"8y>w\u0018?\th".length()];
            QB qb = new QB("V\u001a\u007fh>|&q}X[=xy\"8y>w\u0018?\th");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + i5)) + xuXd.CK(iKK));
                i5++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.Qd("\u0013\u0010\u001ex\t\n\u0011\u0006\u000b\bn\u0002\u000e\u007f\u0005\u0002\u000e", (short) (Od.Xd() ^ (-12624))), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                Context context3 = this.getCurrencyIso4217Code;
                short sXd2 = (short) (C1580rY.Xd() ^ (-15134));
                short sXd3 = (short) (C1580rY.Xd() ^ (-25935));
                int[] iArr2 = new int["w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!".length()];
                QB qb2 = new QB("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i6)) - sXd3);
                    i6++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr2, 0, i6)).getMethod(C1561oA.od("}z\tT\u0003\u0002|xqn\u0001tywKvtyi{v", (short) (OY.Xd() ^ 31334)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Context context4 = (Context) method3.invoke(context3, objArr3);
                    short sXd4 = (short) (C1499aX.Xd() ^ (-7047));
                    int[] iArr3 = new int["\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+".length()];
                    QB qb3 = new QB("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+");
                    int i7 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i7));
                        i7++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr3, 0, i7)).getMethod(Wg.Zd("\u0006/^!ZGk\u000ev!j&Z9", (short) (C1580rY.Xd() ^ (-30084)), (short) (C1580rY.Xd() ^ (-10004))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        String strN_ = AFj1kSDK.N_(packageManager, (String) method4.invoke(context4, objArr4));
                        int i8 = f2602e + 71;
                        unregisterClient = i8 % 128;
                        int i9 = i8 % 2;
                        return strN_;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r5.getRevenue("CACHED_CHANNEL", r6);
        r1 = com.appsflyer.internal.AFg1rSDK.f2602e + 99;
        com.appsflyer.internal.AFg1rSDK.unregisterClient = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r2 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        r1 = com.appsflyer.internal.AFg1rSDK.unregisterClient + 23;
        com.appsflyer.internal.AFg1rSDK.f2602e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r2 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String AFAdRevenueData(com.appsflyer.internal.AFc1qSDK r5, java.lang.String r6) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r2 = r0 + 17
            int r0 = r2 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r2 = r2 % r4
            r3 = 0
            java.lang.String r1 = "CACHED_CHANNEL"
            if (r2 != 0) goto L25
            java.lang.String r2 = r5.getMonetizationNetwork(r1, r3)
            r0 = 81
            int r0 = r0 / 0
            if (r2 == 0) goto L2c
        L1b:
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r4
            return r2
        L25:
            java.lang.String r2 = r5.getMonetizationNetwork(r1, r3)
            if (r2 == 0) goto L2c
            goto L1b
        L2c:
            r5.getRevenue(r1, r6)
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L3b
            return r6
        L3b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.AFAdRevenueData(com.appsflyer.internal.AFc1qSDK, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String AFAdRevenueData(java.lang.String r9) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 95
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            java.lang.String r6 = "collectAndroidId"
            r5 = 854454532(0x32edf104, float:2.7700032E-8)
            r4 = -854454525(0xffffffffcd120f03, float:-1.5315358E8)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L5c
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            int r0 = java.lang.System.identityHashCode(r8)
            java.lang.Object r0 = getRevenue(r1, r4, r5, r0)
            com.appsflyer.AppsFlyerProperties r0 = (com.appsflyer.AppsFlyerProperties) r0
            boolean r0 = r0.getBoolean(r6, r2)
            if (r0 == 0) goto L71
        L2c:
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L81
            r0 = r9
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            if (r0 == 0) goto L43
            int r0 = r0.length()
            if (r0 != 0) goto L44
        L43:
            r2 = r1
        L44:
            r0 = r2 ^ 1
            if (r0 == r1) goto L71
            boolean r0 = r8.AFKeystoreWrapper()
            if (r0 == 0) goto L7f
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            java.lang.String r9 = r8.copy()
        L5b:
            return r9
        L5c:
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            int r0 = java.lang.System.identityHashCode(r8)
            java.lang.Object r0 = getRevenue(r1, r4, r5, r0)
            com.appsflyer.AppsFlyerProperties r0 = (com.appsflyer.AppsFlyerProperties) r0
            boolean r0 = r0.getBoolean(r6, r2)
            if (r0 == 0) goto L71
            goto L2c
        L71:
            if (r9 == 0) goto L7f
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L84
            goto L5b
        L7f:
            r9 = r3
            goto L5b
        L81:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            throw r3
        L84:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.AFAdRevenueData(java.lang.String):java.lang.String");
    }

    private void AFAdRevenueData(AFh1mSDK aFh1mSDK, String str, String str2, AFb1rSDK aFb1rSDK) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
            int i3 = unregisterClient + 73;
            f2602e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                areAllFieldsValid(map);
                toString(map);
                copydefault(map);
                AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map, "");
            areAllFieldsValid(map);
            toString(map);
            copydefault(map);
            AFa1vSDK.getMonetizationNetwork(this.copy, this.component4);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
        component3(map);
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
        getMonetizationNetwork(map, str2);
        getRevenue(map, str);
        copy(map);
        if (aFb1rSDK == null) {
            int i4 = unregisterClient + 25;
            f2602e = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = f2602e + 103;
            unregisterClient = i6 % 128;
            if (i6 % 2 == 0) {
                aFb1rSDK.getCurrencyIso4217Code(map);
            } else {
                aFb1rSDK.getCurrencyIso4217Code(map);
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r9, boolean r10) {
        /*
            r8 = this;
            r4 = 2
            int r0 = r4 % r4
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = "ro.product.cpu.abi"
            java.lang.String r1 = getCurrencyIso4217Code(r0)
            java.lang.String r0 = "cpu_abi"
            r2.put(r0, r1)
            java.lang.String r0 = "ro.product.cpu.abi2"
            java.lang.String r1 = getCurrencyIso4217Code(r0)
            java.lang.String r0 = "cpu_abi2"
            r2.put(r0, r1)
            java.lang.String r0 = "os.arch"
            java.lang.String r1 = getCurrencyIso4217Code(r0)
            java.lang.String r0 = "arch"
            r2.put(r0, r1)
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r1 = getCurrencyIso4217Code(r0)
            java.lang.String r0 = "build_display_id"
            r2.put(r0, r1)
            if (r10 == 0) goto L83
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r4
            r3 = 0
            java.lang.String r6 = "appsFlyerCount"
            r7 = 753773645(0x2cedac4d, float:6.7550744E-12)
            r5 = -753773633(0xffffffffd31253bf, float:-6.2847025E11)
            if (r1 != 0) goto La0
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r2}
            int r0 = java.lang.System.identityHashCode(r8)
            getRevenue(r1, r5, r7, r0)
            com.appsflyer.internal.AFc1oSDK r0 = r8.component4
            com.appsflyer.internal.AFc1qSDK r1 = r0.getMediationNetwork
            r0 = 1
            int r1 = r1.getRevenue(r6, r0)
            r0 = 4
            if (r1 > r0) goto L83
        L6c:
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L96
            com.appsflyer.internal.AFj1lSDK r0 = r8.getRevenue
            java.util.Map r0 = r0.getMediationNetwork()
            r2.putAll(r0)
            r0 = 65
            int r0 = r0 / r3
        L83:
            com.appsflyer.internal.AFg1vSDK r1 = r8.component2
            android.content.Context r0 = r8.getCurrencyIso4217Code
            java.util.Map r1 = r1.getMediationNetwork(r0)
            java.lang.String r0 = "dim"
            r2.put(r0, r1)
            java.lang.String r0 = "deviceData"
            r9.put(r0, r2)
            return
        L96:
            com.appsflyer.internal.AFj1lSDK r0 = r8.getRevenue
            java.util.Map r0 = r0.getMediationNetwork()
            r2.putAll(r0)
            goto L83
        La0:
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r2}
            int r0 = java.lang.System.identityHashCode(r8)
            getRevenue(r1, r5, r7, r0)
            com.appsflyer.internal.AFc1oSDK r0 = r8.component4
            com.appsflyer.internal.AFc1qSDK r0 = r0.getMediationNetwork
            int r0 = r0.getRevenue(r6, r3)
            if (r0 > r4) goto L83
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.AFAdRevenueData(java.util.Map, boolean):void");
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f2602e + 11;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.copydefault.AFAdRevenueData());
        int i5 = unregisterClient + 65;
        f2602e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String AFInAppEventType() throws Throwable {
        int i2 = 2 % 2;
        File revenue = getRevenue(getCurrencyIso4217Code(C1561oA.Xd("WU\u0015IYZ^RYgTb\u001fbeY^djlZfg*m_sh", (short) (ZN.Xd() ^ 6892))));
        if (getMediationNetwork(revenue)) {
            int i3 = f2602e + 121;
            unregisterClient = i3 % 128;
            int i4 = i3 % 2;
            short sXd = (short) (Od.Xd() ^ (-6635));
            int[] iArr = new int["\u001b\u001f7'(\u001a3\u001c $$\u0010\u001a\u0019+\u001b\u000b\u001d\u0010".length()];
            QB qb = new QB("\u001b\u001f7'(\u001a3\u001c $$\u0010\u001a\u0019+\u001b\u000b\u001d\u0010");
            int i5 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i5] = xuXd.fK((sXd ^ i5) + xuXd.CK(iKK));
                i5++;
            }
            String str = new String(iArr, 0, i5);
            if (i4 != 0) {
                revenue = getRevenue(getMediationNetwork(str));
                int i6 = 28 / 0;
            } else {
                revenue = getRevenue(getMediationNetwork(str));
            }
        }
        if (getMediationNetwork(revenue)) {
            short sXd2 = (short) (C1499aX.Xd() ^ (-436));
            short sXd3 = (short) (C1499aX.Xd() ^ (-30401));
            int[] iArr2 = new int["7kgye2npc`j,phj(hi[T]aeeQ[Z\u001bM[Z\\NS_JV".length()];
            QB qb2 = new QB("7kgye2npc`j,phj(hi[T]aeeQ[Z\u001bM[Z\\NS_JV");
            int i7 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i7] = xuXd2.fK(((sXd2 + i7) + xuXd2.CK(iKK2)) - sXd3);
                i7++;
            }
            revenue = getRevenue(new String(iArr2, 0, i7));
        }
        if (getMediationNetwork(revenue)) {
            int i8 = unregisterClient + 25;
            f2602e = i8 % 128;
            int i9 = i8 % 2;
            String strVd = hg.Vd("\u001aO]K\u0016VWIBKOSS?IH\t;IHJ<AM8D", (short) (C1499aX.Xd() ^ (-29030)), (short) (C1499aX.Xd() ^ (-21529)));
            if (i9 == 0) {
                getRevenue(strVd);
                throw null;
            }
            revenue = getRevenue(strVd);
        }
        if (getMediationNetwork(revenue)) {
            int i10 = unregisterClient + 101;
            int i11 = i10 % 128;
            f2602e = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 37;
            unregisterClient = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        Context context = this.getCurrencyIso4217Code;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("nzo|xqk4hsqvfns,@kin^pk", (short) (C1499aX.Xd() ^ (-30276)))).getMethod(C1561oA.yd("~}\u000ej|\u007f\t\u007fvu_s\u0001y", (short) (C1580rY.Xd() ^ (-9015))), new Class[0]);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String mediationNetwork = getMediationNetwork(revenue, str2);
            int i15 = f2602e + 33;
            unregisterClient = i15 % 128;
            int i16 = i15 % 2;
            return mediationNetwork;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void AFInAppEventType(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1520031212, 1520031215, (int) System.currentTimeMillis());
    }

    private void AFKeystoreWrapper(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f2602e + 37;
        unregisterClient = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.EXTENSION);
        String str = string;
        if (str != null) {
            int i4 = f2602e + 113;
            unregisterClient = i4 % 128;
            if (i4 % 2 != 0) {
                str.length();
                throw null;
            }
            if (str.length() == 0) {
                return;
            }
            int i5 = unregisterClient + 11;
            f2602e = i5 % 128;
            if (i5 % 2 != 0) {
                map.put(AppsFlyerProperties.EXTENSION, string);
            } else {
                map.put(AppsFlyerProperties.EXTENSION, string);
                obj.hashCode();
                throw null;
            }
        }
    }

    private final boolean AFKeystoreWrapper() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f2602e + 29;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        if ((!((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) && !((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            z2 = false;
        } else {
            int i5 = unregisterClient + 67;
            f2602e = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        }
        if (!z2) {
            AFa1ySDK.getRevenue();
            if (AFa1ySDK.getRevenue(this.getCurrencyIso4217Code)) {
                return false;
            }
        }
        return true;
    }

    private void AFLogger(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f2602e + 93;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component4.getMonetizationNetwork(this.getCurrencyIso4217Code)));
        int i5 = unregisterClient + 19;
        f2602e = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(String str, int[] iArr, String str2, int i2, Object[] objArr) throws UnsupportedEncodingException {
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.toCharArray();
                Object obj = null;
                obj.hashCode();
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
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr3[i5] = (char) (((long) cArr2[i5]) + 1825820251896122634L);
                    i5 /= 0;
                } else {
                    cArr3[i5] = (char) (((long) cArr2[i5]) ^ 1825820251896122634L);
                    i5++;
                }
            }
            cArr2 = cArr3;
        }
        int i7 = (int) (1825820251896122634L ^ ((long) registerClient));
        if (AFInAppEventType) {
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            aFk1oSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr4[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[bArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i2] - i7);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (AFLogger) {
            aFk1oSDK.getMonetizationNetwork = cArr.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[cArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i7);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr2[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i2] - i7);
            aFk1oSDK.AFAdRevenueData++;
        }
        objArr[0] = new String(cArr6);
    }

    private void afInfoLog(Map<String, Object> map) {
        String strAFAdRevenueData;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(C1561oA.Yd(">KIJDCU(DGJHVWT+_`_7S", (short) (C1580rY.Xd() ^ (-17396))), true)) {
            int i3 = unregisterClient + 55;
            f2602e = i3 % 128;
            int i4 = i3 % 2;
            try {
                Context context = this.getCurrencyIso4217Code;
                short sXd = (short) (Od.Xd() ^ (-5394));
                short sXd2 = (short) (Od.Xd() ^ (-27319));
                int[] iArr = new int["}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'".length()];
                QB qb = new QB("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'");
                int i5 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) + sXd2);
                    i5++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i5));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (C1580rY.Xd() ^ (-26900));
                short sXd4 = (short) (C1580rY.Xd() ^ (-3382));
                int[] iArr2 = new int["pUoJ6?R\u001f(5\u007f\u000f#|}z\u0017".length()];
                QB qb2 = new QB("pUoJ6?R\u001f(5\u007f\u000f#|}z\u0017");
                int i6 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((i6 * sXd4) ^ sXd3));
                    i6++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    String strXd = ZO.xd("\u0013Inc\u001b`\u0016\u007fgRC@J({G\u0018]\u0010", (short) (Od.Xd() ^ (-17510)), (short) (Od.Xd() ^ (-15123)));
                    Class<?> cls2 = Class.forName(C1626yg.Ud("\u0005sEI6P2<\u007f\u0001Q*\"-\u000f\u0002p{\f\"\rI*\u0002vB\u0013\nca.Of", (short) (C1499aX.Xd() ^ (-14111)), (short) (C1499aX.Xd() ^ (-24300))));
                    Class<?>[] clsArr2 = new Class[2];
                    short sXd5 = (short) (C1633zX.Xd() ^ (-5119));
                    int[] iArr3 = new int["&j\u000e\u00185'\u0010l;\r4wGD!;".length()];
                    QB qb3 = new QB("&j\u000e\u00185'\u0010l;\r4wGD!;");
                    int i7 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd5 + i7)));
                        i7++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr3, 0, i7));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr2 = {strXd, 0};
                    Method method2 = cls2.getMethod(EO.Od("v&#X(l\u0015\u001aj-B\u0011aVee\n\u0019", (short) (Od.Xd() ^ (-16713))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                        strAFAdRevenueData = this.component4.AFAdRevenueData(this.getCurrencyIso4217Code);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Throwable unused) {
                strAFAdRevenueData = null;
            }
            if (strAFAdRevenueData != null) {
                int i8 = unregisterClient + 17;
                f2602e = i8 % 128;
                int i9 = i8 % 2;
                String strQd = C1561oA.Qd("vq", (short) (ZN.Xd() ^ 26497));
                if (i9 != 0) {
                    map.put(strQd, strAFAdRevenueData);
                } else {
                    map.put(strQd, strAFAdRevenueData);
                    throw null;
                }
            }
        }
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        boolean z2 = false;
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent3 = aFg1rSDK.component4.component3();
        String strAFAdRevenueData = AFAdRevenueData(aFg1rSDK.component1, strComponent3);
        boolean z3 = (strAFAdRevenueData == null || Intrinsics.areEqual(strAFAdRevenueData, strComponent3)) ? false : true;
        if (strAFAdRevenueData == null && strComponent3 != null) {
            z2 = true;
        }
        if (z3 || z2) {
            map.put("af_latestchannel", strComponent3);
        }
        String strComponent4 = aFg1rSDK.component4();
        if (strComponent4 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strComponent4.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String str = (String) getRevenue(new Object[]{aFg1rSDK}, -994471321, 994471330, System.identityHashCode(aFg1rSDK));
        if (str != null) {
            int i3 = unregisterClient + 125;
            f2602e = i3 % 128;
            int i4 = i3 % 2;
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String strComponent32 = aFg1rSDK.component3();
        Object obj = null;
        if (strComponent32 == null) {
            return null;
        }
        int i5 = unregisterClient + 29;
        f2602e = i5 % 128;
        if (i5 % 2 != 0) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = strComponent32.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
            return null;
        }
        Locale locale4 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale4, "");
        String lowerCase4 = strComponent32.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        map.put("af_currentstore", lowerCase4);
        obj.hashCode();
        throw null;
    }

    private final void areAllFieldsValid(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f2602e + 125;
        unregisterClient = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled();
            obj.hashCode();
            throw null;
        }
        if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).isOtherSdkStringDisabled()) {
            return;
        }
        int i4 = unregisterClient + 9;
        f2602e = i4 % 128;
        if (i4 % 2 != 0) {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
        } else {
            map.put("batteryLevel", String.valueOf(this.getMonetizationNetwork.getCurrencyIso4217Code(this.getCurrencyIso4217Code).getMonetizationNetwork));
            throw null;
        }
    }

    private boolean areAllFieldsValid() {
        int i2 = 2 % 2;
        int i3 = f2602e + 45;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = Boolean.parseBoolean(this.component1.getMonetizationNetwork("sentSuccessfully", (String) null));
        int i5 = f2602e + 73;
        unregisterClient = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private static long component1() {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 73;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i5 = unregisterClient + 3;
        f2602e = i5 % 128;
        int i6 = i5 % 2;
        return jCurrentTimeMillis;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        try {
            long jLongValue = ((Long) getRevenue(new Object[]{aFg1rSDK}, 1297709710, -1297709700, System.identityHashCode(aFg1rSDK))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i3 = f2602e + 13;
            unregisterClient = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e2);
            return null;
        }
    }

    private void component1(Map<String, ? extends Object> map) {
        getRevenue(new Object[]{this, map}, -841219204, 841219208, System.identityHashCode(this));
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = unregisterClient + 15;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) aFg1rSDK.equals.getValue();
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        int i6 = f2602e + 91;
        unregisterClient = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return appsFlyerProperties;
    }

    private static String component2() {
        int i2 = 2 % 2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + RemoteSettings.FORWARD_SLASH_STRING + ((long) (blockCountLong / dPow));
        int i3 = unregisterClient + 21;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static void component2(Map<String, Object> map) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 123;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a("\u008f\u0089\u0087\u0083\u008e", null, null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put(Device.TYPE, Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put(Device.JsonKeys.MODEL, Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i5 = unregisterClient + 71;
        f2602e = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object component3(Object[] objArr) throws Throwable {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i2 = 2 % 2;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).getString("preInstallName");
        if (string != null) {
            int i3 = unregisterClient + 39;
            f2602e = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }
        String monetizationNetwork = aFg1rSDK.component1.getMonetizationNetwork("preInstallName", (String) null);
        if (monetizationNetwork != null) {
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", monetizationNetwork);
            int i5 = f2602e + 71;
            unregisterClient = i5 % 128;
            if (i5 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        String strAFInAppEventType = aFg1rSDK.AFInAppEventType();
        if (strAFInAppEventType == null) {
            int i6 = f2602e + 45;
            unregisterClient = i6 % 128;
            if (i6 % 2 != 0) {
                strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
                int i7 = 98 / 0;
            } else {
                strAFInAppEventType = aFg1rSDK.getMediationNetwork("AF_PRE_INSTALL_NAME");
            }
        }
        if (strAFInAppEventType != null) {
            aFg1rSDK.component1.getRevenue("preInstallName", strAFInAppEventType);
            ((AppsFlyerProperties) getRevenue(new Object[]{aFg1rSDK}, -854454525, 854454532, System.identityHashCode(aFg1rSDK))).set("preInstallName", strAFInAppEventType);
        }
        int i8 = f2602e + 15;
        unregisterClient = i8 % 128;
        int i9 = i8 % 2;
        return strAFInAppEventType;
    }

    private String component3() {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 107;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i5 = f2602e + 43;
        unregisterClient = i5 % 128;
        if (i5 % 2 == 0) {
            return getMediationNetwork("AF_STORE");
        }
        getMediationNetwork("AF_STORE");
        throw null;
    }

    private void component3(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 81;
        f2602e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
            ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        String string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            int i4 = unregisterClient + 85;
            f2602e = i4 % 128;
            int i5 = i4 % 2;
            map.put("onelink_ver", string2);
        }
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = unregisterClient + 79;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Long lValueOf = Long.valueOf(aFg1rSDK.component4.n_().firstInstallTime);
        int i5 = unregisterClient + 85;
        f2602e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return lValueOf;
    }

    private String component4() {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 61;
        f2602e = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
            obj.hashCode();
            throw null;
        }
        String monetizationNetwork = this.component1.getMonetizationNetwork("INSTALL_STORE", (String) null);
        if (monetizationNetwork != null) {
            int i4 = unregisterClient + 37;
            f2602e = i4 % 128;
            if (i4 % 2 != 0) {
                return monetizationNetwork;
            }
            obj.hashCode();
            throw null;
        }
        String strComponent3 = component3();
        if (strComponent3 != null) {
            this.component1.getRevenue("INSTALL_STORE", strComponent3);
        }
        int i5 = unregisterClient + 67;
        f2602e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return strComponent3;
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -753773633, 753773645, System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String copy() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.copy():java.lang.String");
    }

    private void copy(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 113;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        long j2 = this.areAllFieldsValid.copydefault;
        if (j2 != 0) {
            int i5 = unregisterClient + 59;
            f2602e = i5 % 128;
            if (i5 % 2 != 0) {
                map.put("prev_session_dur", Long.valueOf(j2));
            } else {
                map.put("prev_session_dur", Long.valueOf(j2));
                throw null;
            }
        }
    }

    private static List<AFe1pSDK> copydefault() {
        int i2 = 2 % 2;
        int i3 = f2602e + 107;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        List<AFe1pSDK> listListOf = CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.ADREVENUE});
        int i5 = unregisterClient + 41;
        f2602e = i5 % 128;
        int i6 = i5 % 2;
        return listListOf;
    }

    private final void copydefault(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 45;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        if (AFg1iSDK.getMonetizationNetwork(this.getCurrencyIso4217Code)) {
            map.put("inst_app", Boolean.TRUE);
            int i5 = f2602e + 61;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private void d(Map<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 115;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component1.getMonetizationNetwork("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component1.getMediationNetwork("is_stop_tracking_used", false)));
        }
        int i5 = unregisterClient + 83;
        f2602e = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r3
            java.lang.String r2 = "didConfigureTokenRefreshService="
            java.lang.String r0 = ""
            if (r1 != 0) goto L53
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r0 = r4.getCurrencyIso4217Code
            boolean r1 = com.appsflyer.internal.AFg1sSDK.getMonetizationNetwork(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = 64
            int r0 = r0 / 0
            if (r1 != 0) goto L39
        L31:
            java.lang.String r1 = "tokenRefreshConfigured"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.put(r1, r0)
        L39:
            com.appsflyer.internal.AFc1qSDK r0 = r4.component1
            boolean r0 = com.appsflyer.internal.AFg1sSDK.AFAdRevenueData(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "registeredUninstall"
            r5.put(r0, r1)
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r3
            return
        L53:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r0 = r4.getCurrencyIso4217Code
            boolean r1 = com.appsflyer.internal.AFg1sSDK.getMonetizationNetwork(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r1 != 0) goto L39
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.e(java.util.Map):void");
    }

    private String equals() {
        return (String) getRevenue(new Object[]{this}, -994471321, 994471330, System.identityHashCode(this));
    }

    private void equals(Map<String, Object> map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 41;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        String strVd = hg.Vd("%.\u0019)\u001b", (short) (C1580rY.Xd() ^ (-16110)), (short) (C1580rY.Xd() ^ (-28188)));
        String strUd = C1561oA.ud(" +(g '&\u001d!\u0019`\u0013\u001f\u0014!\u001d\u0016\u0010X\u001a\u0015\t S\u000b\t\u0004\u0016\u0016\u0012\u0004Kdk_x]ofZf\\W_ST", (short) (OY.Xd() ^ 11410));
        if (i4 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            Context context = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\b\u0016\t\u0018\u0012\r\u0005O\u0012\u001f\u001b\"\u0010\u001a\u001dWY\u0007\u0003\nw\f\u0005", (short) (FB.Xd() ^ 2149))).getMethod(C1561oA.Yd("BAQ\u001fOPMKFEYOVV,YY`Rfc", (short) (FB.Xd() ^ 10429)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Xg.qd("AOFUSNJ\u0015KXX_Q[b\u001d3``gYmj", (short) (C1580rY.Xd() ^ (-28881)), (short) (C1580rY.Xd() ^ (-11176)))).getMethod(Jg.Wd("(f5P%f.\u0004-j\u0011hUgMn;", (short) (ZN.Xd() ^ 31169), (short) (ZN.Xd() ^ 585)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                    Object[] objArr3 = {strUd};
                    Method method3 = Class.forName(ZO.xd("y0\u001d\u00147x\u007fr\u0011Y831\\y\u000b@7\u0006\u000b\u0005\u001dd\"\u0003\u001cD\u0017\u000e\b\u0005n}", (short) (OY.Xd() ^ 19941), (short) (OY.Xd() ^ 5878))).getMethod(Ig.wd("(r\u0011\u0016z(\u0003Y3\u00110L165O", (short) (C1607wl.Xd() ^ 27027)), Class.forName(C1626yg.Ud("kv`(Ew\u0005;5.\u0017\u001c1D\u001aq", (short) (C1580rY.Xd() ^ (-31554)), (short) (C1580rY.Xd() ^ (-27169)))));
                    try {
                        method3.setAccessible(true);
                        map.put(strVd, Boolean.valueOf(((Boolean) method3.invoke(packageManager, objArr3)).booleanValue()));
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        Intrinsics.checkNotNullParameter(map, "");
        Context context3 = this.getCurrencyIso4217Code;
        Object[] objArr4 = new Object[0];
        Method method4 = Class.forName(EO.Od("\u0004A%\u000f\u000bRuF;G@,HOQl/u\u001c^\u000fU?", (short) (C1607wl.Xd() ^ 1694))).getMethod(C1561oA.Qd("\u0013\u0010\u001ei\u0018\u0017\u0012\u000e\u0007\u0004\u0016\n\u000f\r`\f\n\u000f~\u0011\f", (short) (OY.Xd() ^ 11814)), new Class[0]);
        try {
            method4.setAccessible(true);
            Context context4 = (Context) method4.invoke(context3, objArr4);
            Object[] objArr5 = new Object[0];
            Method method5 = Class.forName(C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (FB.Xd() ^ 3578), (short) (FB.Xd() ^ 25474))).getMethod(C1561oA.od("74B\u001d-.5*/,\u0013&2$)&2", (short) (ZN.Xd() ^ 23714)), new Class[0]);
            try {
                method5.setAccessible(true);
                PackageManager packageManager2 = (PackageManager) method5.invoke(context4, objArr5);
                Object[] objArr6 = {strUd};
                Method method6 = Class.forName(C1561oA.Kd("esjywrn9o||\u0004u\u007f\u0007A\u0005\u0003Dgy|\u0006|\u0004\u0003k\u0001\u000f\u0003\n\t\u0017", (short) (C1580rY.Xd() ^ (-30632)))).getMethod(C1561oA.Xd("*$7\u0018?:<.7\u00111.BDB6", (short) (C1633zX.Xd() ^ (-8705))), Class.forName(Wg.Zd("GK)~3>\u001d\u0016W\t\u0016ckJ{{", (short) (C1633zX.Xd() ^ (-3174)), (short) (C1633zX.Xd() ^ (-8543)))));
                try {
                    method6.setAccessible(true);
                    map.put(strVd, Boolean.valueOf(((Boolean) method6.invoke(packageManager2, objArr6)).booleanValue()));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i2 = 2 % 2;
        int i3 = unregisterClient + 65;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
            int i5 = f2602e + 25;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e2);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e3);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            return null;
        } catch (Exception e4) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e4);
            return null;
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 19;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.checkNotNull(objInvoke, "");
            String str2 = (String) objInvoke;
            int i5 = f2602e + 117;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private String getCurrencyIso4217Code(SimpleDateFormat simpleDateFormat, int i2) {
        int i3 = 2 % 2;
        int i4 = f2602e + 57;
        unregisterClient = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String monetizationNetwork = this.component1.getMonetizationNetwork("appsFlyerFirstInstall", (String) null);
        if (monetizationNetwork == null) {
            int i5 = unregisterClient + 99;
            f2602e = i5 % 128;
            if (i5 % 2 != 0 ? i2 > 1 : i2 > 0) {
                monetizationNetwork = "";
            } else {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                monetizationNetwork = simpleDateFormat.format(new Date());
            }
            this.component1.getRevenue("appsFlyerFirstInstall", monetizationNetwork);
            int i6 = f2602e + 77;
            unregisterClient = i6 % 128;
            int i7 = i6 % 2;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "AppsFlyer: first launch date: " + monetizationNetwork, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        return monetizationNetwork;
    }

    private void getCurrencyIso4217Code(Map<String, Object> map, String str) {
        getRevenue(new Object[]{this, map, str}, 274047423, -274047418, System.identityHashCode(this));
    }

    private final AppsFlyerProperties getMediationNetwork() {
        return (AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = aFg1rSDK.areAllFieldsValid;
        HashMap map2 = new HashMap(aFh1xSDK.getRevenue);
        aFh1xSDK.getRevenue.clear();
        aFh1xSDK.getMonetizationNetwork.AFAdRevenueData("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            return null;
        }
        int i3 = unregisterClient + 21;
        int i4 = i3 % 128;
        f2602e = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 47;
        unregisterClient = i6 % 128;
        if (i6 % 2 == 0) {
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("gcd", map2);
            return null;
        }
        Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork((Map<String, Object>) map);
        Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
        mediationNetwork2.put("gcd", map2);
        int i7 = 34 / 0;
        return null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:34:0x007f). Please report as a decompilation issue!!! */
    private static String getMediationNetwork(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        int i2 = 2 % 2;
        try {
            try {
                if (file == null) {
                    return null;
                }
                try {
                    properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                } catch (FileNotFoundException unused) {
                    inputStreamReader = null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = null;
                }
                try {
                    properties.load(inputStreamReader);
                    AFLogger.afInfoLog("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(th2.getMessage(), th2);
                    }
                    int i3 = f2602e + 73;
                    unregisterClient = i3 % 128;
                    int i4 = i3 % 2;
                    return property;
                } catch (FileNotFoundException unused2) {
                    AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                        int i5 = f2602e + 93;
                        unregisterClient = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.afErrorLog(th.getMessage(), th);
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    return null;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    private final String getMediationNetwork(String str) {
        int i2 = 2 % 2;
        int i3 = f2602e + 73;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        String currencyIso4217Code = this.component4.getCurrencyIso4217Code(str);
        int i5 = unregisterClient + 57;
        f2602e = i5 % 128;
        int i6 = i5 % 2;
        return currencyIso4217Code;
    }

    private final void getMediationNetwork(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -539509618, 539509626, System.identityHashCode(this));
    }

    private final void getMediationNetwork(Map<String, Object> map, int i2) {
        Object obj;
        String strVd = Wg.vd("xhvxgnnDyoq", (short) (Od.Xd() ^ (-29410)));
        int i3 = 2 % 2;
        try {
            if (this.component4.n_().versionCode > this.component1.getRevenue(strVd, 0)) {
                int i4 = unregisterClient + 43;
                f2602e = i4 % 128;
                int i5 = i4 % 2;
                this.component1.getMediationNetwork(strVd, this.component4.n_().versionCode);
            }
            map.put(Qg.kd("*87%;)55*/-\u001d +\u001f\u001f", (short) (ZN.Xd() ^ 4419), (short) (ZN.Xd() ^ 6524)), String.valueOf(this.component4.n_().versionCode));
            map.put(hg.Vd("cqp^tbnnchfVdVaX", (short) (C1499aX.Xd() ^ (-14651)), (short) (C1499aX.Xd() ^ (-8603))), this.component4.n_().versionName);
            String strUd = C1561oA.ud("wcsgdrP@Fp^j", (short) (ZN.Xd() ^ 4207));
            Context context = this.component4.getCurrencyIso4217Code.getMonetizationNetwork;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("FTGVPKC\u000eP]Y`NX[\u0016\u0018EAH6JC", (short) (OY.Xd() ^ 20030))).getMethod(C1561oA.Yd("&%5\u0003341/*)=3::\u0016<5?", (short) (C1580rY.Xd() ^ (-22311))), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                short sXd = (short) (C1499aX.Xd() ^ (-12415));
                short sXd2 = (short) (C1499aX.Xd() ^ (-31704));
                int[] iArr = new int["\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\ \u001e_s$%\" \u001b\u001a.$++\u0007-&0".length()];
                QB qb = new QB("\u0001\u000f\u0006\u0015\u0013\u000e\nT\u000b\u0018\u0018\u001f\u0011\u001b\"\\ \u001e_s$%\" \u001b\u001a.$++\u0007-&0");
                int i6 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i6] = xuXd.fK((xuXd.CK(iKK) - (sXd + i6)) + sXd2);
                    i6++;
                }
                String str = new String(iArr, 0, i6);
                String strWd = Jg.Wd("kv($@vU\u000e\u0013\u001e\\`\u0011\u001f4I", (short) (FB.Xd() ^ 19713), (short) (FB.Xd() ^ 757));
                try {
                    Class<?> cls = Class.forName(str);
                    Field field = 1 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                map.put(strUd, Integer.valueOf(((Integer) obj).intValue()));
                map.put(ZO.xd("k[\u000b>\u0003", (short) (C1580rY.Xd() ^ (-6515)), (short) (C1580rY.Xd() ^ (-22156))), getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this))).longValue())));
                short sXd3 = (short) (FB.Xd() ^ 15463);
                short sXd4 = (short) (FB.Xd() ^ 13669);
                int[] iArr2 = new int["l,\nH\u000f".length()];
                QB qb2 = new QB("l,\nH\u000f");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i7 * sXd4))) + xuXd2.CK(iKK2));
                    i7++;
                }
                map.put(new String(iArr2, 0, i7), getRevenue().format(new Date(this.component4.n_().lastUpdateTime)));
                Object[] objArr2 = new Object[1];
                Object obj2 = null;
                a(Ig.wd("ľįîВƼǦŐʲˮޕܝڵۥ١˹", (short) (Od.Xd() ^ (-2453))), null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                SimpleDateFormat revenue = getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                map.put(strIntern, getCurrencyIso4217Code(revenue, i2));
                int i8 = f2602e + 51;
                unregisterClient = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(EO.Od("\tmz$o)qw\u001a~Lc\u0014\u00192\u0012\u000b!6>yD+${h\u0004\u001aj]`\u001eld\u0014P1\f:\u0011\n\u0006\u0019y", (short) (FB.Xd() ^ 3556)), th2, true);
        }
    }

    private void getMediationNetwork(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 7;
        f2602e = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.component1.getMonetizationNetwork("prev_event_name", (String) null);
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            String monetizationNetwork = this.component1.getMonetizationNetwork("prev_event_name", (String) null);
            if (monetizationNetwork != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", this.component1.getMonetizationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", monetizationNetwork);
                map.put("prev_event", jSONObject);
                int i4 = f2602e + 107;
                unregisterClient = i4 % 128;
                int i5 = i4 % 2;
            }
            this.component1.getRevenue("prev_event_name", str);
            this.component1.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Error while processing previous event.", e2);
        }
    }

    private static boolean getMediationNetwork(File file) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 55;
        int i4 = i3 % 128;
        f2602e = i4;
        int i5 = i3 % 2;
        if (file == null) {
            return true;
        }
        int i6 = i4 + 43;
        unregisterClient = i6 % 128;
        if (i6 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    private static void getMonetizationNetwork(Map<String, Object> map, AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        String str = aFh1mSDK.areAllFieldsValid;
        if (str != null) {
            map.put("eventName", str);
            map.put("eventValue", new JSONObject(aFh1mSDK.getRevenue == null ? new HashMap() : aFh1mSDK.getRevenue).toString());
        }
    }

    private static void getMonetizationNetwork(Map<String, Object> map, String str) {
        int i2 = 2 % 2;
        int i3 = f2602e + 77;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (str != null) {
            int i5 = unregisterClient + 81;
            f2602e = i5 % 128;
            int i6 = i5 % 2;
            map.put(HintConstants.AUTOFILL_HINT_PHONE, str);
        }
    }

    private void getMonetizationNetwork(Map<String, Object> map, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f2602e + 89;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.AFAdRevenueData);
        if (z2) {
            map.put("platform_extension_v2", this.getMediationNetwork.getCurrencyIso4217Code());
            int i5 = f2602e + 89;
            unregisterClient = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static File getRevenue(String str) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 9;
        int i4 = i3 % 128;
        f2602e = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (str != null) {
            int i6 = i4 + 71;
            unregisterClient = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    StringsKt.trim((CharSequence) str).toString().length();
                    obj.hashCode();
                    throw null;
                }
                if (StringsKt.trim((CharSequence) str).toString().length() > 0) {
                    return new File(StringsKt.trim((CharSequence) str).toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        int i7 = unregisterClient + 41;
        f2602e = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 94 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i2 = 2 % 2;
        int i3 = unregisterClient + 45;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFa1vSDK aFa1vSDK = AFa1vSDK.INSTANCE;
        String monetizationNetwork = AFa1vSDK.getMonetizationNetwork();
        AFa1vSDK aFa1vSDK2 = AFa1vSDK.INSTANCE;
        String currencyIso4217Code = AFa1vSDK.getCurrencyIso4217Code();
        Object obj = null;
        if (monetizationNetwork != null) {
            int i5 = f2602e + 93;
            unregisterClient = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (currencyIso4217Code != null && Integer.parseInt(currencyIso4217Code) > 0) {
                int i6 = f2602e + 1;
                unregisterClient = i6 % 128;
                int i7 = i6 % 2;
                map.put("reinstallCounter", currencyIso4217Code);
                map.put("originalAppsflyerId", monetizationNetwork);
            }
        }
        int i8 = f2602e + 13;
        unregisterClient = i8 % 128;
        if (i8 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        long seconds;
        int i5 = ~i4;
        int i6 = (i2 * 522) + (i3 * (-520)) + (((-1) - (((-1) - (~((-1) - (((-1) - i5) & ((-1) - i3))))) & ((-1) - i2))) * (-1042)) + ((i3 | i4) * 521);
        int i7 = ~i2;
        int i8 = ~((~i3) | i7);
        int i9 = ~(i4 | i7);
        switch (i6 + (((-1) - (((-1) - (~((-1) - (((-1) - (i2 | i5)) & ((-1) - i3))))) & ((-1) - ((i9 + i8) - (i9 & i8))))) * 521)) {
            case 1:
                return AFAdRevenueData(objArr);
            case 2:
                return getCurrencyIso4217Code(objArr);
            case 3:
                return getRevenue(objArr);
            case 4:
                return getMediationNetwork(objArr);
            case 5:
                return getMonetizationNetwork(objArr);
            case 6:
                return areAllFieldsValid(objArr);
            case 7:
                return component2(objArr);
            case 8:
                return component1(objArr);
            case 9:
                return component3(objArr);
            case 10:
                return component4(objArr);
            case 11:
                AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
                AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
                int i10 = 2 % 2;
                int i11 = unregisterClient + 29;
                f2602e = i11 % 128;
                int i12 = i11 % 2;
                Intrinsics.checkNotNullParameter(aFh1mSDK, "");
                Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map, "");
                getRevenue(new Object[]{aFg1rSDK, map}, -539509618, 539509626, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1rSDK.getMediationNetwork(map2, aFh1mSDK.component4);
                Map<String, Object> map3 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map3, "");
                getRevenue(new Object[]{aFg1rSDK, map3}, 1731268052, -1731268046, System.identityHashCode(aFg1rSDK));
                Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map4, "");
                aFg1rSDK.AFLogger(map4);
                Map<String, Object> map5 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map5, "");
                aFg1rSDK.afInfoLog(map5);
                Map<String, Object> map6 = aFh1mSDK.AFAdRevenueData;
                Intrinsics.checkNotNullExpressionValue(map6, "");
                AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(aFe1pSDKAFAdRevenueData, "");
                aFg1rSDK.getMediationNetwork(map6, aFe1pSDKAFAdRevenueData);
                int i13 = f2602e + 51;
                unregisterClient = i13 % 128;
                int i14 = i13 % 2;
                return null;
            case 12:
                return toString(objArr);
            default:
                AFg1rSDK aFg1rSDK2 = (AFg1rSDK) objArr[0];
                Map map7 = (Map) objArr[1];
                int i15 = 2 % 2;
                int i16 = f2602e + 23;
                unregisterClient = i16 % 128;
                int i17 = i16 % 2;
                Intrinsics.checkNotNullParameter(map7, "");
                long monetizationNetwork = aFg1rSDK2.component1.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                aFg1rSDK2.component1.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (monetizationNetwork > 0) {
                    int i18 = unregisterClient + 35;
                    f2602e = i18 % 128;
                    seconds = i18 % 2 == 0 ? TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis ^ monetizationNetwork) : TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - monetizationNetwork);
                } else {
                    int i19 = unregisterClient + 1;
                    f2602e = i19 % 128;
                    int i20 = i19 % 2;
                    seconds = -1;
                }
                map7.put("timepassedsincelastlaunch", String.valueOf(seconds));
                return null;
        }
    }

    private final SimpleDateFormat getRevenue() {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 23;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.AFKeystoreWrapper.getValue();
        int i5 = unregisterClient + 101;
        f2602e = i5 % 128;
        int i6 = i5 % 2;
        return simpleDateFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getRevenue(java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.String r8) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r5
            java.lang.String r0 = ""
            r2 = 0
            if (r1 == 0) goto La2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L28
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r5
            int r0 = r3.length()
            if (r0 != 0) goto L99
        L28:
            r0 = 1
        L29:
            java.lang.String r4 = "referrer"
            if (r0 != 0) goto L45
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L9b
            r7.put(r4, r8)
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r5
        L45:
            com.appsflyer.internal.AFc1qSDK r0 = r6.component1
            java.lang.String r1 = "extraReferrers"
            java.lang.String r0 = r0.getMonetizationNetwork(r1, r2)
            if (r0 == 0) goto L53
            r7.put(r1, r0)
        L53:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            int r2 = java.lang.System.identityHashCode(r6)
            r1 = -854454525(0xffffffffcd120f03, float:-1.5315358E8)
            r0 = 854454532(0x32edf104, float:2.7700032E-8)
            java.lang.Object r1 = getRevenue(r3, r1, r0, r2)
            com.appsflyer.AppsFlyerProperties r1 = (com.appsflyer.AppsFlyerProperties) r1
            com.appsflyer.internal.AFc1qSDK r0 = r6.component1
            java.lang.String r3 = r1.getReferrer(r0)
            r2 = r3
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L81
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 65
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r5
            int r0 = r2.length()
            if (r0 != 0) goto L8f
        L81:
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 97
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L8e
            int r0 = r5 / 5
        L8e:
            return
        L8f:
            java.lang.Object r0 = r7.get(r4)
            if (r0 != 0) goto L8e
            r7.put(r4, r3)
            goto L8e
        L99:
            r0 = 0
            goto L29
        L9b:
            r7.put(r4, r8)
            r2.hashCode()
            throw r2
        La2:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.getRevenue(java.util.Map, java.lang.String):void");
    }

    private void hashCode(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1147564241, 1147564241, System.identityHashCode(this));
    }

    private void i(Map<String, Object> map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f2602e + 47;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Context context = this.getCurrencyIso4217Code;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("dpernga*^igl\\di\"6a_dTfa", (short) (ZN.Xd() ^ 27301))).getMethod(C1593ug.zd("XWg7ddk]gnMapmkvft", (short) (Od.Xd() ^ (-21397)), (short) (Od.Xd() ^ (-2385))), new Class[0]);
        try {
            method.setAccessible(true);
            AFb1jSDK aFb1jSDKL_ = AFb1lSDK.l_((ContentResolver) method.invoke(context, objArr));
            if (aFb1jSDKL_ == null) {
                int i5 = unregisterClient + 109;
                f2602e = i5 % 128;
                int i6 = i5 % 2;
            } else {
                int i7 = f2602e + 33;
                unregisterClient = i7 % 128;
                int i8 = i7 % 2;
                map.put(C1561oA.od("z\u0006x\u0011\u0005\u0003rszt", (short) (OY.Xd() ^ 17142)), aFb1jSDKL_.getRevenue);
                map.put(C1561oA.Kd("\u001a'\u001c6,,\u001e!*&\"0.30<", (short) (C1499aX.Xd() ^ (-22797))), String.valueOf(aFb1jSDKL_.getCurrencyIso4217Code));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void registerClient(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1731268052, -1731268046, System.identityHashCode(this));
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFg1rSDK aFg1rSDK = (AFg1rSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = 2 % 2;
        AFg1uSDK.AFa1zSDK currencyIso4217Code = aFg1rSDK.getMonetizationNetwork.getCurrencyIso4217Code(aFg1rSDK.getCurrencyIso4217Code);
        float f2 = currencyIso4217Code.getMonetizationNetwork;
        String str = currencyIso4217Code.AFAdRevenueData;
        map.put("btl", String.valueOf(f2));
        Object obj = null;
        if (str != null) {
            int i3 = f2602e + 109;
            unregisterClient = i3 % 128;
            if (i3 % 2 != 0) {
                map.put("btch", str);
                throw null;
            }
            map.put("btch", str);
        }
        int i4 = f2602e + 67;
        unregisterClient = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void toString(Map<String, Object> map) throws Throwable {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 93;
        f2602e = i3 % 128;
        if (i3 % 2 == 0) {
            Context context = this.getCurrencyIso4217Code;
            Object[] objArr = {UiModeManager.class};
            Method method = Class.forName(hg.Vd("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:", (short) (Od.Xd() ^ (-12559)), (short) (Od.Xd() ^ (-736)))).getMethod(C1561oA.yd("B?Q/XQUEP5JV]OLM", (short) (C1633zX.Xd() ^ (-38))), Class.forName(C1561oA.ud("oeyc/l`ld*>fZkj", (short) (FB.Xd() ^ 8687))));
            try {
                method.setAccessible(true);
                throw null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Context context2 = this.getCurrencyIso4217Code;
        short sXd = (short) (C1499aX.Xd() ^ (-16163));
        short sXd2 = (short) (C1499aX.Xd() ^ (-26709));
        int[] iArr = new int["~H\u0017!vnB\b\u0016{rT\u001e\u0005\u0004\u0019'-\u0005\u0006O`5".length()];
        QB qb = new QB("~H\u0017!vnB\b\u0016{rT\u001e\u0005\u0004\u0019'-\u0005\u0006O`5");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i4));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (C1580rY.Xd() ^ (-13522));
        int[] iArr2 = new int["{s\nuC\u0003x\u0007\u0001H^\t~\u0012\u0013".length()];
        QB qb2 = new QB("{s\nuC\u0003x\u0007\u0001H^\t~\u0012\u0013");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i5));
            i5++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i5));
        Object[] objArr2 = {UiModeManager.class};
        Method method2 = cls.getMethod(Wg.vd("LK[;ZUWIZATb_SNQ", (short) (C1580rY.Xd() ^ (-5126))), clsArr);
        try {
            method2.setAccessible(true);
            UiModeManager uiModeManager = (UiModeManager) method2.invoke(context2, objArr2);
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            int i6 = unregisterClient + 33;
            f2602e = i6 % 128;
            int i7 = i6 % 2;
            String strKd = Qg.kd("\u001e\u001f", (short) (ZN.Xd() ^ 10743), (short) (ZN.Xd() ^ 25426));
            if (i7 != 0) {
                map.put(strKd, Boolean.TRUE);
            } else {
                map.put(strKd, Boolean.TRUE);
                int i8 = 55 / 0;
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static void unregisterClient(Map<String, Object> map) {
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void w(java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.appsflyer.internal.AFg1rSDK.f2602e
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.unregisterClient = r0
            int r1 = r1 % r7
            java.lang.String r0 = ""
            r6 = 0
            if (r1 != 0) goto L54
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.appsflyer.internal.AFf1eSDK r0 = r8.hashCode
            java.lang.String r5 = r0.getMediationNetwork()
            r4 = r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L32
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L4d
            int r0 = r4.length()
            if (r0 != 0) goto L4b
        L32:
            r0 = r2
        L33:
            r0 = r0 ^ r2
            if (r0 == r2) goto L45
        L36:
            int r0 = com.appsflyer.internal.AFg1rSDK.unregisterClient
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.appsflyer.internal.AFg1rSDK.f2602e = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L44
            r0 = 60
            int r0 = r0 / r3
        L44:
            return
        L45:
            java.lang.String r0 = "appsflyerKey"
            r9.put(r0, r5)
            goto L36
        L4b:
            r0 = r3
            goto L33
        L4d:
            r4.length()
            r6.hashCode()
            throw r6
        L54:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.appsflyer.internal.AFf1eSDK r0 = r8.hashCode
            java.lang.String r0 = r0.getMediationNetwork()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1rSDK.w(java.util.Map):void");
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(AFh1mSDK aFh1mSDK) {
        getRevenue(new Object[]{this, aFh1mSDK}, 572486758, -572486747, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void AFAdRevenueData(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        String currencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(this.component4.getMediationNetwork);
        if (currencyIso4217Code != null) {
            map.put("uid", currencyIso4217Code);
            Boolean boolValueOf = Boolean.valueOf(this.component4.getMediationNetwork.getMediationNetwork("CUSTOM_INSTALL_ID_APPLIED", false));
            Intrinsics.checkNotNullExpressionValue(boolValueOf, "");
            if (boolValueOf.booleanValue()) {
                int i3 = f2602e + 53;
                unregisterClient = i3 % 128;
                if (i3 % 2 != 0) {
                    map.put("custom_install_id", Boolean.TRUE);
                    throw null;
                }
                map.put("custom_install_id", Boolean.TRUE);
            }
            int i4 = unregisterClient + 5;
            f2602e = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final long getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        int i3 = f2602e + 103;
        unregisterClient = i3 % 128;
        int i4 = i3 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = f2602e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        unregisterClient = i5 % 128;
        int i6 = i5 % 2;
        return jCurrentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) throws Throwable {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 25;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map, "");
        AFAdRevenueData(map, aFh1mSDK.getRevenue());
        component2(map);
        getRevenue(new Object[]{map}, -1950585912, 1950585914, (int) System.currentTimeMillis());
        getRevenue(map);
        getRevenue(new Object[]{this, map, this.toString.getCurrencyIso4217Code}, 274047423, -274047418, System.identityHashCode(this));
        i(map);
        Pair[] pairArr = new Pair[2];
        Context context = this.getCurrencyIso4217Code;
        short sXd = (short) (C1580rY.Xd() ^ (-6943));
        int[] iArr = new int["<JAPNIE\u0010FSSZLV]\u0018.[[bThe".length()];
        QB qb = new QB("<JAPNIE\u0010FSSZLV]\u0018.[[bThe");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i5));
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i5));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-28964));
        short sXd3 = (short) (C1580rY.Xd() ^ (-24435));
        int[] iArr2 = new int["lk{Zn}z\u0002\u007fqt\u0004".length()];
        QB qb2 = new QB("lk{Zn}z\u0002\u007fqt\u0004");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i6)) + sXd3);
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            pairArr[0] = TuplesKt.to(Jg.Wd("z\u0014W", (short) (Od.Xd() ^ (-29800)), (short) (Od.Xd() ^ (-9063))), Integer.valueOf(((Resources) method.invoke(context, objArr)).getConfiguration().mcc));
            Context context2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(ZO.xd("PFd:ekoRQ\b'B\\dG\"\u007f\u0005R\bi:\u0016", (short) (Od.Xd() ^ (-22574)), (short) (Od.Xd() ^ (-8749)))).getMethod(C1626yg.Ud("u)D\u0001I\u0001]\u0019a\u0014D]", (short) (C1499aX.Xd() ^ (-22022)), (short) (C1499aX.Xd() ^ (-6888))), new Class[0]);
            try {
                method2.setAccessible(true);
                pairArr[1] = TuplesKt.to(Ig.wd("iB\t", (short) (C1499aX.Xd() ^ (-20156))), Integer.valueOf(((Resources) method2.invoke(context2, objArr2)).getConfiguration().mnc));
                map.put(EO.Od("n\u001fVw", (short) (C1499aX.Xd() ^ (-29442))), MapsKt.mapOf(pairArr));
                short sXd4 = (short) (C1499aX.Xd() ^ (-27634));
                int[] iArr3 = new int["\u007ftq".length()];
                QB qb3 = new QB("\u007ftq");
                int i7 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i7] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i7 + xuXd3.CK(iKK3));
                    i7++;
                }
                map.put(new String(iArr3, 0, i7), AFAdRevenueData());
                map.put(C1593ug.zd("?5HJ6:HIO;QGLE", (short) (C1633zX.Xd() ^ (-18867)), (short) (C1633zX.Xd() ^ (-16659))), Long.valueOf(component1()));
                map.put(C1561oA.od("\\`i`", (short) (Od.Xd() ^ (-16244))), component2());
                int i8 = unregisterClient + 75;
                f2602e = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 528204691, -528204690, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getCurrencyIso4217Code(Map<String, Object> map, int i2, int i3) {
        boolean z2;
        int i4 = 2 % 2;
        int i5 = unregisterClient + 121;
        f2602e = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("counter", String.valueOf(i2));
            map.put("iaecounter", String.valueOf(i3));
            areAllFieldsValid();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i3));
        if (areAllFieldsValid()) {
            z2 = false;
        } else {
            int i6 = unregisterClient + 103;
            f2602e = i6 % 128;
            int i7 = i6 % 2;
            z2 = true;
        }
        map.put("isFirstCall", String.valueOf(z2));
        int i8 = unregisterClient + 103;
        f2602e = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        boolean zAreEqual;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        if (this.component4.component2()) {
            AFh1rSDK aFh1rSDK = this.component4.getMonetizationNetwork.component3;
            if (aFh1rSDK == null) {
                return;
            }
            String str = aFh1rSDK.component3;
            if (str != null && str.length() != 0) {
                aFh1mSDK.getMonetizationNetwork("gaidError", aFh1rSDK.component3);
            }
            if (aFh1rSDK.getCurrencyIso4217Code != null && aFh1rSDK.AFAdRevenueData != null) {
                int i3 = unregisterClient + 89;
                f2602e = i3 % 128;
                int i4 = i3 % 2;
                aFh1mSDK.getMonetizationNetwork("advertiserId", aFh1rSDK.getCurrencyIso4217Code);
                aFh1mSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1rSDK.AFAdRevenueData));
                aFh1mSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1rSDK.getMediationNetwork));
            }
        } else {
            int i5 = unregisterClient + 91;
            f2602e = i5 % 128;
            if (i5 % 2 == 0) {
                Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                mediationNetwork.put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> mediationNetwork2 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork2, "");
            mediationNetwork2.put("ad_ids_disabled", Boolean.TRUE);
            int i6 = unregisterClient + 83;
            f2602e = i6 % 128;
            int i7 = i6 % 2;
        }
        AFh1rSDK aFh1rSDK2 = this.component4.getMonetizationNetwork.component3;
        if (aFh1rSDK2 != null) {
            int i8 = unregisterClient + 81;
            f2602e = i8 % 128;
            int i9 = i8 % 2;
            zAreEqual = Intrinsics.areEqual(aFh1rSDK2.component2, Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        aFh1mSDK.getMonetizationNetwork("GAID_retry", String.valueOf(zAreEqual));
        if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH}).contains(aFh1mSDK.AFAdRevenueData())) {
            AFd1aSDK aFd1aSDK = this.toString.component4;
            if (aFd1aSDK != null) {
                Map<String, Object> mediationNetwork3 = AFa1ySDK.getMediationNetwork(aFh1mSDK.AFAdRevenueData);
                Intrinsics.checkNotNullExpressionValue(mediationNetwork3, "");
                mediationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1aSDK.getMediationNetwork));
            } else {
                int i10 = f2602e + 77;
                unregisterClient = i10 % 128;
                int i11 = i10 % 2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMediationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 113;
        f2602e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1pSDK, "");
        if (!copydefault().contains(aFe1pSDK)) {
            int i5 = unregisterClient + 39;
            f2602e = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (!this.toString.getMediationNetwork()) {
            AFb1gSDK aFb1gSDK = this.toString.copydefault;
            if (aFb1gSDK != null) {
                map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("scope", Integer.valueOf(aFb1gSDK.getMonetizationNetwork)), TuplesKt.to("id", aFb1gSDK.getMediationNetwork)));
                return;
            }
            return;
        }
        map.put("app_set_id", MapsKt.mapOf(TuplesKt.to("app_set_id_disabled", Boolean.TRUE)));
        if (this.toString.copydefault != null) {
            int i7 = unregisterClient + 85;
            f2602e = i7 % 128;
            int i8 = i7 % 2;
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
            int i9 = unregisterClient + 1;
            f2602e = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
        int i11 = unregisterClient + 41;
        f2602e = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final Long getMonetizationNetwork() {
        return (Long) getRevenue(new Object[]{this}, 1297709710, -1297709700, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 125;
        f2602e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
            String str = aFh1mSDK.copydefault;
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("open_referrer", aFh1mSDK.getMonetizationNetwork);
        String str2 = aFh1mSDK.copydefault;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            map2.put("af_web_referrer", aFh1mSDK.copydefault);
        }
        int i4 = unregisterClient + 7;
        f2602e = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getMonetizationNetwork(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        Object string = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                String string3 = new StringBuilder("WARNING: currency code should be 3 characters!!! '").append(string2).append("' is not a legal value.").toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        } else {
            int i3 = unregisterClient + 67;
            f2602e = i3 % 128;
            int i4 = i3 % 2;
        }
        Object string4 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
        }
        Object string5 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            map.put("customData", string5);
        }
        Object string6 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            map.put("appUserId", string6);
            int i5 = unregisterClient + 35;
            f2602e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 / 4;
            }
        }
        Object string7 = ((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1tSDK aFb1tSDK = this.toString.getRevenue;
        if (aFb1tSDK != null) {
            int i7 = unregisterClient + 1;
            f2602e = i7 % 128;
            if (i7 % 2 == 0) {
                String[] strArr = aFb1tSDK.AFAdRevenueData;
                throw null;
            }
            Object obj = aFb1tSDK.AFAdRevenueData;
            if (obj != null) {
                map.put("sharing_filter", obj);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(AFh1mSDK aFh1mSDK) throws Throwable {
        int i2 = 2 % 2;
        int i3 = unregisterClient + 113;
        f2602e = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1mSDK, "");
            Map<String, Object> map = aFh1mSDK.AFAdRevenueData;
            aFh1mSDK.getRevenue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        Map<String, Object> map2 = aFh1mSDK.AFAdRevenueData;
        if (aFh1mSDK.getRevenue()) {
            AFAdRevenueData(aFh1mSDK, aFh1mSDK.component1, this.toString.getMediationNetwork, this.toString.AFAdRevenueData);
            int i4 = unregisterClient + 53;
            f2602e = i4 % 128;
            int i5 = i4 % 2;
        } else if (!(aFh1mSDK instanceof AFh1fSDK)) {
            int i6 = f2602e + 93;
            unregisterClient = i6 % 128;
            if (i6 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                String str = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str, "");
                getMediationNetwork(map2, str);
                int i7 = 79 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                String str2 = aFh1mSDK.areAllFieldsValid;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                getMediationNetwork(map2, str2);
            }
        }
        if (CollectionsKt.listOf((Object[]) new AFe1pSDK[]{AFe1pSDK.CONVERSION, AFe1pSDK.LAUNCH, AFe1pSDK.INAPP}).contains(aFh1mSDK.AFAdRevenueData())) {
            int i8 = f2602e + 33;
            unregisterClient = i8 % 128;
            if (i8 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                equals(map2);
                int i9 = 79 / 0;
            } else {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                equals(map2);
            }
        }
        Intrinsics.checkNotNullExpressionValue(map2, "");
        w(map2);
        getRevenue(new Object[]{map2}, -1520031212, 1520031215, (int) System.currentTimeMillis());
        AFInAppEventParameterName(map2);
        AFKeystoreWrapper(map2);
        AFAdRevenueData(map2);
        getMonetizationNetwork(map2, aFh1mSDK.getRevenue());
        e(map2);
        d(map2);
        getMonetizationNetwork(map2, aFh1mSDK);
        map2.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1nSDK
    public final void getRevenue(Map<String, Object> map) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1qSDK aFi1qSDK = this.component3.getMonetizationNetwork;
        AFi1rSDK monetizationNetwork = aFi1qSDK != null ? aFi1qSDK.getMonetizationNetwork() : null;
        if (monetizationNetwork != null) {
            map.put("network", monetizationNetwork.getCurrencyIso4217Code);
            map.put("ivc", Boolean.valueOf(monetizationNetwork.getMediationNetwork()));
            boolean z2 = false;
            if (((AppsFlyerProperties) getRevenue(new Object[]{this}, -854454525, 854454532, System.identityHashCode(this))).getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                int i3 = unregisterClient + 41;
                f2602e = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 / 3;
                }
            } else {
                z2 = true;
            }
            if (z2) {
                int i5 = f2602e + 69;
                unregisterClient = i5 % 128;
                int i6 = i5 % 2;
                String str = monetizationNetwork.getMonetizationNetwork;
                if (str != null) {
                    map.put("operator", str);
                } else {
                    int i7 = f2602e + 99;
                    unregisterClient = i7 % 128;
                    int i8 = i7 % 2;
                }
                String str2 = monetizationNetwork.getRevenue;
                if (str2 != null) {
                    map.put("carrier", str2);
                }
            }
        }
    }
}
