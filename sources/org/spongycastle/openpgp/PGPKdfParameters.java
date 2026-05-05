package org.spongycastle.openpgp;

/* JADX INFO: loaded from: classes2.dex */
public class PGPKdfParameters implements PGPAlgorithmParameters {
    private final int hashAlgorithm;
    private final int symmetricWrapAlgorithm;

    public PGPKdfParameters(int i2, int i3) {
        this.hashAlgorithm = i2;
        this.symmetricWrapAlgorithm = i3;
    }

    public int getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public int getSymmetricWrapAlgorithm() {
        return this.symmetricWrapAlgorithm;
    }
}
