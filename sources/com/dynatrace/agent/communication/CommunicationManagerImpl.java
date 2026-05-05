package com.dynatrace.agent.communication;

import com.dynatrace.agent.common.connectivity.NetworkConnectivityChecker;
import com.dynatrace.agent.common.connectivity.NetworkState;
import com.dynatrace.agent.communication.CommunicationState;
import com.dynatrace.agent.communication.api.AgentState;
import com.dynatrace.agent.communication.api.ServerDataListener;
import com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapperImpl;
import com.dynatrace.agent.communication.network.datasource.NetworkDataSource;
import com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider;
import com.dynatrace.agent.communication.preprocessing.ToDataRequestMapper;
import com.dynatrace.agent.storage.preference.ServerConfigurationV4;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0004#\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMwމA`\u000b6\rړ:\"Ny\rЏ\"*^\u0010~ٙKK\u001a\u00188@v>Z\r[\u0005\"Ň\u000e>6\u0001&ձoNLHt]@2+\u0003\u007fBV'e4\u0003ձ#Ͽ\u0005';u\"S;DE5-%\u0002\u0004\u0017ViA\u001b? @\u0015l5+CI\"\\F\\\u000e\u001a-+}\u0014mv4d\u001dQ\u000f\u00157/]mcP<3Þ~}\u0013H\u0012\u001bNCVSE\u001a\u0015.>7\u0003\u001ak@~*\u000fF\u000e$y6EOFĨiݰ\u001ff_\r\u0004'\\c\u0014\u0005;DS\u0005|HsT<\u000b[/\u001d}_^i@kn\u0015\u001e\"P{2\tb0P44U/G{?^]¦ھ_9)R4\bVv\u007fv3\u0007/g2^Vs:nDgp¡JʑHd\u0013 \u0019`fa)MJ\u0005MåF˙$\\\u0006pq1\u001eNgh\u0018k$έ\fɻ3f?ժ?w\u001cYQ^a8(Ҳ\u0012уVv\u001c̳\rn\u0013\\~B\u0002\u00111٥*ϒ6HrݘH\bRT$\u0013`FHʌ6Ϝ5\u0019dé\u0019\u000f,JY|7h1ӓ\u0012њX3,Ѱ:0\u0003\u0013\u0019P\u000b{F\u03a2zͅ0|hõ}M_C1&\u00041?ؗ~ɠ\u000b~{Ò\u0018sZWdlD\u0007,ݫ\"ک\u001e9Yǽ\u000e\u001f\u001d\u0011A20@\u001cɦtϯUM\u001a\u05fdK\t\b#Sh\\|^ρrݽdjR֢%#0\rvrQ\u001f;у{ӶJzOϊ%\u0017iVar1r\u0013ҁD٫\t\u001f&ݒQ{0\u0017M-qBsȹ$ӄ3\u0015iӠ:}<\u0016z\u0011<s\u0014!\u0003Ϧ\"̔fQeЦ\fTWw\u0017@8#\u001b\"\u0019\u05ecv͎\fP\u00114\u001bW`Cj\u0011dYm\r5 t*Ֆ\u0011'"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T0V7c(", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T\"", "<dcDb9D2\u0015\u000evL6\r\u0016-e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001v\u0016=_MHq}\u001d\u0011w]G\u0011s9Lvp0L]>f_x\u001c\u0010!V{X;\u001a\u0003Y\u0017", "2hb=T;<V\u0015{\u0002^\u000bx\u0018+P\r2\rD\u007f\u0017$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PB0\\\u0002#VJQ(YYr\u001c\u0010!Vx[5\u001e\tXA1D", "@db=b5LS\u0004\f\u0005\\,\u000b\u00179r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016<XMDy4\t\"r_9\u0015q6[L", "AdaCX9\u001dO(zab:\f\t8e\r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u00171;xE\u001e\"G]H\u0003J0\\\u0006'PL[\u0002", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n];X*MW*\u0003\nr\n\u007f\t-k\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fOy\u0017\u0006t/>b}\u001eFq'2\\W\u0005T4-'rn?dm5Wv%VP_0kfP@\u0014\u0010`\u000e[\u0001", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7\u001f.\\UEx:g\u0014dp5\u0015m<[t'\u00115N;n\\\u007fCr\u000ei\n<5\u001d\u0012WAyUBA'Q+]\u000b7w\u000e\b\u0014\u000e~frB_\u001f\u0011w\u001f}I9qJW[\tKKN,5q\fj*f8:2\"u\"\u001d2/2\u0018\u0007O pUudnGwvG )zeWInUIJ\u000e\u001dU\u0004A\u0011Fap:\u0002)\u00024s2f\u0005Tva<h\u0001\u001d<eE%\"E@\u001dH\u0015PuzI\u0018q-ar\u001bl31'sop\u001eu\u0005g\u001f%4uh|F_\u0002<I9\u0011)F\bQ%w\u001f\u0011\u000f4viG?*X\u000b#:@-cZp\u0003s)\u001c;t9h\u000bO.mFM\u001c\tu\u000er\u0002cR\u001ctQ#7I|ha\u007f3:\u0002\u0011Wj\u0011UI\u0001bRs\u0019\u0016\"~\u0015\n\u001dIP@\u0004>\\$9FUGo\\-\u000b1O$\u0019pGe\u001d79\n\\I8\\\u00020\u001e}\fw\u0001&aMLK\u001cAX|,Ii)\u000fEcR\u000e;Q&3o\tsE[q;J{cCt", "2hb=T;<V\u0007|}^+\r\u0010/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016:]CIz\"\u001c\u0018h`I\u000ec9$", "@d_2g0MW*~iZ:\u0003v-h\u007f'\fG\u0001$", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V;J:b@p@\u0014\u0011j\u0015N8b", "@dc?l\u0014:\\\u0015\u0001zk", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001Z\u0016=ZW#g=\u001a\u0017hn\u000f", "@d`BX:M0#}\u000fF(\b\u0014/r", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001u\u00129XCH5\u0013\u001b\u0002h_C\u0014b:=\u0001\u0014GX^,jaOG\u0013&B\nY6\r\u0012=I/u\u001a", "Bn3.g(+S%\u000fzl;d\u0005:p\u007f5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001x#.XPEi4,#lj;PR6-r6C9N8lR\u0001L{\u000ee\u0019N8b", "1ta?X5M1#\u0007\u0003n5\u0001\u0007+t\u00042\u0005.\u0010\u0013&G", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBtr(]v|", "AdaCX9\u001dO(zbZ0\u0006\u0018+i\t(\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001[\u0016;^CHJ0-\u0011P]=\u0010r(R\u007f'T\"", "1n];X*MW#\bhm(\f\t\u0014o|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "AdaCX9\"R", "", "5dc X9OS&by", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc X9OS&by", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "AsP?g", "", "1n]3\\.", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6eCA\u0013", "1n]3\\./!", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ%&Q|\n>vn@f}!7z\u00167KC\u0005Y4+&hn\u0017\u0011l-Rx7TH]0f[c\fixX\u0018Vt\f\u0019b=3{@5\u001fQ(R\u0001Hr\u0005\u000b_\n7jyQ \u000eQ\u0003\u0016?/)uWYlWQJFf,t\u0019[,`DCyzw#*oT7Sy]\u001e|b\tkpG'D\u0016.G|_OUkd@~0t\u000fb|\u000eCT>2p6\u0006}\u00143i\u0005Ivm", "CoS.g,/!v\t\u0004_0~", "4kd@[", "AbW2W<ES\u0002~\u000em\n\u0007\u00117u\t,y<\u0010\u001b!PK\u001dKv-@h", "1n\\:h5BQ\u0015\u000e~h5Z\u00138t\u007f;\u000b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBdm5]v:V\"", "AbW2W<ES\u0002~\u000em\n\u0007\u00117u\t,y<\u0010\u001b!PK\u001dKv-@h<\u001eAu\u0010-aL7zA\u001a\u0013h[5\tc5]p4GSN(jR", "As^=66F[)\b~\\(\f\r9n", "=ac.\\5\u001c]\"\u007f~`<\n\u0005>i\n1", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "2hb=T;<Vwz\nZ", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CommunicationManagerImpl implements CommunicationManager {
    private Job connectionStateJob;
    private final NetworkConnectivityChecker connectivityChecker;
    private final CoroutineScope coroutineScope;
    private CommunicationState currentCommunicationState;
    private final RequestScheduler dispatchScheduler;
    private final DispatchableDataProvider dispatchableDataProvider;
    private final NetworkDataSource networkDataSource;
    private final CommunicationContextTaskScheduler repetitiveTaskScheduler;
    private final DbRecordsToRequestBodyMapperImpl requestBodyMapper;
    private final ResponseProcessor responseProcessor;
    private final RetryManager retryManager;
    private final ServerDataListener serverDataListener;
    private ServerDataMaintainer serverDataMaintainer;
    private volatile Integer serverId;
    private final ToDataRequestMapper toDataRequestMapper;

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$dispatchData$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return CommunicationManagerImpl.this.dispatchData(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C11171(Continuation<? super C11171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunicationManagerImpl.this.obtainConfiguration(this);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$start$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunicationManagerImpl.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<NetworkState> networkState = CommunicationManagerImpl.this.connectivityChecker.getNetworkState();
                final CommunicationManagerImpl communicationManagerImpl = CommunicationManagerImpl.this;
                this.label = 1;
                if (networkState.collect(new FlowCollector() { // from class: com.dynatrace.agent.communication.CommunicationManagerImpl.start.2.1
                    public final Object emit(NetworkState networkState2, Continuation<? super Unit> continuation) {
                        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "communication woken up by network state change to " + networkState2 + " while in communication state " + communicationManagerImpl.currentCommunicationState);
                        if (Intrinsics.areEqual(communicationManagerImpl.currentCommunicationState, CommunicationState.Offline.INSTANCE) && networkState2.isConnected()) {
                            communicationManagerImpl.scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(Duration.Companion.m10409getZEROUwyO8pc(), new CommunicationState.ConfigAwaiting(null, 1, null), null, null));
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((NetworkState) obj2, (Continuation<? super Unit>) continuation);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$stopCommunication$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11181(Continuation<? super C11181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunicationManagerImpl.this.new C11181(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Job job = CommunicationManagerImpl.this.connectionStateJob;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.label = 1;
                if (CommunicationManagerImpl.this.dispatchScheduler.stopExecution(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CommunicationManagerImpl.this.repetitiveTaskScheduler.stopExecution$com_dynatrace_agent_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.communication.CommunicationManagerImpl$updateV3Config$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C11191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerConfiguration $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11191(ServerConfiguration serverConfiguration, Continuation<? super C11191> continuation) {
            super(2, continuation);
            this.$config = serverConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunicationManagerImpl.this.new C11191(this.$config, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ServerDataMaintainer serverDataMaintainer = CommunicationManagerImpl.this.serverDataMaintainer;
                if (serverDataMaintainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serverDataMaintainer");
                    serverDataMaintainer = null;
                }
                this.label = 1;
                if (serverDataMaintainer.updateV3Config$com_dynatrace_agent_release(this.$config, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "received external config v3 update: " + this.$config);
            return Unit.INSTANCE;
        }
    }

    public CommunicationManagerImpl(NetworkDataSource networkDataSource, DispatchableDataProvider dispatchableDataProvider, ResponseProcessor responseProcessor, ServerDataListener serverDataListener, CoroutineScope coroutineScope, NetworkConnectivityChecker connectivityChecker) {
        Intrinsics.checkNotNullParameter(networkDataSource, "networkDataSource");
        Intrinsics.checkNotNullParameter(dispatchableDataProvider, "dispatchableDataProvider");
        Intrinsics.checkNotNullParameter(responseProcessor, "responseProcessor");
        Intrinsics.checkNotNullParameter(serverDataListener, "serverDataListener");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(connectivityChecker, "connectivityChecker");
        this.networkDataSource = networkDataSource;
        this.dispatchableDataProvider = dispatchableDataProvider;
        this.responseProcessor = responseProcessor;
        this.serverDataListener = serverDataListener;
        this.coroutineScope = coroutineScope;
        this.connectivityChecker = connectivityChecker;
        this.dispatchScheduler = new RequestScheduler(coroutineScope);
        this.repetitiveTaskScheduler = new CommunicationContextTaskScheduler(coroutineScope, 0L, 2, null);
        RetryManager retryManager = new RetryManager();
        this.retryManager = retryManager;
        DbRecordsToRequestBodyMapperImpl dbRecordsToRequestBodyMapperImpl = new DbRecordsToRequestBodyMapperImpl(1);
        this.requestBodyMapper = dbRecordsToRequestBodyMapperImpl;
        this.toDataRequestMapper = new ToDataRequestMapper(dbRecordsToRequestBodyMapperImpl, retryManager);
        this.currentCommunicationState = CommunicationState.Off.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r10
  0x0034: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v0 java.lang.Object) binds: [B:30:0x00cc, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object dispatchData(kotlin.coroutines.Continuation<? super com.dynatrace.agent.communication.CommunicationContext> r17) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationManagerImpl.dispatchData(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object obtainConfiguration(kotlin.coroutines.Continuation<? super com.dynatrace.agent.communication.CommunicationContext> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.dynatrace.agent.communication.CommunicationManagerImpl.C11171
            if (r0 == 0) goto L86
            r8 = r13
            com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1 r8 = (com.dynatrace.agent.communication.CommunicationManagerImpl.C11171) r8
            int r0 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L86
            int r0 = r8.label
            int r0 = r0 - r1
            r8.label = r0
        L13:
            java.lang.Object r1 = r8.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r8.label
            r7 = 2
            r10 = 1
            r6 = 0
            if (r0 == 0) goto L28
            if (r0 == r10) goto L64
            if (r0 != r7) goto L8c
            kotlin.ResultKt.throwOnFailure(r1)
        L27:
            return r1
        L28:
            kotlin.ResultKt.throwOnFailure(r1)
            com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider r0 = r12.dispatchableDataProvider
            com.dynatrace.agent.storage.db.EndPointInfo r4 = r0.getActiveEndpoint()
            com.dynatrace.agent.communication.ResponseProcessor r5 = r12.responseProcessor
            com.dynatrace.agent.communication.network.datasource.NetworkDataSource r11 = r12.networkDataSource
            com.dynatrace.agent.communication.network.datasource.ConfigRequest r3 = new com.dynatrace.agent.communication.network.datasource.ConfigRequest
            com.dynatrace.agent.communication.ServerDataMaintainer r0 = r12.serverDataMaintainer
            if (r0 != 0) goto L42
            java.lang.String r0 = "serverDataMaintainer"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r6
        L42:
            com.dynatrace.agent.communication.LocalServerData r2 = r0.localServerData$com_dynatrace_agent_release()
            com.dynatrace.agent.communication.RetryManager r0 = r12.retryManager
            com.dynatrace.agent.communication.network.model.RetryInfo r1 = r0.get(r4)
            java.lang.Integer r0 = r12.getServerId()
            r3.<init>(r4, r2, r1, r0)
            r8.L$0 = r12
            r8.L$1 = r4
            r8.L$2 = r5
            r8.label = r10
            java.lang.Object r1 = r11.executeConfigRequest(r3, r8)
            if (r1 != r9) goto L62
            return r9
        L62:
            r0 = r12
            goto L73
        L64:
            java.lang.Object r5 = r8.L$2
            com.dynatrace.agent.communication.ResponseProcessor r5 = (com.dynatrace.agent.communication.ResponseProcessor) r5
            java.lang.Object r4 = r8.L$1
            com.dynatrace.agent.storage.db.EndPointInfo r4 = (com.dynatrace.agent.storage.db.EndPointInfo) r4
            java.lang.Object r0 = r8.L$0
            com.dynatrace.agent.communication.CommunicationManagerImpl r0 = (com.dynatrace.agent.communication.CommunicationManagerImpl) r0
            kotlin.ResultKt.throwOnFailure(r1)
        L73:
            com.dynatrace.agent.communication.network.response.ResponseResult r1 = (com.dynatrace.agent.communication.network.response.ResponseResult) r1
            com.dynatrace.agent.communication.RetryManager r0 = r0.retryManager
            r8.L$0 = r6
            r8.L$1 = r6
            r8.L$2 = r6
            r8.label = r7
            java.lang.Object r1 = r5.handleConfigResponse(r1, r4, r0, r8)
            if (r1 != r9) goto L27
            return r9
        L86:
            com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1 r8 = new com.dynatrace.agent.communication.CommunicationManagerImpl$obtainConfiguration$1
            r8.<init>(r13)
            goto L13
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.communication.CommunicationManagerImpl.obtainConfiguration(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void flush() {
        CommunicationState communicationState = this.currentCommunicationState;
        if (!(communicationState instanceof CommunicationState.Waiting) || ((CommunicationState.Waiting) communicationState).getConnectionStatus() == CommunicationState.ConnectionStatus.PAUSE_AFTER_TOO_MANY_REQUESTS) {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "flush rejected because of state: " + communicationState);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "flush invoked");
            scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(Duration.Companion.m10409getZEROUwyO8pc(), communicationState, null, null));
        }
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public Integer getServerId() {
        return this.serverId;
    }

    public final void scheduleNextCommunicationAttempt$com_dynatrace_agent_release(CommunicationContext communicationContext) {
        Intrinsics.checkNotNullParameter(communicationContext, "communicationContext");
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "heartbeat: next communication attempt scheduled with " + communicationContext);
        this.currentCommunicationState = communicationContext.getCommState();
        this.repetitiveTaskScheduler.scheduleTask$com_dynatrace_agent_release(communicationContext.getCommState(), new CommunicationManagerImpl$scheduleNextCommunicationAttempt$1(this, null));
        if (communicationContext.getCommState() instanceof CommunicationState.Off) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new CommunicationManagerImpl$scheduleNextCommunicationAttempt$2(this, communicationContext, null), 3, null);
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void setServerId(Integer num) {
        this.serverId = num;
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public Object start(ServerConfigurationV4 serverConfigurationV4, ServerConfiguration serverConfiguration, Continuation<? super Unit> continuation) {
        LocalServerData localServerData = new LocalServerData(AgentState.Disabled.INSTANCE, serverConfigurationV4, serverConfiguration);
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "launching BPv4 communication with initial " + localServerData);
        this.serverDataMaintainer = new ServerDataMaintainer(localServerData, this.serverDataListener);
        this.connectionStateJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass2(null), 3, null);
        scheduleNextCommunicationAttempt$com_dynatrace_agent_release(new CommunicationContext(Duration.Companion.m10409getZEROUwyO8pc(), new CommunicationState.ConfigAwaiting(CommunicationState.ConnectionStatus.READY), null, null));
        return Unit.INSTANCE;
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void stopCommunication() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C11181(null), 3, null);
        this.currentCommunicationState = CommunicationState.Off.INSTANCE;
        Utility.devLog(OneAgentLoggingKt.TAG_COMMUNICATION, "terminated agent communication");
    }

    @Override // com.dynatrace.agent.communication.CommunicationManager
    public void updateV3Config(ServerConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.serverDataMaintainer != null) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C11191(config, null), 3, null);
        }
    }
}
