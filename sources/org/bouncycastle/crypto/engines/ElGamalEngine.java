package org.bouncycastle.crypto.engines;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ElGamalKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.BigIntegers;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.OY;

/* JADX INFO: loaded from: classes6.dex */
public class ElGamalEngine implements AsymmetricBlockCipher {
    private int bitSize;
    private boolean forEncryption;
    private ElGamalKeyParameters key;
    private SecureRandom random;
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.forEncryption ? (this.bitSize - 1) / 8 : ((this.bitSize + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.forEncryption ? ((this.bitSize + 7) / 8) * 2 : (this.bitSize - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        SecureRandom random;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (ElGamalKeyParameters) parametersWithRandom.getParameters();
            random = parametersWithRandom.getRandom();
        } else {
            this.key = (ElGamalKeyParameters) cipherParameters;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1593ug.zd(">6L8\u0006L?>QOGSY\u000f5HGZXL:JXO[Z", (short) (FB.Xd() ^ 14672), (short) (FB.Xd() ^ 11534))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.random = random;
        this.forEncryption = z2;
        this.bitSize = this.key.getParameters().getP().bitLength();
        if (z2) {
            if (!(this.key instanceof ElGamalPublicKeyParameters)) {
                throw new IllegalArgumentException(C1561oA.od("\n0\n#.!+\u000e2\u001e'#\u001c\u0003\u001c/\u0005\u0015%\u0013\u001e\u0015#\u0013\u001f\u001fJ\u000b\u001b\rF\u0018\n\u0015\u0018\u000b\u0013\u0005\u0003=\u0003\u000b\r9}\u0006y\b\u000e\u0004\u0007z\u007f}<", (short) (C1499aX.Xd() ^ (-21735))));
            }
        } else if (!(this.key instanceof ElGamalPrivateKeyParameters)) {
            throw new IllegalArgumentException(C1561oA.Kd(",T0KXMY>aYgSgY@[pHZl\\ibrdrt\"dvj&ymz\u007ft~rr/v\u0001\u00053xzy\n\u0012\n\u000f\u0005\f\fL", (short) (OY.Xd() ^ 32429)));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) {
        if (this.key == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i3 > (this.forEncryption ? (this.bitSize + 6) / 8 : getInputBlockSize())) {
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        BigInteger p2 = this.key.getParameters().getP();
        if (this.key instanceof ElGamalPrivateKeyParameters) {
            int i4 = i3 / 2;
            byte[] bArr2 = new byte[i4];
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, i2, bArr2, 0, i4);
            System.arraycopy(bArr, i2 + i4, bArr3, 0, i4);
            return BigIntegers.asUnsignedByteArray(new BigInteger(1, bArr2).modPow(p2.subtract(ONE).subtract(((ElGamalPrivateKeyParameters) this.key).getX()), p2).multiply(new BigInteger(1, bArr3)).mod(p2));
        }
        if (i2 != 0 || i3 != bArr.length) {
            byte[] bArr4 = new byte[i3];
            System.arraycopy(bArr, i2, bArr4, 0, i3);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(p2) >= 0) {
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        ElGamalPublicKeyParameters elGamalPublicKeyParameters = (ElGamalPublicKeyParameters) this.key;
        int iBitLength = p2.bitLength();
        BigInteger bigInteger2 = new BigInteger(iBitLength, this.random);
        while (true) {
            if (!bigInteger2.equals(ZERO) && bigInteger2.compareTo(p2.subtract(TWO)) <= 0) {
                break;
            }
            bigInteger2 = new BigInteger(iBitLength, this.random);
        }
        BigInteger bigIntegerModPow = this.key.getParameters().getG().modPow(bigInteger2, p2);
        BigInteger bigIntegerMod = bigInteger.multiply(elGamalPublicKeyParameters.getY().modPow(bigInteger2, p2)).mod(p2);
        byte[] byteArray = bigIntegerModPow.toByteArray();
        byte[] byteArray2 = bigIntegerMod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i5 = outputBlockSize / 2;
        if (byteArray.length > i5) {
            System.arraycopy(byteArray, 1, bArr5, i5 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i5 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i5) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
        } else {
            System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        }
        return bArr5;
    }
}
