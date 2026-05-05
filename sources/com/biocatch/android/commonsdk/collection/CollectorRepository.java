package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.collection.exceptions.CollectorNotFoundException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ReP.XU2\u000fy\u0018<řc$\u007fLCU }8ޛ\u007fN\u0016f/MҼ\u000fC\u001d\u0006^\u0005x1aU'cB\u0013@I\b?aQ8IGh\r63$b&F\u0003\u001d\u0001H-\u0011\u001a\u0005\u0005[Q\u001c\u0014@@\u001f>\u0001\u0018\u0016\u0011(\u001e\u001e>N\u000eN`uWNH\u001b`\u0003;1\u0011\u0002B|-\u00104\u000bT%F\u0003+]\u000fo\u001fCLG7%%\u0002\u0006\u0017Tk?1C ?[ؕ)ݳ/I{Ɏ͕\\\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[c'RV\\0k\\\u007fQi", "", "u(E", "1n[9X*M]&\r", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "/cS", "", "1n[9X*M]&", "5dc", "1n[9X*M]&bY", "5dc\u000e_3", "", "6`b", "", "@d\\<i,", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CollectorRepository {
    private final ConcurrentHashMap<CollectorID, Collector> collectors = new ConcurrentHashMap<>();

    public final void add(Collector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.collectors.put(collector.getCollectorID(), collector);
    }

    public final Collector get(CollectorID collectorID) {
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        Collector collector = this.collectors.get(collectorID);
        if (collector != null) {
            return collector;
        }
        throw new CollectorNotFoundException("Collector " + collectorID + " not found");
    }

    public final Collection<Collector> getAll() {
        Collection<Collector> collectionValues = this.collectors.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "this.collectors.values");
        return collectionValues;
    }

    public final boolean has(CollectorID collectorID) {
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        return this.collectors.containsKey(collectorID);
    }

    public final void remove(Collector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.collectors.remove(collector.getCollectorID());
    }
}
