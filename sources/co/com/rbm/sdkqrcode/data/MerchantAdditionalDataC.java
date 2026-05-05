package co.com.rbm.sdkqrcode.data;

import com.dynatrace.android.agent.AdkSettings;
import com.valid.emvqr.entities.MerchantAdditionalData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantAdditionalDataC implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f2540a;

    /* JADX INFO: renamed from: b */
    public String f2541b;

    /* JADX INFO: renamed from: c */
    public String f2542c;

    /* JADX INFO: renamed from: d */
    public String f2543d;

    /* JADX INFO: renamed from: e */
    public String f2544e;

    /* JADX INFO: renamed from: f */
    public String f2545f;

    /* JADX INFO: renamed from: g */
    public String f2546g;

    /* JADX INFO: renamed from: h */
    public String f2547h;

    /* JADX INFO: renamed from: i */
    public String f2548i;

    public class Exception extends RuntimeException {
    }

    public MerchantAdditionalDataC(Object obj) {
        String billNumber;
        char c2;
        String str;
        MerchantAdditionalDataC merchantAdditionalDataC;
        char c3;
        char c4;
        if (obj instanceof MerchantAdditionalData) {
            MerchantAdditionalData merchantAdditionalData = (MerchantAdditionalData) obj;
            String str2 = AdkSettings.PLATFORM_TYPE_MOBILE;
            char c5 = '\n';
            String str3 = "12";
            if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
                merchantAdditionalData = null;
                merchantAdditionalDataC = null;
                billNumber = null;
                str = AdkSettings.PLATFORM_TYPE_MOBILE;
                c2 = '\n';
            } else {
                billNumber = merchantAdditionalData.getBillNumber();
                c2 = 11;
                str = "12";
                merchantAdditionalDataC = this;
            }
            if (c2 != 0) {
                merchantAdditionalDataC.f2540a = billNumber;
                billNumber = merchantAdditionalData.getMobileNumber();
                merchantAdditionalDataC = this;
                str = AdkSettings.PLATFORM_TYPE_MOBILE;
            }
            if (Integer.parseInt(str) != 0) {
                c3 = 15;
            } else {
                merchantAdditionalDataC.f2541b = billNumber;
                billNumber = merchantAdditionalData.getStoreLabel();
                c3 = '\t';
                str = "12";
                merchantAdditionalDataC = this;
            }
            if (c3 != 0) {
                merchantAdditionalDataC.f2542c = billNumber;
                billNumber = merchantAdditionalData.getLoyaltyNumber();
                merchantAdditionalDataC = this;
                str = AdkSettings.PLATFORM_TYPE_MOBILE;
            }
            if (Integer.parseInt(str) != 0) {
                c4 = 7;
                str3 = str;
            } else {
                merchantAdditionalDataC.f2543d = billNumber;
                billNumber = merchantAdditionalData.getReferenceLabel();
                c4 = 2;
                merchantAdditionalDataC = this;
            }
            if (c4 != 0) {
                merchantAdditionalDataC.f2544e = billNumber;
                billNumber = merchantAdditionalData.getCustomerLabel();
                merchantAdditionalDataC = this;
            } else {
                str2 = str3;
            }
            if (Integer.parseInt(str2) != 0) {
                c5 = 15;
            } else {
                merchantAdditionalDataC.f2545f = billNumber;
                billNumber = merchantAdditionalData.getTerminalLabel();
                merchantAdditionalDataC = this;
            }
            if (c5 != 0) {
                merchantAdditionalDataC.f2546g = billNumber;
                billNumber = merchantAdditionalData.getPurposeOfTransaction();
                merchantAdditionalDataC = this;
            }
            merchantAdditionalDataC.f2547h = billNumber;
            this.f2548i = merchantAdditionalData.getAdditionalCostumerDataRequest();
        }
    }

    public String getAdditionalConsumerDataRequest() {
        return this.f2548i;
    }

    public String getBillNumber() {
        return this.f2540a;
    }

    public String getCustomerLabel() {
        return this.f2545f;
    }

    public String getLoyaltyNumber() {
        return this.f2543d;
    }

    public String getMobileNumber() {
        return this.f2541b;
    }

    public String getPurposeOfTransaction() {
        return this.f2547h;
    }

    public String getReferenceLabel() {
        return this.f2544e;
    }

    public String getStoreLabel() {
        return this.f2542c;
    }

    public String getTerminalLabel() {
        return this.f2546g;
    }
}
