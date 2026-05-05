package org.spongycastle.crypto.encodings;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, new SHA1Digest(), null);
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
        if (bArrProcessBlock.length < this.engine.getOutputBlockSize()) {
            int outputBlockSize = this.engine.getOutputBlockSize();
            byte[] bArr4 = new byte[outputBlockSize];
            System.arraycopy(bArrProcessBlock, 0, bArr4, outputBlockSize - bArrProcessBlock.length, bArrProcessBlock.length);
            bArrProcessBlock = bArr4;
        }
        int length = bArrProcessBlock.length;
        byte[] bArr5 = this.defHash;
        if (length < (bArr5.length * 2) + 1) {
            throw new InvalidCipherTextException("data too short");
        }
        byte[] bArrMaskGeneratorFunction1 = maskGeneratorFunction1(bArrProcessBlock, bArr5.length, bArrProcessBlock.length - bArr5.length, bArr5.length);
        int i4 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i4 == bArr2.length) {
                break;
            }
            bArrProcessBlock[i4] = (byte) (bArrProcessBlock[i4] ^ bArrMaskGeneratorFunction1[i4]);
            i4++;
        }
        byte[] bArrMaskGeneratorFunction12 = maskGeneratorFunction1(bArrProcessBlock, 0, bArr2.length, bArrProcessBlock.length - bArr2.length);
        for (int length2 = this.defHash.length; length2 != bArrProcessBlock.length; length2++) {
            bArrProcessBlock[length2] = (byte) (bArrProcessBlock[length2] ^ bArrMaskGeneratorFunction12[length2 - this.defHash.length]);
        }
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            bArr3 = this.defHash;
            if (i5 == bArr3.length) {
                break;
            }
            if (bArr3[i5] != bArrProcessBlock[bArr3.length + i5]) {
                z2 = true;
            }
            i5++;
        }
        if (z2) {
            throw new InvalidCipherTextException("data hash wrong");
        }
        int length3 = bArr3.length * 2;
        while (length3 != bArrProcessBlock.length && bArrProcessBlock[length3] == 0) {
            length3++;
        }
        if (length3 >= bArrProcessBlock.length - 1 || bArrProcessBlock[length3] != 1) {
            throw new InvalidCipherTextException("data start wrong " + length3);
        }
        int i6 = length3 + 1;
        int length4 = bArrProcessBlock.length - i6;
        byte[] bArr6 = new byte[length4];
        System.arraycopy(bArrProcessBlock, i6, bArr6, 0, length4);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i2, int i3) throws Throwable {
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
        short sXd = (short) (OY.Xd() ^ 9759);
        int[] iArr = new int["@8N:\bNA@SQIU[\u00117JI\\ZN<LZQ]\\".length()];
        QB qb = new QB("@8N:\bNA@SQIU[\u00117JI\\ZN<LZQ]\\");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(xuXd.CK(iKK) - (sXd + i5));
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i5));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr = {bArr4};
        short sXd2 = (short) (FB.Xd() ^ 23884);
        int[] iArr2 = new int["\n\u0002\u0016\u0013a\u001a\u0016\b\u0017".length()];
        QB qb2 = new QB("\n\u0002\u0016\u0013a\u001a\u0016\b\u0017");
        int i6 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i6] = xuXd2.fK((sXd2 ^ i6) + xuXd2.CK(iKK2));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i6), clsArr);
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
            for (int i7 = 0; i7 != this.defHash.length; i7++) {
                bArr2[i7] = (byte) (bArr2[i7] ^ bArrMaskGeneratorFunction12[i7]);
            }
            return this.engine.processBlock(bArr2, 0, inputBlockSize);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        if (cipherParameters instanceof ParametersWithRandom) {
            this.random = ((ParametersWithRandom) cipherParameters).getRandom();
        } else {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Qg.kd("\u001d\u0013'\u0011\\!\u0012\u000f \u001c\u0012\u001c Sw\t\u0006\u0017\u0013\u0005p~\u000b\u007f\n\u0007", (short) (OY.Xd() ^ 28468), (short) (OY.Xd() ^ 32026))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.engine.init(z2, cipherParameters);
        this.forEncryption = z2;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        return this.forEncryption ? encodeBlock(bArr, i2, i3) : decodeBlock(bArr, i2, i3);
    }
}
