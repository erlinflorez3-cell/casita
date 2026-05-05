package org.bouncycastle.pqc.jcajce.provider.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.ShortBufferException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsymmetricHybridCipher extends CipherSpiExt {
    protected AlgorithmParameterSpec paramSpec;

    protected abstract int decryptOutputSize(int i2);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws BadPaddingException, ShortBufferException {
        if (bArr2.length < getOutputSize(i3)) {
            throw new ShortBufferException("Output buffer too short.");
        }
        byte[] bArrDoFinal = doFinal(bArr, i2, i3);
        System.arraycopy(bArrDoFinal, 0, bArr2, i4, bArrDoFinal.length);
        return bArrDoFinal.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] doFinal(byte[] bArr, int i2, int i3) throws BadPaddingException;

    protected abstract int encryptOutputSize(int i2);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i2) {
        return this.opMode == 1 ? encryptOutputSize(i2) : decryptOutputSize(i2);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final AlgorithmParameterSpec getParameters() {
        return this.paramSpec;
    }

    protected abstract void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;

    protected abstract void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException;

    public final void initDecrypt(Key key) throws InvalidKeyException {
        try {
            initDecrypt(key, null);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    public final void initEncrypt(Key key) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Ig.wd("&VW 3LXU\u001892[\u0011Kp-Qq'\u001eK\u0007&4Ci", (short) (C1499aX.Xd() ^ (-1899)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                initEncrypt(key, null, (SecureRandom) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(EO.Od("\u0003Fi\u001b81\u000b\u0012-mpDB;Ko4zT\u0017T9\u0012\rjB*1S7\u001cq]@0gO,U.3\u001fr^ett9~r0\u0016XD\u007f*+vI\u000b|$\u0001wE(A|I\u001cYt\u0013\u007fC", (short) (ZN.Xd() ^ 13863)));
        }
    }

    public final void initEncrypt(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            initEncrypt(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Qd("B8L6\u0002F74EA7AEx\u001d.+<8*\u0016$0%/,", (short) (C1633zX.Xd() ^ (-23622)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initEncrypt(key, algorithmParameterSpec, (SecureRandom) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setMode(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setPadding(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws ShortBufferException {
        if (bArr2.length < getOutputSize(i3)) {
            throw new ShortBufferException("output");
        }
        byte[] bArrUpdate = update(bArr, i2, i3);
        System.arraycopy(bArrUpdate, 0, bArr2, i4, bArrUpdate.length);
        return bArrUpdate.length;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public abstract byte[] update(byte[] bArr, int i2, int i3);
}
