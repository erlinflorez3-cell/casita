package kotlin.io.encoding;

import com.dynatrace.android.agent.AdkSettings;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0017nʑA0RkP\u008cZS8\u0018s{:%c$\u007fCCU \t(\neȞ\u0018g\u001dI\u001b\u001eS\u0013\u0014\u0016\u0011jZHe|k\u0013'2pqУ7M}@\u0002f\u0003B\u001d `/~yM\u0007(8`\u0010%\b\n_T0>O\t:\u0001\u0014}\t(\"\u001e>N\u0006N`u_NH\u001bdj31\u0015\u0002B|.&0ES\u001bYl';\u0004(\u001es^EI-%\u0002\n7ViO\u001b? B5l58CI\"^f\\\u000e&-+}\u0014$rnb\u0013fx\fU8\u0016w\u0014n\u001c>\u0010z*\u001al\b\u001c\u0016?H\\2Jj\u0016%Kt!ZpT\u0010vZ\u007f)h|+m\u000eAAQ\u001b\u0015^\u0012?'gO{3\u0014d7Qz/\\l\u000e\u000f\u0017qƛyΦ5QH׀\u0019Z\u0018]Um2u9̦,˙4G\b\u07fcL\u001d<\u001d=7\n@yܬwɘLDoϸUlv[\u0002RvIxÅ\"֖.\t\u0014ɮ\u0015p\u0013uhT\u00073g۶(Τ\u000b}\u0010ʶph\u0006<9%>M&řkҷQ]\u0012ɘ\u007frEd\u0007k<\\\u0010ӗ5̳Uc\u0018Рؕz."}, d2 = {"\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E \n\u0015!FowL\u00060Ehk/Dm\u00126#", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "=tc=h;", "0`b2)z", "\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>c", "uKY.i(\bW#Hdn;\b\u0019>S\u000f5{<\tl}My\u001dCz.~]\bi7v\u00148LGDm}z\u0011va\nU9o?", "0xc25<?T\u0019\f", "", "0xc25<?T\u0019\fa^5~\u00182", "", "7r29b:>R", "", ":h]2?,GU(\u0002", "Ax\\/b3\u001bc\u001a\u007fzk", "1gT0^\u0016IS\"", "", "1k^@X", "1n_F<5M]u\u0013\n^\t\r\n0e\r", "And?V,", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "3mR<W,\u001bg(~Wn-}\t<I\t7\u0006*\u0011&\"W~", "3mR<W,\"\\(\tdn;\b\u0019>", "4kd@[", "EqXAX", "=eU@X;", ":d]4g/", AdkSettings.PLATFORM_TYPE_MOBILE, "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class EncodeOutputStream extends OutputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferLength;
    private boolean isClosed;
    private int lineLength;
    private final OutputStream output;
    private final byte[] symbolBuffer;

    public EncodeOutputStream(OutputStream output, Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.output = output;
        this.base64 = base64;
        this.lineLength = base64.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    private final void checkOpen() throws IOException {
        if (this.isClosed) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int copyIntoByteBuffer(byte[] bArr, int i2, int i3) {
        int iMin = Math.min(3 - this.byteBufferLength, i3 - i2);
        ArraysKt.copyInto(bArr, this.byteBuffer, this.byteBufferLength, i2, i2 + iMin);
        int i4 = this.byteBufferLength + iMin;
        this.byteBufferLength = i4;
        if (i4 == 3) {
            encodeByteBufferIntoOutput();
        }
        return iMin;
    }

    private final void encodeByteBufferIntoOutput() {
        if (encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength) != 4) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.byteBufferLength = 0;
    }

    private final int encodeIntoOutput(byte[] bArr, int i2, int i3) throws IOException {
        int iEncodeIntoByteArray = this.base64.encodeIntoByteArray(bArr, this.symbolBuffer, 0, i2, i3);
        if (this.lineLength == 0) {
            this.output.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = 76;
            if (iEncodeIntoByteArray > 76) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.output.write(this.symbolBuffer, 0, iEncodeIntoByteArray);
        this.lineLength -= iEncodeIntoByteArray;
        return iEncodeIntoByteArray;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        if (this.byteBufferLength != 0) {
            encodeByteBufferIntoOutput();
        }
        this.output.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        checkOpen();
        this.output.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        checkOpen();
        byte[] bArr = this.byteBuffer;
        int i3 = this.byteBufferLength;
        int i4 = i3 + 1;
        this.byteBufferLength = i4;
        bArr[i3] = (byte) i2;
        if (i4 == 3) {
            encodeByteBufferIntoOutput();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] source, int i2, int i3) throws IOException {
        int i4;
        Intrinsics.checkNotNullParameter(source, "source");
        checkOpen();
        if (i2 < 0 || i3 < 0 || (i4 = i2 + i3) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i2 + ", length: " + i3 + ", source size: " + source.length);
        }
        if (i3 == 0) {
            return;
        }
        int i5 = this.byteBufferLength;
        if (i5 >= 3) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i5 != 0) {
            i2 += copyIntoByteBuffer(source, i2, i4);
            if (this.byteBufferLength != 0) {
                return;
            }
        }
        while (i2 + 3 <= i4) {
            int iMin = Math.min((this.base64.isMimeScheme$kotlin_stdlib() ? this.lineLength : this.symbolBuffer.length) / 4, (i4 - i2) / 3);
            int i6 = (iMin * 3) + i2;
            if (encodeIntoOutput(source, i2, i6) != iMin * 4) {
                throw new IllegalStateException("Check failed.".toString());
            }
            i2 = i6;
        }
        ArraysKt.copyInto(source, this.byteBuffer, 0, i2, i4);
        this.byteBufferLength = i4 - i2;
    }
}
