package co.com.rbm.sdkqrcode.data;

import co.com.rbm.sdkqrcode.BuildConfig;
import co.com.rbm.sdkqrcode.data.DataAmount;
import com.dynatrace.android.agent.AdkSettings;
import com.valid.emvqr.entities.MerchantAccountInformation;
import com.valid.emvqr.entities.MerchantAccountInformationTemplate;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantAccountInformationC implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f2537a;

    /* JADX INFO: renamed from: b */
    public String f2538b;

    /* JADX INFO: renamed from: c */
    public String f2539c;

    public class IOException extends RuntimeException {
    }

    public MerchantAccountInformationC(Object obj) {
        Map<String, MerchantAccountInformationTemplate> additionalPaymentNetworks;
        MerchantAccountInformationTemplate merchantAccountInformationTemplate;
        MerchantAccountInformationC merchantAccountInformationC;
        char c2;
        if (!(obj instanceof MerchantAccountInformation) || (additionalPaymentNetworks = ((MerchantAccountInformation) obj).getAdditionalPaymentNetworks()) == null) {
            return;
        }
        int iEndsWith = DataAmount.AnonymousClass1.endsWith();
        MerchantAccountInformationTemplate merchantAccountInformationTemplate2 = additionalPaymentNetworks.get(DataAmount.AnonymousClass1.endsWith(1, (iEndsWith * 5) % iEndsWith == 0 ? "f~" : BuildConfig.AnonymousClass1.concat("b{c.>(52zl{v3#", 69)));
        int iEndsWith2 = DataAmount.AnonymousClass1.endsWith();
        MerchantAccountInformationTemplate merchantAccountInformationTemplate3 = additionalPaymentNetworks.get(DataAmount.AnonymousClass1.endsWith(2, (iEndsWith2 * 2) % iEndsWith2 != 0 ? BuildConfig.AnonymousClass1.concat("C\u0003k%0GYmn_\t5(\u000f7qg&\u001a5 \u00173tTKQ98\u001fbmwiE82:<c", 39) : "fx"));
        int iEndsWith3 = DataAmount.AnonymousClass1.endsWith();
        MerchantAccountInformationTemplate merchantAccountInformationTemplate4 = additionalPaymentNetworks.get(DataAmount.AnonymousClass1.endsWith(3, (iEndsWith3 * 3) % iEndsWith3 == 0 ? "ax" : BuildConfig.AnonymousClass1.concat("m+,`&ccu.wsenci8)h4qes0)$aw$z;teh-1-", 29)));
        MerchantAccountInformationC merchantAccountInformationC2 = null;
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            merchantAccountInformationTemplate = null;
            merchantAccountInformationC = null;
        } else {
            merchantAccountInformationTemplate = merchantAccountInformationTemplate4;
            merchantAccountInformationC = this;
        }
        String strA = a(merchantAccountInformationTemplate2);
        if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
            c2 = 7;
        } else {
            merchantAccountInformationC.f2537a = strA;
            c2 = '\b';
            merchantAccountInformationC = this;
            merchantAccountInformationC2 = merchantAccountInformationC;
        }
        if (c2 != 0) {
            merchantAccountInformationC.f2538b = merchantAccountInformationC2.a(merchantAccountInformationTemplate3);
        }
        this.f2539c = a(merchantAccountInformationTemplate);
    }

    public final String a(MerchantAccountInformationTemplate merchantAccountInformationTemplate) {
        Map<String, String> paymentNetworkSpecific;
        if (merchantAccountInformationTemplate == null || (paymentNetworkSpecific = merchantAccountInformationTemplate.getPaymentNetworkSpecific()) == null || paymentNetworkSpecific.isEmpty()) {
            return "";
        }
        int iConcat = BuildConfig.AnonymousClass1.concat();
        return paymentNetworkSpecific.get(BuildConfig.AnonymousClass1.concat((iConcat * 2) % iConcat != 0 ? DataAmount.AnonymousClass1.endsWith(39, "\u19626") : "!1", 3));
    }

    public String getIdAcquirer() {
        return this.f2537a;
    }

    public String getUniqueCodeMerchant() {
        return this.f2538b;
    }

    public String getUniqueCodeMerchantAggre() {
        return this.f2539c;
    }
}
