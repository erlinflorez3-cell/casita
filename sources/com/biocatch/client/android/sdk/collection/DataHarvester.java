package com.biocatch.client.android.sdk.collection;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.CollectionMode;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.CollectorRepository;
import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.backend.BackendService;
import com.biocatch.client.android.sdk.backend.DataItem;
import com.biocatch.client.android.sdk.techicalServices.SingleThreadExecutor;
import com.biocatch.client.android.sdk.techicalServices.Stopwatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCIa\"Ԃ*\t]Wo˧vJh\u000bK\u000f\f\u001a\u0001j:e]xs\u0012\u00172HqE\u074ccڎm9\u000fsv00608\u0012\u0005/\u001b:L\u001ex\u0013Cy\u000f\"4NtRR;R\u0015\u001e \fV /%lk\\>`l\fCǥ'\u0003wL\u0017-m?\u0015M;V\u001b'U|o/C@eE[%\u001c\t\u0015ds?1O8=Mn5:CI\"g|lH\u001a#?g\r\f\u0003l\\Men!?+}s{Z\u001c>\u0010\u0001\f\u000fL\u0004<\u001eU_t-bj\u0016'Kt!c\tT\u0010xZ\u007f)q~\u001b3\u001bK+g+7]oA1Ne\u0003[ٿ ţ\u0005n)ż%\u001an\u00193T&V\b҈BףLN\u0012ԯ\u000ey\u0012rz\u0002X\u0007\u0007ϝ\u0002\u009e\u007f\u00116ϏuCiA;!\u001a\u000b\u001fֶiЛ\t`pׅ:`VK:p,6X\u0015bɱP\u0081\tkXӹ)8\u001fZ4T5\f^ʹ,Ϣ{<)ط`Z]h\u0002j{^`ɛ1Ϭ;Yv\u0088\u07b6[U"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gsdp5i_9_v5VL[\u0002", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ah]4_,-V&~v]\f\u0010\t-u\u000f2\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001aR\u007f)NL=/iRn<s%Z\f^:\u0017\u0012/", "1n[9X*M]&kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[c'RV\\0k\\\u007fQi", "1n[9X*MW#\bXh5\f\u00169l\\2wM\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;R\u00010%VW;i\\y\u001a\u001e\u000eg\r$", "0`R8X5=A\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005H0\u001c\u001bhj8tc9_z%G\"", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iFm\u00141QA7r\"\u001e\"ye7\u0007qu<z0ISN\u001b__r9\u0013qm\u000eL;\u001c\u000ff\u0017\u000blN?h\u00050S\u007f7w~\u000f_\n>i}LZ\u000f\u0011w\u001f}I3qTXeCEKLi*b\u001bc'e\u0004\u0018.\u001bx\u0019\u0019wZ;v{^\u001b\u0001V\tqt[na6.F7XJOmQKr*hI\u0003{\u0012;g>'},\u0011>.5.\u0013Jma<h\u007f\u001c,ZP+0?\u0006pIRjujM\u0012r(?\u0012\u0017qB; Bo_U\u000e\\D\u0015e=+\\\u0005AP\u0002MGr^%M\u0003Bd\t^\u0005\u0010#zoMBdb\u007f :A\u001e]\u0017\u0003\feax*\u0014CY\u0018g\u0018_D^\u0017\u0007h\u000erycK^mL\u001akG\u0002YZ9 ?w\u001eS%2\u0015:\u0001ZKy\u0019$3\u0007T|'|jF{F !4AcA,>9\u0014hW$)t4+#7:nRKxl{6\u001f\u000b\">@\u0006", "4kd@[\u001aHc&|z", "", "7rBAT9MS\u0018", "", "1kT.e\rEc'\u0002hh<\n\u0007/", "", "6`aCX:M", "6`aCX:M<#\u0011", "@t]", "AbW2W<ES\u0002~\u000em\u000fx\u0016@e\u000e7", "Ad]17(MO", "2`c.", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "AsP?g", "As^=", "BqX4Z,K6\u0015\f\f^:\f", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataHarvester implements Runnable {
    private final BackendService backendService;
    private final CollectionControlBoard collectionControlBoard;
    private final CollectorRepository collectorRepository;
    private final ConfigurationRepository configurationRepository;
    private String flushSource;
    private boolean isStarted;
    private final SingleThreadExecutor singleThreadExecutor;

    public DataHarvester(SingleThreadExecutor singleThreadExecutor, CollectorRepository collectorRepository, CollectionControlBoard collectionControlBoard, BackendService backendService, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(singleThreadExecutor, "singleThreadExecutor");
        Intrinsics.checkNotNullParameter(collectorRepository, "collectorRepository");
        Intrinsics.checkNotNullParameter(collectionControlBoard, "collectionControlBoard");
        Intrinsics.checkNotNullParameter(backendService, "backendService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.singleThreadExecutor = singleThreadExecutor;
        this.collectorRepository = collectorRepository;
        this.collectionControlBoard = collectionControlBoard;
        this.backendService = backendService;
        this.configurationRepository = configurationRepository;
    }

    private final void clearFlushSource() {
        this.flushSource = null;
    }

    private final void harvest() {
        try {
            Stopwatch stopwatchStartNew = Stopwatch.Companion.startNew();
            ArrayList arrayList = new ArrayList();
            for (CollectorID collectorID : this.collectionControlBoard.getPending()) {
                try {
                    try {
                    } catch (Throwable th) {
                        if (collectorID.getCollectionMode() == CollectionMode.OncePerSession) {
                            this.collectionControlBoard.markCompleted(collectorID);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.Companion.getLogger().error("An error has occurred while collecting " + collectorID + ". Data was not collected.", e2);
                    if (collectorID.getCollectionMode() == CollectionMode.OncePerSession) {
                    }
                }
                if (this.collectorRepository.has(collectorID)) {
                    Collector collector = this.collectorRepository.get(collectorID);
                    Stopwatch stopwatchStartNew2 = Stopwatch.Companion.startNew();
                    Log.Companion companion = Log.Companion;
                    companion.getLogger().debug("Harvesting the " + collectorID + " data queue");
                    Collection<CollectionItem> collectionCollect = collector.collect();
                    if (collectionCollect != null) {
                        arrayList.add(new DataItem(collectionCollect, collector.getCollectorID().getGroupName()));
                        companion.getLogger().debug("Harvested " + collectionCollect.size() + " records of " + collectorID + " data type. Operation took " + stopwatchStartNew2.getMilliseconds() + " milliseconds.");
                        if (collectorID.getCollectionMode() == CollectionMode.OncePerSession) {
                            this.collectionControlBoard.markCompleted(collectorID);
                        }
                    } else if (collectorID.getCollectionMode() == CollectionMode.OncePerSession) {
                        this.collectionControlBoard.markCompleted(collectorID);
                    }
                } else if (collectorID.getCollectionMode() == CollectionMode.OncePerSession) {
                    this.collectionControlBoard.markCompleted(collectorID);
                }
            }
            Log.Companion.getLogger().debug("Harvesting operation took " + stopwatchStartNew.getMilliseconds() + " milliseconds.");
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                sendData(arrayList);
            } catch (Exception e3) {
                Log.Companion.getLogger().error("Failed harvesting data from collectors. Forwarding data for to backend failed.", e3);
            }
            if (this.isStarted) {
                scheduleNextHarvest();
            }
            clearFlushSource();
        } finally {
            if (this.isStarted) {
                scheduleNextHarvest();
            }
            clearFlushSource();
        }
    }

    private final void harvestNow() {
        if (this.flushSource == null) {
            this.flushSource = "sdk";
            this.singleThreadExecutor.runImmediately(this);
        }
    }

    private final void scheduleNextHarvest() {
        this.singleThreadExecutor.postDelayed(this, this.configurationRepository.getLong(ConfigurationFields.dataHarvesterInterval));
    }

    private final void sendData(Collection<DataItem> collection) throws JSONException, IOException {
        String str = this.flushSource;
        if (str == null) {
            this.backendService.sendData(collection);
            return;
        }
        BackendService backendService = this.backendService;
        Intrinsics.checkNotNull(str);
        backendService.sendFlushData(collection, str);
    }

    @Override // java.lang.Runnable
    public void run() {
        harvest();
    }

    public final void start() {
        if (this.isStarted) {
            return;
        }
        this.singleThreadExecutor.start();
        Log.Companion.getLogger().debug("Starting the data harvester");
        scheduleNextHarvest();
        this.isStarted = true;
    }

    public final void stop() {
        if (this.isStarted) {
            Log.Companion.getLogger().debug("Stop the data harvester");
            this.isStarted = false;
            harvestNow();
            this.singleThreadExecutor.stop();
        }
    }

    public final void triggerHarvest() {
        this.flushSource = "c";
        this.singleThreadExecutor.postDelayed(this, 0L);
    }
}
