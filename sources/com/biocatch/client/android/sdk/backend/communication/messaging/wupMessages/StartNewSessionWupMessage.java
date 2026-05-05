package com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages;

import com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener;
import com.biocatch.client.android.sdk.backend.communication.ServerSession;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r.4\u0012}\bnjO0LeN/ZS8\u0018sڔ<$q$yCA[\"}0\tWNmgtϺpŏs\u000f4\u00159F<Mcxu\u0012=3RsM5eok<pzD\t8487(\b\u0011 8M(x\u0011By\u000f\"4NvRR;T\u0015  \u000eV\"\u0017\u001d\u000bj^:Vuu:]&\u0013mPX?_^\b]\u0011T`?\r%n.1F7C#=S1\u0012қ_?\u0011N:K\u0013}?'Y_$[Do\u0018\u0014C.\u0016\r.\u000b4j\u001dQ\u000f\u0017}˚[ӍO\\\u0016ߊ\u0010|\u0002\u001bJ\u0014.\b-Y<?jx\u0016!Kt!^\u0017ЧDެF\u0006\u0003ʨN\u0019+\u0014A;ݶ\u001f~"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhu;E\u000fJQ\u0001\u001e\u0004\u000eCxtL_\u0002W\u0005|uO7dHY5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", "7c", "", "2de6V,,])\fx^", "", ";tX1", "1n]AX?M<\u0015\u0007z", "AdaCX9,S'\r~h5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "1rX1", "/fT;g\u001bR^\u0019", "@d`BX:M1#\b{b.\r\u0016+t\u00042\u0005N", "", "@dbB_;!O\"}\u0002^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "7r<.a+:b#\f\u000f", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4m>T\u0016G\u0003\u0014??3pNih}E=Tf4mUM\u001diK:1\u0002q')lZ7_bX\r\u0004NCncP\u001bD&3KqdH\u001bVZ8\u0006#hRw\u0001\u0014{F\u00048x6\u0006\n\u001f\u001db\u000fS1\u0015Bhv\u0011;ZDp$=@\u0013HZ-qu=\u001br#`Q\u001ca;z\u0016aciH\u0018\u0006'\u0015e=io\n;P\u0002MMy\u001ep*mOW\u0003#\u0011\u000b2{iSL\bT\u000f*wS\tc\u001f\u0012\u0003o\u0018)\u0004\u000b\u0001J", "u(I", "Adc\u001aT5=O(\t\br", "uY\u0018#", "Adc X9OS&l\nZ;|s+r{0{O\u0001$%", "5dc X;,S&\u0010zk\u001a\f\u0005>ej$\t<\t\u0017&G|\u001c", "Adc\u0010b5?W\u001bdzr", "", "1n]3\\.$S-", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class StartNewSessionWupMessage extends WupMessage {
    private boolean isMandatory;
    private final boolean setServerStateParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNewSessionWupMessage(long j2, String deviceSource, String str, String str2, ServerSession serverSession, String str3, String agentType, boolean z2, ITransmissionResultListener resultHandler, boolean z3) {
        super(j2, deviceSource, str, str2, serverSession, str3, agentType, resultHandler);
        Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
        Intrinsics.checkNotNullParameter(serverSession, "serverSession");
        Intrinsics.checkNotNullParameter(agentType, "agentType");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.isMandatory = z3;
        if (z2) {
            setConfigKey("android");
        }
    }

    public /* synthetic */ StartNewSessionWupMessage(long j2, String str, String str2, String str3, ServerSession serverSession, String str4, String str5, boolean z2, ITransmissionResultListener iTransmissionResultListener, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, str2, str3, serverSession, str4, str5, z2, iTransmissionResultListener, (-1) - (((-1) - i2) | ((-1) - 512)) != 0 ? true : z3);
    }

    private final void setConfigKey(String str) {
        setParam$sdk_3_3_0_936_release("c", str);
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.WupMessage
    public boolean getSetServerStateParameters() {
        return this.setServerStateParameters;
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.messaging.Message
    public boolean isMandatory() {
        return this.isMandatory;
    }

    @Override // com.biocatch.client.android.sdk.backend.communication.messaging.Message
    public void setMandatory(boolean z2) {
        this.isMandatory = z2;
    }
}
