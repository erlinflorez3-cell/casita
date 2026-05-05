package com.biocatch.client.android.sdk.events;

import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.core.performance.PerfCounter;
import com.biocatch.android.commonsdk.events.ConfigurationLoadedEvent;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.collection.CollectorsController;
import com.biocatch.client.android.sdk.collection.SensorGateKeeper;
import com.biocatch.client.android.sdk.core.SystemBootstrapper;
import com.biocatch.client.android.sdk.core.lifecycle.State;
import com.biocatch.client.android.sdk.core.lifecycle.StateService;
import com.biocatch.client.android.sdk.web.IWebViewService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~j4Icxe\u0012\u00152HģU\u074c}uM;ptd\u0005N1b{\n\t\u000f\u001bBH>x\u000bGY\u000f*0ntJV\u001bR\u001d\u001a@\fN$\u000f%tg|>XpkCG#1sRR5jH|{\u0019VX5\u001a\u000faL9P;C$=S1\u0017қ_?\u0011P:K\u0013z?'Y\\$[Dl\u0018\u0014C+\u0016\".~4e\u001dQ\u000f\u0016}ˆQӍOP\u0016ߊH\u0007\n\u0010T\u0004<\n}Ρ0ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001XXP0d\u0019Ș|ˋ:\u0017-Į\u00047G(~Q\u0010Io\u05ce9߉\t\r&ŀQz/bl\u000e\u000f\u001dqƛyΦ5QH׀\u0019Z\u0018ZUm2r9̦,˙4G\b\u07fcL\u001d<&=7\nIyܬmɘLDoϸUlv^\u0002RvLxÅ\u0018֖.\t\u0014ɮ֎h\u001a"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0019u=\u001f\u0019jqF\u0003r0X\u007f\u000eQHM,[2\u0004=\u001d!=\nW*\u0014\u0005f\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#}17v%<\u0017!Et5\"\u0017xn5\u0016g6W]1CKN+<crF#g", "AxbAX4\u001b]#\u000e\tm9x\u0014:e\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w;WIz4&qrkH\u0015r9J\u00022GY$", "1n[9X*M]&\rXh5\f\u00169l\u0007(\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u00045%VW;i\\yD\u0014\u001f0", ">da366N\\(~\b", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_9MP<uA&\u0011q_9PN,[w\u0005Q\\W;\\_H", "AsPAX\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v\u0015GY_0ZRH", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "EdQ#\\,PA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'VaF\u0018g*NL", "Ad]@b9 O(~`^,\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u00171OyC\u001e\u001dEkC\u0016q;[r2RL[\u0002CP|E]\u000f^\u0018L'\u001c\u0003\\\u000b\"uH7(\u0017uE\u000b:u\u000b\u0010\u0015WCiv\fT\u001aN\u0001\u0015sP-rO#=\u0004NHE`9n\u0019mzfCI1\u001ex \u001bu&\u0015\b\u0006[ZoV\u0004ecV\u0017}\u0002 GlhPIn\u001f:~/'U\u0005\u0006\u00118\"r5\u0002-M?*Ce\u000fXo\u0014G\\x^\u0017\\N(\u0004@L\u001cNKpKS<\u0018ph^\f\u0018`1@\u0017h/aO\u0013\u0007f&%1j^\u000eAV\u0005\bWn\u001bpD\tO[C\u001c\r\b$kyGJ\u001b\u001en)lS\"M\u0011\u0010\u0014j\u0016\u001c\u0004|;c\u00172'cAK\u000f\u0018f;Uy`G\u0015yWYiTqhas#\u007f\u0007\u0010Oj0G:|RLnYr0~\u0011~&rWB\u0007G\u0017#%\u0013@6lhx\bk] \u0015v6\u001fh+8\u0006RI}(s0\u0014\u000b\u0018l{^k=>KEAF4\u0006.cHu@Zd},Z&3^tk)Y}=\u0014k\u0012\n\u0002'\b\u0011\u001fu$|K\u001fp*xb\u0015\u000b\u0017y!.d\u000fWT_K\u001duOH\u0018\r_9\u000eY\u0010Fq#V\u000e\u000b?IN.v\u001f>\b\u000b*l0b?C`>\u0005\u001f\u001dP\u0010\tQL\u0010\u001eR%_\u0015CuvV7kZ0\u000bz = [;^@\u001c(\u0007YNw5qTw\u0019h($\u0002=wt|<Aky\u001b1LoZ", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ConfigurationLoadedEventHandler implements IEventHandler<ConfigurationLoadedEvent> {
    private final BackendService backendService;
    private final CollectorsController collectorsController;
    private final PerfCounter perfCounter;
    private final SensorGateKeeper sensorGateKeeper;
    private final StateService stateService;
    private final SystemBootstrapper systemBootstrapper;
    private final TextMaskingService textMaskingService;
    private final IWebViewService webViewService;

    public ConfigurationLoadedEventHandler(SystemBootstrapper systemBootstrapper, CollectorsController collectorsController, PerfCounter perfCounter, StateService stateService, BackendService backendService, IWebViewService webViewService, SensorGateKeeper sensorGateKeeper, TextMaskingService textMaskingService) {
        Intrinsics.checkNotNullParameter(systemBootstrapper, "systemBootstrapper");
        Intrinsics.checkNotNullParameter(collectorsController, "collectorsController");
        Intrinsics.checkNotNullParameter(perfCounter, "perfCounter");
        Intrinsics.checkNotNullParameter(stateService, "stateService");
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        Intrinsics.checkNotNullParameter(webViewService, "webViewService");
        Intrinsics.checkNotNullParameter(sensorGateKeeper, "sensorGateKeeper");
        Intrinsics.checkNotNullParameter(textMaskingService, "textMaskingService");
        this.systemBootstrapper = systemBootstrapper;
        this.collectorsController = collectorsController;
        this.perfCounter = perfCounter;
        this.stateService = stateService;
        this.backendService = backendService;
        this.webViewService = webViewService;
        this.sensorGateKeeper = sensorGateKeeper;
        this.textMaskingService = textMaskingService;
    }

    @Override // com.biocatch.client.android.sdk.events.IEventHandler
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handle(ConfigurationLoadedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.Companion companion = Log.Companion;
        companion.getLogger().info("Configurations were loaded from the server.");
        this.perfCounter.stopCounter("timeTillServerConfig");
        if (!event.isSDKEnabled()) {
            companion.getLogger().warning("SDK is disabled by configuration, stopping...");
            this.systemBootstrapper.stop();
            return;
        }
        this.collectorsController.onConfigurationLoaded();
        this.textMaskingService.configure();
        this.webViewService.updateHybridSolution();
        this.sensorGateKeeper.configure();
        this.backendService.startDispatchers();
        this.stateService.updateState(State.STARTED);
        companion.getLogger().info("Successfully configured system");
    }
}
