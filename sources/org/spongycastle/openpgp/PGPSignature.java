package org.spongycastle.openpgp;

import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.BCPGOutputStream;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.bcpg.SignaturePacket;
import org.spongycastle.bcpg.SignatureSubpacket;
import org.spongycastle.bcpg.TrustPacket;
import org.spongycastle.bcpg.UserAttributeSubpacket;
import org.spongycastle.openpgp.operator.PGPContentVerifier;
import org.spongycastle.openpgp.operator.PGPContentVerifierBuilderProvider;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class PGPSignature {
    public static final int BINARY_DOCUMENT = 0;
    public static final int CANONICAL_TEXT_DOCUMENT = 1;
    public static final int CASUAL_CERTIFICATION = 18;
    public static final int CERTIFICATION_REVOCATION = 48;
    public static final int DEFAULT_CERTIFICATION = 16;
    public static final int DIRECT_KEY = 31;
    public static final int KEY_REVOCATION = 32;
    public static final int NO_CERTIFICATION = 17;
    public static final int POSITIVE_CERTIFICATION = 19;
    public static final int PRIMARYKEY_BINDING = 25;
    public static final int STAND_ALONE = 2;
    public static final int SUBKEY_BINDING = 24;
    public static final int SUBKEY_REVOCATION = 40;
    public static final int TIMESTAMP = 64;
    private byte lastb;
    private OutputStream sigOut;
    private SignaturePacket sigPck;
    private int signatureType;
    private TrustPacket trustPck;
    private PGPContentVerifier verifier;

    PGPSignature(BCPGInputStream bCPGInputStream) throws PGPException, IOException {
        this((SignaturePacket) bCPGInputStream.readPacket());
    }

    PGPSignature(SignaturePacket signaturePacket) throws PGPException {
        this.sigPck = signaturePacket;
        this.signatureType = signaturePacket.getSignatureType();
        this.trustPck = null;
    }

    PGPSignature(SignaturePacket signaturePacket, TrustPacket trustPacket) throws PGPException {
        this(signaturePacket);
        this.trustPck = trustPacket;
    }

    private void addTrailer() {
        try {
            this.sigOut.write(this.sigPck.getSignatureTrailer());
            this.sigOut.close();
        } catch (IOException e2) {
            throw new PGPRuntimeOperationException(e2.getMessage(), e2);
        }
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

    private PGPSignatureSubpacketVector createSubpacketVector(SignatureSubpacket[] signatureSubpacketArr) {
        if (signatureSubpacketArr != null) {
            return new PGPSignatureSubpacketVector(signatureSubpacketArr);
        }
        return null;
    }

    private byte[] getEncodedPublicKey(PGPPublicKey pGPPublicKey) throws PGPException {
        try {
            return pGPPublicKey.publicPk.getEncodedContents();
        } catch (IOException e2) {
            throw new PGPException("exception preparing key.", e2);
        }
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

    public void encode(OutputStream outputStream) throws IOException {
        BCPGOutputStream bCPGOutputStream = outputStream instanceof BCPGOutputStream ? (BCPGOutputStream) outputStream : new BCPGOutputStream(outputStream);
        bCPGOutputStream.writePacket(this.sigPck);
        TrustPacket trustPacket = this.trustPck;
        if (trustPacket != null) {
            bCPGOutputStream.writePacket(trustPacket);
        }
    }

    public Date getCreationTime() {
        return new Date(this.sigPck.getCreationTime());
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int getHashAlgorithm() {
        return this.sigPck.getHashAlgorithm();
    }

    public PGPSignatureSubpacketVector getHashedSubPackets() {
        return createSubpacketVector(this.sigPck.getHashedSubPackets());
    }

    public int getKeyAlgorithm() {
        return this.sigPck.getKeyAlgorithm();
    }

    public long getKeyID() {
        return this.sigPck.getKeyID();
    }

    public byte[] getSignature() throws PGPException {
        MPInteger[] signature = this.sigPck.getSignature();
        if (signature == null) {
            return this.sigPck.getSignatureBytes();
        }
        if (signature.length == 1) {
            return BigIntegers.asUnsignedByteArray(signature[0].getValue());
        }
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(signature[0].getValue()));
            aSN1EncodableVector.add(new ASN1Integer(signature[1].getValue()));
            return new DERSequence(aSN1EncodableVector).getEncoded();
        } catch (IOException e2) {
            throw new PGPException("exception encoding DSA sig.", e2);
        }
    }

    public byte[] getSignatureTrailer() {
        return this.sigPck.getSignatureTrailer();
    }

    public int getSignatureType() {
        return this.sigPck.getSignatureType();
    }

    public PGPSignatureSubpacketVector getUnhashedSubPackets() {
        return createSubpacketVector(this.sigPck.getUnhashedSubPackets());
    }

    public int getVersion() {
        return this.sigPck.getVersion();
    }

    public boolean hasSubpackets() {
        return (this.sigPck.getHashedSubPackets() == null && this.sigPck.getUnhashedSubPackets() == null) ? false : true;
    }

    public void init(PGPContentVerifierBuilderProvider pGPContentVerifierBuilderProvider, PGPPublicKey pGPPublicKey) throws PGPException {
        PGPContentVerifier pGPContentVerifierBuild = pGPContentVerifierBuilderProvider.get(this.sigPck.getKeyAlgorithm(), this.sigPck.getHashAlgorithm()).build(pGPPublicKey);
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
        update(bArr, 0, bArr.length);
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

    public boolean verify() throws PGPException {
        try {
            this.sigOut.write(getSignatureTrailer());
            this.sigOut.close();
            return this.verifier.verify(getSignature());
        } catch (IOException e2) {
            throw new PGPException(e2.getMessage(), e2);
        }
    }

    public boolean verifyCertification(String str, PGPPublicKey pGPPublicKey) throws PGPException {
        if (this.verifier == null) {
            throw new PGPException("PGPSignature not initialised - call init().");
        }
        updateWithPublicKey(pGPPublicKey);
        updateWithIdData(180, Strings.toUTF8ByteArray(str));
        addTrailer();
        return this.verifier.verify(getSignature());
    }

    public boolean verifyCertification(PGPPublicKey pGPPublicKey) throws PGPException {
        if (this.verifier == null) {
            throw new PGPException("PGPSignature not initialised - call init().");
        }
        if (getSignatureType() != 32 && getSignatureType() != 40 && getSignatureType() != 31) {
            throw new PGPException("signature is not a key signature");
        }
        updateWithPublicKey(pGPPublicKey);
        addTrailer();
        return this.verifier.verify(getSignature());
    }

    public boolean verifyCertification(PGPPublicKey pGPPublicKey, PGPPublicKey pGPPublicKey2) throws PGPException {
        if (this.verifier == null) {
            throw new PGPException("PGPSignature not initialised - call init().");
        }
        updateWithPublicKey(pGPPublicKey);
        updateWithPublicKey(pGPPublicKey2);
        addTrailer();
        return this.verifier.verify(getSignature());
    }

    public boolean verifyCertification(PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector, PGPPublicKey pGPPublicKey) throws PGPException {
        if (this.verifier == null) {
            throw new PGPException("PGPSignature not initialised - call init().");
        }
        updateWithPublicKey(pGPPublicKey);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            UserAttributeSubpacket[] subpacketArray = pGPUserAttributeSubpacketVector.toSubpacketArray();
            for (int i2 = 0; i2 != subpacketArray.length; i2++) {
                subpacketArray[i2].encode(byteArrayOutputStream);
            }
            updateWithIdData(Mp4VideoDirectory.TAG_DEPTH, byteArrayOutputStream.toByteArray());
            addTrailer();
            return this.verifier.verify(getSignature());
        } catch (IOException e2) {
            throw new PGPException("cannot encode subpacket array", e2);
        }
    }

    public boolean verifyCertification(byte[] bArr, PGPPublicKey pGPPublicKey) throws PGPException {
        if (this.verifier == null) {
            throw new PGPException("PGPSignature not initialised - call init().");
        }
        updateWithPublicKey(pGPPublicKey);
        updateWithIdData(180, bArr);
        addTrailer();
        return this.verifier.verify(getSignature());
    }
}
