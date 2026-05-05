package org.spongycastle.openpgp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Date;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.bcpg.ArmoredInputStream;
import org.spongycastle.bcpg.HashAlgorithmTags;
import org.spongycastle.bcpg.MPInteger;
import org.spongycastle.util.encoders.Base64;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
public class PGPUtil implements HashAlgorithmTags {
    private static final int READ_AHEAD = 60;
    private static String defProvider = "SC";

    static class BufferedInputStreamExt extends BufferedInputStream {
        BufferedInputStreamExt(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized int available() throws IOException {
            int iAvailable;
            iAvailable = super.available();
            if (iAvailable < 0) {
                iAvailable = Integer.MAX_VALUE;
            }
            return iAvailable;
        }
    }

    static MPInteger[] dsaSigToMpi(byte[] bArr) throws PGPException {
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(bArr).readObject();
            return new MPInteger[]{new MPInteger(((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue()), new MPInteger(((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue())};
        } catch (IOException e2) {
            throw new PGPException("exception encoding signature", e2);
        }
    }

    public static InputStream getDecoderStream(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStreamExt(inputStream);
        }
        inputStream.mark(60);
        int i2 = inputStream.read();
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            inputStream.reset();
            return inputStream;
        }
        if (!isPossiblyBase64(i2)) {
            inputStream.reset();
            return new ArmoredInputStream(inputStream);
        }
        byte[] bArr = new byte[60];
        bArr[0] = (byte) i2;
        int i3 = 1;
        int i4 = 1;
        while (i3 != 60) {
            int i5 = inputStream.read();
            if (i5 < 0) {
                break;
            }
            if (!isPossiblyBase64(i5)) {
                inputStream.reset();
                return new ArmoredInputStream(inputStream);
            }
            if (i5 != 10 && i5 != 13) {
                bArr[i4] = (byte) i5;
                i4++;
            }
            i3++;
        }
        inputStream.reset();
        if (i3 < 4) {
            return new ArmoredInputStream(inputStream);
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        byte b2 = Base64.decode(bArr2)[0];
        return (b2 + 128) - (b2 | 128) != 0 ? new ArmoredInputStream(inputStream, false) : new ArmoredInputStream(inputStream);
    }

    public static String getDefaultProvider() {
        return defProvider;
    }

    private static boolean isPossiblyBase64(int i2) {
        return (i2 >= 65 && i2 <= 90) || (i2 >= 97 && i2 <= 122) || ((i2 >= 48 && i2 <= 57) || i2 == 43 || i2 == 47 || i2 == 13 || i2 == 10);
    }

    public static byte[] makeRandomKey(int i2, SecureRandom secureRandom) throws Throwable {
        int i3 = 256;
        switch (i2) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 7:
            case 11:
                i3 = 128;
                break;
            case 2:
            case 8:
            case 12:
                i3 = 192;
                break;
            case 6:
                i3 = 64;
                break;
            case 9:
            case 10:
            case 13:
                break;
            default:
                throw new PGPException(C1561oA.ud("H@<>>E;k>C65,:7-&a\",&-/%/\"&qV", (short) (C1633zX.Xd() ^ (-25515))) + i2);
        }
        byte[] bArr = new byte[(i3 + 7) / 8];
        Object[] objArr = {bArr};
        Method method = Class.forName(C1561oA.yd("SI]G\u001b_PMVRHR^\u00126G<MI;/=I>@=", (short) (Od.Xd() ^ (-7762)))).getMethod(C1561oA.Yd("\u001c\u0014(%s,(\u001a)", (short) (C1499aX.Xd() ^ (-1371))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr);
            return bArr;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void pipeFileContents(File file, OutputStream outputStream, int i2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[i2];
        while (true) {
            int i3 = fileInputStream.read(bArr);
            if (i3 <= 0) {
                outputStream.close();
                fileInputStream.close();
                return;
            }
            outputStream.write(bArr, 0, i3);
        }
    }

    public static void setDefaultProvider(String str) {
        defProvider = str;
    }

    public static void writeFileToLiteralData(OutputStream outputStream, char c2, File file) throws IOException {
        pipeFileContents(file, new PGPLiteralDataGenerator().open(outputStream, c2, file), 4096);
    }

    public static void writeFileToLiteralData(OutputStream outputStream, char c2, File file, byte[] bArr) throws IOException {
        pipeFileContents(file, new PGPLiteralDataGenerator().open(outputStream, c2, file.getName(), new Date(file.lastModified()), bArr), bArr.length);
    }
}
