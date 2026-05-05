package kotlin.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
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
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjG@L͜P.hS2şs{B;cҕyCQU\"Ԃ*\t]Wo˧vJp\u000bK\u000f\u001c\u0016\u0001j2N]xk\u001e\u0017˰JoU3UڎE9vt>ӌ(208\u0002\u0005\u0007\u001b0л\u0010\rٙsK:\u0011pEv:ň\u0011M\u0013\u001aZ\fL2\u0019\u001e\u000bi\u00156\u0011zkMG#1krR5sH|{\u001b\rTo#\u0005v6+n9e\u00193i\u001b\u0007\u0001]o\u0007M\tU\u0005\u0017)m+\u0012\neNp\u0002*\u0014Yh=a\u0001@t\u0005\u007f{<+9k{K~+p}\t\u001a%<2-L'\u00114;:~\b<R;r\u001cN^#vB.\u001a\u0012:%A\u00183YVaf\"mI\u001af7*\u0007c̗uъr!c٪^l#\u001elw\u007f5(̸?˓R\naƝ>\u0010~g\u001a*26\u001eČ1ɨ\u0015.\u001f¦\bgG*9k0P\u001bϜxݶdh[֟#TN+\u0007\u0016e4_ȴ\\ֈh\u0005s¬%d:\u001ce\u001c\u0003\u0013Tܴ?ء`wDƙu\u001c\\\\\u0001i\u0019[4܆1çj7aʤ<\u001eeHv7caL\u0010@cMܠAםf\u0005`٨ͤW."}, d2 = {"\u001aj^A_0G\u001d\u001d\tDE0\u0006\t\u001ce{'{MV", "", "u(E", "\u0010T5\u00138\u00198A|sZ", "", "0xc25<?", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "0xc2f", "", "1gP?5<?", "\u001aiPCTuGW#HXa(\ne?f\u0001(\t\u0016", "1gP?f", "", "2dR<W,K", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VN\u000e:\u0001$5fS", "2ha2V;\u001e=\u007f", "", "Aa", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "1n\\=T*M0-\u000ezl", "2dR<W,", "3mS\u001cY\u0010G^)\u000e", "2dR<W,\u001e\\\u0018h{B5\b\u0019>", "<AhAX:", "<BW.e:", "@dP1?0GS", "", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "@db2g\bEZ", "", "BqX:F;KW\"\u0001Wn0\u0004\b/r", "CoS.g,\u001cV\u0015\f\t^;", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LineReader {
    private static final int BUFFER_SIZE = 32;
    public static final LineReader INSTANCE = new LineReader();
    private static final ByteBuffer byteBuf;
    private static final byte[] bytes;
    private static final CharBuffer charBuf;
    private static final char[] chars;
    private static CharsetDecoder decoder = null;
    private static boolean directEOL = false;
    private static final StringBuilder sb;

    static {
        byte[] bArr = new byte[32];
        bytes = bArr;
        char[] cArr = new char[32];
        chars = cArr;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        byteBuf = byteBufferWrap;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(charBufferWrap, "wrap(...)");
        charBuf = charBufferWrap;
        sb = new StringBuilder();
    }

    private LineReader() {
    }

    private final int compactBytes() {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.compact();
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        return iPosition;
    }

    private final int decode(boolean z2) throws CharacterCodingException {
        while (true) {
            CharsetDecoder charsetDecoder = decoder;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = byteBuf;
            CharBuffer charBuffer = charBuf;
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z2);
            Intrinsics.checkNotNullExpressionValue(coderResultDecode, "decode(...)");
            if (coderResultDecode.isError()) {
                resetAll();
                coderResultDecode.throwException();
            }
            int iPosition = charBuffer.position();
            if (!coderResultDecode.isOverflow()) {
                return iPosition;
            }
            StringBuilder sb2 = sb;
            char[] cArr = chars;
            int i2 = iPosition - 1;
            sb2.append(cArr, 0, i2);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i2]);
        }
    }

    private final int decodeEndOfInput(int i2, int i3) throws CharacterCodingException {
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.limit(i2);
        charBuf.position(i3);
        int iDecode = decode(true);
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return iDecode;
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    private final void trimStringBuilder() {
        StringBuilder sb2 = sb;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    private final void updateCharset(Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        decoder = charsetDecoderNewDecoder;
        ByteBuffer byteBuffer = byteBuf;
        byteBuffer.clear();
        CharBuffer charBuffer = charBuf;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z2 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z2 = true;
        }
        directEOL = z2;
        resetAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0012, B:7:0x0018, B:11:0x0028, B:13:0x0033, B:31:0x0076, B:33:0x007c, B:35:0x0084, B:37:0x0088, B:39:0x0090, B:41:0x0094, B:43:0x009f, B:46:0x00a8, B:48:0x00bc, B:49:0x00bf, B:14:0x003c, B:17:0x0047, B:19:0x004b, B:21:0x005b, B:23:0x0063, B:24:0x0067, B:9:0x0022), top: B:55:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.lang.String readLine(java.io.InputStream r11, java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch: java.lang.Throwable -> Lc4
            java.nio.charset.CharsetDecoder r0 = kotlin.io.LineReader.decoder     // Catch: java.lang.Throwable -> Lc4
            r9 = 0
            if (r0 == 0) goto L22
            if (r0 != 0) goto L18
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch: java.lang.Throwable -> Lc4
            r0 = r9
        L18:
            java.nio.charset.Charset r0 = r0.charset()     // Catch: java.lang.Throwable -> Lc4
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r12)     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto L25
        L22:
            r10.updateCharset(r12)     // Catch: java.lang.Throwable -> Lc4
        L25:
            r3 = 0
            r8 = r3
            r5 = r8
        L28:
            int r7 = r11.read()     // Catch: java.lang.Throwable -> Lc4
            r4 = 32
            r0 = -1
            r6 = 10
            if (r7 != r0) goto L3c
            java.lang.StringBuilder r0 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lc4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc4
            goto L6e
        L3c:
            byte[] r2 = kotlin.io.LineReader.bytes     // Catch: java.lang.Throwable -> Lc4
            int r1 = r8 + 1
            byte r0 = (byte) r7     // Catch: java.lang.Throwable -> Lc4
            r2[r8] = r0     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r6) goto L4b
            if (r1 == r4) goto L4b
            boolean r0 = kotlin.io.LineReader.directEOL     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto L6c
        L4b:
            java.nio.ByteBuffer r2 = kotlin.io.LineReader.byteBuf     // Catch: java.lang.Throwable -> Lc4
            r2.limit(r1)     // Catch: java.lang.Throwable -> Lc4
            java.nio.CharBuffer r0 = kotlin.io.LineReader.charBuf     // Catch: java.lang.Throwable -> Lc4
            r0.position(r5)     // Catch: java.lang.Throwable -> Lc4
            int r5 = r10.decode(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r5 <= 0) goto L67
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lc4
            int r0 = r5 + (-1)
            char r0 = r1[r0]     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r6) goto L67
            r2.position(r3)     // Catch: java.lang.Throwable -> Lc4
            goto L7a
        L67:
            int r8 = r10.compactBytes()     // Catch: java.lang.Throwable -> Lc4
            goto L28
        L6c:
            r8 = r1
            goto L28
        L6e:
            if (r0 != 0) goto L76
            if (r8 != 0) goto L76
            if (r5 != 0) goto L76
            monitor-exit(r10)
            return r9
        L76:
            int r5 = r10.decodeEndOfInput(r8, r5)     // Catch: java.lang.Throwable -> Lc4
        L7a:
            if (r5 <= 0) goto L94
            char[] r1 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lc4
            int r0 = r5 + (-1)
            char r0 = r1[r0]     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r6) goto L94
            int r2 = r5 + (-1)
            if (r2 <= 0) goto L93
            int r0 = r5 + (-2)
            char r1 = r1[r0]     // Catch: java.lang.Throwable -> Lc4
            r0 = 13
            if (r1 != r0) goto L93
            int r5 = r5 + (-2)
            goto L94
        L93:
            r5 = r2
        L94:
            java.lang.StringBuilder r2 = kotlin.io.LineReader.sb     // Catch: java.lang.Throwable -> Lc4
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lc4
            if (r0 != 0) goto La8
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lc4
            char[] r0 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lc4
            r1.<init>(r0, r3, r5)     // Catch: java.lang.Throwable -> Lc4
            monitor-exit(r10)
            return r1
        La8:
            char[] r0 = kotlin.io.LineReader.chars     // Catch: java.lang.Throwable -> Lc4
            r2.append(r0, r3, r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            int r0 = r2.length()     // Catch: java.lang.Throwable -> Lc4
            if (r0 <= r4) goto Lbf
            r10.trimStringBuilder()     // Catch: java.lang.Throwable -> Lc4
        Lbf:
            r2.setLength(r3)     // Catch: java.lang.Throwable -> Lc4
            monitor-exit(r10)
            return r1
        Lc4:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lc4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.LineReader.readLine(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }
}
