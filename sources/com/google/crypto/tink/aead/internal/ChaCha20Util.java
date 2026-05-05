package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes7.dex */
final class ChaCha20Util {
    static final int BLOCK_SIZE_IN_BYTES = 64;
    static final int BLOCK_SIZE_IN_INTS = 16;
    static final int KEY_SIZE_IN_BYTES = 32;
    static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private ChaCha20Util() {
    }

    static void quarterRound(int[] x2, int a2, int b2, int c2, int d2) {
        int i2 = x2[a2] + x2[b2];
        x2[a2] = i2;
        int iRotateLeft = rotateLeft(i2 ^ x2[d2], 16);
        x2[d2] = iRotateLeft;
        int i3 = x2[c2] + iRotateLeft;
        x2[c2] = i3;
        int iRotateLeft2 = rotateLeft(x2[b2] ^ i3, 12);
        x2[b2] = iRotateLeft2;
        int i4 = x2[a2] + iRotateLeft2;
        x2[a2] = i4;
        int iRotateLeft3 = rotateLeft(x2[d2] ^ i4, 8);
        x2[d2] = iRotateLeft3;
        int i5 = x2[c2] + iRotateLeft3;
        x2[c2] = i5;
        x2[b2] = rotateLeft(x2[b2] ^ i5, 7);
    }

    private static int rotateLeft(int x2, int y2) {
        int i2 = x2 << y2;
        int i3 = x2 >>> (-y2);
        return (i3 + i2) - (i3 & i2);
    }

    static void setSigmaAndKey(int[] state, final int[] key) {
        int[] iArr = SIGMA;
        System.arraycopy(iArr, 0, state, 0, iArr.length);
        System.arraycopy(key, 0, state, iArr.length, 8);
    }

    static void shuffleState(final int[] state) {
        for (int i2 = 0; i2 < 10; i2++) {
            quarterRound(state, 0, 4, 8, 12);
            quarterRound(state, 1, 5, 9, 13);
            quarterRound(state, 2, 6, 10, 14);
            quarterRound(state, 3, 7, 11, 15);
            quarterRound(state, 0, 5, 10, 15);
            quarterRound(state, 1, 6, 11, 12);
            quarterRound(state, 2, 7, 8, 13);
            quarterRound(state, 3, 4, 9, 14);
        }
    }

    static int[] toIntArray(final byte[] input) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(input).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
