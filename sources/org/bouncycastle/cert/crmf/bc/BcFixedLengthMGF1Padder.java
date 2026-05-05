package org.bouncycastle.cert.crmf.bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.cert.crmf.EncryptedValuePadder;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.params.MGFParameters;
import yg.C1499aX;
import yg.C1607wl;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public class BcFixedLengthMGF1Padder implements EncryptedValuePadder {
    private Digest dig;
    private int length;
    private SecureRandom random;

    public BcFixedLengthMGF1Padder(int i2) {
        this(i2, null);
    }

    public BcFixedLengthMGF1Padder(int i2, SecureRandom secureRandom) {
        this.dig = new SHA1Digest();
        this.length = i2;
        this.random = secureRandom;
    }

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getPaddedData(byte[] bArr) throws Throwable {
        int i2 = this.length;
        byte[] bArr2 = new byte[i2];
        int digestSize = this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.vd("\u0010\u0006\u001e\bO\u0014\t\u0006\u0013\u000f\t\u0013\u0013Fn\u007f\u0019**\u001c\u0004\u0012\"\u0017\u001d\u001a", (short) (ZN.Xd() ^ 19842))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {bArr3};
        Method method = Class.forName(Qg.kd("0&:$o4%\"3/%/3f\u000b\u001c\u0019*&\u0018\u0004\u0012\u001e\u0013\u001d\u001a", (short) (C1499aX.Xd() ^ (-3095)), (short) (C1499aX.Xd() ^ (-14450)))).getMethod(hg.Vd("\b}\u0010\u000bW\u000e\bw\u0005", (short) (C1607wl.Xd() ^ 2320), (short) (C1607wl.Xd() ^ 11183)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
            mGF1BytesGenerator.init(new MGFParameters(bArr3));
            mGF1BytesGenerator.generateBytes(bArr4, 0, digestSize2);
            System.arraycopy(bArr3, 0, bArr2, 0, digestSize);
            System.arraycopy(bArr, 0, bArr2, digestSize, bArr.length);
            int length = bArr.length + digestSize;
            while (true) {
                length++;
                if (length == i2) {
                    break;
                }
                bArr2[length] = (byte) (this.random.nextInt(255) + 1);
            }
            for (int i3 = 0; i3 != digestSize2; i3++) {
                int i4 = i3 + digestSize;
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr4[i3]);
            }
            return bArr2;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getUnpaddedData(byte[] bArr) {
        int digestSize = this.dig.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        System.arraycopy(bArr, 0, bArr2, 0, digestSize);
        MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
        mGF1BytesGenerator.init(new MGFParameters(bArr2));
        mGF1BytesGenerator.generateBytes(bArr3, 0, digestSize2);
        for (int i2 = 0; i2 != digestSize2; i2++) {
            int i3 = i2 + digestSize;
            bArr[i3] = (byte) (bArr[i3] ^ bArr3[i2]);
        }
        int length = bArr.length - 1;
        while (true) {
            if (length == digestSize) {
                length = 0;
                break;
            }
            if (bArr[length] == 0) {
                break;
            }
            length--;
        }
        if (length == 0) {
            throw new IllegalStateException("bad padding in encoding");
        }
        int i4 = length - digestSize;
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArr, digestSize, bArr4, 0, i4);
        return bArr4;
    }
}
