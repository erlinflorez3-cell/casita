package org.msgpack.core;

import com.google.common.base.Ascii;
import cz.msebera.android.httpclient.impl.client.cache.CacheValidityPolicy;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.ValueType;
import org.msgpack.value.Variable;

/* JADX INFO: loaded from: classes2.dex */
public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);

    /* JADX INFO: renamed from: org.msgpack.core.MessageUnpacker$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$value$ValueType;

        static {
            int[] iArr = new int[ValueType.values().length];
            $SwitchMap$org$msgpack$value$ValueType = iArr;
            try {
                iArr[ValueType.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$msgpack$value$ValueType[ValueType.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[MessageFormat.values().length];
            $SwitchMap$org$msgpack$core$MessageFormat = iArr2;
            try {
                iArr2[MessageFormat.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$org$msgpack$core$MessageFormat[MessageFormat.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    protected MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    private String decodeStringFastPath(int i2) {
        if (this.actionOnMalformedString == CodingErrorAction.REPLACE && this.actionOnUnmappableString == CodingErrorAction.REPLACE && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i2, MessagePack.UTF8);
            this.position += i2;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i2));
            this.position += i2;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e2) {
            throw new MessageStringCodingException(e2);
        }
    }

    private boolean ensureBuffer() throws IOException {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += (long) this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    private MessageBuffer getNextBuffer() throws IOException {
        MessageBuffer next = this.in.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.totalReadBytes += (long) this.buffer.size();
        return next;
    }

    private void handleCoderError(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void nextBuffer() throws IOException {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private static MessageIntegerOverflowException overflowI16(short s2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s2));
    }

    private static MessageIntegerOverflowException overflowI32(int i2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(i2));
    }

    private static MessageIntegerOverflowException overflowI64(long j2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j2));
    }

    private static MessageIntegerOverflowException overflowU16(short s2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(s2 & 65535));
    }

    private static MessageIntegerOverflowException overflowU32(int i2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i2 & Integer.MAX_VALUE)) + CacheValidityPolicy.MAX_AGE));
    }

    private static MessageSizeException overflowU32Size(int i2) {
        return new MessageSizeException(((long) ((-1) - (((-1) - i2) | ((-1) - Integer.MAX_VALUE)))) + CacheValidityPolicy.MAX_AGE);
    }

    private static MessageIntegerOverflowException overflowU64(long j2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j2 - Long.MIN_VALUE).setBit(63));
    }

    private static MessageIntegerOverflowException overflowU8(byte b2) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(b2 & 255));
    }

    private MessageBuffer prepareNumberBuffer(int i2) throws IOException {
        int size = this.buffer.size();
        int i3 = this.position;
        int i4 = size - i3;
        if (i4 >= i2) {
            this.nextReadPosition = i3;
            this.position = i3 + i2;
            return this.buffer;
        }
        if (i4 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, i3, i4);
            i2 -= i4;
        } else {
            i4 = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            if (size2 >= i2) {
                this.numberBuffer.putMessageBuffer(i4, this.buffer, 0, i2);
                this.position = i2;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            this.numberBuffer.putMessageBuffer(i4, this.buffer, 0, size2);
            i2 -= size2;
            i4 += size2;
        }
    }

    private byte readByte() throws IOException {
        int size = this.buffer.size();
        int i2 = this.position;
        if (size > i2) {
            byte b2 = this.buffer.getByte(i2);
            this.position++;
            return b2;
        }
        nextBuffer();
        if (this.buffer.size() <= 0) {
            return readByte();
        }
        byte b3 = this.buffer.getByte(0);
        this.position = 1;
        return b3;
    }

    private double readDouble() throws IOException {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    private float readFloat() throws IOException {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private int readInt() throws IOException {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() throws IOException {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private int readNextLength16() throws IOException {
        return (-1) - (((-1) - readShort()) | ((-1) - 65535));
    }

    private int readNextLength32() throws IOException {
        int i2 = readInt();
        if (i2 >= 0) {
            return i2;
        }
        throw overflowU32Size(i2);
    }

    private int readNextLength8() throws IOException {
        return readByte() & 255;
    }

    private short readShort() throws IOException {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private void resetDecoder() {
        CharsetDecoder charsetDecoder = this.decoder;
        if (charsetDecoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            charsetDecoder.reset();
        }
        StringBuilder sb = this.decodeStringBuffer;
        if (sb == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            sb.setLength(0);
        }
    }

    private void skipPayload(int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("payload size must be >= 0: " + i2);
        }
        while (true) {
            int size = this.buffer.size();
            int i3 = this.position;
            int i4 = size - i3;
            if (i4 >= i2) {
                this.position = i3 + i2;
                return;
            } else {
                this.position = i3 + i4;
                i2 -= i4;
                nextBuffer();
            }
        }
    }

    private int tryReadBinaryHeader(byte b2) throws IOException {
        switch (b2) {
            case -60:
                return readNextLength8();
            case -59:
                return readNextLength16();
            case -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadStringHeader(byte b2) throws IOException {
        switch (b2) {
            case -39:
                return readNextLength8();
            case -38:
                return readNextLength16();
            case -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private static MessagePackException unexpected(String str, byte b2) {
        MessageFormat messageFormatValueOf = MessageFormat.valueOf(b2);
        if (messageFormatValueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", str));
        }
        String strName = messageFormatValueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strName.substring(0, 1) + strName.substring(1).toLowerCase(), Byte.valueOf(b2)));
    }

    private static MessagePackException unexpectedExtension(String str, int i2, int i3) {
        return new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private static int utf8MultibyteCharacterSize(byte b2) {
        return Integer.numberOfLeadingZeros((~((b2 + 255) - (b2 | 255))) << 24);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.totalReadBytes += (long) this.position;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    public MessageFormat getNextFormat() throws IOException {
        if (ensureBuffer()) {
            return MessageFormat.valueOf(this.buffer.getByte(this.position));
        }
        throw new MessageInsufficientBufferException();
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + ((long) this.position);
    }

    public boolean hasNext() throws IOException {
        return ensureBuffer();
    }

    public void readPayload(ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int iRemaining = byteBuffer.remaining();
            int size = this.buffer.size();
            int i2 = this.position;
            int i3 = size - i2;
            if (i3 >= iRemaining) {
                this.buffer.getBytes(i2, iRemaining, byteBuffer);
                this.position += iRemaining;
                return;
            } else {
                this.buffer.getBytes(i2, i3, byteBuffer);
                this.position += i3;
                nextBuffer();
            }
        }
    }

    public void readPayload(MessageBuffer messageBuffer, int i2, int i3) throws IOException {
        while (true) {
            int size = this.buffer.size();
            int i4 = this.position;
            int i5 = size - i4;
            if (i5 >= i3) {
                messageBuffer.putMessageBuffer(i2, this.buffer, i4, i3);
                this.position += i3;
                return;
            } else {
                messageBuffer.putMessageBuffer(i2, this.buffer, i4, i5);
                i2 += i5;
                i3 -= i5;
                this.position += i5;
                nextBuffer();
            }
        }
    }

    public void readPayload(byte[] bArr) throws IOException {
        readPayload(bArr, 0, bArr.length);
    }

    public void readPayload(byte[] bArr, int i2, int i3) throws IOException {
        while (true) {
            int size = this.buffer.size();
            int i4 = this.position;
            int i5 = size - i4;
            if (i5 >= i3) {
                this.buffer.getBytes(i4, bArr, i2, i3);
                this.position += i3;
                return;
            } else {
                this.buffer.getBytes(i4, bArr, i2, i5);
                i2 += i5;
                i3 -= i5;
                this.position += i5;
                nextBuffer();
            }
        }
    }

    public byte[] readPayload(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        readPayload(bArr);
        return bArr;
    }

    public MessageBuffer readPayloadAsReference(int i2) throws IOException {
        int size = this.buffer.size();
        int i3 = this.position;
        if (size - i3 >= i2) {
            MessageBuffer messageBufferSlice = this.buffer.slice(i3, i2);
            this.position += i2;
            return messageBufferSlice;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i2);
        readPayload(messageBufferAllocate, 0, i2);
        return messageBufferAllocate;
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) throws IOException {
        MessageBufferInput messageBufferInput2 = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    public void skipValue() throws IOException {
        skipValue(1);
    }

    public void skipValue(int i2) throws IOException {
        int nextLength32;
        int nextLength322;
        while (i2 > 0) {
            byte b2 = readByte();
            switch (MessageFormat.valueOf(b2)) {
                case FIXMAP:
                    nextLength32 = (-1) - (((-1) - b2) | ((-1) - 15));
                    nextLength322 = nextLength32 * 2;
                    i2 += nextLength322;
                    i2--;
                    break;
                case FIXARRAY:
                    nextLength322 = (b2 + 15) - (b2 | 15);
                    i2 += nextLength322;
                    i2--;
                    break;
                case FIXSTR:
                    skipPayload(b2 & Ascii.US);
                    i2--;
                    break;
                case INT8:
                case UINT8:
                    skipPayload(1);
                    i2--;
                    break;
                case INT16:
                case UINT16:
                    skipPayload(2);
                    i2--;
                    break;
                case INT32:
                case UINT32:
                case FLOAT32:
                    skipPayload(4);
                    i2--;
                    break;
                case INT64:
                case UINT64:
                case FLOAT64:
                    skipPayload(8);
                    i2--;
                    break;
                case BIN8:
                case STR8:
                    skipPayload(readNextLength8());
                    i2--;
                    break;
                case BIN16:
                case STR16:
                    skipPayload(readNextLength16());
                    i2--;
                    break;
                case BIN32:
                case STR32:
                    skipPayload(readNextLength32());
                    i2--;
                    break;
                case FIXEXT1:
                    skipPayload(2);
                    i2--;
                    break;
                case FIXEXT2:
                    skipPayload(3);
                    i2--;
                    break;
                case FIXEXT4:
                    skipPayload(5);
                    i2--;
                    break;
                case FIXEXT8:
                    skipPayload(9);
                    i2--;
                    break;
                case FIXEXT16:
                    skipPayload(17);
                    i2--;
                    break;
                case EXT8:
                    skipPayload(readNextLength8() + 1);
                    i2--;
                    break;
                case EXT16:
                    skipPayload(readNextLength16() + 1);
                    i2--;
                    break;
                case EXT32:
                    int nextLength323 = readNextLength32();
                    skipPayload(1);
                    skipPayload(nextLength323);
                    i2--;
                    break;
                case ARRAY16:
                    nextLength322 = readNextLength16();
                    i2 += nextLength322;
                    i2--;
                    break;
                case ARRAY32:
                    nextLength322 = readNextLength32();
                    i2 += nextLength322;
                    i2--;
                    break;
                case MAP16:
                    nextLength32 = readNextLength16();
                    nextLength322 = nextLength32 * 2;
                    i2 += nextLength322;
                    i2--;
                    break;
                case MAP32:
                    nextLength32 = readNextLength32();
                    nextLength322 = nextLength32 * 2;
                    i2 += nextLength322;
                    i2--;
                    break;
                case NEVER_USED:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                default:
                    i2--;
                    break;
            }
        }
    }

    public boolean tryUnpackNil() throws IOException {
        if (!ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        if (this.buffer.getByte(this.position) != -64) {
            return false;
        }
        readByte();
        return true;
    }

    public int unpackArrayHeader() throws IOException {
        byte b2 = readByte();
        if (MessagePack.Code.isFixedArray(b2)) {
            return b2 & Ascii.SI;
        }
        if (b2 == -36) {
            return readNextLength16();
        }
        if (b2 == -35) {
            return readNextLength32();
        }
        throw unexpected("Array", b2);
    }

    public BigInteger unpackBigInteger() throws IOException {
        byte b2 = readByte();
        if (MessagePack.Code.isFixInt(b2)) {
            return BigInteger.valueOf(b2);
        }
        switch (b2) {
            case -52:
                return BigInteger.valueOf(readByte() & 255);
            case -51:
                return BigInteger.valueOf(readShort() & 65535);
            case -50:
                int i2 = readInt();
                return i2 < 0 ? BigInteger.valueOf(((long) ((i2 + Integer.MAX_VALUE) - (i2 | Integer.MAX_VALUE))) + CacheValidityPolicy.MAX_AGE) : BigInteger.valueOf(i2);
            case -49:
                long j2 = readLong();
                return j2 < 0 ? BigInteger.valueOf(j2 - Long.MIN_VALUE).setBit(63) : BigInteger.valueOf(j2);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", b2);
        }
    }

    public int unpackBinaryHeader() throws IOException {
        int iTryReadStringHeader;
        byte b2 = readByte();
        if (MessagePack.Code.isFixedRaw(b2)) {
            return b2 & Ascii.US;
        }
        int iTryReadBinaryHeader = tryReadBinaryHeader(b2);
        if (iTryReadBinaryHeader >= 0) {
            return iTryReadBinaryHeader;
        }
        if (!this.allowReadingStringAsBinary || (iTryReadStringHeader = tryReadStringHeader(b2)) < 0) {
            throw unexpected("Binary", b2);
        }
        return iTryReadStringHeader;
    }

    public boolean unpackBoolean() throws IOException {
        byte b2 = readByte();
        if (b2 == -62) {
            return false;
        }
        if (b2 == -61) {
            return true;
        }
        throw unexpected("boolean", b2);
    }

    public byte unpackByte() throws IOException {
        long j2;
        byte b2 = readByte();
        if (MessagePack.Code.isFixInt(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                byte b3 = readByte();
                if (b3 >= 0) {
                    return b3;
                }
                throw overflowU8(b3);
            case -51:
                short s2 = readShort();
                if (s2 < 0 || s2 > 127) {
                    throw overflowU16(s2);
                }
                return (byte) s2;
            case -50:
                int i2 = readInt();
                if (i2 < 0 || i2 > 127) {
                    throw overflowU32(i2);
                }
                return (byte) i2;
            case -49:
                j2 = readLong();
                if (j2 < 0 || j2 > 127) {
                    throw overflowU64(j2);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s3 = readShort();
                if (s3 < -128 || s3 > 127) {
                    throw overflowI16(s3);
                }
                return (byte) s3;
            case -46:
                int i3 = readInt();
                if (i3 < -128 || i3 > 127) {
                    throw overflowI32(i3);
                }
                return (byte) i3;
            case -45:
                j2 = readLong();
                if (j2 < -128 || j2 > 127) {
                    throw overflowI64(j2);
                }
                break;
            default:
                throw unexpected("Integer", b2);
        }
        return (byte) j2;
    }

    public double unpackDouble() throws IOException {
        byte b2 = readByte();
        if (b2 == -54) {
            return readFloat();
        }
        if (b2 == -53) {
            return readDouble();
        }
        throw unexpected("Float", b2);
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() throws IOException {
        byte b2 = readByte();
        switch (b2) {
            case -57:
                MessageBuffer messageBufferPrepareNumberBuffer = prepareNumberBuffer(2);
                byte b3 = messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer.getByte(this.nextReadPosition + 1), (b3 + 255) - (b3 | 255));
            case -56:
                MessageBuffer messageBufferPrepareNumberBuffer2 = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer2.getByte(this.nextReadPosition + 2), messageBufferPrepareNumberBuffer2.getShort(this.nextReadPosition) & 65535);
            case -55:
                MessageBuffer messageBufferPrepareNumberBuffer3 = prepareNumberBuffer(5);
                int i2 = messageBufferPrepareNumberBuffer3.getInt(this.nextReadPosition);
                if (i2 >= 0) {
                    return new ExtensionTypeHeader(messageBufferPrepareNumberBuffer3.getByte(this.nextReadPosition + 4), i2);
                }
                throw overflowU32Size(i2);
            default:
                switch (b2) {
                    case -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", b2);
                }
        }
    }

    public float unpackFloat() throws IOException {
        byte b2 = readByte();
        if (b2 == -54) {
            return readFloat();
        }
        if (b2 == -53) {
            return (float) readDouble();
        }
        throw unexpected("Float", b2);
    }

    public int unpackInt() throws IOException {
        byte b2 = readByte();
        if (MessagePack.Code.isFixInt(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                return (-1) - (((-1) - readByte()) | ((-1) - 255));
            case -51:
                short s2 = readShort();
                return (s2 + 65535) - (s2 | 65535);
            case -50:
                int i2 = readInt();
                if (i2 >= 0) {
                    return i2;
                }
                throw overflowU32(i2);
            case -49:
                long j2 = readLong();
                if (j2 < 0 || j2 > 2147483647L) {
                    throw overflowU64(j2);
                }
                return (int) j2;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j3 = readLong();
                if (j3 < -2147483648L || j3 > 2147483647L) {
                    throw overflowI64(j3);
                }
                return (int) j3;
            default:
                throw unexpected("Integer", b2);
        }
    }

    public long unpackLong() throws IOException {
        byte b2 = readByte();
        if (MessagePack.Code.isFixInt(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                return readByte() & 255;
            case -51:
                return (-1) - (((-1) - readShort()) | ((-1) - 65535));
            case -50:
                int i2 = readInt();
                return i2 < 0 ? ((long) (i2 & Integer.MAX_VALUE)) + CacheValidityPolicy.MAX_AGE : i2;
            case -49:
                long j2 = readLong();
                if (j2 >= 0) {
                    return j2;
                }
                throw overflowU64(j2);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw unexpected("Integer", b2);
        }
    }

    public int unpackMapHeader() throws IOException {
        byte b2 = readByte();
        if (MessagePack.Code.isFixedMap(b2)) {
            return (-1) - (((-1) - b2) | ((-1) - 15));
        }
        if (b2 == -34) {
            return readNextLength16();
        }
        if (b2 == -33) {
            return readNextLength32();
        }
        throw unexpected("Map", b2);
    }

    public void unpackNil() throws IOException {
        byte b2 = readByte();
        if (b2 != -64) {
            throw unexpected("Nil", b2);
        }
    }

    public int unpackRawStringHeader() throws IOException {
        int iTryReadBinaryHeader;
        byte b2 = readByte();
        if (MessagePack.Code.isFixedRaw(b2)) {
            return b2 & Ascii.US;
        }
        int iTryReadStringHeader = tryReadStringHeader(b2);
        if (iTryReadStringHeader >= 0) {
            return iTryReadStringHeader;
        }
        if (!this.allowReadingBinaryAsString || (iTryReadBinaryHeader = tryReadBinaryHeader(b2)) < 0) {
            throw unexpected("String", b2);
        }
        return iTryReadBinaryHeader;
    }

    public short unpackShort() throws IOException {
        long j2;
        int i2;
        byte b2 = readByte();
        if (MessagePack.Code.isFixInt(b2)) {
            return b2;
        }
        switch (b2) {
            case -52:
                i2 = (-1) - (((-1) - readByte()) | ((-1) - 255));
                return (short) i2;
            case -51:
                short s2 = readShort();
                if (s2 >= 0) {
                    return s2;
                }
                throw overflowU16(s2);
            case -50:
                int i3 = readInt();
                if (i3 < 0 || i3 > 32767) {
                    throw overflowU32(i3);
                }
                return (short) i3;
            case -49:
                j2 = readLong();
                if (j2 < 0 || j2 > 32767) {
                    throw overflowU64(j2);
                }
                i2 = (int) j2;
                return (short) i2;
            case -48:
                i2 = readByte();
                return (short) i2;
            case -47:
                return readShort();
            case -46:
                int i4 = readInt();
                if (i4 < -32768 || i4 > 32767) {
                    throw overflowI32(i4);
                }
                return (short) i4;
            case -45:
                j2 = readLong();
                if (j2 < -32768 || j2 > 32767) {
                    throw overflowI64(j2);
                }
                i2 = (int) j2;
                return (short) i2;
            default:
                throw unexpected("Integer", b2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x010c, code lost:
    
        return r9.decodeStringBuffer.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String unpackString() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessageUnpacker.unpackString():java.lang.String");
    }

    public Instant unpackTimestamp() throws IOException {
        return unpackTimestamp(unpackExtensionTypeHeader());
    }

    public Instant unpackTimestamp(ExtensionTypeHeader extensionTypeHeader) throws IOException {
        if (extensionTypeHeader.getType() != -1) {
            throw unexpectedExtension("Timestamp", -1, extensionTypeHeader.getType());
        }
        int length = extensionTypeHeader.getLength();
        if (length == 4) {
            return Instant.ofEpochSecond(((long) readInt()) & 4294967295L);
        }
        if (length == 8) {
            return Instant.ofEpochSecond(readLong() & 17179869183L, (int) (r3 >>> 34));
        }
        if (length != 12) {
            throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte) -1, Integer.valueOf(extensionTypeHeader.getLength())));
        }
        long j2 = readInt();
        return Instant.ofEpochSecond(readLong(), (j2 + 4294967295L) - (j2 | 4294967295L));
    }

    public ImmutableValue unpackValue() throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i2 = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                return ValueFactory.newNil();
            case 2:
                return ValueFactory.newBoolean(unpackBoolean());
            case 3:
                return nextFormat == MessageFormat.UINT64 ? ValueFactory.newInteger(unpackBigInteger()) : ValueFactory.newInteger(unpackLong());
            case 4:
                return ValueFactory.newFloat(unpackDouble());
            case 5:
                return ValueFactory.newString(readPayload(unpackRawStringHeader()), true);
            case 6:
                return ValueFactory.newBinary(readPayload(unpackBinaryHeader()), true);
            case 7:
                int iUnpackArrayHeader = unpackArrayHeader();
                Value[] valueArr = new Value[iUnpackArrayHeader];
                while (i2 < iUnpackArrayHeader) {
                    valueArr[i2] = unpackValue();
                    i2++;
                }
                return ValueFactory.newArray(valueArr, true);
            case 8:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                Value[] valueArr2 = new Value[iUnpackMapHeader];
                while (i2 < iUnpackMapHeader) {
                    valueArr2[i2] = unpackValue();
                    valueArr2[i2 + 1] = unpackValue();
                    i2 += 2;
                }
                return ValueFactory.newMap(valueArr2, true);
            case 9:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                return extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1 ? ValueFactory.newExtension(extensionTypeHeaderUnpackExtensionTypeHeader.getType(), readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength())) : ValueFactory.newTimestamp(unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public Variable unpackValue(Variable variable) throws IOException {
        MessageFormat nextFormat = getNextFormat();
        int i2 = 0;
        switch (AnonymousClass1.$SwitchMap$org$msgpack$value$ValueType[nextFormat.getValueType().ordinal()]) {
            case 1:
                readByte();
                variable.setNilValue();
                return variable;
            case 2:
                variable.setBooleanValue(unpackBoolean());
                return variable;
            case 3:
                if (AnonymousClass1.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16) {
                    variable.setIntegerValue(unpackLong());
                    return variable;
                }
                variable.setIntegerValue(unpackBigInteger());
                return variable;
            case 4:
                variable.setFloatValue(unpackDouble());
                return variable;
            case 5:
                variable.setStringValue(readPayload(unpackRawStringHeader()));
                return variable;
            case 6:
                variable.setBinaryValue(readPayload(unpackBinaryHeader()));
                return variable;
            case 7:
                int iUnpackArrayHeader = unpackArrayHeader();
                Value[] valueArr = new Value[iUnpackArrayHeader];
                while (i2 < iUnpackArrayHeader) {
                    valueArr[i2] = unpackValue();
                    i2++;
                }
                variable.setArrayValue(valueArr);
                return variable;
            case 8:
                int iUnpackMapHeader = unpackMapHeader() * 2;
                Value[] valueArr2 = new Value[iUnpackMapHeader];
                while (i2 < iUnpackMapHeader) {
                    valueArr2[i2] = unpackValue();
                    valueArr2[i2 + 1] = unpackValue();
                    i2 += 2;
                }
                variable.setMapValue(valueArr2);
                return variable;
            case 9:
                ExtensionTypeHeader extensionTypeHeaderUnpackExtensionTypeHeader = unpackExtensionTypeHeader();
                if (extensionTypeHeaderUnpackExtensionTypeHeader.getType() != -1) {
                    variable.setExtensionValue(extensionTypeHeaderUnpackExtensionTypeHeader.getType(), readPayload(extensionTypeHeaderUnpackExtensionTypeHeader.getLength()));
                } else {
                    variable.setTimestampValue(unpackTimestamp(extensionTypeHeaderUnpackExtensionTypeHeader));
                }
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }
}
