package okio;

import java.io.Closeable;
import java.io.IOException;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007\"2\u0013\u007f\u0007|jA0ZeP.XT2\u000fy\u0002<$a%yCQU\"Ԃ*\t]NogtJb\u000bQ\u0016\u000e\u0016~j4Ikxe\u0012\u00155JoMCUoC>htL\u0005(2(>\u007f)\u0017ɝZL>ucC*\fJ0k\u001dz]\u001dQ\u0013\u001b*\u0006l\"Ә\"\\uQ~LzkR/Q\u00122F\\7w0+^UJb9%v\u0010/sLEH-%\u0002\u00177ViT\u001b? LMt5:CI\"kf\\\u000e*-+}$&x4t\u001dQ\u000f\u001dmM\u0018iYi&(&\fB/\u0005*\u001c ?H\\8Jj\u0016)Kt!gpT\u0010zZ\u007f)~f\u001b3\u001eK+g&\u0017UoZ1Ne\u0007K/f1\u000f\u000f9[\u0003\u001f\u0011\u0019)u\u0010Q_e\u0007_\u0011T\u0018{Um2\u0005)$r*>j\u0018/*\"^\u001b3Rs9Q5\u001c\u0006V`\u007fv3}\u0019Wwp`@PyF;8($ZroK\u000e\u0019xfP)MJ_7\u0002\u0016.8\\&PQ)\u001ejgh\u0018\b}a\u0018CGfed\u001fo\u001cvQ^a@\u001a\u007f\u001e\u0006jvBSlf\u0013s~B\u0002 \u000b`67JH\u00195(\u007fRm$\u0013`S::BRI\u0019\u000b)x\u0007,]Y|7s\u000bl\u001e\u0014l3R(\u001a(\u0003(\u0019P\u000b\u00056gA]:$x\"[R\u00029';m\"\u0017C-'\u0015\u0012\f\u007fu{\u0015[Z\u0014.u\u0004\rP\u001a(Oi/k*?\u00037E\u001a-s`;q_u*')\u000e*\u0013I\nFg6~9:n\u007fbO\u0003&R|dr1#|\u007f(u\u000f~U\u0005l\u000b\nR\u0012\u0001\u0011oTNf\u00145%$%\u000f\u000b:|cA\fK+?\u0010\u0014]&\u0012aw\u000bFy\u0011#Vxs DcD\r\u0013UkPS8wd/B0C\u0005\u0003pS3\u0014\u0016k!4;DxEr\fn8{\u001f_\u0002t\u001dD\r\u001f{\f>!\u000f\u00164\\sr\u0012Q(,^q6AQa\u0003\u0006myp;N\u001d #{_\u0014B K?nW\u0011\u001dv\u0006D$DESb3>_Ӛ@ʙ@\b\u0013͏%|\u0014\u0015\u0013\u0004tew\u0017\u0011IǠ?\\\u0016֊\u0011^\\P\u0013i\u0016l/4\u0019~=>tְA̰\tmN\u07bc\u007fr@\u0002k\u001d7\u001d˥S\u0005nއCFZE)5\u0098\u00058"}, d2 = {"\u001anZ6bu\u001fW ~]Z5{\u0010/;", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001anZ6bu\u001cZ#\rzZ)\u0004\t\u0005", "@dP1J9Bb\u0019", "", "uY\u0018#", "1k^@X+", ":nR8", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006c%5b\r-3v%\u0015WAAA", "\u001anZ6bu%]\u0017\u0005P", "5dc\u0019b*D", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`Ny\fB\u0005n\"Y})Fz\u00127\\*Ei:s", "=oT;F;KS\u0015\u0007Xh<\u0006\u0018", "", "5dc\u001fX(=E&\u0003\n^", "u(I", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "1k^@X", "", "4kd@[", ">nb6g0H\\", "", "Ah]8", "And?V,", "\u001anZ6bu,])\fx^\u0002", ">q^AX*MS\u0018\\\u0002h:|", ">q^AX*MS\u0018_\u0002n:\u007f", ">q^AX*MS\u0018kzZ+", "4h[2B-?a\u0019\u000e", "/qa.l", "", "/qa.l\u0016?T'~\n", "0xc266N\\(", ">q^AX*MS\u0018kzl0\u0012\t", "Ahi2", ">q^AX*MS\u0018l~s,", ">q^AX*MS\u0018p\bb;|", "@dP1", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "@dP1A6\u001cZ#\rz</|\u00075", "@d_<f0MW#\b", "@db6m,", "EqXAX", "EqXAX\u0015H1 \t\t^\n\u007f\t-k", "\u0014h[2;(GR ~hb5\u0003", "\u0014h[2;(GR ~hh<\n\u0007/", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class FileHandle implements Closeable {
    private boolean closed;
    private final ReentrantLock lock = _JvmPlatformKt.newLock();
    private int openStreamCount;
    private final boolean readWrite;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r)4\u0012}\u0007njG9LeN7ZS8\u000fs{:$c$\bCCU }*\teNogtJ`\u000bYƤ6\u0016'il\\e|k\u0012'2ppO7[qU9\u000fwȥ\t @&\u0001\u007f\u0013\u00122*v\"=\u000f\fQ\u001a%H@\u001fL\u0019!\u0016\u000b(&\u001e>N\u0016dp0dD^\u0005]hAS\u0007wYf'\u000eH-Q\u001b_l';y(2{XE:-%\u0002\t]ѿgύ\u0007Kyܵ\u001dj-.9Q\u0014Y<a\u000e\u001ee:]\rurT]ԇUf\u0014ʬCQiV^\u001ax\u0010\t}%<2\u0011\\ΰTͶ1&nڜ&5z\u007faNp\u0004dQ\u000e\u000bˑ:1"}, d2 = {"\u001anZ6bu\u001fW ~]Z5{\u0010/$`,\u0003@c\u0013 Fv\u000e*z.;/", "\u001anZ6bu,W\"\u0005P", "4h[2;(GR ~", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", ">nb6g0H\\", "", "uK^8\\6\b4\u001d\u0006zA(\u0006\b6eU\r?1", "1k^@X+", "", "5dc\u0010_6LS\u0018", "u(I", "Adc\u0010_6LS\u0018", "uY\u0018#", "5dc\u0013\\3>6\u0015\bye,", "u(;<^0H\u001dy\u0003\u0002^\u000fx\u0012.l\u007f}", "5dc\u001db:Bb\u001d\t\u0004", "u(9", "Adc\u001db:Bb\u001d\t\u0004", "uI\u0018#", "1k^@X", "", "4kd@[", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "EqXAX", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class FileHandleSink implements Sink {
        private boolean closed;
        private final FileHandle fileHandle;
        private long position;

        public FileHandleSink(FileHandle fileHandle, long j2) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j2;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.fileHandle;
                fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    this.fileHandle.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            this.fileHandle.protectedFlush();
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final FileHandle getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        public final void setClosed(boolean z2) {
            this.closed = z2;
        }

        public final void setPosition(long j2) {
            this.position = j2;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Timeout.NONE;
        }

        @Override // okio.Sink
        public void write(Buffer source, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            this.fileHandle.writeNoCloseCheck(this.position, source, j2);
            this.position += j2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r)4\u0012}\u0007njG9LeN7ZS8\u000fs{:$c$\bCCU }*\teNo˧tJpŏs\u000f4\u00159}<Mcxu\u0012=3RsM5eok<žx6\u0013$z(F\u000b\u001d\u0001H<\u000f$?\u0011Q^$\u0012^C!>`!e\u0005H'6B.\u00176\\\u0016Q|\\5cHF;\u0003\u0018Z\u0015;0H\u000bR%F\u0003-cǿmӿ/L?ߎ-'Y\n\u0015Z{A\tH\u007fGUw5'CI\"X͏\\\u0006\u001cƃCQ\u0013h\u00012-\u001d_b$'YR:֦\\ˎ,\u0004\u0003Ԉ%>\n\u001b\u00145h03)t\u0018ԭ7\u000e"}, d2 = {"\u001anZ6bu\u001fW ~]Z5{\u0010/$`,\u0003@c\u0013 Fv\u000e*\u00015BW}u", "\u001anZ6bu,])\fx^\u0002", "4h[2;(GR ~", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", ">nb6g0H\\", "", "uK^8\\6\b4\u001d\u0006zA(\u0006\b6eU\r?1", "1k^@X+", "", "5dc\u0010_6LS\u0018", "u(I", "Adc\u0010_6LS\u0018", "uY\u0018#", "5dc\u0013\\3>6\u0015\bye,", "u(;<^0H\u001dy\u0003\u0002^\u000fx\u0012.l\u007f}", "5dc\u001db:Bb\u001d\t\u0004", "u(9", "Adc\u001db:Bb\u001d\t\u0004", "uI\u0018#", "1k^@X", "", "@dP1", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class FileHandleSource implements Source {
        private boolean closed;
        private final FileHandle fileHandle;
        private long position;

        public FileHandleSource(FileHandle fileHandle, long j2) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j2;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ReentrantLock lock = this.fileHandle.getLock();
            lock.lock();
            try {
                FileHandle fileHandle = this.fileHandle;
                fileHandle.openStreamCount--;
                if (this.fileHandle.openStreamCount == 0 && this.fileHandle.closed) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    this.fileHandle.protectedClose();
                }
            } finally {
                lock.unlock();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final FileHandle getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        @Override // okio.Source
        public long read(Buffer sink, long j2) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            long noCloseCheck = this.fileHandle.readNoCloseCheck(this.position, sink, j2);
            if (noCloseCheck != -1) {
                this.position += noCloseCheck;
            }
            return noCloseCheck;
        }

        public final void setClosed(boolean z2) {
            this.closed = z2;
        }

        public final void setPosition(long j2) {
            this.position = j2;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Timeout.NONE;
        }
    }

    public FileHandle(boolean z2) {
        this.readWrite = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readNoCloseCheck(long j2, Buffer buffer, long j3) throws IOException {
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = j3 + j2;
        long j5 = j2;
        while (true) {
            if (j5 >= j4) {
                break;
            }
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iProtectedRead = protectedRead(j5, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j4 - j5, 8192 - segmentWritableSegment$okio.limit));
            if (iProtectedRead == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    buffer.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (j2 == j5) {
                    return -1L;
                }
            } else {
                segmentWritableSegment$okio.limit += iProtectedRead;
                long j6 = iProtectedRead;
                j5 += j6;
                buffer.setSize$okio(buffer.size() + j6);
            }
        }
        return j5 - j2;
    }

    public static /* synthetic */ Sink sink$default(FileHandle fileHandle, long j2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = 0;
        }
        return fileHandle.sink(j2);
    }

    public static /* synthetic */ Source source$default(FileHandle fileHandle, long j2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            j2 = 0;
        }
        return fileHandle.source(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeNoCloseCheck(long j2, Buffer buffer, long j3) throws IOException {
        long j4 = j2;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j3);
        long j5 = j3 + j4;
        while (j4 < j5) {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(j5 - j4, segment.limit - segment.pos);
            protectedWrite(j4, segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j6 = iMin;
            j4 += j6;
            buffer.setSize$okio(buffer.size() - j6);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public final Sink appendingSink() throws IOException {
        return sink(size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedClose();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedFlush();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final boolean getReadWrite() {
        return this.readWrite;
    }

    public final long position(Sink sink) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            size = realBufferedSink.bufferField.size();
            sink = realBufferedSink.sink;
        } else {
            size = 0;
        }
        if (!(sink instanceof FileHandleSink) || ((FileHandleSink) sink).getFileHandle() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        FileHandleSink fileHandleSink = (FileHandleSink) sink;
        if (fileHandleSink.getClosed()) {
            throw new IllegalStateException("closed".toString());
        }
        return fileHandleSink.getPosition() + size;
    }

    public final long position(Source source) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof RealBufferedSource) {
            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
            size = realBufferedSource.bufferField.size();
            source = realBufferedSource.source;
        } else {
            size = 0;
        }
        if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        FileHandleSource fileHandleSource = (FileHandleSource) source;
        if (fileHandleSource.getClosed()) {
            throw new IllegalStateException("closed".toString());
        }
        return fileHandleSource.getPosition() - size;
    }

    protected abstract void protectedClose() throws IOException;

    protected abstract void protectedFlush() throws IOException;

    protected abstract int protectedRead(long j2, byte[] bArr, int i2, int i3) throws IOException;

    protected abstract void protectedResize(long j2) throws IOException;

    protected abstract long protectedSize() throws IOException;

    protected abstract void protectedWrite(long j2, byte[] bArr, int i2, int i3) throws IOException;

    public final int read(long j2, byte[] array, int i2, int i3) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedRead(j2, array, i2, i3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long read(long j2, Buffer sink, long j3) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return readNoCloseCheck(j2, sink, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void reposition(Sink sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(sink instanceof RealBufferedSink)) {
            if (!(sink instanceof FileHandleSink) || ((FileHandleSink) sink).getFileHandle() != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
            }
            FileHandleSink fileHandleSink = (FileHandleSink) sink;
            if (fileHandleSink.getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            fileHandleSink.setPosition(j2);
            return;
        }
        RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
        Sink sink2 = realBufferedSink.sink;
        if (!(sink2 instanceof FileHandleSink) || ((FileHandleSink) sink2).getFileHandle() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        FileHandleSink fileHandleSink2 = (FileHandleSink) sink2;
        if (fileHandleSink2.getClosed()) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.emit();
        fileHandleSink2.setPosition(j2);
    }

    public final void reposition(Source source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source instanceof RealBufferedSource)) {
            if (!(source instanceof FileHandleSource) || ((FileHandleSource) source).getFileHandle() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            FileHandleSource fileHandleSource = (FileHandleSource) source;
            if (fileHandleSource.getClosed()) {
                throw new IllegalStateException("closed".toString());
            }
            fileHandleSource.setPosition(j2);
            return;
        }
        RealBufferedSource realBufferedSource = (RealBufferedSource) source;
        Source source2 = realBufferedSource.source;
        if (!(source2 instanceof FileHandleSource) || ((FileHandleSource) source2).getFileHandle() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        FileHandleSource fileHandleSource2 = (FileHandleSource) source2;
        if (fileHandleSource2.getClosed()) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSource.bufferField.size();
        long position = j2 - (fileHandleSource2.getPosition() - size);
        if (0 <= position && position < size) {
            realBufferedSource.skip(position);
        } else {
            realBufferedSource.bufferField.clear();
            fileHandleSource2.setPosition(j2);
        }
    }

    public final void resize(long j2) throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedResize(j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Sink sink(long j2) throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new FileHandleSink(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedSize();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Source source(long j2) throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void write(long j2, Buffer source, long j3) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            writeNoCloseCheck(j2, source, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void write(long j2, byte[] array, int i2, int i3) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedWrite(j2, array, i2, i3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
