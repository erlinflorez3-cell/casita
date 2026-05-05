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
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.msgpack.core.MessagePack;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, MessagePack.Code.ARRAY32, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    private SecureRandom sr;
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

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forWrapping = z2;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.Zd(":1G2]#\u0016\u0014EC:D)^\u0004|,N:\u001dz\u001a\u0016|8E", (short) (Od.Xd() ^ (-3791)), (short) (Od.Xd() ^ (-31119)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.sr = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.paramPlusIV = parametersWithIV;
            this.iv = parametersWithIV.getIV();
            this.param = this.paramPlusIV.getParameters();
            if (!this.forWrapping) {
                throw new IllegalArgumentException(Wg.vd("\u0018/6a.$,3#\u001cX(\"(T)D@A>Dk.<f\u0011\u001fi)37e\u0014\u000e\u0018\u0014{\f\r\u0007\u0005~", (short) (C1607wl.Xd() ^ 25993)));
            }
            byte[] bArr = this.iv;
            if (bArr == null || bArr.length != 8) {
                throw new IllegalArgumentException(C1561oA.Xd("bp;\u0006\u0011>\u000e\u0010\u0016B[D\u0015\n\u001c\u000e\u001e\u001e", (short) (FB.Xd() ^ 8649)));
            }
            return;
        }
        this.param = cipherParameters;
        if (this.forWrapping) {
            byte[] bArr2 = new byte[8];
            this.iv = bArr2;
            SecureRandom secureRandom = this.sr;
            Object[] objArr2 = {bArr2};
            Method method = Class.forName(Qg.kd("g]q['k\\Yjf\\fj\u001eBSPa]O;IUJTQ", (short) (FB.Xd() ^ 27544), (short) (FB.Xd() ^ 16316))).getMethod(hg.Vd("XN`[(^XHU", (short) (Od.Xd() ^ (-16819)), (short) (Od.Xd() ^ (-8768))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
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
        if (i3 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        for (int i4 = 0; i4 < i3 / this.engine.getBlockSize(); i4++) {
            int blockSize = this.engine.getBlockSize() * i4;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i3];
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i5 + 1;
            bArr3[i5] = bArr2[i3 - i6];
            i5 = i6;
        }
        byte[] bArr4 = new byte[8];
        this.iv = bArr4;
        int i7 = i3 - 8;
        byte[] bArr5 = new byte[i7];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i7);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i7];
        System.arraycopy(bArr5, 0, bArr6, 0, i7);
        for (int i8 = 0; i8 < i7 / this.engine.getBlockSize(); i8++) {
            int blockSize2 = this.engine.getBlockSize() * i8;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i9 = i3 - 16;
        byte[] bArr7 = new byte[i9];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i9);
        System.arraycopy(bArr6, i9, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i10 = bArr7[0];
        if (i9 - ((255 & i10) + 1) <= 7) {
            byte[] bArr9 = new byte[i10];
            System.arraycopy(bArr7, 1, bArr9, 0, i10);
            return bArr9;
        }
        StringBuilder sb = new StringBuilder("too many pad bytes (");
        int i11 = bArr7[0];
        throw new InvalidCipherTextException(sb.append(i9 - (((i11 + 255) - (i11 | 255)) + 1)).append(")").toString());
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forWrapping) {
            throw new IllegalStateException(Xg.qd("\u001a<Bn9?;G=6B@R>>zBLP~WSCSTNTN", (short) (C1580rY.Xd() ^ (-10557)), (short) (C1580rY.Xd() ^ (-18697))));
        }
        int i4 = i3 + 1;
        int i5 = i4 % 8;
        int i6 = i5 != 0 ? (8 - i5) + i4 : i4;
        byte[] bArr2 = new byte[i6];
        bArr2[0] = (byte) i3;
        System.arraycopy(bArr, i2, bArr2, 1, i3);
        int i7 = (i6 - i3) - 1;
        byte[] bArr3 = new byte[i7];
        if (i7 > 0) {
            SecureRandom secureRandom = this.sr;
            short sXd = (short) (Od.Xd() ^ (-28971));
            int[] iArr = new int["5+?)t9*'84*48k\u0010!\u001e/+\u001d\t\u0017#\u0018\"\u001f".length()];
            QB qb = new QB("5+?)t9*'84*48k\u0010!\u001e/+\u001d\t\u0017#\u0018\"\u001f");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK(sXd + i8 + xuXd.CK(iKK));
                i8++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i8));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr3};
            short sXd2 = (short) (OY.Xd() ^ 11489);
            int[] iArr2 = new int["@6LG\u0018NL<=".length()];
            QB qb2 = new QB("@6LG\u0018NL<=");
            int i9 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i9] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i9));
                i9++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i9), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
                System.arraycopy(bArr3, 0, bArr2, i4, i7);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        byte[] bArrCalculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = bArrCalculateCMSKeyChecksum.length + i6;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i6);
        System.arraycopy(bArrCalculateCMSKeyChecksum, 0, bArr4, i6, bArrCalculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            throw new IllegalStateException(C1561oA.Yd("\u00146<h7@8A7?<6qB:t8CG<EzHBLFTI", (short) (ZN.Xd() ^ 20806)));
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i10 = 0; i10 < blockSize; i10++) {
            int blockSize2 = this.engine.getBlockSize() * i10;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i11 = 0;
        while (i11 < length2) {
            int i12 = i11 + 1;
            bArr8[i11] = bArr7[length2 - i12];
            i11 = i12;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i13 = 0; i13 < blockSize + 1; i13++) {
            int blockSize3 = this.engine.getBlockSize() * i13;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
