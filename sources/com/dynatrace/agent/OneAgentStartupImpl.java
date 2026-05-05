package com.dynatrace.agent;

import com.dynatrace.agent.communication.CommunicationManager;
import com.dynatrace.agent.exitreason.ExitReasonProcessor;
import com.dynatrace.agent.metrics.MetricsRepository;
import com.dynatrace.agent.storage.db.EndPointInfo;
import com.dynatrace.agent.storage.db.EventDatabaseDataSource;
import com.dynatrace.agent.storage.preference.EndPointInfoDataSource;
import com.dynatrace.agent.storage.preference.ServerConfigurationDataSource;
import com.dynatrace.android.agent.conf.ConfigurationPublisher;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xk\u0012\u0017˰JoU3UڎCʠvҚf\u0005N1b\u0006\n\t\u000f\u001aBH>w\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u000bN$\u000f$tg|=XpkBG#1rRR5iH|{\u0018VX5\u0019\u000faL8P;C#=S1\u0016b_M\u0013Wqk\u0016ص+)1[\u0002j~f\u000e(-+}\"\u000ev4r\u001dQ\u000f#m? oYP&(&{Rȡ>Ǭ\u0012\u0006/Ξ~9(h \u000eawIԢBг\u0006^JȕKmD\u001b=\u007fa0\u0010ӘhЂe;!\u05cb\b\b\u0013\u00136#/uwſV\u05f8d\u0015#ƘH]?YX=vW`Բ?ъ\bpj̣z\u0010>Q\u0018/*\u001c\u0005ϒ'ھ_9+ܩ<\u000eVP\u007fv3m?\u05c8kʐL@*ÂfC8\u0017$Zrs[ߛRԜ\\,\u0019۳l`\u0015\u000e \u0013NmN˖#ٚ\u0014NWŖȲne"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxy6XJ\u0011", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\nj \u0017#q\u000eE\u0006\u0013DU\u000b/Gxk", "1n\\:h5BQ\u0015\u000e~h5d\u00058a\u0002(\t", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001K 6USDo2\u001a$lkBn_5Jx'T\"", "3wXAE,:a#\bek6z\t=s\n5", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001*\u001bV|\u000e8\u0005/>#]3;|\u0003.IQEt\u001f+\u001ffaG\u0015m9$", "3uT;g\u000b:b\u0015{vl,[\u0005>am2\fM~\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\rIR7h0,\u0015G]H\u0003Q6^\u0004%G\"", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1Z<\u0010\u0013\u0005Q\u007f\u001b:v", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r)kA/\u0015u?C\u0010d0P\u00074C[R6e1nL\u0010\u007fd\u001e[)\rZ", "3mS\u001db0Gb|\b{h\u000bx\u0018+S\n8\t>\u0001", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@0BY~ Dm\u001f,M\r\u001bt3\t\u001fljHjl-XU#VH<6l_p=i", "/bc6i,\u001e\\\u0018i\u0005b5\f", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#])6X 2VR\u001ft5(j", "3wc2e5:Z\u0007|\u0005i,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]3\\.N`\u0015\u000e~h5g\u0019,l\u00046~@\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i\u0015w\u001f/QEKx0-\u0019rj$\u0017`3R\u0005*GY$", ";dc?\\*L@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\r5h\u000b$5{\u0003.XMIoC(\"|7", "\nh]6g\u0005", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0015!Ow\u001eEz#1h\u0002*@7s8UKKt8\u001c\u0011weC\u0010K(Wr)GY$\u0013Z\\z\u0007\u0013&c\n]8\t\u0003Y\u000b pD@.Q,\\\u0006Ju\u0001\b$\u0018>4PUZ\u001f4y\u0011\u0004K2SSc]yUOOo\u007fK\ni%&9N-\u0010\u0001&\u0017fPw\u0006}S\u001a\u0002\u001c\bvqT\u0015|8m=j%&Vo^KS#.Gxs 27p:p\u001b\u000eD74dZ2e\"F(w)5XP4\"4<\\;Mc~{\b\u001cw)n\u0004\u0010b~<&efcU\u000f\u0010[\u0017%#al\u00127_cHRp\u0019)V\f>j}\u001f\u0012e |a7M+a~\u001aF+ i\u0019L\u0002z!\u0018=#9W\u000f2&a7V\"RvG\u0016\tUE\u0015:S\u001dmLrhWx\"6BpR \u001eU@\u007fa'x\u0011 \u0013|\u001az\u000b}yOw6h\f#Ga\u0002at8\u0007v`\u001e\u0017g\u0002\u0018!-:\u0011\u001cN}h\u0005#\u0017}Wgy^=G7l=ERy\u0006EdUZ#`\\\u001f3Q\u001eB*r Oe\u0004DNw\u000e\u000eM\t\u0003 &<5yP\u001fU\u00199q\fapm'7d\u007flW\u0012\\ jFHcyd.\u0012\u001a&E2\u0011N\u00012R\u0004LR\u007f |e\b]\u00076ZG\u0007_I~+*,\"\u0003\u000fT\u0015\"E(1|w\u0002t\u0018.uZ\u001e\u001b\u0002R=\u0016\u00187\u00178))J]E\u0005x\u0007RrSh,%\t=l\u0001{<?d\u0004!@\u00019}\u001d+^", "AsP?g", "", "AdaCX9\u001c]\"\u007f~`<\n\u0005>i\n1l\u000e", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@#?b~i%m#?MP\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class OneAgentStartupImpl implements OneAgentStartup {
    private final EndPointInfo activeEndPoint;
    private final CommunicationManager communicationManager;
    private final ConfigurationPublisher configurationPublisher;
    private final EndPointInfoDataSource endPointInfoDataSource;
    private final EventDatabaseDataSource eventDatabaseDataSource;
    private final ExitReasonProcessor exitReasonProcessor;
    private final CoroutineScope externalScope;
    private final MetricsRepository metricsRepository;
    private final ServerConfigurationDataSource serverConfigurationDataSource;

    /* JADX INFO: renamed from: com.dynatrace.agent.OneAgentStartupImpl$start$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"r\u001a"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerConfiguration $serverConfigurationV3;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ServerConfiguration serverConfiguration, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$serverConfigurationV3 = serverConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OneAgentStartupImpl.this.new AnonymousClass1(this.$serverConfigurationV3, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00e9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0105 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0129 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.OneAgentStartupImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public OneAgentStartupImpl(CommunicationManager communicationManager, ExitReasonProcessor exitReasonProcessor, EventDatabaseDataSource eventDatabaseDataSource, ServerConfigurationDataSource serverConfigurationDataSource, EndPointInfoDataSource endPointInfoDataSource, EndPointInfo activeEndPoint, CoroutineScope externalScope, ConfigurationPublisher configurationPublisher, MetricsRepository metricsRepository) {
        Intrinsics.checkNotNullParameter(communicationManager, "communicationManager");
        Intrinsics.checkNotNullParameter(exitReasonProcessor, "exitReasonProcessor");
        Intrinsics.checkNotNullParameter(eventDatabaseDataSource, "eventDatabaseDataSource");
        Intrinsics.checkNotNullParameter(serverConfigurationDataSource, "serverConfigurationDataSource");
        Intrinsics.checkNotNullParameter(endPointInfoDataSource, "endPointInfoDataSource");
        Intrinsics.checkNotNullParameter(activeEndPoint, "activeEndPoint");
        Intrinsics.checkNotNullParameter(externalScope, "externalScope");
        Intrinsics.checkNotNullParameter(configurationPublisher, "configurationPublisher");
        Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.communicationManager = communicationManager;
        this.exitReasonProcessor = exitReasonProcessor;
        this.eventDatabaseDataSource = eventDatabaseDataSource;
        this.serverConfigurationDataSource = serverConfigurationDataSource;
        this.endPointInfoDataSource = endPointInfoDataSource;
        this.activeEndPoint = activeEndPoint;
        this.externalScope = externalScope;
        this.configurationPublisher = configurationPublisher;
        this.metricsRepository = metricsRepository;
    }

    @Override // com.dynatrace.agent.OneAgentStartup
    public void start(ServerConfiguration serverConfigurationV3) {
        Intrinsics.checkNotNullParameter(serverConfigurationV3, "serverConfigurationV3");
        BuildersKt__Builders_commonKt.launch$default(this.externalScope, null, null, new AnonymousClass1(serverConfigurationV3, null), 3, null);
    }
}
