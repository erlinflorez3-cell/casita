package com.google.crypto.tink.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class BigIntegerEncoding {
    private BigIntegerEncoding() {
    }

    public static BigInteger fromUnsignedBigEndianBytes(byte[] bytes) {
        return new BigInteger(1, bytes);
    }

    public static byte[] toBigEndianBytes(BigInteger n2) {
        if (n2.signum() != -1) {
            return n2.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] toBigEndianBytesOfFixedLength(BigInteger n2, int length) throws GeneralSecurityException {
        if (n2.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = n2.toByteArray();
        if (byteArray.length == length) {
            return byteArray;
        }
        int i2 = length + 1;
        if (byteArray.length > i2) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i2) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 0, bArr, length - byteArray.length, byteArray.length);
        return bArr;
    }
}
