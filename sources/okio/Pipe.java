package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4B\u0007\"B\u0012\u007f\u0007lkA0RnP.XV2\u000f\u0002{<$a%yCQU\"}(\fWN}gvJ`\u0012K\u000f\u001c\u0016\u0001j2L]xk\u0012\u00172HrG3coE9vt>ӌ6݅R8(\u0004A%:L\u001ev\u0013Cy\rܘ4@~<\u001b\u0011[,2\u00124fh\r,\u0006\u007fNdp\u001daHL;\u0003\u0018T\u00172mM\u0015M;X\u001b,˼za$U\tBC6=S1)\u0019`ύ\u0007?whM\r5SCI\"\u007f^X.&E@]:u\u00046^\u0015Q\u000f\u001e7-_cyx<VÞ~{\u0013kJ\u05fd\fwZ<02f6\u0012\nπtՂDV\nމZ\u0002\u0001fD\u001du\u0018A2Q\u001b\u0015Y8ݣ%\u05ee;\b\rټ6%\u0007w/et\u0010f )`H`?^X=v\\̆]CuՎ\td\b9\u0012@\u0018\u001a=\r)0-$em\u0010\u05fb-Ƞ\u0006TLϙ\u000f\u0007f{a}rJF7|,\b9\u0017#rD\u0013\u001d\u07fbTZ`\u008c)O\"m\u0015\u0018X%.\\\u0010<O&fʛQŹmpUΪ\"'5\u0002Eu?|\u001ctQ^aG\b)ߧeX~ܝW>h\"fz\u0013k\u001axt(P:\u001fЛ\u001cȑ\u007fPVۼ+4E\u0011*>L3\u001f|#TS/Pb\u0015\t\u000e|\u001fUњX9,Ѱ\u0002&z*\u000fs-\t}\f\u0011IZ\u00057ö9ۮUA!ğm$nY\u000b-'\u0001y&Us֟K|"}, d2 = {"\u001anZ6bu)W$~P", "", ";`g\u000fh-?S&l~s,", "", "uI\u0018#", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&=\u0005d0\u0007", "u(;<^0H\u001du\u000f{_,\n^", "1`]0X3>R", "", "5dc\u0010T5<S ~y\u001d6\u0003\r9", "u(I", "Adc\u0010T5<S ~y\u001d6\u0003\r9", "uY\u0018#", "1n]1\\;B]\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006T/>X\u0002/;w\u001f\u0004", "5dc\u0010b5=W(\u0003\u0005g", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\u0013c\u0007\u001f;|\u001a8V\u0019", "4n[1X+,W\"\u0005", "\u001anZ6bu,W\"\u0005P", "5dc\u0013b3=S\u0018l~g2;\u00135i\n", "u(;<^0H\u001d\u0007\u0003\u0004d\u0002", "Adc\u0013b3=S\u0018l~g2;\u00135i\n", "uK^8\\6\bA\u001d\b\u00014om", ":nR8", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "5dc\u0019b*D", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\"Y})Fz\u00127\\*Ei:s", "5dc\u001aT?\u001bc\u001a\u007fzk\u001a\u0001\u001e/$\n.\u007fJ", "u(9", "Ah]8", "Ah]863Ha\u0019}", "5dc \\5D1 \t\t^+;\u00135i\n", "Adc \\5D1 \t\t^+;\u00135i\n", "And?V,", "\u001anZ6bu,])\fx^\u0002", "u(;<^0H\u001d\u0007\t\u000bk*|^", "And?V,\u001cZ#\rz]", "5dc b<KQ\u0019\\\u0002h:|\bmo\u0006,\u0006", "Adc b<KQ\u0019\\\u0002h:|\bmo\u0006,\u0006", "1`]0X3", "", "4n[1", "zcT=e,<O(~yX:\u0001\u00125", "zcT=e,<O(~yX:\u0007\u0019<c\u007f", "4naDT9=", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public Pipe(long j2) {
        this.maxBufferSize = j2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
        if (j2 < 1) {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j2).toString());
        }
        this.sink = new Sink() { // from class: okio.Pipe.sink.1
            private final Timeout timeout = new Timeout();

            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                boolean zHasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        return;
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.setSinkClosed$okio(true);
                        pipe.getCondition().signalAll();
                        foldedSink$okio = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.close();
                                Unit unit2 = Unit.INSTANCE;
                                if (zHasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.close();
                            Unit unit3 = Unit.INSTANCE;
                        } finally {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                boolean zHasDeadline;
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSinkClosed$okio()) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    Sink foldedSink$okio = pipe.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    Unit unit = Unit.INSTANCE;
                    if (foldedSink$okio != null) {
                        Pipe pipe2 = Pipe.this;
                        Timeout timeout = foldedSink$okio.timeout();
                        Timeout timeout2 = pipe2.sink().timeout();
                        long jTimeoutNanos = timeout.timeoutNanos();
                        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                foldedSink$okio.flush();
                                Unit unit2 = Unit.INSTANCE;
                                if (zHasDeadline) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long jDeadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            foldedSink$okio.flush();
                            Unit unit3 = Unit.INSTANCE;
                        } finally {
                            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(jDeadlineNanoTime);
                            }
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Sink
            public Timeout timeout() {
                return this.timeout;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
            
                if (r7 == null) goto L77;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
            
                r0 = r11.this$0;
                r4 = r7.timeout();
                r10 = r0.sink().timeout();
                r2 = r4.timeoutNanos();
                r4.timeout(okio.Timeout.Companion.minTimeout(r10.timeoutNanos(), r4.timeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
            
                if (r4.hasDeadline() == false) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
            
                r0 = r4.deadlineNanoTime();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
            
                if (r10.hasDeadline() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
            
                r4.deadlineNanoTime(java.lang.Math.min(r4.deadlineNanoTime(), r10.deadlineNanoTime()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
            
                r7.write(r12, r13);
                r5 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
            
                r6 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
            
                r4.timeout(r2, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
            
                if (r10.hasDeadline() != false) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
            
                r4.deadlineNanoTime(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
            
                throw r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
            
                if (r10.hasDeadline() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
            
                r4.deadlineNanoTime(r10.deadlineNanoTime());
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
            
                r7.write(r12, r13);
                r0 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
            
                r1 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
            
                r4.timeout(r2, java.util.concurrent.TimeUnit.NANOSECONDS);
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
            
                if (r10.hasDeadline() != false) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
            
                r4.clearDeadline();
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
            
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
            
                return;
             */
            @Override // okio.Sink
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void write(okio.Buffer r12, long r13) {
                /*
                    Method dump skipped, instruction units count: 305
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.AnonymousClass1.write(okio.Buffer, long):void");
            }
        };
        this.source = new Source() { // from class: okio.Pipe.source.1
            private final Timeout timeout = new Timeout();

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    pipe.setSourceClosed$okio(true);
                    pipe.getCondition().signalAll();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            public long read(Buffer sink, long j3) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                ReentrantLock lock = Pipe.this.getLock();
                Pipe pipe = Pipe.this;
                lock.lock();
                try {
                    if (pipe.getSourceClosed$okio()) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (pipe.getBuffer$okio().size() == 0) {
                        if (pipe.getSinkClosed$okio()) {
                            lock.unlock();
                            return -1L;
                        }
                        this.timeout.awaitSignal(pipe.getCondition());
                        if (pipe.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long j4 = pipe.getBuffer$okio().read(sink, j3);
                    pipe.getCondition().signalAll();
                    return j4;
                } finally {
                    lock.unlock();
                }
            }

            @Override // okio.Source
            public Timeout timeout() {
                return this.timeout;
            }
        };
    }

    private final void forward(Sink sink, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long jTimeoutNanos = timeout.timeoutNanos();
        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                function1.invoke(sink);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                InlineMarker.finallyStart(1);
                timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                InlineMarker.finallyEnd(1);
            }
        }
        long jDeadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            function1.invoke(sink);
            Unit unit2 = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            timeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(jDeadlineNanoTime);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_sink, reason: not valid java name */
    public final Sink m10816deprecated_sink() {
        return this.sink;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_source, reason: not valid java name */
    public final Source m10817deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(Sink sink) throws IOException {
        Buffer buffer;
        boolean z2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                boolean z3 = this.sinkClosed;
                Buffer buffer2 = null;
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    buffer = null;
                    z2 = true;
                } else {
                    buffer = new Buffer();
                    Buffer buffer3 = this.buffer;
                    buffer.write(buffer3, buffer3.size());
                    this.condition.signalAll();
                    z2 = false;
                }
                Unit unit = Unit.INSTANCE;
                if (z2) {
                    if (z3) {
                        sink.close();
                        return;
                    }
                    return;
                }
                if (buffer == null) {
                    try {
                        Intrinsics.throwUninitializedPropertyAccessException("sinkBuffer");
                    } catch (Throwable th) {
                        this.lock.lock();
                        try {
                            this.sourceClosed = true;
                            this.condition.signalAll();
                            Unit unit2 = Unit.INSTANCE;
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    buffer2 = buffer;
                }
                sink.write(buffer2, buffer.size());
                sink.flush();
            } finally {
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z2) {
        this.canceled = z2;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z2) {
        this.sinkClosed = z2;
    }

    public final void setSourceClosed$okio(boolean z2) {
        this.sourceClosed = z2;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
