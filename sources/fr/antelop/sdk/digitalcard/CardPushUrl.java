package fr.antelop.sdk.digitalcard;

import o.ap.c;

/* JADX INFO: loaded from: classes5.dex */
public final class CardPushUrl {
    private final c.C0331c innerEcommerceTokenRequestorResponse;

    public CardPushUrl(c.C0331c c0331c) {
        this.innerEcommerceTokenRequestorResponse = c0331c;
    }

    public final String getInAppUrl() {
        return this.innerEcommerceTokenRequestorResponse.d();
    }

    public final String getTspPlatformUrl() {
        return this.innerEcommerceTokenRequestorResponse.e();
    }

    public final String getWebUrl() {
        return this.innerEcommerceTokenRequestorResponse.b();
    }
}
