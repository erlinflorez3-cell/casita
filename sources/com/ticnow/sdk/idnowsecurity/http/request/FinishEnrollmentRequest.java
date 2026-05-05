package com.ticnow.sdk.idnowsecurity.http.request;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3LeV:ZS0\"\u0002ڔd$\n#2FтY\u001a\f\"QS\\\n\u007fnxh[[\u001d\u0007.x\u0019. ǈ%ٕ\u0016\u001b:ԏ\bA9P}AYbz;\u0013&\u0003:F\u0001\u001d\u0001H2\u001fƼ#ټGW\u0014۵HBvC`\u0017m\u0007 \u001d\u0014Jp\u0019,i\u007fNdVCҞFǥ'\u000fqĩf)e?\u000b]-HZ8\u001b\t269SO5C3*Ώ\u0013қ_K\u000bӊ\n?\u000b|57KKylDjP,#Ag\r\f\u0001|؟\u0011Ōd\u0018/˃geQg\u001c8\u0018|\u0002%J\u0016^\u001e5aF-Ht^ԋ?Ϣv_HА\u001a`H\u001a\tqV\u0019+\u001bA=\n3tmy;G\\\u000eޭ\u0011ڟ\"/\t͙9]Z+n%;V}o?c\u0011UVm\"Yk{Z͖n͆.\u00108Ϛ\u00181\u00021<'E9aZ13Ȧ\u0006k"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}~\u0019qeG\nC5[\u0001.NTN5k?rI$\u0012h\u001d$", "", "u(E", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "5dc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm59r4CT\\\u0019\\^\u0003=\"!0", "Adc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u0017J\u0004#OZ;,hbrK#g\u001e~", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "5dc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm5>\u0005'T+J;X?rI$\u0012h\u001d$", "Adc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u001c\\v4&H](IR~M\u0014 ic\u0012\u001c", ";nQ6_,\u001fW\"\u0001zk7\n\r8t", "", "5dc\u001ab)BZ\u0019_~g.|\u0016:r\u00041\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001ab)BZ\u0019_~g.|\u0016:r\u00041\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ";nQ6_,)c\u0016\u0006~\\\u0012|\u001d", "5dc\u001ab)BZ\u0019i\u000b[3\u0001\u0007\u0015e\u0014", "Adc\u001ab)BZ\u0019i\u000b[3\u0001\u0007\u0015e\u0014", ";nQ6_,,W\u001b\bvm<\n\t", "5dc\u001ab)BZ\u0019l~`5x\u0018?r\u007f", "Adc\u001ab)BZ\u0019l~`5x\u0018?r\u007f", "BlbAc\u000f>O\u0018~\b", "5dc!`:M^{~v],\n", "Adc!`:M^{~v],\n", "Bx_2>,R", "5dc!l7>9\u0019\u0013", "Adc!l7>9\u0019\u0013", "CtX17,OW\u0017~", "5dc\"h0=2\u0019\u0010~\\,", "Adc\"h0=2\u0019\u0010~\\,", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class FinishEnrollmentRequest {
    public CommonParamsRequest commonParamsRequest;
    public CommonUserDataRequest commonUserDataRequest;
    private String uuidDevice = "";
    private String mobileFingerprint = "";
    private String mobilePublicKey = "";
    private String tmstpHeader = "";
    private String mobileSignature = "";
    private String typeKey = "";

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

    public final String getMobileFingerprint() {
        return this.mobileFingerprint;
    }

    public final String getMobilePublicKey() {
        return this.mobilePublicKey;
    }

    public final String getMobileSignature() {
        return this.mobileSignature;
    }

    public final String getTmstpHeader() {
        return this.tmstpHeader;
    }

    public final String getTypeKey() {
        return this.typeKey;
    }

    public final String getUuidDevice() {
        return this.uuidDevice;
    }

    public final void setCommonParamsRequest(CommonParamsRequest commonParamsRequest) {
        Intrinsics.checkParameterIsNotNull(commonParamsRequest, "<set-?>");
        this.commonParamsRequest = commonParamsRequest;
    }

    public final void setCommonUserDataRequest(CommonUserDataRequest commonUserDataRequest) {
        Intrinsics.checkParameterIsNotNull(commonUserDataRequest, "<set-?>");
        this.commonUserDataRequest = commonUserDataRequest;
    }

    public final void setMobileFingerprint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mobileFingerprint = str;
    }

    public final void setMobilePublicKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mobilePublicKey = str;
    }

    public final void setMobileSignature(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mobileSignature = str;
    }

    public final void setTmstpHeader(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.tmstpHeader = str;
    }

    public final void setTypeKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.typeKey = str;
    }

    public final void setUuidDevice(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.uuidDevice = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
