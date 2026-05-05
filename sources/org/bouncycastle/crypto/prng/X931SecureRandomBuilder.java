package org.bouncycastle.crypto.prng;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;
import yg.C1607wl;
import yg.C1626yg;

/* JADX INFO: loaded from: classes6.dex */
public class X931SecureRandomBuilder {
    private byte[] dateTimeVector;
    private EntropySourceProvider entropySourceProvider;
    private SecureRandom random;

    /* JADX WARN: Illegal instructions before constructor call */
    public X931SecureRandomBuilder() throws Throwable {
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1626yg.Ud("HFgC2s:[@\u00045u\u0001L2I\u0016|\u001ak\u0005G~G\u0002V", (short) (C1607wl.Xd() ^ 9194), (short) (C1607wl.Xd() ^ 3892))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this((SecureRandom) constructor.newInstance(objArr), false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public X931SecureRandomBuilder(SecureRandom secureRandom, boolean z2) {
        this.random = secureRandom;
        this.entropySourceProvider = new BasicEntropySourceProvider(this.random, z2);
    }

    public X931SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.random = null;
        this.entropySourceProvider = entropySourceProvider;
    }

    public X931SecureRandom build(BlockCipher blockCipher, KeyParameter keyParameter, boolean z2) {
        if (this.dateTimeVector == null) {
            this.dateTimeVector = new byte[blockCipher.getBlockSize()];
            Pack.longToBigEndian(System.currentTimeMillis(), this.dateTimeVector, 0);
        }
        blockCipher.init(true, keyParameter);
        return new X931SecureRandom(this.random, new X931RNG(blockCipher, this.dateTimeVector, this.entropySourceProvider.get(blockCipher.getBlockSize() * 8)), z2);
    }

    public X931SecureRandomBuilder setDateTimeVector(byte[] bArr) {
        this.dateTimeVector = bArr;
        return this;
    }
}
