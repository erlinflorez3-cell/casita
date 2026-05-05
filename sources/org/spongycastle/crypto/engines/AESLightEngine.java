package org.spongycastle.crypto.engines;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, MessagePack.Code.BIN16, 48, 1, 103, 43, -2, MessagePack.Code.FIXEXT8, -85, 118, MessagePack.Code.FLOAT32, -126, MessagePack.Code.EXT32, 125, -6, 89, 71, -16, -83, MessagePack.Code.FIXEXT1, -94, -81, -100, -92, 114, MessagePack.Code.NIL, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, MessagePack.Code.UINT8, 52, -91, -27, -15, 113, MessagePack.Code.FIXEXT16, 49, Ascii.NAK, 4, MessagePack.Code.EXT8, 35, MessagePack.Code.TRUE, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, -128, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, MessagePack.Code.FIXSTR_PREFIX, 82, 59, MessagePack.Code.FIXEXT4, -77, 41, -29, 47, -124, 83, MessagePack.Code.INT16, 0, -19, 32, -4, -79, 91, 106, MessagePack.Code.FLOAT64, -66, 57, 74, 76, 88, MessagePack.Code.UINT64, MessagePack.Code.INT8, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, MessagePack.Code.STR16, 33, 16, -1, -13, MessagePack.Code.INT32, MessagePack.Code.UINT16, Ascii.FF, 19, -20, 95, -105, 68, Ascii.ETB, MessagePack.Code.BIN8, -89, 126, Base64.padSymbol, 100, 93, Ascii.EM, 115, 96, -127, 79, MessagePack.Code.ARRAY16, 34, 42, MessagePack.Code.FIXARRAY_PREFIX, -120, 70, -18, -72, Ascii.DC4, MessagePack.Code.MAP16, 94, Ascii.VT, MessagePack.Code.STR32, MessagePack.Code.NEGFIXINT_PREFIX, 50, 58, 10, 73, 6, 36, 92, MessagePack.Code.FALSE, MessagePack.Code.INT64, -84, 98, -111, -107, -28, 121, -25, MessagePack.Code.EXT16, 55, 109, -115, MessagePack.Code.FIXEXT2, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, MessagePack.Code.BIN32, -24, MessagePack.Code.ARRAY32, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, Ascii.SO, 97, 53, 87, -71, -122, MessagePack.Code.NEVER_USED, Ascii.GS, -98, -31, -8, -104, 17, 105, MessagePack.Code.STR8, -114, -108, -101, Ascii.RS, -121, -23, MessagePack.Code.UINT32, 85, 40, MessagePack.Code.MAP32, -116, -95, -119, Ascii.CR, -65, -26, 66, 104, 65, -103, 45, Ascii.SI, -80, 84, -69, Ascii.SYN};
    private static final byte[] Si = {82, 9, 106, MessagePack.Code.FIXEXT2, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, MessagePack.Code.FIXEXT8, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, MessagePack.Code.BIN8, MessagePack.Code.MAP16, -23, MessagePack.Code.FLOAT64, 84, 123, -108, 50, -90, MessagePack.Code.FALSE, 35, Base64.padSymbol, -18, 76, -107, Ascii.VT, 66, -6, MessagePack.Code.TRUE, 78, 8, 46, -95, 102, 40, MessagePack.Code.STR8, 36, -78, 118, 91, -94, 73, 109, -117, MessagePack.Code.INT16, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, MessagePack.Code.FIXEXT1, -92, 92, MessagePack.Code.UINT8, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, MessagePack.Code.STR16, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, MessagePack.Code.FIXARRAY_PREFIX, MessagePack.Code.FIXEXT16, -85, 0, -116, -68, MessagePack.Code.INT64, 10, -9, -28, 88, 5, -72, -77, 69, 6, MessagePack.Code.INT8, 44, Ascii.RS, -113, MessagePack.Code.FLOAT32, Utf8.REPLACEMENT_BYTE, Ascii.SI, 2, MessagePack.Code.NEVER_USED, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, MessagePack.Code.ARRAY16, -22, -105, -14, MessagePack.Code.UINT64, MessagePack.Code.UINT32, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.FS, 117, MessagePack.Code.MAP32, 110, 71, -15, Ascii.SUB, 113, Ascii.GS, 41, MessagePack.Code.BIN16, -119, 111, -73, 98, Ascii.SO, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, MessagePack.Code.BIN32, MessagePack.Code.INT32, 121, 32, -102, MessagePack.Code.STR32, MessagePack.Code.NIL, -2, 120, MessagePack.Code.UINT16, 90, -12, Ascii.US, MessagePack.Code.ARRAY32, -88, 51, -120, 7, MessagePack.Code.EXT8, 49, -79, Ascii.DC2, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, Ascii.EM, -75, 74, Ascii.CR, 45, -27, 122, -97, -109, MessagePack.Code.EXT32, -100, -17, MessagePack.Code.FIXSTR_PREFIX, MessagePack.Code.NEGFIXINT_PREFIX, 59, 77, -82, 42, -11, -80, MessagePack.Code.EXT16, -21, -69, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, MessagePack.Code.FIXEXT4, 38, -31, 105, Ascii.DC4, 99, 85, 33, Ascii.FF, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, Mp4VideoDirectory.TAG_OPCOLOR, 179, 125, 250, 239, 197, 145};

    public AESLightEngine() {
    }

    private static int FFmulX(int i2) {
        return ((((-1) - (((-1) - i2) | ((-1) - m1))) >>> 7) * 27) ^ (((m2 + i2) - (m2 | i2)) << 1);
    }

    private static int FFmulX2(int i2) {
        int i3 = ((m5 + i2) - (m5 | i2)) << 2;
        int i4 = (-1) - (((-1) - i2) | ((-1) - m4));
        int i5 = i4 ^ (i4 >>> 1);
        return (i5 >>> 5) ^ (i3 ^ (i5 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i2 = this.C0;
        int i3 = this.ROUNDS;
        int[] iArr2 = iArr[i3];
        int iInv_mcol = i2 ^ iArr2[0];
        int iInv_mcol2 = this.C1 ^ iArr2[1];
        int iInv_mcol3 = this.C2 ^ iArr2[2];
        int i4 = i3 - 1;
        int iInv_mcol4 = iArr2[3] ^ this.C3;
        while (i4 > 1) {
            byte[] bArr = Si;
            byte b2 = bArr[(-1) - (((-1) - iInv_mcol) | ((-1) - 255))];
            byte b3 = bArr[(iInv_mcol4 >> 8) & 255];
            int iInv_mcol5 = inv_mcol(((((b2 + 255) - (b2 | 255)) ^ (((b3 + 255) - (b3 | 255)) << 8)) ^ ((bArr[(-1) - (((-1) - (iInv_mcol3 >> 16)) | ((-1) - 255))] & 255) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol2 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i4][0];
            int i5 = iInv_mcol >> 8;
            int iInv_mcol6 = inv_mcol(((((-1) - (((-1) - bArr[(-1) - (((-1) - iInv_mcol2) | ((-1) - 255))]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr[(i5 + 255) - (i5 | 255)]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr[(-1) - (((-1) - (iInv_mcol4 >> 16)) | ((-1) - 255))]) | ((-1) - 255))) << 16)) ^ (bArr[(iInv_mcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i4][1];
            byte b4 = bArr[(-1) - (((-1) - iInv_mcol3) | ((-1) - 255))];
            int i6 = iInv_mcol2 >> 8;
            int i7 = ((b4 + 255) - (b4 | 255)) ^ ((bArr[(i6 + 255) - (i6 | 255)] & 255) << 8);
            int i8 = iInv_mcol >> 16;
            int iInv_mcol7 = inv_mcol((i7 ^ (((-1) - (((-1) - bArr[(i8 + 255) - (i8 | 255)]) | ((-1) - 255))) << 16)) ^ (bArr[(iInv_mcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i4][2];
            int i9 = bArr[(-1) - (((-1) - iInv_mcol4) | ((-1) - 255))] & 255;
            byte b5 = bArr[(-1) - (((-1) - (iInv_mcol3 >> 8)) | ((-1) - 255))];
            int i10 = i4 - 1;
            int iInv_mcol8 = inv_mcol((bArr[(-1) - (((-1) - (iInv_mcol >> 24)) | ((-1) - 255))] << Ascii.CAN) ^ ((i9 ^ (((b5 + 255) - (b5 | 255)) << 8)) ^ ((bArr[(-1) - (((-1) - (iInv_mcol2 >> 16)) | ((-1) - 255))] & 255) << 16))) ^ iArr[i4][3];
            byte b6 = bArr[(-1) - (((-1) - iInv_mcol5) | ((-1) - 255))];
            byte b7 = bArr[(-1) - (((-1) - (iInv_mcol8 >> 8)) | ((-1) - 255))];
            int i11 = ((b6 + 255) - (b6 | 255)) ^ (((b7 + 255) - (b7 | 255)) << 8);
            int i12 = iInv_mcol7 >> 16;
            iInv_mcol = inv_mcol((i11 ^ (((-1) - (((-1) - bArr[(i12 + 255) - (i12 | 255)]) | ((-1) - 255))) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol6 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i10][0];
            int i13 = bArr[(-1) - (((-1) - iInv_mcol6) | ((-1) - 255))] & 255;
            byte b8 = bArr[(-1) - (((-1) - (iInv_mcol5 >> 8)) | ((-1) - 255))];
            int i14 = i13 ^ (((b8 + 255) - (b8 | 255)) << 8);
            int i15 = iInv_mcol8 >> 16;
            iInv_mcol2 = inv_mcol((i14 ^ (((-1) - (((-1) - bArr[(i15 + 255) - (i15 | 255)]) | ((-1) - 255))) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol7 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i10][1];
            int i16 = iInv_mcol5 >> 16;
            iInv_mcol3 = inv_mcol((((bArr[255 & iInv_mcol7] & 255) ^ ((bArr[(iInv_mcol6 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i16 + 255) - (i16 | 255)] & 255) << 16)) ^ (bArr[(iInv_mcol8 >> 24) & 255] << Ascii.CAN)) ^ iArr[i10][2];
            byte b9 = bArr[(-1) - (((-1) - iInv_mcol8) | ((-1) - 255))];
            byte b10 = bArr[(-1) - (((-1) - (iInv_mcol7 >> 8)) | ((-1) - 255))];
            int i17 = ((b9 + 255) - (b9 | 255)) ^ (((b10 + 255) - (b10 | 255)) << 8);
            int i18 = iInv_mcol6 >> 16;
            byte b11 = bArr[(i18 + 255) - (i18 | 255)];
            i4 -= 2;
            iInv_mcol4 = iArr[i10][3] ^ inv_mcol((i17 ^ (((b11 + 255) - (b11 | 255)) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol5 >> 24)) | ((-1) - 255))] << Ascii.CAN));
        }
        byte[] bArr2 = Si;
        byte b12 = bArr2[255 & iInv_mcol];
        int iInv_mcol9 = inv_mcol(((((b12 + 255) - (b12 | 255)) ^ (((-1) - (((-1) - bArr2[(iInv_mcol4 >> 8) & 255]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr2[(iInv_mcol3 >> 16) & 255]) | ((-1) - 255))) << 16)) ^ (bArr2[(-1) - (((-1) - (iInv_mcol2 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i4][0];
        int i19 = iInv_mcol >> 8;
        int iInv_mcol10 = inv_mcol(((((-1) - (((-1) - bArr2[(iInv_mcol2 + 255) - (255 | iInv_mcol2)]) | ((-1) - 255))) ^ ((bArr2[(i19 + 255) - (i19 | 255)] & 255) << 8)) ^ ((bArr2[(iInv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i4][1];
        int i20 = ((-1) - (((-1) - bArr2[255 & iInv_mcol3]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr2[(-1) - (((-1) - (iInv_mcol2 >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8);
        byte b13 = bArr2[(iInv_mcol >> 16) & 255];
        int iInv_mcol11 = inv_mcol((i20 ^ (((b13 + 255) - (b13 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iInv_mcol4 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i4][2];
        int i21 = (-1) - (((-1) - bArr2[(iInv_mcol4 + 255) - (iInv_mcol4 | 255)]) | ((-1) - 255));
        byte b14 = bArr2[(iInv_mcol3 >> 8) & 255];
        int i22 = i21 ^ (((b14 + 255) - (b14 | 255)) << 8);
        int i23 = iInv_mcol2 >> 16;
        byte b15 = bArr2[(i23 + 255) - (i23 | 255)];
        int iInv_mcol12 = inv_mcol((bArr2[(-1) - (((-1) - (iInv_mcol >> 24)) | ((-1) - 255))] << Ascii.CAN) ^ (i22 ^ (((b15 + 255) - (b15 | 255)) << 16))) ^ iArr[i4][3];
        byte b16 = bArr2[(iInv_mcol9 + 255) - (255 | iInv_mcol9)];
        int i24 = iInv_mcol12 >> 8;
        int i25 = ((b16 + 255) - (b16 | 255)) ^ ((bArr2[(i24 + 255) - (i24 | 255)] & 255) << 8);
        byte b17 = bArr2[(iInv_mcol11 >> 16) & 255];
        int i26 = (i25 ^ (((b17 + 255) - (b17 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iInv_mcol10 >> 24)) | ((-1) - 255))] << Ascii.CAN);
        int[] iArr3 = iArr[0];
        this.C0 = i26 ^ iArr3[0];
        byte b18 = bArr2[(iInv_mcol10 + 255) - (255 | iInv_mcol10)];
        int i27 = iInv_mcol9 >> 8;
        this.C1 = (((((b18 + 255) - (b18 | 255)) ^ ((bArr2[(i27 + 255) - (i27 | 255)] & 255) << 8)) ^ ((bArr2[(-1) - (((-1) - (iInv_mcol12 >> 16)) | ((-1) - 255))] & 255) << 16)) ^ (bArr2[(iInv_mcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr3[1];
        int i28 = (-1) - (((-1) - bArr2[255 & iInv_mcol11]) | ((-1) - 255));
        int i29 = iInv_mcol10 >> 8;
        byte b19 = bArr2[(i29 + 255) - (i29 | 255)];
        int i30 = i28 ^ (((b19 + 255) - (b19 | 255)) << 8);
        byte b20 = bArr2[(-1) - (((-1) - (iInv_mcol9 >> 16)) | ((-1) - 255))];
        int i31 = i30 ^ (((b20 + 255) - (b20 | 255)) << 16);
        int i32 = iInv_mcol12 >> 24;
        this.C2 = (i31 ^ (bArr2[(i32 + 255) - (i32 | 255)] << Ascii.CAN)) ^ iArr3[2];
        byte b21 = bArr2[(-1) - (((-1) - iInv_mcol12) | ((-1) - 255))];
        int i33 = iInv_mcol10 >> 16;
        this.C3 = (((((b21 + 255) - (b21 | 255)) ^ (((-1) - (((-1) - bArr2[(-1) - (((-1) - (iInv_mcol11 >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr2[(i33 + 255) - (i33 | 255)]) | ((-1) - 255))) << 16)) ^ (bArr2[(-1) - (((-1) - (iInv_mcol9 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr3[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i2 = this.C0;
        int[] iArr2 = iArr[0];
        int iMcol = i2 ^ iArr2[0];
        int iMcol2 = this.C1 ^ iArr2[1];
        int iMcol3 = this.C2 ^ iArr2[2];
        int iMcol4 = iArr2[3] ^ this.C3;
        int i3 = 1;
        while (i3 < this.ROUNDS - 1) {
            byte[] bArr = S;
            int i4 = bArr[(-1) - (((-1) - iMcol) | ((-1) - 255))] & 255;
            byte b2 = bArr[(iMcol2 >> 8) & 255];
            int i5 = i4 ^ (((b2 + 255) - (b2 | 255)) << 8);
            int i6 = iMcol3 >> 16;
            int iMcol5 = mcol((i5 ^ ((bArr[(i6 + 255) - (i6 | 255)] & 255) << 16)) ^ (bArr[(iMcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][0];
            int i7 = (-1) - (((-1) - bArr[(iMcol2 + 255) - (255 | iMcol2)]) | ((-1) - 255));
            byte b3 = bArr[(iMcol3 >> 8) & 255];
            int i8 = i7 ^ (((b3 + 255) - (b3 | 255)) << 8);
            byte b4 = bArr[(iMcol4 >> 16) & 255];
            int iMcol6 = mcol((i8 ^ (((b4 + 255) - (b4 | 255)) << 16)) ^ (bArr[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][1];
            int i9 = bArr[255 & iMcol3] & 255;
            byte b5 = bArr[(-1) - (((-1) - (iMcol4 >> 8)) | ((-1) - 255))];
            int i10 = i9 ^ (((b5 + 255) - (b5 | 255)) << 8);
            byte b6 = bArr[(iMcol >> 16) & 255];
            int iMcol7 = mcol((i10 ^ (((b6 + 255) - (b6 | 255)) << 16)) ^ (bArr[(iMcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][2];
            int i11 = i3 + 1;
            int iMcol8 = mcol(((((bArr[(-1) - (((-1) - (iMcol >> 8)) | ((-1) - 255))] & 255) << 8) ^ (bArr[(iMcol4 + 255) - (iMcol4 | 255)] & 255)) ^ ((bArr[(-1) - (((-1) - (iMcol2 >> 16)) | ((-1) - 255))] & 255) << 16)) ^ (bArr[(iMcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][3];
            int i12 = iMcol7 >> 16;
            iMcol = mcol((((bArr[iMcol5 & 255] & 255) ^ ((bArr[(iMcol6 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i12 + 255) - (i12 | 255)] & 255) << 16)) ^ (bArr[(iMcol8 >> 24) & 255] << Ascii.CAN)) ^ iArr[i11][0];
            int i13 = iMcol5 >> 24;
            iMcol2 = mcol(((((-1) - (((-1) - bArr[(-1) - (((-1) - iMcol6) | ((-1) - 255))]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr[(iMcol7 >> 8) & 255]) | ((-1) - 255))) << 8)) ^ ((bArr[(iMcol8 >> 16) & 255] & 255) << 16)) ^ (bArr[(i13 + 255) - (i13 | 255)] << Ascii.CAN)) ^ iArr[i11][1];
            int i14 = bArr[(-1) - (((-1) - iMcol7) | ((-1) - 255))] & 255;
            int i15 = iMcol8 >> 8;
            byte b7 = bArr[(i15 + 255) - (i15 | 255)];
            int i16 = i14 ^ (((b7 + 255) - (b7 | 255)) << 8);
            byte b8 = bArr[(iMcol5 >> 16) & 255];
            iMcol3 = mcol((i16 ^ (((b8 + 255) - (b8 | 255)) << 16)) ^ (bArr[(-1) - (((-1) - (iMcol6 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i11][2];
            int i17 = iMcol5 >> 8;
            int i18 = ((-1) - (((-1) - bArr[iMcol8 & 255]) | ((-1) - 255))) ^ ((bArr[(i17 + 255) - (i17 | 255)] & 255) << 8);
            int i19 = iMcol6 >> 16;
            i3 += 2;
            iMcol4 = iArr[i11][3] ^ mcol((i18 ^ ((bArr[(i19 + 255) - (i19 | 255)] & 255) << 16)) ^ (bArr[(-1) - (((-1) - (iMcol7 >> 24)) | ((-1) - 255))] << Ascii.CAN));
        }
        byte[] bArr2 = S;
        int i20 = iMcol2 >> 8;
        int i21 = (bArr2[255 & iMcol] & 255) ^ ((bArr2[(i20 + 255) - (i20 | 255)] & 255) << 8);
        int i22 = iMcol3 >> 16;
        byte b9 = bArr2[(i22 + 255) - (i22 | 255)];
        int iMcol9 = mcol((i21 ^ (((b9 + 255) - (b9 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol4 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i3][0];
        int i23 = iMcol3 >> 8;
        int iMcol10 = mcol((((bArr2[(iMcol2 + 255) - (255 | iMcol2)] & 255) ^ (((-1) - (((-1) - bArr2[(i23 + 255) - (i23 | 255)]) | ((-1) - 255))) << 8)) ^ ((bArr2[(iMcol4 >> 16) & 255] & 255) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i3][1];
        int i24 = bArr2[(-1) - (((-1) - iMcol3) | ((-1) - 255))] & 255;
        byte b10 = bArr2[(-1) - (((-1) - (iMcol4 >> 8)) | ((-1) - 255))];
        int i25 = (i24 ^ (((b10 + 255) - (b10 | 255)) << 8)) ^ ((bArr2[(iMcol >> 16) & 255] & 255) << 16);
        int i26 = iMcol2 >> 24;
        int iMcol11 = mcol(i25 ^ (bArr2[(i26 + 255) - (i26 | 255)] << Ascii.CAN)) ^ iArr[i3][2];
        int iMcol12 = mcol((((((-1) - (((-1) - bArr2[(-1) - (((-1) - (iMcol >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8) ^ (bArr2[(iMcol4 + 255) - (iMcol4 | 255)] & 255)) ^ (((-1) - (((-1) - bArr2[(-1) - (((-1) - (iMcol2 >> 16)) | ((-1) - 255))]) | ((-1) - 255))) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol3 >> 24)) | ((-1) - 255))] << Ascii.CAN));
        int i27 = i3 + 1;
        int i28 = iMcol12 ^ iArr[i3][3];
        byte b11 = bArr2[(iMcol9 + 255) - (255 | iMcol9)];
        int i29 = iMcol10 >> 8;
        int i30 = (((b11 + 255) - (b11 | 255)) ^ (((-1) - (((-1) - bArr2[(i29 + 255) - (i29 | 255)]) | ((-1) - 255))) << 8)) ^ ((bArr2[(iMcol11 >> 16) & 255] & 255) << 16);
        int i31 = i28 >> 24;
        int i32 = i30 ^ (bArr2[(i31 + 255) - (i31 | 255)] << Ascii.CAN);
        int[] iArr3 = iArr[i27];
        this.C0 = iArr3[0] ^ i32;
        int i33 = iMcol11 >> 8;
        this.C1 = ((((bArr2[(-1) - (((-1) - iMcol10) | ((-1) - 255))] & 255) ^ ((bArr2[(i33 + 255) - (i33 | 255)] & 255) << 8)) ^ (((-1) - (((-1) - bArr2[(i28 >> 16) & 255]) | ((-1) - 255))) << 16)) ^ (bArr2[(iMcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr3[1];
        int i34 = iMcol10 >> 24;
        this.C2 = (((((-1) - (((-1) - bArr2[255 & iMcol11]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr2[(-1) - (((-1) - (i28 >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr2[(iMcol9 >> 16) & 255]) | ((-1) - 255))) << 16)) ^ (bArr2[(i34 + 255) - (i34 | 255)] << Ascii.CAN)) ^ iArr3[2];
        int i35 = bArr2[i28 & 255] & 255;
        byte b12 = bArr2[(-1) - (((-1) - (iMcol9 >> 8)) | ((-1) - 255))];
        int i36 = (i35 ^ (((b12 + 255) - (b12 | 255)) << 8)) ^ (((-1) - (((-1) - bArr2[(iMcol10 >> 16) & 255]) | ((-1) - 255))) << 16);
        int i37 = iMcol11 >> 24;
        this.C3 = (i36 ^ (bArr2[(i37 + 255) - (i37 | 255)] << Ascii.CAN)) ^ iArr3[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z2) {
        int length = bArr.length;
        if (length < 16 || length > 32 || (7 & length) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >> 2;
        this.ROUNDS = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i2 == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iSubWord;
            int i4 = iLittleEndianToInt6 ^ iSubWord;
            iArr3[3] = i4;
            int i5 = iLittleEndianToInt7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = iLittleEndianToInt8 ^ i5;
            iArr4[1] = i6;
            int i7 = iLittleEndianToInt9 ^ i6;
            iArr4[2] = i7;
            int i8 = iLittleEndianToInt10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int iSubWord2 = iSubWord ^ (subWord(shift(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = iSubWord2;
                int i11 = i4 ^ iSubWord2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int iSubWord3 = subWord(shift(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                iSubWord = iSubWord2 ^ iSubWord3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = iSubWord;
                i4 = i11 ^ iSubWord;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int iSubWord4 = (subWord(shift(i8, 8)) ^ i9) ^ iSubWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = iSubWord4;
            int i17 = iSubWord4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i19 = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int iSubWord5 = subWord(shift(iLittleEndianToInt18, 8)) ^ i19;
                i19 <<= 1;
                iLittleEndianToInt11 ^= iSubWord5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iSubWord6 = (subWord(shift(iLittleEndianToInt18, 8)) ^ i19) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iSubWord6;
            int i21 = iSubWord6 ^ iLittleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ iLittleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iLittleEndianToInt14;
        }
        if (!z2) {
            for (int i23 = 1; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i2) {
        int iShift = shift(i2, 8) ^ i2;
        int iFFmulX = i2 ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i2) {
        int iShift = shift(i2, 8);
        int i3 = i2 ^ iShift;
        return FFmulX(i3) ^ (iShift ^ shift(i3, 16));
    }

    private void packBlock(byte[] bArr, int i2) {
        int i3 = this.C0;
        bArr[i2] = (byte) i3;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) (i3 >> 16);
        bArr[i2 + 3] = (byte) (i3 >> 24);
        int i4 = this.C1;
        bArr[i2 + 4] = (byte) i4;
        bArr[i2 + 5] = (byte) (i4 >> 8);
        bArr[i2 + 6] = (byte) (i4 >> 16);
        bArr[i2 + 7] = (byte) (i4 >> 24);
        int i5 = this.C2;
        bArr[i2 + 8] = (byte) i5;
        bArr[i2 + 9] = (byte) (i5 >> 8);
        bArr[i2 + 10] = (byte) (i5 >> 16);
        bArr[i2 + 11] = (byte) (i5 >> 24);
        int i6 = this.C3;
        bArr[i2 + 12] = (byte) i6;
        bArr[i2 + 13] = (byte) (i6 >> 8);
        bArr[i2 + 14] = (byte) (i6 >> 16);
        bArr[i2 + 15] = (byte) (i6 >> 24);
    }

    private static int shift(int i2, int i3) {
        return (i2 << (-i3)) | (i2 >>> i3);
    }

    private static int subWord(int i2) {
        byte[] bArr = S;
        int i3 = ((-1) - (((-1) - bArr[(-1) - (((-1) - i2) | ((-1) - 255))]) | ((-1) - 255))) | ((bArr[(i2 >> 8) & 255] & 255) << 8);
        byte b2 = bArr[(-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))];
        int i4 = i3 | (((b2 + 255) - (b2 | 255)) << 16);
        int i5 = i2 >> 24;
        int i6 = bArr[(i5 + 255) - (i5 | 255)] << Ascii.CAN;
        return (i6 + i4) - (i6 & i4);
    }

    private void unpackBlock(byte[] bArr, int i2) {
        byte b2 = bArr[i2];
        int i3 = (b2 + 255) - (b2 | 255);
        this.C0 = i3;
        byte b3 = bArr[i2 + 1];
        int i4 = ((b3 + 255) - (b3 | 255)) << 8;
        int i5 = (i4 + i3) - (i4 & i3);
        this.C0 = i5;
        byte b4 = bArr[i2 + 2];
        int i6 = i5 | (((b4 + 255) - (b4 | 255)) << 16);
        this.C0 = i6;
        int i7 = bArr[i2 + 3] << Ascii.CAN;
        this.C0 = (i6 + i7) - (i6 & i7);
        int i8 = bArr[i2 + 4] & 255;
        this.C1 = i8;
        int i9 = (((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255))) << 8) | i8;
        this.C1 = i9;
        int i10 = ((-1) - (((-1) - bArr[i2 + 6]) | ((-1) - 255))) << 16;
        int i11 = (i9 + i10) - (i9 & i10);
        this.C1 = i11;
        this.C1 = i11 | (bArr[i2 + 7] << Ascii.CAN);
        int i12 = (-1) - (((-1) - bArr[i2 + 8]) | ((-1) - 255));
        this.C2 = i12;
        int i13 = (bArr[i2 + 9] & 255) << 8;
        int i14 = (i13 + i12) - (i13 & i12);
        this.C2 = i14;
        int i15 = i14 | ((bArr[i2 + 10] & 255) << 16);
        this.C2 = i15;
        this.C2 = (-1) - (((-1) - i15) & ((-1) - (bArr[i2 + 11] << Ascii.CAN)));
        byte b5 = bArr[i2 + 12];
        int i16 = (b5 + 255) - (b5 | 255);
        this.C3 = i16;
        byte b6 = bArr[i2 + 13];
        int i17 = ((b6 + 255) - (b6 | 255)) << 8;
        int i18 = (i17 + i16) - (i17 & i16);
        this.C3 = i18;
        int i19 = i18 | ((bArr[i2 + 14] & 255) << 16);
        this.C3 = i19;
        this.C3 = (bArr[i2 + 15] << Ascii.CAN) | i19;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z2);
        this.forEncryption = z2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i2 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i2);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i3);
            return 16;
        }
        unpackBlock(bArr, i2);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i3);
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
