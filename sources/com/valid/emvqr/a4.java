package com.valid.emvqr;

import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes5.dex */
public class a4 {
    public static String indexOf(int i2, String str) {
        int i3;
        int iXd;
        String str2;
        int i4;
        int i5;
        int i6;
        char[] charArray;
        int i7;
        int length;
        String strVd = Wg.vd("\u0016", (short) (Od.Xd() ^ (730405835 ^ (-730428911))));
        int i8 = Integer.parseInt(strVd);
        String strKd = Qg.kd("LM", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1852771849 ^ (-1782853270)))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831084558)));
        int i9 = 1;
        if (i8 != 0) {
            i3 = (1129686671 ^ 1503415286) ^ 449441147;
            iXd = 1249876034 ^ 1249876041;
            str2 = strVd;
            i4 = 0;
        } else {
            i3 = 661502754 ^ 661502758;
            iXd = FB.Xd() ^ (2113774610 ^ 571657000);
            str2 = strKd;
            i4 = 1;
        }
        if (iXd != 0) {
            str2 = strVd;
            i5 = 0;
            i6 = i4 + i3;
            i4 = 0;
        } else {
            i5 = iXd + 15;
            i6 = i3;
        }
        char[] cArr = null;
        if (Integer.parseInt(str2) != 0) {
            i7 = i5 + 15;
            i4 = 1;
            strKd = str2;
            charArray = null;
        } else {
            i2 += 13;
            charArray = str.toCharArray();
            i7 = i5 + 5;
        }
        if (i7 != 0) {
            length = charArray.length;
        } else {
            strVd = strKd;
            length = 1;
        }
        if (Integer.parseInt(strVd) == 0) {
            i3 <<= i6;
            cArr = charArray;
            i9 = i4;
        }
        int i10 = (i3 - 1) ^ 32;
        while (i9 != length) {
            int i11 = cArr[i9] ^ (i2 & i10);
            i2 -= 7;
            cArr[i9] = (char) i11;
            i9++;
        }
        return String.valueOf(cArr, 0, length).intern();
    }
}
