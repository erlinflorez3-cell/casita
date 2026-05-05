package com.ticnow.sdk.idnowsecurity.http.nodes;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u00051Bߚ(\u0007\u0015iy3ǲiH<R$B\u001dl\u00144R]zڕOтY&\u0006̝!QTjurj\\\u0011H\u001d\ff\u0011x3aU'_hƈ>ԲsK;ݹ\b??h\u0003:%\"8+F\u007fU\u0019(4`\u0010%|\u001až\u0018ܘ4Lxíj\u000fS\u0010(\u0016&@&\r,b8fDU\u0005]h1yɌuŌR3gܞ\u0015O\u0013Tb+-xg-9F\bM#5k\u00035T2α\u000fӭuI\rؒ?)1Z\u0002[VZ\u0006&#1̦\u0011p"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O=,$lpI\u0016g6Wd'ITN5k(", "", "u(E", "7c", "", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016W", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ";h]6`(E3\"\f\u0005e3j\u00079r\u00041}", "5dc\u001a\\5B[\u0015\u0006Zg9\u0007\u00106S}2\tD\n\u0019", "Adc\u001a\\5B[\u0015\u0006Zg9\u0007\u00106S}2\tD\n\u0019", ";h]6`(EB&z\u0004l(z\u00183o\t\u0016yJ\u000e\u001b I", "5dc\u001a\\5B[\u0015\u0006ik(\u0006\u0017+c\u000f,\u0006In\u0015!Ts\u0017>", "Adc\u001a\\5B[\u0015\u0006ik(\u0006\u0017+c\u000f,\u0006In\u0015!Ts\u0017>", "AdV:X5M1#}z", "5dc X.FS\"\u000eXh+|", "Adc X.FS\"\u000eXh+|", "AdV:X5M<\u0015\u0007z", "5dc X.FS\"\u000ecZ4|", "Adc X.FS\"\u000ecZ4|", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class InstitutionSegment {
    private String id = "";
    private String minimalEnrollScoring = "";
    private String minimalTransactionScoring = "";
    private String segmentCode = "";
    private String segmentName = "";

    public final String getId() {
        return this.id;
    }

    public final String getMinimalEnrollScoring() {
        return this.minimalEnrollScoring;
    }

    public final String getMinimalTransactionScoring() {
        return this.minimalTransactionScoring;
    }

    public final String getSegmentCode() {
        return this.segmentCode;
    }

    public final String getSegmentName() {
        return this.segmentName;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setMinimalEnrollScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minimalEnrollScoring = str;
    }

    public final void setMinimalTransactionScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minimalTransactionScoring = str;
    }

    public final void setSegmentCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.segmentCode = str;
    }

    public final void setSegmentName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.segmentName = str;
    }
}
