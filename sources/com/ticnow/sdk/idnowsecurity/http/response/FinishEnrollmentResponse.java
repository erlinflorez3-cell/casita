package com.ticnow.sdk.idnowsecurity.http.response;

import com.google.gson.Gson;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u00052Bߚ(\u0007\u0015iy3ǲiH<R\u001c.\u001d~\u00144R]t\nQ<m\u001a,$_ѮZ˗kzRҙ#E\u0015\t$|\u000b.OZ\u0007cb'@I\b?aOFސEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014c\u001a\u001cH@\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$guRVJriH5s\u001bwOf'\u000e2Sո\u0019ТX3\u0015Ǹy 1NE95'Y\u0012\u0015X,W\u0011O\n=3j}ݗ7ʁwc>ݙ\u0018\u0016\u001b<]\u0011}t,n\u0013Wԉ\u0010;"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016<XMDy4gulj=\u0015f\fW\u00041NSV,ea_=\"\u001dd\u0017\\+b", "", "u(E", "1nS2", "", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b+>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "2db0e0Ib\u001d\t\u0004L;\n", "5dc\u0011X:<`\u001d\n\nb6\u0006v>r", "Adc\u0011X:<`\u001d\n\nb6\u0006v>r", "4h]._\u001a<]&\u0003\u0004`", "5dc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "Adc\u0013\\5:Z\u0007|\u0005k0\u0006\u000b", "AdT1", "5dc X,=", "Adc X,=", "AdaCX9\u001e\\&\t\u0002e4|\u0012>K\u007f<H", "5dc X9OS&^\u0004k6\u0004\u00107e\t7a@\u0015c", "Adc X9OS&^\u0004k6\u0004\u00107e\t7a@\u0015c", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class FinishEnrollmentResponse {
    private String code = "";
    private String descriptionStr = "";
    private String seed = "";
    private String finalScoring = "";
    private String serverEnrollmentKey2 = "";

    public final String getCode() {
        return this.code;
    }

    public final String getDescriptionStr() {
        return this.descriptionStr;
    }

    public final String getFinalScoring() {
        return this.finalScoring;
    }

    public final String getSeed() {
        return this.seed;
    }

    public final String getServerEnrollmentKey2() {
        return this.serverEnrollmentKey2;
    }

    public final void setCode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.code = str;
    }

    public final void setDescriptionStr(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.descriptionStr = str;
    }

    public final void setFinalScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.finalScoring = str;
    }

    public final void setSeed(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.seed = str;
    }

    public final void setServerEnrollmentKey2(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.serverEnrollmentKey2 = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
