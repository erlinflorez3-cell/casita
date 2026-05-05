package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.enums.MerchantTemplateTag;
import com.valid.emvqr.qb;
import com.valid.emvqr.qm;
import java.util.Map;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantAccountInformationTemplate extends AbstractMerchantEntity<MerchantTemplateTag> {
    public MerchantAccountInformationTemplate() {
        short sXd = (short) (Od.Xd() ^ (1807060795 ^ (-1807064748)));
        int[] iArr = new int[" '".length()];
        QB qb = new QB(" '");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        super(MerchantTemplateTag.class, "", qb.substring(new String(iArr, 0, i2), 1284238486 ^ 1284238483));
    }

    public String getGloballyUniqueIdentifier() {
        try {
            return v(MerchantTemplateTag.TAG_00_GLOBALLY_UNIQUE_IDENTIFIER);
        } catch (qm unused) {
            return null;
        }
    }

    public Map<String, String> getPaymentNetworkSpecific() {
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iXd;
        int i14;
        int i15;
        int i16;
        int i17;
        String strZd = C1593ug.zd("o", (short) (ZN.Xd() ^ (ZN.Xd() ^ (906770218 ^ 92698040))), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134248342))));
        int i18 = Integer.parseInt(strZd);
        int i19 = 13;
        short sXd = (short) (Od.Xd() ^ ((1153492072 ^ 1558557277) ^ (-405102132)));
        int[] iArr = new int["GM".length()];
        QB qb = new QB("GM");
        int i20 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i20] = xuXd.fK(sXd + sXd + i20 + xuXd.CK(iKK));
            i20++;
        }
        String str2 = new String(iArr, 0, i20);
        int i21 = 0;
        if (i18 != 0) {
            str = strZd;
            i2 = 5;
            i3 = 0;
            i4 = 0;
        } else {
            i2 = (36639976 ^ 1697386956) ^ 1728251168;
            i3 = 13;
            i4 = 13;
            str = str2;
        }
        int i22 = 1;
        if (i2 != 0) {
            i6 = i3 + i3;
            str = strZd;
            i5 = 0;
        } else {
            i5 = i2 + 6;
            i6 = 1;
        }
        int i23 = i6;
        if (Integer.parseInt(str) != 0) {
            i8 = i5 + 6;
            i7 = 1;
        } else {
            i7 = i4 + i23 + i6 + i6;
            i8 = i5 + 3;
            str = str2;
        }
        if (i8 != 0) {
            i10 = 8;
            str = strZd;
            i9 = 0;
        } else {
            i9 = i8 + 7;
            i10 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i11 = i9 + 10;
            i19 = 0;
        } else {
            i7 += i10;
            i11 = i9 + 6;
            str = str2;
        }
        short sXd2 = (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (814873907 ^ 1153485488)));
        int[] iArr2 = new int["$c".length()];
        QB qb2 = new QB("$c");
        int i24 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i24] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i24));
            i24++;
        }
        String str3 = new String(iArr2, 0, i24);
        if (i11 != 0) {
            str3 = qb.substring(str3, i7 / (i19 + i19));
            str = strZd;
            i12 = 0;
        } else {
            i12 = i11 + 14;
        }
        int i25 = Integer.parseInt(str);
        int iXd2 = C1580rY.Xd() ^ (498013209 ^ (-740687885));
        if (i25 != 0) {
            i13 = i12 + iXd2;
            i14 = 0;
            iXd = 1;
        } else {
            i13 = i12 + 7;
            iXd = ZN.Xd() ^ 864698098;
            i14 = iXd2;
            str = str2;
        }
        if (i13 != 0) {
            i16 = i14 + (i14 << iXd);
            str = strZd;
            i15 = 0;
            i22 = 3;
        } else {
            i15 = i13 + 5;
            i16 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i17 = i15 + 12;
            str2 = str;
        } else {
            i16 += i22 + i22;
            i17 = i15 + 3;
        }
        if (i17 != 0) {
            i21 = iXd2;
        } else {
            strZd = str2;
            iXd2 = 0;
        }
        if (Integer.parseInt(strZd) == 0) {
            i16 /= iXd2 + (i21 + iXd2);
        }
        return y(str3, a4.indexOf(i16, Wg.Zd("n@", (short) (OY.Xd() ^ ((1696656396 ^ 1202736585) ^ 579907095)), (short) (OY.Xd() ^ (241204383 ^ 241197332)))));
    }
}
