package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.EventLoopImplBase;
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
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0013nʑA0RlP.XS2\u000f\u0002{<$a'yCI[\"}(\rWNupvJ`\fK\u000f\u0014\u0016\u0001j2L]xs\u0012\u00172HpG3coE9fu>\u000562*8\u007f\u0010\u0007ʞ*^Ƶ'zqJ<\u0016^AY:1\r\u000e\f \u0012ĂB\"\u0007 jj\u0017MV\u0007u:]>3qPj?c^}6\r%Tm!țe\u001e9]\u007fK#Ck\u00035m\fC\u0011^\n=3oW+9i\fWdyF&]1]/urTwKQ)\u00125NgcykT<@\"\n1T\u0004<+WL<S2f6\u0015c|\u0001zXT0_+\u007fYaf\u001b3(K+gD-eň?\u0019\\aD\u000b\u001bI;\u0001\u001d<\"hVf#Glw\u007f;\u0018@\u0006S\\7q=\u001c\u001f7ç͆.\u00046uH5\n@F\u0017SN\"9k-y2`D\u0016\u00125dv\u0005\u0002RvGjt$iB\t:u\u000bdMq^\np,?RbhW\n\u0016\u00178\\&AwؾbʽShqҔ\u001ei\u0018+Gfe`E\u008b`Ć=^;̐\"o\u001eijvBF\u0013ϸ\u0007ֽjB[ێ+p6+JJ\u0001\u000f&\u0006\u001b\u008b\u0018Ʊ6EyʉD.7$j\u0018\u0019\u0015,NY|7i\u0011;fьVտ(\u0007\u0002&z\u0016\u000f^-|}v\u0011IZ\r7ø\u007fۮU5!ğ&.vE\u0015#5\u000fJÕ\u001aѨPGT˾f\u0002c\u000e8\u0016HI(Ȁ\u0010т\u0013~1ɅR9S_\u000be\u007f]h\u0600M܃}\u000fCÜ~s\u0016~\t,\u000fz!֥'Ђ&vfаs\u0014r\u0015\u0012at\u000b\u001eύ`ߏ_>QͿSkJdP|36TeWǾ$Ŀ91[)#,\u0006,\u007f'ov\u0002o\\\u0011\u0019O|۬gנ0g.qhjkJ\fJW\r\u0017>P;#A\u0019זl͎\fF!6\u0013gVYѕt\r"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u0018\u0013Wv\u001d\u001c\n%3i\r*DC", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016\u0004", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "\nh]6g\u0005", "u(E", "\"GA\u00124\u000b8<tfZ", "", "\u0012D5\u000eH\u0013-M~^ZI&Xo\u0013V_\"c.", "", "\u0019D4\u001dR\b%7\n^tG\ber\u001d", "-sW?X(=", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "5dc,g/KS\u0015}9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "Bga2T+", "5dc![9>O\u0018", "u(;7T=:\u001d z\u0004`uk\f<e{'Q", "\u0014Q4 ;", "", "\u000fBC\u0016I\f", "!GD!7\u00160<\u0013kZJ", "!GD!7\u00160<\u0013ZXD", "!GD!7\u00160<", "2dQBZ\u001aMO(\u000f\t", "7rB5h;\u001d]+\b", "", "u(I", "7rB5h;=]+\bg^8\r\t=t\u007f'", "3m`BX<>", "", "B`b8", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "@db0[,=c ~", "<nf", "2d[.l,=B\u0015\r\u0001", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E \u0012\u0017 VV\u0018F\u0002\t=d\u0005|3{\u0016l,CBgH\u001e\u0014W]G\r9", "AgdAW6P\\x\f\bh9", "AgdAW6P\\", "7me<^,(\\\b\u0003\u0003^6\r\u0018", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "Bh\\2@0EZ\u001d\r", "0k^0^", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uI;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V}\u001dQ~\u0015@\u007fn3c\u000b*G|\u001a7MQ\u0005I>+\u001fxp=\u0010c\nX\u007f6G_]\u0002 9xG#\u0019^\u0017at\u000b\u000ffK4}H@\u001f\u0016u(\u0006Is\u000b\u001a\u0012\u000b<jS>_\u000fNyj", "@t]", "1qT.g,-V&~v]\u001a\u0011\u0012-", "3mbBe,,b\u0015\f\n^+", "3mbBe,,b\u0015\f\n^+;\u000f9t\u0007,\u0005Sz\u0015!Ty\u001eKz.5gw\u001eAz\u0016", "<nc6Y@,b\u0015\f\nn7", "AgdAW6P\\y\t\bM,\u000b\u0018=", "Bh\\2b<M", "/bZ;b>ES\u0018\u0001zL/\r\u0018.o\u00121_Ai\u0017\u0017Fo\r", "7rC5e,:R\u0004\fzl,\u0006\u0018", "7rC5e,:R\u0004\fzl,\u0006\u0018mk\n7\u0003D\n*\u0011Ey\u001bF\u000749b}.1k ;M", "BnBAe0GU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;
    private static final int FRESH = 0;
    public static final DefaultExecutor INSTANCE;
    private static final long KEEP_ALIVE_NANOS;
    private static final int SHUTDOWN = 4;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;

    static {
        Long l2;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        INSTANCE = defaultExecutor;
        EventLoop.incrementUseCount$default(defaultExecutor, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l2.longValue());
    }

    private DefaultExecutor() {
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
        if (isShutdownRequested()) {
            debugStatus = 3;
            resetAll();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread createThreadSync() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, THREAD_NAME);
            DefaultExecutor defaultExecutor = INSTANCE;
            _thread = thread;
            thread.setContextClassLoader(defaultExecutor.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void get_thread$annotations() {
    }

    private final boolean isShutDown() {
        return debugStatus == 4;
    }

    private final boolean isShutdownRequested() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean notifyStartup() {
        if (isShutdownRequested()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void shutdownError() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(Runnable runnable) {
        if (isShutDown()) {
            shutdownError();
        }
        super.enqueue(runnable);
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
        if (DebugKt.getASSERTIONS_ENABLED() && _thread != null) {
            throw new AssertionError();
        }
        if (DebugKt.getASSERTIONS_ENABLED() && debugStatus != 0 && debugStatus != 3) {
            throw new AssertionError();
        }
        debugStatus = 0;
        createThreadSync();
        while (debugStatus == 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected Thread getThread() {
        Thread thread = _thread;
        return thread == null ? createThreadSync() : thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return scheduleInvokeOnTimeout(j2, runnable);
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return _thread != null;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected void reschedule(long j2, EventLoopImplBase.DelayedTask delayedTask) {
        shutdownError();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zIsEmpty;
        ThreadLocalEventLoop.INSTANCE.setEventLoop$kotlinx_coroutines_core(this);
        AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
        if (abstractTimeSource != null) {
            abstractTimeSource.registerTimeLoopThread();
        }
        try {
            if (!notifyStartup()) {
                if (zIsEmpty) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jProcessNextEvent = processNextEvent();
                if (jProcessNextEvent == Long.MAX_VALUE) {
                    AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.timeSource;
                    long jNanoTime = abstractTimeSource2 != null ? abstractTimeSource2.nanoTime() : System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractTimeSource abstractTimeSource3 = AbstractTimeSourceKt.timeSource;
                        if (abstractTimeSource3 != null) {
                            abstractTimeSource3.unregisterTimeLoopThread();
                        }
                        if (isEmpty()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    jProcessNextEvent = RangesKt.coerceAtMost(jProcessNextEvent, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jProcessNextEvent > 0) {
                    if (isShutdownRequested()) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractTimeSource abstractTimeSource4 = AbstractTimeSourceKt.timeSource;
                        if (abstractTimeSource4 != null) {
                            abstractTimeSource4.unregisterTimeLoopThread();
                        }
                        if (isEmpty()) {
                            return;
                        }
                        getThread();
                        return;
                    }
                    AbstractTimeSource abstractTimeSource5 = AbstractTimeSourceKt.timeSource;
                    if (abstractTimeSource5 != null) {
                        abstractTimeSource5.parkNanos(this, jProcessNextEvent);
                    } else {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                }
            }
        } finally {
            _thread = null;
            acknowledgeShutdownIfNeeded();
            AbstractTimeSource abstractTimeSource6 = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource6 != null) {
                abstractTimeSource6.unregisterTimeLoopThread();
            }
            if (!isEmpty()) {
                getThread();
            }
        }
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void shutdownForTests(long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j2;
        if (!isShutdownRequested()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
                if (abstractTimeSource != null) {
                    abstractTimeSource.unpark(thread);
                } else {
                    LockSupport.unpark(thread);
                }
            }
            if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait(j2);
        }
        debugStatus = 0;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "DefaultExecutor";
    }
}
