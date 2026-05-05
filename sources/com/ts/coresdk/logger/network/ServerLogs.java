package com.ts.coresdk.logger.network;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ebLc\u000b\u0004I\u00066\u00126B\rӬ4\u0012\u0006\u0010nj?0LeV4ZS0\u000fs{B0c$wEA٧ \u0014̝9O|q(\u0002Zd\u0019J'\f&zz,wU'\\ܫ\u00134H\u0004MH\u0016\u0004K?xzF\u000702P8(\u0004Gʥ+Н\u0014x\u0001IY\u0010ZNNxRR;˟5&\u0018\u0006L'\u0019$li^6vl\f9uޒ\u0002ݦFP-g>\u0006\u0016%T`?\r%lN1N>M\u0017;R1\u0011\u0019Đ@ƄCsC\u0011v4o9W\u0003o6\u0007\u000eZǚ*̠\u0011_x5j\u0015\u001an\u001a9CO\u0012\\\u0017̃'Þ~}\u0013N\u0012!VEV3E v\n\u001e3#r\u0002?\u0007\u00075ە\u0002ѐe@\u001f'\u000649;3hWdI\u001d"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~G}-Hm#\u0015WEIA", "", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e` G~ F\u0004+~G}-Hm#\u0015WE\u001btC+)>", "1`", "\u001aiPCTuNb\u001d\u0006DE0\u000b\u0018\u0005", "5dc\u0019b.\u001e\\(\f~^:", "u(;7T=:\u001d)\u000e~euc\r=tU", ":nV\u0012a;KW\u0019\r", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000fyJ\t`&U9\fF\u0004%CX\u0004i>w\u00180MP\u0005t4-'rn?PQ,[\b'T3X.j(", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "", "BnBAe0GU", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\nh]6g\u0005", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ServerLogs {
    private final List<ServerLogEntry> ca;

    public ServerLogs(List<ServerLogEntry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ca = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerLogs copy$default(ServerLogs serverLogs, List list, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            list = serverLogs.ca;
        }
        return serverLogs.copy(list);
    }

    public final List<ServerLogEntry> component1() {
        return this.ca;
    }

    public final ServerLogs copy(List<ServerLogEntry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ServerLogs(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerLogs) && Intrinsics.areEqual(this.ca, ((ServerLogs) obj).ca);
    }

    public final List<ServerLogEntry> getLogEntries() {
        return this.ca;
    }

    public int hashCode() {
        return this.ca.hashCode();
    }

    public String toString() {
        return "ServerLogs(logEntries=" + this.ca + ")";
    }
}
