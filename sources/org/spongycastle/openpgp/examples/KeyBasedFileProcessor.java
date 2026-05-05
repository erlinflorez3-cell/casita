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
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class KeyBasedFileProcessor {
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
            Object objNextObject2 = new JcaPGPObjectFactory(pGPPublicKeyEncryptedData.getDataStream(new JcePublicKeyDataDecryptorFactoryBuilder().setProvider(BouncyCastleProvider.PROVIDER_NAME).build(pGPPrivateKeyFindSecretKey))).nextObject();
            if (objNextObject2 instanceof PGPCompressedData) {
                objNextObject2 = new JcaPGPObjectFactory(((PGPCompressedData) objNextObject2).getDataStream()).nextObject();
            }
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
        String strKd = Qg.kd("\u007fn", (short) (OY.Xd() ^ 20264), (short) (OY.Xd() ^ 2591));
        if (z2) {
            outputStream = new ArmoredOutputStream(outputStream);
        }
        try {
            byte[] bArrCompressFile = PGPExampleUtil.compressFile(str, 1);
            JcePGPDataEncryptorBuilder withIntegrityPacket = new JcePGPDataEncryptorBuilder(3).setWithIntegrityPacket(z3);
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(hg.Vd("\u0011\u0007\u001b\u0005P\u0015\u0006\u0003\u0014\u0010\u0006\u0010\u0014Gk|y\u000b\u0007xdr~s}z", (short) (FB.Xd() ^ 32400), (short) (FB.Xd() ^ 391))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                PGPEncryptedDataGenerator pGPEncryptedDataGenerator = new PGPEncryptedDataGenerator(withIntegrityPacket.setSecureRandom((SecureRandom) constructor.newInstance(objArr)).setProvider(strKd));
                pGPEncryptedDataGenerator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(pGPPublicKey).setProvider(strKd));
                OutputStream outputStreamOpen = pGPEncryptedDataGenerator.open(outputStream, bArrCompressFile.length);
                outputStreamOpen.write(bArrCompressFile);
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
            System.err.println("usage: KeyBasedFileProcessor -e|-d [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
            return;
        }
        if (!strArr[0].equals("-e")) {
            if (strArr[0].equals("-d")) {
                decryptFile(strArr[1], strArr[2], strArr[3].toCharArray(), new File(strArr[1]).getName() + ".out");
                return;
            } else {
                System.err.println("usage: KeyBasedFileProcessor -d|-e [-a|ai] file [secretKeyFile passPhrase|pubKeyFile]");
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
