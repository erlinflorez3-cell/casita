package org.bouncycastle.crypto.examples;

import androidx.exifinterface.media.ExifInterface;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.encoders.Hex;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class DESExample {
    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;
    private BufferedInputStream in;
    private byte[] key;
    private BufferedOutputStream out;

    public DESExample() {
        this.encrypt = true;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
    }

    public DESExample(String str, String str2, String str3, boolean z2) throws Throwable {
        PrintStream printStream;
        StringBuilder sb;
        SecureRandom secureRandom;
        String strQd = C1561oA.Qd(ExifInterface.LONGITUDE_EAST, (short) (C1499aX.Xd() ^ (-32327)));
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z2;
        try {
            this.in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println(C1593ug.zd("&LOUU\u0002IMQK\u0007VX^\u000bR\\c]T\u0011M", (short) (C1633zX.Xd() ^ (-32448)), (short) (C1633zX.Xd() ^ (-13891))) + str + strQd);
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println(C1561oA.od("u\u001b\u0019\u0014\u0018\u0016@\u0006\b\n\u0002;\t\t\r7y\byt\u0007vt/i", (short) (FB.Xd() ^ 19606)) + str2 + strQd);
            System.exit(1);
        }
        if (z2) {
            try {
                try {
                    Object[] objArr = new Object[0];
                    Constructor<?> constructor = Class.forName(C1561oA.Kd("\u0004{\u0012}K\u0012\u0005\u0004\u0017\u0015\r\u0019\u001fTz\u000e\r \u001e\u0012\u007f\u0010\u001e\u0015! ", (short) (ZN.Xd() ^ 8416))).getConstructor(new Class[0]);
                    try {
                        constructor.setAccessible(true);
                        secureRandom = (SecureRandom) constructor.newInstance(objArr);
                        short sXd = (short) (FB.Xd() ^ 27648);
                        short sXd2 = (short) (FB.Xd() ^ 29194);
                        int[] iArr = new int[">1Ck\u001a\u001d5\u0010\u000f;\b\u0018\u0014'\u0005\u0010b\u0006\u001f\u0007".length()];
                        QB qb = new QB(">1Ck\u001a\u001d5\u0010\u000f;\b\u0018\u0014'\u0005\u0010b\u0006\u001f\u0007");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                            i2++;
                        }
                        try {
                            Object[] objArr2 = {new String(iArr, 0, i2).getBytes()};
                            Method method = Class.forName(C1561oA.Xd("RJ`L\u001a`SRec[gm#I\\[nl`N^lcon", (short) (ZN.Xd() ^ 4347))).getMethod(Wg.vd("uhxXcdd", (short) (C1499aX.Xd() ^ (-31313))), byte[].class);
                            try {
                                method.setAccessible(true);
                                method.invoke(secureRandom, objArr2);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (Exception unused3) {
                            secureRandom2 = secureRandom;
                            System.err.println(Qg.kd("'KJI\u0007yGGv)\u001d\u0015\u0004\"#\u001e\u0016ylE:?h6,+)c7*&_\u00123+[$')$\u001c#\u001a\"'\u0013%\u0019\u001e\u001c", (short) (C1580rY.Xd() ^ (-25892)), (short) (C1580rY.Xd() ^ (-20585))));
                            System.exit(1);
                            secureRandom = secureRandom2;
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (IOException unused4) {
                    printStream = System.err;
                    sb = new StringBuilder(hg.Vd("\u001bFKA8r@@Dn22/=C9<053c&4&!3#\\' 3X\u001e \"\u001aS\u000e", (short) (C1499aX.Xd() ^ (-9382)), (short) (C1499aX.Xd() ^ (-21783))));
                }
            } catch (Exception unused5) {
            }
            KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, 192);
            DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
            dESedeKeyGenerator.init(keyGenerationParameters);
            this.key = dESedeKeyGenerator.generateKey();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
            byte[] bArrEncode = Hex.encode(this.key);
            bufferedOutputStream.write(bArrEncode, 0, bArrEncode.length);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
            int iAvailable = bufferedInputStream.available();
            byte[] bArr = new byte[iAvailable];
            bufferedInputStream.read(bArr, 0, iAvailable);
            this.key = Hex.decode(bArr);
            return;
        } catch (IOException unused6) {
            printStream = System.err;
            sb = new StringBuilder(C1561oA.ud("8XUci_bV[Y\nTM`\u0006KMOG\u0001NNR|BJOG<\u0003uDFr@@DnD.84.h#", (short) (FB.Xd() ^ 13282)));
        }
        printStream.println(sb.append(str3).append(strQd).toString());
        System.exit(1);
    }

    public static void main(String[] strArr) {
        String str;
        boolean z2 = true;
        if (strArr.length < 2) {
            System.err.println("Usage: java " + new DESExample().getClass().getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z2 = false;
        } else {
            str = "deskey.dat";
        }
        new DESExample(str2, str3, str, z2).process();
    }

    private void performDecrypt(byte[] bArr) {
        this.cipher.init(false, new KeyParameter(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.in));
        byte[] bArr2 = null;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                byte[] bArrDecode = Hex.decode(line);
                bArr2 = new byte[this.cipher.getOutputSize(bArrDecode.length)];
                int iProcessBytes = this.cipher.processBytes(bArrDecode, 0, bArrDecode.length, bArr2, 0);
                if (iProcessBytes > 0) {
                    this.out.write(bArr2, 0, iProcessBytes);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return;
            }
        }
        int iDoFinal = this.cipher.doFinal(bArr2, 0);
        if (iDoFinal > 0) {
            this.out.write(bArr2, 0, iDoFinal);
        }
    }

    private void performEncrypt(byte[] bArr) {
        this.cipher.init(true, new KeyParameter(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.cipher.getOutputSize(47)];
        while (true) {
            try {
                int i2 = this.in.read(bArr2, 0, 47);
                if (i2 <= 0) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                int iProcessBytes = this.cipher.processBytes(bArr2, 0, i2, bArr3, 0);
                if (iProcessBytes > 0) {
                    byte[] bArrEncode = Hex.encode(bArr3, 0, iProcessBytes);
                    this.out.write(bArrEncode, 0, bArrEncode.length);
                    this.out.write(10);
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return;
            }
        }
        int iDoFinal = this.cipher.doFinal(bArr3, 0);
        if (iDoFinal > 0) {
            byte[] bArrEncode2 = Hex.encode(bArr3, 0, iDoFinal);
            this.out.write(bArrEncode2, 0, bArrEncode2.length);
            this.out.write(10);
        }
    }

    private void process() {
        this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        if (this.encrypt) {
            performEncrypt(this.key);
        } else {
            performDecrypt(this.key);
        }
        try {
            this.in.close();
            this.out.flush();
            this.out.close();
        } catch (IOException e2) {
            System.err.println("exception closing resources: " + e2.getMessage());
        }
    }
}
