package okio;

import androidx.compose.animation.core.AnimationKt;
import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00126Ȑ\u0007\":\u001b\u007f\u0007ljA0ReP\u008cZS@\u000fs{:(c$\bCCU \u007f*\teNogtO`\u001fYƤ$2)jZH\u000ewyR\u0012̓FoM3\u0016}K@xtd\rP60A\u0012\u0005/$p\\X|\tNc\f@8\u0007\u0005\u0003X\u001bY\u001d\u001a@ß\u00054I$jtf6vǍ$Nw7\u0011wZNUڿ`\u0001[\u001c^TU\u0010'e,;X7c&mY\u0011\tj[m\u0006\u0006\u0006\u0006\u0013v)?+w֕\b:f\u0002,\u0015YRSq;,j\ti`:,qc,v^ @wA\u000f->\n\u05fa\u0014:x2;.~\b<ޗ%|aUh\bnD\u0010z(IE;FĘ1߆\u001aƘЂe;'e\u007f\u0002\u0013%6#/vgo\u001d$n.3T&\u0383aUNV`N8\\mq\u0012\u0001z\u0002X\u0015v[H5\n\u0017F\u0017S:\"Mk/y\u001c`D\u0016~5dvn\u0002Rv?h\u0003fE8\n$\\Zc3j'Ӽd¯\u0015M$\u0381W\n\u0016\u00158\\&?wغ\u001cʽShqҔ\u001ei\u0018)Gfe^E\u008b\u001aĆ=^;̐\"o\u001egjvBB\u0013ϸ\u0011ֽjB[ێȚ\\-*5Nд@&zΒR)"}, d2 = {"\u001anZ6bu-W!~\u0005n;R", "", "u(E", "1`]0X3&O&\u0005", "2dP1_0GS\u0002z\u0004h\u001b\u0001\u0011/", "", "6`b\u0011X(=Z\u001d\bz", "", "Bh\\2b<M<\u0015\b\u0005l", "/vP6g\u001aBU\"z\u0002", "", "1n]1\\;B]\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006T/>X\u0002/;w\u001f\u0004", "1`]0X3", "1kT.e\u000b>O\u0018\u0006~g,", "1kT.e\u001bB[\u0019\t\u000bm", "2dP1_0GS", "2ta.g0H\\", "CmXA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "7mc2e:>Q(p~m/", "\"", "=sW2e", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uK^8\\6\bB\u001d\u0007zh<\f^\u0016k\n7\u0003D\n`\u001cXwW=\u0007.3h\u0002*@{_\u000f]L9z8(\u001e37|mh(_rpNHW.&<oB\u0014\u0010ic", "Bga<j\u0010?@\u0019zxa,{", "Bh\\2b<M", "E`XAH5MW g\u0005m0}\r/d", ";n]6g6K", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class Timeout {
    public static final Companion Companion = new Companion(null);
    public static final Timeout NONE = new Timeout() { // from class: okio.Timeout$Companion$NONE$1
        @Override // okio.Timeout
        public Timeout deadlineNanoTime(long j2) {
            return this;
        }

        @Override // okio.Timeout
        public void throwIfReached() {
        }

        @Override // okio.Timeout
        public Timeout timeout(long j2, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    };
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0019\u007f\u0007llA0ZeP\u008cZS@\u000fs{:%aҜrYП\u0006\u001a,!ITTg̊rJh\u000b\f#\u0014\u0019\u0011jZM\u0006|k\u0017'2pso7[uU9\u000fx~\u001d.9:8(\u0007)\u001aXJ@z\tJc\f@4ptHZ%M3#Z L'\u0019\u001e\u000biv6vn\u000e>=-\u001bipYф^ܞƊQ\u000fL`5\u001aGo,,X7c\u0017[WYޟTÜC\u0003Gмܸ\u0005m/*1ʀ\u0010\u00065ނ\u0004\""}, d2 = {"\u001anZ6bu-W!~\u0005n;;f9m\u000b$\u0005D\u000b l", "", "u(E", "\u001cN=\u0012", "\u001anZ6bu-W!~\u0005n;R", ";h]!\\4>])\u000e", "", "/MP;b:", "0MP;b:", "Bh\\2b<M", "CmXA", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "2ta.g0H\\", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "Bh\\2b<M\u001b{`En~`h", "uK^8\\6\bB\u001d\u0007zh<\f^\u0014)f2\u0002D\u000b`\u0006Kw\u000eF\u00074\u000b", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long minTimeout(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }

        public final Timeout timeout(Timeout timeout, long j2, DurationUnit unit) {
            Intrinsics.checkNotNullParameter(timeout, "<this>");
            Intrinsics.checkNotNullParameter(unit, "unit");
            return timeout.timeout(j2, DurationUnitKt.toTimeUnit(unit));
        }

        /* JADX INFO: renamed from: timeout-HG0u8IE */
        public final Timeout m10818timeoutHG0u8IE(Timeout timeout, long j2) {
            Intrinsics.checkNotNullParameter(timeout, "$this$timeout");
            return timeout.timeout(Duration.m10326getInWholeNanosecondsimpl(j2), TimeUnit.NANOSECONDS);
        }
    }

    public void awaitSignal(Condition condition) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(condition, "condition");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                condition.await();
                return;
            }
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(jTimeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public Timeout clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public Timeout clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final Timeout deadline(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public Timeout deadlineNanoTime(long j2) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j2;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(Timeout other, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(block, "block");
        long jTimeoutNanos = timeoutNanos();
        timeout(Companion.minTimeout(other.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
        if (!hasDeadline()) {
            if (other.hasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                InlineMarker.finallyEnd(1);
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public Timeout timeout(long j2, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
        }
        this.timeoutNanos = unit.toNanos(j2);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object monitor) throws InterruptedIOException {
        Intrinsics.checkNotNullParameter(monitor, "monitor");
        try {
            boolean zHasDeadline = hasDeadline();
            long jTimeoutNanos = timeoutNanos();
            if (!zHasDeadline && jTimeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zHasDeadline && jTimeoutNanos != 0) {
                jTimeoutNanos = Math.min(jTimeoutNanos, deadlineNanoTime() - jNanoTime);
            } else if (zHasDeadline) {
                jTimeoutNanos = deadlineNanoTime() - jNanoTime;
            }
            if (jTimeoutNanos <= 0) {
                throw new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            }
            Object obj = this.cancelMark;
            long j2 = jTimeoutNanos / AnimationKt.MillisToNanos;
            monitor.wait(j2, (int) (jTimeoutNanos - (AnimationKt.MillisToNanos * j2)));
            if (System.nanoTime() - jNanoTime >= jTimeoutNanos && this.cancelMark == obj) {
                throw new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
