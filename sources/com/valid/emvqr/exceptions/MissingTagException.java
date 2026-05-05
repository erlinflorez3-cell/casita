package com.valid.emvqr.exceptions;

import com.valid.emvqr.a4;
import com.valid.emvqr.enums.Tag;
import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class MissingTagException extends EmvQrException {
    public MissingTagException(Tag tag) {
        super(String.format(qb.substring(C1561oA.Yd("J:336'$=6k=FD\u0004~n\u0002Ly9<GQ\u0012\rv\u0014\u0004", (short) (C1499aX.Xd() ^ ((1471606518 ^ 2015648464) ^ (-798147053)))), C1499aX.Xd() ^ (203730407 ^ (-1337969399))), tag.getTag()));
    }

    public MissingTagException(Tag tag, String str) {
        super(String.format(a4.indexOf(OY.Xd() ^ 69929195, Xg.qd("Uaf:16',!r@%\u007f:1=,s<x\u0003?I~J?G:\u0001F\u0016\bHEJZ\u0004J\u0007OL\u0013NOM`P", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (525101087 ^ (-1896380024)))), (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951467484)))), tag.getTag(), str));
    }

    public MissingTagException(String str) {
        super(str);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public int getErrorCode() {
        return C1607wl.Xd() ^ (-1849955282);
    }

    @Override // com.valid.emvqr.exceptions.EmvQrException
    public String getErrorName() {
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6 = 93716848 ^ 93716850;
        if (Integer.parseInt(Jg.Wd("\t", (short) (C1607wl.Xd() ^ (1010332453 ^ 1010330172)), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864711154)))) != 0) {
            i3 = 1;
            c2 = 11;
            i2 = 1;
            i4 = 1;
        } else {
            i2 = 132;
            i3 = 4;
            c2 = 3;
            i4 = i6;
        }
        if (c2 != 0) {
            i2 += i3 << i4;
            i5 = 978106202 ^ 978106198;
        } else {
            i5 = 0;
        }
        return a4.indexOf(i2 / (i5 << i6), ZO.xd("\nr\u0019p \u000e\u001b]\u000f\\E;\u001cuE", (short) (C1633zX.Xd() ^ (114128435 ^ (-114122947))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134259955))));
    }
}
