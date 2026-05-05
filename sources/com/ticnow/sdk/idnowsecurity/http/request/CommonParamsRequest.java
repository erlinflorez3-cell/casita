package com.ticnow.sdk.idnowsecurity.http.request;

import com.google.gson.Gson;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00176B\u00055Bߚ(\u0007\u0015iy3ǲiH<R\u001c.\u001d\u0002\u00144R]t\nQ<m\u001a,$_ѮZ˗kzRҙ#E\u0015\t$|\u000b.OZ\u0007cb'@I\b?aOFސEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014c\u001a\u001cH@\u001f<)ҏYŋ\u001e\u001e\u000ē8\u0003$guRVJriH5s\u001bwOf'\u000e2Sո\u0019ТX3\u0015Ǹy 1NE95'Y\u0012\u0015X,W\u0011O\n=3j}ݗ7ʁwc>ݙ\u0018\u0016\u001b<]\u0011}t,n\u0013W1$5>gcyRdߑ\u0004ߡ\u007f\u0019Dǉ&\b-\\<1:h\u000e#AzɪWW"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001z\u0016:]CIz}{\u001fpiC\u0010N([r/U9N8lR\u0001Li", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "u(E", "/o_\u0016W", "", "5dc\u000ec7\"R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ec7\"R", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1gP;a,E", "5dc\u0010[(G\\\u0019\u0006", "Adc\u0010[(G\\\u0019\u0006", "2de6V,\u001bS\u001cl~`5", "5dc\u0011X=BQ\u0019[za\u001a\u0001\u000b8", "Adc\u0011X=BQ\u0019[za\u001a\u0001\u000b8", "4naDT9>R|\n", "5dc\u0013b9PO&~yB7", "Adc\u0013b9PO&~yB7", ":nR.g0H\\", "5dc\u0019b*:b\u001d\t\u0004", "Adc\u0019b*:b\u001d\t\u0004", "CrT?4.>\\(", "5dc\"f,K/\u001b~\u0004m", "Adc\"f,K/\u001b~\u0004m", "Bn9@b5", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class CommonParamsRequest implements Serializable {
    private String channel = "";
    private String appId = "";
    private String forwaredIp = "";
    private String location = "";
    private String userAgent = "";
    private String deviceBehSign = "";

    public final String getAppId() {
        return this.appId;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDeviceBehSign() {
        return this.deviceBehSign;
    }

    public final String getForwaredIp() {
        return this.forwaredIp;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final void setAppId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.appId = str;
    }

    public final void setChannel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.channel = str;
    }

    public final void setDeviceBehSign(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.deviceBehSign = str;
    }

    public final void setForwaredIp(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.forwaredIp = str;
    }

    public final void setLocation(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.location = str;
    }

    public final void setUserAgent(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userAgent = str;
    }

    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(this)");
        return json;
    }
}
