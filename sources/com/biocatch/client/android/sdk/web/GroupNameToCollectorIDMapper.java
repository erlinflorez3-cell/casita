package com.biocatch.client.android.sdk.web;

import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.Group;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r.4\u0012\u000e\u0007nʑA0RnP.XT0ş\u0002ڔd$\n#2FтY\u001a\f\"Q[\\l\u007fnx`;G\u001d\r.x\u0019/\u0012a\u0007e*\u000f`F CAT\b=gcEN\u0013!J.H{\u0015\u0001H-X\u0012\u0007zqO:\u0014\u0007ώrĐV\rUĨܮ\u0016\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0010ZMKv\u001d\u001a\u001dhPCdm3Uv%VV[\u0010;:nH\u001f\u0012gc", "", "u(E", "5q^Bc\u0015:[\u0019m\u0005<6\u0004\u0010/c\u000f2\t$_~\u0013R", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "1n]AT0Ga", "", "5q^Bc\u0015:[\u0019", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class GroupNameToCollectorIDMapper {
    private final ConcurrentHashMap<String, CollectorID> groupNameToCollectorIDMap = new ConcurrentHashMap<>();

    public GroupNameToCollectorIDMapper() {
        for (CollectorID collectorID : CollectorID.values()) {
            if (!Intrinsics.areEqual(collectorID.getGroupName(), Group.STATIC) && !this.groupNameToCollectorIDMap.containsKey(collectorID.getGroupName())) {
                this.groupNameToCollectorIDMap.put(collectorID.getGroupName(), collectorID);
            }
        }
    }

    public final boolean contains(String groupName) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        return this.groupNameToCollectorIDMap.containsKey(groupName);
    }

    public final CollectorID getCollectorID(String groupName) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        CollectorID collectorID = this.groupNameToCollectorIDMap.get(groupName);
        if (collectorID != null) {
            return collectorID;
        }
        throw new InvalidOperationException("Unable to find groupName " + groupName + ". Unable to map to DataType");
    }
}
