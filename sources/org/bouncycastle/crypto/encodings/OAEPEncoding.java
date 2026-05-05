package org.bouncycastle.crypto.encodings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.defHash = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.defHash, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }

    private void ItoOSP(int i2, byte[] bArr) {
        bArr[0] = (byte) (i2 >>> 24);
        bArr[1] = (byte) (i2 >>> 16);
        bArr[2] = (byte) (i2 >>> 8);
        bArr[3] = (byte) i2;
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i2, int i3, int i4) {
        byte[] bArr2 = new byte[i4];
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.mgf1Hash.reset();
        int i5 = 0;
        while (i5 < i4 / digestSize) {
            ItoOSP(i5, bArr4);
            this.mgf1Hash.update(bArr, i2, i3);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i5 * digestSize, digestSize);
            i5++;
        }
        int i6 = digestSize * i5;
        if (i6 < i4) {
            ItoOSP(i5, bArr4);
            this.mgf1Hash.update(bArr, i2, i3);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i6, i4 - i6);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i2, i3);
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        System.arraycopy(bArrProcessBlock, 0, bArr4, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
        byte[] bArr5 = this.defHash;
        int i4 = outputBlockSize < (bArr5.length * 2) + 1 ? 1 : 0;
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i5 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i5 == bArr2.length) {
                break;
            }
            bArr4[i5] = (byte) (bArr4[i5] ^ bArrMaskGeneratorFunction1[i5]);
            i5++;
        }
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length = this.defHash.length; length != outputBlockSize; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ bArrMaskGeneratorFunction12[length - this.defHash.length]);
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            bArr3 = this.defHash;
            if (i6 == bArr3.length) {
                break;
            }
            if (bArr3[i6] != bArr4[bArr3.length + i6]) {
                i7 = 1;
            }
            i6++;
        }
        int i8 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((-1) - (((-1) - (bArr4[length2] != 0 ? 1 : 0)) | ((-1) - (i8 == outputBlockSize ? 1 : 0))) != 0) {
                i8 = length2;
            }
        }
        int i9 = i8 > outputBlockSize + (-1) ? 1 : 0;
        int i10 = bArr4[i8] != 1 ? 1 : 0;
        int i11 = i8 + 1;
        if ((((-1) - (((-1) - i9) & ((-1) - i10))) | ((-1) - (((-1) - i4) & ((-1) - i7)))) != 0) {
            Arrays.fill(bArr4, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i12 = outputBlockSize - i11;
        byte[] bArr6 = new byte[i12];
        System.arraycopy(bArr4, i11, bArr6, 0, i12);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i2, int i3) throws Throwable {
        if (i3 > getInputBlockSize()) {
            throw new DataLengthException(Jg.Wd("M2T8P8Zsp\u001cz3G$\u0017\u007fKd\u001e", (short) (ZN.Xd() ^ 26693), (short) (ZN.Xd() ^ 18209)));
        }
        int inputBlockSize = getInputBlockSize() + 1 + (this.defHash.length * 2);
        byte[] bArr2 = new byte[inputBlockSize];
        int i4 = inputBlockSize - i3;
        System.arraycopy(bArr, i2, bArr2, i4, i3);
        bArr2[i4 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length = this.defHash.length;
        byte[] bArr4 = new byte[length];
        SecureRandom secureRandom = this.random;
        Object[] objArr = {bArr4};
        Method method = Class.forName(C1561oA.Yd("7/E1~E87JH@LR\b.A@SQE3CQHTS", (short) (C1499aX.Xd() ^ (-20589)))).getMethod(Xg.qd(",$85\u0004<8*9", (short) (C1499aX.Xd() ^ (-26703)), (short) (C1499aX.Xd() ^ (-21448))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, length, inputBlockSize - this.defHash.length);
            for (int length2 = this.defHash.length; length2 != inputBlockSize; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ bArrMaskGeneratorFunction1[length2 - this.defHash.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
            byte[] bArr5 = this.defHash;
            byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
            for (int i5 = 0; i5 != this.defHash.length; i5++) {
                bArr2[i5] = (byte) (bArr2[i5] ^ bArrMaskGeneratorFunction12[i5]);
            }
            return this.engine.processBlock(bArr2, 0, inputBlockSize);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        SecureRandom random;
        if (cipherParameters instanceof ParametersWithRandom) {
            random = ((ParametersWithRandom) cipherParameters).getRandom();
        } else {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(ZO.xd("O/V]Q\fW\u007f&4\\V@NR{H;.N>|xBW\u007f", (short) (OY.Xd() ^ 16285), (short) (OY.Xd() ^ 17140))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.random = random;
        this.engine.init(z2, cipherParameters);
        this.forEncryption = z2;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i2, i3) : decodeBlock(bArr, i2, i3);
    }
}
