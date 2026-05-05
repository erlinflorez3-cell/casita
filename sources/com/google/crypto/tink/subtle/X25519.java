package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes7.dex */
public final class X25519 {
    private X25519() {
    }

    public static byte[] computeSharedSecret(byte[] privateKey, byte[] peersPublicValue) throws InvalidKeyException {
        if (privateKey.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(privateKey, 32);
        bArrCopyOf[0] = (byte) ((-1) - (((-1) - bArrCopyOf[0]) | ((-1) - 248)));
        byte b2 = (byte) ((-1) - (((-1) - bArrCopyOf[31]) | ((-1) - 127)));
        bArrCopyOf[31] = b2;
        bArrCopyOf[31] = (byte) ((-1) - (((-1) - b2) & ((-1) - 64)));
        Curve25519.curveMult(jArr, bArrCopyOf, peersPublicValue);
        return Field25519.contract(jArr);
    }

    public static byte[] generatePrivateKey() throws Throwable {
        byte[] bArrRandBytes = Random.randBytes(32);
        bArrRandBytes[0] = (byte) ((-1) - (((-1) - bArrRandBytes[0]) & ((-1) - 7)));
        byte b2 = (byte) (bArrRandBytes[31] & Utf8.REPLACEMENT_BYTE);
        bArrRandBytes[31] = b2;
        bArrRandBytes[31] = (byte) ((b2 + 128) - (b2 & 128));
        return bArrRandBytes;
    }

    public static byte[] publicFromPrivate(byte[] privateKey) throws InvalidKeyException {
        if (privateKey.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr = new byte[32];
        bArr[0] = 9;
        return computeSharedSecret(privateKey, bArr);
    }
}
