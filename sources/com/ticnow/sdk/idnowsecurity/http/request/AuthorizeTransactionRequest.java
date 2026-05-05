package com.ticnow.sdk.idnowsecurity.http.request;

import com.google.gson.Gson;
import com.ticnow.sdk.idnowsecurity.http.nodes.IDTransaction;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005+4\u0012\u000e\u0007nj?3Le^.ZS0\u001bs{J$c$wGQ٥J}P\b\u0010Q˗knXZSG\u001d..x\u0019.\u001am\u0007^*\u000f`DFЇ?ޜsIAś\r8\u000b#@&X{\u000b\u0006(0\u0019(\u0005\u0002[K:\u0014\u0007ϒ|ĐV\u0019UĨ2\u0014\fF.\u0005>^mWDN=uH9;\u0003\u0018D%ϒk݁\u0001Y\u0015Ͽl)\u0013\u0002o\"KB=A#+$\u001b\u0015_s?1MHܼ1ص+33ɞ\fY<g\u000e$5-U\u001ek\u0005vt\u0013dx\fU?&ұwח\u00124\u007f\u07be\u0014\u000fB\u0019\u001c\u001cGJ4D(~X&A\u000e\u000bSnRXސNȸ~m>Ѝ=\u00029EG\u001f\u0007SgV'T\b\u0014\u0013)6#/pwƃ`\u05f8d!#Ƙ\u0010S7nNAhP\u0010wKsT\tp!B\u0004^IV\u0082\b 2#-ڛs;)Ay\u0006hFm\u0018\u0013f9kwt`@P\u0012lպVÁ\u0010fLߟ\u001dmVxfQ1O\"z\u0015%ݚ\u0017I"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}y%wdC\u0014gANe4CU\\(ZavG\u001d~Z\u001a^+\u001b\u0014/", "", "u(E", "/cS6g0H\\\u0015\u0006YZ;x", "", "5dc\u000eW+Bb\u001d\t\u0004Z3[\u0005>a", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000eW+Bb\u001d\t\u0004Z3[\u0005>a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0h^:X;KW\u0017]zm(\u0001\u0010=", "5dc\u000f\\6FS(\f~\\\u000b|\u0018+i\u00076", "Adc\u000f\\6FS(\f~\\\u000b|\u0018+i\u00076", "1gP9_,GU\u0019]vm(", "5dc\u0010[(EZ\u0019\b|^\u000bx\u0018+", "Adc\u0010[(EZ\u0019\b|^\u000bx\u0018+", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "5dc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm59r4CT\\\u0019\\^\u0003=\"!0", "Adc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u0017J\u0004#OZ;,hbrK#g\u001e~", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "5dc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm5>\u0005'T+J;X?rI$\u0012h\u001d$", "Adc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u001c\\v4&H](IR~M\u0014 ic\u0012\u001c", "2de6V,\"R", "5dc\u0011X=BQ\u0019by", "Adc\u0011X=BQ\u0019by", ":nR.g0H\\", "5dc\u0019b*:b\u001d\t\u0004", "Adc\u0019b*:b\u001d\t\u0004", "@hb885@W\"~YZ;x", "5dc\u001f\\:D3\"\u0001~g,[\u0005>a", "Adc\u001f\\:D3\"\u0001~g,[\u0005>a", "BqP;f(<b\u001d\t\u0004", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O\u0013\r\"djG\u0003a;R\u00010\u001d", "5dc!e(Ga\u0015|\nb6\u0006", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}\u0002sWn5\u0010q(L\u0006+QU$", "Adc!e(Ga\u0015|\nb6\u0006", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0018|\u0004u]B\u0015_*]z1P\"\u0012\u001d", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class AuthorizeTransactionRequest {
    public CommonParamsRequest commonParamsRequest;
    public CommonUserDataRequest commonUserDataRequest;
    public IDTransaction transaction;
    private String challengeData = "";
    private String deviceId = "";
    private String location = "";
    private String biometricDetails = "";
    private String additionalData = "";
    private String riskEngineData = "";

    public final String getAdditionalData() {
        return this.additionalData;
    }

    public final String getBiometricDetails() {
        return this.biometricDetails;
    }

    public final String getChallengeData() {
        return this.challengeData;
    }

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

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getRiskEngineData() {
        return this.riskEngineData;
    }

    public final IDTransaction getTransaction() {
        IDTransaction iDTransaction = this.transaction;
        if (iDTransaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("transaction");
        }
        return iDTransaction;
    }

    public final void setAdditionalData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.additionalData = str;
    }

    public final void setBiometricDetails(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.biometricDetails = str;
    }

    public final void setChallengeData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.challengeData = str;
    }

    public final void setCommonParamsRequest(CommonParamsRequest commonParamsRequest) {
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "<set-?>");
        this.commonParamsRequest = commonParamsRequest;
    }

    public final void setCommonUserDataRequest(CommonUserDataRequest commonUserDataRequest) {
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "<set-?>");
        this.commonUserDataRequest = commonUserDataRequest;
    }

    public final void setDeviceId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.deviceId = str;
    }

    public final void setLocation(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.location = str;
    }

    public final void setRiskEngineData(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.riskEngineData = str;
    }

    public final void setTransaction(IDTransaction iDTransaction) {
        Intrinsics.checkParameterIsNotNull(iDTransaction, "<set-?>");
        this.transaction = iDTransaction;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
