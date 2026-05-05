package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    public static int decodeZigZag32(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public abstract void checkLastTagWas(int i2) throws InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z2);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i2);

    public abstract int pushLimit(int i2) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i2, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i2) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i2, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i2) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i2) throws IOException;

    /* synthetic */ CodedInputStream(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(Internal.EMPTY_BYTE_ARRAY);
        }
        return new StreamDecoder(inputStream, i2);
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z2) {
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 = (-1) - (((-1) - i2) & ((-1) - 1));
            } else {
                i2 = byteBuffer.isDirect() ? (i2 + 2) - (i2 & 2) : (-1) - (((-1) - i2) & ((-1) - 4));
            }
        }
        if (i2 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, iRemaining, z2);
        }
        return newInstance(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i2, int i3) {
        return newInstance(bArr, i2, i3, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.pushLimit(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z2);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    private CodedInputStream() {
        this.recursionLimit = 100;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public final int setRecursionLimit(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + i2);
        }
        int i3 = this.recursionLimit;
        this.recursionLimit = i2;
        return i3;
    }

    public final int setSizeLimit(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + i2);
        }
        int i3 = this.sizeLimit;
        this.sizeLimit = i2;
        return i3;
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public static int readRawVarint32(int i2, InputStream inputStream) throws IOException {
        if ((i2 + 128) - (128 | i2) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = ((-1) - (((-1) - i5) | ((-1) - 127))) << i4;
            i3 = (i3 + i6) - (i3 & i6);
            if ((i5 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        while (i4 < 64) {
            int i7 = inputStream.read();
            if (i7 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i7 & 128) == 0) {
                return i3;
            }
            i4 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        return readRawVarint32(i2, inputStream);
    }

    private static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        /* synthetic */ ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2, AnonymousClass1 anonymousClass1) {
            this(bArr, i2, i3, z2);
        }

        private ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i3 + i2;
            this.pos = i2;
            this.startPos = i2;
            this.immutable = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeRawVarint32(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.limit - this.pos) {
                String str = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, i3, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i2, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i2, MessageLite.Builder builder) throws IOException {
            readGroup(i2, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            ByteString byteStringCopyFrom;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    if (this.immutable && this.enableAliasing) {
                        byteStringCopyFrom = ByteString.wrap(this.buffer, i3, rawVarint32);
                    } else {
                        byteStringCopyFrom = ByteString.copyFrom(this.buffer, i3, rawVarint32);
                    }
                    this.pos += rawVarint32;
                    return byteStringCopyFrom;
                }
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            return ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            ByteBuffer byteBufferWrap;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    if (!this.immutable && this.enableAliasing) {
                        byteBufferWrap = ByteBuffer.wrap(this.buffer, i3, rawVarint32).slice();
                    } else {
                        byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32));
                    }
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:71:0x0057, B:75:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r7 = this;
                int r5 = r7.pos
                int r1 = r7.limit
                if (r1 != r5) goto Lc
            L6:
                long r1 = r7.readRawVarint64SlowPath()
                int r0 = (int) r1
                return r0
            Lc:
                byte[] r4 = r7.buffer
                int r3 = r5 + 1
                r2 = r4[r5]
                if (r2 < 0) goto L17
                r7.pos = r3
                return r2
            L17:
                int r1 = r1 - r3
                r0 = 9
                if (r1 >= r0) goto L1d
                goto L6
            L1d:
                int r1 = r5 + 2
                r0 = r4[r3]
                int r6 = r0 << 7
                r6 = r6 ^ r2
                if (r6 >= 0) goto L2b
                r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
            L28:
                r7.pos = r1
                return r0
            L2b:
                int r3 = r5 + 3
                r0 = r4[r1]
                int r2 = r0 << 14
                r2 = r2 ^ r6
                if (r2 < 0) goto L38
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L36:
                r1 = r3
                goto L28
            L38:
                int r1 = r5 + 4
                r0 = r4[r3]
                int r0 = r0 << 21
                r2 = r2 ^ r0
                if (r2 >= 0) goto L46
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
            L45:
                goto L28
            L46:
                int r3 = r5 + 5
                r1 = r4[r1]
                int r0 = r1 << 28
                r2 = r2 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r0
                if (r1 >= 0) goto L74
                int r1 = r5 + 6
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 7
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 8
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 9
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 10
                r0 = r4[r3]
                if (r0 >= 0) goto L76
                goto L6
            L72:
                r0 = r2
                goto L45
            L74:
                r0 = r2
                goto L36
            L76:
                r0 = r2
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.buffer;
                int i3 = this.pos;
                this.pos = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.pos = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j2 = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                        if (i8 >= 0) {
                            j2 = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                j2 = (-2080896) ^ i10;
                                i5 = i9;
                            } else {
                                i5 = i2 + 5;
                                long j5 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                                if (j5 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i11 = i2 + 6;
                                    long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j5 = j6 ^ (((long) bArr[i11]) << 42);
                                        if (j5 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i11 = i2 + 8;
                                            j6 = j5 ^ (((long) bArr[i5]) << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                j2 = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j6 ^ j3;
                                    i5 = i11;
                                }
                                j2 = j5 ^ j4;
                            }
                        }
                    }
                    this.pos = i5;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                long j3 = ((long) (127 & rawByte)) << i2;
                j2 = (j2 + j3) - (j2 & j3);
                if ((-1) - (((-1) - rawByte) | ((-1) - 128)) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            int i3 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
            byte b2 = bArr[i2 + 2];
            int i4 = (-1) - (((-1) - i3) & ((-1) - (((b2 + 255) - (b2 | 255)) << 16)));
            int i5 = (bArr[i2 + 3] & 255) << 24;
            return (i5 + i4) - (i5 & i4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            long j2 = ((long) bArr[i2]) & 255;
            long j3 = bArr[i2 + 1];
            long j4 = bArr[i2 + 2];
            long j5 = (-1) - (((-1) - (((-1) - (((-1) - j2) & ((-1) - (((j3 + 255) - (j3 | 255)) << 8)))) | (((j4 + 255) - (j4 | 255)) << 16))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24)));
            long j6 = bArr[i2 + 4];
            long j7 = (-1) - (((-1) - j5) & ((-1) - (((j6 + 255) - (j6 | 255)) << 32)));
            long j8 = ((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40;
            long j9 = (j7 + j8) - (j7 & j8);
            long j10 = (((long) bArr[i2 + 6]) & 255) << 48;
            long j11 = (j9 + j10) - (j9 & j10);
            long j12 = bArr[i2 + 7];
            return (((j12 + 255) - (j12 | 255)) << 56) | j11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i2;
            int i3 = i2 - this.startPos;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.bufferSizeAfterLimit = i5;
                this.limit = i2 - i5;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i2 = this.pos;
            if (i2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 > 0) {
                int i3 = this.limit;
                int i4 = this.pos;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.pos = i5;
                    return Arrays.copyOfRange(this.buffer, i4, i5);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i2) throws IOException {
            if (i2 >= 0) {
                int i3 = this.limit;
                int i4 = this.pos;
                if (i2 <= i3 - i4) {
                    this.pos = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        /* synthetic */ UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2, AnonymousClass1 anonymousClass1) {
            this(byteBuffer, z2);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = ((long) byteBuffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) byteBuffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeRawVarint32(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j2 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j2);
            String str = new String(bArr, Internal.UTF_8);
            this.pos += j2;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += (long) rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i2, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i2, MessageLite.Builder builder) throws IOException {
            readGroup(i2, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j2 = this.pos;
                long j3 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
                this.pos += j3;
                return ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j4 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j4);
            this.pos += j4;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable && this.enableAliasing) {
                long j2 = this.pos;
                long j3 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j2, j2 + j3);
                this.pos += j3;
                return byteBufferSlice;
            }
            byte[] bArr = new byte[rawVarint32];
            long j4 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j4);
            this.pos += j4;
            return ByteBuffer.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6) < 0) goto L44;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r10 = this;
                long r1 = r10.pos
                long r3 = r10.limit
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto Le
            L8:
                long r1 = r10.readRawVarint64SlowPath()
                int r0 = (int) r1
                return r0
            Le:
                r5 = 1
                long r5 = r5 + r1
                byte r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1)
                if (r7 < 0) goto L1a
                r10.pos = r5
                return r7
            L1a:
                long r3 = r10.limit
                long r3 = r3 - r5
                r8 = 9
                int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r0 >= 0) goto L24
                goto L8
            L24:
                r3 = 2
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r0 << 7
                r5 = r5 ^ r7
                if (r5 >= 0) goto L35
                r0 = r5 ^ (-128(0xffffffffffffff80, float:NaN))
            L32:
                r10.pos = r3
                return r0
            L35:
                r6 = 3
                long r6 = r6 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                int r0 = r0 << 14
                r5 = r5 ^ r0
                if (r5 < 0) goto L45
                r0 = r5 ^ 16256(0x3f80, float:2.278E-41)
            L43:
                r3 = r6
                goto L32
            L45:
                r3 = 4
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 21
                r5 = r5 ^ r0
                if (r5 >= 0) goto L56
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r5
                goto L32
            L56:
                r6 = 5
                long r6 = r6 + r1
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                int r0 = r3 << 28
                r5 = r5 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r5 = r5 ^ r0
                if (r3 >= 0) goto L94
                r3 = 6
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                r6 = 7
                long r6 = r6 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
                r3 = 8
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                long r6 = r1 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
                r3 = 10
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                goto L8
            L94:
                r0 = r5
                goto L43
            L96:
                r0 = r5
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                long j2 = this.pos;
                this.pos = 1 + j2;
                if (UnsafeUtil.getByte(j2) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2;
            long j5 = this.pos;
            if (this.limit != j5) {
                long j6 = 1 + j5;
                byte b2 = UnsafeUtil.getByte(j5);
                if (b2 >= 0) {
                    this.pos = j6;
                    return b2;
                }
                if (this.limit - j6 >= 9) {
                    long j7 = 2 + j5;
                    int i3 = (UnsafeUtil.getByte(j6) << 7) ^ b2;
                    if (i3 >= 0) {
                        long j8 = 3 + j5;
                        int i4 = i3 ^ (UnsafeUtil.getByte(j7) << Ascii.SO);
                        if (i4 >= 0) {
                            j2 = i4 ^ 16256;
                            j7 = j8;
                        } else {
                            j7 = 4 + j5;
                            int i5 = i4 ^ (UnsafeUtil.getByte(j8) << Ascii.NAK);
                            if (i5 < 0) {
                                i2 = (-2080896) ^ i5;
                            } else {
                                long j9 = i5;
                                long j10 = 5 + j5;
                                long j11 = j9 ^ (((long) UnsafeUtil.getByte(j7)) << 28);
                                if (j11 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    j7 = 6 + j5;
                                    long j12 = j11 ^ (((long) UnsafeUtil.getByte(j10)) << 35);
                                    if (j12 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j10 = 7 + j5;
                                        j11 = j12 ^ (((long) UnsafeUtil.getByte(j7)) << 42);
                                        if (j11 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j5;
                                            j12 = j11 ^ (((long) UnsafeUtil.getByte(j10)) << 49);
                                            if (j12 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j13 = j5 + 9;
                                                long j14 = (j12 ^ (((long) UnsafeUtil.getByte(j7)) << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    long j15 = j5 + 10;
                                                    if (UnsafeUtil.getByte(j13) >= 0) {
                                                        j7 = j15;
                                                        j2 = j14;
                                                    }
                                                } else {
                                                    j2 = j14;
                                                    j7 = j13;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j12;
                                }
                                j2 = j4 ^ j11;
                                j7 = j10;
                            }
                        }
                        this.pos = j7;
                        return j2;
                    }
                    i2 = i3 ^ (-128);
                    j2 = i2;
                    this.pos = j7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 = (-1) - (((-1) - j2) & ((-1) - (((long) ((-1) - (((-1) - rawByte) | ((-1) - 127)))) << i2)));
                if ((rawByte & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j2;
            byte b2 = UnsafeUtil.getByte(j2);
            int i2 = (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - (((-1) - (((-1) - UnsafeUtil.getByte(1 + j2)) | ((-1) - 255))) << 8)));
            byte b3 = UnsafeUtil.getByte(2 + j2);
            return (((-1) - (((-1) - UnsafeUtil.getByte(j2 + 3)) | ((-1) - 255))) << 24) | i2 | (((b3 + 255) - (b3 | 255)) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j2;
            long j3 = (((long) UnsafeUtil.getByte(j2)) & 255) | ((((long) UnsafeUtil.getByte(1 + j2)) & 255) << 8);
            long j4 = ((-1) - (((-1) - ((long) UnsafeUtil.getByte(2 + j2))) | ((-1) - 255))) << 16;
            long j5 = UnsafeUtil.getByte(3 + j2);
            long j6 = (-1) - (((-1) - ((j3 + j4) - (j3 & j4))) & ((-1) - (((j5 + 255) - (j5 | 255)) << 24)));
            long j7 = UnsafeUtil.getByte(4 + j2);
            long j8 = ((-1) - (((-1) - ((-1) - (((-1) - j6) & ((-1) - (((j7 + 255) - (j7 | 255)) << 32))))) & ((-1) - (((-1) - (((-1) - ((long) UnsafeUtil.getByte(5 + j2))) | ((-1) - 255))) << 40)))) | (((-1) - (((-1) - ((long) UnsafeUtil.getByte(6 + j2))) | ((-1) - 255))) << 48);
            long j9 = UnsafeUtil.getByte(j2 + 7);
            long j10 = ((j9 + 255) - (j9 | 255)) << 56;
            return (j10 + j8) - (j10 & j8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j2 = this.pos;
            if (j2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j2;
            return UnsafeUtil.getByte(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 < 0 || i2 > remaining()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i2];
            long j2 = this.pos;
            long j3 = i2;
            slice(j2, j2 + j3).get(bArr);
            this.pos += j3;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i2) throws IOException {
            if (i2 >= 0 && i2 <= remaining()) {
                this.pos += (long) i2;
            } else {
                if (i2 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            long j2 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j2;
            int i2 = (int) (j2 - this.startPos);
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.limit = j2 - ((long) i4);
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private int bufferPos(long j2) {
            return (int) (j2 - this.address);
        }

        private ByteBuffer slice(long j2, long j3) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            try {
                try {
                    this.buffer.position(bufferPos(j2));
                    this.buffer.limit(bufferPos(j3));
                    return this.buffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.buffer.position(iPosition);
                this.buffer.limit(iLimit);
            }
        }
    }

    private static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z2) {
        }

        /* synthetic */ StreamDecoder(InputStream inputStream, int i2, AnonymousClass1 anonymousClass1) {
            this(inputStream, i2);
        }

        private StreamDecoder(InputStream inputStream, int i2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i2];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeRawVarint32(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= this.bufferSize - this.pos) {
                String str = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
                this.pos += rawVarint32;
                return str;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= this.bufferSize) {
                refillBuffer(rawVarint32);
                String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
                this.pos += rawVarint32;
                return str2;
            }
            return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (rawVarint32 <= i3 - i2 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i2 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                i2 = 0;
                if (rawVarint32 <= i3) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(rawBytesSlowPath, i2, rawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i2, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i2, MessageLite.Builder builder) throws IOException {
            readGroup(i2, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 > i2 - i3 || rawVarint32 <= 0) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                return readBytesSlowPath(rawVarint32);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i3, rawVarint32);
            this.pos += rawVarint32;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32);
                this.pos += rawVarint32;
                return bArrCopyOfRange;
            }
            return readRawBytesSlowPath(rawVarint32, false);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 > i2 - i3 || rawVarint32 <= 0) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32));
            this.pos += rawVarint32;
            return byteBufferWrap;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:71:0x0057, B:75:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r7 = this;
                int r5 = r7.pos
                int r1 = r7.bufferSize
                if (r1 != r5) goto Lc
            L6:
                long r1 = r7.readRawVarint64SlowPath()
                int r0 = (int) r1
                return r0
            Lc:
                byte[] r4 = r7.buffer
                int r3 = r5 + 1
                r2 = r4[r5]
                if (r2 < 0) goto L17
                r7.pos = r3
                return r2
            L17:
                int r1 = r1 - r3
                r0 = 9
                if (r1 >= r0) goto L1d
                goto L6
            L1d:
                int r1 = r5 + 2
                r0 = r4[r3]
                int r6 = r0 << 7
                r6 = r6 ^ r2
                if (r6 >= 0) goto L2b
                r0 = r6 ^ (-128(0xffffffffffffff80, float:NaN))
            L28:
                r7.pos = r1
                return r0
            L2b:
                int r3 = r5 + 3
                r0 = r4[r1]
                int r2 = r0 << 14
                r2 = r2 ^ r6
                if (r2 < 0) goto L38
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L36:
                r1 = r3
                goto L28
            L38:
                int r1 = r5 + 4
                r0 = r4[r3]
                int r0 = r0 << 21
                r2 = r2 ^ r0
                if (r2 >= 0) goto L46
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
            L45:
                goto L28
            L46:
                int r3 = r5 + 5
                r1 = r4[r1]
                int r0 = r1 << 28
                r2 = r2 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r0
                if (r1 >= 0) goto L74
                int r1 = r5 + 6
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 7
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 8
                r0 = r4[r3]
                if (r0 >= 0) goto L72
                int r3 = r5 + 9
                r0 = r4[r1]
                if (r0 >= 0) goto L74
                int r1 = r5 + 10
                r0 = r4[r3]
                if (r0 >= 0) goto L76
                goto L6
            L72:
                r0 = r2
                goto L45
            L74:
                r0 = r2
                goto L36
            L76:
                r0 = r2
                goto L28
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.buffer;
                int i3 = this.pos;
                this.pos = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.pos = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        j2 = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                        if (i8 >= 0) {
                            j2 = i8 ^ 16256;
                            i5 = i7;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                j2 = (-2080896) ^ i10;
                                i5 = i9;
                            } else {
                                i5 = i2 + 5;
                                long j5 = ((long) i10) ^ (((long) bArr[i9]) << 28);
                                if (j5 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i11 = i2 + 6;
                                    long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                    if (j6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i5 = i2 + 7;
                                        j5 = j6 ^ (((long) bArr[i11]) << 42);
                                        if (j5 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i11 = i2 + 8;
                                            j6 = j5 ^ (((long) bArr[i5]) << 49);
                                            if (j6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                j2 = (j6 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                                if (j2 < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i5] >= 0) {
                                                        i5 = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j2 = j6 ^ j3;
                                    i5 = i11;
                                }
                                j2 = j5 ^ j4;
                            }
                        }
                    }
                    this.pos = i5;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 = (-1) - (((-1) - j2) & ((-1) - (((long) ((-1) - (((-1) - rawByte) | ((-1) - 127)))) << i2)));
                if ((-1) - (((-1) - rawByte) | ((-1) - 128)) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 4) {
                refillBuffer(4);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            byte b2 = bArr[i2];
            byte b3 = bArr[i2 + 1];
            int i3 = ((b2 + 255) - (b2 | 255)) | (((b3 + 255) - (b3 | 255)) << 8);
            int i4 = (bArr[i2 + 2] & 255) << 16;
            return (-1) - (((-1) - (((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24)) & ((-1) - ((i3 + i4) - (i3 & i4))));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 8) {
                refillBuffer(8);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            long j2 = bArr[i2];
            long j3 = (j2 + 255) - (j2 | 255);
            long j4 = bArr[i2 + 1];
            long j5 = ((-1) - (((-1) - ((((-1) - (((-1) - j3) & ((-1) - (((j4 + 255) - (j4 | 255)) << 8)))) | (((-1) - (((-1) - ((long) bArr[i2 + 2])) | ((-1) - 255))) << 16)) | (((-1) - (((-1) - ((long) bArr[i2 + 3])) | ((-1) - 255))) << 24))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 32)))) | ((((long) bArr[i2 + 5]) & 255) << 40) | (((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48);
            long j6 = ((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56;
            return (j6 + j5) - (j6 & j5);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = i2 + this.totalBytesRetired + this.pos;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i3;
            recomputeBufferSizeAfterLimit();
            return i4;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i2;
            int i3 = this.totalBytesRetired + i2;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.bufferSizeAfterLimit = i5;
                this.bufferSize = i2 - i5;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - (this.totalBytesRetired + this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int i2) throws IOException {
            if (tryRefillBuffer(i2)) {
                return;
            }
            if (i2 > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        private boolean tryRefillBuffer(int i2) throws IOException {
            if (this.pos + i2 <= this.bufferSize) {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
            int i3 = this.sizeLimit;
            int i4 = this.totalBytesRetired;
            int i5 = this.pos;
            if (i2 > (i3 - i4) - i5 || i4 + i5 + i2 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i6 = this.pos;
            if (i6 > 0) {
                int i7 = this.bufferSize;
                if (i7 > i6) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                }
                this.totalBytesRetired += i6;
                this.bufferSize -= i6;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i8 = this.bufferSize;
            int i9 = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
            if (i9 == 0 || i9 < -1 || i9 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
            }
            if (i9 <= 0) {
                return false;
            }
            this.bufferSize += i9;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i2) {
                return true;
            }
            return tryRefillBuffer(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i2) throws IOException {
            int i3 = this.pos;
            if (i2 <= this.bufferSize - i3 && i2 > 0) {
                int i4 = i2 + i3;
                this.pos = i4;
                return Arrays.copyOfRange(this.buffer, i3, i4);
            }
            return readRawBytesSlowPath(i2, false);
        }

        private byte[] readRawBytesSlowPath(int i2, boolean z2) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i2);
            if (rawBytesSlowPathOneChunk != null) {
                return z2 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i3 = this.pos;
            int i4 = this.bufferSize;
            int length = i4 - i3;
            this.totalBytesRetired += i4;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, i3, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i2) throws IOException {
            if (i2 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = this.totalBytesRetired + this.pos + i2;
            if (i3 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes((i4 - this.totalBytesRetired) - this.pos);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i5 = this.bufferSize - this.pos;
            int i6 = i2 - i5;
            if (i6 >= 4096 && i6 > this.input.available()) {
                return null;
            }
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i5);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i5 < i2) {
                int i7 = this.input.read(bArr, i5, i2 - i5);
                if (i7 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i7;
                i5 += i7;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int iMin = Math.min(i2, 4096);
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int i4 = this.input.read(bArr, i3, iMin - i3);
                    if (i4 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i4;
                    i3 += i4;
                }
                i2 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private ByteString readBytesSlowPath(int i2) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i2);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i3 = this.pos;
            int i4 = this.bufferSize;
            int length = i4 - i3;
            this.totalBytesRetired += i4;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i2 - length);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.buffer, i3, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i2) throws IOException {
            int i3 = this.bufferSize;
            int i4 = this.pos;
            if (i2 <= i3 - i4 && i2 >= 0) {
                this.pos = i4 + i2;
            } else {
                skipRawBytesSlowPath(i2);
            }
        }

        private void skipRawBytesSlowPath(int i2) throws IOException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i3 = this.totalBytesRetired;
            int i4 = this.pos;
            int i5 = i3 + i4 + i2;
            int i6 = this.currentLimit;
            if (i5 > i6) {
                skipRawBytes((i6 - i3) - i4);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i7 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i3 + i4;
                int i8 = this.bufferSize - i4;
                this.bufferSize = 0;
                this.pos = 0;
                i7 = i8;
                while (i7 < i2) {
                    try {
                        long j2 = i2 - i7;
                        long jSkip = this.input.skip(j2);
                        if (jSkip < 0 || jSkip > j2) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i7 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i7;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i7 >= i2) {
                return;
            }
            int i9 = this.bufferSize;
            int i10 = i9 - this.pos;
            this.pos = i9;
            refillBuffer(1);
            while (true) {
                int i11 = i2 - i10;
                int i12 = this.bufferSize;
                if (i11 > i12) {
                    i10 += i12;
                    this.pos = i12;
                    refillBuffer(1);
                } else {
                    this.pos = i11;
                    return;
                }
            }
        }
    }

    private static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private boolean immutable;
        private Iterable<ByteBuffer> input;
        private Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        /* synthetic */ IterableDirectByteBufferDecoder(Iterable iterable, int i2, boolean z2, AnonymousClass1 anonymousClass1) {
            this(iterable, i2, z2);
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i2, boolean z2) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i2;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z2;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i2 == 0) {
                this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) == 0) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int i2) throws InvalidProtocolBufferException {
            if (this.lastTag != i2) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int i2, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i2);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i2), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeRawVarint32(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i2);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j4, bArr, 0L, j2);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j2;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j4 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j2;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(int i2, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i2, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i2, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i2, MessageLite.Builder builder) throws IOException {
            readGroup(i2, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                long j3 = this.currentByteBufferLimit;
                long j4 = this.currentByteBufferPos;
                if (j2 <= j3 - j4) {
                    if (this.immutable && this.enableAliasing) {
                        int i2 = (int) (j4 - this.currentAddress);
                        ByteString byteStringWrap = ByteString.wrap(slice(i2, rawVarint32 + i2));
                        this.currentByteBufferPos += j2;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j4, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                if (j2 <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j3 = this.currentByteBufferPos + j2;
                        this.currentByteBufferPos = j3;
                        long j4 = this.currentAddress;
                        return slice((int) ((j3 - j4) - j2), (int) (j3 - j4));
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return ByteBuffer.wrap(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0099 A[PHI: r3
  0x0099: PHI (r3v10 long) = (r3v9 long), (r3v12 long) binds: [B:71:0x0073, B:75:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() throws java.io.IOException {
            /*
                r13 = this;
                long r1 = r13.currentByteBufferPos
                long r3 = r13.currentByteBufferLimit
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto Le
            L8:
                long r1 = r13.readRawVarint64SlowPath()
                int r0 = (int) r1
                return r0
            Le:
                r3 = 1
                long r11 = r1 + r3
                byte r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1)
                if (r7 < 0) goto L1e
                long r0 = r13.currentByteBufferPos
                long r0 = r0 + r3
                r13.currentByteBufferPos = r0
                return r7
            L1e:
                long r5 = r13.currentByteBufferLimit
                long r3 = r13.currentByteBufferPos
                long r5 = r5 - r3
                r9 = 10
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 >= 0) goto L2a
                goto L8
            L2a:
                r3 = 2
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11)
                int r8 = r0 << 7
                r8 = r8 ^ r7
                if (r8 >= 0) goto L3b
                r0 = r8 ^ (-128(0xffffffffffffff80, float:NaN))
            L38:
                r13.currentByteBufferPos = r3
                return r0
            L3b:
                r6 = 3
                long r6 = r6 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                int r5 = r0 << 14
                r5 = r5 ^ r8
                if (r5 < 0) goto L4b
                r0 = r5 ^ 16256(0x3f80, float:2.278E-41)
            L49:
                r3 = r6
                goto L38
            L4b:
                r3 = 4
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 21
                r5 = r5 ^ r0
                if (r5 >= 0) goto L5c
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r5
            L5b:
                goto L38
            L5c:
                r6 = 5
                long r6 = r6 + r1
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                int r0 = r3 << 28
                r5 = r5 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r5 = r5 ^ r0
                if (r3 >= 0) goto L9b
                r3 = 6
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L99
                r6 = 7
                long r6 = r6 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L9b
                r3 = 8
                long r3 = r3 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L99
                r6 = 9
                long r6 = r6 + r1
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L9b
                long r1 = r1 + r9
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L9d
                goto L8
            L99:
                r0 = r5
                goto L5b
            L9b:
                r0 = r5
                goto L49
            L9d:
                r0 = r5
                r3 = r1
                goto L38
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.readRawVarint32():int");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws IOException {
            long j2;
            long j3;
            long j4;
            long j5 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j5) {
                long j6 = j5 + 1;
                byte b2 = UnsafeUtil.getByte(j5);
                if (b2 >= 0) {
                    this.currentByteBufferPos++;
                    return b2;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j7 = 2 + j5;
                    int i2 = (UnsafeUtil.getByte(j6) << 7) ^ b2;
                    if (i2 < 0) {
                        j2 = i2 ^ (-128);
                    } else {
                        long j8 = 3 + j5;
                        int i3 = (UnsafeUtil.getByte(j7) << Ascii.SO) ^ i2;
                        if (i3 >= 0) {
                            j2 = i3 ^ 16256;
                            j7 = j8;
                        } else {
                            j7 = 4 + j5;
                            int i4 = i3 ^ (UnsafeUtil.getByte(j8) << Ascii.NAK);
                            if (i4 < 0) {
                                j2 = (-2080896) ^ i4;
                            } else {
                                long j9 = 5 + j5;
                                long j10 = (((long) UnsafeUtil.getByte(j7)) << 28) ^ ((long) i4);
                                if (j10 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    j7 = 6 + j5;
                                    long j11 = j10 ^ (((long) UnsafeUtil.getByte(j9)) << 35);
                                    if (j11 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j9 = 7 + j5;
                                        j10 = j11 ^ (((long) UnsafeUtil.getByte(j7)) << 42);
                                        if (j10 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j5;
                                            j11 = j10 ^ (((long) UnsafeUtil.getByte(j9)) << 49);
                                            if (j11 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j5;
                                                long j12 = (j11 ^ (((long) UnsafeUtil.getByte(j7)) << 56)) ^ 71499008037633920L;
                                                if (j12 < 0) {
                                                    long j13 = j5 + 10;
                                                    if (UnsafeUtil.getByte(j9) >= 0) {
                                                        j2 = j12;
                                                        j7 = j13;
                                                    }
                                                } else {
                                                    j2 = j12;
                                                    j7 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j11;
                                }
                                j2 = j4 ^ j10;
                                j7 = j9;
                            }
                        }
                    }
                    this.currentByteBufferPos = j7;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 |= ((long) (127 & rawByte)) << i2;
                if ((rawByte + 128) - (rawByte | 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() >= 4) {
                long j2 = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j2;
                byte b2 = UnsafeUtil.getByte(j2);
                byte b3 = UnsafeUtil.getByte(1 + j2);
                int i2 = ((b2 + 255) - (b2 | 255)) | (((b3 + 255) - (b3 | 255)) << 8);
                byte b4 = UnsafeUtil.getByte(2 + j2);
                return (-1) - (((-1) - ((UnsafeUtil.getByte(j2 + 3) & 255) << 24)) & ((-1) - (i2 | (((b4 + 255) - (b4 | 255)) << 16))));
            }
            byte rawByte = readRawByte();
            byte rawByte2 = readRawByte();
            int i3 = ((rawByte + 255) - (rawByte | 255)) | (((rawByte2 + 255) - (rawByte2 | 255)) << 8);
            int rawByte3 = (readRawByte() & 255) << 16;
            int i4 = (i3 + rawByte3) - (i3 & rawByte3);
            byte rawByte4 = readRawByte();
            return (-1) - (((-1) - i4) & ((-1) - (((rawByte4 + 255) - (rawByte4 | 255)) << 24)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j2;
            byte rawByte;
            if (currentRemaining() >= 8) {
                long j3 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j3;
                long j4 = UnsafeUtil.getByte(j3);
                long j5 = ((j4 + 255) - (j4 | 255)) | ((((long) UnsafeUtil.getByte(1 + j3)) & 255) << 8);
                long j6 = UnsafeUtil.getByte(2 + j3);
                j2 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - j5) & ((-1) - (((j6 + 255) - (j6 | 255)) << 16)))) | ((((long) UnsafeUtil.getByte(3 + j3)) & 255) << 24))) & ((-1) - (((-1) - (((-1) - ((long) UnsafeUtil.getByte(4 + j3))) | ((-1) - 255))) << 32))))) & ((-1) - ((((long) UnsafeUtil.getByte(5 + j3)) & 255) << 40))))) & ((-1) - (((-1) - (((-1) - ((long) UnsafeUtil.getByte(6 + j3))) | ((-1) - 255))) << 48)));
                rawByte = UnsafeUtil.getByte(j3 + 7);
            } else {
                long rawByte2 = (-1) - (((-1) - ((long) readRawByte())) | ((-1) - 255));
                long rawByte3 = readRawByte();
                long j7 = rawByte2 | (((rawByte3 + 255) - (rawByte3 | 255)) << 8);
                long rawByte4 = (((long) readRawByte()) & 255) << 16;
                long rawByte5 = readRawByte();
                long j8 = ((j7 + rawByte4) - (j7 & rawByte4)) | (((rawByte5 + 255) - (rawByte5 | 255)) << 24);
                long rawByte6 = ((-1) - (((-1) - ((long) readRawByte())) | ((-1) - 255))) << 32;
                long j9 = (j8 + rawByte6) - (j8 & rawByte6);
                long rawByte7 = (((long) readRawByte()) & 255) << 40;
                long j10 = (j9 + rawByte7) - (j9 & rawByte7);
                long rawByte8 = readRawByte();
                long j11 = ((rawByte8 + 255) - (rawByte8 | 255)) << 48;
                j2 = (j10 + j11) - (j10 & j11);
                rawByte = readRawByte();
            }
            long j12 = rawByte;
            return (((j12 + 255) - (j12 | 255)) << 56) | j2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean z2) {
            this.enableAliasing = z2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int i2) throws InvalidProtocolBufferException {
            if (i2 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i2 + getTotalBytesRead();
            int i3 = this.currentLimit;
            if (totalBytesRead > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i2;
            int i3 = i2 - this.startOffset;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.bufferSizeAfterCurrentLimit = i5;
                this.totalBufferSize = i2 - i5;
                return;
            }
            this.bufferSizeAfterCurrentLimit = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int i2) {
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j2 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j2;
            return UnsafeUtil.getByte(j2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(int i2) throws IOException {
            if (i2 >= 0) {
                long j2 = i2;
                if (j2 <= currentRemaining()) {
                    byte[] bArr = new byte[i2];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return bArr;
                }
            }
            if (i2 >= 0 && i2 <= remaining()) {
                byte[] bArr2 = new byte[i2];
                readRawBytesTo(bArr2, 0, i2);
                return bArr2;
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i2 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private void readRawBytesTo(byte[] bArr, int i2, int i3) throws IOException {
            if (i3 < 0 || i3 > remaining()) {
                if (i3 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i3 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i4 = i3;
            while (i4 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i4, (int) currentRemaining());
                long j2 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i3 - i4) + i2, j2);
                i4 -= iMin;
                this.currentByteBufferPos += j2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(int i2) throws IOException {
            if (i2 < 0 || i2 > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i2 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            while (i2 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i2, (int) currentRemaining());
                i2 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
        }

        private void skipRawVarint() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private ByteBuffer slice(int i2, int i3) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            try {
                try {
                    this.currentByteBuffer.position(i2);
                    this.currentByteBuffer.limit(i3);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                this.currentByteBuffer.position(iPosition);
                this.currentByteBuffer.limit(iLimit);
            }
        }
    }
}
