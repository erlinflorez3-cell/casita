package org.spongycastle.openpgp;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.bcpg.OnePassSignaturePacket;
import org.spongycastle.bcpg.SignaturePacket;
import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.bcpg.UserAttributeSubpacket;
import org.spongycastle.bcpg.sig.IssuerKeyID;
import org.spongycastle.bcpg.sig.SignatureCreationTime;
import org.spongycastle.openpgp.operator.PGPContentSigner;
import org.spongycastle.openpgp.operator.PGPContentSignerBuilder;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class PGPSignatureGenerator {
    private PGPContentSigner contentSigner;
    private PGPContentSignerBuilder contentSignerBuilder;
    private byte lastb;
    private OutputStream sigOut;
    private int sigType;
    private SignatureSubpacket[] unhashed = new SignatureSubpacket[0];
    private SignatureSubpacket[] hashed = new SignatureSubpacket[0];
    private int providedKeyAlgorithm = -1;

    public PGPSignatureGenerator(PGPContentSignerBuilder pGPContentSignerBuilder) {
        this.contentSignerBuilder = pGPContentSignerBuilder;
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

    private byte[] getEncodedPublicKey(PGPPublicKey pGPPublicKey) throws PGPException {
        try {
            return pGPPublicKey.publicPk.getEncodedContents();
        } catch (IOException e2) {
            throw new PGPException("exception preparing key.", e2);
        }
    }

    private SignatureSubpacket[] insertSubpacket(SignatureSubpacket[] signatureSubpacketArr, SignatureSubpacket signatureSubpacket) {
        SignatureSubpacket[] signatureSubpacketArr2 = new SignatureSubpacket[signatureSubpacketArr.length + 1];
        signatureSubpacketArr2[0] = signatureSubpacket;
        System.arraycopy(signatureSubpacketArr, 0, signatureSubpacketArr2, 1, signatureSubpacketArr.length);
        return signatureSubpacketArr2;
    }

    private boolean packetPresent(SignatureSubpacket[] signatureSubpacketArr, int i2) {
        for (int i3 = 0; i3 != signatureSubpacketArr.length; i3++) {
            if (signatureSubpacketArr[i3].getType() == i2) {
                return true;
            }
        }
        return false;
    }

    private void updateWithIdData(int i2, byte[] bArr) {
        update((byte) i2);
        update((byte) (bArr.length >> 24));
        update((byte) (bArr.length >> 16));
        update((byte) (bArr.length >> 8));
        update((byte) bArr.length);
        update(bArr);
    }

    private void updateWithPublicKey(PGPPublicKey pGPPublicKey) throws PGPException {
        byte[] encodedPublicKey = getEncodedPublicKey(pGPPublicKey);
        update((byte) -103);
        update((byte) (encodedPublicKey.length >> 8));
        update((byte) encodedPublicKey.length);
        update(encodedPublicKey);
    }

    public PGPSignature generate() throws PGPException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        SignatureSubpacket[] signatureSubpacketArrInsertSubpacket = !packetPresent(this.hashed, 2) ? insertSubpacket(this.hashed, new SignatureCreationTime(false, new Date())) : this.hashed;
        SignatureSubpacket[] signatureSubpacketArrInsertSubpacket2 = (packetPresent(this.hashed, 16) || packetPresent(this.unhashed, 16)) ? this.unhashed : insertSubpacket(this.unhashed, new IssuerKeyID(false, this.contentSigner.getKeyID()));
        byte b2 = (byte) 4;
        try {
            byteArrayOutputStream.write(b2);
            byteArrayOutputStream.write((byte) this.sigType);
            byteArrayOutputStream.write((byte) this.contentSigner.getKeyAlgorithm());
            byteArrayOutputStream.write((byte) this.contentSigner.getHashAlgorithm());
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            for (int i2 = 0; i2 != signatureSubpacketArrInsertSubpacket.length; i2++) {
                signatureSubpacketArrInsertSubpacket[i2].encode(byteArrayOutputStream2);
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream.write((byte) (byteArray.length >> 8));
            byteArrayOutputStream.write((byte) byteArray.length);
            byteArrayOutputStream.write(byteArray);
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.write(b2);
            byteArrayOutputStream.write(-1);
            byteArrayOutputStream.write((byte) (byteArray2.length >> 24));
            byteArrayOutputStream.write((byte) (byteArray2.length >> 16));
            byteArrayOutputStream.write((byte) (byteArray2.length >> 8));
            byteArrayOutputStream.write((byte) byteArray2.length);
            byte[] byteArray3 = byteArrayOutputStream.toByteArray();
            blockUpdate(byteArray3, 0, byteArray3.length);
            MPInteger[] mPIntegerArrDsaSigToMpi = (this.contentSigner.getKeyAlgorithm() == 3 || this.contentSigner.getKeyAlgorithm() == 1) ? new MPInteger[]{new MPInteger(new BigInteger(1, this.contentSigner.getSignature()))} : PGPUtil.dsaSigToMpi(this.contentSigner.getSignature());
            byte[] digest = this.contentSigner.getDigest();
            return new PGPSignature(new SignaturePacket(this.sigType, this.contentSigner.getKeyID(), this.contentSigner.getKeyAlgorithm(), this.contentSigner.getHashAlgorithm(), signatureSubpacketArrInsertSubpacket, signatureSubpacketArrInsertSubpacket2, new byte[]{digest[0], digest[1]}, mPIntegerArrDsaSigToMpi));
        } catch (IOException e2) {
            throw new PGPException("exception encoding hashed data.", e2);
        }
    }

    public PGPSignature generateCertification(String str, PGPPublicKey pGPPublicKey) throws PGPException {
        updateWithPublicKey(pGPPublicKey);
        updateWithIdData(180, Strings.toUTF8ByteArray(str));
        return generate();
    }

    public PGPSignature generateCertification(PGPPublicKey pGPPublicKey) throws PGPException {
        int i2 = this.sigType;
        if ((i2 == 40 || i2 == 24) && !pGPPublicKey.isMasterKey()) {
            throw new IllegalArgumentException("certifications involving subkey requires public key of revoking key as well.");
        }
        updateWithPublicKey(pGPPublicKey);
        return generate();
    }

    public PGPSignature generateCertification(PGPPublicKey pGPPublicKey, PGPPublicKey pGPPublicKey2) throws PGPException {
        updateWithPublicKey(pGPPublicKey);
        updateWithPublicKey(pGPPublicKey2);
        return generate();
    }

    public PGPSignature generateCertification(PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector, PGPPublicKey pGPPublicKey) throws PGPException {
        updateWithPublicKey(pGPPublicKey);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            UserAttributeSubpacket[] subpacketArray = pGPUserAttributeSubpacketVector.toSubpacketArray();
            for (int i2 = 0; i2 != subpacketArray.length; i2++) {
                subpacketArray[i2].encode(byteArrayOutputStream);
            }
            updateWithIdData(Mp4VideoDirectory.TAG_DEPTH, byteArrayOutputStream.toByteArray());
            return generate();
        } catch (IOException e2) {
            throw new PGPException("cannot encode subpacket array", e2);
        }
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

    public void setHashedSubpackets(PGPSignatureSubpacketVector pGPSignatureSubpacketVector) {
        if (pGPSignatureSubpacketVector == null) {
            this.hashed = new SignatureSubpacket[0];
        } else {
            this.hashed = pGPSignatureSubpacketVector.toSubpacketArray();
        }
    }

    public void setUnhashedSubpackets(PGPSignatureSubpacketVector pGPSignatureSubpacketVector) {
        if (pGPSignatureSubpacketVector == null) {
            this.unhashed = new SignatureSubpacket[0];
        } else {
            this.unhashed = pGPSignatureSubpacketVector.toSubpacketArray();
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
