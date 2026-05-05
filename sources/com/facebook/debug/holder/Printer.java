package com.facebook.debug.holder;

import com.facebook.debug.debugoverlay.model.DebugOverlayTag;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007tvAӄLeV=ZS0\u000fs{B-cҕw(Q٥J}P\b\u0018dug\u0007J\t\fs\u0013\u0014\u0018\u0011jZL\u0006|k\u0016'2pt\u0006W\u0016#K9xtd\u0006P60:\u0012\u0005/\u001dZL\u001ez\u0013Cy\u0011BDNvR\\\u001dS\u000b\u0019\"\bT\u001f/\u001d\u000bnn8^k\f9uGɨmB\\/(>\u000bV%F\u00031=zo C@e8[Iھ\u0002ޗѻ[C\u000bAw\\3gҐ+6ʟwV"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\b/b\u0010*EC\u000b\u001e\u0016G|W'\u0004)>h}-\r", "", ":nV\u001aX:LO\u001b~", "", "B`V", "\u001ab^:\"-:Q\u0019{\u0005h2F\b/b\u0010*E?\u0001\u0014'Iy\u001f<\u0004,1mG(Al\u00165\u0017\";hD ~yaF\u000e_@=r)\u001d", ";db@T.>", "", "/qV@", "", "uKR<`u?O\u0017~wh6\u0003R.e|8}\n\u007f\u0017\u0014Wq\u0018Mv2<U\u0012i?w\u0015.T\r\u001ak1.\u0017Rr9\u0014j(be#I\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D:\u001e$\u0004=EKBd\n\u000e_w2op@ee\u000bj", "Ag^B_+\u001dW'\n\u0002Z@c\u00131M\u007f6\n<\u0003\u0017", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface Printer {
    void logMessage(DebugOverlayTag debugOverlayTag, String str);

    void logMessage(DebugOverlayTag debugOverlayTag, String str, Object... objArr);

    boolean shouldDisplayLogMessage(DebugOverlayTag debugOverlayTag);
}
