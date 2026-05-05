package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JhP.hS2şs{B+c$wDCU0}*ޛWNuwvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ic~e\u0012\u00154JoM3UoC?vҚf\u0005N1Z7\u001eE,*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u0010]\t(\u0016\u001e>N\u0006.`uTNH\u001b^J31\n\u0002B|(ۢ4|[\u0015\u000fZ5)\u000faLH\u0007K}\u00193q\u001b\u0007\u0001x\b\tM\u0011U\u0005\u0017Dm+\u0012yeVp\u007fB2qOUc\u0001Gt\u0005\u007f}R'sUqmh\u000eV\u0015A{UB\u00121\u001e'vKs\u001a7\u0014\u001c<\rr\u0002A'؟j۰\u0004ziاg1\u000e=C9Iq(Ĩ=ϭR7\u0004˜]*1\u0005\u0007!\nYd֮\u0017ôXwYĸ\"LKTf\n\bJDՑ|Ċ\u0006*\f\u0382\u0018\f={).E&\u000eن;؝%k\n҆\u0015s\u0005\u0013xh\u0002j)̵Ḻr\u0016?ѧY\u0018hS|\u0005\u001aQ+Г8ҭQ\u001c\\͵N\u0016!0tyR S!%лjȬnMe܃u=tIqp\u0002\r\u0006L5ګ7Ʉg\u0010i\u05ecG MPz\u0005\u0007q\u0019Ͱ\u000eȺ`(*õ\u0019x\u001e\r\u0014Fd\u000bAH\u0016ڧ(ٜ01!¢eT\u0011%ZA+\n6ʶjʐ\u0003T;ɴSu2\f!\u0001~tGהs֑M,\u0005ʠr9OWM\u0019TVx־6č'\u0007\u0007͞PSue_L\u001b\u0017Lɠ\b°\u001a\u001aA֗\u007fL!\u0011\u0017)`\u0005βIRzόiO\u0018A\t\u0018ɓ\u0013`"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\"Yy\u001f7zk", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "7r29\\,Gb", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "4qP:X\n:Z {v\\2", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\"Yy\u001f7zT\u000fZ?Ck\u0012\u001a\u001co^5\u0005i\u0002", ">da\u001aX:LO\u001b~Y^-\u0004\u0005>e", "<n2<a;>f(mvd,\u0007\u001a/r", "uY;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l}Qu\u0011K\u00060\u0003#\u0002)Fm#7IJ\u0005}Bg\u0007h^'\u0011a2N\u0006\u0014GHM,i\u0011SJ\u0010\u001aZkJ2\u0014\u0002U?*D9,bx", "1k^@X+", "1n]Ae6E4&z\u0003^\t\r\n0e\r", "\u001anZ6bu\u001bc\u001a\u007fzk\u0002", "4qP:X\u0013>\\\u001b\u000e}", "", "7r2<a;K] _\bZ4|", "7r56a(E4&z\u0003^", ";`b86<Ka#\f", "\u001anZ6bu\u001bc\u001a\u007fzkjl\u0012=a\u0001(YP\u000e%!TE", ";`b8>,R", "", ";db@T.>4&z\u0003^\t\r\n0e\r", ";db@T.>7\"\u007f\u0002Z;|\u0016", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nh\u0017%Uk\u0010<Z.6`y/7zk", "=oR<W,", "", "@dP1\\5@1#\u0007\u0006k,\u000b\u0017/dg(\nN|\u0019\u0017", "5dc b<KQ\u0019", "u(;<^0H\u001du\u000f{_,\n\t.S\n8\t>\u0001l", "1k^@X", "", ">q^0X:L<\u0019\u0012\n?9x\u0011/", "@dP166Gb&\t\u0002?9x\u0011/", "@dP1;,:R\u0019\f", "@dP1@,La\u0015\u0001z", "@dP1@,La\u0015\u0001z?9x\u0011/", "@dP1H5MW g\u0005g\n\u0007\u0012>r\n/\\M|\u001f\u0017", "\u0014qP:X\n:Z {v\\2", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final Buffer controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final BufferedSource source;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r(4ߚ\u007f\u0007tvA0JfP.hS2\u000fq}:\tqҕ\"CiTb\u00140\tgN\u0016h\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0017UV\u000b}M9eok:\u0011xD\f82P=@)I(8N(v)D{\u0010 8Xph[SqM( \u0010V /\u001f\rk\\A`l\fCuGKwPZ?_^}}\u0011T_?\r%jdOÑ;B"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI:\n\nr\u0017\u00145y\fBv4\"Yy\u001f7zT\u000fZ?Ck\u0012\u001a\u001co^5\u0005i\u0002", "", "=mA2T+\u001cZ#\rz", "", "1nS2", "", "@dP@b5", "", "=mA2T+&S'\rv`,", "BdgA", "0xc2f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "=mA2T+)W\"\u0001", ">`h9b(=", "=mA2T+)]\"\u0001", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface FrameCallback {
        void onReadClose(int i2, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z2, BufferedSource source, FrameCallback frameCallback, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.isClient = z2;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z3;
        this.noContextTakeover = z4;
        this.controlFrameBuffer = new Buffer();
        this.messageFrameBuffer = new Buffer();
        this.maskKey = z2 ? null : new byte[4];
        this.maskCursor = z2 ? null : new Buffer.UnsafeCursor();
    }

    private final void readControlFrame() throws IOException {
        short s2;
        String utf8;
        long j2 = this.frameLength;
        if (j2 > 0) {
            this.source.readFully(this.controlFrameBuffer, j2);
            if (!this.isClient) {
                Buffer buffer = this.controlFrameBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.checkNotNull(unsafeCursor);
                buffer.readAndWriteUnsafe(unsafeCursor);
                this.maskCursor.seek(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s2 = this.controlFrameBuffer.readShort();
                    utf8 = this.controlFrameBuffer.readUtf8();
                    String strCloseCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s2);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s2 = 1005;
                    utf8 = "";
                }
                this.frameCallback.onReadClose(s2, utf8);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z2;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = Util.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i2 = (iAnd + 15) - (15 | iAnd);
            this.opcode = i2;
            boolean z3 = (-1) - (((-1) - iAnd) | ((-1) - 128)) != 0;
            this.isFinalFrame = z3;
            boolean z4 = (iAnd + 8) - (8 | iAnd) != 0;
            this.isControlFrame = z4;
            if (z4 && !z3) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z5 = (iAnd + 64) - (64 | iAnd) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z5) {
                    z2 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z2 = true;
                }
                this.readingCompressedMessage = z2;
            } else if (z5) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((32 & iAnd) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = Util.and(this.source.readByte(), 255);
            boolean z6 = (128 & iAnd2) != 0;
            if (z6 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j2 = iAnd2 & 127;
            this.frameLength = j2;
            if (j2 == 126) {
                this.frameLength = Util.and(this.source.readShort(), 65535);
            } else if (j2 == 127) {
                long j3 = this.source.readLong();
                this.frameLength = j3;
                if (j3 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                BufferedSource bufferedSource = this.source;
                byte[] bArr = this.maskKey;
                Intrinsics.checkNotNull(bArr);
                bufferedSource.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j2 = this.frameLength;
            if (j2 > 0) {
                this.source.readFully(this.messageFrameBuffer, j2);
                if (!this.isClient) {
                    Buffer buffer = this.messageFrameBuffer;
                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                    Intrinsics.checkNotNull(unsafeCursor);
                    buffer.readAndWriteUnsafe(unsafeCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.checkNotNull(bArr);
                    webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i2 = this.opcode;
        if (i2 != 1 && i2 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i2));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i2 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final BufferedSource getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
