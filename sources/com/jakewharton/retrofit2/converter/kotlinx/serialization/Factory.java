package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0Le^.Zݷ2\u000f\u0002{<řc$\u007fRCU(\u0017*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[yc܈%˰rom2\u000e\u0003M=ntN\u0005N32<\b\u0007\u0019\u001aXKǘzzQOTY>E\tFb\rS\u0006*\u0014\u0016>N\b4[\u0016TfLzeR/Q\f\u001aN\\1w8\rQ\u0013Ed';\u0003\u0010)[LEB--c\u0007\rQk?1K H5l55CI\"f|lÿ\u0018\u00159_U\u0015\u00017t\u0011ab\u001c'YasKV\u000f>v)\u0002=@\u0012\u0016\u001e'v7]&t\u001b&;\u0005vY?`\u0002\rN.\u0006\u0012:%3\u00183YHazЂe;'b\b\b\u0013\r6#/owſV\u05f8d\u0015#ƘH]?SX=vQ`Բ?ъ\bpj̣ø\bE"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&3n;#\u001cg\"$", "\u001aqTAe6?W(KD<6\u0006\u001a/r\u000f(\t~a\u0013\u0015Vy\u001bPL", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "Ada6T3Bh\u0019\f", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "uK^8[;M^fHb^+\u0001\u0005\u001ey\u000b(Q'~!\u001f\u0011t\nBv78U\u000b/Av_;MRHu5\"$5+7\u0011l=N\u00046GY\u00182fayA\u001d%$\u001cN8\u0011\u0001`E9jS;)\u0011u7\u0002Hl|\u0013\u001a#5wF\u0006G", "@d`BX:M0#}\u000f<6\u0006\u001a/r\u000f(\t", "\u001aqTAe6?W(KD<6\u0006\u001a/r\u000f(\t\u0016", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "Bx_2", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqjT\f\u0017l", ">`a.`,MS&Z\u0004g6\f\u0005>i\n1\n", "", "", ";dc5b+\u001a\\\"\t\nZ;\u0001\u00138s", "@dc?b-Bb", "\u001aqTAe6?W(KDK,\f\u00169f\u00047Q", "uKY.i(\bZ\u0015\b|(9|\n6e}7E/\u0015\"\u0017\u001detAr61#\u0005\u001c@o_*VLEz0-\u0019rj\u0003bl5X\u0006#VPX52HYB\u0010#VWU'\u0016\u0007#=-wNF\u001b\u00170S\u000b\u0005D\n\u0015 \u001d1ytL_e.\u0007\u0015\u0005N3iJh,C4ATo4e\u0010nr !G$#~#\u001cl_zSY]\u001a\u0004R\u0007vgTn", "@db=b5LSu\tyr\n\u0007\u0012@e\r7{M", "\u001anZ5g;I!bkzl7\u0007\u0012=e\\2zTV", "/m]<g(MW#\b\t", "uKY.i(\bZ\u0015\b|(9|\n6e}7E/\u0015\"\u0017\u001detAr61#\u0005\u001c@o_*VLEz0-\u0019rj\u0003bl5X\u0006#VPX529\u007f=#\u001fd\u000fR:YNFA3{N8#\u0017\u0002\rhHh\u0010\u0019 \u000f9y=\f4\u001aP\u000b\u0015\u0003P)u\u001c", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Factory extends Converter.Factory {
    private final MediaType contentType;
    private final Serializer serializer;

    public Factory(MediaType contentType, Serializer serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.contentType = contentType;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new SerializationStrategyConverter(this.contentType, this.serializer.serializer(type), this.serializer);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new DeserializationStrategyConverter(this.serializer.serializer(type), this.serializer);
    }
}
