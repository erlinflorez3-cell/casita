package org.spongycastle.openpgp.examples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;
import org.spongycastle.bcpg.ArmoredOutputStream;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPCompressedData;
import org.spongycastle.openpgp.PGPCompressedDataGenerator;
import org.spongycastle.openpgp.PGPEncryptedDataGenerator;
import org.spongycastle.openpgp.PGPEncryptedDataList;
import org.spongycastle.openpgp.PGPException;
import org.spongycastle.openpgp.PGPLiteralData;
import org.spongycastle.openpgp.PGPLiteralDataGenerator;
import org.spongycastle.openpgp.PGPPBEEncryptedData;
import org.spongycastle.openpgp.PGPUtil;
import org.spongycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.spongycastle.openpgp.operator.jcajce.JcaPGPDigestCalculatorProviderBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePBEDataDecryptorFactoryBuilder;
import org.spongycastle.openpgp.operator.jcajce.JcePBEKeyEncryptionMethodGenerator;
import org.spongycastle.openpgp.operator.jcajce.JcePGPDataEncryptorBuilder;
import org.spongycastle.util.encoders.Hex;
import org.spongycastle.util.io.Streams;
import yg.C1580rY;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayHandler {
    private static byte[] compress(byte[] bArr, String str, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PGPCompressedDataGenerator pGPCompressedDataGenerator = new PGPCompressedDataGenerator(i2);
        OutputStream outputStreamOpen = new PGPLiteralDataGenerator().open(pGPCompressedDataGenerator.open(byteArrayOutputStream), 'b', str, bArr.length, new Date());
        outputStreamOpen.write(bArr);
        outputStreamOpen.close();
        pGPCompressedDataGenerator.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] decrypt(byte[] bArr, char[] cArr) throws PGPException, IOException, NoSuchProviderException {
        JcaPGPObjectFactory jcaPGPObjectFactory = new JcaPGPObjectFactory(PGPUtil.getDecoderStream(new ByteArrayInputStream(bArr)));
        Object objNextObject = jcaPGPObjectFactory.nextObject();
        return Streams.readAll(((PGPLiteralData) new JcaPGPObjectFactory(((PGPCompressedData) new JcaPGPObjectFactory(((PGPPBEEncryptedData) (objNextObject instanceof PGPEncryptedDataList ? (PGPEncryptedDataList) objNextObject : (PGPEncryptedDataList) jcaPGPObjectFactory.nextObject()).get(0)).getDataStream(new JcePBEDataDecryptorFactoryBuilder(new JcaPGPDigestCalculatorProviderBuilder().setProvider(BouncyCastleProvider.PROVIDER_NAME).build()).setProvider(BouncyCastleProvider.PROVIDER_NAME).build(cArr))).nextObject()).getDataStream()).nextObject()).getInputStream());
    }

    public static byte[] encrypt(byte[] bArr, char[] cArr, String str, int i2, boolean z2) throws Throwable {
        if (str == null) {
            str = Xg.qd("3\u0018%%+(& ", (short) (Od.Xd() ^ (-8107)), (short) (Od.Xd() ^ (-30712)));
        }
        byte[] bArrCompress = compress(bArr, str, 1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream armoredOutputStream = z2 ? new ArmoredOutputStream(byteArrayOutputStream) : byteArrayOutputStream;
        JcePGPDataEncryptorBuilder jcePGPDataEncryptorBuilder = new JcePGPDataEncryptorBuilder(i2);
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Jg.Wd("K\u0005\u0012?\u001c\u001e\u000e8:yx>K,K\"@L\nh\u0014'zl0\u0018", (short) (C1580rY.Xd() ^ (-28277)), (short) (C1580rY.Xd() ^ (-7504)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            JcePGPDataEncryptorBuilder secureRandom = jcePGPDataEncryptorBuilder.setSecureRandom((SecureRandom) constructor.newInstance(objArr));
            String strXd = ZO.xd("\u0006h", (short) (OY.Xd() ^ 22043), (short) (OY.Xd() ^ 16338));
            PGPEncryptedDataGenerator pGPEncryptedDataGenerator = new PGPEncryptedDataGenerator(secureRandom.setProvider(strXd));
            pGPEncryptedDataGenerator.addMethod(new JcePBEKeyEncryptionMethodGenerator(cArr).setProvider(strXd));
            OutputStream outputStreamOpen = pGPEncryptedDataGenerator.open(armoredOutputStream, bArrCompress.length);
            outputStreamOpen.write(bArrCompress);
            outputStreamOpen.close();
            if (z2) {
                armoredOutputStream.close();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void main(String[] strArr) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        char[] charArray = "Dick Beck".toCharArray();
        byte[] bytes = "Hello world".getBytes();
        System.out.println("Starting PGP test");
        byte[] bArrEncrypt = encrypt(bytes, charArray, "iway", 3, true);
        System.out.println("\nencrypted data = '" + new String(bArrEncrypt) + "'");
        System.out.println("\ndecrypted data = '" + new String(decrypt(bArrEncrypt, charArray)) + "'");
        byte[] bArrEncrypt2 = encrypt(bytes, charArray, "iway", 9, false);
        System.out.println("\nencrypted data = '" + new String(Hex.encode(bArrEncrypt2)) + "'");
        System.out.println("\ndecrypted data = '" + new String(decrypt(bArrEncrypt2, charArray)) + "'");
    }
}
