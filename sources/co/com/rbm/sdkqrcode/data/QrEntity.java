package co.com.rbm.sdkqrcode.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class QrEntity implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MerchantAccountInformationC f2555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MerchantAUnreservedC f2561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MerchantInformationLanguageC f2562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MerchantAdditionalDataC f2563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2568q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f2570s;

    public class Exception extends RuntimeException {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public QrEntity(com.valid.emvqr.entities.MerchantEmvQrEntity r14) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: co.com.rbm.sdkqrcode.data.QrEntity.<init>(com.valid.emvqr.entities.MerchantEmvQrEntity):void");
    }

    public final void a(MerchantAdditionalDataC merchantAdditionalDataC) {
        String referenceLabel = merchantAdditionalDataC.getReferenceLabel() == null ? "" : merchantAdditionalDataC.getReferenceLabel();
        if (referenceLabel.length() == 18) {
            this.f2570s = referenceLabel.substring(12, 18);
            this.f2569r = referenceLabel.substring(0, 12);
        }
    }

    public String getApprovalNumber() {
        return this.f2570s;
    }

    public String getCountryCode() {
        return this.f2557f;
    }

    public String getCrc() {
        return this.f2554c;
    }

    public MerchantAUnreservedC getMerchantAUnreservedC() {
        return this.f2561j;
    }

    public MerchantAccountInformationC getMerchantAccountInformationC() {
        return this.f2555d;
    }

    public MerchantAdditionalDataC getMerchantAdditionalDataC() {
        return this.f2563l;
    }

    public String getMerchantCategoryCode() {
        return this.f2556e;
    }

    public String getMerchantCity() {
        return this.f2559h;
    }

    public MerchantInformationLanguageC getMerchantInformationLanguageC() {
        return this.f2562k;
    }

    public String getMerchantName() {
        return this.f2558g;
    }

    public String getPayloadFormatIndicator() {
        return this.f2552a;
    }

    public String getPointOfInitiationMethod() {
        return this.f2553b;
    }

    public String getPostalCode() {
        return this.f2560i;
    }

    public String getRrn() {
        return this.f2569r;
    }

    public String getTipOrConvenienceIndicator() {
        return this.f2566o;
    }

    public String getTransactionAmount() {
        return this.f2565n;
    }

    public String getTransactionCurrency() {
        return this.f2564m;
    }

    public String getValueOfConvenienceFeeFixed() {
        return this.f2567p;
    }

    public String getValueOfConvenienceFeePercentage() {
        return this.f2568q;
    }
}
