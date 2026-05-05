package com.google.crypto.tink.subtle;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
final class Field25519 {
    static final int FIELD_LEN = 32;
    static final int LIMB_CNT = 10;
    private static final long TWO_TO_25 = 33554432;
    private static final long TWO_TO_26 = 67108864;
    private static final int[] EXPAND_START = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] EXPAND_SHIFT = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] MASK = {67108863, 33554431};
    private static final int[] SHIFT = {26, 25};

    private Field25519() {
    }

    static byte[] contract(long[] inputLimbs) {
        int i2;
        long[] jArrCopyOf = Arrays.copyOf(inputLimbs, 10);
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArrCopyOf[i4];
                long j3 = j2 >> 31;
                long j4 = (j3 + j2) - (j3 | j2);
                int i5 = SHIFT[(-1) - (((-1) - i4) | ((-1) - 1))];
                int i6 = -((int) (j4 >> i5));
                jArrCopyOf[i4] = j2 + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j5 = jArrCopyOf[9];
            int i7 = -((int) (((j5 >> 31) & j5) >> 25));
            jArrCopyOf[9] = j5 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i7 * 19));
            i3++;
        }
        long j6 = jArrCopyOf[0];
        int i8 = -((int) (((-1) - (((-1) - (j6 >> 31)) | ((-1) - j6))) >> 26));
        jArrCopyOf[0] = j6 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        for (int i9 = 0; i9 < 2; i9++) {
            int i10 = 0;
            while (i10 < 9) {
                long j7 = jArrCopyOf[i10];
                int i11 = (i10 + 1) - (1 | i10);
                int i12 = (int) (j7 >> SHIFT[i11]);
                jArrCopyOf[i10] = (-1) - (((-1) - j7) | ((-1) - ((long) MASK[i11])));
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) i12);
            }
        }
        long j8 = jArrCopyOf[9];
        jArrCopyOf[9] = j8 & 33554431;
        long j9 = jArrCopyOf[0] + ((long) (((int) (j8 >> 25)) * 19));
        jArrCopyOf[0] = j9;
        int iGte = gte((int) j9, 67108845);
        for (int i13 = 1; i13 < 10; i13++) {
            iGte = (-1) - (((-1) - iGte) | ((-1) - eq((int) jArrCopyOf[i13], MASK[(i13 + 1) - (1 | i13)])));
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) ((-1) - (((-1) - 67108845) | ((-1) - iGte))));
        long j10 = (33554431 + iGte) - (33554431 | iGte);
        jArrCopyOf[1] = jArrCopyOf[1] - j10;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) ((67108863 + iGte) - (67108863 | iGte)));
            int i14 = i2 + 1;
            jArrCopyOf[i14] = jArrCopyOf[i14] - j10;
        }
        for (int i15 = 0; i15 < 10; i15++) {
            jArrCopyOf[i15] = jArrCopyOf[i15] << EXPAND_SHIFT[i15];
        }
        byte[] bArr = new byte[32];
        for (int i16 = 0; i16 < 10; i16++) {
            int i17 = EXPAND_START[i16];
            long j11 = bArr[i17];
            long j12 = jArrCopyOf[i16];
            bArr[i17] = (byte) (j11 | (j12 & 255));
            bArr[i17 + 1] = (byte) ((-1) - (((-1) - ((long) bArr[r8])) & ((-1) - ((j12 >> 8) & 255))));
            int i18 = i17 + 2;
            long j13 = bArr[i18];
            long j14 = (j12 >> 16) & 255;
            bArr[i18] = (byte) ((j13 + j14) - (j13 & j14));
            bArr[i17 + 3] = (byte) ((-1) - (((-1) - ((long) bArr[r8])) & ((-1) - ((j12 >> 24) & 255))));
        }
        return bArr;
    }

    private static int eq(int a2, int b2) {
        int i2 = ~(a2 ^ b2);
        int i3 = i2 << 16;
        int i4 = (i2 + i3) - (i2 | i3);
        int i5 = i4 & (i4 << 8);
        int i6 = (-1) - (((-1) - i5) | ((-1) - (i5 << 4)));
        int i7 = i6 & (i6 << 2);
        int i8 = i7 << 1;
        return ((i7 + i8) - (i7 | i8)) >> 31;
    }

    static long[] expand(byte[] input) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = EXPAND_START[i2];
            long j2 = input[i3] & 255;
            byte b2 = input[i3 + 1];
            long j3 = ((long) ((b2 + 255) - (b2 | 255))) << 8;
            long j4 = (j2 + j3) - (j2 & j3);
            byte b3 = input[i3 + 2];
            long j5 = ((j4 | (((long) ((b3 + 255) - (b3 | 255))) << 16)) | (((long) (input[i3 + 3] & 255)) << 24)) >> EXPAND_SHIFT[i2];
            long j6 = MASK[(i2 + 1) - (1 | i2)];
            jArr[i2] = (j5 + j6) - (j5 | j6);
        }
        return jArr;
    }

    private static int gte(int a2, int b2) {
        return ~((a2 - b2) >> 31);
    }

    static void inverse(long[] out, long[] z2) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        square(jArr, z2);
        square(jArr10, jArr);
        square(jArr9, jArr10);
        mult(jArr2, jArr9, z2);
        mult(jArr3, jArr2, jArr);
        square(jArr9, jArr3);
        mult(jArr4, jArr9, jArr2);
        square(jArr9, jArr4);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        mult(jArr5, jArr9, jArr4);
        square(jArr9, jArr5);
        square(jArr10, jArr9);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr6, jArr10, jArr5);
        square(jArr9, jArr6);
        square(jArr10, jArr9);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr9, jArr10, jArr6);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            square(jArr10, jArr9);
            square(jArr9, jArr10);
        }
        mult(jArr7, jArr9, jArr5);
        square(jArr9, jArr7);
        square(jArr10, jArr9);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr8, jArr10, jArr7);
        square(jArr10, jArr8);
        square(jArr9, jArr10);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            square(jArr10, jArr9);
            square(jArr9, jArr10);
        }
        mult(jArr10, jArr9, jArr8);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            square(jArr9, jArr10);
            square(jArr10, jArr9);
        }
        mult(jArr9, jArr10, jArr7);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        square(jArr9, jArr10);
        square(jArr10, jArr9);
        mult(out, jArr10, jArr3);
    }

    static void mult(long[] output, long[] in, long[] in2) {
        long[] jArr = new long[19];
        product(jArr, in, in2);
        reduce(jArr, output);
    }

    static void product(long[] out, long[] in2, long[] in) {
        out[0] = in2[0] * in[0];
        long j2 = in2[0];
        long j3 = in[1] * j2;
        long j4 = in2[1];
        long j5 = in[0];
        out[1] = j3 + (j4 * j5);
        long j6 = in2[1];
        long j7 = in[1];
        out[2] = (j6 * 2 * j7) + (in[2] * j2) + (in2[2] * j5);
        long j8 = in[2];
        long j9 = in2[2];
        out[3] = (j6 * j8) + (j9 * j7) + (in[3] * j2) + (in2[3] * j5);
        long j10 = in[3];
        long j11 = in2[3];
        out[4] = (j9 * j8) + (((j6 * j10) + (j11 * j7)) * 2) + (in[4] * j2) + (in2[4] * j5);
        long j12 = in[4];
        long j13 = in2[4];
        out[5] = (j9 * j10) + (j11 * j8) + (j6 * j12) + (j13 * j7) + (in[5] * j2) + (in2[5] * j5);
        long j14 = in[5];
        long j15 = in2[5];
        out[6] = (((j11 * j10) + (j6 * j14) + (j15 * j7)) * 2) + (j9 * j12) + (j13 * j8) + (in[6] * j2) + (in2[6] * j5);
        long j16 = in[6];
        long j17 = in2[6];
        out[7] = (j11 * j12) + (j13 * j10) + (j9 * j14) + (j15 * j8) + (j6 * j16) + (j17 * j7) + (in[7] * j2) + (in2[7] * j5);
        long j18 = in[7];
        long j19 = in2[7];
        out[8] = (j13 * j12) + (((j11 * j14) + (j15 * j10) + (j6 * j18) + (j19 * j7)) * 2) + (j9 * j16) + (j17 * j8) + (in[8] * j2) + (in2[8] * j5);
        long j20 = in[8];
        long j21 = in2[8];
        out[9] = (j13 * j14) + (j15 * j12) + (j11 * j16) + (j17 * j10) + (j9 * j18) + (j19 * j8) + (j6 * j20) + (j21 * j7) + (j2 * in[9]) + (in2[9] * j5);
        long j22 = in[9];
        long j23 = in2[9];
        out[10] = (((j15 * j14) + (j11 * j18) + (j19 * j10) + (j6 * j22) + (j7 * j23)) * 2) + (j13 * j16) + (j17 * j12) + (j9 * j20) + (j21 * j8);
        out[11] = (j15 * j16) + (j17 * j14) + (j13 * j18) + (j19 * j12) + (j11 * j20) + (j21 * j10) + (j9 * j22) + (j8 * j23);
        out[12] = (j17 * j16) + (((j15 * j18) + (j19 * j14) + (j11 * j22) + (j10 * j23)) * 2) + (j13 * j20) + (j21 * j12);
        out[13] = (j17 * j18) + (j19 * j16) + (j15 * j20) + (j21 * j14) + (j13 * j22) + (j12 * j23);
        out[14] = (((j19 * j18) + (j15 * j22) + (j14 * j23)) * 2) + (j17 * j20) + (j21 * j16);
        out[15] = (j19 * j20) + (j21 * j18) + (j17 * j22) + (j16 * j23);
        out[16] = (j21 * j20) + (((j19 * j22) + (j18 * j23)) * 2);
        out[17] = (j21 * j22) + (j20 * j23);
        out[18] = j23 * 2 * j22;
    }

    static void reduce(long[] input, long[] output) {
        if (input.length != 19) {
            long[] jArr = new long[19];
            System.arraycopy(input, 0, jArr, 0, input.length);
            input = jArr;
        }
        reduceSizeByModularReduction(input);
        reduceCoefficients(input);
        System.arraycopy(input, 0, output, 0, 10);
    }

    static void reduceCoefficients(long[] output) {
        output[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = output[i2];
            long j3 = j2 / TWO_TO_26;
            output[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = output[i3] + j3;
            output[i3] = j4;
            long j5 = j4 / TWO_TO_25;
            output[i3] = j4 - (j5 << 25);
            i2 += 2;
            output[i2] = output[i2] + j5;
        }
        long j6 = output[0];
        long j7 = output[10];
        long j8 = j6 + (j7 << 4);
        output[0] = j8;
        long j9 = j8 + (j7 << 1);
        output[0] = j9;
        long j10 = j9 + j7;
        output[0] = j10;
        output[10] = 0;
        long j11 = j10 / TWO_TO_26;
        output[0] = j10 - (j11 << 26);
        output[1] = output[1] + j11;
    }

    static void reduceSizeByModularReduction(long[] output) {
        long j2 = output[8];
        long j3 = output[18];
        long j4 = j2 + (j3 << 4);
        output[8] = j4;
        long j5 = j4 + (j3 << 1);
        output[8] = j5;
        output[8] = j5 + j3;
        long j6 = output[7];
        long j7 = output[17];
        long j8 = j6 + (j7 << 4);
        output[7] = j8;
        long j9 = j8 + (j7 << 1);
        output[7] = j9;
        output[7] = j9 + j7;
        long j10 = output[6];
        long j11 = output[16];
        long j12 = j10 + (j11 << 4);
        output[6] = j12;
        long j13 = j12 + (j11 << 1);
        output[6] = j13;
        output[6] = j13 + j11;
        long j14 = output[5];
        long j15 = output[15];
        long j16 = j14 + (j15 << 4);
        output[5] = j16;
        long j17 = j16 + (j15 << 1);
        output[5] = j17;
        output[5] = j17 + j15;
        long j18 = output[4];
        long j19 = output[14];
        long j20 = j18 + (j19 << 4);
        output[4] = j20;
        long j21 = j20 + (j19 << 1);
        output[4] = j21;
        output[4] = j21 + j19;
        long j22 = output[3];
        long j23 = output[13];
        long j24 = j22 + (j23 << 4);
        output[3] = j24;
        long j25 = j24 + (j23 << 1);
        output[3] = j25;
        output[3] = j25 + j23;
        long j26 = output[2];
        long j27 = output[12];
        long j28 = j26 + (j27 << 4);
        output[2] = j28;
        long j29 = j28 + (j27 << 1);
        output[2] = j29;
        output[2] = j29 + j27;
        long j30 = output[1];
        long j31 = output[11];
        long j32 = j30 + (j31 << 4);
        output[1] = j32;
        long j33 = j32 + (j31 << 1);
        output[1] = j33;
        output[1] = j33 + j31;
        long j34 = output[0];
        long j35 = output[10];
        long j36 = j34 + (j35 << 4);
        output[0] = j36;
        long j37 = j36 + (j35 << 1);
        output[0] = j37;
        output[0] = j37 + j35;
    }

    static void scalarProduct(long[] output, long[] in, long scalar) {
        for (int i2 = 0; i2 < 10; i2++) {
            output[i2] = in[i2] * scalar;
        }
    }

    static void square(long[] output, long[] in) {
        long[] jArr = new long[19];
        squareInner(jArr, in);
        reduce(jArr, output);
    }

    private static void squareInner(long[] out, long[] in) {
        long j2 = in[0];
        out[0] = j2 * j2;
        long j3 = in[0];
        out[1] = j3 * 2 * in[1];
        long j4 = in[1];
        out[2] = ((j4 * j4) + (in[2] * j3)) * 2;
        long j5 = in[2];
        out[3] = ((j4 * j5) + (in[3] * j3)) * 2;
        long j6 = in[3];
        out[4] = (j5 * j5) + (j4 * 4 * j6) + (j3 * 2 * in[4]);
        long j7 = in[4];
        out[5] = ((j5 * j6) + (j4 * j7) + (in[5] * j3)) * 2;
        long j8 = (j6 * j6) + (j5 * j7) + (in[6] * j3);
        long j9 = in[5];
        out[6] = (j8 + (j4 * 2 * j9)) * 2;
        long j10 = in[6];
        out[7] = ((j6 * j7) + (j5 * j9) + (j4 * j10) + (in[7] * j3)) * 2;
        long j11 = (j5 * j10) + (in[8] * j3);
        long j12 = in[7];
        out[8] = (j7 * j7) + ((j11 + (((j4 * j12) + (j6 * j9)) * 2)) * 2);
        long j13 = in[8];
        out[9] = ((j7 * j9) + (j6 * j10) + (j5 * j12) + (j4 * j13) + (j3 * in[9])) * 2;
        long j14 = in[9];
        out[10] = ((j9 * j9) + (j7 * j10) + (j5 * j13) + (((j6 * j12) + (j4 * j14)) * 2)) * 2;
        out[11] = ((j9 * j10) + (j7 * j12) + (j6 * j13) + (j5 * j14)) * 2;
        out[12] = (j10 * j10) + (((j7 * j13) + (((j9 * j12) + (j6 * j14)) * 2)) * 2);
        out[13] = ((j10 * j12) + (j9 * j13) + (j7 * j14)) * 2;
        out[14] = ((j12 * j12) + (j10 * j13) + (j9 * 2 * j14)) * 2;
        out[15] = ((j12 * j13) + (j10 * j14)) * 2;
        out[16] = (j13 * j13) + (j12 * 4 * j14);
        out[17] = j13 * 2 * j14;
        out[18] = 2 * j14 * j14;
    }

    static void sub(long[] output, long[] in) {
        sub(output, in, output);
    }

    static void sub(long[] output, long[] in1, long[] in2) {
        for (int i2 = 0; i2 < 10; i2++) {
            output[i2] = in1[i2] - in2[i2];
        }
    }

    static void sum(long[] output, long[] in) {
        sum(output, output, in);
    }

    static void sum(long[] output, long[] in1, long[] in2) {
        for (int i2 = 0; i2 < 10; i2++) {
            output[i2] = in1[i2] + in2[i2];
        }
    }
}
