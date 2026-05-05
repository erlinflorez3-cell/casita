package org.spongycastle.pqc.crypto.ntru;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUEncryptionKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUEncryptionKeyGenerationParameters params;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Polynomial polynomialGenerateRandomTernary;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        DenseTernaryPolynomial denseTernaryPolynomialGenerateRandom;
        int i2 = this.params.N;
        int i3 = this.params.f28147q;
        int i4 = this.params.df;
        int i5 = this.params.df1;
        int i6 = this.params.df2;
        int i7 = this.params.df3;
        int i8 = this.params.dg;
        boolean z2 = this.params.fastFp;
        boolean z3 = this.params.sparse;
        IntegerPolynomial integerPolynomial2 = null;
        while (true) {
            if (z2) {
                polynomialGenerateRandomTernary = this.params.polyType == 0 ? Util.generateRandomTernary(i2, i4, i4, z3, this.params.getRandom()) : ProductFormPolynomial.generateRandom(i2, i5, i6, i7, i7, this.params.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial.mult(3);
                int[] iArr = integerPolynomial.coeffs;
                iArr[0] = iArr[0] + 1;
            } else {
                polynomialGenerateRandomTernary = this.params.polyType == 0 ? Util.generateRandomTernary(i2, i4, i4 - 1, z3, this.params.getRandom()) : ProductFormPolynomial.generateRandom(i2, i5, i6, i7, i7 - 1, this.params.getRandom());
                integerPolynomial = polynomialGenerateRandomTernary.toIntegerPolynomial();
                integerPolynomial2 = integerPolynomial.invertF3();
                if (integerPolynomial2 == null) {
                    continue;
                }
            }
            integerPolynomialInvertFq = integerPolynomial.invertFq(i3);
            if (integerPolynomialInvertFq != null) {
                break;
            }
        }
        if (z2) {
            integerPolynomial2 = new IntegerPolynomial(i2);
            integerPolynomial2.coeffs[0] = 1;
        }
        do {
            denseTernaryPolynomialGenerateRandom = DenseTernaryPolynomial.generateRandom(i2, i8, i8 - 1, this.params.getRandom());
        } while (denseTernaryPolynomialGenerateRandom.invertFq(i3) == null);
        IntegerPolynomial integerPolynomialMult = denseTernaryPolynomialGenerateRandom.mult(integerPolynomialInvertFq, i3);
        integerPolynomialMult.mult3(i3);
        integerPolynomialMult.ensurePositive(i3);
        denseTernaryPolynomialGenerateRandom.clear();
        integerPolynomialInvertFq.clear();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NTRUEncryptionPublicKeyParameters(integerPolynomialMult, this.params.getEncryptionParameters()), (AsymmetricKeyParameter) new NTRUEncryptionPrivateKeyParameters(integerPolynomialMult, polynomialGenerateRandomTernary, integerPolynomial2, this.params.getEncryptionParameters()));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUEncryptionKeyGenerationParameters) keyGenerationParameters;
    }
}
