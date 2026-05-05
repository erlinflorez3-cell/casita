package com.braze.ui.inappmessage.views;

import com.braze.enums.inappmessage.CropType;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r'4\u0012}\u000enjO0LeN.ZS8\u0018sڔ:\tqҕ\"CiTb\f0\tgN\u0016h\u001fNh\r[\u000f4\u0019?\u000ftoc|u\u0012=3rsM8eok<\u0011xD\u000b82P;*\t\u000f!BH>y+GY\u0014*0ns\u0001vU[\u0013#*\u0006l!1\"jqf6vo$^w3\u0011tZNU``\u0003[\u0019^V=\f%ndO\tEC#=S1\b\u0003_M\u0012Wqk\u0015/K߉*ɞ֘W:`\u0002\u001a4YNվa\u0004ͧ`\u0004"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hEA\u0003e,?z'Y\"", "", "Adc\u000ef7>Q(kvm0\u0007", "", "/r_2V;+O(\u0003\u0005", "", "Adc\u0010b9GS&\rgZ+\u0001\r\u001ax", "Bn_\u0019X-M", "Bn_\u001f\\.Ab", "0ncAb4%S\u001a\u000e", "0ncAb4+W\u001b\u0002\n", "Adc\u0010b9GS&\rgZ+\u0001\u0019=P\u0013", "1na;X9L@\u0015}~n:", "Adc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{\u001e\u000e!\"6\u0004\u0019<", "1q^=G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013f\b+&\u0002!.#", "Adc!b\u000f:Z\u001aivk,\u0006\u0018\u0012e\u0004*~O", "Adc!b\u000f:Z\u001aazb.\u007f\u0018", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessageImageView {
    void setAspectRatio(float f2);

    void setCornersRadiiPx(float f2, float f3, float f4, float f5);

    void setCornersRadiusPx(float f2);

    void setInAppMessageImageCropType(CropType cropType);

    void setToHalfParentHeight(boolean z2);
}
