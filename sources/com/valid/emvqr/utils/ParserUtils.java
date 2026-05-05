package com.valid.emvqr.utils;

import com.valid.emvqr.a4;
import com.valid.emvqr.exceptions.UnknownTagException;
import com.valid.emvqr.q_;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class ParserUtils {
    private static String b(String str) {
        int iXd;
        int i2;
        int i3;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String strQd;
        String strIndexOf;
        Object[] objArr;
        int i14;
        String strUd = C1626yg.Ud("Y", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951484100))), (short) (ZN.Xd() ^ (OY.Xd() ^ 69955269)));
        int i15 = 1;
        if (Integer.parseInt(strUd) != 0) {
            iXd = 1;
        } else {
            notNull(str);
            iXd = FB.Xd() ^ (1278385517 ^ 333308543);
        }
        byte[] bytes = str.getBytes(Charset.forName(a4.indexOf(FB.Xd() ^ (1928722997 ^ 756716804), Ig.wd("`\u00172\u0004\u001d", (short) (FB.Xd() ^ ((1839989275 ^ 287859895) ^ 2089030352))))));
        int length = bytes.length;
        char c2 = 0;
        int i16 = 0;
        int i17 = 65535;
        while (true) {
            i2 = (2103554113 ^ 2096584276) ^ 26666525;
            if (i16 >= length) {
                break;
            }
            byte b2 = bytes[i16];
            for (int i18 = 0; i18 < i2; i18++) {
                int i19 = Integer.parseInt(strUd) != 0 ? b2 : b2 >> (7 - i18);
                boolean z2 = (i19 + 1) - (i19 | 1) == 1;
                boolean z3 = (-1) - (((-1) - (i17 >> 15)) | ((-1) - 1)) == 1;
                i17 = Integer.parseInt(strUd) != 0 ? 1 : i17 << 1;
                if (z2 ^ z3) {
                    i17 ^= iXd;
                }
            }
            i16++;
        }
        int i20 = Integer.parseInt(strUd);
        String strOd = EO.Od("6Z", (short) (C1607wl.Xd() ^ (1963767645 ^ 1963782290)));
        if (i20 != 0) {
            i2 = 203892573 ^ 203892562;
            str2 = strUd;
            i3 = 1;
            i4 = 0;
        } else {
            i3 = (i17 + 65535) - (i17 | 65535);
            i4 = 2102102285 ^ 2102102300;
            str2 = strOd;
        }
        int iXd2 = Od.Xd() ^ (149836265 ^ 1326695862);
        if (i2 != 0) {
            i6 = i4 * iXd2;
            i7 = 3;
            i5 = 0;
            str2 = strUd;
        } else {
            i5 = i2 + 9;
            i6 = 1;
            i7 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i9 = i5 + 14;
            i8 = 1;
        } else {
            i8 = i7 + i7;
            i9 = i5 + 14;
            str2 = strOd;
        }
        if (i9 != 0) {
            i6 += i7 + i8;
            str2 = strUd;
            i10 = 0;
        } else {
            i10 = i9 + 6;
            iXd2 = 0;
        }
        if (Integer.parseInt(str2) != 0) {
            i12 = i10 + 7;
            i11 = 1;
            strOd = str2;
        } else {
            i11 = iXd2 + iXd2;
            i12 = i10 + 5;
        }
        Object[] objArr2 = null;
        if (i12 != 0) {
            i6 /= iXd2 + i11;
            strQd = C1561oA.Qd("\t\f\u007fS", (short) (ZN.Xd() ^ ((1054495096 ^ 1895924967) ^ 1339812111)));
            i13 = 0;
        } else {
            i13 = i12 + 7;
            strUd = strOd;
            strQd = null;
        }
        if (Integer.parseInt(strUd) != 0) {
            i14 = i13 + 14;
            strIndexOf = null;
            objArr = null;
        } else {
            strIndexOf = a4.indexOf(i6, strQd);
            objArr = new Object[1];
            i14 = i13 + 5;
        }
        if (i14 != 0) {
            i15 = i3;
            objArr2 = objArr;
        } else {
            c2 = 1;
        }
        objArr2[c2] = Integer.valueOf(i15);
        return String.format(strIndexOf, objArr);
    }

    public static boolean isNumeric(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    for (char c2 : str.toCharArray()) {
                        if (!Character.isDigit(Character.valueOf(c2).charValue())) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (q_ unused) {
            }
        }
        return false;
    }

    public static String isValidTagString(String str) throws UnknownTagException {
        int i2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        String strIndexOf;
        String strZd = C1593ug.zd("+", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (987354575 ^ (-1056111192)))), (short) (C1499aX.Xd() ^ (745498193 ^ (-745497994))));
        int i7 = Integer.parseInt(strZd);
        String strOd = C1561oA.od("76", (short) (OY.Xd() ^ (1409888187 ^ 1409890796)));
        int i8 = 1273335416 ^ 1273335410;
        int i9 = 1;
        if (i7 != 0) {
            i4 = 1740558149 ^ 1740558155;
            str2 = strZd;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 299;
            i3 = 4;
            str2 = strOd;
            i4 = i8;
        }
        int i10 = 0;
        if (i4 != 0) {
            i3 += i3 + i3;
            str2 = strZd;
            i5 = 0;
        } else {
            i5 = i4 + 15;
        }
        if (Integer.parseInt(str2) != 0) {
            i6 = i5 + i8;
            strOd = str2;
        } else {
            i2 += i3;
            i6 = i5 + 13;
            i10 = 23;
        }
        if (i6 != 0) {
            i9 = i10 + i10 + i10;
        } else {
            strZd = strOd;
        }
        if (Integer.parseInt(strZd) != 0) {
            strIndexOf = null;
        } else {
            strIndexOf = a4.indexOf(i2 / i9, C1561oA.Kd("\u001b#5u7\u00045", (short) (C1580rY.Xd() ^ (1455103466 ^ (-1455107683)))));
        }
        if (Pattern.compile(strIndexOf).matcher(str).matches()) {
            return str;
        }
        throw new UnknownTagException(str);
    }

    public static <T> T notNull(T t2) {
        if (t2 != null) {
            return t2;
        }
        try {
            throw new IllegalArgumentException();
        } catch (q_ unused) {
            return null;
        }
    }

    public static boolean validateChecksumCRC16(String str) {
        int i2;
        String str2;
        notNull(str);
        String strZd = Wg.Zd("Y", (short) (C1580rY.Xd() ^ ((894239030 ^ 540848003) ^ (-359784758))), (short) (C1580rY.Xd() ^ ((147511312 ^ 398824693) ^ (-521094441))));
        boolean z2 = Integer.parseInt(strZd) != 0;
        int i3 = 1003977693 ^ 1003977689;
        if (str.length() <= i3) {
            return z2;
        }
        String strSubstring = str.substring(0, str.length() - i3);
        if (Integer.parseInt(strZd) != 0) {
            i2 = 245953934 ^ 245953929;
            str2 = null;
        } else {
            String strSubstring2 = str.substring(str.length() - i3);
            i2 = 12;
            str2 = strSubstring;
            strSubstring = strSubstring2;
        }
        return (i2 != 0 ? strSubstring.toUpperCase(Locale.ENGLISH) : null).equals(b(str2));
    }
}
