package com.valid.emvqr;

import yg.FB;
import yg.Jg;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class qb {
    public static String substring(String str, int i2) {
        int i3;
        int i4;
        String strXd;
        int i5;
        char[] charArray;
        int i6;
        int length;
        int i7;
        String strWd = Jg.Wd(",", (short) (ZN.Xd() ^ (FB.Xd() ^ (1975730058 ^ 707529855))), (short) (ZN.Xd() ^ (OY.Xd() ^ (1956876864 ^ 1888005325))));
        int i8 = 4;
        if (Integer.parseInt(strWd) != 0) {
            i4 = (1719081966 ^ 1434280857) ^ 856324216;
            strXd = strWd;
            i3 = 4;
        } else {
            i3 = 5;
            i4 = 9;
            strXd = ZO.xd("J", (short) (FB.Xd() ^ ((1416437426 ^ 1851478270) ^ 976621902)), (short) (FB.Xd() ^ (FB.Xd() ^ 1609512915)));
        }
        char[] cArr = null;
        int i9 = 1;
        if (i4 != 0) {
            i2 -= 2;
            charArray = str.toCharArray();
            i5 = 0;
            i6 = 0;
        } else {
            i5 = i4 + 6;
            strWd = strXd;
            charArray = null;
            i6 = 1;
        }
        if (Integer.parseInt(strWd) != 0) {
            i7 = i5 + 8;
            length = 1;
        } else {
            length = charArray.length;
            i7 = i5 + 4;
        }
        if (i7 != 0) {
            i8 = 4 << i3;
            cArr = charArray;
            i9 = i6;
        }
        int i10 = (i8 - 1) ^ 32;
        while (i9 != length) {
            int i11 = cArr[i9] ^ ((i2 + i10) - (i2 | i10));
            i2 -= 3;
            cArr[i9] = (char) i11;
            i9++;
        }
        return String.valueOf(cArr, 0, length).intern();
    }
}
