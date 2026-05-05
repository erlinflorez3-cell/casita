package org.spongycastle.openpgp.operator.bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.PBESecretKeyEncryptor;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class BcPBESecretKeyEncryptorBuilder {
    private int encAlgorithm;
    private SecureRandom random;
    private int s2kCount;
    private PGPDigestCalculator s2kDigestCalculator;

    public BcPBESecretKeyEncryptorBuilder(int i2) {
        this(i2, new SHA1PGPDigestCalculator());
    }

    public BcPBESecretKeyEncryptorBuilder(int i2, int i3) {
        this(i2, new SHA1PGPDigestCalculator(), i3);
    }

    public BcPBESecretKeyEncryptorBuilder(int i2, PGPDigestCalculator pGPDigestCalculator) {
        this(i2, pGPDigestCalculator, 96);
    }

    public BcPBESecretKeyEncryptorBuilder(int i2, PGPDigestCalculator pGPDigestCalculator, int i3) {
        this.s2kCount = 96;
        this.encAlgorithm = i2;
        this.s2kDigestCalculator = pGPDigestCalculator;
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("s2KCount value outside of range 0 to 255.");
        }
        this.s2kCount = i3;
    }

    public PBESecretKeyEncryptor build(char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.od("xn\u0003l8|mj{wmw{/Sdarn`LZf[eb", (short) (FB.Xd() ^ 4808))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new PBESecretKeyEncryptor(this.encAlgorithm, this.s2kDigestCalculator, this.s2kCount, this.random, cArr) { // from class: org.spongycastle.openpgp.operator.bc.BcPBESecretKeyEncryptorBuilder.1
            private byte[] iv;

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] encryptKeyData(byte[] bArr, byte[] bArr2, int i2, int i3) throws PGPException {
                return encryptKeyData(bArr, null, bArr2, i2, i3);
            }

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] encryptKeyData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) throws Throwable {
                byte[] bArr4 = bArr2;
                try {
                    BlockCipher blockCipherCreateBlockCipher = BcImplProvider.createBlockCipher(this.encAlgorithm);
                    if (bArr4 != null) {
                        this.iv = bArr4;
                    } else {
                        if (this.random == null) {
                            Object[] objArr2 = new Object[0];
                            Constructor<?> constructor2 = Class.forName(Ig.wd("\u0016U<\bD<B\u00017%\u001a\u000b<\u0003\u0004|QA\u0007a\u0013nUS/x", (short) (FB.Xd() ^ 11408))).getConstructor(new Class[0]);
                            try {
                                constructor2.setAccessible(true);
                                this.random = (SecureRandom) constructor2.newInstance(objArr2);
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        }
                        bArr4 = new byte[blockCipherCreateBlockCipher.getBlockSize()];
                        this.iv = bArr4;
                        SecureRandom secureRandom = this.random;
                        short sXd = (short) (OY.Xd() ^ 19842);
                        int[] iArr = new int["~M0w\\Fh\u0007O=6\u001f\u000f9Bn9E\u001b*M1dVg}".length()];
                        QB qb = new QB("~M0w\\Fh\u0007O=6\u001f\u000f9Bn9E\u001b*M1dVg}");
                        int i4 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + i4)) + xuXd.CK(iKK));
                            i4++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i4));
                        Object[] objArr3 = {bArr4};
                        Method method = cls.getMethod(C1561oA.Qd(">4FA\u000eD>.;", (short) (OY.Xd() ^ 14200)), byte[].class);
                        try {
                            method.setAccessible(true);
                            method.invoke(secureRandom, objArr3);
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    }
                    BufferedBlockCipher bufferedBlockCipherCreateSymmetricKeyWrapper = BcUtil.createSymmetricKeyWrapper(true, blockCipherCreateBlockCipher, bArr, bArr4);
                    byte[] bArr5 = new byte[i3];
                    bufferedBlockCipherCreateSymmetricKeyWrapper.doFinal(bArr5, bufferedBlockCipherCreateSymmetricKeyWrapper.processBytes(bArr3, i2, i3, bArr5, 0));
                    return bArr5;
                } catch (InvalidCipherTextException e5) {
                    throw new PGPException(C1593ug.zd("\u001e \u001f/7/4*11c+'04..\u0005k", (short) (C1580rY.Xd() ^ (-32030)), (short) (C1580rY.Xd() ^ (-32534))) + e5.getMessage(), e5);
                }
            }

            @Override // org.spongycastle.openpgp.operator.PBESecretKeyEncryptor
            public byte[] getCipherIV() {
                return this.iv;
            }
        };
    }

    public BcPBESecretKeyEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
