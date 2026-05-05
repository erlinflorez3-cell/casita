package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidCrcException extends EmvQrException {
    public InvalidCrcException(String str) {
        super(String.format(a4.indexOf(C1633zX.Xd() ^ (-1951491127), ZO.xd("X4l*D\u0006l^\u001f\u001aHbjnd(\u0010U5y#>gq)\u0014&1-,p[D\u0005n2):p\u0005?Uu0\u0002S\u0006V[\n\f", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831063485))), (short) (OY.Xd() ^ (ZN.Xd() ^ 864710595)))), str));
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return C1580rY.Xd() ^ 831067153;
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int i3;
        int i4;
        if (Integer.parseInt(C1626yg.Ud("\u0014", (short) (OY.Xd() ^ ((35487191 ^ 1603650068) ^ 1569250462)), (short) (OY.Xd() ^ ((1378879211 ^ 1305850183) ^ 535148995)))) != 0) {
            i3 = 1;
            i4 = 12;
            i2 = 1;
        } else {
            i2 = 100;
            i3 = 4;
            i4 = (1853528276 ^ 1138722365) ^ 765796071;
        }
        if (i4 != 0) {
            i2 += i3 << 2;
        }
        return qb.substring(Ig.wd("\u0006'\fs<\u007f\u0014\u0007~L-3\u0006\u00028", (short) (C1499aX.Xd() ^ ((1401798125 ^ 615699062) ^ (-2000645371)))), i2 / 40);
    }
}
