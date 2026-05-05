package org.bouncycastle.crypto.engines;

import android.R;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.google.common.base.Ascii;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public class DESEngine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private int[] workingKey = null;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
    private static final byte[] pc1 = {56, 48, 40, 32, Ascii.CAN, 16, 8, 0, 57, 49, 41, 33, Ascii.EM, 17, 9, 1, 58, 50, 42, 34, Ascii.SUB, Ascii.DC2, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, Ascii.RS, Ascii.SYN, Ascii.SO, 6, Base64.padSymbol, 53, 45, 37, Ascii.GS, Ascii.NAK, Ascii.CR, 5, 60, 52, 44, 36, Ascii.FS, Ascii.DC4, Ascii.FF, 4, Ascii.ESC, 19, Ascii.VT, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, Ascii.FF, Ascii.SO, Ascii.SI, 17, 19, Ascii.NAK, Ascii.ETB, Ascii.EM, Ascii.ESC, Ascii.FS};
    private static final byte[] pc2 = {Ascii.CR, 16, 10, Ascii.ETB, 0, 4, 2, Ascii.ESC, Ascii.SO, 5, Ascii.DC4, 9, Ascii.SYN, Ascii.DC2, Ascii.VT, 3, Ascii.EM, 7, Ascii.SI, 6, Ascii.SUB, 19, Ascii.FF, 1, 40, 51, Ascii.RS, 36, 46, 54, Ascii.GS, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, Ascii.FS, Ascii.US};
    private static final int[] SP1 = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, InputDeviceCompat.SOURCE_TRACKBALL, 16777220, 16777220, InputDeviceCompat.SOURCE_TRACKBALL, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, InputDeviceCompat.SOURCE_TRACKBALL, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, InputDeviceCompat.SOURCE_TRACKBALL, 66560, 0, R.attr.manageSpaceActivity};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, CanonMakernoteDirectory.TAG_CUSTOM_PICTURE_STYLE_FILE_NAME, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, CanonMakernoteDirectory.TAG_CUSTOM_PICTURE_STYLE_FILE_NAME, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, CanonMakernoteDirectory.TAG_CUSTOM_PICTURE_STYLE_FILE_NAME, 536870928, 4194304, 536887296, 536870912, CanonMakernoteDirectory.TAG_CUSTOM_PICTURE_STYLE_FILE_NAME, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};
    private static final int[] SP7 = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    protected void desFunc(int[] iArr, byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte b2 = bArr[i2];
        int i4 = ((b2 + 255) - (b2 | 255)) << 24;
        byte b3 = bArr[i2 + 1];
        int i5 = i4 | (((b3 + 255) - (b3 | 255)) << 16);
        int i6 = ((-1) - (((-1) - bArr[i2 + 2]) | ((-1) - 255))) << 8;
        int i7 = (i5 + i6) - (i5 & i6);
        int i8 = bArr[i2 + 3] & 255;
        int i9 = (i7 + i8) - (i7 & i8);
        int i10 = ((-1) - (((-1) - (((-1) - (((-1) - bArr[i2 + 4]) | ((-1) - 255))) << 24)) & ((-1) - (((-1) - (((-1) - bArr[i2 + 5]) | ((-1) - 255))) << 16)))) | ((bArr[i2 + 6] & 255) << 8);
        byte b4 = bArr[i2 + 7];
        int i11 = (b4 + 255) - (b4 | 255);
        int i12 = (i10 + i11) - (i10 & i11);
        int i13 = (-1) - (((-1) - ((i9 >>> 4) ^ i12)) | ((-1) - 252645135));
        int i14 = i12 ^ i13;
        int i15 = i9 ^ (i13 << 4);
        int i16 = (i15 >>> 16) ^ i14;
        int i17 = (i16 + 65535) - (i16 | 65535);
        int i18 = i14 ^ i17;
        int i19 = i15 ^ (i17 << 16);
        int i20 = ((i18 >>> 2) ^ i19) & 858993459;
        int i21 = i19 ^ i20;
        int i22 = i18 ^ (i20 << 2);
        int i23 = (-1) - (((-1) - ((i22 >>> 8) ^ i21)) | ((-1) - 16711935));
        int i24 = i21 ^ i23;
        int i25 = i22 ^ (i23 << 8);
        int i26 = ((-1) - (((-1) - (i25 >>> 31)) | ((-1) - 1))) | (i25 << 1);
        int i27 = (-1) - (((-1) - (i24 ^ i26)) | ((-1) - (-1431655766)));
        int i28 = i24 ^ i27;
        int i29 = i26 ^ i27;
        int i30 = i28 << 1;
        int i31 = i28 >>> 31;
        int i32 = (i31 + 1) - (i31 | 1);
        int i33 = (i32 + i30) - (i32 & i30);
        for (int i34 = 0; i34 < 8; i34++) {
            int i35 = i29 << 28;
            int i36 = i29 >>> 4;
            int i37 = i34 * 4;
            int i38 = ((i35 + i36) - (i35 & i36)) ^ iArr[i37];
            int[] iArr2 = SP7;
            int i39 = iArr2[63 & i38];
            int[] iArr3 = SP5;
            int i40 = iArr3[(-1) - (((-1) - (i38 >>> 8)) | ((-1) - 63))];
            int[] iArr4 = SP3;
            int i41 = ((i39 + i40) - (i39 & i40)) | iArr4[(i38 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i42 = i38 >>> 24;
            int i43 = iArr5[(i42 + 63) - (i42 | 63)];
            int i44 = (i43 + i41) - (i43 & i41);
            int i45 = iArr[i37 + 1] ^ i29;
            int[] iArr6 = SP8;
            int i46 = i44 | iArr6[63 & i45];
            int[] iArr7 = SP6;
            int i47 = i45 >>> 8;
            int i48 = (-1) - (((-1) - i46) & ((-1) - iArr7[(i47 + 63) - (i47 | 63)]));
            int[] iArr8 = SP4;
            int i49 = (-1) - (((-1) - i48) & ((-1) - iArr8[(-1) - (((-1) - (i45 >>> 16)) | ((-1) - 63))]));
            int[] iArr9 = SP2;
            i33 ^= (-1) - (((-1) - i49) & ((-1) - iArr9[(-1) - (((-1) - (i45 >>> 24)) | ((-1) - 63))]));
            int i50 = ((-1) - (((-1) - (i33 << 28)) & ((-1) - (i33 >>> 4)))) ^ iArr[i37 + 2];
            int i51 = iArr2[63 & i50] | iArr3[(-1) - (((-1) - (i50 >>> 8)) | ((-1) - 63))];
            int i52 = i50 >>> 16;
            int i53 = iArr4[(i52 + 63) - (i52 | 63)];
            int i54 = (i51 + i53) - (i51 & i53);
            int i55 = iArr5[(i50 >>> 24) & 63];
            int i56 = (i55 + i54) - (i55 & i54);
            int i57 = iArr[i37 + 3] ^ i33;
            int i58 = iArr6[(i57 + 63) - (63 | i57)];
            i29 ^= ((-1) - (((-1) - (((i56 + i58) - (i56 & i58)) | iArr7[(-1) - (((-1) - (i57 >>> 8)) | ((-1) - 63))])) & ((-1) - iArr8[(i57 >>> 16) & 63]))) | iArr9[(-1) - (((-1) - (i57 >>> 24)) | ((-1) - 63))];
        }
        int i59 = (i29 >>> 1) | (i29 << 31);
        int i60 = (i33 ^ i59) & (-1431655766);
        int i61 = i33 ^ i60;
        int i62 = i59 ^ i60;
        int i63 = (-1) - (((-1) - (i61 >>> 1)) & ((-1) - (i61 << 31)));
        int i64 = (-1) - (((-1) - ((i63 >>> 8) ^ i62)) | ((-1) - 16711935));
        int i65 = i62 ^ i64;
        int i66 = i63 ^ (i64 << 8);
        int i67 = ((i66 >>> 2) ^ i65) & 858993459;
        int i68 = i65 ^ i67;
        int i69 = i66 ^ (i67 << 2);
        int i70 = (-1) - (((-1) - ((i68 >>> 16) ^ i69)) | ((-1) - 65535));
        int i71 = i69 ^ i70;
        int i72 = i68 ^ (i70 << 16);
        int i73 = ((i72 >>> 4) ^ i71) & 252645135;
        int i74 = i71 ^ i73;
        int i75 = i72 ^ (i73 << 4);
        bArr2[i3] = (byte) ((i75 >>> 24) & 255);
        bArr2[i3 + 1] = (byte) ((i75 >>> 16) & 255);
        bArr2[i3 + 2] = (byte) ((-1) - (((-1) - (i75 >>> 8)) | ((-1) - 255)));
        bArr2[i3 + 3] = (byte) ((-1) - (((-1) - i75) | ((-1) - 255)));
        bArr2[i3 + 4] = (byte) ((i74 >>> 24) & 255);
        int i76 = i74 >>> 16;
        bArr2[i3 + 5] = (byte) ((i76 + 255) - (i76 | 255));
        bArr2[i3 + 6] = (byte) ((-1) - (((-1) - (i74 >>> 8)) | ((-1) - 255)));
        bArr2[i3 + 7] = (byte) (i74 & 255);
    }

    protected int[] generateWorkingKey(boolean z2, byte[] bArr) {
        int i2;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= 56) {
                break;
            }
            byte b2 = pc1[i3];
            if ((bytebit[b2 & 7] & bArr[b2 >>> 3]) == 0) {
                z3 = false;
            }
            zArr[i3] = z3;
            i3++;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = z2 ? i4 << 1 : (15 - i4) << 1;
            int i6 = i5 + 1;
            iArr[i6] = 0;
            iArr[i5] = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= 28) {
                    break;
                }
                int i8 = totrot[i4] + i7;
                if (i8 < 28) {
                    zArr2[i7] = zArr[i8];
                } else {
                    zArr2[i7] = zArr[i8 - 28];
                }
                i7++;
            }
            for (i2 = 28; i2 < 56; i2++) {
                int i9 = totrot[i4] + i2;
                if (i9 < 56) {
                    zArr2[i2] = zArr[i9];
                } else {
                    zArr2[i2] = zArr[i9 - 28];
                }
            }
            for (int i10 = 0; i10 < 24; i10++) {
                byte[] bArr2 = pc2;
                if (zArr2[bArr2[i10]]) {
                    iArr[i5] = (-1) - (((-1) - iArr[i5]) & ((-1) - bigbyte[i10]));
                }
                if (zArr2[bArr2[i10 + 24]]) {
                    iArr[i6] = iArr[i6] | bigbyte[i10];
                }
            }
        }
        for (int i11 = 0; i11 != 32; i11 += 2) {
            int i12 = iArr[i11];
            int i13 = i11 + 1;
            int i14 = iArr[i13];
            iArr[i11] = (-1) - (((-1) - ((((-1) - (((-1) - 16515072) | ((-1) - i14))) >>> 10) | ((((-1) - (((-1) - i12) | ((-1) - 16515072))) << 6) | ((4032 & i12) << 10)))) & ((-1) - (((-1) - (((-1) - i14) | ((-1) - 4032))) >>> 6)));
            int i15 = ((i12 + 258048) - (i12 | 258048)) << 12;
            int i16 = (i12 & 63) << 16;
            int i17 = (i16 + i15) - (i16 & i15);
            int i18 = ((-1) - (((-1) - 258048) | ((-1) - i14))) >>> 4;
            iArr[i13] = ((i17 + i18) - (i17 & i18)) | (i14 & 63);
        }
        return iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to DES init - " + cipherParameters.getClass().getName());
        }
        KeyParameter keyParameter = (KeyParameter) cipherParameters;
        if (keyParameter.getKey().length > 8) {
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        this.workingKey = generateWorkingKey(z2, keyParameter.getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("DES engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        desFunc(iArr, bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
