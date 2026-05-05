package com.ticnow.sdk.idnowsecurity.http.nodes;

import java.io.Serializable;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u00051Bߚ(\u0007\u0015iy3ǲiH<R$B\u001dl\u00144R]zڕOтY&\u0006̝!QTjurj\\\u0011H\u001d\ff\u0011x3aU'_hƈ>ԲsK;ݹ\b??h\u0003:%\"8+F\u007fU\u0019(4`\u0010%|\u001až\u0018ܘ4Lxíj\u000fS\u0010(\u0016&@&\r,b8fDU\u0005]h1yɌuŌR3gܞ\u0015O\u0013Tb+-xg-9F\bM#5k\u00035T2α\u000fӭuI\rؒ?)1Z\u0002[VZ\u0006&#1̦\u0011p"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005S4-\u0018r`\u0019\u0010p6U}|", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "7c", "", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0016W", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7mc2e5:Z\u0007\u000e\b", "5dc\u0016a;>`\"z\u0002L;\n", "Adc\u0016a;>`\"z\u0002L;\n", "<`\\2", "5dc\u001bT4>", "Adc\u001bT4>", ">`c55(<Y\u0019\by", "5dc\u001dT;A0\u0015|\u0001^5{", "Adc\u001dT;A0\u0015|\u0001^5{", "Bx_2", "5dc!l7>", "Adc!l7>", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class MethodEnroll implements Serializable {
    private String id = "";
    private String internalStr = "";
    private String name = "";
    private String pathBackend = "";
    private String type = "";

    public final String getId() {
        return this.id;
    }

    public final String getInternalStr() {
        return this.internalStr;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPathBackend() {
        return this.pathBackend;
    }

    public final String getType() {
        return this.type;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setInternalStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.internalStr = str;
    }

    public final void setName(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    public final void setPathBackend(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pathBackend = str;
    }

    public final void setType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.type = str;
    }
}
