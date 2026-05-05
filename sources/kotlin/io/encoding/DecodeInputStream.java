package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0017nʑA0RkP.XV2\u000fy\u0005<$a&yCIU\"}(\u0016UO}˧\u001fJ\t\n\u0004\"\u0016\u001a\u0007jDI\u0004wm\u0016\u001d3Zom5ޜs=Gc=<\u00131J\"f\fK\u0015bHV#\u000fzq]<\u0016>T\t:\u0001\u0012}\t('\u001e>N\bN`udNH\u001bd\u0001/k)wYf'\u000e7-Q\u001bZl';{\u0012\"9UO5C,\u0004\u0007\u0015js?1F\"A\u0013\u0002?'YP:W~f\u000e.-+}\u0014\u000ev4u\u001dQ\u000f\u0013m+\u0018iYk&(&\u0002B!\u0005\"\u001c!?H\\4Jj\u0016*Kt!XpT\u0010{Z\u007f)hf\u001b3\u0016K+g\"-e*A'lO{3\u0014d#It/zl\u000e\u000f'aT@W?qX=v`PY\u000ey\u0012qz\u0002X\u0006\u0007ϝ\u0002\u009e\u007f\u00116ϏuCi=;!\u001a\u0007\u001fֶiЛ\t`pׅ:^VF:nD>\u0001¡\u0018ʑHd\rߘ!ff4)MJ[=>^ʹ\"Ϣ{@9'\u0016W]r:v[h\"%]m\u000eխz«\u0012WAӔ\u0004A_c(a\u0001uj̶>И\tXn̻$\u0018hh@\"`UAݛ\u0004ԞHN\u0014Ǝ\u0003K\u007f*L,_&3ìTҴ\"BIґYkhw(~\u00038zѳk˨x\t\tˆ-|}w\u0011IZ\u00027ø/ۮU5!ğƇ&\n"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001f\u0001\u0015!FoqE\u00025DG\r-7i\u001e\u0004", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "7m_Bg", "0`b2)z", "\u001aj^A_0G\u001d\u001d\tD^5z\u0013.i\t*E\u001d|%\u0017\u0018>c", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHV}\u001dQ~\u0015@\u007fn9cG @k -QL=5\u0011\u001a#h2\b\\'\u001d", "0xc25<?T\u0019\f", "", "0xc25<?T\u0019\fZg+`\u0012.e\u0013", "", "0xc25<?T\u0019\fa^5~\u00182", "5dc\u000fl;>0)\u007f{^9c\t8g\u000f+", "u(8", "0xc25<?T\u0019\fhm(\n\u0018\u0013n~(\u000f", "7r29b:>R", "", "7r4\u001c9", "Ah]4_,\u001bg(~Wn-}\t<", "Ax\\/b3\u001bc\u001a\u007fzk", "1k^@X", "", "1n_F5@MSu\u000f{_,\nl8t\n", "2rc", "2rc\u001cY-LS(", ":d]4g/", "2dR<W,,g!{\u0005e\t\r\n0e\r\f\u0005O\u000b", "2rc\u0012a+\"\\\u0018~\u000e", "Ax\\/b3\u001bc\u001a\u007fzk\u0013|\u00121t\u0003", "6`]1_,)O\u0018}~g.j\u001d7b\n/", "@dP1", "2dbA\\5:b\u001d\t\u0004", "=eU@X;", "@dP1A,Qb\u0007\u0013\u0003[6\u0004", "@db2g\tRb\u0019[\u000b_-|\u0016\u0013f_0\u0007O\u0015", "AgX3g\tRb\u0019[\u000b_-|\u0016\u001eom7wM\u0010z\u00180o\u000e;v$", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class DecodeInputStream extends InputStream {
    private final Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(InputStream input, Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final void copyByteBufferInto(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.byteBuffer;
        int i4 = this.byteBufferStartIndex;
        ArraysKt.copyInto(bArr2, bArr, i2, i4, i4 + i3);
        this.byteBufferStartIndex += i3;
        resetByteBufferIfEmpty();
    }

    private final int decodeSymbolBufferInto(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i5 + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i5, 0, i4);
        int iMin = Math.min(getByteBufferLength(), i3 - i2);
        copyByteBufferInto(bArr, i2, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final int handlePaddingSymbol(int i2) throws IOException {
        this.symbolBuffer[i2] = Base64.padSymbol;
        if ((3 & i2) != 2) {
            return i2 + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[i2 + 1] = (byte) nextSymbol;
        }
        return i2 + 2;
    }

    private final int readNextSymbol() throws IOException {
        int i2;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            i2 = this.input.read();
            if (i2 == -1) {
                break;
            }
        } while (!Base64Kt.isInMimeAlphabet(i2));
        return i2;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i2 = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i2) {
            ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i2);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2 = this.byteBufferStartIndex;
        if (i2 < this.byteBufferEndIndex) {
            int i3 = (-1) - (((-1) - this.byteBuffer[i2]) | ((-1) - 255));
            this.byteBufferStartIndex = i2 + 1;
            resetByteBufferIfEmpty();
            return i3;
        }
        int i4 = read(this.singleByteBuffer, 0, 1);
        if (i4 == -1) {
            return -1;
        }
        if (i4 != 1) {
            throw new IllegalStateException("Unreachable".toString());
        }
        byte b2 = this.singleByteBuffer[0];
        return (b2 + 255) - (b2 | 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x007a, code lost:
    
        if (r5 != r12) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x007c, code lost:
    
        if (r0 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x007e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r5 - r12;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            if (r12 < 0) goto L8a
            if (r13 < 0) goto L8a
            int r7 = r12 + r13
            int r0 = r11.length
            if (r7 > r0) goto L8a
            boolean r0 = r10.isClosed
            if (r0 != 0) goto L82
            boolean r0 = r10.isEOF
            r6 = -1
            if (r0 == 0) goto L18
            return r6
        L18:
            r9 = 0
            if (r13 != 0) goto L1c
            return r9
        L1c:
            int r0 = r10.getByteBufferLength()
            if (r0 < r13) goto L26
            r10.copyByteBufferInto(r11, r12, r13)
            return r13
        L26:
            int r0 = r10.getByteBufferLength()
            int r13 = r13 - r0
            int r0 = r13 + 2
            int r0 = r0 / 3
            int r8 = r0 * 4
            r5 = r12
        L32:
            boolean r0 = r10.isEOF
            if (r0 != 0) goto L7a
            if (r8 <= 0) goto L7a
            byte[] r0 = r10.symbolBuffer
            int r0 = r0.length
            int r4 = java.lang.Math.min(r0, r8)
            r3 = r9
        L40:
            boolean r0 = r10.isEOF
            if (r0 != 0) goto L63
            if (r3 >= r4) goto L63
            int r2 = r10.readNextSymbol()
            r1 = 1
            if (r2 == r6) goto L60
            r0 = 61
            if (r2 == r0) goto L59
            byte[] r1 = r10.symbolBuffer
            byte r0 = (byte) r2
            r1[r3] = r0
            int r3 = r3 + 1
            goto L40
        L59:
            int r3 = r10.handlePaddingSymbol(r3)
            r10.isEOF = r1
            goto L40
        L60:
            r10.isEOF = r1
            goto L40
        L63:
            if (r0 != 0) goto L67
            if (r3 != r4) goto L6e
        L67:
            int r8 = r8 - r3
            int r0 = r10.decodeSymbolBufferInto(r11, r5, r7, r3)
            int r5 = r5 + r0
            goto L32
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L7a:
            if (r5 != r12) goto L7f
            if (r0 == 0) goto L7f
        L7e:
            return r6
        L7f:
            int r6 = r5 - r12
            goto L7e
        L82:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "The input stream is closed."
            r1.<init>(r0)
            throw r1
        L8a:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "offset: "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r0 = ", length: "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r13)
            java.lang.String r0 = ", buffer size: "
            java.lang.StringBuilder r1 = r1.append(r0)
            int r0 = r11.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.DecodeInputStream.read(byte[], int, int):int");
    }
}
