package com.valid.emvqr.exceptions;

import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidLengthException extends EmvQrException {
    public InvalidLengthException(String str) {
        super(String.format(qb.substring(EO.Od("g\u0002*WL+NR\".8Qv$P#\u0001\u0019O(Y\u001e4D7+@be(}\u0016+&\u0001\tSL`Z<\u0018*^Nscn8$=JT927y\u0014>>x\u000eQCU\u001cS;\u0005%b\r0", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951486773))), C1633zX.Xd() ^ (-1951491121)), str));
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return 1917203376 ^ (-1917203389);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int i3;
        int iXd;
        String strZd;
        String strQd = C1561oA.Qd("4", (short) (Od.Xd() ^ ((821736012 ^ 1018157771) ^ (-206925030))));
        if (Integer.parseInt(strQd) != 0) {
            i3 = 1;
            iXd = 9;
            strZd = strQd;
            i2 = 1;
        } else {
            i2 = 32;
            i3 = 3;
            iXd = OY.Xd() ^ 69929198;
            strZd = C1593ug.zd("ts", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864699660))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1429820284 ^ (-314874531)))));
        }
        if (iXd != 0) {
            i2 += i3 + i3;
        } else {
            strQd = strZd;
        }
        int i4 = Integer.parseInt(strQd) != 0 ? 0 : 8;
        return qb.substring(C1561oA.od("(C?FMF5\u0011,3.19\"+#\"?", (short) (OY.Xd() ^ ((609878588 ^ 352930913) ^ 827548315))), i2 / (i4 + (i4 + i4)));
    }
}
