package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{B-cҕyCI_\"Ԃ*\t]To˧vJh\"K\u000f\f\u001a\u0001j:I]ތc܈%˰rom2\u000e\u0003M=ntN\u0005N32<\b\u0007\u0019\u001aXKǘzzQOT0>M\t:\u0001\u001b}\t(!\u001e>N\u0011N`u_NH\u001bkj31\u0015\u0002B|5&0ES\u001bYl';\u0005(\u001esFEI-%\u0002\u0011MR$[\u0011T\n=3vW+9X\fWdh0\u0018#<g\r\f\u0001V`\u0013cx\fU9\u0018gYf&(&\u0012L\u0019J\t&\u0006UN\u0005Ʃ\u001cǴ\f\u000e;οC_NR\u001a^p\u0003Qʫ8а)\u007f;ٿ\n'tXy;GV\u000eީ\u0007ڟ\"#\t͙qgb\u0017x\u0015I^NΆ=ҨD=PݐZeKm\u001cp\u0011\u0003\u0001ʹ2Ͻ\u0004/\u0004߾~#3Bs9Q-BȸTזkv\r\u009bĎW\u0002"}, d2 = {"\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\fP?Hy4-\u0002h]8\u0007p\u0002", "", "7m_Bg\u001aM`\u0019z\u0003", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "1gP?f,M", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VE", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHV}\u001cC\u0001\n\u0006\u007f)?#{#3z$.\\\r\u0019n0+#hp\u000fJT", "0xc25<?T\u0019\f", "\u001aiPCTuGW#HWr;|e?f\u0001(\t\u0016", "2dR<W,K", "\u001aiPCTuGW#Hxa(\n\u0017/tI\u0006~<\u000e%\u0017VN\u000e:\u0001$5fS", "6`b\u0019X-M]*~\bI6\f\t8t\u0004$\u0003G\u0015\u0005'T|\u0018>r457\u0001\u001cD", "", ":dUAb=>`v\u0002vk", "", "2nA2T+", "", "/qa.l", "", "=eU@X;", ":d]4g/", "4h[95@MSu\u000f{_,\n", "=mT [6M@\u0019zyL3\u0007\u001b\u001aa\u000f+", "@dP1", "@d[2T:>", "", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CharsetReader {
    private final ByteBuffer byteBuffer;
    private final Charset charset;
    private final CharsetDecoder decoder;
    private boolean hasLeftoverPotentiallySurrogateChar;
    private final InputStream inputStream;
    private char leftoverChar;

    public CharsetReader(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.inputStream = inputStream;
        this.charset = charset;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        Intrinsics.checkNotNullExpressionValue(charsetDecoderOnUnmappableCharacter, "charset.newDecoder()\n   …odingErrorAction.REPLACE)");
        this.decoder = charsetDecoderOnUnmappableCharacter;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ByteArrayPool8k.INSTANCE.take());
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(ByteArrayPool8k.take())");
        this.byteBuffer = byteBufferWrap;
    }

    private final int doRead(char[] cArr, int i2, int i3) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i2, i3);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        boolean z2 = false;
        while (true) {
            CoderResult coderResultDecode = this.decoder.decode(this.byteBuffer, charBufferWrap, z2);
            if (coderResultDecode.isUnderflow()) {
                if (z2 || !charBufferWrap.hasRemaining()) {
                    break;
                }
                if (fillByteBuffer() < 0) {
                    z2 = true;
                    if (charBufferWrap.position() == 0 && !this.byteBuffer.hasRemaining()) {
                        break;
                    }
                    this.decoder.reset();
                } else {
                    continue;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBufferWrap.position();
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z2) {
            this.decoder.reset();
        }
        if (charBufferWrap.position() == 0) {
            return -1;
        }
        return charBufferWrap.position();
    }

    private final int fillByteBuffer() {
        this.byteBuffer.compact();
        try {
            int iLimit = this.byteBuffer.limit();
            int iPosition = this.byteBuffer.position();
            int i2 = this.inputStream.read(this.byteBuffer.array(), this.byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
            if (i2 < 0) {
                return i2;
            }
            return this.byteBuffer.remaining();
        } finally {
        }
    }

    private final int oneShotReadSlowPath() {
        if (this.hasLeftoverPotentiallySurrogateChar) {
            this.hasLeftoverPotentiallySurrogateChar = false;
            return this.leftoverChar;
        }
        char[] cArr = new char[2];
        int i2 = read(cArr, 0, 2);
        if (i2 == -1) {
            return -1;
        }
        if (i2 == 1) {
            return cArr[0];
        }
        if (i2 != 2) {
            throw new IllegalStateException(("Unreachable state: " + i2).toString());
        }
        this.leftoverChar = cArr[1];
        this.hasLeftoverPotentiallySurrogateChar = true;
        return cArr[0];
    }

    public final int read(char[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= array.length || i3 < 0 || i2 + i3 > array.length) {
            throw new IllegalArgumentException(("Unexpected arguments: " + i2 + ", " + i3 + ", " + array.length).toString());
        }
        if (this.hasLeftoverPotentiallySurrogateChar) {
            array[i2] = this.leftoverChar;
            i2++;
            i3--;
            this.hasLeftoverPotentiallySurrogateChar = false;
            if (i3 == 0) {
                return 1;
            }
            i4 = 1;
        }
        if (i3 != 1) {
            return doRead(array, i2, i3) + i4;
        }
        int iOneShotReadSlowPath = oneShotReadSlowPath();
        if (iOneShotReadSlowPath != -1) {
            array[i2] = (char) iOneShotReadSlowPath;
            return i4 + 1;
        }
        if (i4 == 0) {
            return -1;
        }
        return i4;
    }

    public final void release() {
        ByteArrayPool8k byteArrayPool8k = ByteArrayPool8k.INSTANCE;
        byte[] bArrArray = this.byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
        byteArrayPool8k.release(bArrArray);
    }
}
