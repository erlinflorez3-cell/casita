package org.spongycastle.openpgp.operator.bc;

import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.digests.MD2Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.digests.TigerDigest;
import org.spongycastle.crypto.encodings.PKCS1Encoding;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.engines.BlowfishEngine;
import org.spongycastle.crypto.engines.CAST5Engine;
import org.spongycastle.crypto.engines.CamelliaEngine;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.ElGamalEngine;
import org.spongycastle.crypto.engines.IDEAEngine;
import org.spongycastle.crypto.engines.RFC3394WrapEngine;
import org.spongycastle.crypto.engines.RSABlindedEngine;
import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.signers.DSADigestSigner;
import org.spongycastle.crypto.signers.DSASigner;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.signers.RSADigestSigner;
import org.spongycastle.openpgp.PGPException;

/* JADX INFO: loaded from: classes2.dex */
class BcImplProvider {
    BcImplProvider() {
    }

    static BlockCipher createBlockCipher(int i2) throws PGPException {
        switch (i2) {
            case 1:
                return new IDEAEngine();
            case 2:
                return new DESedeEngine();
            case 3:
                return new CAST5Engine();
            case 4:
                return new BlowfishEngine();
            case 5:
            default:
                throw new PGPException("cannot recognise cipher");
            case 6:
                return new DESEngine();
            case 7:
            case 8:
            case 9:
                return new AESEngine();
            case 10:
                return new TwofishEngine();
            case 11:
            case 12:
            case 13:
                return new CamelliaEngine();
        }
    }

    static Digest createDigest(int i2) throws PGPException {
        switch (i2) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new RIPEMD160Digest();
            case 4:
            case 7:
            default:
                throw new PGPException("cannot recognise digest");
            case 5:
                return new MD2Digest();
            case 6:
                return new TigerDigest();
            case 8:
                return new SHA256Digest();
            case 9:
                return new SHA384Digest();
            case 10:
                return new SHA512Digest();
            case 11:
                return new SHA224Digest();
        }
    }

    static AsymmetricBlockCipher createPublicKeyCipher(int i2) throws PGPException {
        if (i2 == 1 || i2 == 2) {
            return new PKCS1Encoding(new RSABlindedEngine());
        }
        switch (i2) {
            case 16:
            case 20:
                return new PKCS1Encoding(new ElGamalEngine());
            case 17:
                throw new PGPException("Can't use DSA for encryption.");
            case 18:
                throw new PGPException("Not implemented.");
            case 19:
                throw new PGPException("Can't use ECDSA for encryption.");
            default:
                throw new PGPException("unknown asymmetric algorithm: " + i2);
        }
    }

    static Signer createSigner(int i2, int i3) throws PGPException {
        if (i2 == 1 || i2 == 3) {
            return new RSADigestSigner(createDigest(i3));
        }
        if (i2 == 17) {
            return new DSADigestSigner(new DSASigner(), createDigest(i3));
        }
        if (i2 == 19) {
            return new DSADigestSigner(new ECDSASigner(), createDigest(i3));
        }
        throw new PGPException("cannot recognise keyAlgorithm: " + i2);
    }

    static Wrapper createWrapper(int i2) throws PGPException {
        switch (i2) {
            case 7:
            case 8:
            case 9:
                return new RFC3394WrapEngine(new AESFastEngine());
            case 10:
            default:
                throw new PGPException("unknown wrap algorithm: " + i2);
            case 11:
            case 12:
            case 13:
                return new RFC3394WrapEngine(new CamelliaEngine());
        }
    }
}
