package com.upokecenter.numbers;

import androidx.compose.animation.core.AnimationKt;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.Arrays;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
public final class EInteger implements Comparable<EInteger> {
    private static final int CacheLast = 128;
    private static final String Digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MultRecursionThreshold = 10;
    private static final int RecursiveDivisionLimit = 201;
    private static final int ShortMask = 65535;
    private static final int Toom3Threshold = 100;
    private static final int Toom4Threshold = 400;
    private final boolean negative;
    private final int wordCount;
    private final short[] words;
    static final int[] CharToDigit = {36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 36, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36, 36, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 36, 36, 36, 36};
    static final int[] MaxSafeInts = {LockFreeTaskQueueCore.MAX_CAPACITY_MASK, 715827881, 536870911, 429496728, 357913940, 306783377, 268435455, 238609293, 214748363, 195225785, 178956969, 165191048, 153391688, 143165575, 134217727, 126322566, 119304646, 113025454, 107374181, 102261125, 97612892, 93368853, 89478484, 85899344, 82595523, 79536430, 76695843, 74051159, 71582787, 69273665, 67108863, 65075261, 63161282, 61356674, 59652322};
    private static final EInteger ValueOne = new EInteger(1, new short[]{1}, false);
    private static final EInteger ValueTen = new EInteger(1, new short[]{10}, false);
    private static final EInteger ValueZero = new EInteger(0, new short[]{0}, false);
    private static final int CacheFirst = -24;
    private static final EInteger[] Cache = EIntegerCache(CacheFirst, 128);
    static final int[] DigitsInWord = {0, 0, IDStepResponseCodes.STEP_LAUNCH_REQUEST, 1010, LeicaMakernoteDirectory.TAG_CAMERA_TEMPERATURE, 690, 619, 570, 534, 505, 482, 463, 447, 433, 421, HttpStatus.SC_GONE, 400, 392, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 377, 371, 365, 359, 354, 349, 345, 341, 337, 333, ExifDirectoryBase.TAG_SUB_IFD_OFFSET, 327, ExifDirectoryBase.TAG_TILE_LENGTH, AviDirectory.TAG_DATETIME_ORIGINAL, 318, 315, 312, 310, 308};
    private static int[] estimatedHalfDigitCountPerWord = {0, 0, 128, 80, 64, 55, 49, 45, 42, 40, 38, 37, 35, 34, 33, 32, 32, 31, 30, 30, 29, 29, 28, 28, 27, 27, 27, 26, 26, 26, 26, 25, 25, 25, 25, 24, 24};

    EInteger(int i2, short[] sArr, boolean z2) {
        this.wordCount = i2;
        this.words = sArr;
        this.negative = z2;
    }

    private static int AddInternal(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        boolean z2 = (i5 + 1) - (1 | i5) == 0;
        if (!z2) {
            i5--;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7 += 2) {
            short s2 = sArr2[i3 + i7];
            int i8 = ((s2 + 65535) - (s2 | 65535)) + ((-1) - (((-1) - sArr3[i4 + i7]) | ((-1) - 65535))) + (i6 >> 16);
            sArr[i2 + i7] = (short) i8;
            int i9 = i7 + 1;
            i6 = (i8 >> 16) + (sArr2[i3 + i9] & 65535) + ((-1) - (((-1) - 65535) | ((-1) - sArr3[i4 + i9])));
            sArr[i9 + i2] = (short) i6;
        }
        if (!z2) {
            i6 = (sArr2[i3 + i5] & 65535) + ((-1) - (((-1) - sArr3[i4 + i5]) | ((-1) - 65535))) + (i6 >> 16);
            sArr[i2 + i5] = (short) i6;
        }
        return i6 >> 16;
    }

    private static int AddUnevenSize(short[] sArr, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, int i6) {
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            short s2 = sArr2[i3 + i8];
            short s3 = sArr3[i5 + i8];
            i7 = ((short) (i7 >> 16)) + ((s2 + 65535) - (s2 | 65535)) + ((65535 + s3) - (65535 | s3));
            sArr[i2 + i8] = (short) i7;
        }
        while (i6 < i4) {
            short s4 = sArr2[i3 + i6];
            i7 = ((s4 + 65535) - (s4 | 65535)) + ((short) (i7 >> 16));
            sArr[i2 + i6] = (short) i7;
            i6++;
        }
        return (-1) - (((-1) - (i7 >> 16)) | ((-1) - 65535));
    }

    private static void AndWords(short[] sArr, short[] sArr2, short[] sArr3, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = (short) ((-1) - (((-1) - sArr2[i3]) | ((-1) - sArr3[i3])));
        }
    }

    private static void AsymmetricMultiply(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5, short[] sArr4, int i6, int i7) {
        int i8;
        short[] sArr5;
        int i9;
        int i10 = i4;
        short[] sArr6 = sArr3;
        int i11 = i5;
        if (i11 == i7) {
            if (i10 == i6 && sArr6 == sArr4) {
                RecursiveSquare(sArr, i2, sArr2, i3, sArr6, i10, i11);
                return;
            } else if (i11 == 2) {
                BaselineMultiply2(sArr, i2, sArr6, i10, sArr4, i6);
                return;
            } else {
                SameSizeMultiply(sArr, i2, sArr2, i3, sArr6, i10, sArr4, i6, i11);
                return;
            }
        }
        if (i11 > i7) {
            sArr5 = sArr4;
            i9 = i6;
            i8 = i11;
            i11 = i7;
        } else {
            i8 = i7;
            sArr5 = sArr6;
            i9 = i10;
            sArr6 = sArr4;
            i10 = i6;
        }
        if (i11 == 1 || (i11 == 2 && sArr5[i9 + 1] == 0)) {
            short s2 = sArr5[i9];
            if (s2 == 0) {
                Arrays.fill(sArr, i2, i2 + i8 + 2, (short) 0);
                return;
            }
            if (s2 != 1) {
                int i12 = i2 + i8;
                sArr[i12] = LinearMultiply(sArr, i2, sArr6, i10, s2, i8);
                sArr[i12 + 1] = 0;
                return;
            } else {
                System.arraycopy(sArr6, i10, sArr, i2, i8);
                int i13 = i2 + i8;
                sArr[i13] = 0;
                sArr[i13 + 1] = 0;
                return;
            }
        }
        if (i11 == 2 && (1 & i8) == 0) {
            int i14 = sArr5[i9] & 65535;
            short s3 = sArr5[i9 + 1];
            int i15 = (65535 + s3) - (65535 | s3);
            int i16 = i2 + i8;
            sArr[i16] = 0;
            sArr[i16 + 1] = 0;
            AtomicMultiplyOpt(sArr, i2, i14, i15, sArr6, i10, 0, i8);
            AtomicMultiplyAddOpt(sArr, i2, i14, i15, sArr6, i10, 2, i8);
            return;
        }
        if (i11 <= 10 && i8 <= 10) {
            SchoolbookMultiply(sArr, i2, sArr5, i9, i11, sArr6, i10, i8);
            return;
        }
        if (i11 >= 400 && i8 >= 400) {
            Toom4(sArr, i2, sArr5, i9, i11, sArr6, i10, i8);
            return;
        }
        if (i11 >= 100 && i8 >= 100) {
            Toom3(sArr, i2, sArr5, i9, i11, sArr6, i10, i8);
            return;
        }
        int i17 = (-1) - (((-1) - (i8 / i11)) | ((-1) - 1));
        if (i8 % i11 != 0) {
            int i18 = i11 + i8;
            int i19 = i11 << 2;
            if (i18 >= i19) {
                ChunkedLinearMultiply(sArr, i2, sArr2, i3, sArr6, i10, i8, sArr5, i9, i11);
                return;
            }
            if (i11 + 1 != i8 && (i11 + 2 != i8 || sArr6[(i10 + i8) - 1] != 0)) {
                ChunkedLinearMultiply(sArr, i2, new short[i19], 0, sArr6, i10, i8, sArr5, i9, i11);
                return;
            }
            Arrays.fill(sArr, i2, i18 + i2, (short) 0);
            SameSizeMultiply(sArr, i2, sArr2, i3, sArr5, i9, sArr6, i10, i11);
            int i20 = i2 + i11;
            sArr[i20 + i11] = LinearMultiplyAdd(sArr, i20, sArr5, i9, sArr6[i10 + i11], i11);
            return;
        }
        if (i17 == 0) {
            SameSizeMultiply(sArr, i2, sArr2, i3, sArr5, i9, sArr6, i10, i11);
            int i21 = i11 << 1;
            System.arraycopy(sArr, i2 + i11, sArr2, i3 + i21, i11);
            for (int i22 = i21; i22 < i8; i22 += i21) {
                SameSizeMultiply(sArr2, i3 + i11 + i22, sArr2, i3, sArr5, i9, sArr6, i10 + i22, i11);
            }
            int i23 = i11;
            while (i11 < i8) {
                SameSizeMultiply(sArr, i2 + i11, sArr2, i3, sArr5, i9, sArr6, i10 + i11, i23);
                i11 += i21;
            }
            i11 = i23;
        } else {
            for (int i24 = 0; i24 < i8; i24 += i11 << 1) {
                SameSizeMultiply(sArr, i2 + i24, sArr2, i3, sArr5, i9, sArr6, i10 + i24, i11);
            }
            for (int i25 = i11; i25 < i8; i25 += i11 << 1) {
                SameSizeMultiply(sArr2, i3 + i11 + i25, sArr2, i3, sArr5, i9, sArr6, i10 + i25, i11);
            }
        }
        int i26 = i2 + i11;
        if (AddInternal(sArr, i26, sArr, i26, sArr2, i3 + (i11 << 1), i8 - i11) != 0) {
            IncrementWords(sArr, i2 + i8, i11, (short) 1);
        }
    }

    private static void AtomicMultiplyAddOpt(short[] sArr, int i2, int i3, int i4, short[] sArr2, int i5, int i6, int i7) {
        int i8;
        short s2;
        short s3;
        int i9;
        int i10 = i6;
        int i11 = (i4 - i3) & 65535;
        int i12 = i4 & 65535;
        int i13 = i3 & 65535;
        if (i12 < i13) {
            while (i10 < i7) {
                int i14 = i5 + i10;
                int i15 = sArr2[i14] & 65535;
                int i16 = (-1) - (((-1) - sArr2[i14 + 1]) | ((-1) - 65535));
                int i17 = i2 + i10;
                if (i15 > i16) {
                    int i18 = i15 - i16;
                    s2 = (short) ((i18 + 65535) - (i18 | 65535));
                    i8 = ((s2 + 65535) - (s2 | 65535)) * i11;
                } else {
                    i8 = ((i16 - i15) & 65535) * ((i13 - i12) & 65535);
                    s2 = 0;
                }
                int i19 = i15 * i13;
                int i20 = i19 >> 16;
                int i21 = ((-1) - (((-1) - sArr[i17]) | ((-1) - 65535))) + i19;
                sArr[i17] = (short) ((-1) - (((-1) - i21) | ((-1) - 65535)));
                int i22 = i16 * i12;
                int i23 = (i22 + 65535) - (i22 | 65535);
                int i24 = (i22 >> 16) & 65535;
                int i25 = i17 + 1;
                int i26 = ((i21 >> 16) & 65535) + ((-1) - (((-1) - i19) | ((-1) - 65535))) + ((-1) - (((-1) - i8) | ((-1) - 65535))) + i23 + ((-1) - (((-1) - sArr[i25]) | ((-1) - 65535)));
                sArr[i25] = (short) ((i26 + 65535) - (i26 | 65535));
                int i27 = i8 >> 16;
                int i28 = ((((((-1) - (((-1) - (i26 >> 16)) | ((-1) - 65535))) + i23) + ((i20 + 65535) - (i20 | 65535))) + ((i27 + 65535) - (i27 | 65535))) + i24) - ((-1) - (((-1) - s2) | ((-1) - 65535)));
                int i29 = i17 + 2;
                short s4 = sArr[i29];
                int i30 = i28 + ((s4 + 65535) - (s4 | 65535));
                sArr[i29] = (short) ((-1) - (((-1) - i30) | ((-1) - 65535)));
                int i31 = i17 + 3;
                short s5 = sArr[i31];
                int i32 = ((-1) - (((-1) - (i30 >> 16)) | ((-1) - 65535))) + i24 + ((s5 + 65535) - (s5 | 65535));
                sArr[i31] = (short) ((-1) - (((-1) - i32) | ((-1) - 65535)));
                if ((i32 >> 16) != 0) {
                    int i33 = i17 + 4;
                    short s6 = (short) (sArr[i33] + 1);
                    sArr[i33] = s6;
                    int i34 = i17 + 5;
                    sArr[i34] = (short) (sArr[i34] + ((short) (s6 == 0 ? 1 : 0)));
                }
                i10 += 4;
            }
            return;
        }
        while (i10 < i7) {
            int i35 = i5 + i10;
            int i36 = (-1) - (((-1) - sArr2[i35]) | ((-1) - 65535));
            short s7 = sArr2[i35 + 1];
            int i37 = (s7 + 65535) - (s7 | 65535);
            int i38 = i2 + i10;
            if (i36 >= i37) {
                int i39 = i36 - i37;
                i9 = ((i39 + 65535) - (i39 | 65535)) * i11;
                s3 = 0;
            } else {
                s3 = (short) i11;
                i9 = ((-1) - (((-1) - s3) | ((-1) - 65535))) * ((i36 - i37) & 65535);
            }
            int i40 = i36 * i13;
            int i41 = i40 >> 16;
            int i42 = (i41 + 65535) - (i41 | 65535);
            int i43 = ((-1) - (((-1) - sArr[i38]) | ((-1) - 65535))) + i40;
            sArr[i38] = (short) ((i43 + 65535) - (i43 | 65535));
            int i44 = i37 * i12;
            int i45 = (i44 + 65535) - (i44 | 65535);
            int i46 = i44 >> 16;
            int i47 = (i46 + 65535) - (i46 | 65535);
            int i48 = ((-1) - (((-1) - (i43 >> 16)) | ((-1) - 65535))) + (i40 & 65535) + (i9 & 65535) + i45;
            int i49 = i38 + 1;
            int i50 = i48 + (sArr[i49] & 65535);
            sArr[i49] = (short) ((-1) - (((-1) - i50) | ((-1) - 65535)));
            int i51 = ((((((i50 >> 16) & 65535) + i45) + i42) + ((-1) - (((-1) - (i9 >> 16)) | ((-1) - 65535)))) + i47) - ((-1) - (((-1) - s3) | ((-1) - 65535)));
            int i52 = i38 + 2;
            int i53 = i51 + (sArr[i52] & 65535);
            sArr[i52] = (short) ((-1) - (((-1) - i53) | ((-1) - 65535)));
            int i54 = i53 >> 16;
            int i55 = i38 + 3;
            short s8 = sArr[i55];
            int i56 = ((i54 + 65535) - (i54 | 65535)) + i47 + ((s8 + 65535) - (s8 | 65535));
            sArr[i55] = (short) ((-1) - (((-1) - i56) | ((-1) - 65535)));
            if ((i56 >> 16) != 0) {
                int i57 = i38 + 4;
                short s9 = (short) (sArr[i57] + 1);
                sArr[i57] = s9;
                int i58 = i38 + 5;
                sArr[i58] = (short) (sArr[i58] + ((short) (s9 == 0 ? 1 : 0)));
            }
            i10 += 4;
        }
    }

    private static void AtomicMultiplyOpt(short[] sArr, int i2, int i3, int i4, short[] sArr2, int i5, int i6, int i7) {
        int i8;
        short s2;
        short s3;
        int i9;
        int i10 = i6;
        int i11 = (i4 - i3) & 65535;
        int i12 = i4 & 65535;
        int i13 = (-1) - (((-1) - i3) | ((-1) - 65535));
        if (i12 >= i13) {
            while (i10 < i7) {
                int i14 = i5 + i10;
                short s4 = sArr2[i14];
                int i15 = (s4 + 65535) - (s4 | 65535);
                short s5 = sArr2[i14 + 1];
                int i16 = (s5 + 65535) - (s5 | 65535);
                int i17 = i2 + i10;
                if (i15 >= i16) {
                    i9 = ((-1) - (((-1) - (i15 - i16)) | ((-1) - 65535))) * i11;
                    s3 = 0;
                } else {
                    s3 = (short) i11;
                    i9 = ((-1) - (((-1) - s3) | ((-1) - 65535))) * ((-1) - (((-1) - (i15 - i16)) | ((-1) - 65535)));
                }
                int i18 = i15 * i13;
                int i19 = (i18 + 65535) - (i18 | 65535);
                sArr[i17] = (short) i19;
                int i20 = (-1) - (((-1) - (i18 >> 16)) | ((-1) - 65535));
                int i21 = i16 * i12;
                int i22 = i19 + i20 + (i9 & 65535) + ((-1) - (((-1) - i21) | ((-1) - 65535)));
                sArr[i17 + 1] = (short) i22;
                int i23 = i22 >> 16;
                int i24 = i9 >> 16;
                int i25 = ((((((i23 + 65535) - (i23 | 65535)) + i21) + i20) + ((i24 + 65535) - (i24 | 65535))) + ((i21 >> 16) & 65535)) - ((s3 + 65535) - (s3 | 65535));
                sArr[i17 + 2] = (short) i25;
                sArr[i17 + 3] = (short) (i25 >> 16);
                i10 += 4;
            }
            return;
        }
        while (i10 < i7) {
            int i26 = i5 + i10;
            int i27 = sArr2[i26] & 65535;
            int i28 = (-1) - (((-1) - sArr2[i26 + 1]) | ((-1) - 65535));
            int i29 = i2 + i10;
            if (i27 > i28) {
                s2 = (short) ((i27 - i28) & 65535);
                i8 = (s2 & 65535) * i11;
            } else {
                i8 = ((i28 - i27) & 65535) * ((i13 - i12) & 65535);
                s2 = 0;
            }
            int i30 = i27 * i13;
            int i31 = (i30 >> 16) & 65535;
            int i32 = (i30 + 65535) - (i30 | 65535);
            sArr[i29] = (short) i32;
            int i33 = i28 * i12;
            int i34 = i32 + i31 + (i8 & 65535) + ((i33 + 65535) - (i33 | 65535));
            sArr[i29 + 1] = (short) i34;
            int i35 = i34 >> 16;
            int i36 = i33 >> 16;
            int i37 = ((((((i35 + 65535) - (i35 | 65535)) + i33) + i31) + ((-1) - (((-1) - (i8 >> 16)) | ((-1) - 65535)))) + ((i36 + 65535) - (i36 | 65535))) - ((-1) - (((-1) - s2) | ((-1) - 65535)));
            sArr[i29 + 2] = (short) i37;
            sArr[i29 + 3] = (short) (i37 >> 16);
            i10 += 4;
        }
    }

    private static EInteger BL(EInteger eInteger) {
        return eInteger.isZero() ? FromInt32(0) : eInteger.GetUnsignedBitLengthAsEInteger();
    }

    private static EInteger BaseGcd(EInteger eInteger, EInteger eInteger2) {
        EInteger eIntegerAdd;
        EInteger eIntegerSubtract;
        EInteger eIntegerSubtract2;
        EInteger eIntegerSubtract3;
        if (eInteger.CanFitInInt64() && eInteger2.CanFitInInt64()) {
            return FromInt64(GcdLong(eInteger.ToInt64Unchecked(), eInteger2.ToInt64Unchecked()));
        }
        if (eInteger.compareTo(eInteger2) < 0) {
            eInteger2 = eInteger;
            eInteger = eInteger2;
        }
        while (eInteger2.wordCount > 3) {
            EInteger eIntegerSubtract4 = eInteger.GetUnsignedBitLengthAsEInteger().Subtract(48);
            EInteger eIntegerShiftRight = eInteger.ShiftRight(eIntegerSubtract4);
            EInteger eIntegerShiftRight2 = eInteger2.ShiftRight(eIntegerSubtract4);
            EInteger eIntegerFromInt32 = FromInt32(1);
            EInteger eIntegerFromInt322 = FromInt32(0);
            EInteger eInteger3 = eIntegerFromInt322;
            EInteger eInteger4 = eIntegerFromInt32;
            while (true) {
                EInteger eIntegerAdd2 = eIntegerShiftRight2.Add(eInteger3);
                EInteger eIntegerAdd3 = eIntegerShiftRight2.Add(eInteger4);
                if (eIntegerAdd2.isZero() || eIntegerAdd3.isZero()) {
                    break;
                }
                EInteger eIntegerDivide = eIntegerShiftRight.Add(eIntegerFromInt32).Divide(eIntegerAdd2);
                if (eIntegerDivide.equals(eIntegerShiftRight.Add(eIntegerFromInt322).Divide(eIntegerAdd3))) {
                    if (eIntegerDivide.CanFitInInt32() && eInteger4.CanFitInInt32() && eInteger3.CanFitInInt32()) {
                        int iToInt32Checked = eIntegerDivide.ToInt32Checked();
                        eIntegerSubtract = eIntegerShiftRight.Subtract(eIntegerShiftRight2.Multiply(iToInt32Checked));
                        long j2 = iToInt32Checked;
                        eIntegerSubtract2 = eIntegerFromInt32.Subtract(((long) eInteger3.ToInt32Checked()) * j2);
                        eIntegerSubtract3 = eIntegerFromInt322.Subtract(((long) eInteger4.ToInt32Checked()) * j2);
                    } else {
                        eIntegerSubtract = eIntegerShiftRight.Subtract(eIntegerShiftRight2.Multiply(eIntegerDivide));
                        eIntegerSubtract2 = eIntegerFromInt32.Subtract(eInteger3.Multiply(eIntegerDivide));
                        eIntegerSubtract3 = eIntegerFromInt322.Subtract(eInteger4.Multiply(eIntegerDivide));
                    }
                    eIntegerShiftRight = eIntegerShiftRight2;
                    eIntegerShiftRight2 = eIntegerSubtract;
                    eIntegerFromInt32 = eInteger3;
                    eInteger3 = eIntegerSubtract2;
                    eIntegerFromInt322 = eInteger4;
                    eInteger4 = eIntegerSubtract3;
                } else {
                    eIntegerAdd = eIntegerFromInt322.isZero() ? eInteger2 : eInteger.Multiply(eIntegerFromInt32).Add(eInteger2.Multiply(eIntegerFromInt322));
                    eInteger2 = eIntegerFromInt322.isZero() ? eInteger.Remainder(eInteger2) : eInteger.Multiply(eInteger3).Add(eInteger2.Multiply(eInteger4));
                }
            }
            eIntegerAdd = eIntegerFromInt322.isZero() ? eInteger2 : eInteger.Multiply(eIntegerFromInt32).Add(eInteger2.Multiply(eIntegerFromInt322));
            eInteger2 = eIntegerFromInt322.isZero() ? eInteger.Remainder(eInteger2) : eInteger.Multiply(eInteger3).Add(eInteger2.Multiply(eInteger4));
            eInteger = eIntegerAdd;
        }
        if (eInteger2.isZero()) {
            return eInteger;
        }
        while (true) {
            EInteger eInteger5 = eInteger;
            eInteger = eInteger2;
            if (eInteger.isZero()) {
                return eInteger5;
            }
            if (eInteger5.wordCount <= 3 && eInteger.wordCount <= 3) {
                return FromInt64(GcdLong(eInteger5.ToInt64Checked(), eInteger.ToInt64Checked()));
            }
            eInteger2 = eInteger5.Remainder(eInteger);
        }
    }

    private static void BaselineMultiply2(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4) {
        int i5 = (-1) - (((-1) - sArr2[i3]) | ((-1) - 65535));
        short s2 = sArr2[i3 + 1];
        int i6 = (s2 + 65535) - (s2 | 65535);
        int i7 = (-1) - (((-1) - sArr3[i4]) | ((-1) - 65535));
        int i8 = sArr3[i4 + 1] & 65535;
        int i9 = i5 * i7;
        sArr[i2] = (short) i9;
        short s3 = (short) ((-1) - (((-1) - (i9 >> 16)) | ((-1) - 65535)));
        int i10 = (i5 * i8) + ((s3 + 65535) - (s3 | 65535));
        short s4 = (short) i10;
        int i11 = i10 >> 16;
        int i12 = (i7 * i6) + ((s4 + 65535) - (s4 | 65535));
        sArr[i2 + 1] = (short) i12;
        int i13 = (i6 * i8) + ((i11 + 65535) - (i11 | 65535)) + ((i12 >> 16) & 65535);
        sArr[i2 + 2] = (short) i13;
        sArr[i2 + 3] = (short) (i13 >> 16);
    }

    private static void BaselineMultiply4(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4) {
        long j2 = sArr2[i3];
        long j3 = ((j2 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j2 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) | (((-1) - (((-1) - ((long) sArr2[i3 + 1])) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))) << 16);
        long j4 = (-1) - (((-1) - (((long) sArr2[i3 + 2]) & WebSocketProtocol.PAYLOAD_SHORT_MAX)) & ((-1) - ((((long) sArr2[i3 + 3]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)));
        long j5 = sArr3[i4];
        long j6 = (j5 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j5 | WebSocketProtocol.PAYLOAD_SHORT_MAX);
        long j7 = (((long) sArr3[i4 + 1]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16;
        long j8 = (j6 + j7) - (j6 & j7);
        long j9 = ((long) sArr3[i4 + 2]) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        long j10 = sArr3[i4 + 3];
        long j11 = (-1) - (((-1) - (((WebSocketProtocol.PAYLOAD_SHORT_MAX + j10) - (WebSocketProtocol.PAYLOAD_SHORT_MAX | j10)) << 16)) & ((-1) - j9));
        long j12 = j3 * j8;
        long j13 = j12 >> 32;
        long j14 = (j13 + 4294967295L) - (j13 | 4294967295L);
        sArr[i2] = (short) j12;
        sArr[i2 + 1] = (short) (j12 >> 16);
        int i5 = (int) j14;
        long j15 = j14 >> 32;
        long j16 = (j15 + 4294967295L) - (j15 | 4294967295L);
        long j17 = i5;
        long j18 = (j3 * j11) + ((j17 + 4294967295L) - (j17 | 4294967295L));
        int i6 = (int) j18;
        long j19 = j18 >> 32;
        long j20 = (j8 * j4) + (((long) i6) & 4294967295L);
        long j21 = j20 >> 32;
        sArr[i2 + 2] = (short) j20;
        sArr[i2 + 3] = (short) (j20 >> 16);
        sArr[i2 + 4] = (short) ((j4 * j11) + j16 + ((j19 + 4294967295L) - (j19 | 4294967295L)) + ((j21 + 4294967295L) - (j21 | 4294967295L)));
        sArr[i2 + 5] = (short) (r2 >> 16);
        sArr[i2 + 6] = (short) (r2 >> 32);
        sArr[i2 + 7] = (short) (r2 >> 48);
    }

    private static void BaselineMultiply8(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4) {
        int i5 = (-1) - (((-1) - sArr2[i3]) | ((-1) - 65535));
        short s2 = sArr2[i3 + 1];
        int i6 = (s2 + 65535) - (s2 | 65535);
        int i7 = (-1) - (((-1) - sArr2[i3 + 2]) | ((-1) - 65535));
        int i8 = sArr2[i3 + 3] & 65535;
        int i9 = (-1) - (((-1) - sArr2[i3 + 4]) | ((-1) - 65535));
        int i10 = sArr2[i3 + 5] & 65535;
        short s3 = sArr2[i3 + 6];
        int i11 = (s3 + 65535) - (s3 | 65535);
        int i12 = (-1) - (((-1) - sArr2[i3 + 7]) | ((-1) - 65535));
        int i13 = (-1) - (((-1) - sArr3[i4]) | ((-1) - 65535));
        int i14 = sArr3[i4 + 1] & 65535;
        int i15 = (-1) - (((-1) - sArr3[i4 + 2]) | ((-1) - 65535));
        short s4 = sArr3[i4 + 3];
        int i16 = (s4 + 65535) - (s4 | 65535);
        short s5 = sArr3[i4 + 4];
        int i17 = (s5 + 65535) - (s5 | 65535);
        int i18 = sArr3[i4 + 5] & 65535;
        int i19 = sArr3[i4 + 6] & 65535;
        int i20 = (-1) - (((-1) - sArr3[i4 + 7]) | ((-1) - 65535));
        int i21 = i5 * i13;
        sArr[i2] = (short) i21;
        int i22 = (i5 * i14) + (((short) ((-1) - (((-1) - (i21 >> 16)) | ((-1) - 65535)))) & 65535);
        int i23 = (i6 * i13) + ((-1) - (((-1) - ((short) i22)) | ((-1) - 65535)));
        int i24 = i23 >> 16;
        int i25 = ((i22 >> 16) & 65535) + ((i24 + 65535) - (i24 | 65535));
        sArr[i2 + 1] = (short) i23;
        short s6 = (short) i25;
        int i26 = i25 >> 16;
        int i27 = (i26 + 65535) - (i26 | 65535);
        int i28 = (i5 * i15) + ((s6 + 65535) - (s6 | 65535));
        short s7 = (short) i28;
        int i29 = i28 >> 16;
        int i30 = i27 + ((i29 + 65535) - (i29 | 65535));
        int i31 = (i6 * i14) + ((s7 + 65535) - (s7 | 65535));
        short s8 = (short) i31;
        int i32 = i31 >> 16;
        int i33 = (i7 * i13) + ((s8 + 65535) - (s8 | 65535));
        int i34 = i30 + ((i32 + 65535) - (i32 | 65535)) + ((i33 >> 16) & 65535);
        sArr[i2 + 2] = (short) i33;
        short s9 = (short) i34;
        int i35 = i34 >> 16;
        int i36 = (i35 + 65535) - (i35 | 65535);
        int i37 = (i5 * i16) + ((s9 + 65535) - (s9 | 65535));
        int i38 = i37 >> 16;
        int i39 = (i6 * i15) + ((-1) - (((-1) - ((short) i37)) | ((-1) - 65535)));
        short s10 = (short) i39;
        int i40 = i36 + ((i38 + 65535) - (i38 | 65535)) + ((-1) - (((-1) - (i39 >> 16)) | ((-1) - 65535)));
        int i41 = (i7 * i14) + ((s10 + 65535) - (s10 | 65535));
        int i42 = i40 + ((-1) - (((-1) - (i41 >> 16)) | ((-1) - 65535)));
        int i43 = (i8 * i13) + (((short) i41) & 65535);
        int i44 = i43 >> 16;
        int i45 = i42 + ((i44 + 65535) - (i44 | 65535));
        sArr[i2 + 3] = (short) i43;
        short s11 = (short) i45;
        int i46 = i45 >> 16;
        int i47 = (i46 + 65535) - (i46 | 65535);
        int i48 = (i5 * i17) + ((s11 + 65535) - (s11 | 65535));
        short s12 = (short) i48;
        int i49 = (i6 * i16) + ((s12 + 65535) - (s12 | 65535));
        int i50 = i47 + ((i48 >> 16) & 65535) + ((-1) - (((-1) - (i49 >> 16)) | ((-1) - 65535)));
        int i51 = (i7 * i15) + (i49 & 65535);
        int i52 = i51 >> 16;
        int i53 = i50 + ((i52 + 65535) - (i52 | 65535));
        int i54 = (i8 * i14) + ((-1) - (((-1) - i51) | ((-1) - 65535)));
        int i55 = i54 >> 16;
        int i56 = (i9 * i13) + ((-1) - (((-1) - i54) | ((-1) - 65535)));
        int i57 = i53 + ((i55 + 65535) - (i55 | 65535)) + ((-1) - (((-1) - (i56 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 4] = (short) i56;
        int i58 = (i5 * i18) + (((short) i57) & 65535);
        short s13 = (short) i58;
        int i59 = ((i57 >> 16) & 65535) + ((-1) - (((-1) - (i58 >> 16)) | ((-1) - 65535)));
        int i60 = (i6 * i17) + ((s13 + 65535) - (s13 | 65535));
        int i61 = i59 + ((-1) - (((-1) - (i60 >> 16)) | ((-1) - 65535)));
        int i62 = (i7 * i16) + (((short) i60) & 65535);
        int i63 = i62 >> 16;
        int i64 = i61 + ((i63 + 65535) - (i63 | 65535));
        int i65 = (i8 * i15) + ((-1) - (((-1) - ((short) i62)) | ((-1) - 65535)));
        int i66 = i65 >> 16;
        int i67 = (i9 * i14) + (((short) i65) & 65535);
        short s14 = (short) i67;
        int i68 = i64 + ((i66 + 65535) - (i66 | 65535)) + ((i67 >> 16) & 65535);
        int i69 = (i10 * i13) + ((s14 + 65535) - (s14 | 65535));
        int i70 = i68 + ((-1) - (((-1) - (i69 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 5] = (short) i69;
        int i71 = (i5 * i19) + (((short) i70) & 65535);
        int i72 = i71 >> 16;
        int i73 = (i6 * i18) + ((-1) - (((-1) - ((short) i71)) | ((-1) - 65535)));
        short s15 = (short) i73;
        int i74 = ((i70 >> 16) & 65535) + ((i72 + 65535) - (i72 | 65535)) + ((i73 >> 16) & 65535);
        int i75 = (i7 * i17) + ((s15 + 65535) - (s15 | 65535));
        short s16 = (short) i75;
        int i76 = i74 + ((-1) - (((-1) - (i75 >> 16)) | ((-1) - 65535)));
        int i77 = (i8 * i16) + ((s16 + 65535) - (s16 | 65535));
        short s17 = (short) i77;
        int i78 = i77 >> 16;
        int i79 = (i9 * i15) + ((s17 + 65535) - (s17 | 65535));
        short s18 = (short) i79;
        int i80 = i76 + ((i78 + 65535) - (i78 | 65535)) + ((-1) - (((-1) - (i79 >> 16)) | ((-1) - 65535)));
        int i81 = (i10 * i14) + ((s18 + 65535) - (s18 | 65535));
        int i82 = i81 >> 16;
        int i83 = (i11 * i13) + ((-1) - (((-1) - ((short) i81)) | ((-1) - 65535)));
        int i84 = i80 + ((i82 + 65535) - (i82 | 65535)) + ((-1) - (((-1) - (i83 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 6] = (short) i83;
        int i85 = (i5 * i20) + ((-1) - (((-1) - ((short) i84)) | ((-1) - 65535)));
        int i86 = ((i84 >> 16) & 65535) + ((i85 >> 16) & 65535);
        int i87 = (i6 * i19) + ((-1) - (((-1) - ((short) i85)) | ((-1) - 65535)));
        int i88 = i87 >> 16;
        int i89 = i86 + ((i88 + 65535) - (i88 | 65535));
        int i90 = (i7 * i18) + (((short) i87) & 65535);
        int i91 = i90 >> 16;
        int i92 = (i8 * i17) + ((-1) - (((-1) - ((short) i90)) | ((-1) - 65535)));
        int i93 = i89 + ((i91 + 65535) - (i91 | 65535)) + ((i92 >> 16) & 65535);
        int i94 = (i9 * i16) + (((short) i92) & 65535);
        short s19 = (short) i94;
        int i95 = i93 + ((i94 >> 16) & 65535);
        int i96 = (i10 * i15) + ((s19 + 65535) - (s19 | 65535));
        int i97 = i96 >> 16;
        int i98 = (i11 * i14) + (((short) i96) & 65535);
        int i99 = i95 + ((i97 + 65535) - (i97 | 65535)) + ((i98 >> 16) & 65535);
        int i100 = (i12 * i13) + ((-1) - (((-1) - ((short) i98)) | ((-1) - 65535)));
        int i101 = i99 + ((-1) - (((-1) - (i100 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 7] = (short) i100;
        int i102 = (i6 * i20) + ((-1) - (((-1) - ((short) i101)) | ((-1) - 65535)));
        int i103 = (i7 * i19) + ((-1) - (((-1) - ((short) i102)) | ((-1) - 65535)));
        int i104 = ((i101 >> 16) & 65535) + ((-1) - (((-1) - (i102 >> 16)) | ((-1) - 65535))) + ((-1) - (((-1) - (i103 >> 16)) | ((-1) - 65535)));
        int i105 = (i8 * i18) + ((-1) - (((-1) - ((short) i103)) | ((-1) - 65535)));
        int i106 = i105 >> 16;
        int i107 = (i9 * i17) + ((-1) - (((-1) - ((short) i105)) | ((-1) - 65535)));
        int i108 = i104 + ((i106 + 65535) - (i106 | 65535)) + ((-1) - (((-1) - (i107 >> 16)) | ((-1) - 65535)));
        int i109 = (i10 * i16) + (((short) i107) & 65535);
        int i110 = i109 >> 16;
        int i111 = (i11 * i15) + ((-1) - (((-1) - ((short) i109)) | ((-1) - 65535)));
        int i112 = i108 + ((i110 + 65535) - (i110 | 65535)) + ((-1) - (((-1) - (i111 >> 16)) | ((-1) - 65535)));
        int i113 = (i12 * i14) + ((-1) - (((-1) - ((short) i111)) | ((-1) - 65535)));
        int i114 = i112 + ((-1) - (((-1) - (i113 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 8] = (short) i113;
        int i115 = (i7 * i20) + (((short) i114) & 65535);
        int i116 = (i8 * i19) + (((short) i115) & 65535);
        short s20 = (short) i116;
        int i117 = ((-1) - (((-1) - (i114 >> 16)) | ((-1) - 65535))) + ((-1) - (((-1) - (i115 >> 16)) | ((-1) - 65535))) + ((-1) - (((-1) - (i116 >> 16)) | ((-1) - 65535)));
        int i118 = (i9 * i18) + ((s20 + 65535) - (s20 | 65535));
        short s21 = (short) i118;
        int i119 = i118 >> 16;
        int i120 = i117 + ((i119 + 65535) - (i119 | 65535));
        int i121 = (i10 * i17) + ((s21 + 65535) - (s21 | 65535));
        int i122 = i120 + ((i121 >> 16) & 65535);
        int i123 = (i11 * i16) + ((-1) - (((-1) - ((short) i121)) | ((-1) - 65535)));
        short s22 = (short) i123;
        int i124 = i122 + ((-1) - (((-1) - (i123 >> 16)) | ((-1) - 65535)));
        int i125 = (i12 * i15) + ((s22 + 65535) - (s22 | 65535));
        int i126 = i124 + ((i125 >> 16) & 65535);
        sArr[i2 + 9] = (short) i125;
        int i127 = i126 >> 16;
        int i128 = (i8 * i20) + (((short) i126) & 65535);
        short s23 = (short) i128;
        int i129 = (i9 * i19) + ((s23 + 65535) - (s23 | 65535));
        short s24 = (short) i129;
        int i130 = i129 >> 16;
        int i131 = ((i127 + 65535) - (i127 | 65535)) + ((-1) - (((-1) - (i128 >> 16)) | ((-1) - 65535))) + ((i130 + 65535) - (i130 | 65535));
        int i132 = (i10 * i18) + ((s24 + 65535) - (s24 | 65535));
        short s25 = (short) i132;
        int i133 = i132 >> 16;
        int i134 = (i11 * i17) + ((-1) - (((-1) - s25) | ((-1) - 65535)));
        int i135 = i131 + ((i133 + 65535) - (i133 | 65535)) + ((-1) - (((-1) - (i134 >> 16)) | ((-1) - 65535)));
        int i136 = (i12 * i16) + (((short) i134) & 65535);
        int i137 = i135 + ((i136 >> 16) & 65535);
        sArr[i2 + 10] = (short) i136;
        int i138 = i137 >> 16;
        int i139 = (i9 * i20) + ((-1) - (((-1) - ((short) i137)) | ((-1) - 65535)));
        int i140 = i139 >> 16;
        int i141 = (i10 * i19) + ((-1) - (((-1) - ((short) i139)) | ((-1) - 65535)));
        short s26 = (short) i141;
        int i142 = ((i138 + 65535) - (i138 | 65535)) + ((i140 + 65535) - (i140 | 65535)) + ((i141 >> 16) & 65535);
        int i143 = (i11 * i18) + ((s26 + 65535) - (s26 | 65535));
        short s27 = (short) i143;
        int i144 = i143 >> 16;
        int i145 = i142 + ((i144 + 65535) - (i144 | 65535));
        int i146 = (i12 * i17) + ((s27 + 65535) - (s27 | 65535));
        int i147 = i145 + ((-1) - (((-1) - (i146 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 11] = (short) i146;
        short s28 = (short) i147;
        int i148 = (i10 * i20) + ((s28 + 65535) - (s28 | 65535));
        int i149 = i148 >> 16;
        int i150 = ((i147 >> 16) & 65535) + ((i149 + 65535) - (i149 | 65535));
        int i151 = (i11 * i19) + (((short) i148) & 65535);
        int i152 = i151 >> 16;
        int i153 = (i12 * i18) + ((-1) - (((-1) - ((short) i151)) | ((-1) - 65535)));
        int i154 = i150 + ((i152 + 65535) - (i152 | 65535)) + ((i153 >> 16) & 65535);
        sArr[i2 + 12] = (short) i153;
        int i155 = (i11 * i20) + (((short) i154) & 65535);
        int i156 = i155 >> 16;
        int i157 = (i12 * i19) + ((-1) - (((-1) - ((short) i155)) | ((-1) - 65535)));
        sArr[i2 + 13] = (short) i157;
        int i158 = (i12 * i20) + ((i154 >> 16) & 65535) + ((i156 + 65535) - (i156 | 65535)) + ((i157 >> 16) & 65535);
        sArr[i2 + 14] = (short) i158;
        sArr[i2 + 15] = (short) (i158 >> 16);
    }

    private static void BaselineSquare2(short[] sArr, int i2, short[] sArr2, int i3) {
        short s2 = sArr2[i3];
        int i4 = (s2 & 65535) * (s2 & 65535);
        sArr[i2] = (short) i4;
        int i5 = (-1) - (((-1) - (i4 >> 16)) | ((-1) - 65535));
        int i6 = i3 + 1;
        int i7 = (sArr2[i3] & 65535) * ((-1) - (((-1) - sArr2[i6]) | ((-1) - 65535)));
        short s3 = (short) i7;
        short s4 = (short) (s3 << 1);
        int i8 = i5 + ((s4 + 65535) - (s4 | 65535));
        int i9 = i8 >> 16;
        sArr[i2 + 1] = (short) i8;
        short s5 = sArr2[i6];
        int i10 = ((s5 & 65535) * ((-1) - (((-1) - s5) | ((-1) - 65535)))) + (((i7 >> 16) & 65535) << 1) + ((s3 >> 15) & 1) + ((i9 + 65535) - (i9 | 65535));
        sArr[i2 + 2] = (short) i10;
        sArr[i2 + 3] = (short) (i10 >> 16);
    }

    private static void BaselineSquare4(short[] sArr, int i2, short[] sArr2, int i3) {
        short s2 = sArr2[i3];
        int i4 = ((s2 + 65535) - (s2 | 65535)) * ((s2 + 65535) - (s2 | 65535));
        sArr[i2] = (short) i4;
        int i5 = (i4 >> 16) & 65535;
        int i6 = i3 + 1;
        int i7 = ((-1) - (((-1) - sArr2[i3]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i6]) | ((-1) - 65535)));
        short s3 = (short) i7;
        int i8 = i7 >> 16;
        int i9 = i5 + (((short) (s3 << 1)) & 65535);
        int i10 = (((i8 + 65535) - (i8 | 65535)) << 1) + ((-1) - (((-1) - (s3 >> 15)) | ((-1) - 1))) + ((-1) - (((-1) - (i9 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 1] = (short) i9;
        int i11 = i3 + 2;
        int i12 = (sArr2[i3] & 65535) * ((-1) - (((-1) - sArr2[i11]) | ((-1) - 65535)));
        short s4 = (short) i12;
        int i13 = (((-1) - (((-1) - (i12 >> 16)) | ((-1) - 65535))) << 1) + ((-1) - (((-1) - (s4 >> 15)) | ((-1) - 1)));
        short s5 = (short) (s4 << 1);
        short s6 = sArr2[i6];
        int i14 = ((s6 & 65535) * ((s6 + 65535) - (s6 | 65535))) + ((s5 + 65535) - (s5 | 65535));
        short s7 = (short) i14;
        int i15 = i14 >> 16;
        int i16 = i13 + ((i15 + 65535) - (i15 | 65535));
        int i17 = i10 + (s7 & 65535);
        int i18 = i17 >> 16;
        int i19 = i16 + ((i18 + 65535) - (i18 | 65535));
        sArr[i2 + 2] = (short) i17;
        short s8 = sArr2[i3];
        int i20 = i3 + 3;
        short s9 = sArr2[i20];
        int i21 = ((s8 + 65535) - (s8 | 65535)) * ((s9 + 65535) - (s9 | 65535));
        int i22 = i21 >> 16;
        int i23 = ((sArr2[i6] & 65535) * ((-1) - (((-1) - sArr2[i11]) | ((-1) - 65535)))) + ((-1) - (((-1) - ((short) i21)) | ((-1) - 65535)));
        short s10 = (short) i23;
        int i24 = i23 >> 16;
        int i25 = s10 >> 15;
        int i26 = ((((i22 + 65535) - (i22 | 65535)) + ((i24 + 65535) - (i24 | 65535))) << 1) + ((i25 + 1) - (i25 | 1));
        short s11 = (short) (s10 << 1);
        int i27 = i19 + ((s11 + 65535) - (s11 | 65535));
        int i28 = i26 + ((i27 >> 16) & 65535);
        sArr[i2 + 3] = (short) i27;
        int i29 = (-1) - (((-1) - sArr2[i6]) | ((-1) - 65535));
        short s12 = sArr2[i20];
        int i30 = i29 * ((s12 + 65535) - (s12 | 65535));
        short s13 = (short) i30;
        int i31 = i30 >> 16;
        int i32 = s13 >> 15;
        int i33 = (((i31 + 65535) - (i31 | 65535)) << 1) + ((i32 + 1) - (i32 | 1));
        short s14 = sArr2[i11];
        int i34 = ((s14 & 65535) * ((s14 + 65535) - (s14 | 65535))) + ((-1) - (((-1) - ((short) (s13 << 1))) | ((-1) - 65535)));
        int i35 = i28 + ((-1) - (((-1) - ((short) i34)) | ((-1) - 65535)));
        int i36 = i35 >> 16;
        int i37 = i33 + ((-1) - (((-1) - (i34 >> 16)) | ((-1) - 65535))) + ((i36 + 65535) - (i36 | 65535));
        sArr[i2 + 4] = (short) i35;
        int i38 = (sArr2[i11] & 65535) * (sArr2[i20] & 65535);
        short s15 = (short) i38;
        int i39 = s15 >> 15;
        int i40 = i37 + ((-1) - (((-1) - ((short) (s15 << 1))) | ((-1) - 65535)));
        sArr[i2 + 5] = (short) i40;
        short s16 = sArr2[i20];
        int i41 = ((s16 & 65535) * (s16 & 65535)) + (((i38 >> 16) & 65535) << 1) + ((i39 + 1) - (i39 | 1)) + ((i40 >> 16) & 65535);
        sArr[i2 + 6] = (short) i41;
        sArr[i2 + 7] = (short) (i41 >> 16);
    }

    private static void BaselineSquare8(short[] sArr, int i2, short[] sArr2, int i3) {
        short s2 = sArr2[i3];
        int i4 = ((-1) - (((-1) - s2) | ((-1) - 65535))) * ((s2 + 65535) - (s2 | 65535));
        sArr[i2] = (short) i4;
        int i5 = i4 >> 16;
        int i6 = (-1) - (((-1) - sArr2[i3]) | ((-1) - 65535));
        int i7 = i3 + 1;
        short s3 = sArr2[i7];
        int i8 = i6 * ((s3 + 65535) - (s3 | 65535));
        short s4 = (short) i8;
        int i9 = i8 >> 16;
        int i10 = (((i9 + 65535) - (i9 | 65535)) << 1) + ((-1) - (((-1) - (s4 >> 15)) | ((-1) - 1)));
        int i11 = ((i5 + 65535) - (i5 | 65535)) + ((-1) - (((-1) - ((short) (s4 << 1))) | ((-1) - 65535)));
        int i12 = i11 >> 16;
        int i13 = i10 + ((i12 + 65535) - (i12 | 65535));
        sArr[i2 + 1] = (short) i11;
        int i14 = i3 + 2;
        int i15 = (sArr2[i3] & 65535) * (sArr2[i14] & 65535);
        short s5 = (short) i15;
        int i16 = i15 >> 16;
        int i17 = s5 >> 15;
        int i18 = (((i16 + 65535) - (i16 | 65535)) << 1) + ((i17 + 1) - (i17 | 1));
        short s6 = sArr2[i7];
        int i19 = (((s6 + 65535) - (s6 | 65535)) * (s6 & 65535)) + (((short) (s5 << 1)) & 65535);
        int i20 = i13 + (((short) i19) & 65535);
        int i21 = i18 + ((-1) - (((-1) - (i19 >> 16)) | ((-1) - 65535))) + ((i20 >> 16) & 65535);
        sArr[i2 + 2] = (short) i20;
        int i22 = i3 + 3;
        int i23 = (sArr2[i3] & 65535) * ((-1) - (((-1) - sArr2[i22]) | ((-1) - 65535)));
        int i24 = (-1) - (((-1) - (i23 >> 16)) | ((-1) - 65535));
        short s7 = sArr2[i7];
        int i25 = (((s7 + 65535) - (s7 | 65535)) * ((-1) - (((-1) - sArr2[i14]) | ((-1) - 65535)))) + (((short) i23) & 65535);
        short s8 = (short) i25;
        int i26 = i21 + (((short) (s8 << 1)) & 65535);
        int i27 = i26 >> 16;
        int i28 = ((i24 + ((-1) - (((-1) - (i25 >> 16)) | ((-1) - 65535)))) << 1) + ((-1) - (((-1) - (s8 >> 15)) | ((-1) - 1))) + ((i27 + 65535) - (i27 | 65535));
        sArr[i2 + 3] = (short) i26;
        int i29 = i3 + 4;
        int i30 = (sArr2[i3] & 65535) * (sArr2[i29] & 65535);
        short s9 = (short) i30;
        int i31 = (i30 >> 16) & 65535;
        int i32 = sArr2[i7] & 65535;
        short s10 = sArr2[i22];
        int i33 = (i32 * ((s10 + 65535) - (s10 | 65535))) + (s9 & 65535);
        short s11 = (short) i33;
        int i34 = (i31 + ((-1) - (((-1) - (i33 >> 16)) | ((-1) - 65535)))) << 1;
        int i35 = s11 >> 15;
        int i36 = i34 + ((i35 + 1) - (i35 | 1));
        short s12 = sArr2[i14];
        int i37 = (((s12 + 65535) - (s12 | 65535)) * ((s12 + 65535) - (s12 | 65535))) + (((short) (s11 << 1)) & 65535);
        short s13 = (short) i37;
        int i38 = i37 >> 16;
        int i39 = i28 + ((-1) - (((-1) - s13) | ((-1) - 65535)));
        int i40 = i36 + ((i38 + 65535) - (i38 | 65535)) + ((-1) - (((-1) - (i39 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 4] = (short) i39;
        int i41 = i3 + 5;
        int i42 = ((-1) - (((-1) - sArr2[i3]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i41]) | ((-1) - 65535)));
        int i43 = (i42 >> 16) & 65535;
        short s14 = sArr2[i7];
        int i44 = (((s14 + 65535) - (s14 | 65535)) * (sArr2[i29] & 65535)) + ((-1) - (((-1) - ((short) i42)) | ((-1) - 65535)));
        int i45 = i43 + ((-1) - (((-1) - (i44 >> 16)) | ((-1) - 65535)));
        short s15 = sArr2[i14];
        short s16 = sArr2[i22];
        int i46 = (((s15 + 65535) - (s15 | 65535)) * ((s16 + 65535) - (s16 | 65535))) + ((-1) - (((-1) - ((short) i44)) | ((-1) - 65535)));
        short s17 = (short) i46;
        int i47 = i46 >> 16;
        int i48 = ((i45 + ((i47 + 65535) - (i47 | 65535))) << 1) + ((s17 >> 15) & 1);
        int i49 = i40 + (((short) (s17 << 1)) & 65535);
        int i50 = i49 >> 16;
        int i51 = i48 + ((i50 + 65535) - (i50 | 65535));
        sArr[i2 + 5] = (short) i49;
        int i52 = i3 + 6;
        int i53 = ((-1) - (((-1) - sArr2[i3]) | ((-1) - 65535))) * (sArr2[i52] & 65535);
        short s18 = (short) i53;
        int i54 = (i53 >> 16) & 65535;
        short s19 = sArr2[i7];
        short s20 = sArr2[i41];
        int i55 = (((s19 + 65535) - (s19 | 65535)) * ((s20 + 65535) - (s20 | 65535))) + ((-1) - (((-1) - s18) | ((-1) - 65535)));
        short s21 = (short) i55;
        int i56 = i55 >> 16;
        int i57 = (((-1) - (((-1) - sArr2[i14]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i29]) | ((-1) - 65535)))) + ((s21 + 65535) - (s21 | 65535));
        short s22 = (short) i57;
        int i58 = ((i54 + ((i56 + 65535) - (i56 | 65535))) + ((-1) - (((-1) - (i57 >> 16)) | ((-1) - 65535)))) << 1;
        int i59 = s22 >> 15;
        int i60 = i58 + ((i59 + 1) - (i59 | 1));
        short s23 = sArr2[i22];
        int i61 = (((s23 + 65535) - (s23 | 65535)) * ((-1) - (((-1) - s23) | ((-1) - 65535)))) + (((short) (s22 << 1)) & 65535);
        int i62 = i61 >> 16;
        int i63 = i60 + ((i62 + 65535) - (i62 | 65535));
        int i64 = i51 + (((short) i61) & 65535);
        int i65 = i64 >> 16;
        int i66 = i63 + ((i65 + 65535) - (i65 | 65535));
        sArr[i2 + 6] = (short) i64;
        short s24 = sArr2[i3];
        int i67 = i3 + 7;
        int i68 = ((s24 + 65535) - (s24 | 65535)) * (sArr2[i67] & 65535);
        int i69 = (((-1) - (((-1) - sArr2[i7]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i52]) | ((-1) - 65535)))) + (((short) i68) & 65535);
        short s25 = (short) i69;
        int i70 = ((-1) - (((-1) - (i68 >> 16)) | ((-1) - 65535))) + ((-1) - (((-1) - (i69 >> 16)) | ((-1) - 65535)));
        short s26 = sArr2[i14];
        int i71 = (((s26 + 65535) - (s26 | 65535)) * (sArr2[i41] & 65535)) + ((s25 + 65535) - (s25 | 65535));
        short s27 = (short) i71;
        int i72 = i71 >> 16;
        int i73 = (((-1) - (((-1) - sArr2[i22]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i29]) | ((-1) - 65535)))) + ((s27 + 65535) - (s27 | 65535));
        short s28 = (short) i73;
        int i74 = ((i70 + ((i72 + 65535) - (i72 | 65535))) + ((i73 >> 16) & 65535)) << 1;
        int i75 = s28 >> 15;
        short s29 = (short) (s28 << 1);
        int i76 = i66 + ((s29 + 65535) - (s29 | 65535));
        int i77 = i74 + ((i75 + 1) - (i75 | 1)) + ((-1) - (((-1) - (i76 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 7] = (short) i76;
        int i78 = sArr2[i7] & 65535;
        short s30 = sArr2[i67];
        int i79 = i78 * ((s30 + 65535) - (s30 | 65535));
        int i80 = (i79 >> 16) & 65535;
        short s31 = sArr2[i14];
        int i81 = (((s31 + 65535) - (s31 | 65535)) * (sArr2[i52] & 65535)) + ((-1) - (((-1) - ((short) i79)) | ((-1) - 65535)));
        int i82 = i80 + ((-1) - (((-1) - (i81 >> 16)) | ((-1) - 65535)));
        short s32 = sArr2[i22];
        int i83 = (((s32 + 65535) - (s32 | 65535)) * (sArr2[i41] & 65535)) + ((-1) - (((-1) - ((short) i81)) | ((-1) - 65535)));
        short s33 = (short) i83;
        int i84 = (i82 + ((i83 >> 16) & 65535)) << 1;
        int i85 = s33 >> 15;
        int i86 = i84 + ((i85 + 1) - (i85 | 1));
        short s34 = sArr2[i29];
        int i87 = ((s34 & 65535) * (s34 & 65535)) + ((-1) - (((-1) - ((short) (s33 << 1))) | ((-1) - 65535)));
        short s35 = (short) i87;
        int i88 = i77 + ((s35 + 65535) - (s35 | 65535));
        int i89 = i88 >> 16;
        int i90 = i86 + ((-1) - (((-1) - (i87 >> 16)) | ((-1) - 65535))) + ((i89 + 65535) - (i89 | 65535));
        sArr[i2 + 8] = (short) i88;
        short s36 = sArr2[i14];
        int i91 = ((s36 + 65535) - (s36 | 65535)) * ((-1) - (((-1) - sArr2[i67]) | ((-1) - 65535)));
        short s37 = (short) i91;
        int i92 = (i91 >> 16) & 65535;
        short s38 = sArr2[i22];
        int i93 = (((s38 + 65535) - (s38 | 65535)) * (sArr2[i52] & 65535)) + ((s37 + 65535) - (s37 | 65535));
        short s39 = (short) i93;
        int i94 = i92 + ((i93 >> 16) & 65535);
        int i95 = (((-1) - (((-1) - sArr2[i29]) | ((-1) - 65535))) * ((-1) - (((-1) - sArr2[i41]) | ((-1) - 65535)))) + ((s39 + 65535) - (s39 | 65535));
        short s40 = (short) i95;
        int i96 = i95 >> 16;
        int i97 = s40 >> 15;
        int i98 = i90 + (((short) (s40 << 1)) & 65535);
        int i99 = ((i94 + ((i96 + 65535) - (i96 | 65535))) << 1) + ((i97 + 1) - (i97 | 1)) + ((i98 >> 16) & 65535);
        sArr[i2 + 9] = (short) i98;
        short s41 = sArr2[i22];
        int i100 = ((s41 + 65535) - (s41 | 65535)) * (sArr2[i67] & 65535);
        short s42 = (short) i100;
        int i101 = (-1) - (((-1) - (i100 >> 16)) | ((-1) - 65535));
        short s43 = sArr2[i29];
        int i102 = (((s43 + 65535) - (s43 | 65535)) * (sArr2[i52] & 65535)) + ((s42 + 65535) - (s42 | 65535));
        short s44 = (short) i102;
        int i103 = ((i101 + ((i102 >> 16) & 65535)) << 1) + ((s44 >> 15) & 1);
        short s45 = (short) (s44 << 1);
        short s46 = sArr2[i41];
        int i104 = (((s46 + 65535) - (s46 | 65535)) * ((-1) - (((-1) - s46) | ((-1) - 65535)))) + ((s45 + 65535) - (s45 | 65535));
        int i105 = i104 >> 16;
        int i106 = i99 + ((-1) - (((-1) - ((short) i104)) | ((-1) - 65535)));
        int i107 = i103 + ((i105 + 65535) - (i105 | 65535)) + ((-1) - (((-1) - (i106 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 10] = (short) i106;
        short s47 = sArr2[i29];
        int i108 = ((s47 + 65535) - (s47 | 65535)) * ((-1) - (((-1) - sArr2[i67]) | ((-1) - 65535)));
        short s48 = (short) i108;
        int i109 = (-1) - (((-1) - (i108 >> 16)) | ((-1) - 65535));
        int i110 = ((sArr2[i41] & 65535) * ((-1) - (((-1) - sArr2[i52]) | ((-1) - 65535)))) + ((s48 + 65535) - (s48 | 65535));
        short s49 = (short) i110;
        int i111 = i110 >> 16;
        int i112 = s49 >> 15;
        int i113 = ((i109 + ((i111 + 65535) - (i111 | 65535))) << 1) + ((i112 + 1) - (i112 | 1));
        short s50 = (short) (s49 << 1);
        int i114 = i107 + ((s50 + 65535) - (s50 | 65535));
        int i115 = i113 + ((-1) - (((-1) - (i114 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 11] = (short) i114;
        int i116 = sArr2[i41] & 65535;
        short s51 = sArr2[i67];
        int i117 = i116 * ((s51 + 65535) - (s51 | 65535));
        short s52 = (short) i117;
        int i118 = i117 >> 16;
        int i119 = s52 >> 15;
        int i120 = (((i118 + 65535) - (i118 | 65535)) << 1) + ((i119 + 1) - (i119 | 1));
        short s53 = sArr2[i52];
        int i121 = ((s53 & 65535) * ((-1) - (((-1) - s53) | ((-1) - 65535)))) + (((short) (s52 << 1)) & 65535);
        short s54 = (short) i121;
        int i122 = i115 + ((s54 + 65535) - (s54 | 65535));
        int i123 = i122 >> 16;
        int i124 = i120 + ((-1) - (((-1) - (i121 >> 16)) | ((-1) - 65535))) + ((i123 + 65535) - (i123 | 65535));
        sArr[i2 + 12] = (short) i122;
        int i125 = (sArr2[i52] & 65535) * (sArr2[i67] & 65535);
        short s55 = (short) i125;
        int i126 = i125 >> 16;
        int i127 = s55 >> 15;
        int i128 = (((i126 + 65535) - (i126 | 65535)) << 1) + ((i127 + 1) - (i127 | 1));
        short s56 = (short) (s55 << 1);
        int i129 = i124 + ((s56 + 65535) - (s56 | 65535));
        sArr[i2 + 13] = (short) i129;
        short s57 = sArr2[i67];
        int i130 = ((s57 & 65535) * ((s57 + 65535) - (s57 | 65535))) + i128 + ((-1) - (((-1) - (i129 >> 16)) | ((-1) - 65535)));
        sArr[i2 + 14] = (short) i130;
        sArr[i2 + 15] = (short) (i130 >> 16);
    }

    private static int BitPrecision(short s2) {
        int i2;
        if (s2 == 0) {
            return 0;
        }
        if ((s2 >> 8) == 0) {
            s2 = (short) (s2 << 8);
            i2 = 8;
        } else {
            i2 = 16;
        }
        if ((s2 >> 12) == 0) {
            s2 = (short) (s2 << 4);
            i2 -= 4;
        }
        if ((s2 >> 14) == 0) {
            s2 = (short) (s2 << 2);
            i2 -= 2;
        }
        return (s2 >> 15) == 0 ? i2 - 1 : i2;
    }

    private static int BitsToWords(int i2) {
        int i3 = i2 >> 4;
        return (i2 & 15) == 0 ? i3 : i3 + 1;
    }

    private int ByteCount() {
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0;
        }
        int i3 = i2 - 1;
        short s2 = this.words[i3];
        int i4 = i3 << 1;
        return s2 == 0 ? i4 : (s2 >> 8) == 0 ? i4 + 1 : i4 + 2;
    }

    private static void ChunkedLinearMultiply(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5, short[] sArr4, int i6, int i7) {
        short[] sArr5 = sArr2;
        int i8 = i3;
        int i9 = 0;
        Arrays.fill(sArr, i2, i2 + i7, (short) 0);
        int i10 = 0;
        while (i9 < i5) {
            int i11 = i5 - i9;
            if (i11 > i7) {
                SameSizeMultiply(sArr5, i8, sArr5, i8 + i7 + i7, sArr3, i4 + i9, sArr4, i6, i7);
                int i12 = i7 + i7;
                short[] sArr6 = sArr5;
                int i13 = i8;
                sArr5 = sArr5;
                i8 = i8;
                AddUnevenSize(sArr5, i8, sArr6, i13, i12, sArr, i2 + i10, i7);
                System.arraycopy(sArr5, i8, sArr, i2 + i9, i12);
                i10 += i7;
            } else {
                AsymmetricMultiply(sArr5, i8, sArr5, i8 + i11 + i7, sArr3, i4 + i9, i11, sArr4, i6, i7);
                int i14 = i11 + i7;
                AddUnevenSize(sArr5, i8, sArr5, i8, i14, sArr, i2 + i10, i7);
                System.arraycopy(sArr5, i8, sArr, i2 + i9, i14);
            }
            i9 += i7;
        }
    }

    static short[] CleanGrow(short[] sArr, int i2) {
        if (i2 <= sArr.length) {
            return sArr;
        }
        short[] sArr2 = new short[i2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    private static int Compare(short[] sArr, int i2, short[] sArr2, int i3, int i4) {
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return 0;
            }
            int i6 = sArr[i2 + i5] & 65535;
            int i7 = (-1) - (((-1) - 65535) | ((-1) - sArr2[i3 + i5]));
            if (i6 > i7) {
                return 1;
            }
            if (i6 < i7) {
                return -1;
            }
            i4 = i5;
        }
    }

    private static int CompareWithWords1IsOneBigger(short[] sArr, int i2, short[] sArr2, int i3, int i4) {
        if (sArr[(i2 + i4) - 1] != 0) {
            return 1;
        }
        int i5 = i4 - 1;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return 0;
            }
            short s2 = sArr[i2 + i6];
            int i7 = (s2 + 65535) - (s2 | 65535);
            int i8 = 65535 & sArr2[i3 + i6];
            if (i7 > i8) {
                return 1;
            }
            if (i7 < i8) {
                return -1;
            }
            i5 = i6;
        }
    }

    private short[] Copy() {
        short[] sArr = this.words;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, this.wordCount);
        return sArr2;
    }

    static int CountWords(short[] sArr) {
        int length = sArr.length;
        while (length != 0 && sArr[length - 1] == 0) {
            length--;
        }
        return length;
    }

    static int CountWords(short[] sArr, int i2, int i3) {
        while (i3 != 0 && sArr[(i2 + i3) - 1] == 0) {
            i3--;
        }
        return i3;
    }

    private static int DecrementWords(short[] sArr, int i2, int i3, short s2) {
        short s3 = sArr[i2];
        short s4 = (short) (s3 - s2);
        sArr[i2] = s4;
        if ((s4 & 65535) <= (-1) - (((-1) - s3) | ((-1) - 65535))) {
            return 0;
        }
        for (int i4 = 1; i4 < i3; i4++) {
            int i5 = i2 + i4;
            short s5 = sArr[i5];
            sArr[i5] = (short) (s5 - 1);
            if (s5 != 0) {
                return 0;
            }
        }
        return 1;
    }

    private static short Divide32By16(int i2, short s2, boolean z2) {
        int i3 = s2 & 65535;
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = i4 >> 31;
            i4 = (i4 << 1) | ((-1) - (((-1) - (i2 >> 31)) | ((-1) - 1)));
            i2 <<= 1;
            int i7 = (i6 + i4) - (i6 & i4);
            if ((i7 >> 31) != 0 || i7 >= i3) {
                i4 -= i3;
                i2++;
            }
        }
        return (short) (z2 ? (i4 + 65535) - (i4 | 65535) : i2 & 65535);
    }

    private static void DivideThreeBlocksByTwo(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5, short[] sArr4, int i6, short[] sArr5, int i7, short[] sArr6) {
        int iIncrementWords;
        int i8 = i4 + i5;
        if (WordsCompare(sArr2, i3 + i5, i5, sArr3, i8, i5) < 0) {
            RecursiveDivideInner(sArr2, i3, sArr3, i8, sArr4, i6, sArr5, i7, i5);
            System.arraycopy(sArr5, i7, sArr6, i5 * 4, i5);
            int i9 = i5 * 5;
            Arrays.fill(sArr6, i9, i9 + i5, (short) 0);
        } else {
            for (int i10 = 0; i10 < i5; i10++) {
                sArr4[i6 + i10] = -1;
            }
            int i11 = i6 + i5;
            Arrays.fill(sArr4, i11, i11 + i5, (short) 0);
            int i12 = i5 * 4;
            System.arraycopy(sArr2, i3, sArr6, i12, i5 * 2);
            int i13 = i5 * 5;
            SubtractInternal(sArr6, i13, sArr6, i13, sArr3, i8, i5);
            IncrementWords(sArr6, i13, i5, (short) AddInternal(sArr6, i12, sArr6, i12, sArr3, i8, i5));
        }
        int i14 = i5 * 2;
        AsymmetricMultiply(sArr6, 0, sArr6, i14, sArr4, i6, i5, sArr3, i4, i5);
        int i15 = i5 * 3;
        System.arraycopy(sArr, i2, sArr6, i15, i5);
        Arrays.fill(sArr6, i14, i14 + i5, (short) 0);
        if (SubtractInternal(sArr6, i15, sArr6, i15, sArr6, 0, i15) != 0) {
            do {
                int i16 = i15;
                i15 = i15;
                iIncrementWords = IncrementWords(sArr6, i5 * 5, i5, (short) AddInternal(sArr6, i15, sArr6, i16, sArr3, i4, i14));
                DecrementWords(sArr4, i6, i14, (short) 1);
            } while (iIncrementWords == 0);
        }
        System.arraycopy(sArr6, i15, sArr5, i7, i14);
    }

    private static short DivideUnsigned(int i2, short s2) {
        return (short) ((i2 >> 31) == 0 ? i2 / (s2 & 65535) : (int) ((((long) i2) & 4294967295L) / ((long) ((s2 + 65535) - (s2 | 65535)))));
    }

    private static EInteger[] EIntegerCache(int i2, int i3) {
        EInteger[] eIntegerArr = new EInteger[(i3 - i2) + 1];
        int i4 = i2;
        while (i4 <= i3) {
            if (i4 == 0) {
                eIntegerArr[i4 - i2] = ValueZero;
            } else if (i4 == 1) {
                eIntegerArr[i4 - i2] = ValueOne;
            } else if (i4 == 10) {
                eIntegerArr[i4 - i2] = ValueTen;
            } else {
                eIntegerArr[i4 - i2] = new EInteger(1, new short[]{(short) Math.abs(i4)}, i4 < 0);
            }
            i4++;
        }
        return eIntegerArr;
    }

    private static void FastDivide(short[] sArr, short[] sArr2, int i2, short s2) {
        if (s2 == 2) {
            FastDivideAndRemainderTwo(sArr, 0, sArr2, 0, i2);
        } else if (s2 != 10) {
            FastDivideAndRemainder(sArr, 0, sArr2, 0, i2, s2);
        } else {
            FastDivideAndRemainderTen(sArr, 0, sArr2, 0, i2);
        }
    }

    private static short FastDivideAndRemainder(short[] sArr, int i2, short[] sArr2, int i3, int i4, short s2) {
        int i5;
        int iDivideUnsigned;
        int i6 = (-1) - (((-1) - s2) | ((-1) - 65535));
        int i7 = (i3 + i4) - 1;
        int i8 = (i2 + i4) - 1;
        int i9 = 0;
        if (i6 < 32768) {
            i5 = 0;
            while (i9 < i4) {
                int i10 = (-1) - (((-1) - sArr2[i7]) | ((-1) - 65535));
                int i11 = i5 << 16;
                int i12 = (i11 + i10) - (i11 & i10);
                int i13 = i12 / i6;
                sArr[i8] = (short) i13;
                i5 = i12 - (i13 * i6);
                i7--;
                i8--;
                i9++;
            }
        } else {
            i5 = 0;
            while (i9 < i4) {
                int i14 = (i5 << 16) | (sArr2[i7] & 65535);
                if ((i14 >> 31) == 0) {
                    iDivideUnsigned = i14 / i6;
                    sArr[i8] = (short) iDivideUnsigned;
                } else {
                    iDivideUnsigned = DivideUnsigned(i14, s2) & 65535;
                    sArr[i8] = (short) iDivideUnsigned;
                }
                i5 = i14 - (iDivideUnsigned * i6);
                i7--;
                i8--;
                i9++;
            }
        }
        return (short) i5;
    }

    private static short FastDivideAndRemainderTen(short[] sArr, int i2, short[] sArr2, int i3, int i4) {
        int i5;
        int i6 = (i3 + i4) - 1;
        int i7 = (i2 + i4) - 1;
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            short s2 = sArr2[i6];
            int i10 = (-1) - (((-1) - (i8 << 16)) & ((-1) - ((s2 + 65535) - (s2 | 65535))));
            if (i10 >= 81920) {
                i5 = i10 / 10;
            } else {
                int i11 = (52429 * i10) >> 19;
                i5 = (i11 + 8191) - (i11 | 8191);
            }
            sArr[i7] = (short) i5;
            i8 = i10 - (i5 * 10);
            i6--;
            i7--;
        }
        return (short) i8;
    }

    private static short FastDivideAndRemainderTwo(short[] sArr, int i2, short[] sArr2, int i3, int i4) {
        int i5 = (i3 + i4) - 1;
        int i6 = (i2 + i4) - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            short s2 = sArr2[i5];
            int i9 = (s2 + 65535) - (s2 | 65535);
            int i10 = i7 << 16;
            int i11 = (i10 + i9) - (i10 & i9);
            sArr[i6] = (short) (i11 >> 1);
            i7 = (i11 + 1) - (i11 | 1);
            i5--;
            i6--;
        }
        return (short) i7;
    }

    private static short FastRemainder(short[] sArr, int i2, short s2) {
        short sRemainderUnsigned = 0;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return sRemainderUnsigned;
            }
            sRemainderUnsigned = RemainderUnsigned((-1) - (((-1) - (sArr[i3] & 65535)) & ((-1) - (sRemainderUnsigned << 16))), s2);
            i2 = i3;
        }
    }

    public static EInteger FromBoolean(boolean z2) {
        return z2 ? ValueOne : ValueZero;
    }

    public static EInteger FromByte(byte b2) {
        return FromInt32((b2 + 255) - (b2 | 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.upokecenter.numbers.EInteger FromBytes(byte[] r14, int r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.FromBytes(byte[], int, int, boolean):com.upokecenter.numbers.EInteger");
    }

    public static EInteger FromBytes(byte[] bArr, boolean z2) {
        if (bArr != null) {
            return FromBytes(bArr, 0, bArr.length, z2);
        }
        throw new NullPointerException("bytes");
    }

    public static EInteger FromInt16(short s2) {
        return FromInt32(s2);
    }

    public static EInteger FromInt32(int i2) {
        short[] sArr;
        if (i2 >= CacheFirst && i2 <= 128) {
            return Cache[i2 - CacheFirst];
        }
        int i3 = 1;
        boolean z2 = i2 < 0;
        if ((i2 >> 15) == 0) {
            sArr = new short[2];
            if (z2) {
                i2 = -i2;
            }
            sArr[0] = (short) (i2 & 65535);
        } else if (i2 == Integer.MIN_VALUE) {
            sArr = new short[]{0, ShortCompanionObject.MIN_VALUE};
            i3 = 2;
        } else {
            if (z2) {
                i2 = -i2;
            }
            sArr = new short[]{(short) ((-1) - (((-1) - i2) | ((-1) - 65535))), (short) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 65535)))};
            if (sArr[1] != 0) {
                i3 = 2;
            }
        }
        return new EInteger(i3, sArr, z2);
    }

    public static EInteger FromInt64(long j2) {
        short[] sArr;
        long j3 = j2;
        if (j3 >= -24 && j3 <= 128) {
            return Cache[(int) (j3 - (-24))];
        }
        int i2 = 1;
        boolean z2 = j3 < 0;
        if ((j3 >> 16) == 0) {
            int i3 = (int) j3;
            if (z2) {
                i3 = -i3;
            }
            sArr = new short[]{(short) (i3 & 65535)};
        } else if ((j3 >> 31) == 0) {
            int i4 = (int) j3;
            if (z2) {
                i4 = -i4;
            }
            sArr = new short[]{(short) ((i4 + 65535) - (i4 | 65535)), (short) ((i4 >> 16) & 65535)};
            i2 = 2;
        } else if (j3 == Long.MIN_VALUE) {
            sArr = new short[]{0, 0, 0, ShortCompanionObject.MIN_VALUE};
            i2 = 4;
        } else {
            if (z2) {
                j3 = -j3;
            }
            long j4 = j3 >> 32;
            sArr = new short[]{(short) (j3 & WebSocketProtocol.PAYLOAD_SHORT_MAX), (short) ((j3 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX), (short) ((j4 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j4 | WebSocketProtocol.PAYLOAD_SHORT_MAX)), (short) ((-1) - (((-1) - (j3 >> 48)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX)))};
            i2 = 4;
            while (i2 != 0 && sArr[i2 - 1] == 0) {
                i2--;
            }
        }
        return new EInteger(i2, sArr, z2);
    }

    public static EInteger FromInt64AsUnsigned(long j2) {
        return j2 >= 0 ? FromInt64(j2) : FromInt32(1).ShiftLeft(64).Add(j2);
    }

    static EInteger FromInts(int[] iArr, int i2) {
        int i3 = i2 << 1;
        short[] sArr = new short[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = iArr[i4];
            sArr[i5] = (short) i6;
            sArr[i5 + 1] = (short) (i6 >> 16);
            i4++;
            i5 += 2;
        }
        while (i3 != 0 && sArr[i3 - 1] == 0) {
            i3--;
        }
        return i3 == 0 ? FromInt32(0) : new EInteger(i3, sArr, false);
    }

    public static EInteger FromRadixString(String str, int i2) {
        if (str != null) {
            return FromRadixSubstring(str, i2, 0, str.length());
        }
        throw new NullPointerException("str");
    }

    public static EInteger FromRadixString(byte[] bArr, int i2) {
        if (bArr != null) {
            return FromRadixSubstring(bArr, i2, 0, bArr.length);
        }
        throw new NullPointerException("bytes");
    }

    public static EInteger FromRadixString(char[] cArr, int i2) {
        if (cArr != null) {
            return FromRadixSubstring(cArr, i2, 0, cArr.length);
        }
        throw new NullPointerException("cs");
    }

    public static EInteger FromRadixSubstring(String str, int i2, int i3, int i4) {
        if (str != null) {
            return EIntegerTextString.FromRadixSubstringImpl(str, i2, i3, i4, true);
        }
        throw new NullPointerException("str");
    }

    public static EInteger FromRadixSubstring(byte[] bArr, int i2, int i3, int i4) {
        if (bArr != null) {
            return EIntegerByteArrayString.FromRadixSubstringImpl(bArr, i2, i3, i4, true);
        }
        throw new NullPointerException("bytes");
    }

    public static EInteger FromRadixSubstring(char[] cArr, int i2, int i3, int i4) {
        if (cArr != null) {
            return EIntegerCharArrayString.FromRadixSubstringImpl(cArr, i2, i3, i4, true);
        }
        throw new NullPointerException("cs");
    }

    public static EInteger FromString(String str) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        int length = str.length();
        if (length != 1) {
            return FromRadixSubstring(str, 10, 0, length);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt < '0' || cCharAt > '9') {
            throw new NumberFormatException();
        }
        return FromInt32(cCharAt - '0');
    }

    public static EInteger FromString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        int length = bArr.length;
        if (length != 1) {
            return FromRadixSubstring(bArr, 10, 0, length);
        }
        byte b2 = bArr[0];
        if (b2 < 48 || b2 > 57) {
            throw new NumberFormatException();
        }
        return FromInt32(b2 - 48);
    }

    public static EInteger FromString(char[] cArr) {
        if (cArr == null) {
            throw new NullPointerException("cs");
        }
        int length = cArr.length;
        if (length != 1) {
            return FromRadixSubstring(cArr, 10, 0, length);
        }
        char c2 = cArr[0];
        if (c2 < '0' || c2 > '9') {
            throw new NumberFormatException();
        }
        return FromInt32(c2 - '0');
    }

    public static EInteger FromSubstring(String str, int i2, int i3) {
        if (str != null) {
            return FromRadixSubstring(str, 10, i2, i3);
        }
        throw new NullPointerException("str");
    }

    public static EInteger FromSubstring(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            return FromRadixSubstring(bArr, 10, i2, i3);
        }
        throw new NullPointerException("bytes");
    }

    public static EInteger FromSubstring(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            return FromRadixSubstring(cArr, 10, i2, i3);
        }
        throw new NullPointerException("cs");
    }

    private static long GcdLong(long j2, long j3) {
        int i2 = 0;
        while (j2 != 0 && j3 != 0 && j2 != j3) {
            boolean z2 = (j2 & 1) == 0;
            boolean z3 = (1 & j3) == 0;
            if (z2 && z3) {
                i2++;
                j2 >>= 1;
            } else {
                if (!z2 || z3) {
                    if (z2 || !z3) {
                        if (j2 >= j3) {
                            j2 -= j3;
                        } else {
                            long j4 = j2;
                            j2 = (j3 - j2) >> 1;
                            j3 = j4;
                        }
                    }
                }
                j2 >>= 1;
            }
            j3 >>= 1;
        }
        return j2 == 0 ? j3 << i2 : j2 << i2;
    }

    private static void GeneralDivide(short[] sArr, int i2, int i3, short[] sArr2, int i4, int i5, short[] sArr3, int i6, short[] sArr4, int i7) {
        short[] sArr5;
        int i8;
        short[] sArr6;
        int i9;
        int i10;
        int i11;
        int i12 = i3 - i5;
        int i13 = i12 + 1;
        int i14 = i5;
        while (i14 > 0 && sArr2[(i4 + i14) - 1] == 0) {
            i14--;
        }
        int i15 = i3;
        while (i15 > 0 && sArr[(i2 + i15) - 1] == 0) {
            i15--;
        }
        int i16 = i15 - i14;
        int i17 = i16 + 1;
        int i18 = 0;
        if (sArr3 != null) {
            if (i17 < 0 || i17 >= i13) {
                Arrays.fill(sArr3, i6, Math.max(0, i13) + i6, (short) 0);
            } else {
                int i19 = i6 + i17;
                Arrays.fill(sArr3, i19, Math.max(0, i13 - i17) + i19, (short) 0);
            }
        }
        if (sArr4 != null) {
            int i20 = i7 + i14;
            Arrays.fill(sArr4, i20, (i5 - i14) + i20, (short) 0);
        }
        if (i15 < i14) {
            if (sArr3 != null) {
                Arrays.fill(sArr3, i6, Math.max(0, i13) + i6, (short) 0);
            }
            if (sArr4 != null) {
                System.arraycopy(sArr, i2, sArr4, i7, i3);
                return;
            }
            return;
        }
        if (i15 == i14) {
            int iCompare = Compare(sArr, i2, sArr2, i4, i15);
            if (iCompare == 0) {
                if (sArr3 != null) {
                    sArr3[i6] = 1;
                    int i21 = 1 + i6;
                    Arrays.fill(sArr3, i21, Math.max(0, i12) + i21, (short) 0);
                }
                if (sArr4 != null) {
                    Arrays.fill(sArr4, i7, i7 + i15, (short) 0);
                    return;
                }
                return;
            }
            if (iCompare < 0) {
                if (sArr3 != null) {
                    Arrays.fill(sArr3, i6, Math.max(0, i13) + i6, (short) 0);
                }
                if (sArr4 != null) {
                    System.arraycopy(sArr, i2, sArr4, i7, i3);
                    return;
                }
                return;
            }
        }
        if (i14 == 1) {
            short sFastDivideAndRemainder = FastDivideAndRemainder(sArr3, i6, sArr, i2, i15, sArr2[i4]);
            if (sArr4 != null) {
                sArr4[i7] = sFastDivideAndRemainder;
                return;
            }
            return;
        }
        if (i14 > 201) {
            RecursiveDivide(sArr, i2, i15, sArr2, i4, i14, sArr3, i6, sArr4, i7);
            return;
        }
        boolean z2 = true;
        short s2 = sArr2[(i4 + i14) - 1];
        if ((-1) - (((-1) - s2) | ((-1) - 32768)) != 0) {
            sArr5 = new short[i15 + 1];
            System.arraycopy(sArr, i2, sArr5, 0, i15);
            i8 = i4;
            sArr6 = sArr2;
            i9 = 0;
        } else {
            if (s2 == 0) {
                throw new IllegalStateException();
            }
            i9 = 0;
            for (int i22 = s2; (i22 + 32768) - (i22 | 32768) == 0; i22 <<= 1) {
                i9++;
            }
            i8 = i15 + 1;
            sArr6 = new short[i8 + i14];
            System.arraycopy(sArr, i2, sArr6, 0, i15);
            System.arraycopy(sArr2, i4, sArr6, i8, i14);
            ShiftWordsLeftByBits(sArr6, 0, i8, i9);
            ShiftWordsLeftByBits(sArr6, i8, i14, i9);
            sArr5 = sArr6;
            z2 = false;
        }
        int i23 = i8 + i14;
        int i24 = sArr6[i23 - 1] & 65535;
        short s3 = sArr6[i23 - 2];
        int i25 = (s3 + 65535) - (s3 | 65535);
        while (true) {
            if (i16 < 0) {
                break;
            }
            int i26 = i16 + i14;
            int i27 = sArr5[i26 - 1] & 65535;
            if (!z2 || i26 < i15) {
                i18 = (-1) - (((-1) - sArr5[i26]) | ((-1) - 65535));
            }
            int i28 = i27 + (i18 << 16);
            int i29 = (-1) - (((-1) - sArr5[i26 - 2]) | ((-1) - 65535));
            int i30 = (i28 >> 31) == 0 ? i28 / i24 : (int) ((((long) i28) & 4294967295L) / ((long) i24));
            int i31 = i28 - (i30 * i24);
            long j2 = ((long) i31) << 16;
            long j3 = ((long) i29) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j4 = (j2 + j3) - (j2 & j3);
            if ((i30 >> 16) != 0 || (((long) (i30 * i25)) & 4294967295L) > j4) {
                int i32 = i31 + i24;
                i11 = i30 - 1;
                if ((i32 >> 16) == 0) {
                    long j5 = (-1) - (((-1) - j3) & ((-1) - (((long) i32) << 16)));
                    if ((i11 >> 16) != 0 || (-1) - (((-1) - ((long) (i11 * i25))) | ((-1) - 4294967295L)) > j5) {
                        i11 = i30 - 2;
                        if (sArr4 == null && i16 == 0) {
                            if (sArr3 != null) {
                                sArr3[i6 + i16] = (short) i11;
                            }
                        }
                    }
                }
            } else {
                i11 = i30;
            }
            if (LinearMultiplySubtractMinuend1Bigger(sArr5, i16, sArr5, i16, i11 & 65535, sArr6, i8, i14) != 0) {
                int i33 = i16;
                i16 = i16;
                IncrementWords(sArr5, i26, 1, (short) AddInternal(sArr5, i16, sArr5, i33, sArr6, i8, i14));
                i11--;
            }
            if (sArr3 != null) {
                sArr3[i6 + i16] = (short) i11;
            }
            i16--;
            i18 = 0;
        }
        if (sArr4 != null) {
            if (i9 != 0) {
                i10 = 0;
                ShiftWordsRightByBits(sArr5, 0, i14 + 1, i9);
            } else {
                i10 = 0;
            }
            System.arraycopy(sArr5, i10, sArr4, i7, i14);
        }
    }

    private static short GetHighHalfAsBorrow(int i2) {
        return (short) (0 - ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 65535))));
    }

    private static int GetLowHalf(int i2) {
        return (i2 + 65535) - (i2 | 65535);
    }

    private static int GetUnsignedBitLengthEx(int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = (i3 - 1) << 4;
        if (i2 == 0) {
            return i4;
        }
        int i5 = i4 + 16;
        if ((i2 >> 8) == 0) {
            i2 <<= 8;
            i5 = i4 + 8;
        }
        if ((i2 >> 12) == 0) {
            i2 <<= 4;
            i5 -= 4;
        }
        if ((i2 >> 14) == 0) {
            i2 <<= 2;
            i5 -= 2;
        }
        return (i2 >> 15) == 0 ? i5 - 1 : i5;
    }

    static short[] GrowForCarry(short[] sArr, short s2) {
        int length = sArr.length;
        short[] sArrCleanGrow = CleanGrow(sArr, length + 1);
        sArrCleanGrow[length] = s2;
        return sArrCleanGrow;
    }

    private static EInteger[] HalfGCD(EInteger eInteger, EInteger eInteger2) {
        int i2;
        EInteger eIntegerAdd;
        EInteger eIntegerAdd2;
        if (eInteger.signum() < 0) {
            throw new IllegalStateException("doesn't satisfy !eia.isNegative()");
        }
        if (eInteger2.signum() < 0) {
            throw new IllegalStateException("doesn't satisfy !eib.isNegative()");
        }
        int i3 = 1;
        if (eInteger.isZero() || eInteger2.isZero()) {
            return new EInteger[]{eInteger, eInteger2, FromInt32(1), FromInt32(0), FromInt32(0), FromInt32(1)};
        }
        EInteger[] eIntegerArr = new EInteger[6];
        if (eInteger.CanFitInInt64() && eInteger2.CanFitInInt64()) {
            long[] jArrLHalfGCD = LHalfGCD(eInteger.ToInt64Checked(), eInteger2.ToInt64Checked());
            if (jArrLHalfGCD == null) {
                return null;
            }
            for (int i4 = 0; i4 < 6; i4++) {
                eIntegerArr[i4] = FromInt64(jArrLHalfGCD[i4]);
            }
            return eIntegerArr;
        }
        EInteger eIntegerMaxBitLength = MaxBitLength(eInteger, eInteger2);
        EInteger eIntegerMinBitLength = MinBitLength(eInteger, eInteger2);
        if (eIntegerMaxBitLength.CanFitInInt64()) {
            eIntegerMaxBitLength.ToInt64Checked();
        }
        EInteger eIntegerAdd3 = eIntegerMaxBitLength.ShiftRight(1).Add(1);
        if (eIntegerMinBitLength.compareTo(eIntegerAdd3) <= 0) {
            return new EInteger[]{eInteger, eInteger2, FromInt32(1), FromInt32(0), FromInt32(0), FromInt32(1)};
        }
        if (eIntegerMinBitLength.compareTo(eIntegerMaxBitLength.Multiply(3).ShiftRight(2).Add(2)) > 0) {
            EInteger eIntegerShiftRight = eIntegerMaxBitLength.ShiftRight(1);
            EInteger eIntegerShiftRight2 = eInteger.ShiftRight(eIntegerShiftRight);
            EInteger eIntegerLowBits = eInteger.LowBits(eIntegerShiftRight);
            EInteger eIntegerShiftRight3 = eInteger2.ShiftRight(eIntegerShiftRight);
            EInteger eIntegerLowBits2 = eInteger2.LowBits(eIntegerShiftRight);
            EInteger[] eIntegerArrHalfGCD = HalfGCD(eIntegerShiftRight2, eIntegerShiftRight3);
            if (eIntegerArrHalfGCD == null) {
                return null;
            }
            System.arraycopy(eIntegerArrHalfGCD, 0, eIntegerArr, 0, 6);
            EInteger eIntegerSubtract = eIntegerLowBits.Multiply(eIntegerArrHalfGCD[5]).Subtract(eIntegerLowBits2.Multiply(eIntegerArrHalfGCD[3]));
            EInteger eIntegerSubtract2 = eIntegerLowBits2.Multiply(eIntegerArrHalfGCD[2]).Subtract(eIntegerLowBits.Multiply(eIntegerArrHalfGCD[4]));
            eIntegerAdd = eIntegerSubtract.Add(eIntegerArrHalfGCD[0].ShiftLeft(eIntegerShiftRight));
            eIntegerAdd2 = eIntegerSubtract2.Add(eIntegerArrHalfGCD[1].ShiftLeft(eIntegerShiftRight));
            if (eIntegerAdd.signum() < 0 || eIntegerAdd2.signum() < 0) {
                throw new IllegalStateException("Internal error: oeia=" + eInteger + " oeib=" + eInteger2 + " eiah=" + eIntegerShiftRight2 + " eibh=" + eIntegerShiftRight3);
            }
            i2 = 3;
            i3 = 1;
        } else {
            EInteger eIntegerFromInt32 = FromInt32(1);
            eIntegerArr[5] = eIntegerFromInt32;
            eIntegerArr[2] = eIntegerFromInt32;
            EInteger eIntegerFromInt322 = FromInt32(0);
            eIntegerArr[4] = eIntegerFromInt322;
            i2 = 3;
            eIntegerArr[3] = eIntegerFromInt322;
            eIntegerAdd = eInteger;
            eIntegerAdd2 = eInteger2;
        }
        eIntegerArr[0] = eIntegerAdd;
        eIntegerArr[i3] = eIntegerAdd2;
        while (MaxBitLength(eIntegerArr[0], eIntegerArr[i3]).compareTo(eIntegerMaxBitLength.Multiply(i2).ShiftRight(2).Add(i3)) > 0 && BL(eIntegerArr[0].Subtract(eIntegerArr[i3])).compareTo(eIntegerAdd3) > 0) {
            if (eIntegerArr[0].signum() < 0 || eIntegerArr[i3].signum() < 0) {
                throw new IllegalStateException("Internal error: eia=" + eInteger + " oeib=" + eInteger2);
            }
            SDivStep(eIntegerArr, eIntegerAdd3);
            i3 = 1;
            i2 = 3;
        }
        EInteger eIntegerAdd4 = eIntegerArr[0];
        EInteger eIntegerAdd5 = eIntegerArr[1];
        if (MinBitLength(eIntegerAdd4, eIntegerAdd5).compareTo(eIntegerAdd3.Add(2)) > 0) {
            EInteger eIntegerAdd6 = eIntegerAdd3.Add(eIntegerAdd3).Subtract(MaxBitLength(eIntegerAdd4, eIntegerAdd5)).Add(1);
            EInteger eIntegerShiftRight4 = eIntegerAdd4.ShiftRight(eIntegerAdd6);
            EInteger eIntegerLowBits3 = eIntegerAdd4.LowBits(eIntegerAdd6);
            EInteger eIntegerShiftRight5 = eIntegerAdd5.ShiftRight(eIntegerAdd6);
            EInteger eIntegerLowBits4 = eIntegerAdd5.LowBits(eIntegerAdd6);
            EInteger[] eIntegerArrHalfGCD2 = HalfGCD(eIntegerShiftRight4, eIntegerShiftRight5);
            if (eIntegerArrHalfGCD2 == null) {
                return null;
            }
            EInteger eIntegerSubtract3 = eIntegerLowBits3.Multiply(eIntegerArrHalfGCD2[5]).Subtract(eIntegerLowBits4.Multiply(eIntegerArrHalfGCD2[3]));
            EInteger eIntegerSubtract4 = eIntegerLowBits4.Multiply(eIntegerArrHalfGCD2[2]).Subtract(eIntegerLowBits3.Multiply(eIntegerArrHalfGCD2[4]));
            eIntegerAdd4 = eIntegerSubtract3.Add(eIntegerArrHalfGCD2[0].ShiftLeft(eIntegerAdd6));
            eIntegerAdd5 = eIntegerSubtract4.Add(eIntegerArrHalfGCD2[1].ShiftLeft(eIntegerAdd6));
            if (eIntegerAdd4.signum() < 0 || eIntegerAdd5.signum() < 0) {
                throw new IllegalStateException("Internal error");
            }
            EInteger eIntegerAdd7 = eIntegerArr[2].Multiply(eIntegerArrHalfGCD2[2]).Add(eIntegerArr[3].Multiply(eIntegerArrHalfGCD2[4]));
            EInteger eIntegerAdd8 = eIntegerArr[2].Multiply(eIntegerArrHalfGCD2[3]).Add(eIntegerArr[3].Multiply(eIntegerArrHalfGCD2[5]));
            EInteger eIntegerAdd9 = eIntegerArr[4].Multiply(eIntegerArrHalfGCD2[2]).Add(eIntegerArr[5].Multiply(eIntegerArrHalfGCD2[4]));
            EInteger eIntegerAdd10 = eIntegerArr[4].Multiply(eIntegerArrHalfGCD2[3]).Add(eIntegerArr[5].Multiply(eIntegerArrHalfGCD2[5]));
            eIntegerArr[2] = eIntegerAdd7;
            eIntegerArr[3] = eIntegerAdd8;
            eIntegerArr[4] = eIntegerAdd9;
            eIntegerArr[5] = eIntegerAdd10;
        }
        eIntegerArr[0] = eIntegerAdd4;
        eIntegerArr[1] = eIntegerAdd5;
        for (char c2 = 1; BL(eIntegerArr[0].Subtract(eIntegerArr[c2])).compareTo(eIntegerAdd3) > 0; c2 = 1) {
            if (eIntegerArr[0].signum() < 0 || eIntegerArr[c2].signum() < 0) {
                throw new IllegalStateException("Internal error");
            }
            SDivStep(eIntegerArr, eIntegerAdd3);
        }
        return eIntegerArr;
    }

    static int IncrementWords(short[] sArr, int i2, int i3, short s2) {
        short s3 = sArr[i2];
        short s4 = (short) (s2 + s3);
        sArr[i2] = s4;
        if ((s4 & 65535) >= (s3 & 65535)) {
            return 0;
        }
        for (int i4 = 1; i4 < i3; i4++) {
            int i5 = i2 + i4;
            short s5 = (short) (sArr[i5] + 1);
            sArr[i5] = s5;
            if (s5 != 0) {
                return 0;
            }
        }
        return 1;
    }

    private static EInteger Interpolate(EInteger[] eIntegerArr, int[] iArr, int i2) {
        EInteger eIntegerFromInt32 = FromInt32(0);
        for (int i3 = 0; i3 < eIntegerArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                eIntegerFromInt32 = i4 == 1 ? eIntegerFromInt32.Add(eIntegerArr[i3]) : i4 == -1 ? eIntegerFromInt32.Subtract(eIntegerArr[i3]) : eIntegerFromInt32.Add(eIntegerArr[i3].Multiply(i4));
            }
        }
        return eIntegerFromInt32.Divide(i2);
    }

    private static int LBL(long j2) {
        if (j2 == 0) {
            return 0;
        }
        return NumberUtility.BitLength(Math.abs(j2));
    }

    private static long[] LHalfGCD(long j2, long j3) {
        long j4;
        long j5;
        char c2 = 0;
        if (j2 == 0 || j3 == 0) {
            return new long[]{j2, j3, 1, 0, 0, 1};
        }
        long[] jArr = new long[6];
        int iMax = Math.max(LBL(j2), LBL(j3));
        int iMin = Math.min(LBL(j2), LBL(j3));
        int i2 = iMax >> 1;
        int i3 = i2 + 1;
        if (iMin <= i3) {
            return new long[]{j2, j3, 1, 0, 0, 1};
        }
        int i4 = (iMax * 3) >> 2;
        if (iMin > i4 + 2) {
            long j6 = (1 << i2) - 1;
            long j7 = j2 & j6;
            long j8 = j3 & j6;
            long[] jArrLHalfGCD = LHalfGCD(j2 >> i2, j3 >> i2);
            if (jArrLHalfGCD == null) {
                return null;
            }
            System.arraycopy(jArrLHalfGCD, 0, jArr, 0, 6);
            long j9 = (jArrLHalfGCD[5] * j7) - (jArrLHalfGCD[3] * j8);
            long j10 = (j8 * jArrLHalfGCD[2]) - (j7 * jArrLHalfGCD[4]);
            j4 = j9 + (jArrLHalfGCD[0] << i2);
            j5 = j10 + (jArrLHalfGCD[1] << i2);
            if (j4 < 0 || j5 < 0) {
                throw new IllegalStateException("Internal error: longa=" + j2 + " olongb=" + j3);
            }
        } else {
            jArr[2] = 1;
            jArr[3] = 0;
            jArr[4] = 0;
            jArr[5] = 1;
            j4 = j2;
            j5 = j3;
        }
        jArr[0] = j4;
        jArr[1] = j5;
        for (char c3 = 1; Math.max(LBL(jArr[0]), LBL(jArr[c3])) > i4 + 1 && LBL(jArr[0] - jArr[c3]) > i3; c3 = 1) {
            if (jArr[0] < 0 || jArr[c3] < 0) {
                throw new IllegalStateException("Internal error: longa=" + j2 + " olongb=" + j3);
            }
            LSDivStep(jArr, i3);
        }
        long j11 = jArr[0];
        long j12 = jArr[1];
        if (Math.min(LBL(j11), LBL(j12)) > i2 + 3) {
            int iMax2 = ((i3 * 2) - Math.max(LBL(j11), LBL(j12))) + 1;
            long j13 = (1 << iMax2) - 1;
            long j14 = j11 >> iMax2;
            long j15 = j11 & j13;
            long j16 = j12 >> iMax2;
            long j17 = j12 & j13;
            long[] jArrLHalfGCD2 = LHalfGCD(j14, j16);
            if (jArrLHalfGCD2 == null) {
                return null;
            }
            long j18 = jArrLHalfGCD2[5];
            long j19 = jArrLHalfGCD2[3];
            long j20 = (j15 * j18) - (j17 * j19);
            long j21 = jArrLHalfGCD2[2];
            long j22 = jArrLHalfGCD2[4];
            long j23 = (j17 * j21) - (j15 * j22);
            j11 = (jArrLHalfGCD2[0] << iMax2) + j20;
            j12 = j23 + (jArrLHalfGCD2[1] << iMax2);
            if (j11 < 0 || j12 < 0) {
                throw new IllegalStateException("Internal error");
            }
            long j24 = jArr[2];
            long j25 = jArr[3];
            long j26 = jArr[4];
            long j27 = jArr[5];
            jArr[2] = (j24 * j21) + (j25 * j22);
            jArr[3] = (j24 * j19) + (j25 * j18);
            jArr[4] = (j21 * j26) + (j22 * j27);
            jArr[5] = (j26 * j19) + (j27 * j18);
            c2 = 0;
        }
        jArr[c2] = j11;
        char c4 = 1;
        jArr[1] = j12;
        while (LBL(jArr[c2] - jArr[c4]) > i3) {
            if (jArr[c2] < 0 || jArr[c4] < 0) {
                throw new IllegalStateException("Internal error");
            }
            LSDivStep(jArr, i3);
            c4 = 1;
            c2 = 0;
        }
        if (jArr[c2] < 0 || jArr[1] < 0) {
            throw new IllegalStateException("Internal error");
        }
        return jArr;
    }

    private static void LSDivStep(long[] jArr, long j2) {
        long j3 = jArr[0];
        if (j3 < 0) {
            throw new IllegalArgumentException("longam[0] (" + jArr[0] + ") is not greater or equal to 0");
        }
        long j4 = jArr[1];
        if (j4 < 0) {
            throw new IllegalArgumentException("longam[1] (" + jArr[1] + ") is not greater or equal to 0");
        }
        if (j3 > j4) {
            long j5 = j3 / j4;
            long[] jArr2 = {j5, j3 - (j5 * j4)};
            if (LBL(r16) <= j2) {
                long j6 = jArr2[0] - 1;
                jArr2[0] = j6;
                if (j6 < 0) {
                    throw new IllegalStateException();
                }
                jArr2[1] = jArr2[1] + j4;
            }
            long j7 = jArr[3];
            long j8 = jArr[2];
            long j9 = jArr2[0];
            jArr[3] = j7 + (j8 * j9);
            jArr[5] = jArr[5] + (jArr[4] * j9);
            jArr[0] = jArr2[1];
            return;
        }
        long j10 = j4 / j3;
        long[] jArr3 = {j10, j4 - (j10 * j3)};
        if (LBL(r11) <= j2) {
            long j11 = jArr3[0] - 1;
            jArr3[0] = j11;
            if (j11 < 0) {
                throw new IllegalStateException();
            }
            jArr3[1] = jArr3[1] + j3;
        }
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr3[0];
        jArr[2] = j12 + (j13 * j14);
        jArr[4] = jArr[4] + (jArr[5] * j14);
        jArr[1] = jArr3[1];
    }

    private static EInteger LeftShiftBigIntVar(EInteger eInteger, EInteger eInteger2) {
        if (eInteger.isZero()) {
            return eInteger;
        }
        while (eInteger2.signum() > 0) {
            int iToInt32Checked = eInteger2.compareTo(FromInt64(AnimationKt.MillisToNanos)) < 0 ? eInteger2.ToInt32Checked() : 1000000;
            eInteger = eInteger.ShiftLeft(iToInt32Checked);
            eInteger2 = eInteger2.Subtract(FromInt32(iToInt32Checked));
        }
        return eInteger;
    }

    private static short LinearMultiply(short[] sArr, int i2, short[] sArr2, int i3, short s2, int i4) {
        int i5 = s2 & 65535;
        short s3 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = ((sArr2[i3 + i6] & 65535) * i5) + (s3 & 65535);
            sArr[i2 + i6] = (short) i7;
            s3 = (short) (i7 >> 16);
        }
        return s3;
    }

    private static short LinearMultiplyAdd(short[] sArr, int i2, short[] sArr2, int i3, short s2, int i4) {
        int i5 = s2 & 65535;
        short s3 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i2 + i6;
            int i8 = (((-1) - (((-1) - sArr2[i3 + i6]) | ((-1) - 65535))) * i5) + (s3 & 65535) + (sArr[i7] & 65535);
            sArr[i7] = (short) i8;
            s3 = (short) (i8 >> 16);
        }
        return s3;
    }

    private static int LinearMultiplySubtractMinuend1Bigger(short[] sArr, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, int i6) {
        int i7;
        int i8 = 0;
        if (i4 == 0) {
            i7 = 0;
            while (i8 < i6) {
                int i9 = (sArr2[i3 + i8] & 65535) - i7;
                sArr[i2 + i8] = (short) i9;
                int i10 = i9 >> 31;
                i7 = (i10 + 1) - (i10 | 1);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < i6) {
                short s2 = sArr3[i5 + i8];
                int i11 = (((s2 + 65535) - (s2 | 65535)) * i4) + i7;
                int i12 = ((-1) - (((-1) - sArr2[i3 + i8]) | ((-1) - 65535))) - (i11 & 65535);
                sArr[i2 + i8] = (short) i12;
                int i13 = i12 >> 31;
                i7 = ((i11 >> 16) + ((i13 + 1) - (i13 | 1))) & 65535;
                i8++;
            }
        }
        short s3 = sArr2[i3 + i6];
        int i14 = ((s3 + 65535) - (s3 | 65535)) - i7;
        sArr[i2 + i6] = (short) i14;
        int i15 = i14 >> 31;
        return (i15 + 1) - (i15 | 1);
    }

    private static EInteger MakeEInteger(short[] sArr, int i2, int i3, int i4) {
        if (i3 >= i2) {
            return FromInt32(0);
        }
        int iMin = Math.min(i4, i2 - i3);
        while (iMin != 0 && sArr[(i3 + iMin) - 1] == 0) {
            iMin--;
        }
        if (iMin == 0) {
            return FromInt32(0);
        }
        short[] sArr2 = new short[iMin];
        System.arraycopy(sArr, i3, sArr2, 0, iMin);
        return new EInteger(iMin, sArr2, false);
    }

    public static EInteger Max(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("first");
        }
        if (eInteger2 != null) {
            return eInteger.compareTo(eInteger2) > 0 ? eInteger : eInteger2;
        }
        throw new NullPointerException("second");
    }

    private static EInteger MaxBitLength(EInteger eInteger, EInteger eInteger2) {
        return Max(BL(eInteger), BL(eInteger2));
    }

    public static EInteger MaxMagnitude(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("first");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareTo = eInteger.Abs().compareTo(eInteger2.Abs());
        return iCompareTo == 0 ? Max(eInteger, eInteger2) : iCompareTo > 0 ? eInteger : eInteger2;
    }

    public static EInteger Min(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("first");
        }
        if (eInteger2 != null) {
            return eInteger.compareTo(eInteger2) < 0 ? eInteger : eInteger2;
        }
        throw new NullPointerException("second");
    }

    private static EInteger MinBitLength(EInteger eInteger, EInteger eInteger2) {
        return Min(BL(eInteger), BL(eInteger2));
    }

    public static EInteger MinMagnitude(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("first");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("second");
        }
        int iCompareTo = eInteger.Abs().compareTo(eInteger2.Abs());
        return iCompareTo == 0 ? Min(eInteger, eInteger2) : iCompareTo < 0 ? eInteger : eInteger2;
    }

    private static void NotWords(short[] sArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = (short) (~sArr[i3]);
        }
    }

    private static void OrWords(short[] sArr, short[] sArr2, short[] sArr3, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = (short) (sArr2[i3] | sArr3[i3]);
        }
    }

    private int PositiveCompare(EInteger eInteger) {
        int i2 = this.wordCount;
        int i3 = eInteger.wordCount;
        return i2 == i3 ? Compare(this.words, 0, eInteger.words, 0, i2) : i2 > i3 ? 1 : -1;
    }

    private static void RecursiveDivide(short[] sArr, int i2, int i3, short[] sArr2, int i4, int i5, short[] sArr3, int i6, short[] sArr4, int i7) {
        int i8;
        int i9;
        int iMin;
        int i10 = 201;
        while (i10 < i5) {
            i10 <<= 1;
        }
        short[] sArr5 = new short[i10];
        int i11 = i10 - i5;
        System.arraycopy(sArr2, i4, sArr5, i11, i5);
        int i12 = i3 + i11;
        short s2 = sArr2[i5 - 1];
        short s3 = 0;
        if ((-1) - (((-1) - s2) | ((-1) - 32768)) == 0) {
            i9 = 0;
            for (int i13 = s2; (i13 + 32768) - (i13 | 32768) == 0; i13 <<= 1) {
                i9++;
            }
            int i14 = 0;
            for (int i15 = sArr[i3 - 1]; (i15 & 32768) == 0; i15 <<= 1) {
                i14++;
            }
            i8 = i14 < i9 ? 1 : 0;
            ShiftWordsLeftByBits(sArr5, i10 - i5, i5, i9);
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i16 = ((i12 + i8) + (i10 - 1)) / i10;
        short[] sArr6 = new short[i16 * i10];
        System.arraycopy(sArr, i2, sArr6, i11, i3);
        ShiftWordsLeftByBits(sArr6, i11, i3 + i8, i9);
        short[] sArr7 = new short[i10 * 5];
        int i17 = i16 - 1;
        while (i17 >= 0) {
            int i18 = i17 * i10;
            System.arraycopy(sArr6, i18, sArr7, i10, i10);
            int i19 = i10 * 3;
            int i20 = i10 << 1;
            Arrays.fill(sArr7, i19, i19 + i20, s3);
            short[] sArr8 = sArr5;
            RecursiveDivideInner(sArr7, i10, sArr8, 0, sArr7, i19, sArr7, 0, i10);
            if (sArr3 != null && (iMin = Math.min(i10, sArr3.length - i18)) > 0) {
                System.arraycopy(sArr7, i19, sArr3, i6 + i18, iMin);
            }
            s3 = 0;
            System.arraycopy(sArr7, 0, sArr7, i20, i10);
            i17--;
            sArr5 = sArr8;
        }
        if (sArr4 != null) {
            System.arraycopy(sArr7, i11, sArr4, i7, i5);
            ShiftWordsRightByBits(sArr4, i7, i5, i9);
        }
    }

    private static void RecursiveDivideInner(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, short[] sArr4, int i5, int i6) {
        if (i6 < 201 || (i6 + 1) - (i6 | 1) == 1) {
            GeneralDivide(sArr, i2, i6 * 2, sArr2, i3, i6, sArr3, i4, sArr4, i5);
            return;
        }
        int i7 = i6 >> 1;
        short[] sArr5 = new short[i7 * 10];
        Arrays.fill(sArr3, i4, (i6 * 2) + i4, (short) 0);
        Arrays.fill(sArr4, i5, i5 + i6, (short) 0);
        int i8 = i7 * 6;
        int i9 = i7 * 8;
        DivideThreeBlocksByTwo(sArr, i2 + i7, sArr, i2 + i6, sArr2, i3, i7, sArr5, i8, sArr5, i9, sArr5);
        DivideThreeBlocksByTwo(sArr, i2, sArr5, i9, sArr2, i3, i7, sArr3, i4, sArr4, i5, sArr5);
        System.arraycopy(sArr5, i8, sArr3, i4 + i7, i7);
    }

    private static void RecursiveSquare(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        if (i5 <= 10) {
            if (i5 == 2) {
                BaselineSquare2(sArr, i2, sArr3, i4);
                return;
            }
            if (i5 == 4) {
                BaselineSquare4(sArr, i2, sArr3, i4);
                return;
            } else if (i5 != 8) {
                SchoolbookSquare(sArr, i2, sArr3, i4, i5);
                return;
            } else {
                BaselineSquare8(sArr, i2, sArr3, i4);
                return;
            }
        }
        if (i5 >= 400) {
            Toom4(sArr, i2, sArr3, i4, i5, sArr3, i4, i5);
            return;
        }
        if (i5 >= 100) {
            Toom3(sArr, i2, sArr3, i4, i5, sArr3, i4, i5);
            return;
        }
        if ((i5 + 1) - (i5 | 1) != 0) {
            SameSizeMultiply(sArr, i2, sArr2, i3, sArr3, i4, sArr3, i4, i5);
            return;
        }
        int i6 = i5 >> 1;
        int i7 = i3 + i5;
        RecursiveSquare(sArr, i2, sArr2, i7, sArr3, i4, i6);
        int i8 = i2 + i5;
        int i9 = i4 + i6;
        RecursiveSquare(sArr, i8, sArr2, i7, sArr3, i9, i6);
        SameSizeMultiply(sArr2, i3, sArr2, i7, sArr3, i4, sArr3, i9, i6);
        int i10 = i2 + i6;
        IncrementWords(sArr, i8 + i6, i6, (short) (AddInternal(sArr, i10, sArr, i10, sArr2, i3, i5) + AddInternal(sArr, i10, sArr, i10, sArr2, i3, i5)));
    }

    private static short RemainderUnsigned(int i2, short s2) {
        return (i2 >> 31) == 0 ? (short) ((i2 % (s2 & 65535)) & 65535) : Divide32By16(i2, s2, true);
    }

    private static void ReverseChars(char[] cArr, int i2, int i3) {
        int i4 = i3 >> 1;
        int i5 = (i3 + i2) - 1;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = i2 + i6;
            char c2 = cArr[i7];
            cArr[i7] = cArr[i5];
            cArr[i5] = c2;
            i6++;
            i5--;
        }
    }

    private EInteger[] RootRemInternal(EInteger eInteger, boolean z2) {
        if (eInteger.compareTo(1) == 0) {
            return new EInteger[]{this, FromInt32(0)};
        }
        if (eInteger.compareTo(1) < 0) {
            throw new IllegalArgumentException("root");
        }
        if (eInteger.compareTo(2) == 0) {
            return SqrtRemInternal(z2);
        }
        if (signum() <= 0) {
            return new EInteger[]{FromInt32(0), FromInt32(0)};
        }
        if (equals(FromInt32(1))) {
            return new EInteger[]{FromInt32(1), FromInt32(0)};
        }
        EInteger eIntegerGetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        EInteger eIntegerSubtract = eInteger.Subtract(1);
        EInteger eIntegerShiftRight = ShiftRight(Max(FromInt32(0), eIntegerGetUnsignedBitLengthAsEInteger.Multiply(eIntegerSubtract).Divide(eInteger).Subtract(1)));
        if (eIntegerShiftRight.signum() > 0) {
            while (true) {
                EInteger eIntegerDivide = Divide(eIntegerShiftRight.Pow(eIntegerSubtract)).Add(eIntegerShiftRight.Multiply(eIntegerSubtract)).Divide(eInteger);
                if (eIntegerShiftRight.equals(eIntegerDivide)) {
                    eIntegerShiftRight = eIntegerDivide;
                    break;
                }
                if (eIntegerDivide.compareTo(eIntegerShiftRight) > 0) {
                    break;
                }
                eIntegerShiftRight = eIntegerDivide;
            }
        }
        if (!z2) {
            return new EInteger[]{eIntegerShiftRight, null};
        }
        EInteger eIntegerSubtract2 = Subtract(eIntegerShiftRight.Pow(eInteger));
        if (eIntegerSubtract2.signum() >= 0) {
            return new EInteger[]{eIntegerShiftRight, eIntegerSubtract2};
        }
        throw new IllegalStateException();
    }

    private static void SDivStep(EInteger[] eIntegerArr, EInteger eInteger) {
        if (eIntegerArr[0].compareTo(eIntegerArr[1]) > 0) {
            EInteger eInteger2 = eIntegerArr[0];
            EInteger eInteger3 = eIntegerArr[1];
            EInteger[] eIntegerArrDivRem = eInteger2.DivRem(eInteger3);
            if (BL(eIntegerArrDivRem[1]).compareTo(eInteger) <= 0) {
                EInteger eIntegerSubtract = eIntegerArrDivRem[0].Subtract(1);
                eIntegerArrDivRem[0] = eIntegerSubtract;
                if (eIntegerSubtract.signum() < 0) {
                    throw new IllegalStateException();
                }
                eIntegerArrDivRem[1] = eIntegerArrDivRem[1].Add(eInteger3);
            }
            eIntegerArr[3] = eIntegerArr[3].Add(eIntegerArr[2].Multiply(eIntegerArrDivRem[0]));
            eIntegerArr[5] = eIntegerArr[5].Add(eIntegerArr[4].Multiply(eIntegerArrDivRem[0]));
            eIntegerArr[0] = eIntegerArrDivRem[1];
            return;
        }
        EInteger eInteger4 = eIntegerArr[1];
        EInteger eInteger5 = eIntegerArr[0];
        EInteger[] eIntegerArrDivRem2 = eInteger4.DivRem(eInteger5);
        if (BL(eIntegerArrDivRem2[1]).compareTo(eInteger) <= 0) {
            EInteger eIntegerSubtract2 = eIntegerArrDivRem2[0].Subtract(1);
            eIntegerArrDivRem2[0] = eIntegerSubtract2;
            if (eIntegerSubtract2.signum() < 0) {
                throw new IllegalStateException();
            }
            eIntegerArrDivRem2[1] = eIntegerArrDivRem2[1].Add(eInteger5);
        }
        eIntegerArr[2] = eIntegerArr[2].Add(eIntegerArr[3].Multiply(eIntegerArrDivRem2[0]));
        eIntegerArr[4] = eIntegerArr[4].Add(eIntegerArr[5].Multiply(eIntegerArrDivRem2[0]));
        eIntegerArr[1] = eIntegerArrDivRem2[1];
    }

    private static void SameSizeMultiply(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, short[] sArr4, int i5, int i6) {
        int i7;
        int i8;
        short[] sArr5;
        int i9;
        if (i6 <= 10) {
            if (i6 == 2) {
                BaselineMultiply2(sArr, i2, sArr3, i4, sArr4, i5);
                return;
            }
            if (i6 == 4) {
                BaselineMultiply4(sArr, i2, sArr3, i4, sArr4, i5);
                return;
            } else if (i6 != 8) {
                SchoolbookMultiply(sArr, i2, sArr3, i4, i6, sArr4, i5, i6);
                return;
            } else {
                BaselineMultiply8(sArr, i2, sArr3, i4, sArr4, i5);
                return;
            }
        }
        if (i6 >= 400) {
            Toom4(sArr, i2, sArr3, i4, i6, sArr4, i5, i6);
            return;
        }
        if (i6 >= 100) {
            Toom3(sArr, i2, sArr3, i4, i6, sArr4, i5, i6);
            return;
        }
        int i10 = i6;
        while (i10 != 0 && sArr3[(i4 + i10) - 1] == 0) {
            i10--;
        }
        int i11 = i6;
        while (i11 != 0 && sArr4[(i5 + i11) - 1] == 0) {
            i11--;
        }
        if (i10 == 0 || i11 == 0) {
            Arrays.fill(sArr, i2, (i6 << 1) + i2, (short) 0);
            return;
        }
        if ((i6 & 1) == 0) {
            int i12 = i6 >> 1;
            if (i10 <= i12 && i11 <= i12) {
                int i13 = i2 + i6;
                Arrays.fill(sArr, i13, i6 + i13, (short) 0);
                if (i12 == 8) {
                    BaselineMultiply8(sArr, i2, sArr3, i4, sArr4, i5);
                    return;
                } else {
                    SameSizeMultiply(sArr, i2, sArr2, i3, sArr3, i4, sArr4, i5, i12);
                    return;
                }
            }
            int i14 = i2 + i6;
            int i15 = i14 + i12;
            int i16 = i2 + i12;
            int i17 = i3 + i6;
            int i18 = i4 + i12;
            int i19 = Compare(sArr3, i4, sArr3, i18, i12) > 0 ? 0 : i12;
            SubtractInternal(sArr, i2, sArr3, i4 + i19, sArr3, i4 + (i12 ^ i19), i12);
            int i20 = i5 + i12;
            i7 = Compare(sArr4, i5, sArr4, i20, i12) <= 0 ? i12 : 0;
            SubtractInternal(sArr, i16, sArr4, i5 + i7, sArr4, i5 + (i12 ^ i7), i12);
            SameSizeMultiply(sArr, i14, sArr2, i17, sArr3, i18, sArr4, i20, i12);
            SameSizeMultiply(sArr2, i3, sArr2, i17, sArr, i2, sArr, i16, i12);
            SameSizeMultiply(sArr, i2, sArr2, i17, sArr3, i4, sArr4, i5, i12);
            int iAddInternal = AddInternal(sArr, i14, sArr, i14, sArr, i16, i12);
            int iAddInternal2 = iAddInternal + AddInternal(sArr, i16, sArr, i14, sArr, i2, i12);
            int iAddInternal3 = iAddInternal + AddInternal(sArr, i14, sArr, i14, sArr, i15, i12);
            int iSubtractInternal = (i19 == i7 ? iAddInternal3 - SubtractInternal(sArr, i16, sArr, i16, sArr2, i3, i6) : iAddInternal3 + AddInternal(sArr, i16, sArr, i16, sArr2, i3, i6)) + IncrementWords(sArr, i14, i12, (short) iAddInternal2);
            if (iSubtractInternal != 0) {
                IncrementWords(sArr, i15, i12, (short) iSubtractInternal);
                return;
            }
            return;
        }
        int i21 = i6 >> 1;
        int i22 = i6 - i21;
        int i23 = i4 + i22;
        int i24 = CompareWithWords1IsOneBigger(sArr3, i4, sArr3, i23, i22) > 0 ? 0 : i22;
        if (i24 == 0) {
            SubtractWords1IsOneBigger(sArr, i2, sArr3, i4, sArr3, i23, i22);
        } else {
            SubtractWords2IsOneBigger(sArr, i2, sArr3, i23, sArr3, i4, i22);
        }
        int i25 = i5 + i22;
        i7 = CompareWithWords1IsOneBigger(sArr4, i5, sArr4, i25, i22) <= 0 ? i22 : 0;
        if (i7 == 0) {
            i8 = i25;
            sArr5 = sArr2;
            i9 = i3;
            SubtractWords1IsOneBigger(sArr5, i9, sArr4, i5, sArr4, i25, i22);
        } else {
            i8 = i25;
            sArr5 = sArr2;
            i9 = i3;
            SubtractWords2IsOneBigger(sArr5, i9, sArr4, i8, sArr4, i5, i22);
        }
        int i26 = i21 << 1;
        int i27 = i22 << 1;
        int i28 = i9 + i26;
        SameSizeMultiply(sArr5, i28, sArr, i2 + i26, sArr, i2, sArr5, i9, i22);
        short s2 = sArr5[i28];
        int i29 = i28 + 1;
        short s3 = sArr5[i29];
        int i30 = i2 + i27;
        SameSizeMultiply(sArr, i30, sArr, i2, sArr3, i23, sArr4, i8, i21);
        SameSizeMultiply(sArr, i2, sArr5, i9, sArr3, i4, sArr4, i5, i22);
        sArr5[i28] = s2;
        sArr5[i29] = s3;
        int i31 = i2 + i22;
        int iAddInternal4 = AddInternal(sArr, i30, sArr, i30, sArr, i31, i22);
        int iAddInternal5 = iAddInternal4 + AddInternal(sArr, i31, sArr, i30, sArr, i2, i22);
        int i32 = i30 + i22;
        int i33 = i22 - 2;
        int iAddUnevenSize = iAddInternal4 + AddUnevenSize(sArr, i30, sArr, i30, i22, sArr, i32, i33);
        int iSubtractInternal2 = (i24 == i7 ? iAddUnevenSize - SubtractInternal(sArr, i31, sArr, i31, sArr5, i28, i27) : iAddUnevenSize + AddInternal(sArr, i31, sArr, i31, sArr5, i28, i27)) + IncrementWords(sArr, i30, i22, (short) iAddInternal5);
        if (iSubtractInternal2 != 0) {
            IncrementWords(sArr, i32, i33, (short) iSubtractInternal2);
        }
    }

    private static void SchoolbookMultiply(short[] sArr, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, int i6) {
        if (i4 >= i6) {
            int i7 = (-1) - (((-1) - sArr3[i5]) | ((-1) - 65535));
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = ((sArr2[i3 + i9] & 65535) * i7) + i8;
                sArr[i2 + i9] = (short) i10;
                i8 = (i10 >> 16) & 65535;
            }
            sArr[i2 + i4] = (short) i8;
            for (int i11 = 1; i11 < i6; i11++) {
                int i12 = i2 + i11;
                int i13 = (-1) - (((-1) - sArr3[i5 + i11]) | ((-1) - 65535));
                int i14 = 0;
                int i15 = 0;
                int i16 = i12;
                while (i14 < i4) {
                    short s2 = sArr2[i3 + i14];
                    int i17 = (((s2 + 65535) - (s2 | 65535)) * i13) + i15 + ((-1) - (((-1) - sArr[i16]) | ((-1) - 65535)));
                    sArr[i16] = (short) i17;
                    i15 = (i17 >> 16) & 65535;
                    i14++;
                    i16++;
                }
                sArr[i12 + i4] = (short) i15;
            }
            return;
        }
        short s3 = sArr2[i3];
        int i18 = (s3 + 65535) - (s3 | 65535);
        int i19 = 0;
        for (int i20 = 0; i20 < i6; i20++) {
            short s4 = sArr3[i5 + i20];
            int i21 = (((s4 + 65535) - (s4 | 65535)) * i18) + i19;
            sArr[i2 + i20] = (short) i21;
            i19 = (-1) - (((-1) - (i21 >> 16)) | ((-1) - 65535));
        }
        sArr[i2 + i6] = (short) i19;
        for (int i22 = 1; i22 < i4; i22++) {
            int i23 = i2 + i22;
            int i24 = sArr2[i3 + i22] & 65535;
            int i25 = 0;
            int i26 = 0;
            int i27 = i23;
            while (i25 < i6) {
                short s5 = sArr3[i5 + i25];
                int i28 = (((s5 + 65535) - (s5 | 65535)) * i24) + i26;
                short s6 = sArr[i27];
                int i29 = i28 + ((s6 + 65535) - (s6 | 65535));
                sArr[i27] = (short) i29;
                int i30 = i29 >> 16;
                i26 = (i30 + 65535) - (i30 | 65535);
                i25++;
                i27++;
            }
            sArr[i23 + i6] = (short) i26;
        }
    }

    private static void SchoolbookMultiplySameLengthEven(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        short s2 = 65535;
        long j2 = ((long) (sArr3[i4] & 65535)) | (((-1) - (((-1) - ((long) sArr3[i4 + 1])) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))) << 16);
        long j3 = 0;
        for (int i6 = 0; i6 < i5; i6 += 2) {
            int i7 = i3 + i6;
            long j4 = sArr2[i7] & 65535;
            long j5 = (((long) sArr2[i7 + 1]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16;
            long j6 = ((j4 + j5) - (j4 & j5)) * (j3 + j2);
            int i8 = i2 + i6;
            sArr[i8] = (short) j6;
            sArr[i8 + 1] = (short) (j6 >> 16);
            long j7 = j6 >> 32;
            j3 = (4294967295L + j7) - (4294967295L | j7);
        }
        int i9 = i2 + i5;
        sArr[i9] = (short) j3;
        sArr[i9 + 1] = (short) (j3 >> 16);
        for (int i10 = 2; i10 < i5; i10 += 2) {
            int i11 = i2 + i10;
            int i12 = i4 + i10;
            long j8 = sArr3[i12] & s2;
            long j9 = sArr3[i12 + 1];
            long j10 = (-1) - (((-1) - j8) & ((-1) - (((j9 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j9 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) << 16)));
            int i13 = i11;
            int i14 = 0;
            long j11 = 0;
            while (i14 < i5) {
                int i15 = i3 + i14;
                short s3 = sArr2[i15];
                long j12 = ((-1) - (((-1) - ((long) ((s3 + s2) - (s3 | s2)))) & ((-1) - ((((long) sArr2[i15 + 1]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)))) * (j11 + j10);
                s2 = 65535;
                int i16 = i13 + 1;
                long j13 = j12 + ((long) (sArr[i13] & 65535)) + ((long) (((-1) - (((-1) - sArr[i16]) | ((-1) - 65535))) << 16));
                sArr[i13] = (short) j13;
                sArr[i16] = (short) (j13 >> 16);
                long j14 = j13 >> 32;
                j11 = (j14 + 4294967295L) - (j14 | 4294967295L);
                i14 += 2;
                i13 += 2;
            }
            int i17 = i11 + i5;
            sArr[i17] = (short) j11;
            sArr[i17 + 1] = (short) (j11 >> 16);
        }
    }

    private static void SchoolbookMultiplySameLengthOdd(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        long j2;
        short s2 = 65535;
        long j3 = (-1) - (((-1) - sArr3[i4]) | ((-1) - 65535));
        long j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
        char c2 = 16;
        long j5 = i5 > 1 ? (((long) sArr3[i4 + 1]) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16 : 0L;
        long j6 = (j3 + j5) - (j3 & j5);
        int i6 = 0;
        long j7 = 0;
        while (i6 < i5) {
            int i7 = i3 + i6;
            short s3 = sArr2[i7];
            long j8 = (s3 + s2) - (s3 | s2);
            int i8 = i6 + 1;
            if (i8 < i5) {
                long j9 = sArr2[i7 + 1];
                j8 |= (j9 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j9 | WebSocketProtocol.PAYLOAD_SHORT_MAX);
            }
            long j10 = j8 * (j7 + j6);
            int i9 = i2 + i6;
            sArr[i9] = (short) j10;
            if (i8 < i5) {
                sArr[i9 + 1] = (short) (j10 >> 16);
            }
            long j11 = j10 >> 32;
            j7 = (4294967295L + j11) - (4294967295L | j11);
            i6 += 2;
            s2 = 65535;
        }
        int i10 = i2 + i5;
        sArr[i10] = (short) j7;
        if (i5 > 1) {
            sArr[i10 + 1] = (short) (j7 >> 16);
        }
        int i11 = 2;
        while (i11 < i5) {
            int i12 = i2 + i11;
            int i13 = i4 + i11;
            long j12 = (-1) - (((-1) - sArr3[i13]) | ((-1) - 65535));
            int i14 = i11 + 1;
            if (i14 < i5) {
                long j13 = sArr3[i13 + 1];
                j12 = (-1) - (((-1) - j12) & ((-1) - (((j13 + j4) - (j13 | j4)) << c2)));
            }
            int i15 = i12;
            int i16 = 0;
            long j14 = 0;
            while (i16 < i5) {
                int i17 = i3 + i16;
                short s4 = sArr2[i17];
                long j15 = (s4 + 65535) - (s4 | 65535);
                int i18 = i16 + 1;
                if (i18 < i5) {
                    long j16 = sArr2[i17 + 1];
                    j15 |= ((j16 + j4) - (j16 | j4)) << 16;
                }
                short s5 = sArr[i15];
                long j17 = (j15 * (j14 + j12)) + ((long) ((s5 + 65535) - (s5 | 65535)));
                if (i18 < i5) {
                    int i19 = i15 + 1;
                    short s6 = sArr[i19];
                    long j18 = j17 + ((long) (((s6 + 65535) - (s6 | 65535)) << 16));
                    sArr[i15] = (short) j18;
                    sArr[i19] = (short) (j18 >> 16);
                    j2 = (j18 >> 32) & 4294967295L;
                } else {
                    sArr[i15] = (short) j17;
                    j2 = j17 >> 16;
                }
                j14 = j2;
                i16 += 2;
                i15 += 2;
                j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
            }
            int i20 = i12 + i5;
            sArr[i20] = (short) j14;
            if (i14 < i5) {
                c2 = 16;
                sArr[i20 + 1] = (short) (j14 >> 16);
            } else {
                c2 = 16;
            }
            i11 += 2;
            j4 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
        }
    }

    private static void SchoolbookSquare(short[] sArr, int i2, short[] sArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i2 + i5;
            int i7 = sArr2[i3 + i5] & 65535;
            short s2 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (((-1) - (((-1) - sArr2[i3 + i8]) | ((-1) - 65535))) * i7) + ((s2 + 65535) - (s2 | 65535));
                if (i5 != 0) {
                    i9 += sArr[i6 + i8] & 65535;
                }
                sArr[i6 + i8] = (short) i9;
                s2 = (short) (i9 >> 16);
            }
            sArr[i6 + i4] = s2;
        }
    }

    private static short ShiftWordsLeftByBits(short[] sArr, int i2, int i3, int i4) {
        int i5 = 0;
        if (i4 != 0) {
            int i6 = 16 - i4;
            int i7 = 0;
            while (i5 < i3) {
                short s2 = sArr[i2];
                sArr[i2] = (short) ((-1) - (((-1) - i7) & ((-1) - (s2 << i4))));
                i7 = ((-1) - (((-1) - 65535) | ((-1) - s2))) >> i6;
                i5++;
                i2++;
            }
            i5 = i7;
        }
        return (short) i5;
    }

    private static void ShiftWordsLeftByWords(short[] sArr, int i2, int i3, int i4) {
        int iMin = Math.min(i4, i3);
        if (iMin != 0) {
            for (int i5 = i3 - 1; i5 >= iMin; i5--) {
                int i6 = i2 + i5;
                sArr[i6] = sArr[i6 - iMin];
            }
            Arrays.fill(sArr, i2, iMin + i2, (short) 0);
        }
    }

    private static short ShiftWordsRightByBits(short[] sArr, int i2, int i3, int i4) {
        short s2 = 0;
        if (i4 != 0) {
            while (i3 > 0) {
                int i5 = (i2 + i3) - 1;
                int i6 = (-1) - (((-1) - sArr[i5]) | ((-1) - 65535));
                int i7 = (-1) - (((-1) - (i6 >> i4)) | ((-1) - 65535));
                int i8 = (s2 + 65535) - (s2 | 65535);
                sArr[i5] = (short) ((i8 + i7) - (i8 & i7));
                s2 = (short) (i6 << (16 - i4));
                i3--;
            }
        }
        return s2;
    }

    private static short ShiftWordsRightByBitsSignExtend(short[] sArr, int i2, int i3, int i4) {
        int i5 = 16 - i4;
        short s2 = (short) (65535 << i5);
        if (i4 != 0) {
            while (i3 > 0) {
                int i6 = (i2 + i3) - 1;
                int i7 = sArr[i6] & 65535;
                sArr[i6] = (short) ((-1) - (((-1) - (s2 & 65535)) & ((-1) - (i7 >> i4))));
                s2 = (short) (i7 << i5);
                i3--;
            }
        }
        return s2;
    }

    private static void ShiftWordsRightByWordsSignExtend(short[] sArr, int i2, int i3, int i4) {
        int iMin = Math.min(i4, i3);
        if (iMin != 0) {
            for (int i5 = 0; i5 + iMin < i3; i5++) {
                int i6 = i2 + i5;
                sArr[i6] = sArr[i6 + iMin];
            }
            int i7 = i2 + (i3 - iMin);
            for (int i8 = 0; i8 < iMin; i8++) {
                sArr[i7 + i8] = -1;
            }
        }
    }

    private static short[] ShortenArray(short[] sArr, int i2) {
        if (sArr.length <= 32 || i2 >= sArr.length || sArr.length - i2 < 16) {
            return sArr;
        }
        short[] sArr2 = new short[i2];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(i2, sArr.length));
        return sArr2;
    }

    private static long[] SlowSgcd(long j2, long j3) {
        long[] jArr = {j2, j3, 1, 0, 0, 1};
        int iMax = (Math.max(LBL(j2), LBL(j3)) >> 1) + 1;
        while (LBL(jArr[0] - jArr[1]) > iMax) {
            LSDivStep(jArr, iMax);
        }
        return jArr;
    }

    private static EInteger[] SlowSgcd(EInteger eInteger, EInteger eInteger2) {
        EInteger[] eIntegerArr = {eInteger, eInteger2, FromInt32(1), FromInt32(0), FromInt32(0), FromInt32(1)};
        EInteger eIntegerAdd = Max(BL(eInteger), BL(eInteger2)).ShiftRight(1).Add(1);
        while (BL(eIntegerArr[0].Subtract(eIntegerArr[1])).compareTo(eIntegerAdd) > 0) {
            SDivStep(eIntegerArr, eIntegerAdd);
        }
        return eIntegerArr;
    }

    private EInteger[] SqrtRemInternal(boolean z2) {
        EInteger eIntegerShiftLeft;
        if (signum() <= 0) {
            return new EInteger[]{FromInt32(0), FromInt32(0)};
        }
        if (equals(FromInt32(1))) {
            return new EInteger[]{FromInt32(1), FromInt32(0)};
        }
        if (CanFitInInt32()) {
            int iToInt32Checked = ToInt32Checked();
            int iToInt32Checked2 = 1 << ((GetUnsignedBitLengthAsEInteger().ToInt32Checked() + 1) / 2);
            while (true) {
                int i2 = ((iToInt32Checked / iToInt32Checked2) + iToInt32Checked2) >> 1;
                if (i2 >= iToInt32Checked2) {
                    break;
                }
                iToInt32Checked2 = i2;
            }
            if (z2) {
                return new EInteger[]{FromInt32(iToInt32Checked2), FromInt32(iToInt32Checked - (iToInt32Checked2 * iToInt32Checked2))};
            }
            return new EInteger[]{FromInt32(iToInt32Checked2), null};
        }
        EInteger eIntegerDivide = GetUnsignedBitLengthAsEInteger().Add(1).Divide(2);
        int i3 = this.wordCount;
        if (i3 < 4) {
            FromInt32(0);
            EInteger eIntegerShiftLeft2 = FromInt32(1).ShiftLeft(eIntegerDivide);
            while (true) {
                EInteger eIntegerShiftRight = Divide(eIntegerShiftLeft2).Add(eIntegerShiftLeft2).ShiftRight(1);
                if (eIntegerShiftRight == null || eIntegerShiftRight.compareTo(eIntegerShiftLeft2) >= 0) {
                    break;
                }
                eIntegerShiftLeft2 = eIntegerShiftRight;
            }
            return !z2 ? new EInteger[]{eIntegerShiftLeft2, null} : new EInteger[]{eIntegerShiftLeft2, Subtract(eIntegerShiftLeft2.Multiply(eIntegerShiftLeft2))};
        }
        int i4 = (i3 >> 2) + ((i3 & 3) > 0 ? 1 : 0);
        long j2 = i4 * 16;
        EInteger eIntegerFromInt64 = FromInt64(j2);
        long j3 = j2 * 4;
        EInteger eIntegerGetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        boolean zIsEven = eIntegerGetUnsignedBitLengthAsEInteger.isEven();
        EInteger eIntegerFromInt32 = FromInt32(0);
        if (eIntegerGetUnsignedBitLengthAsEInteger.compareTo(FromInt64(j3).Subtract(1)) < 0) {
            if (!zIsEven) {
                j3--;
            }
            eIntegerFromInt32 = FromInt64(j3).Subtract(eIntegerGetUnsignedBitLengthAsEInteger);
            eIntegerShiftLeft = ShiftLeft(eIntegerFromInt32);
        } else {
            eIntegerShiftLeft = this;
        }
        short[] sArr = eIntegerShiftLeft.words;
        short[] sArr2 = new short[i4];
        short[] sArr3 = new short[i4];
        int i5 = i4 * 2;
        short[] sArr4 = new short[i5];
        System.arraycopy(sArr, 0, sArr2, 0, i4);
        System.arraycopy(sArr, i4, sArr3, 0, i4);
        System.arraycopy(sArr, i5, sArr4, 0, i5);
        EInteger eInteger = new EInteger(CountWords(sArr2), sArr2, false);
        EInteger eInteger2 = new EInteger(CountWords(sArr3), sArr3, false);
        EInteger[] eIntegerArrSqrtRemInternal = new EInteger(CountWords(sArr4), sArr4, false).SqrtRemInternal(true);
        EInteger[] eIntegerArrDivRem = eIntegerArrSqrtRemInternal[1].ShiftLeft(eIntegerFromInt64).Add(eInteger2).DivRem(eIntegerArrSqrtRemInternal[0].ShiftLeft(1));
        EInteger eIntegerAdd = eIntegerArrSqrtRemInternal[0].ShiftLeft(eIntegerFromInt64).Add(eIntegerArrDivRem[0]);
        EInteger eIntegerAdd2 = eIntegerArrDivRem[1].ShiftLeft(eIntegerFromInt64).Add(eInteger);
        EInteger eInteger3 = eIntegerArrDivRem[0];
        EInteger eIntegerSubtract = eIntegerAdd2.Subtract(eInteger3.Multiply(eInteger3));
        if (eIntegerSubtract.signum() < 0) {
            if (z2) {
                eIntegerSubtract = eIntegerSubtract.Add(eIntegerAdd.ShiftLeft(1)).Subtract(FromInt32(1));
            }
            eIntegerAdd = eIntegerAdd.Subtract(FromInt32(1));
        }
        EInteger[] eIntegerArr = new EInteger[2];
        eIntegerArr[0] = eIntegerAdd.ShiftRight(eIntegerFromInt32.ShiftRight(1));
        if (z2) {
            if (eIntegerFromInt32.isZero()) {
                eIntegerArr[1] = eIntegerSubtract;
            } else {
                EInteger eInteger4 = eIntegerArr[0];
                eIntegerArr[1] = Subtract(eInteger4.Multiply(eInteger4));
            }
        }
        return eIntegerArr;
    }

    private static EInteger SubquadraticGCD(EInteger eInteger, EInteger eInteger2) {
        EInteger eIntegerMaxBitLength = MaxBitLength(eInteger, eInteger2);
        EInteger[] eIntegerArr = {eInteger, eInteger2};
        while (eIntegerMaxBitLength.compareTo(48) >= 0) {
            EInteger eIntegerShiftRight = eIntegerMaxBitLength.ShiftRight(1);
            EInteger eIntegerShiftRight2 = eIntegerArr[0].ShiftRight(eIntegerShiftRight);
            EInteger eIntegerLowBits = eIntegerArr[0].LowBits(eIntegerShiftRight);
            EInteger eIntegerShiftRight3 = eIntegerArr[1].ShiftRight(eIntegerShiftRight);
            EInteger eIntegerLowBits2 = eIntegerArr[1].LowBits(eIntegerShiftRight);
            EInteger[] eIntegerArrHalfGCD = HalfGCD(eIntegerShiftRight2, eIntegerShiftRight3);
            if (eIntegerArrHalfGCD == null) {
                break;
            }
            EInteger eIntegerSubtract = eIntegerLowBits.Multiply(eIntegerArrHalfGCD[5]).Subtract(eIntegerLowBits2.Multiply(eIntegerArrHalfGCD[3]));
            EInteger eIntegerSubtract2 = eIntegerLowBits2.Multiply(eIntegerArrHalfGCD[2]).Subtract(eIntegerLowBits.Multiply(eIntegerArrHalfGCD[4]));
            EInteger eIntegerAdd = eIntegerSubtract.Add(eIntegerArrHalfGCD[0].ShiftLeft(eIntegerShiftRight));
            EInteger eIntegerAdd2 = eIntegerSubtract2.Add(eIntegerArrHalfGCD[1].ShiftLeft(eIntegerShiftRight));
            if (eIntegerAdd.signum() < 0 || eIntegerAdd2.signum() < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("eia=" + eIntegerArr[0] + "\n");
                sb.append("eib=" + eIntegerArr[1] + "\n");
                for (int i2 = 0; i2 < 6; i2++) {
                    sb.append("hgcd_" + i2 + "=" + eIntegerArrHalfGCD[i2].ToRadixString(16));
                    sb.append("\n");
                }
                throw new IllegalStateException("Internal error\n" + ((Object) sb));
            }
            if (eIntegerArr[0].equals(eIntegerAdd) && eIntegerArr[1].equals(eIntegerAdd2)) {
                break;
            }
            eIntegerMaxBitLength = MaxBitLength(eIntegerAdd, eIntegerAdd2);
            eIntegerArr[0] = eIntegerAdd;
            eIntegerArr[1] = eIntegerAdd2;
        }
        return BaseGcd(eIntegerArr[0], eIntegerArr[1]);
    }

    private static int SubtractInternal(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        int i6 = i5;
        int i7 = 0;
        boolean z2 = (-1) - (((-1) - i6) | ((-1) - 1)) != 0;
        if (z2) {
            i6--;
        }
        int i8 = 0;
        while (i7 < i6) {
            short s2 = sArr3[i4];
            int i9 = sArr3[i4 + 1] & 65535;
            int i10 = sArr2[i3] & 65535;
            int i11 = (-1) - (((-1) - 65535) | ((-1) - sArr2[i3 + 1]));
            int i12 = (i10 - ((s2 + 65535) - (s2 | 65535))) - ((i8 >> 31) & 1);
            int i13 = i2 + 1;
            sArr[i2] = (short) i12;
            int i14 = i12 >> 31;
            int i15 = (i11 - i9) - ((i14 + 1) - (i14 | 1));
            i2 += 2;
            sArr[i13] = (short) i15;
            i3 += 2;
            i4 += 2;
            i7 += 2;
            i8 = i15;
        }
        if (z2) {
            int i16 = i8 >> 31;
            i8 = (((-1) - (((-1) - sArr2[i3]) | ((-1) - 65535))) - (sArr3[i4] & 65535)) - ((i16 + 1) - (i16 | 1));
            sArr[i2] = (short) i8;
        }
        return (-1) - (((-1) - (i8 >> 31)) | ((-1) - 1));
    }

    private static int SubtractWords1IsOneBigger(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        int i6 = i5 - 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = sArr2[i3] & 65535;
            short s2 = sArr3[i4];
            i8 = (i9 - ((65535 + s2) - (65535 | s2))) - ((i8 >> 31) & 1);
            sArr[i2] = (short) i8;
            i3++;
            i4++;
            i7++;
            i2++;
        }
        short s3 = sArr2[i3];
        int i10 = ((s3 + 65535) - (s3 | 65535)) - ((i8 >> 31) & 1);
        sArr[i2] = (short) i10;
        return (i10 >> 31) & 1;
    }

    private static int SubtractWords2IsOneBigger(short[] sArr, int i2, short[] sArr2, int i3, short[] sArr3, int i4, int i5) {
        int i6 = i5 - 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i8 >> 31;
            i8 = (((-1) - (((-1) - sArr2[i3]) | ((-1) - 65535))) - ((-1) - (((-1) - 65535) | ((-1) - sArr3[i4])))) - ((i9 + 1) - (i9 | 1));
            sArr[i2] = (short) i8;
            i3++;
            i4++;
            i7++;
            i2++;
        }
        short s2 = sArr3[i4];
        int i10 = 0 - (((s2 + 65535) - (s2 | 65535)) - ((-1) - (((-1) - (i8 >> 31)) | ((-1) - 1))));
        sArr[i2] = (short) i10;
        return (i10 >> 31) & 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v7, types: [short] */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [short] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    private void ToRadixStringGeneral(StringBuilder sb, int i2) {
        short s2;
        short s3;
        short s4;
        short s5;
        int i3 = this.wordCount;
        if (i3 >= 100) {
            StringBuilder sb2 = new StringBuilder();
            long j2 = (((long) estimatedHalfDigitCountPerWord[i2]) * ((long) this.wordCount)) / 16;
            EInteger[] eIntegerArrDivRem = DivRem(i2 == 10 ? NumberUtility.FindPowerOfTen(j2) : i2 == 5 ? NumberUtility.FindPowerOfFiveFromBig(FromInt64(j2)) : FromInt32(i2).Pow(FromInt64(j2)));
            eIntegerArrDivRem[0].ToRadixStringGeneral(sb, i2);
            eIntegerArrDivRem[1].ToRadixStringGeneral(sb2, i2);
            for (int length = sb2.length(); length < j2; length++) {
                sb.append('0');
            }
            sb.append(sb2.toString());
            return;
        }
        int i4 = 2;
        if (i2 != 10) {
            short[] sArr = new short[i3];
            System.arraycopy(this.words, 0, sArr, 0, i3);
            while (i3 != 0 && sArr[i3 - 1] == 0) {
                i3--;
            }
            char[] cArr = new char[(i3 << 4) + 1];
            int i5 = 0;
            while (true) {
                if (i3 == 0) {
                    break;
                }
                if (i3 == 1 && (s3 = sArr[0]) > 0 && s3 <= 32767) {
                    while (s3 != 0) {
                        int i6 = s3 / i2;
                        cArr[i5] = Digits.charAt(s3 - (i6 * i2));
                        s3 = i6;
                        i5++;
                    }
                } else if (i3 != i4 || (s2 = sArr[1]) <= 0 || s2 > Short.MAX_VALUE) {
                    int i7 = i3;
                    short s6 = 0;
                    while (true) {
                        int i8 = i7 - 1;
                        if (i7 <= 0) {
                            break;
                        }
                        int i9 = (-1) - (((-1) - ((-1) - (((-1) - sArr[i8]) | ((-1) - 65535)))) & ((-1) - (s6 << 16)));
                        int i10 = i9 / i2;
                        sArr[i8] = (short) i10;
                        s6 = (short) (i9 - (i2 * i10));
                        i7 = i8;
                    }
                    while (i3 != 0 && sArr[i3 - 1] == 0) {
                        i3--;
                    }
                    cArr[i5] = Digits.charAt(s6);
                    i5++;
                    i4 = 2;
                } else {
                    int i11 = (-1) - (((-1) - sArr[0]) | ((-1) - 65535));
                    int i12 = (s2 & 65535) << 16;
                    int i13 = (i11 + i12) - (i11 & i12);
                    while (i13 != 0) {
                        int i14 = i13 / i2;
                        cArr[i5] = Digits.charAt(i13 - (i14 * i2));
                        i13 = i14;
                        i5++;
                    }
                }
            }
            ReverseChars(cArr, 0, i5);
            sb.append(cArr, 0, i5);
            return;
        }
        if (CanFitInInt64()) {
            sb.append(FastInteger.LongToString(ToInt64Unchecked()));
            return;
        }
        int i15 = this.wordCount;
        short[] sArr2 = new short[i15];
        System.arraycopy(this.words, 0, sArr2, 0, i15);
        while (i15 != 0 && sArr2[i15 - 1] == 0) {
            i15--;
        }
        char[] cArr2 = new char[(i15 << 4) + 1];
        int i16 = 0;
        while (true) {
            if (i15 == 0) {
                break;
            }
            if (i15 == 1 && (s5 = sArr2[0]) > 0 && s5 <= 32767) {
                while (s5 != 0) {
                    int i17 = (s5 * 26215) >> 18;
                    cArr2[i16] = Digits.charAt(s5 - (i17 * 10));
                    s5 = i17;
                    i16++;
                }
            } else if (i15 != 2 || (s4 = sArr2[1]) <= 0 || s4 > Short.MAX_VALUE) {
                int i18 = i15;
                short s7 = 0;
                while (true) {
                    int i19 = i18 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    int i20 = (-1) - (((-1) - (sArr2[i19] & 65535)) & ((-1) - (s7 << 16)));
                    int i21 = i20 / 10000;
                    sArr2[i19] = (short) i21;
                    s7 = (short) (i20 - (i21 * 10000));
                    i18 = i19;
                }
                while (i15 != 0 && sArr2[i15 - 1] == 0) {
                    i15--;
                }
                int i22 = (s7 * 3277) >> 15;
                cArr2[i16] = Digits.charAt(s7 - (i22 * 10));
                int i23 = (i22 * 3277) >> 15;
                cArr2[i16 + 1] = Digits.charAt(i22 - (i23 * 10));
                int i24 = (i23 * 3277) >> 15;
                int i25 = i16 + 3;
                cArr2[i16 + 2] = Digits.charAt(i23 - (i24 * 10));
                i16 += 4;
                cArr2[i25] = Digits.charAt(i24);
            } else {
                int i26 = ((-1) - (((-1) - sArr2[0]) | ((-1) - 65535))) | (((-1) - (((-1) - s4) | ((-1) - 65535))) << 16);
                while (i26 != 0) {
                    int i27 = i26 < 81920 ? (-1) - (((-1) - ((52429 * i26) >> 19)) | ((-1) - 8191)) : i26 / 10;
                    cArr2[i16] = Digits.charAt(i26 - (i27 * 10));
                    i26 = i27;
                    i16++;
                }
            }
        }
        ReverseChars(cArr2, 0, i16);
        sb.append(cArr2, 0, i16);
    }

    private static void Toom3(short[] sArr, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, int i6) {
        EInteger eIntegerMultiply;
        EInteger eIntegerMultiply2;
        EInteger eIntegerMultiply3;
        EInteger eIntegerMultiply4;
        EInteger eIntegerMultiply5;
        EInteger eIntegerAdd;
        int iMax = Math.max(i4, i6);
        int i7 = (iMax / 3) + (((iMax % 3) + 2) / 3);
        EInteger eIntegerShiftLeft = FromInt32(i7).ShiftLeft(4);
        int i8 = i3 + i4;
        EInteger eIntegerMakeEInteger = MakeEInteger(sArr2, i8, i3, i7);
        EInteger eIntegerMakeEInteger2 = MakeEInteger(sArr2, i8, i3 + i7, i7);
        int i9 = i7 * 2;
        EInteger eIntegerMakeEInteger3 = MakeEInteger(sArr2, i8, i3 + i9, i7);
        int i10 = 1;
        if (sArr2 == sArr3 && i3 == i5 && i4 == i6) {
            eIntegerMultiply = eIntegerMakeEInteger.Multiply(eIntegerMakeEInteger);
            eIntegerMultiply2 = eIntegerMakeEInteger3.Multiply(eIntegerMakeEInteger3);
            EInteger eIntegerAdd2 = eIntegerMakeEInteger3.Add(eIntegerMakeEInteger);
            EInteger eIntegerAdd3 = eIntegerAdd2.Add(eIntegerMakeEInteger2);
            EInteger eIntegerSubtract = eIntegerAdd2.Subtract(eIntegerMakeEInteger2);
            EInteger eIntegerAdd4 = eIntegerMakeEInteger3.ShiftLeft(2).Add(eIntegerMakeEInteger2.ShiftLeft(1)).Add(eIntegerMakeEInteger);
            eIntegerMultiply3 = eIntegerAdd3.Multiply(eIntegerAdd3);
            eIntegerMultiply4 = eIntegerSubtract.Multiply(eIntegerSubtract);
            eIntegerMultiply5 = eIntegerAdd4.Multiply(eIntegerAdd4);
        } else {
            int i11 = i5 + i6;
            EInteger eIntegerMakeEInteger4 = MakeEInteger(sArr3, i11, i5, i7);
            EInteger eIntegerMakeEInteger5 = MakeEInteger(sArr3, i11, i5 + i7, i7);
            EInteger eIntegerMakeEInteger6 = MakeEInteger(sArr3, i11, i5 + i9, i7);
            eIntegerMultiply = eIntegerMakeEInteger.Multiply(eIntegerMakeEInteger4);
            eIntegerMultiply2 = eIntegerMakeEInteger3.Multiply(eIntegerMakeEInteger6);
            EInteger eIntegerAdd5 = eIntegerMakeEInteger3.Add(eIntegerMakeEInteger);
            EInteger eIntegerAdd6 = eIntegerMakeEInteger6.Add(eIntegerMakeEInteger4);
            eIntegerMultiply3 = eIntegerAdd5.Add(eIntegerMakeEInteger2).Multiply(eIntegerAdd6.Add(eIntegerMakeEInteger5));
            eIntegerMultiply4 = eIntegerAdd5.Subtract(eIntegerMakeEInteger2).Multiply(eIntegerAdd6.Subtract(eIntegerMakeEInteger5));
            i10 = 1;
            eIntegerMultiply5 = eIntegerMakeEInteger3.ShiftLeft(2).Add(eIntegerMakeEInteger2.ShiftLeft(1)).Add(eIntegerMakeEInteger).Multiply(eIntegerMakeEInteger6.ShiftLeft(2).Add(eIntegerMakeEInteger5.ShiftLeft(1)).Add(eIntegerMakeEInteger4));
        }
        EInteger eIntegerShiftLeft2 = eIntegerMultiply2.ShiftLeft(i10);
        EInteger eIntegerMultiply6 = eIntegerShiftLeft2.Multiply(6);
        EInteger eIntegerMultiply7 = eIntegerMultiply.Multiply(3);
        EInteger eIntegerDivide = eIntegerMultiply7.Subtract(eIntegerMultiply6).Subtract(eIntegerMultiply3.Multiply(3)).Subtract(eIntegerMultiply4).Add(eIntegerMultiply5).Divide(6);
        EInteger eIntegerShiftRight = eIntegerMultiply3.Add(eIntegerMultiply4).Subtract(eIntegerMultiply.ShiftLeft(1)).Subtract(eIntegerShiftLeft2).ShiftRight(1);
        EInteger eIntegerDivide2 = eIntegerMultiply3.Multiply(6).Add(eIntegerMultiply6).Subtract(eIntegerMultiply5).Subtract(eIntegerMultiply4).Subtract(eIntegerMultiply4).Subtract(eIntegerMultiply7).Divide(6);
        if (eIntegerShiftLeft.compareTo(1879048192) < 0) {
            int i12 = i7 << 4;
            eIntegerAdd = eIntegerMultiply.Add(eIntegerDivide2.ShiftLeft(i12)).Add(eIntegerShiftRight.ShiftLeft(i12 * 2)).Add(eIntegerDivide.ShiftLeft(i12 * 3)).Add(eIntegerMultiply2.ShiftLeft(i12 * 4));
        } else {
            eIntegerAdd = eIntegerMultiply.Add(eIntegerDivide2.ShiftLeft(eIntegerShiftLeft)).Add(eIntegerShiftRight.ShiftLeft(eIntegerShiftLeft.Multiply(2))).Add(eIntegerDivide.ShiftLeft(eIntegerShiftLeft.Multiply(3))).Add(eIntegerMultiply2.ShiftLeft(eIntegerShiftLeft.Multiply(4)));
        }
        int i13 = i4 + i6;
        Arrays.fill(sArr, i2, i2 + i13, (short) 0);
        System.arraycopy(eIntegerAdd.words, 0, sArr, i2, Math.min(i13, eIntegerAdd.wordCount));
    }

    private static void Toom4(short[] sArr, int i2, short[] sArr2, int i3, int i4, short[] sArr3, int i5, int i6) {
        EInteger eIntegerMultiply;
        EInteger eIntegerMultiply2;
        EInteger eIntegerMultiply3;
        EInteger eIntegerMultiply4;
        EInteger eIntegerMultiply5;
        EInteger eIntegerMultiply6;
        EInteger eIntegerMultiply7;
        EInteger eIntegerAdd;
        int iMax = Math.max(i4, i6);
        int i7 = (iMax / 4) + (((iMax % 4) + 3) / 4);
        EInteger eIntegerShiftLeft = FromInt32(i7).ShiftLeft(4);
        int i8 = i3 + i4;
        EInteger eIntegerMakeEInteger = MakeEInteger(sArr2, i8, i3, i7);
        EInteger eIntegerMakeEInteger2 = MakeEInteger(sArr2, i8, i3 + i7, i7);
        int i9 = i7 * 2;
        EInteger eIntegerMakeEInteger3 = MakeEInteger(sArr2, i8, i3 + i9, i7);
        int i10 = i7 * 3;
        EInteger eIntegerMakeEInteger4 = MakeEInteger(sArr2, i8, i3 + i10, i7);
        if (sArr2 == sArr3 && i3 == i5 && i4 == i6) {
            eIntegerMultiply = eIntegerMakeEInteger.Multiply(eIntegerMakeEInteger);
            eIntegerMultiply2 = eIntegerMakeEInteger4.Multiply(eIntegerMakeEInteger4);
            EInteger eIntegerShiftLeft2 = eIntegerMakeEInteger3.ShiftLeft(1);
            EInteger eIntegerShiftLeft3 = eIntegerMakeEInteger2.ShiftLeft(2);
            EInteger eIntegerShiftLeft4 = eIntegerMakeEInteger.ShiftLeft(3);
            EInteger eIntegerAdd2 = eIntegerMakeEInteger2.Add(eIntegerMakeEInteger4);
            EInteger eIntegerAdd3 = eIntegerMakeEInteger.Add(eIntegerMakeEInteger3);
            EInteger eIntegerAdd4 = eIntegerMakeEInteger4.Add(eIntegerShiftLeft2).Add(eIntegerShiftLeft3).Add(eIntegerShiftLeft4);
            EInteger eIntegerAdd5 = eIntegerMakeEInteger4.Negate().Add(eIntegerShiftLeft2).Subtract(eIntegerShiftLeft3).Add(eIntegerShiftLeft4);
            EInteger eIntegerAdd6 = eIntegerAdd3.Add(eIntegerAdd2);
            EInteger eIntegerSubtract = eIntegerAdd3.Subtract(eIntegerAdd2);
            EInteger eIntegerAdd7 = eIntegerMakeEInteger.Add(eIntegerMakeEInteger4.ShiftLeft(3)).Add(eIntegerMakeEInteger3.ShiftLeft(2)).Add(eIntegerMakeEInteger2.ShiftLeft(1));
            eIntegerMultiply3 = eIntegerAdd4.Multiply(eIntegerAdd4);
            eIntegerMultiply4 = eIntegerAdd5.Multiply(eIntegerAdd5);
            eIntegerMultiply5 = eIntegerAdd6.Multiply(eIntegerAdd6);
            eIntegerMultiply6 = eIntegerSubtract.Multiply(eIntegerSubtract);
            eIntegerMultiply7 = eIntegerAdd7.Multiply(eIntegerAdd7);
        } else {
            int i11 = i5 + i6;
            EInteger eIntegerMakeEInteger5 = MakeEInteger(sArr3, i11, i5, i7);
            EInteger eIntegerMakeEInteger6 = MakeEInteger(sArr3, i11, i5 + i7, i7);
            EInteger eIntegerMakeEInteger7 = MakeEInteger(sArr3, i11, i5 + i9, i7);
            EInteger eIntegerMakeEInteger8 = MakeEInteger(sArr3, i11, i5 + i10, i7);
            eIntegerMultiply = eIntegerMakeEInteger.Multiply(eIntegerMakeEInteger5);
            eIntegerMultiply2 = eIntegerMakeEInteger4.Multiply(eIntegerMakeEInteger8);
            EInteger eIntegerShiftLeft5 = eIntegerMakeEInteger3.ShiftLeft(1);
            EInteger eIntegerShiftLeft6 = eIntegerMakeEInteger2.ShiftLeft(2);
            EInteger eIntegerShiftLeft7 = eIntegerMakeEInteger.ShiftLeft(3);
            EInteger eIntegerShiftLeft8 = eIntegerMakeEInteger7.ShiftLeft(1);
            EInteger eIntegerShiftLeft9 = eIntegerMakeEInteger6.ShiftLeft(2);
            EInteger eIntegerShiftLeft10 = eIntegerMakeEInteger5.ShiftLeft(3);
            EInteger eIntegerAdd8 = eIntegerMakeEInteger2.Add(eIntegerMakeEInteger4);
            EInteger eIntegerAdd9 = eIntegerMakeEInteger.Add(eIntegerMakeEInteger3);
            EInteger eIntegerAdd10 = eIntegerMakeEInteger6.Add(eIntegerMakeEInteger8);
            EInteger eIntegerAdd11 = eIntegerMakeEInteger5.Add(eIntegerMakeEInteger7);
            eIntegerMultiply3 = eIntegerMakeEInteger4.Add(eIntegerShiftLeft5).Add(eIntegerShiftLeft6).Add(eIntegerShiftLeft7).Multiply(eIntegerMakeEInteger8.Add(eIntegerShiftLeft8).Add(eIntegerShiftLeft9).Add(eIntegerShiftLeft10));
            eIntegerMultiply4 = eIntegerMakeEInteger4.Negate().Add(eIntegerShiftLeft5).Subtract(eIntegerShiftLeft6).Add(eIntegerShiftLeft7).Multiply(eIntegerMakeEInteger8.Negate().Add(eIntegerShiftLeft8).Subtract(eIntegerShiftLeft9).Add(eIntegerShiftLeft10));
            eIntegerMultiply5 = eIntegerAdd9.Add(eIntegerAdd8).Multiply(eIntegerAdd11.Add(eIntegerAdd10));
            eIntegerMultiply6 = eIntegerAdd9.Subtract(eIntegerAdd8).Multiply(eIntegerAdd11.Subtract(eIntegerAdd10));
            eIntegerMultiply7 = eIntegerMakeEInteger.Add(eIntegerMakeEInteger4.ShiftLeft(3)).Add(eIntegerMakeEInteger3.ShiftLeft(2)).Add(eIntegerMakeEInteger2.ShiftLeft(1)).Multiply(eIntegerMakeEInteger5.Add(eIntegerMakeEInteger8.ShiftLeft(3)).Add(eIntegerMakeEInteger7.ShiftLeft(2)).Add(eIntegerMakeEInteger6.ShiftLeft(1)));
        }
        EInteger[] eIntegerArr = {eIntegerMultiply, eIntegerMultiply3, eIntegerMultiply4, eIntegerMultiply5, eIntegerMultiply6, eIntegerMultiply7, eIntegerMultiply2};
        EInteger eIntegerInterpolate = Interpolate(eIntegerArr, new int[]{-90, 5, -3, -60, 20, 2, -90}, 180);
        EInteger eIntegerInterpolate2 = Interpolate(eIntegerArr, new int[]{-120, 1, 1, -4, -4, 0, 6}, 24);
        EInteger eIntegerInterpolate3 = Interpolate(eIntegerArr, new int[]{45, -1, 0, 27, -7, -1, 45}, 18);
        EInteger eIntegerInterpolate4 = Interpolate(eIntegerArr, new int[]{96, -1, -1, 16, 16, 0, -30}, 24);
        EInteger eIntegerInterpolate5 = Interpolate(eIntegerArr, new int[]{-360, 5, 3, -120, -40, 8, -360}, 180);
        if (eIntegerShiftLeft.compareTo(1879048192) < 0) {
            int i12 = i7 << 4;
            eIntegerAdd = eIntegerMultiply.Add(eIntegerInterpolate.ShiftLeft(i12)).Add(eIntegerInterpolate2.ShiftLeft(i12 * 2)).Add(eIntegerInterpolate3.ShiftLeft(i12 * 3)).Add(eIntegerInterpolate4.ShiftLeft(i12 * 4)).Add(eIntegerInterpolate5.ShiftLeft(i12 * 5)).Add(eIntegerMultiply2.ShiftLeft(i12 * 6));
        } else {
            eIntegerAdd = eIntegerMultiply.Add(eIntegerInterpolate.ShiftLeft(eIntegerShiftLeft)).Add(eIntegerInterpolate2.ShiftLeft(eIntegerShiftLeft.Multiply(2))).Add(eIntegerInterpolate3.ShiftLeft(eIntegerShiftLeft.Multiply(3))).Add(eIntegerInterpolate4.ShiftLeft(eIntegerShiftLeft.Multiply(4))).Add(eIntegerInterpolate5.ShiftLeft(eIntegerShiftLeft.Multiply(5))).Add(eIntegerMultiply2.ShiftLeft(eIntegerShiftLeft.Multiply(6)));
        }
        int i13 = i4 + i6;
        Arrays.fill(sArr, i2, i2 + i13, (short) 0);
        System.arraycopy(eIntegerAdd.words, 0, sArr, i2, Math.min(i13, eIntegerAdd.wordCount));
    }

    private static void TwosComplement(short[] sArr, int i2, int i3) {
        DecrementWords(sArr, i2, i3, (short) 1);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            sArr[i5] = (short) (~sArr[i5]);
        }
    }

    private static int WordsCompare(short[] sArr, int i2, int i3, short[] sArr2, int i4, int i5) {
        if (i3 == 0) {
            return i5 == 0 ? 0 : -1;
        }
        if (i5 == 0) {
            return 1;
        }
        if (i3 != i5) {
            return i3 > i5 ? 1 : -1;
        }
        if (i3 == 1 && sArr[i2] == sArr2[i4]) {
            return 0;
        }
        int i6 = (i2 + i3) - 1;
        int i7 = (i4 + i3) - 1;
        while (true) {
            int i8 = i3 - 1;
            if (i3 == 0) {
                return 0;
            }
            short s2 = sArr[i6];
            int i9 = (s2 + 65535) - (s2 | 65535);
            short s3 = sArr2[i7];
            int i10 = (65535 + s3) - (65535 | s3);
            if (i9 > i10) {
                return 1;
            }
            if (i9 < i10) {
                return -1;
            }
            i6--;
            i7--;
            i3 = i8;
        }
    }

    private static int WordsCompare(short[] sArr, int i2, short[] sArr2, int i3) {
        return WordsCompare(sArr, 0, i2, sArr2, 0, i3);
    }

    private static boolean WordsEqual(short[] sArr, int i2, short[] sArr2, int i3) {
        if (i2 != i3) {
            return false;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (sArr[i4] != sArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private static boolean WordsIsEven(short[] sArr, int i2) {
        return i2 == 0 || (sArr[0] & 1) == 0;
    }

    private static int WordsShiftRightEight(short[] sArr, int i2) {
        if (i2 == 0) {
            return i2;
        }
        int i3 = i2 - 1;
        int i4 = 0;
        for (int i5 = i3; i5 >= 0; i5--) {
            short s2 = sArr[i5];
            int i6 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - s2) | ((-1) - 65280))) >> 8)));
            i4 = (s2 << 8) & 65280;
            sArr[i5] = (short) i6;
        }
        return sArr[i3] == 0 ? i2 - 1 : i2;
    }

    private static int WordsShiftRightFour(short[] sArr, int i2) {
        if (i2 == 0) {
            return i2;
        }
        int i3 = i2 - 1;
        int i4 = 0;
        for (int i5 = i3; i5 >= 0; i5--) {
            short s2 = sArr[i5];
            int i6 = ((-1) - (((-1) - 65520) | ((-1) - s2))) >> 4;
            int i7 = (i4 + i6) - (i4 & i6);
            i4 = (s2 << 12) & 61440;
            sArr[i5] = (short) i7;
        }
        return sArr[i3] == 0 ? i2 - 1 : i2;
    }

    private static int WordsShiftRightOne(short[] sArr, int i2) {
        if (i2 == 0) {
            return i2;
        }
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = i3;
        while (i5 >= 0) {
            short s2 = sArr[i5];
            sArr[i5] = (short) (i4 | (((-1) - (((-1) - 65534) | ((-1) - s2))) >> 1));
            i5--;
            i4 = (-1) - (((-1) - (s2 << 15)) | ((-1) - 32768));
        }
        return sArr[i3] == 0 ? i2 - 1 : i2;
    }

    private static int WordsShiftRightTwo(short[] sArr, int i2) {
        if (i2 == 0) {
            return i2;
        }
        int i3 = i2 - 1;
        int i4 = 0;
        for (int i5 = i3; i5 >= 0; i5--) {
            short s2 = sArr[i5];
            int i6 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - 65532) | ((-1) - s2))) >> 2)));
            i4 = (s2 << 14) & 49152;
            sArr[i5] = (short) i6;
        }
        return sArr[i3] == 0 ? i2 - 1 : i2;
    }

    private static int WordsSubtract(short[] sArr, int i2, short[] sArr2, int i3) {
        short sSubtractInternal = (short) SubtractInternal(sArr, 0, sArr, 0, sArr2, 0, i3);
        if (sSubtractInternal != 0) {
            DecrementWords(sArr, i3, i2 - i3, sSubtractInternal);
        }
        while (i2 != 0 && sArr[i2 - 1] == 0) {
            i2--;
        }
        return i2;
    }

    private static long WordsToLongUnchecked(short[] sArr, int i2) {
        if (i2 == 0) {
            return 0L;
        }
        short s2 = sArr[0];
        int i3 = (s2 + 65535) - (s2 | 65535);
        if (i2 > 1) {
            i3 |= (sArr[1] & 65535) << 16;
        }
        if (i2 <= 2) {
            return (-1) - (((-1) - ((long) i3)) | ((-1) - 4294967295L));
        }
        int i4 = sArr[2] & 65535;
        if (i2 > 3) {
            i4 |= (sArr[3] & 65535) << 16;
        }
        long j2 = ((long) i3) & 4294967295L;
        long j3 = ((long) i4) << 32;
        return (j2 + j3) - (j2 & j3);
    }

    private static String WordsToString(short[] sArr, int i2, int i3) {
        while (i3 != 0 && sArr[(i2 + i3) - 1] == 0) {
            i3--;
        }
        if (i3 == 0) {
            return "\"0\"";
        }
        short[] sArr2 = new short[i3];
        System.arraycopy(sArr, i2, sArr2, 0, i3);
        return "\"" + new EInteger(i3, sArr2, false).toString() + "\"";
    }

    private static String WordsToString2(short[] sArr, int i2, int i3, short[] sArr2, int i4, int i5) {
        int i6 = i3 + i5;
        short[] sArr3 = new short[i6];
        System.arraycopy(sArr, i2, sArr3, 0, i3);
        System.arraycopy(sArr2, i4, sArr3, i3, i5);
        while (i6 != 0 && sArr3[i6 - 1] == 0) {
            i6--;
        }
        return i6 == 0 ? "\"0\"" : "\"" + new EInteger(i6, sArr3, false).toString() + "\"";
    }

    private static String WordsToStringHex(short[] sArr, int i2, int i3) {
        while (i3 != 0 && sArr[(i2 + i3) - 1] == 0) {
            i3--;
        }
        if (i3 == 0) {
            return "\"0\"";
        }
        short[] sArr2 = new short[i3];
        System.arraycopy(sArr, i2, sArr2, 0, i3);
        return "\"" + new EInteger(i3, sArr2, false).ToRadixString(16) + "\"";
    }

    private static void XorWords(short[] sArr, short[] sArr2, short[] sArr3, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sArr[i3] = (short) (sArr2[i3] ^ sArr3[i3]);
        }
    }

    public static EInteger getOne() {
        return ValueOne;
    }

    public static EInteger getTen() {
        return ValueTen;
    }

    public static EInteger getZero() {
        return ValueZero;
    }

    public EInteger Abs() {
        int i2 = this.wordCount;
        return (i2 == 0 || !this.negative) ? this : new EInteger(i2, this.words, false);
    }

    public EInteger Add(int i2) {
        if (i2 == 0) {
            return this;
        }
        int i3 = this.wordCount;
        if (i3 == 0) {
            return FromInt32(i2);
        }
        if (i3 != 1 || i2 < -2147352576 || i2 >= 2147352576) {
            return Add(FromInt32(i2));
        }
        int i4 = this.negative ? i2 - (this.words[0] & 65535) : i2 + ((-1) - (((-1) - this.words[0]) | ((-1) - 65535)));
        if (i4 >= CacheFirst && i4 <= 128) {
            return Cache[i4 - CacheFirst];
        }
        int i5 = i4 >> 16;
        if (i5 == 0) {
            return new EInteger(1, new short[]{(short) i4}, false);
        }
        if (i4 > 0) {
            return new EInteger(2, new short[]{(short) i4, (short) i5}, false);
        }
        if (i4 > -65536) {
            return new EInteger(1, new short[]{(short) (-i4)}, true);
        }
        int i6 = -i4;
        return new EInteger(2, new short[]{(short) i6, (short) (i6 >> 16)}, true);
    }

    public EInteger Add(long j2) {
        return Add(FromInt64(j2));
    }

    public EInteger Add(EInteger eInteger) {
        EInteger eInteger2;
        int iAddInternal;
        EInteger eInteger3 = eInteger;
        if (eInteger3 == null) {
            throw new NullPointerException("bigintAugend");
        }
        int i2 = this.wordCount;
        if (i2 == 0) {
            return eInteger3;
        }
        int i3 = eInteger3.wordCount;
        if (i3 == 0) {
            return this;
        }
        boolean z2 = true;
        if (i3 == 1 && i2 == 1) {
            boolean z3 = this.negative;
            if (z3 != eInteger3.negative) {
                short s2 = this.words[0];
                int i4 = (s2 + 65535) - (s2 | 65535);
                int i5 = (-1) - (((-1) - eInteger3.words[0]) | ((-1) - 65535));
                return i4 == i5 ? FromInt32(0) : i4 > i5 ? new EInteger(1, new short[]{(short) (i4 - i5), 0}, z3) : new EInteger(1, new short[]{(short) (i5 - i4), 0}, !z3);
            }
            short s3 = this.words[0];
            int i6 = ((s3 + 65535) - (s3 | 65535)) + ((-1) - (((-1) - eInteger3.words[0]) | ((-1) - 65535)));
            short s4 = (short) i6;
            int i7 = i6 >> 16;
            return new EInteger(i7 == 0 ? 1 : 2, new short[]{s4, (short) i7}, z3);
        }
        boolean z4 = this.negative;
        if ((!z4) != (!eInteger3.negative)) {
            if (z4) {
                eInteger2 = this;
            } else {
                eInteger2 = eInteger3;
                eInteger3 = this;
            }
            int i8 = eInteger3.wordCount;
            int i9 = eInteger2.wordCount;
            short[] sArr = new short[Math.max(eInteger3.words.length, eInteger2.words.length)];
            if (i8 == i9) {
                if (Compare(eInteger3.words, 0, eInteger2.words, 0, i8) >= 0) {
                    SubtractInternal(sArr, 0, eInteger3.words, 0, eInteger2.words, 0, i8);
                    z2 = false;
                } else {
                    SubtractInternal(sArr, 0, eInteger2.words, 0, eInteger3.words, 0, i8);
                }
            } else if (i8 > i9) {
                sArr = sArr;
                short sSubtractInternal = (short) SubtractInternal(sArr, 0, eInteger3.words, 0, eInteger2.words, 0, i9);
                int i10 = i8 - i9;
                System.arraycopy(eInteger3.words, i9, sArr, i9, i10);
                DecrementWords(sArr, i9, i10, sSubtractInternal);
                z2 = false;
            } else {
                sArr = sArr;
                short sSubtractInternal2 = (short) SubtractInternal(sArr, 0, eInteger2.words, 0, eInteger3.words, 0, i8);
                int i11 = i9 - i8;
                System.arraycopy(eInteger2.words, i8, sArr, i8, i11);
                DecrementWords(sArr, i8, i11, sSubtractInternal2);
            }
            int iCountWords = CountWords(sArr);
            return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, ShortenArray(sArr, iCountWords), z2);
        }
        if (i3 <= 2 && i2 <= 2 && ((i2 < 2 || (this.words[1] >> 15) == 0) && (i3 < 2 || (eInteger3.words[1] >> 15) == 0))) {
            short[] sArr2 = this.words;
            int i12 = sArr2[0] & 65535;
            if (i2 == 2) {
                i12 |= ((-1) - (((-1) - sArr2[1]) | ((-1) - 65535))) << 16;
            }
            short[] sArr3 = eInteger3.words;
            int i13 = (-1) - (((-1) - sArr3[0]) | ((-1) - 65535));
            if (i3 == 2) {
                i13 |= (sArr3[1] & 65535) << 16;
            }
            int i14 = i12 + i13;
            short[] sArr4 = {(short) ((-1) - (((-1) - i14) | ((-1) - 65535))), (short) (65535 & (i14 >> 16))};
            return new EInteger(sArr4[1] == 0 ? 1 : 2, sArr4, z4);
        }
        if (i3 <= 2 && i2 <= 2) {
            short[] sArr5 = this.words;
            short s5 = sArr5[0];
            int i15 = (s5 + 65535) - (s5 | 65535);
            if (i2 == 2) {
                short s6 = sArr5[1];
                i15 = (-1) - (((-1) - i15) & ((-1) - (((s6 + 65535) - (s6 | 65535)) << 16)));
            }
            short[] sArr6 = eInteger3.words;
            short s7 = sArr6[0];
            int i16 = (s7 + 65535) - (s7 | 65535);
            if (i3 == 2) {
                i16 = (-1) - (((-1) - i16) & ((-1) - (((-1) - (((-1) - sArr6[1]) | ((-1) - 65535))) << 16)));
            }
            long j2 = ((-1) - (((-1) - ((long) i15)) | ((-1) - 4294967295L))) + (((long) i16) & 4294967295L);
            if ((j2 >> 32) == 0) {
                int i17 = (int) j2;
                short[] sArr7 = {(short) ((-1) - (((-1) - i17) | ((-1) - 65535))), (short) ((i17 >> 16) & 65535)};
                return new EInteger(sArr7[1] == 0 ? 1 : 2, sArr7, z4);
            }
        }
        short[] sArrShortenArray = new short[Math.max(this.words.length, eInteger3.words.length)];
        int iMax = Math.max(i2, i3);
        if (i2 == i3) {
            iAddInternal = AddInternal(sArrShortenArray, 0, this.words, 0, eInteger3.words, 0, i2);
        } else if (i2 > i3) {
            sArrShortenArray = sArrShortenArray;
            iAddInternal = AddInternal(sArrShortenArray, 0, this.words, 0, eInteger3.words, 0, i3);
            int i18 = i2 - i3;
            System.arraycopy(this.words, i3, sArrShortenArray, i3, i18);
            if (iAddInternal != 0) {
                iAddInternal = IncrementWords(sArrShortenArray, i3, i18, (short) iAddInternal);
            }
        } else {
            sArrShortenArray = sArrShortenArray;
            iAddInternal = AddInternal(sArrShortenArray, 0, this.words, 0, eInteger3.words, 0, i2);
            int i19 = i3 - i2;
            System.arraycopy(eInteger3.words, i2, sArrShortenArray, i2, i19);
            if (iAddInternal != 0) {
                iAddInternal = IncrementWords(sArrShortenArray, i2, i19, (short) iAddInternal);
            }
        }
        if (iAddInternal != 0) {
            sArrShortenArray = CleanGrow(sArrShortenArray, iMax + 1);
            sArrShortenArray[iMax] = (short) iAddInternal;
            z2 = false;
        }
        int iCountWords2 = CountWords(sArrShortenArray);
        if (iCountWords2 == 0) {
            return FromInt32(0);
        }
        if (z2) {
            sArrShortenArray = ShortenArray(sArrShortenArray, iCountWords2);
        }
        return new EInteger(iCountWords2, sArrShortenArray, this.negative);
    }

    public EInteger And(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("other");
        }
        if (eInteger.isZero() || isZero()) {
            return FromInt32(0);
        }
        if (!this.negative && !eInteger.negative) {
            int iMin = Math.min(this.wordCount, eInteger.wordCount);
            int i2 = this.wordCount;
            short[] sArr = i2 == iMin ? this.words : eInteger.words;
            short[] sArr2 = i2 == iMin ? eInteger.words : this.words;
            short[] sArr3 = new short[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                sArr3[i3] = (short) ((-1) - (((-1) - sArr[i3]) | ((-1) - sArr2[i3])));
            }
            int iCountWords = CountWords(sArr3);
            return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArr3, false);
        }
        int i4 = this.wordCount;
        short[] sArr4 = new short[i4];
        System.arraycopy(this.words, 0, sArr4, 0, i4);
        int i5 = eInteger.wordCount;
        short[] sArr5 = new short[i5];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i5);
        boolean z2 = this.negative;
        boolean z3 = eInteger.negative;
        short[] sArrCleanGrow = CleanGrow(sArr4, Math.max(i4, i5));
        short[] sArrCleanGrow2 = CleanGrow(sArr5, Math.max(sArrCleanGrow.length, i5));
        if (z2) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        if (z3) {
            TwosComplement(sArrCleanGrow2, 0, sArrCleanGrow2.length);
        }
        boolean z4 = ((z3 ? 1 : 0) + (z2 ? 1 : 0)) - ((z3 ? 1 : 0) | (z2 ? 1 : 0)) == 1;
        AndWords(sArrCleanGrow, sArrCleanGrow, sArrCleanGrow2, sArrCleanGrow.length);
        if (z4) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        int iCountWords2 = CountWords(sArrCleanGrow);
        return iCountWords2 == 0 ? FromInt32(0) : new EInteger(iCountWords2, sArrCleanGrow, z4);
    }

    public EInteger AndNot(EInteger eInteger) {
        if (eInteger != null) {
            return And(eInteger.Not());
        }
        throw new NullPointerException("second");
    }

    @Deprecated
    public int AsInt32Checked() {
        return ToInt32Checked();
    }

    @Deprecated
    public int AsInt32Unchecked() {
        return ToInt32Unchecked();
    }

    @Deprecated
    public long AsInt64Checked() {
        return ToInt64Checked();
    }

    @Deprecated
    public long AsInt64Unchecked() {
        return ToInt64Unchecked();
    }

    public boolean CanFitInInt32() {
        int i2 = this.wordCount;
        if (i2 > 2) {
            return false;
        }
        if (i2 == 2) {
            short[] sArr = this.words;
            short s2 = sArr[1];
            if ((Short.MIN_VALUE + s2) - (Short.MIN_VALUE | s2) != 0) {
                return this.negative && s2 == Short.MIN_VALUE && sArr[0] == 0;
            }
        }
        return true;
    }

    public boolean CanFitInInt64() {
        int i2 = this.wordCount;
        if (i2 > 4) {
            return false;
        }
        if (i2 == 4) {
            short[] sArr = this.words;
            short s2 = sArr[3];
            if ((Short.MIN_VALUE + s2) - (Short.MIN_VALUE | s2) != 0) {
                return this.negative && s2 == Short.MIN_VALUE && sArr[2] == 0 && sArr[1] == 0 && sArr[0] == 0;
            }
        }
        return true;
    }

    public EInteger Decrement() {
        return Subtract(FromInt32(1));
    }

    public EInteger[] DivRem(int i2) {
        return DivRem(FromInt32(i2));
    }

    public EInteger[] DivRem(long j2) {
        return DivRem(FromInt64(j2));
    }

    public EInteger[] DivRem(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("divisor");
        }
        int i2 = this.wordCount;
        int i3 = eInteger.wordCount;
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        if (i2 < i3) {
            return new EInteger[]{FromInt32(0), this};
        }
        if (i3 == 1) {
            short[] sArr = new short[i2];
            short s2 = eInteger.words[0];
            int iFastDivideAndRemainder = s2 != 2 ? s2 != 10 ? (-1) - (((-1) - FastDivideAndRemainder(sArr, 0, this.words, 0, i2, s2)) | ((-1) - 65535)) : FastDivideAndRemainderTen(sArr, 0, this.words, 0, i2) : FastDivideAndRemainderTwo(sArr, 0, this.words, 0, i2);
            int i4 = this.wordCount;
            while (i4 != 0 && sArr[i4 - 1] == 0) {
                i4--;
            }
            if (i4 == 0) {
                return new EInteger[]{FromInt32(0), this};
            }
            EInteger eInteger2 = new EInteger(i4, ShortenArray(sArr, i4), eInteger.negative ^ this.negative);
            if (this.negative) {
                iFastDivideAndRemainder = -iFastDivideAndRemainder;
            }
            return new EInteger[]{eInteger2, FromInt64(iFastDivideAndRemainder)};
        }
        if (CanFitInInt32() && eInteger.CanFitInInt32()) {
            long jToInt32Checked = ToInt32Checked();
            long jToInt32Checked2 = eInteger.ToInt32Checked();
            if (jToInt32Checked != -2147483648L || jToInt32Checked2 != -1) {
                long j2 = jToInt32Checked / jToInt32Checked2;
                return new EInteger[]{FromInt64(j2), FromInt64(jToInt32Checked - (jToInt32Checked2 * j2))};
            }
        } else if (CanFitInInt64() && eInteger.CanFitInInt64()) {
            long jToInt64Checked = ToInt64Checked();
            long jToInt64Checked2 = eInteger.ToInt64Checked();
            if (jToInt64Checked != Long.MIN_VALUE || jToInt64Checked2 != -1) {
                long j3 = jToInt64Checked / jToInt64Checked2;
                return new EInteger[]{FromInt64(j3), FromInt64(jToInt64Checked - (jToInt64Checked2 * j3))};
            }
        }
        short[] sArr2 = new short[i3];
        short[] sArr3 = new short[(i2 - i3) + 1];
        GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, sArr3, 0, sArr2, 0);
        int iCountWords = CountWords(sArr2);
        int iCountWords2 = CountWords(sArr3);
        short[] sArrShortenArray = ShortenArray(sArr2, iCountWords);
        return new EInteger[]{iCountWords2 == 0 ? FromInt32(0) : new EInteger(iCountWords2, ShortenArray(sArr3, iCountWords2), eInteger.negative ^ this.negative), iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArrShortenArray, this.negative)};
    }

    public EInteger Divide(int i2) {
        return Divide(FromInt32(i2));
    }

    public EInteger Divide(long j2) {
        return Divide(FromInt64(j2));
    }

    public EInteger Divide(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigintDivisor");
        }
        int i2 = this.wordCount;
        int i3 = eInteger.wordCount;
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        if (i2 < i3) {
            return FromInt32(0);
        }
        if (i2 <= 2 && i3 <= 2 && CanFitInInt32() && eInteger.CanFitInInt32()) {
            int iToInt32Checked = ToInt32Checked();
            int iToInt32Checked2 = eInteger.ToInt32Checked();
            if (iToInt32Checked != Integer.MIN_VALUE || iToInt32Checked2 != -1) {
                return FromInt32(iToInt32Checked / iToInt32Checked2);
            }
        }
        if (i2 <= 4 && i3 <= 4 && CanFitInInt64() && eInteger.CanFitInInt64()) {
            long jToInt64Checked = ToInt64Checked();
            long jToInt64Checked2 = eInteger.ToInt64Checked();
            if (jToInt64Checked != Long.MIN_VALUE || jToInt64Checked2 != -1) {
                return FromInt64(jToInt64Checked / jToInt64Checked2);
            }
        }
        if (i3 != 1) {
            short[] sArr = new short[(i2 - i3) + 1];
            GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, sArr, 0, null, 0);
            int iCountWords = CountWords(sArr);
            short[] sArrShortenArray = ShortenArray(sArr, iCountWords);
            if (iCountWords == 0) {
                return FromInt32(0);
            }
            return new EInteger(iCountWords, sArrShortenArray, eInteger.negative ^ this.negative);
        }
        short[] sArr2 = this.words;
        short[] sArr3 = new short[sArr2.length];
        int i4 = this.wordCount;
        FastDivide(sArr3, sArr2, i2, eInteger.words[0]);
        while (i4 != 0 && sArr3[i4 - 1] == 0) {
            i4--;
        }
        if (i4 == 0) {
            return FromInt32(0);
        }
        return new EInteger(i4, sArr3, eInteger.negative ^ this.negative);
    }

    public EInteger Eqv(EInteger eInteger) {
        if (eInteger != null) {
            return XorNot(eInteger);
        }
        throw new NullPointerException("second");
    }

    public EInteger Gcd(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigintSecond");
        }
        if (isZero()) {
            return eInteger.Abs();
        }
        EInteger eIntegerAbs = Abs();
        if (eInteger.isZero()) {
            return eIntegerAbs;
        }
        EInteger eIntegerAbs2 = eInteger.Abs();
        return (eIntegerAbs2.equals(FromInt32(1)) || eIntegerAbs.equals(eIntegerAbs2)) ? eIntegerAbs2 : eIntegerAbs.equals(FromInt32(1)) ? eIntegerAbs : Math.max(eIntegerAbs.wordCount, eIntegerAbs2.wordCount) > 12 ? SubquadraticGCD(eIntegerAbs, eIntegerAbs2) : BaseGcd(eIntegerAbs, eIntegerAbs2);
    }

    @Deprecated
    public int GetDigitCount() {
        long jGetDigitCountAsInt64 = GetDigitCountAsInt64();
        if (jGetDigitCountAsInt64 < -2147483648L || jGetDigitCountAsInt64 > 2147483647L) {
            throw new ArithmeticException();
        }
        return (int) jGetDigitCountAsInt64;
    }

    public EInteger GetDigitCountAsEInteger() {
        return FromInt64(GetDigitCountAsInt64());
    }

    /* JADX WARN: Code restructure failed: missing block: B:276:0x00df, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0120, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x016b, code lost:
    
        if (r1 >= 10) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x01be, code lost:
    
        if (r1 >= 10) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x01c0, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0287, code lost:
    
        r17 = r17 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long GetDigitCountAsInt64() {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EInteger.GetDigitCountAsInt64():long");
    }

    @Deprecated
    public int GetLowBit() {
        return GetLowBitAsEInteger().ToInt32Checked();
    }

    public EInteger GetLowBitAsEInteger() {
        return FromInt64(GetLowBitAsInt64());
    }

    public long GetLowBitAsInt64() {
        long j2 = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.wordCount; i3++) {
            short s2 = this.words[i3];
            int i4 = (s2 + 65535) - (s2 | 65535);
            if (i4 != 0) {
                if (((i4 << 15) & 65535) == 0) {
                    i2 = 1;
                    if (((i4 << 14) & 65535) == 0) {
                        if (((i4 << 13) & 65535) != 0) {
                            i2 = 2;
                        } else {
                            int i5 = i4 << 12;
                            if ((i5 + 65535) - (i5 | 65535) != 0) {
                                i2 = 3;
                            } else if ((-1) - (((-1) - (i4 << 11)) | ((-1) - 65535)) != 0) {
                                i2 = 4;
                            } else if (((i4 << 10) & 65535) != 0) {
                                i2 = 5;
                            } else if (((i4 << 9) & 65535) != 0) {
                                i2 = 6;
                            } else if ((-1) - (((-1) - (i4 << 8)) | ((-1) - 65535)) != 0) {
                                i2 = 7;
                            } else if (((i4 << 7) & 65535) != 0) {
                                i2 = 8;
                            } else if ((-1) - (((-1) - (i4 << 6)) | ((-1) - 65535)) != 0) {
                                i2 = 9;
                            } else if ((-1) - (((-1) - (i4 << 5)) | ((-1) - 65535)) != 0) {
                                i2 = 10;
                            } else {
                                int i6 = i4 << 4;
                                if ((i6 + 65535) - (i6 | 65535) != 0) {
                                    i2 = 11;
                                } else {
                                    int i7 = i4 << 3;
                                    i2 = (i7 + 65535) - (i7 | 65535) != 0 ? 12 : (-1) - (((-1) - (i4 << 2)) | ((-1) - 65535)) != 0 ? 13 : ((i4 << 1) & 65535) != 0 ? 14 : 15;
                                }
                            }
                        }
                    }
                }
                return j2 + ((long) i2);
            }
            j2 += 16;
        }
        return -1L;
    }

    public boolean GetSignedBit(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(FirebaseAnalytics.Param.INDEX);
        }
        if (this.wordCount == 0) {
            return false;
        }
        if (!this.negative) {
            return GetUnsignedBit(i2);
        }
        int i3 = i2 / 16;
        if (i3 >= this.words.length) {
            return true;
        }
        int i4 = 0;
        while (i4 < i3 && this.words[i4] == 0) {
            i4++;
        }
        short s2 = this.words[i3];
        if (i4 == i3) {
            s2 = (short) (s2 - 1);
        }
        return (-1) - (((-1) - (((short) (~s2)) >> ((i2 + 15) - (i2 | 15)))) | ((-1) - 1)) != 0;
    }

    public boolean GetSignedBit(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigIndex");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigIndex");
        }
        if (!this.negative) {
            return GetUnsignedBit(eInteger);
        }
        if (eInteger.CanFitInInt32()) {
            return GetSignedBit(eInteger.ToInt32Checked());
        }
        EInteger eIntegerDivide = eInteger.Divide(16);
        if (eIntegerDivide.compareTo(this.words.length) >= 0) {
            return true;
        }
        long j2 = 0;
        while (eIntegerDivide.compareTo(FromInt64(j2)) > 0 && this.words[(int) j2] == 0) {
            j2++;
        }
        int iToInt32Checked = eIntegerDivide.ToInt32Checked();
        short s2 = this.words[iToInt32Checked];
        if (j2 == iToInt32Checked) {
            s2 = (short) (s2 - 1);
        }
        return ((((short) (~s2)) >> eInteger.Remainder(16).ToInt32Checked()) & 1) != 0;
    }

    @Deprecated
    public int GetSignedBitLength() {
        return GetSignedBitLengthAsEInteger().ToInt32Checked();
    }

    public EInteger GetSignedBitLengthAsEInteger() {
        return FromInt64(GetSignedBitLengthAsInt64());
    }

    public long GetSignedBitLengthAsInt64() {
        int i2;
        int i3 = this.wordCount;
        if (i3 == 0) {
            return 0L;
        }
        if (this.negative) {
            EInteger eIntegerAbs = Abs();
            long jGetSignedBitLengthAsInt64 = eIntegerAbs.GetSignedBitLengthAsInt64();
            return eIntegerAbs.isPowerOfTwo() ? jGetSignedBitLengthAsInt64 - 1 : jGetSignedBitLengthAsInt64;
        }
        int i4 = (-1) - (((-1) - this.words[i3 - 1]) | ((-1) - 65535));
        if (i4 != 0) {
            if ((i4 >> 8) == 0) {
                i4 <<= 8;
                i2 = 8;
            } else {
                i2 = 16;
            }
            if ((i4 >> 12) == 0) {
                i4 <<= 4;
                i2 -= 4;
            }
            if ((i4 >> 14) == 0) {
                i4 <<= 2;
                i2 -= 2;
            }
            if ((i4 >> 15) == 0) {
                i2--;
            }
        } else {
            i2 = 0;
        }
        return ((((long) i3) - 1) * 16) + ((long) i2);
    }

    public boolean GetUnsignedBit(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("index(" + i2 + ") is less than 0");
        }
        int i3 = i2 >> 4;
        short[] sArr = this.words;
        if (i3 < sArr.length) {
            int i4 = sArr[i3] >> (i2 & 15);
            if ((i4 + 1) - (i4 | 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean GetUnsignedBit(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigIndex");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigIndex(" + eInteger + ") is less than 0");
        }
        if (eInteger.CanFitInInt32()) {
            return GetUnsignedBit(eInteger.ToInt32Checked());
        }
        if (eInteger.Divide(16).compareTo(this.words.length) < 0) {
            return false;
        }
        return (-1) - (((-1) - (this.words[eInteger.ShiftRight(4).ToInt32Checked()] >> eInteger.Remainder(16).ToInt32Checked())) | ((-1) - 1)) != 0;
    }

    @Deprecated
    public int GetUnsignedBitLength() {
        return GetUnsignedBitLengthAsEInteger().ToInt32Checked();
    }

    public EInteger GetUnsignedBitLengthAsEInteger() {
        return FromInt64(GetUnsignedBitLengthAsInt64());
    }

    public long GetUnsignedBitLengthAsInt64() {
        int i2;
        int i3 = this.wordCount;
        if (i3 == 0) {
            return 0L;
        }
        int i4 = this.words[i3 - 1] & 65535;
        long j2 = (((long) i3) - 1) << 4;
        if (i4 == 0) {
            return j2;
        }
        if ((i4 >> 8) == 0) {
            i4 <<= 8;
            i2 = 8;
        } else {
            i2 = 16;
        }
        if ((i4 >> 12) == 0) {
            i4 <<= 4;
            i2 -= 4;
        }
        if ((i4 >> 14) == 0) {
            i4 <<= 2;
            i2 -= 2;
        }
        if ((i4 >> 15) == 0) {
            i2--;
        }
        return j2 + ((long) i2);
    }

    public EInteger Imp(EInteger eInteger) {
        return OrNot(eInteger);
    }

    public EInteger Increment() {
        return Add(FromInt32(1));
    }

    public EInteger LowBits(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("\"bitCount\" (" + i2 + ") is not greater or equal to 0");
        }
        if (i2 == 0 || signum() == 0) {
            return FromInt32(0);
        }
        if (signum() > 0 && GetUnsignedBitLengthAsInt64() <= i2) {
            return this;
        }
        if (this.negative) {
            return And(FromInt32(1).ShiftLeft(i2).Subtract(1));
        }
        long jBitsToWords = BitsToWords(i2);
        int i3 = this.wordCount;
        if (i3 < jBitsToWords) {
            return this;
        }
        if (jBitsToWords == 0) {
            return FromInt32(0);
        }
        int i4 = (int) jBitsToWords;
        int i5 = (i2 + 15) - (i2 | 15);
        Math.min(i3, i4);
        short[] sArr = new short[i4];
        if (i5 == 0) {
            System.arraycopy(this.words, 0, sArr, 0, i4);
        } else {
            short s2 = (short) ((1 << i5) - 1);
            int i6 = i4 - 1;
            System.arraycopy(this.words, 0, sArr, 0, i6);
            short s3 = this.words[i6];
            sArr[i6] = (short) ((s2 + s3) - (s2 | s3));
        }
        int iCountWords = CountWords(sArr);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArr, false);
    }

    public EInteger LowBits(long j2) {
        if (j2 >= 0) {
            return j2 <= 2147483647L ? LowBits((int) j2) : LowBits(FromInt64(j2));
        }
        throw new IllegalArgumentException("\"longBitCount\" (" + j2 + ") is not greater or equal to 0");
    }

    public EInteger LowBits(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigBitCount");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("\"bigBitCount.signum()\" (" + eInteger.signum() + ") is not greater or equal to 0");
        }
        if (eInteger.signum() == 0 || signum() == 0) {
            return FromInt32(0);
        }
        if (signum() > 0) {
            if (GetUnsignedBitLengthAsEInteger().compareTo(eInteger) <= 0) {
                return this;
            }
            if (eInteger.CanFitInInt32()) {
                return LowBits(eInteger.ToInt32Checked());
            }
        }
        if (this.negative) {
            return And(FromInt32(1).ShiftLeft(eInteger).Subtract(1));
        }
        EInteger eIntegerDivide = eInteger.Add(15).Divide(16);
        if (FromInt32(this.wordCount).compareTo(eIntegerDivide) < 0) {
            return this;
        }
        long jToInt32Checked = eIntegerDivide.ToInt32Checked();
        if (jToInt32Checked == 0) {
            return FromInt32(0);
        }
        int i2 = (int) jToInt32Checked;
        int iToInt32Checked = eInteger.Remainder(16).ToInt32Checked();
        Math.min(this.wordCount, i2);
        short[] sArr = new short[i2];
        if (iToInt32Checked == 0) {
            System.arraycopy(this.words, 0, sArr, 0, i2);
        } else {
            short s2 = (short) ((1 << iToInt32Checked) - 1);
            int i3 = i2 - 1;
            System.arraycopy(this.words, 0, sArr, 0, i3);
            short s3 = this.words[i3];
            sArr[i3] = (short) ((s2 + s3) - (s2 | s3));
        }
        int iCountWords = CountWords(sArr);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArr, false);
    }

    public EInteger Mod(int i2) {
        if (i2 < 0) {
            throw new ArithmeticException("Divisor is negative");
        }
        EInteger eIntegerRemainder = Remainder(i2);
        return eIntegerRemainder.signum() < 0 ? FromInt32(i2).Add(eIntegerRemainder) : eIntegerRemainder;
    }

    public EInteger Mod(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("divisor");
        }
        if (eInteger.signum() < 0) {
            throw new ArithmeticException("Divisor is negative");
        }
        EInteger eIntegerRemainder = Remainder(eInteger);
        return eIntegerRemainder.signum() < 0 ? eInteger.Add(eIntegerRemainder) : eIntegerRemainder;
    }

    public EInteger ModPow(EInteger eInteger, EInteger eInteger2) {
        if (eInteger == null) {
            throw new NullPointerException("pow");
        }
        if (eInteger2 == null) {
            throw new NullPointerException("mod");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("pow(" + eInteger + ") is less than 0");
        }
        if (eInteger2.signum() <= 0) {
            throw new IllegalArgumentException("mod(" + eInteger2 + ") is not greater than 0");
        }
        EInteger eIntegerFromInt32 = FromInt32(1);
        EInteger eIntegerMod = this;
        while (!eInteger.isZero()) {
            if (!eInteger.isEven()) {
                eIntegerFromInt32 = eIntegerFromInt32.Multiply(eIntegerMod).Mod(eInteger2);
            }
            eInteger = eInteger.ShiftRight(1);
            if (!eInteger.isZero()) {
                eIntegerMod = eIntegerMod.Multiply(eIntegerMod).Mod(eInteger2);
            }
        }
        return eIntegerFromInt32;
    }

    public EInteger Multiply(int i2) {
        return Multiply(FromInt32(i2));
    }

    public EInteger Multiply(long j2) {
        return Multiply(FromInt64(j2));
    }

    public EInteger Multiply(EInteger eInteger) {
        int i2;
        int i3;
        short[] sArrShortenArray;
        int i4;
        if (eInteger == null) {
            throw new NullPointerException("bigintMult");
        }
        int i5 = this.wordCount;
        boolean z2 = false;
        if (i5 == 0 || (i2 = eInteger.wordCount) == 0) {
            return FromInt32(0);
        }
        if (i5 == 1 && this.words[0] == 1) {
            return this.negative ? eInteger.Negate() : eInteger;
        }
        if (i2 == 1 && eInteger.words[0] == 1) {
            return eInteger.negative ? Negate() : this;
        }
        if (i5 == 1) {
            if (i2 == 1) {
                short s2 = this.words[0];
                int i6 = ((s2 + 65535) - (s2 | 65535)) * ((-1) - (((-1) - eInteger.words[0]) | ((-1) - 65535)));
                int i7 = i6 >> 16;
                short[] sArr = {(short) ((i6 + 65535) - (i6 | 65535)), (short) ((i7 + 65535) - (i7 | 65535))};
                return new EInteger(sArr[1] != 0 ? 2 : 1, sArr, eInteger.negative ^ this.negative);
            }
            i3 = i2 + 1;
            sArrShortenArray = new short[i3];
            sArrShortenArray[i2] = LinearMultiply(sArrShortenArray, 0, eInteger.words, 0, this.words[0], i2);
        } else if (i2 == 1) {
            i3 = i5 + 1;
            sArrShortenArray = new short[i3];
            sArrShortenArray[i5] = LinearMultiply(sArrShortenArray, 0, this.words, 0, eInteger.words[0], i5);
        } else if (equals(eInteger)) {
            int i8 = this.wordCount;
            i3 = i8 + i8;
            sArrShortenArray = new short[i3];
            RecursiveSquare(sArrShortenArray, 0, new short[i3], 0, this.words, 0, i8);
            z2 = true;
        } else {
            int i9 = this.wordCount;
            if (i9 > 10 || (i4 = eInteger.wordCount) > 10) {
                int i10 = eInteger.wordCount;
                i3 = i9 + i10;
                sArrShortenArray = new short[i3];
                AsymmetricMultiply(sArrShortenArray, 0, new short[i3], 0, this.words, 0, i9, eInteger.words, 0, i10);
                z2 = true;
            } else {
                i3 = i9 + i4;
                sArrShortenArray = new short[i3];
                SchoolbookMultiply(sArrShortenArray, 0, this.words, 0, i9, eInteger.words, 0, i4);
            }
        }
        while (i3 != 0 && sArrShortenArray[i3 - 1] == 0) {
            i3--;
        }
        if (z2) {
            sArrShortenArray = ShortenArray(sArrShortenArray, i3);
        }
        return new EInteger(i3, sArrShortenArray, eInteger.negative ^ this.negative);
    }

    public EInteger Negate() {
        int i2 = this.wordCount;
        return i2 == 0 ? this : new EInteger(i2, this.words, !this.negative);
    }

    public EInteger Not() {
        int i2 = this.wordCount;
        if (i2 == 0) {
            return FromInt32(-1);
        }
        short[] sArr = new short[i2];
        System.arraycopy(this.words, 0, sArr, 0, i2);
        if (this.negative) {
            TwosComplement(sArr, 0, i2);
        }
        NotWords(sArr, i2);
        if (this.negative) {
            TwosComplement(sArr, 0, i2);
        }
        boolean z2 = !this.negative;
        int iCountWords = CountWords(sArr);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArr, z2);
    }

    public EInteger Or(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("second");
        }
        int i2 = this.wordCount;
        if (i2 == 0) {
            return eInteger;
        }
        int i3 = eInteger.wordCount;
        if (i3 == 0) {
            return this;
        }
        if (!this.negative && !eInteger.negative) {
            int iMin = Math.min(i2, i3);
            int iMax = Math.max(this.wordCount, eInteger.wordCount);
            int i4 = this.wordCount;
            short[] sArr = i4 == iMin ? this.words : eInteger.words;
            short[] sArr2 = i4 == iMin ? eInteger.words : this.words;
            short[] sArr3 = new short[iMax];
            for (int i5 = 0; i5 < iMin; i5++) {
                sArr3[i5] = (short) (sArr[i5] | sArr2[i5]);
            }
            System.arraycopy(sArr2, iMin, sArr3, iMin, iMax - iMin);
            return new EInteger(iMax, sArr3, false);
        }
        short[] sArr4 = new short[i2];
        System.arraycopy(this.words, 0, sArr4, 0, i2);
        int i6 = eInteger.wordCount;
        short[] sArr5 = new short[i6];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i6);
        boolean z2 = this.negative;
        boolean z3 = eInteger.negative;
        short[] sArrCleanGrow = CleanGrow(sArr4, Math.max(i2, i6));
        short[] sArrCleanGrow2 = CleanGrow(sArr5, Math.max(sArrCleanGrow.length, i6));
        if (z2) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        if (z3) {
            TwosComplement(sArrCleanGrow2, 0, sArrCleanGrow2.length);
        }
        boolean z4 = ((z3 ? 1 : 0) + (z2 ? 1 : 0)) - ((z3 ? 1 : 0) & (z2 ? 1 : 0)) == 1;
        OrWords(sArrCleanGrow, sArrCleanGrow, sArrCleanGrow2, sArrCleanGrow.length);
        if (z4) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        int iCountWords = CountWords(sArrCleanGrow);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArrCleanGrow, z4);
    }

    public EInteger OrNot(EInteger eInteger) {
        if (eInteger != null) {
            return Or(eInteger.Not());
        }
        throw new NullPointerException("second");
    }

    public EInteger Pow(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("powerSmall(" + i2 + ") is less than 0");
        }
        if (i2 == 0) {
            return FromInt32(1);
        }
        if (i2 == 1 || isZero() || compareTo(1) == 0) {
            return this;
        }
        if (compareTo(-1) == 0) {
            return (i2 & 1) == 0 ? FromInt32(1) : this;
        }
        if (i2 == 2) {
            return Multiply(this);
        }
        if (i2 == 3) {
            return Multiply(this).Multiply(this);
        }
        EInteger eIntegerFromInt32 = FromInt32(1);
        EInteger eIntegerMultiply = this;
        while (i2 != 0) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                eIntegerFromInt32 = eIntegerFromInt32.Multiply(eIntegerMultiply);
            }
            i2 >>= 1;
            if (i2 != 0) {
                eIntegerMultiply = eIntegerMultiply.Multiply(eIntegerMultiply);
            }
        }
        return eIntegerFromInt32;
    }

    public EInteger Pow(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? FromInt32(1) : j2 < 2147483647L ? Pow((int) j2) : Pow(FromInt64(j2));
        }
        throw new IllegalArgumentException("bigPower is negative");
    }

    public EInteger Pow(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("bigPower");
        }
        if (eInteger.signum() < 0) {
            throw new IllegalArgumentException("bigPower is negative");
        }
        if (eInteger.signum() == 0) {
            return FromInt32(1);
        }
        if (eInteger.compareTo(1) == 0 || isZero() || compareTo(1) == 0) {
            return this;
        }
        if (compareTo(-1) == 0) {
            return eInteger.isEven() ? FromInt32(1) : this;
        }
        EInteger eIntegerGetUnsignedBitLengthAsEInteger = GetUnsignedBitLengthAsEInteger();
        if (!isPowerOfTwo()) {
            eIntegerGetUnsignedBitLengthAsEInteger.Subtract(1);
        }
        if (eInteger.CanFitInInt32()) {
            return Pow(eInteger.ToInt32Checked());
        }
        EInteger eIntegerFromInt32 = FromInt32(1);
        EInteger eIntegerPow = Pow(Integer.MAX_VALUE);
        while (!eInteger.CanFitInInt32()) {
            eIntegerFromInt32 = eIntegerFromInt32.Multiply(eIntegerPow);
            eInteger = eInteger.Subtract(Integer.MAX_VALUE);
        }
        int iToInt32Checked = eInteger.ToInt32Checked();
        return iToInt32Checked == Integer.MAX_VALUE ? eIntegerFromInt32.Multiply(eIntegerPow) : eIntegerFromInt32.Multiply(Pow(iToInt32Checked));
    }

    @Deprecated
    public EInteger PowBigIntVar(EInteger eInteger) {
        if (eInteger != null) {
            return Pow(eInteger);
        }
        throw new NullPointerException("power");
    }

    public EInteger Remainder(int i2) {
        return Remainder(FromInt32(i2));
    }

    public EInteger Remainder(long j2) {
        return Remainder(FromInt64(j2));
    }

    public EInteger Remainder(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("divisor");
        }
        int i2 = this.wordCount;
        int i3 = eInteger.wordCount;
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        if (i2 < i3) {
            return this;
        }
        if (i3 == 1) {
            short sFastRemainder = FastRemainder(this.words, i2, eInteger.words[0]);
            int i4 = (sFastRemainder + 65535) - (sFastRemainder | 65535);
            if (this.negative) {
                i4 = -i4;
            }
            return FromInt64(i4);
        }
        if (PositiveCompare(eInteger) < 0) {
            return this;
        }
        short[] sArr = new short[i3];
        GeneralDivide(this.words, 0, this.wordCount, eInteger.words, 0, eInteger.wordCount, null, 0, sArr, 0);
        int iCountWords = CountWords(sArr);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, ShortenArray(sArr, iCountWords), this.negative);
    }

    public EInteger Root(int i2) {
        return RootRemInternal(FromInt32(i2), false)[0];
    }

    public EInteger Root(EInteger eInteger) {
        if (eInteger != null) {
            return RootRemInternal(eInteger, false)[0];
        }
        throw new NullPointerException("root");
    }

    public EInteger[] RootRem(int i2) {
        return RootRemInternal(FromInt32(i2), true);
    }

    public EInteger[] RootRem(EInteger eInteger) {
        if (eInteger != null) {
            return RootRemInternal(eInteger, true);
        }
        throw new NullPointerException("root");
    }

    public EInteger ShiftLeft(int i2) {
        int i3;
        if (i2 == 0 || (i3 = this.wordCount) == 0) {
            return this;
        }
        if (i2 < 0) {
            return i2 == Integer.MIN_VALUE ? ShiftRight(1).ShiftRight(Integer.MAX_VALUE) : ShiftRight(-i2);
        }
        int i4 = i2 >> 4;
        int i5 = (-1) - (((-1) - i2) | ((-1) - 15));
        if (!this.negative) {
            int iBitsToWords = NumberUtility.BitLength((-1) - (((-1) - this.words[i3 + (-1)]) | ((-1) - 65535))) + i5 <= 16 ? i3 + i4 : BitsToWords(i2) + i3;
            short[] sArr = new short[iBitsToWords];
            System.arraycopy(this.words, 0, sArr, i4, i3);
            ShiftWordsLeftByBits(sArr, i4, iBitsToWords - i4, i5);
            return new EInteger(iBitsToWords, sArr, false);
        }
        int iBitsToWords2 = BitsToWords(i2) + i3;
        short[] sArr2 = new short[iBitsToWords2];
        System.arraycopy(this.words, 0, sArr2, 0, i3);
        TwosComplement(sArr2, 0, iBitsToWords2);
        ShiftWordsLeftByWords(sArr2, 0, i3 + i4, i4);
        ShiftWordsLeftByBits(sArr2, i4, i3 + BitsToWords(i5), i5);
        TwosComplement(sArr2, 0, iBitsToWords2);
        return new EInteger(CountWords(sArr2), sArr2, true);
    }

    public EInteger ShiftLeft(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("eshift");
        }
        if (eInteger.signum() < 0) {
            return ShiftRight(eInteger.Negate());
        }
        EInteger eIntegerShiftLeft = this;
        while (!eInteger.CanFitInInt32()) {
            eInteger = eInteger.Subtract(2147483632);
            eIntegerShiftLeft = eIntegerShiftLeft.ShiftLeft(2147483632);
        }
        return eIntegerShiftLeft.ShiftLeft(eInteger.ToInt32Checked());
    }

    public EInteger ShiftRight(int i2) {
        int i3;
        short[] sArrShortenArray;
        int length;
        if (i2 == 0 || (i3 = this.wordCount) == 0) {
            return this;
        }
        if (i2 < 0) {
            return i2 == Integer.MIN_VALUE ? ShiftLeft(1).ShiftLeft(Integer.MAX_VALUE) : ShiftLeft(-i2);
        }
        int i4 = i2 >> 4;
        int i5 = (-1) - (((-1) - i2) | ((-1) - 15));
        if (this.negative) {
            short[] sArr = this.words;
            length = sArr.length;
            sArrShortenArray = new short[length];
            System.arraycopy(sArr, 0, sArrShortenArray, 0, i3);
            TwosComplement(sArrShortenArray, 0, length);
            ShiftWordsRightByWordsSignExtend(sArrShortenArray, 0, i3, i4);
            if (i3 > i4) {
                ShiftWordsRightByBitsSignExtend(sArrShortenArray, 0, i3 - i4, i5);
            }
            TwosComplement(sArrShortenArray, 0, length);
        } else {
            if (i4 >= i3) {
                return FromInt32(0);
            }
            short[] sArr2 = this.words;
            sArrShortenArray = new short[sArr2.length];
            length = i3 - i4;
            System.arraycopy(sArr2, i4, sArrShortenArray, 0, length);
            if (i5 != 0) {
                ShiftWordsRightByBits(sArrShortenArray, 0, length, i5);
            }
        }
        while (length != 0 && sArrShortenArray[length - 1] == 0) {
            length--;
        }
        if (length == 0) {
            return FromInt32(0);
        }
        if (i4 > 2) {
            sArrShortenArray = ShortenArray(sArrShortenArray, length);
        }
        return new EInteger(length, sArrShortenArray, this.negative);
    }

    public EInteger ShiftRight(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("eshift");
        }
        if (eInteger.signum() < 0) {
            return ShiftLeft(eInteger.Negate());
        }
        EInteger eIntegerShiftRight = this;
        while (!eInteger.CanFitInInt32()) {
            eInteger = eInteger.Subtract(2147483632);
            eIntegerShiftRight = eIntegerShiftRight.ShiftRight(2147483632);
        }
        return eIntegerShiftRight.ShiftRight(eInteger.ToInt32Checked());
    }

    public EInteger Sqrt() {
        return SqrtRemInternal(false)[0];
    }

    public EInteger[] SqrtRem() {
        return SqrtRemInternal(true);
    }

    public EInteger Subtract(int i2) {
        return i2 == Integer.MIN_VALUE ? Subtract(FromInt32(i2)) : i2 == 0 ? this : Add(-i2);
    }

    public EInteger Subtract(long j2) {
        return Subtract(FromInt64(j2));
    }

    public EInteger Subtract(EInteger eInteger) {
        if (eInteger != null) {
            return this.wordCount == 0 ? eInteger.Negate() : eInteger.wordCount == 0 ? this : Add(eInteger.Negate());
        }
        throw new NullPointerException("subtrahend");
    }

    public byte ToByteChecked() {
        int iToInt32Checked = ToInt32Checked();
        if (iToInt32Checked < 0 || iToInt32Checked > 255) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return (byte) ((-1) - (((-1) - iToInt32Checked) | ((-1) - 255)));
    }

    public byte ToByteUnchecked() {
        return (byte) (ToInt32Unchecked() & 255);
    }

    public byte[] ToBytes(boolean z2) {
        int iSignum = signum();
        int i2 = 0;
        if (iSignum == 0) {
            return new byte[]{0};
        }
        if (iSignum > 0) {
            int iByteCount = ByteCount();
            int i3 = GetUnsignedBit((iByteCount * 8) - 1) ? iByteCount + 1 : iByteCount;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            while (i2 < iByteCount) {
                int i5 = z2 ? i2 : (i3 - 1) - i2;
                int i6 = z2 ? i2 + 1 : (i3 - 2) - i2;
                short s2 = this.words[i4];
                bArr[i5] = (byte) ((s2 + 255) - (255 | s2));
                if (i6 >= 0 && i6 < i3) {
                    bArr[i6] = (byte) ((-1) - (((-1) - (s2 >> 8)) | ((-1) - 255)));
                }
                i2 += 2;
                i4++;
            }
            return bArr;
        }
        short[] sArr = this.words;
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        TwosComplement(sArr2, 0, length);
        int i7 = length * 2;
        int i8 = length - 1;
        int i9 = i7;
        while (true) {
            if (i8 < 0) {
                break;
            }
            short s3 = sArr2[i8];
            if (s3 == -1) {
                i9 -= 2;
                i8--;
            } else if ((s3 & 65408) == 65408) {
                i9--;
            } else if ((s3 & ShortCompanionObject.MIN_VALUE) != 32768) {
                i9++;
            }
        }
        int i10 = i9 != 0 ? i9 : 1;
        byte[] bArr2 = new byte[i10];
        bArr2[z2 ? i10 - 1 : 0] = -1;
        int iMin = Math.min(i10, i7);
        int i11 = 0;
        while (i2 < iMin) {
            int i12 = z2 ? i2 : (i10 - 1) - i2;
            int i13 = z2 ? i2 + 1 : (i10 - 2) - i2;
            short s4 = sArr2[i11];
            bArr2[i12] = (byte) ((s4 + 255) - (255 | s4));
            if (i13 >= 0 && i13 < iMin) {
                int i14 = s4 >> 8;
                bArr2[i13] = (byte) ((i14 + 255) - (i14 | 255));
            }
            i2 += 2;
            i11++;
        }
        return bArr2;
    }

    public short ToInt16Checked() {
        int iToInt32Checked = ToInt32Checked();
        if (iToInt32Checked < -32768 || iToInt32Checked > 32767) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return (short) ((-1) - (((-1) - iToInt32Checked) | ((-1) - 65535)));
    }

    public short ToInt16Unchecked() {
        int iToInt32Unchecked = ToInt32Unchecked();
        return (short) ((iToInt32Unchecked + 65535) - (iToInt32Unchecked | 65535));
    }

    public int ToInt32Checked() {
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0;
        }
        if (i2 > 2) {
            throw new ArithmeticException();
        }
        if (i2 == 2) {
            short[] sArr = this.words;
            short s2 = sArr[1];
            if ((-1) - (((-1) - 32768) | ((-1) - s2)) != 0) {
                if (this.negative && s2 == Short.MIN_VALUE && sArr[0] == 0) {
                    return Integer.MIN_VALUE;
                }
                throw new ArithmeticException();
            }
        }
        return ToInt32Unchecked();
    }

    public int ToInt32Unchecked() {
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0;
        }
        short[] sArr = this.words;
        short s2 = sArr[0];
        int i3 = (s2 + 65535) - (s2 | 65535);
        if (i2 > 1) {
            int i4 = (sArr[1] & 65535) << 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        return this.negative ? ~(i3 - 1) : i3;
    }

    public long ToInt64Checked() {
        int i2 = this.wordCount;
        if (i2 == 0) {
            return 0L;
        }
        if (i2 > 4) {
            throw new ArithmeticException();
        }
        if (i2 == 4) {
            short[] sArr = this.words;
            short s2 = sArr[3];
            if ((Short.MIN_VALUE & s2) != 0) {
                if (this.negative && s2 == Short.MIN_VALUE && sArr[2] == 0 && sArr[1] == 0 && sArr[0] == 0) {
                    return Long.MIN_VALUE;
                }
                throw new ArithmeticException();
            }
        }
        return ToInt64Unchecked();
    }

    public long ToInt64Unchecked() {
        int i2;
        int i3 = this.wordCount;
        if (i3 == 0) {
            return 0L;
        }
        short[] sArr = this.words;
        short s2 = sArr[0];
        int i4 = (s2 + 65535) - (s2 | 65535);
        if (i3 > 1) {
            int i5 = (sArr[1] & 65535) << 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        if (i3 <= 2) {
            long j2 = ((long) i4) & 4294967295L;
            return this.negative ? -j2 : j2;
        }
        int i6 = (-1) - (((-1) - sArr[2]) | ((-1) - 65535));
        if (i3 > 3) {
            i6 |= (sArr[3] & 65535) << 16;
        }
        if (this.negative) {
            if (i4 == 0) {
                i2 = i4 - 1;
                i6--;
            } else {
                i2 = i4 - 1;
            }
            i4 = ~i2;
            i6 = ~i6;
        }
        long j3 = (-1) - (((-1) - ((long) i4)) | ((-1) - 4294967295L));
        long j4 = ((long) i6) << 32;
        return (j3 + j4) - (j3 & j4);
    }

    public String ToRadixString(int i2) {
        if (i2 < 2) {
            throw new IllegalArgumentException("radix(" + i2 + ") is less than 2");
        }
        if (i2 > 36) {
            throw new IllegalArgumentException("radix(" + i2 + ") is more than 36");
        }
        if (this.wordCount == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (i2 == 10) {
            if (CanFitInInt64()) {
                return FastInteger.LongToString(ToInt64Unchecked());
            }
            StringBuilder sb = new StringBuilder();
            if (this.negative) {
                sb.append(Soundex.SILENT_MARKER);
            }
            Abs().ToRadixStringGeneral(sb, i2);
            return sb.toString();
        }
        boolean z2 = true;
        if (i2 == 16) {
            StringBuilder sb2 = new StringBuilder();
            if (this.negative) {
                sb2.append(Soundex.SILENT_MARKER);
            }
            int i3 = 0;
            int i4 = this.words[this.wordCount - 1];
            while (i3 < 4) {
                if (!z2 || (61440 & i4) != 0) {
                    int i5 = i4 >> 12;
                    sb2.append(Digits.charAt((i5 + 15) - (i5 | 15)));
                    z2 = false;
                }
                i3++;
                i4 <<= 4;
            }
            for (int i6 = this.wordCount - 2; i6 >= 0; i6--) {
                int i7 = 0;
                int i8 = this.words[i6];
                while (i7 < 4) {
                    sb2.append(Digits.charAt((i8 >> 12) & 15));
                    i7++;
                    i8 <<= 4;
                }
            }
            return sb2.toString();
        }
        if (i2 != 2) {
            StringBuilder sb3 = new StringBuilder();
            if (this.negative) {
                sb3.append(Soundex.SILENT_MARKER);
            }
            Abs().ToRadixStringGeneral(sb3, i2);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        if (this.negative) {
            sb4.append(Soundex.SILENT_MARKER);
        }
        int i9 = 0;
        int i10 = this.words[this.wordCount - 1];
        while (true) {
            if (i9 >= 16) {
                break;
            }
            if (!z2 || (-1) - (((-1) - i10) | ((-1) - 32768)) != 0) {
                sb4.append((i10 & 32768) != 0 ? '1' : '0');
                z2 = false;
            }
            i9++;
            i10 <<= 1;
        }
        for (int i11 = this.wordCount - 2; i11 >= 0; i11--) {
            int i12 = 0;
            int i13 = this.words[i11];
            while (i12 < 16) {
                sb4.append((i13 & 32768) == 0 ? '0' : '1');
                i12++;
                i13 <<= 1;
            }
        }
        return sb4.toString();
    }

    public EInteger Xor(EInteger eInteger) {
        if (eInteger == null) {
            throw new NullPointerException("other");
        }
        if (equals(eInteger)) {
            return FromInt32(0);
        }
        int i2 = this.wordCount;
        if (i2 == 0) {
            return eInteger;
        }
        int i3 = eInteger.wordCount;
        if (i3 == 0) {
            return this;
        }
        if (!this.negative && !eInteger.negative) {
            int iMin = Math.min(i2, i3);
            int iMax = Math.max(this.wordCount, eInteger.wordCount);
            int i4 = this.wordCount;
            short[] sArr = i4 == iMin ? this.words : eInteger.words;
            short[] sArr2 = i4 == iMin ? eInteger.words : this.words;
            short[] sArr3 = new short[iMax];
            for (int i5 = 0; i5 < iMin; i5++) {
                sArr3[i5] = (short) (sArr[i5] ^ sArr2[i5]);
            }
            System.arraycopy(sArr2, iMin, sArr3, iMin, iMax - iMin);
            if (iMin == iMax) {
                iMax = CountWords(sArr3);
            }
            return iMax == 0 ? FromInt32(0) : new EInteger(iMax, sArr3, false);
        }
        short[] sArr4 = new short[i2];
        System.arraycopy(this.words, 0, sArr4, 0, i2);
        int i6 = eInteger.wordCount;
        short[] sArr5 = new short[i6];
        System.arraycopy(eInteger.words, 0, sArr5, 0, i6);
        boolean z2 = this.negative;
        boolean z3 = eInteger.negative;
        short[] sArrCleanGrow = CleanGrow(sArr4, Math.max(i2, i6));
        short[] sArrCleanGrow2 = CleanGrow(sArr5, Math.max(sArrCleanGrow.length, i6));
        if (z2) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        if (z3) {
            TwosComplement(sArrCleanGrow2, 0, sArrCleanGrow2.length);
        }
        boolean z4 = z3 ^ z2;
        XorWords(sArrCleanGrow, sArrCleanGrow, sArrCleanGrow2, sArrCleanGrow.length);
        if (z4) {
            TwosComplement(sArrCleanGrow, 0, sArrCleanGrow.length);
        }
        int iCountWords = CountWords(sArrCleanGrow);
        return iCountWords == 0 ? FromInt32(0) : new EInteger(iCountWords, sArrCleanGrow, z4);
    }

    public EInteger XorNot(EInteger eInteger) {
        if (eInteger != null) {
            return Xor(eInteger.Not());
        }
        throw new NullPointerException("second");
    }

    public int compareTo(int i2) {
        int i3 = this.wordCount;
        if (i3 > 2) {
            return this.negative ? -1 : 1;
        }
        if (i3 == 2) {
            short[] sArr = this.words;
            short s2 = sArr[1];
            if ((Short.MIN_VALUE & s2) != 0) {
                boolean z2 = this.negative;
                return (z2 && s2 == Short.MIN_VALUE && sArr[0] == 0) ? i2 == Integer.MIN_VALUE ? 0 : -1 : z2 ? -1 : 1;
            }
        }
        int iToInt32Unchecked = ToInt32Unchecked();
        if (iToInt32Unchecked == i2) {
            return 0;
        }
        return iToInt32Unchecked < i2 ? -1 : 1;
    }

    public int compareTo(long j2) {
        return compareTo(FromInt64(j2));
    }

    @Override // java.lang.Comparable
    public int compareTo(EInteger eInteger) {
        if (eInteger == null) {
            return 1;
        }
        if (this == eInteger) {
            return 0;
        }
        int i2 = this.wordCount;
        int i3 = eInteger.wordCount;
        byte b2 = i2 == 0 ? (byte) 0 : this.negative ? (byte) -1 : (byte) 1;
        byte b3 = i3 == 0 ? (byte) 0 : eInteger.negative ? (byte) -1 : (byte) 1;
        if (b2 != b3) {
            return b2 < b3 ? -1 : 1;
        }
        if (b2 == 0) {
            return 0;
        }
        if (i2 != i3) {
            return (i2 > i3) ^ (b2 <= 0) ? 1 : -1;
        }
        if (i2 == 1 && this.words[0] == eInteger.words[0]) {
            return 0;
        }
        short[] sArr = this.words;
        short[] sArr2 = eInteger.words;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return 0;
            }
            int i5 = sArr[i4] & 65535;
            int i6 = (-1) - (((-1) - 65535) | ((-1) - sArr2[i4]));
            if (i5 > i6) {
                return b2 > 0 ? 1 : -1;
            }
            if (i5 < i6) {
                return b2 > 0 ? -1 : 1;
            }
            i2 = i4;
        }
    }

    public boolean equals(Object obj) {
        EInteger eInteger = obj instanceof EInteger ? (EInteger) obj : null;
        if (eInteger == null || this.wordCount != eInteger.wordCount || this.negative != eInteger.negative) {
            return false;
        }
        for (int i2 = 0; i2 < this.wordCount; i2++) {
            if (this.words[i2] != eInteger.words[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iSignum = signum() * 1000000007;
        if (this.words != null) {
            for (int i2 = 0; i2 < this.wordCount; i2++) {
                iSignum += this.words[i2] * 1000000013;
            }
        }
        return iSignum;
    }

    public final boolean isEven() {
        return !GetUnsignedBit(0);
    }

    public final boolean isPowerOfTwo() {
        int i2 = this.wordCount;
        if (this.negative || i2 == 0 || (i2 > 1 && this.words[0] != 0)) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i3 >= i4) {
                int i5 = (-1) - (((-1) - this.words[i4]) | ((-1) - 65535));
                if (i5 == 0) {
                    throw new IllegalStateException();
                }
                while ((i5 + 1) - (1 | i5) == 0) {
                    i5 >>= 1;
                }
                return i5 == 1;
            }
            if (this.words[i3] != 0) {
                return false;
            }
            i3++;
        }
    }

    public final boolean isZero() {
        return this.wordCount == 0;
    }

    public final int signum() {
        if (this.wordCount == 0) {
            return 0;
        }
        return this.negative ? -1 : 1;
    }

    public String toString() {
        return isZero() ? AdkSettings.PLATFORM_TYPE_MOBILE : CanFitInInt64() ? FastInteger.LongToString(ToInt64Unchecked()) : ToRadixString(10);
    }
}
