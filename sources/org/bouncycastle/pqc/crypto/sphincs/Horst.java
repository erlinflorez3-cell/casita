package org.bouncycastle.pqc.crypto.sphincs;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;

/* JADX INFO: loaded from: classes2.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    Horst() {
    }

    static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i2, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[2097152];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        int i3 = 0;
        while (true) {
            hashFunctions = hashFunctions;
            if (i3 >= 65536) {
                break;
            }
            hashFunctions.hash_n_n(bArr7, (65535 + i3) * 32, bArr6, i3 * 32);
            i3++;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            long j2 = (1 << (16 - i4)) - 1;
            int i5 = 1 << (15 - i4);
            long j3 = i5 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((((long) i6) + j3) * 32), bArr7, (int) ((((long) (i6 * 2)) + j2) * 32), bArr4, i4 * 64);
            }
        }
        int i7 = 2016;
        while (i7 < 4064) {
            bArr[i2] = bArr7[i7];
            i7++;
            i2++;
        }
        for (int i8 = 0; i8 < 32; i8++) {
            int i9 = i8 * 2;
            byte b2 = bArr5[i9];
            int i10 = ((b2 + 255) - (b2 | 255)) + ((bArr5[i9 + 1] & 255) << 8);
            int i11 = 0;
            while (i11 < 32) {
                bArr[i2] = bArr6[(i10 * 32) + i11];
                i11++;
                i2++;
            }
            int i12 = i10 + 65535;
            for (int i13 = 0; i13 < 10; i13++) {
                int i14 = (i12 + 1) - (1 | i12) != 0 ? i12 + 1 : i12 - 1;
                int i15 = 0;
                while (i15 < 32) {
                    bArr[i2] = bArr7[(i14 * 32) + i15];
                    i15++;
                    i2++;
                }
                i12 = (i14 - 1) / 2;
            }
        }
        for (int i16 = 0; i16 < 32; i16++) {
            bArr2[i16] = bArr7[i16];
        }
        return HORST_SIGBYTES;
    }

    static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[1024];
        int i3 = i2 + 2048;
        int i4 = 0;
        while (true) {
            byte[] bArr6 = bArr3;
            if (i4 >= 32) {
                for (int i5 = 0; i5 < 32; i5++) {
                    bArr5 = bArr5;
                    bArr6 = bArr6;
                    hashFunctions.hash_2n_n_mask(bArr5, i5 * 32, bArr2, i2 + (i5 * 64), bArr6, OlympusMakernoteDirectory.TAG_PREVIEW_IMAGE);
                }
                for (int i6 = 0; i6 < 16; i6++) {
                    bArr5 = bArr5;
                    hashFunctions.hash_2n_n_mask(bArr5, i6 * 32, bArr5, i6 * 64, bArr6, TypedValues.TransitionType.TYPE_AUTO_TRANSITION);
                }
                for (int i7 = 0; i7 < 8; i7++) {
                    bArr5 = bArr5;
                    hashFunctions.hash_2n_n_mask(bArr5, i7 * 32, bArr5, i7 * 64, bArr6, 768);
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    bArr5 = bArr5;
                    hashFunctions.hash_2n_n_mask(bArr5, i8 * 32, bArr5, i8 * 64, bArr6, LeicaMakernoteDirectory.TAG_IMAGE_ID_NUMBER);
                }
                for (int i9 = 0; i9 < 2; i9++) {
                    bArr5 = bArr5;
                    hashFunctions.hash_2n_n_mask(bArr5, i9 * 32, bArr5, i9 * 64, bArr6, 896);
                }
                hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr6, 960);
                return 0;
            }
            int i10 = i4 * 2;
            byte b2 = bArr4[i10];
            int i11 = ((b2 + 255) - (b2 | 255)) + ((bArr4[i10 + 1] & 255) << 8);
            if ((i11 + 1) - (1 | i11) == 0) {
                hashFunctions.hash_n_n(bArr5, 0, bArr2, i3);
                for (int i12 = 0; i12 < 32; i12++) {
                    bArr5[i12 + 32] = bArr2[i3 + 32 + i12];
                }
            } else {
                hashFunctions.hash_n_n(bArr5, 32, bArr2, i3);
                for (int i13 = 0; i13 < 32; i13++) {
                    bArr5[i13] = bArr2[i3 + 32 + i13];
                }
            }
            i3 += 64;
            for (int i14 = 1; i14 < 10; i14++) {
                i11 >>>= 1;
                if ((1 & i11) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr6, (i14 - 1) * 64);
                    for (int i15 = 0; i15 < 32; i15++) {
                        bArr5[i15 + 32] = bArr2[i3 + i15];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr6, (i14 - 1) * 64);
                    for (int i16 = 0; i16 < 32; i16++) {
                        bArr5[i16] = bArr2[i3 + i16];
                    }
                }
                i3 += 32;
            }
            int i17 = i11 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr6, 576);
            for (int i18 = 0; i18 < 32; i18++) {
                if (bArr2[(i17 * 32) + i2 + i18] != bArr5[i18]) {
                    for (int i19 = 0; i19 < 32; i19++) {
                        bArr[i19] = 0;
                    }
                    return -1;
                }
            }
            i4++;
        }
    }
}
