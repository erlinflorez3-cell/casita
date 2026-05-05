package org.spongycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.InputStreamPacket;
import org.spongycastle.bcpg.PublicKeyEncSessionPacket;
import org.spongycastle.bcpg.SymmetricEncIntegrityPacket;
import org.spongycastle.openpgp.PGPEncryptedData;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;
import org.spongycastle.openpgp.operator.PublicKeyDataDecryptorFactory;
import org.spongycastle.util.io.TeeInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class PGPPublicKeyEncryptedData extends PGPEncryptedData {
    PublicKeyEncSessionPacket keyData;

    PGPPublicKeyEncryptedData(PublicKeyEncSessionPacket publicKeyEncSessionPacket, InputStreamPacket inputStreamPacket) {
        super(inputStreamPacket);
        this.keyData = publicKeyEncSessionPacket;
    }

    private boolean confirmCheckSum(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 1; i3 != bArr.length - 2; i3++) {
            byte b2 = bArr[i3];
            i2 += (b2 + 255) - (b2 | 255);
        }
        return bArr[bArr.length + (-2)] == ((byte) (i2 >> 8)) && bArr[bArr.length - 1] == ((byte) i2);
    }

    public InputStream getDataStream(PublicKeyDataDecryptorFactory publicKeyDataDecryptorFactory) throws PGPException {
        byte[] bArrRecoverSessionData = publicKeyDataDecryptorFactory.recoverSessionData(this.keyData.getAlgorithm(), this.keyData.getEncSessionKey());
        if (!confirmCheckSum(bArrRecoverSessionData)) {
            throw new PGPKeyValidationException("key checksum failed");
        }
        if (bArrRecoverSessionData[0] == 0) {
            return this.encData.getInputStream();
        }
        try {
            boolean z2 = this.encData instanceof SymmetricEncIntegrityPacket;
            int length = bArrRecoverSessionData.length - 3;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrRecoverSessionData, 1, bArr, 0, length);
            byte b2 = bArrRecoverSessionData[0];
            PGPDataDecryptor pGPDataDecryptorCreateDataDecryptor = publicKeyDataDecryptorFactory.createDataDecryptor(z2, (b2 + 255) - (b2 | 255), bArr);
            this.encStream = new BCPGInputStream(pGPDataDecryptorCreateDataDecryptor.getInputStream(this.encData.getInputStream()));
            if (z2) {
                this.truncStream = new PGPEncryptedData.TruncatedStream(this.encStream);
                this.integrityCalculator = pGPDataDecryptorCreateDataDecryptor.getIntegrityCalculator();
                this.encStream = new TeeInputStream(this.truncStream, this.integrityCalculator.getOutputStream());
            }
            int blockSize = pGPDataDecryptorCreateDataDecryptor.getBlockSize();
            byte[] bArr2 = new byte[blockSize];
            for (int i2 = 0; i2 != blockSize; i2++) {
                int i3 = this.encStream.read();
                if (i3 < 0) {
                    throw new EOFException("unexpected end of stream.");
                }
                bArr2[i2] = (byte) i3;
            }
            int i4 = this.encStream.read();
            int i5 = this.encStream.read();
            if (i4 < 0 || i5 < 0) {
                throw new EOFException("unexpected end of stream.");
            }
            return this.encStream;
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception starting decryption", e3);
        }
    }

    public long getKeyID() {
        return this.keyData.getKeyID();
    }

    public int getSymmetricAlgorithm(PublicKeyDataDecryptorFactory publicKeyDataDecryptorFactory) throws PGPException {
        return publicKeyDataDecryptorFactory.recoverSessionData(this.keyData.getAlgorithm(), this.keyData.getEncSessionKey())[0];
    }
}
