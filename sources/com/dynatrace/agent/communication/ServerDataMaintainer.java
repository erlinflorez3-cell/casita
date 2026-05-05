package com.dynatrace.agent.communication;

import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNogtKb\u000bQ\u000f\u000e\u0016~m4Ikxe\u0012\u00155JoM<UoC9fҚLӌP2P7:\u001a\u0011\u001e8H(v)D[\u0010 2XphUҫQ\u0007 \u0016\u0014Ch\f,l\u007fNdI3җƠ3#\tz\u000bd5qH|{ vX5!\u000faL:\u0007ʻsչ)U\t\u001c`q\b\u001bM\tU\u0005\u0017:W1W\fo8n~B.q˾Kǁv(b\u001f_{TE9k{K~!X}\t\u0019%>\u001a\r46x2;8~\b<R;Ʉ\u0012ĖT\u0002lbP\u0007o8/%.6\u0002ݐ\u001dƻUaCϊ\u001fC\n\u000b%\u001eQ\bEĒ]ڍ\u0012`\u001dÑ%\u0004_9i@kQ%˦[ǀq\u0004xçR6\u0012:_\u007f]\u0007gч#É;[A\u05faqw\u0010T\\g%\u00127è_ׂVHH̎?\"E8!\f\tS;ʐwÏXX4Ҋܜ u"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001[\u0016;^CHJ0-\u0011P]=\u0010r(R\u007f'T\"", "", "7mXA\\(EA\u0019\f\f^9[\u0005>a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001T ,IJ)kA/\u0015u@5\u0016_\u0002", "CoS.g,%W'\u000ezg,\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003J0\\\u0006'PL[\u0002", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7|8K?BY4+&hn\u0018\u0003r($]%QT\u0018+p[nL!\u000eX\u000e\u0018'\u000f\u0005bPmlN?'\u00185M\u007f7w\u0005\u0016\u001fW1ut\fD\u0010T\u000b\u0015\u0003 %wB@c\bVANb7:OP", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "7mXA\\(EA(z\n^", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "AsPAX", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "1n]3\\.N`\u0015\u000e~h5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "1n]3\\.N`\u0015\u000e~h5mV", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", ":nR._\u001a>`*~\b=(\f\u0005", ":nR._\u001a>`*~\b=(\f\u0005mc\n0u?\u0015 \u0013V|\n:v\u001f1[})Fg#.TC7y4", "CoS.g,/!v\t\u0004_0~", "", "1n]3\\./!", "CoS.g,/!v\t\u0004_0~G-o\b\"zT\n\u0013&Tk\f<p!7Y\u0007/1z\u00165M?Ik", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0007!\u0001[\u0016;^CHI>'\u0016lcI\u0014_;R\u00010\u001d3T6kYvF]\u0010d\u001bX;\u001c\tbA28\"A(\u00170R\u00127w\u0005\u0016\u001fcxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "CoS.g,,S&\u0010zk\u000bx\u0018+", "<df X9OS&]vm(", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003S7Mr6G\"", "CoS.g,,S&\u0010zk\u000bx\u0018+$}2\u0004:\u007f+ C~\u001b8t%/U\u007f @|\u0010;MJ;gB\u001e", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u00129Q\r)kA/\u0015u@5\u0016_\u001cYu#VL$\u0013b\\\u0002D\u0018\u001b$\fX8\u0017\u0015hE-nR\u0001|\u00125X\u0006Dx|\u001b\u001a\u0018>@4)[\fXu^|=2j\u0010C\\~G?T8", "CoS.g,\"\\(~\bg(\u0004y|C\n1|D\u0003", "<df\u0010b5?W\u001boH", "<nc6Y@(\\v\u0002vg.|\u0017", "", "uKR<`u=g\"z\nk(z\txa\t'\tJ\u0005\u0016`Cq\u000eE\u0006n3c\u0007!\u0001[\u0016;^CHI>'\u0016lcI\u0014_;R\u00010\u001dA52fayA\u001d[X\u0018[5\u001d\u0014]J$|\u000e\u0015)\u0011;M\u000bKd\u0010\u0010 \u0017\u000b.WGR!CC\u001cqJ+20VdyEP\u001b", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ServerDataMaintainer {
    private ServerConfigurationV4 configuration;
    private ServerConfiguration configurationV3;
    private final AtomicBoolean initialState;
    private final Mutex mutex;
    private AgentState state;
    private final ServerDataListener updateListener;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.ServerDataMaintainer$updateInternalV3Config$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerDataMaintainer.this.updateInternalV3Config(null, false, this);
        }
    }

    public ServerDataMaintainer(LocalServerData initialServerData, ServerDataListener updateListener) {
        Intrinsics.checkNotNullParameter(initialServerData, "initialServerData");
        Intrinsics.checkNotNullParameter(updateListener, "updateListener");
        this.updateListener = updateListener;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.initialState = new AtomicBoolean(true);
        this.state = initialServerData.getState();
        this.configuration = initialServerData.getConfig();
        this.configurationV3 = initialServerData.getConfigV3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:18:0x0065, B:21:0x006c, B:24:0x007f, B:26:0x0085, B:27:0x0089, B:22:0x0073), top: B:44:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateInternalV3Config(com.dynatrace.android.agent.conf.ServerConfiguration r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ServerDataMaintainer.updateInternalV3Config(com.dynatrace.android.agent.conf.ServerConfiguration, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final LocalServerData localServerData$com_dynatrace_agent_release() {
        return new LocalServerData(this.state, this.configuration, this.configurationV3);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateServerData$com_dynatrace_agent_release(com.dynatrace.agent.communication.api.ServerDataUpdate r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.ServerDataMaintainer.updateServerData$com_dynatrace_agent_release(com.dynatrace.agent.communication.api.ServerDataUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object updateV3Config$com_dynatrace_agent_release(ServerConfiguration serverConfiguration, Continuation<? super Unit> continuation) {
        Object objUpdateInternalV3Config = updateInternalV3Config(serverConfiguration, false, continuation);
        return objUpdateInternalV3Config == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateInternalV3Config : Unit.INSTANCE;
    }
}
