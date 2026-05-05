package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r(4ߚ\u007f\u0007tvA0JfP.hS2şs{J$c$\bCCU0}*ޛWN}gvJhŏK\u000f\f\u0017\u0001j:I]ތe\u0012%2JoE6UoS9htL\u0005(2(8\u0002\u0005\u000f#2H\u0016y\u0003CY\u0013\u001aؓHpPR\u0015M\u000b\u001b\u001a\u0006T \t\u001ebgTȤ^Ǎ\u000e:]\"3ipN_^]=l\u001dJb(%v\u0010\u001d;DE7-%\u0002\u0006\u0017XiC\u001bA\b<3mҊ+-Oye=!\u0018\"'CO;\\#*j\u0007i`:*[UqOh\u0010>v)\u0001SPL-\u0014:`.[.\u0017\f\u001cH\rr\u0002V\u0001\nlY\u0018~\u0010C\u007f%^?qMӸjQoSamE\u0015\u001d\rL71r/pl\u000e\u000f+K\\\u0006hIUnJ1Nhe\u0004\u0003ձtb\u0010BL`U\u001aG{?BG-ErQ'OxjH#s'\u0019n\u0004kybNP&\u001d3\b*7ȱjFt\u0005\u001ad\u0003trҍSɟX\u0007\f&[&j\u0017T!S0\u0015O1|xnu\u0012;.\u0015DBp\u0002\r6E%3̳Uc\u001e\u0004\u001b|\"bTb3]-V\u001c\u001bh\u0001@\"`\\\u001b\u0014\u0006!\\N:9xƅ1dW:X1\\Cp3\"Pj\u0015\t\u000e\u0001\u0019\u0018\rkK(1v\rtg\r\u0001`~\u0005\u007fxwBCʷ!u^__1&\u00046\u00198\u000bL\u001f~\"&wqZrdr&we{N*He\u0018Ȕ<c\u001b\r*J\u0002[D#Ǭg˛Q\u0012/ϕM\u0006\u001d=\u0001.\u0016\u000bAѴ.߯nJWܷg0\u0005b\u000b%\u001ec.~8Â|ĕgT\u0013ϵ\u000fP\u0001\u000bq<|ASā!n;\u000fy:\u0007E3S+K#`\u0014\u000e!\u0010h@۳0ԃf\u000f.۩6\u0016:q.s\u0011aF2\u001aG ʵ\u0001й&&t\u0003PYܜ{6"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f9a\u0002/7lt2[N7z2!\u0015u7", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u001e\u0013[E", "2hb=T;<V\u0019\f", ">`a._3>Z\u001d\r\u0003", "", "<`\\2", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0014]\f+3|\u00141MP\u0011O\u001b#\u0011y]\u0003\u000e_5P@\u0015VYR5^(6.", "@t];\\5@E#\f\u0001^9\u000b", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "?tTBX", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f?W\u0004\u0001Dm\u0016\u001dIQAWD\u001e%h7", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ena8X9\u001aZ \txZ;\u0001\u00138L\n&\u0002", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Ib{#Dw\u001f2bC:U1#\u0015fp\u000f", "", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ":h\\6g,=>\u0015\fve3|\u00103s\b", "2hb=T;<V", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "2hb=T;<V\r\u0003ze+", "2hb=T;<V|\b\n^9\u0006\u00056", "AsP?g\u001eH`\u001f~\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f9a\u0002/7lt2[N7z2!\u0015u +\u0011p2N\u0004|", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001aLj8", "Bqh\u000e_3HQ\u0015\u000ezP6\n\u000f/r", "", "=ac.\\5-O'\u0005dk\u000b|\u00056l\n&wO\u0001\t!Tu\u000eI", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "BnBAe0GU", "2d[.l", "Bh\\2", "", "7me<^,(\\\b\u0003\u0003^6\r\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "Bh\\2@0EZ\u001d\r", "AbW2W<ES\u0006~\tn4|d0t\u007f5Z@\b\u0013+", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "%na8X9", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    private static final /* synthetic */ AtomicIntegerFieldUpdater runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final String name;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final Object workerAllocationLock;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000e6B\r\"4ߚ}ћh\u0001ˎ`H\u0014H\u0017R2)O|\f<2\\<uq;>\u001a\\!\u07beSPmi|M#\u0011Q\u0014\u001e\u0016'pr]&\u000bk\u0013'6po(3,n\u0014ʣlҽ:\u0007(20<ѯ\t\b"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\f9a\u0002/7lt2[N7z2!\u0015u +\u0011p2N\u0004|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "1ta?X5MB\u0015\r\u0001", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0005 &G|\u00178}n\u001c]\u0006$Fm\u0015\rQQFgC\u001c\u0018hn\u000fmh(_rpNHW.&?\u0003F\u001d\u000eW\u0015N\u0001Pu", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "@t]", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class Worker implements Runnable {
        private Runnable currentTask;

        public Worker(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th);
                }
                Runnable runnableObtainTaskOrDeallocateWorker = LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.currentTask = runnableObtainTaskOrDeallocateWorker;
                i2++;
                if (i2 >= 16 && LimitedDispatcher.this.dispatcher.isDispatchNeeded(LimitedDispatcher.this)) {
                    LimitedDispatcher.this.dispatcher.mo10550dispatch(LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i2, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i2;
        this.name = str;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    private final void dispatchInternal(Runnable runnable, Function1<? super Worker, Unit> function1) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            function1.invoke(new Worker(runnableObtainTaskOrDeallocateWorker));
        }
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnableRemoveFirstOrNull = this.queue.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                runningWorkers$volatile$FU.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                runningWorkers$volatile$FU.incrementAndGet(this);
            }
        }
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int i2) {
        this.runningWorkers$volatile = i2;
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            if (runningWorkers$volatile$FU.get(this) >= this.parallelism) {
                return false;
            }
            runningWorkers$volatile$FU.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0012Y)4]q`H9\nx\u0018SyK{o\\\tcg{\feP\revMK0A;\u001e\u0016Y~6`W?%L9(\u0011YSM)\u000b9\u0010v\u0011sv\"Z\u0010;m7\n\bQ\u0013~\u0010T3")
    @InterfaceC1492Gx
    public Object delay(long j2, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.delay(j2, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.mo10550dispatch(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.$$delegate_0.invokeOnTimeout(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i2, String str) {
        LimitedDispatcherKt.checkParallelism(i2);
        return i2 >= this.parallelism ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo10551scheduleResumeAfterDelay(long j2, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.$$delegate_0.mo10551scheduleResumeAfterDelay(j2, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.name;
        return str == null ? this.dispatcher + ".limitedParallelism(" + this.parallelism + ')' : str;
    }
}
