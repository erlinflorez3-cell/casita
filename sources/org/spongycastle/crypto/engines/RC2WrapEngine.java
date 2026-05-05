package org.spongycastle.crypto.engines;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.msgpack.core.MessagePack;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, MessagePack.Code.ARRAY32, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    private SecureRandom sr;
    Digest sha1 = new SHA1Digest();
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

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forWrapping = z2;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            short sXd = (short) (C1580rY.Xd() ^ (-15735));
            short sXd2 = (short) (C1580rY.Xd() ^ (-15769));
            int[] iArr = new int["UK_I\u0015YJGXTJTX\f0A>OK=)7C8B?".length()];
            QB qb = new QB("UK_I\u0015YJGXTJTX\f0A>OK=)7C8B?");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
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
                throw new IllegalArgumentException(C1561oA.yd("!6;d?39>,#]+37a4MGFAUz;Go\u0018$l:BDp]U]WM[ZRNF", (short) (FB.Xd() ^ 12984)));
            }
            byte[] bArr = this.iv;
            if (bArr == null || bArr.length != 8) {
                throw new IllegalArgumentException(C1561oA.ud("lxA\n\u0013>\f\f\u0010:Q8\u0007y\ny\b\u0006", (short) (ZN.Xd() ^ 17558)));
            }
            return;
        }
        this.param = cipherParameters;
        if (this.forWrapping) {
            byte[] bArr2 = new byte[8];
            this.iv = bArr2;
            SecureRandom secureRandom = this.sr;
            short sXd3 = (short) (C1607wl.Xd() ^ 24852);
            int[] iArr2 = new int["\u000b\u0003\u0019\u0005R\u0019\f\u000b\u001e\u001c\u0014 &[\u0002\u0015\u0014'%\u0019\u0007\u0017%\u001c('".length()];
            QB qb2 = new QB("\u000b\u0003\u0019\u0005R\u0019\f\u000b\u001e\u001c\u0014 &[\u0002\u0015\u0014'%\u0019\u0007\u0017%\u001c('");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                i3++;
            }
            Object[] objArr2 = {bArr2};
            Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd("-%96\u0005=9+:", (short) (C1580rY.Xd() ^ (-10177)), (short) (C1580rY.Xd() ^ (-5790))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
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
        if (i9 - (((-1) - (((-1) - i10) | ((-1) - 255))) + 1) <= 7) {
            byte[] bArr9 = new byte[i10];
            System.arraycopy(bArr7, 1, bArr9, 0, i10);
            return bArr9;
        }
        StringBuilder sb = new StringBuilder("too many pad bytes (");
        int i11 = bArr7[0];
        throw new InvalidCipherTextException(sb.append(i9 - (((i11 + 255) - (i11 | 255)) + 1)).append(")").toString());
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forWrapping) {
            throw new IllegalStateException(Ig.wd("f;l:\u0012iB\u00149$/\u0010Q@Qub\u007f9\u0001\u0019J\u0011>\u0003iO\u001f", (short) (OY.Xd() ^ 14321)));
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
            Class<?> cls = Class.forName(Jg.Wd("\u0019\tC\u000e\u0004\u007f\u007f7qKhm@-;k\u000f\u001chPk\u0014\b=\u0012\u0006", (short) (C1499aX.Xd() ^ (-20041)), (short) (C1499aX.Xd() ^ (-21928))));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr3};
            short sXd = (short) (C1499aX.Xd() ^ (-7020));
            short sXd2 = (short) (C1499aX.Xd() ^ (-31938));
            int[] iArr = new int["a>c|ieer'".length()];
            QB qb = new QB("a>c|ieer'");
            int i8 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i8] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((i8 * sXd2) + sXd)));
                i8++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i8), clsArr);
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
            throw new IllegalStateException(C1626yg.Ud("RU;Sa5\u0017,v,]g>ncsd'M[OW\u001e\u0012\f^xK", (short) (Od.Xd() ^ (-28511)), (short) (Od.Xd() ^ (-26234))));
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i9 = 0; i9 < blockSize; i9++) {
            int blockSize2 = this.engine.getBlockSize() * i9;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i10 = 0;
        while (i10 < length2) {
            int i11 = i10 + 1;
            bArr8[i10] = bArr7[length2 - i11];
            i10 = i11;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i12 = 0; i12 < blockSize + 1; i12++) {
            int blockSize3 = this.engine.getBlockSize() * i12;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
