package com.valid.emvqr.entities;

import com.valid.emvqr.d8;
import com.valid.emvqr.enums.MerchantAdditionalDataTag;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.qb;
import java.util.Map;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantAdditionalData extends AbstractMerchantEntity<MerchantAdditionalDataTag> {
    public MerchantAdditionalData() {
        short sXd = (short) (OY.Xd() ^ (376105649 ^ 376086582));
        int[] iArr = new int["+e".length()];
        QB qb = new QB("+e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        super(MerchantAdditionalDataTag.class, "", qb.substring(new String(iArr, 0, i2), (773878692 ^ 1989299262) ^ 1488076696));
    }

    public String getAdditionalCostumerDataRequest() {
        try {
            return v(MerchantAdditionalDataTag.TAG_09_ADDITIONAL_CONSUMER_DATA_REQUEST);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getBillNumber() {
        try {
            return v(MerchantAdditionalDataTag.TAG_01_BILL_NUMBER);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getCustomerLabel() {
        try {
            return v(MerchantAdditionalDataTag.TAG_06_CONSUMER_ID);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getLoyaltyNumber() {
        try {
            return v(MerchantAdditionalDataTag.TAG_04_LOYALTY_NUMBER);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getMobileNumber() {
        try {
            return v(MerchantAdditionalDataTag.TAG_02_MOBILE_NUMBER);
        } catch (d8 unused) {
            return null;
        }
    }

    public Map<String, PaymentSystemSpecificTemplate> getPaymentSystemSpecificTemplate() {
        try {
            return n(MerchantAdditionalDataTag.TAG_50_PAYMENT_SYSTEM_SPECIFIC.getTag(), MerchantAdditionalDataTag.TAG_99_PAYMENT_SYSTEM_SPECIFIC.getTag());
        } catch (d8 unused) {
            return null;
        }
    }

    public String getPurposeOfTransaction() {
        try {
            return v(MerchantAdditionalDataTag.TAG_08_PURPOSE);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getReferenceLabel() {
        try {
            return v(MerchantAdditionalDataTag.TAG_05_REFERENCE_ID);
        } catch (d8 unused) {
            return null;
        }
    }

    public Map<String, String> getRfuForEMVCo() {
        try {
            return y(MerchantAdditionalDataTag.TAG_10.getTag(), MerchantAdditionalDataTag.TAG_49.getTag());
        } catch (d8 unused) {
            return null;
        }
    }

    public String getStoreLabel() {
        try {
            return v(MerchantAdditionalDataTag.TAG_03_STORE_ID);
        } catch (d8 unused) {
            return null;
        }
    }

    public String getTerminalLabel() {
        try {
            return v(MerchantAdditionalDataTag.TAG_07_TERMINAL_ID);
        } catch (d8 unused) {
            return null;
        }
    }

    @Override // com.valid.emvqr.entities.AbstractMerchantEntity
    public void validate() throws EmvQrException {
        super.validate();
    }
}
