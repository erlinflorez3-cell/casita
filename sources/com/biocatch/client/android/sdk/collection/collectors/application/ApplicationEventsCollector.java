package com.biocatch.client.android.sdk.collection.collectors.application;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ApplicationMaximizedEvent;
import com.biocatch.client.android.sdk.events.ApplicationMinimizingEvent;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0010s{J$c$wDCU(\n*\tUOog|JbŏK\u000f\u001c\u0016\u0001jBI]xc\u0012\u00172XoG3SpCʠvҚf\u000b0428(\u0005/\u0019j[ z\tDc\f@2PtHU%M3\u001eŪ\n>.\u0006flu`NH\u001bpj51\u0017\u0002Dd&\u000eECRUVb9%v\u00101[FEI-'i\u00025h\"DKM\u007fT\u001dhU:[M\u0002oNX.-[+\u0018\u0013k\r>\\3d' o1]~cP<;>\u000fL\u001fJ\n&\u0006UOd\u0002pǨ\nԧ7x\u000bUFX\u0010g\u0013\u0012\tkN\u0017S\u000bi\u007f\u0010ӬhЂe?1P=\b\u0013\u001an/\u000fo9[\u0003\u00107ڀ\u001dƻ{Q9҅\u0011OV\\\"Yk|:E9̺,˙4K\u00181\u0002!<(uCi<;!\u001a\u0006\u001fֶiЛ\t`pׅ\u05c8Vd"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\fZ\u0002Dw\u000fi \u0015<jnQ`\u001d\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\fZ\u0002Dwh\u0016\u0015\u000e<@", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~fyAc\u001aKx^sK1pPbmxM\u000bCl7dUO,`AHyWb", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "6`]1_,", "", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0017v?%\u0019f]H\u000bm56r:KTRA\\QRN\u0014\u001bic", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0017v?%\u0019f]H\u000bm56z0KTRA`[t\u001d%\u0012c\u001d$", "=m0=c3BQ\u0015\u000e~h5\\\u001a/n\u000f", "/o_9\\*:b\u001d\t\u0004E6z\u0005>i\n1", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0013S\u007f7w\u0005\u0016\u001fc", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationEventsCollector extends ContinuousCollector<ApplicationEventModel> {
    private final EventBusService eventBusService;
    private final Utils utils;

    public ApplicationEventsCollector(EventBusService eventBusService, Utils utils) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.eventBusService = eventBusService;
        this.utils = utils;
    }

    private final void onApplicationEvent(ApplicationLocation applicationLocation) {
        try {
            long jCurrentTimeMillis = this.utils.currentTimeMillis();
            addToQueue(new ApplicationEventModel(getContextIDCache().get(), getCurrentEventId(), jCurrentTimeMillis, applicationLocation));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("An error has occurred while collecting application events", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.ApplicationEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isApplicationEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "applicationEvents";
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(ApplicationMaximizedEvent applicationMaximizedEvent) {
        onApplicationEvent(ApplicationLocation.FOREGROUND);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle(ApplicationMinimizingEvent applicationMinimizingEvent) {
        onApplicationEvent(ApplicationLocation.BACKGROUND);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Application events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Application events collector is already started. Aborting the start operation.");
        }
        this.eventBusService.subscribe(this);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.eventBusService.unsubscribe(this);
        setStarted(false);
    }
}
