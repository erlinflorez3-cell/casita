package io.cobrowse;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes3.dex */
final class PixelFormatConverter {
    private static final int COBROWSE_DEFAULT_COLOR = -1513240;

    PixelFormatConverter() {
    }

    static void argb2i420(int[] iArr, byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = (i4 * 3) / 2;
        if (bArr.length != i5) {
            throw new IllegalArgumentException("destination's length should be " + i5 + ". (destWidth * destHeight * 3 / 2)");
        }
        int i6 = (i4 * 5) / 4;
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = 0;
            while (i9 < i2) {
                int i10 = iArr[(i8 * i2) + i9];
                int i11 = ((-1) - (((-1) - 16711680) | ((-1) - i10))) >> 16;
                int i12 = ((65280 + i10) - (65280 | i10)) >> 8;
                int i13 = 255;
                int i14 = i10 & 255;
                int i15 = (((((i11 * 66) + (i12 * 129)) + (i14 * 25)) + 128) >> 8) + 16;
                int i16 = (((((i11 * (-38)) - (i12 * 74)) + (i14 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) + 128) >> 8) + 128;
                int i17 = (((((i11 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 * 94)) - (i14 * 18)) + 128) >> 8) + 128;
                int i18 = i7 + 1;
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 255) {
                    i15 = 255;
                }
                bArr[i7] = (byte) i15;
                if (i8 % 2 == 0 && i9 % 2 == 0) {
                    int i19 = i4 + 1;
                    if (i16 < 0) {
                        i16 = 0;
                    } else if (i16 > 255) {
                        i16 = 255;
                    }
                    bArr[i4] = (byte) i16;
                    int i20 = i6 + 1;
                    if (i17 < 0) {
                        i13 = 0;
                    } else if (i17 <= 255) {
                        i13 = i17;
                    }
                    bArr[i6] = (byte) i13;
                    i6 = i20;
                    i4 = i19;
                }
                i9++;
                i7 = i18;
            }
        }
    }

    static void argb2nv12(int[] iArr, byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3;
        int i5 = (i4 * 3) / 2;
        if (bArr.length != i5) {
            throw new IllegalArgumentException("destination's length should be " + i5 + ". (destWidth * destHeight * 3 / 2)");
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            while (i8 < i2) {
                int i9 = (i7 * i2) + i8;
                int i10 = iArr[i9];
                int i11 = (16711680 & i10) >> 16;
                int i12 = ((-1) - (((-1) - 65280) | ((-1) - i10))) >> 8;
                int i13 = 255;
                int i14 = (-1) - (((-1) - i10) | ((-1) - 255));
                int i15 = (((((i11 * 66) + (i12 * 129)) + (i14 * 25)) + 128) >> 8) + 16;
                int i16 = (((((i11 * (-38)) - (i12 * 74)) + (i14 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) + 128) >> 8) + 128;
                int i17 = (((((i11 * PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i12 * 94)) - (i14 * 18)) + 128) >> 8) + 128;
                int i18 = i6 + 1;
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 255) {
                    i15 = 255;
                }
                bArr[i6] = (byte) i15;
                if (i7 % 2 == 0 && i9 % 2 == 0) {
                    int i19 = i4 + 1;
                    if (i16 < 0) {
                        i16 = 0;
                    } else if (i16 > 255) {
                        i16 = 255;
                    }
                    bArr[i4] = (byte) i16;
                    i4 += 2;
                    if (i17 < 0) {
                        i13 = 0;
                    } else if (i17 <= 255) {
                        i13 = i17;
                    }
                    bArr[i19] = (byte) i13;
                }
                i8++;
                i6 = i18;
            }
        }
    }

    static void argb2rgba(int[] iArr, byte[] bArr, int i2, int i3) {
        int i4 = i2 * i3 * 4;
        if (bArr.length != i4) {
            throw new IllegalArgumentException("destination's length should be " + i4 + ". (destWidth * destHeight * 4)");
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            for (int i7 = 0; i7 < i2; i7++) {
                int i8 = iArr[(i6 * i2) + i7];
                bArr[i5] = (byte) ((16711680 & i8) >> 16);
                bArr[i5 + 1] = (byte) (((65280 + i8) - (65280 | i8)) >> 8);
                bArr[i5 + 2] = (byte) ((i8 + 255) - (i8 | 255));
                bArr[i5 + 3] = 0;
                i5 += 4;
            }
        }
    }
}
