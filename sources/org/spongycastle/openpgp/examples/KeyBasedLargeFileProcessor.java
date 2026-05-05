package org.spongycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Iterator;
import org.spongycastle.bcpg.ArmoredOutputStream;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPCompressedData;
import org.spongycastle.openpgp.PGPCompressedDataGenerator;
import org.spongycastle.openpgp.PGPEncryptedDataGenerator;
import org.spongycastle.openpgp.PGPEncryptedDataList;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPLiteralData;
import org.spongycastle.openpgp.PGPOnePassSignatureList;
import org.spongycastle.openpgp.PGPPrivateKey;
import org.spongycastle.openpgp.PGPPublicKey;
import org.spongycastle.openpgp.PGPPublicKeyEncryptedData;
import org.spongycastle.openpgp.PGPSecretKeyRingCollection;
import org.spongycastle.openpgp.PGPUtil;
import org.spongycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.spongycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;
import org.spongycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePublicKeyDataDecryptorFactoryBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePublicKeyKeyEncryptionMethodGenerator;
import org.spongycastle.util.io.Streams;
import yg.C1561oA;
import yg.OY;

/* JADX INFO: loaded from: classes2.dex */
public class KeyBasedLargeFileProcessor {
    private static void decryptFile(InputStream inputStream, InputStream inputStream2, char[] cArr, String str) throws IOException, NoSuchProviderException {
        try {
            JcaPGPObjectFactory jcaPGPObjectFactory = new JcaPGPObjectFactory(PGPUtil.getDecoderStream(inputStream));
            Object objNextObject = jcaPGPObjectFactory.nextObject();
            Iterator encryptedDataObjects = (objNextObject instanceof PGPEncryptedDataList ? (PGPEncryptedDataList) objNextObject : (PGPEncryptedDataList) jcaPGPObjectFactory.nextObject()).getEncryptedDataObjects();
            PGPSecretKeyRingCollection pGPSecretKeyRingCollection = new PGPSecretKeyRingCollection(PGPUtil.getDecoderStream(inputStream2), new JcaKeyFingerprintCalculator());
            PGPPrivateKey pGPPrivateKeyFindSecretKey = null;
            PGPPublicKeyEncryptedData pGPPublicKeyEncryptedData = null;
            while (pGPPrivateKeyFindSecretKey == null && encryptedDataObjects.hasNext()) {
                pGPPublicKeyEncryptedData = (PGPPublicKeyEncryptedData) encryptedDataObjects.next();
                pGPPrivateKeyFindSecretKey = PGPExampleUtil.findSecretKey(pGPSecretKeyRingCollection, pGPPublicKeyEncryptedData.getKeyID(), cArr);
            }
            if (pGPPrivateKeyFindSecretKey == null) {
                throw new IllegalArgumentException("secret key for message not found.");
            }
            Object objNextObject2 = new JcaPGPObjectFactory(new BufferedInputStream(((PGPCompressedData) new JcaPGPObjectFactory(pGPPublicKeyEncryptedData.getDataStream(new JcePublicKeyDataDecryptorFactoryBuilder().setProvider(BouncyCastleProvider.PROVIDER_NAME).build(pGPPrivateKeyFindSecretKey))).nextObject()).getDataStream())).nextObject();
            if (!(objNextObject2 instanceof PGPLiteralData)) {
                if (!(objNextObject2 instanceof PGPOnePassSignatureList)) {
                    throw new PGPException("message is not a simple encrypted file - type unknown.");
                }
                throw new PGPException("encrypted message contains a signed message - not literal data.");
            }
            PGPLiteralData pGPLiteralData = (PGPLiteralData) objNextObject2;
            String fileName = pGPLiteralData.getFileName();
            if (fileName.length() != 0) {
                str = fileName;
            }
            InputStream inputStream3 = pGPLiteralData.getInputStream();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            Streams.pipeAll(inputStream3, bufferedOutputStream);
            bufferedOutputStream.close();
            if (!pGPPublicKeyEncryptedData.isIntegrityProtected()) {
                System.err.println("no message integrity check");
            } else if (pGPPublicKeyEncryptedData.verify()) {
                System.err.println("message integrity check passed");
            } else {
                System.err.println("message failed integrity check");
            }
        } catch (PGPException e2) {
            System.err.println(e2);
            if (e2.getUnderlyingException() != null) {
                e2.getUnderlyingException().printStackTrace();
            }
        }
    }

    private static void decryptFile(String str, String str2, char[] cArr, String str3) throws IOException, NoSuchProviderException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str2));
        decryptFile(bufferedInputStream, bufferedInputStream2, cArr, str3);
        bufferedInputStream2.close();
        bufferedInputStream.close();
    }

    private static void encryptFile(OutputStream outputStream, String str, PGPPublicKey pGPPublicKey, boolean z2, boolean z3) throws Throwable {
        String strUd = C1561oA.ud("\"\u0011", (short) (OY.Xd() ^ 11787));
        if (z2) {
            outputStream = new ArmoredOutputStream(outputStream);
        }
        try {
            JcePGPDataEncryptorBuilder withIntegrityPacket = new JcePGPDataEncryptorBuilder(3).setWithIntegrityPacket(z3);
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.yd("0(>*w>10CA9EK\u0001':\u0019,*\u001e\f\u001c*!-,", (short) (OY.Xd() ^ 17112))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                PGPEncryptedDataGenerator pGPEncryptedDataGenerator = new PGPEncryptedDataGenerator(withIntegrityPacket.setSecureRandom((SecureRandom) constructor.newInstance(objArr)).setProvider(strUd));
                pGPEncryptedDataGenerator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(pGPPublicKey).setProvider(strUd));
                OutputStream outputStreamOpen = pGPEncryptedDataGenerator.open(outputStream, new byte[65536]);
                PGPCompressedDataGenerator pGPCompressedDataGenerator = new PGPCompressedDataGenerator(1);
                PGPUtil.writeFileToLiteralData(pGPCompressedDataGenerator.open(outputStreamOpen), 'b', new File(str), new byte[65536]);
                pGPCompressedDataGenerator.close();
                outputStreamOpen.close();
                if (z2) {
                    outputStream.close();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PGPException e3) {
            System.err.println(e3);
            if (e3.getUnderlyingException() != null) {
                e3.getUnderlyingException().printStackTrace();
            }
        }
    }

    private static void encryptFile(String str, String str2, String str3, boolean z2, boolean z3) throws Throwable {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        encryptFile(bufferedOutputStream, str2, PGPExampleUtil.readPublicKey(str3), z2, z3);
        bufferedOutputStream.close();
    }

    public static void main(String[] strArr) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        if (strArr.length == 0) {
            System.err.println("usage: KeyBasedLargeFileProcessor -e|-d [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
            return;
        }
        if (!strArr[0].equals("-e")) {
            if (strArr[0].equals("-d")) {
                decryptFile(strArr[1], strArr[2], strArr[3].toCharArray(), new File(strArr[1]).getName() + ".out");
                return;
            } else {
                System.err.println("usage: KeyBasedLargeFileProcessor -d|-e [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
                return;
            }
        }
        if (strArr[1].equals("-a") || strArr[1].equals("-ai") || strArr[1].equals("-ia")) {
            encryptFile(strArr[2] + ".asc", strArr[2], strArr[3], true, strArr[1].indexOf(105) > 0);
        } else if (strArr[1].equals("-i")) {
            encryptFile(strArr[2] + ".bpg", strArr[2], strArr[3], false, true);
        } else {
            encryptFile(strArr[1] + ".bpg", strArr[1], strArr[2], false, false);
        }
    }
}
