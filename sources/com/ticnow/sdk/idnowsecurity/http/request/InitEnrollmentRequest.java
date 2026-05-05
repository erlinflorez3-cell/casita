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
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0012s{B0c$w^CU0}*\tUU}˧\u001fJ\t\n\u0004\u0012و\u001axx,\u0012Y\u0007\u0018*\u000f`V@WAN\b=gbKȉ1ڶ6.@ц\u001d\u0003 -V\u0014\u0017|IP\u001a\u0018\u0001X~Aj\r{\rpŎ2̧$\r&ձ\u007fP<QzgZ1)\u000ewN\u001f?m=\u0015M;T+ܒ9țe*3¨O7\u001b4a\u0013'TaP\u0011QBU\u0013{?'Y]JɕBݼ\u0004 \u001dۀg\u000fc\b4r%Sf#5C {Yi&(&\u000fRȥHǬ\u0012\u0012/ΞF/ \u0001\u0016$SvxnNhRvP\u001c\u0013ad+{ĵ?ڢ='nϟy=\u001fkE\u0012%\u000f$A\u000f\u0007qsb-x\u0015IhNΊ=ҨDIPݐ\"[C\u000e\u0012\u0007\u0003\u00040%>_PG\n3F\u0017SK2ބ/\u074co\u000ePֳ\u007fx\u000b\u0004vi\nTNd0\u0007fO8.$Zrx[ߟ\\Ԝ\\8\u0019۳4V\r$\u0016)@^}c/=`f]\u0011\u0002j{q`ɟ;Ϭ;ev\u0088&Y?\bAKqe\u0016\f`\u000fdWJ\u000e\u001dX\u0015V*ەfڅ,.:ʋ\u0003\u0012}(Rd,\u00158l\u007f4\u0005D?Gt\u0015v\u0017t՚MҴ\rkbӐ(\u0001Zb2\u0019\n&z9\u000fh-\t}\u0019\u0011IZ/7üYۮUA!ğm$ng\u000bW'\u0001y5U\u001e\u001d_Z$.u\u0004\u0010vڍ&\u07fcU;EП'\u0001/j\u0010CeNx\u001f_eɥ+6"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u0002\u001elp\u0019\u0010p6U}/GU]\u0019\\^\u0003=\"!0", "", "u(E", "1n\\:b5)O&z\u0003l\u0019|\u0015?e\u000e7", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "5dc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm59r4CT\\\u0019\\^\u0003=\"!0", "Adc\u0010b4F]\"ivk(\u0005\u0017\u001ce\f8{N\u0010", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u0017J\u0004#OZ;,hbrK#g\u001e~", "1n\\:b5.a\u0019\fYZ;xu/q\u0010(\nO", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010S:N\u0004\u0006C[J\u0019\\^\u0003=\"!0", "5dc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^FkA\u000fm5>\u0005'T+J;X?rI$\u0012h\u001d$", "Adc\u0010b4F]\"n\t^9[\u0005>al(\bP\u0001%&", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgrriA\u0011l\u001c\\v4&H](IR~M\u0014 ic\u0012\u001c", "2de6V,\u001dO(zg^8\r\t=t", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}|\u0015ye7\u0007B(]r\u0014GX^,jaH", "5dc\u0011X=BQ\u0019]vm(i\t;u\u007f6\u000b", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^GaJ\u000ba,-r6C9N8lR\u0001Li", "Adc\u0011X=BQ\u0019]vm(i\t;u\u007f6\u000b", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCgshr=\u0005c\u000bJ\u0006#4LZ<\\`\u0002\u0013W\u0003", "2de6V,\u001fW\"\u0001zk7\n\r8t", "", "5dc\u0011X=BQ\u0019_~g.|\u0016:r\u00041\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0011X=BQ\u0019_~g.|\u0016:r\u00041\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "3ma<_3FS\"\u000eir7|", "5dc\u0012a9HZ \u0007zg;k\u001d:e", "Adc\u0012a9HZ \u0007zg;k\u001d:e", "4`R25(<Y\u0019\by", "5dc\u0013T*>0\u0015|\u0001^5{", "Adc\u0013T*>0\u0015|\u0001^5{", "4kP48?MS&\bve\u001dx\u00103d{7\u007fJ\n", "5dc\u0013_(@3,\u000ezk5x\u0010 a\u0007,z<\u0010\u001b!P", "Adc\u0013_(@3,\u000ezk5x\u0010 a\u0007,z<\u0010\u001b!P", ";nQ6_,\u001e\\&\t\u0002e4|\u0012>K\u007f<", "5dc\u001ab)BZ\u0019^\u0004k6\u0004\u00107e\t7a@\u0015", "Adc\u001ab)BZ\u0019^\u0004k6\u0004\u00107e\t7a@\u0015", ";nQ6_,,W\u001b\bvm<\n\t", "5dc\u001ab)BZ\u0019l~`5x\u0018?r\u007f", "Adc\u001ab)BZ\u0019l~`5x\u0018?r\u007f", "<nc6Y0<O(\u0003\u0005g\u0010{", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u0013d", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u0013d", "=r", "5dc\u001cf", "Adc\u001cf", "Bx_2>,R", "5dc!l7>9\u0019\u0013", "Adc!l7>9\u0019\u0013", "CrT?7(MO\u0006~\u0007n,\u000b\u0018", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e#hn\u0018\u0003r(;v3WL\\;2", "5dc\"f,K2\u0015\u000evK,\t\u0019/s\u000f", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_;MOKkB-^Xo9\u0014B(]r\u0014GX^,jaH", "Adc\"f,K2\u0015\u000evK,\t\u0019/s\u000f", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7#.YS;yCg\u0005vaFe_;Jc'S\\N:k(6.", "CtX17,OW\u0017~", "5dc\"h0=2\u0019\u0010~\\,", "Adc\"h0=2\u0019\u0010~\\,", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class InitEnrollmentRequest {
    public CommonParamsRequest commonParamsRequest;
    public CommonUserDataRequest commonUserDataRequest;
    public DeviceDataRequest deviceDataRequest;
    public UserDataRequest userDataRequest;
    private String os = "";
    private String notificationId = "";
    private String mobileEnrollmentKey = "";
    private String mobileSignature = "";
    private String deviceFingerprint = "";
    private String flagExternalValidation = "";
    private String uuidDevice = "";
    private String enrollmentType = "";
    private String typeKey = "";
    private String faceBackend = "ZOOM_9";

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

    public final DeviceDataRequest getDeviceDataRequest() {
        DeviceDataRequest deviceDataRequest = this.deviceDataRequest;
        if (deviceDataRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceDataRequest");
        }
        return deviceDataRequest;
    }

    public final String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    public final String getEnrollmentType() {
        return this.enrollmentType;
    }

    public final String getFaceBackend() {
        return this.faceBackend;
    }

    public final String getFlagExternalValidation() {
        return this.flagExternalValidation;
    }

    public final String getMobileEnrollmentKey() {
        return this.mobileEnrollmentKey;
    }

    public final String getMobileSignature() {
        return this.mobileSignature;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getTypeKey() {
        return this.typeKey;
    }

    public final UserDataRequest getUserDataRequest() {
        UserDataRequest userDataRequest = this.userDataRequest;
        if (userDataRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userDataRequest");
        }
        return userDataRequest;
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

    public final void setDeviceDataRequest(DeviceDataRequest deviceDataRequest) {
        Intrinsics.checkParameterIsNotNull(deviceDataRequest, "<set-?>");
        this.deviceDataRequest = deviceDataRequest;
    }

    public final void setDeviceFingerprint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.deviceFingerprint = str;
    }

    public final void setEnrollmentType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enrollmentType = str;
    }

    public final void setFaceBackend(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.faceBackend = str;
    }

    public final void setFlagExternalValidation(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.flagExternalValidation = str;
    }

    public final void setMobileEnrollmentKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mobileEnrollmentKey = str;
    }

    public final void setMobileSignature(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.mobileSignature = str;
    }

    public final void setNotificationId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.notificationId = str;
    }

    public final void setOs(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.os = str;
    }

    public final void setTypeKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.typeKey = str;
    }

    public final void setUserDataRequest(UserDataRequest userDataRequest) {
        Intrinsics.checkParameterIsNotNull(userDataRequest, "<set-?>");
        this.userDataRequest = userDataRequest;
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
