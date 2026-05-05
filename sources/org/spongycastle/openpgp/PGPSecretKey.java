package org.spongycastle.openpgp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.BCPGObject;
import org.spongycastle.bcpg.BCPGOutputStream;
import org.spongycastle.bcpg.ContainedPacket;
import org.spongycastle.bcpg.DSASecretBCPGKey;
import org.spongycastle.bcpg.ECDSAPublicBCPGKey;
import org.spongycastle.bcpg.ECSecretBCPGKey;
import org.spongycastle.bcpg.ElGamalSecretBCPGKey;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.RSASecretBCPGKey;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.bcpg.SecretKeyPacket;
import org.spongycastle.bcpg.SecretSubkeyPacket;
import org.spongycastle.bcpg.UserAttributePacket;
import org.spongycastle.bcpg.UserIDPacket;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.openpgp.operator.PBEProtectionRemoverFactory;
import org.spongycastle.openpgp.operator.PBESecretKeyDecryptor;
import org.spongycastle.openpgp.operator.PBESecretKeyEncryptor;
import org.spongycastle.openpgp.operator.PGPContentSignerBuilder;
import org.spongycastle.openpgp.operator.PGPDigestCalculator;

/* JADX INFO: loaded from: classes2.dex */
public class PGPSecretKey {
    PGPPublicKey pub;
    SecretKeyPacket secret;

    public PGPSecretKey(int i2, PGPKeyPair pGPKeyPair, String str, PGPSignatureSubpacketVector pGPSignatureSubpacketVector, PGPSignatureSubpacketVector pGPSignatureSubpacketVector2, PGPContentSignerBuilder pGPContentSignerBuilder, PBESecretKeyEncryptor pBESecretKeyEncryptor) throws PGPException {
        this(i2, pGPKeyPair, str, null, pGPSignatureSubpacketVector, pGPSignatureSubpacketVector2, pGPContentSignerBuilder, pBESecretKeyEncryptor);
    }

    public PGPSecretKey(int i2, PGPKeyPair pGPKeyPair, String str, PGPDigestCalculator pGPDigestCalculator, PGPSignatureSubpacketVector pGPSignatureSubpacketVector, PGPSignatureSubpacketVector pGPSignatureSubpacketVector2, PGPContentSignerBuilder pGPContentSignerBuilder, PBESecretKeyEncryptor pBESecretKeyEncryptor) throws PGPException {
        this(pGPKeyPair.getPrivateKey(), certifiedPublicKey(i2, pGPKeyPair, str, pGPSignatureSubpacketVector, pGPSignatureSubpacketVector2, pGPContentSignerBuilder), pGPDigestCalculator, true, pBESecretKeyEncryptor);
    }

    PGPSecretKey(SecretKeyPacket secretKeyPacket, PGPPublicKey pGPPublicKey) {
        this.secret = secretKeyPacket;
        this.pub = pGPPublicKey;
    }

    PGPSecretKey(PGPPrivateKey pGPPrivateKey, PGPPublicKey pGPPublicKey, PGPDigestCalculator pGPDigestCalculator, PBESecretKeyEncryptor pBESecretKeyEncryptor) throws PGPException {
        this(pGPPrivateKey, pGPPublicKey, pGPDigestCalculator, false, pBESecretKeyEncryptor);
    }

    public PGPSecretKey(PGPPrivateKey pGPPrivateKey, PGPPublicKey pGPPublicKey, PGPDigestCalculator pGPDigestCalculator, boolean z2, PBESecretKeyEncryptor pBESecretKeyEncryptor) throws PGPException {
        this.pub = pGPPublicKey;
        this.secret = buildSecretKeyPacket(z2, pGPPrivateKey, pGPPublicKey, pBESecretKeyEncryptor, pGPDigestCalculator);
    }

    private static SecretKeyPacket buildSecretKeyPacket(boolean z2, PGPPrivateKey pGPPrivateKey, PGPPublicKey pGPPublicKey, PBESecretKeyEncryptor pBESecretKeyEncryptor, PGPDigestCalculator pGPDigestCalculator) throws PGPException {
        int i2;
        BCPGObject bCPGObject = (BCPGObject) pGPPrivateKey.getPrivateKeyDataPacket();
        if (bCPGObject == null) {
            return z2 ? new SecretKeyPacket(pGPPublicKey.publicPk, 0, null, null, new byte[0]) : new SecretSubkeyPacket(pGPPublicKey.publicPk, 0, null, null, new byte[0]);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BCPGOutputStream bCPGOutputStream = new BCPGOutputStream(byteArrayOutputStream);
            bCPGOutputStream.writeObject(bCPGObject);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bCPGOutputStream.write(checksum(pGPDigestCalculator, byteArray, byteArray.length));
            int algorithm = pBESecretKeyEncryptor != null ? pBESecretKeyEncryptor.getAlgorithm() : 0;
            if (algorithm == 0) {
                return z2 ? new SecretKeyPacket(pGPPublicKey.publicPk, algorithm, null, null, byteArrayOutputStream.toByteArray()) : new SecretSubkeyPacket(pGPPublicKey.publicPk, algorithm, null, null, byteArrayOutputStream.toByteArray());
            }
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            byte[] bArrEncryptKeyData = pBESecretKeyEncryptor.encryptKeyData(byteArray2, 0, byteArray2.length);
            byte[] cipherIV = pBESecretKeyEncryptor.getCipherIV();
            S2K s2k = pBESecretKeyEncryptor.getS2K();
            if (pGPDigestCalculator == null) {
                i2 = 255;
            } else {
                if (pGPDigestCalculator.getAlgorithm() != 2) {
                    throw new PGPException("only SHA1 supported for key checksum calculations.");
                }
                i2 = 254;
            }
            return z2 ? new SecretKeyPacket(pGPPublicKey.publicPk, algorithm, i2, s2k, cipherIV, bArrEncryptKeyData) : new SecretSubkeyPacket(pGPPublicKey.publicPk, algorithm, i2, s2k, cipherIV, bArrEncryptKeyData);
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception encrypting key", e3);
        }
    }

    private static PGPPublicKey certifiedPublicKey(int i2, PGPKeyPair pGPKeyPair, String str, PGPSignatureSubpacketVector pGPSignatureSubpacketVector, PGPSignatureSubpacketVector pGPSignatureSubpacketVector2, PGPContentSignerBuilder pGPContentSignerBuilder) throws PGPException {
        try {
            PGPSignatureGenerator pGPSignatureGenerator = new PGPSignatureGenerator(pGPContentSignerBuilder);
            pGPSignatureGenerator.init(i2, pGPKeyPair.getPrivateKey());
            pGPSignatureGenerator.setHashedSubpackets(pGPSignatureSubpacketVector);
            pGPSignatureGenerator.setUnhashedSubpackets(pGPSignatureSubpacketVector2);
            try {
                return PGPPublicKey.addCertification(pGPKeyPair.getPublicKey(), str, pGPSignatureGenerator.generateCertification(str, pGPKeyPair.getPublicKey()));
            } catch (Exception e2) {
                throw new PGPException("exception doing certification: " + e2, e2);
            }
        } catch (Exception e3) {
            throw new PGPException("creating signature generator: " + e3, e3);
        }
    }

    private static byte[] checksum(PGPDigestCalculator pGPDigestCalculator, byte[] bArr, int i2) throws PGPException {
        if (pGPDigestCalculator != null) {
            OutputStream outputStream = pGPDigestCalculator.getOutputStream();
            try {
                outputStream.write(bArr, 0, i2);
                outputStream.close();
                return pGPDigestCalculator.getDigest();
            } catch (Exception e2) {
                throw new PGPException("checksum digest calculation failed: " + e2.getMessage(), e2);
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 != i2; i4++) {
            i3 += bArr[i4] & 255;
        }
        return new byte[]{(byte) (i3 >> 8), (byte) i3};
    }

    public static PGPSecretKey copyWithNewPassword(PGPSecretKey pGPSecretKey, PBESecretKeyDecryptor pBESecretKeyDecryptor, PBESecretKeyEncryptor pBESecretKeyEncryptor) throws PGPException {
        byte[] cipherIV;
        byte[] bArrEncryptKeyData;
        byte[] bArrEncryptKeyData2;
        if (pGPSecretKey.isPrivateKeyEmpty()) {
            throw new PGPException("no private key in this SecretKey - public key present only.");
        }
        byte[] bArrExtractKeyData = pGPSecretKey.extractKeyData(pBESecretKeyDecryptor);
        int s2KUsage = pGPSecretKey.secret.getS2KUsage();
        S2K s2k = null;
        byte[] cipherIV2 = null;
        int algorithm = 0;
        if (pBESecretKeyEncryptor == null || pBESecretKeyEncryptor.getAlgorithm() == 0) {
            if (pGPSecretKey.secret.getS2KUsage() == 254) {
                int length = bArrExtractKeyData.length;
                bArrEncryptKeyData = new byte[length - 18];
                int i2 = length - 20;
                System.arraycopy(bArrExtractKeyData, 0, bArrEncryptKeyData, 0, i2);
                byte[] bArrChecksum = checksum(null, bArrEncryptKeyData, i2);
                bArrEncryptKeyData[i2] = bArrChecksum[0];
                bArrEncryptKeyData[length - 19] = bArrChecksum[1];
                cipherIV = null;
            } else {
                cipherIV = null;
                bArrEncryptKeyData = bArrExtractKeyData;
            }
            s2KUsage = 0;
        } else {
            if (s2KUsage == 0) {
                s2KUsage = 255;
            }
            if (pGPSecretKey.secret.getPublicKeyPacket().getVersion() < 4) {
                byte[] key = pBESecretKeyEncryptor.getKey();
                bArrEncryptKeyData = new byte[bArrExtractKeyData.length];
                if (pBESecretKeyEncryptor.getHashAlgorithm() != 1) {
                    throw new PGPException("MD5 Digest Calculator required for version 3 key encryptor.");
                }
                int i3 = 0;
                for (int i4 = 0; i4 != 4; i4++) {
                    byte b2 = bArrExtractKeyData[i3];
                    int i5 = i3 + 1;
                    int i6 = (((b2 << 8) | (bArrExtractKeyData[i5] & 255)) + 7) / 8;
                    bArrEncryptKeyData[i3] = b2;
                    bArrEncryptKeyData[i5] = bArrExtractKeyData[i5];
                    if (i4 == 0) {
                        bArrEncryptKeyData2 = pBESecretKeyEncryptor.encryptKeyData(key, bArrExtractKeyData, i3 + 2, i6);
                        cipherIV2 = pBESecretKeyEncryptor.getCipherIV();
                    } else {
                        int length2 = cipherIV2.length;
                        byte[] bArr = new byte[length2];
                        System.arraycopy(bArrEncryptKeyData, i3 - cipherIV2.length, bArr, 0, length2);
                        bArrEncryptKeyData2 = pBESecretKeyEncryptor.encryptKeyData(key, bArr, bArrExtractKeyData, i3 + 2, i6);
                    }
                    System.arraycopy(bArrEncryptKeyData2, 0, bArrEncryptKeyData, i3 + 2, bArrEncryptKeyData2.length);
                    i3 += i6 + 2;
                }
                bArrEncryptKeyData[i3] = bArrExtractKeyData[i3];
                int i7 = i3 + 1;
                bArrEncryptKeyData[i7] = bArrExtractKeyData[i7];
                S2K s2k2 = pBESecretKeyEncryptor.getS2K();
                algorithm = pBESecretKeyEncryptor.getAlgorithm();
                cipherIV = cipherIV2;
                s2k = s2k2;
            } else {
                bArrEncryptKeyData = pBESecretKeyEncryptor.encryptKeyData(bArrExtractKeyData, 0, bArrExtractKeyData.length);
                cipherIV = pBESecretKeyEncryptor.getCipherIV();
                s2k = pBESecretKeyEncryptor.getS2K();
                algorithm = pBESecretKeyEncryptor.getAlgorithm();
            }
        }
        return new PGPSecretKey(pGPSecretKey.secret instanceof SecretSubkeyPacket ? new SecretSubkeyPacket(pGPSecretKey.secret.getPublicKeyPacket(), algorithm, s2KUsage, s2k, cipherIV, bArrEncryptKeyData) : new SecretKeyPacket(pGPSecretKey.secret.getPublicKeyPacket(), algorithm, s2KUsage, s2k, cipherIV, bArrEncryptKeyData), pGPSecretKey.pub);
    }

    private byte[] extractKeyData(PBESecretKeyDecryptor pBESecretKeyDecryptor) throws PGPException {
        byte[] secretKeyData = this.secret.getSecretKeyData();
        if (this.secret.getEncAlgorithm() == 0) {
            return secretKeyData;
        }
        try {
            int i2 = 0;
            if (this.secret.getPublicKeyPacket().getVersion() == 4) {
                byte[] bArrRecoverKeyData = pBESecretKeyDecryptor.recoverKeyData(this.secret.getEncAlgorithm(), pBESecretKeyDecryptor.makeKeyFromPassPhrase(this.secret.getEncAlgorithm(), this.secret.getS2K()), this.secret.getIV(), secretKeyData, 0, secretKeyData.length);
                boolean z2 = this.secret.getS2KUsage() == 254;
                byte[] bArrChecksum = checksum(z2 ? pBESecretKeyDecryptor.getChecksumCalculator(2) : null, bArrRecoverKeyData, z2 ? bArrRecoverKeyData.length - 20 : bArrRecoverKeyData.length - 2);
                while (i2 != bArrChecksum.length) {
                    if (bArrChecksum[i2] != bArrRecoverKeyData[(bArrRecoverKeyData.length - bArrChecksum.length) + i2]) {
                        throw new PGPException("checksum mismatch at " + i2 + " of " + bArrChecksum.length);
                    }
                    i2++;
                }
                return bArrRecoverKeyData;
            }
            byte[] bArrMakeKeyFromPassPhrase = pBESecretKeyDecryptor.makeKeyFromPassPhrase(this.secret.getEncAlgorithm(), this.secret.getS2K());
            int length = secretKeyData.length;
            byte[] bArr = new byte[length];
            int length2 = this.secret.getIV().length;
            byte[] bArr2 = new byte[length2];
            System.arraycopy(this.secret.getIV(), 0, bArr2, 0, length2);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 4; i3 != i5; i5 = 4) {
                byte b2 = secretKeyData[i4];
                int i6 = i4 + 1;
                byte b3 = secretKeyData[i6];
                int i7 = (((-1) - (((-1) - (b2 << 8)) & ((-1) - ((b3 + 255) - (b3 | 255))))) + 7) / 8;
                bArr[i4] = b2;
                bArr[i6] = secretKeyData[i6];
                int i8 = i4 + 2;
                byte[] bArr3 = bArr2;
                byte[] bArrRecoverKeyData2 = pBESecretKeyDecryptor.recoverKeyData(this.secret.getEncAlgorithm(), bArrMakeKeyFromPassPhrase, bArr3, secretKeyData, i8, i7);
                System.arraycopy(bArrRecoverKeyData2, 0, bArr, i8, bArrRecoverKeyData2.length);
                i4 += i7 + 2;
                if (i3 != 3) {
                    System.arraycopy(secretKeyData, i4 - length2, bArr3, 0, length2);
                }
                i3++;
                bArr2 = bArr3;
            }
            bArr[i4] = secretKeyData[i4];
            int i9 = i4 + 1;
            bArr[i9] = secretKeyData[i9];
            int i10 = (-1) - (((-1) - (secretKeyData[i4] << 8)) | ((-1) - 65280));
            byte b4 = secretKeyData[i9];
            int i11 = (-1) - (((-1) - ((b4 + 255) - (b4 | 255))) & ((-1) - i10));
            int i12 = 0;
            while (i2 < length - 2) {
                i12 += (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
                i2++;
            }
            int i13 = i12 & 65535;
            if (i13 == i11) {
                return bArr;
            }
            throw new PGPException("checksum mismatch: passphrase wrong, expected " + Integer.toHexString(i11) + " found " + Integer.toHexString(i13));
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception decrypting key", e3);
        }
    }

    private static byte[] getDValue(InputStream inputStream, PBEProtectionRemoverFactory pBEProtectionRemoverFactory, String str) throws PGPException, IOException {
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("protected")) {
            throw new PGPException("protected block not found");
        }
        String string = SXprUtils.readString(inputStream, inputStream.read());
        SXprUtils.skipOpenParenthesis(inputStream);
        S2K s2k = SXprUtils.parseS2K(inputStream);
        byte[] bytes = SXprUtils.readBytes(inputStream, inputStream.read());
        SXprUtils.skipCloseParenthesis(inputStream);
        byte[] bytes2 = SXprUtils.readBytes(inputStream, inputStream.read());
        PBESecretKeyDecryptor pBESecretKeyDecryptorCreateDecryptor = pBEProtectionRemoverFactory.createDecryptor(string);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pBESecretKeyDecryptorCreateDecryptor.recoverKeyData(7, pBESecretKeyDecryptorCreateDecryptor.makeKeyFromPassPhrase(7, s2k), bytes, bytes2, 0, bytes2.length));
        SXprUtils.skipOpenParenthesis(byteArrayInputStream);
        SXprUtils.skipOpenParenthesis(byteArrayInputStream);
        SXprUtils.skipOpenParenthesis(byteArrayInputStream);
        SXprUtils.readString(byteArrayInputStream, byteArrayInputStream.read());
        return SXprUtils.readBytes(byteArrayInputStream, byteArrayInputStream.read());
    }

    public static PGPSecretKey parseSecretKeyFromSExpr(InputStream inputStream, PBEProtectionRemoverFactory pBEProtectionRemoverFactory, PGPPublicKey pGPPublicKey) throws PGPException, IOException {
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("protected-private-key")) {
            throw new PGPException("unknown key type found");
        }
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("ecc")) {
            throw new PGPException("no curve details found");
        }
        SXprUtils.skipOpenParenthesis(inputStream);
        SXprUtils.readString(inputStream, inputStream.read());
        String string = SXprUtils.readString(inputStream, inputStream.read());
        SXprUtils.skipCloseParenthesis(inputStream);
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("q")) {
            throw new PGPException("no q value found");
        }
        SXprUtils.readBytes(inputStream, inputStream.read());
        SXprUtils.skipCloseParenthesis(inputStream);
        return new PGPSecretKey(new SecretKeyPacket(pGPPublicKey.getPublicKeyPacket(), 0, null, null, new ECSecretBCPGKey(new BigInteger(1, getDValue(inputStream, pBEProtectionRemoverFactory, string))).getEncoded()), pGPPublicKey);
    }

    public static PGPSecretKey parseSecretKeyFromSExpr(InputStream inputStream, PBEProtectionRemoverFactory pBEProtectionRemoverFactory, KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException, IOException {
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("protected-private-key")) {
            throw new PGPException("unknown key type found");
        }
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("ecc")) {
            throw new PGPException("no curve details found");
        }
        SXprUtils.skipOpenParenthesis(inputStream);
        SXprUtils.readString(inputStream, inputStream.read());
        String string = SXprUtils.readString(inputStream, inputStream.read());
        if (string.startsWith("NIST ")) {
            string = string.substring("NIST ".length());
        }
        SXprUtils.skipCloseParenthesis(inputStream);
        SXprUtils.skipOpenParenthesis(inputStream);
        if (!SXprUtils.readString(inputStream, inputStream.read()).equals("q")) {
            throw new PGPException("no q value found");
        }
        PublicKeyPacket publicKeyPacket = new PublicKeyPacket(19, new Date(), new ECDSAPublicBCPGKey(ECNamedCurveTable.getOID(string), new BigInteger(1, SXprUtils.readBytes(inputStream, inputStream.read()))));
        SXprUtils.skipCloseParenthesis(inputStream);
        return new PGPSecretKey(new SecretKeyPacket(publicKeyPacket, 0, null, null, new ECSecretBCPGKey(new BigInteger(1, getDValue(inputStream, pBEProtectionRemoverFactory, string))).getEncoded()), new PGPPublicKey(publicKeyPacket, keyFingerPrintCalculator));
    }

    public static PGPSecretKey replacePublicKey(PGPSecretKey pGPSecretKey, PGPPublicKey pGPPublicKey) {
        if (pGPPublicKey.getKeyID() == pGPSecretKey.getKeyID()) {
            return new PGPSecretKey(pGPSecretKey.secret, pGPPublicKey);
        }
        throw new IllegalArgumentException("keyIDs do not match");
    }

    public void encode(OutputStream outputStream) throws IOException {
        BCPGOutputStream bCPGOutputStream = outputStream instanceof BCPGOutputStream ? (BCPGOutputStream) outputStream : new BCPGOutputStream(outputStream);
        bCPGOutputStream.writePacket(this.secret);
        if (this.pub.trustPk != null) {
            bCPGOutputStream.writePacket(this.pub.trustPk);
        }
        if (this.pub.subSigs != null) {
            for (int i2 = 0; i2 != this.pub.subSigs.size(); i2++) {
                ((PGPSignature) this.pub.subSigs.get(i2)).encode(bCPGOutputStream);
            }
            return;
        }
        for (int i3 = 0; i3 != this.pub.keySigs.size(); i3++) {
            ((PGPSignature) this.pub.keySigs.get(i3)).encode(bCPGOutputStream);
        }
        for (int i4 = 0; i4 != this.pub.ids.size(); i4++) {
            if (this.pub.ids.get(i4) instanceof UserIDPacket) {
                bCPGOutputStream.writePacket((UserIDPacket) this.pub.ids.get(i4));
            } else {
                bCPGOutputStream.writePacket(new UserAttributePacket(((PGPUserAttributeSubpacketVector) this.pub.ids.get(i4)).toSubpacketArray()));
            }
            if (this.pub.idTrusts.get(i4) != null) {
                bCPGOutputStream.writePacket((ContainedPacket) this.pub.idTrusts.get(i4));
            }
            ArrayList arrayList = (ArrayList) this.pub.idSigs.get(i4);
            for (int i5 = 0; i5 != arrayList.size(); i5++) {
                ((PGPSignature) arrayList.get(i5)).encode(bCPGOutputStream);
            }
        }
    }

    public PGPPrivateKey extractPrivateKey(PBESecretKeyDecryptor pBESecretKeyDecryptor) throws PGPException {
        if (isPrivateKeyEmpty()) {
            return null;
        }
        PublicKeyPacket publicKeyPacket = this.secret.getPublicKeyPacket();
        try {
            BCPGInputStream bCPGInputStream = new BCPGInputStream(new ByteArrayInputStream(extractKeyData(pBESecretKeyDecryptor)));
            int algorithm = publicKeyPacket.getAlgorithm();
            if (algorithm == 1 || algorithm == 2 || algorithm == 3) {
                return new PGPPrivateKey(getKeyID(), publicKeyPacket, new RSASecretBCPGKey(bCPGInputStream));
            }
            switch (algorithm) {
                case 16:
                case 20:
                    return new PGPPrivateKey(getKeyID(), publicKeyPacket, new ElGamalSecretBCPGKey(bCPGInputStream));
                case 17:
                    return new PGPPrivateKey(getKeyID(), publicKeyPacket, new DSASecretBCPGKey(bCPGInputStream));
                case 18:
                case 19:
                    return new PGPPrivateKey(getKeyID(), publicKeyPacket, new ECSecretBCPGKey(bCPGInputStream));
                default:
                    throw new PGPException("unknown public key algorithm encountered");
            }
        } catch (PGPException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new PGPException("Exception constructing key", e3);
        }
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int getKeyEncryptionAlgorithm() {
        return this.secret.getEncAlgorithm();
    }

    public long getKeyID() {
        return this.pub.getKeyID();
    }

    public PGPPublicKey getPublicKey() {
        return this.pub;
    }

    public S2K getS2K() {
        return this.secret.getS2K();
    }

    public int getS2KUsage() {
        return this.secret.getS2KUsage();
    }

    public Iterator getUserAttributes() {
        return this.pub.getUserAttributes();
    }

    public Iterator getUserIDs() {
        return this.pub.getUserIDs();
    }

    public boolean isMasterKey() {
        return this.pub.isMasterKey();
    }

    public boolean isPrivateKeyEmpty() {
        byte[] secretKeyData = this.secret.getSecretKeyData();
        return secretKeyData == null || secretKeyData.length < 1;
    }

    public boolean isSigningKey() {
        int algorithm = this.pub.getAlgorithm();
        return algorithm == 1 || algorithm == 3 || algorithm == 17 || algorithm == 19 || algorithm == 20;
    }
}
