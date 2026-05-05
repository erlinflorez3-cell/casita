package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.TweakableBlockCipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f27905t = new long[5];

    private static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long jXorRotr = jArr[1];
            long j3 = jArr[2];
            long jXorRotr2 = jArr[3];
            long j4 = jArr[4];
            long jXorRotr3 = jArr[5];
            long j5 = jArr[6];
            long jXorRotr4 = jArr[7];
            long j6 = jArr[8];
            long jXorRotr5 = jArr[9];
            long j7 = jArr[10];
            long jXorRotr6 = jArr[11];
            long j8 = jArr[12];
            long jXorRotr7 = jArr[13];
            long j9 = jArr[14];
            long jXorRotr8 = jArr[15];
            int i2 = 19;
            for (int i3 = 1; i2 >= i3; i3 = 1) {
                int i4 = iArr[i2];
                int i5 = iArr2[i2];
                int i6 = i4 + 1;
                long j10 = j2 - jArr3[i6];
                int i7 = i4 + 2;
                long j11 = jXorRotr - jArr3[i7];
                int i8 = i4 + 3;
                long j12 = j3 - jArr3[i8];
                int i9 = i4 + 4;
                long j13 = jXorRotr2 - jArr3[i9];
                int i10 = i4 + 5;
                long j14 = j4 - jArr3[i10];
                int i11 = i4 + 6;
                long j15 = jXorRotr3 - jArr3[i11];
                int i12 = i4 + 7;
                long j16 = j5 - jArr3[i12];
                int i13 = i4 + 8;
                long j17 = jXorRotr4 - jArr3[i13];
                int i14 = i4 + 9;
                long j18 = j6 - jArr3[i14];
                int i15 = i4 + 10;
                long j19 = jXorRotr5 - jArr3[i15];
                int i16 = i4 + 11;
                long j20 = j7 - jArr3[i16];
                int i17 = i4 + 12;
                long j21 = jXorRotr6 - jArr3[i17];
                int i18 = i4 + 13;
                long j22 = j8 - jArr3[i18];
                int i19 = i4 + 14;
                int i20 = i5 + 1;
                long j23 = jXorRotr7 - (jArr3[i19] + jArr4[i20]);
                int i21 = i4 + 15;
                long j24 = j9 - (jArr3[i21] + jArr4[i5 + 2]);
                long j25 = i2;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr8 - ((jArr3[i4 + 16] + j25) + 1), 9, j10);
                long j26 = j10 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(j21, 48, j12);
                long j27 = j12 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j23, 35, j16);
                long j28 = j16 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(j19, 52, j14);
                long j29 = j14 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(j11, 23, j24);
                long j30 = j24 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(j15, 31, j18);
                long j31 = j18 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(j13, 37, j20);
                long j32 = j20 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(j17, 20, j22);
                long j33 = j22 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr16, 31, j26);
                long j34 = j26 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 44, j27);
                long j35 = j27 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 47, j29);
                long j36 = j29 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr13, 46, j28);
                long j37 = j28 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr9, 19, j33);
                long j38 = j33 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr11, 42, j30);
                long j39 = j30 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr10, 44, j31);
                long j40 = j31 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr12, 25, j32);
                long j41 = j32 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr24, 16, j34);
                long j42 = j34 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 34, j35);
                long j43 = j35 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 56, j37);
                long j44 = j37 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr21, 51, j36);
                long j45 = j36 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr17, 4, j41);
                long j46 = j41 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr19, 53, j38);
                long j47 = j38 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr18, 42, j39);
                long j48 = j39 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr20, 41, j40);
                long j49 = j40 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr32, 41, j42);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr30, 9, j43);
                long jXorRotr35 = ThreefishEngine.xorRotr(jXorRotr31, 37, j45);
                long jXorRotr36 = ThreefishEngine.xorRotr(jXorRotr29, 31, j44);
                long jXorRotr37 = ThreefishEngine.xorRotr(jXorRotr25, 12, j49);
                long jXorRotr38 = ThreefishEngine.xorRotr(jXorRotr27, 47, j46);
                long jXorRotr39 = ThreefishEngine.xorRotr(jXorRotr26, 44, j47);
                long jXorRotr40 = ThreefishEngine.xorRotr(jXorRotr28, 30, j48);
                long j50 = (j42 - jXorRotr33) - jArr3[i4];
                long j51 = jXorRotr33 - jArr3[i6];
                long j52 = (j43 - jXorRotr34) - jArr3[i7];
                long j53 = jXorRotr34 - jArr3[i8];
                long j54 = (j45 - jXorRotr35) - jArr3[i9];
                long j55 = jXorRotr35 - jArr3[i10];
                long j56 = (j44 - jXorRotr36) - jArr3[i11];
                long j57 = jXorRotr36 - jArr3[i12];
                long j58 = (j49 - jXorRotr37) - jArr3[i13];
                long j59 = jXorRotr37 - jArr3[i14];
                long j60 = (j46 - jXorRotr38) - jArr3[i15];
                long j61 = jXorRotr38 - jArr3[i16];
                long j62 = (j47 - jXorRotr39) - jArr3[i17];
                long j63 = jXorRotr39 - (jArr3[i18] + jArr4[i5]);
                long j64 = (j48 - jXorRotr40) - (jArr3[i19] + jArr4[i20]);
                long jXorRotr41 = ThreefishEngine.xorRotr(jXorRotr40 - (jArr3[i21] + j25), 5, j50);
                long j65 = j50 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(j61, 20, j52);
                long j66 = j52 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(j63, 48, j56);
                long j67 = j56 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(j59, 41, j54);
                long j68 = j54 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(j51, 47, j64);
                long j69 = j64 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(j55, 28, j58);
                long j70 = j58 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(j53, 16, j60);
                long j71 = j60 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(j57, 25, j62);
                long j72 = j62 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr48, 33, j65);
                long j73 = j65 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr46, 4, j66);
                long j74 = j66 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 51, j68);
                long j75 = j68 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr45, 13, j67);
                long j76 = j67 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr41, 34, j72);
                long j77 = j72 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr43, 41, j69);
                long j78 = j69 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr42, 59, j70);
                long j79 = j70 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr44, 17, j71);
                long j80 = j71 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr56, 38, j73);
                long j81 = j73 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr54, 19, j74);
                long j82 = j74 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 10, j76);
                long j83 = j76 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr53, 55, j75);
                long j84 = j75 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr49, 49, j80);
                long j85 = j80 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr51, 18, j77);
                long j86 = j77 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr50, 23, j78);
                long j87 = j78 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr52, 52, j79);
                long j88 = j79 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr64, 24, j81);
                j2 = j81 - jXorRotr;
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr62, 13, j82);
                j3 = j82 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr63, 8, j84);
                j4 = j84 - jXorRotr3;
                jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr61, 47, j83);
                j5 = j83 - jXorRotr4;
                jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr57, 8, j88);
                j6 = j88 - jXorRotr5;
                jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr59, 17, j85);
                j7 = j85 - jXorRotr6;
                jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr58, 22, j86);
                j8 = j86 - jXorRotr7;
                jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr60, 37, j87);
                j9 = j87 - jXorRotr8;
                i2 -= 2;
            }
            long j89 = j2 - jArr3[0];
            long j90 = jXorRotr - jArr3[1];
            long j91 = j3 - jArr3[2];
            long j92 = jXorRotr2 - jArr3[3];
            long j93 = j4 - jArr3[4];
            long j94 = jXorRotr3 - jArr3[5];
            long j95 = j5 - jArr3[6];
            long j96 = jXorRotr4 - jArr3[7];
            long j97 = j6 - jArr3[8];
            long j98 = jXorRotr5 - jArr3[9];
            long j99 = j7 - jArr3[10];
            long j100 = jXorRotr6 - jArr3[11];
            long j101 = j8 - jArr3[12];
            long j102 = jXorRotr7 - (jArr3[13] + jArr4[0]);
            long j103 = j9 - (jArr3[14] + jArr4[1]);
            long j104 = jXorRotr8 - jArr3[15];
            jArr2[0] = j89;
            jArr2[1] = j90;
            jArr2[2] = j91;
            jArr2[3] = j92;
            jArr2[4] = j93;
            jArr2[5] = j94;
            jArr2[6] = j95;
            jArr2[7] = j96;
            jArr2[8] = j97;
            jArr2[9] = j98;
            jArr2[10] = j99;
            jArr2[11] = j100;
            jArr2[12] = j101;
            jArr2[13] = j102;
            jArr2[14] = j103;
            jArr2[15] = j104;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            int i2 = 1;
            long j3 = jArr[1];
            long j4 = jArr[2];
            long j5 = jArr[3];
            long j6 = jArr[4];
            long j7 = jArr[5];
            long j8 = jArr[6];
            long j9 = jArr[7];
            long j10 = jArr[8];
            long j11 = jArr[9];
            long j12 = jArr[10];
            long j13 = jArr[11];
            long j14 = jArr[12];
            long j15 = jArr[13];
            long j16 = jArr[14];
            long j17 = jArr[15];
            long j18 = j2 + jArr3[0];
            long j19 = j3 + jArr3[1];
            long j20 = j4 + jArr3[2];
            long j21 = j5 + jArr3[3];
            long j22 = j6 + jArr3[4];
            long j23 = j7 + jArr3[5];
            long j24 = j8 + jArr3[6];
            long j25 = j9 + jArr3[7];
            long j26 = j10 + jArr3[8];
            long j27 = j11 + jArr3[9];
            long j28 = j12 + jArr3[10];
            long j29 = j13 + jArr3[11];
            long j30 = j14 + jArr3[12];
            long j31 = j15 + jArr3[13] + jArr4[0];
            long j32 = j16 + jArr3[14] + jArr4[1];
            long j33 = j17 + jArr3[15];
            while (i2 < 20) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                long j34 = j18 + j19;
                long jRotlXor = ThreefishEngine.rotlXor(j19, 24, j34);
                long j35 = j20 + j21;
                long jRotlXor2 = ThreefishEngine.rotlXor(j21, 13, j35);
                long j36 = j22 + j23;
                long jRotlXor3 = ThreefishEngine.rotlXor(j23, 8, j36);
                long j37 = j24 + j25;
                long jRotlXor4 = ThreefishEngine.rotlXor(j25, 47, j37);
                long j38 = j26 + j27;
                long jRotlXor5 = ThreefishEngine.rotlXor(j27, 8, j38);
                long j39 = j28 + j29;
                long jRotlXor6 = ThreefishEngine.rotlXor(j29, 17, j39);
                long j40 = j30 + j31;
                long jRotlXor7 = ThreefishEngine.rotlXor(j31, 22, j40);
                long j41 = j32 + j33;
                long jRotlXor8 = ThreefishEngine.rotlXor(j33, 37, j41);
                long j42 = j34 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j42);
                long j43 = j35 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j43);
                long j44 = j37 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j44);
                long j45 = j36 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j45);
                long j46 = j39 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j46);
                long j47 = j40 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j47);
                long j48 = j41 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j48);
                long j49 = j38 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j49);
                long j50 = j42 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j50);
                long j51 = j43 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j51);
                long j52 = j45 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j52);
                long j53 = j44 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j53);
                long j54 = j47 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j54);
                long j55 = j48 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j55);
                long j56 = j49 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j56);
                long j57 = j46 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j57);
                long j58 = j50 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j58);
                long j59 = j51 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j59);
                long j60 = j53 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j60);
                long j61 = j52 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j61);
                long j62 = j55 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j62);
                long j63 = j56 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j63);
                long j64 = j57 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j64);
                long j65 = j54 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j65);
                long j66 = j58 + jArr3[i3];
                int i5 = i3 + 1;
                long j67 = jRotlXor29 + jArr3[i5];
                int i6 = i3 + 2;
                long j68 = j59 + jArr3[i6];
                int i7 = i3 + 3;
                long j69 = jRotlXor31 + jArr3[i7];
                int i8 = i3 + 4;
                long j70 = j61 + jArr3[i8];
                int i9 = i3 + 5;
                long j71 = jRotlXor30 + jArr3[i9];
                int i10 = i3 + 6;
                long j72 = j60 + jArr3[i10];
                int i11 = i3 + 7;
                long j73 = jRotlXor32 + jArr3[i11];
                int i12 = i3 + 8;
                long j74 = j63 + jArr3[i12];
                int i13 = i3 + 9;
                long j75 = jRotlXor28 + jArr3[i13];
                int i14 = i3 + 10;
                long j76 = j64 + jArr3[i14];
                int i15 = i3 + 11;
                long j77 = jRotlXor26 + jArr3[i15];
                int i16 = i3 + 12;
                long j78 = j65 + jArr3[i16];
                int i17 = i3 + 13;
                long j79 = jRotlXor27 + jArr3[i17] + jArr4[i4];
                int i18 = i3 + 14;
                int i19 = i4 + 1;
                long j80 = j62 + jArr3[i18] + jArr4[i19];
                int i20 = i3 + 15;
                long j81 = i2;
                long j82 = jRotlXor25 + jArr3[i20] + j81;
                long j83 = j66 + j67;
                long jRotlXor33 = ThreefishEngine.rotlXor(j67, 41, j83);
                long j84 = j68 + j69;
                long jRotlXor34 = ThreefishEngine.rotlXor(j69, 9, j84);
                long j85 = j70 + j71;
                long jRotlXor35 = ThreefishEngine.rotlXor(j71, 37, j85);
                long j86 = j72 + j73;
                long jRotlXor36 = ThreefishEngine.rotlXor(j73, 31, j86);
                long j87 = j74 + j75;
                long jRotlXor37 = ThreefishEngine.rotlXor(j75, 12, j87);
                long j88 = j76 + j77;
                long jRotlXor38 = ThreefishEngine.rotlXor(j77, 47, j88);
                long j89 = j78 + j79;
                long jRotlXor39 = ThreefishEngine.rotlXor(j79, 44, j89);
                long j90 = j80 + j82;
                long jRotlXor40 = ThreefishEngine.rotlXor(j82, 30, j90);
                long j91 = j83 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j91);
                long j92 = j84 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j92);
                long j93 = j86 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j93);
                long j94 = j85 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j94);
                long j95 = j88 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j95);
                long j96 = j89 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j96);
                long j97 = j90 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j97);
                long j98 = j87 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j98);
                long j99 = j91 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j99);
                long j100 = j92 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j100);
                long j101 = j94 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j101);
                long j102 = j93 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j102);
                long j103 = j96 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j103);
                long j104 = j97 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j104);
                long j105 = j98 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j105);
                long j106 = j95 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j106);
                long j107 = j99 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j107);
                long j108 = j100 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j108);
                long j109 = j102 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j109);
                long j110 = j101 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j110);
                long j111 = j104 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j111);
                long j112 = j105 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j112);
                long j113 = j106 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j113);
                long j114 = j103 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j114);
                long j115 = jArr3[i5] + j107;
                j19 = jRotlXor61 + jArr3[i6];
                j20 = j108 + jArr3[i7];
                j21 = jRotlXor63 + jArr3[i8];
                long j116 = jArr3[i9] + j110;
                j23 = jRotlXor62 + jArr3[i10];
                j24 = j109 + jArr3[i11];
                j25 = jRotlXor64 + jArr3[i12];
                j26 = j112 + jArr3[i13];
                j27 = jRotlXor60 + jArr3[i14];
                j28 = j113 + jArr3[i15];
                j29 = jRotlXor58 + jArr3[i16];
                j30 = j114 + jArr3[i17];
                j31 = jRotlXor59 + jArr3[i18] + jArr4[i19];
                j32 = j111 + jArr3[i20] + jArr4[i4 + 2];
                j33 = jRotlXor57 + jArr3[i3 + 16] + j81 + 1;
                i2 += 2;
                j22 = j116;
                j18 = j115;
            }
            jArr2[0] = j18;
            jArr2[1] = j19;
            jArr2[2] = j20;
            jArr2[3] = j21;
            jArr2[4] = j22;
            jArr2[5] = j23;
            jArr2[6] = j24;
            jArr2[7] = j25;
            jArr2[8] = j26;
            jArr2[9] = j27;
            jArr2[10] = j28;
            jArr2[11] = j29;
            jArr2[12] = j30;
            jArr2[13] = j31;
            jArr2[14] = j32;
            jArr2[15] = j33;
        }
    }

    private static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            char c2 = 0;
            long j2 = jArr[0];
            long jXorRotr = jArr[1];
            long j3 = jArr[2];
            long jXorRotr2 = jArr[3];
            int i2 = 17;
            for (int i3 = 1; i2 >= i3; i3 = 1) {
                int i4 = iArr[i2];
                int i5 = iArr2[i2];
                int i6 = i4 + 1;
                long j4 = j2 - jArr3[i6];
                int i7 = i4 + 2;
                int i8 = i5 + 1;
                long j5 = jXorRotr - (jArr3[i7] + jArr4[i8]);
                int i9 = i4 + 3;
                long j6 = j3 - (jArr3[i9] + jArr4[i5 + 2]);
                long j7 = i2;
                long jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr2 - ((jArr3[i4 + 4] + j7) + 1), 32, j4);
                long j8 = j4 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j5, 32, j6);
                long j9 = j6 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr4, 58, j8);
                long j10 = j8 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr3, 22, j9);
                long j11 = j9 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr6, 46, j10);
                long j12 = j10 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr5, 12, j11);
                long j13 = j11 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr8, 25, j12);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr7, 33, j13);
                long j14 = (j12 - jXorRotr9) - jArr3[i4];
                long j15 = jXorRotr9 - (jArr3[i6] + jArr4[i5]);
                long j16 = (j13 - jXorRotr10) - (jArr3[i7] + jArr4[i8]);
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr10 - (jArr3[i9] + j7), 5, j14);
                long j17 = j14 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(j15, 37, j16);
                long j18 = j16 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr12, 23, j17);
                long j19 = j17 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr11, 40, j18);
                long j20 = j18 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr14, 52, j19);
                long j21 = j19 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr13, 57, j20);
                long j22 = j20 - jXorRotr16;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr16, 14, j21);
                j2 = j21 - jXorRotr;
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr15, 16, j22);
                j3 = j22 - jXorRotr2;
                i2 -= 2;
                c2 = 0;
            }
            long j23 = j2 - jArr3[c2];
            long j24 = jXorRotr - (jArr3[1] + jArr4[c2]);
            long j25 = j3 - (jArr3[2] + jArr4[1]);
            long j26 = jXorRotr2 - jArr3[3];
            jArr2[c2] = j23;
            jArr2[1] = j24;
            jArr2[2] = j25;
            jArr2[3] = j26;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j4 = jArr[2];
            long j5 = jArr[3];
            long j6 = j2 + jArr3[0];
            long j7 = j3 + jArr3[1] + jArr4[0];
            long j8 = j4 + jArr3[2] + jArr4[1];
            long j9 = j5 + jArr3[3];
            for (int i2 = 1; i2 < 18; i2 += 2) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                long j10 = j6 + j7;
                long jRotlXor = ThreefishEngine.rotlXor(j7, 14, j10);
                long j11 = j8 + j9;
                long jRotlXor2 = ThreefishEngine.rotlXor(j9, 16, j11);
                long j12 = j10 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j12);
                long j13 = j11 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j13);
                long j14 = j12 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j14);
                long j15 = j13 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j15);
                long j16 = j14 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j16);
                long j17 = j15 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j17);
                long j18 = j16 + jArr3[i3];
                int i5 = i3 + 1;
                long j19 = jRotlXor8 + jArr3[i5] + jArr4[i4];
                int i6 = i3 + 2;
                int i7 = i4 + 1;
                long j20 = j17 + jArr3[i6] + jArr4[i7];
                int i8 = i3 + 3;
                long j21 = i2;
                long j22 = jRotlXor7 + jArr3[i8] + j21;
                long j23 = j18 + j19;
                long jRotlXor9 = ThreefishEngine.rotlXor(j19, 25, j23);
                long j24 = j20 + j22;
                long jRotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                long j25 = j23 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j25);
                long j26 = j24 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j26);
                long j27 = j25 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j27);
                long j28 = j26 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j28);
                long j29 = j27 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j29);
                long j30 = j28 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j30);
                j6 = j29 + jArr3[i5];
                j7 = jRotlXor16 + jArr3[i6] + jArr4[i7];
                j8 = j30 + jArr3[i8] + jArr4[i4 + 2];
                j9 = jRotlXor15 + jArr3[i3 + 4] + j21 + 1;
            }
            jArr2[0] = j6;
            jArr2[1] = j7;
            jArr2[2] = j8;
            jArr2[3] = j9;
        }
    }

    private static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            int i2 = 17;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            char c2 = 0;
            long j2 = jArr[0];
            long jXorRotr = jArr[1];
            long j3 = jArr[2];
            long jXorRotr2 = jArr[3];
            long j4 = jArr[4];
            long jXorRotr3 = jArr[5];
            long j5 = jArr[6];
            long jXorRotr4 = jArr[7];
            for (int i3 = 1; i2 >= i3; i3 = 1) {
                int i4 = iArr[i2];
                int i5 = iArr2[i2];
                int i6 = i4 + 1;
                long j6 = j2 - jArr3[i6];
                int i7 = i4 + 2;
                long j7 = jXorRotr - jArr3[i7];
                int i8 = i4 + 3;
                long j8 = j3 - jArr3[i8];
                int i9 = i4 + 4;
                long j9 = jXorRotr2 - jArr3[i9];
                int i10 = i4 + 5;
                long j10 = j4 - jArr3[i10];
                int i11 = i4 + 6;
                int i12 = i5 + 1;
                long j11 = jXorRotr3 - (jArr3[i11] + jArr4[i12]);
                int i13 = i4 + 7;
                long j12 = j5 - (jArr3[i13] + jArr4[i5 + 2]);
                long j13 = jArr3[i4 + 8];
                long j14 = i2;
                long jXorRotr5 = ThreefishEngine.xorRotr(j7, 8, j12);
                long j15 = j12 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr4 - ((j13 + j14) + 1), 35, j6);
                long j16 = j6 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j11, 56, j8);
                long j17 = j8 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j9, 22, j10);
                long j18 = j10 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr5, 25, j18);
                long j19 = j18 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr8, 29, j15);
                long j20 = j15 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 39, j16);
                long j21 = j16 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr6, 43, j17);
                long j22 = j17 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr9, 13, j22);
                long j23 = j22 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr12, 50, j19);
                long j24 = j19 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr11, 10, j20);
                long j25 = j20 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr10, 17, j21);
                long j26 = j21 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr13, 39, j26);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr16, 30, j23);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j24);
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr14, 24, j25);
                long j27 = (j26 - jXorRotr17) - jArr3[i4];
                long j28 = jXorRotr17 - jArr3[i6];
                long j29 = (j23 - jXorRotr18) - jArr3[i7];
                long j30 = jXorRotr18 - jArr3[i8];
                long j31 = (j24 - jXorRotr19) - jArr3[i9];
                long j32 = jXorRotr19 - (jArr3[i10] + jArr4[i5]);
                long j33 = (j25 - jXorRotr20) - (jArr3[i11] + jArr4[i12]);
                long j34 = jXorRotr20 - (jArr3[i13] + j14);
                long jXorRotr21 = ThreefishEngine.xorRotr(j28, 44, j33);
                long j35 = j33 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j34, 9, j27);
                long j36 = j27 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j32, 54, j29);
                long j37 = j29 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(j30, 56, j31);
                long j38 = j31 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr21, 17, j38);
                long j39 = j38 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr24, 49, j35);
                long j40 = j35 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 36, j36);
                long j41 = j36 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr22, 39, j37);
                long j42 = j37 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr25, 33, j42);
                long j43 = j42 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr28, 27, j39);
                long j44 = j39 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr27, 14, j40);
                long j45 = j40 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr26, 42, j41);
                long j46 = j41 - jXorRotr32;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr29, 46, j46);
                j2 = j46 - jXorRotr;
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr32, 36, j43);
                j3 = j43 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr31, 19, j44);
                j4 = j44 - jXorRotr3;
                jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr30, 37, j45);
                j5 = j45 - jXorRotr4;
                i2 -= 2;
                c2 = 0;
            }
            long j47 = j2 - jArr3[c2];
            long j48 = jXorRotr - jArr3[1];
            long j49 = j3 - jArr3[2];
            long j50 = jXorRotr2 - jArr3[3];
            long j51 = j4 - jArr3[4];
            long j52 = jXorRotr3 - (jArr3[5] + jArr4[c2]);
            long j53 = j5 - (jArr3[6] + jArr4[1]);
            long j54 = jXorRotr4 - jArr3[7];
            jArr2[c2] = j47;
            jArr2[1] = j48;
            jArr2[2] = j49;
            jArr2[3] = j50;
            jArr2[4] = j51;
            jArr2[5] = j52;
            jArr2[6] = j53;
            jArr2[7] = j54;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f27906t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            long j4 = jArr[2];
            long j5 = jArr[3];
            long j6 = jArr[4];
            long j7 = jArr[5];
            long j8 = jArr[6];
            long j9 = jArr[7];
            long j10 = j2 + jArr3[0];
            long j11 = j3 + jArr3[1];
            long j12 = j4 + jArr3[2];
            long j13 = j5 + jArr3[3];
            long j14 = j6 + jArr3[4];
            long j15 = j7 + jArr3[5] + jArr4[0];
            long j16 = j8 + jArr3[6] + jArr4[1];
            long j17 = j9 + jArr3[7];
            for (int i2 = 1; i2 < 18; i2 += 2) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                long j18 = j10 + j11;
                long jRotlXor = ThreefishEngine.rotlXor(j11, 46, j18);
                long j19 = j12 + j13;
                long jRotlXor2 = ThreefishEngine.rotlXor(j13, 36, j19);
                long j20 = j14 + j15;
                long jRotlXor3 = ThreefishEngine.rotlXor(j15, 19, j20);
                long j21 = j16 + j17;
                long jRotlXor4 = ThreefishEngine.rotlXor(j17, 37, j21);
                long j22 = j19 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j22);
                long j23 = j20 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j23);
                long j24 = j21 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j24);
                long j25 = j18 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j25);
                long j26 = j23 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j26);
                long j27 = j24 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j27);
                long j28 = j25 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j28);
                long j29 = j22 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j29);
                long j30 = j27 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j30);
                long j31 = j28 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j31);
                long j32 = j29 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j32);
                long j33 = j26 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j33);
                long j34 = j31 + jArr3[i3];
                int i5 = i3 + 1;
                long j35 = jRotlXor13 + jArr3[i5];
                int i6 = i3 + 2;
                long j36 = j32 + jArr3[i6];
                int i7 = i3 + 3;
                long j37 = jRotlXor16 + jArr3[i7];
                int i8 = i3 + 4;
                long j38 = j33 + jArr3[i8];
                int i9 = i3 + 5;
                long j39 = jRotlXor15 + jArr3[i9] + jArr4[i4];
                int i10 = i3 + 6;
                int i11 = i4 + 1;
                long j40 = j30 + jArr3[i10] + jArr4[i11];
                int i12 = i3 + 7;
                long j41 = i2;
                long j42 = jRotlXor14 + jArr3[i12] + j41;
                long j43 = j34 + j35;
                long jRotlXor17 = ThreefishEngine.rotlXor(j35, 39, j43);
                long j44 = j36 + j37;
                long jRotlXor18 = ThreefishEngine.rotlXor(j37, 30, j44);
                long j45 = j38 + j39;
                long jRotlXor19 = ThreefishEngine.rotlXor(j39, 34, j45);
                long j46 = j40 + j42;
                long jRotlXor20 = ThreefishEngine.rotlXor(j42, 24, j46);
                long j47 = j44 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j47);
                long j48 = j45 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j48);
                long j49 = j46 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j49);
                long j50 = j43 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j50);
                long j51 = j48 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j51);
                long j52 = j49 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j52);
                long j53 = j50 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j53);
                long j54 = j47 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j54);
                long j55 = j52 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j55);
                long j56 = j53 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j56);
                long j57 = j54 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j57);
                long j58 = j51 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j58);
                j10 = j56 + jArr3[i5];
                j11 = jRotlXor29 + jArr3[i6];
                j12 = j57 + jArr3[i7];
                j13 = jRotlXor32 + jArr3[i8];
                j14 = j58 + jArr3[i9];
                j15 = jRotlXor31 + jArr3[i10] + jArr4[i11];
                j16 = j55 + jArr3[i12] + jArr4[i4 + 2];
                j17 = jRotlXor30 + jArr3[i3 + 8] + j41 + 1;
            }
            jArr2[0] = j10;
            jArr2[1] = j11;
            jArr2[2] = j12;
            jArr2[3] = j13;
            jArr2[4] = j14;
            jArr2[5] = j15;
            jArr2[6] = j16;
            jArr2[7] = j17;
        }
    }

    private static abstract class ThreefishCipher {
        protected final long[] kw;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final long[] f27906t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f27906t = jArr2;
        }

        abstract void decryptBlock(long[] jArr, long[] jArr2);

        abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i2 >= iArr2.length) {
                return;
            }
            MOD17[i2] = i2 % 17;
            iArr2[i2] = i2 % 9;
            MOD5[i2] = i2 % 5;
            MOD3[i2] = i2 % 3;
            i2++;
        }
    }

    public ThreefishEngine(int i2) {
        int i3 = i2 / 8;
        this.blocksizeBytes = i3;
        int i4 = i3 / 8;
        this.blocksizeWords = i4;
        this.currentBlock = new long[i4];
        this.kw = new long[(i4 * 2) + 1];
        if (i2 == 256) {
            this.cipher = new Threefish256Cipher(this.kw, this.f27905t);
        } else if (i2 == 512) {
            this.cipher = new Threefish512Cipher(this.kw, this.f27905t);
        } else {
            if (i2 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            this.cipher = new Threefish1024Cipher(this.kw, this.f27905t);
        }
    }

    public static long bytesToWord(byte[] bArr, int i2) {
        if (i2 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        long j2 = (-1) - (((-1) - ((-1) - (((-1) - ((long) bArr[i2])) | ((-1) - 255)))) & ((-1) - ((((long) bArr[i2 + 1]) & 255) << 8)));
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        long j5 = (-1) - (((-1) - (j2 | (((j3 + 255) - (j3 | 255)) << 16))) & ((-1) - (((j4 + 255) - (j4 | 255)) << 24)));
        long j6 = bArr[i2 + 4];
        long j7 = ((j6 + 255) - (j6 | 255)) << 32;
        long j8 = bArr[i2 + 5];
        long j9 = (-1) - (((-1) - (((j5 + j7) - (j5 & j7)) | (((j8 + 255) - (j8 | 255)) << 40))) & ((-1) - ((((long) bArr[i2 + 6]) & 255) << 48)));
        long j10 = ((-1) - (((-1) - ((long) bArr[i2 + 7])) | ((-1) - 255))) << 56;
        return (j10 + j9) - (j10 & j9);
    }

    static long rotlXor(long j2, int i2, long j3) {
        return ((-1) - (((-1) - (j2 >>> (-i2))) & ((-1) - (j2 << i2)))) ^ j3;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j2 = C_240;
        int i2 = 0;
        while (true) {
            int i3 = this.blocksizeWords;
            if (i2 >= i3) {
                long[] jArr2 = this.kw;
                jArr2[i3] = j2;
                System.arraycopy(jArr2, 0, jArr2, i3 + 1, i3);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j3 = jArr[i2];
                jArr3[i2] = j3;
                j2 ^= j3;
                i2++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f27905t;
        long j2 = jArr[0];
        jArr2[0] = j2;
        long j3 = jArr[1];
        jArr2[1] = j3;
        jArr2[2] = j2 ^ j3;
        jArr2[3] = j2;
        jArr2[4] = j3;
    }

    public static void wordToBytes(long j2, byte[] bArr, int i2) {
        if (i2 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >> 8);
        bArr[i2 + 2] = (byte) (j2 >> 16);
        bArr[i2 + 3] = (byte) (j2 >> 24);
        bArr[i2 + 4] = (byte) (j2 >> 32);
        bArr[i2 + 5] = (byte) (j2 >> 40);
        bArr[i2 + 6] = (byte) (j2 >> 48);
        bArr[i2 + 7] = (byte) (j2 >> 56);
    }

    static long xorRotr(long j2, int i2, long j3) {
        long j4 = j2 ^ j3;
        long j5 = j4 >>> i2;
        long j6 = j4 << (-i2);
        return (j6 + j5) - (j6 & j5);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
            }
            int i2 = this.blocksizeWords;
            jArr = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                jArr[i3] = bytesToWord(key, i3 * 8);
            }
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(tweak, 0), bytesToWord(tweak, 8)};
        }
        init(z2, jArr, jArr2);
    }

    public void init(boolean z2, long[] jArr, long[] jArr2) {
        this.forEncryption = z2;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) throws IllegalStateException, DataLengthException {
        int i4 = this.blocksizeBytes;
        if (i3 + i4 > bArr2.length) {
            throw new DataLengthException("Output buffer too short");
        }
        if (i4 + i2 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.blocksizeBytes; i6 += 8) {
            this.currentBlock[i6 >> 3] = bytesToWord(bArr, i2 + i6);
        }
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        while (true) {
            int i7 = this.blocksizeBytes;
            if (i5 >= i7) {
                return i7;
            }
            wordToBytes(this.currentBlock[i5 >> 3], bArr2, i3 + i5);
            i5 += 8;
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.kw;
        int i2 = this.blocksizeWords;
        if (jArr3[i2] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i2) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i2) {
            throw new DataLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
