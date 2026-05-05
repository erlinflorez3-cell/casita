package org.spongycastle.crypto.engines;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class RFC3211WrapEngine implements Wrapper {
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private ParametersWithIV param;
    private SecureRandom rand;

    public RFC3211WrapEngine(BlockCipher blockCipher) {
        this.engine = new CBCBlockCipher(blockCipher);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getUnderlyingCipher().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) throws Throwable {
        this.forWrapping = z2;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.rand = parametersWithRandom.getRandom();
            this.param = (ParametersWithIV) parametersWithRandom.getParameters();
            return;
        }
        if (z2) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(EO.Od("<k/:\u001e(\u0006D->7\\,V Lv'\\g\u000bR\u0002s%_", (short) (FB.Xd() ^ 16065))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.rand = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.param = (ParametersWithIV) cipherParameters;
    }

    @Override // org.spongycastle.crypto.Wrapper
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
        if ((255 & i7) > i3 - 4) {
            throw new InvalidCipherTextException("wrapped key corrupted");
        }
        byte[] bArr4 = new byte[255 & i7];
        System.arraycopy(bArr2, 4, bArr4, 0, i7);
        int i8 = 0;
        while (i4 != 3) {
            int i9 = i4 + 1;
            int i10 = ((byte) (~bArr2[i9])) ^ bArr4[i4];
            i8 = (i8 + i10) - (i8 & i10);
            i4 = i9;
        }
        if (i8 == 0) {
            return bArr4;
        }
        throw new InvalidCipherTextException("wrapped key fails checksum");
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i2, int i3) throws Throwable {
        if (!this.forWrapping) {
            throw new IllegalStateException(C1561oA.od("%%)S&\u0017%O\u0015\u001d\u001fK\"\u001c\n\u0018\u0017\u000f\u0013\u000b", (short) (ZN.Xd() ^ 8146)));
        }
        this.engine.init(true, this.param);
        int blockSize = this.engine.getBlockSize();
        int i4 = i3 + 4;
        int i5 = blockSize * 2;
        byte[] bArr2 = i4 < i5 ? new byte[i5] : new byte[i4 % blockSize == 0 ? i4 : ((i4 / blockSize) + 1) * blockSize];
        bArr2[0] = (byte) i3;
        bArr2[1] = (byte) (~bArr[i2]);
        bArr2[2] = (byte) (~bArr[i2 + 1]);
        bArr2[3] = (byte) (~bArr[i2 + 2]);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        int length = bArr2.length - i4;
        byte[] bArr3 = new byte[length];
        SecureRandom secureRandom = this.rand;
        Object[] objArr = {bArr3};
        Method method = Class.forName(C1561oA.Qd("E;O9\u0005I:7HD:DH{ 1.?;-\u0019'3(2/", (short) (C1607wl.Xd() ^ 6922))).getMethod(C1593ug.zd("sk\u007f|K\u0004\u007fq\u0001", (short) (OY.Xd() ^ 2257), (short) (OY.Xd() ^ 8338)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            System.arraycopy(bArr3, 0, bArr2, i4, length);
            for (int i6 = 0; i6 < bArr2.length; i6 += blockSize) {
                this.engine.processBlock(bArr2, i6, bArr2, i6);
            }
            for (int i7 = 0; i7 < bArr2.length; i7 += blockSize) {
                this.engine.processBlock(bArr2, i7, bArr2, i7);
            }
            return bArr2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
