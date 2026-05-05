package org.spongycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.InputStreamPacket;
import org.spongycastle.bcpg.SymmetricEncIntegrityPacket;
import org.spongycastle.bcpg.SymmetricKeyEncSessionPacket;
import org.spongycastle.openpgp.PGPEncryptedData;
import org.spongycastle.openpgp.operator.PBEDataDecryptorFactory;
import org.spongycastle.openpgp.operator.PGPDataDecryptor;
import org.spongycastle.util.io.TeeInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class PGPPBEEncryptedData extends PGPEncryptedData {
    SymmetricKeyEncSessionPacket keyData;

    PGPPBEEncryptedData(SymmetricKeyEncSessionPacket symmetricKeyEncSessionPacket, InputStreamPacket inputStreamPacket) {
        super(inputStreamPacket);
        this.keyData = symmetricKeyEncSessionPacket;
    }

    public InputStream getDataStream(PBEDataDecryptorFactory pBEDataDecryptorFactory) throws PGPException {
        try {
            byte[] bArrMakeKeyFromPassPhrase = pBEDataDecryptorFactory.makeKeyFromPassPhrase(this.keyData.getEncAlgorithm(), this.keyData.getS2K());
            boolean z2 = this.encData instanceof SymmetricEncIntegrityPacket;
            byte[] bArrRecoverSessionData = pBEDataDecryptorFactory.recoverSessionData(this.keyData.getEncAlgorithm(), bArrMakeKeyFromPassPhrase, this.keyData.getSecKeyData());
            int length = bArrRecoverSessionData.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(bArrRecoverSessionData, 1, bArr, 0, length);
            PGPDataDecryptor pGPDataDecryptorCreateDataDecryptor = pBEDataDecryptorFactory.createDataDecryptor(z2, (-1) - (((-1) - bArrRecoverSessionData[0]) | ((-1) - 255)), bArr);
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
            boolean z3 = bArr2[blockSize + (-2)] == ((byte) i4) && bArr2[blockSize - 1] == ((byte) i5);
            boolean z4 = i4 == 0 && i5 == 0;
            if (!z3 && !z4) {
                throw new PGPDataValidationException("data check failed.");
            }
            return this.encStream;
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception creating cipher", e3);
        }
    }

    public int getSymmetricAlgorithm(PBEDataDecryptorFactory pBEDataDecryptorFactory) throws PGPException {
        return pBEDataDecryptorFactory.recoverSessionData(this.keyData.getEncAlgorithm(), pBEDataDecryptorFactory.makeKeyFromPassPhrase(this.keyData.getEncAlgorithm(), this.keyData.getS2K()), this.keyData.getSecKeyData())[0];
    }
}
