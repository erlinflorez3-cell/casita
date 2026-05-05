package okio;

import com.squareup.wire.internal.MathMethodsKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005#4\u0012\u000e\u0007nj?1Le^.ZS0\u0015s{B$cҕyCQU\"Ԃ*\teNogtMpŏs\u000f4\u00159o2]Ǥ|] \u000frOuЀCQ}>Q`#8ӯ$20;B \u000f)BH>x+GY\u001c*0nrjV\u001b^\u001d\u001a@\b\u0005ĨӘ\"\\m`~jzaR/Q\u0016\u001aF\\+w0+O=LZ'\u001b\u0005y\u001eYBg;\u001b%a\u0010\u001fR\nAID:I\u0013|?'Y^$[Dl\u0018\u0014C@\u0018\u0019k\t>\\3h\u0011\u00105AgcygV;\u0006\u0013\u0014\rj\u0006>\n5YF-HhNԄ\u07baxrYY\u0019\fl\\\u0018z\u00108?%.5q9cp_|S\u0019|9$\u0005; i\u0001?-iU&`C\u001d+Ȱ]śU@Eʰ\u001f\u0016gA\u0006\u0004\u001fdXÒ\u0010ΥK\u007f7Ʌa=%*O[g)\u074co\bPֳ\u007fx\u000bgv[:aVI:nDAҊ\r\u0012bե|\u0007q[bd|\u001d[)l\u0007,\ni\u0601hʟ@!-ī\u001f[vw\u0003M\f\f{ÇrƠ]nsލČ=z"}, d2 = {"\u001anZ6bu-V&\t\nm3|\u0016\u0005", "", "u(E", "/k[<V(MS\u0018n\u0004m0\u0004", "", "uI\u0018#", "0xc2f\u0017>`\u0007~xh5{", "1n]1\\;B]\"", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006T/>X\u0002/;w\u001f\u0004", "5dc\u0010b5=W(\u0003\u0005g", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\u0013c\u0007\u001f;|\u001a8V\u0019", ":nR8", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "5dc\u0019b*D", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\"Y})Fz\u00127\\*Ei:s", ";`g\u000fl;>1#\u000f\u0004m", "E`XA5@MSv\t\u000bg;", "0xc266N\\(h\bP(\u0001\u0018\u0018a\t2\n", "<nf", "0xc266N\\(", "0xc266N\\(h\bP(\u0001\u0018\u0018a\t2\n~\u000b\u001d\u001bQ", "", "Ah]8", "\u001anZ6bu,W\"\u0005P", "And?V,", "\u001anZ6bu,])\fx^\u0002", "B`Z2", "B`Z2\u00176DW#", "0xc2f\u001bH<\u0015\b\u0005l", "<`]<f\u001bH0-\u000ezl", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final Condition condition;
    private final ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public Throttler() {
        this(System.nanoTime());
    }

    public Throttler(long j2) {
        this.allocatedUntil = j2;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        this.condition = conditionNewCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j2, long j3, long j4, int i2, Object obj) {
        if ((2 & i2) != 0) {
            j3 = throttler.waitByteCount;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            j4 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j2, j3, j4);
    }

    private final long bytesToNanos(long j2) {
        return (j2 * MathMethodsKt.NANOS_PER_SECOND) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j2) {
        return (j2 * this.bytesPerSecond) / MathMethodsKt.NANOS_PER_SECOND;
    }

    public final long byteCountOrWaitNanos$okio(long j2, long j3) {
        if (this.bytesPerSecond == 0) {
            return j3;
        }
        long jMax = Math.max(this.allocatedUntil - j2, 0L);
        long jNanosToBytes = this.maxByteCount - nanosToBytes(jMax);
        if (jNanosToBytes >= j3) {
            this.allocatedUntil = j2 + jMax + bytesToNanos(j3);
            return j3;
        }
        long j4 = this.waitByteCount;
        if (jNanosToBytes >= j4) {
            this.allocatedUntil = j2 + bytesToNanos(this.maxByteCount);
            return jNanosToBytes;
        }
        long jMin = Math.min(j4, j3);
        long jBytesToNanos = jMax + bytesToNanos(jMin - this.maxByteCount);
        if (jBytesToNanos != 0) {
            return -jBytesToNanos;
        }
        this.allocatedUntil = j2 + bytesToNanos(this.maxByteCount);
        return jMin;
    }

    public final void bytesPerSecond(long j2) {
        bytesPerSecond$default(this, j2, 0L, 0L, 6, null);
    }

    public final void bytesPerSecond(long j2, long j3) {
        bytesPerSecond$default(this, j2, j3, 0L, 4, null);
    }

    public final void bytesPerSecond(long j2, long j3, long j4) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (j2 < 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j3 <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (j4 < j3) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.bytesPerSecond = j2;
            this.waitByteCount = j3;
            this.maxByteCount = j4;
            this.condition.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final Sink sink(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new ForwardingSink(sink) { // from class: okio.Throttler.sink.1
            @Override // okio.ForwardingSink, okio.Sink
            public void write(Buffer source, long j2) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                while (j2 > 0) {
                    try {
                        long jTake$okio = this.take$okio(j2);
                        super.write(source, jTake$okio);
                        j2 -= jTake$okio;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException("interrupted");
                    }
                }
            }
        };
    }

    public final Source source(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new ForwardingSource(source) { // from class: okio.Throttler.source.1
            @Override // okio.ForwardingSource, okio.Source
            public long read(Buffer sink, long j2) throws InterruptedIOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                try {
                    return super.read(sink, this.take$okio(j2));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        };
    }

    public final long take$okio(long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long jByteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j2);
                if (jByteCountOrWaitNanos$okio >= 0) {
                    return jByteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-jByteCountOrWaitNanos$okio);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
