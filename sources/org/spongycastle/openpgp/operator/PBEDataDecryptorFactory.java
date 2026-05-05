package org.spongycastle.openpgp.operator;

import org.spongycastle.bcpg.S2K;
import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PBEDataDecryptorFactory implements PGPDataDecryptorFactory {
    private PGPDigestCalculatorProvider calculatorProvider;
    private char[] passPhrase;

    protected PBEDataDecryptorFactory(char[] cArr, PGPDigestCalculatorProvider pGPDigestCalculatorProvider) {
        this.passPhrase = cArr;
        this.calculatorProvider = pGPDigestCalculatorProvider;
    }

    public byte[] makeKeyFromPassPhrase(int i2, S2K s2k) throws PGPException {
        return PGPUtil.makeKeyFromPassPhrase(this.calculatorProvider, i2, s2k, this.passPhrase);
    }

    public abstract byte[] recoverSessionData(int i2, byte[] bArr, byte[] bArr2) throws PGPException;
}
