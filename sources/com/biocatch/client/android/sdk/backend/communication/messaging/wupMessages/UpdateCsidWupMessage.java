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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r.4\u0012}\bnjO0LeN/ZS@\u000fsڔ<$i-yCAX Ԃ8ޛ\u007fN\u0016f/\u001ej\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5RuM7eqS8\u000fwF\u000b.7::\u0010\u0004/\u001d:L\u001e|\u0013Cy\u0013\"6NxRT#L3\u001d\"\nL)\u0019\u001e\u000bj^:Vvu:].\u0013oHN5kH|{\u001aТX'\u001b\u0005269LO5C2*Ο\u0013қ_K\u000bӊ\n?\u000bt56KKygDią\u0018'"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhw7H}Jh^\u001a\u001a\r'z{*V\u001eUu\u0017u\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhy<Ti;v\u000f\b\u0018\u000e\u000b", "7c", "", "2de6V,,])\fx^", "", ";tX1", "1n]AX?M<\u0015\u0007z", "AdaCX9,S'\r~h5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "1rX1", "/fT;g\u001bR^\u0019", "@dbB_;!O\"}\u0002^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "7r<.a+:b#\f\u000f", "", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u00044H7|0g\u001cdj;PQ;[z0I\"5*fZ<:\u0018\u001cX\n])\u0010NWH(nMFh\u00045H\u000fEl\u007fU$\r;4m>T\u0016G\u0003\u0014??3pNih}E=Tf4mUM\u001diK:1\u0002q')lZ7_bX\r\u0004NCncP\u001bD&3KqdH\u001bVZ8\u0006#hRw\u0001\u0014{F\u00048x6\u0006\n\u00114n\r\u0015d\u001cH\\t$*_\u000b%-:<\u001cN\u0015_~kK\u0018l\u001e+\u0016\rh~.\u0015ckcQ\u000eP[!c=qh\u00055N\u0015BSx^\u000b5\f>d\b\u001d\r\u00152qoR0\u001bb\u0011!\u007f+&m \u0003\ff%q#Y.", "u(I", "Adc\u001aT5=O(\t\br", "uY\u0018#", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class UpdateCsidWupMessage extends WupMessage {
    private boolean isMandatory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCsidWupMessage(long j2, String deviceSource, String str, String str2, ServerSession serverSession, String str3, String agentType, ITransmissionResultListener resultHandler, boolean z2) {
        super(j2, deviceSource, str, str2, serverSession, str3, agentType, resultHandler);
        Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
        Intrinsics.checkNotNullParameter(serverSession, "serverSession");
        Intrinsics.checkNotNullParameter(agentType, "agentType");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.isMandatory = z2;
    }

    public /* synthetic */ UpdateCsidWupMessage(long j2, String str, String str2, String str3, ServerSession serverSession, String str4, String str5, ITransmissionResultListener iTransmissionResultListener, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, str2, str3, serverSession, str4, str5, iTransmissionResultListener, (i2 & 256) != 0 ? false : z2);
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
