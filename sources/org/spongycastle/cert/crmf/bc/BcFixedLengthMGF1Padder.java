package org.spongycastle.cert.crmf.bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.cert.crmf.EncryptedValuePadder;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.generators.MGF1BytesGenerator;
import org.spongycastle.crypto.params.MGFParameters;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.QB;
import yg.Xg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
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

    @Override // org.spongycastle.cert.crmf.EncryptedValuePadder
    public byte[] getPaddedData(byte[] bArr) throws Throwable {
        int i2 = this.length;
        byte[] bArr2 = new byte[i2];
        int digestSize = this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Yd("g_ua/uhgzxp|\u00038^qp\u0004\u0002ucs\u0002x\u0005\u0004", (short) (C1499aX.Xd() ^ (-5770)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        SecureRandom secureRandom = this.random;
        Class<?> cls = Class.forName(Xg.qd("YQgS!gZYljbnt*PcbusgUesjvu", (short) (C1633zX.Xd() ^ (-32216)), (short) (C1633zX.Xd() ^ (-107))));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr2 = {bArr3};
        short sXd = (short) (C1499aX.Xd() ^ (-32662));
        short sXd2 = (short) (C1499aX.Xd() ^ (-26842));
        int[] iArr = new int["&`\u0019=@\u001c<S\u0019".length()];
        QB qb = new QB("&`\u0019=@\u001c<S\u0019");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
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
            for (int i4 = 0; i4 != digestSize2; i4++) {
                int i5 = i4 + digestSize;
                bArr2[i5] = (byte) (bArr2[i5] ^ bArr4[i4]);
            }
            return bArr2;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // org.spongycastle.cert.crmf.EncryptedValuePadder
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
