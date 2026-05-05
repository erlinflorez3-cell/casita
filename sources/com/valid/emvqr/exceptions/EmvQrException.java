package com.valid.emvqr.exceptions;

import com.dynatrace.android.agent.Global;
import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class EmvQrException extends Exception {
    public EmvQrException(String str) {
        super(str);
    }

    public int getErrorCode() {
        return C1633zX.Xd() ^ (2058340150 ^ 251568906);
    }

    public String getErrorMessage() {
        int i2;
        String str;
        int i3;
        String strSubstring;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        StringBuilder sb = new StringBuilder();
        String strZd = C1593ug.zd(Global.COLON, (short) (OY.Xd() ^ (Od.Xd() ^ 1207799868)), (short) (OY.Xd() ^ ((1339236312 ^ 77765188) ^ 1265745017)));
        int i13 = Integer.parseInt(strZd);
        String strOd = C1561oA.od("\u0005\u0006", (short) (ZN.Xd() ^ ((183714312 ^ 1604127478) ^ 1433299289)));
        if (i13 != 0) {
            str = strZd;
            i2 = 12;
        } else {
            sb = sb.append(getErrorName());
            i2 = 78839786 ^ 78839780;
            str = strOd;
        }
        int i14 = 0;
        if (i2 != 0) {
            strSubstring = C1561oA.Kd("t=", (short) (C1633zX.Xd() ^ ((1857429670 ^ 1011227871) ^ (-1391491734))));
            i4 = 11;
            i3 = 0;
            str = strZd;
        } else {
            i3 = i2 + 6;
            strSubstring = null;
            i4 = 0;
        }
        int i15 = 1;
        if (Integer.parseInt(str) != 0) {
            i6 = i3 + 5;
            i4 = 0;
            i5 = 1;
        } else {
            i5 = i4 + i4;
            i6 = i3 + 9;
            str = strOd;
        }
        if (i6 != 0) {
            i8 = i4 << 2;
            str = strZd;
            i7 = 0;
        } else {
            i7 = i6 + 10;
            i8 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i9 = i7 + 12;
            strOd = str;
            i10 = 1;
        } else {
            i5 += i8;
            i9 = i7 + 12;
            i8 = 3;
            i10 = 3;
        }
        if (i9 != 0) {
            i5 += i8 + i10;
            i11 = 6;
        } else {
            strZd = strOd;
            i11 = 0;
            i14 = i9 + 12;
        }
        if (Integer.parseInt(strZd) != 0) {
            i12 = i14 + 12;
        } else {
            i15 = i11 + i11;
            i12 = i14 + 6;
        }
        if (i12 != 0) {
            strSubstring = qb.substring(strSubstring, i5 / (i11 + i15));
        }
        return sb.append(strSubstring).append(getMessage()).toString();
    }

    public String getErrorName() {
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        int iXd = FB.Xd() ^ 1609515907;
        int iXd2 = C1580rY.Xd() ^ (-831093344);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int["K".length()];
        QB qb = new QB("K");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK(((i6 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i6++;
        }
        if (Integer.parseInt(new String(iArr, 0, i6)) != 0) {
            i4 = 1;
            c2 = 15;
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 81;
            i3 = 2;
            c2 = 7;
            i4 = 2;
        }
        if (c2 != 0) {
            i2 += i4 + i3;
            i5 = (1504595107 ^ 1172555252) ^ 474843486;
        } else {
            i5 = 0;
        }
        int i7 = i2 / (i5 + i5);
        short sXd3 = (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1896809846 ^ 525012471)));
        int[] iArr2 = new int["Vw|GPPA\u001eE;@S".length()];
        QB qb2 = new QB("Vw|GPPA\u001eE;@S");
        int i8 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i8] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i8));
            i8++;
        }
        return a4.indexOf(i7, new String(iArr2, 0, i8));
    }
}
