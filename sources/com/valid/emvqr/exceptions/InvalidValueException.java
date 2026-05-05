package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import com.valid.emvqr.enums.Tag;
import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes5.dex */
public class InvalidValueException extends EmvQrException {
    public InvalidValueException(Tag tag, String str) {
        super(String.format(qb.substring(C1561oA.Kd("s\\ULP\u0014\r!\u0012Z\nMZQ\"K\\V\u001a\u001d(\u0018\u001fo%\u001bi1\u001c6!$%8", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (1811101599 ^ (-739151661))))), (202018739 ^ 1956476917) ^ 2023225413), str, tag.getTag()));
    }

    public InvalidValueException(String str, Tag tag, String str2) {
        super(String.format(a4.indexOf(C1499aX.Xd() ^ (1013631252 ^ (-2146545156)), Wg.Zd("EM+>'\u0004M:gdI]\f[<glcr\u0005p\u0012\u0015{T@[c}b~%s\u0018f\u001cq\u0017V\u0001(GZd\u0016s\u000f\\}\"\u007f", (short) (C1607wl.Xd() ^ (162144210 ^ 162168213)), (short) (C1607wl.Xd() ^ ((443807600 ^ 2135818211) ^ 1698576048)))), str2, tag.getTag(), str));
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return C1633zX.Xd() ^ (1501682406 ^ 768655068);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        String str;
        int iXd;
        int i3;
        int i4;
        int i5;
        int iXd2;
        int i6;
        int i7;
        int i8;
        String strXd = C1561oA.Xd("+", (short) (FB.Xd() ^ ((835929362 ^ 1929904608) ^ 1121655382)));
        int i9 = Integer.parseInt(strXd);
        String strVd = Wg.vd("\\^", (short) (Od.Xd() ^ ((343716227 ^ 106431672) ^ (-304400056))));
        int i10 = 2;
        if (i9 != 0) {
            iXd = FB.Xd() ^ (553274338 ^ 2132092127);
            str = strXd;
            i2 = 1;
        } else {
            i2 = 40;
            str = strVd;
            iXd = 2;
        }
        int i11 = 0;
        if (iXd != 0) {
            str = strXd;
            i3 = 0;
            i4 = 20;
        } else {
            i3 = iXd + 5;
            i10 = 1;
            i2 = 1;
            i4 = 0;
        }
        if (Integer.parseInt(str) != 0) {
            i5 = i3 + 6;
            iXd2 = 1;
            strVd = str;
        } else {
            i2 += i4 << i10;
            i5 = i3 + 10;
            iXd2 = C1607wl.Xd() ^ 1849955294;
        }
        if (i5 != 0) {
            i7 = iXd2 + iXd2;
            i6 = 0;
        } else {
            i6 = i5 + 13;
            strXd = strVd;
            i7 = 1;
        }
        if (Integer.parseInt(strXd) != 0) {
            i8 = i6 + 7;
        } else {
            i2 += iXd2 + i7;
            i8 = i6 + 11;
            i11 = 20;
        }
        return qb.substring(Qg.kd("\bphqrqbV_W;``gT", (short) (Od.Xd() ^ ((640007253 ^ 2052003732) ^ (-1550515087))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849971256)))), i2 / (i11 + (i8 != 0 ? i11 + i11 : 1)));
    }
}
