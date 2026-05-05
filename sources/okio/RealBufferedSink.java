package okio;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lnA0RnP\u008cZS8\u000fs{:'c$\bCC٥\"}8\tWȞog|VbŏK\u000f\u0014\u001c\u0001̓4Ikxe\u0012\u001dBJoE3UoK@hҚ>\u000562*8\u0010\u0005\t\u001a0W\u0018v\u0011CS\f\u00184F\u0081Pĥ=M3\u0019R\u0011N$\u000f\u001etg|7Ղp]H1k\twEf'\u000e4CaULb3%v\u0010+qT\u007f;#3k\u00035Q\"SKE\u007fL\u001dhU&q]<]Dh\u0018\u0014C8\u0016!&x4m\u001dQ\u000f\u0017m?\u0018iYb&(&\u000eB!\u0005\n\u001c\u001a?H\\B`zP\u0014A\u000b\u000bSngHr\u000b\u000e\tyN\u0017S\u0019c/G5~Q\u0010V_b\u007f\n\u0013%6#/mQ_b(x\u0015Ip>eyoNU`N8Xmq\u0012\u000bz\u0002X `K\u000eL\u0014\u0011\\0U;iW;!\u001a\u001b\u000fX0\r\u0013x\u0001S\u0018_xD0\t.7X\r<^R\u0003\u001dk~s\u001f@Y[*l\u001f}6\u0012P`\u0006\\9%>o\u0016|2\t[u\"%]eg]|\f&Wg\u007fc9_\u0001(a\u0001\u0010DCJ\u0001\u001dX\u0015[\u001a #r6:JH\u0019\u000f(\u007fRh$\u0013`a\" BJI\u0019\u000b4\u000f\u0017fPO !_\t\b@\u0003bM<\u0003\u0018F;\u001dI^j\u0015\bg'H\\\u0001nGEA\u007fN_:\u001e0vZ\u0015#5}$\u0004U\u000fdGz\f\\\n\u001e\n.>29\u007f.m\u0017\u001d&A20L\f`;s_v*'){*\u0013I\u0013Fg6\u00047@)xXzl\u0017Pu\u000fv12|\u007f(z\r\u000f\u0010qb7s>wq3]JuP|3>d9I}0*M-q&M\u001a\u0006;G\u0015\u0010|0\u0004v\bp=>t\u0014\u0003\\g$\u001fzQ\fK\u0002L\u0012g\rn:$\u001b\u0002rLx' B7MSG\u0011Wr\"n8{\n_\u0002t9D\r\u001fm\f>!#\u00164\\\u0014p\b\f$\"\u0010[%?L\u0004k{ c\\9a?\u000e\u00191In@5m$d\u000ez\t^\u001f$\u001cDtSb3pO8|:J?#C\u0003h6\u0014\t2^_=.xV<YdElx\u000bUx\tnwx!X\u0018/\u0013AS\u00115_\u001e\u001eJbe{2/lc\u001dcx]7~%YC\u0005=)ap\u00019^$W\u001a\u001bD\u0007_)\u001co&ʆ8nԔ\u001fÐ\u001c%IS\u0017d\u00056v\r[k\\lG t[f\"W\u00031\u0001dڻ\f۪\u000f\u0019WΓ@r;VfweNP\u0005UH\u007fܕ\u0018ƔgF#ҎVC;=ajB(2[*Ȕ\u007fл$ /״ȵ%\u0017"}, d2 = {"\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u007fI\u0007l", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "Ah]8", "\u001anZ6bu,W\"\u0005P", "uK^8\\6\bA\u001d\b\u00014om", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "5dc\u000fh-?S&=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u000fh-?S&", "u(;<^0H\u001du\u000f{_,\n^", "0tU3X9\u001fW\u0019\u0006y", "1k^@X+", "", "1k^@X", "", "3lXA", "3lXA66F^ ~\n^\u001a|\u000b7e\t7\n", "4kd@[", "7r>=X5", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "BnBAe0GU", "", "EqXAX", "", "And?V,", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "", "=eU@X;", "0xc266N\\(", "", "0xc2F;KW\"\u0001", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\u001anZ6bu,])\fx^\u0002", "EqXAX\bEZ", "EqXAX\tRb\u0019", AdkSettings.PLATFORM_TYPE_MOBILE, "EqXAX\u000b>Q\u001d\u0007ve\u0013\u0007\u00121", "D", "EqXAX\u000f>f\u0015}z\\0\u0005\u00056U\t6\u007fB\n\u0017\u0016.y\u0017>", "EqXAX\u0010Gb", "7", "EqXAX\u0010Gb\u007f~", "EqXAX\u0013H\\\u001b", "EqXAX\u0013H\\\u001bez", "EqXAX\u001aA]&\u000e", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "EqXAX\u001aA]&\u000ea^", "EqXAX\u001aM`\u001d\b|", "Asa6a.", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "EqXAX\u001cMTk", "EqXAX\u001cMTk\\\u0005],g\u00133n\u000f", "1nS2C6B\\(", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    /* JADX INFO: renamed from: okio.RealBufferedSink$outputStream$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я+\u001d̉=!4i\bӵLc\u0003\u0004I\u00066\u000b6B\r.4\u0012}\u0007njG@L͜P.`Y2\u000fq|\\#Ӌ*yYП\u0006\u001a,!QU\\g\u007fnx[QWW\f$z\u0003,wV?qZ\u0015@E\b?aQ6Q\u0002~\u0003;\u001d `#h}\u0013\u00072*v\u0017'~QS$\u0012^I!>`\u0017e\u0005H\u001bLRh\u000f,a\u007fNdI\u001daH:;\u0003\u0018K\u0015;ۨ4\t"}, d2 = {"=jX<\"\u0019>O [\u000b_-|\u0016/dm,\u0005F?!'Vz\u001eKd4BYy(u9", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "1k^@X", "", "4kd@[", "BnBAe0GU", "", "EqXAX", "2`c.", "", "=eU@X;", "", "0xc266N\\(", AdkSettings.PLATFORM_TYPE_MOBILE, "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends OutputStream {
        AnonymousClass1() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            RealBufferedSink.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (RealBufferedSink.this.closed) {
                return;
            }
            RealBufferedSink.this.flush();
        }

        public String toString() {
            return RealBufferedSink.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) throws IOException {
            if (RealBufferedSink.this.closed) {
                throw new IOException("closed");
            }
            RealBufferedSink.this.bufferField.writeByte((int) ((byte) i2));
            RealBufferedSink.this.emitCompleteSegments();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i2, int i3) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (RealBufferedSink.this.closed) {
                throw new IOException("closed");
            }
            RealBufferedSink.this.bufferField.write(data, i2, i3);
            RealBufferedSink.this.emitCompleteSegments();
        }
    }

    public RealBufferedSink(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.RealBufferedSink.outputStream.1
            AnonymousClass1() {
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (RealBufferedSink.this.closed) {
                    return;
                }
                RealBufferedSink.this.flush();
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i2) throws IOException {
                if (RealBufferedSink.this.closed) {
                    throw new IOException("closed");
                }
                RealBufferedSink.this.bufferField.writeByte((int) ((byte) i2));
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] data, int i2, int i3) throws IOException {
                Intrinsics.checkNotNullParameter(data, "data");
                if (RealBufferedSink.this.closed) {
                    throw new IOException("closed");
                }
                RealBufferedSink.this.bufferField.write(data, i2, i3);
                RealBufferedSink.this.emitCompleteSegments();
            }
        };
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.bufferField.write(source);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(ByteString byteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.write(byteString, i2, i3);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(Source source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j2 > 0) {
            long j3 = source.read(this.bufferField, j2);
            if (j3 == -1) {
                throw new EOFException();
            }
            j2 -= j3;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.write(source);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink write(byte[] source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.write(source, i2, i3);
        return emitCompleteSegments();
    }

    @Override // okio.Sink
    public void write(Buffer source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.write(source, j2);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j2 = 0;
        while (true) {
            long j3 = source.read(this.bufferField, 8192L);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public BufferedSink writeByte(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeByte(i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeDecimalLong(long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeDecimalLong(j2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(j2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeInt(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeInt(i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeIntLe(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeIntLe(i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLong(long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLong(j2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeLongLe(long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLongLe(j2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShort(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShort(i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeShortLe(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShortLe(i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String string, int i2, int i3, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, i2, i3, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeString(String string, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(string, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8(String string, int i2, int i3) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(string, i2, i3);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i2) {
        if (this.closed) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8CodePoint(i2);
        return emitCompleteSegments();
    }
}
