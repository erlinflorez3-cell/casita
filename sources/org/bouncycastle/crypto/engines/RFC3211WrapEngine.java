package org.bouncycastle.crypto.engines;

import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public class RFC3211WrapEngine implements Wrapper {
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private ParametersWithIV param;
    private SecureRandom rand;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.engine = new CBCBlockCipher(blockCipher);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getUnderlyingCipher().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forWrapping = z2;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.rand = parametersWithRandom.getRandom();
            this.param = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z2) {
            short sXd = (short) (C1607wl.Xd() ^ 5181);
            short sXd2 = (short) (C1607wl.Xd() ^ 25060);
            int[] iArr = new int["a(\\frGXuGSi4X\u001c`2O1m\u007f\f*v\f6c".length()];
            QB qb = new QB("a(\\frGXuGSi4X\u001c`2O1m\u007f\f*v\f6c");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.rand = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.param = (ParametersWithIV) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i2, int i3) throws InvalidCipherTextException {
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.engine.getBlockSize();
        if (i3 < blockSize * 2) {
            throw new InvalidCipherTextException("input too short");
        }
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[blockSize];
        int i4 = 0;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        System.arraycopy(bArr, i2, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        for (int i5 = blockSize; i5 < i3; i5 += blockSize) {
            this.engine.processBlock(bArr2, i5, bArr2, i5);
        }
        System.arraycopy(bArr2, i3 - blockSize, bArr3, 0, blockSize);
        this.engine.init(false, new ParametersWithIV(this.param.getParameters(), bArr3));
        this.engine.processBlock(bArr2, 0, bArr2, 0);
        this.engine.init(false, this.param);
        for (int i6 = 0; i6 < i3; i6 += blockSize) {
            this.engine.processBlock(bArr2, i6, bArr2, i6);
        }
        int i7 = bArr2[0];
        if ((-1) - (((-1) - i7) | ((-1) - 255)) > i3 - 4) {
            throw new InvalidCipherTextException("wrapped key corrupted");
        }
        byte[] bArr4 = new byte[(i7 + 255) - (255 | i7)];
        System.arraycopy(bArr2, 4, bArr4, 0, i7);
        int i8 = 0;
        while (i4 != 3) {
            int i9 = i4 + 1;
            i8 |= ((byte) (~bArr2[i9])) ^ bArr4[i4];
            i4 = i9;
        }
        if (i8 == 0) {
            return bArr4;
        }
        throw new InvalidCipherTextException("wrapped key fails checksum");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forWrapping) {
            short sXd = (short) (Od.Xd() ^ (-27204));
            int[] iArr = new int["[7\n\rHm\u0019c{DIX\u0002\u0003QJ\u0012tQ2".length()];
            QB qb = new QB("[7\n\rHm\u0019c{DIX\u0002\u0003QJ\u0012tQ2");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd + i4)));
                i4++;
            }
            throw new IllegalStateException(new String(iArr, 0, i4));
        }
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        int i5 = i3 + 4;
        int i6 = blockSize * 2;
        if (i5 >= i6) {
            i6 = i5 % blockSize == 0 ? i5 : ((i5 / blockSize) + 1) * blockSize;
        }
        byte[] bArr2 = new byte[i6];
        bArr2[0] = (byte) i3;
        bArr2[1] = (byte) (~bArr[i2]);
        bArr2[2] = (byte) (~bArr[i2 + 1]);
        bArr2[3] = (byte) (~bArr[i2 + 2]);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        int length = bArr2.length - i5;
        byte[] bArr3 = new byte[length];
        SecureRandom secureRandom = this.rand;
        Object[] objArr = {bArr3};
        Method method = Class.forName(ZO.xd("}f-Ski\u00177hl(lzC\u00139\u001dko!wg,\u001a\u0007q", (short) (C1580rY.Xd() ^ (-30550)), (short) (C1580rY.Xd() ^ (-18942)))).getMethod(C1626yg.Ud("L~<\u0003\u00138\nu}", (short) (FB.Xd() ^ IptcDirectory.TAG_LANGUAGE_IDENTIFIER), (short) (FB.Xd() ^ 26431)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            System.arraycopy(bArr3, 0, bArr2, i5, length);
            for (int i7 = 0; i7 < bArr2.length; i7 += blockSize) {
                this.engine.processBlock(bArr2, i7, bArr2, i7);
            }
            for (int i8 = 0; i8 < bArr2.length; i8 += blockSize) {
                this.engine.processBlock(bArr2, i8, bArr2, i8);
            }
            return bArr2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
