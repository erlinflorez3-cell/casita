package com.biocatch.client.android.sdk.contract.externalCollectors.group;

import com.biocatch.android.commonsdk.collection.collectors.Collector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u0006\u0013nj?2LeV7Zݷ2\u000f\u0002{<$a&wgQ٥J}P\b\u0010gwk|Jr\u000bq\u0010\u0016 \u0007lDOezm\u0012=6prУ7M}B\u0002r\u0003>\u001d `+h\u0004\u0013\u000b20X\u0012\u0007zqV:\u0015xT~Fj\r{\u000eJ\u001c\u0014H8\u0007.^wNdS\u001b`\u0001/k\u0017wOf'\u000e9-W\u001bPl-\u001dxq\u001eYKe8[I\u001c\u0017\u0015`s?1H\"G\u0013r?-;K\u0004Wdc.\u0017[- \u001fkt>b\u0015Sp\fU/}f\"ַ\u0010߭{z\u0004Ȟ\r\u0013\u001c\u0006?H\\.բj\u000e\u0016ޗ\rtYF^\t\u07b2F\u000f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\b\u000bffK4y\u001a", "", "5q^Bc\u001bR^\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\r\u001a\u000fiL\u0013\u0003O7t", "5q^Bc\nHZ ~xm6\n\u0017", "", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001f=Z?9z}\u001e(waF\u0010_3,\u0001.NLL;f_\u0001\u0007\u0016\u001fd\u001eYtn\u0012cQ/]XB\u001f]\u0013N}LdJ\u001c%\u0012<4WFd\u001f\u001d=\u0006", "5dc\u0014e6N^\b\u0013\u0006^", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0015{p9\u0014l(UT1NSN*k\\\u007fK]\u0014g\u0018^6VffK4y3K*\b\u0002", "7r09_\u000eK])\nZq0\u000b\u0018", "", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "7r09_\u000eK])\nbb:\u000b\r8g", "7r6?b<I3,\u0003\tm", "7r6?b<ID\u0015\u0006~]", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class BcGroup {
    private final List<String> groupCollectors;
    private final GroupType groupType;

    public BcGroup(GroupType groupType, List<String> groupCollectors) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(groupCollectors, "groupCollectors");
        this.groupType = groupType;
        this.groupCollectors = groupCollectors;
    }

    private final boolean isAllGroupMissing(List<? extends Collector> list) {
        List<String> list2 = this.groupCollectors;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String str : list2) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Collector) it.next()).getCollectorID().getGroupName());
                }
                if (arrayList.contains(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final GroupType getGroupType() {
        return this.groupType;
    }

    public final boolean isAllGroupExist(List<? extends Collector> externalCollectors) {
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(externalCollectors, 10));
        Iterator<T> it = externalCollectors.iterator();
        while (it.hasNext()) {
            arrayList.add(((Collector) it.next()).getCollectorID().getGroupName());
        }
        return arrayList.containsAll(this.groupCollectors);
    }

    public abstract boolean isGroupExist(List<? extends Collector> list);

    protected final boolean isGroupValid(List<? extends Collector> externalCollectors) {
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        return isAllGroupMissing(externalCollectors) || isAllGroupExist(externalCollectors);
    }
}
