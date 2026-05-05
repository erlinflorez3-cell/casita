package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007tqA0JeP.`\\2\u000fq\u0003Jřy6\"CiTR|4Id^kuobZ9C\u001f\n${\u0003,wWޯa\u0014\u00156Pt\b>[vU9\u000fzȥ\t\"8)F\u0002M\f(4`\u0010%\u0004ŲO\u000e\u0018:N{\u000bd\u001bZ\u001d\u001a@\u0006t WȪ^ʄR:PncD=/S\u0003PX?_^\u0006\u0004R\u001dÞܐ\rțe(3B=C#4k\u0005\r_iJSX\u007fM\u001dhU0a\u000fJɖ̱Xÿ\u0018\u001f3Q\u0013d\u00015t\u0007Wn\u001a2{aqRh\u000eVy1{cɡ\u0006؝\n+P03*t\u0019"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\b{\u0013\u0014?S", "", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\by\u0013\u0014?S", ">0", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn:B/#8cu\u001ek 6\u0017?FvB\u001f\u001c|aFPg5]v4PHUu83s\t\u0017\u007f9s$n}", "", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "u(9", "", "\u000fE01E,OS\"\u000fz=(\f\u0005", "u(I", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\f\b\u0001\u0013\u0014?S", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5dc\u001fX=>\\)~", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\by\u0013\u0014?S", "\u000fEP}i\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFf1jSDK {
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    private static final long getMonetizationNetwork = TimeUnit.HOURS.toSeconds(24);
    private final AFc1oSDK AFAdRevenueData;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final AFf1hSDK getRevenue;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005#2ߡx\u001d߿\u001b9^C&O4Rޚ.\u0011q{B%,6\u007fHSUH\u007fX\t&ȡi̊rNb\rI\u0012\u0014\u001a"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\b{\u0013\u0014?<{\u0018ia?;\"!A", "", "\nh]6g\u0005", "u(E", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "\u0018", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r."}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFf1jSDK(AFc1oSDK aFc1oSDK, AFf1hSDK aFf1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFf1hSDK, "");
        this.AFAdRevenueData = aFc1oSDK;
        this.getRevenue = aFf1hSDK;
        this.getMediationNetwork = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.sandbox")));
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFf1jSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFf1jSDK.this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.staging")));
            }
        });
    }

    public final boolean AFAdRevenueData() {
        AFi1xSDK aFi1xSDK;
        AFi1vSDK aFi1vSDK = this.getRevenue.getCurrencyIso4217Code;
        if (aFi1vSDK == null) {
            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFi1zSDK aFi1zSDK = aFi1vSDK.getMonetizationNetwork;
        return ((aFi1zSDK == null || (aFi1xSDK = aFi1zSDK.getMediationNetwork) == null) ? false : aFi1xSDK.AFAdRevenueData()) || System.currentTimeMillis() - this.getRevenue.getRevenue > TimeUnit.SECONDS.toMillis(this.getRevenue.getMonetizationNetwork);
    }

    public final long getCurrencyIso4217Code() {
        Object objM8980constructorimpl;
        String currencyIso4217Code = this.AFAdRevenueData.getCurrencyIso4217Code("com.appsflyer.rc.cache.max-age-fallback");
        if (currencyIso4217Code == null) {
            return getMonetizationNetwork;
        }
        try {
            Result.Companion companion = Result.Companion;
            AFf1jSDK aFf1jSDK = this;
            objM8980constructorimpl = Result.m8980constructorimpl(Long.valueOf(Long.parseLong(currencyIso4217Code)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(objM8980constructorimpl);
        if (thM8983exceptionOrNullimpl != null) {
            AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + thM8983exceptionOrNullimpl.getMessage(), thM8983exceptionOrNullimpl);
            objM8980constructorimpl = Long.valueOf(getMonetizationNetwork);
        }
        return ((Number) objM8980constructorimpl).longValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.getCurrencyIso4217Code.getValue()).booleanValue();
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) this.getMediationNetwork.getValue()).booleanValue();
    }
}
