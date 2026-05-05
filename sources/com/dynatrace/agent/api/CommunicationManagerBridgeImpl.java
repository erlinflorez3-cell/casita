package com.dynatrace.agent.api;

import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0LeN.ZS8\u0015sڔ:řqҕ\"CiTZ\u000b2\r]N\u007fg\u001dKҼ\u000fE\u0015\b${3:WY\u0011]@\u0014bF}EKM\u001eD\u007ft=D\u0013(J\"f~5\u0005(3`\u0010%\u0005\n_\\\u001e>@\t:\u0001\u000e$ī\u001cŪ\n>(ҵɏ`r"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n|\"\u001b\u0011M\u0018D~5>]{\u001cFq 75?Dg6\u001e\"En=\u0006e,2~2N\"", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?a\u00060@q\u0014*\\GEt}{\u001fpiI\u0010g*J\u0006+QU6(eNt=!ng\u0012M-\rZ", "1n\\:h5BQ\u0015\u000e~h5d\u00058a\u0002(\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T\"", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7s8UKKt8\u001c\u0011weC\u0010K(Wr)GY$oM", "CoS.g,\u001c]\"\u007f~`<\n\u0005>i\n1_Ij \u0017#q\u000eE\u0006", "", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1l\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "CoS.g,,S&\u0010zk\u0010{", "AdaCX9\"R", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CommunicationManagerBridgeImpl implements CommunicationManagerBridge {
    private final CommunicationManager communicationManager;

    public CommunicationManagerBridgeImpl(CommunicationManager communicationManager) {
        Intrinsics.checkNotNullParameter(communicationManager, "communicationManager");
        this.communicationManager = communicationManager;
    }

    @Override // com.dynatrace.android.agent.communication.CommunicationManagerBridge
    public void updateConfigurationInOneAgent(ServerConfiguration serverConfigurationV3) {
        Intrinsics.checkNotNullParameter(serverConfigurationV3, "serverConfigurationV3");
        this.communicationManager.updateV3Config(serverConfigurationV3);
    }

    @Override // com.dynatrace.android.agent.communication.CommunicationManagerBridge
    public void updateServerId(int i2) {
        this.communicationManager.setServerId(Integer.valueOf(i2));
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "received external server id update to: " + i2);
    }
}
