package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.SystemClock;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.modules.core.JavaTimerManager;
import com.facebook.react.modules.core.ReactChoreographer;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĉ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*%k\u00044*[,qY;]ڼ\u0006\"\u0017XVgmnRZ\u0019¼\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:Bu@;M\u0006=A`z6\r H\"@y\u001b\u0001\"ݒP\u0010\rzKŷ\u0014\u0012>@x:X\u000eU\u0005(\u0018\u000e>&\u0001&\\uR>Hr^B/1\nqBT;eD\u0013ձ+\u0003\u0005';u\u0012\u001eY@o8Qb\u0012BG\u0013~O\u0007MrU\u0005\u0017)7/Wvo6\u0007\u0004$\u00199T%]!,l\t_g$'YWӍOP\u001c1@\u0001\n,T\u0004<&mHv3(\b \u000ea\u00159S\tv\u0010\u0001Z\u007f)\u0002f\u001b3#K+g?\u0017Uo`1Ne 5\u0011,I\u0019nO\u0003\u0005\u0012n=3T&^we\t[Vw\"Yk\u000e4tp%B\u0004^k03\n;F\u0017Sb\f=1I\u0004\u0002vQ.\fMnv\u007f\u0002Rv`Rr$ZB\t:~\u000byM~^\u0002p,?ZLX\u0015, \u0013N\b>˓Ƽ)\u0010T~1ox}u\nSO-7\"ty?o9\rS{Q,\u001eo\u0005\u000f\u0014m\\\u0013\tf\u001aZS:~#<j@V\u001f(w*d~\u0010!eWqJXrEab#}\u001b\u001epaC\u001d(`vF\u0017TaDI}lz\u00178h\\\u001f\u0010.\r\u00122\u000b\u0019:-oq{-n[0\"L|Q'EsHMu\u0007_L\u001b6<UD.$UQQ]]C\u0013\r?J\u0002[R\u0013\b6c[\u001c?\u0001\u0013x=F9.\u0016ōAѴ8߯nJWܷg.\u0005e\u000b#6lVכcâ~GkҺ[gLU\u000b\u0003\bI%˾\tġ#\u001e-˚@.\u000bCECU*lߓ ڏ\u0019aeɐ@:\bq'&#uZϽe݁sbYϡ\u0003KFZq\u0003l4tl1ܩ\u001f۶yڇF\t<ؿ\u0004TOw\tVfaaɃ\u007f֨\u000b,\u0015ߞ'gH(\b}bB6͋uʸ\u0002\u0014fƹu\u001d[V\u007fm\u001cO3֨L؝\u000e\u000b\u0004ς?\u001e*>8V\u0006d_ݸ\b֯\u001c6Iݥ3\u0011J\u000e<4ZB^ՄEҰm\u0006\u0018ÿPRm%/2p\u0001\u0012ٜ\u001a֭|\\^ޠUpSw9./\u0017_3L֭\f̐\u0007֪JT7Ѳ\u0003\ra6!\u001b\u0019_Uܽ'ŠHTAЉxj\u000f%]cSK\u001262cW\tBƔ\u000eէ\u001c|%\u00adh-Gn)e\u00072n\u000b\u0004\u0001|\u0003MԦhŽR\"1ͦҼ\u0001O"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EE\u000f&\u0013Uu\u001c\u0006Y%1X\u0005 E{z<<?Iq\u0014/\u0015qp \u000bq;N\u007f'T\"", "@dP0g\bI^ \u0003xZ;\u0001\u00138C\n1\u000b@\u0014&", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "8`e.F*KW$\u000eib4|\u0016\u000fx\u007f&\fO\u000b$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001cKP?vC\r\u0019paFfv,L\u00076QY$", "@dP0g\nA]&~\u0005`9x\u00142e\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\r7i\u0014=+FEx4(\u0017u]D\nc9$", "2de h7I]&\u000ebZ5x\u000b/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&VqD\u0012m9]^#PHP,i(", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$]%QT\u0018-XPr:\u001e\u001c`W[+\t\u0003h\u000b,xCG&\b:\u0013\u007fEu\u0001Uz\nFf^@c\u0014R\t\u0004yI)u&l_wWPOo\u007fK\ni%&;6\"\u0014n#%n\u001a;\nwQ <Z\u0004fwN\u0019\t\u0002\"Hz[\u00102oQ:\u0004\u0005\"U\tw\u001c4ep6w-\u0011\n\u00114n\r\u0015h\u0014<^u\u001f6b\u000b4&2:\"\tJc\u0007zN\u0019s)n\u0017Wf>@\u0019rf_F\u000f\u0015'u[FOo\fB\\\u0013M1k\u001e#H~O1=\u0006", "1ta?X5M7\u0018\u0006z<(\u0004\u0010,a}.hP\n \u0013Dv\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u0010M}'%HU3YNpC\u0001\"c\u0017J(\u0014\u0005/", "4qP:X\n:Z {v\\2g\u0013=t\u007f'", "", "4qP:X\u0010=Z\u0019\\ve3y\u0005-kj2\nO\u0001\u0016", "7c[26(EZ\u0016zxd\u000e\r\u0005<d", "", "7c[299:[\u0019\\ve3y\u0005-k", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u0010M}'(YJ4\\0nD\u001b\u000fV\fT\u0001", "7r?.h:>R", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7rABa5B\\\u001bmvl2\u000b", "Ad]1<+ESx\u0010zg;\u000b", "Bh\\2e\rKO!~XZ3\u0004\u0006+c\u0006", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u001bR~'T-[(dRP9\u001b\u0019W\nL1b", "Bh\\2e\u000eNO&}", "Bh\\2e\u0010=a\b\tib4|\u0016=", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u001bR~'T\"", "Bh\\2e:", "\u001aiPCTuNb\u001d\u0006DI9\u0001\u0013<i\u000f<gP\u0001'\u0017\u001d", "1kT.e\nA]&~\u0005`9x\u00142e\r\fzG\u0001t\u0013Nv\u000b8t+", "", "1kT.e\rKO!~XZ3\u0004\u0006+c\u0006", "1qT.g,\u001a\\\u0018fvr)|f+l\u0007\u0017\u007fH\u0001$", "Bh\\2e\u0010=", "", "2ta.g0H\\", "8rB0[,=c \u0003\u0004`\u001b\u0001\u0011/", "", "@d_2T;", "1qT.g,-W!~\b", "2d[.l", "", "2d[2g,-W!~\b", "6`b\u000eV;Bd\u0019m~f,\n\u0017\u0013nl$\u0005B\u0001", "@`]4X\u0014L", "6`b\u000eV;Bd\u0019m~f,\n\u0017\u0013nl$\u0005B\u0001U\u0004Gk\fKR.4f\b$6g#.TC7y4", ";`h/X\u0010=Z\u0019\\ve3y\u0005-k", ";`h/X\u001a>bv\u0002\u0005k,\u0007\u000b<a\u000b+{Md\u0016\u001eGM\nC}\"1W\u0004", "=m72T+ES'\r_l\u001bx\u00175F\u00041\u007fN\u0004", "B`b8<+", "=m72T+ES'\r_l\u001bx\u00175S\u000f$\tO", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "=m8;f;:\\\u0017~Y^:\f\u00169y", "Adc\u0010[6KS#\u0001\bZ7\u007f\t<C{/\u0003=|\u0015\u001d", "Adc\u0010[6KS#\u0001\bZ7\u007f\t<I~/{\u001e|\u001e\u001eDk\fB", "Adc X5=7\u0018\u0006z>=|\u0012>s", "\u0011n\\=T5B]\"", "\u0017c[26(EZ\u0016zxd\u0019\r\u00128a|/{", "\u0017c[299:[\u0019\\ve3y\u0005-k", "\"h\\2e", "\"h\\2e\rKO!~XZ3\u0004\u0006+c\u0006", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class JavaTimerManager implements LifecycleEventListener, HeadlessJsTaskEventListener {
    private static final Companion Companion = new Companion(null);
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    private static final int TIMER_QUEUE_CAPACITY = 11;
    private IdleCallbackRunnable currentIdleCallbackRunnable;
    private final DevSupportManager devSupportManager;
    private boolean frameCallbackPosted;
    private boolean frameIdleCallbackPosted;
    private final Object idleCallbackGuard;
    private final IdleFrameCallback idleFrameCallback;
    private final AtomicBoolean isPaused;
    private final AtomicBoolean isRunningTasks;
    private final JavaScriptTimerExecutor javaScriptTimerExecutor;
    private final ReactApplicationContext reactApplicationContext;
    private final ReactChoreographer reactChoreographer;
    private boolean sendIdleEvents;
    private final TimerFrameCallback timerFrameCallback;
    private final Object timerGuard;
    private final SparseArray<Timer> timerIdsToTimers;
    private final PriorityQueue<Timer> timers;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005\"4\u0012\u0006\rnʑA0RnP\u008cZS@\u000fsڔ<$i+yّA٨\u001b\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0001:Omx\f\u0019?6PwW3{xm=n~N\u0005N=h8J\u0011\u000f\u001bBH>xQŒ\u001eë\u00160H\u0081\u000b^\u001bP\u001d\u001a@\b\u0015īSɉ`gVȤ\u0019xk>G#1n\u0019úyۢ4|UεШX3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\nX~2CUR6e(", "", "u(E", "\u0014Q0\u001a8&\u001dC\u0006ZiB\u0016e\u0003\u0017S", "", "\u0017C;\u0012R\n\u001a:\u007f[V<\u0012vi\u001cAg\bu\u001f`ru.Sv\u001cp\r#", "\"H<\u0012E&*CxnZX\nXs\u000bCc\u0017o", "", "7rC6`,K7\"kvg.|", "", "Bh\\2e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u001bR~'T\"", "@`]4X\u0014L", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTimerInRange(Timer timer, long j2) {
            return !timer.getRepeat() && ((long) timer.getInterval()) < j2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLш|\u0004O\r8\u000b4B\u0007\":\u001b\u007fјnjG0LeN.Xݺ,%ӆ,4RZd|S?c\u001a\u0016\"7PɁkg|L#\u000fQ\u0014\u001e\u0016'ptOc\u007fu\u0012=8\t\u0004\u0010?[oU9\u000fu\rӏ\"ݨ&8\u0002ڎQ&8K(v)G\"Ë\u001eضDpBĥұQ\r"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u0010M}'%HU3YNpC\u0001\"c\u0017J(\u0014\u0005/", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "4qP:X\u001aMO&\u000eib4|", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\t!\u0016Wv\u000eJ@#?f}i\u001ci'*<GCkA\u0006\u0011q];\u0007p\u00023:\u0018", "7r2.a*>Z ~y", "", "1`]0X3", "", "@t]", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class IdleCallbackRunnable implements Runnable {
        private final long frameStartTime;
        private volatile boolean isCancelled;

        public IdleCallbackRunnable(long j2) {
            this.frameStartTime = j2;
        }

        public final void cancel() {
            this.isCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            if (this.isCancelled) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - (this.frameStartTime / ((long) 1000000));
            long jCurrentTimeMillis = SystemClock.currentTimeMillis() - jUptimeMillis;
            if (JavaTimerManager.FRAME_DURATION_MS - jUptimeMillis < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.idleCallbackGuard;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z2 = javaTimerManager.sendIdleEvents;
                Unit unit = Unit.INSTANCE;
            }
            if (z2) {
                JavaTimerManager.this.javaScriptTimerExecutor.callIdleCallbacks(jCurrentTimeMillis);
            }
            JavaTimerManager.this.currentIdleCallbackRunnable = null;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u0019\u007fјlʔ;FǏ\u0016H\\Q\u0014-Ƃo{B$$2\u007fDSUH\u007fR\r]Q\u007fg\u001dN!\u001få\u0013\u000b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u0010M}'(YJ4\\0nD\u001b\u000fV\fT\u0001", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\t!\u0016Wv\u000eJ@#?f}i\u001ci'*<GCkA\u0006\u0011q];\u0007p\u0002\u0012g", "2n5?T4>", "", "4qP:X\u001bB[\u0019gvg6\u000b", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class IdleFrameCallback implements Choreographer.FrameCallback {
        public IdleFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                IdleCallbackRunnable idleCallbackRunnable = JavaTimerManager.this.currentIdleCallbackRunnable;
                if (idleCallbackRunnable != null) {
                    idleCallbackRunnable.cancel();
                }
                JavaTimerManager.this.currentIdleCallbackRunnable = JavaTimerManager.this.new IdleCallbackRunnable(j2);
                JavaTimerManager.this.reactApplicationContext.runOnJSQueueThread(JavaTimerManager.this.currentIdleCallbackRunnable);
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r)4\u0012}\u0007njG9LeN7XS@ş\u001c{b#\u001cG\u0002GIU2}P\n_Rui\u0007J\t\u000eS\u0013\u0014\u001a\u0011jZJe|k\u0017'2puУ7M}D\no\u0003:\u001d `#أ}\u000b\tɝBJ\u0016~\tL\u001c\u001b 5XphXҫQ\u000b\"Ň\u001e@&\u000b,g8fDJ\u0005]h2yɌuŌR3gܞ\u0015O\u0013Rb4-xg,9O\bD#%k\u00035SÜC\tGмU\u0007n754ʇwh"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u001bR~'T\"", "", "Bh\\2e\u0010=", "", "B`a4X;-W!~", "", "7mc2e=:Z", "@d_2T;", "", "uH9\u0016Mo/", "5dc\u0016a;>`*z\u0002", "u(8", "5dc\u001fX7>O(", "u(I", "5dc!T9@S(m~f,", "u(9", "Adc!T9@S(m~f,", "uI\u0018#", "5dc!\\4>`|}", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class Timer {
        private final int interval;
        private final boolean repeat;
        private long targetTime;
        private final int timerId;

        public Timer(int i2, long j2, int i3, boolean z2) {
            this.timerId = i2;
            this.targetTime = j2;
            this.interval = i3;
            this.repeat = z2;
        }

        public final int getInterval() {
            return this.interval;
        }

        public final boolean getRepeat() {
            return this.repeat;
        }

        public final long getTargetTime() {
            return this.targetTime;
        }

        public final int getTimerId() {
            return this.timerId;
        }

        public final void setTargetTime(long j2) {
            this.targetTime = j2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjG7L͜N\u008fTiճ?k*3d^ҸuCIUb\f0\fgN\u0016k\u001fNh\u0010[\u000f4\u001c?~|Wcyu\u0014%1pq\u0016ݏYڱA9hҚȫ\t'"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u00053~\u0012\u001dQK;x\u001c\u001a\u001edc9\u0014\"\u001bR~'T-[(dRP9\u001b\u0019W\nL1b", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\t!\u0016Wv\u000eJ@#?f}i\u001ci'*<GCkA\u0006\u0011q];\u0007p\u0002\u0012g", "Bh\\2e:-]vz\u0002e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7I#;IW\u0011", "2n5?T4>", "", "4qP:X\u001bB[\u0019gvg6\u000b", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class TimerFrameCallback implements Choreographer.FrameCallback {
        private WritableArray timersToCall;

        public TimerFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            Timer timer;
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                long j3 = j2 / ((long) 1000000);
                Object obj = JavaTimerManager.this.timerGuard;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.timers.isEmpty()) {
                        Object objPeek = javaTimerManager.timers.peek();
                        Intrinsics.checkNotNull(objPeek);
                        if (((Timer) objPeek).getTargetTime() >= j3 || (timer = (Timer) javaTimerManager.timers.poll()) == null) {
                            break;
                        }
                        if (this.timersToCall == null) {
                            this.timersToCall = Arguments.createArray();
                        }
                        WritableArray writableArray = this.timersToCall;
                        if (writableArray != null) {
                            writableArray.pushInt(timer.getTimerId());
                        }
                        if (timer.getRepeat()) {
                            timer.setTargetTime(((long) timer.getInterval()) + j3);
                            javaTimerManager.timers.add(timer);
                        } else {
                            javaTimerManager.timerIdsToTimers.remove(timer.getTimerId());
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                WritableArray writableArray2 = this.timersToCall;
                if (writableArray2 != null) {
                    JavaTimerManager.this.javaScriptTimerExecutor.callTimers(writableArray2);
                    this.timersToCall = null;
                }
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, JavaScriptTimerExecutor javaScriptTimerExecutor, ReactChoreographer reactChoreographer, DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        Intrinsics.checkNotNullParameter(reactChoreographer, "reactChoreographer");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.reactApplicationContext = reactApplicationContext;
        this.javaScriptTimerExecutor = javaScriptTimerExecutor;
        this.reactChoreographer = reactChoreographer;
        this.devSupportManager = devSupportManager;
        this.timerGuard = new Object();
        this.idleCallbackGuard = new Object();
        this.timerIdsToTimers = new SparseArray<>();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        this.timerFrameCallback = new TimerFrameCallback();
        this.idleFrameCallback = new IdleFrameCallback();
        final JavaTimerManager$timers$1 javaTimerManager$timers$1 = new Function2<Timer, Timer, Integer>() { // from class: com.facebook.react.modules.core.JavaTimerManager$timers$1
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(JavaTimerManager.Timer timer, JavaTimerManager.Timer timer2) {
                return Integer.valueOf(MathKt.getSign(timer.getTargetTime() - timer2.getTargetTime()));
            }
        };
        this.timers = new PriorityQueue<>(11, new Comparator() { // from class: com.facebook.react.modules.core.JavaTimerManager$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return JavaTimerManager.timers$lambda$0(javaTimerManager$timers$1, obj, obj2);
            }
        });
        reactApplicationContext.addLifecycleEventListener(this);
        HeadlessJsTaskContext.getInstance(reactApplicationContext).addTaskEventListener(this);
    }

    private final void clearChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
            this.frameIdleCallbackPosted = false;
        }
    }

    private final void clearFrameCallback() {
        HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(this.reactApplicationContext);
        if (this.frameCallbackPosted && this.isPaused.get() && !headlessJsTaskContext.hasActiveTasks()) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
            this.frameCallbackPosted = false;
        }
    }

    private final void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private final void maybeSetChoreographerIdleCallback() {
        synchronized (this.idleCallbackGuard) {
            if (this.sendIdleEvents) {
                setChoreographerIdleCallback();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void setChoreographerCallback() {
        if (this.frameCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
        this.frameCallbackPosted = true;
    }

    private final void setChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
        this.frameIdleCallbackPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSendIdleEvents$lambda$6(JavaTimerManager this$0, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.idleCallbackGuard) {
            if (z2) {
                this$0.setChoreographerIdleCallback();
            } else {
                this$0.clearChoreographerIdleCallback();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int timers$lambda$0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public void createAndMaybeCallTimer(int i2, int i3, double d2, boolean z2) {
        long jCurrentTimeMillis = SystemClock.currentTimeMillis();
        long j2 = (long) d2;
        if (this.devSupportManager.getDevSupportEnabled() && Math.abs(j2 - jCurrentTimeMillis) > StatsigLoggerKt.FLUSH_TIMER_MS) {
            this.javaScriptTimerExecutor.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j2 - jCurrentTimeMillis) + ((long) i3));
        if (i3 != 0 || z2) {
            createTimer(i2, jMax, z2);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i2);
        JavaScriptTimerExecutor javaScriptTimerExecutor = this.javaScriptTimerExecutor;
        Intrinsics.checkNotNull(writableArrayCreateArray);
        javaScriptTimerExecutor.callTimers(writableArrayCreateArray);
    }

    public void createTimer(int i2, long j2, boolean z2) {
        Timer timer = new Timer(i2, (SystemClock.nanoTime() / ((long) 1000000)) + j2, (int) j2, z2);
        synchronized (this.timerGuard) {
            this.timers.add(timer);
            this.timerIdsToTimers.put(i2, timer);
            Unit unit = Unit.INSTANCE;
        }
    }

    public void deleteTimer(int i2) {
        synchronized (this.timerGuard) {
            Timer timer = this.timerIdsToTimers.get(i2);
            if (timer == null) {
                return;
            }
            Intrinsics.checkNotNull(timer);
            this.timerIdsToTimers.remove(i2);
            this.timers.remove(timer);
        }
    }

    public final boolean hasActiveTimersInRange$ReactAndroid_release(long j2) {
        synchronized (this.timerGuard) {
            Timer timerPeek = this.timers.peek();
            if (timerPeek == null) {
                return false;
            }
            if (Companion.isTimerInRange(timerPeek, j2)) {
                return true;
            }
            for (Timer timer : this.timers) {
                Companion companion = Companion;
                Intrinsics.checkNotNull(timer);
                if (companion.isTimerInRange(timer, j2)) {
                    return true;
                }
            }
            Unit unit = Unit.INSTANCE;
            return false;
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int i2) {
        if (HeadlessJsTaskContext.getInstance(this.reactApplicationContext).hasActiveTasks()) {
            return;
        }
        this.isRunningTasks.set(false);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int i2) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    public void onInstanceDestroy() {
        HeadlessJsTaskContext.getInstance(this.reactApplicationContext).removeTaskEventListener(this);
        this.reactApplicationContext.removeLifecycleEventListener(this);
        clearFrameCallback();
        clearChoreographerIdleCallback();
    }

    public void setSendIdleEvents(final boolean z2) {
        synchronized (this.idleCallbackGuard) {
            this.sendIdleEvents = z2;
            Unit unit = Unit.INSTANCE;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.JavaTimerManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                JavaTimerManager.setSendIdleEvents$lambda$6(this.f$0, z2);
            }
        });
    }
}
