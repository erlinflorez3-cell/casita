package org.spongycastle.openpgp.operator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class RFC6637KDFCalculator {
    private static final byte[] ANONYMOUS_SENDER = Hex.decode("416E6F6E796D6F75732053656E64657220202020");
    private final PGPDigestCalculator digCalc;
    private final int keyAlgorithm;

    public RFC6637KDFCalculator(PGPDigestCalculator pGPDigestCalculator, int i2) {
        this.digCalc = pGPDigestCalculator;
        this.keyAlgorithm = i2;
    }

    private static byte[] KDF(PGPDigestCalculator pGPDigestCalculator, ECPoint eCPoint, int i2, byte[] bArr) throws IOException {
        byte[] encoded = eCPoint.getXCoord().getEncoded();
        OutputStream outputStream = pGPDigestCalculator.getOutputStream();
        outputStream.write(0);
        outputStream.write(0);
        outputStream.write(0);
        outputStream.write(1);
        outputStream.write(encoded);
        outputStream.write(bArr);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(pGPDigestCalculator.getDigest(), 0, bArr2, 0, i2);
        return bArr2;
    }

    private static int getKeyLen(int i2) throws PGPException {
        if (i2 == 7) {
            return 16;
        }
        if (i2 == 8) {
            return 24;
        }
        if (i2 == 9) {
            return 32;
        }
        throw new PGPException("unknown symmetric algorithm ID: " + i2);
    }

    public byte[] createKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, ECPoint eCPoint, byte[] bArr) throws PGPException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] encoded = aSN1ObjectIdentifier.getEncoded();
            byteArrayOutputStream.write(encoded, 1, encoded.length - 1);
            byteArrayOutputStream.write(18);
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write(this.digCalc.getAlgorithm());
            byteArrayOutputStream.write(this.keyAlgorithm);
            byteArrayOutputStream.write(ANONYMOUS_SENDER);
            byteArrayOutputStream.write(bArr);
            return KDF(this.digCalc, eCPoint, getKeyLen(this.keyAlgorithm), byteArrayOutputStream.toByteArray());
        } catch (IOException e2) {
            throw new PGPException("Exception performing KDF: " + e2.getMessage(), e2);
        }
    }
}
