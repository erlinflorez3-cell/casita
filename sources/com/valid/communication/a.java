package com.valid.communication;

import yg.C1499aX;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static String startsWith(String str, int i2) {
        int iXd;
        String str2;
        int i3;
        int iXd2;
        int i4;
        int i5;
        char[] charArray;
        int i6;
        int length;
        int i7;
        short sXd = (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951480444));
        short sXd2 = (short) (C1580rY.Xd() ^ ((699295477 ^ 1961799915) ^ (-1564528798)));
        int[] iArr = new int["Y".length()];
        QB qb = new QB("Y");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK((xuXd.CK(iKK) - (sXd + i8)) + sXd2);
            i8++;
        }
        String str3 = new String(iArr, 0, i8);
        int i9 = 1980909751 ^ 1980909753;
        int i10 = 1;
        if (Integer.parseInt(str3) != 0) {
            iXd = C1499aX.Xd() ^ (261490720 ^ (-1275948850));
            iXd2 = C1633zX.Xd() ^ (-1951491129);
            str2 = str3;
            i3 = 0;
        } else {
            iXd = FB.Xd() ^ 1609527095;
            short sXd3 = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (807291160 ^ 60038399)));
            short sXd4 = (short) (C1607wl.Xd() ^ (1710578024 ^ 1710569685));
            int[] iArr2 = new int["so".length()];
            QB qb2 = new QB("so");
            int i11 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i11] = xuXd2.fK(xuXd2.CK(iKK2) - ((i11 * sXd4) ^ sXd3));
                i11++;
            }
            str2 = new String(iArr2, 0, i11);
            i3 = 1;
            iXd2 = i9;
        }
        char[] cArr = null;
        if (iXd2 != 0) {
            i5 = i3 + iXd;
            i2 -= 12;
            charArray = str.toCharArray();
            i4 = 0;
            i6 = 0;
        } else {
            i4 = iXd2 + 8;
            i5 = iXd;
            str3 = str2;
            charArray = null;
            i6 = 1;
        }
        if (Integer.parseInt(str3) != 0) {
            i7 = i4 + i9;
            length = 1;
        } else {
            length = charArray.length;
            i7 = i4 + i9;
        }
        if (i7 != 0) {
            iXd <<= i5;
            cArr = charArray;
            i10 = i6;
        }
        int i12 = (iXd - 1) ^ 32;
        while (i10 != length) {
            int i13 = cArr[i10] ^ ((i2 + i12) - (i2 | i12));
            i2 -= 15;
            cArr[i10] = (char) i13;
            i10++;
        }
        return String.valueOf(cArr, 0, length).intern();
    }
}
