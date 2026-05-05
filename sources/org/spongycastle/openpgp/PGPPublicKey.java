package org.spongycastle.openpgp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.bcpg.BCPGKey;
import org.spongycastle.bcpg.BCPGOutputStream;
import org.spongycastle.bcpg.ContainedPacket;
import org.spongycastle.bcpg.DSAPublicBCPGKey;
import org.spongycastle.bcpg.ECPublicBCPGKey;
import org.spongycastle.bcpg.ElGamalPublicBCPGKey;
import org.spongycastle.bcpg.PublicKeyAlgorithmTags;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSAPublicBCPGKey;
import org.spongycastle.bcpg.TrustPacket;
import org.spongycastle.bcpg.UserAttributePacket;
import org.spongycastle.bcpg.UserIDPacket;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PGPPublicKey implements PublicKeyAlgorithmTags {
    private static final int[] MASTER_KEY_CERTIFICATION_TYPES = {19, 18, 17, 16};
    private byte[] fingerprint;
    List idSigs;
    List idTrusts;
    List ids;
    private long keyID;
    List keySigs;
    private int keyStrength;
    PublicKeyPacket publicPk;
    List subSigs;
    TrustPacket trustPk;

    PGPPublicKey(PublicKeyPacket publicKeyPacket, TrustPacket trustPacket, List list, List list2, List list3, List list4, KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException {
        this.keySigs = new ArrayList();
        this.ids = new ArrayList();
        this.idTrusts = new ArrayList();
        new ArrayList();
        this.subSigs = null;
        this.publicPk = publicKeyPacket;
        this.trustPk = trustPacket;
        this.keySigs = list;
        this.ids = list2;
        this.idTrusts = list3;
        this.idSigs = list4;
        init(keyFingerPrintCalculator);
    }

    PGPPublicKey(PublicKeyPacket publicKeyPacket, TrustPacket trustPacket, List list, KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException {
        this.keySigs = new ArrayList();
        this.ids = new ArrayList();
        this.idTrusts = new ArrayList();
        this.idSigs = new ArrayList();
        this.publicPk = publicKeyPacket;
        this.trustPk = trustPacket;
        this.subSigs = list;
        init(keyFingerPrintCalculator);
    }

    public PGPPublicKey(PublicKeyPacket publicKeyPacket, KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException {
        this.keySigs = new ArrayList();
        this.ids = new ArrayList();
        this.idTrusts = new ArrayList();
        this.idSigs = new ArrayList();
        this.subSigs = null;
        this.publicPk = publicKeyPacket;
        this.ids = new ArrayList();
        this.idSigs = new ArrayList();
        init(keyFingerPrintCalculator);
    }

    PGPPublicKey(PGPPublicKey pGPPublicKey) {
        this.keySigs = new ArrayList();
        this.ids = new ArrayList();
        this.idTrusts = new ArrayList();
        this.idSigs = new ArrayList();
        this.subSigs = null;
        this.publicPk = pGPPublicKey.publicPk;
        this.keySigs = new ArrayList(pGPPublicKey.keySigs);
        this.ids = new ArrayList(pGPPublicKey.ids);
        this.idTrusts = new ArrayList(pGPPublicKey.idTrusts);
        this.idSigs = new ArrayList(pGPPublicKey.idSigs.size());
        for (int i2 = 0; i2 != pGPPublicKey.idSigs.size(); i2++) {
            this.idSigs.add(new ArrayList((ArrayList) pGPPublicKey.idSigs.get(i2)));
        }
        if (pGPPublicKey.subSigs != null) {
            this.subSigs = new ArrayList(pGPPublicKey.subSigs.size());
            for (int i3 = 0; i3 != pGPPublicKey.subSigs.size(); i3++) {
                this.subSigs.add(pGPPublicKey.subSigs.get(i3));
            }
        }
        this.fingerprint = pGPPublicKey.fingerprint;
        this.keyID = pGPPublicKey.keyID;
        this.keyStrength = pGPPublicKey.keyStrength;
    }

    PGPPublicKey(PGPPublicKey pGPPublicKey, TrustPacket trustPacket, List list) {
        this.keySigs = new ArrayList();
        this.ids = new ArrayList();
        this.idTrusts = new ArrayList();
        this.idSigs = new ArrayList();
        this.subSigs = null;
        this.publicPk = pGPPublicKey.publicPk;
        this.trustPk = trustPacket;
        this.subSigs = list;
        this.fingerprint = pGPPublicKey.fingerprint;
        this.keyID = pGPPublicKey.keyID;
        this.keyStrength = pGPPublicKey.keyStrength;
    }

    private static PGPPublicKey addCert(PGPPublicKey pGPPublicKey, Object obj, PGPSignature pGPSignature) {
        PGPPublicKey pGPPublicKey2 = new PGPPublicKey(pGPPublicKey);
        List list = null;
        for (int i2 = 0; i2 != pGPPublicKey2.ids.size(); i2++) {
            if (obj.equals(pGPPublicKey2.ids.get(i2))) {
                list = (List) pGPPublicKey2.idSigs.get(i2);
            }
        }
        if (list != null) {
            list.add(pGPSignature);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(pGPSignature);
            pGPPublicKey2.ids.add(obj);
            pGPPublicKey2.idTrusts.add(null);
            pGPPublicKey2.idSigs.add(arrayList);
        }
        return pGPPublicKey2;
    }

    public static PGPPublicKey addCertification(PGPPublicKey pGPPublicKey, String str, PGPSignature pGPSignature) {
        return addCert(pGPPublicKey, new UserIDPacket(str), pGPSignature);
    }

    public static PGPPublicKey addCertification(PGPPublicKey pGPPublicKey, PGPSignature pGPSignature) {
        if (pGPPublicKey.isMasterKey()) {
            if (pGPSignature.getSignatureType() == 40) {
                throw new IllegalArgumentException("signature type incorrect for master key revocation.");
            }
        } else if (pGPSignature.getSignatureType() == 32) {
            throw new IllegalArgumentException("signature type incorrect for sub-key revocation.");
        }
        PGPPublicKey pGPPublicKey2 = new PGPPublicKey(pGPPublicKey);
        List list = pGPPublicKey2.subSigs;
        if (list != null) {
            list.add(pGPSignature);
        } else {
            pGPPublicKey2.keySigs.add(pGPSignature);
        }
        return pGPPublicKey2;
    }

    public static PGPPublicKey addCertification(PGPPublicKey pGPPublicKey, PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector, PGPSignature pGPSignature) {
        return addCert(pGPPublicKey, pGPUserAttributeSubpacketVector, pGPSignature);
    }

    public static PGPPublicKey addCertification(PGPPublicKey pGPPublicKey, byte[] bArr, PGPSignature pGPSignature) {
        return addCert(pGPPublicKey, new UserIDPacket(bArr), pGPSignature);
    }

    private long getExpirationTimeFromSig(boolean z2, int i2) {
        Iterator signaturesOfType = getSignaturesOfType(i2);
        long j2 = -1;
        while (signaturesOfType.hasNext()) {
            PGPSignature pGPSignature = (PGPSignature) signaturesOfType.next();
            if (!z2 || pGPSignature.getKeyID() == getKeyID()) {
                PGPSignatureSubpacketVector hashedSubPackets = pGPSignature.getHashedSubPackets();
                if (hashedSubPackets == null) {
                    return 0L;
                }
                long keyExpirationTime = hashedSubPackets.getKeyExpirationTime();
                if (keyExpirationTime == 0 || keyExpirationTime > j2) {
                    j2 = keyExpirationTime;
                }
            }
        }
        return j2;
    }

    private Iterator getSignaturesForID(UserIDPacket userIDPacket) {
        for (int i2 = 0; i2 != this.ids.size(); i2++) {
            if (userIDPacket.equals(this.ids.get(i2))) {
                return ((ArrayList) this.idSigs.get(i2)).iterator();
            }
        }
        return null;
    }

    private void init(KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException {
        BCPGKey key = this.publicPk.getKey();
        this.fingerprint = keyFingerPrintCalculator.calculateFingerprint(this.publicPk);
        if (this.publicPk.getVersion() <= 3) {
            RSAPublicBCPGKey rSAPublicBCPGKey = (RSAPublicBCPGKey) key;
            this.keyID = rSAPublicBCPGKey.getModulus().longValue();
            this.keyStrength = rSAPublicBCPGKey.getModulus().bitLength();
            return;
        }
        byte[] bArr = this.fingerprint;
        long j2 = ((long) ((-1) - (((-1) - bArr[bArr.length - 8]) | ((-1) - 255)))) << 56;
        byte b2 = bArr[bArr.length - 7];
        long j3 = ((long) ((b2 + 255) - (b2 | 255))) << 48;
        long j4 = (j2 + j3) - (j2 & j3);
        byte b3 = bArr[bArr.length - 6];
        long j5 = (-1) - (((-1) - j4) & ((-1) - (((long) ((b3 + 255) - (b3 | 255))) << 40)));
        byte b4 = bArr[bArr.length - 5];
        long j6 = (-1) - (((-1) - ((-1) - (((-1) - j5) & ((-1) - (((long) ((b4 + 255) - (b4 | 255))) << 32))))) & ((-1) - (((long) (bArr[bArr.length - 4] & 255)) << 24)));
        byte b5 = bArr[bArr.length - 3];
        long j7 = ((long) ((b5 + 255) - (b5 | 255))) << 16;
        long j8 = (-1) - (((-1) - ((j7 + j6) - (j7 & j6))) & ((-1) - (((long) (bArr[bArr.length - 2] & 255)) << 8)));
        byte b6 = bArr[bArr.length - 1];
        this.keyID = (-1) - (((-1) - j8) & ((-1) - ((long) ((b6 + 255) - (b6 | 255)))));
        if (key instanceof RSAPublicBCPGKey) {
            this.keyStrength = ((RSAPublicBCPGKey) key).getModulus().bitLength();
            return;
        }
        if (key instanceof DSAPublicBCPGKey) {
            this.keyStrength = ((DSAPublicBCPGKey) key).getP().bitLength();
        } else if (key instanceof ElGamalPublicBCPGKey) {
            this.keyStrength = ((ElGamalPublicBCPGKey) key).getP().bitLength();
        } else if (key instanceof ECPublicBCPGKey) {
            this.keyStrength = ECNamedCurveTable.getByOID(((ECPublicBCPGKey) key).getCurveOID()).getCurve().getFieldSize();
        }
    }

    private static PGPPublicKey removeCert(PGPPublicKey pGPPublicKey, Object obj) {
        PGPPublicKey pGPPublicKey2 = new PGPPublicKey(pGPPublicKey);
        boolean z2 = false;
        for (int i2 = 0; i2 < pGPPublicKey2.ids.size(); i2++) {
            if (obj.equals(pGPPublicKey2.ids.get(i2))) {
                pGPPublicKey2.ids.remove(i2);
                pGPPublicKey2.idTrusts.remove(i2);
                pGPPublicKey2.idSigs.remove(i2);
                z2 = true;
            }
        }
        if (z2) {
            return pGPPublicKey2;
        }
        return null;
    }

    private static PGPPublicKey removeCert(PGPPublicKey pGPPublicKey, Object obj, PGPSignature pGPSignature) {
        PGPPublicKey pGPPublicKey2 = new PGPPublicKey(pGPPublicKey);
        boolean zRemove = false;
        for (int i2 = 0; i2 < pGPPublicKey2.ids.size(); i2++) {
            if (obj.equals(pGPPublicKey2.ids.get(i2))) {
                zRemove = ((List) pGPPublicKey2.idSigs.get(i2)).remove(pGPSignature);
            }
        }
        if (zRemove) {
            return pGPPublicKey2;
        }
        return null;
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, String str) {
        return removeCert(pGPPublicKey, new UserIDPacket(str));
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, String str, PGPSignature pGPSignature) {
        return removeCert(pGPPublicKey, new UserIDPacket(str), pGPSignature);
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, PGPSignature pGPSignature) {
        PGPPublicKey pGPPublicKey2 = new PGPPublicKey(pGPPublicKey);
        List list = pGPPublicKey2.subSigs;
        boolean zRemove = list != null ? list.remove(pGPSignature) : pGPPublicKey2.keySigs.remove(pGPSignature);
        if (!zRemove) {
            Iterator userIDs = pGPPublicKey.getUserIDs();
            while (userIDs.hasNext()) {
                UserIDPacket userIDPacket = (UserIDPacket) userIDs.next();
                Iterator signaturesForID = pGPPublicKey.getSignaturesForID(userIDPacket);
                while (signaturesForID.hasNext()) {
                    if (pGPSignature == signaturesForID.next()) {
                        pGPPublicKey2 = removeCertification(pGPPublicKey2, userIDPacket.getRawID(), pGPSignature);
                        zRemove = true;
                    }
                }
            }
            if (!zRemove) {
                Iterator userAttributes = pGPPublicKey.getUserAttributes();
                while (userAttributes.hasNext()) {
                    PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector = (PGPUserAttributeSubpacketVector) userAttributes.next();
                    Iterator signaturesForUserAttribute = pGPPublicKey.getSignaturesForUserAttribute(pGPUserAttributeSubpacketVector);
                    while (signaturesForUserAttribute.hasNext()) {
                        if (pGPSignature == signaturesForUserAttribute.next()) {
                            pGPPublicKey2 = removeCertification(pGPPublicKey2, pGPUserAttributeSubpacketVector, pGPSignature);
                        }
                    }
                }
            }
        }
        return pGPPublicKey2;
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector) {
        return removeCert(pGPPublicKey, pGPUserAttributeSubpacketVector);
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector, PGPSignature pGPSignature) {
        return removeCert(pGPPublicKey, pGPUserAttributeSubpacketVector, pGPSignature);
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, byte[] bArr) {
        return removeCert(pGPPublicKey, new UserIDPacket(bArr));
    }

    public static PGPPublicKey removeCertification(PGPPublicKey pGPPublicKey, byte[] bArr, PGPSignature pGPSignature) {
        return removeCert(pGPPublicKey, new UserIDPacket(bArr), pGPSignature);
    }

    public void encode(OutputStream outputStream) throws IOException {
        BCPGOutputStream bCPGOutputStream = outputStream instanceof BCPGOutputStream ? (BCPGOutputStream) outputStream : new BCPGOutputStream(outputStream);
        bCPGOutputStream.writePacket(this.publicPk);
        TrustPacket trustPacket = this.trustPk;
        if (trustPacket != null) {
            bCPGOutputStream.writePacket(trustPacket);
        }
        if (this.subSigs != null) {
            for (int i2 = 0; i2 != this.subSigs.size(); i2++) {
                ((PGPSignature) this.subSigs.get(i2)).encode(bCPGOutputStream);
            }
            return;
        }
        for (int i3 = 0; i3 != this.keySigs.size(); i3++) {
            ((PGPSignature) this.keySigs.get(i3)).encode(bCPGOutputStream);
        }
        for (int i4 = 0; i4 != this.ids.size(); i4++) {
            if (this.ids.get(i4) instanceof UserIDPacket) {
                bCPGOutputStream.writePacket((UserIDPacket) this.ids.get(i4));
            } else {
                bCPGOutputStream.writePacket(new UserAttributePacket(((PGPUserAttributeSubpacketVector) this.ids.get(i4)).toSubpacketArray()));
            }
            if (this.idTrusts.get(i4) != null) {
                bCPGOutputStream.writePacket((ContainedPacket) this.idTrusts.get(i4));
            }
            List list = (List) this.idSigs.get(i4);
            for (int i5 = 0; i5 != list.size(); i5++) {
                ((PGPSignature) list.get(i5)).encode(bCPGOutputStream);
            }
        }
    }

    public int getAlgorithm() {
        return this.publicPk.getAlgorithm();
    }

    public int getBitStrength() {
        return this.keyStrength;
    }

    public Date getCreationTime() {
        return this.publicPk.getTime();
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getFingerprint() {
        byte[] bArr = this.fingerprint;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public long getKeyID() {
        return this.keyID;
    }

    public Iterator getKeySignatures() {
        List list = this.subSigs;
        if (list != null) {
            return list.iterator();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.keySigs);
        return arrayList.iterator();
    }

    public PublicKeyPacket getPublicKeyPacket() {
        return this.publicPk;
    }

    public Iterator getRawUserIDs() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 != this.ids.size(); i2++) {
            if (this.ids.get(i2) instanceof UserIDPacket) {
                arrayList.add(((UserIDPacket) this.ids.get(i2)).getRawID());
            }
        }
        return arrayList.iterator();
    }

    public Iterator getSignatures() {
        List list = this.subSigs;
        if (list != null) {
            return list.iterator();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.keySigs);
        for (int i2 = 0; i2 != this.idSigs.size(); i2++) {
            arrayList.addAll((Collection) this.idSigs.get(i2));
        }
        return arrayList.iterator();
    }

    public Iterator getSignaturesForID(String str) {
        return getSignaturesForID(new UserIDPacket(str));
    }

    public Iterator getSignaturesForID(byte[] bArr) {
        return getSignaturesForID(new UserIDPacket(bArr));
    }

    public Iterator getSignaturesForUserAttribute(PGPUserAttributeSubpacketVector pGPUserAttributeSubpacketVector) {
        for (int i2 = 0; i2 != this.ids.size(); i2++) {
            if (pGPUserAttributeSubpacketVector.equals(this.ids.get(i2))) {
                return ((ArrayList) this.idSigs.get(i2)).iterator();
            }
        }
        return null;
    }

    public Iterator getSignaturesOfType(int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator signatures = getSignatures();
        while (signatures.hasNext()) {
            PGPSignature pGPSignature = (PGPSignature) signatures.next();
            if (pGPSignature.getSignatureType() == i2) {
                arrayList.add(pGPSignature);
            }
        }
        return arrayList.iterator();
    }

    public byte[] getTrustData() {
        TrustPacket trustPacket = this.trustPk;
        if (trustPacket == null) {
            return null;
        }
        return Arrays.clone(trustPacket.getLevelAndTrustAmount());
    }

    public Iterator getUserAttributes() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 != this.ids.size(); i2++) {
            if (this.ids.get(i2) instanceof PGPUserAttributeSubpacketVector) {
                arrayList.add(this.ids.get(i2));
            }
        }
        return arrayList.iterator();
    }

    public Iterator getUserIDs() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 != this.ids.size(); i2++) {
            if (this.ids.get(i2) instanceof UserIDPacket) {
                arrayList.add(((UserIDPacket) this.ids.get(i2)).getID());
            }
        }
        return arrayList.iterator();
    }

    public int getValidDays() {
        if (this.publicPk.getVersion() <= 3) {
            return this.publicPk.getValidDays();
        }
        long validSeconds = getValidSeconds() % 86400;
        int validSeconds2 = (int) (getValidSeconds() / 86400);
        if (validSeconds <= 0 || validSeconds2 != 0) {
            return validSeconds2;
        }
        return 1;
    }

    public long getValidSeconds() {
        if (this.publicPk.getVersion() <= 3) {
            return ((long) this.publicPk.getValidDays()) * 86400;
        }
        int i2 = 0;
        if (isMasterKey()) {
            while (true) {
                int[] iArr = MASTER_KEY_CERTIFICATION_TYPES;
                if (i2 == iArr.length) {
                    break;
                }
                long expirationTimeFromSig = getExpirationTimeFromSig(true, iArr[i2]);
                if (expirationTimeFromSig >= 0) {
                    return expirationTimeFromSig;
                }
                i2++;
            }
        } else {
            long expirationTimeFromSig2 = getExpirationTimeFromSig(false, 24);
            if (expirationTimeFromSig2 >= 0) {
                return expirationTimeFromSig2;
            }
        }
        return 0L;
    }

    public int getVersion() {
        return this.publicPk.getVersion();
    }

    public boolean hasRevocation() {
        boolean z2 = false;
        if (isMasterKey()) {
            int i2 = 0;
            while (!z2 && i2 < this.keySigs.size()) {
                int i3 = i2 + 1;
                if (((PGPSignature) this.keySigs.get(i2)).getSignatureType() == 32) {
                    z2 = true;
                }
                i2 = i3;
            }
        } else {
            int i4 = 0;
            while (!z2 && i4 < this.subSigs.size()) {
                int i5 = i4 + 1;
                if (((PGPSignature) this.subSigs.get(i4)).getSignatureType() == 40) {
                    z2 = true;
                }
                i4 = i5;
            }
        }
        return z2;
    }

    public boolean isEncryptionKey() {
        int algorithm = this.publicPk.getAlgorithm();
        return algorithm == 1 || algorithm == 2 || algorithm == 16 || algorithm == 20 || algorithm == 18;
    }

    public boolean isMasterKey() {
        return this.subSigs == null;
    }

    public boolean isRevoked() {
        return hasRevocation();
    }
}
