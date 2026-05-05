package com.biocatch.client.android.sdk.backend.communication.messaging;

import com.biocatch.client.android.sdk.backend.DataItem;
import com.biocatch.client.android.sdk.backend.communication.ClientSessionState;
import com.biocatch.client.android.sdk.backend.communication.ITransmissionResultListener;
import com.biocatch.client.android.sdk.backend.communication.ServerSession;
import com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.DataWupMessageSubType;
import com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.DataWupMessageType;
import com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.FlushDataWupMessageSubType;
import com.biocatch.client.android.sdk.backend.communication.messaging.dataWupMessageFactory.IDataWupMessageFactory;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.DataWupMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.StartNewSessionWupMessage;
import com.biocatch.client.android.sdk.backend.communication.messaging.wupMessages.UpdateCsidWupMessage;
import java.util.Collection;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{B@c$\bCCU }*\t]Zo˧vJp\u000bKƤ\u000e\u0016\u000fj4կ]xk\u001b\u0017˰JoU3UڎCʠvҚf\u0005N1bK\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsĐV\r[\tb,\u0014C8\u0001Lb\u0018RDO\u0005]h7S\rwKf-o2\rM;Q\u00031U\u0019o*C@e;E)a\n\u001fR\nG3I\u007fF\u001dn7);I\"bdb0\u0018#8g\r\f\u0001nx\u0013`x\fU;\u007fgYW&(&\u0003,\u0011J\u0015&\u0006UZ^1(y \u000ea\t;_Ne\u001a^p\u0016+eD\u001e=\u007fa3\n'tQy;GO\u000eީ\u0007ڟ\"#\t͙qgb\u0010x\u0015IWNΆ3ҨD=Pݐ̌]T"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\u007f^6t\u0005gO pD\u0014/\f3H\u0002H>", "", "1kX2a;,S'\r~h5j\u0018+t\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011*U0\\[\u0002+\u0014 h\u0012X4z\u0014UP$D", "2`c.J<I;\u0019\r\tZ.|i+c\u000f2\tT", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$\rJ:\tviL\fnRE\u001b\n,*}9w\u000b\u0019*W\u0019IlQR\u0002W\u0005|uO7dHY@uEPOo>:", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016,3`R{L\u0002\u0012h\u001cR5\u0016rh=3n\u001a\u001e\u001d\u00124\u0013~?r~\b%\f84nIZ\u0010P\t^qJ(uP]^CU@K,'`\ne\u001de9\u0004\"\u001ey!+qT,\u0006\u000bW\u001b{\u001c\u0002guU\u0015|<-@7ZBTkGL\u007f\u000f\u001fY\ns\u001429p)\u00047\u0011Hs\u001aC\u0001Zc\nNi`\u0015:j=)&\u00178\u0011NUp\nB\u0002~", "0tX9W\u000b:b\u0015fzl:x\u000b/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhf(X}-x\fs\u0016\u001cCfrB,", "@dbB_;!O\"}\u0002^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00110=9X[\u0001E\u0018 h\u0012X4y\u0005gQ+}+;-\u0017,R\u0002H>", "2`c.", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005J0-\u0011Lp9\u000f9", "0tX9W\rEc'\u0002YZ;xp/s\u000e$}@", "4kd@[\u001aHc&|z", "", "0tX9W\u001aMO&\u000ec^>j\t=s\u00042\u0005(\u0001%%Cq\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhu;E\u000fJQ\u0001\u001e\u0004\u000eCxtL_\u0002W\u0005|uO7dHY5", "AdaCX9,S'\r~h5", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011:N9mR\u007f+\u0014 h\u0012X4b", "@d`BX:M1#\b{b.\r\u0016+t\u00042\u0005N", "", "0tX9W\u001cIR\u0015\u000ez<:\u0001\b\u0017e\u000e6wB\u0001", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$ ^6t\u0005gO pDEhw7H}Jh^\u001a\u001a\r'z{*V\u001eUu\u0017u\u0017", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WupMessageBuilder {
    private final ClientSessionState clientSessionState;
    private final IDataWupMessageFactory dataWupMessageFactory;

    public WupMessageBuilder(ClientSessionState clientSessionState, IDataWupMessageFactory dataWupMessageFactory) {
        Intrinsics.checkNotNullParameter(clientSessionState, "clientSessionState");
        Intrinsics.checkNotNullParameter(dataWupMessageFactory, "dataWupMessageFactory");
        this.clientSessionState = clientSessionState;
        this.dataWupMessageFactory = dataWupMessageFactory;
    }

    public final DataWupMessage buildDataMessage(ITransmissionResultListener resultHandler, Collection<DataItem> data) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(data, "data");
        return this.dataWupMessageFactory.create(DataWupMessageType.DATA_WUP_MESSAGE, DataWupMessageSubType.NONE, resultHandler, data);
    }

    public final DataWupMessage buildFlushDataMessage(ITransmissionResultListener resultHandler, Collection<DataItem> data, String flushSource) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(flushSource, "flushSource");
        return this.dataWupMessageFactory.create(DataWupMessageType.FLUSH_DATA_WUP_MESSAGE, Intrinsics.areEqual(flushSource, "sdk") ? FlushDataWupMessageSubType.SDK_FLUSH_DATA_WUP_MESSAGE : FlushDataWupMessageSubType.CLIENT_FLUSH_DATA_WUP_MESSAGE, resultHandler, data);
    }

    public final StartNewSessionWupMessage buildStartNewSessionMessage(ITransmissionResultListener resultHandler, ServerSession serverSession, boolean z2) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        Intrinsics.checkNotNullParameter(serverSession, "serverSession");
        return new StartNewSessionWupMessage(this.clientSessionState.getAndIncrementRequestID(), "android", this.clientSessionState.getMuid(), this.clientSessionState.getContextName(), serverSession, this.clientSessionState.getCsid(), this.clientSessionState.getAgentType(), z2, resultHandler, false, 512, null);
    }

    public final UpdateCsidWupMessage buildUpdateCsidMessage(ITransmissionResultListener resultHandler) {
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        return new UpdateCsidWupMessage(this.clientSessionState.getAndIncrementRequestID(), "android", this.clientSessionState.getMuid(), this.clientSessionState.getContextName(), this.clientSessionState.getServerSession(), this.clientSessionState.getCsid(), this.clientSessionState.getAgentType(), resultHandler, false, 256, null);
    }
}
