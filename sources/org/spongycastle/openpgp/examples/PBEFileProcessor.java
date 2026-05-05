package org.spongycastle.openpgp.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import org.spongycastle.bcpg.ArmoredOutputStream;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPCompressedData;
import org.spongycastle.openpgp.PGPEncryptedDataGenerator;
import org.spongycastle.openpgp.PGPEncryptedDataList;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPLiteralData;
import org.spongycastle.openpgp.PGPPBEEncryptedData;
import org.spongycastle.openpgp.PGPUtil;
import org.spongycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.spongycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePBEDataDecryptorFactoryBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePBEKeyEncryptionMethodGenerator;
import org.spongycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.spongycastle.util.io.Streams;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Xg;

/* JADX INFO: loaded from: classes2.dex */
public class PBEFileProcessor {
    private static void decryptFile(InputStream inputStream, char[] cArr) throws PGPException, IOException, NoSuchProviderException {
        JcaPGPObjectFactory jcaPGPObjectFactory = new JcaPGPObjectFactory(PGPUtil.getDecoderStream(inputStream));
        Object objNextObject = jcaPGPObjectFactory.nextObject();
        PGPPBEEncryptedData pGPPBEEncryptedData = (PGPPBEEncryptedData) (objNextObject instanceof PGPEncryptedDataList ? (PGPEncryptedDataList) objNextObject : (PGPEncryptedDataList) jcaPGPObjectFactory.nextObject()).get(0);
        Object objNextObject2 = new JcaPGPObjectFactory(pGPPBEEncryptedData.getDataStream(new JcePBEDataDecryptorFactoryBuilder(new JcaPGPDigestCalculatorProviderBuilder().setProvider(BouncyCastleProvider.PROVIDER_NAME).build()).setProvider(BouncyCastleProvider.PROVIDER_NAME).build(cArr))).nextObject();
        if (objNextObject2 instanceof PGPCompressedData) {
            objNextObject2 = new JcaPGPObjectFactory(((PGPCompressedData) objNextObject2).getDataStream()).nextObject();
        }
        PGPLiteralData pGPLiteralData = (PGPLiteralData) objNextObject2;
        InputStream inputStream2 = pGPLiteralData.getInputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(pGPLiteralData.getFileName()));
        Streams.pipeAll(inputStream2, bufferedOutputStream);
        bufferedOutputStream.close();
        if (!pGPPBEEncryptedData.isIntegrityProtected()) {
            System.err.println("no message integrity check");
        } else if (pGPPBEEncryptedData.verify()) {
            System.err.println("message integrity check passed");
        } else {
            System.err.println("message failed integrity check");
        }
    }

    private static void decryptFile(String str, char[] cArr) throws PGPException, IOException, NoSuchProviderException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        decryptFile(bufferedInputStream, cArr);
        bufferedInputStream.close();
    }

    private static void encryptFile(OutputStream outputStream, String str, char[] cArr, boolean z2, boolean z3) throws Throwable {
        String strYd = C1561oA.Yd("\u0010\u0001", (short) (FB.Xd() ^ 10548));
        if (z2) {
            outputStream = new ArmoredOutputStream(outputStream);
        }
        try {
            byte[] bArrCompressFile = PGPExampleUtil.compressFile(str, 1);
            JcePGPDataEncryptorBuilder withIntegrityPacket = new JcePGPDataEncryptorBuilder(3).setWithIntegrityPacket(z3);
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Xg.qd(")!7#p7*)<:2>Dy 32EC7%5C:FE", (short) (OY.Xd() ^ 11536), (short) (OY.Xd() ^ 21668))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                PGPEncryptedDataGenerator pGPEncryptedDataGenerator = new PGPEncryptedDataGenerator(withIntegrityPacket.setSecureRandom((SecureRandom) constructor.newInstance(objArr)).setProvider(strYd));
                pGPEncryptedDataGenerator.addMethod(new JcePBEKeyEncryptionMethodGenerator(cArr).setProvider(strYd));
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

    private static void encryptFile(String str, String str2, char[] cArr, boolean z2, boolean z3) throws Throwable {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
        encryptFile(bufferedOutputStream, str2, cArr, z2, z3);
        bufferedOutputStream.close();
    }

    public static void main(String[] strArr) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        if (!strArr[0].equals("-e")) {
            if (strArr[0].equals("-d")) {
                decryptFile(strArr[1], strArr[2].toCharArray());
                return;
            } else {
                System.err.println("usage: PBEFileProcessor -e [-ai]|-d file passPhrase");
                return;
            }
        }
        if (strArr[1].equals("-a") || strArr[1].equals("-ai") || strArr[1].equals("-ia")) {
            encryptFile(strArr[2] + ".asc", strArr[2], strArr[3].toCharArray(), true, strArr[1].indexOf(105) > 0);
        } else if (strArr[1].equals("-i")) {
            encryptFile(strArr[2] + ".bpg", strArr[2], strArr[3].toCharArray(), false, true);
        } else {
            encryptFile(strArr[1] + ".bpg", strArr[1], strArr[2].toCharArray(), false, false);
        }
    }
}
