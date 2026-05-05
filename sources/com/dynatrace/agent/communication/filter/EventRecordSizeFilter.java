package com.dynatrace.agent.communication.filter;

import com.dynatrace.agent.storage.db.EventMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\"B\u0012\u007f\u0007t\tA0ZeP.XS2\u000fy\u0003<$a&wّQ٥J}P\b\u0010[wk|Jr\u000bq\u0010و\u001azp.WXA\u0017 \u0013JZ\u007fGCS\u007f?I`#=3&B*H\u007f\u0015\u0003**v\u0017%\u0001qP<\u001c>H\t@b\u000f]\u0005H\u00194DP\u0005,e\u007fNdR3җƠ3#\tt\u000b}5kH\u0003]\u000fVTU\u0014%gN5N?M\u001b5U\u0013\u0007\u0001bm\touK\u000e\u0001'U5ywe6p\u007fB\u0016q˽ոar,iU]n\f?+}d\"ַ\u0010߭{z\u0004Ȟʆ\b\u001c"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001n\u001a5\\CH5\u0014/\u0015qp&\u0007a6[u\u0015KaN\r`Y\u0002=!g", "", "3me2_6IS\u0007\u0003\u0010^", "", "\nh]6g\u0005", "uH\u0018#", "4h[AX9-]#[~`\u0019|\u00079r~6", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u0016MR7j0-\u0011>", ";dc.W(MO", ";`g\u000fX(<]\"l~s,Y\u001d>e\u000e", "", "4h[AX9-]#[~`\u0019|\u00079r~6:>\u000b\u001f\u0011F\u0004\u00178\u000621W}\u001a3o\u00167\\=Hk;\u001e\u0011va", "4h[AX9\u001bgu\tyr\u001a\u0001\u001e/", "4h[AX9\u001bgu\tyr\u001a\u0001\u001e/$}2\u0004:\u007f+ C~\u001b8t%/U\u007f @|\u0010;MJ;gB\u001e", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventRecordSizeFilter {
    private final int envelopeSize;

    public EventRecordSizeFilter(int i2) {
        this.envelopeSize = i2;
    }

    public final List<EventMetadata> filterByBodySize$com_dynatrace_agent_release(List<EventMetadata> metadata, long j2, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (metadata.isEmpty()) {
            return metadata;
        }
        ArrayList arrayList = new ArrayList();
        for (EventMetadata eventMetadata : metadata) {
            i2 += eventMetadata.getEventSizeBytes() + 1;
            if (i2 - 1 > j2) {
                break;
            }
            arrayList.add(eventMetadata);
        }
        return arrayList;
    }

    public final Pair<List<EventMetadata>, List<EventMetadata>> filterTooBigRecords$com_dynatrace_agent_release(List<EventMetadata> metadata, long j2) {
        List<EventMetadata> listFilterByBodySize$com_dynatrace_agent_release;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (metadata.isEmpty()) {
            return new Pair<>(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        }
        List<EventMetadata> mutableList = CollectionsKt.toMutableList((Collection) metadata);
        ArrayList arrayList = new ArrayList();
        do {
            listFilterByBodySize$com_dynatrace_agent_release = filterByBodySize$com_dynatrace_agent_release(mutableList, j2, this.envelopeSize);
            if (listFilterByBodySize$com_dynatrace_agent_release.isEmpty()) {
                EventMetadata eventMetadata = (EventMetadata) CollectionsKt.first((List) mutableList);
                arrayList.add(eventMetadata);
                mutableList.remove(eventMetadata);
            }
            if (!listFilterByBodySize$com_dynatrace_agent_release.isEmpty()) {
                break;
            }
        } while (!mutableList.isEmpty());
        return new Pair<>(listFilterByBodySize$com_dynatrace_agent_release, arrayList);
    }
}
