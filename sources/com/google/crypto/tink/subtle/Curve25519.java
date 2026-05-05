package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import java.security.InvalidKeyException;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes7.dex */
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{MessagePack.Code.NEGFIXINT_PREFIX, -21, 122, 124, 59, 65, -72, -82, Ascii.SYN, 86, -29, -6, -15, -97, MessagePack.Code.BIN8, 106, MessagePack.Code.STR16, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, Ascii.SYN, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, MessagePack.Code.INT8, -79, 85, -100, -125, -17, 91, 4, 68, 92, MessagePack.Code.BIN8, 88, Ascii.FS, -114, -122, MessagePack.Code.FIXEXT16, 34, 78, MessagePack.Code.ARRAY32, MessagePack.Code.INT8, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    private Curve25519() {
    }

    static void copyConditional(long[] a2, long[] b2, int icopy) {
        int i2 = -icopy;
        for (int i3 = 0; i3 < 10; i3++) {
            long j2 = a2[i3];
            a2[i3] = ((int) j2) ^ ((((int) j2) ^ ((int) b2[i3])) & i2);
        }
    }

    static void curveMult(long[] resultx, byte[] n2, byte[] qBytes) throws InvalidKeyException {
        long[] jArrExpand = Field25519.expand(validatePubKeyAndClearMsb(qBytes));
        long[] jArr = new long[19];
        long[] jArr2 = new long[19];
        int i2 = 0;
        jArr2[0] = 1;
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        jArr6[0] = 1;
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        int i3 = 10;
        System.arraycopy(jArrExpand, 0, jArr, 0, 10);
        int i4 = 0;
        while (i4 < 32) {
            int i5 = (-1) - (((-1) - n2[31 - i4]) | ((-1) - 255));
            while (i2 < 8) {
                int i6 = (-1) - (((-1) - (i5 >> (7 - i2))) | ((-1) - 1));
                swapConditional(jArr3, jArr, i6);
                swapConditional(jArr4, jArr2, i6);
                long[] jArr9 = jArr7;
                long[] jArr10 = jArr5;
                long[] jArr11 = jArr4;
                long[] jArr12 = jArr3;
                long[] jArr13 = jArr2;
                long[] jArr14 = jArr;
                monty(jArr7, jArr8, jArr5, jArr6, jArr3, jArr4, jArr, jArr2, jArrExpand);
                swapConditional(jArr9, jArr10, i6);
                swapConditional(jArr8, jArr6, i6);
                i2++;
                jArr2 = jArr6;
                jArr4 = jArr8;
                jArr3 = jArr9;
                jArr = jArr10;
                jArr8 = jArr11;
                jArr7 = jArr12;
                jArr6 = jArr13;
                jArr5 = jArr14;
            }
            i4++;
            i2 = 0;
            i3 = 10;
        }
        long[] jArr15 = new long[i3];
        Field25519.inverse(jArr15, jArr4);
        Field25519.mult(resultx, jArr3, jArr15);
        if (!isCollinear(jArrExpand, resultx, jArr, jArr2)) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + Hex.encode(qBytes));
        }
    }

    private static boolean isCollinear(long[] x1, long[] x2, long[] x3, long[] z3) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[11];
        long[] jArr4 = new long[11];
        long[] jArr5 = new long[11];
        Field25519.mult(jArr, x1, x2);
        Field25519.sum(jArr2, x1, x2);
        long[] jArr6 = new long[10];
        jArr6[0] = 486662;
        Field25519.sum(jArr4, jArr2, jArr6);
        Field25519.mult(jArr4, jArr4, z3);
        Field25519.sum(jArr4, x3);
        Field25519.mult(jArr4, jArr4, jArr);
        Field25519.mult(jArr4, jArr4, x3);
        Field25519.scalarProduct(jArr3, jArr4, 4L);
        Field25519.reduceCoefficients(jArr3);
        Field25519.mult(jArr4, jArr, z3);
        Field25519.sub(jArr4, jArr4, z3);
        Field25519.mult(jArr5, jArr2, x3);
        Field25519.sum(jArr4, jArr4, jArr5);
        Field25519.square(jArr4, jArr4);
        return Bytes.equal(Field25519.contract(jArr3), Field25519.contract(jArr4));
    }

    private static void monty(long[] x2, long[] z2, long[] x3, long[] z3, long[] x4, long[] z4, long[] xprime, long[] zprime, long[] qmqp) {
        long[] jArrCopyOf = Arrays.copyOf(x4, 10);
        long[] jArr = new long[19];
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        Field25519.sum(x4, z4);
        Field25519.sub(z4, jArrCopyOf);
        long[] jArrCopyOf2 = Arrays.copyOf(xprime, 10);
        Field25519.sum(xprime, zprime);
        Field25519.sub(zprime, jArrCopyOf2);
        Field25519.product(jArr4, xprime, z4);
        Field25519.product(jArr5, x4, zprime);
        Field25519.reduceSizeByModularReduction(jArr4);
        Field25519.reduceCoefficients(jArr4);
        Field25519.reduceSizeByModularReduction(jArr5);
        Field25519.reduceCoefficients(jArr5);
        System.arraycopy(jArr4, 0, jArrCopyOf2, 0, 10);
        Field25519.sum(jArr4, jArr5);
        Field25519.sub(jArr5, jArrCopyOf2);
        Field25519.square(jArr7, jArr4);
        Field25519.square(jArr6, jArr5);
        Field25519.product(jArr5, jArr6, qmqp);
        Field25519.reduceSizeByModularReduction(jArr5);
        Field25519.reduceCoefficients(jArr5);
        System.arraycopy(jArr7, 0, x3, 0, 10);
        System.arraycopy(jArr5, 0, z3, 0, 10);
        Field25519.square(jArr2, x4);
        Field25519.square(jArr3, z4);
        Field25519.product(x2, jArr2, jArr3);
        Field25519.reduceSizeByModularReduction(x2);
        Field25519.reduceCoefficients(x2);
        Field25519.sub(jArr3, jArr2);
        Arrays.fill(jArr, 10, 18, 0L);
        Field25519.scalarProduct(jArr, jArr3, 121665L);
        Field25519.reduceCoefficients(jArr);
        Field25519.sum(jArr, jArr2);
        Field25519.product(z2, jArr3, jArr);
        Field25519.reduceSizeByModularReduction(z2);
        Field25519.reduceCoefficients(z2);
    }

    static void swapConditional(long[] a2, long[] b2, int iswap) {
        int i2 = -iswap;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (((int) a2[i3]) ^ ((int) b2[i3])) & i2;
            a2[i3] = ((int) r2) ^ i4;
            b2[i3] = ((int) b2[i3]) ^ i4;
        }
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] pubKey) throws InvalidKeyException {
        if (pubKey.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf = Arrays.copyOf(pubKey, pubKey.length);
        bArrCopyOf[31] = (byte) (bArrCopyOf[31] & 127);
        int i2 = 0;
        while (true) {
            byte[][] bArr = BANNED_PUBLIC_KEYS;
            if (i2 >= bArr.length) {
                return bArrCopyOf;
            }
            if (Bytes.equal(bArr[i2], bArrCopyOf)) {
                throw new InvalidKeyException("Banned public key: " + Hex.encode(bArr[i2]));
            }
            i2++;
        }
    }
}
