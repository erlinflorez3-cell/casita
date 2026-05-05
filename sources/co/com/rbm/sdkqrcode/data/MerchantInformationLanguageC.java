package co.com.rbm.sdkqrcode.data;

import com.dynatrace.android.agent.AdkSettings;
import com.valid.emvqr.entities.MerchantInformationLanguage;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantInformationLanguageC implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f2549a;

    /* JADX INFO: renamed from: b */
    public String f2550b;

    /* JADX INFO: renamed from: c */
    public String f2551c;

    public class Exception extends RuntimeException {
    }

    public MerchantInformationLanguageC(Object obj) {
        String languagePreference;
        char c2;
        MerchantInformationLanguageC merchantInformationLanguageC;
        if (obj instanceof MerchantInformationLanguage) {
            MerchantInformationLanguage merchantInformationLanguage = (MerchantInformationLanguage) obj;
            if (Integer.parseInt(AdkSettings.PLATFORM_TYPE_MOBILE) != 0) {
                merchantInformationLanguage = null;
                c2 = 15;
                languagePreference = null;
                merchantInformationLanguageC = null;
            } else {
                languagePreference = merchantInformationLanguage.getLanguagePreference();
                c2 = '\t';
                merchantInformationLanguageC = this;
            }
            if (c2 != 0) {
                merchantInformationLanguageC.f2549a = languagePreference;
                languagePreference = merchantInformationLanguage.getMerchantNameAlternateLanguage();
                merchantInformationLanguageC = this;
            }
            merchantInformationLanguageC.f2550b = languagePreference;
            this.f2551c = merchantInformationLanguage.getMerchantCityAlternateLanguage();
        }
    }

    public String getLanguagePreference() {
        return this.f2549a;
    }

    public String getMerchantCityAlternateLanguage() {
        return this.f2551c;
    }

    public String getMerchantNameAlternateLanguage() {
        return this.f2550b;
    }
}
