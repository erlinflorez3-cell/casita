package com.google.zxing.aztec.encoder;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* JADX INFO: loaded from: classes7.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i2, int i3) {
        int[] iArr = new int[i3];
        int size = bitArray.getSize() / i2;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 |= bitArray.get((i4 * i2) + i6) ? 1 << ((i2 - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 2) {
            int i5 = i2 - i4;
            int i6 = i5;
            while (true) {
                int i7 = i2 + i4;
                if (i6 <= i7) {
                    bitMatrix.set(i6, i5);
                    bitMatrix.set(i6, i7);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i7, i6);
                    i6++;
                }
            }
        }
        int i8 = i2 - i3;
        bitMatrix.set(i8, i8);
        int i9 = i8 + 1;
        bitMatrix.set(i9, i8);
        bitMatrix.set(i8, i9);
        int i10 = i2 + i3;
        bitMatrix.set(i10, i8);
        bitMatrix.set(i10, i9);
        bitMatrix.set(i10, i10 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z2, int i2, BitArray bitArray) {
        int i3 = i2 / 2;
        int i4 = 0;
        if (z2) {
            while (i4 < 7) {
                int i5 = (i3 - 3) + i4;
                if (bitArray.get(i4)) {
                    bitMatrix.set(i5, i3 - 5);
                }
                if (bitArray.get(i4 + 7)) {
                    bitMatrix.set(i3 + 5, i5);
                }
                if (bitArray.get(20 - i4)) {
                    bitMatrix.set(i5, i3 + 5);
                }
                if (bitArray.get(27 - i4)) {
                    bitMatrix.set(i3 - 5, i5);
                }
                i4++;
            }
            return;
        }
        while (i4 < 10) {
            int i6 = (i3 - 5) + i4 + (i4 / 5);
            if (bitArray.get(i4)) {
                bitMatrix.set(i6, i3 - 7);
            }
            if (bitArray.get(i4 + 10)) {
                bitMatrix.set(i3 + 7, i6);
            }
            if (bitArray.get(29 - i4)) {
                bitMatrix.set(i6, i3 + 7);
            }
            if (bitArray.get(39 - i4)) {
                bitMatrix.set(i3 - 7, i6);
            }
            i4++;
        }
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    public static AztecCode encode(byte[] bArr, int i2, int i3) {
        BitArray bitArrayStuffBits;
        int i4;
        boolean z2;
        int iAbs;
        int i5;
        int i6;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i2) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        if (i3 == 0) {
            bitArrayStuffBits = null;
            int i7 = 0;
            i4 = 0;
            while (i7 <= 32) {
                z2 = i7 <= 3;
                iAbs = z2 ? i7 + 1 : i7;
                i5 = totalBitsInLayer(iAbs, z2);
                if (size2 <= i5) {
                    if (bitArrayStuffBits == null || i4 != WORD_SIZE[iAbs]) {
                        i4 = WORD_SIZE[iAbs];
                        bitArrayStuffBits = stuffBits(bitArrayEncode, i4);
                    }
                    int i8 = i5 - (i5 % i4);
                    if ((!z2 || bitArrayStuffBits.getSize() <= (i4 << 6)) && bitArrayStuffBits.getSize() + size <= i8) {
                    }
                }
                i7++;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z2 = i3 < 0;
        iAbs = Math.abs(i3);
        if (iAbs > (z2 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
        }
        i5 = totalBitsInLayer(iAbs, z2);
        i4 = WORD_SIZE[iAbs];
        int i9 = i5 - (i5 % i4);
        bitArrayStuffBits = stuffBits(bitArrayEncode, i4);
        if (bitArrayStuffBits.getSize() + size > i9) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z2 && bitArrayStuffBits.getSize() > (i4 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i5, i4);
        int size3 = bitArrayStuffBits.getSize() / i4;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z2, iAbs, size3);
        int i10 = (z2 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i10];
        int i11 = 2;
        if (z2) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
            i6 = i10;
        } else {
            int i13 = i10 / 2;
            i6 = i10 + 1 + (((i13 - 1) / 15) * 2);
            int i14 = i6 / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[(i13 - i15) - 1] = (i14 - r4) - 1;
                iArr[i13 + i15] = (i15 / 15) + i15 + i14 + 1;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i6);
        int i16 = 0;
        int i17 = 0;
        while (i16 < iAbs) {
            int i18 = ((iAbs - i16) << i11) + (z2 ? 9 : 12);
            int i19 = 0;
            while (i19 < i18) {
                int i20 = i19 << 1;
                int i21 = 0;
                while (i21 < i11) {
                    if (bitArrayGenerateCheckWords.get(i17 + i20 + i21)) {
                        int i22 = i16 << 1;
                        bitMatrix.set(iArr[i22 + i21], iArr[i22 + i19]);
                    }
                    if (bitArrayGenerateCheckWords.get((i18 << 1) + i17 + i20 + i21)) {
                        int i23 = i16 << 1;
                        bitMatrix.set(iArr[i23 + i19], iArr[((i10 - 1) - i23) - i21]);
                    }
                    if (bitArrayGenerateCheckWords.get((i18 << 2) + i17 + i20 + i21)) {
                        int i24 = (i10 - 1) - (i16 << 1);
                        bitMatrix.set(iArr[i24 - i21], iArr[i24 - i19]);
                    }
                    if (bitArrayGenerateCheckWords.get((i18 * 6) + i17 + i20 + i21)) {
                        int i25 = i16 << 1;
                        bitMatrix.set(iArr[((i10 - 1) - i25) - i19], iArr[i25 + i21]);
                    }
                    i21++;
                    i11 = 2;
                }
                i19++;
                i11 = 2;
            }
            i17 += i18 << 3;
            i16++;
            i11 = 2;
        }
        drawModeMessage(bitMatrix, z2, i6, bitArrayGenerateModeMessage);
        if (z2) {
            drawBullsEye(bitMatrix, i6 / 2, 5);
        } else {
            int i26 = i6 / 2;
            drawBullsEye(bitMatrix, i26, 7);
            int i27 = 0;
            int i28 = 0;
            while (i28 < (i10 / 2) - 1) {
                for (int i29 = (i26 + 1) - (1 | i26); i29 < i6; i29 += 2) {
                    int i30 = i26 - i27;
                    bitMatrix.set(i30, i29);
                    int i31 = i26 + i27;
                    bitMatrix.set(i31, i29);
                    bitMatrix.set(i29, i30);
                    bitMatrix.set(i29, i31);
                }
                i28 += 15;
                i27 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z2);
        aztecCode.setSize(i6);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i2, int i3) {
        int size = bitArray.getSize() / i3;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i3));
        int i4 = i2 / i3;
        int[] iArrBitsToWords = bitsToWords(bitArray, i3, i4);
        reedSolomonEncoder.encode(iArrBitsToWords, i4 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i2 % i3);
        for (int i5 : iArrBitsToWords) {
            bitArray2.appendBits(i5, i3);
        }
        return bitArray2;
    }

    static BitArray generateModeMessage(boolean z2, int i2, int i3) {
        BitArray bitArray = new BitArray();
        if (z2) {
            bitArray.appendBits(i2 - 1, 2);
            bitArray.appendBits(i3 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i2 - 1, 5);
        bitArray.appendBits(i3 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static GenericGF getGF(int i2) {
        if (i2 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i2 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i2 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i2 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i2 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    static BitArray stuffBits(BitArray bitArray, int i2) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i3 = (1 << i2) - 2;
        int i4 = 0;
        while (i4 < size) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = i4 + i6;
                if (i7 >= size || bitArray.get(i7)) {
                    int i8 = 1 << ((i2 - 1) - i6);
                    i5 = (i5 + i8) - (i5 & i8);
                }
            }
            int i9 = (-1) - (((-1) - i5) | ((-1) - i3));
            if (i9 == i3) {
                bitArray2.appendBits(i9, i2);
            } else if (i9 == 0) {
                bitArray2.appendBits(i5 | 1, i2);
            } else {
                bitArray2.appendBits(i5, i2);
                i4 += i2;
            }
            i4--;
            i4 += i2;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i2, boolean z2) {
        return ((z2 ? 88 : PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) + (i2 << 4)) * i2;
    }
}
