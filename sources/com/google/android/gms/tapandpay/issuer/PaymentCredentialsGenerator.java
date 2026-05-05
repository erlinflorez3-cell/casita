package com.google.android.gms.tapandpay.issuer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public interface PaymentCredentialsGenerator {
    Future<GeneratePaymentCredentialsResponse> generate(GeneratePaymentCredentialsRequest generatePaymentCredentialsRequest);

    default boolean getAuxiliaryOpaquePaymentCardSupported() {
        return false;
    }

    default boolean getGoogleOpaquePaymentCardSupported() {
        return false;
    }

    default List<String> getSupportedTokenRequestorIds() {
        return new ArrayList();
    }
}
