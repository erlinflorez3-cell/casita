package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\bnjO0L͜P.hS2\u000fq|<$i*yّCU(}*ޛWN}gvJ`\u001aK\u000f\u001c\u0016\u0001̓4Ic\te\u0012\u00152JoMQUoS9ht<\u000f(20?\u0002\u0005\u0007\u001b@Ϻ./+Cy\u000bJ/x1Mb\u0011[\u00052\u00124?0\u0005,^\u007fNdKǰa:='KuP\\?_^\f}\u0011Td?\r%rf1NIM\u0015SbI\u001b\u001b_M\u0016Wqk\u00141M5?as\u0006E\t\u0004\"*CO;`#*j\u001bi`:4[Uqbh\u0010>v)\u0003=@\u0012&\u001e'v;u@t!&3#\u0002\u0004D^\u0018vB.\b\u0012:%?\u00183YFKl_|S\u001bd6*\f=\"1\u0019\u0007!\naVd#7lw\u007f@\u001adKef\n\bL\u001e\b~x\u001a*2=w\u0004=\u001a).E2g_GB9k0Utk\u0005\u001fxh\u0002v\u001bdNB\u0007\u0016e99\u0010he|\u0005\u001a]\u0005\\:3e\u001c\u0003*.\f!DtwjFm2\\u\u0001i\u0019\\\u000e\u000e3D~7\bq\u001c\u0012eOv3c^\u0014\u001aoy\u000f\u001aO>r\u0005\u0007\u0010p{T^jR:2vwX\u0014\nof\fAAou*`D1G_EL\u0011KZA+\u0016\u0010^v>\u0017Ta1K\f2$!\u0001~k!su\u000fa,+mR1O\u0002M\u0019TbRrB.;\r\u000fu\u0010G\u0016uut5*\u0004\b\u0014 D)iU=S+\u000f-6b\u0006;gdr\u0014t\u0016\u001e5.\u0015y=J\u00192u;\u0003pZq3^]\t/\"%m#'\u0016z\u0018y\u0010S+Kq\n#[l\u007f;\u0019gsf8+\u0014O\"3\u0017\b\"+B]G55.wBe[a.u}0\u0012b=)KЄ\u0006Нg\u0016w̥\"i@@PI\b\u0002\u0015а0к\u0007BP۳H\u0014P\u000fL\raO\u0018Яrެ<M\u0013ɀNu\u00154%p\u0005dǈ\u0017u\u0006ҮFa0}Q\tdjQ1)M\u0002tDޱWů\u000fJ\u0017Ϙ[\b?n*\u001ck!-̳dס4\u0006{̸ݦEt"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0017B]\r DC", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "1kX2a;", "", "uK^8\\6\b0)\u007f{^9|\b\u001di\t.Q5D\b", "1k^@X+", "6oP0^\tNT\u001a~\b", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "6oP0^\u001eKW(~\b", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*z\n:|c'f\u0002/7zk", "5dc\u0015c(<Y\u000b\f~m,\n", "u(;<^/Mb$LDb5\f\t<n{/EC\u0010&\"\u00149pGr#;\u0018o-;|\u0016;#", ";`g\u0013e(FS\u0007\u0003\u0010^", "", "/o_9l\bGRt|\u0001L,\f\u00183n\u00026", "", ">dT?F,Mb\u001d\b|l", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`5o\u001dKz.7gS", "1k^@X", "1n];X*MW#\bek,}\u0005-e", "2`c.", "=tc\u0013\\5Ba\u001c~y", "Asa2T4\"R", "And?V,", "0xc266N\\(", "2`c.99:[\u0019", "4kP4f", "0tU3X9", "4kd@[", "4qP:X\u000f>O\u0018~\b", ":d]4g/", "Bx_2", "5n0DT@", ":`bA:6HR\u0007\u000e\b^(\u0005l.", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "2dQBZ\u000b:b\u0015", "", "6dP1X9L", "6dP1X9\u001bZ#|\u0001", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", ";`g\u0011T;::\u0019\b|m/", ">h]4", "/bZ", ">`h9b(=\u001f", ">`h9b(= ", ">tb5C9H[\u001d\rz", ">q^:\\:>R\u0007\u000e\b^(\u0005l.", "@d`BX:M6\u0019zy^9\u000b", "@rc g9>O!", "AdcA\\5@a", "Eh]1b>.^\u0018z\n^", "Eh]1b>,W.~^g*\n\t7e\t7", "", "EqXAX\nH\\(\u0003\u0004n(\f\r9n`5wH\u0001%", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final Buffer hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final BufferedSink sink;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00058i%\nKYXB\u007f8\b}P\u0016iEϽ\\ŲG\u000f\u000eǝѷn0"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*~\u001dGC\u0017B]\r D,s8UN7t8(\u001e>", "", "u(E", ":nV4X9", "\u001aiPCTuNb\u001d\u0006De6~\u000b3n\u0002qbJ\u0003\u0019\u0017TE", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Http2Writer(BufferedSink sink, boolean z2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.client = z2;
        Buffer buffer = new Buffer();
        this.hpackBuffer = buffer;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, buffer, 3, null);
    }

    private final void writeContinuationFrames(int i2, long j2) throws IOException {
        while (j2 > 0) {
            long jMin = Math.min(this.maxFrameSize, j2);
            j2 -= jMin;
            frameHeader(i2, (int) jMin, 9, j2 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, jMin);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) throws IOException {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
        if (peerSettings.getHeaderTableSize() != -1) {
            this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
        }
        frameHeader(0, 0, 4, 1);
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (this.client) {
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.hex(), new Object[0]));
            }
            this.sink.write(Http2.CONNECTION_PREFACE);
            this.sink.flush();
        }
    }

    public final synchronized void data(boolean z2, int i2, Buffer buffer, int i3) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i2, z2 ? 1 : 0, buffer, i3);
    }

    public final void dataFrame(int i2, int i3, Buffer buffer, int i4) throws IOException {
        frameHeader(i2, i4, 0, i3);
        if (i4 > 0) {
            BufferedSink bufferedSink = this.sink;
            Intrinsics.checkNotNull(buffer);
            bufferedSink.write(buffer, i4);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i2, int i3, int i4, int i5) throws IOException {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i2, i3, i4, i5));
        }
        if (i3 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i3).toString());
        }
        if ((Integer.MIN_VALUE + i2) - (Integer.MIN_VALUE | i2) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i2).toString());
        }
        Util.writeMedium(this.sink, i3);
        this.sink.writeByte(i4 & 255);
        this.sink.writeByte(i5 & 255);
        this.sink.writeInt((-1) - (((-1) - i2) | ((-1) - Integer.MAX_VALUE)));
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i2, ErrorCode errorCode, byte[] debugData) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        frameHeader(0, debugData.length + 8, 7, 0);
        this.sink.writeInt(i2);
        this.sink.writeInt(errorCode.getHttpCode());
        if (!(debugData.length == 0)) {
            this.sink.write(debugData);
        }
        this.sink.flush();
    }

    public final synchronized void headers(boolean z2, int i2, List<Header> headerBlock) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(headerBlock);
        long size = this.hpackBuffer.size();
        long jMin = Math.min(this.maxFrameSize, size);
        int i3 = size == jMin ? 4 : 0;
        if (z2) {
            i3 = (i3 + 1) - (i3 & 1);
        }
        frameHeader(i2, (int) jMin, 1, i3);
        this.sink.write(this.hpackBuffer, jMin);
        if (size > jMin) {
            writeContinuationFrames(i2, size - jMin);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z2, int i2, int i3) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z2 ? 1 : 0);
        this.sink.writeInt(i2);
        this.sink.writeInt(i3);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i2, int i3, List<Header> requestHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(requestHeaders);
        long size = this.hpackBuffer.size();
        int iMin = (int) Math.min(((long) this.maxFrameSize) - 4, size);
        long j2 = iMin;
        frameHeader(i2, iMin + 4, 5, size == j2 ? 4 : 0);
        this.sink.writeInt((-1) - (((-1) - i3) | ((-1) - Integer.MAX_VALUE)));
        this.sink.write(this.hpackBuffer, j2);
        if (size > j2) {
            writeContinuationFrames(i2, size - j2);
        }
    }

    public final synchronized void rstStream(int i2, ErrorCode errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        frameHeader(i2, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (this.closed) {
            throw new IOException("closed");
        }
        int i2 = 0;
        frameHeader(0, settings.size() * 6, 4, 0);
        while (i2 < 10) {
            if (settings.isSet(i2)) {
                this.sink.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                this.sink.writeInt(settings.get(i2));
            }
            i2++;
        }
        this.sink.flush();
    }

    public final synchronized void windowUpdate(int i2, long j2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        }
        frameHeader(i2, 4, 8, 0);
        this.sink.writeInt((int) j2);
        this.sink.flush();
    }
}
