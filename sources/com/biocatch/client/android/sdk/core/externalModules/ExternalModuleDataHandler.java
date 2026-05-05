package com.biocatch.client.android.sdk.core.externalModules;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.client.android.sdk.web.GroupNameToCollectorIDMapper;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.`_2şs{J$cҕwّQ٥J}P\b\u0010awk|Jr\u000bq\u0010\u0016\u001a\u0007lDI\u0004{ٕ\u0016\u000f@F8SAR\b=gf%:\u0013'J\"f\u00025\u0005(3`\u0010%\u0005\u0014W\u001a\u0012H@\u001f;)ҋOŋ\u001e\u0012\u000ēp\r,^\u007fNdKCҚ<ǥ'\u0003qĩĠ+j"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+k\u0001h=\u0007jM6&\b9\u001f", "", "2`c.D<>c\u0019lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "5q^Bc\u0015:[\u0019m\u0005<6\u0004\u0010/c\u000f2\t$_~\u0013Rz\u000eI", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0010ZMKv\u001d\u001a\u001dhPCdm3Uv%VV[\u0010;:nH\u001f\u0012gc", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=gsdp5rs,^v\u0015GY_0ZRH$\u0012\u001cbWK/\u0017\u0003UP\"q\u000e5&\f,R\u0011\u0005d\n\u000b#\u00189i:PU\u0016\u0011\f\u0015r\u000b\u000buPijbCIEQ4B\u0016f$\\8I.!Uw\u0003d[9\n\t)Tc", "6`]1_,\u001ef(~\bg(\u0004p9d\u0010/{(\u0001%%Cq\u000e", "", ";rV!l7>", "", "1n[9X*MW#\b^m,\u0005", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExternalModuleDataHandler {
    private final DataQueueService dataQueueService;
    private final GroupNameToCollectorIDMapper groupNameToCollectorIDMapper;

    public ExternalModuleDataHandler(DataQueueService dataQueueService, GroupNameToCollectorIDMapper groupNameToCollectorIDMapper) {
        Intrinsics.checkNotNullParameter(dataQueueService, "dataQueueService");
        Intrinsics.checkNotNullParameter(groupNameToCollectorIDMapper, "groupNameToCollectorIDMapper");
        this.dataQueueService = dataQueueService;
        this.groupNameToCollectorIDMapper = groupNameToCollectorIDMapper;
    }

    public final void handleExternalModuleMessage(String msgType, CollectionItem collectionItem) {
        Intrinsics.checkNotNullParameter(msgType, "msgType");
        Intrinsics.checkNotNullParameter(collectionItem, "collectionItem");
        this.dataQueueService.append(this.groupNameToCollectorIDMapper.getCollectorID(msgType), collectionItem);
    }
}
