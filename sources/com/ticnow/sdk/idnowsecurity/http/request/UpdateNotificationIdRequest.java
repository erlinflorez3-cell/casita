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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005,Bߚ(\u0007\u0015iy3ǲiH<R\u001c.\u001dx\u00144R]t\nQ<m\u001a,$_ѮZ˗kzRҙ#E\u0015\t$|\u000b.OZ\u0007cb'@I\b?aOFސEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014c\u001a\u001cH@\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$guRVJriH5ݳ\u0007w"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}\u000e g]H\u0007L6]z(KJJ;`\\{!\u0013~Z\u001a^+\u001b\u0014/", "", "u(E", "2de6V,\u001fW\"\u0001zk\u0017\n\r8t", "", "5dc\u0011X=BQ\u0019_~g.|\u0016\u001ar\u00041\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0011X=BQ\u0019_~g.|\u0016\u001ar\u00041\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "<nc6Y0<O(\u0003\u0005g\u0010{", "5dc\u001bb;BT\u001d|vm0\u0007\u0012\u0013d", "Adc\u001bb;BT\u001d|vm0\u0007\u0012\u0013d", "CtX17,OW\u0017~", "5dc\"h0=2\u0019\u0010~\\,", "Adc\"h0=2\u0019\u0010~\\,", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class UpdateNotificationIdRequest {
    private String notificationId = "";
    private String deviceFingerPrint = "";
    private String uuidDevice = "";

    public final String getDeviceFingerPrint() {
        return this.deviceFingerPrint;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getUuidDevice() {
        return this.uuidDevice;
    }

    public final void setDeviceFingerPrint(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.deviceFingerPrint = str;
    }

    public final void setNotificationId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.notificationId = str;
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
