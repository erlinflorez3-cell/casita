package com.valid.communication;

import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    public static String concat(int i2, String str) {
        int iXd;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        char[] charArray;
        int i7;
        int length;
        String strXd = ZO.xd("\u0001", (short) (FB.Xd() ^ (586445919 ^ 586432887)), (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849978021)));
        int i8 = Integer.parseInt(strXd);
        String strUd = C1626yg.Ud(">", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849971145))), (short) (C1580rY.Xd() ^ ((2057535039 ^ 1764301669) ^ (-327824813))));
        if (i8 != 0) {
            iXd = C1633zX.Xd() ^ (-1951491127);
            i3 = 1762362270 ^ 1762362259;
            str2 = strXd;
            i4 = 0;
        } else {
            iXd = 1325644572 ^ 1325644568;
            i3 = (467952493 ^ 1179434973) ^ 1571347640;
            str2 = strUd;
            i4 = 1;
        }
        if (i3 != 0) {
            str2 = strXd;
            i5 = 0;
            i6 = i4 + iXd;
            i4 = 0;
        } else {
            i5 = i3 + 14;
            i6 = iXd;
        }
        char[] cArr = null;
        if (Integer.parseInt(str2) != 0) {
            i7 = i5 + 9;
            i4 = 1;
            strUd = str2;
            charArray = null;
        } else {
            i2--;
            charArray = str.toCharArray();
            i7 = i5 + 9;
        }
        if (i7 != 0) {
            length = charArray.length;
        } else {
            strXd = strUd;
            length = 1;
        }
        if (Integer.parseInt(strXd) != 0) {
            i4 = 1;
        } else {
            iXd <<= i6;
            cArr = charArray;
        }
        int i9 = (iXd - 1) ^ 32;
        while (i4 != length) {
            int i10 = cArr[i4] ^ ((-1) - (((-1) - i2) | ((-1) - i9)));
            i2 += 11;
            cArr[i4] = (char) i10;
            i4++;
        }
        return String.valueOf(cArr, 0, length).intern();
    }
}
