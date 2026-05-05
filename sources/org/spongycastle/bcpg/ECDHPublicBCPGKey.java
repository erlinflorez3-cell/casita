package org.spongycastle.bcpg;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECDHPublicBCPGKey extends ECPublicBCPGKey {
    private byte hashFunctionId;
    private byte reserved;
    private byte symAlgorithmId;

    public ECDHPublicBCPGKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, ECPoint eCPoint, int i2, int i3) {
        super(aSN1ObjectIdentifier, eCPoint);
        this.reserved = (byte) 1;
        this.hashFunctionId = (byte) i2;
        this.symAlgorithmId = (byte) i3;
        verifyHashAlgorithm();
        verifySymmetricKeyAlgorithm();
    }

    public ECDHPublicBCPGKey(BCPGInputStream bCPGInputStream) throws IOException {
        super(bCPGInputStream);
        int i2 = bCPGInputStream.read();
        byte[] bArr = new byte[i2];
        if (i2 != 3) {
            throw new IllegalStateException("kdf parameters size of 3 expected.");
        }
        bCPGInputStream.readFully(bArr);
        this.reserved = bArr[0];
        this.hashFunctionId = bArr[1];
        this.symAlgorithmId = bArr[2];
        verifyHashAlgorithm();
        verifySymmetricKeyAlgorithm();
    }

    private void verifyHashAlgorithm() {
        switch (this.hashFunctionId) {
            case 8:
            case 9:
            case 10:
                return;
            default:
                throw new IllegalStateException("Hash algorithm must be SHA-256 or stronger.");
        }
    }

    private void verifySymmetricKeyAlgorithm() {
        byte b2 = this.symAlgorithmId;
        if (b2 != 7 && b2 != 8 && b2 != 9) {
            throw new IllegalStateException("Symmetric key algorithm must be AES-128 or stronger.");
        }
    }

    @Override // org.spongycastle.bcpg.ECPublicBCPGKey, org.spongycastle.bcpg.BCPGObject
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        super.encode(bCPGOutputStream);
        bCPGOutputStream.write(3);
        bCPGOutputStream.write(this.reserved);
        bCPGOutputStream.write(this.hashFunctionId);
        bCPGOutputStream.write(this.symAlgorithmId);
    }

    public byte getHashAlgorithm() {
        return this.hashFunctionId;
    }

    public byte getReserved() {
        return this.reserved;
    }

    public byte getSymmetricKeyAlgorithm() {
        return this.symAlgorithmId;
    }
}
