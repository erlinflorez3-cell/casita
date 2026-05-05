package com.biocatch.client.android.sdk.backend.communication;

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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u000enj?5JΝHDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u0003\tHc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L&\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPU?_^~$μ\u0019ù+\r~ѭn7N?M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v0?+w}.̳+ÿ\u0018\u00153˽]i\u00011t\u0005\u007fbbʳ}յgKXʫx\u0004\t\b%<2\u0010\\ΰ\u001bͶ1\u001anڜ^?\u0003\u007fk@~\u00045۔Rѐe6\u001fӛP?9G3f\u007fc\u0012ϑ!Ѽ\u007f\u0005\u0015̔s\r|0sT<bkØ'ɐU1Y̵\u000eT\\\u001aq=\u001c\u0006GîTò\b0Oĉ¤\u007f\""}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*X5janF# 0", "", "u(E", "\u0012D5\u000eH\u0013-MzkdP\u001b_\u0003\u001aEl\"\\\u001cd}\u00074O", "", "\u0012D5\u000eH\u0013-M|gi>\u0019md\u0016_f\fc$o", "\u0012D5\u000eH\u0013-M\u0006^iK vl\u0018T_\u0015l\u001cg", "\u0012D5\u000eH\u0013-M\u0006^iK vq\u001fM", "\u001b@G,:\u0019(E\batI\fi\u0003\u0010Ac\u000fk-`", "\u001b@G,<\u0015-3\u0006oVE&cl\u0017In", "\u001b@G,?\u0016 M\u0001^hL\b^h\u001d_n\u0012u!g\u0007\u0005*", "\u001b@G,E\f*CxliX\u000b\\o\u000bY", "", "\u001b@G,E\f-@\rx^G\u001b\\u Af", "\u001b@G,E\f-@\rxcN\u0014", "\u001bH=,:\u0019(E\batI\fi\u0003\u0010Ac\u000fk-`", "\u001bH=,<\u0015-3\u0006oVE&cl\u0017In", "\u001bH=,E\f-@\rx^G\u001b\\u Af", "\u001bH=,E\f-@\rxcN\u0014", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Constants {
    public static final int DEFAULT_GROWTH_PER_FAILURE = 3500;
    public static final int DEFAULT_INTERVAL_LIMIT = 16000;
    public static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_RETRY_NUM = 5;
    public static final Constants INSTANCE = new Constants();
    public static final int MAX_GROWTH_PER_FAILURE = 10000;
    public static final int MAX_INTERVAL_LIMIT = 300000;
    public static final int MAX_LOG_MESSAGES_TO_FLUSH = 3;
    public static final long MAX_REQUEST_DELAY = 6000;
    public static final int MAX_RETRY_INTERVAL = 10000;
    public static final int MAX_RETRY_NUM = 1000;
    public static final int MIN_GROWTH_PER_FAILURE = 0;
    public static final int MIN_INTERVAL_LIMIT = 100;
    public static final int MIN_RETRY_INTERVAL = 100;
    public static final int MIN_RETRY_NUM = 1;

    private Constants() {
    }
}
