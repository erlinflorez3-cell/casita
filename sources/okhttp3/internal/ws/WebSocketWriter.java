package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.`Z2\u000fq{<$q$yّCU(\u000e*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~o4Icxe\u0012\u00152JoM9UڎE9vt>\u0005&98\u0600*\u0005/\u0019j{ z\tCc\f@1PtHT%M3\u001d\"\nL$\u0019\u001e\u000bl^:Vru:]$\u0013mPU?_^}]\u0011T\\?\r%jӿ/@E?]+a\u001c\u001fR\nYIS:S\u0013\u0004?'Yc$[Dt\u0018\u0014CH\u007f\u0013k\u0011>^\u001bP\u000f+oA]\u0004cP<B(~\n.T\u0004<#WL<O2f6-yt;gNs\u001a^p\u001a+eD;=\u007faHi\u001ftvy;Gm\u007f\b\u001336#/\tQ_b0x\u0015Is@]?xX=vh:]K\u0010\u001cp\u0011!z\u0010>G\u0018/*\u0012\u0005ϒ'ھ_9+ܩ<\u0010VO\u007fx\u001b_\u0017_@ɰJغ&n\u001eճz\u0017\u001ag\\f\u001bj~b/\u008f\u0013ܖ T\u000fâX\u001f.k\u0010<O5fʝQŹmjUΪZ3=wO[\u0005j<i\u0010ӗ?̳Uc\u0018Р#\u0003\"GTb3a=̾U۱^\\0ί\u0003Tx\u0017\u0010{rObƑ4Ɛu\u001c<ι\u0002%j\u001b`\u0003LC\u0018Ҕ\u000bރ^h\u0018з%B2\u0007\u0002$#\u000eɹTbxב\u007fzO?\u000btr<OSM\u0019TXɋl:\u0005Ƚ\u001f\u0001y\u0015U}\u001dSZ\u0004.u\u0004\fvډ\u001c\u07fcU/EП_\u000b7J\u001a-sMIϏ]̊\u0016'\u0003۠ɓ\u0013c"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4'f\u0002/7zk", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "7r29\\,Gb", "", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "@`]1b4", "\u001aiPCTuNb\u001d\u0006DK(\u0006\b9mU", ">da\u001aX:LO\u001b~Y^-\u0004\u0005>e", "<n2<a;>f(mvd,\u0007\u001a/r", ";h]6`<F2\u0019\u007f\u0002Z;|v3z\u007f", "", "uY;<^0H\u001du\u000f{_,\n\t.S\u00041\u0002\u0016g\u001c\u0013XkWL\u0006)<#j\u001c@l 6#80Pw\u000f", ";`b86<Ka#\f", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", ";`b8>,R", "", ";db@T.>0)\u007f{^9", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", ";db@T.>2\u0019\u007f\u0002Z;|\u0016", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nh\u0017%Uk\u0010<U%6`y/7zk", "5dc\u001fT5=]!", "u(;7T=:\u001d)\u000e~eui\u00058d\n0Q", "5dc \\5D", "u(;<^0H\u001du\u000f{_,\n\t.S\u00041\u0002\u0016", "Ah]85<?T\u0019\f", "EqXAX9\u001cZ#\rz]", "1k^@X", "", "EqXAX\nE]'~", "1nS2", "", "@dP@b5", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "EqXAX\nH\\(\f\u0005e\r\n\u00057e", "=oR<W,", ">`h9b(=", "EqXAX\u0014>a'z|^\r\n\u00057e", "4na:T;(^\u0017\ty^", "2`c.", "EqXAX\u0017B\\\u001b", "EqXAX\u0017H\\\u001b", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final BufferedSink sink;
    private final Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z2, BufferedSink sink, Random random, boolean z3, boolean z4, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.isClient = z2;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z3;
        this.noContextTakeover = z4;
        this.minimumDeflateSize = j2;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = sink.getBuffer();
        this.maskKey = z2 ? new byte[4] : null;
        this.maskCursor = z2 ? new Buffer.UnsafeCursor() : null;
    }

    private final void writeControlFrame(int i2, ByteString byteString) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.writeByte((-1) - (((-1) - i2) & ((-1) - 128)));
        if (this.isClient) {
            this.sinkBuffer.writeByte((-1) - (((-1) - size) & ((-1) - 128)));
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(byteString);
                Buffer buffer = this.sinkBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(size2);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(size);
            this.sinkBuffer.write(byteString);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final BufferedSink getSink() {
        return this.sink;
    }

    public final void writeClose(int i2, ByteString byteString) throws IOException {
        ByteString byteString2 = ByteString.EMPTY;
        if (i2 != 0 || byteString != null) {
            if (i2 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i2);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i2);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i2, ByteString data) throws IOException {
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.write(data);
        int i3 = (-1) - (((-1) - i2) & ((-1) - 128));
        if (this.perMessageDeflate && data.size() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i3 = i2 | 192;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i3);
        int i4 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i4 | ((int) size));
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i4 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte((i4 + 127) - (i4 & 127));
            this.sinkBuffer.writeLong(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                Buffer buffer = this.messageBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.emit();
    }

    public final void writePing(ByteString payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(ByteString payload) throws IOException {
        Intrinsics.checkNotNullParameter(payload, "payload");
        writeControlFrame(10, payload);
    }
}
