package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import okio.internal._ZlibJvmKt;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{:$c$\bCCU0}*ޛWNugvJ`\fK\u000f\u001c\u0016\u0001j2I]xs\u0012\u0017˰JoM:UoC;vҚf\u0005N1bC\n\t\u000f\u001aBH>uټGK\u001a\u0013xF~Hj\r{\u0014`&NM.\b6`\u0016V\u001fHKf\u00014ݭ\u0007iH^oe>\u000ee\rtcm!?g,=X7c(kgK\u001d`oW\u0003m\u0001m\tv<?+w\n\b:f\u0017,\u0015YgS];<j\u001ei`:6[Sqeh\u000eV\u000e+\u007f\u001bS\u001c\u000e4?\u000fBu t#&3#\u0002\u001a@!\u000elD\u0018z\u00109mӞ\fĴ/9#Ƙ\"qI\u001df;*\nu\u001e\u0002\u0007EĒ]ڍ\u0012`\u001dÑ%\r_8iDkP7\n8F$IͲf\b2ʶHI\u00066\n\u001b~#3Bs9Q-BȸJזkv\r\u009b9_wR`@P{lն,Á\u0010ZLߟʶol"}, d2 = {"\u001anZ6bu h\u001d\nhb5\u0003^", "\u001anZ6bu,W\"\u0005P", "Ah]8", "uK^8\\6\bA\u001d\b\u00014om", "1k^@X+", "", "1qR", "\u001aiPCTuNb\u001d\u0006Ds0\bR\rR]uH\u0016", "\u001anZ6buB\\(~\bg(\u0004R\rR]uH\u0016", "2dU9T;>`", "\u001aiPCTuNb\u001d\u0006Ds0\bR\u000ee\u0001/wO\u0001$l", "\u001anZ6bu\u001dS\u001a\u0006vm,\n^", "u(;7T=:\u001d)\u000e~eu\u0012\r:/^(|G|&\u0017TE", "2dU9T;>`\u0007\u0003\u0004d", "\u001anZ6bu\u001dS\u001a\u0006vm,\nv3n\u0006}", "\u001anZ6bu+S\u0015\u0006Wn-}\t<e~\u0016\u007fI\u0007l", "1k^@X", "", "zcT=e,<O(~yX+|\n6a\u000f(\t", "4kd@[", "Bh\\2b<M", "\u001anZ6bu-W!~\u0005n;R", "CoS.g,\u001c`\u0017", "0tU3X9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "0xc266N\\(", "", "EqXAX", "And?V,", "EqXAX\rH](~\b", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final RealBufferedSink sink;

    public GzipSink(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(_ZlibJvmKt.getDEFAULT_COMPRESSION(), true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j2) {
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j2 -= (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "deflater", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m10813deprecated_deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        try {
            this.deflaterSink.finishDeflate$okio();
            writeFooter();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // okio.Sink
    public void write(Buffer source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return;
        }
        updateCrc(source, j2);
        this.deflaterSink.write(source, j2);
    }
}
