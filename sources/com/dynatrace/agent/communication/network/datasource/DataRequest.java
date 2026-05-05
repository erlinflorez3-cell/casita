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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tsAӄLe^.Zݷ2\u000f\u0002{<řc$\u007fICU \u000b(ޛeȞ\u0018g\u001dI\u001bFS\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\t.8:8(\f\u0011 8P(x\u0011By\u0015\"8FpH\\%O\u001b\u0019@\u0011̧$\u0003$hu[\u0007Wz]R/Q\u0004ݦFT/ڿH~S\u001bTcw\u001c\u0005c6+n:߱\u0019+[Έ\u001fTaO\u0011PBL\u0013l?'YNָ[<`Ü,\u00171S\u001boC5j\u000bi`:.˦SiSִ&*}\u000e\n!\r\u0015\u001c\u000e?JD,Hoڿ\u00129|ɁkBV\u0017lXP\u000eo@/'\u00162YDӸjYi;'gO}\u000b$,;ѐr;"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp&H](IR~M\u0014 ic", "", "3mS\u001db0Gb|\b{h", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "0nSF", "", "7r??\\6KW(\u0013", "", "AdaCX9\u001dO(z", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "@dc?l\u0010GT#", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}&\u001fga@PP,]\u0004;+UO62", "AdaCX9\"R", "", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn4VG\u007f@l\u00018QLJO=\u001f\u001f>H>\u0003t(\u0018}#PN\u0018\u001ak_vF\u0016gOtL5\u0015NXU-jSD\u001b\u0006,\u0013}=h\n\u001b_\f?rxR_\u0014Eu$yK22-c]uN/Eo;d\u0019>\u0019k6\u0010\u000b\u0012{!dgd7\u0006\u000b`\rpRCciG\"\n\u0002\"HucVNsS8\u0004+)TE\u0001\u0012Aj~8zv\f>)6kN8g'Kr\\\u001e-f\u0017\u000e+2M\u000f\tR_~n\bqq.a\n\u000eo\u000bt\n", "5dc\u0012a+)]\u001d\b\nB5}\u0013", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`%Vy\u001b8x%~Xzi\u0017v\u0015\u0019WGDz\u0018'\u0016r7", "5dc\u000fb+R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "u(I", "5dc X9OS&]vm(", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_\u0015WA7r\"\u001e\"yaFe_;JL", "5dc\u001fX;Kg|\b{h", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`\u0015Qw\u0016L\u007f)3U\r$Av_7MRMuA$^pk8\u0007ju;v6T`25]\\H", "5dc X9OS&by", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DataRequest {
    private final String body;
    private final EndPointInfo endPointInfo;
    private final boolean isPriority;
    private final RetryInfo retryInfo;
    private final LocalServerData serverData;
    private final Integer serverId;

    public DataRequest(EndPointInfo endPointInfo, String body, boolean z2, LocalServerData serverData, RetryInfo retryInfo, Integer num) {
        Intrinsics.checkNotNullParameter(endPointInfo, "endPointInfo");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.endPointInfo = endPointInfo;
        this.body = body;
        this.isPriority = z2;
        this.serverData = serverData;
        this.retryInfo = retryInfo;
        this.serverId = num;
    }

    public /* synthetic */ DataRequest(EndPointInfo endPointInfo, String str, boolean z2, LocalServerData localServerData, RetryInfo retryInfo, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(endPointInfo, str, z2, localServerData, retryInfo, (i2 + 32) - (i2 | 32) != 0 ? null : num);
    }

    public final String getBody() {
        return this.body;
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

    public final boolean isPriority() {
        return this.isPriority;
    }
}
