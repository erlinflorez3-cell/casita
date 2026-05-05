package com.dynatrace.agent.communication.protocol;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176B\u0005#4\u0012\u0006\rnj?4JΝHDɟ\u0004*=j<;*[ҸuEAU(~j\u0015]T\u007fg\u001dQ\u000b\u000fQ\u0017\u001e\u0016'qt\\c\u0002u\u0012=5rsM;eok@'Қȥ\t 8,\u0001\u0005\u0013\f2*v\u0013=ٙŲO\f\u0018<\u0011|HT%M3\u001dhâ\u0011ŋ\u0005\u001edɡ\u001fBVpu:]&Y݆\u0015Ě+_8ŧ\u001e\u0019TY?\r%dtѫ\u0013˝9\u0015-مα\u000b_"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#8\\M9u;gtyaB\u0016P,Z\u0007'U[.5mRyG\u001f\u00120", "", "\nh]6g\u0005", "u(E", "\u0012@C\u000eR\u001d\u001e@\u0007bdG&gu\u000fFc\u001b", "", "\u0013U4\u001bG\u001a8>\u0006^[B\u001f", "!T5\u0013<\u001f", "1`[0h3:b\u0019^\u0004o,\u0004\u0013:em,\u0011@", "", "2`c.I,Ka\u001d\t\u0004", "0tX9W\fGd\u0019\u0006\u0005i,_\t+d\u007f5", "0tX9W\fGd\u0019\u0006\u0005i,_\t+d\u007f5:>\u000b\u001f\u0011F\u0004\u00178\u000621W}\u001a3o\u00167\\=Hk;\u001e\u0011va", "5dc\u0012a=>Z#\nzL<}\n3x", "5dc\u0012a=>Z#\nzL<}\n3x>&\u0006Hz\u0016+Pk\u001dIr#5Sy\"7v%(ZCBk0,\u0015", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class EventRequestEnvelope {
    private static final String DATA_VERSION_PREFIX = "{\"data_version\":";
    private static final String EVENTS_PREFIX = ",\"data\":{\"events\":[";
    public static final EventRequestEnvelope INSTANCE = new EventRequestEnvelope();
    private static final String SUFFIX = "]}}";

    private EventRequestEnvelope() {
    }

    public final String buildEnvelopeHeader$com_dynatrace_agent_release(int i2) {
        return DATA_VERSION_PREFIX + i2 + EVENTS_PREFIX;
    }

    public final int calculateEnvelopeSize(int i2) {
        byte[] bytes = buildEnvelopeHeader$com_dynatrace_agent_release(i2).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int length = bytes.length;
        byte[] bytes2 = SUFFIX.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        return length + bytes2.length;
    }

    public final String getEnvelopeSuffix$com_dynatrace_agent_release() {
        return SUFFIX;
    }
}
