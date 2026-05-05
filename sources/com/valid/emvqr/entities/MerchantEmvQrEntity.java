package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.ae;
import com.valid.emvqr.enums.MerchantEmvQrTag;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.exceptions.MissingTagException;
import com.valid.emvqr.qb;
import java.io.Serializable;
import java.util.Map;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantEmvQrEntity extends AbstractMerchantEntity<MerchantEmvQrTag> {

    /* JADX INFO: renamed from: k */
    private MerchantAccountInformation f18297k;

    public MerchantEmvQrEntity() {
        super(MerchantEmvQrTag.class, "");
        this.f18297k = new MerchantAccountInformation();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0123 A[Catch: ae -> 0x0132, TryCatch #0 {ae -> 0x0132, blocks: (B:83:0x0000, B:85:0x0010, B:87:0x002b, B:91:0x0040, B:93:0x004e, B:94:0x0054, B:95:0x006f, B:113:0x0123, B:119:0x0133, B:121:0x0143, B:124:0x0154, B:126:0x0169, B:127:0x0177, B:128:0x0178, B:130:0x0191, B:131:0x0198, B:132:0x0199, B:134:0x01a9, B:137:0x01bb, B:139:0x01e1, B:140:0x01e8, B:141:0x01e9, B:143:0x020f, B:144:0x0216, B:145:0x0217, B:147:0x0227, B:150:0x0239, B:152:0x0260, B:153:0x0267, B:102:0x00b4, B:106:0x00e8, B:110:0x0118, B:90:0x0033), top: B:155:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k() throws com.valid.emvqr.exceptions.EmvQrException {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.valid.emvqr.entities.MerchantEmvQrEntity.k():void");
    }

    private final void p() throws EmvQrException {
        Serializable serializable;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        String strUd = C1626yg.Ud("+", (short) (C1607wl.Xd() ^ (2125890091 ^ 2125919744)), (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609504126)));
        try {
            if (getMap().containsKey(MerchantEmvQrTag.TAG_01_POINT_INITIATION_METHOD.getTag())) {
                Map<String, Serializable> map = getMap();
                int i7 = Integer.parseInt(strUd);
                String strWd = Ig.wd("h\u001b", (short) (C1633zX.Xd() ^ (2057052001 ^ (-2057073870))));
                String strValueOf = null;
                if (i7 != 0) {
                    i2 = (320686811 ^ 1060869056) ^ 740743442;
                    str = strUd;
                    serializable = null;
                } else {
                    serializable = map.get(MerchantEmvQrTag.TAG_01_POINT_INITIATION_METHOD.getTag());
                    i2 = 5;
                    str = strWd;
                }
                int i8 = 0;
                if (i2 != 0) {
                    strValueOf = String.valueOf(serializable);
                    i3 = 13;
                    str = strUd;
                } else {
                    i3 = 0;
                    i8 = i2 + 7;
                }
                int i9 = 1668587749 ^ 1668587745;
                if (Integer.parseInt(str) != 0) {
                    i5 = i8 + 14;
                    strWd = str;
                    i4 = 1;
                    i6 = 1;
                } else {
                    i4 = i3 << 3;
                    i5 = i8 + 2;
                    i6 = i9;
                }
                if (i5 != 0) {
                    i4 += i6 << 2;
                } else {
                    strUd = strWd;
                }
                if (a4.indexOf(i4 / (Integer.parseInt(strUd) == 0 ? 1109556503 ^ 1109556515 : 1), EO.Od("\u00062", (short) (C1499aX.Xd() ^ ((1875978986 ^ 1100445104) ^ (-776364592))))).equals(strValueOf) && getMap().get(MerchantEmvQrTag.TAG_54_TRANSACTION_AMOUNT.getTag()) == null) {
                    short sXd = (short) (C1633zX.Xd() ^ ((2045703097 ^ 251960302) ^ (-1995067765)));
                    int[] iArr = new int["N-8=?=5n\u000f\t\u0010^\u000b$r/5\"\u001f^)\u001e!Yfb\"_MPfMSX\"R[W\u0012\u0019\u001e".length()];
                    QB qb = new QB("N-8=?=5n\u000f\t\u0010^\u000b$r/5\"\u001f^)\u001e!Yfb\"_MPfMSX\"R[W\u0012\u0019\u001e");
                    int i10 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i10] = xuXd.fK(sXd + sXd + sXd + i10 + xuXd.CK(iKK));
                        i10++;
                    }
                    throw new MissingTagException(qb.substring(new String(iArr, 0, i10), i9));
                }
            }
        } catch (ae unused) {
        }
    }

    public String getCountryCode() {
        try {
            return v(MerchantEmvQrTag.TAG_58_COUNTRY_CODE);
        } catch (ae unused) {
            return null;
        }
    }

    public String getCrc() {
        try {
            return v(MerchantEmvQrTag.TAG_63_CRC);
        } catch (ae unused) {
            return null;
        }
    }

    public MerchantAccountInformation getMerchantAccountInformation() {
        return this.f18297k;
    }

    public MerchantAdditionalData getMerchantAdditionalData() {
        try {
            return (MerchantAdditionalData) getMap().get(MerchantEmvQrTag.TAG_62_ADDITIONAL_DATA_FIELD.getTag());
        } catch (ae unused) {
            return null;
        }
    }

    public String getMerchantCategoryCode() {
        try {
            return v(MerchantEmvQrTag.TAG_52_MERCHANT_CATEGORY_CODE);
        } catch (ae unused) {
            return null;
        }
    }

    public String getMerchantCity() {
        try {
            return v(MerchantEmvQrTag.TAG_60_MERCHANT_CITY);
        } catch (ae unused) {
            return null;
        }
    }

    public MerchantInformationLanguage getMerchantInformationLanguage() {
        try {
            return (MerchantInformationLanguage) getMap().get(MerchantEmvQrTag.TAG_64_ALTERNATE_LANGUAGE_INFORMATION.getTag());
        } catch (ae unused) {
            return null;
        }
    }

    public String getMerchantName() {
        try {
            return v(MerchantEmvQrTag.TAG_59_MERCHANT_NAME);
        } catch (ae unused) {
            return null;
        }
    }

    public Map<String, MerchantUnreservedTemplate> getMerchantUnreservedTemplates() {
        try {
            return x(MerchantEmvQrTag.TAG_80_UNRESERVED_TEMPLATE.getTag(), MerchantEmvQrTag.TAG_99_UNRESERVED_TEMPLATE.getTag());
        } catch (ae unused) {
            return null;
        }
    }

    public String getPayloadFormatIndicator() {
        try {
            return v(MerchantEmvQrTag.TAG_00_PAYLOAD_FORMAT_INDICATOR);
        } catch (ae unused) {
            return null;
        }
    }

    public String getPointOfInitiationMethod() {
        try {
            return v(MerchantEmvQrTag.TAG_01_POINT_INITIATION_METHOD);
        } catch (ae unused) {
            return null;
        }
    }

    public String getPostalCode() {
        try {
            return v(MerchantEmvQrTag.TAG_61_POSTAL_CODE);
        } catch (ae unused) {
            return null;
        }
    }

    public Map<String, String> getRfuForEMVCo() {
        try {
            return y(MerchantEmvQrTag.TAG_65.getTag(), MerchantEmvQrTag.TAG_79.getTag());
        } catch (ae unused) {
            return null;
        }
    }

    public String getTipOrConvenienceIndicator() {
        try {
            return v(MerchantEmvQrTag.TAG_55_TIP_INDICATOR);
        } catch (ae unused) {
            return null;
        }
    }

    public String getTransactionAmount() {
        try {
            return v(MerchantEmvQrTag.TAG_54_TRANSACTION_AMOUNT);
        } catch (ae unused) {
            return null;
        }
    }

    public String getTransactionCurrency() {
        try {
            return v(MerchantEmvQrTag.TAG_53_TRANSACTION_CURRENCY_CODE);
        } catch (ae unused) {
            return null;
        }
    }

    public String getValueOfConvenienceFeeFixed() {
        try {
            return v(MerchantEmvQrTag.TAG_56_CONVENIENCE_FEE_FIXED);
        } catch (ae unused) {
            return null;
        }
    }

    public String getValueOfConvenienceFeePercentage() {
        try {
            return v(MerchantEmvQrTag.TAG_57_CONVENIENCE_FEE_PERCENTAGE);
        } catch (ae unused) {
            return null;
        }
    }

    @Override // com.valid.emvqr.entities.AbstractMerchantEntity
    public void validate() throws EmvQrException {
        super.validate();
        short sXd = (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207827556)));
        short sXd2 = (short) (C1580rY.Xd() ^ (1386322650 ^ (-1386321430)));
        int[] iArr = new int["U".length()];
        QB qb = new QB("U");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        if (Integer.parseInt(new String(iArr, 0, i2)) == 0) {
            this.f18297k.validate();
        }
        k();
        p();
    }
}
