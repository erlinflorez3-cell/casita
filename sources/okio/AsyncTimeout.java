package okio;

import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00116Ȑ\u0007\":\u0019\u007fјnjO0LeN.ZS8\u000fs{:$c$\u007fLCU \u007f*\teNo˧vJp\u000bK\u000f\f\u0018\u0001jBI]xc\u0014\u0015FXģ]N}ok8\u0019tQ!`5ŕ<y\u0013\u0001b:V\u0016\u000fzqR<\u0018>H\t<h\f{\f`\u0011ND.\n6\\\u0016X|\\5aH:;\u0003\u0018L\u0017+m<\u0015M;S\u001d7\u001b\u0005y\u001eYGg;#-k\u0005\u001dQ\nFIQ:K\u0013w?'YN$[Dh\u0018\u0014C0\u0016\r&~4m\u001dQ\u000f\u001eW/]tcP<:@\u0007\n T\u0004<\u001aWL<@2f6\"{z\u0001hXP0h\t\u0012C\u0005D-=\u007fyBY\u001dlϟoRIXE\u0014\u001d\u0013.%\u0011ngr\u0003''ڄ!ȑv\u0383śU@Kb\u001f\u0018g>\u0006\u0006\u0007a0ÏZ΅SĬ3{\u0019фg1E]Q#OnX҉Pϼz\u0005hå$u`LX\"\u001d\u001b\u000eѪ\u0015ɔ^DlʍߛPY`/\u0017܍L\u0003\u0006ċ\f0"}, d2 = {"\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000f}", "\u001anZ6bu-W!~\u0005n;R", "u(E", "<dgA", "AsPAX", "", "Bh\\2b<M/(", "", "/bR2f:|\\\u0019\u0011ib4|\u0013?t_;y@\f&\u001bQx", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "1`d@X", "1`]0X3", "", "3mc2e", "3wXA", "", "<df!\\4>])\u000eZq*|\u0014>i\n1", "@d\\.\\5B\\\u001bgvg6\u000b", "<nf", "Ah]8", "\u001anZ6bu,W\"\u0005P", "And?V,", "\u001anZ6bu,])\fx^\u0002", "Bh\\2W\u0016Nb", "Ehc5G0FS#\u000f\n", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0011n\\=T5B]\"", "%`c0[+HU", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class AsyncTimeout extends Timeout {
    private static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head = null;
    private static final ReentrantLock lock;
    private AsyncTimeout next;
    private int state;
    private long timeoutAt;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"4\u0012\u0006\rnj?3Le^.ZS0\u0010s{J$cҕyCQU\"}(\u000bWNugvJ`\fK\u000f\u0014\u001f\u0001j2I[ޏ^(ƁbB\u001e>sRu=˃dtD\u0005h80L\u0012\u0007\u0017\u0019XWX\u0015\tXc\f@FptHi%M3)B\nL8\u0019\u001e\u000bi~:V\u0006u:]=Ii\u000b\\5zH|{#vX5$\u000faL:\u00077\u0006!3T\u001b\u0007\u0001]\u0016ŤAџA\u0005pѧw7Wvo6\u0007\u0002jƆ-̠\u0011]z̦-\u0011_d$'YT:֢#ˎ,w\u0003Ԉ]H\u0012\u0014\u001e'v3\u0004Ղ9ڿ\u00123|Ɂ$L^\tvB.\u007f8تiӾ\u000433ݍkr_iS\u0019|<R˟_̷'\u0001vď,`\u001ci-\u001b\u0003|(Ļ$͘AHVˣ*L{\u000e\tb05˙4M\b\u07fc\u0014\u00134#3D,G1/\u0004\u0004^C\u0016\u0006[\u009etרmRPؗr}$GB\t:kֈh\u000bs¬lZ2#[/Ϊ\u000b\u001a"}, d2 = {"\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000ffYJ\t\"\u0013Ps\u0018EL", "", "u(E", "\u0017C;\u0012R\u001b\";xhjM&dl\u0016Lc\u0016", "", "\u0017C;\u0012R\u001b\";xhjM&ed\u0018Om", "!S0!8&\u001c/\u0002\\ZE\f[", "", "!S0!8&\"2\u007f^", "!S0!8&\"<\u0013jj>\u001c\\", "!S0!8&-7\u0001^YX\u0016lw", "\"H<\u0012B\u001c-M\u000bk^M\fvv\u0013Z_", "1n]1\\;B]\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006T/>X\u0002/;w\u001f\u0004", "5dc\u0010b5=W(\u0003\u0005g", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\u0013c\u0007\u001f;|\u001a8V\u0019", "6dP1", "\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000f}", ":nR8", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "5dc\u0019b*D", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\"Y})Fz\u00127\\*Ei:s", "/vP6g\u001bB[\u0019\t\u000bm", "7mb2e;\"\\(\tfn,\r\t", "", "<nS2", "Bh\\2b<M<\u0015\b\u0005l", "6`b\u0011X(=Z\u001d\bz", "", "@d\\<i,\u001f`#\u0007fn,\r\t", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void insertIntoQueue(AsyncTimeout asyncTimeout, long j2, boolean z2) {
            if (AsyncTimeout.head == null) {
                AsyncTimeout.head = new AsyncTimeout();
                new Watchdog().start();
            }
            long jNanoTime = System.nanoTime();
            if (j2 != 0 && z2) {
                asyncTimeout.timeoutAt = Math.min(j2, asyncTimeout.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j2 != 0) {
                asyncTimeout.timeoutAt = j2 + jNanoTime;
            } else {
                if (!z2) {
                    throw new AssertionError();
                }
                asyncTimeout.timeoutAt = asyncTimeout.deadlineNanoTime();
            }
            long jRemainingNanos = asyncTimeout.remainingNanos(jNanoTime);
            AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout2);
            while (asyncTimeout2.next != null) {
                AsyncTimeout asyncTimeout3 = asyncTimeout2.next;
                Intrinsics.checkNotNull(asyncTimeout3);
                if (jRemainingNanos < asyncTimeout3.remainingNanos(jNanoTime)) {
                    break;
                }
                asyncTimeout2 = asyncTimeout2.next;
                Intrinsics.checkNotNull(asyncTimeout2);
            }
            asyncTimeout.next = asyncTimeout2.next;
            asyncTimeout2.next = asyncTimeout;
            if (asyncTimeout2 == AsyncTimeout.head) {
                getCondition().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeFromQueue(AsyncTimeout asyncTimeout) {
            for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                if (asyncTimeout2.next == asyncTimeout) {
                    asyncTimeout2.next = asyncTimeout.next;
                    asyncTimeout.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue".toString());
        }

        public final AsyncTimeout awaitTimeout() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                Intrinsics.checkNotNull(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jRemainingNanos = asyncTimeout2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                getCondition().await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            Intrinsics.checkNotNull(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            asyncTimeout2.state = 2;
            return asyncTimeout2;
        }

        public final Condition getCondition() {
            return AsyncTimeout.condition;
        }

        public final ReentrantLock getLock() {
            return AsyncTimeout.lock;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0005\"Bߚ(\u0007\u0015iy3ǲiH<R\u001c0\u001dl\u00144R]j\u0006ٺ?X"}, d2 = {"\u001anZ6bu\u001aa-\bxM0\u0005\t9u\u000ffm<\u0010\u0015\u001aFy\u0010\u0012", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "u(E", "@t]", "", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock lock;
            AsyncTimeout asyncTimeoutAwaitTimeout;
            while (true) {
                try {
                    lock = AsyncTimeout.Companion.getLock();
                    lock.lock();
                    try {
                        asyncTimeoutAwaitTimeout = AsyncTimeout.Companion.awaitTimeout();
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (asyncTimeoutAwaitTimeout == AsyncTimeout.head) {
                    Companion unused2 = AsyncTimeout.Companion;
                    AsyncTimeout.head = null;
                    lock.unlock();
                    return;
                } else {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    if (asyncTimeoutAwaitTimeout != null) {
                        asyncTimeoutAwaitTimeout.timedOut();
                    }
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // okio.Timeout
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.removeFromQueue(this);
                this.state = 3;
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.state = 1;
                Companion.insertIntoQueue(this, jTimeoutNanos, zHasDeadline);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i2 = this.state;
            this.state = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            Companion.removeFromQueue(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.close();
                    Unit unit = Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink2 = sink;
                asyncTimeout.enter();
                try {
                    sink2.flush();
                    Unit unit = Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(Buffer source, long j2) throws IOException {
                long j3 = j2;
                Intrinsics.checkNotNullParameter(source, "source");
                SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j3);
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    Intrinsics.checkNotNull(segment);
                    while (true) {
                        if (j4 >= 65536) {
                            break;
                        }
                        j4 += (long) (segment.limit - segment.pos);
                        if (j4 >= j3) {
                            j4 = j3;
                            break;
                        } else {
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                        }
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    Sink sink2 = sink;
                    asyncTimeout.enter();
                    try {
                        sink2.write(source, j4);
                        Unit unit = Unit.INSTANCE;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        j3 -= j4;
                    } catch (IOException e2) {
                        e = e2;
                        if (asyncTimeout.exit()) {
                            e = asyncTimeout.access$newTimeoutException(e);
                        }
                        throw e;
                    } finally {
                        asyncTimeout.exit();
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    source2.close();
                    Unit unit = Unit.INSTANCE;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public long read(Buffer sink, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Source source2 = source;
                asyncTimeout.enter();
                try {
                    long j3 = source2.read(sink, j2);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return j3;
                } catch (IOException e2) {
                    e = e2;
                    if (asyncTimeout.exit()) {
                        e = asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                InlineMarker.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                InlineMarker.finallyEnd(1);
                return tInvoke;
            } catch (IOException e2) {
                e = e2;
                if (exit()) {
                    e = access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            exit();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
