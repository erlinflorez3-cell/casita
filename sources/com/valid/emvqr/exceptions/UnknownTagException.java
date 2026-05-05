package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public class UnknownTagException extends EmvQrException {
    public UnknownTagException(String str) {
        super(str);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return (1620732169 ^ 1283729945) ^ (-740180762);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        String str;
        int iXd;
        int i3;
        int iXd2;
        int i4;
        short sXd = (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849953164));
        short sXd2 = (short) (FB.Xd() ^ (725722289 ^ 725720726));
        int[] iArr = new int["\u0005".length()];
        QB qb = new QB("\u0005");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i5 * sXd2))) + xuXd.CK(iKK));
            i5++;
        }
        String str2 = new String(iArr, 0, i5);
        int i6 = Integer.parseInt(str2);
        int i7 = 1;
        int iXd3 = OY.Xd() ^ (1145940223 ^ 1080467474);
        if (i6 != 0) {
            iXd = OY.Xd() ^ (1832125655 ^ 1763642416);
            str = str2;
            i2 = 1;
        } else {
            i2 = 36;
            short sXd3 = (short) (Od.Xd() ^ ((242771867 ^ 1902458414) ^ (-2132624714)));
            int[] iArr2 = new int["\b5".length()];
            QB qb2 = new QB("\b5");
            int i8 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd3 + i8)));
                i8++;
            }
            str = new String(iArr2, 0, i8);
            iXd = iXd3;
        }
        if (iXd != 0) {
            iXd2 = C1607wl.Xd() ^ (2116860574 ^ 275294530);
            i3 = 0;
        } else {
            i3 = iXd + 13;
            iXd2 = 1;
            str2 = str;
        }
        if (Integer.parseInt(str2) != 0) {
            i4 = i3 + iXd3;
        } else {
            i2 += iXd2;
            i4 = i3 + iXd3;
            i7 = 3;
            iXd2 = 3;
        }
        if (i4 != 0) {
            iXd2 = iXd2 + i7 + i7;
        }
        int i9 = i2 / iXd2;
        short sXd4 = (short) (C1580rY.Xd() ^ (2088276492 ^ (-2088283354)));
        int[] iArr3 = new int["\u0016sFuBUu\bk9\u0015:N\u0019U{\u0016$d.\u0006".length()];
        QB qb3 = new QB("\u0016sFuBUu\bk9\u0015:N\u0019U{\u0016$d.\u0006");
        int i10 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i10] = xuXd3.fK((C1561oA.Xd[i10 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i10)) + xuXd3.CK(iKK3));
            i10++;
        }
        return a4.indexOf(i9, new String(iArr3, 0, i10));
    }
}
