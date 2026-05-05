package com.statsig.androidsdk;

import com.google.gson.Gson;
import com.statsig.androidsdk.ExposureKey;
import io.sentry.clientreport.DiscardedEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŁ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~08\u001aw\rfr9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011O\\\u0006onPZ\u0013C%\u0006\u001ex\u0001,Qǁ\u0001](\u000f:Bu?;M\u0006=Aś|6\u001b :\"Ny\r\u0001(1P\u0010|zKK\"\u00128ϋx:h\rUĨ\"\u0012\u0014a(\u0001$\\oNDQtҗB/1\u0003qBT.g0\u0013M\u0015FZ(\u0015vw\u001e3@=5\u001d%i\u0003\u000fRa@\u000b?\u007fL\rh5I3IyY>X\u0016\u0014\u001d+U\u000fer4x\rQv\f/+UgQִ$ߊ(z*\f|Q\u001e\n5HF-Hg\u0018\u0012Av\u000bSnS\u0012bP\u0004\u0013ad\u001a5\u0004A0Q\u001b\u0015Wq?'UO{3\u0015.'\u000fw9[\u0003\u0018p\u0019)_\u0010Q_]PKNN\u0018fUu\u0014rr\u0002X\u0007FF.=ɨ\u0015.%4\u007f\nGD9w\u0012JTg%\bpjci\u0001KnD\u001f&EM!\u0018jFt\u0005\u001aSdZ<\u0011{\u001f\u0003).\f!DtwjFk\u0010\u0017[v\u0010\u0003M\f1U3t_qn\u001a\u0011 ?l\\MQ\u00127(R?#Mfz\u0005\u0007\u000e\tʹJʐ[̥ϒ6Hx;@\u0013Rz$\u0013`f\" BYI\u0019\u000b'\u000fҘ\\\u05cc@ґȤcZv>GdAS\u001biR\u001c9\tV\\~ \u007fz_++\u0012jQO\u0004M\u0019T|RlB0;\u0007-v0Ku\u0001_L\u001bK&Y\nV.\u001ag[_A!3\u0017)`'uiZ%}Q{9W~\u000b-';\u00171\u0018\fx(D`\u0019\u0003\u007fX%X\u000f^!-8h\u000e\u001eyF)l,:\u0019\u0015VI!*\n@\\`\u0015\u0005M!U\u0005}\\\u00155[FW3$3,A%omu\u007f0\nb=)\u0005g\u0014,\u0012\u0019\u001e \u007f\u001abAF\u007fq\u0001T!Rv3FV)\u0010\bp\fd\u0011A\bYd\u001fYhQ\u0019o\u0016f5Q=td\u001dR\u0013\u001e@d2mN\fC,9ڎG%\u001f\u0011\u001c\u001c{2c\\9\\?\u000e\u0019AIn@Mm*d\u001ez\u000f@\b\u0004\u0018d\ni*5P\u0017mL<L\n\u001bC\u0003l\u0016\u0014\u000b\u0002\\^=\u0016HA\"x\u001d\u000e\u001d|j!`\u0005\u000fl)/8L\u0017\u000faC)9?Q\u0006F\u0003I*2Ib+V3j}&-ގiٕSڣЬ,X\u000f6\u0016iQM\u001a62J\u007fԙmƴ\u00108 ӽmN&\u001bQQ?`Mѭ`κYdVІG\u001et]f\"W\u000bQՇ\u0010ۖ\u000e\u000f\u0013ÿ \u0005}rER^yGCH\u0013EU\u007fܐ\u0018ƔgF#ҎVI;Par2<$Yi:,\u001cN4}\u05f7vֈ`W\u0016ўZq)G.y&d\u0012\tAS6\u0003\\XKҝ\fڷ\f6W\u05ce\u0004\u000e!tqk&8\u0017Ӓ-˭\nBSЕI\"q\u0005{ze\r\u0013f_p\np=PK$Uf\u0005\u0080Zŷ>\u0011[ݰ))\u000e0-2/8\u0018bW\u0013_exp\u001aj\n&\u0002ԝwˮe18ܼn\n-{\u000e\u0004XW~׀=ܑQ>lӷ-xPt&^\u0019F;É\u000eì\u0018|\u0007Ĝ/\u001d!9^rLj\u0006б\u001b۵_\rO֜W\u0010SP>!_Z\u0016א9כ\u000fo0ϓa\u000fHk\r\u007fXL_ۅ\u0002\u05ff0-N§\u000e&5x<m\u0013#|ɗGђF\b4ֶÃ\u00111b8&Uѷ\u001ej"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7@\b\"9m#\u0004", "", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "AcZ\u0018X@", "", "/oX", "AsPAf0@;\u0019\u000ev](\f\u0005", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "AsPAf0@<\u0019\u000e\rh9\u0003", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4#", "AsPAf0@C'~\b", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "2hP4a6Lb\u001d|\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "4`[9U(<Y\t\f\u0002l", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|3IT75;\u001a\u001ej+'\u0016p0Wx|.QJ=X\u001cy9\u001d\u0014${]8\u0011\u000e[\u0017\u000blN?h\u0016;E\u0011Il\u0003U\u0012\u00174wzFU\u001eF\u007f^cP%wT]aaGPAa&s\b5\u0004ZDBm\"\u0001\u0015*vT0Sw\\\u0010\u007f\\}fuF\u001fD&3:|iJGXUK\u00071,QQ^\u0010<`>9\u0004)\u0013B.8.\u0001Tf%Hbw#+b\u000b\u001552K!CMS\u0004lKcO\u001dk\u0010WpD-(sie\u0012\u000b\u0010\\$e9`m\u007f=\u001cdBEq\u001e1T\u000eFY\bjo\f ~a\u0013S*X\bcWH0nfFs", "3uT;g:", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>hd$@s\u0016-9S;{4s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.y\u0010\u001c\b%>hS", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "5r^;", "\u001ab^:\".H]\u001b\u0006z(.\u000b\u00138/a6\u0006IV", ":nV4X+\u001ef$\t\tn9|\u0017", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!Pm\u001eI\u0004%>h`\u001cEp}*X\u0019", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0003\u0019F\u00055BYc KC", "", "<n]\u0012k7Ha\u0019}Xa,z\u000f=", "Ah]4_,-V&~v]\u000b\u0001\u0017:a\u000f&~@\u000e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0014\u0017\u0015W~\u0018IT/Bc\u000e/;v\u0016\rQQFgC\u001c\u0018hn\u000f", "Bh\\2e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "/cS\u001aT5NO _\u0002Z.", "", ";dc.W(MO", "7r<.a<:Z", "", "/cS\u001bb5\u001ef$\t\t^+Z\f/c\u0006", "", "1n]3\\.'O!~", "/cS\u001bb5\u001ef$\t\t^+Z\f/c\u00066[Q\u0001 &", "4kd@[", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ":nV", "3uT;g", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011V\u0018>V65b\ru\u001es =TGD52(\"rqH\u000bl,\\@\u0005QU]0ebnL\u0018\u001ccc\u0012\u0012\u0012\u0001j=mu@@!Q\u0016F\u0007;f\u0010a", ":nV\u0011\\(@\\#\r\nb*\u000b", "=uT?e0=Sv\t\u0004m,\u0010\u0018", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u0017Kv8DH\u0012+7C", ":nV\u0012k7Ha)\fz", "<`\\2", "1n]3\\.", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&\u0004\u00178~)37\b)8q\u0018\u0004", "CrT?", "5`c2", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`(o\nK\u000725;y/7C", ":nV\u0019T@>`x\u0012\u0006h:\r\u0016/", "@t[2<\u000b", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "", "/k[<V(MS\u0018^\u000ei,\n\r7e\t7", ">`a.`,MS&gvf,", "7r4Ec3BQ\u001d\u000eeZ9x\u0011/t\u007f5", "2dc.\\3L", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok$4H7|0g%we@PK(YL\u000eEVVujanL\"\u0016\\WJ4\f\u0012cE#|C=hu;E\u0011Il\u0003{$\u000eB@WGR!CC\u001cqJ+24hl}PC\u001bI/`\u001d[fc6C&]_((lY0_p:\u000f|ZCuvC(\t<&\bidERyY;\u0003&%\u0015[\t\u000e9hp:x7\r\u0013*E`\tRum3\"i", ";`Z270:U\"\t\tm0z\u0017\u000fv\u007f1\u000b", "1n]AX?M", ";`a8X9L", "", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2\u000b", "AsPAf0@=$\u000e~h5\u000b", "=mD=W(MS\t\rzk", "Ag^B_+%]\u001b^\u000ei6\u000b\u0019<e", "9dh", "AgdAW6P\\", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigLogger {
    private final String api;
    private final CoroutineScope coroutineScope;
    private final Diagnostics diagnostics;
    private ConcurrentLinkedQueue<LogEvent> events;
    private final ExecutorService executor;
    private final List<String> fallbackUrls;
    private final Gson gson;
    private final ConcurrentHashMap<ExposureKey, Long> loggedExposures;
    private ConcurrentHashMap<String, Long> nonExposedChecks;
    private final String sdkKey;
    private final ExecutorCoroutineDispatcher singleThreadDispatcher;
    private final StatsigMetadata statsigMetadata;
    private final StatsigNetwork statsigNetwork;
    private final StatsigUser statsigUser;
    private final Job timer;

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$flush$2, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigLogger.this.new AnonymousClass2(continuation);
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
                StatsigLogger.this.addNonExposedChecksEvent();
                if (StatsigLogger.this.events.size() == 0) {
                    return Unit.INSTANCE;
                }
                String strValueOf = String.valueOf(StatsigLogger.this.events.size());
                ArrayList arrayList = new ArrayList(StatsigLogger.this.events);
                StatsigLogger.this.events = new ConcurrentLinkedQueue();
                StatsigNetwork statsigNetwork = StatsigLogger.this.statsigNetwork;
                String str = StatsigLogger.this.api;
                String json = StatsigLogger.this.gson.toJson(new LogEventData(arrayList, StatsigLogger.this.statsigMetadata));
                Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(LogEventData(flushEvents, statsigMetadata))");
                this.label = 1;
                if (statsigNetwork.apiPostLogs(str, json, strValueOf, StatsigLogger.this.fallbackUrls, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$log$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12392 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LogEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12392(LogEvent logEvent, Continuation<? super C12392> continuation) {
            super(2, continuation);
            this.$event = logEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigLogger.this.new C12392(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                StatsigLogger.this.events.add(this.$event);
                if (StatsigLogger.this.events.size() >= 50) {
                    this.label = 1;
                    if (StatsigLogger.this.flush(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logDiagnostics$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LogEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LogEvent logEvent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = logEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StatsigLogger.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (StatsigLogger.this.log(this.$event, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logExposure$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FeatureGate $gate;
        final /* synthetic */ boolean $isManual;
        final /* synthetic */ String $name;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12401(StatsigUser statsigUser, String str, FeatureGate featureGate, StatsigLogger statsigLogger, boolean z2, Continuation<? super C12401> continuation) {
            super(2, continuation);
            this.$user = statsigUser;
            this.$name = str;
            this.$gate = featureGate;
            this.this$0 = statsigLogger;
            this.$isManual = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12401(this.$user, this.$name, this.$gate, this.this$0, this.$isManual, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.GATE_EXPOSURE);
                logEvent.setUser(this.$user);
                Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("gate", this.$name), TuplesKt.to("gateValue", String.valueOf(this.$gate.getValue())), TuplesKt.to("ruleID", this.$gate.getRuleID()), TuplesKt.to(DiscardedEvent.JsonKeys.REASON, this.$gate.getEvaluationDetails().getReason().toString()), TuplesKt.to("time", String.valueOf(this.$gate.getEvaluationDetails().getTime())));
                this.this$0.addManualFlag(mapMutableMapOf, this.$isManual);
                logEvent.setMetadata(mapMutableMapOf);
                logEvent.setSecondaryExposures(this.$gate.getSecondaryExposures());
                this.label = 1;
                if (this.this$0.log(logEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logExposure$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12412 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DynamicConfig $config;
        final /* synthetic */ boolean $isManual;
        final /* synthetic */ String $name;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12412(StatsigUser statsigUser, String str, DynamicConfig dynamicConfig, StatsigLogger statsigLogger, boolean z2, Continuation<? super C12412> continuation) {
            super(2, continuation);
            this.$user = statsigUser;
            this.$name = str;
            this.$config = dynamicConfig;
            this.this$0 = statsigLogger;
            this.$isManual = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12412(this.$user, this.$name, this.$config, this.this$0, this.$isManual, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12412) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.CONFIG_EXPOSURE);
                logEvent.setUser(this.$user);
                Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("config", this.$name), TuplesKt.to("ruleID", this.$config.getRuleID()), TuplesKt.to(DiscardedEvent.JsonKeys.REASON, this.$config.getEvaluationDetails().getReason().toString()), TuplesKt.to("time", String.valueOf(this.$config.getEvaluationDetails().getTime())));
                Boolean rulePassed = this.$config.getRulePassed();
                if (rulePassed != null) {
                    mapMutableMapOf.put("rulePassed", String.valueOf(rulePassed.booleanValue()));
                }
                this.this$0.addManualFlag(mapMutableMapOf, this.$isManual);
                logEvent.setMetadata(mapMutableMapOf);
                logEvent.setSecondaryExposures(this.$config.getSecondaryExposures$android_sdk_release());
                this.label = 1;
                if (this.this$0.log(logEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$logLayerExposure$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ Map<String, String>[] $secondaryExposures;
        final /* synthetic */ StatsigUser $user;
        int label;
        final /* synthetic */ StatsigLogger this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12421(StatsigUser statsigUser, Map<String, String> map, Map<String, String>[] mapArr, StatsigLogger statsigLogger, Continuation<? super C12421> continuation) {
            super(2, continuation);
            this.$user = statsigUser;
            this.$metadata = map;
            this.$secondaryExposures = mapArr;
            this.this$0 = statsigLogger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12421(this.$user, this.$metadata, this.$secondaryExposures, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                LogEvent logEvent = new LogEvent(StatsigLoggerKt.LAYER_EXPOSURE);
                logEvent.setUser(this.$user);
                logEvent.setMetadata(this.$metadata);
                logEvent.setSecondaryExposures(this.$secondaryExposures);
                this.label = 1;
                if (this.this$0.log(logEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigLogger$shutdown$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    static final class C12431 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C12431(Continuation<? super C12431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return StatsigLogger.this.shutdown(this);
        }
    }

    public StatsigLogger(CoroutineScope coroutineScope, String str, String str2, StatsigMetadata statsigMetadata, StatsigNetwork statsigNetwork, StatsigUser statsigUser, Diagnostics diagnostics, List<String> list) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-7389));
        short sXd2 = (short) (C1633zX.Xd() ^ (-2868));
        int[] iArr = new int["?\u000f)]zp|9Cx\u007f#[g".length()];
        QB qb = new QB("?\u000f)]zp|9Cx\u007f#[g");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Intrinsics.checkNotNullParameter(coroutineScope, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str, ZO.xd("\u0017kKmb\u0019", (short) (OY.Xd() ^ 16743), (short) (OY.Xd() ^ 23785)));
        Intrinsics.checkNotNullParameter(str2, C1626yg.Ud("\u001cG`", (short) (ZN.Xd() ^ 9563), (short) (ZN.Xd() ^ 13550)));
        Intrinsics.checkNotNullParameter(statsigMetadata, Ig.wd("T)a^K\r1\u001c\u000e^C2\u0001\u0010\u0007", (short) (FB.Xd() ^ 22110)));
        short sXd3 = (short) (C1499aX.Xd() ^ (-10237));
        int[] iArr2 = new int["\u0010`O\u000b\u001ad6}W\u000b\u0004\"sn".length()];
        QB qb2 = new QB("\u0010`O\u000b\u001ad6}W\u000b\u0004\"sn");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(statsigNetwork, new String(iArr2, 0, i3));
        Intrinsics.checkNotNullParameter(statsigUser, C1561oA.Qd("\u000b\u000bv\t\u0007{xe\u0003s\u007f", (short) (C1633zX.Xd() ^ (-6502))));
        Intrinsics.checkNotNullParameter(diagnostics, C1593ug.zd("7=6=EGLND?P", (short) (ZN.Xd() ^ 10414), (short) (ZN.Xd() ^ 27499)));
        this.coroutineScope = coroutineScope;
        this.sdkKey = str;
        this.api = str2;
        this.statsigMetadata = statsigMetadata;
        this.statsigNetwork = statsigNetwork;
        this.statsigUser = statsigUser;
        this.diagnostics = diagnostics;
        this.fallbackUrls = list;
        this.gson = StatsigUtil.INSTANCE.getGson$android_sdk_release();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.od("C9M7\u0003IG;=}2=;/@<;-5:r\t;'$53-//", (short) (C1580rY.Xd() ^ (-27903)))).getDeclaredMethod(C1561oA.Kd("\u0011\t\u001cx\u0010\u0016\u0010\u0016\u0010\u007f\u0015 \u0014\u0011\u0015v+\u0019\u0018++'+", (short) (FB.Xd() ^ 25935)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ExecutorService executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            this.executor = executorService;
            Intrinsics.checkNotNullExpressionValue(executorService, Wg.Zd("Y\r%H\u0007\t2Y", (short) (C1633zX.Xd() ^ (-12907)), (short) (C1633zX.Xd() ^ (-24034))));
            this.singleThreadDispatcher = ExecutorsKt.from(executorService);
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            this.timer = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new StatsigLogger$timer$1(this, null), 2, null);
            this.events = new ConcurrentLinkedQueue<>();
            this.loggedExposures = new ConcurrentHashMap<>();
            this.nonExposedChecks = new ConcurrentHashMap<>();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public /* synthetic */ StatsigLogger(CoroutineScope coroutineScope, String str, String str2, StatsigMetadata statsigMetadata, StatsigNetwork statsigNetwork, StatsigUser statsigUser, Diagnostics diagnostics, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, str2, statsigMetadata, statsigNetwork, statsigUser, diagnostics, (i2 & 128) != 0 ? null : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> addManualFlag(Map<String, String> map, boolean z2) {
        if (z2) {
            map.put("isManualExposure", "true");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addNonExposedChecksEvent() {
        if (this.nonExposedChecks.isEmpty()) {
            return;
        }
        LogEvent logEvent = new LogEvent(StatsigLoggerKt.NON_EXPOSED_CHECKS_EVENT);
        logEvent.setMetadata(MapsKt.mapOf(TuplesKt.to("checks", this.gson.toJson(this.nonExposedChecks))));
        this.events.add(logEvent);
        this.nonExposedChecks.clear();
    }

    public static /* synthetic */ void logDiagnostics$default(StatsigLogger statsigLogger, ContextType contextType, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            contextType = null;
        }
        statsigLogger.logDiagnostics(contextType);
    }

    private final LogEvent makeDiagnosticsEvent(ContextType contextType, Collection<Marker> collection, Map<String, ? extends Object> map) {
        LogEvent logEvent = new LogEvent(StatsigLoggerKt.DIAGNOSTICS_EVENT);
        logEvent.setUser(this.statsigUser);
        Pair[] pairArr = new Pair[3];
        String string = contextType.toString();
        if (string == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
        pairArr[0] = TuplesKt.to("context", lowerCase);
        pairArr[1] = TuplesKt.to("markers", this.gson.toJson(collection));
        pairArr[2] = TuplesKt.to("statsigOptions", this.gson.toJson(map));
        logEvent.setMetadata(MapsKt.mapOf(pairArr));
        return logEvent;
    }

    private final boolean shouldLogExposure(ExposureKey exposureKey) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l2 = this.loggedExposures.get(exposureKey);
        if (l2 != null && jCurrentTimeMillis - l2.longValue() < 600000) {
            return false;
        }
        this.loggedExposures.put(exposureKey, Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    public final void addNonExposedCheck(String configName) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Long l2 = this.nonExposedChecks.get(configName);
        if (l2 == null) {
            l2 = 0L;
        }
        this.nonExposedChecks.put(configName, Long.valueOf(l2.longValue() + 1));
    }

    public final Object flush(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.singleThreadDispatcher, new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object log(LogEvent logEvent, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.singleThreadDispatcher, new C12392(logEvent, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void logDiagnostics(ContextType contextType) {
        if (contextType == null) {
            contextType = this.diagnostics.getDiagnosticsContext();
        }
        Queue<Marker> markers = this.diagnostics.getMarkers(contextType);
        if (markers.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new AnonymousClass1(makeDiagnosticsEvent(contextType, markers, contextType == ContextType.INITIALIZE ? this.diagnostics.getStatsigOptionsLoggingCopy() : null), null), 2, null);
        Diagnostics.clearContext$default(this.diagnostics, null, 1, null);
    }

    public final void logExposure(String name, DynamicConfig config, StatsigUser user, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(user, "user");
        if (shouldLogExposure(new ExposureKey.Config(name, config.getRuleID(), config.getEvaluationDetails().getReason()))) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new C12412(user, name, config, this, z2, null), 2, null);
        }
    }

    public final void logExposure(String name, FeatureGate gate, StatsigUser user, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gate, "gate");
        Intrinsics.checkNotNullParameter(user, "user");
        if (shouldLogExposure(new ExposureKey.Gate(name, gate.getRuleID(), gate.getEvaluationDetails().getReason(), gate.getValue()))) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new C12401(user, name, gate, this, z2, null), 2, null);
        }
    }

    public final void logLayerExposure(String configName, String ruleID, Map<String, String>[] secondaryExposures, StatsigUser statsigUser, String allocatedExperiment, String parameterName, boolean z2, EvaluationDetails details, boolean z3) {
        Intrinsics.checkNotNullParameter(configName, "configName");
        Intrinsics.checkNotNullParameter(ruleID, "ruleID");
        Intrinsics.checkNotNullParameter(secondaryExposures, "secondaryExposures");
        Intrinsics.checkNotNullParameter(allocatedExperiment, "allocatedExperiment");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        Intrinsics.checkNotNullParameter(details, "details");
        if (shouldLogExposure(new ExposureKey.Layer(configName, ruleID, allocatedExperiment, parameterName, z2, details.getReason()))) {
            Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("config", configName), TuplesKt.to("ruleID", ruleID), TuplesKt.to("allocatedExperiment", allocatedExperiment), TuplesKt.to("parameterName", parameterName), TuplesKt.to("isExplicitParameter", String.valueOf(z2)), TuplesKt.to(DiscardedEvent.JsonKeys.REASON, details.getReason().toString()), TuplesKt.to("time", String.valueOf(details.getTime())));
            addManualFlag(mapMutableMapOf, z3);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new C12421(statsigUser, mapMutableMapOf, secondaryExposures, this, null), 2, null);
        }
    }

    public final void onUpdateUser() {
        this.loggedExposures.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shutdown(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.statsig.androidsdk.StatsigLogger.C12431
            if (r0 == 0) goto L43
            r4 = r6
            com.statsig.androidsdk.StatsigLogger$shutdown$1 r4 = (com.statsig.androidsdk.StatsigLogger.C12431) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L43
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L7f
            java.lang.Object r4 = r4.L$0
            com.statsig.androidsdk.StatsigLogger r4 = (com.statsig.androidsdk.StatsigLogger) r4
            kotlin.ResultKt.throwOnFailure(r1)
        L27:
            java.util.concurrent.ExecutorService r0 = r4.executor
            r0.shutdown()
            goto L49
        L2d:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.Job r1 = r5.timer
            r0 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r1, r0, r2, r0)
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r0 = r5.flush(r4)
            if (r0 != r3) goto L41
            return r3
        L41:
            r4 = r5
            goto L27
        L43:
            com.statsig.androidsdk.StatsigLogger$shutdown$1 r4 = new com.statsig.androidsdk.StatsigLogger$shutdown$1
            r4.<init>(r6)
            goto L13
        L49:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L66
            r0 = r4
            com.statsig.androidsdk.StatsigLogger r0 = (com.statsig.androidsdk.StatsigLogger) r0     // Catch: java.lang.Throwable -> L66
            java.util.concurrent.ExecutorService r3 = r4.executor     // Catch: java.lang.Throwable -> L66
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L66
            r0 = 3
            boolean r0 = r3.awaitTermination(r0, r2)     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L5f
            java.util.concurrent.ExecutorService r0 = r4.executor     // Catch: java.lang.Throwable -> L66
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L66
        L5f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)     // Catch: java.lang.Throwable -> L66
            goto L71
        L66:
            r1 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r0 = kotlin.Result.m8980constructorimpl(r0)
        L71:
            java.lang.Throwable r0 = kotlin.Result.m8983exceptionOrNullimpl(r0)
            if (r0 == 0) goto L7c
            java.util.concurrent.ExecutorService r0 = r4.executor
            r0.shutdownNow()
        L7c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.statsig.androidsdk.StatsigLogger.shutdown(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
