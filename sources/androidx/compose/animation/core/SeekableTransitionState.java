package androidx.compose.animation.core;

import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&˛\bDZc|\u0004G\u00078\u000bDB\u0007\":\u0019\u007f\u0007tjA0JiP.hS2\u000fq~<$q$yCAV\"}8\tWNmlvJh\u0010K\u000f\f\u001d\u0001jBI]xc\u0012\u00172XoG\u074cUoS9ht<\r(288\u0002\u0005\u0007\u001c2H&v\u0003CQ$\u00185V\u0081X)5O\u000b܅ \u0005n&\u0011 lg\u00155vl\u0016:\u0006zCtRR5`H|\u0004εТX'\u001bx**9zO5C+\u001a\u038bEқ_?\u0011z:e\u0013%?'YO$]<X\u000eC-+\u0006Օ\u000e\u0001,\\\u0013\u000fx\u00147-_cyo$'&9BȥzǬ\u0012\u00065\bv9(' \u000eaz9Ԣ~г\u0006^P;CgDX=\u007fa1\u007f\u001b/Wo}1Ne\u0002K\rf.\u000f29[\u0003\u0014'ٽôXwWu\u001aKK\u000ef\n\bC4ՎͲf\u00020Jx]\u000ev\u0014\u0011\\\u001dU;i\u0002;!\u001a\u0019xHu@\u001d`\u0017X0R\u0011L09.7X\u000fRɱ\u0003\u0081\tk^\u0010!L\u001f\u00194T5\u00048\u0019&[\u0006]9%>m\u007fnoj[\r\"%eω}ձ-«\u0012WG+{;_1(a\u0001|Z?\u0005v\u0013'~B\u0002\u0012\u000b`6QJH!ݘ>Ԃ\u0003«\u0010\u0013@\u000f:5B|I\u0019\u000b\u001bx\r,zY\u0003\u0019ajhFз\u0003lj\u0011Ȑ(t\u000fR\u0019g~B\u007fxw2CnĘ1AW\ta2cv\u00014+)Mѫ2õKgZ\u0003\u0015x$Km{N\u001c`ߜ\u0010ȠA\u0013\u001d:yJ\u00100]X\u0003gaM@,\u000b~\n\u000fin\\k^ρrݽdjR֢%10}vrYΨ;с\u0006ӶJ\tOcb\u0016s@Oz\u0011b\\P>\u0007\u0013!nE\u000f{:\u0005E/S'Sȶ\u000e\u0013]\"8ӡuܓ2\u0006jχ>vk\u0012:r6qhakC\fJWk\u0017>P7CØD\u05f8n}\u0010ȷ!6\u0013GVV5~dNe\rE|\u0015\u001e\u0003ݻ|Æ_:\u001b̊N]<xBsy͟DbQ=)M\n܊$B\n+a;؉\nν\u007fAv\u0014\"Y.sod\u000fJ\u0014|88GVp\u0007\r\u00152RD<6*\u001aҐuѕ\u0014z\bʋ0'%RZ\u007fKX\u001eT'afJ\u0015`sfO.Wϖ\u0011ʟ\"x=̍U\u0017TuGc` \u0004!\u00173\u0003O-\u0006[p\u0003\u0015\u0010АψX܁\u000fUeEO(D+_+s\u000e}/X\u001a\u0003AP=kK_9w|@`\u001bU\u0013e\u0013 hשTƬ&)\u0007ғM\u001aJ4'\u000bGTIźnυPN\u007f˿\u0014&\u000fB\\)58SݰHɴ1\u0006=σ\u000e[xA?\u0002gUK}6&NUZȏ#Ǜ[\u000enŊ.DHE\n\u0016\u0019կ9\u0017^8\u001c.\u0001Ɠ)^lV\rеם3ě\u0017nam}SNDCn\frYq\u0019\fi\u001eqp&#\u0011\u001aIV(s\u0004ǡ)Է+Y6߾p\\@EaUx\u0013\u0006J#]oJ\u0016\u001bA\u0018_exp\"χq\fYhBˎmʘ4R&ݙώ}N"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", "7mXA\\(EA(z\n^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "/mX:T;>=\"~[k(\u0005\t\u0016a\b%z<", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "1n\\=b:>R\bz\b`,\fv>a\u000f(", "5dc\u0010b4I]'~yM(\n\u000b/tm7wO\u0001U\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010b4I]'~yM(\n\u000b/tm7wO\u0001U\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "1n\\=b:Bb\u001d\t\u0004<6\u0006\u00183n\u0010$\u000bD\u000b ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "5dc\u0010b4I]'\u0003\nb6\u0006f9n\u000f,\u0005P|&\u001bQxL8\u007f)=U\r$Av\u0010,WP;eA\u001e\u001ch]G\u0007", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt\u0013Pm\u000eC}!2`}}Av%2VS7z8(\u001e>", "Adc\u0010b4I]'\u0003\nb6\u0006f9n\u000f,\u0005P|&\u001bQxL8\u007f)=U\r$Av\u0010,WP;eA\u001e\u001ch]G\u0007", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^\u0013 Eo\u0015Cr\"<Y[*@|\u001a7]?Jo>'j,R", "1n\\=b:Bb\u001d\t\u0004<6\u0006\u00183n\u0010$\u000bD\u000b ~W~\u000eO", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", "5dc\u0010b4I]'\u0003\nb6\u0006f9n\u000f,\u0005P|&\u001bQxuL\u0006%H\u0018y);u\u0012=QMDe2(\"h[F\u0007j,J\u0005'", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%+PmW$\u000745lS", "1ta?X5M/\"\u0003\u0003Z;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL\r\u001a\\RxA\u001d\u00146\u0017R3\t\u0014]K-\\S3.\b\u0002", "\nrTA \u0006\u0017", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "Adc\u0010h9KS\"\u000ehm(\f\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "1ta?X5MA(z\n^j{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2ta.g0H\\\u0007|ve,", "", "4ha@g\rKO!~aZ4y\b+", "4qP0g0H\\", "5dc\u0013e(<b\u001d\t\u0004", "u(5", "Adc\u0013e(<b\u001d\t\u0004", "uE\u0018#", "4qP0g0H\\W}ze,~\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "7mXA\\(ED\u0015\u0006\u000b^\b\u0006\r7a\u000f,\u0006I\u000f", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", ":`bA99:[\u0019m~f,e\u00058o\u000e", ";tc.g6K;)\u000ezq", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012=WP#{C\u001e(>", "@dR._*NZ\u0015\u000ezM6\f\u00056D\u00105wO\u0005! 0k\u0017F\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "Adc!T9@S(l\nZ;|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "B`a4X;,b\u0015\u000ez\u001d+|\u0010/g{7{", "Bnc._\u000bN`\u0015\u000e~h5e\u00058o\u000e", "5dc!b;:Zw\u000f\bZ;\u0001\u00138N{1\u0006N?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "u(9", "Adc!b;:Zw\u000f\bZ;\u0001\u00138N{1\u0006N?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "uI\u0018#", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "/mX:T;>=\"~[k(\u0005\t", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/mX:T;>B#", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018W+PP],8[vE\u0010!^\u0018W\u0019\u0018\u0005W\u0017\u000btNF&\f5\u0013\u007fEu\u000b\u001c%\u0012>j~\f4\u001aP\t\u0019~Q%wJchO\u000b(J^;`Uf\u0019e<\u0004\u000e\u0011v\u0019\u0019w&", "2n>;X\rKO!~", "3mS\u000e_3\u001a\\\u001d\u0007vm0\u0007\u0012=", ";ne245B[\u0015\u000e~h5k\u0013\u0013n\u00047\u007f<\b\u0005&C~\u000e", "=ab2e=>B#\u000eve\u000b\r\u0016+t\u00042\u0005", "=ab2e=>B#\u000eve\u000b\r\u0016+t\u00042\u0005~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "=mC<g(E2)\fvm0\u0007\u0012\rh{1}@\u007f", "=mC<g(E2)\fvm0\u0007\u0012\rh{1}@\u007fU\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "@dR._*NZ\u0015\u000ez:5\u0001\u0011+t\u00042\u00051|\u001e'G", "/mX:T;B]\"", "2d[AT\u0017EO-m~f,e\u00058o\u000e", "@t]\u000ea0FO(\u0003\u0005g:", "AdT8G6", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006t/Bc\u000e/;v\u0016<\u0017!EtC\"\u001ex]H\u000bm5$:\u000eLH_(&YnF\u0016[D\u000bS+\u000b\u0014/", "AdT8G6\u001f`\u0015|\nb6\u0006", "AmP=G6", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "BqP;f0MW#\bXh5}\r1u\r(z", "BqP;f0MW#\bXh5}\r1u\r(z~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "BqP;f0MW#\bg^4\u0007\u001a/d", "BqP;f0MW#\bg^4\u0007\u001a/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "E`XA96K1#\u0007\u0006h:\u0001\u00183o\t", "E`XA96K1#\u0007\u0006h:\u0001\u00183o\t\u0004|O\u0001$\u0006C|\u0010<\u0006\u0013DU\r \u0015p\u00127OC", "\u0011n\\=T5B]\"", "!dT8\\5@/\"\u0003\u0003Z;\u0001\u00138S\u000f$\u000b@", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SeekableTransitionState<S> extends TransitionState<S> {
    private final Function1<Long, Unit> animateOneFrameLambda;
    private S composedTargetState;
    private CancellableContinuation<? super S> compositionContinuation;
    private final Mutex compositionContinuationMutex;
    private SeekingAnimationState currentAnimation;
    private final MutableState currentState$delegate;
    private float durationScale;
    private final Function1<Long, Unit> firstFrameLambda;
    private final MutableFloatState fraction$delegate;
    private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
    private long lastFrameTimeNanos;
    private final MutatorMutex mutatorMutex;
    private final Function0<Unit> recalculateTotalDurationNanos;
    private final MutableState targetState$delegate;
    private long totalDurationNanos;
    private Transition<S> transition;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0f);
    private static final AnimationVector1D Target1 = new AnimationVector1D(1.0f);

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$runAnimations$1, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f", f = "!>,8<1;/42p-5", i = {0, 1}, l = {370, 373}, m = "AE?\u0013A=B7KAHHN", n = {"c^kY", "c^kY"}, s = {"xQ^", "xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.runAnimations(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f", f = "!>,8<1;/42p-5", i = {0, 0, 1, 1}, l = {566, 2186}, m = "F1:F\u0019CG\u0019FEIINEQGNN", n = {"c^kY", "TnrKUjGK)NG><", "c^kY", "TnrKUjGK)NG><"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C04101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04101(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C04101> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.waitForComposition(this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f", f = "!>,8<1;/42p-5", i = {0, 0, 1, 1}, l = {542, 2186}, m = "F1:F\u0019CG\u0019FEIINEQGNN\"HWIW:HZPO_?aOcU4ZTb\\[", n = {"c^kY", "TnrKUjGK)NG><", "c^kY", "TnrKUjGK)NG><"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C04111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04111(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C04111> continuation) {
            super(continuation);
            this.this$0 = seekableTransitionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.waitForCompositionAfterTargetStateChange(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SeekableTransitionState(S s2) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        super(defaultConstructorMarker);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s2, null, 2, null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s2, null, 2, null);
        this.composedTargetState = s2;
        this.recalculateTotalDurationNanos = new Function0<Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SeekableTransitionState<S> seekableTransitionState = this.this$0;
                Transition transition = ((SeekableTransitionState) seekableTransitionState).transition;
                seekableTransitionState.setTotalDurationNanos$animation_core_release(transition != null ? transition.getTotalDurationNanos() : 0L);
            }
        };
        this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = MutexKt.Mutex$default(false, 1, null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new MutableObjectList<>(0, 1, defaultConstructorMarker);
        this.firstFrameLambda = new Function1<Long, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j2;
            }
        };
        this.animateOneFrameLambda = new Function1<Long, Unit>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                invoke(l2.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j2) {
                long j3 = j2 - ((SeekableTransitionState) this.this$0).lastFrameTimeNanos;
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = j2;
                long jRoundToLong = MathKt.roundToLong(j3 / ((double) ((SeekableTransitionState) this.this$0).durationScale));
                if (((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                    MutableObjectList mutableObjectList = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    SeekableTransitionState<S> seekableTransitionState = this.this$0;
                    Object[] objArr = mutableObjectList.content;
                    int i2 = mutableObjectList._size;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        SeekableTransitionState.SeekingAnimationState seekingAnimationState = (SeekableTransitionState.SeekingAnimationState) objArr[i4];
                        seekableTransitionState.recalculateAnimationValue(seekingAnimationState, jRoundToLong);
                        seekingAnimationState.setComplete(true);
                    }
                    Transition transition = ((SeekableTransitionState) this.this$0).transition;
                    if (transition != null) {
                        transition.updateInitialValues$animation_core_release();
                    }
                    MutableObjectList mutableObjectList2 = ((SeekableTransitionState) this.this$0).initialValueAnimations;
                    int i5 = mutableObjectList2._size;
                    Object[] objArr2 = mutableObjectList2.content;
                    IntRange intRangeUntil = RangesKt.until(0, mutableObjectList2._size);
                    int first = intRangeUntil.getFirst();
                    int last = intRangeUntil.getLast();
                    if (first <= last) {
                        while (true) {
                            objArr2[first - i3] = objArr2[first];
                            if (((SeekableTransitionState.SeekingAnimationState) objArr2[first]).isComplete()) {
                                i3++;
                            }
                            if (first == last) {
                                break;
                            } else {
                                first++;
                            }
                        }
                    }
                    ArraysKt.fill(objArr2, (Object) null, i5 - i3, i5);
                    mutableObjectList2._size -= i3;
                }
                SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = ((SeekableTransitionState) this.this$0).currentAnimation;
                if (seekingAnimationState2 != null) {
                    seekingAnimationState2.setDurationNanos(this.this$0.getTotalDurationNanos$animation_core_release());
                    this.this$0.recalculateAnimationValue(seekingAnimationState2, jRoundToLong);
                    this.this$0.setFraction(seekingAnimationState2.getValue());
                    if (seekingAnimationState2.getValue() == 1.0f) {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                    }
                    this.this$0.seekToFraction();
                }
            }
        };
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setTargetState$animation_core_release(S s2) {
        this.targetState$delegate.setValue(s2);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s2) {
        this.currentState$delegate.setValue(s2);
    }

    public final S getComposedTargetState$animation_core_release() {
        return this.composedTargetState;
    }

    public final void setComposedTargetState$animation_core_release(S s2) {
        this.composedTargetState = s2;
    }

    public final long getTotalDurationNanos$animation_core_release() {
        return this.totalDurationNanos;
    }

    public final void setTotalDurationNanos$animation_core_release(long j2) {
        this.totalDurationNanos = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f2) {
        this.fraction$delegate.setFloatValue(f2);
    }

    public final float getFraction() {
        return this.fraction$delegate.getFloatValue();
    }

    public final CancellableContinuation<S> getCompositionContinuation$animation_core_release() {
        return this.compositionContinuation;
    }

    public final void setCompositionContinuation$animation_core_release(CancellableContinuation<? super S> cancellableContinuation) {
        this.compositionContinuation = cancellableContinuation;
    }

    public final Mutex getCompositionContinuationMutex$animation_core_release() {
        return this.compositionContinuationMutex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAllAnimations() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core_release();
        }
        this.initialValueAnimations.clear();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            setFraction(1.0f);
            seekToFraction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runAnimations(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.AnonymousClass1
            if (r0 == 0) goto L85
            r6 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r6 = (androidx.compose.animation.core.SeekableTransitionState.AnonymousClass1) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L85
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r4 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r5 = 2
            r8 = 1
            r1 = -9223372036854775808
            if (r0 == 0) goto L49
            if (r0 == r8) goto L2b
            if (r0 != r5) goto L90
        L2b:
            java.lang.Object r3 = r6.L$0
            androidx.compose.animation.core.SeekableTransitionState r3 = (androidx.compose.animation.core.SeekableTransitionState) r3
            kotlin.ResultKt.throwOnFailure(r4)
        L32:
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r0 = r3.initialValueAnimations
            boolean r0 = r0.isNotEmpty()
            if (r0 != 0) goto L3e
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r0 = r3.currentAnimation
            if (r0 == 0) goto L8b
        L3e:
            r6.L$0 = r3
            r6.label = r5
            java.lang.Object r0 = r3.animateOneFrame(r6)
            if (r0 != r7) goto L32
            return r7
        L49:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState> r0 = r9.initialValueAnimations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            androidx.compose.animation.core.SeekableTransitionState$SeekingAnimationState r0 = r9.currentAnimation
            if (r0 != 0) goto L5b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5b:
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            float r3 = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L70
            r9.endAllAnimations()
            r9.lastFrameTimeNanos = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L70:
            long r3 = r9.lastFrameTimeNanos
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L83
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r0 = r9.firstFrameLambda
            r6.L$0 = r9
            r6.label = r8
            java.lang.Object r0 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r0, r6)
            if (r0 != r7) goto L83
            return r7
        L83:
            r3 = r9
            goto L32
        L85:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r6 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r6.<init>(r9, r10)
            goto L19
        L8b:
            r3.lastFrameTimeNanos = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.runAnimations(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doOneFrame(Continuation<? super Unit> continuation) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, continuation);
            return objWithFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : Unit.INSTANCE;
        }
        Object objAnimateOneFrame = animateOneFrame(continuation);
        return objAnimateOneFrame == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateOneFrame : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateOneFrame(Continuation<? super Unit> continuation) {
        float durationScale = SuspendAnimationKt.getDurationScale(continuation.getContext());
        if (durationScale <= 0.0f) {
            endAllAnimations();
            return Unit.INSTANCE;
        }
        this.durationScale = durationScale;
        Object objWithFrameNanos = MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, continuation);
        return objWithFrameNanos == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithFrameNanos : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recalculateAnimationValue(SeekingAnimationState seekingAnimationState, long j2) {
        long progressNanos = seekingAnimationState.getProgressNanos() + j2;
        seekingAnimationState.setProgressNanos(progressNanos);
        long animationSpecDuration = seekingAnimationState.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            seekingAnimationState.setValue(1.0f);
            return;
        }
        VectorizedAnimationSpec<AnimationVector1D> animationSpec = seekingAnimationState.getAnimationSpec();
        if (animationSpec != null) {
            AnimationVector1D start = seekingAnimationState.getStart();
            AnimationVector1D animationVector1D = Target1;
            AnimationVector1D initialVelocity = seekingAnimationState.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = ZeroVelocity;
            }
            seekingAnimationState.setValue(RangesKt.coerceIn(((AnimationVector1D) animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity)).get$animation_core_release(0), 0.0f, 1.0f));
            return;
        }
        seekingAnimationState.setValue(VectorConvertersKt.lerp(seekingAnimationState.getStart().get$animation_core_release(0), 1.0f, progressNanos / animationSpecDuration));
    }

    public final Object snapTo(S s2, Continuation<? super Unit> continuation) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(getCurrentState(), s2) && Intrinsics.areEqual(getTargetState(), s2)) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C04092(this, s2, transition, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "!"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^/+\u001f/\u00140et", f = "!>,8<1;/42p-5", i = {}, l = {477}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04092 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04092(SeekableTransitionState<S> seekableTransitionState, S s2, Transition<S> transition, Continuation<? super C04092> continuation) {
            super(1, continuation);
            this.this$0 = seekableTransitionState;
            this.$targetState = s2;
            this.$transition = transition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C04092(this.this$0, this.$targetState, this.$transition, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C04092) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.endAllAnimations();
                ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                this.this$0.setFraction(0.0f);
                S s2 = this.$targetState;
                if (Intrinsics.areEqual(s2, this.this$0.getCurrentState())) {
                    f2 = -4.0f;
                } else {
                    f2 = Intrinsics.areEqual(s2, this.this$0.getTargetState()) ? -5.0f : -3.0f;
                }
                this.$transition.updateTarget$animation_core_release(this.$targetState);
                this.$transition.setPlayTimeNanos(0L);
                this.this$0.setTargetState$animation_core_release(this.$targetState);
                this.this$0.setFraction(0.0f);
                this.this$0.setCurrentState$animation_core_release(this.$targetState);
                this.$transition.resetAnimationFraction$animation_core_release(f2);
                if (f2 == -3.0f) {
                    this.label = 1;
                    if (this.this$0.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object seekTo$default(SeekableTransitionState seekableTransitionState, float f2, Object obj, Continuation continuation, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f2, obj, continuation);
    }

    public final Object seekTo(float f2, S s2, Continuation<? super Unit> continuation) {
        boolean z2 = false;
        if (0.0f <= f2 && f2 <= 1.0f) {
            z2 = true;
        }
        if (!z2) {
            PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got " + f2);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass3(s2, getTargetState(), this, transition, f2, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "!"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^/\"#*\u00140eu", f = "!>,8<1;/42p-5", i = {}, l = {509}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ float $fraction;
        final /* synthetic */ S $oldTargetState;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(S s2, S s3, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f2, Continuation<? super AnonymousClass3> continuation) {
            super(1, continuation);
            this.$targetState = s2;
            this.$oldTargetState = s3;
            this.this$0 = seekableTransitionState;
            this.$transition = transition;
            this.$fraction = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass3(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Transition.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^/\"#*\u00140eugu", f = "!>,8<1;/42p-5", i = {}, l = {531}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ float $fraction;
            final /* synthetic */ S $oldTargetState;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(S s2, S s3, SeekableTransitionState<S> seekableTransitionState, Transition<S> transition, float f2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$targetState = s2;
                this.$oldTargetState = s3;
                this.this$0 = seekableTransitionState;
                this.$transition = transition;
                this.$fraction = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
                        this.this$0.moveAnimationToInitialState();
                    } else {
                        ((SeekableTransitionState) this.this$0).currentAnimation = null;
                        if (Intrinsics.areEqual(this.this$0.getCurrentState(), this.$targetState)) {
                            return Unit.INSTANCE;
                        }
                    }
                    if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
                        this.$transition.updateTarget$animation_core_release(this.$targetState);
                        this.$transition.setPlayTimeNanos(0L);
                        this.this$0.setTargetState$animation_core_release(this.$targetState);
                        this.$transition.resetAnimationFraction$animation_core_release(this.$fraction);
                    }
                    this.this$0.setFraction(this.$fraction);
                    if (!((SeekableTransitionState) this.this$0).initialValueAnimations.isNotEmpty()) {
                        ((SeekableTransitionState) this.this$0).lastFrameTimeNanos = Long.MIN_VALUE;
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C00041(this.this$0, null), 3, null);
                    }
                    this.label = 1;
                    if (this.this$0.waitForCompositionAfterTargetStateChange(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.seekToFraction();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Transition.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^/\"#*\u00140euguiw", f = "!>,8<1;/42p-5", i = {}, l = {527}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class C00041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ SeekableTransitionState<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00041(SeekableTransitionState<S> seekableTransitionState, Continuation<? super C00041> continuation) {
                    super(2, continuation);
                    this.this$0 = seekableTransitionState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C00041(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C00041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.runAnimations(this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.$targetState, this.$oldTargetState, this.this$0, this.$transition, this.$fraction, null), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForCompositionAfterTargetStateChange(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForCompositionAfterTargetStateChange(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object waitForComposition(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState.C04101
            if (r0 == 0) goto L8c
            r7 = r10
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r7 = (androidx.compose.animation.core.SeekableTransitionState.C04101) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L8c
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r1 = r7.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 == r4) goto L51
            if (r0 != r6) goto L9f
            java.lang.Object r3 = r7.L$1
            java.lang.Object r2 = r7.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L30:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r0 == 0) goto L92
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L39:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Object r3 = r9.getTargetState()
            kotlinx.coroutines.sync.Mutex r0 = r9.compositionContinuationMutex
            r7.L$0 = r9
            r7.L$1 = r3
            r7.label = r4
            java.lang.Object r0 = kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r0, r5, r7, r4, r5)
            if (r0 != r8) goto L4f
            return r8
        L4f:
            r2 = r9
            goto L5a
        L51:
            java.lang.Object r3 = r7.L$1
            java.lang.Object r2 = r7.L$0
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L5a:
            r7.L$0 = r2
            r7.L$1 = r3
            r7.label = r6
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            kotlinx.coroutines.CancellableContinuationImpl r1 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
            r1.<init>(r0, r4)
            r1.initCancellability()
            r0 = r1
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            r2.setCompositionContinuation$animation_core_release(r0)
            kotlinx.coroutines.sync.Mutex r0 = r2.getCompositionContinuationMutex$animation_core_release()
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(r0, r5, r4, r5)
            java.lang.Object r1 = r1.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r0) goto L88
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L88:
            if (r1 != r8) goto L8b
            return r8
        L8b:
            goto L30
        L8c:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r7 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r7.<init>(r9, r10)
            goto L16
        L92:
            r0 = -9223372036854775808
            r2.lastFrameTimeNanos = r0
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r1.<init>(r0)
            throw r1
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.waitForComposition(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveAnimationToInitialState() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        SeekingAnimationState seekingAnimationState = this.currentAnimation;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos > 0 && getFraction() != 1.0f && !Intrinsics.areEqual(getCurrentState(), getTargetState())) {
                seekingAnimationState = new SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j2 = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j2);
                seekingAnimationState.setAnimationSpecDuration(MathKt.roundToLong(j2 * (1.0d - ((double) getFraction()))));
                seekingAnimationState.getStart().set$animation_core_release(0, getFraction());
            } else {
                seekingAnimationState = null;
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.initialValueAnimations.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core_release(seekingAnimationState);
        }
        this.currentAnimation = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(SeekableTransitionState seekableTransitionState, Object obj, FiniteAnimationSpec finiteAnimationSpec, Continuation continuation, int i2, Object obj2) {
        if ((1 & i2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "!"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^\u001d+',!5'\u00173hw", f = "!>,8<1;/42p-5", i = {}, l = {623}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
        final /* synthetic */ S $targetState;
        final /* synthetic */ Transition<S> $transition;
        int label;
        final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Transition<S> transition, SeekableTransitionState<S> seekableTransitionState, S s2, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$transition = transition;
            this.this$0 = seekableTransitionState;
            this.$targetState = s2;
            this.$animationSpec = finiteAnimationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$transition, this.this$0, this.$targetState, this.$animationSpec, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Transition.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\n\u000b\u0012\t\u000b\u0016\u0010\u007f\u001f\u000f\u001d#\u001a&\u001c##\t+\u0019-\u001f^\u001d+',!5'\u00173hwjx", f = "!>,8<1;/42p-5", i = {0}, l = {2191, 636, 638, 690, 692}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x"}, s = {"xQ^"})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
            final /* synthetic */ S $targetState;
            final /* synthetic */ Transition<S> $transition;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ SeekableTransitionState<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SeekableTransitionState<S> seekableTransitionState, S s2, Transition<S> transition, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = seekableTransitionState;
                this.$targetState = s2;
                this.$transition = transition;
                this.$animationSpec = finiteAnimationSpec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01ff A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 525
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(this.this$0, this.$targetState, this.$transition, this.$animationSpec, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$transition.onTransitionEnd$animation_core_release();
            return Unit.INSTANCE;
        }
    }

    public final Object animateTo(S s2, FiniteAnimationSpec<Float> finiteAnimationSpec, Continuation<? super Unit> continuation) {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.INSTANCE;
        }
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(transition, this, s2, finiteAnimationSpec, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || Intrinsics.areEqual(transition, transition2))) {
            PreconditionsKt.throwIllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
        this.transition = null;
        TransitionKt.getSeekableStateObserver().clear(this);
    }

    public final void observeTotalDuration$animation_core_release() {
        TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.SeekableTransitionStateTotalDurationChanged, this.recalculateTotalDurationNanos);
    }

    public final void onTotalDurationChanged$animation_core_release() {
        long j2 = this.totalDurationNanos;
        observeTotalDuration$animation_core_release();
        long j3 = this.totalDurationNanos;
        if (j2 != j3) {
            SeekingAnimationState seekingAnimationState = this.currentAnimation;
            if (seekingAnimationState == null) {
                if (j3 != 0) {
                    seekToFraction();
                }
            } else {
                seekingAnimationState.setDurationNanos(j3);
                if (seekingAnimationState.getAnimationSpec() == null) {
                    seekingAnimationState.setAnimationSpecDuration(MathKt.roundToLong((1.0d - ((double) seekingAnimationState.getStart().get$animation_core_release(0))) * this.totalDurationNanos));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core_release(MathKt.roundToLong(((double) getFraction()) * transition.getTotalDurationNanos()));
    }

    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\nnjG7LeN9ZS8\u0018s{:,c$\u007fHCU \u0001*\t]Zo˧tϺpŏs\u000f4\u00159m߽MU\u0007]Z\u0015@i\b?au6Q\n\u0001\u00037\u001d(B$Hy3\u00040)v\u0012M٠Oƚ\u0010\u001e8ϋ\t<X\u0011[\n:\u0014\fD.\bntuVNH\u001bf\u0011ǉ/ɨmNVϋw2\u0003W\u001bQt)\u0013\u0003o+{XEC-%\u0002\f]ѿgύ\u0007Kyܵ\u001dj-69T\u0014Y<h\u000e!eE]\u001eut<[3T7϶3˦SoSִ&*}\r\n \\\u0006\u0014\u001a5]~E(| \u000ea\fIԦLг\u0006jJȕ\u0013c<-3\u0018S-?4tk2S'iO{3\u0016tŇ\rͼ%g\\וx\u0017!p\u0006\\QSFZV[ZqK\f\u001cp\u0011\u0005\u0001ʽ<Ͻ\u0004;\u0004߾F\u0019+ViLC#q\"VY8\u000f\u0013\u0002\u0001S\u0018t\u001f؞.å\u001aC2\u009e$\\J\b\u0013\u0010pV^Q\u001fsɥX0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL\r\u001a\\RxA\u001d\u00146\u0017R3\t\u0014]K-\\S3.\b\u0002", "", "u(E", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001^\u0016,\\MHoI\u001e\u0014Dj=\u000f_;R\u000105WN*2", "Adc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dpqeA\u0003r0X\u007f\u0015RLL\u0002 C", "/mX:T;B]\"l\u0006^*[\u0019<a\u000f,\u0006I", "", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-D\u00105wO\u0005! ", "u(9", "Adc\u000ea0FO(\u0003\u0005g\u001a\b\t-D\u00105wO\u0005! ", "uI\u0018#", "2ta.g0H\\\u0002z\u0004h:", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "Adc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc\u0016a0MW\u0015\u0006k^3\u0007\u00073t\u0014", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011pw-L", "Adc\u0016a0MW\u0015\u0006k^3\u0007\u00073t\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u0014/\u000b$:\u0018", "7r2<`7ES(~", "", "u(I", "Adc\u0010b4IZ\u0019\u000ez", "uY\u0018#", ">q^4e,La\u0002z\u0004h:", "5dc\u001de6@`\u0019\r\tG(\u0006\u0013=", "Adc\u001de6@`\u0019\r\tG(\u0006\u0013=", "AsP?g", "5dc g(Kb", "Adc g(Kb", "D`[BX", "", "5dc#T3NS", "u(5", "Adc#T3NS", "uE\u0018#", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private AnimationVector1D start = new AnimationVector1D(0.0f);
        private float value;

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final void setProgressNanos(long j2) {
            this.progressNanos = j2;
        }

        public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final void setAnimationSpec(VectorizedAnimationSpec<AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        public final void setComplete(boolean z2) {
            this.isComplete = z2;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f2) {
            this.value = f2;
        }

        public final AnimationVector1D getStart() {
            return this.start;
        }

        public final void setStart(AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final void setInitialVelocity(AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final void setDurationNanos(long j2) {
            this.durationNanos = j2;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final void setAnimationSpecDuration(long j2) {
            this.animationSpecDuration = j2;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^[R\u001d\u000b.x\u0019.֒Y~e܈'4HuM7ޢsD"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "\"`a4X;\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "5dc!T9@S(J", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011pw-L", "(da<I,E]\u0017\u0003\nr", "5dc'X9HD\u0019\u0006\u0005\\0\f\u001d", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D getZeroVelocity() {
            return SeekableTransitionState.ZeroVelocity;
        }

        public final AnimationVector1D getTarget1() {
            return SeekableTransitionState.Target1;
        }
    }
}
