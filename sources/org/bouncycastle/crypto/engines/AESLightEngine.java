package org.bouncycastle.crypto.engines;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
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
        return (((i2 & m1) >>> 7) * 27) ^ ((m2 & i2) << 1);
    }

    private static int FFmulX2(int i2) {
        int i3 = ((-1) - (((-1) - m5) | ((-1) - i2))) << 2;
        int i4 = i2 & m4;
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
        while (true) {
            byte[] bArr = Si;
            int i5 = 255 & iInv_mcol;
            if (i4 <= 1) {
                byte b2 = bArr[i5];
                byte b3 = bArr[(iInv_mcol4 >> 8) & 255];
                int i6 = ((b2 + 255) - (b2 | 255)) ^ (((b3 + 255) - (b3 | 255)) << 8);
                int i7 = iInv_mcol3 >> 16;
                int i8 = i6 ^ (((-1) - (((-1) - bArr[(i7 + 255) - (i7 | 255)]) | ((-1) - 255))) << 16);
                int i9 = iInv_mcol2 >> 24;
                int iInv_mcol5 = inv_mcol(i8 ^ (bArr[(i9 + 255) - (i9 | 255)] << Ascii.CAN)) ^ iArr[i4][0];
                int i10 = iInv_mcol4 >> 16;
                int iInv_mcol6 = inv_mcol(((((-1) - (((-1) - bArr[255 & iInv_mcol2]) | ((-1) - 255))) ^ ((bArr[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(i10 + 255) - (i10 | 255)] & 255) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol3 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i4][1];
                byte b4 = bArr[(iInv_mcol3 + 255) - (255 | iInv_mcol3)];
                int i11 = iInv_mcol2 >> 8;
                int i12 = ((b4 + 255) - (b4 | 255)) ^ ((bArr[(i11 + 255) - (i11 | 255)] & 255) << 8);
                byte b5 = bArr[(iInv_mcol >> 16) & 255];
                int iInv_mcol7 = inv_mcol((i12 ^ (((b5 + 255) - (b5 | 255)) << 16)) ^ (bArr[(iInv_mcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i4][2];
                byte b6 = bArr[(-1) - (((-1) - iInv_mcol4) | ((-1) - 255))];
                int i13 = iInv_mcol3 >> 8;
                byte b7 = bArr[(i13 + 255) - (i13 | 255)];
                int i14 = ((b6 + 255) - (b6 | 255)) ^ (((b7 + 255) - (b7 | 255)) << 8);
                byte b8 = bArr[(iInv_mcol2 >> 16) & 255];
                int iInv_mcol8 = inv_mcol((bArr[(iInv_mcol >> 24) & 255] << Ascii.CAN) ^ (i14 ^ (((b8 + 255) - (b8 | 255)) << 16))) ^ iArr[i4][3];
                int i15 = (-1) - (((-1) - bArr[(iInv_mcol5 + 255) - (255 | iInv_mcol5)]) | ((-1) - 255));
                byte b9 = bArr[(iInv_mcol8 >> 8) & 255];
                int i16 = i15 ^ (((b9 + 255) - (b9 | 255)) << 8);
                int i17 = iInv_mcol7 >> 16;
                int i18 = (i16 ^ (((-1) - (((-1) - bArr[(i17 + 255) - (i17 | 255)]) | ((-1) - 255))) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol6 >> 24)) | ((-1) - 255))] << Ascii.CAN);
                int[] iArr3 = iArr[0];
                this.C0 = i18 ^ iArr3[0];
                int i19 = (-1) - (((-1) - bArr[255 & iInv_mcol6]) | ((-1) - 255));
                byte b10 = bArr[(-1) - (((-1) - (iInv_mcol5 >> 8)) | ((-1) - 255))];
                int i20 = i19 ^ (((b10 + 255) - (b10 | 255)) << 8);
                int i21 = iInv_mcol8 >> 16;
                this.C1 = ((i20 ^ ((bArr[(i21 + 255) - (i21 | 255)] & 255) << 16)) ^ (bArr[(iInv_mcol7 >> 24) & 255] << Ascii.CAN)) ^ iArr3[1];
                byte b11 = bArr[(iInv_mcol7 + 255) - (255 | iInv_mcol7)];
                int i22 = iInv_mcol5 >> 16;
                int i23 = (((b11 + 255) - (b11 | 255)) ^ (((-1) - (((-1) - bArr[(-1) - (((-1) - (iInv_mcol6 >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8)) ^ ((bArr[(i22 + 255) - (i22 | 255)] & 255) << 16);
                int i24 = iInv_mcol8 >> 24;
                this.C2 = (i23 ^ (bArr[(i24 + 255) - (i24 | 255)] << Ascii.CAN)) ^ iArr3[2];
                byte b12 = bArr[(iInv_mcol8 + 255) - (iInv_mcol8 | 255)];
                int i25 = ((b12 + 255) - (b12 | 255)) ^ (((-1) - (((-1) - bArr[(-1) - (((-1) - (iInv_mcol7 >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8);
                int i26 = iInv_mcol6 >> 16;
                byte b13 = bArr[(i26 + 255) - (i26 | 255)];
                this.C3 = ((i25 ^ (((b13 + 255) - (b13 | 255)) << 16)) ^ (bArr[(iInv_mcol5 >> 24) & 255] << Ascii.CAN)) ^ iArr3[3];
                return;
            }
            byte b14 = bArr[i5];
            int i27 = ((b14 + 255) - (b14 | 255)) ^ ((bArr[(-1) - (((-1) - (iInv_mcol4 >> 8)) | ((-1) - 255))] & 255) << 8);
            byte b15 = bArr[(iInv_mcol3 >> 16) & 255];
            int iInv_mcol9 = inv_mcol((i27 ^ (((b15 + 255) - (b15 | 255)) << 16)) ^ (bArr[(iInv_mcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i4][0];
            int i28 = ((-1) - (((-1) - bArr[255 & iInv_mcol2]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr[(iInv_mcol >> 8) & 255]) | ((-1) - 255))) << 8);
            int i29 = iInv_mcol4 >> 16;
            byte b16 = bArr[(i29 + 255) - (i29 | 255)];
            int i30 = i28 ^ (((b16 + 255) - (b16 | 255)) << 16);
            int i31 = iInv_mcol3 >> 24;
            int iInv_mcol10 = inv_mcol(i30 ^ (bArr[(i31 + 255) - (i31 | 255)] << Ascii.CAN)) ^ iArr[i4][1];
            int i32 = ((-1) - (((-1) - bArr[(iInv_mcol3 + 255) - (255 | iInv_mcol3)]) | ((-1) - 255))) ^ ((bArr[(iInv_mcol2 >> 8) & 255] & 255) << 8);
            byte b17 = bArr[(-1) - (((-1) - (iInv_mcol >> 16)) | ((-1) - 255))];
            int i33 = i32 ^ (((b17 + 255) - (b17 | 255)) << 16);
            int i34 = iInv_mcol4 >> 24;
            int iInv_mcol11 = inv_mcol(i33 ^ (bArr[(i34 + 255) - (i34 | 255)] << Ascii.CAN)) ^ iArr[i4][2];
            byte b18 = bArr[(-1) - (((-1) - iInv_mcol4) | ((-1) - 255))];
            int i35 = iInv_mcol3 >> 8;
            byte b19 = bArr[(i35 + 255) - (i35 | 255)];
            int i36 = (((b18 + 255) - (b18 | 255)) ^ (((b19 + 255) - (b19 | 255)) << 8)) ^ ((bArr[(iInv_mcol2 >> 16) & 255] & 255) << 16);
            int i37 = iInv_mcol >> 24;
            int i38 = i4 - 1;
            int iInv_mcol12 = inv_mcol((bArr[(i37 + 255) - (i37 | 255)] << Ascii.CAN) ^ i36) ^ iArr[i4][3];
            byte b20 = bArr[iInv_mcol9 & 255];
            int i39 = iInv_mcol12 >> 8;
            iInv_mcol = inv_mcol(((((b20 + 255) - (b20 | 255)) ^ (((-1) - (((-1) - bArr[(i39 + 255) - (i39 | 255)]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr[(-1) - (((-1) - (iInv_mcol11 >> 16)) | ((-1) - 255))]) | ((-1) - 255))) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol10 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i38][0];
            int i40 = ((-1) - (((-1) - bArr[(-1) - (((-1) - iInv_mcol10) | ((-1) - 255))]) | ((-1) - 255))) ^ ((bArr[(iInv_mcol9 >> 8) & 255] & 255) << 8);
            int i41 = iInv_mcol12 >> 16;
            byte b21 = bArr[(i41 + 255) - (i41 | 255)];
            int i42 = i40 ^ (((b21 + 255) - (b21 | 255)) << 16);
            int i43 = iInv_mcol11 >> 24;
            iInv_mcol2 = inv_mcol(i42 ^ (bArr[(i43 + 255) - (i43 | 255)] << Ascii.CAN)) ^ iArr[i38][1];
            int i44 = (-1) - (((-1) - bArr[(iInv_mcol11 + 255) - (255 | iInv_mcol11)]) | ((-1) - 255));
            byte b22 = bArr[(iInv_mcol10 >> 8) & 255];
            int i45 = i44 ^ (((b22 + 255) - (b22 | 255)) << 8);
            int i46 = iInv_mcol9 >> 16;
            int i47 = i45 ^ ((bArr[(i46 + 255) - (i46 | 255)] & 255) << 16);
            int i48 = iInv_mcol12 >> 24;
            iInv_mcol3 = inv_mcol(i47 ^ (bArr[(i48 + 255) - (i48 | 255)] << Ascii.CAN)) ^ iArr[i38][2];
            byte b23 = bArr[(-1) - (((-1) - iInv_mcol12) | ((-1) - 255))];
            int i49 = ((b23 + 255) - (b23 | 255)) ^ ((bArr[(-1) - (((-1) - (iInv_mcol11 >> 8)) | ((-1) - 255))] & 255) << 8);
            byte b24 = bArr[(iInv_mcol10 >> 16) & 255];
            i4 -= 2;
            iInv_mcol4 = iArr[i38][3] ^ inv_mcol((i49 ^ (((b24 + 255) - (b24 | 255)) << 16)) ^ (bArr[(-1) - (((-1) - (iInv_mcol9 >> 24)) | ((-1) - 255))] << Ascii.CAN));
        }
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
            int i4 = (-1) - (((-1) - bArr[(-1) - (((-1) - iMcol) | ((-1) - 255))]) | ((-1) - 255));
            int i5 = iMcol2 >> 8;
            byte b2 = bArr[(i5 + 255) - (i5 | 255)];
            int i6 = i4 ^ (((b2 + 255) - (b2 | 255)) << 8);
            int i7 = iMcol3 >> 16;
            byte b3 = bArr[(i7 + 255) - (i7 | 255)];
            int iMcol5 = mcol((i6 ^ (((b3 + 255) - (b3 | 255)) << 16)) ^ (bArr[(iMcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][0];
            int i8 = iMcol3 >> 8;
            int iMcol6 = mcol(((((-1) - (((-1) - bArr[255 & iMcol2]) | ((-1) - 255))) ^ ((bArr[(i8 + 255) - (i8 | 255)] & 255) << 8)) ^ (((-1) - (((-1) - bArr[(iMcol4 >> 16) & 255]) | ((-1) - 255))) << 16)) ^ (bArr[(iMcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i3][1];
            byte b4 = bArr[(iMcol3 + 255) - (255 | iMcol3)];
            int i9 = iMcol4 >> 8;
            int i10 = ((b4 + 255) - (b4 | 255)) ^ ((bArr[(i9 + 255) - (i9 | 255)] & 255) << 8);
            int i11 = iMcol >> 16;
            int i12 = i10 ^ ((bArr[(i11 + 255) - (i11 | 255)] & 255) << 16);
            int i13 = iMcol2 >> 24;
            int iMcol7 = mcol(i12 ^ (bArr[(i13 + 255) - (i13 | 255)] << Ascii.CAN)) ^ iArr[i3][2];
            byte b5 = bArr[iMcol4 & 255];
            int i14 = iMcol >> 8;
            byte b6 = bArr[(i14 + 255) - (i14 | 255)];
            byte b7 = bArr[(-1) - (((-1) - (iMcol2 >> 16)) | ((-1) - 255))];
            int i15 = ((((b6 + 255) - (b6 | 255)) << 8) ^ ((b5 + 255) - (b5 | 255))) ^ (((b7 + 255) - (b7 | 255)) << 16);
            int i16 = iMcol3 >> 24;
            int i17 = i3 + 1;
            int iMcol8 = mcol(i15 ^ (bArr[(i16 + 255) - (i16 | 255)] << Ascii.CAN)) ^ iArr[i3][3];
            int i18 = iMcol6 >> 8;
            iMcol = mcol((((bArr[(-1) - (((-1) - iMcol5) | ((-1) - 255))] & 255) ^ ((bArr[(i18 + 255) - (i18 | 255)] & 255) << 8)) ^ ((bArr[(iMcol7 >> 16) & 255] & 255) << 16)) ^ (bArr[(-1) - (((-1) - (iMcol8 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i17][0];
            int i19 = bArr[(-1) - (((-1) - iMcol6) | ((-1) - 255))] & 255;
            byte b8 = bArr[(-1) - (((-1) - (iMcol7 >> 8)) | ((-1) - 255))];
            int i20 = (i19 ^ (((b8 + 255) - (b8 | 255)) << 8)) ^ (((-1) - (((-1) - bArr[(iMcol8 >> 16) & 255]) | ((-1) - 255))) << 16);
            int i21 = iMcol5 >> 24;
            iMcol2 = mcol(i20 ^ (bArr[(i21 + 255) - (i21 | 255)] << Ascii.CAN)) ^ iArr[i17][1];
            int i22 = (-1) - (((-1) - bArr[255 & iMcol7]) | ((-1) - 255));
            byte b9 = bArr[(-1) - (((-1) - (iMcol8 >> 8)) | ((-1) - 255))];
            iMcol3 = mcol(((i22 ^ (((b9 + 255) - (b9 | 255)) << 8)) ^ (((-1) - (((-1) - bArr[(-1) - (((-1) - (iMcol5 >> 16)) | ((-1) - 255))]) | ((-1) - 255))) << 16)) ^ (bArr[(iMcol6 >> 24) & 255] << Ascii.CAN)) ^ iArr[i17][2];
            byte b10 = bArr[iMcol8 & 255];
            int i23 = iMcol5 >> 8;
            byte b11 = bArr[(i23 + 255) - (i23 | 255)];
            int i24 = ((b10 + 255) - (b10 | 255)) ^ (((b11 + 255) - (b11 | 255)) << 8);
            int i25 = iMcol6 >> 16;
            byte b12 = bArr[(i25 + 255) - (i25 | 255)];
            i3 += 2;
            iMcol4 = iArr[i17][3] ^ mcol((i24 ^ (((b12 + 255) - (b12 | 255)) << 16)) ^ (bArr[(iMcol7 >> 24) & 255] << Ascii.CAN));
        }
        byte[] bArr2 = S;
        int i26 = bArr2[(iMcol + 255) - (255 | iMcol)] & 255;
        byte b13 = bArr2[(-1) - (((-1) - (iMcol2 >> 8)) | ((-1) - 255))];
        int i27 = i26 ^ (((b13 + 255) - (b13 | 255)) << 8);
        int i28 = iMcol3 >> 16;
        int i29 = i27 ^ ((bArr2[(i28 + 255) - (i28 | 255)] & 255) << 16);
        int i30 = iMcol4 >> 24;
        int iMcol9 = mcol(i29 ^ (bArr2[(i30 + 255) - (i30 | 255)] << Ascii.CAN)) ^ iArr[i3][0];
        int i31 = iMcol3 >> 8;
        int iMcol10 = mcol(((((-1) - (((-1) - bArr2[(iMcol2 + 255) - (255 | iMcol2)]) | ((-1) - 255))) ^ (((-1) - (((-1) - bArr2[(i31 + 255) - (i31 | 255)]) | ((-1) - 255))) << 8)) ^ (((-1) - (((-1) - bArr2[(-1) - (((-1) - (iMcol4 >> 16)) | ((-1) - 255))]) | ((-1) - 255))) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i3][1];
        int i32 = ((-1) - (((-1) - bArr2[(-1) - (((-1) - iMcol3) | ((-1) - 255))]) | ((-1) - 255))) ^ ((bArr2[(iMcol4 >> 8) & 255] & 255) << 8);
        int i33 = iMcol >> 16;
        byte b14 = bArr2[(i33 + 255) - (i33 | 255)];
        int iMcol11 = mcol((i32 ^ (((b14 + 255) - (b14 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol2 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr[i3][2];
        int i34 = (((-1) - (((-1) - bArr2[(-1) - (((-1) - (iMcol >> 8)) | ((-1) - 255))]) | ((-1) - 255))) << 8) ^ ((-1) - (((-1) - bArr2[(iMcol4 + 255) - (iMcol4 | 255)]) | ((-1) - 255)));
        int i35 = iMcol2 >> 16;
        byte b15 = bArr2[(i35 + 255) - (i35 | 255)];
        int iMcol12 = mcol((i34 ^ (((b15 + 255) - (b15 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol3 >> 24)) | ((-1) - 255))] << Ascii.CAN));
        int i36 = i3 + 1;
        int i37 = iMcol12 ^ iArr[i3][3];
        int i38 = i37 >> 24;
        int i39 = ((((-1) - (((-1) - bArr2[255 & iMcol9]) | ((-1) - 255))) ^ ((bArr2[(-1) - (((-1) - (iMcol10 >> 8)) | ((-1) - 255))] & 255) << 8)) ^ (((-1) - (((-1) - bArr2[(iMcol11 >> 16) & 255]) | ((-1) - 255))) << 16)) ^ (bArr2[(i38 + 255) - (i38 | 255)] << Ascii.CAN);
        int[] iArr3 = iArr[i36];
        this.C0 = iArr3[0] ^ i39;
        int i40 = ((-1) - (((-1) - bArr2[(-1) - (((-1) - iMcol10) | ((-1) - 255))]) | ((-1) - 255))) ^ ((bArr2[(-1) - (((-1) - (iMcol11 >> 8)) | ((-1) - 255))] & 255) << 8);
        byte b16 = bArr2[(i37 >> 16) & 255];
        this.C1 = ((i40 ^ (((b16 + 255) - (b16 | 255)) << 16)) ^ (bArr2[(-1) - (((-1) - (iMcol9 >> 24)) | ((-1) - 255))] << Ascii.CAN)) ^ iArr3[1];
        byte b17 = bArr2[(iMcol11 + 255) - (255 | iMcol11)];
        int i41 = ((b17 + 255) - (b17 | 255)) ^ ((bArr2[(i37 >> 8) & 255] & 255) << 8);
        int i42 = iMcol9 >> 16;
        byte b18 = bArr2[(i42 + 255) - (i42 | 255)];
        int i43 = i41 ^ (((b18 + 255) - (b18 | 255)) << 16);
        int i44 = iMcol10 >> 24;
        this.C2 = (i43 ^ (bArr2[(i44 + 255) - (i44 | 255)] << Ascii.CAN)) ^ iArr3[2];
        byte b19 = bArr2[(-1) - (((-1) - i37) | ((-1) - 255))];
        int i45 = iMcol9 >> 8;
        int i46 = ((b19 + 255) - (b19 | 255)) ^ (((-1) - (((-1) - bArr2[(i45 + 255) - (i45 | 255)]) | ((-1) - 255))) << 8);
        int i47 = iMcol10 >> 16;
        int i48 = i46 ^ (((-1) - (((-1) - bArr2[(i47 + 255) - (i47 | 255)]) | ((-1) - 255))) << 16);
        int i49 = iMcol11 >> 24;
        this.C3 = (i48 ^ (bArr2[(i49 + 255) - (i49 | 255)] << Ascii.CAN)) ^ iArr3[3];
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
        byte b2 = bArr[(i2 + 255) - (255 | i2)];
        byte b3 = bArr[(-1) - (((-1) - (i2 >> 8)) | ((-1) - 255))];
        int i3 = (-1) - (((-1) - ((b2 + 255) - (b2 | 255))) & ((-1) - (((b3 + 255) - (b3 | 255)) << 8)));
        int i4 = i2 >> 16;
        int i5 = (bArr[(i4 + 255) - (i4 | 255)] & 255) << 16;
        return (-1) - (((-1) - (bArr[(i2 >> 24) & 255] << Ascii.CAN)) & ((-1) - ((i3 + i5) - (i3 & i5))));
    }

    private void unpackBlock(byte[] bArr, int i2) {
        int i3 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
        this.C0 = i3;
        int i4 = ((bArr[i2 + 1] & 255) << 8) | i3;
        this.C0 = i4;
        byte b2 = bArr[i2 + 2];
        int i5 = i4 | (((b2 + 255) - (b2 | 255)) << 16);
        this.C0 = i5;
        this.C0 = (-1) - (((-1) - i5) & ((-1) - (bArr[i2 + 3] << Ascii.CAN)));
        int i6 = (-1) - (((-1) - bArr[i2 + 4]) | ((-1) - 255));
        this.C1 = i6;
        int i7 = (((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255))) << 8) | i6;
        this.C1 = i7;
        int i8 = (-1) - (((-1) - i7) & ((-1) - (((-1) - (((-1) - bArr[i2 + 6]) | ((-1) - 255))) << 16)));
        this.C1 = i8;
        this.C1 = i8 | (bArr[i2 + 7] << Ascii.CAN);
        int i9 = bArr[i2 + 8] & 255;
        this.C2 = i9;
        byte b3 = bArr[i2 + 9];
        int i10 = ((b3 + 255) - (b3 | 255)) << 8;
        int i11 = (i10 + i9) - (i10 & i9);
        this.C2 = i11;
        int i12 = ((-1) - (((-1) - bArr[i2 + 10]) | ((-1) - 255))) << 16;
        int i13 = (i11 + i12) - (i11 & i12);
        this.C2 = i13;
        int i14 = bArr[i2 + 11] << Ascii.CAN;
        this.C2 = (i13 + i14) - (i13 & i14);
        int i15 = (-1) - (((-1) - bArr[i2 + 12]) | ((-1) - 255));
        this.C3 = i15;
        int i16 = (((-1) - (((-1) - bArr[i2 + 13]) | ((-1) - 255))) << 8) | i15;
        this.C3 = i16;
        byte b4 = bArr[i2 + 14];
        int i17 = ((b4 + 255) - (b4 | 255)) << 16;
        int i18 = (i16 + i17) - (i16 & i17);
        this.C3 = i18;
        int i19 = bArr[i2 + 15] << Ascii.CAN;
        this.C3 = (i19 + i18) - (i19 & i18);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z2);
        this.forEncryption = z2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
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
        boolean z2 = this.forEncryption;
        unpackBlock(bArr, i2);
        int[][] iArr = this.WorkingKey;
        if (z2) {
            encryptBlock(iArr);
        } else {
            decryptBlock(iArr);
        }
        packBlock(bArr2, i3);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
