package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.protobuf.MessageLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int groupDepth;
    int messageDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

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

        private ArrayDecoder(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            this.limit = len + offset;
            this.pos = offset;
            this.startPos = offset;
            this.immutable = immutable;
        }

        /* synthetic */ ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2, AnonymousClass1 anonymousClass1) {
            this(bArr, i2, i3, z2);
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i2;
            int i3 = i2 - this.startPos;
            int i4 = this.currentLimit;
            if (i3 <= i4) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i5 = i3 - i4;
            this.bufferSizeAfterLimit = i5;
            this.limit = i2 - i5;
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

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i3, rawVarint32).slice();
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

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (rawVarint32 <= i2 - i3) {
                    ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i3, rawVarint32) : ByteString.copyFrom(this.buffer, i3, rawVarint32);
                    this.pos += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            int i2 = this.pos;
            if (i2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (length <= i2 - i3) {
                    int i4 = length + i3;
                    this.pos = i4;
                    return Arrays.copyOfRange(this.buffer, i3, i4);
                }
            }
            if (length > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            int i3 = (-1) - (((-1) - (bArr[i2] & 255)) & ((-1) - (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 8)));
            byte b2 = bArr[i2 + 2];
            int i4 = ((b2 + 255) - (b2 | 255)) << 16;
            return (-1) - (((-1) - ((bArr[i2 + 3] & 255) << 24)) & ((-1) - ((i3 + i4) - (i3 & i4))));
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.limit - i2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255)))) & ((-1) - ((((long) bArr[i2 + 1]) & 255) << 8)));
            long j3 = (((long) bArr[i2 + 2]) & 255) << 16;
            long j4 = (j2 + j3) - (j2 & j3);
            long j5 = (((long) bArr[i2 + 3]) & 255) << 24;
            long j6 = (-1) - (((-1) - ((j4 + j5) - (j4 & j5))) & ((-1) - ((((long) bArr[i2 + 4]) & 255) << 32)));
            long j7 = ((-1) - (((-1) - ((long) bArr[i2 + 5])) | ((-1) - 255))) << 40;
            long j8 = bArr[i2 + 6];
            return (-1) - (((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56)) & ((-1) - (((j6 + j7) - (j6 & j7)) | (((j8 + 255) - (j8 | 255)) << 48))));
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:71:0x0057, B:75:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.protobuf.CodedInputStream
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 = (-1) - (((-1) - j2) & ((-1) - (((long) ((rawByte + 127) - (127 | rawByte))) << i2)));
                if ((rawByte + 128) - (rawByte | 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
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
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            output.writeUInt32NoTag(tag);
            output.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (length <= i2 - i3) {
                    this.pos = i3 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
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
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = size;
            this.input = inputBufs;
            this.iterator = inputBufs.iterator();
            this.immutable = immutableFlag;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (size != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        /* synthetic */ IterableDirectByteBufferDecoder(Iterable iterable, int i2, boolean z2, AnonymousClass1 anonymousClass1) {
            this(iterable, i2, z2);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (length != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i2 = length;
            while (i2 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i2, (int) currentRemaining());
                long j2 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bytes, (length - i2) + offset, j2);
                i2 -= iMin;
                this.currentByteBufferPos += j2;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i2;
            int i3 = i2 - this.startOffset;
            int i4 = this.currentLimit;
            if (i3 <= i4) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i5 = i3 - i4;
            this.bufferSizeAfterCurrentLimit = i5;
            this.totalBufferSize = i2 - i5;
        }

        private int remaining() {
            return (int) ((((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws IOException {
            for (int i2 = 0; i2 < 10; i2++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int begin, int end) throws IOException {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
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

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.totalBytesRead - this.startOffset)) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j2 = rawVarint32;
                if (j2 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                        this.currentByteBufferPos += j2;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j3 = this.currentByteBufferPos + j2;
                    this.currentByteBufferPos = j3;
                    long j4 = this.currentAddress;
                    return slice((int) ((j3 - j4) - j2), (int) (j3 - j4));
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

        @Override // com.google.protobuf.CodedInputStream
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
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i3 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(ByteString.wrap(slice(i3, i3 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j2 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j2;
            return UnsafeUtil.getByte(j2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length >= 0) {
                long j2 = length;
                if (j2 <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j2);
                    this.currentByteBufferPos += j2;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            if (currentRemaining() < 4) {
                byte rawByte = readRawByte();
                int rawByte2 = ((-1) - (((-1) - ((rawByte + 255) - (rawByte | 255))) & ((-1) - (((-1) - (((-1) - readRawByte()) | ((-1) - 255))) << 8)))) | (((-1) - (((-1) - readRawByte()) | ((-1) - 255))) << 16);
                int rawByte3 = ((-1) - (((-1) - readRawByte()) | ((-1) - 255))) << 24;
                return (rawByte2 + rawByte3) - (rawByte2 & rawByte3);
            }
            long j2 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j2;
            byte b2 = UnsafeUtil.getByte(j2);
            int i2 = (b2 + 255) - (b2 | 255);
            byte b3 = UnsafeUtil.getByte(1 + j2);
            int i3 = ((b3 + 255) - (b3 | 255)) << 8;
            return (((-1) - (((-1) - UnsafeUtil.getByte(j2 + 3)) | ((-1) - 255))) << 24) | ((i2 + i3) - (i2 & i3)) | ((UnsafeUtil.getByte(2 + j2) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j2 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j2;
                long j3 = ((long) UnsafeUtil.getByte(j2)) & 255;
                long j4 = UnsafeUtil.getByte(1 + j2);
                long j5 = ((-1) - (((-1) - j3) & ((-1) - (((j4 + 255) - (j4 | 255)) << 8)))) | (((-1) - (((-1) - ((long) UnsafeUtil.getByte(2 + j2))) | ((-1) - 255))) << 16) | ((((long) UnsafeUtil.getByte(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.getByte(4 + j2)) & 255) << 32);
                long j6 = UnsafeUtil.getByte(5 + j2);
                long j7 = ((j6 + 255) - (j6 | 255)) << 40;
                long j8 = (j5 + j7) - (j5 & j7);
                long j9 = UnsafeUtil.getByte(6 + j2);
                rawByte = j8 | (((j9 + 255) - (j9 | 255)) << 48);
                rawByte2 = UnsafeUtil.getByte(j2 + 7);
            } else {
                long rawByte3 = readRawByte();
                long rawByte4 = readRawByte();
                long j10 = ((rawByte3 + 255) - (rawByte3 | 255)) | (((rawByte4 + 255) - (rawByte4 | 255)) << 8);
                long rawByte5 = (((long) readRawByte()) & 255) << 16;
                long rawByte6 = (-1) - (((-1) - ((j10 + rawByte5) - (j10 & rawByte5))) & ((-1) - (((-1) - (((-1) - ((long) readRawByte())) | ((-1) - 255))) << 24)));
                long rawByte7 = ((-1) - (((-1) - ((long) readRawByte())) | ((-1) - 255))) << 32;
                long rawByte8 = readRawByte();
                rawByte = ((-1) - (((-1) - ((rawByte6 + rawByte7) - (rawByte6 & rawByte7))) & ((-1) - (((rawByte8 + 255) - (rawByte8 | 255)) << 40)))) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return (((-1) - (((-1) - ((long) rawByte2)) | ((-1) - 255))) << 56) | rawByte;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0099 A[PHI: r3
  0x0099: PHI (r3v10 long) = (r3v9 long), (r3v12 long) binds: [B:71:0x0073, B:75:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.protobuf.CodedInputStream
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
                byte r7 = com.google.protobuf.UnsafeUtil.getByte(r1)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r11)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
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
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                int r0 = r3 << 28
                r5 = r5 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r5 = r5 ^ r0
                if (r3 >= 0) goto L9b
                r3 = 6
                long r3 = r3 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L99
                r6 = 7
                long r6 = r6 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L9b
                r3 = 8
                long r3 = r3 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L99
                r6 = 9
                long r6 = r6 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L9b
                long r1 = r1 + r9
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                long j3 = ((long) ((rawByte + 127) - (127 | rawByte))) << i2;
                j2 = (j2 + j3) - (j2 & j3);
                if ((-1) - (((-1) - rawByte) | ((-1) - 128)) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
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
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            output.writeUInt32NoTag(tag);
            output.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.totalBufferSize - this.totalBytesRead)) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (length >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(length, (int) currentRemaining());
                length -= iMin;
                this.currentByteBufferPos += (long) iMin;
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

        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private StreamDecoder(final InputStream input, int bufferSize) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(input, "input");
            this.input = input;
            this.buffer = new byte[bufferSize];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        /* synthetic */ StreamDecoder(InputStream inputStream, int i2, AnonymousClass1 anonymousClass1) {
            this(inputStream, i2);
        }

        private static int available(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        private static int read(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        private ByteString readBytesSlowPath(final int size) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (rawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int length = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, i2, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws IOException {
            if (size == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (size < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos + size;
            if (i2 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i3 = this.currentLimit;
            if (i2 > i3) {
                skipRawBytes((i3 - this.totalBytesRetired) - this.pos);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i4 = this.bufferSize - this.pos;
            int i5 = size - i4;
            if (i5 >= 4096 && i5 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i4 < size) {
                int i6 = read(this.input, bArr, i4, size - i4);
                if (i6 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i6;
                i4 += i6;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int sizeLeft) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (sizeLeft > 0) {
                int iMin = Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.input.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i3;
                    i2 += i3;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i2 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i2;
            int i3 = this.totalBytesRetired + i2;
            int i4 = this.currentLimit;
            if (i3 <= i4) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i5 = i3 - i4;
            this.bufferSizeAfterLimit = i5;
            this.bufferSize = i2 - i5;
        }

        private void refillBuffer(int n2) throws IOException {
            if (tryRefillBuffer(n2)) {
                return;
            }
            if (n2 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (InvalidProtocolBufferException e2) {
                e2.setThrownFromInputStream();
                throw e2;
            }
        }

        private void skipRawBytesSlowPath(final int size) throws IOException {
            if (size < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            int i4 = i2 + i3 + size;
            int i5 = this.currentLimit;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i2 + i3;
                int i7 = this.bufferSize - i3;
                this.bufferSize = 0;
                this.pos = 0;
                i6 = i7;
                while (i6 < size) {
                    try {
                        long j2 = size - i6;
                        long jSkip = skip(this.input, j2);
                        if (jSkip < 0 || jSkip > j2) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i6 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i6;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i6 >= size) {
                return;
            }
            int i8 = this.bufferSize;
            int i9 = i8 - this.pos;
            this.pos = i8;
            refillBuffer(1);
            while (true) {
                int i10 = size - i9;
                int i11 = this.bufferSize;
                if (i10 <= i11) {
                    this.pos = i10;
                    return;
                } else {
                    i9 += i11;
                    this.pos = i11;
                    refillBuffer(1);
                }
            }
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

        private boolean tryRefillBuffer(int n2) throws IOException {
            if (this.pos + n2 <= this.bufferSize) {
                throw new IllegalStateException("refillBuffer() called when " + n2 + " bytes were already available in buffer");
            }
            int i2 = this.sizeLimit;
            int i3 = this.totalBytesRetired;
            int i4 = this.pos;
            if (n2 > (i2 - i3) - i4 || i3 + i4 + n2 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i5 = this.pos;
            if (i5 > 0) {
                int i6 = this.bufferSize;
                if (i6 > i5) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                }
                this.totalBytesRetired += i5;
                this.bufferSize -= i5;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i7 = this.bufferSize;
            int i8 = read(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
            if (i8 == 0 || i8 < -1 || i8 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.bufferSize += i8;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= n2) {
                return true;
            }
            return tryRefillBuffer(n2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = byteLimit + this.totalBytesRetired + this.pos;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i3 = this.currentLimit;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 > i2 - i3 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return readRawBytesSlowPath(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i3, i3 + rawVarint32));
                this.pos += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (rawVarint32 <= i2 - i3 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i3, rawVarint32);
                this.pos += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return readBytesSlowPath(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.pos;
            this.pos = i2 + 1;
            return bArr[i2];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int size) throws IOException {
            int i2 = this.pos;
            if (size > this.bufferSize - i2 || size <= 0) {
                return readRawBytesSlowPath(size, false);
            }
            int i3 = size + i2;
            this.pos = i3;
            return Arrays.copyOfRange(this.buffer, i2, i3);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 4) {
                refillBuffer(4);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 4;
            byte b2 = bArr[i2];
            int i3 = (b2 + 255) - (b2 | 255);
            byte b3 = bArr[i2 + 1];
            int i4 = ((b3 + 255) - (b3 | 255)) << 8;
            return (((-1) - (((-1) - bArr[i2 + 3]) | ((-1) - 255))) << 24) | ((-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - (((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 16))));
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            int i2 = this.pos;
            if (this.bufferSize - i2 < 8) {
                refillBuffer(8);
                i2 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i2 + 8;
            long j2 = (-1) - (((-1) - (((long) bArr[i2]) & 255)) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 1])) | ((-1) - 255))) << 8)));
            long j3 = bArr[i2 + 2];
            long j4 = ((j3 + 255) - (j3 | 255)) << 16;
            long j5 = bArr[i2 + 3];
            long j6 = (-1) - (((-1) - ((-1) - (((-1) - ((j2 + j4) - (j2 & j4))) & ((-1) - (((j5 + 255) - (j5 | 255)) << 24))))) & ((-1) - (((-1) - (((-1) - ((long) bArr[i2 + 4])) | ((-1) - 255))) << 32)));
            long j7 = bArr[i2 + 5];
            long j8 = (-1) - (((-1) - j6) & ((-1) - (((j7 + 255) - (j7 | 255)) << 40)));
            long j9 = ((-1) - (((-1) - ((long) bArr[i2 + 6])) | ((-1) - 255))) << 48;
            long j10 = bArr[i2 + 7];
            return (-1) - (((-1) - (((j10 + 255) - (j10 | 255)) << 56)) & ((-1) - ((j8 + j9) - (j8 & j9))));
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0072 A[PHI: r1
  0x0072: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:71:0x0057, B:75:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.protobuf.CodedInputStream
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws IOException {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte rawByte = readRawByte();
                j2 = (-1) - (((-1) - j2) & ((-1) - (((long) (127 & rawByte)) << i2)));
                if ((rawByte + 128) - (rawByte | 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
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
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
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
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
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

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
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
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            output.writeUInt32NoTag(tag);
            output.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int size) throws IOException {
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (size > i2 - i3 || size < 0) {
                skipRawBytesSlowPath(size);
            } else {
                this.pos = i3 + size;
            }
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

        private UnsafeDirectNioDecoder(ByteBuffer buffer, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer.duplicate();
            long jAddressOffset = UnsafeUtil.addressOffset(buffer);
            this.address = jAddressOffset;
            this.limit = ((long) buffer.limit()) + jAddressOffset;
            long jPosition = jAddressOffset + ((long) buffer.position());
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = immutable;
        }

        /* synthetic */ UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2, AnonymousClass1 anonymousClass1) {
            this(byteBuffer, z2);
        }

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j2 = this.limit + ((long) this.bufferSizeAfterLimit);
            this.limit = j2;
            int i2 = (int) (j2 - this.startPos);
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i4 = i2 - i3;
            this.bufferSizeAfterLimit = i4;
            this.limit = j2 - ((long) i4);
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
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

        private ByteBuffer slice(long begin, long end) throws IOException {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    return this.buffer.slice();
                } catch (IllegalArgumentException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e2);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i2 = this.currentLimit;
            if (i2 == Integer.MAX_VALUE) {
                return -1;
            }
            return i2 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
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
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j2 = rawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j2);
                this.pos += j2;
                return ByteBuffer.wrap(bArr);
            }
            long j3 = this.pos;
            long j4 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j3, j3 + j4);
            this.pos += j4;
            return byteBufferSlice;
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            checkRecursionLimit();
            this.groupDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(WireFormat.makeTag(fieldNumber, 4));
            this.groupDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
            return partialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.messageDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.messageDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws IOException {
            long j2 = this.pos;
            if (j2 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j2;
            return UnsafeUtil.getByte(j2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (length == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[length];
            long j2 = this.pos;
            long j3 = length;
            slice(j2, j2 + j3).get(bArr);
            this.pos += j3;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j2;
            int i2 = UnsafeUtil.getByte(j2) & 255;
            byte b2 = UnsafeUtil.getByte(1 + j2);
            return ((UnsafeUtil.getByte(j2 + 3) & 255) << 24) | ((-1) - (((-1) - ((-1) - (((-1) - i2) & ((-1) - (((b2 + 255) - (b2 | 255)) << 8))))) & ((-1) - (((-1) - (((-1) - UnsafeUtil.getByte(2 + j2)) | ((-1) - 255))) << 16))));
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws IOException {
            long j2 = this.pos;
            if (this.limit - j2 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j2;
            long j3 = (-1) - (((-1) - (((long) UnsafeUtil.getByte(j2)) & 255)) & ((-1) - (((-1) - (((-1) - ((long) UnsafeUtil.getByte(1 + j2))) | ((-1) - 255))) << 8)));
            long j4 = UnsafeUtil.getByte(2 + j2);
            long j5 = (-1) - (((-1) - j3) & ((-1) - (((j4 + 255) - (j4 | 255)) << 16)));
            long j6 = ((-1) - (((-1) - ((long) UnsafeUtil.getByte(3 + j2))) | ((-1) - 255))) << 24;
            long j7 = (j5 + j6) - (j5 & j6);
            long j8 = ((-1) - (((-1) - ((long) UnsafeUtil.getByte(4 + j2))) | ((-1) - 255))) << 32;
            long j9 = (-1) - (((-1) - ((j7 + j8) - (j7 & j8))) & ((-1) - ((((long) UnsafeUtil.getByte(5 + j2)) & 255) << 40)));
            long j10 = UnsafeUtil.getByte(6 + j2);
            long j11 = ((j10 + 255) - (j10 | 255)) << 48;
            long j12 = (j9 + j11) - (j9 & j11);
            long j13 = UnsafeUtil.getByte(j2 + 7);
            long j14 = ((j13 + 255) - (j13 | 255)) << 56;
            return (j14 + j12) - (j14 & j12);
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x0090, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r6) < 0) goto L44;
         */
        @Override // com.google.protobuf.CodedInputStream
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
                byte r7 = com.google.protobuf.UnsafeUtil.getByte(r1)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r5)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
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
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                int r0 = r0 << 21
                r5 = r5 ^ r0
                if (r5 >= 0) goto L56
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r5
                goto L32
            L56:
                r6 = 5
                long r6 = r6 + r1
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r3)
                int r0 = r3 << 28
                r5 = r5 ^ r0
                r0 = 266354560(0xfe03f80, float:2.2112565E-29)
                r5 = r5 ^ r0
                if (r3 >= 0) goto L94
                r3 = 6
                long r3 = r3 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                r6 = 7
                long r6 = r6 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
                r3 = 8
                long r3 = r3 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                long r6 = r1 + r8
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
                r3 = 10
                long r3 = r3 + r1
                byte r0 = com.google.protobuf.UnsafeUtil.getByte(r6)
                if (r0 >= 0) goto L96
                goto L8
            L94:
                r0 = r5
                goto L43
            L96:
                r0 = r5
                goto L32
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() throws IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() throws IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
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

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException {
            readGroup(fieldNumber, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
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
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(final int tag, final CodedOutputStream output) throws IOException {
            int tagWireType = WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long int64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(iMakeTag);
                output.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                checkValidEndTag();
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int rawLittleEndian32 = readRawLittleEndian32();
            output.writeUInt32NoTag(tag);
            output.writeFixed32NoTag(rawLittleEndian32);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws IOException {
            if (length >= 0 && length <= remaining()) {
                this.pos += (long) length;
            } else {
                if (length >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    /* synthetic */ CodedInputStream(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static int decodeZigZag32(final int n2) {
        return (-(n2 & 1)) ^ (n2 >>> 1);
    }

    public static long decodeZigZag64(final long n2) {
        return (-((-1) - (((-1) - n2) | ((-1) - 1)))) ^ (n2 >>> 1);
    }

    public static CodedInputStream newInstance(final InputStream input) {
        return newInstance(input, 4096);
    }

    public static CodedInputStream newInstance(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new StreamDecoder(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(final Iterable<ByteBuffer> input) {
        return !UnsafeDirectNioDecoder.isSupported() ? newInstance(new IterableByteBufferInputStream(input)) : newInstance(input, false);
    }

    static CodedInputStream newInstance(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? (-1) - (((-1) - i2) & ((-1) - 1)) : byteBuffer.isDirect() ? (-1) - (((-1) - i2) & ((-1) - 2)) : i2 | 4;
        }
        return i2 == 2 ? new IterableDirectByteBufferDecoder(bufs, iRemaining, bufferIsImmutable) : newInstance(new IterableByteBufferInputStream(bufs));
    }

    public static CodedInputStream newInstance(ByteBuffer buf) {
        return newInstance(buf, false);
    }

    static CodedInputStream newInstance(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return newInstance(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }

    public static CodedInputStream newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static CodedInputStream newInstance(final byte[] buf, final int off, final int len) {
        return newInstance(buf, off, len, false);
    }

    static CodedInputStream newInstance(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(buf, off, len, bufferIsImmutable);
        try {
            arrayDecoder.pushLimit(len);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int readRawVarint32(final int firstByte, final InputStream input) throws IOException {
        if ((-1) - (((-1) - firstByte) | ((-1) - 128)) == 0) {
            return firstByte;
        }
        int i2 = (-1) - (((-1) - firstByte) | ((-1) - 127));
        int i3 = 7;
        while (i3 < 32) {
            int i4 = input.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i5 = (i4 & 127) << i3;
            i2 = (i2 + i5) - (i2 & i5);
            if ((-1) - (((-1) - i4) | ((-1) - 128)) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i6 = input.read();
            if (i6 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i6 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(final InputStream input) throws IOException {
        int i2 = input.read();
        if (i2 != -1) {
            return readRawVarint32(i2, input);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public abstract void checkLastTagWas(final int value) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.messageDepth + this.groupDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public void checkValidEndTag() throws InvalidProtocolBufferException {
        if (this.groupDepth == 0) {
            checkLastTagWas(0);
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean enabled);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(final int fieldNumber, final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract void readGroup(final int fieldNumber, final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(final Parser<T> parser, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract void readMessage(final MessageLite.Builder builder, final ExtensionRegistryLite extensionRegistry) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(final int size) throws IOException;

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
    public abstract void readUnknownGroup(final int fieldNumber, final MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(final int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + limit);
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = limit;
        return i2;
    }

    public final int setSizeLimit(final int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + limit);
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = limit;
        return i2;
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(final int tag) throws IOException;

    @Deprecated
    public abstract boolean skipField(final int tag, final CodedOutputStream output) throws IOException;

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.groupDepth++;
            this.groupDepth--;
        } while (skipField(tag));
    }

    public void skipMessage(CodedOutputStream output) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.groupDepth++;
            this.groupDepth--;
        } while (skipField(tag, output));
    }

    public abstract void skipRawBytes(final int size) throws IOException;

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }
}
