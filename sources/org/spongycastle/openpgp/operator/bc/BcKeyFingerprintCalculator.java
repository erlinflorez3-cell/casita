package org.spongycastle.openpgp.operator.bc;

import java.io.IOException;
import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSAPublicBCPGKey;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class BcKeyFingerprintCalculator implements KeyFingerPrintCalculator {
    @Override // org.spongycastle.openpgp.operator.KeyFingerPrintCalculator
    public byte[] calculateFingerprint(PublicKeyPacket publicKeyPacket) throws PGPException {
        Digest sHA1Digest;
        BCPGKey key = publicKeyPacket.getKey();
        if (publicKeyPacket.getVersion() <= 3) {
            RSAPublicBCPGKey rSAPublicBCPGKey = (RSAPublicBCPGKey) key;
            try {
                sHA1Digest = new MD5Digest();
                byte[] encoded = new MPInteger(rSAPublicBCPGKey.getModulus()).getEncoded();
                sHA1Digest.update(encoded, 2, encoded.length - 2);
                byte[] encoded2 = new MPInteger(rSAPublicBCPGKey.getPublicExponent()).getEncoded();
                sHA1Digest.update(encoded2, 2, encoded2.length - 2);
            } catch (IOException e2) {
                throw new PGPException("can't encode key components: " + e2.getMessage(), e2);
            }
        } else {
            try {
                byte[] encodedContents = publicKeyPacket.getEncodedContents();
                sHA1Digest = new SHA1Digest();
                sHA1Digest.update((byte) -103);
                sHA1Digest.update((byte) (encodedContents.length >> 8));
                sHA1Digest.update((byte) encodedContents.length);
                sHA1Digest.update(encodedContents, 0, encodedContents.length);
            } catch (IOException e3) {
                throw new PGPException("can't encode key components: " + e3.getMessage(), e3);
            }
        }
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        sHA1Digest.doFinal(bArr, 0);
        return bArr;
    }
}
