package com.appsflyer.internal;

import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AFPurchaseType;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0R\bP.`_2şs{J$cҕyCQU\"}(\nWNu\u000bvJhŏK\u000f\u0014\u0016\u0001j2I]xs\u0012\u00172HqG3[uE9f\u0002<\n6݅R8(\u00049\u0019R\tY|\u007fSO\u001a\u0013H@\u001f:b\u0011[\b2\u00124@0\u0005,a\u007fNdL|oH7;\u0011yD^'\u000e7\rO\u001dF\u0003.#u\u0010$;FE?-'i\u00025[kE\t?\u007fI\u001dhU2ȅMu]Cf\u000e\\B9a%]!7\r\u0017_a$5;QsK~\u00158{\u000b}#;2\u001e46x4;\u001d~\n$2#y\u001aRг\u0006`H\u0012\tt~X3\u0015K7I!vU\n;GUe\u0003\u001b\fL71\u0001/\\l\u001cp\u0017+T&XAUP?^M8ik|4tp\u0005B\u0004^N05\n\u0016F\u0019;6\n@i6Ƞ\u0006JJ|\u0005\u001b)\fa\u0001jHn)\u001f(E+!\u001ajFt\u0005\u001aWd\\<\u0013c\u001b\u0003\u0017,\u0017Y3Ϣ{>'<\u001ef\u0018\u0006w\u0005e]86_jEZ\u0007k<^ibA8ic>z\u0019v݀C>h\u001ff\u0002\u000b`\u001aqt(PC\u000f|ݻ{}Je\u001a/\u0003_\u007f;L:A\u001bl\u0015v\n.DQ|7fpg>\u0005\u000b3zѴk˨x\r\tRb\u000e}\u0006I[:\u000fx\"[L\b5oģWɋl8\u0005%\r\u001f\u0002!\u0018{Zadn,t\u0004\u0005V\u0016pߝSȠA\u0017\u0017\u0001/T\u0010P\u0016^\u0001ziM@)1|PҼ=ÿ2k\u0010lvPn\u0010\u001bab.:v\rvY\b;ф{ӶJ~OeZ1ie"}, d2 = {"\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000f\b\u000b\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u000e\b{\u0013\u0014?S", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\b\f\u0013\u0014?S", ">/", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$2|\u0018Gv2D]}.\r", ">0", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFj8\t>\u0004\u0013%GN\u000eKr)<gS", ">1", "", "", ">2", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$+xiG\u0002\u0010Ef{#3{\u0016\u001fIJ?j0-\u0019rj\u0017\u0003j3Kr%M\"", ">3", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0013\bz\u0013\u0014?S", ">4", "\nh]6g\u0005", "uKR<`u:^$\r{e@|\u0016xi\t7{M\n\u0013\u001e\u0011Kn;B:#8cu\u001ek 6\u0017?FvB\u001f\u001c|aFP?7Y\u0005\bN`N9G_|H\u0014\u001fi\u0012N9bkWK,8@B*\u0016-P\u0016;uJgvxEwnER\u001eGX\u0015\u0005=-oT/F~CRA,:s\u0010ffD6Eyzo##2L9\u0015\nT\u0018\u0007R\u00071CR$\t\u0019+Rmh*NK`G_7,I~s 2Ip2x,\u007fC.@mbGn\u001f;Zv\u001b\u0002C?1.\u007f8\u001eJYd|\u0001>\u001b2#j\u0017\u000eo>- /ADMZ\u000bKuA\u000b%P", "", "", "", "5dc\u001ab5>b\u001d\u0014vm0\u0007\u0012\u0018e\u000f:\u0006M\u0007", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fuz^", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\r\by\u0013\u0014?S", "5dc\u001fX=>\\)~", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fu\u001er\u0012?I\rBg= ^VpF\u000bl.$:\u000eEVVuX]}K\u0015\u0019n\u000e[t\u0011\u000ehA1w@>hc\rHM>V_qk", "5dc\u0010h9KS\"|\u000fB:\u0007W{1Q\u0006\u0006?\u0001", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)f-wQ|`\u001eCx\u0010\u0006d4B]\u0007\"\r", "", "5dc\u001aX+BO(\u0003\u0005g\u0015|\u0018Ao\r.", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "u(E", "6`b566=S", "\u001aiPCTuNb\u001d\u0006DF(\b^", "\u000fE01E,OS\"\u000fz=(\f\u0005", "1n_FW,?O)\u0006\n", "\u001ab^:\"(I^'\u007f\u0002r,\nR3n\u000f(\tI|\u001e`#P\u0013\bz\u0013\u0014?S", "3pd._:", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$+xiG\u0002\u0010Ef{#3{\u0016\u001fIJ?j0-\u0019rj\u0017\u0003j3Kr%M\"", "1n\\=b5>\\(K", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bp\u000b6\\G\u0015\u0017$2|\u0018Gv2D]}.\r", "BnBAe0GU", "\u001ab^:\"(I^'\u007f\u0002r,\nR\u000bFj8\t>\u0004\u0013%GN\u000eKr)<gS", "\u000fEP}g\u001a\u001d9"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AFf1ySDK extends AFe1jSDK {
    private final AppsFlyerProperties component2;
    private final AFj1iSDK copydefault;
    private final AppsFlyerInAppPurchaseValidationCallback equals;
    private final Map<String, String> hashCode;
    private final AFPurchaseDetails toString;

    public static final class AFa1tSDK extends RuntimeException {
    }

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            getRevenue = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 32, null);
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK) {
        super(AFe1pSDK.MANUAL_PURCHASE_VALIDATION, new AFe1pSDK[]{AFe1pSDK.RC_CDN, AFe1pSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, null, MapsKt.emptyMap());
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1iSDK, "");
        this.component2 = appsFlyerProperties;
        this.toString = aFPurchaseDetails;
        this.hashCode = map;
        this.equals = appsFlyerInAppPurchaseValidationCallback;
        this.copydefault = aFj1iSDK;
        this.getCurrencyIso4217Code.add(AFe1pSDK.CONVERSION);
    }

    public /* synthetic */ AFf1ySDK(AFd1zSDK aFd1zSDK, AppsFlyerProperties appsFlyerProperties, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1iSDK aFj1iSDK, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1zSDK, appsFlyerProperties, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i2 + 32) - (i2 | 32) != 0 ? new AFj1hSDK() : aFj1iSDK);
    }

    private final void getMediationNetwork(String str, int i2) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to("error_code", Integer.valueOf(i2)), TuplesKt.to("error_message", str)));
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    protected final String getCurrencyIso4217Code(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return this.copydefault.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFe1fSDK, com.appsflyer.internal.AFe1mSDK
    public final void getCurrencyIso4217Code() {
        Object objM8980constructorimpl;
        Unit unit;
        super.getCurrencyIso4217Code();
        Throwable thComponent1 = component1();
        if (thComponent1 != null && !(thComponent1 instanceof AFe1iSDK)) {
            if (thComponent1 instanceof AFe1nSDK) {
                getMediationNetwork("No dev key", -1);
            } else if (thComponent1 instanceof AFa1tSDK) {
                getMediationNetwork("One or more of provided arguments is empty", -1);
            } else {
                getMediationNetwork("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1fSDK) this).areAllFieldsValid;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(MapsKt.mapOf(TuplesKt.to("error_code", Integer.valueOf(responseNetwork.getStatusCode())), TuplesKt.to("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                AFf1ySDK aFf1ySDK = this;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.equals;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(AFj1bSDK.getMonetizationNetwork(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                objM8980constructorimpl = Result.m8980constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8983exceptionOrNullimpl(objM8980constructorimpl) != null) {
                getMediationNetwork("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            Result.m8979boximpl(objM8980constructorimpl);
        }
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    protected final void getMonetizationNetwork(Map<String, Object> map, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(map, "");
        super.getMonetizationNetwork(map, str);
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{this.toString.getPurchaseToken(), this.toString.getProductId()});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1tSDK();
                }
            }
        }
        map.put("purchase_token", this.toString.getPurchaseToken());
        map.put("product_id", this.toString.getProductId());
        map.put("purchase_type", this.toString.getPurchaseType().getValue());
        Map<String, String> map2 = this.hashCode;
        if (map2 != null && !map2.isEmpty()) {
            map.put("purchase_additional_details", this.hashCode);
        }
        String string = this.component2.getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        String str2 = string;
        map.put("custom_data", (str2 == null || str2.length() == 0) ? MapsKt.emptyMap() : AFj1bSDK.getMonetizationNetwork(new JSONObject(string)));
    }

    @Override // com.appsflyer.internal.AFe1jSDK
    public final AFd1hSDK<String> getRevenue(Map<String, Object> map, String str, String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i2 = AFa1ySDK.getRevenue[this.toString.getPurchaseType().ordinal()];
        if (i2 == 1) {
            return ((AFe1fSDK) this).component4.getCurrencyIso4217Code(map, str);
        }
        if (i2 == 2) {
            return ((AFe1fSDK) this).component4.getMonetizationNetwork(map, str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
