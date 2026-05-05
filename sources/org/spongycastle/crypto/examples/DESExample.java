package org.spongycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.generators.DESedeKeyGenerator;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.encoders.Hex;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
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
        SecureRandom secureRandom;
        String strZd = Wg.Zd("\u001c", (short) (Od.Xd() ^ (-31031)), (short) (Od.Xd() ^ (-61)));
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z2;
        try {
            this.in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            System.err.println(C1561oA.Xd("Tz}\u0004\u00040w{\u007fy5\u0005\u0007\r9\u0001\u000b\u0012\f\u0003?{", (short) (C1633zX.Xd() ^ (-15097))) + str + strZd);
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            System.err.println(Wg.vd("a\u0007\u0005\u007f\u0004\u0002,q\u0004\u0006}7\u0005\u0005\t3ese`rb`\u001be", (short) (C1580rY.Xd() ^ (-30263))) + str2 + strZd);
            System.exit(1);
        }
        try {
            if (!z2) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
                    int iAvailable = bufferedInputStream.available();
                    byte[] bArr = new byte[iAvailable];
                    bufferedInputStream.read(bArr, 0, iAvailable);
                    this.key = Hex.decode(bArr);
                    return;
                } catch (IOException unused3) {
                    System.err.println(Jg.Wd("g^\u0005$E`p\u00042I\u0013\r\u0013;\fb\u000e9<#\u000e\u0015B\u000e^\u001c>CcC?=L]Xg\u0005X9@w\u000b\u001e\nM", (short) (C1580rY.Xd() ^ (-20485)), (short) (C1580rY.Xd() ^ (-14626))) + str3 + strZd);
                    System.exit(1);
                    return;
                }
            }
            try {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(Qg.kd("\f\u0002\u0016\u007fK\u0010\u0001}\u000f\u000b\u0001\u000b\u000fBfwt\u0006\u0002s_mynxu", (short) (FB.Xd() ^ 19693), (short) (FB.Xd() ^ 991))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    secureRandom = (SecureRandom) constructor.newInstance(objArr);
                    try {
                        Object[] objArr2 = {hg.Vd("IHG|0<A9-B+(990(o02&", (short) (ZN.Xd() ^ 20990), (short) (ZN.Xd() ^ 7694)).getBytes()};
                        Method method = Class.forName(C1561oA.ud("RH\\F\u0012VGDUQGQU\t->;LH:&4@5?<", (short) (C1633zX.Xd() ^ (-4893)))).getMethod(C1561oA.yd("WHV4MLJ", (short) (OY.Xd() ^ 32667)), byte[].class);
                        try {
                            method.setAccessible(true);
                            method.invoke(secureRandom, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Exception unused4) {
                        secureRandom2 = secureRandom;
                        System.err.println(C1561oA.Yd("k\u0012\u0013\u0014SH\u0018\u001aK\u007fuo`\u0001\u0004\u0001z`U0'.Y)!\"\"^4)'b\u0017:4f16:71:3=D2F<CC", (short) (C1580rY.Xd() ^ (-28918))));
                        System.exit(1);
                        secureRandom = secureRandom2;
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
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
        } catch (IOException unused6) {
            System.err.println(Xg.qd("Z\b\u000f\u0007\u007f<\f\u000e\u0014@\u0006\b\u0007\u0017\u001f\u0017\u001c\u0012\u0019\u0019K\u0010 \u0014\u0011%\u0017R\u001f\u001a/V\u001e\"& [\u0018", (short) (OY.Xd() ^ 31759), (short) (OY.Xd() ^ 30038)) + str3 + strZd);
            System.exit(1);
        }
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
        } catch (IOException unused) {
        }
    }
}
