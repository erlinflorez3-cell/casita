package org.spongycastle.crypto.prng;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.prng.drbg.CTRSP800DRBG;
import org.spongycastle.crypto.prng.drbg.DualECPoints;
import org.spongycastle.crypto.prng.drbg.DualECSP800DRBG;
import org.spongycastle.crypto.prng.drbg.HMacSP800DRBG;
import org.spongycastle.crypto.prng.drbg.HashSP800DRBG;
import org.spongycastle.crypto.prng.drbg.SP80090DRBG;
import yg.C1561oA;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class SP800SecureRandomBuilder {
    private int entropyBitsRequired;
    private final EntropySourceProvider entropySourceProvider;
    private byte[] personalizationString;
    private final SecureRandom random;
    private int securityStrength;

    private static class CTRDRBGProvider implements DRBGProvider {
        private final BlockCipher blockCipher;
        private final int keySizeInBits;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public CTRDRBGProvider(BlockCipher blockCipher, int i2, byte[] bArr, byte[] bArr2, int i3) {
            this.blockCipher = blockCipher;
            this.keySizeInBits = i2;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i3;
        }

        @Override // org.spongycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new CTRSP800DRBG(this.blockCipher, this.keySizeInBits, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }
    }

    private static class ConfigurableDualECDRBGProvider implements DRBGProvider {
        private final Digest digest;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final DualECPoints[] pointSet;
        private final int securityStrength;

        public ConfigurableDualECDRBGProvider(DualECPoints[] dualECPointsArr, Digest digest, byte[] bArr, byte[] bArr2, int i2) {
            DualECPoints[] dualECPointsArr2 = new DualECPoints[dualECPointsArr.length];
            this.pointSet = dualECPointsArr2;
            System.arraycopy(dualECPointsArr, 0, dualECPointsArr2, 0, dualECPointsArr.length);
            this.digest = digest;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i2;
        }

        @Override // org.spongycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new DualECSP800DRBG(this.pointSet, this.digest, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }
    }

    private static class DualECDRBGProvider implements DRBGProvider {
        private final Digest digest;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public DualECDRBGProvider(Digest digest, byte[] bArr, byte[] bArr2, int i2) {
            this.digest = digest;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i2;
        }

        @Override // org.spongycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new DualECSP800DRBG(this.digest, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }
    }

    private static class HMacDRBGProvider implements DRBGProvider {
        private final Mac hMac;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public HMacDRBGProvider(Mac mac, byte[] bArr, byte[] bArr2, int i2) {
            this.hMac = mac;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i2;
        }

        @Override // org.spongycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new HMacSP800DRBG(this.hMac, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }
    }

    private static class HashDRBGProvider implements DRBGProvider {
        private final Digest digest;
        private final byte[] nonce;
        private final byte[] personalizationString;
        private final int securityStrength;

        public HashDRBGProvider(Digest digest, byte[] bArr, byte[] bArr2, int i2) {
            this.digest = digest;
            this.nonce = bArr;
            this.personalizationString = bArr2;
            this.securityStrength = i2;
        }

        @Override // org.spongycastle.crypto.prng.DRBGProvider
        public SP80090DRBG get(EntropySource entropySource) {
            return new HashSP800DRBG(this.digest, this.securityStrength, entropySource, this.personalizationString, this.nonce);
        }
    }

    public SP800SecureRandomBuilder() throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 7964);
        short sXd2 = (short) (C1607wl.Xd() ^ 31359);
        int[] iArr = new int["J\n4)/\\P\u0005TwSP`1wu\u0001=\t,4\n\u0002\u0006<'".length()];
        QB qb = new QB("J\n4)/\\P\u0005TwSP`1wu\u0001=\t,4\n\u0002\u0006<'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this((SecureRandom) constructor.newInstance(objArr), false);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public SP800SecureRandomBuilder(SecureRandom secureRandom, boolean z2) {
        this.securityStrength = 256;
        this.entropyBitsRequired = 256;
        this.random = secureRandom;
        this.entropySourceProvider = new BasicEntropySourceProvider(secureRandom, z2);
    }

    public SP800SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.securityStrength = 256;
        this.entropyBitsRequired = 256;
        this.random = null;
        this.entropySourceProvider = entropySourceProvider;
    }

    public SP800SecureRandom buildCTR(BlockCipher blockCipher, int i2, byte[] bArr, boolean z2) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new CTRDRBGProvider(blockCipher, i2, bArr, this.personalizationString, this.securityStrength), z2);
    }

    public SP800SecureRandom buildDualEC(Digest digest, byte[] bArr, boolean z2) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new DualECDRBGProvider(digest, bArr, this.personalizationString, this.securityStrength), z2);
    }

    public SP800SecureRandom buildDualEC(DualECPoints[] dualECPointsArr, Digest digest, byte[] bArr, boolean z2) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new ConfigurableDualECDRBGProvider(dualECPointsArr, digest, bArr, this.personalizationString, this.securityStrength), z2);
    }

    public SP800SecureRandom buildHMAC(Mac mac, byte[] bArr, boolean z2) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HMacDRBGProvider(mac, bArr, this.personalizationString, this.securityStrength), z2);
    }

    public SP800SecureRandom buildHash(Digest digest, byte[] bArr, boolean z2) {
        return new SP800SecureRandom(this.random, this.entropySourceProvider.get(this.entropyBitsRequired), new HashDRBGProvider(digest, bArr, this.personalizationString, this.securityStrength), z2);
    }

    public SP800SecureRandomBuilder setEntropyBitsRequired(int i2) {
        this.entropyBitsRequired = i2;
        return this;
    }

    public SP800SecureRandomBuilder setPersonalizationString(byte[] bArr) {
        this.personalizationString = bArr;
        return this;
    }

    public SP800SecureRandomBuilder setSecurityStrength(int i2) {
        this.securityStrength = i2;
        return this;
    }
}
