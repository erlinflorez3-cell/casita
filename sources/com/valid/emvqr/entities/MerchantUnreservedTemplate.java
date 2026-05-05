package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.enums.MerchantTemplateTag;
import com.valid.emvqr.qb;
import com.valid.emvqr.zc;
import java.util.Map;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantUnreservedTemplate extends AbstractMerchantEntity<MerchantTemplateTag> {
    public MerchantUnreservedTemplate(String str) {
        super(MerchantTemplateTag.class, "", str);
    }

    public Map<String, String> getContextSpecificData() {
        int iXd;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        String strIndexOf;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String strZd = Wg.Zd("1", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69929451)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849954543)));
        int i17 = Integer.parseInt(strZd);
        String strXd = C1561oA.Xd("gf", (short) (Od.Xd() ^ ((1208580171 ^ 1827530018) ^ (-618980171))));
        if (i17 != 0) {
            str = strZd;
            i2 = 5;
            iXd = 1;
        } else {
            iXd = C1580rY.Xd() ^ (2067820132 ^ (-1254718061));
            i2 = 573184715 ^ 573184717;
            str = strXd;
        }
        int i18 = 4;
        int i19 = 0;
        if (i2 != 0) {
            i4 = iXd + 11;
            str = strZd;
            i5 = 4;
            i3 = 0;
        } else {
            i3 = i2 + 13;
            i4 = 1;
            i5 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i6 = i3 + 4;
            i18 = i5;
        } else {
            i4 += i5 + i5;
            i6 = i3 + 5;
            str = strXd;
        }
        if (i6 != 0) {
            i8 = i18 + i18;
            str = strZd;
            i7 = 0;
        } else {
            i7 = i6 + 15;
            i8 = 1;
        }
        String strKd = null;
        if (Integer.parseInt(str) != 0) {
            i9 = i7 + 13;
            str2 = null;
        } else {
            i4 /= i18 + i8;
            i9 = i7 + 5;
            short sXd = (short) (FB.Xd() ^ ((416039538 ^ 1964551310) ^ 1842648026));
            int[] iArr = new int["f\u007f".length()];
            QB qb = new QB("f\u007f");
            int i20 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i20] = xuXd.fK((sXd ^ i20) + xuXd.CK(iKK));
                i20++;
            }
            str2 = new String(iArr, 0, i20);
            str = strXd;
        }
        if (i9 != 0) {
            strIndexOf = a4.indexOf(i4, str2);
            strKd = Qg.kd("\u0001/", (short) (C1633zX.Xd() ^ (1042476383 ^ (-1042480884))), (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1464948607 ^ (-1400523344)))));
            str = strZd;
            i11 = 9;
            i10 = 0;
        } else {
            i10 = i9 + 9;
            i11 = 0;
            strIndexOf = null;
        }
        if (Integer.parseInt(str) != 0) {
            i13 = i10 + 11;
            i12 = 1;
        } else {
            i12 = i11 + i11;
            i13 = i10 + 9;
            str = strXd;
        }
        int i21 = 2;
        if (i13 != 0) {
            str = strZd;
            i14 = 0;
            i19 = i11;
            i15 = 2;
        } else {
            i14 = i13 + 15;
            i15 = 1;
            i12 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i16 = i14 + 12;
            i21 = 1;
            strXd = str;
        } else {
            i12 += i19 << i15;
            i16 = i14 + 10;
        }
        if (i16 != 0) {
            i12 += i21 + i21;
        } else {
            strZd = strXd;
        }
        return y(strIndexOf, qb.substring(strKd, i12 / (Integer.parseInt(strZd) == 0 ? C1633zX.Xd() ^ (-1951491111) : 1)));
    }

    public String getGloballyUniqueIdentifier() {
        try {
            return v(MerchantTemplateTag.TAG_00_GLOBALLY_UNIQUE_IDENTIFIER);
        } catch (zc unused) {
            return null;
        }
    }
}
