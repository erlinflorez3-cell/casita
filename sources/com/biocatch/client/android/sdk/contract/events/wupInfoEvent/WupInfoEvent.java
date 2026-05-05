package com.biocatch.client.android.sdk.contract.events.wupInfoEvent;

import com.biocatch.android.commonsdk.events.IEvent;
import com.biocatch.client.android.sdk.backend.communication.messaging.Message;
import java.util.Date;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u0016qڔJř\f$ B{\u0001*\u00020\tgN\u0016h~Nh\r[\u000f4\u0017\tn:Lmx\f\u0016\u001f>PtW;cnk?IvL\u0004~9ŕ<y\u0013\tjAV\u0015\u000f\u0003YJ:\u0018\u0019B\u000791\u0014̂\t \u001aßV\"\u0007'jq\u001fEVnu:]$ɨmHVϋw2\u0003X\u001bR%6\u001bvy\u001eYA˝9\u001b-م\u001b\tXhM\u000f\u0010\u0001K\b\u0001'U/ʁw]>ݙ\u0018\u0016\u001b9]\u001cǇv6"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPu<YZ0HV.=\\[\u0002\u0007\u0006\"eqW,\u0017djA-}\u001a", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#}17v%<\u0017'\u001b|4'$>", "Bh\\25,?]&~g^8\r\t=t", "\u001aiPCTuNb\u001d\u0006D=(\f\t\u0005", "Bh\\24-MS&kzl7\u0007\u0012=e", "Et_\u001aX:LO\u001b~", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011TN:jNtA\u001d\u0014$uN9\u001b\u0001[Ay", "3qa<e", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "uKY.i(\bc(\u0003\u0002(\u000bx\u0018/;f-wQ|`'Vs\u0015\u0006U!DYS\u00075w\u001ewJGEi0-\u0013k+7\u000eg,W\u0006pCUM9fVq\u0007\"\u0011`WK'\u000b\u000bYJ#8BA'\u0010<R\u00069d\u0010\u0010 \u0017~rpPd\fI}\u001ew\u000b\u0011hTg[{G\u0017,g&u\b)$XC<ms\u0005\u0017\u001bs_2\u0014\u0005)Tc", "5dc\u0012e9H`", "u(;7T=:\u001d z\u0004`u\\\u001c-e\u000b7\u007fJ\nl", "5dc!\\4>/\u001a\u000ezk\u0019|\u0017:o\t6{", "u(;7T=:\u001d)\u000e~eu[\u0005>eU", "5dc!\\4>0\u0019\u007f\u0005k,i\t;u\u007f6\u000b", "5dc$h7&S'\rv`,", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001j\u0012,SCDj}\u001c\u001fpiI\u0010g*J\u0006+QU\u00184\\`\u00019\u0016\u0016c\u0010\u0018\u0013\r\u0013g=&n\u001a", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WupInfoEvent implements IEvent {
    private final Exception error;
    private final Date timeAfterResponse;
    private final Date timeBeforeRequest;
    private final Message wupMessage;

    public WupInfoEvent(Date timeBeforeRequest, Date timeAfterResponse, Message wupMessage, Exception exc) {
        Intrinsics.checkNotNullParameter(timeBeforeRequest, "timeBeforeRequest");
        Intrinsics.checkNotNullParameter(timeAfterResponse, "timeAfterResponse");
        Intrinsics.checkNotNullParameter(wupMessage, "wupMessage");
        this.timeBeforeRequest = timeBeforeRequest;
        this.timeAfterResponse = timeAfterResponse;
        this.wupMessage = wupMessage;
        this.error = exc;
    }

    public final Exception getError() {
        return this.error;
    }

    public final Date getTimeAfterResponse() {
        return this.timeAfterResponse;
    }

    public final Date getTimeBeforeRequest() {
        return this.timeBeforeRequest;
    }

    public final Message getWupMessage() {
        return this.wupMessage;
    }
}
