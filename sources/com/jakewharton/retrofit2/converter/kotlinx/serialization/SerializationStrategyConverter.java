package com.jakewharton.retrofit2.converter.kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import okhttp3.MediaType;
import okhttp3.RequestBody;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0012qڔJř\u0004&wّITJ\n2\u000b_N.f~Lj\u000bq\u00104\u00169\f<Mczu\u0012=5RyM7euM;ptlӌN72<\b\u000b\u0019\u001aXOǘzzQST%>I\t:\u0001\u000e}\t(\u001c\u001e>VҵdpʄR6Vw.F=%\u001bipQ}ۂ2ƊQ\rNÖw\u001f\u0005e61P9E\u0015[م1\f)¼AƄCqEݛ9351as\u0006=/ß\u0016Ʀ/O\u0015ƞğ*h"}, d2 = {"\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c'\u001c\tcJ\u0012}Q3.\b.]_Eq\u0012\f#\u001d5wF", "\"", "\u001aqTAe6?W(KD<6\u0006\u001a/r\u000f(\t\u0016", "\u001anZ5g;I!bkzj<|\u0017>B\n'\u0010\u0016", "1n]AX5MB-\nz", "\u001anZ5g;I!bfz]0xwCp\u007f}", "A`e2e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0005G|\u00128})JU\r$Av\u0004=Z?Jk62j", "Ada6T3Bh\u0019\f", "\u001ab^:\"1:Y\u0019\u0011}Z9\f\u00138/\r(\u000bM\u000b\u0018\u001bV<W:\u0001.FY\u000b/7z_4WRBo=1^vaF\u000b_3R\f#VPX5&@rJ\u0018\u000ea\u0012c+\u001aZ", "uK^8[;M^fHb^+\u0001\u0005\u001ey\u000b(Q'\u0007!&Ns\u0017O@35f\u0002\u001c>q+*\\GEt}\f\u0015ue5\u000egAJ\u0006+QU<;iN\u0002=\u0016&0tL5\u0015N^=*nV:\u001b\u0015;S\u000b\u0005u\u0001\u001b#\u00186n\u007f\u000f \u000eQ\u0003&uN8hS#e\u0004VHIk=.\u001a_*`6A()m(\u001frYww{`\u0015nY}|gTn>)", "1n]CX9M", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u000b\u001d\u001aV~\u0019\n@\u00125e\u000e E|r8LW\u0011", "@dc?b-BbeF\u0001h;\u0004\r8xG6{M\u0005\u0013\u001eK\u0005\nKz/>!{*@~\u0016;\\CH"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SerializationStrategyConverter<T> implements Converter<T, RequestBody> {
    private final MediaType contentType;
    private final SerializationStrategy<T> saver;
    private final Serializer serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public SerializationStrategyConverter(MediaType contentType, SerializationStrategy<? super T> saver, Serializer serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.contentType = contentType;
        this.saver = saver;
        this.serializer = serializer;
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t2) {
        return this.serializer.toRequestBody(this.contentType, this.saver, t2);
    }
}
