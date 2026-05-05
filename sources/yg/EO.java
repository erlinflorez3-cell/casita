package yg;

import java.io.File;
import java.security.MessageDigest;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class EO {
    public static String Od(String str, short s2) {
        int[] iArr = new int[str.length()];
        QB qb = new QB(str);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((s2 + s2) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int Qd(int i2, int i3, int i4) {
        return (i2 & i3) | ((i2 + i4) - (i2 | i4)) | (i3 & i4);
    }

    public static void Xd(float f2) {
        if ((f2 >= 0.0f || Math.log(f2) <= 0.0d || new Float(f2).shortValue() > JN.Xd) && f2 >= C1589uF.Xd.length()) {
            return;
        }
        C1523gX.Kd = "";
    }

    public static String ud() {
        try {
            String str = (String) Class.forName(ZO.xd("B3\u0012x\u0014\u0010\u001b/\u001aCP\u00190\"\u0004n", (short) (FB.Xd() ^ ((176241706 ^ 531626317) ^ 355398013)), (short) (FB.Xd() ^ (395640577 ^ 395637343)))).getField(C1626yg.Ud("b\u0001M\u00179", (short) (FB.Xd() ^ (163015944 ^ 163019642)), (short) (FB.Xd() ^ ((100598522 ^ 684508989) ^ 758352313)))).get(null);
            return str.substring(0, Math.min(str.length(), (671005892 ^ 2119235256) ^ 1504594524));
        } catch (Exception e2) {
            return null;
        }
    }

    public static boolean wd(File file, MessageDigest messageDigest, Set set) {
        messageDigest.reset();
        messageDigest.update((file.getName() + file.length()).getBytes());
        return set.contains(new WF(messageDigest.digest()));
    }

    public static byte[] yd(byte[] bArr) {
        int[] iArr = new int[ZN.Xd() ^ 864698032];
        int iXd = C1633zX.Xd() ^ (469024334 ^ (-1873140339));
        int[] iArr2 = new int[iXd];
        int[] iArr3 = new int[iXd];
        // fill-array-data instruction
        iArr3[0] = 1779033703;
        iArr3[1] = -1150833019;
        iArr3[2] = 1013904242;
        iArr3[3] = -1521486534;
        iArr3[4] = 1359893119;
        iArr3[5] = -1694144372;
        iArr3[6] = 528734635;
        iArr3[7] = 1541459225;
        int[] iArrVd = C1626yg.vd(bArr);
        int length = iArrVd.length;
        int iXd2 = ZN.Xd() ^ (364637159 ^ 640800007);
        int i2 = length / iXd2;
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(iArrVd, i3 * 16, iArr, 0, iXd2);
            for (int i4 = (646226188 ^ 1091202331) ^ 1737411591; i4 < iArr.length; i4++) {
                iArr[i4] = Qg.ud(iArr[i4 - 2]) + iArr[i4 - 7] + C1593ug.Yd(iArr[i4 - 15]) + iArr[i4 - 16];
            }
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr2[ZN.Xd() ^ (295169284 ^ 572380147)];
                int iXd3 = ZN.Xd() ^ 864698100;
                int iKd = i6 + ZO.Kd(iArr2[iXd3]) + Ig.od(iArr2[iXd3], iArr2[1425751891 ^ 1425751894], iArr2[FB.Xd() ^ 1609527093]) + HX.ud[i5] + iArr[i5];
                int iXd4 = Ug.Xd(iArr2[0]) + Qd(iArr2[0], iArr2[1], iArr2[(2145568963 ^ 1301429614) ^ 846263727]);
                System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
                iArr2[iXd3] = iArr2[iXd3] + iKd;
                iArr2[0] = iKd + iXd4;
            }
            for (int i7 = 0; i7 < iArr3.length; i7++) {
                iArr3[i7] = iArr3[i7] + iArr2[i7];
            }
        }
        return Qg.wd(iArr3);
    }

    public static boolean zd(float f2) {
        return Float.isInfinite(f2);
    }
}
