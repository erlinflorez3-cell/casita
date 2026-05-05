package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ConflictingTagException extends EmvQrException {
    public ConflictingTagException(String str) {
        super(str);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return C1499aX.Xd() ^ 1134257923;
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int iXd;
        String strKd;
        int i3;
        int i4;
        int iXd2;
        int i5;
        short sXd = (short) (Od.Xd() ^ (1037067966 ^ (-1037047335)));
        int[] iArr = new int["G".length()];
        QB qb = new QB("G");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK((sXd ^ i6) + xuXd.CK(iKK));
            i6++;
        }
        String str = new String(iArr, 0, i6);
        int i7 = 0;
        int i8 = 1;
        if (Integer.parseInt(str) != 0) {
            strKd = str;
            iXd = 5;
            i3 = 0;
            i2 = 1;
        } else {
            i2 = (25924497 ^ 1395153973) ^ 1386467206;
            iXd = Od.Xd() ^ (702355614 ^ 1847626946);
            strKd = Qg.kd("\u0017\u001b", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (643190705 ^ 400497124))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (100210699 ^ 879760406))));
            i3 = 17;
        }
        if (iXd != 0) {
            iXd2 = i3 << 2;
            i4 = 0;
        } else {
            i4 = iXd + 7;
            str = strKd;
            iXd2 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i5 = i4 + 8;
        } else {
            i2 += iXd2;
            i5 = i4 + 5;
            iXd2 = C1580rY.Xd() ^ (924682329 ^ (-110402628));
            i8 = 2;
        }
        if (i5 != 0) {
            i2 += iXd2 << i8;
            i7 = 17;
        }
        return a4.indexOf(i2 / (i7 << 2), hg.Vd("s\u000e\u0013b`CGH]>K0\u0016\u000ea\u000f\u0003\u000ev", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864686773)), (short) (C1607wl.Xd() ^ (1937374193 ^ 1937343990))));
    }
}
