package com.biocatch.android.commonsdk.collection;

import com.biocatch.android.commonsdk.contract.exceptions.InvalidOperationException;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?1LeVJZS0\u000fs{J$cҕ\bّkUH|b\fҊRgun\u0013f\u0019H'\u0006D|\u001b0W[\u0011]@\u0012zL}FKS\u007f?I`#:3(z<F\u0003\u001d\u0001H.x\u0014\u0005\u0001[K:\u0015`J~Dj\u0013]\u0007*\u00124BN\fntuONT|_J/Q\u0006yD^'\u000e4+OcЂVܮ\u0011viӜґDC"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nc'RV\\0k\\\u007fQi", "", "u(E", "2`c.D<>c\u0019fvi", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "5dc", "1n[9X*M]&bY", "5dc\u000e_3", "", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class DataQueueRepository {
    private final ConcurrentHashMap<CollectorID, DataQueue> dataQueueMap = new ConcurrentHashMap<>();

    public final DataQueue get(CollectorID collectorID) throws InvalidOperationException {
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        DataQueue dataQueue = this.dataQueueMap.get(collectorID);
        if (dataQueue != null) {
            return dataQueue;
        }
        throw new InvalidOperationException("DataQueue for " + collectorID + " was not found", null, 2, null);
    }

    public final Collection<DataQueue> getAll() {
        Collection<DataQueue> collectionValues = this.dataQueueMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "this.dataQueueMap.values");
        return collectionValues;
    }

    public final DataQueue getOrPut(CollectorID collectorID, Function0<DataQueue> defaultValue) {
        DataQueue dataQueuePutIfAbsent;
        Intrinsics.checkNotNullParameter(collectorID, "collectorID");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        ConcurrentHashMap<CollectorID, DataQueue> concurrentHashMap = this.dataQueueMap;
        DataQueue dataQueueInvoke = concurrentHashMap.get(collectorID);
        if (dataQueueInvoke == null && (dataQueuePutIfAbsent = concurrentHashMap.putIfAbsent(collectorID, (dataQueueInvoke = defaultValue.invoke()))) != null) {
            dataQueueInvoke = dataQueuePutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(dataQueueInvoke, "this.dataQueueMap.getOrP…torID) { defaultValue() }");
        return dataQueueInvoke;
    }
}
