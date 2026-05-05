package com.statsig.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import cz.msebera.android.httpclient.HttpStatus;
import io.sentry.HttpStatusCodeRange;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!,u\bDJg|\u0004O\r8é6B\r(4\u0012}\u0010njGCLeN5ZS@\u000fsڔ<$q$yCAU\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cUoS9hҚNK.O:8(#1\u001e8g(v)c{\u0010 QXphQ=Q\u0013<*\u0006lC1\"j\ff6v\u0012\u000e>=I\u001bipuWc>%e\rt}W\u0011\u0005\f6+nbe\u00193\u007f\u001b\u0007\u0001\t\u0006š_}Kݛ\u0001'U* ֘*͏\\\u007f\u001cƃK[\u001b]\u000b&\u000b\u0004(ӣ^ˏ/Ok֟p\u001a6x\u0013{;;Z\u05fdXόL.5Կ\u0007\u0014\u001c5\rr\u0002?'؟1۰\u0004ziا71\u000e6C9Ie(Ĩ\u000eϭR7\u0004˜-*1\u0005\u0007!\nSd֮gôXwYĸqLKMf\n\bCDՑCĊ\u0006*\f\u0382g\f=\u0003).E-\u000eن\f؝%k\n҆ds\u0005\u000exh\u0002h)̵\u0013̱r\u0016?ѧ)\u0018hN|\u0005\u001aX+Г~ҭQ\u001c\\͵\u001e\u0014!+twj){Į!ћlirܔ}\u00163;~7\btBސYߍb3=ȡ\u0004\u001co_\u000f\u0014mD9ڶ+ڋFS\u0014ȗ|40@`j>\u007fRͬ!ܟ\u00172Gڤ<@:@1\\CNYٟ\u0015˩\u0001\tgʳ\t\u001c\rdK$1hzڒ[ɹT\\xב\b\u0005W=\u0015`P,\u0018ٞ\bԊ*U*ֻT\t1\u0019\u0017s.F>չ\u001aƥp\u0016}ɝ\u001c,$-QQ]QiÄ\u0001Ȟ6\u00025զl~sfe\u0012UySȭa³l.oō\u000b|:v\u0003J}SmǴI݈v#\u0010ۭ \u0006o]\u0013G\u0012Saϸ\u0011ϗv\u0003aߢnD\u000b\u001d7\u001eS\u007fFܵOީ1C/ݴ6\u0004\"H-a\fhFІLˏ\u0013&|Ё$8q0\bb\u007f\\\tձ\u000bա]~FЭDx\u0011]`j&\u0007\u0019މ\u0007٢7HIЬ\u0011bFi#/,e]\u0530_\u0080Z[Bܤ̳\u0002b"}, d2 = {"\u000fB2\u0012C\u001b86xZY>\u0019vn\u000fY", "", "\u000fB2\u0012C\u001b86xZY>\u0019vy\u000bLo\b", "\u0011N=!8\u0015-M\bre>&_h\u000bD_\u0015u&`\u000b", "\u0011N=!8\u0015-M\bre>&_h\u000bD_\u0015u1\\}\u0007'", "\u0014T;\u0019R\n!3vdhN\u0014", "\u0016@B\u0015", "\u0017M8!<\b%7\u000e^tK\fku#_\\\u0004Y&jww", "", "\u0017M8!<\b%7\u000e^tK\fku#_\\\u0004Y&jwwAW}#e\t @a\u007f$", "", "\u001a@B!R\u001a2<vxiB\u0014\\\u0003\u0010Ol\"k.`\u0004", "\u001aN6,8\u001d\u001e<\bxg>\u001bi|", "\u001b@G,<\u0015\"B|ZaB!\\\u0003\u001cEk\u0018[.o\u0005", "\u001b@G,?\u0016 M\u0004^gB\u0016[", "\u001b@G,?\u0016 M\u0006^fN\fjw\u001d_n\u0012u\u001e\\ty'", "\u001b@G,?\u0016 M\u0006^iK\u0010\\v", "\u001bH=,C\u0016%:|g\\X\u0010ew\u000fRp\u0004b:h\u0005", "\u001dE5\u0019<\u0015\u001eM\u007fh\\L&bh#_ps", "\u001eNB!", "\u001eQ4#<\u0016.A\u0013]ZK\u0010mh\u000e_`\f['_\u0005", " DC\u001fL&\u001c=w^h", "", "!H=\u00108&-7\u0001^", "!S0!F\u0010 Mti^X\u000f\\d\u000eEl\"a t", "!S0!F\u0010 Mve^>\u0015k\u0003\u001eIg\bu#`ru'\\\b\"V\u0019", "!S0!F\u0010 MxoZG\u001bvf\u0019Uh\u0017", "!S0!F\u0010 M\u0001^i:\u000bXw\u000b", "!S0!F\u0010 M\u0007]`X\u001bps\u000f_e\bo", "!S0!F\u0010 M\u0007]`X\u001d\\u\u001dIi\u0011u&`\u000b", "#R4\u001f", "!sPAf0@<\u0019\u000e\rh9\u0003", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4#", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "AcZ\u0018X@", "3qa<e\tHc\"}vk@", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'|\u001bF\u0004\u0002?i\u0007\u001f3z*\u0004", "AgP?X+)`\u0019\u007f\t", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "=oc6b5L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C\t/;w\u001f<#", "<dcDb9D4\u0015\u0006\u0002[(z\u000f\u001ce\u000e2\u0003Q\u0001$", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`0o\u001dN\u00012;:y'>j\u0012,S0;y>%&hn\u000f", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "As^?X", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u0018Ivz", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 2, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigNetworkKt {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String ACCEPT_HEADER_VALUE = "application/json";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CONTENT_TYPE_HEADER_VALUE = "application/json; charset=UTF-8";
    private static final String FULL_CHECKSUM = "full_checksum";
    private static final String HASH = "hash";
    private static final long INITIALIZE_RETRY_BACKOFF = 100;
    private static final int INITIALIZE_RETRY_BACKOFF_MULTIPLIER = 5;
    private static final String LAST_SYNC_TIME_FOR_USER = "lastSyncTimeForUser";
    private static final int LOG_EVENT_RETRY = 2;
    private static final int MAX_INITIALIZE_REQUESTS = 10;
    private static final int MAX_LOG_REQUESTS_TO_CACHE = 10;
    private static final int MAX_LOG_RETRIES = 3;
    private static final long MIN_POLLING_INTERVAL_MS = 60000;
    private static final String OFFLINE_LOGS_KEY_V1 = "StatsigNetwork.OFFLINE_LOGS";
    private static final String POST = "POST";
    private static final String PREVIOUS_DERIVED_FIELDS = "previousDerivedFields";
    private static final String SINCE_TIME = "sinceTime";
    private static final String STATSIG_API_HEADER_KEY = "STATSIG-API-KEY";
    private static final String STATSIG_CLIENT_TIME_HEADER_KEY = "STATSIG-CLIENT-TIME";
    private static final String STATSIG_EVENT_COUNT = "STATSIG-EVENT-COUNT";
    private static final String STATSIG_METADATA = "statsigMetadata";
    private static final String STATSIG_SDK_TYPE_KEY = "STATSIG-SDK-TYPE";
    private static final String STATSIG_SDK_VERSION_KEY = "STATSIG-SDK-VERSION";
    private static final String USER = "user";
    private static final int[] RETRY_CODES = {HttpStatus.SC_REQUEST_TIMEOUT, 500, 502, 503, 504, 522, 524, HttpStatusCodeRange.DEFAULT_MAX};
    private static final long MAX_LOG_PERIOD = TimeUnit.DAYS.toMillis(3);

    public static final StatsigNetwork StatsigNetwork(Context context, String sdkKey, ErrorBoundary errorBoundary, SharedPreferences sharedPrefs, StatsigOptions options, NetworkFallbackResolver networkFallbackResolver, CoroutineScope coroutineScope, Store store) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(errorBoundary, "errorBoundary");
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(networkFallbackResolver, "networkFallbackResolver");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(store, "store");
        return new StatsigNetworkImpl(context, sdkKey, errorBoundary, sharedPrefs, options, networkFallbackResolver, coroutineScope, store);
    }
}
