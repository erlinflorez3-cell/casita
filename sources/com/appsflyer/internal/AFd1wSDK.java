package com.appsflyer.internal;

import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import com.appsflyer.internal.AFd1xSDK;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final String component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = LazyKt.lazy(new Function0<AFf1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1kSDK invoke() {
                AFf1kSDK aFf1kSDKComponent1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(aFf1kSDKComponent1, "");
                return aFf1kSDKComponent1;
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFc1oSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1oSDK invoke() {
                AFc1oSDK aFc1oSDKAFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
                Intrinsics.checkNotNullExpressionValue(aFc1oSDKAFAdRevenueData, "");
                return aFc1oSDKAFAdRevenueData;
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFc1qSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1qSDK invoke() {
                AFc1qSDK aFc1qSDKComponent4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
                Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent4, "");
                return aFc1qSDKComponent4;
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1eSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1eSDK invoke() {
                AFf1eSDK aFf1eSDKAFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(aFf1eSDKAFInAppEventType, "");
                return aFf1eSDKAFInAppEventType;
            }
        });
        this.component2 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }
        });
        this.component4 = "6.17.6";
        this.component3 = LazyKt.lazy(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1ySDK invoke() {
                AFc1hSDK aFc1hSDKAFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
                Intrinsics.checkNotNullExpressionValue(aFc1hSDKAFInAppEventParameterName, "");
                return new AFd1ySDK(aFc1hSDKAFInAppEventParameterName);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<AFd1vSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1vSDK invoke() {
                return new AFd1vSDK(AFd1wSDK.this.getRevenue());
            }
        });
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = copydefault + 77;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        Object obj = null;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i5 = AFKeystoreWrapper + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        obj.hashCode();
        throw null;
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        int i2 = 2 % 2;
        int i3 = copydefault + 29;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) && monetizationNetwork != -1) {
            int i5 = copydefault + 123;
            AFKeystoreWrapper = i5 % 128;
            int i6 = i5 % 2;
            if (monetizationNetwork >= jCurrentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static void a(String str, int i2, Object[] objArr) {
        String str2 = str;
        int i3 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i4 = $10 + 51;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr3 = new char[2];
        while (aFk1qSDK.getRevenue < cArr.length) {
            cArr3[0] = cArr[aFk1qSDK.getRevenue];
            cArr3[1] = cArr[aFk1qSDK.getRevenue + 1];
            int i6 = 58224;
            for (int i7 = 0; i7 < 16; i7++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                char c4 = (char) (c2 - (((c3 + i6) ^ ((c3 << 4) + ((char) (((long) toString) ^ (-1199070254561146252L))))) ^ ((c3 >>> 5) + ((char) (((long) copy) ^ (-1199070254561146252L))))));
                cArr3[1] = c4;
                cArr3[0] = (char) (c3 - (((c4 >>> 5) + ((char) (((long) hashCode) ^ (-1199070254561146252L)))) ^ ((c4 + i6) ^ ((c4 << 4) + ((char) (((long) equals) ^ (-1199070254561146252L)))))));
                i6 -= 40503;
            }
            cArr2[aFk1qSDK.getRevenue] = cArr3[0];
            cArr2[aFk1qSDK.getRevenue + 1] = cArr3[1];
            aFk1qSDK.getRevenue += 2;
        }
        String str3 = new String(cArr2, 0, i2);
        int i8 = $10 + 97;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str3;
        } else {
            int i9 = 2 / 0;
            objArr[0] = str3;
        }
    }

    private final ExecutorService areAllFieldsValid() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        int i5 = copydefault + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
        return executorService;
    }

    private final AFf1eSDK component1() {
        int i2 = 2 % 2;
        int i3 = copydefault + 109;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        int i5 = AFKeystoreWrapper + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    private AFd1uSDK component3() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i5 = copydefault + 77;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        r1 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r3), getRevenue().getRevenue())).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        getMediationNetwork(new java.lang.Object[]{r6, r1, r2}, -1856843688, 1856843689, java.lang.System.identityHashCode(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if ((r1 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        r0 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r3 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (getMediationNetwork(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
        r1 = r1 % 2;
        r2 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        if (r2 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void copy() {
        /*
            r6 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r1 = r0 + 15
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0
            int r1 = r1 % r4
            r3 = 2108652208(0x7daf7ab0, float:2.915649E37)
            r2 = -2108652204(0xffffffff82508554, float:-1.531969E-37)
            if (r1 != 0) goto L74
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            int r0 = java.lang.System.identityHashCode(r6)
            java.lang.Object r3 = getMediationNetwork(r1, r2, r3, r0)
            com.appsflyer.internal.AFh1aSDK r3 = (com.appsflyer.internal.AFh1aSDK) r3
            r0 = 33
            int r0 = r0 / 0
            if (r3 == 0) goto L95
        L28:
            boolean r0 = r6.getMediationNetwork(r3)
            if (r0 == 0) goto L85
            int r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r0
            int r1 = r1 % r4
            com.appsflyer.internal.AFf1eSDK r0 = r6.component1()
            java.lang.String r2 = r0.getMediationNetwork()
            if (r2 == 0) goto L73
            java.util.Map r1 = r6.getRevenue(r3)
            com.appsflyer.internal.AFc1cSDK r0 = r6.getRevenue()
            java.util.List r0 = r0.getRevenue()
            java.util.Map r1 = getMonetizationNetwork(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r1, r2}
            int r2 = java.lang.System.identityHashCode(r6)
            r1 = -1856843688(0xffffffff9152d058, float:-1.663028E-28)
            r0 = 1856843689(0x6ead2fa9, float:2.6799262E28)
            getMediationNetwork(r3, r1, r0, r2)
        L73:
            return
        L74:
            java.lang.Object[] r1 = new java.lang.Object[]{r6}
            int r0 = java.lang.System.identityHashCode(r6)
            java.lang.Object r3 = getMediationNetwork(r1, r2, r3, r0)
            com.appsflyer.internal.AFh1aSDK r3 = (com.appsflyer.internal.AFh1aSDK) r3
            if (r3 == 0) goto L95
            goto L28
        L85:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFh1ySDK r0 = (com.appsflyer.internal.AFh1ySDK) r0
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER
            r4 = 4
            r5 = 0
            java.lang.String r2 = "skipping"
            r3 = 0
            com.appsflyer.internal.AFh1ySDK.v$default(r0, r1, r2, r3, r4, r5)
            return
        L95:
            int r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r0
            int r1 = r1 % r4
            if (r1 == 0) goto La4
            r0 = 18
            int r0 = r0 / 0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.copy():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x017d A[Catch: all -> 0x023f, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0025, B:9:0x0039, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00cc, B:32:0x00da, B:34:0x00e0, B:36:0x00e6, B:38:0x00f1, B:39:0x00f7, B:41:0x0105, B:43:0x010b, B:45:0x0111, B:49:0x011d, B:56:0x0129, B:57:0x012f, B:59:0x013f, B:61:0x014a, B:70:0x015a, B:71:0x015e, B:73:0x016e, B:75:0x0172, B:77:0x017d, B:78:0x0182, B:82:0x018a, B:95:0x0209, B:96:0x0220, B:98:0x0224, B:100:0x0234, B:101:0x0238, B:90:0x0199, B:92:0x01b7, B:93:0x01d3, B:86:0x0190, B:66:0x0153, B:68:0x0156, B:50:0x011f, B:53:0x0124, B:46:0x0116, B:94:0x01ee, B:62:0x014e, B:51:0x0122, B:79:0x0185, B:80:0x0188), top: B:115:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182 A[Catch: all -> 0x023f, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0025, B:9:0x0039, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00cc, B:32:0x00da, B:34:0x00e0, B:36:0x00e6, B:38:0x00f1, B:39:0x00f7, B:41:0x0105, B:43:0x010b, B:45:0x0111, B:49:0x011d, B:56:0x0129, B:57:0x012f, B:59:0x013f, B:61:0x014a, B:70:0x015a, B:71:0x015e, B:73:0x016e, B:75:0x0172, B:77:0x017d, B:78:0x0182, B:82:0x018a, B:95:0x0209, B:96:0x0220, B:98:0x0224, B:100:0x0234, B:101:0x0238, B:90:0x0199, B:92:0x01b7, B:93:0x01d3, B:86:0x0190, B:66:0x0153, B:68:0x0156, B:50:0x011f, B:53:0x0124, B:46:0x0116, B:94:0x01ee, B:62:0x014e, B:51:0x0122, B:79:0x0185, B:80:0x0188), top: B:115:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0199 A[Catch: all -> 0x023f, TryCatch #3 {, blocks: (B:4:0x0002, B:6:0x0023, B:7:0x0025, B:9:0x0039, B:13:0x0067, B:15:0x0078, B:17:0x007f, B:19:0x0091, B:21:0x0095, B:23:0x00a9, B:25:0x00b3, B:27:0x00b9, B:29:0x00c8, B:30:0x00cc, B:32:0x00da, B:34:0x00e0, B:36:0x00e6, B:38:0x00f1, B:39:0x00f7, B:41:0x0105, B:43:0x010b, B:45:0x0111, B:49:0x011d, B:56:0x0129, B:57:0x012f, B:59:0x013f, B:61:0x014a, B:70:0x015a, B:71:0x015e, B:73:0x016e, B:75:0x0172, B:77:0x017d, B:78:0x0182, B:82:0x018a, B:95:0x0209, B:96:0x0220, B:98:0x0224, B:100:0x0234, B:101:0x0238, B:90:0x0199, B:92:0x01b7, B:93:0x01d3, B:86:0x0190, B:66:0x0153, B:68:0x0156, B:50:0x011f, B:53:0x0124, B:46:0x0116, B:94:0x01ee, B:62:0x014e, B:51:0x0122, B:79:0x0185, B:80:0x0188), top: B:115:0x0002, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void copydefault() {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.copydefault():void");
    }

    private final synchronized void equals() {
        boolean zAFAdRevenueData;
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        if (aFh1aSDK != null) {
            if (aFh1aSDK.getMediationNetwork == -1) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                int i5 = copydefault + 21;
                AFKeystoreWrapper = i5 % 128;
                int i6 = i5 % 2;
                getCurrencyIso4217Code(aFh1aSDK);
            }
            zAFAdRevenueData = AFAdRevenueData(aFh1aSDK);
        } else {
            int i7 = 2 % 2;
            zAFAdRevenueData = false;
        }
        AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            aFa1vSDK.onConfigurationChanged(zAFAdRevenueData);
            int i8 = AFKeystoreWrapper + 111;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i2 = 2 % 2;
        int i3 = copydefault + 101;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i4 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 1;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i5 = AFKeystoreWrapper + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return aFf1kSDK;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1wSDK.component3().getMonetizationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2))), 2000);
        int i5 = AFKeystoreWrapper + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i3 = copydefault + 99;
            AFKeystoreWrapper = i3 % 128;
            if (i3 % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                int i4 = copydefault + 49;
                AFKeystoreWrapper = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = copydefault + 91;
                AFKeystoreWrapper = i6 % 128;
                int i7 = i6 % 2;
                aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
            }
        }
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = aFh1aSDK.getCurrencyIso4217Code;
        long jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork);
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i5);
        int i6 = AFKeystoreWrapper + 17;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AFc1oSDK getMediationNetwork() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        int i5 = AFKeystoreWrapper + 21;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return aFc1oSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        final Throwable th = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        int i2 = 2 % 2;
        int i3 = copydefault + 49;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getCurrencyIso4217Code(this.f$0, th, str);
            }
        });
        int i5 = copydefault + 41;
        AFKeystoreWrapper = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = ~((i5 + i6) - (i5 & i6));
        int i8 = ~i4;
        int i9 = ~(((i8 + i2) - (i8 & i2)) | i3);
        int i10 = (i2 * 221) + (i3 * (-219)) + (((i7 + i9) - (i7 & i9)) * 220) + (((-1) - (((-1) - (~(i8 | i3))) & ((-1) - i2))) * (-440));
        int i11 = i2 | i3;
        int i12 = i10 + (((i11 + i4) - (i11 & i4)) * 220);
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        int i2 = 2 % 2;
        int i3 = copydefault + 83;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.copy();
        int i5 = copydefault + 45;
        AFKeystoreWrapper = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        if (r14 == (-1)) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (r14 >= r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        r2 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r18}, 1891172040, -1891172038, java.lang.System.identityHashCode(r18))).getRevenue("af_send_exc_min", -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r2 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r1 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        if ((r1 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        r0 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (getRevenue().getMediationNetwork() >= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (getRevenue().getMediationNetwork() >= r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        return getMonetizationNetwork(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
    
        if (r19.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r1)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0067, code lost:
    
        if (r19.getMonetizationNetwork < java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean getMediationNetwork(com.appsflyer.internal.AFh1aSDK r19) {
        /*
            r18 = this;
            r17 = 2
            int r0 = r17 % r17
            int r0 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0
            int r1 = r1 % r17
            java.lang.String r8 = "af_send_exc_to_server_window"
            r5 = -1
            r10 = -1891172038(0xffffffff8f47013a, float:-9.811694E-30)
            r9 = 1891172040(0x70b8fec8, float:4.5802603E29)
            r16 = 0
            r3 = r19
            r4 = r18
            if (r1 != 0) goto L47
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.Object r0 = getMediationNetwork(r7, r9, r10, r0)
            com.appsflyer.internal.AFc1qSDK r0 = (com.appsflyer.internal.AFc1qSDK) r0
            long r14 = r0.getMonetizationNetwork(r8, r5)
            long r7 = r3.getMonetizationNetwork
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r12 = r0.toSeconds(r1)
            int r11 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            r0 = 9
            int r0 = r0 / r16
            if (r11 >= 0) goto L6a
        L46:
            return r16
        L47:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.Object r0 = getMediationNetwork(r7, r9, r10, r0)
            com.appsflyer.internal.AFc1qSDK r0 = (com.appsflyer.internal.AFc1qSDK) r0
            long r14 = r0.getMonetizationNetwork(r8, r5)
            long r7 = r3.getMonetizationNetwork
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = r0.toSeconds(r1)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 >= 0) goto L6a
            goto L46
        L6a:
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 == 0) goto L72
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L81
        L72:
            int r0 = com.appsflyer.internal.AFd1wSDK.copydefault
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0
            int r1 = r1 % r17
            if (r1 == 0) goto L7f
            return r16
        L7f:
            r0 = 0
            throw r0
        L81:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.Object r2 = getMediationNetwork(r1, r9, r10, r0)
            com.appsflyer.internal.AFc1qSDK r2 = (com.appsflyer.internal.AFc1qSDK) r2
            java.lang.String r1 = "af_send_exc_min"
            r0 = -1
            int r2 = r2.getRevenue(r1, r0)
            if (r2 == r0) goto Lb2
            int r0 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper
            int r1 = r0 + 31
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.copydefault = r0
            int r1 = r1 % r17
            if (r1 == 0) goto Lb3
            com.appsflyer.internal.AFc1cSDK r0 = r4.getRevenue()
            int r1 = r0.getMediationNetwork()
            r0 = 95
            int r0 = r0 / r16
            if (r1 >= r2) goto Lbe
        Lb2:
            return r16
        Lb3:
            com.appsflyer.internal.AFc1cSDK r0 = r4.getRevenue()
            int r0 = r0.getMediationNetwork()
            if (r0 >= r2) goto Lbe
            goto Lb2
        Lbe:
            boolean r0 = r4.getMonetizationNetwork(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.getMediationNetwork(com.appsflyer.internal.AFh1aSDK):boolean");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        final AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 77;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getRevenue(this.f$0);
                }
            });
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFd1wSDK.getRevenue(this.f$0);
            }
        });
        int i4 = 69 / 0;
        return null;
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1qSDK.getMediationNetwork(list)));
        int i5 = AFKeystoreWrapper + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return mapMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i2 = 2 % 2;
        int i3 = copydefault + 13;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.copydefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        int i2 = 2 % 2;
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i3 = copydefault + 97;
        AFKeystoreWrapper = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i2 = 2 % 2;
        int i3 = copydefault + 25;
        AFKeystoreWrapper = i3 % 128;
        int i4 = i3 % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i4 == 0) {
            int i5 = 60 / 0;
        }
        int i6 = copydefault + 51;
        AFKeystoreWrapper = i6 % 128;
        int i7 = i6 % 2;
        return aFc1qSDK;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) throws Throwable {
        int i2 = 2 % 2;
        Pair[] pairArr = new Pair[8];
        Object[] objArr = new Object[1];
        a(Wg.vd("䱠䐭虶濆ﯞ\ueff2", (short) (C1580rY.Xd() ^ (-12323))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, objArr);
        pairArr[0] = TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND);
        pairArr[1] = TuplesKt.to(Qg.kd("=>228", (short) (FB.Xd() ^ 6504), (short) (FB.Xd() ^ 3553)), Build.MODEL);
        Context context = getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork;
        Object[] objArr2 = new Object[0];
        Method method = Class.forName(hg.Vd("w\u0004x\u0006\u0002zt=q|z\u007fow|5Itrwgyt", (short) (OY.Xd() ^ 31243), (short) (OY.Xd() ^ 32473))).getMethod(C1561oA.ud("*'5\u0010 !(\u001d\"\u001f\u0007\u0019$\u001b", (short) (Od.Xd() ^ (-9095))), new Class[0]);
        try {
            method.setAccessible(true);
            pairArr[2] = TuplesKt.to(C1561oA.yd("#14\"'!", (short) (C1607wl.Xd() ^ 29351)), (String) method.invoke(context, objArr2));
            pairArr[3] = TuplesKt.to(C1561oA.Yd("\u0007v}\u0012", (short) (C1607wl.Xd() ^ 10931)), new AFa1uSDK().AFAdRevenueData());
            pairArr[4] = TuplesKt.to(Xg.qd("\u0013#\u001d", (short) (ZN.Xd() ^ 11193), (short) (ZN.Xd() ^ 31820)), String.valueOf(Build.VERSION.SDK_INT));
            pairArr[5] = TuplesKt.to(Jg.Wd("v\u0018\u0012", (short) (FB.Xd() ^ 1923), (short) (FB.Xd() ^ 26610)), this.component4);
            pairArr[6] = TuplesKt.to(ZO.xd("5\u001dM", (short) (Od.Xd() ^ (-5483)), (short) (Od.Xd() ^ (-18274))), AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork));
            pairArr[7] = TuplesKt.to(C1626yg.Ud("n\u000eO;\u0004%wH'\u001a", (short) (Od.Xd() ^ (-24974)), (short) (Od.Xd() ^ (-29473))), aFh1aSDK.AFAdRevenueData());
            Map<String, String> mapMapOf = MapsKt.mapOf(pairArr);
            int i3 = AFKeystoreWrapper + 111;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return mapMapOf;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1wSDK, "");
            aFd1wSDK.equals();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1wSDK, "");
        aFd1wSDK.equals();
        int i4 = AFKeystoreWrapper + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 97;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(this.f$0);
                }
            });
            int i4 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMediationNetwork(this.f$0);
                }
            });
        }
        int i5 = AFKeystoreWrapper + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 31;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(this.f$0);
                }
            });
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1wSDK.getMonetizationNetwork(this.f$0);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th, String str) {
        getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }

    public final AFc1cSDK getRevenue() {
        int i2 = 2 % 2;
        int i3 = AFKeystoreWrapper + 93;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i5 = copydefault + 121;
        AFKeystoreWrapper = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return aFc1cSDK;
    }
}
