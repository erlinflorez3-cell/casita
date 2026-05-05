package com.valid.emvqr.entities;

import com.valid.emvqr.enums.MerchantAccountInfoTag;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.exceptions.MissingTagException;
import com.valid.emvqr.qb;
import com.valid.emvqr.ys;
import java.util.Map;
import yg.C1499aX;
import yg.EO;
import yg.Ig;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class MerchantAccountInformation extends AbstractMerchantEntity<MerchantAccountInfoTag> {
    public MerchantAccountInformation() {
        super(MerchantAccountInfoTag.class, "", null);
    }

    public Map<String, MerchantAccountInformationTemplate> getAdditionalPaymentNetworks() {
        try {
            return o(MerchantAccountInfoTag.TAG_26_MERCHANT_IDENTIFIER.getTag(), MerchantAccountInfoTag.TAG_51_MERCHANT_IDENTIFIER.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getAmexMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_11_MERCHANT_IDENTIFIER_AMEX.getTag(), MerchantAccountInfoTag.TAG_12_MERCHANT_IDENTIFIER_AMEX.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getDiscoverMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_09_MERCHANT_IDENTIFIER_DISCOVER.getTag(), MerchantAccountInfoTag.TAG_10_MERCHANT_IDENTIFIER_DISCOVER.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getEmvcoMerchantIdentifiers() {
        String tag;
        String tag2;
        try {
            MerchantAccountInfoTag merchantAccountInfoTag = MerchantAccountInfoTag.TAG_06_MERCHANT_IDENTIFIER;
            if (Integer.parseInt(Ig.wd("G", (short) (ZN.Xd() ^ (341989725 ^ 341970955)))) != 0) {
                tag = null;
                tag2 = null;
            } else {
                tag = merchantAccountInfoTag.getTag();
                tag2 = MerchantAccountInfoTag.TAG_08_MERCHANT_IDENTIFIER.getTag();
            }
            Map<String, String> mapY = y(tag, tag2);
            mapY.putAll(y(MerchantAccountInfoTag.TAG_17_MERCHANT_IDENTIFIER.getTag(), MerchantAccountInfoTag.TAG_25_MERCHANT_IDENTIFIER.getTag()));
            return mapY;
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getJcbMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_13_MERCHANT_IDENTIFIER_JCB.getTag(), MerchantAccountInfoTag.TAG_14_MERCHANT_IDENTIFIER_JCB.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getMastercardMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_04_MERCHANT_IDENTIFIER_MASTERCARD.getTag(), MerchantAccountInfoTag.TAG_05_MERCHANT_IDENTIFIER_MASTERCARD.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getUnionPayMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_15_MERCHANT_IDENTIFIER_UNION_PAY.getTag(), MerchantAccountInfoTag.TAG_16_MERCHANT_IDENTIFIER_UNION_PAY.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    public Map<String, String> getVisaMerchantIdentifiers() {
        try {
            return y(MerchantAccountInfoTag.TAG_02_MERCHANT_IDENTIFIER_VISA.getTag(), MerchantAccountInfoTag.TAG_03_MERCHANT_IDENTIFIER_VISA.getTag());
        } catch (ys unused) {
            return null;
        }
    }

    @Override // com.valid.emvqr.entities.AbstractMerchantEntity
    public void validate() throws EmvQrException {
        try {
            super.validate();
            if (getMap().isEmpty()) {
                throw new MissingTagException(qb.substring(EO.Od("l0$\u0005*Y:3~vp#\u0012DLsb3{{A\f79O\u001c\u000b.c\u001bxcQj\u000fCl{rN\bm`N\f\u0016Ac{FO-|\u0011,>\u0011o?))", (short) (C1499aX.Xd() ^ (444877613 ^ (-444875722)))), 1));
            }
        } catch (ys unused) {
        }
    }
}
