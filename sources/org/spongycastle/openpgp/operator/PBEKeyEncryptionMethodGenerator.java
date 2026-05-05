package org.spongycastle.openpgp.operator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.bcpg.ContainedPacket;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.bcpg.SymmetricKeyEncSessionPacket;
import org.spongycastle.openpgp.PGPException;
import yg.C1499aX;
import yg.C1561oA;
import yg.Jg;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PBEKeyEncryptionMethodGenerator extends PGPKeyEncryptionMethodGenerator {
    private char[] passPhrase;
    private SecureRandom random;
    private S2K s2k;
    private int s2kCount;
    private PGPDigestCalculator s2kDigestCalculator;

    protected PBEKeyEncryptionMethodGenerator(char[] cArr, PGPDigestCalculator pGPDigestCalculator) {
        this(cArr, pGPDigestCalculator, 96);
    }

    protected PBEKeyEncryptionMethodGenerator(char[] cArr, PGPDigestCalculator pGPDigestCalculator, int i2) {
        this.passPhrase = cArr;
        this.s2kDigestCalculator = pGPDigestCalculator;
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("s2kCount value outside of range 0 to 255.");
        }
        this.s2kCount = i2;
    }

    protected abstract byte[] encryptSessionInfo(int i2, byte[] bArr, byte[] bArr2) throws PGPException;

    @Override // org.spongycastle.openpgp.operator.PGPKeyEncryptionMethodGenerator
    public ContainedPacket generate(int i2, byte[] bArr) throws Throwable {
        byte[] key = getKey(i2);
        if (bArr == null) {
            return new SymmetricKeyEncSessionPacket(i2, this.s2k, null);
        }
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return new SymmetricKeyEncSessionPacket(i2, this.s2k, encryptSessionInfo(i2, key, bArr2));
    }

    public byte[] getKey(int i2) throws Throwable {
        if (this.s2k == null) {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(C1561oA.Yd(".&<(u</.A?7CI~%87JH<*:H?KJ", (short) (C1499aX.Xd() ^ (-1717)))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    this.random = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            SecureRandom secureRandom = this.random;
            Object[] objArr2 = {bArr};
            Method method = Class.forName(Xg.qd(";3I5\u0003I<;NLDPV\f2EDWUI7GULXW", (short) (ZN.Xd() ^ 21223), (short) (ZN.Xd() ^ 31588))).getMethod(Jg.Wd("Rv*~m\u00061\u000b:", (short) (C1499aX.Xd() ^ (-25546)), (short) (C1499aX.Xd() ^ (-20093))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
                this.s2k = new S2K(this.s2kDigestCalculator.getAlgorithm(), bArr, this.s2kCount);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return PGPUtil.makeKeyFromPassPhrase(this.s2kDigestCalculator, i2, this.s2k, this.passPhrase);
    }

    public PBEKeyEncryptionMethodGenerator setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
