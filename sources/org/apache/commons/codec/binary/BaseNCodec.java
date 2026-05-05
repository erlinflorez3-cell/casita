package org.apache.commons.codec.binary;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.CodecPolicy;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseNCodec implements BinaryEncoder, BinaryDecoder {
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @Deprecated
    protected final byte PAD;
    private final int chunkSeparatorLength;
    private final CodecPolicy decodingPolicy;
    private final int encodedBlockSize;
    protected final int lineLength;
    protected final byte pad;
    private final int unencodedBlockSize;
    protected static final CodecPolicy DECODING_POLICY_DEFAULT = CodecPolicy.LENIENT;
    static final byte[] CHUNK_SEPARATOR = {Ascii.CR, 10};

    public static abstract class AbstractBuilder<T, B extends AbstractBuilder<T, B>> implements Supplier<T> {
        private final byte[] defaultEncodeTable;
        private byte[] encodeTable;
        private int lineLength;
        private CodecPolicy decodingPolicy = BaseNCodec.DECODING_POLICY_DEFAULT;
        private byte[] lineSeparator = BaseNCodec.CHUNK_SEPARATOR;
        private byte padding = 61;

        AbstractBuilder(byte[] bArr) {
            this.defaultEncodeTable = bArr;
            this.encodeTable = bArr;
        }

        B asThis() {
            return this;
        }

        CodecPolicy getDecodingPolicy() {
            return this.decodingPolicy;
        }

        byte[] getEncodeTable() {
            return this.encodeTable;
        }

        int getLineLength() {
            return this.lineLength;
        }

        byte[] getLineSeparator() {
            return this.lineSeparator;
        }

        byte getPadding() {
            return this.padding;
        }

        public B setDecodingPolicy(CodecPolicy codecPolicy) {
            if (codecPolicy == null) {
                codecPolicy = BaseNCodec.DECODING_POLICY_DEFAULT;
            }
            this.decodingPolicy = codecPolicy;
            return (B) asThis();
        }

        public B setEncodeTable(byte... bArr) {
            if (bArr == null) {
                bArr = this.defaultEncodeTable;
            }
            this.encodeTable = bArr;
            return (B) asThis();
        }

        public B setLineLength(int i2) {
            this.lineLength = Math.max(0, i2);
            return (B) asThis();
        }

        public B setLineSeparator(byte... bArr) {
            if (bArr == null) {
                bArr = BaseNCodec.CHUNK_SEPARATOR;
            }
            this.lineSeparator = bArr;
            return (B) asThis();
        }

        public B setPadding(byte b2) {
            this.padding = b2;
            return (B) asThis();
        }
    }

    static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        Context() {
        }

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.buffer), Integer.valueOf(this.currentLinePos), Boolean.valueOf(this.eof), Integer.valueOf(this.ibitWorkArea), Long.valueOf(this.lbitWorkArea), Integer.valueOf(this.modulus), Integer.valueOf(this.pos), Integer.valueOf(this.readPos));
        }
    }

    protected BaseNCodec(int i2, int i3, int i4, int i5) {
        this(i2, i3, i4, i5, (byte) 61);
    }

    protected BaseNCodec(int i2, int i3, int i4, int i5, byte b2) {
        this(i2, i3, i4, i5, b2, DECODING_POLICY_DEFAULT);
    }

    protected BaseNCodec(int i2, int i3, int i4, int i5, byte b2, CodecPolicy codecPolicy) {
        this.PAD = (byte) 61;
        this.unencodedBlockSize = i2;
        this.encodedBlockSize = i3;
        this.lineLength = (i4 <= 0 || i5 <= 0) ? 0 : (i4 / i3) * i3;
        this.chunkSeparatorLength = i5;
        this.pad = b2;
        this.decodingPolicy = (CodecPolicy) Objects.requireNonNull(codecPolicy, "codecPolicy");
    }

    private static int createPositiveCapacity(int i2) {
        if (i2 >= 0) {
            return Math.max(i2, MAX_BUFFER_SIZE);
        }
        throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i2) & 4294967295L));
    }

    public static byte[] getChunkSeparator() {
        return (byte[]) CHUNK_SEPARATOR.clone();
    }

    @Deprecated
    protected static boolean isWhiteSpace(byte b2) {
        return Character.isWhitespace(b2);
    }

    private static byte[] resizeBuffer(Context context, int i2) {
        int length = context.buffer.length * 2;
        if (Integer.compareUnsigned(length, i2) < 0) {
            length = i2;
        }
        if (Integer.compareUnsigned(length, MAX_BUFFER_SIZE) > 0) {
            length = createPositiveCapacity(i2);
        }
        byte[] bArrCopyOf = Arrays.copyOf(context.buffer, length);
        context.buffer = bArrCopyOf;
        return bArrCopyOf;
    }

    static int toLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    int available(Context context) {
        if (hasData(context)) {
            return context.pos - context.readPos;
        }
        return 0;
    }

    protected boolean containsAlphabetOrPad(byte[] bArr) {
        if (bArr != null) {
            for (byte b2 : bArr) {
                if (this.pad == b2 || isInAlphabet(b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.apache.commons.codec.Decoder
    public Object decode(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    abstract void decode(byte[] bArr, int i2, int i3, Context context);

    public byte[] decode(String str) {
        return decode(StringUtils.getBytesUtf8(str));
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Context context = new Context();
        decode(bArr, 0, bArr.length, context);
        decode(bArr, 0, -1, context);
        int i2 = context.pos;
        byte[] bArr2 = new byte[i2];
        readResults(bArr2, 0, i2, context);
        return bArr2;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    abstract void encode(byte[] bArr, int i2, int i3, Context context);

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return BinaryCodec.isEmpty(bArr) ? bArr : encode(bArr, 0, bArr.length);
    }

    public byte[] encode(byte[] bArr, int i2, int i3) {
        if (BinaryCodec.isEmpty(bArr)) {
            return bArr;
        }
        Context context = new Context();
        encode(bArr, i2, i3, context);
        encode(bArr, i2, -1, context);
        int i4 = context.pos - context.readPos;
        byte[] bArr2 = new byte[i4];
        readResults(bArr2, 0, i4, context);
        return bArr2;
    }

    public String encodeAsString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    public String encodeToString(byte[] bArr) {
        return StringUtils.newStringUtf8(encode(bArr));
    }

    protected byte[] ensureBufferSize(int i2, Context context) {
        if (context.buffer == null) {
            context.buffer = new byte[Math.max(i2, getDefaultBufferSize())];
            context.pos = 0;
            context.readPos = 0;
        } else if ((context.pos + i2) - context.buffer.length > 0) {
            return resizeBuffer(context, context.pos + i2);
        }
        return context.buffer;
    }

    public CodecPolicy getCodecPolicy() {
        return this.decodingPolicy;
    }

    protected int getDefaultBufferSize() {
        return 8192;
    }

    public long getEncodedLength(byte[] bArr) {
        int length = bArr.length;
        long j2 = ((long) (((length + r1) - 1) / this.unencodedBlockSize)) * ((long) this.encodedBlockSize);
        int i2 = this.lineLength;
        return i2 > 0 ? j2 + ((((((long) i2) + j2) - 1) / ((long) i2)) * ((long) this.chunkSeparatorLength)) : j2;
    }

    boolean hasData(Context context) {
        return context.pos > context.readPos;
    }

    protected abstract boolean isInAlphabet(byte b2);

    public boolean isInAlphabet(String str) {
        return isInAlphabet(StringUtils.getBytesUtf8(str), true);
    }

    public boolean isInAlphabet(byte[] bArr, boolean z2) {
        for (byte b2 : bArr) {
            if (!isInAlphabet(b2) && (!z2 || (b2 != this.pad && !Character.isWhitespace(b2)))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStrictDecoding() {
        return this.decodingPolicy == CodecPolicy.STRICT;
    }

    int readResults(byte[] bArr, int i2, int i3, Context context) {
        if (!hasData(context)) {
            return context.eof ? -1 : 0;
        }
        int iMin = Math.min(available(context), i3);
        System.arraycopy(context.buffer, context.readPos, bArr, i2, iMin);
        context.readPos += iMin;
        if (!hasData(context)) {
            context.readPos = 0;
            context.pos = 0;
        }
        return iMin;
    }
}
