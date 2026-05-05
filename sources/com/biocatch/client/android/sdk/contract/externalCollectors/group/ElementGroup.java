package com.biocatch.client.android.sdk.contract.externalCollectors.group;

import com.biocatch.android.commonsdk.collection.collectors.Collector;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r@4\u0012\u0006\u0013nj?0LeV7Zݷ2\u000f\u0002{<řqҕ\"CiTZ\u00172\r]N\u007fg\u001dKj\u0015Q\u0011\u001e\u001c\tl<I\u0004|\f\u0015Ƥ6B}D{a}CQ`#=5*@*P\u007f\u0015\u0003**v\u0019%}\n_ñ\u0016:"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\u000b\u0014\u0005aA-}&D)\u00187\u001f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\b\u000bffK4y\u001a", "5q^Bc\u001bR^\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\r\u001a\u000fiL\u0013\u0003O7t", "1n[9X*M]&\r\\k6\r\u0014", "", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001f=Z?9z}\u001e(waF\u0010_3,\u0001.NLL;f_\u0001\u0007\u0016\u001fd\u001eYtn\u0012cQ/]XB\u001f]\u0013N}LdJ\u001c%\u0012<4WFd\u001f\u001d=\u0006", "7r6?b<I3,\u0003\tm", "", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementGroup extends BcGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElementGroup(GroupType groupType, List<String> collectorsGroup) {
        super(groupType, collectorsGroup);
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(collectorsGroup, "collectorsGroup");
    }

    @Override // com.biocatch.client.android.sdk.contract.externalCollectors.group.BcGroup
    public boolean isGroupExist(List<? extends Collector> externalCollectors) {
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        return isGroupValid(externalCollectors);
    }
}
