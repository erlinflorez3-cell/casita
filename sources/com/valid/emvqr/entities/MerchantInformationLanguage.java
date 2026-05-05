package com.valid.emvqr.entities;

import com.valid.emvqr.a4;
import com.valid.emvqr.dp;
import com.valid.emvqr.enums.MerchantLanguageTag;
import com.valid.emvqr.qb;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantInformationLanguage extends AbstractMerchantEntity<MerchantLanguageTag> {
    public MerchantInformationLanguage() {
        super(MerchantLanguageTag.class, qb.substring(C1561oA.od("NA5W*F<]\u0001c46$EM! 2O*!", (short) (C1499aX.Xd() ^ (435158876 ^ (-435158662)))), 1), a4.indexOf(C1607wl.Xd() ^ (1523032055 ^ 881036329), C1561oA.Kd("@X", (short) (FB.Xd() ^ ((1306441427 ^ 460908880) ^ 1453726661)))));
    }

    public String getLanguagePreference() {
        try {
            return v(MerchantLanguageTag.TAG_00_LANGUAGE_PREFERENCE);
        } catch (dp unused) {
            return null;
        }
    }

    public String getMerchantCityAlternateLanguage() {
        try {
            return v(MerchantLanguageTag.TAG_02_ALTERNATE_MERCHANT_CITY);
        } catch (dp unused) {
            return null;
        }
    }

    public String getMerchantNameAlternateLanguage() {
        try {
            return v(MerchantLanguageTag.TAG_01_ALTERNATE_MERCHANT_NAME);
        } catch (dp unused) {
            return null;
        }
    }
}
