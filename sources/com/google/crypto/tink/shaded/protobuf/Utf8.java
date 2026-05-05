package com.google.crypto.tink.shaded.protobuf;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    private static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || (((byte1 << Ascii.FS) + (byte2 + 112)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int i2 = (byte1 & 7) << 18;
            int iTrailingByteValue = trailingByteValue(byte2) << 12;
            int iTrailingByteValue2 = ((i2 + iTrailingByteValue) - (i2 & iTrailingByteValue)) | (trailingByteValue(byte3) << 6);
            int iTrailingByteValue3 = trailingByteValue(byte4);
            int i3 = (iTrailingByteValue2 + iTrailingByteValue3) - (iTrailingByteValue2 & iTrailingByteValue3);
            resultArr[resultPos] = highSurrogate(i3);
            resultArr[resultPos + 1] = lowSurrogate(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int i2 = ((-1) - (((-1) - byte1) | ((-1) - 15))) << 12;
            int iTrailingByteValue = trailingByteValue(byte2) << 6;
            resultArr[resultPos] = (char) ((-1) - (((-1) - ((i2 + iTrailingByteValue) - (i2 & iTrailingByteValue))) & ((-1) - trailingByteValue(byte3))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & Ascii.US) << 6) | trailingByteValue(byte2));
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b2) {
            return (b2 + okio.Utf8.REPLACEMENT_BYTE) - (b2 | okio.Utf8.REPLACEMENT_BYTE);
        }
    }

    static abstract class Processor {
        Processor() {
        }

        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int iEstimateConsecutiveAscii = index + Utf8.estimateConsecutiveAscii(buffer, index, limit);
            while (iEstimateConsecutiveAscii < limit) {
                int i2 = iEstimateConsecutiveAscii + 1;
                byte b2 = buffer.get(iEstimateConsecutiveAscii);
                if (b2 >= 0) {
                    iEstimateConsecutiveAscii = i2;
                } else if (b2 < -32) {
                    if (i2 >= limit) {
                        return b2;
                    }
                    if (b2 < -62 || buffer.get(i2) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b2 >= -16) {
                        if (i2 >= limit - 2) {
                            return Utf8.incompleteStateFor(buffer, b2, i2, limit - i2);
                        }
                        int i3 = iEstimateConsecutiveAscii + 2;
                        byte b3 = buffer.get(i2);
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i4 = iEstimateConsecutiveAscii + 3;
                            if (buffer.get(i3) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (buffer.get(i4) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i2 >= limit - 1) {
                        return Utf8.incompleteStateFor(buffer, b2, i2, limit - i2);
                    }
                    int i5 = iEstimateConsecutiveAscii + 2;
                    byte b4 = buffer.get(i2);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || buffer.get(i5) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        final String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? decodeUtf8Direct(buffer, index, size) : decodeUtf8Default(buffer, index, size);
        }

        abstract String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException;

        final String decodeUtf8Default(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i2 = index + size;
            char[] cArr = new char[size];
            int i3 = 0;
            while (index < i2) {
                byte b2 = buffer.get(index);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            while (index < i2) {
                int i4 = index + 1;
                byte b3 = buffer.get(index);
                if (DecodeUtil.isOneByte(b3)) {
                    int i5 = i3 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i3);
                    while (i4 < i2) {
                        byte b4 = buffer.get(i4);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i4++;
                        DecodeUtil.handleOneByte(b4, cArr, i5);
                        i5++;
                    }
                    i3 = i5;
                    index = i4;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i4 >= i2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b3, buffer.get(i4), cArr, i3);
                    i3++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i4 >= i2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i6 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b3, buffer.get(i4), buffer.get(i6), cArr, i3);
                    i3++;
                } else {
                    if (i4 >= i2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = buffer.get(i4);
                    int i7 = index + 3;
                    byte b6 = buffer.get(index + 2);
                    index += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, buffer.get(i7), cArr, i3);
                    i3 += 2;
                }
            }
            return new String(cArr, 0, i3);
        }

        abstract String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence in, byte[] out, int offset, int length);

        final void encodeUtf8(CharSequence in, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                out.position(Utf8.encode(in, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in, out);
            } else {
                encodeUtf8Default(in, out);
            }
        }

        final void encodeUtf8Default(CharSequence in, ByteBuffer out) {
            int i2;
            int i3;
            int length = in.length();
            int iPosition = out.position();
            int i4 = 0;
            while (i4 < length) {
                try {
                    char cCharAt = in.charAt(i4);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i4, (byte) cCharAt);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i4) + " at index " + (out.position() + Math.max(i4, (iPosition - out.position()) + 1)));
                }
            }
            if (i4 == length) {
                out.position(iPosition + i4);
                return;
            }
            iPosition += i4;
            while (i4 < length) {
                char cCharAt2 = in.charAt(i4);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    i2 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 192))));
                        out.put(i2, (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128))));
                        iPosition = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i4) + " at index " + (out.position() + Math.max(i4, (iPosition - out.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        i2 = i4 + 1;
                        if (i2 != length) {
                            try {
                                char cCharAt3 = in.charAt(i2);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i5 = iPosition + 1;
                                    try {
                                        out.put(iPosition, (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240))));
                                        i3 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i5;
                                        i4 = i2;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i4) + " at index " + (out.position() + Math.max(i4, (iPosition - out.position()) + 1)));
                                    }
                                    try {
                                        out.put(i5, (byte) (((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63))) | 128));
                                        iPosition += 3;
                                        int i6 = (-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63));
                                        out.put(i3, (byte) ((i6 + 128) - (i6 & 128)));
                                        out.put(iPosition, (byte) ((-1) - (((-1) - ((codePoint + 63) - (codePoint | 63))) & ((-1) - 128))));
                                        i4 = i2;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i4 = i2;
                                        iPosition = i3;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(i4) + " at index " + (out.position() + Math.max(i4, (iPosition - out.position()) + 1)));
                                    }
                                } else {
                                    i4 = i2;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    i2 = iPosition + 1;
                    int i7 = cCharAt2 >>> '\f';
                    out.put(iPosition, (byte) ((i7 + CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) - (i7 & CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)));
                    iPosition += 2;
                    out.put(i2, (byte) (((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63))) | 128));
                    out.put(iPosition, (byte) ((-1) - (((-1) - ((cCharAt2 + '?') - (cCharAt2 | '?'))) & ((-1) - 128))));
                }
                i4++;
                iPosition++;
            }
            out.position(iPosition);
        }

        abstract void encodeUtf8Direct(CharSequence in, ByteBuffer out);

        final boolean isValidUtf8(ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        final int partialIsValidUtf8(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? partialIsValidUtf8Direct(state, buffer, index, limit) : partialIsValidUtf8Default(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return partialIsValidUtf8(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r10.get(r11) > (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        
            if (r10.get(r11) > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0085, code lost:
        
            if (r10.get(r3) > (-65)) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int partialIsValidUtf8Default(final int r9, final java.nio.ByteBuffer r10, int r11, final int r12) {
            /*
                r8 = this;
                if (r9 == 0) goto L89
                if (r11 < r12) goto L5
                return r9
            L5:
                byte r6 = (byte) r9
                r3 = -32
                r7 = -1
                r5 = -65
                if (r6 >= r3) goto L1a
                r0 = -62
                if (r6 < r0) goto L19
                int r1 = r11 + 1
                byte r0 = r10.get(r11)
                if (r0 <= r5) goto L88
            L19:
                return r7
            L1a:
                r0 = -16
                if (r6 >= r0) goto L49
                int r0 = r9 >> 8
                int r0 = ~r0
                byte r2 = (byte) r0
                if (r2 != 0) goto L32
                int r0 = r11 + 1
                byte r2 = r10.get(r11)
                if (r0 < r12) goto L31
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r2)
                return r0
            L31:
                r11 = r0
            L32:
                if (r2 > r5) goto L48
                r1 = -96
                if (r6 != r3) goto L3a
                if (r2 < r1) goto L48
            L3a:
                r0 = -19
                if (r6 != r0) goto L40
                if (r2 >= r1) goto L48
            L40:
                int r1 = r11 + 1
                byte r0 = r10.get(r11)
                if (r0 <= r5) goto L88
            L48:
                return r7
            L49:
                int r0 = r9 >> 8
                int r0 = ~r0
                byte r4 = (byte) r0
                if (r4 != 0) goto L5c
                int r3 = r11 + 1
                byte r4 = r10.get(r11)
                if (r3 < r12) goto L61
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r4)
                return r0
            L5c:
                int r0 = r9 >> 16
                byte r2 = (byte) r0
                r3 = r11
                goto L62
            L61:
                r2 = 0
            L62:
                if (r2 != 0) goto L72
                int r0 = r3 + 1
                byte r2 = r10.get(r3)
                if (r0 < r12) goto L71
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r6, r4, r2)
                return r0
            L71:
                r3 = r0
            L72:
                if (r4 > r5) goto L87
                int r1 = r6 << 28
                int r0 = r4 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L87
                if (r2 > r5) goto L87
                int r11 = r3 + 1
                byte r0 = r10.get(r3)
                if (r0 <= r5) goto L89
            L87:
                return r7
            L88:
                r11 = r1
            L89:
                int r0 = partialIsValidUtf8(r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int partialIsValidUtf8Direct(final int state, final ByteBuffer buffer, int index, final int limit);
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i2 = index + 1;
                byte b2 = bytes[index];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i2 >= limit) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            index += 2;
                            if (bytes[i2] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i2 >= limit - 2) {
                            return Utf8.incompleteStateFor(bytes, i2, limit);
                        }
                        int i3 = index + 2;
                        byte b3 = bytes[i2];
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i4 = index + 3;
                            if (bytes[i3] <= -65) {
                                index += 4;
                                if (bytes[i4] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i2 >= limit - 1) {
                        return Utf8.incompleteStateFor(bytes, i2, limit);
                    }
                    int i5 = index + 2;
                    byte b4 = bytes[i2];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        index += 3;
                        if (bytes[i5] > -65) {
                        }
                    }
                    return -1;
                }
                index = i2;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((((-1) - (((-1) - index) & ((-1) - size))) | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i2 = index + size;
            char[] cArr = new char[size];
            int i3 = 0;
            while (index < i2) {
                byte b2 = bytes[index];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                index++;
                DecodeUtil.handleOneByte(b2, cArr, i3);
                i3++;
            }
            while (index < i2) {
                int i4 = index + 1;
                byte b3 = bytes[index];
                if (DecodeUtil.isOneByte(b3)) {
                    int i5 = i3 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i3);
                    while (i4 < i2) {
                        byte b4 = bytes[i4];
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i4++;
                        DecodeUtil.handleOneByte(b4, cArr, i5);
                        i5++;
                    }
                    i3 = i5;
                    index = i4;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i4 >= i2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    DecodeUtil.handleTwoBytes(b3, bytes[i4], cArr, i3);
                    i3++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i4 >= i2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i6 = index + 2;
                    index += 3;
                    DecodeUtil.handleThreeBytes(b3, bytes[i4], bytes[i6], cArr, i3);
                    i3++;
                } else {
                    if (i4 >= i2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = bytes[i4];
                    int i7 = index + 3;
                    byte b6 = bytes[index + 2];
                    index += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, bytes[i7], cArr, i3);
                    i3 += 2;
                }
            }
            return new String(cArr, 0, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence in, byte[] out, int offset, int length) {
            int i2;
            int i3;
            char cCharAt;
            int length2 = in.length();
            int i4 = length + offset;
            int i5 = 0;
            while (i5 < length2 && (i3 = i5 + offset) < i4 && (cCharAt = in.charAt(i5)) < 128) {
                out[i3] = (byte) cCharAt;
                i5++;
            }
            if (i5 == length2) {
                return offset + length2;
            }
            int i6 = offset + i5;
            while (i5 < length2) {
                char cCharAt2 = in.charAt(i5);
                if (cCharAt2 < 128 && i6 < i4) {
                    out[i6] = (byte) cCharAt2;
                    i6++;
                } else if (cCharAt2 < 2048 && i6 <= i4 - 2) {
                    int i7 = i6 + 1;
                    int i8 = cCharAt2 >>> 6;
                    out[i6] = (byte) ((i8 + 960) - (i8 & 960));
                    i6 += 2;
                    out[i7] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i6 > i4 - 3) {
                        if (i6 > i4 - 4) {
                            if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i2 = i5 + 1) != in.length() && Character.isSurrogatePair(cCharAt2, in.charAt(i2)))) {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i6);
                            }
                            throw new UnpairedSurrogateException(i5, length2);
                        }
                        int i9 = i5 + 1;
                        if (i9 != in.length()) {
                            char cCharAt3 = in.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                out[i6] = (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240)));
                                int i10 = codePoint >>> 12;
                                int i11 = (i10 + 63) - (i10 | 63);
                                out[i6 + 1] = (byte) ((i11 + 128) - (i11 & 128));
                                int i12 = i6 + 3;
                                out[i6 + 2] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                                i6 += 4;
                                out[i12] = (byte) (((codePoint + 63) - (codePoint | 63)) | 128);
                                i5 = i9;
                            } else {
                                i5 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i5 - 1, length2);
                    }
                    out[i6] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i13 = i6 + 2;
                    int i14 = (cCharAt2 >>> 6) & 63;
                    out[i6 + 1] = (byte) ((i14 + 128) - (i14 & 128));
                    i6 += 3;
                    out[i13] = (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128);
                }
                i5++;
            }
            return i6;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            encodeUtf8Default(in, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r10[r11] > (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        
            if (r10[r11] > (-65)) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0079, code lost:
        
            if (r10[r3] > (-65)) goto L51;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r9, byte[] r10, int r11, int r12) {
            /*
                r8 = this;
                if (r9 == 0) goto L7d
                if (r11 < r12) goto L5
                return r9
            L5:
                byte r6 = (byte) r9
                r3 = -32
                r7 = -1
                r5 = -65
                if (r6 >= r3) goto L18
                r0 = -62
                if (r6 < r0) goto L17
                int r1 = r11 + 1
                r0 = r10[r11]
                if (r0 <= r5) goto L7c
            L17:
                return r7
            L18:
                r0 = -16
                if (r6 >= r0) goto L43
                int r0 = r9 >> 8
                int r0 = ~r0
                byte r2 = (byte) r0
                if (r2 != 0) goto L2e
                int r0 = r11 + 1
                r2 = r10[r11]
                if (r0 < r12) goto L2d
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r2)
                return r0
            L2d:
                r11 = r0
            L2e:
                if (r2 > r5) goto L42
                r1 = -96
                if (r6 != r3) goto L36
                if (r2 < r1) goto L42
            L36:
                r0 = -19
                if (r6 != r0) goto L3c
                if (r2 >= r1) goto L42
            L3c:
                int r1 = r11 + 1
                r0 = r10[r11]
                if (r0 <= r5) goto L7c
            L42:
                return r7
            L43:
                int r0 = r9 >> 8
                int r0 = ~r0
                byte r4 = (byte) r0
                if (r4 != 0) goto L54
                int r3 = r11 + 1
                r4 = r10[r11]
                if (r3 < r12) goto L59
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r6, r4)
                return r0
            L54:
                int r0 = r9 >> 16
                byte r2 = (byte) r0
                r3 = r11
                goto L5a
            L59:
                r2 = 0
            L5a:
                if (r2 != 0) goto L68
                int r0 = r3 + 1
                r2 = r10[r3]
                if (r0 < r12) goto L67
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r6, r4, r2)
                return r0
            L67:
                r3 = r0
            L68:
                if (r4 > r5) goto L7b
                int r1 = r6 << 28
                int r0 = r4 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L7b
                if (r2 > r5) goto L7b
                int r11 = r3 + 1
                r0 = r10[r3]
                if (r0 <= r5) goto L7d
            L7b:
                return r7
            L7c:
                r11 = r1
            L7d:
                int r0 = partialIsValidUtf8(r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int state, ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(long r11, int r13) {
            /*
                int r2 = unsafeEstimateConsecutiveAscii(r11, r13)
                long r0 = (long) r2
                long r11 = r11 + r0
                int r13 = r13 - r2
            L7:
                r2 = 0
                r7 = r2
            L9:
                r9 = 1
                if (r13 <= 0) goto L1a
                long r0 = r11 + r9
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r7 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r0
                goto L9
            L19:
                r11 = r0
            L1a:
                if (r13 != 0) goto L1d
                return r2
            L1d:
                int r1 = r13 + (-1)
                r8 = -32
                r6 = -1
                r2 = -65
                if (r7 >= r8) goto L39
                if (r1 != 0) goto L29
                return r7
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r7 < r0) goto L36
                long r9 = r9 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r0 <= r2) goto L37
            L36:
                return r6
            L37:
                r11 = r9
                goto L7
            L39:
                r0 = -16
                r4 = 2
                if (r7 >= r0) goto L64
                r0 = 2
                if (r1 >= r0) goto L47
                int r0 = unsafeIncompleteStateFor(r11, r7, r1)
                return r0
            L47:
                int r13 = r13 + (-3)
                long r9 = r9 + r11
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r3 > r2) goto L63
                r1 = -96
                if (r7 != r8) goto L56
                if (r3 < r1) goto L63
            L56:
                r0 = -19
                if (r7 != r0) goto L5c
                if (r3 >= r1) goto L63
            L5c:
                long r11 = r11 + r4
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                if (r0 <= r2) goto L7
            L63:
                return r6
            L64:
                r0 = 3
                if (r1 >= r0) goto L6c
                int r0 = unsafeIncompleteStateFor(r11, r7, r1)
                return r0
            L6c:
                int r13 = r13 + (-4)
                long r9 = r9 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11)
                if (r0 > r2) goto L8e
                int r1 = r7 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8e
                long r4 = r4 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r9)
                if (r0 > r2) goto L8e
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r4)
                if (r0 <= r2) goto L7
            L8e:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int partialIsValidUtf8(final byte[] r11, long r12, int r14) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r11, r12, r14)
                int r14 = r14 - r0
                long r0 = (long) r0
                long r12 = r12 + r0
            L7:
                r4 = 0
                r8 = r4
            L9:
                r0 = 1
                if (r14 <= 0) goto L1a
                long r2 = r12 + r0
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r8 < 0) goto L19
                int r14 = r14 + (-1)
                r12 = r2
                goto L9
            L19:
                r12 = r2
            L1a:
                if (r14 != 0) goto L1d
                return r4
            L1d:
                int r5 = r14 + (-1)
                r10 = -32
                r9 = -1
                r6 = -65
                if (r8 >= r10) goto L39
                if (r5 != 0) goto L29
                return r8
            L29:
                int r14 = r14 + (-2)
                r2 = -62
                if (r8 < r2) goto L36
                long r0 = r0 + r12
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r2 <= r6) goto L37
            L36:
                return r9
            L37:
                r12 = r0
                goto L7
            L39:
                r4 = -16
                r2 = 2
                if (r8 >= r4) goto L64
                r4 = 2
                if (r5 >= r4) goto L47
                int r0 = unsafeIncompleteStateFor(r11, r8, r12, r5)
                return r0
            L47:
                int r14 = r14 + (-3)
                long r0 = r0 + r12
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r7 > r6) goto L63
                r5 = -96
                if (r8 != r10) goto L56
                if (r7 < r5) goto L63
            L56:
                r4 = -19
                if (r8 != r4) goto L5c
                if (r7 >= r5) goto L63
            L5c:
                long r12 = r12 + r2
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r0)
                if (r0 <= r6) goto L7
            L63:
                return r9
            L64:
                r4 = 3
                if (r5 >= r4) goto L6c
                int r0 = unsafeIncompleteStateFor(r11, r8, r12, r5)
                return r0
            L6c:
                int r14 = r14 + (-4)
                long r0 = r0 + r12
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r4 > r6) goto L8e
                int r5 = r8 << 28
                int r4 = r4 + 112
                int r5 = r5 + r4
                int r4 = r5 >> 30
                if (r4 != 0) goto L8e
                long r2 = r2 + r12
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r0)
                if (r0 > r6) goto L8e
                r0 = 3
                long r12 = r12 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r11, r2)
                if (r0 <= r6) goto L7
            L8e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i2 = (int) ((-address) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + address;
                if (UnsafeUtil.getByte(address) < 0) {
                    return i2 - i3;
                }
                i3--;
                address = j2;
            }
            int i4 = maxChars - i2;
            while (i4 >= 8 && (UnsafeUtil.getLong(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i4 -= 8;
            }
            return maxChars - i4;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            long j2 = offset;
            int i2 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j2) & 7);
            while (i2 < i3) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(bytes, j2) < 0) {
                    return i2;
                }
                i2++;
                j2 = j3;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > maxChars || (-1) - (((-1) - UnsafeUtil.getLong((Object) bytes, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j2)) | ((-1) - (-9187201950435737472L))) != 0) {
                    break;
                }
                j2 += 8;
                i2 = i4;
            }
            while (i2 < maxChars) {
                long j4 = j2 + 1;
                if (UnsafeUtil.getByte(bytes, j2) < 0) {
                    return i2;
                }
                i2++;
                j2 = j4;
            }
            return maxChars;
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(address), UnsafeUtil.getByte(address + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return Utf8.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset));
            }
            if (remaining == 2) {
                return Utf8.incompleteStateFor(byte1, UnsafeUtil.getByte(bytes, offset), UnsafeUtil.getByte(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            String str = new String(bytes, index, size, Internal.UTF_8);
            if (str.contains("�") && !Arrays.equals(str.getBytes(Internal.UTF_8), Arrays.copyOfRange(bytes, index, size + index))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((((index + size) - (index & size)) | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(buffer) + ((long) index);
            long j2 = ((long) size) + jAddressOffset;
            char[] cArr = new char[size];
            int i2 = 0;
            while (jAddressOffset < j2) {
                byte b2 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b2, cArr, i2);
                i2++;
            }
            while (jAddressOffset < j2) {
                long j3 = jAddressOffset + 1;
                byte b3 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b3)) {
                    int i3 = i2 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i2);
                    while (j3 < j2) {
                        byte b4 = UnsafeUtil.getByte(j3);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        j3++;
                        DecodeUtil.handleOneByte(b4, cArr, i3);
                        i3++;
                    }
                    i2 = i3;
                    jAddressOffset = j3;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j3), cArr, i2);
                    i2++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (j3 >= j2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(j4), cArr, i2);
                    i2++;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = UnsafeUtil.getByte(j3);
                    long j5 = 3 + jAddressOffset;
                    byte b6 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, UnsafeUtil.getByte(j5), cArr, i2);
                    i2 += 2;
                }
            }
            return new String(cArr, 0, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(final CharSequence in, final byte[] out, final int offset, final int length) {
            long j2;
            int i2;
            char cCharAt;
            long j3 = offset;
            long j4 = ((long) length) + j3;
            int length2 = in.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i3 = 0;
            while (true) {
                j2 = 1;
                if (i3 >= length2 || (cCharAt = in.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(out, j3, (byte) cCharAt);
                i3++;
                j3 = 1 + j3;
            }
            if (i3 == length2) {
                return (int) j3;
            }
            while (i3 < length2) {
                char cCharAt2 = in.charAt(i3);
                if (cCharAt2 >= 128 || j3 >= j4) {
                    if (cCharAt2 < 2048 && j3 <= j4 - 2) {
                        long j5 = j3 + j2;
                        int i4 = cCharAt2 >>> 6;
                        UnsafeUtil.putByte(out, j3, (byte) ((i4 + 960) - (i4 & 960)));
                        j3 += 2;
                        UnsafeUtil.putByte(out, j5, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                            if (j3 > j4 - 4) {
                                if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i2 = i3 + 1) != length2 && Character.isSurrogatePair(cCharAt2, in.charAt(i2)))) {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j3);
                                }
                                throw new UnpairedSurrogateException(i3, length2);
                            }
                            int i5 = i3 + 1;
                            if (i5 != length2) {
                                char cCharAt3 = in.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j2 = 1;
                                    int i6 = codePoint >>> 18;
                                    UnsafeUtil.putByte(out, j3, (byte) ((i6 + 240) - (i6 & 240)));
                                    int i7 = (-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63));
                                    UnsafeUtil.putByte(out, j3 + 1, (byte) ((i7 + 128) - (i7 & 128)));
                                    long j6 = j3 + 3;
                                    int i8 = (codePoint >>> 6) & 63;
                                    UnsafeUtil.putByte(out, j3 + 2, (byte) ((i8 + 128) - (i8 & 128)));
                                    j3 += 4;
                                    int i9 = (codePoint + 63) - (codePoint | 63);
                                    UnsafeUtil.putByte(out, j6, (byte) ((i9 + 128) - (i9 & 128)));
                                    i3 = i5;
                                } else {
                                    i3 = i5;
                                }
                            }
                            throw new UnpairedSurrogateException(i3 - 1, length2);
                        }
                        UnsafeUtil.putByte(out, j3, (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - 480))));
                        long j7 = j3 + 2;
                        UnsafeUtil.putByte(out, j3 + 1, (byte) ((-1) - (((-1) - ((-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63)))) & ((-1) - 128))));
                        j3 += 3;
                        int i10 = (-1) - ((65535 - cCharAt2) | ((-1) - 63));
                        UnsafeUtil.putByte(out, j7, (byte) ((i10 + 128) - (i10 & 128)));
                    }
                    j2 = 1;
                } else {
                    UnsafeUtil.putByte(out, j3, (byte) cCharAt2);
                    j3 += j2;
                }
                i3++;
            }
            return (int) j3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence in, ByteBuffer out) {
            long j2;
            char c2;
            int i2;
            int i3;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(out);
            long jPosition = ((long) out.position()) + jAddressOffset;
            long jLimit = ((long) out.limit()) + jAddressOffset;
            int length = in.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(length - 1) + " at index " + out.limit());
            }
            int i4 = 0;
            while (true) {
                j2 = 1;
                c2 = 128;
                if (i4 >= length || (cCharAt = in.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i4++;
                jPosition = 1 + jPosition;
            }
            if (i4 == length) {
                out.position((int) (jPosition - jAddressOffset));
                return;
            }
            while (i4 < length) {
                char cCharAt2 = in.charAt(i4);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j3 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> 6)) & ((-1) - 960))));
                        jPosition += 2;
                        UnsafeUtil.putByte(j3, (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128))));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, in.charAt(i2)))) {
                                    throw new UnpairedSurrogateException(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i3 = i4 + 1;
                            if (i3 != length) {
                                char cCharAt3 = in.charAt(i3);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((-1) - (((-1) - (codePoint >>> 18)) & ((-1) - 240))));
                                    c2 = 128;
                                    UnsafeUtil.putByte(jPosition + 1, (byte) (((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63))) | 128));
                                    long j4 = jPosition + 3;
                                    int i5 = (-1) - (((-1) - (codePoint >>> 6)) | ((-1) - 63));
                                    UnsafeUtil.putByte(jPosition + 2, (byte) ((i5 + 128) - (i5 & 128)));
                                    jPosition += 4;
                                    int i6 = (codePoint + 63) - (codePoint | 63);
                                    UnsafeUtil.putByte(j4, (byte) ((i6 + 128) - (i6 & 128)));
                                } else {
                                    i4 = i3;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        long j5 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j6 = jPosition + 2;
                        int i7 = cCharAt2 >>> 6;
                        UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - ((i7 + 63) - (i7 | 63))) & ((-1) - 128))));
                        jPosition += 3;
                        UnsafeUtil.putByte(j6, (byte) ((-1) - (((-1) - (cCharAt2 & '?')) & ((-1) - 128))));
                    }
                    i3 = i4;
                    c2 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    i3 = i4;
                    jPosition += j2;
                }
                i4 = i3 + 1;
                j2 = 1;
            }
            out.position((int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r17, r3) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r17, r3) > (-65)) goto L55;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r16, byte[] r17, final int r18, final int r19) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L55;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8Direct(final int r15, java.nio.ByteBuffer r16, final int r17, final int r18) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    static String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    static String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    static int encode(CharSequence in, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in, out, offset, length);
    }

    static void encodeUtf8(CharSequence in, ByteBuffer out) {
        processor.encodeUtf8(in, out);
    }

    static int encodedLength(CharSequence sequence) {
        int length = sequence.length();
        int i2 = 0;
        while (i2 < length && sequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = sequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(sequence, i2);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int length = sequence.length();
        int i2 = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(sequence, start) < 65536) {
                        throw new UnpairedSurrogateException(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i2 = limit - 7;
        int i3 = index;
        while (i3 < i2 && (buffer.getLong(i3) & (-9187201950435737472L)) == 0) {
            i3 += 8;
        }
        return i3 - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b2 = bytes[index - 1];
        int i2 = limit - index;
        if (i2 == 0) {
            return incompleteStateFor(b2);
        }
        if (i2 == 1) {
            return incompleteStateFor(b2, bytes[index]);
        }
        if (i2 == 2) {
            return incompleteStateFor(b2, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    static boolean isValidUtf8(ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    static int partialIsValidUtf8(int state, ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }
}
