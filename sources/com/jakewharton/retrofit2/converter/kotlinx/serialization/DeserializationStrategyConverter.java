package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import okhttp3.ResponseBody;
import retrofit2.Converter;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JhN\u008chݷR\u0011qڔB#\f0\u0002EKUH~2\u000b_N.f\u001dJ\u001b$S\u0019\u0014\u0018\u0011p<Kex\u0014܈=5RsM7eok>žx6\u0013&z5F\u0001\u001d\u0001Pݒx\u0014\u0005\u0003[K:\u0013vT¤>R\u001bVU, \bV&\u0011 lg\u0005Ȥvo4ƀ1ݭ\u0007iJ÷wk>\u0001e\rtY}˜xҐ\"+Hʺ߷\u0019/"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&1rK\u0014\u001f^\nU/\"\u0001hE.w2F,\u0004;I\u0004OF\u000b\u0015'\u000eBypO,", "\"", "\u001aqTAe6?W(KD<6\u0006\u001a/r\u000f(\t\u0016", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", ":nP1X9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`uG}\u000eIz!<]\u0013\u001cFq 7;RHgC\u001e\u0017|7", "Ada6T3Bh\u0019\f", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `&o\u001c<\u0004)1`\u000253|\u001a8V1Jx0-\u0015ju\u000fma6V@,CRN>_N\u007fL\u001e\u001b$\u001bN:\u001a\u000fZE3;\u000e5)\u0011=I\u000fJh\u000eU\u001c\u0018DqtKiYUy\"y=0l[Un}QJ\u000fP*q\u0010[$`O:1i5\n", "1n]CX9M", "D`[BX", "uK^8[;M^fHg^:\b\u00138s\u007f\u0005\u0006?\u0015lZ.t\nMrn<U\u0007\"\u0001W\u00133MAJA", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DeserializationStrategyConverter<T> implements Converter<ResponseBody, T> {
    private final DeserializationStrategy<T> loader;
    private final Serializer serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationStrategyConverter(DeserializationStrategy<? extends T> loader, Serializer serializer) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.loader = loader;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (T) this.serializer.fromResponseBody(this.loader, value);
    }
}
