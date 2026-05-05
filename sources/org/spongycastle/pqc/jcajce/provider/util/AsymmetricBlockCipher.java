package org.spongycastle.pqc.jcajce.provider.util;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.Qg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsymmetricBlockCipher extends CipherSpiExt {
    protected ByteArrayOutputStream buf = new ByteArrayOutputStream();
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected AlgorithmParameterSpec paramSpec;

    protected void checkLength(int i2) throws IllegalBlockSizeException {
        int size = i2 + this.buf.size();
        if (this.opMode == 1) {
            if (size > this.maxPlainTextSize) {
                throw new IllegalBlockSizeException("The length of the plaintext (" + size + " bytes) is not supported by the cipher (max. " + this.maxPlainTextSize + " bytes).");
            }
        } else if (this.opMode == 2 && size != this.cipherTextSize) {
            throw new IllegalBlockSizeException("Illegal ciphertext length (expected " + this.cipherTextSize + " bytes, was " + size + " bytes).");
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (bArr2.length < getOutputSize(i3)) {
            throw new ShortBufferException("Output buffer too short.");
        }
        byte[] bArrDoFinal = doFinal(bArr, i2, i3);
        System.arraycopy(bArrDoFinal, 0, bArr2, i4, bArrDoFinal.length);
        return bArrDoFinal.length;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] doFinal(byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        checkLength(i3);
        update(bArr, i2, i3);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i4 = this.opMode;
        if (i4 == 1) {
            return messageEncrypt(byteArray);
        }
        if (i4 != 2) {
            return null;
        }
        return messageDecrypt(byteArray);
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return this.opMode == 1 ? this.maxPlainTextSize : this.cipherTextSize;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i2) {
        int size = i2 + this.buf.size();
        int blockSize = getBlockSize();
        if (size > blockSize) {
            return 0;
        }
        return blockSize;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
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

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    public final void initEncrypt(Key key) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Qg.kd(";1E/z?0->:0:>q\u0016'$51#\u000f\u001d)\u001e(%", (short) (C1499aX.Xd() ^ (-755)), (short) (C1499aX.Xd() ^ (-12611)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                initEncrypt(key, null, (SecureRandom) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvalidAlgorithmParameterException unused) {
            throw new InvalidParameterException(hg.Vd("\u001a--6a$)/&\".Z(\u001e\u001d\u001b)T\u0015\u001f\u0019 \"\u0018\"\u0015\u0019J\u001a\n\u001a\b\u0013\n\u0018\b\u0014\u0014?\u0005\r\u000f;\u0004\b\u0002\f\u007fv\u0001|\rr\u0005x}{,3mjvuuy$eg!ntji%)", (short) (C1607wl.Xd() ^ 24131), (short) (C1607wl.Xd() ^ 10952)));
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
        Constructor<?> constructor = Class.forName(C1561oA.ud("$\u001a.\u0018c(\u0019\u0016'#\u0019#'Z~\u0010\r\u001e\u001a\fw\u0006\u0012\u0007\u0011\u000e", (short) (Od.Xd() ^ (-14603)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            initEncrypt(key, algorithmParameterSpec, (SecureRandom) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }

    protected abstract byte[] messageDecrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException;

    protected abstract byte[] messageEncrypt(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException;

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setMode(String str) {
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    protected final void setPadding(String str) {
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        update(bArr, i2, i3);
        return 0;
    }

    @Override // org.spongycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] update(byte[] bArr, int i2, int i3) {
        if (i3 != 0) {
            this.buf.write(bArr, i2, i3);
        }
        return new byte[0];
    }
}
