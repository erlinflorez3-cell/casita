package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class MissingCharactersException extends EmvQrException {
    public MissingCharactersException() {
        super(a4.indexOf(136798980 ^ 136798977, hg.Vd("\f$#5nUp\u0015Zg]Pl +\u0012\"&%T\f\\]FMAHOZQ", (short) (C1580rY.Xd() ^ ((592853921 ^ 222053798) ^ (-778717331))), (short) (C1580rY.Xd() ^ (1954916627 ^ (-1954922467))))));
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return 1719569938 ^ (-1719569952);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int i3;
        int iXd;
        short sXd = (short) (OY.Xd() ^ (1253621440 ^ 1253614616));
        int[] iArr = new int["[".length()];
        QB qb = new QB("[");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK));
            i4++;
        }
        if (Integer.parseInt(new String(iArr, 0, i4)) != 0) {
            i3 = 1;
            iXd = 8;
            i2 = 1;
        } else {
            i2 = 187;
            i3 = 3;
            iXd = C1580rY.Xd() ^ (-831067162);
        }
        if (iXd != 0) {
            i2 += i3 + i3;
        }
        return qb.substring(C1561oA.yd("+E\t\u0003\u0017\u0012\rbw|\nt\rw\u000bq\r\u0001*\"\u0011\u001e", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (1544405776 ^ 1837409685)))), i2 / 34);
    }
}
