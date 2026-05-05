package org.spongycastle.openpgp.operator.jcajce;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSAPublicBCPGKey;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class JcaKeyFingerprintCalculator implements KeyFingerPrintCalculator {
    @Override // org.spongycastle.openpgp.operator.KeyFingerPrintCalculator
    public byte[] calculateFingerprint(PublicKeyPacket publicKeyPacket) throws PGPException {
        BCPGKey key = publicKeyPacket.getKey();
        if (publicKeyPacket.getVersion() <= 3) {
            RSAPublicBCPGKey rSAPublicBCPGKey = (RSAPublicBCPGKey) key;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                byte[] encoded = new MPInteger(rSAPublicBCPGKey.getModulus()).getEncoded();
                messageDigest.update(encoded, 2, encoded.length - 2);
                byte[] encoded2 = new MPInteger(rSAPublicBCPGKey.getPublicExponent()).getEncoded();
                messageDigest.update(encoded2, 2, encoded2.length - 2);
                return messageDigest.digest();
            } catch (IOException e2) {
                throw new PGPException("can't encode key components: " + e2.getMessage(), e2);
            } catch (NoSuchAlgorithmException e3) {
                throw new PGPException("can't find MD5", e3);
            }
        }
        try {
            byte[] encodedContents = publicKeyPacket.getEncodedContents();
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA1");
            messageDigest2.update((byte) -103);
            messageDigest2.update((byte) (encodedContents.length >> 8));
            messageDigest2.update((byte) encodedContents.length);
            messageDigest2.update(encodedContents);
            return messageDigest2.digest();
        } catch (IOException e4) {
            throw new PGPException("can't encode key components: " + e4.getMessage(), e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new PGPException("can't find SHA1", e5);
        }
    }
}
