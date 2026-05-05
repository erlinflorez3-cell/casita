package com.dynatrace.agent.communication.network.datasource;

import com.dynatrace.agent.communication.LocalServerData;
import com.dynatrace.agent.communication.network.model.RetryInfo;
import com.dynatrace.agent.storage.db.EndPointInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV4ZS0\u0019qڔJř\f$ B{\u0001*\u00020\tgN\u0016h~Nh\r[\u000f4\u0019\tp:Mmzs\u0011=7RwE3[uU;vsd\fڶ6$>\u0002\u0013\nj9V\u0010\u000fzqLë\u00166H\u0081RT\u0013W\u0013%b\u0015L\"\u0019\u001e\u000bjߑ:NtҗR1)\u000fwO\u001f8m4\u0015O#E\u0003,˼zg&ѨX9;#3bS\u001a`aW\u0005Upk\fص+/3I\u0002iNZ\u0006$#<̦\u0011p"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp%VW-`T_= \"Z\u001c]\u0001", "", "3mS\u001db0Gb|\b{h", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "AdaCX9\u001dO(z", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "@dc?l\u0010GT#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}&\u001fga@PP,]\u0004;+UO62", "AdaCX9\"R", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007f@l\u00018QLJO=\u001f\u001f>H7\u0011kuM\u000b0C[[(ZR<9\u0016\u0012c\u001d\u0018)\u0017\raQ-rB3.\f6RK\"r~\b\u001d{5w\u0002BcnC\t\u0011K('rN#^\u000eP=To&b\f)\u0019^:C3]o##p`7\u000eyO v\\\u00031pG(\rB1D7cPDo\\\u0006a'.X\u0010[\u001b3bJ\u0012y)\u00150s=`\u000eM1{Gmx\u0017,i\u0017j\u0017", "5dc\u0012a+)]\u001d\b\nB5}\u0013", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~Xzi\u0017v\u0015\u0019WGDz\u0018'\u0016r7", "5dc X9OS&]vm(", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\u0015WA7r\"\u001e\"yaFe_;JL", "5dc\u001fX;Kg|\b{h", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_7MRMuA$^pk8\u0007ju;v6T`25]\\H", "5dc X9OS&by", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ConfigRequest {
    private final EndPointInfo endPointInfo;
    private final RetryInfo retryInfo;
    private final LocalServerData serverData;
    private final Integer serverId;

    public ConfigRequest(EndPointInfo endPointInfo, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        Intrinsics.checkNotNullParameter(endPointInfo, "endPointInfo");
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    public /* synthetic */ ConfigRequest(EndPointInfo endPointInfo, LocalServerData localServerData, RetryInfo retryInfo, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPointInfo, localServerData, retryInfo, (i2 + 8) - (i2 | 8) != 0 ? null : num);
    }

    public final EndPointInfo getEndPointInfo() {
        return this.endPointInfo;
    }

    public final RetryInfo getRetryInfo() {
        return this.retryInfo;
    }

    public final LocalServerData getServerData() {
        return this.serverData;
    }

    public final Integer getServerId() {
        return this.serverId;
    }
}
