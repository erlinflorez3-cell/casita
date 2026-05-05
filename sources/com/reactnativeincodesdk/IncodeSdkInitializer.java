package com.reactnativeincodesdk;

import com.incode.welcome_sdk.IncodeWelcome;

/* JADX INFO: loaded from: classes5.dex */
public class IncodeSdkInitializer {
    private final Listener listener;

    interface Listener {
        void onLicenceVerificationError();

        void onReady();
    }

    IncodeSdkInitializer(Listener listener) {
        this.listener = listener;
    }

    public void initialize() {
        IncodeWelcome.getInstance().verifyApiKey(new IncodeWelcome.VerifyListener() { // from class: com.reactnativeincodesdk.IncodeSdkInitializer.1
            @Override // com.incode.welcome_sdk.IncodeWelcome.VerifyListener
            public void onError(Throwable th) {
                th.getMessage();
                IncodeSdkInitializer.this.listener.onLicenceVerificationError();
            }

            @Override // com.incode.welcome_sdk.IncodeWelcome.VerifyListener
            public void onVerified() {
                IncodeSdkInitializer.this.listener.onReady();
            }
        });
    }
}
