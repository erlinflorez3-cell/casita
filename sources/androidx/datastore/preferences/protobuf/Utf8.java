package androidx.datastore.preferences.protobuf;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    public static final int COMPLETE = 0;
    public static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        return processor.isValidUtf8(bArr, i2, i3);
    }

    public static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, bArr, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return incompleteStateFor(b2);
        }
        if (i4 == 1) {
            return incompleteStateFor(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return incompleteStateFor(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        if (i4 == 0) {
            return incompleteStateFor(i2);
        }
        if (i4 == 1) {
            return incompleteStateFor(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return incompleteStateFor(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i2);
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

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    static int encode(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return processor.encodeUtf8(charSequence, bArr, i2, i3);
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, byteBuffer, i3, i4);
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i2, i3);
    }

    static String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i2, i3);
    }

    static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = i3 - 7;
        int i5 = i2;
        while (i5 < i4) {
            long j2 = byteBuffer.getLong(i5);
            if ((j2 - 9187201950435737472L) - (j2 | (-9187201950435737472L)) != 0) {
                break;
            }
            i5 += 8;
        }
        return i5 - i2;
    }

    static abstract class Processor {
        abstract String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3);

        abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        abstract int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4);

        abstract int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4);

        Processor() {
        }

        final boolean isValidUtf8(byte[] bArr, int i2, int i3) {
            return partialIsValidUtf8(0, bArr, i2, i3) == 0;
        }

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8(0, byteBuffer, i2, i3) == 0;
        }

        final int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i4);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i2, byteBuffer, i3, i4);
            }
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
        }

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
        final int partialIsValidUtf8Default(int r9, java.nio.ByteBuffer r10, int r11, int r12) {
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r2)
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r4)
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$100(r6, r4, r2)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            int iEstimateConsecutiveAscii = i2 + Utf8.estimateConsecutiveAscii(byteBuffer, i2, i3);
            while (iEstimateConsecutiveAscii < i3) {
                int i4 = iEstimateConsecutiveAscii + 1;
                byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b2 >= 0) {
                    iEstimateConsecutiveAscii = i4;
                } else if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                        }
                        int i5 = iEstimateConsecutiveAscii + 2;
                        byte b3 = byteBuffer.get(i4);
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i5) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                    }
                    int i7 = iEstimateConsecutiveAscii + 2;
                    byte b4 = byteBuffer.get(i4);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i7) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            if (byteBuffer.isDirect()) {
                return decodeUtf8Direct(byteBuffer, i2, i3);
            }
            return decodeUtf8Default(byteBuffer, i2, i3);
        }

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((-1) - (((-1) - ((i2 + i3) - (i2 & i3))) & ((-1) - ((byteBuffer.limit() - i2) - i3))) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = byteBuffer.get(i2);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = byteBuffer.get(i2);
                if (DecodeUtil.isOneByte(b3)) {
                    int i7 = i5 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    while (i6 < i4) {
                        byte b4 = byteBuffer.get(i6);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i6++;
                        DecodeUtil.handleOneByte(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i2 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i6 >= i4) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i6 >= i4 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i4 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = byteBuffer.get(i6);
                    int i9 = i2 + 3;
                    byte b6 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, byteBuffer.get(i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i2;
            int i3;
            int i4;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i5 = 0;
            while (i5 < length) {
                try {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i5, (byte) cCharAt);
                    i5++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                }
            }
            if (i5 == length) {
                byteBuffer.position(iPosition + i5);
                return;
            }
            iPosition += i5;
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    i2 = iPosition + 1;
                    int i6 = cCharAt2 >>> 6;
                    try {
                        byteBuffer.put(iPosition, (byte) ((i6 + 192) - (i6 & 192)));
                        byteBuffer.put(i2, (byte) (((-1) - ((65535 - cCharAt2) | ((-1) - 63))) | 128));
                        iPosition = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        i2 = i5 + 1;
                        if (i2 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i2);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i7 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i3 = iPosition + 2;
                                        i4 = (codePoint >>> 12) & 63;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i7;
                                        i5 = i2;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                    try {
                                        byteBuffer.put(i7, (byte) ((i4 + 128) - (i4 & 128)));
                                        iPosition += 3;
                                        int i8 = (codePoint >>> 6) & 63;
                                        byteBuffer.put(i3, (byte) ((i8 + 128) - (i8 & 128)));
                                        int i9 = (codePoint + 63) - (codePoint | 63);
                                        byteBuffer.put(iPosition, (byte) ((i9 + 128) - (i9 & 128)));
                                        i5 = i2;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i5 = i2;
                                        iPosition = i3;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i5) + " at index " + (byteBuffer.position() + Math.max(i5, (iPosition - byteBuffer.position()) + 1)));
                                    }
                                } else {
                                    i5 = i2;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i5, length);
                    }
                    i2 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY))));
                    iPosition += 2;
                    int i10 = (cCharAt2 >>> 6) & 63;
                    byteBuffer.put(i2, (byte) ((i10 + 128) - (i10 & 128)));
                    int i11 = cCharAt2 & '?';
                    byteBuffer.put(iPosition, (byte) ((i11 + 128) - (i11 & 128)));
                }
                i5++;
                iPosition++;
            }
            byteBuffer.position(iPosition);
        }
    }

    static final class SafeProcessor extends Processor {
        SafeProcessor() {
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
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r2)
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r4)
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
                int r0 = androidx.datastore.preferences.protobuf.Utf8.access$100(r6, r4, r2)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((-1) - (((-1) - ((-1) - (((-1) - i2) & ((-1) - i3)))) & ((-1) - ((bArr.length - i2) - i3))) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = bArr[i2];
                if (DecodeUtil.isOneByte(b3)) {
                    int i7 = i5 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    while (i6 < i4) {
                        byte b4 = bArr[i6];
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i6++;
                        DecodeUtil.handleOneByte(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i2 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i6 >= i4) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    DecodeUtil.handleTwoBytes(b3, bArr[i6], cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i6 >= i4 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.handleThreeBytes(b3, bArr[i6], bArr[i8], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i4 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = bArr[i6];
                    int i9 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, bArr[i9], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i3 + i2;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i2) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i2 + length;
            }
            int i8 = i2 + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        int i10 = cCharAt2 >>> 6;
                        bArr[i8] = (byte) ((i10 + 960) - (i10 & 960));
                        i8 += 2;
                        bArr[i9] = (byte) (((cCharAt2 + '?') - (cCharAt2 | '?')) | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 <= i6 - 4) {
                                int i11 = i7 + 1;
                                if (i11 != charSequence.length()) {
                                    char cCharAt3 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i8 + 1] = (byte) ((-1) - (((-1) - ((-1) - (((-1) - (codePoint >>> 12)) | ((-1) - 63)))) & ((-1) - 128)));
                                        int i12 = i8 + 3;
                                        int i13 = codePoint >>> 6;
                                        bArr[i8 + 2] = (byte) (((i13 + 63) - (i13 | 63)) | 128);
                                        i8 += 4;
                                        int i14 = codePoint & 63;
                                        bArr[i12] = (byte) ((i14 + 128) - (i14 & 128));
                                        i7 = i11;
                                    } else {
                                        i7 = i11;
                                    }
                                }
                                throw new UnpairedSurrogateException(i7 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new UnpairedSurrogateException(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                        }
                        bArr[i8] = (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - 480)));
                        int i15 = i8 + 2;
                        bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i8 += 3;
                        bArr[i15] = (byte) ((-1) - (((-1) - ((-1) - ((65535 - cCharAt2) | ((-1) - 63)))) & ((-1) - 128)));
                    }
                } else {
                    bArr[i8] = (byte) cCharAt2;
                    i8++;
                }
                i7++;
            }
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i2, i3);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i4 >= i3) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i2 += 2;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return Utf8.incompleteStateFor(bArr, i4, i3);
                        }
                        int i5 = i2 + 2;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b2 << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i2 + 3;
                            if (bArr[i5] <= -65) {
                                i2 += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return Utf8.incompleteStateFor(bArr, i4, i3);
                    }
                    int i7 = i2 + 2;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 += 3;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                i2 = i4;
            }
            return 0;
        }
    }

    static final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r17, r3) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r17, r3) > (-65)) goto L55;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8(int r16, byte[] r17, int r18, int r19) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3) > (-65)) goto L55;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int partialIsValidUtf8Direct(int r15, java.nio.ByteBuffer r16, int r17, int r18) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((((i2 + i3) - (i2 & i3)) | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = UnsafeUtil.getByte(bArr, i2);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            while (i2 < i4) {
                int i6 = i2 + 1;
                byte b3 = UnsafeUtil.getByte(bArr, i2);
                if (DecodeUtil.isOneByte(b3)) {
                    int i7 = i5 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    while (i6 < i4) {
                        byte b4 = UnsafeUtil.getByte(bArr, i6);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i6++;
                        DecodeUtil.handleOneByte(b4, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i2 = i6;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i6 >= i4) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(bArr, i6), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i6 >= i4 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i8 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(bArr, i6), UnsafeUtil.getByte(bArr, i8), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i4 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = UnsafeUtil.getByte(bArr, i6);
                    int i9 = i2 + 3;
                    byte b6 = UnsafeUtil.getByte(bArr, i2 + 2);
                    i2 += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, UnsafeUtil.getByte(bArr, i9), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            int i4 = (i2 + i3) - (i2 & i3);
            int iLimit = (byteBuffer.limit() - i2) - i3;
            if ((i4 + iLimit) - (i4 & iLimit) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i2);
            long j2 = ((long) i3) + jAddressOffset;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (jAddressOffset < j2) {
                byte b2 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            while (jAddressOffset < j2) {
                long j3 = jAddressOffset + 1;
                byte b3 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b3)) {
                    int i6 = i5 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    while (j3 < j2) {
                        byte b4 = UnsafeUtil.getByte(j3);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        j3++;
                        DecodeUtil.handleOneByte(b4, cArr, i6);
                        i6++;
                    }
                    i5 = i6;
                    jAddressOffset = j3;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (j3 >= j2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j3), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (j3 >= j2 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j3), UnsafeUtil.getByte(j4), cArr, i5);
                    i5++;
                } else {
                    if (j3 >= j2 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = UnsafeUtil.getByte(j3);
                    long j5 = 3 + jAddressOffset;
                    byte b6 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, UnsafeUtil.getByte(j5), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            long j2;
            int i4;
            char cCharAt;
            long j3 = i2;
            long j4 = ((long) i3) + j3;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                j2 = 1;
                if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j3, (byte) cCharAt);
                i5++;
                j3 = 1 + j3;
            }
            if (i5 == length) {
                return (int) j3;
            }
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 >= 128 || j3 >= j4) {
                    if (cCharAt2 < 2048 && j3 <= j4 - 2) {
                        long j5 = j3 + j2;
                        UnsafeUtil.putByte(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
                        j3 += 2;
                        UnsafeUtil.putByte(bArr, j5, (byte) ((-1) - (((-1) - ((cCharAt2 + '?') - (cCharAt2 | '?'))) & ((-1) - 128))));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                            if (j3 <= j4 - 4) {
                                int i6 = i5 + 1;
                                if (i6 != length) {
                                    char cCharAt3 = charSequence.charAt(i6);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        j2 = 1;
                                        int i7 = codePoint >>> 18;
                                        UnsafeUtil.putByte(bArr, j3, (byte) ((i7 + 240) - (i7 & 240)));
                                        int i8 = codePoint >>> 12;
                                        UnsafeUtil.putByte(bArr, j3 + 1, (byte) ((-1) - (((-1) - ((i8 + 63) - (i8 | 63))) & ((-1) - 128))));
                                        long j6 = j3 + 3;
                                        int i9 = (codePoint >>> 6) & 63;
                                        UnsafeUtil.putByte(bArr, j3 + 2, (byte) ((i9 + 128) - (i9 & 128)));
                                        j3 += 4;
                                        int i10 = (-1) - (((-1) - codePoint) | ((-1) - 63));
                                        UnsafeUtil.putByte(bArr, j6, (byte) ((i10 + 128) - (i10 & 128)));
                                        i5 = i6;
                                    } else {
                                        i5 = i6;
                                    }
                                }
                                throw new UnpairedSurrogateException(i5 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new UnpairedSurrogateException(i5, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j3);
                        }
                        UnsafeUtil.putByte(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j7 = j3 + 2;
                        int i11 = (-1) - (((-1) - (cCharAt2 >>> 6)) | ((-1) - 63));
                        UnsafeUtil.putByte(bArr, j3 + 1, (byte) ((i11 + 128) - (i11 & 128)));
                        j3 += 3;
                        int i12 = cCharAt2 & '?';
                        UnsafeUtil.putByte(bArr, j7, (byte) ((i12 + 128) - (i12 & 128)));
                    }
                    j2 = 1;
                } else {
                    UnsafeUtil.putByte(bArr, j3, (byte) cCharAt2);
                    j3 += j2;
                }
                i5++;
            }
            return (int) j3;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j2;
            char c2;
            int i2;
            int i3;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i4 = 0;
            while (true) {
                j2 = 1;
                c2 = 128;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i4++;
                jPosition = 1 + jPosition;
            }
            if (i4 == length) {
                byteBuffer.position((int) (jPosition - jAddressOffset));
                return;
            }
            while (i4 < length) {
                char cCharAt2 = charSequence.charAt(i4);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j3 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        int i5 = cCharAt2 & '?';
                        UnsafeUtil.putByte(j3, (byte) ((i5 + 128) - (i5 & 128)));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition <= jLimit - 4) {
                                i3 = i4 + 1;
                                if (i3 != length) {
                                    char cCharAt3 = charSequence.charAt(i3);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i6 = codePoint >>> 12;
                                        int i7 = (i6 + 63) - (i6 | 63);
                                        c2 = 128;
                                        UnsafeUtil.putByte(jPosition + 1, (byte) (i7 | 128));
                                        long j4 = jPosition + 3;
                                        int i8 = codePoint >>> 6;
                                        UnsafeUtil.putByte(jPosition + 2, (byte) (((i8 + 63) - (i8 | 63)) | 128));
                                        jPosition += 4;
                                        int i9 = (codePoint + 63) - (codePoint | 63);
                                        UnsafeUtil.putByte(j4, (byte) ((i9 + 128) - (i9 & 128)));
                                    } else {
                                        i4 = i3;
                                    }
                                }
                                throw new UnpairedSurrogateException(i4 - 1, length);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i2)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        long j5 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((-1) - (((-1) - (cCharAt2 >>> '\f')) & ((-1) - 480))));
                        long j6 = jPosition + 2;
                        int i10 = cCharAt2 >>> 6;
                        UnsafeUtil.putByte(j5, (byte) ((-1) - (((-1) - ((i10 + 63) - (i10 | 63))) & ((-1) - 128))));
                        jPosition += 3;
                        int i11 = (cCharAt2 + '?') - (cCharAt2 | '?');
                        UnsafeUtil.putByte(j6, (byte) ((i11 + 128) - (i11 & 128)));
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
            byteBuffer.position((int) (jPosition - jAddressOffset));
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            while (i3 < i2) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            return i2;
        }

        private static int unsafeEstimateConsecutiveAscii(long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = 8 - ((-1) - (((-1) - ((int) j2)) | ((-1) - 7)));
            int i4 = i3;
            while (i4 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(j2) < 0) {
                    return i3 - i4;
                }
                i4--;
                j2 = j3;
            }
            int i5 = i2 - i3;
            while (i5 >= 8 && (UnsafeUtil.getLong(j2) & (-9187201950435737472L)) == 0) {
                j2 += 8;
                i5 -= 8;
            }
            return i2 - i5;
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
        private static int partialIsValidUtf8(byte[] r11, long r12, int r14) {
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
                byte r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r12)
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
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r12)
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
                byte r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r12)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r0)
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
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r12)
                if (r4 > r6) goto L8e
                int r5 = r8 << 28
                int r4 = r4 + 112
                int r5 = r5 + r4
                int r4 = r5 >> 30
                if (r4 != 0) goto L8e
                long r2 = r2 + r12
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r0)
                if (r0 > r6) goto L8e
                r0 = 3
                long r12 = r12 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11, r2)
                if (r0 <= r6) goto L7
            L8e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
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
                byte r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11)
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
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r9)
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
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r11)
                if (r0 > r2) goto L8e
                int r1 = r7 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8e
                long r4 = r4 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r9)
                if (r0 > r2) goto L8e
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r4)
                if (r0 <= r2) goto L7
            L8e:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j2), UnsafeUtil.getByte(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(long j2, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j2));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(j2 + 1));
            }
            throw new AssertionError();
        }
    }

    private static class DecodeUtil {
        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
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

        private static char lowSurrogate(int i2) {
            return (char) (((-1) - (((-1) - i2) | ((-1) - 1023))) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b2) {
            return (b2 + okio.Utf8.REPLACEMENT_BYTE) - (b2 | okio.Utf8.REPLACEMENT_BYTE);
        }

        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i2] = (char) (((b2 & Ascii.US) << 6) | trailingByteValue(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || isNotTrailingByte(b4)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int i3 = (b2 & Ascii.SI) << 12;
            int iTrailingByteValue = trailingByteValue(b3) << 6;
            cArr[i2] = (char) ((-1) - (((-1) - ((i3 + iTrailingByteValue) - (i3 & iTrailingByteValue))) & ((-1) - trailingByteValue(b4))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || isNotTrailingByte(b4) || isNotTrailingByte(b5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = (-1) - (((-1) - (((-1) - (((-1) - (((b2 + 7) - (b2 | 7)) << 18)) & ((-1) - (trailingByteValue(b3) << 12)))) | (trailingByteValue(b4) << 6))) & ((-1) - trailingByteValue(b5)));
            cArr[i2] = highSurrogate(iTrailingByteValue);
            cArr[i2 + 1] = lowSurrogate(iTrailingByteValue);
        }
    }

    private Utf8() {
    }
}
