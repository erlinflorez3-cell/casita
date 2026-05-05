package org.msgpack.core;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import org.msgpack.core.MessagePack;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.value.Value;

/* JADX INFO: loaded from: classes2.dex */
public class MessagePacker implements Closeable, Flushable {
    private static final boolean CORRUPTED_CHARSET_ENCODER;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final int UTF_8_MAX_CHAR_SIZE = 6;
    private MessageBuffer buffer;
    private final int bufferFlushThreshold;
    private CharsetEncoder encoder;
    protected MessageBufferOutput out;
    private final int smallStringOptimizationThreshold;
    private final boolean str8FormatSupport;
    private int position = 0;
    private long totalFlushBytes = 0;

    static {
        boolean z2 = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i2 = cls.getField("SDK_INT").getInt(cls.getConstructor(new Class[0]).newInstance(new Object[0]));
            if (i2 >= 14 && i2 < 21) {
                z2 = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        } catch (InvocationTargetException e6) {
            e6.printStackTrace();
        }
        CORRUPTED_CHARSET_ENCODER = z2;
    }

    protected MessagePacker(MessageBufferOutput messageBufferOutput, MessagePack.PackerConfig packerConfig) {
        this.out = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.smallStringOptimizationThreshold = packerConfig.getSmallStringOptimizationThreshold();
        this.bufferFlushThreshold = packerConfig.getBufferFlushThreshold();
        this.str8FormatSupport = packerConfig.isStr8FormatSupport();
    }

    private int encodeStringToBufferAt(int i2, String str) {
        prepareEncoder();
        MessageBuffer messageBuffer = this.buffer;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i2, messageBuffer.size() - i2);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.encoder.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.encoder.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    private void ensureCapacity(int i2) throws IOException {
        MessageBuffer messageBuffer = this.buffer;
        if (messageBuffer == null) {
            this.buffer = this.out.next(i2);
        } else if (this.position + i2 >= messageBuffer.size()) {
            flushBuffer();
            this.buffer = this.out.next(i2);
        }
    }

    private void flushBuffer() throws IOException {
        this.out.writeBuffer(this.position);
        this.buffer = null;
        this.totalFlushBytes += (long) this.position;
        this.position = 0;
    }

    private void packStringWithGetBytes(String str) throws IOException {
        byte[] bytes = str.getBytes(MessagePack.UTF8);
        packRawStringHeader(bytes.length);
        addPayload(bytes);
    }

    private void prepareEncoder() {
        if (this.encoder == null) {
            this.encoder = MessagePack.UTF8.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        }
        this.encoder.reset();
    }

    private void writeByte(byte b2) throws IOException {
        ensureCapacity(1);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
    }

    private void writeByteAndByte(byte b2, byte b3) throws IOException {
        ensureCapacity(2);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
        MessageBuffer messageBuffer2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer2.putByte(i3, b3);
    }

    private void writeByteAndDouble(byte b2, double d2) throws IOException {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.buffer.putDouble(this.position, d2);
        this.position += 8;
    }

    private void writeByteAndFloat(byte b2, float f2) throws IOException {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.buffer.putFloat(this.position, f2);
        this.position += 4;
    }

    private void writeByteAndInt(byte b2, int i2) throws IOException {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer.putByte(i3, b2);
        this.buffer.putInt(this.position, i2);
        this.position += 4;
    }

    private void writeByteAndLong(byte b2, long j2) throws IOException {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.buffer.putLong(this.position, j2);
        this.position += 8;
    }

    private void writeByteAndShort(byte b2, short s2) throws IOException {
        ensureCapacity(3);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b2);
        this.buffer.putShort(this.position, s2);
        this.position += 2;
    }

    private void writeInt(int i2) throws IOException {
        ensureCapacity(4);
        this.buffer.putInt(this.position, i2);
        this.position += 4;
    }

    private void writeLong(long j2) throws IOException {
        ensureCapacity(8);
        this.buffer.putLong(this.position, j2);
        this.position += 8;
    }

    private void writeShort(short s2) throws IOException {
        ensureCapacity(2);
        this.buffer.putShort(this.position, s2);
        this.position += 2;
    }

    private void writeTimestamp32(int i2) throws IOException {
        ensureCapacity(6);
        MessageBuffer messageBuffer = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer.putByte(i3, MessagePack.Code.FIXEXT4);
        MessageBuffer messageBuffer2 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        messageBuffer2.putByte(i4, (byte) -1);
        this.buffer.putInt(this.position, i2);
        this.position += 4;
    }

    private void writeTimestamp64(long j2) throws IOException {
        ensureCapacity(10);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, MessagePack.Code.FIXEXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer2.putByte(i3, (byte) -1);
        this.buffer.putLong(this.position, j2);
        this.position += 8;
    }

    private void writeTimestamp96(long j2, int i2) throws IOException {
        ensureCapacity(15);
        MessageBuffer messageBuffer = this.buffer;
        int i3 = this.position;
        this.position = i3 + 1;
        messageBuffer.putByte(i3, MessagePack.Code.EXT8);
        MessageBuffer messageBuffer2 = this.buffer;
        int i4 = this.position;
        this.position = i4 + 1;
        messageBuffer2.putByte(i4, Ascii.FF);
        MessageBuffer messageBuffer3 = this.buffer;
        int i5 = this.position;
        this.position = i5 + 1;
        messageBuffer3.putByte(i5, (byte) -1);
        this.buffer.putInt(this.position, i2);
        int i6 = this.position + 4;
        this.position = i6;
        this.buffer.putLong(i6, j2);
        this.position += 8;
    }

    public MessagePacker addPayload(byte[] bArr) throws IOException {
        return addPayload(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.msgpack.core.MessagePacker addPayload(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            org.msgpack.core.buffer.MessageBuffer r0 = r4.buffer
            if (r0 == 0) goto L11
            int r0 = r0.size()
            int r1 = r4.position
            int r0 = r0 - r1
            if (r0 < r7) goto L11
            int r0 = r4.bufferFlushThreshold
            if (r7 <= r0) goto L20
        L11:
            r4.flush()
            org.msgpack.core.buffer.MessageBufferOutput r0 = r4.out
            r0.add(r5, r6, r7)
            long r2 = r4.totalFlushBytes
            long r0 = (long) r7
            long r2 = r2 + r0
            r4.totalFlushBytes = r2
        L1f:
            return r4
        L20:
            org.msgpack.core.buffer.MessageBuffer r0 = r4.buffer
            r0.putBytes(r1, r5, r6, r7)
            int r0 = r4.position
            int r0 = r0 + r7
            r4.position = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.addPayload(byte[], int, int):org.msgpack.core.MessagePacker");
    }

    public void clear() {
        this.position = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } finally {
            this.out.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.position > 0) {
            flushBuffer();
        }
        this.out.flush();
    }

    public long getTotalWrittenBytes() {
        return this.totalFlushBytes + ((long) this.position);
    }

    public MessagePacker packArrayHeader(int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i2 < 16) {
            writeByte((byte) (i2 | (-112)));
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.ARRAY16, (short) i2);
        } else {
            writeByteAndInt(MessagePack.Code.ARRAY32, i2);
        }
        return this;
    }

    public MessagePacker packBigInteger(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            packLong(bigInteger.longValue());
        } else {
            if (bigInteger.bitLength() != 64 || bigInteger.signum() != 1) {
                throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
            }
            writeByteAndLong(MessagePack.Code.UINT64, bigInteger.longValue());
        }
        return this;
    }

    public MessagePacker packBinaryHeader(int i2) throws IOException {
        if (i2 < 256) {
            writeByteAndByte(MessagePack.Code.BIN8, (byte) i2);
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.BIN16, (short) i2);
        } else {
            writeByteAndInt(MessagePack.Code.BIN32, i2);
        }
        return this;
    }

    public MessagePacker packBoolean(boolean z2) throws IOException {
        writeByte(z2 ? MessagePack.Code.TRUE : MessagePack.Code.FALSE);
        return this;
    }

    public MessagePacker packByte(byte b2) throws IOException {
        if (b2 < -32) {
            writeByteAndByte(MessagePack.Code.INT8, b2);
        } else {
            writeByte(b2);
        }
        return this;
    }

    public MessagePacker packDouble(double d2) throws IOException {
        writeByteAndDouble(MessagePack.Code.FLOAT64, d2);
        return this;
    }

    public MessagePacker packExtensionTypeHeader(byte b2, int i2) throws IOException {
        if (i2 < 256) {
            if (i2 <= 0 || ((i2 - 1) & i2) != 0) {
                writeByteAndByte(MessagePack.Code.EXT8, (byte) i2);
                writeByte(b2);
            } else if (i2 == 1) {
                writeByteAndByte(MessagePack.Code.FIXEXT1, b2);
            } else if (i2 == 2) {
                writeByteAndByte(MessagePack.Code.FIXEXT2, b2);
            } else if (i2 == 4) {
                writeByteAndByte(MessagePack.Code.FIXEXT4, b2);
            } else if (i2 == 8) {
                writeByteAndByte(MessagePack.Code.FIXEXT8, b2);
            } else if (i2 == 16) {
                writeByteAndByte(MessagePack.Code.FIXEXT16, b2);
            } else {
                writeByteAndByte(MessagePack.Code.EXT8, (byte) i2);
                writeByte(b2);
            }
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.EXT16, (short) i2);
            writeByte(b2);
        } else {
            writeByteAndInt(MessagePack.Code.EXT32, i2);
            writeByte(b2);
        }
        return this;
    }

    public MessagePacker packFloat(float f2) throws IOException {
        writeByteAndFloat(MessagePack.Code.FLOAT32, f2);
        return this;
    }

    public MessagePacker packInt(int i2) throws IOException {
        if (i2 < -32) {
            if (i2 < -32768) {
                writeByteAndInt(MessagePack.Code.INT32, i2);
            } else if (i2 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) i2);
            } else {
                writeByteAndByte(MessagePack.Code.INT8, (byte) i2);
            }
        } else if (i2 < 128) {
            writeByte((byte) i2);
        } else if (i2 < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) i2);
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.UINT16, (short) i2);
        } else {
            writeByteAndInt(MessagePack.Code.UINT32, i2);
        }
        return this;
    }

    public MessagePacker packLong(long j2) throws IOException {
        if (j2 < -32) {
            if (j2 < -32768) {
                if (j2 < -2147483648L) {
                    writeByteAndLong(MessagePack.Code.INT64, j2);
                } else {
                    writeByteAndInt(MessagePack.Code.INT32, (int) j2);
                }
            } else if (j2 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, (short) j2);
            } else {
                writeByteAndByte(MessagePack.Code.INT8, (byte) j2);
            }
        } else if (j2 < 128) {
            writeByte((byte) j2);
        } else if (j2 < 65536) {
            if (j2 < 256) {
                writeByteAndByte(MessagePack.Code.UINT8, (byte) j2);
            } else {
                writeByteAndShort(MessagePack.Code.UINT16, (short) j2);
            }
        } else if (j2 < 4294967296L) {
            writeByteAndInt(MessagePack.Code.UINT32, (int) j2);
        } else {
            writeByteAndLong(MessagePack.Code.UINT64, j2);
        }
        return this;
    }

    public MessagePacker packMapHeader(int i2) throws IOException {
        if (i2 < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i2 < 16) {
            writeByte((byte) ((i2 - 128) - (i2 & (-128))));
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.MAP16, (short) i2);
        } else {
            writeByteAndInt(MessagePack.Code.MAP32, i2);
        }
        return this;
    }

    public MessagePacker packNil() throws IOException {
        writeByte(MessagePack.Code.NIL);
        return this;
    }

    public MessagePacker packRawStringHeader(int i2) throws IOException {
        if (i2 < 32) {
            writeByte((byte) (i2 | (-96)));
        } else if (this.str8FormatSupport && i2 < 256) {
            writeByteAndByte(MessagePack.Code.STR8, (byte) i2);
        } else if (i2 < 65536) {
            writeByteAndShort(MessagePack.Code.STR16, (short) i2);
        } else {
            writeByteAndInt(MessagePack.Code.STR32, i2);
        }
        return this;
    }

    public MessagePacker packShort(short s2) throws IOException {
        if (s2 < -32) {
            if (s2 < -128) {
                writeByteAndShort(MessagePack.Code.INT16, s2);
            } else {
                writeByteAndByte(MessagePack.Code.INT8, (byte) s2);
            }
        } else if (s2 < 128) {
            writeByte((byte) s2);
        } else if (s2 < 256) {
            writeByteAndByte(MessagePack.Code.UINT8, (byte) s2);
        } else {
            writeByteAndShort(MessagePack.Code.UINT16, s2);
        }
        return this;
    }

    public MessagePacker packString(String str) throws IOException {
        if (str.length() <= 0) {
            packRawStringHeader(0);
            return this;
        }
        if (CORRUPTED_CHARSET_ENCODER || str.length() < this.smallStringOptimizationThreshold) {
            packStringWithGetBytes(str);
            return this;
        }
        if (str.length() < 256) {
            ensureCapacity((str.length() * 6) + 3);
            int iEncodeStringToBufferAt = encodeStringToBufferAt(this.position + 2, str);
            if (iEncodeStringToBufferAt >= 0) {
                if (this.str8FormatSupport && iEncodeStringToBufferAt < 256) {
                    MessageBuffer messageBuffer = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    messageBuffer.putByte(i2, MessagePack.Code.STR8);
                    MessageBuffer messageBuffer2 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    messageBuffer2.putByte(i3, (byte) iEncodeStringToBufferAt);
                    this.position += iEncodeStringToBufferAt;
                } else {
                    if (iEncodeStringToBufferAt >= 65536) {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                    MessageBuffer messageBuffer3 = this.buffer;
                    int i4 = this.position;
                    messageBuffer3.putMessageBuffer(i4 + 3, messageBuffer3, i4 + 2, iEncodeStringToBufferAt);
                    MessageBuffer messageBuffer4 = this.buffer;
                    int i5 = this.position;
                    this.position = i5 + 1;
                    messageBuffer4.putByte(i5, MessagePack.Code.STR16);
                    this.buffer.putShort(this.position, (short) iEncodeStringToBufferAt);
                    this.position = this.position + 2 + iEncodeStringToBufferAt;
                }
                return this;
            }
        } else if (str.length() < 65536) {
            ensureCapacity((str.length() * 6) + 5);
            int iEncodeStringToBufferAt2 = encodeStringToBufferAt(this.position + 3, str);
            if (iEncodeStringToBufferAt2 >= 0) {
                if (iEncodeStringToBufferAt2 < 65536) {
                    MessageBuffer messageBuffer5 = this.buffer;
                    int i6 = this.position;
                    this.position = i6 + 1;
                    messageBuffer5.putByte(i6, MessagePack.Code.STR16);
                    this.buffer.putShort(this.position, (short) iEncodeStringToBufferAt2);
                    this.position = this.position + 2 + iEncodeStringToBufferAt2;
                } else {
                    if (iEncodeStringToBufferAt2 >= 4294967296L) {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                    MessageBuffer messageBuffer6 = this.buffer;
                    int i7 = this.position;
                    messageBuffer6.putMessageBuffer(i7 + 5, messageBuffer6, i7 + 3, iEncodeStringToBufferAt2);
                    MessageBuffer messageBuffer7 = this.buffer;
                    int i8 = this.position;
                    this.position = i8 + 1;
                    messageBuffer7.putByte(i8, MessagePack.Code.STR32);
                    this.buffer.putInt(this.position, iEncodeStringToBufferAt2);
                    this.position = this.position + 4 + iEncodeStringToBufferAt2;
                }
                return this;
            }
        }
        packStringWithGetBytes(str);
        return this;
    }

    public MessagePacker packTimestamp(long j2) throws IOException {
        return packTimestamp(Instant.ofEpochMilli(j2));
    }

    public MessagePacker packTimestamp(long j2, int i2) throws IOException, ArithmeticException {
        long j3 = i2;
        long jAddExact = Math.addExact(j2, Math.floorDiv(j3, 1000000000L));
        long jFloorMod = Math.floorMod(j3, 1000000000L);
        if ((jAddExact >>> 34) == 0) {
            long j4 = jFloorMod << 34;
            long j5 = (j4 + jAddExact) - (j4 & jAddExact);
            if (((-4294967296L) + j5) - ((-4294967296L) | j5) == 0) {
                writeTimestamp32((int) jAddExact);
            } else {
                writeTimestamp64(j5);
            }
        } else {
            writeTimestamp96(jAddExact, (int) jFloorMod);
        }
        return this;
    }

    public MessagePacker packTimestamp(Instant instant) throws IOException {
        return packTimestamp(instant.getEpochSecond(), instant.getNano());
    }

    public MessagePacker packValue(Value value) throws IOException {
        value.writeTo(this);
        return this;
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) throws IOException {
        MessageBufferOutput messageBufferOutput2 = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        flush();
        MessageBufferOutput messageBufferOutput3 = this.out;
        this.out = messageBufferOutput2;
        this.totalFlushBytes = 0L;
        return messageBufferOutput3;
    }

    public MessagePacker writePayload(byte[] bArr) throws IOException {
        return writePayload(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.msgpack.core.MessagePacker writePayload(byte[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            org.msgpack.core.buffer.MessageBuffer r0 = r4.buffer
            if (r0 == 0) goto L11
            int r0 = r0.size()
            int r1 = r4.position
            int r0 = r0 - r1
            if (r0 < r7) goto L11
            int r0 = r4.bufferFlushThreshold
            if (r7 <= r0) goto L20
        L11:
            r4.flush()
            org.msgpack.core.buffer.MessageBufferOutput r0 = r4.out
            r0.write(r5, r6, r7)
            long r2 = r4.totalFlushBytes
            long r0 = (long) r7
            long r2 = r2 + r0
            r4.totalFlushBytes = r2
        L1f:
            return r4
        L20:
            org.msgpack.core.buffer.MessageBuffer r0 = r4.buffer
            r0.putBytes(r1, r5, r6, r7)
            int r0 = r4.position
            int r0 = r0 + r7
            r4.position = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.writePayload(byte[], int, int):org.msgpack.core.MessagePacker");
    }
}
