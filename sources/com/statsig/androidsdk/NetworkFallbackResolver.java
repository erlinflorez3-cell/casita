package com.statsig.androidsdk;

import android.content.SharedPreferences;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{BGc$\bCCU(\u0005*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001j:U]ތe\u0012%2JģG3[oE9fu>\u0005.P*8\u007f\n\t\u001a8Q\u0018v\u0001MQÈ(ؓpphQMh\u0015\u001e \u0006V /\u001flk\\8`l\f=?'\u0011mZNUd݁\u0001M\u001bL\u001d5\u001b\by A?eGE)a\u0016\u001fR\nSKC\u007fR\u001dhU=sk\u0002nNZ\u0016\u0013C=\u007f\u0013k\u000b>^\u001bP\u000f\u001aW7]|cX\u001e*\bz*\u001fR\u0003< mHv?(\u0002 \u001cCv\u0003Sn[\u0012`R\u007f)oL\u0016S\n{JG7~Q\u0010QIRE\u0019\u001d\rL51r/nl\u000e\u000f)aƟ6ϼ0҅͘AH\\(\"\\{#\tj\u0012,\u00140u\u0012Ez?HG)EnQ#O\u007fH҉\u0003ђuݓ¾lSwr\u0011y0\u0010.7X+<^R\u0002\u001dk~f\t0\u001f`4T5\u00128\u0019.\u007f\u0010>7$>`\u007flw\u000fe]8G_jE~\u0007k<y\u007fӛqΉPүߧeR\u0005:\bap,pfpi<ljP:@Xl w*O^\u000e#2m\u007f23Z;_©Sɶ\u0002ٜնE|\u0017\t#\u0010\u001e)l3R\u0019\u001a(\u0003&\u0019P\u000b\u0003 k\u0007tD|\u000f-]E_a1&\u00044/ؗ;ʶ\u0006Ѩ\u0381\u0004Guy\u0018Xz\u001d\u000eU*(l֠;ֺ3=\u001bÁOA@\u000bEQ\\tuQ{\u001d7|\ry=G\u00178>ŐlҔ0`r\u07ba `%\"\u000f^!$^۰\u0002\u05fbeF\u0003ò4n\u0019hVW\u0003\u0005i<|C\r\u0007/\u001eS\u000f\u0006!+?\u0004ρ3ޗ\u001aw\u001c٬emkx\b.(reձvФ\b,kܞ@n__J;fL0˝@ѐ(l\u000bܩ\u0019v\u0006\fZ\tb\u0012\nǨCяtV@ԇߕ/\u007fn\u00072$\u0086Z\n"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`0o\u001dN\u00012;:y'>j\u0012,S0;y>%&hn\u000f", "", "3qa<e\tHc\"}vk@", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'|\u001bF\u0004\u0002?i\u0007\u001f3z*\u0004", "AgP?X+)`\u0019\u007fzk,\u0006\u0007/s", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "AsPAf0@A\u0017\t\u0006^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001bI\u00012\u0012c\u000e)6i#B#*7t3+\u001fl`\u0003\u0005m5]v0V\u0016</X_r<~\u001fZ\u000fN8\r\u000eWA2D+=)\u00173M\u000bN2~\u0016#\u0018EytKV\u001e\u0011W\u001f\u0003K9wJb_gEKPb\u007f(|", "2hb=T;<V\u0019\fek6\u000e\r.e\r", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u001bF\u000749b}~;{!*\\A>kA\t\"rr=\u0006c9$", "2mb\u001eh,Kgv\t\u0005e+\u0007\u001b8s", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'x\rG\u0001)>hS", "", "4`[9U(<Y|\b{h", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(k\u0015Cs!3_a)8wu7\\POA", "5r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", "5dc\u000eV;Bd\u0019_ve3y\u0005-ko5\u0003!\u000e!\u001f/o\u0016F\u00049", "", "Cq[\u0010b5?W\u001b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`7|\u0015\u001a\u0001.6]\u007fu", "7mXA\\(EW.~[Z3\u0004\u0006+c\u0006\f\u0005A\u000b", "", ">hR8A,P4\u0015\u0006\u0002[(z\u000f\u001fr\u0007", "1ta?X5M4\u0015\u0006\u0002[(z\u000f\u0013n\u00012", "Cq[@", "", "@dP19(EZ\u0016zxd\u0010\u0006\n9F\r2\u0004\u001e|\u0015\u001aG", "Bqh\u000fh4I3,\n~k@k\r7e", "AcZ\u0018X@", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\u000e\"o?C\u0010d0PL\u000eMV]3`[<;\u001e\u001fd\u001e]/\u0016\u0005g\u000b\u0002xMF#\u0011<E\u0011?r\naYt:f\u0002> \u0017C\u0003\u0017?+&mFWnO", "Bqh\u0013X;<Vyz\u0002e)x\u00075U\r/\n!\u000e!\u001f0o\u001dN\u00012;", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011_\u001bCT/>Z\u0002\"\rT\u001c8\\J?t}\u001c\u001fukI\u0016g5N\u0005p%VW;`[\u00039#\u0016d\u0017$ns\nUR 8K3(\nu3~@h~\u001bk", "Bqh\u0013X;<V\t\nyZ;|\b\u0010a\u0007/x<~\u001dzPp\u0018", "", "3qa<e\u0014>a'z|^", "Bh\\2W\u0016Nb", "6`b\u001bX;P]&\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\u000e\"o?C\u0010d0PL\u000eLH_(&YnF\u0016[H\u001d[/\u0016\u0007/6\u0019UJA.\u000f0RK9r\u000e\u0016&\u001d9spP mQ\u0003$yJ9dU]i\u0003\u001d\u0005,g&u\b)$XC<m}n\u001e\u001bf_\u0004", "Bqh$e0MSyz\u0002e)x\u00075I\t)\u0006/\u000bt\u0013Er\u000e", "7mU<", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u00062\u000bG\u0005 `Ey\u001bF\u000749b}.\u0001K 7\\GD{0-\u0019rj\u000fJJ1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$", "CoS.g,\u001fO \u0006wZ*\u0003l8f\n\u001a\u007fO\u0004\u007f\u0017Y_\u001bC", "3mS=b0Gb", "<df\"e3", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}}\u001eglC\u000bl;$],C]JucN{?]\u007fi\u001bR4\u000fZ@G.}K;(Q*S\u000fEx\u0010\u0010\u001f\u000eC4NL_\u001fK\u0003%qP-rO/#`L=V^sk\bh\u001f&$7)\u0014o(p", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class NetworkFallbackResolver {
    private final CoroutineDispatcherProvider dispatcherProvider;
    private final Map<Endpoint, Long> dnsQueryCooldowns;
    private final ErrorBoundary errorBoundary;
    private Map<Endpoint, FallbackInfoEntry> fallbackInfo;
    private final Gson gson;
    private final SharedPreferences sharedPreferences;
    private final CoroutineScope statsigScope;

    /* JADX INFO: renamed from: com.statsig.androidsdk.NetworkFallbackResolver$getActiveFallbackUrlFromMemory$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkFallbackResolver.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkFallbackResolver networkFallbackResolver = NetworkFallbackResolver.this;
                this.label = 1;
                if (networkFallbackResolver.tryWriteFallbackInfoToCache(networkFallbackResolver.fallbackInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.NetworkFallbackResolver$tryFetchFallbackUrlsFromNetwork$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11881 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11881(Continuation<? super C11881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkFallbackResolver.this.tryFetchFallbackUrlsFromNetwork(null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C11891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11891(Continuation<? super C11891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkFallbackResolver.this.tryFetchUpdatedFallbackInfo(null, null, null, false, false, this);
        }
    }

    public NetworkFallbackResolver(ErrorBoundary errorBoundary, SharedPreferences sharedPreferences, CoroutineScope statsigScope) {
        Intrinsics.checkNotNullParameter(errorBoundary, "errorBoundary");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(statsigScope, "statsigScope");
        this.errorBoundary = errorBoundary;
        this.sharedPreferences = sharedPreferences;
        this.statsigScope = statsigScope;
        this.dnsQueryCooldowns = new LinkedHashMap();
        this.gson = StatsigUtil.INSTANCE.getGson$android_sdk_release();
        this.dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
    }

    private final String pickNewFallbackUrl(FallbackInfoEntry fallbackInfoEntry, List<String> list) {
        if (list == null) {
            return null;
        }
        Set set = fallbackInfoEntry == null ? null : CollectionsKt.toSet(fallbackInfoEntry.getPrevious());
        if (set == null) {
            set = SetsKt.emptySet();
        }
        String url = fallbackInfoEntry == null ? null : fallbackInfoEntry.getUrl();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strRemoveSuffix = StringsKt.removeSuffix(it.next(), (CharSequence) RemoteSettings.FORWARD_SLASH_STRING);
            if (!set.contains(strRemoveSuffix) && !Intrinsics.areEqual(strRemoveSuffix, url)) {
                return strRemoveSuffix;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tryFetchFallbackUrlsFromNetwork(com.statsig.androidsdk.UrlConfig r17, kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r18) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.NetworkFallbackResolver.tryFetchFallbackUrlsFromNetwork(com.statsig.androidsdk.UrlConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object updateFallbackInfoWithNewUrl(String str, Endpoint endpoint, String str2, Continuation<? super Unit> continuation) {
        FallbackInfoEntry fallbackInfoEntry;
        FallbackInfoEntry fallbackInfoEntry2 = new FallbackInfoEntry(str2, null, new Date().getTime() + NetworkFallbackResolverKt.DEFAULT_TTL_MS, 2, null);
        Map<Endpoint, FallbackInfoEntry> map = this.fallbackInfo;
        String url = null;
        FallbackInfoEntry fallbackInfoEntry3 = map == null ? null : map.get(endpoint);
        if (fallbackInfoEntry3 != null) {
            Boxing.boxBoolean(fallbackInfoEntry2.getPrevious().addAll(fallbackInfoEntry3.getPrevious()));
        }
        if (fallbackInfoEntry2.getPrevious().size() > 10) {
            fallbackInfoEntry2.getPrevious().clear();
        }
        Map<Endpoint, FallbackInfoEntry> map2 = this.fallbackInfo;
        if (map2 != null && (fallbackInfoEntry = map2.get(endpoint)) != null) {
            url = fallbackInfoEntry.getUrl();
        }
        if (url != null) {
            Boxing.boxBoolean(fallbackInfoEntry2.getPrevious().add(url));
        }
        LinkedHashMap linkedHashMap = this.fallbackInfo;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(endpoint, fallbackInfoEntry2);
        Unit unit = Unit.INSTANCE;
        this.fallbackInfo = linkedHashMap;
        Object objTryWriteFallbackInfoToCache = tryWriteFallbackInfoToCache(linkedHashMap, continuation);
        return objTryWriteFallbackInfoToCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryWriteFallbackInfoToCache : Unit.INSTANCE;
    }

    public final String getActiveFallbackUrlFromMemory(UrlConfig urlConfig) {
        Intrinsics.checkNotNullParameter(urlConfig, "urlConfig");
        if (urlConfig.getCustomUrl() == null && urlConfig.getUserFallbackUrls() == null) {
            Map<Endpoint, FallbackInfoEntry> map = this.fallbackInfo;
            FallbackInfoEntry fallbackInfoEntry = map == null ? null : map.get(urlConfig.getEndpoint());
            if (fallbackInfoEntry != null && new Date().getTime() <= fallbackInfoEntry.getExpiryTime()) {
                return fallbackInfoEntry.getUrl();
            }
            Map<Endpoint, FallbackInfoEntry> map2 = this.fallbackInfo;
            if (map2 != null) {
                map2.remove(urlConfig.getEndpoint());
            }
            BuildersKt__Builders_commonKt.launch$default(this.statsigScope, this.dispatcherProvider.getIo(), null, new AnonymousClass1(null), 2, null);
        }
        return null;
    }

    public final void initializeFallbackInfo() {
        this.fallbackInfo = readFallbackInfoFromCache();
    }

    public final Map<Endpoint, FallbackInfoEntry> readFallbackInfoFromCache() {
        String strSyncGetFromSharedPrefs$android_sdk_release = StatsigUtil.INSTANCE.syncGetFromSharedPrefs$android_sdk_release(this.sharedPreferences, NetworkFallbackResolverKt.getFallbackInfoStorageKey());
        if (strSyncGetFromSharedPrefs$android_sdk_release == null) {
            return null;
        }
        try {
            return (Map) this.gson.fromJson(strSyncGetFromSharedPrefs$android_sdk_release, new TypeToken<Map<Endpoint, FallbackInfoEntry>>() { // from class: com.statsig.androidsdk.NetworkFallbackResolver$readFallbackInfoFromCache$mapType$1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object tryBumpExpiryTime(String str, UrlConfig urlConfig, Continuation<? super Unit> continuation) {
        Map<Endpoint, FallbackInfoEntry> mutableMap;
        Map<Endpoint, FallbackInfoEntry> map = this.fallbackInfo;
        Map<Endpoint, FallbackInfoEntry> map2 = null;
        FallbackInfoEntry fallbackInfoEntry = map == null ? null : map.get(urlConfig.getEndpoint());
        if (fallbackInfoEntry == null) {
            return Unit.INSTANCE;
        }
        fallbackInfoEntry.setExpiryTime(new Date().getTime() + NetworkFallbackResolverKt.DEFAULT_TTL_MS);
        Map<Endpoint, FallbackInfoEntry> map3 = this.fallbackInfo;
        if (map3 != null && (mutableMap = MapsKt.toMutableMap(map3)) != null) {
            mutableMap.put(urlConfig.getEndpoint(), fallbackInfoEntry);
            map2 = mutableMap;
        }
        Object objTryWriteFallbackInfoToCache = tryWriteFallbackInfoToCache(map2, continuation);
        return objTryWriteFallbackInfoToCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTryWriteFallbackInfoToCache : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0089 A[Catch: Exception -> 0x00b2, TryCatch #0 {Exception -> 0x00b2, blocks: (B:62:0x0033, B:66:0x004b, B:81:0x0080, B:82:0x0082, B:86:0x0093, B:88:0x0099, B:90:0x009e, B:85:0x0089, B:68:0x0052, B:70:0x0058, B:72:0x005d, B:74:0x0063, B:76:0x0069, B:80:0x007a), top: B:97:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0099 A[Catch: Exception -> 0x00b2, TryCatch #0 {Exception -> 0x00b2, blocks: (B:62:0x0033, B:66:0x004b, B:81:0x0080, B:82:0x0082, B:86:0x0093, B:88:0x0099, B:90:0x009e, B:85:0x0089, B:68:0x0052, B:70:0x0058, B:72:0x005d, B:74:0x0063, B:76:0x0069, B:80:0x007a), top: B:97:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009e A[Catch: Exception -> 0x00b2, TryCatch #0 {Exception -> 0x00b2, blocks: (B:62:0x0033, B:66:0x004b, B:81:0x0080, B:82:0x0082, B:86:0x0093, B:88:0x0099, B:90:0x009e, B:85:0x0089, B:68:0x0052, B:70:0x0058, B:72:0x005d, B:74:0x0063, B:76:0x0069, B:80:0x007a), top: B:97:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tryFetchUpdatedFallbackInfo(java.lang.String r11, com.statsig.androidsdk.UrlConfig r12, java.lang.String r13, boolean r14, boolean r15, kotlin.coroutines.Continuation<? super java.lang.Boolean> r16) {
        /*
            r10 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.statsig.androidsdk.NetworkFallbackResolver.C11891
            if (r0 == 0) goto L2d
            r6 = r3
            com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1 r6 = (com.statsig.androidsdk.NetworkFallbackResolver.C11891) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2d
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L1b:
            java.lang.Object r8 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r4 = 2
            r9 = 0
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 == r3) goto L3f
            if (r0 != r4) goto L37
            goto L33
        L2d:
            com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1 r6 = new com.statsig.androidsdk.NetworkFallbackResolver$tryFetchUpdatedFallbackInfo$1
            r6.<init>(r3)
            goto L1b
        L33:
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> Lb2
            goto Lb1
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3f:
            java.lang.Object r12 = r6.L$2
            com.statsig.androidsdk.UrlConfig r12 = (com.statsig.androidsdk.UrlConfig) r12
            java.lang.Object r11 = r6.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r7 = r6.L$0
            com.statsig.androidsdk.NetworkFallbackResolver r7 = (com.statsig.androidsdk.NetworkFallbackResolver) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Exception -> Lb2
            goto L80
        L4f:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r0 = com.statsig.androidsdk.NetworkFallbackResolverKt.isDomainFailure(r13, r14, r15)     // Catch: java.lang.Exception -> Lb2
            if (r0 != 0) goto L5d
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)     // Catch: java.lang.Exception -> Lb2
            return r0
        L5d:
            java.lang.String r0 = r12.getCustomUrl()     // Catch: java.lang.Exception -> Lb2
            if (r0 != 0) goto L7a
            java.util.List r0 = r12.getUserFallbackUrls()     // Catch: java.lang.Exception -> Lb2
            if (r0 != 0) goto L7a
            r6.L$0 = r10     // Catch: java.lang.Exception -> Lb2
            r6.L$1 = r11     // Catch: java.lang.Exception -> Lb2
            r6.L$2 = r12     // Catch: java.lang.Exception -> Lb2
            r6.label = r3     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r8 = r10.tryFetchFallbackUrlsFromNetwork(r12, r6)     // Catch: java.lang.Exception -> Lb2
            if (r8 != r5) goto L78
            return r5
        L78:
            r7 = r10
            goto L80
        L7a:
            java.util.List r8 = r12.getUserFallbackUrls()     // Catch: java.lang.Exception -> Lb2
            r7 = r10
            goto L82
        L80:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> Lb2
        L82:
            java.util.Map<com.statsig.androidsdk.Endpoint, com.statsig.androidsdk.FallbackInfoEntry> r1 = r7.fallbackInfo     // Catch: java.lang.Exception -> Lb2
            r2 = 0
            if (r1 != 0) goto L89
            r0 = r2
            goto L93
        L89:
            com.statsig.androidsdk.Endpoint r0 = r12.getEndpoint()     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> Lb2
            com.statsig.androidsdk.FallbackInfoEntry r0 = (com.statsig.androidsdk.FallbackInfoEntry) r0     // Catch: java.lang.Exception -> Lb2
        L93:
            java.lang.String r1 = r7.pickNewFallbackUrl(r0, r8)     // Catch: java.lang.Exception -> Lb2
            if (r1 != 0) goto L9e
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)     // Catch: java.lang.Exception -> Lb2
            return r0
        L9e:
            com.statsig.androidsdk.Endpoint r0 = r12.getEndpoint()     // Catch: java.lang.Exception -> Lb2
            r6.L$0 = r2     // Catch: java.lang.Exception -> Lb2
            r6.L$1 = r2     // Catch: java.lang.Exception -> Lb2
            r6.L$2 = r2     // Catch: java.lang.Exception -> Lb2
            r6.label = r4     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r0 = r7.updateFallbackInfoWithNewUrl(r11, r0, r1, r6)     // Catch: java.lang.Exception -> Lb2
            if (r0 != r5) goto Lb1
            return r5
        Lb1:
            r9 = r3
        Lb2:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.NetworkFallbackResolver.tryFetchUpdatedFallbackInfo(java.lang.String, com.statsig.androidsdk.UrlConfig, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object tryWriteFallbackInfoToCache(Map<Endpoint, FallbackInfoEntry> map, Continuation<? super Unit> continuation) {
        String fallbackInfoStorageKey = NetworkFallbackResolverKt.getFallbackInfoStorageKey();
        if (map == null || map.isEmpty()) {
            Object objRemoveFromSharedPrefs$android_sdk_release = StatsigUtil.INSTANCE.removeFromSharedPrefs$android_sdk_release(this.sharedPreferences, fallbackInfoStorageKey, continuation);
            return objRemoveFromSharedPrefs$android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRemoveFromSharedPrefs$android_sdk_release : Unit.INSTANCE;
        }
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPreferences;
        String json = this.gson.toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(info)");
        Object objSaveStringToSharedPrefs$android_sdk_release = statsigUtil.saveStringToSharedPrefs$android_sdk_release(sharedPreferences, fallbackInfoStorageKey, json, continuation);
        return objSaveStringToSharedPrefs$android_sdk_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveStringToSharedPrefs$android_sdk_release : Unit.INSTANCE;
    }
}
