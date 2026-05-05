package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.b2;
import com.valid.emvqr.enums.MerchantTemplateTag;
import com.valid.emvqr.qb;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class PaymentSystemSpecificTemplate extends AbstractMerchantEntity<MerchantTemplateTag> {
    public PaymentSystemSpecificTemplate(String str) {
        super(MerchantTemplateTag.class, "", str);
    }

    public String getGloballyUniqueIdentifier() {
        try {
            return v(MerchantTemplateTag.TAG_00_GLOBALLY_UNIQUE_IDENTIFIER);
        } catch (b2 unused) {
            return null;
        }
    }

    public Map<String, String> getPaymentSystemSpecific() {
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String strVd = hg.Vd("D", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134233852)), (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69943240))));
        int i19 = Integer.parseInt(strVd);
        String strUd = C1561oA.ud("a", (short) (FB.Xd() ^ ((66770591 ^ 745411582) ^ 798276448)));
        if (i19 != 0) {
            str = strVd;
            i3 = 12;
            i2 = 1;
        } else {
            i2 = (1653385355 ^ 1812719857) ^ 243745002;
            i3 = 13;
            str = strUd;
        }
        int i20 = 0;
        if (i3 != 0) {
            str = strVd;
            i5 = 4;
            i6 = 4;
            i4 = 0;
        } else {
            i4 = i3 + 13;
            i5 = 1;
            i6 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i7 = i4 + 15;
        } else {
            i2 += i6 + i5 + i5;
            i7 = i4 + 7;
            str = strUd;
        }
        if (i7 != 0) {
            str = strVd;
            i9 = 12;
            i10 = 12;
            i8 = 0;
        } else {
            i8 = i7 + 11;
            i9 = 0;
            i10 = 0;
        }
        if (Integer.parseInt(str) != 0) {
            i11 = i8 + 14;
        } else {
            i2 /= i10 + (i9 + i9);
            i11 = i8 + 6;
            str = strUd;
        }
        int i21 = 9;
        String strYd = C1561oA.yd("\u0007D", (short) (C1499aX.Xd() ^ (886493864 ^ (-886495428))));
        if (i11 != 0) {
            strYd = qb.substring(strYd, i2);
            str = strVd;
            i12 = 0;
            i13 = 9;
        } else {
            i12 = i11 + 4;
            i13 = 0;
        }
        if (Integer.parseInt(str) != 0) {
            i15 = i12 + 12;
            i14 = 1;
            i16 = 1;
            strUd = str;
        } else {
            i14 = i13 * i13;
            i15 = i12 + 13;
            i16 = 3;
        }
        if (i15 != 0) {
            i16 += i16 + i16;
            i17 = 0;
        } else {
            i17 = i15 + 8;
            strVd = strUd;
        }
        if (Integer.parseInt(strVd) != 0) {
            i18 = i17 + 5;
            i21 = 0;
        } else {
            i14 += i16;
            i18 = i17 + 8;
            i20 = 9;
        }
        int i22 = i14 / (i18 != 0 ? i20 + (i21 + i20) : 1);
        short sXd = (short) (Od.Xd() ^ (FB.Xd() ^ (111626013 ^ (-1497909938))));
        int[] iArr = new int["\u007f\b".length()];
        QB qb = new QB("\u007f\b");
        int i23 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i23] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i23));
            i23++;
        }
        return y(strYd, a4.indexOf(i22, new String(iArr, 0, i23)));
    }
}
