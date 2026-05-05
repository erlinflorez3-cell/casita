package yg;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: yg.aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1500aY {
    public static byte[] Kd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        short sXd = (short) (C1580rY.Xd() ^ ((1805491312 ^ 1562456738) ^ (-918340675)));
        int[] iArr = new int["47H".length()];
        QB qb = new QB("47H");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, new String(iArr, 0, i2));
        short sXd2 = (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849973923)));
        short sXd3 = (short) (C1580rY.Xd() ^ (163529307 ^ (-163515018)));
        int[] iArr2 = new int["*-:\u0015(&&\u00111+\"1\u0012,<>=AE=".length()];
        QB qb2 = new QB("*-:\u0015(&&\u00111+\"1\u0012,<>=AE=");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Cipher cipher = Cipher.getInstance(new String(iArr2, 0, i3));
        cipher.init(C1607wl.Xd() ^ (1552387443 ^ 851680939), secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static byte[] Yd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, hg.Vd("ILY", (short) (FB.Xd() ^ (1944535098 ^ 1944530643)), (short) (FB.Xd() ^ ((529906835 ^ 601318208) ^ 1011011578))));
        Cipher cipher = Cipher.getInstance(C1561oA.ud("mp}XkiiTtnetUo\u007f\u0002\u0001\u0005\t\u0001", (short) (C1580rY.Xd() ^ ((1334790064 ^ 180417541) ^ (-1162868507)))));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
