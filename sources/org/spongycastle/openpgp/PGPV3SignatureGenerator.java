package org.spongycastle.openpgp;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.bcpg.OnePassSignaturePacket;
import org.spongycastle.bcpg.SignaturePacket;
import org.spongycastle.openpgp.operator.PGPContentSigner;
import org.spongycastle.openpgp.operator.PGPContentSignerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class PGPV3SignatureGenerator {
    private PGPContentSigner contentSigner;
    private PGPContentSignerBuilder contentSignerBuilder;
    private byte lastb;
    private int providedKeyAlgorithm = -1;
    private OutputStream sigOut;
    private int sigType;

    public PGPV3SignatureGenerator(PGPContentSignerBuilder pGPContentSignerBuilder) {
        this.contentSignerBuilder = pGPContentSignerBuilder;
    }

    private void blockUpdate(byte[] bArr, int i2, int i3) {
        try {
            this.sigOut.write(bArr, i2, i3);
        } catch (IOException e2) {
            throw new PGPRuntimeOperationException("unable to update signature: " + e2.getMessage(), e2);
        }
    }

    private void byteUpdate(byte b2) {
        try {
            this.sigOut.write(b2);
        } catch (IOException e2) {
            throw new PGPRuntimeOperationException("unable to update signature: " + e2.getMessage(), e2);
        }
    }

    public PGPSignature generate() throws PGPException {
        long time = new Date().getTime() / 1000;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.sigType);
        byteArrayOutputStream.write((byte) (time >> 24));
        byteArrayOutputStream.write((byte) (time >> 16));
        byteArrayOutputStream.write((byte) (time >> 8));
        byteArrayOutputStream.write((byte) time);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        blockUpdate(byteArray, 0, byteArray.length);
        MPInteger[] mPIntegerArrDsaSigToMpi = (this.contentSigner.getKeyAlgorithm() == 3 || this.contentSigner.getKeyAlgorithm() == 1) ? new MPInteger[]{new MPInteger(new BigInteger(1, this.contentSigner.getSignature()))} : PGPUtil.dsaSigToMpi(this.contentSigner.getSignature());
        byte[] digest = this.contentSigner.getDigest();
        return new PGPSignature(new SignaturePacket(3, this.contentSigner.getType(), this.contentSigner.getKeyID(), this.contentSigner.getKeyAlgorithm(), this.contentSigner.getHashAlgorithm(), time * 1000, new byte[]{digest[0], digest[1]}, mPIntegerArrDsaSigToMpi));
    }

    public PGPOnePassSignature generateOnePassVersion(boolean z2) throws PGPException {
        return new PGPOnePassSignature(new OnePassSignaturePacket(this.sigType, this.contentSigner.getHashAlgorithm(), this.contentSigner.getKeyAlgorithm(), this.contentSigner.getKeyID(), z2));
    }

    public void init(int i2, PGPPrivateKey pGPPrivateKey) throws PGPException {
        PGPContentSigner pGPContentSignerBuild = this.contentSignerBuilder.build(i2, pGPPrivateKey);
        this.contentSigner = pGPContentSignerBuild;
        this.sigOut = pGPContentSignerBuild.getOutputStream();
        this.sigType = this.contentSigner.getType();
        this.lastb = (byte) 0;
        int i3 = this.providedKeyAlgorithm;
        if (i3 >= 0 && i3 != this.contentSigner.getKeyAlgorithm()) {
            throw new PGPException("key algorithm mismatch");
        }
    }

    public void update(byte b2) {
        if (this.sigType != 1) {
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
        update(bArr, 0, bArr.length);
    }

    public void update(byte[] bArr, int i2, int i3) {
        if (this.sigType != 1) {
            blockUpdate(bArr, i2, i3);
            return;
        }
        int i4 = i3 + i2;
        while (i2 != i4) {
            update(bArr[i2]);
            i2++;
        }
    }
}
