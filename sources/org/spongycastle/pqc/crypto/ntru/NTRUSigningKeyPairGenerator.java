package org.spongycastle.pqc.crypto.ntru;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.ntru.NTRUSigningPrivateKeyParameters;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.BigDecimalPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.BigIntPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Resultant;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    private class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() throws Exception {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    public class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
        public IntegerPolynomial F;
        public IntegerPolynomial G;

        FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.F = integerPolynomial2;
            this.G = integerPolynomial3;
        }

        boolean isNormOk() {
            double d2 = this.params.keyNormBoundSq;
            int i2 = this.params.f28155q;
            return ((double) this.F.centeredNormSq(i2)) < d2 && ((double) this.G.centeredNormSq(i2)) < d2;
        }
    }

    private FGBasis generateBasis() throws Throwable {
        Polynomial polynomialGenerateRandom;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        int i2;
        int i3;
        int i4;
        Polynomial polynomialGenerateRandom2;
        IntegerPolynomial integerPolynomial2;
        Resultant resultant;
        BigIntEuclidean bigIntEuclideanCalculate;
        BigIntPolynomial bigIntPolynomialRound;
        IntegerPolynomial integerPolynomialMult;
        int i5 = this.params.N;
        int i6 = this.params.f28155q;
        int i7 = this.params.f28153d;
        int i8 = this.params.f28154d1;
        int i9 = this.params.d2;
        int i10 = this.params.d3;
        int i11 = this.params.basisType;
        int i12 = (i5 * 2) + 1;
        boolean z2 = this.params.primeCheck;
        while (true) {
            if (this.params.polyType == 0) {
                int i13 = i7 + 1;
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(Jg.Wd("ccmU\u0017_B5D@0<6m\f\u0017\u0006\u0017\rx^lzimn", (short) (C1607wl.Xd() ^ 28326), (short) (C1607wl.Xd() ^ 8261))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    polynomialGenerateRandom = DenseTernaryPolynomial.generateRandom(i5, i13, i7, (SecureRandom) constructor.newInstance(objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else {
                int i14 = i10 + 1;
                Object[] objArr2 = new Object[0];
                Constructor<?> constructor2 = Class.forName(ZO.xd("\u001d\u000f0\u0012q(f#\u0010A\u0005g77\u000eYV8xn\u001f9\u000e\r\u0014[", (short) (C1580rY.Xd() ^ (-17551)), (short) (C1580rY.Xd() ^ (-698)))).getConstructor(new Class[0]);
                try {
                    constructor2.setAccessible(true);
                    i8 = i8;
                    polynomialGenerateRandom = ProductFormPolynomial.generateRandom(i5, i8, i9, i14, i10, (SecureRandom) constructor2.newInstance(objArr2));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            integerPolynomial = polynomialGenerateRandom.toIntegerPolynomial();
            if (!z2 || !integerPolynomial.resultant(i12).res.equals(BigInteger.ZERO)) {
                integerPolynomialInvertFq = integerPolynomial.invertFq(i6);
                if (integerPolynomialInvertFq != null) {
                    break;
                }
            }
        }
        Resultant resultant2 = integerPolynomial.resultant();
        while (true) {
            if (this.params.polyType == 0) {
                int i15 = i7 + 1;
                Object[] objArr3 = new Object[0];
                Constructor<?> constructor3 = Class.forName(C1626yg.Ud("B)u\u0007t\u0014C>a6I=X,]&\u0016O-p\n\u000fp[6/", (short) (C1633zX.Xd() ^ (-5016)), (short) (C1633zX.Xd() ^ (-7794)))).getConstructor(new Class[0]);
                try {
                    constructor3.setAccessible(true);
                    polynomialGenerateRandom2 = DenseTernaryPolynomial.generateRandom(i5, i15, i7, (SecureRandom) constructor3.newInstance(objArr3));
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } else {
                int i16 = i10 + 1;
                Object[] objArr4 = new Object[0];
                Constructor<?> constructor4 = Class.forName(Ig.wd("\u001d^C\u00113C[gR\u000e\u0001sMy\r\u0004D:\u000ej@t2*^r", (short) (ZN.Xd() ^ 15836))).getConstructor(new Class[0]);
                try {
                    constructor4.setAccessible(true);
                    i2 = i8;
                    i3 = i9;
                    i4 = i10;
                    polynomialGenerateRandom2 = ProductFormPolynomial.generateRandom(i5, i8, i9, i16, i10, (SecureRandom) constructor4.newInstance(objArr4));
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            integerPolynomial2 = polynomialGenerateRandom2.toIntegerPolynomial();
            if (z2 && integerPolynomial2.resultant(i12).res.equals(BigInteger.ZERO)) {
                i9 = i3;
                i8 = i2;
                i10 = i4;
            } else {
                if (integerPolynomial2.invertFq(i6) != null) {
                    resultant = integerPolynomial2.resultant();
                    bigIntEuclideanCalculate = BigIntEuclidean.calculate(resultant2.res, resultant.res);
                    if (bigIntEuclideanCalculate.gcd.equals(BigInteger.ONE)) {
                        break;
                    }
                }
                i9 = i3;
                i8 = i2;
                i10 = i4;
            }
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial.mult(bigIntEuclideanCalculate.f28202x.multiply(BigInteger.valueOf(i6)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.f28203y.multiply(BigInteger.valueOf(-i6)));
        int i17 = 0;
        if (this.params.keyGenAlg == 0) {
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            iArr[0] = integerPolynomial.coeffs[0];
            iArr2[0] = integerPolynomial2.coeffs[0];
            for (int i18 = 1; i18 < i5; i18++) {
                int i19 = i5 - i18;
                iArr[i18] = integerPolynomial.coeffs[i19];
                iArr2[i18] = integerPolynomial2.coeffs[i19];
            }
            IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(iArr2);
            IntegerPolynomial integerPolynomialMult2 = polynomialGenerateRandom.mult(integerPolynomial3);
            integerPolynomialMult2.add(polynomialGenerateRandom2.mult(integerPolynomial4));
            Resultant resultant3 = integerPolynomialMult2.resultant();
            BigIntPolynomial bigIntPolynomialMult = integerPolynomial3.mult(bigIntPolynomial2);
            bigIntPolynomialMult.add(integerPolynomial4.mult(bigIntPolynomial));
            bigIntPolynomialRound = bigIntPolynomialMult.mult(resultant3.rho);
            bigIntPolynomialRound.div(resultant3.res);
        } else {
            for (int i20 = 1; i20 < i5; i20 *= 10) {
                i17++;
            }
            BigDecimalPolynomial bigDecimalPolynomialDiv = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i17);
            BigDecimalPolynomial bigDecimalPolynomialDiv2 = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i17);
            BigDecimalPolynomial bigDecimalPolynomialMult = bigDecimalPolynomialDiv.mult(bigIntPolynomial2);
            bigDecimalPolynomialMult.add(bigDecimalPolynomialDiv2.mult(bigIntPolynomial));
            bigDecimalPolynomialMult.halve();
            bigIntPolynomialRound = bigDecimalPolynomialMult.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomialGenerateRandom.mult(bigIntPolynomialRound));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomialGenerateRandom2.mult(bigIntPolynomialRound));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(bigIntPolynomial4);
        minimizeFG(integerPolynomial, integerPolynomial2, integerPolynomial5, integerPolynomial6, i5);
        if (i11 == 0) {
            integerPolynomialMult = polynomialGenerateRandom2.mult(integerPolynomialInvertFq, i6);
            polynomialGenerateRandom2 = integerPolynomial5;
        } else {
            integerPolynomialMult = integerPolynomial5.mult(integerPolynomialInvertFq, i6);
        }
        integerPolynomialMult.modPositive(i6);
        return new FGBasis(polynomialGenerateRandom, polynomialGenerateRandom2, integerPolynomialMult, integerPolynomial5, integerPolynomial6, this.params);
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += i2 * 2 * ((integerPolynomial.coeffs[i4] * integerPolynomial.coeffs[i4]) + (integerPolynomial2.coeffs[i4] * integerPolynomial2.coeffs[i4]));
        }
        int i5 = i3 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2 && i7 < i2) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                i8 += i2 * 4 * ((integerPolynomial3.coeffs[i9] * integerPolynomial.coeffs[i9]) + (integerPolynomial4.coeffs[i9] * integerPolynomial2.coeffs[i9]));
            }
            int iSumCoeffs = i8 - ((integerPolynomial3.sumCoeffs() + integerPolynomial4.sumCoeffs()) * 4);
            if (iSumCoeffs > i5) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else if (iSumCoeffs < (-i5)) {
                integerPolynomial3.add(integerPolynomial5);
                integerPolynomial4.add(integerPolynomial6);
            } else {
                i7++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i6++;
            i7 = 0;
            i7++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() throws Throwable {
        FGBasis fGBasisGenerateBasis;
        do {
            fGBasisGenerateBasis = generateBasis();
        } while (!fGBasisGenerateBasis.isNormOk());
        return fGBasisGenerateBasis;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i2 = this.params.B;
        while (true) {
            nTRUSigningPublicKeyParameters = null;
            byte b2 = 0;
            if (i2 < 0) {
                break;
            }
            arrayList.add(executorServiceNewCachedThreadPool.submit(new BasisGenerationTask()));
            i2--;
        }
        executorServiceNewCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = this.params.B; i3 >= 0; i3--) {
            Future future = (Future) arrayList.get(i3);
            try {
                arrayList2.add(future.get());
                if (i3 == this.params.B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).f28160h, this.params.getSigningParameters());
                }
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() throws Throwable {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i2 = this.params.B; i2 >= 0; i2--) {
            NTRUSigningPrivateKeyParameters.Basis basisGenerateBoundedBasis = generateBoundedBasis();
            arrayList.add(basisGenerateBoundedBasis);
            if (i2 == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basisGenerateBoundedBasis.f28160h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }
}
