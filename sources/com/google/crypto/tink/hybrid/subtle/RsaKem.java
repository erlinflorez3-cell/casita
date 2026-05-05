package com.google.crypto.tink.hybrid.subtle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
class RsaKem {
    static final byte[] EMPTY_AAD = new byte[0];
    static final int MIN_RSA_KEY_LENGTH_BITS = 2048;

    private RsaKem() {
    }

    static int bigIntSizeInBytes(BigInteger mod) {
        return (mod.bitLength() + 7) / 8;
    }

    static byte[] bigIntToByteArray(BigInteger bigInt, int size) {
        byte[] byteArray = bigInt.toByteArray();
        if (byteArray.length == size) {
            return byteArray;
        }
        byte[] bArr = new byte[size];
        if (byteArray.length == size + 1) {
            if (byteArray[0] != 0) {
                throw new IllegalArgumentException("Value is one-byte longer than the expected size, but its first byte is not 0");
            }
            System.arraycopy(byteArray, 1, bArr, 0, size);
        } else {
            if (byteArray.length >= size) {
                throw new IllegalArgumentException(String.format("Value has invalid length, must be of length at most (%d + 1), but got %d", Integer.valueOf(size), Integer.valueOf(byteArray.length)));
            }
            System.arraycopy(byteArray, 0, bArr, size - byteArray.length, byteArray.length);
        }
        return bArr;
    }

    static KeyPair generateRsaKeyPair(int keySize) throws Throwable {
        String strZd = C1593ug.zd("LN=", (short) (OY.Xd() ^ 7931), (short) (OY.Xd() ^ 12034));
        try {
            Class<?> cls = Class.forName(C1561oA.od("\t~\u0013|H\r}z\f\b}\b\f?[t\b]mt|Pmukwewqs", (short) (FB.Xd() ^ 20929)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.Kd("=5K7\u0005D:HB\n0RQIOI", (short) (C1580rY.Xd() ^ (-10077))));
            Object[] objArr = {strZd};
            short sXd = (short) (OY.Xd() ^ 17018);
            short sXd2 = (short) (OY.Xd() ^ 301);
            int[] iArr = new int["?\u0007);\f2\u0007R+)n".length()];
            QB qb = new QB("?\u0007);\f2\u0007R+)n");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                Class<?> cls2 = Class.forName(C1561oA.Xd("\u0010\b\u001e\nW\u001e\u0011\u0010#!\u0019%+`~\u001a/\u0007\u0019\",\u0002!+#1!515", (short) (C1607wl.Xd() ^ 20676)));
                Class<?>[] clsArr2 = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(keySize)};
                Method method = cls2.getMethod(Wg.vd(")/+7%\u001e*(2\u001e", (short) (FB.Xd() ^ 31136)), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyPairGenerator, objArr2);
                    Object[] objArr3 = new Object[0];
                    Method method2 = Class.forName(Qg.kd("6,@*u:+(95+59l\t\"5\u000b\u001b\"*}\u001b#\u0019%\u0013%\u001f!", (short) (C1633zX.Xd() ^ (-22633)), (short) (C1633zX.Xd() ^ (-22025)))).getMethod(hg.Vd("FCKAM;M=\";N$4;C", (short) (C1607wl.Xd() ^ 3930), (short) (C1607wl.Xd() ^ 21311)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        return (KeyPair) method2.invoke(keyPairGenerator, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException(C1561oA.ud("6V\u0006XYSRPRS}CKMy++\u0018u6@:AC9C6:y", (short) (OY.Xd() ^ 31067)), e5);
        }
    }

    static byte[] generateSecret(BigInteger max) throws Throwable {
        int iBigIntSizeInBytes = bigIntSizeInBytes(max);
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.yd("5+?)t9*'84*48k\u0010!>OK=)7C8B?", (short) (C1499aX.Xd() ^ (-3069)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            SecureRandom secureRandom = (SecureRandom) constructor.newInstance(objArr);
            while (true) {
                BigInteger bigInteger = new BigInteger(max.bitLength(), secureRandom);
                if (bigInteger.signum() > 0 && bigInteger.compareTo(max) < 0) {
                    return bigIntToByteArray(bigInteger, iBigIntSizeInBytes);
                }
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void validateRsaModulus(BigInteger mod) throws GeneralSecurityException {
        if (mod.bitLength() < 2048) {
            throw new GeneralSecurityException(String.format("RSA key must be of at least size %d bits, but got %d", 2048, Integer.valueOf(mod.bitLength())));
        }
    }
}
