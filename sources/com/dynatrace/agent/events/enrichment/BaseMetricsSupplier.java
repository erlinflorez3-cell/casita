package com.dynatrace.agent.events.enrichment;

import kotlin.Metadata;
import kotlin.ranges.IntRange;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00176B\r(4\u0012}\rl\tOӄtev-\u0013X֖\u0013m\u000242\\l\u0003Q=m\u001c\u0014!7Rvg\u0016r\u0011ҙŲG\u000f\f\u001bA\u007f:Omzs\u0011=6jqU2{s\u0004ʠžx8\u000b'@*\u0001\r\u0013\n2,^\u000f%~kK:\u0016vϋ¤>T\u0013W\u0013%Ű\nJ"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017 7y4\u0006\u0015wn=\u0005q\u001a^\u00022NPN92", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017\u001fJzA\"\u0012xp9ts7Y}+GY$", "\nh]6g\u0005", "u(E", "Bn32i0<S\u0003\f~^5\f\u0005>i\n1", "", "", "Bn32i0<S\u0003\f~^5\f\u0005>i\n1:>\u000b\u001f\u0011F\u0004\u00178\u000621W}\u001a3o\u00167\\=Hk;\u001e\u0011va", "D`[6W\t:b(~\br\u0013|\u001a/li5dP\b\u001e", "D`[6W\t:b(~\br\u0013|\u001a/li5dP\b\u001eUEy\u00166u9>U\r-3k\u0016(IE;tC\u0018\"hh9\u0003q,", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004g\u001c\u0013XkWCr.7#a)Fm\u0018.Z\u0019", "D`[6W\u001a<`\u0019~\u0004=0\u0005\t8s\u00042\u0005*\u000e\u007f'Nv", "D`[6W\u001a<`\u0019~\u0004=0\u0005\t8s\u00042\u0005*\u000e\u007f'NvL:\u0001-/X\u0012)3|#*KC5g6\u001e\u001ew[F\u0007j,J\u0005'", "uH\u0018\u0019](OOb\u0006vg.Fl8t\u007f*{MV", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseMetricsSupplier implements AttributeSupplier {
    public final String toDeviceOrientation$com_dynatrace_agent_release(int i2) {
        if (i2 == 1) {
            return "portrait";
        }
        if (i2 != 2) {
            return null;
        }
        return "landscape";
    }

    public final Integer validBatteryLevelOrNull$com_dynatrace_agent_release(Integer num) {
        IntRange intRange = new IntRange(0, 100);
        if (num == null || !intRange.contains(num.intValue())) {
            return null;
        }
        return num;
    }

    public final Integer validScreenDimensionOrNull$com_dynatrace_agent_release(int i2) {
        if (i2 >= 0) {
            return Integer.valueOf(i2);
        }
        return null;
    }
}
