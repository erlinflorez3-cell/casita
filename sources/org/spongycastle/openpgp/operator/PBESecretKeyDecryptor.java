package org.spongycastle.openpgp.operator;

import org.spongycastle.bcpg.S2K;
import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PBESecretKeyDecryptor {
    private PGPDigestCalculatorProvider calculatorProvider;
    private char[] passPhrase;

    protected PBESecretKeyDecryptor(char[] cArr, PGPDigestCalculatorProvider pGPDigestCalculatorProvider) {
        this.passPhrase = cArr;
        this.calculatorProvider = pGPDigestCalculatorProvider;
    }

    public PGPDigestCalculator getChecksumCalculator(int i2) throws PGPException {
        return this.calculatorProvider.get(i2);
    }

    public byte[] makeKeyFromPassPhrase(int i2, S2K s2k) throws PGPException {
        return PGPUtil.makeKeyFromPassPhrase(this.calculatorProvider, i2, s2k, this.passPhrase);
    }

    public abstract byte[] recoverKeyData(int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) throws PGPException;
}
