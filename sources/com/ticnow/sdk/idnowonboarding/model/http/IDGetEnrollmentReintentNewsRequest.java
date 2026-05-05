package com.ticnow.sdk.idnowonboarding.model.http;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.request.CommonParamsRequest;
import com.ticnow.sdk.idnowsecurity.http.request.CommonUserDataRequest;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3LeV:Zݷ@ş\u001c{b#\u001c'ڱG;c\u001aF&\u0017\\fg\u0016|\u001br\u0019D'\u0006DzAߡuǤ|i\u001aƁJDuBAQ\u0010??e\u0003<U8@)Py3\tpݙtǘz\u0007Kŷ$\u00146I~Dr\u000fS\u0010(\u001eĈB/"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwPRJv}\u0002sJaHfl9X}.OLW;IRvF#\u0012c\u001d7+\u001f\u0013FA0~DE.]", "", "u(E", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "5dc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm59r4CT\\\u0019\\^\u0003=\"!0", "Adc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u0017J\u0004#OZ;,hbrK#g\u001e~", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "5dc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm5>\u0005'T+J;X?rI$\u0012h\u001d$", "Adc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u001c\\v4&H](IR~M\u0014 ic\u0012\u001c", "Bn9@b5", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDGetEnrollmentReintentNewsRequest {
    public CommonParamsRequest commonParamsRequest;
    public CommonUserDataRequest commonUserDataRequest;

    public final CommonParamsRequest getCommonParamsRequest() {
        CommonParamsRequest commonParamsRequest = this.commonParamsRequest;
        if (commonParamsRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commonParamsRequest");
        }
        return commonParamsRequest;
    }

    public final CommonUserDataRequest getCommonUserDataRequest() {
        CommonUserDataRequest commonUserDataRequest = this.commonUserDataRequest;
        if (commonUserDataRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commonUserDataRequest");
        }
        return commonUserDataRequest;
    }

    public final void setCommonParamsRequest(CommonParamsRequest commonParamsRequest) {
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "<set-?>");
        this.commonParamsRequest = commonParamsRequest;
    }

    public final void setCommonUserDataRequest(CommonUserDataRequest commonUserDataRequest) {
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "<set-?>");
        this.commonUserDataRequest = commonUserDataRequest;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
