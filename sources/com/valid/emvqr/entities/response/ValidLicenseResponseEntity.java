package com.valid.emvqr.entities.response;

import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class ValidLicenseResponseEntity {
    private String response;

    public class NullPointerException extends RuntimeException {
    }

    public String isResponse() {
        return this.response;
    }

    public boolean isValid() {
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        String strQd = Xg.qd(",", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831076565)), (short) (C1499aX.Xd() ^ (1426640460 ^ (-1426627924))));
        int i8 = Integer.parseInt(strQd);
        short sXd = (short) (OY.Xd() ^ (1731737636 ^ 1731724216));
        short sXd2 = (short) (OY.Xd() ^ ((486887624 ^ 2073808444) ^ 1721695528));
        int[] iArr = new int["\u000f&".length()];
        QB qb = new QB("\u000f&");
        int i9 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i9] = xuXd.fK(xuXd.CK(iKK) - ((i9 * sXd2) ^ sXd));
            i9++;
        }
        String str2 = new String(iArr, 0, i9);
        int i10 = 1;
        if (i8 != 0) {
            i4 = 1929476072 ^ 1929476064;
            str = strQd;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 170;
            i3 = 3;
            i4 = 2;
            str = str2;
        }
        int i11 = 0;
        int i12 = (1132341493 ^ 444399772) ^ 1493379171;
        if (i4 != 0) {
            i6 = i3 + i3;
            str = strQd;
            i5 = 0;
        } else {
            i5 = i4 + i12;
            i6 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i7 = i5 + i12;
            str2 = str;
        } else {
            i2 += i3 + i6;
            i7 = i5 + 12;
            i11 = i12;
        }
        if (i7 != 0) {
            i10 = i11 + i11;
        } else {
            strQd = str2;
        }
        int i13 = Integer.parseInt(strQd);
        String strXd = ZO.xd("\bovj", (short) (ZN.Xd() ^ ((1430824839 ^ 2015161701) ^ 760483336)), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207816347)));
        if (i13 == 0) {
            strXd = qb.substring(strXd, i2 / (i11 + i10));
        }
        return strXd.equals(this.response);
    }

    public void setResponse(String str) {
        try {
            this.response = str;
        } catch (NullPointerException unused) {
        }
    }
}
