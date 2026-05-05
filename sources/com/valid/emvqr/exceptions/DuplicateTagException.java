package com.valid.emvqr.exceptions;

import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class DuplicateTagException extends EmvQrException {
    public DuplicateTagException(String str) {
        super(String.format(qb.substring(C1561oA.ud("Mz19@809,e-\u001e2u70\u001c3\u001dcYR`)V", (short) (FB.Xd() ^ (1603186766 ^ 1603184759))), C1499aX.Xd() ^ (939799851 ^ (-2074038846))), str));
    }

    public DuplicateTagException(String str, String str2) {
        super(String.format(qb.substring(C1561oA.yd("bGJRUIIRQ\u000b^G[\u001bT]1,>\u0001no9B\u007fJ\nz>\t{}r:nwk*%82y", (short) (Od.Xd() ^ (1472181281 ^ (-1472179391)))), C1580rY.Xd() ^ (-831067166)), str, str2));
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return C1580rY.Xd() ^ 831067156;
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int i3;
        int iXd;
        String strQd;
        int i4;
        int i5;
        int i6;
        short sXd = (short) (C1580rY.Xd() ^ (23254718 ^ (-23258413)));
        int[] iArr = new int["C".length()];
        QB qb = new QB("C");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i7));
            i7++;
        }
        String str = new String(iArr, 0, i7);
        if (Integer.parseInt(str) != 0) {
            iXd = FB.Xd() ^ 1609527094;
            strQd = str;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 135;
            i3 = 3;
            iXd = 7;
            strQd = Xg.qd("ED", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (64553133 ^ (-1143248925)))), (short) (C1499aX.Xd() ^ (1826530855 ^ (-1826537867))));
        }
        int i8 = 0;
        if (iXd != 0) {
            i5 = i3 + i3;
            i4 = 0;
        } else {
            i4 = iXd + 8;
            str = strQd;
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = i4 + 4;
        } else {
            i2 += i3 + i5;
            i6 = i4 + 13;
            i8 = (1450555933 ^ 1141529027) ^ 310371281;
        }
        return qb.substring(Jg.Wd("U$H=aUc|h^r\u0004l\u0019\u00190/", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864701996))), (short) (C1580rY.Xd() ^ ((1194490382 ^ 76939665) ^ (-1134828317)))), i2 / (i8 + (i6 != 0 ? i8 + i8 : 1)));
    }
}
