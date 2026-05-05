package org.spongycastle.openpgp.operator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.openpgp.PGPException;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PBESecretKeyEncryptor {
    protected int encAlgorithm;
    protected char[] passPhrase;
    protected SecureRandom random;
    protected S2K s2k;
    protected int s2kCount;
    protected PGPDigestCalculator s2kDigestCalculator;

    protected PBESecretKeyEncryptor(int i2, PGPDigestCalculator pGPDigestCalculator, int i3, SecureRandom secureRandom, char[] cArr) {
        this.encAlgorithm = i2;
        this.passPhrase = cArr;
        this.random = secureRandom;
        this.s2kDigestCalculator = pGPDigestCalculator;
        if (i3 < 0 || i3 > 255) {
            throw new IllegalArgumentException("s2kCount value outside of range 0 to 255.");
        }
        this.s2kCount = i3;
    }

    protected PBESecretKeyEncryptor(int i2, PGPDigestCalculator pGPDigestCalculator, SecureRandom secureRandom, char[] cArr) {
        this(i2, pGPDigestCalculator, 96, secureRandom, cArr);
    }

    public byte[] encryptKeyData(byte[] bArr, int i2, int i3) throws PGPException {
        if (this.s2k == null) {
            byte[] bArr2 = new byte[8];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr2};
            Method method = Class.forName(ZO.xd("mbB^ <cmS7GE.~<1#8Z\u0012o\u001bM>xY", (short) (FB.Xd() ^ 21688), (short) (FB.Xd() ^ 7391))).getMethod(C1626yg.Ud("\u007fI*\tZ[\u0019sT", (short) (C1607wl.Xd() ^ 28131), (short) (C1607wl.Xd() ^ 2705)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                this.s2k = new S2K(this.s2kDigestCalculator.getAlgorithm(), bArr2, this.s2kCount);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return encryptKeyData(getKey(), bArr, i2, i3);
    }

    public abstract byte[] encryptKeyData(byte[] bArr, byte[] bArr2, int i2, int i3) throws PGPException;

    public byte[] encryptKeyData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3) throws PGPException {
        throw new PGPException("encryption of version 3 keys not supported.");
    }

    public int getAlgorithm() {
        return this.encAlgorithm;
    }

    public abstract byte[] getCipherIV();

    public int getHashAlgorithm() {
        PGPDigestCalculator pGPDigestCalculator = this.s2kDigestCalculator;
        if (pGPDigestCalculator != null) {
            return pGPDigestCalculator.getAlgorithm();
        }
        return -1;
    }

    public byte[] getKey() throws PGPException {
        return PGPUtil.makeKeyFromPassPhrase(this.s2kDigestCalculator, this.encAlgorithm, this.s2k, this.passPhrase);
    }

    public S2K getS2K() {
        return this.s2k;
    }
}
