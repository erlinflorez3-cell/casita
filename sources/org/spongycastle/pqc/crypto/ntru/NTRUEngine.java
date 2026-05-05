package org.spongycastle.pqc.crypto.ntru;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial;
import org.spongycastle.util.Arrays;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NTRUEncryptionParameters params;
    private NTRUEncryptionPrivateKeyParameters privKey;
    private NTRUEncryptionPublicKeyParameters pubKey;
    private SecureRandom random;

    private IntegerPolynomial MGF(byte[] bArr, int i2, int i3, boolean z2) {
        Digest digest = this.params.hashAlg;
        int digestSize = digest.getDigestSize();
        byte[] bArrCalcHash = new byte[i3 * digestSize];
        if (z2) {
            bArr = calcHash(digest, bArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i4);
            System.arraycopy(calcHash(digest), 0, bArrCalcHash, i4 * digestSize, digestSize);
            i4++;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i2);
        while (true) {
            int i5 = 0;
            for (int i6 = 0; i6 != bArrCalcHash.length; i6++) {
                int i7 = (-1) - (((-1) - bArrCalcHash[i6]) | ((-1) - 255));
                if (i7 < 243) {
                    for (int i8 = 0; i8 < 4; i8++) {
                        int i9 = i7 % 3;
                        integerPolynomial.coeffs[i5] = i9 - 1;
                        i5++;
                        if (i5 == i2) {
                            return integerPolynomial;
                        }
                        i7 = (i7 - i9) / 3;
                    }
                    integerPolynomial.coeffs[i5] = i7 - 1;
                    i5++;
                    if (i5 == i2) {
                        return integerPolynomial;
                    }
                }
            }
            if (i5 >= i2) {
                return integerPolynomial;
            }
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i4);
            bArrCalcHash = calcHash(digest);
            i4++;
        }
    }

    private byte[] buildSData(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr.length + i2 + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    private byte[] calcHash(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] calcHash(Digest digest, byte[] bArr) {
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] copyOf(byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        if (i2 >= bArr.length) {
            i2 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    private byte[] decrypt(byte[] bArr, NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters) throws InvalidCipherTextException {
        Polynomial polynomial = nTRUEncryptionPrivateKeyParameters.f28151t;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPrivateKeyParameters.fp;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPrivateKeyParameters.f28150h;
        int i2 = this.params.N;
        int i3 = this.params.f28149q;
        int i4 = this.params.db;
        int i5 = this.params.maxMsgLenBytes;
        int i6 = this.params.dm0;
        int i7 = this.params.pkLen;
        int i8 = this.params.minCallsMask;
        boolean z2 = this.params.hashSeed;
        byte[] bArr2 = this.params.oid;
        if (i5 > 255) {
            throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported");
        }
        int i9 = i4 / 8;
        IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(bArr, i2, i3);
        IntegerPolynomial integerPolynomialDecrypt = decrypt(integerPolynomialFromBinary, polynomial, integerPolynomial);
        if (integerPolynomialDecrypt.count(-1) < i6) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal -1");
        }
        if (integerPolynomialDecrypt.count(0) < i6) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 0");
        }
        if (integerPolynomialDecrypt.count(1) < i6) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 1");
        }
        IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) integerPolynomialFromBinary.clone();
        integerPolynomial3.sub(integerPolynomialDecrypt);
        integerPolynomial3.modPositive(i3);
        IntegerPolynomial integerPolynomial4 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial4.modPositive(4);
        integerPolynomialDecrypt.sub(MGF(integerPolynomial4.toBinary(4), i2, i8, z2));
        integerPolynomialDecrypt.mod3();
        byte[] binary3Sves = integerPolynomialDecrypt.toBinary3Sves();
        byte[] bArr3 = new byte[i9];
        System.arraycopy(binary3Sves, 0, bArr3, 0, i9);
        int i10 = binary3Sves[i9];
        int i11 = (255 + i10) - (255 | i10);
        if (i11 > i5) {
            throw new InvalidCipherTextException("Message too long: " + i11 + ">" + i5);
        }
        byte[] bArr4 = new byte[i11];
        int i12 = i9 + 1;
        System.arraycopy(binary3Sves, i12, bArr4, 0, i11);
        int i13 = i12 + i11;
        int length = binary3Sves.length - i13;
        byte[] bArr5 = new byte[length];
        System.arraycopy(binary3Sves, i13, bArr5, 0, length);
        if (!Arrays.constantTimeAreEqual(bArr5, new byte[length])) {
            throw new InvalidCipherTextException("The message is not followed by zeroes");
        }
        IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr2, bArr4, i11, bArr3, copyOf(integerPolynomial2.toBinary(i3), i7 / 8)), bArr4).mult(integerPolynomial2);
        integerPolynomialMult.modPositive(i3);
        if (integerPolynomialMult.equals(integerPolynomial3)) {
            return bArr4;
        }
        throw new InvalidCipherTextException("Invalid message encoding");
    }

    private byte[] encrypt(byte[] bArr, NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters) throws Throwable {
        IntegerPolynomial integerPolynomial = nTRUEncryptionPublicKeyParameters.f28152h;
        int i2 = this.params.N;
        int i3 = this.params.f28149q;
        int i4 = this.params.maxMsgLenBytes;
        int i5 = this.params.db;
        int i6 = this.params.bufferLenBits;
        int i7 = this.params.dm0;
        int i8 = this.params.pkLen;
        int i9 = this.params.minCallsMask;
        boolean z2 = this.params.hashSeed;
        byte[] bArr2 = this.params.oid;
        int length = bArr.length;
        if (i4 > 255) {
            throw new IllegalArgumentException(Wg.vd("BA=EqG5?C2Cn,232+7g;*\"2bn\\!1\u001fX**j\u0015klbacebRT", (short) (C1633zX.Xd() ^ (-10135))));
        }
        if (length > i4) {
            StringBuilder sbAppend = new StringBuilder(Wg.Zd("\u000e\u007fCyE\u0014Shf*\u0010\u0006\u0011Y\u001d_\r<", (short) (C1633zX.Xd() ^ (-16578)), (short) (C1633zX.Xd() ^ (-27218)))).append(length);
            short sXd = (short) (Od.Xd() ^ (-21177));
            int[] iArr = new int["C".length()];
            QB qb = new QB("C");
            int i10 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i10] = xuXd.fK(xuXd.CK(iKK) - (sXd + i10));
                i10++;
            }
            throw new DataLengthException(sbAppend.append(new String(iArr, 0, i10)).append(i4).toString());
        }
        while (true) {
            int i11 = i5 / 8;
            byte[] bArr3 = new byte[i11];
            SecureRandom secureRandom = this.random;
            Object[] objArr = {bArr3};
            Method method = Class.forName(C1561oA.od("?5I3~C41B>4>Bu\u001a+(95'\u0013!-\",)", (short) (OY.Xd() ^ 23494))).getMethod(C1561oA.Kd("]Uif5mi[j", (short) (C1607wl.Xd() ^ 2267)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                int i12 = (i4 + 1) - length;
                byte[] bArr4 = new byte[i6 / 8];
                System.arraycopy(bArr3, 0, bArr4, 0, i11);
                bArr4[i11] = (byte) length;
                int i13 = i11 + 1;
                System.arraycopy(bArr, 0, bArr4, i13, bArr.length);
                System.arraycopy(new byte[i12], 0, bArr4, i13 + bArr.length, i12);
                IntegerPolynomial integerPolynomialFromBinary3Sves = IntegerPolynomial.fromBinary3Sves(bArr4, i2);
                byte[] bArr5 = bArr2;
                IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr2, bArr, length, bArr3, copyOf(integerPolynomial.toBinary(i3), i8 / 8)), bArr4).mult(integerPolynomial, i3);
                IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomialMult.clone();
                integerPolynomial2.modPositive(4);
                integerPolynomialFromBinary3Sves.add(MGF(integerPolynomial2.toBinary(4), i2, i9, z2));
                integerPolynomialFromBinary3Sves.mod3();
                if (integerPolynomialFromBinary3Sves.count(-1) >= i7 && integerPolynomialFromBinary3Sves.count(0) >= i7 && integerPolynomialFromBinary3Sves.count(1) >= i7) {
                    integerPolynomialMult.add(integerPolynomialFromBinary3Sves, i3);
                    integerPolynomialMult.ensurePositive(i3);
                    return integerPolynomialMult.toBinary(i3);
                }
                bArr2 = bArr5;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private int[] generateBlindingCoeffs(IndexGenerator indexGenerator, int i2) {
        int[] iArr = new int[this.params.N];
        for (int i3 = -1; i3 <= 1; i3 += 2) {
            int i4 = 0;
            while (i4 < i2) {
                int iNextIndex = indexGenerator.nextIndex();
                if (iArr[iNextIndex] == 0) {
                    iArr[iNextIndex] = i3;
                    i4++;
                }
            }
        }
        return iArr;
    }

    private Polynomial generateBlindingPoly(byte[] bArr, byte[] bArr2) {
        IndexGenerator indexGenerator = new IndexGenerator(bArr, this.params);
        if (this.params.polyType == 1) {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr1)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3)));
        }
        int i2 = this.params.dr;
        boolean z2 = this.params.sparse;
        int[] iArrGenerateBlindingCoeffs = generateBlindingCoeffs(indexGenerator, i2);
        return z2 ? new SparseTernaryPolynomial(iArrGenerateBlindingCoeffs) : new DenseTernaryPolynomial(iArrGenerateBlindingCoeffs);
    }

    private int log2(int i2) {
        if (i2 == 2048) {
            return 11;
        }
        throw new IllegalStateException("log2 not fully implemented");
    }

    private void putInt(Digest digest, int i2) {
        digest.update((byte) (i2 >> 24));
        digest.update((byte) (i2 >> 16));
        digest.update((byte) (i2 >> 8));
        digest.update((byte) i2);
    }

    protected IntegerPolynomial decrypt(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult;
        if (this.params.fastFp) {
            integerPolynomialMult = polynomial.mult(integerPolynomial, this.params.f28149q);
            integerPolynomialMult.mult(3);
            integerPolynomialMult.add(integerPolynomial);
        } else {
            integerPolynomialMult = polynomial.mult(integerPolynomial, this.params.f28149q);
        }
        integerPolynomialMult.center0(this.params.f28149q);
        integerPolynomialMult.mod3();
        if (!this.params.fastFp) {
            integerPolynomialMult = new DenseTernaryPolynomial(integerPolynomialMult).mult(integerPolynomial2, 3);
        }
        integerPolynomialMult.center0(3);
        return integerPolynomialMult;
    }

    protected IntegerPolynomial encrypt(IntegerPolynomial integerPolynomial, TernaryPolynomial ternaryPolynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult = ternaryPolynomial.mult(integerPolynomial2, this.params.f28149q);
        integerPolynomialMult.add(integerPolynomial, this.params.f28149q);
        integerPolynomialMult.ensurePositive(this.params.f28149q);
        return integerPolynomialMult;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.params.maxMsgLenBytes;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return ((this.params.N * log2(this.params.f28149q)) + 7) / 8;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forEncryption = z2;
        if (!z2) {
            NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) cipherParameters;
            this.privKey = nTRUEncryptionPrivateKeyParameters;
            this.params = nTRUEncryptionPrivateKeyParameters.getParameters();
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.pubKey = (NTRUEncryptionPublicKeyParameters) parametersWithRandom.getParameters();
        } else {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Qg.kd("NDXB\u000eRC@QMCMQ\u0005):7HD6\"0<1;8", (short) (ZN.Xd() ^ 15214), (short) (ZN.Xd() ^ 7993))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
                this.pubKey = (NTRUEncryptionPublicKeyParameters) cipherParameters;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.params = this.pubKey.getParameters();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return this.forEncryption ? encrypt(bArr2, this.pubKey) : decrypt(bArr2, this.privKey);
    }
}
