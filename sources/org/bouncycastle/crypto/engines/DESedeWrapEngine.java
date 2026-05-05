package org.bouncycastle.crypto.engines;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public class DESedeWrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, MessagePack.Code.ARRAY32, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private KeyParameter param;
    private ParametersWithIV paramPlusIV;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    private static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = i2 + 1;
            bArr2[i2] = bArr[bArr.length - i3];
            i2 = i3;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        SecureRandom random;
        this.forWrapping = z2;
        this.engine = new CBCBlockCipher(new DESedeEngine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            CipherParameters parameters = parametersWithRandom.getParameters();
            random = parametersWithRandom.getRandom();
            cipherParameters = parameters;
        } else {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(ZO.xd("#P,B\b\u001aY&u\u0003_\u0001:oj17kwb\u0004}\u000f7`\u0013", (short) (C1633zX.Xd() ^ (-26796)), (short) (C1633zX.Xd() ^ (-8780)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            if (cipherParameters instanceof ParametersWithIV) {
                ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
                this.paramPlusIV = parametersWithIV;
                this.iv = parametersWithIV.getIV();
                this.param = (KeyParameter) this.paramPlusIV.getParameters();
                if (!this.forWrapping) {
                    throw new IllegalArgumentException(C1561oA.Qd("\u001f49b5)/4*![))-W*+%$\u001f+P\u0011\u001dMu\u0002J\u0010\u0018\u001aF\u001b\u0013\u001b\u0015\u0003\u0011\u0010\b\f\u0004", (short) (C1607wl.Xd() ^ 22022)));
                }
                byte[] bArr = this.iv;
                if (bArr == null || bArr.length != 8) {
                    throw new IllegalArgumentException(EO.Od("lKf\u0011\u000bs^\u007f?_u;97p\u007fST", (short) (C1607wl.Xd() ^ 29235)));
                }
                return;
            }
            return;
        }
        this.param = (KeyParameter) cipherParameters;
        if (this.forWrapping) {
            byte[] bArr2 = new byte[8];
            this.iv = bArr2;
            short sXd = (short) (C1633zX.Xd() ^ (-2039));
            short sXd2 = (short) (C1633zX.Xd() ^ (-6668));
            int[] iArr = new int["T8~\fh\u000b\u001c9B\u0016K9-%ypG/,\u0004osgD\u0012k".length()];
            QB qb = new QB("T8~\fh\u000b\u001c9B\u0016K9-%ypG/,\u0004osgD\u0012k");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = {bArr2};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("M\u0017uX#\r\"9\u0018", (short) (OY.Xd() ^ 21185)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(random, objArr2);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        int blockSize = this.engine.getBlockSize();
        if (i3 % blockSize != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + blockSize);
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i3];
        for (int i4 = 0; i4 != i3; i4 += blockSize) {
            this.engine.processBlock(bArr, i2 + i4, bArr2, i4);
        }
        byte[] bArrReverse = reverse(bArr2);
        byte[] bArr3 = new byte[8];
        this.iv = bArr3;
        int length = bArrReverse.length;
        int i5 = length - 8;
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArrReverse, 0, bArr3, 0, 8);
        System.arraycopy(bArrReverse, 8, bArr4, 0, bArrReverse.length - 8);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr5 = new byte[i5];
        for (int i6 = 0; i6 != i5; i6 += blockSize) {
            this.engine.processBlock(bArr4, i6, bArr5, i6);
        }
        int i7 = length - 16;
        byte[] bArr6 = new byte[i7];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i7);
        System.arraycopy(bArr5, i7, bArr7, 0, 8);
        if (checkCMSKeyChecksum(bArr6, bArr7)) {
            return bArr6;
        }
        throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i2, int i3) {
        if (!this.forWrapping) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, i3);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr3, i3, bArrCalculateCMSKeyChecksum.length);
        int blockSize = this.engine.getBlockSize();
        if (length % blockSize != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.engine.init(true, this.paramPlusIV);
        byte[] bArr4 = new byte[length];
        for (int i4 = 0; i4 != length; i4 += blockSize) {
            this.engine.processBlock(bArr3, i4, bArr4, i4);
        }
        byte[] bArr5 = this.iv;
        byte[] bArr6 = new byte[bArr5.length + length];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArr6, this.iv.length, length);
        byte[] bArrReverse = reverse(bArr6);
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i5 = 0; i5 != bArrReverse.length; i5 += blockSize) {
            this.engine.processBlock(bArrReverse, i5, bArrReverse, i5);
        }
        return bArrReverse;
    }
}
