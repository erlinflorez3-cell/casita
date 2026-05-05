package org.spongycastle.openpgp;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.BCPGOutputStream;
import org.spongycastle.bcpg.OnePassSignaturePacket;
import org.spongycastle.openpgp.operator.PGPContentVerifier;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider;

/* JADX INFO: loaded from: classes2.dex */
public class PGPOnePassSignature {
    private byte lastb;
    private OutputStream sigOut;
    private OnePassSignaturePacket sigPack;
    private int signatureType;
    private PGPContentVerifier verifier;

    PGPOnePassSignature(BCPGInputStream bCPGInputStream) throws PGPException, IOException {
        this((OnePassSignaturePacket) bCPGInputStream.readPacket());
    }

    PGPOnePassSignature(OnePassSignaturePacket onePassSignaturePacket) throws PGPException {
        this.sigPack = onePassSignaturePacket;
        this.signatureType = onePassSignaturePacket.getSignatureType();
    }

    private void blockUpdate(byte[] bArr, int i2, int i3) {
        try {
            this.sigOut.write(bArr, i2, i3);
        } catch (IOException e2) {
            throw new PGPRuntimeOperationException(e2.getMessage(), e2);
        }
    }

    private void byteUpdate(byte b2) {
        try {
            this.sigOut.write(b2);
        } catch (IOException e2) {
            throw new PGPRuntimeOperationException(e2.getMessage(), e2);
        }
    }

    public void encode(OutputStream outputStream) throws IOException {
        (outputStream instanceof BCPGOutputStream ? (BCPGOutputStream) outputStream : new BCPGOutputStream(outputStream)).writePacket(this.sigPack);
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int getHashAlgorithm() {
        return this.sigPack.getHashAlgorithm();
    }

    public int getKeyAlgorithm() {
        return this.sigPack.getKeyAlgorithm();
    }

    public long getKeyID() {
        return this.sigPack.getKeyID();
    }

    public int getSignatureType() {
        return this.sigPack.getSignatureType();
    }

    public void init(PGPContentVerifierBuilderProvider pGPContentVerifierBuilderProvider, PGPPublicKey pGPPublicKey) throws PGPException {
        PGPContentVerifier pGPContentVerifierBuild = pGPContentVerifierBuilderProvider.get(this.sigPack.getKeyAlgorithm(), this.sigPack.getHashAlgorithm()).build(pGPPublicKey);
        this.verifier = pGPContentVerifierBuild;
        this.lastb = (byte) 0;
        this.sigOut = pGPContentVerifierBuild.getOutputStream();
    }

    public void update(byte b2) {
        if (this.signatureType != 1) {
            byteUpdate(b2);
            return;
        }
        if (b2 == 13) {
            byteUpdate(Ascii.CR);
            byteUpdate((byte) 10);
        } else if (b2 != 10) {
            byteUpdate(b2);
        } else if (this.lastb != 13) {
            byteUpdate(Ascii.CR);
            byteUpdate((byte) 10);
        }
        this.lastb = b2;
    }

    public void update(byte[] bArr) {
        if (this.signatureType != 1) {
            blockUpdate(bArr, 0, bArr.length);
            return;
        }
        for (int i2 = 0; i2 != bArr.length; i2++) {
            update(bArr[i2]);
        }
    }

    public void update(byte[] bArr, int i2, int i3) {
        if (this.signatureType != 1) {
            blockUpdate(bArr, i2, i3);
            return;
        }
        int i4 = i3 + i2;
        while (i2 != i4) {
            update(bArr[i2]);
            i2++;
        }
    }

    public boolean verify(PGPSignature pGPSignature) throws PGPException {
        try {
            this.sigOut.write(pGPSignature.getSignatureTrailer());
            this.sigOut.close();
            return this.verifier.verify(pGPSignature.getSignature());
        } catch (IOException e2) {
            throw new PGPException("unable to add trailer: " + e2.getMessage(), e2);
        }
    }
}
