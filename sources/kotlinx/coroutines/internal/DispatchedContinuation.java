package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0LeN0ZS8şs{:(c$\bCCU0}*\tUOog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xk\u001b\u00172HoG3[oE9fx>\u0005.3*8\u0010\u0005\t\u001a0Q\u0018v\u0011CS\f\u00188HpPR\u0015M\u000b\u001c\u001a\u0006L,\tȦbɡdȤppcŽ=\"!݃rT7a@|\u0014\ftTW\u0011%c\u0007+\u001f8e\u001b5U\u0013\u0007\u0019Zm\u0006\u007f\rM\tv+?+wxg@f\u0006,\u001b;Q\u001d])̦\u000b\bŌd\u000e-2]k\u0014c\u001c8\u0010\u0003\u0012\fj\u0016v\b=G\r>`zڿ\u00123\u0003\u0006\u001cK^\u001dvB.\u0017(اа)\u007f9H\u0002&toy;Gm}ަ˿\u0011\u001e)!7,iu&`C:\u001bȭΦ5QF_\u0011a\u0018|Uu\u0014rr\u0002`ʶFF.GB߾ѧ\u001b%=\u007f\u0002</\u0011\u001aJZf%+\u0011paojLP\"t\u0017eQOȱʑHd\u000b\u0014\u0019gfU)MJp7\u0002\u0016=8\\&bgطŎROn\u00153Zk6=1|6\bx2\u001cĆ=^9b\u001a|\u001e\u0013jvB^ll\u0013\u000b~Hc\u000ej\\^ί`{1$ȑ\u007fD\\@[NM'44ZPIf#z\u001b$RC\r\t\u0016ʳ\u0017CEԟ9ʗ\u0007k*+\u00175\u0019r~'\u007fxwH-f0eYSK\u0018T_hּ:č'\u0007\u0005-Hcu\u0007_L\u001b5&_\nR. IS?=IÁ-\\xĉ3։Ptk\r[Fo\u0018\u000b6';\u0017M\u0018\fx.D`\u0019\t\u007fX%a\u000f^)ּNۭѣ}cL;U%\u001d\u0011i\u0001ar1\u001d\u0003b\t\u000b\u0013#6%/tXĜ\fԈEے!\u0016\u007fҡ\u007f)oc\u0002u>{r\u000f\\۩\u0014\u0007bgl˹dжa2Cͯ\u001aq\rG:&\u0003\u0002pR!̫Fȷ_ͫ\u0019άLGlݥf:S\u0016=\n7!:\u001a\t^q9Aqf6D^\ttyRjڂEѼ\u0015Qkis{Yk[X\u001d\u001e#{_xHΒ\u0014մX͓f\t8үD'DVSj\u0015@\u0019&J+j\u00129Y+Ȯ\b`\u0013\u000e]w\u0015'2HtQU<l/\u001d-ޣ\u0007ޝId9,\u0007\u0018\u001dMn\u0011C_\u001dsVV?chܬ\u0002 ?iAʻ\u0001ݝ)/\\V?J6\tQ\u0012S\u001b[I0tZڲ,Կo4"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u00049g\t\u001cFk\u0019.L!EtC\"\u001ex]H\u000bm5$", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"C~\f?v$$U\f&\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?f\b0Fq\u001f.;R7i:~\"di9\\", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "2hb=T;<V\u0019\f", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "1n]A\\5NO(\u0003\u0005g", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011R:($oeBPa6[\u00017VPW,j\u001cPG\u001d!^\u0017^'\u001c\tcJy25", "-rc.g,", "", "5dc,f;:b\u0019=\u0001h;\u0004\r8xy&\u0006M\u000b'&Kx\u000eJp#?f}^3v\u001f8\\?Jo>'#", "u(E", "1`[9X9\u001f`\u0015\u0007z", "5dc\u0010T3ES&_\bZ4|", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013DU{&&z\u0012,M#Bk<\u001e\u001ew7", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "u(;7T=:\u001d z\u0004`uj\u0018+c\u0006\u0017\t<~\u0017vNo\u0016<\u007f4\u000b", "1nd;g\u0016K3 ~\u0003^5\f", "-qTBf(;Z\u0019\\vg*|\u00106a|/{\u001e\u000b &Kx\u001e8\u0006)?b", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "@dd@T)ESvz\u0004\\,\u0004\u0010+b\u0007(YJ\n&\u001bP\u007f\nKz/>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=\u0002\u001dsh\u000f", "5dc\u001fX<LO\u0016\u0006z<(\u0006\u0007/l\u0007$xG\u0001t!P~\u0012E\u0007!D]\b)", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt\u0013Pm\u000eC}!2`}}Av%2VS7z8(\u001eLiD\u000e9", "7rA2h::P ~", "", "7rA2h::P ~9d6\f\u00103n\u0013\"yJ\u000e!'Vs\u0017<\u0005\u001f3c\u000b ", "/vP6g\u0019>c'zwb3\u0001\u0018C", "", "/vP6g\u0019>c'zwb3\u0001\u0018C$\u00062\u000bG\u0005 *Am\u0018I\u00015D]\u0007 Eg\u00148ZC", "@d[2T:>", "@d[2T:>\u0012\u001f\t\ne0\u0006\u001c)c\n5\u0006P\u0010\u001b G}\b:\u000125", "1kP6`\u0019>c'zwe,Z\u00058c\u007f/\u0003<}\u001e\u0017%y\u0017Kz.EU\r$Av", "1kP6`\u0019>c'zwe,Z\u00058c\u007f/\u0003<}\u001e\u0017%y\u0017Kz.EU\r$AvT4WRBo=1\u000ffkF\u0011s;R\u007f'UFL6iR", "Bqh\u001fX3>O'~Xe(\u0001\u0011/d]2\u0005O\u0005 'C~\u0012F\u007f", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "Bqh\u001fX3>O'~Xe(\u0001\u0011/d]2\u0005O\u0005 'C~\u0012F\u007fc;c\r';v)(KMHuD-\u0019qaG\u0001a6[v", ">nbAc6GSvz\u0004\\,\u0004\u0010+t\u00042\u0005", "1`d@X", ">nbAc6GSvz\u0004\\,\u0004\u0010+t\u00042\u0005~\u0007!&Ns\u0017Op#?f\b0Fq\u001f.[=9uA\u001e", "B`Z2F;:b\u0019", "B`Z2F;:b\u0019=\u0001h;\u0004\r8xy&\u0006M\u000b'&Kx\u000eJp#?f}", "2d[2Z(MS", "5dc\u0011X3>U\u0015\u000ez\u001d2\u0007\u00186i\t;u>\u000b$!W~\u0012Ev3/W\b-7", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007u", "@dbB`,0W(\u0002", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@dbB`,\u001cO\"|ze3x\u00066eq,\u000bC", "@dbB`,\u001cO\"|ze3x\u00066eq,\u000bC?\u001d!Vv\u0012E\n\u001f3c\u000b*G|\u001a7MQ5i>+\u0015", "@dbB`,\u001cO\"|ze3|\b", "AsPAX", "@dbB`,\u001cO\"|ze3|\bmk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~\u001a\u007fO\u0004", "@dbB`,.\\\u0018\u0003\ti(\f\u00072e~\u001a\u007fO\u0004U\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "2hb=T;<V\r\u0003ze+", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "D`[BX", "2hb=T;<V\r\u0003ze+;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u0010?", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final Continuation<T> continuation;
    public final Object countOrElement;
    public final CoroutineDispatcher dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuation;
        this._state = DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final CancellableContinuationImpl<?> getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof CancellableContinuationImpl) {
            return (CancellableContinuationImpl) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    public final CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof CancellableContinuationImpl) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_reusableCancellableContinuation$volatile$FU, this, obj, DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                    return (CancellableContinuationImpl) obj;
                }
            } else if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(CoroutineContext coroutineContext, T t2) {
        this._state = t2;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(coroutineContext, this);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (Intrinsics.areEqual(obj, DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_reusableCancellableContinuation$volatile$FU, this, DispatchedContinuationKt.REUSABLE_CLAIMED, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_reusableCancellableContinuation$volatile$FU, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        CancellableContinuationImpl<?> reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.detachChild$kotlinx_coroutines_core();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void resumeCancellableWith$kotlinx_coroutines_core(Object obj) {
        Object state = CompletionStateKt.toState(obj);
        if (this.dispatcher.isDispatchNeeded(getContext())) {
            this._state = state;
            this.resumeMode = 1;
            this.dispatcher.mo10550dispatch(getContext(), this);
            return;
        }
        DebugKt.getASSERTIONS_ENABLED();
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            Job job = (Job) getContext().get(Job.Key);
            if (job == null || job.isActive()) {
                Continuation<T> continuation = this.continuation;
                Object obj2 = this.countOrElement;
                CoroutineContext context = continuation.getContext();
                Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj2);
                UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(continuation, context, objUpdateThreadContext) : null;
                try {
                    this.continuation.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    InlineMarker.finallyEnd(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                    }
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } else {
                CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                Result.Companion companion = Result.Companion;
                resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(cancellationException)));
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
            InlineMarker.finallyStart(1);
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.handleFatalException$kotlinx_coroutines_core(th2);
                InlineMarker.finallyStart(1);
            } catch (Throwable th3) {
                InlineMarker.finallyStart(1);
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
                InlineMarker.finallyEnd(1);
                throw th3;
            }
        }
        eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
        InlineMarker.finallyEnd(1);
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object obj) {
        Job job = (Job) getContext().get(Job.Key);
        if (job == null || job.isActive()) {
            return false;
        }
        CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
        Result.Companion companion = Result.Companion;
        resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(cancellationException)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.Continuation<T> r1 = r6.continuation
            java.lang.Object r0 = r6.countOrElement
            kotlin.coroutines.CoroutineContext r5 = r1.getContext()
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r0)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r4 == r0) goto L16
            kotlinx.coroutines.UndispatchedCoroutine r3 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r1, r5, r4)
        L14:
            r2 = 1
            goto L18
        L16:
            r3 = 0
            goto L14
        L18:
            kotlin.coroutines.Continuation<T> r0 = r6.continuation     // Catch: java.lang.Throwable -> L31
            r0.resumeWith(r7)     // Catch: java.lang.Throwable -> L31
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L31
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            if (r3 == 0) goto L2a
            boolean r0 = r3.clearThreadContext()
            if (r0 == 0) goto L2d
        L2a:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)
        L2d:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return
        L31:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            if (r3 == 0) goto L3d
            boolean r0 = r3.clearThreadContext()
            if (r0 == 0) goto L40
        L3d:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)
        L40:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object):void");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object state = CompletionStateKt.toState(obj);
        if (this.dispatcher.isDispatchNeeded(getContext())) {
            this._state = state;
            this.resumeMode = 0;
            this.dispatcher.mo10550dispatch(getContext(), this);
            return;
        }
        DebugKt.getASSERTIONS_ENABLED();
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            CoroutineContext context = getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, this.countOrElement);
            try {
                this.continuation.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        if (DebugKt.getASSERTIONS_ENABLED() && obj == DispatchedContinuationKt.UNDEFINED) {
            throw new AssertionError();
        }
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + DebugStringsKt.toDebugString(this.continuation) + AbstractJsonLexerKt.END_LIST;
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(CancellableContinuation<?> cancellableContinuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_reusableCancellableContinuation$volatile$FU, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_reusableCancellableContinuation$volatile$FU, this, DispatchedContinuationKt.REUSABLE_CLAIMED, cancellableContinuation));
        return null;
    }
}
