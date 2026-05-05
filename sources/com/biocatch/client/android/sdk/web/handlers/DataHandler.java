package com.biocatch.client.android.sdk.web.handlers;

import android.webkit.WebView;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.collection.collectors.hybrid.WebViewEventModel;
import com.biocatch.client.android.sdk.web.GroupNameToCollectorIDMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCIa\"}(\nWNugvϺb\u000bY\u000f\u000e\u0016~j4Ic\u0002e\u0012\u00153HģU\u074ck\u0007m9\u000fsn\u00047rMH}\u0013\u00012*v\u0011\u0007~QM$\u0012^C\u0001>`\u0011e\u0005H\u0017\u0016B.\u00076\\\u0016UFLzeR/Q\fݦFN5ix\u0017[\u001c^TU\u001d'g,<X9K\u0014Se3\r`nW\u0005Upk\u0011/;o9W\bo6\u0007\u0015D\u00199e%]!2#\u0005\"l\u001a/CO\u0012T'ʮ*Þ~{\u0015ɝT\u001a\u0014+`.[\u001f=ڟ\u0010\u07baxr[ó!\u000elB\u0018z\u00107mӞ\u0002Ĵ/9#Ƙ\"mI\u001ff7*\fc̗%ъr!c٪^l#\u001dlw\u007f4(̸?˓R\naƝ>\u0016~m\u001a*2<}T\u0006ɜ\u0013ѧ\u001b)O]?0/yɞL\\"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2@5\u0016_\u000fJ\u007f&NL[\u0002", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2S9\u0004T0N\t\nCUM3\\_H", "2`c.D<>c\u0019lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "8r^;9(<b#\f\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "1n]AX?M7w\\v\\/|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", "5q^Bc\u0015:[\u0019m\u0005<6\u0004\u0010/c\u000f2\t$_~\u0013Rz\u000eI", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0010ZMKv\u001d\u001a\u001dhPCdm3Uv%VV[\u0010;:nH\u001f\u0012gc", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=gsdp5rs,^v\u0015GY_0ZRH$\u0012\u001cbWK/\u0017\u0003UP\"q\u000e3(\u00079S\u0006:2~\u0016\u001e\u0016?s~A\\YY\u0007\u0011\u0001L)uT#D\bQJ&^(s\u0016l12!8.\u001c;\u0016\u001frN*\u0019yVZn[xtqK\u0018D6.FueOSn[\u0006r1,KEu\u001c;gt>\u0004vg\u00124?s\u0005^v{\u001d<t\u0013/\\\u0017\u000e$@D\\<OmshM\fkh_\u000f\u0012b>@banbU\u0019\u000b\\`i4g)\u00137OO Vy%2/zJ[h\u001ff\u0011+teGR%adxX@-j\u0011\u0010XM\u0016&6_:]\u0019f&n5P\\\u0007o<\f\u0005h\r\u0011yG\u001dwOq%en*\u007fu\rG'3T;@/?m\u0016\u0016=\u007fx~*\u0005m@y\fV\u0016", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "6`]1_,&S'\rv`,", "", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", ";db@T.>2\u0015\u000ev", "7r8;i(EW\u0018]vm(", "", "2`c.", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataHandler implements WebViewHandler {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_DATA = "data";
    private static final String KEY_EVENT_NAME = "eventName";
    private static final String KEY_SLAVE_VERSION_CLIENT = "slave_version_client";
    private static final String KEY_STATIC_FIELDS = "static_fields";
    private final BackendService backendService;
    private final IContextIDCache contextIDCache;
    private final DataQueueService dataQueueService;
    private final GroupNameToCollectorIDMapper groupNameToCollectorIDMapper;
    private final JsonFactory jsonFactory;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005$2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓϴt@"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2@5\u0016_\u000fJ\u007f&NL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", "\u0019DH,7\b-/", "", "\u0019DH,8\u001d\u001e<\bxc:\u0014\\", "\u0019DH,F\u0013\u001aDxxk>\u0019jl\u0019Ny\u0006b$`\u007f\u0006", "\u0019DH,F\u001b\u001aB|\\t?\u0010\\o\u000eS", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DataHandler(DataQueueService dataQueueService, JsonFactory jsonFactory, IContextIDCache contextIDCache, GroupNameToCollectorIDMapper groupNameToCollectorIDMapper, BackendService backendService) {
        Intrinsics.checkNotNullParameter(dataQueueService, "dataQueueService");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(contextIDCache, "contextIDCache");
        Intrinsics.checkNotNullParameter(groupNameToCollectorIDMapper, "groupNameToCollectorIDMapper");
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        this.dataQueueService = dataQueueService;
        this.jsonFactory = jsonFactory;
        this.contextIDCache = contextIDCache;
        this.groupNameToCollectorIDMapper = groupNameToCollectorIDMapper;
        this.backendService = backendService;
    }

    private final boolean isInvalidData(String str) {
        return str.charAt(0) == '[';
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public String getName() {
        return "dataFromSlave";
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public void handleMessage(WebView webView, String str) {
        Log logger;
        StringBuilder sbAppend;
        if (str == null) {
            Log.Companion.getLogger().error("Received a data message with no data, from slave js.");
            return;
        }
        if (isInvalidData(str)) {
            return;
        }
        try {
            JSONObject json = this.jsonFactory.parseJson(str);
            if (json.has(KEY_EVENT_NAME) && json.has("data")) {
                String eventName = json.getString(KEY_EVENT_NAME);
                JSONArray data = json.getJSONArray("data");
                if (Intrinsics.areEqual(eventName, "static_fields") && data.length() >= 2 && Intrinsics.areEqual(data.get(0), KEY_SLAVE_VERSION_CLIENT)) {
                    this.backendService.setSlaveVersion(data.get(1).toString());
                }
                data.put(0, this.contextIDCache.get());
                GroupNameToCollectorIDMapper groupNameToCollectorIDMapper = this.groupNameToCollectorIDMapper;
                Intrinsics.checkNotNullExpressionValue(eventName, "eventName");
                if (groupNameToCollectorIDMapper.contains(eventName)) {
                    CollectorID collectorID = this.groupNameToCollectorIDMapper.getCollectorID(eventName);
                    DataQueueService dataQueueService = this.dataQueueService;
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    dataQueueService.append(collectorID, new WebViewEventModel(data));
                    return;
                }
                logger = Log.Companion.getLogger();
                sbAppend = new StringBuilder("Could not find feature for web event: ").append(eventName).append(". WebView event will be discarded.");
            } else {
                logger = Log.Companion.getLogger();
                sbAppend = new StringBuilder("missing parameters in WebView data: ").append(json).append(". WebView event will be discarded.");
            }
            logger.warning(sbAppend.toString());
        } catch (JSONException e2) {
            Log.Companion.getLogger().error("error parsing WebView data", e2);
        }
    }
}
