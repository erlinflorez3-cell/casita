package com.upokecenter.cbor;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.upokecenter.numbers.EContext;
import com.upokecenter.numbers.EDecimal;
import com.upokecenter.numbers.EFloat;
import com.upokecenter.numbers.EInteger;
import com.upokecenter.numbers.ERounding;
import com.upokecenter.util.DataUtilities;
import com.valid.communication.helpers.CommunicationConstants;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes5.dex */
final class CBORUtilities {
    private static final long DoublePosInfinity = 9218868437227405312L;
    public static final int FractionalSeconds = 1000000000;
    private static final String HexAlphabet = "0123456789ABCDEF";
    private static final EInteger EInteger1970 = EInteger.FromInt32(1970);
    private static final EInteger EInteger86400 = EInteger.FromInt32(86400);
    private static final int[] ValueNormalDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] ValueLeapDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] ValueNormalToMonth = {0, 31, 59, 90, 120, 151, 181, Mp4VideoDirectory.TAG_OPCOLOR, 243, 273, 304, 334, 365};
    private static final int[] ValueLeapToMonth = {0, 31, 60, 91, 121, 152, 182, Mp4VideoDirectory.TAG_COLOR_TABLE, 244, 274, 305, 335, 366};

    private CBORUtilities() {
    }

    public static void BreakDownSecondsSinceEpoch(long j2, EInteger[] eIntegerArr, int[] iArr) {
        EInteger[] eIntegerArr2 = new EInteger[3];
        long jFloorDiv = FloorDiv(j2, 86400) + 1;
        int iFloorModLong = (int) FloorModLong(j2, 86400);
        GetNormalizedPartProlepticGregorian(EInteger1970, 1, EInteger.FromInt64(jFloorDiv), eIntegerArr, iArr);
        iArr[2] = iFloorModLong / NikonType2MakernoteDirectory.TAG_NIKON_SCAN;
        iArr[3] = (iFloorModLong % NikonType2MakernoteDirectory.TAG_NIKON_SCAN) / 60;
        iArr[4] = iFloorModLong % 60;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static void BreakDownSecondsSinceEpoch(EDecimal eDecimal, EInteger[] eIntegerArr, int[] iArr) {
        EInteger eIntegerToEInteger = eDecimal.Quantize(0, ERounding.Floor).ToEInteger();
        int iToInt32Checked = eDecimal.Subtract(EDecimal.FromEInteger(eIntegerToEInteger)).Abs().Multiply(1000000000).ToInt32Checked();
        EInteger eInteger = EInteger86400;
        EInteger eIntegerAdd = FloorDiv(eIntegerToEInteger, eInteger).Add(1);
        int iToInt32Checked2 = FloorMod(eIntegerToEInteger, eInteger).ToInt32Checked();
        GetNormalizedPartProlepticGregorian(EInteger1970, 1, eIntegerAdd, eIntegerArr, iArr);
        iArr[2] = iToInt32Checked2 / NikonType2MakernoteDirectory.TAG_NIKON_SCAN;
        iArr[3] = (iToInt32Checked2 % NikonType2MakernoteDirectory.TAG_NIKON_SCAN) / 60;
        iArr[4] = iToInt32Checked2 % 60;
        iArr[5] = iToInt32Checked;
        iArr[6] = 0;
    }

    public static int ByteArrayCompare(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null ? 0 : -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return (b2 + 255) - (b2 | 255) < (b3 & 255) ? -1 : 1;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length < bArr2.length ? -1 : 1;
        }
        return 0;
    }

    public static int ByteArrayCompareLengthFirst(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null ? 0 : -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        if (bArr.length != bArr2.length) {
            return bArr.length < bArr2.length ? -1 : 1;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return (-1) - (((-1) - b2) | ((-1) - 255)) < (b3 + 255) - (b3 | 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public static boolean ByteArrayEquals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int ByteArrayHashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = 589 + bArr.length;
        for (byte b2 : bArr) {
            length = (length * 31) + b2;
        }
        return length;
    }

    public static void CheckLesserFields(int[] iArr) {
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        int i2 = iArr[0];
        if (i2 < 1) {
            throw new IllegalArgumentException("\"month\" (" + iArr[0] + ") is not greater or equal to 1");
        }
        if (i2 > 12) {
            throw new IllegalArgumentException("\"month\" (" + iArr[0] + ") is not less or equal to 12");
        }
        int i3 = iArr[1];
        if (i3 < 1) {
            throw new IllegalArgumentException("\"intDay\" (" + iArr[1] + ") is not greater or equal to 1");
        }
        if (i3 > 31) {
            throw new IllegalArgumentException("\"day\" (" + iArr[1] + ") is not less or equal to 31");
        }
        if (i3 > ValueLeapDays[i2]) {
            throw new IllegalArgumentException();
        }
        int i4 = iArr[2];
        if (i4 < 0) {
            throw new IllegalArgumentException("\"hour\" (" + iArr[2] + ") is not greater or equal to 0");
        }
        if (i4 > 23) {
            throw new IllegalArgumentException("\"hour\" (" + iArr[2] + ") is not less or equal to 23");
        }
        int i5 = iArr[3];
        if (i5 < 0) {
            throw new IllegalArgumentException("\"minute\" (" + iArr[3] + ") is not greater or equal to 0");
        }
        if (i5 > 59) {
            throw new IllegalArgumentException("\"minute\" (" + iArr[3] + ") is not less or equal to 59");
        }
        int i6 = iArr[4];
        if (i6 < 0) {
            throw new IllegalArgumentException("\"second\" (" + iArr[4] + ") is not greater or equal to 0");
        }
        if (i6 > 59) {
            throw new IllegalArgumentException("\"second\" (" + iArr[4] + ") is not less or equal to 59");
        }
        int i7 = iArr[5];
        if (i7 < 0) {
            throw new IllegalArgumentException("\"lesserFields[5]\" (" + iArr[5] + ") is not greater or equal to 0");
        }
        if (i7 >= 1000000000) {
            throw new IllegalArgumentException("\"lesserFields[5]\" (" + iArr[5] + ") is not less than 1000000000");
        }
        int i8 = iArr[6];
        if (i8 < -1439) {
            throw new IllegalArgumentException("\"lesserFields[6]\" (" + iArr[6] + ") is not greater or equal to -1439");
        }
        if (i8 > 1439) {
            throw new IllegalArgumentException("\"lesserFields[6]\" (" + iArr[6] + ") is not less or equal to 1439");
        }
    }

    public static boolean CheckUtf16(String str) {
        int i2 = 0;
        while (i2 != str.length()) {
            int iCodePointAt = DataUtilities.CodePointAt(str, i2, 1);
            if (iCodePointAt < 0) {
                return false;
            }
            i2 = iCodePointAt >= 65536 ? i2 + 2 : i2 + 1;
        }
        return true;
    }

    public static boolean CheckUtf8(byte[] bArr) {
        int i2 = 0;
        while (true) {
            int iUtf8CodePointAt = Utf8CodePointAt(bArr, i2);
            if (iUtf8CodePointAt == -1) {
                return true;
            }
            if (iUtf8CodePointAt == -2) {
                return false;
            }
            i2 = iUtf8CodePointAt >= 65536 ? i2 + 4 : iUtf8CodePointAt >= 2048 ? i2 + 3 : iUtf8CodePointAt >= 128 ? i2 + 2 : i2 + 1;
        }
    }

    public static void CheckYearAndLesserFields(int i2, int[] iArr) {
        CheckLesserFields(iArr);
        if (iArr[0] == 2 && iArr[1] == 29 && !IsLeapYear(i2)) {
            throw new IllegalArgumentException();
        }
    }

    public static void CheckYearAndLesserFields(EInteger eInteger, int[] iArr) {
        CheckLesserFields(iArr);
        if (iArr[0] == 2 && iArr[1] == 29) {
            if (eInteger.Remainder(4).signum() != 0 || (eInteger.Remainder(100).signum() == 0 && eInteger.Remainder(400).signum() != 0)) {
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x00e0, code lost:
    
        if (r20 == r23) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00e2, code lost:
    
        if (r20 >= r23) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00e4, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:?, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int CompareStringsAsUtf8LengthFirst(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORUtilities.CompareStringsAsUtf8LengthFirst(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0092, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0095, code lost:
    
        if (r13 == r1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0097, code lost:
    
        if (r13 >= r1) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0099, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int CompareUtf16Utf8LengthFirst(java.lang.String r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORUtilities.CompareUtf16Utf8LengthFirst(java.lang.String, byte[]):int");
    }

    public static EFloat DateTimeToIntegerOrDouble(EInteger eInteger, int[] iArr, int[] iArr2) {
        if (eInteger == null) {
            throw new NullPointerException("bigYear");
        }
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        if (iArr2 == null) {
            throw new NullPointerException("status");
        }
        if (iArr2.length < 1) {
            throw new IllegalArgumentException("\"status\" + \"'s length\" (" + iArr2.length + ") is not greater or equal to 1");
        }
        if (iArr[6] != 0) {
            throw new UnsupportedOperationException("Local time offsets not supported");
        }
        EInteger eIntegerAdd = GetNumberOfDaysProlepticGregorian(eInteger, iArr[0], iArr[1]).Multiply(24).Add(iArr[2]).Multiply(60).Add(iArr[3]).Multiply(60).Add(iArr[4]);
        if (iArr[5] == 0 && eIntegerAdd.GetUnsignedBitLengthAsInt64() <= 64) {
            iArr2[0] = 0;
            return EFloat.FromEInteger(eIntegerAdd);
        }
        double dToDouble = EDecimal.FromInt32(iArr[5]).Divide(1000000000).Add(EDecimal.FromEInteger(eIntegerAdd)).ToDouble();
        if (dToDouble == Double.POSITIVE_INFINITY || dToDouble == Double.NEGATIVE_INFINITY || Double.isNaN(dToDouble)) {
            iArr2[0] = 2;
            return null;
        }
        iArr2[0] = 1;
        return EFloat.FromDouble(dToDouble);
    }

    public static boolean DoubleBitsFinite(long j2) {
        return (j2 + Long.MAX_VALUE) - (j2 | Long.MAX_VALUE) < DoublePosInfinity;
    }

    public static boolean DoubleBitsNaN(long j2) {
        return (j2 & Long.MAX_VALUE) > DoublePosInfinity;
    }

    public static String DoubleBitsToString(long j2) {
        return EFloat.FromDoubleBits(j2).ToShortestString(EContext.Binary64);
    }

    public static boolean DoubleRetainsSameValueInSingle(long j2) {
        if ((Long.MAX_VALUE & j2) == 0) {
            return true;
        }
        int i2 = (int) ((j2 >> 52) & 2047);
        long j3 = 4503599627370495L & j2;
        int i3 = i2 - 896;
        if (i2 == 2047) {
            return (j2 + 536870911) - (j2 | 536870911) == 0;
        }
        if (i3 < -23 || i3 >= 255) {
            return false;
        }
        if (i3 > 0) {
            return (j2 + 536870911) - (j2 | 536870911) == 0;
        }
        if (i3 != -23) {
            return (-1) - (((-1) - j3) | ((-1) - ((1 << (29 - (i2 + (-897)))) - 1))) == 0;
        }
        int i4 = 29 - (i2 - 897);
        return (-1) - (((-1) - j3) | ((-1) - ((1 << i4) - 1))) == 0 && RoundedShift((-1) - (((-1) - 4503599627370496L) & ((-1) - j3)), i4) != 0;
    }

    public static int DoubleToHalfPrecisionIfSameValue(long j2) {
        int i2 = (int) ((-1) - (((-1) - (j2 >> 52)) | ((-1) - 2047)));
        long j3 = 4503599627370495L & j2;
        int i3 = (int) (j2 >> 48);
        int i4 = (i3 + 32768) - (i3 | 32768);
        int i5 = i2 - 1008;
        if (i2 == 2047) {
            int i6 = (int) (j3 >> 42);
            if ((j2 + 4398046511103L) - (j2 | 4398046511103L) != 0) {
                return -1;
            }
            int i7 = (-1) - (((-1) - i4) & ((-1) - 31744));
            return (i7 + i6) - (i7 & i6);
        }
        if (i2 == 0 && j3 == 0) {
            return i4;
        }
        if (i5 >= 31 || i5 < -10) {
            return -1;
        }
        if (i5 > 0) {
            if ((j2 & 4398046511103L) != 0) {
                return -1;
            }
            return (-1) - (((-1) - ((-1) - (((-1) - (i5 << 10)) & ((-1) - i4)))) & ((-1) - RoundedShift(j3, 42)));
        }
        int i8 = 42 - (i2 + CommunicationConstants.UNKNOWN_HOST_EXCEPTION_CODE);
        int iRoundedShift = RoundedShift((4503599627370496L + j3) - (4503599627370496L & j3), i8);
        if (i5 == -10 && iRoundedShift == 0) {
            return -1;
        }
        long j4 = (1 << i8) - 1;
        if ((j3 + j4) - (j3 | j4) == 0) {
            return (-1) - (((-1) - i4) & ((-1) - iRoundedShift));
        }
        return -1;
    }

    public static long DoubleToInt64Bits(double d2) {
        return Double.doubleToRawLongBits(d2);
    }

    public static int DoubleToRoundedHalfPrecision(long j2) {
        int iRoundedShift;
        int i2 = (int) ((j2 >> 52) & 2047);
        long j3 = (4503599627370495L + j2) - (4503599627370495L | j2);
        int i3 = ((int) (j2 >> 48)) & 32768;
        int i4 = i2 - 1008;
        if (i2 == 2047) {
            int i5 = (int) (j3 >> 42);
            return (j3 == 0 || i5 != 0) ? i3 | 31744 | i5 : (i3 + 31745) - (i3 & 31745);
        }
        if (i4 >= 31) {
            return (-1) - (((-1) - i3) & ((-1) - 31744));
        }
        if (i4 < -10) {
            return i3;
        }
        if (i4 > 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (i4 << 10)));
            iRoundedShift = RoundedShift(j3, 42);
        } else {
            iRoundedShift = RoundedShift((-1) - (((-1) - j3) & ((-1) - 4503599627370496L)), 42 - (i2 + CommunicationConstants.UNKNOWN_HOST_EXCEPTION_CODE));
        }
        return (i3 + iRoundedShift) - (i3 & iRoundedShift);
    }

    public static int DoubleToRoundedSinglePrecision(long j2) {
        int iRoundedShift;
        long j3 = j2 >> 52;
        int i2 = (int) ((j3 + 2047) - (j3 | 2047));
        long j4 = (4503599627370495L + j2) - (4503599627370495L | j2);
        int i3 = (int) (j2 >> 32);
        int i4 = (i3 - Integer.MIN_VALUE) - (i3 | Integer.MIN_VALUE);
        int i5 = i2 - 896;
        if (i2 == 2047) {
            int i6 = (int) (j4 >> 29);
            if (j4 == 0 || i6 != 0) {
                i4 = (i4 + 2139095040) - (i4 & 2139095040);
            } else {
                i6 = 2139095041;
            }
            return i4 | i6;
        }
        if (i5 >= 255) {
            return i4 | 2139095040;
        }
        if (i5 < -23) {
            return i4;
        }
        if (i5 > 0) {
            i4 |= i5 << 23;
            iRoundedShift = RoundedShift(j4, 29);
        } else {
            iRoundedShift = RoundedShift((j4 + 4503599627370496L) - (j4 & 4503599627370496L), 29 - (i2 - 897));
        }
        return (-1) - (((-1) - i4) & ((-1) - iRoundedShift));
    }

    @Deprecated
    public static String DoubleToString(double d2) {
        return EFloat.FromDouble(d2).ToShortestString(EContext.Binary64);
    }

    @Deprecated
    public static EInteger EIntegerFromDouble(double d2) {
        return EIntegerFromDoubleBits(Double.doubleToRawLongBits(d2));
    }

    public static EInteger EIntegerFromDoubleBits(long j2) {
        int i2 = (int) ((-1) - (((-1) - j2) | ((-1) - 4294967295L)));
        int i3 = (int) ((-1) - (((-1) - (j2 >> 32)) | ((-1) - 4294967295L)));
        int i4 = i3 >> 20;
        int i5 = (i4 + 2047) - (i4 | 2047);
        boolean z2 = (i3 >> 31) != 0;
        if (i5 == 2047) {
            throw new ArithmeticException("Value is infinity or NaN");
        }
        int i6 = i3 & 1048575;
        if (i5 == 0) {
            i5++;
        } else {
            i6 = (-1) - (((-1) - i6) & ((-1) - 1048576));
        }
        if ((-1) - (((-1) - i6) & ((-1) - i2)) != 0) {
            while ((1 & i2) == 0) {
                int i7 = (-1) - (((-1) - (i2 >> 1)) | ((-1) - Integer.MAX_VALUE));
                int i8 = i6 << 31;
                i2 = (i8 + i7) - (i8 & i7);
                i6 >>= 1;
                i5++;
            }
        }
        int i9 = i5 - 1075;
        EInteger eIntegerFromBytes = EInteger.FromBytes(new byte[]{(byte) ((-1) - (((-1) - i2) | ((-1) - 255))), (byte) ((-1) - (((-1) - (i2 >> 8)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))), (byte) ((-1) - (((-1) - (i2 >> 24)) | ((-1) - 255))), (byte) ((i6 + 255) - (255 | i6)), (byte) ((-1) - (((-1) - (i6 >> 8)) | ((-1) - 255))), (byte) ((i6 >> 16) & 255), (byte) 0, 0}, true);
        if (i9 == 0) {
            return z2 ? eIntegerFromBytes.Negate() : eIntegerFromBytes;
        }
        if (i9 > 0) {
            EInteger eIntegerShiftLeft = eIntegerFromBytes.ShiftLeft(i9);
            return z2 ? eIntegerShiftLeft.Negate() : eIntegerShiftLeft;
        }
        EInteger eIntegerShiftRight = eIntegerFromBytes.ShiftRight(-i9);
        return z2 ? eIntegerShiftRight.Negate() : eIntegerShiftRight;
    }

    public static String FirstCharLower(String str) {
        if (str.length() <= 0 || str.charAt(0) < 'A' || str.charAt(0) > 'Z') {
            return str;
        }
        return ((char) (str.charAt(0) + TokenParser.SP)) + str.substring(1);
    }

    public static String FirstCharUpper(String str) {
        if (str.length() <= 0 || str.charAt(0) < 'a' || str.charAt(0) > 'z') {
            return str;
        }
        return ((char) (str.charAt(0) - ' ')) + str.substring(1);
    }

    private static long FloorDiv(long j2, int i2) {
        return j2 >= 0 ? j2 / ((long) i2) : (-1) - (((-1) - j2) / ((long) i2));
    }

    private static EInteger FloorDiv(EInteger eInteger, EInteger eInteger2) {
        return eInteger.signum() >= 0 ? eInteger.Divide(eInteger2) : EInteger.FromInt32(-1).Subtract(EInteger.FromInt32(-1).Subtract(eInteger).Divide(eInteger2));
    }

    private static EInteger FloorMod(EInteger eInteger, EInteger eInteger2) {
        return eInteger.Subtract(FloorDiv(eInteger, eInteger2).Multiply(eInteger2));
    }

    private static long FloorModLong(long j2, int i2) {
        return j2 - (FloorDiv(j2, i2) * ((long) i2));
    }

    public static long GetIntegerValue(long j2) {
        long j3 = (j2 >> 63) != 0 ? -1L : 1L;
        long j4 = Long.MAX_VALUE & j2;
        if (j4 == 0) {
            return 0L;
        }
        if (j4 >= DoublePosInfinity) {
            throw new UnsupportedOperationException();
        }
        long j5 = j4 >> 52;
        if (j5 >= 1076) {
            throw new UnsupportedOperationException();
        }
        if (j5 > 1022) {
            return (((-1) - (((-1) - ((-1) - (((-1) - j2) | ((-1) - 4503599627370495L)))) & ((-1) - 4503599627370496L))) >> (52 - (((int) j5) - 1023))) * j3;
        }
        throw new UnsupportedOperationException();
    }

    public static void GetNormalizedPartProlepticGregorian(EInteger eInteger, int i2, EInteger eInteger2, EInteger[] eIntegerArr, int[] iArr) {
        int i3 = i2;
        EInteger eIntegerAdd = eInteger;
        EInteger eIntegerAdd2 = eInteger2;
        if (i3 <= 0 || i3 > 12) {
            throw new IllegalArgumentException("month");
        }
        if (eIntegerAdd.CanFitInInt32() && eIntegerAdd2.CanFitInInt32()) {
            long jToInt32Checked = eIntegerAdd.ToInt32Checked();
            int iToInt32Checked = eIntegerAdd2.ToInt32Checked();
            if (iToInt32Checked > 100) {
                int i4 = iToInt32Checked / 146097;
                iToInt32Checked -= i4 * 146097;
                jToInt32Checked += (long) (i4 * 400);
            }
            if (iToInt32Checked < -101) {
                int iAbs = iToInt32Checked == Integer.MIN_VALUE ? 14699 : Math.abs(iToInt32Checked) / 146097;
                iToInt32Checked += 146097 * iAbs;
                jToInt32Checked -= (long) (iAbs * 400);
            }
            if (jToInt32Checked == 1970 && i3 == 1 && iToInt32Checked > 0 && iToInt32Checked >= 10957) {
                iToInt32Checked -= 10957;
                jToInt32Checked = 2000;
            }
            if (jToInt32Checked == 2000 && i3 == 1 && iToInt32Checked > 0 && iToInt32Checked < 35064) {
                int i5 = iToInt32Checked / 1461;
                iToInt32Checked += i5 * 1461;
                jToInt32Checked -= (long) (i5 * 4);
            }
            while (iToInt32Checked > 366) {
                if ((jToInt32Checked + 3) - (jToInt32Checked | 3) != 0 || (jToInt32Checked % 100 == 0 && jToInt32Checked % 400 != 0)) {
                    jToInt32Checked++;
                    iToInt32Checked -= 365;
                } else {
                    jToInt32Checked++;
                    iToInt32Checked -= 366;
                }
            }
            int[] iArr2 = ((jToInt32Checked & 3) != 0 || (jToInt32Checked % 100 == 0 && jToInt32Checked % 400 != 0)) ? ValueNormalDays : ValueLeapDays;
            while (true) {
                int i6 = iArr2[i3];
                if (iToInt32Checked > 0 && iToInt32Checked <= i6) {
                    iArr[0] = i3;
                    iArr[1] = iToInt32Checked;
                    eIntegerArr[0] = EInteger.FromInt64(jToInt32Checked);
                    return;
                }
                if (iToInt32Checked > i6) {
                    iToInt32Checked -= i6;
                    if (i3 == 12) {
                        jToInt32Checked++;
                        iArr2 = ((-1) - (((-1) - jToInt32Checked) | ((-1) - 3)) != 0 || (jToInt32Checked % 100 == 0 && jToInt32Checked % 400 != 0)) ? ValueNormalDays : ValueLeapDays;
                        i3 = 1;
                    } else {
                        i3++;
                    }
                }
                if (iToInt32Checked <= 0) {
                    i3--;
                    if (i3 <= 0) {
                        jToInt32Checked--;
                        iArr2 = ((-1) - (((-1) - jToInt32Checked) | ((-1) - 3)) != 0 || (jToInt32Checked % 100 == 0 && jToInt32Checked % 400 != 0)) ? ValueNormalDays : ValueLeapDays;
                        i3 = 12;
                    }
                    iToInt32Checked += iArr2[i3];
                }
            }
        } else {
            if (eIntegerAdd2.compareTo(100) > 0) {
                EInteger eIntegerDivide = eIntegerAdd2.Divide(146097);
                eIntegerAdd2 = eIntegerAdd2.Subtract(eIntegerDivide.Multiply(146097));
                eIntegerAdd = eIntegerAdd.Add(eIntegerDivide.Multiply(400));
            }
            if (eIntegerAdd2.compareTo(-101) < 0) {
                EInteger eIntegerDivide2 = eIntegerAdd2.Abs().Divide(146097);
                eIntegerAdd2 = eIntegerAdd2.Add(eIntegerDivide2.Multiply(146097));
                eIntegerAdd = eIntegerAdd.Subtract(eIntegerDivide2.Multiply(400));
            }
            int[] iArr3 = (eIntegerAdd.Remainder(4).signum() != 0 || (eIntegerAdd.Remainder(100).signum() == 0 && eIntegerAdd.Remainder(400).signum() != 0)) ? ValueNormalDays : ValueLeapDays;
            while (true) {
                EInteger eIntegerFromInt32 = EInteger.FromInt32(iArr3[i3]);
                if (eIntegerAdd2.signum() > 0 && eIntegerAdd2.compareTo(eIntegerFromInt32) <= 0) {
                    iArr[0] = i3;
                    iArr[1] = eIntegerAdd2.ToInt32Checked();
                    eIntegerArr[0] = eIntegerAdd;
                    return;
                }
                if (eIntegerAdd2.compareTo(eIntegerFromInt32) > 0) {
                    eIntegerAdd2 = eIntegerAdd2.Subtract(eIntegerFromInt32);
                    if (i3 == 12) {
                        eIntegerAdd = eIntegerAdd.Add(1);
                        iArr3 = (eIntegerAdd.Remainder(4).signum() != 0 || (eIntegerAdd.Remainder(100).signum() == 0 && eIntegerAdd.Remainder(400).signum() != 0)) ? ValueNormalDays : ValueLeapDays;
                        i3 = 1;
                    } else {
                        i3++;
                    }
                }
                if (eIntegerAdd2.signum() <= 0) {
                    i3--;
                    if (i3 <= 0) {
                        eIntegerAdd = eIntegerAdd.Add(-1);
                        iArr3 = (eIntegerAdd.Remainder(4).signum() != 0 || (eIntegerAdd.Remainder(100).signum() == 0 && eIntegerAdd.Remainder(400).signum() != 0)) ? ValueNormalDays : ValueLeapDays;
                        i3 = 12;
                    }
                    eIntegerAdd2 = eIntegerAdd2.Add(iArr3[i3]);
                }
            }
        }
    }

    public static EInteger GetNumberOfDaysProlepticGregorian(EInteger eInteger, int i2, int i3) {
        if (i2 <= 0 || i2 > 12) {
            throw new IllegalArgumentException("month");
        }
        if (i3 <= 0 || i3 > 31) {
            throw new IllegalArgumentException("mday");
        }
        boolean z2 = false;
        EInteger eIntegerFromInt32 = EInteger.FromInt32(0);
        if (eInteger.compareTo(1970) >= 0) {
            if (eInteger.Remainder(4).signum() != 0 || (eInteger.Remainder(100).signum() == 0 && eInteger.Remainder(400).signum() != 0)) {
                z2 = true;
            }
            EInteger eIntegerFromInt322 = EInteger.FromInt32(1970);
            if (eIntegerFromInt322.Add(401).compareTo(eInteger) < 0) {
                EInteger eIntegerSubtract = eInteger.Subtract(2);
                eIntegerFromInt32 = eIntegerFromInt32.Add(eIntegerSubtract.Subtract(1970).Divide(400).Multiply(146097));
                eIntegerFromInt322 = eIntegerSubtract.Subtract(eIntegerSubtract.Subtract(1970).Remainder(400));
            }
            EInteger eIntegerAdd = eIntegerFromInt32.Add(eInteger.Subtract(eIntegerFromInt322).Multiply(365)).Add(eInteger.Subtract(eIntegerFromInt322.Remainder(4).signum() != 0 ? eIntegerFromInt322.Add(4 - eIntegerFromInt322.Remainder(4).ToInt32Checked()) : eIntegerFromInt322).Add(3).Divide(4));
            if (eIntegerFromInt322.Remainder(100).signum() != 0) {
                eIntegerFromInt322 = eIntegerFromInt322.Add(100 - eIntegerFromInt322.Remainder(100).ToInt32Checked());
            }
            while (eIntegerFromInt322.compareTo(eInteger) < 0) {
                if (eIntegerFromInt322.Remainder(400).signum() != 0) {
                    eIntegerAdd = eIntegerAdd.Subtract(1);
                }
                eIntegerFromInt322 = eIntegerFromInt322.Add(100);
            }
            return eIntegerAdd.Add(z2 ? ValueNormalToMonth[i2 - 1] : ValueLeapToMonth[i2 - 1]).Add(i3 - 1);
        }
        EInteger eIntegerFromInt323 = EInteger.FromInt32(1969);
        EInteger eIntegerSubtract2 = eIntegerFromInt323.Subtract(eInteger);
        if (eIntegerSubtract2.compareTo(401) > 0) {
            EInteger eIntegerDivide = eIntegerSubtract2.Subtract(401).Divide(400);
            eIntegerFromInt32 = eIntegerFromInt32.Subtract(eIntegerDivide.Multiply(146097));
            eIntegerSubtract2 = eIntegerSubtract2.Subtract(eIntegerDivide.Multiply(400));
            eIntegerFromInt323 = eIntegerFromInt323.Subtract(eIntegerDivide.Multiply(400));
        }
        EInteger eIntegerSubtract3 = eIntegerFromInt32.Subtract(eIntegerSubtract2.Multiply(365));
        int i4 = 1;
        while (eIntegerFromInt323.compareTo(eInteger) > 0) {
            if (i4 == 1 && eIntegerFromInt323.Remainder(4).signum() == 0) {
                i4 = 4;
            }
            if (eIntegerFromInt323.Remainder(4).signum() == 0 && (eIntegerFromInt323.Remainder(100).signum() != 0 || eIntegerFromInt323.Remainder(400).signum() == 0)) {
                eIntegerSubtract3 = eIntegerSubtract3.Subtract(1);
            }
            eIntegerFromInt323 = eIntegerFromInt323.Subtract(i4);
        }
        return (eInteger.Remainder(4).signum() != 0 || (eInteger.Remainder(100).signum() == 0 && eInteger.Remainder(400).signum() != 0)) ? eIntegerSubtract3.Subtract(365 - ValueNormalToMonth[i2]).Subtract((ValueNormalDays[i2] - i3) + 1) : eIntegerSubtract3.Subtract(366 - ValueLeapToMonth[i2]).Subtract((ValueLeapDays[i2] - i3) + 1);
    }

    public static long HalfToDoublePrecision(int i2) {
        long j2;
        long j3;
        long j4 = ((long) (32768 & i2)) << 48;
        int i3 = i2 >> 10;
        int i4 = (i3 + 31) - (i3 | 31);
        int i5 = i2 & 1023;
        if (i4 == 31) {
            j2 = ((long) i5) << 42;
            j3 = DoublePosInfinity;
        } else {
            if (i4 != 0) {
                j2 = ((long) (i4 + 1008)) << 52;
            } else {
                if (i5 == 0) {
                    return j4;
                }
                int i6 = i4 + 1;
                while (i5 < 1024) {
                    i5 <<= 1;
                    i6--;
                }
                j2 = ((long) (i6 + 1008)) << 52;
                i5 = (-1) - (((-1) - i5) | ((-1) - 1023));
            }
            j3 = ((long) i5) << 42;
        }
        return (-1) - (((-1) - j4) & ((-1) - ((-1) - (((-1) - j2) & ((-1) - j3)))));
    }

    public static float Int32BitsToSingle(int i2) {
        return Float.intBitsToFloat(i2);
    }

    public static double Int64BitsToDouble(long j2) {
        return Double.longBitsToDouble(j2);
    }

    public static long IntegerToDoubleBits(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            return -4476578029606273024L;
        }
        if (i2 == 0) {
            return 0L;
        }
        long jAbs = Math.abs(i2);
        int i3 = 0;
        while (jAbs < 1024) {
            jAbs <<= 42;
            i3 -= 42;
        }
        while (jAbs < 4503599627370496L) {
            jAbs <<= 1;
            i3--;
        }
        long j2 = (jAbs + 4503599627370495L) - (jAbs | 4503599627370495L);
        long j3 = ((long) (i3 + PhotoshopDirectory.TAG_TIMELINE_INFORMATION)) << 52;
        long j4 = (j2 + j3) - (j2 & j3);
        return i2 < 0 ? (j4 - Long.MIN_VALUE) - (j4 & Long.MIN_VALUE) : j4;
    }

    public static boolean IsBeyondSafeRange(long j2) {
        long j3 = (j2 + Long.MAX_VALUE) - (j2 | Long.MAX_VALUE);
        return j3 >= DoublePosInfinity || j3 > 4845873199050653695L;
    }

    public static boolean IsIntegerValue(long j2) {
        long j3 = (-1) - (((-1) - Long.MAX_VALUE) | ((-1) - j2));
        if (j3 == 0) {
            return true;
        }
        if (j3 >= DoublePosInfinity) {
            return false;
        }
        long j4 = j3 >> 52;
        if (j4 >= 1075) {
            return true;
        }
        if (j4 <= 1022) {
            return false;
        }
        long j5 = j2 & 4503599627370495L;
        int i2 = 52 - (((int) j4) - 1023);
        return ((j5 >> i2) << i2) == j5;
    }

    private static boolean IsLeapYear(int i2) {
        int i3 = i2 % 400;
        if (i3 < 0) {
            i3 += 400;
        }
        return (i3 % 4 == 0 && i3 % 100 != 0) || i3 % 400 == 0;
    }

    private static boolean IsValidDateTime(int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (iArr == null || iArr.length < 8 || (i2 = iArr[1]) < 1 || i2 > 12 || iArr[2] < 1) {
            return false;
        }
        boolean zIsLeapYear = IsLeapYear(iArr[0]);
        int i7 = iArr[1];
        if (i7 == 4 || i7 == 6 || i7 == 9 || i7 == 11) {
            if (iArr[2] > 30) {
                return false;
            }
        } else if (i7 == 2) {
            if (iArr[2] > (zIsLeapYear ? 29 : 28)) {
                return false;
            }
        } else if (iArr[2] > 31) {
            return false;
        }
        int i8 = iArr[3];
        return i8 >= 0 && (i3 = iArr[4]) >= 0 && (i4 = iArr[5]) >= 0 && i8 < 24 && i3 < 60 && i4 < 61 && (i5 = iArr[6]) >= 0 && i5 < 1000000000 && (i6 = iArr[7]) > -1440 && i6 < 1440;
    }

    public static String LongToString(long j2) {
        if (j2 == Long.MIN_VALUE) {
            return "-9223372036854775808";
        }
        if (j2 == 0) {
            return AdkSettings.PLATFORM_TYPE_MOBILE;
        }
        if (j2 == -2147483648L) {
            return "-2147483648";
        }
        boolean z2 = j2 < 0;
        int i2 = (int) j2;
        if (i2 == j2) {
            char[] cArr = new char[12];
            int i3 = 11;
            if (z2) {
                i2 = -i2;
            }
            while (i2 > 43698) {
                int i4 = i2 / 10;
                cArr[i3] = HexAlphabet.charAt(i2 - (i4 * 10));
                i3--;
                i2 = i4;
            }
            while (i2 > 9) {
                int i5 = (i2 * 26215) >> 18;
                cArr[i3] = HexAlphabet.charAt(i2 - (i5 * 10));
                i3--;
                i2 = i5;
            }
            if (i2 != 0) {
                cArr[i3] = HexAlphabet.charAt(i2);
                i3--;
            }
            if (z2) {
                cArr[i3] = Soundex.SILENT_MARKER;
            } else {
                i3++;
            }
            return new String(cArr, i3, 12 - i3);
        }
        char[] cArr2 = new char[24];
        int i6 = 23;
        if (z2) {
            j2 = -j2;
        }
        while (j2 > 43698) {
            long j3 = j2 / 10;
            cArr2[i6] = HexAlphabet.charAt((int) (j2 - (10 * j3)));
            i6--;
            j2 = j3;
        }
        while (j2 > 9) {
            long j4 = (26215 * j2) >> 18;
            cArr2[i6] = HexAlphabet.charAt((int) (j2 - (j4 * 10)));
            i6--;
            j2 = j4;
        }
        if (j2 != 0) {
            cArr2[i6] = HexAlphabet.charAt((int) j2);
            i6--;
        }
        if (z2) {
            cArr2[i6] = Soundex.SILENT_MARKER;
        } else {
            i6++;
        }
        return new String(cArr2, i6, 24 - i6);
    }

    public static boolean NameStartsWithWord(String str, String str2) {
        int length = str2.length();
        if (str.length() <= length || !str.substring(0, length).equals(str2)) {
            return false;
        }
        if (str.charAt(length) < 'a' || str.charAt(length) > 'z') {
            return str.charAt(length) < '0' || str.charAt(length) > '9';
        }
        return false;
    }

    public static void ParseAtomDateTimeString(String str, EInteger[] eIntegerArr, int[] iArr) {
        int[] iArrParseAtomDateTimeString = ParseAtomDateTimeString(str);
        eIntegerArr[0] = EInteger.FromInt32(iArrParseAtomDateTimeString[0]);
        System.arraycopy(iArrParseAtomDateTimeString, 1, iArr, 0, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] ParseAtomDateTimeString(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORUtilities.ParseAtomDateTimeString(java.lang.String):int[]");
    }

    private static int RoundedShift(int i2, int i3) {
        int i4 = 1 << (i3 - 1);
        int i5 = i2 >> i3;
        int i6 = (-1) - (((-1) - i2) | ((-1) - ((1 << i3) - 1)));
        return (i6 > i4 || (i6 == i4 && (1 & i5) != 0)) ? i5 + 1 : i5;
    }

    private static int RoundedShift(long j2, int i2) {
        long j3 = (1 << i2) - 1;
        long j4 = 1 << (i2 - 1);
        long j5 = j2 >> i2;
        long j6 = (j2 + j3) - (j2 | j3);
        return (j6 > j4 || (j6 == j4 && (-1) - (((-1) - j5) | ((-1) - 1)) != 0)) ? ((int) j5) + 1 : (int) j5;
    }

    public static long SingleToDoublePrecision(int i2) {
        long j2;
        long j3;
        long j4 = ((long) ((-1) - (((-1) - (i2 >> 31)) | ((-1) - 1)))) << 63;
        int i3 = (-1) - (((-1) - (i2 >> 23)) | ((-1) - 255));
        int i4 = i2 & 8388607;
        if (i3 == 255) {
            j2 = ((long) i4) << 29;
            j3 = DoublePosInfinity;
        } else {
            if (i3 != 0) {
                j2 = ((long) (i3 + 896)) << 52;
            } else {
                if (i4 == 0) {
                    return j4;
                }
                int i5 = i3 + 1;
                while (i4 < 8388608) {
                    i4 <<= 1;
                    i5--;
                }
                j2 = ((long) (i5 + 896)) << 52;
                i4 = (i4 + 8388607) - (i4 | 8388607);
            }
            j3 = ((long) i4) << 29;
        }
        return (-1) - (((-1) - j4) & ((-1) - (j2 | j3)));
    }

    public static int SingleToHalfPrecisionIfSameValue(float f2) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i2 = (-1) - (((-1) - (iFloatToRawIntBits >> 23)) | ((-1) - 255));
        int i3 = 8388607 & iFloatToRawIntBits;
        int i4 = (-1) - (((-1) - (iFloatToRawIntBits >> 16)) | ((-1) - 32768));
        if (i2 == 255) {
            if ((-1) - (((-1) - iFloatToRawIntBits) | ((-1) - 8191)) == 0) {
                return i4 + 31744 + (i3 >> 13);
            }
            return -1;
        }
        if (i2 == 0) {
            if ((iFloatToRawIntBits & 8191) == 0) {
                return i4 + (i3 >> 13);
            }
            return -1;
        }
        if (i2 <= 102 || i2 >= 143) {
            return -1;
        }
        if (i2 > 112) {
            if ((iFloatToRawIntBits + 8191) - (iFloatToRawIntBits | 8191) == 0) {
                return i4 + ((i2 - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) << 10) + (-(i3 >> 13));
            }
            return -1;
        }
        int i5 = 126 - i2;
        int i6 = (1024 >> (145 - i2)) + (i3 >> i5);
        if (i3 != 0 && i2 == 103) {
            return -1;
        }
        int i7 = (1 << i5) - 1;
        if ((iFloatToRawIntBits + i7) - (iFloatToRawIntBits | i7) == 0) {
            return i4 + i6;
        }
        return -1;
    }

    public static int SingleToInt32Bits(float f2) {
        return Float.floatToRawIntBits(f2);
    }

    public static int SingleToRoundedHalfPrecision(int i2) {
        int iRoundedShift;
        int i3 = (-1) - (((-1) - (i2 >> 23)) | ((-1) - 255));
        int i4 = 8388607 & i2;
        int i5 = (i2 >> 16) & 32768;
        int i6 = i3 - 112;
        if (i3 == 255) {
            int i7 = i4 >> 13;
            return (i4 == 0 || i7 != 0) ? (-1) - (((-1) - (i5 | 31744)) & ((-1) - i7)) : (i5 + 31745) - (i5 & 31745);
        }
        if (i6 >= 31) {
            return i5 | 31744;
        }
        if (i6 < -10) {
            return i5;
        }
        if (i6 > 0) {
            int i8 = i6 << 10;
            i5 = (i5 + i8) - (i5 & i8);
            iRoundedShift = RoundedShift(i4, 13);
        } else {
            iRoundedShift = RoundedShift((i4 + 8388608) - (i4 & 8388608), 13 - (i3 - 113));
        }
        return (-1) - (((-1) - i5) & ((-1) - iRoundedShift));
    }

    @Deprecated
    public static String SingleToString(float f2) {
        return EFloat.FromSingle(f2).ToShortestString(EContext.Binary32);
    }

    public static boolean StringEqualsUtf8(String str, byte[] bArr) {
        if (str == null) {
            return bArr == null;
        }
        if (bArr == null || str.length() * 3 < bArr.length || bArr.length * 3 < str.length()) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iCodePointAt = DataUtilities.CodePointAt(str, i2, 1);
            int iUtf8CodePointAt = Utf8CodePointAt(bArr, i3);
            if (iUtf8CodePointAt == -2) {
                throw new IllegalStateException("Invalid encoding");
            }
            if (iCodePointAt == -1) {
                return iUtf8CodePointAt == -1;
            }
            if (iCodePointAt != iUtf8CodePointAt) {
                return false;
            }
            if (iCodePointAt >= 65536) {
                i2 += 2;
                i3 += 4;
            } else if (iCodePointAt >= 2048) {
                i2++;
                i3 += 3;
            } else if (iCodePointAt >= 128) {
                i2++;
                i3 += 2;
            } else {
                i2++;
                i3++;
            }
        }
    }

    public static int StringHashCode(String str) {
        int iCodePointAt;
        int i2 = 0;
        int i3 = 2128535065;
        while (i2 != str.length() && (iCodePointAt = DataUtilities.CodePointAt(str, i2, 1)) >= 0) {
            i3 = (i3 * 31) + iCodePointAt;
            i2 = iCodePointAt >= 65536 ? i2 + 2 : i2 + 1;
        }
        return i3;
    }

    public static String ToAtomDateTimeString(EInteger eInteger, int[] iArr) {
        if (iArr == null) {
            throw new NullPointerException("lesserFields");
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException(" (7) is not less or equal to " + iArr.length);
        }
        if (iArr.length < 7) {
            throw new IllegalArgumentException("\"lesserFields\" + \"'s length\" (" + iArr.length + ") is not greater or equal to 7");
        }
        if (iArr[6] != 0) {
            throw new UnsupportedOperationException("Local time offsets not supported");
        }
        int iToInt32Checked = eInteger.ToInt32Checked();
        if (iToInt32Checked < 0) {
            throw new IllegalArgumentException("year(" + iToInt32Checked + ") is not greater or equal to 0");
        }
        if (iToInt32Checked > 9999) {
            throw new IllegalArgumentException("year(" + iToInt32Checked + ") is not less or equal to 9999");
        }
        CheckYearAndLesserFields(iToInt32Checked, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        char[] cArr = new char[32];
        cArr[0] = (char) (((iToInt32Checked / 1000) % 10) + 48);
        cArr[1] = (char) (((iToInt32Checked / 100) % 10) + 48);
        cArr[2] = (char) (((iToInt32Checked / 10) % 10) + 48);
        cArr[3] = (char) ((iToInt32Checked % 10) + 48);
        cArr[4] = Soundex.SILENT_MARKER;
        cArr[5] = (char) (((i2 / 10) % 10) + 48);
        cArr[6] = (char) ((i2 % 10) + 48);
        cArr[7] = Soundex.SILENT_MARKER;
        cArr[8] = (char) (((i3 / 10) % 10) + 48);
        cArr[9] = (char) ((i3 % 10) + 48);
        cArr[10] = 'T';
        cArr[11] = (char) (((i4 / 10) % 10) + 48);
        cArr[12] = (char) ((i4 % 10) + 48);
        cArr[13] = AbstractJsonLexerKt.COLON;
        cArr[14] = (char) (((i5 / 10) % 10) + 48);
        cArr[15] = (char) ((i5 % 10) + 48);
        cArr[16] = AbstractJsonLexerKt.COLON;
        cArr[17] = (char) (((i6 / 10) % 10) + 48);
        cArr[18] = (char) ((i6 % 10) + 48);
        int i8 = 20;
        if (i7 > 0) {
            cArr[19] = '.';
            int i9 = 100000000;
            int i10 = 20;
            while (i9 > 0 && i7 != 0) {
                int i11 = (i7 / i9) % 10;
                i7 -= i11 * i9;
                cArr[i10] = (char) (i11 + 48);
                i8++;
                i9 /= 10;
                i10++;
            }
            cArr[i10] = 'Z';
            i8++;
        } else {
            cArr[19] = 'Z';
        }
        return new String(cArr, 0, i8);
    }

    public static String TrimDotZero(String str) {
        return (str.length() > 2 && str.charAt(str.length() + (-1)) == '0' && str.charAt(str.length() - 2) == '.') ? str.substring(0, str.length() - 2) : str;
    }

    public static int Utf8CodePointAt(byte[] bArr, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int length = bArr.length;
        if (i2 < 0 || i2 >= length) {
            return -1;
        }
        int i10 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        if (i10 <= 127) {
            return i10;
        }
        if (i10 >= 194 && i10 <= 223) {
            int i11 = i2 + 1;
            i7 = i11 < length ? bArr[i11] & 255 : -1;
            if (i7 < 128 || i7 > 191) {
                return -2;
            }
            return ((i10 - 192) << 6) | (i7 - 128);
        }
        if (i10 >= 224 && i10 <= 239) {
            int i12 = i2 + 1;
            if (i12 < length) {
                i8 = i2 + 2;
                i9 = bArr[i12] & 255;
            } else {
                i8 = i12;
                i9 = -1;
            }
            i7 = i8 < length ? (-1) - (((-1) - bArr[i8]) | ((-1) - 255)) : -1;
            int i13 = i10 == 224 ? 160 : 128;
            int i14 = i10 == 237 ? 159 : 191;
            if (i9 < i13 || i9 > i14 || i7 < 128 || i7 > 191) {
                return -2;
            }
            return (-1) - (((-1) - ((-1) - (((-1) - ((i10 - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY) << 12)) & ((-1) - ((i9 - 128) << 6))))) & ((-1) - (i7 - 128)));
        }
        if (i10 >= 240 && i10 <= 244) {
            int i15 = i2 + 1;
            if (i15 < length) {
                i3 = i2 + 2;
                i4 = (-1) - (((-1) - bArr[i15]) | ((-1) - 255));
            } else {
                i3 = i15;
                i4 = -1;
            }
            if (i3 < length) {
                i5 = i3 + 1;
                i6 = bArr[i3] & 255;
            } else {
                i5 = i3;
                i6 = -1;
            }
            i7 = i5 < length ? bArr[i5] & 255 : -1;
            int i16 = i10 == 240 ? 144 : 128;
            int i17 = i10 == 244 ? 143 : 191;
            if (i4 >= i16 && i4 <= i17 && i6 >= 128 && i6 <= 191 && i7 >= 128 && i7 <= 191) {
                int i18 = (-1) - (((-1) - ((i10 - 240) << 18)) & ((-1) - ((i4 - 128) << 12)));
                int i19 = (i6 - 128) << 6;
                return ((i18 + i19) - (i18 & i19)) | (i7 - 128);
            }
        }
        return -2;
    }

    public static int Utf8HashCode(byte[] bArr) {
        int i2 = 0;
        int i3 = 2128535065;
        while (true) {
            int iUtf8CodePointAt = Utf8CodePointAt(bArr, i2);
            if (iUtf8CodePointAt == -1 || iUtf8CodePointAt == -2) {
                return i3;
            }
            i3 = (i3 * 31) + iUtf8CodePointAt;
            i2 = iUtf8CodePointAt >= 65536 ? i2 + 4 : iUtf8CodePointAt >= 2048 ? i2 + 3 : iUtf8CodePointAt >= 128 ? i2 + 2 : i2 + 1;
        }
    }
}
