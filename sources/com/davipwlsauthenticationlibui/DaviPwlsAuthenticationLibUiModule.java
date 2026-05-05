package com.davipwlsauthenticationlibui;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.transmit.authentication.AuthenticationResult;
import com.transmit.authentication.RegistrationResult;
import com.transmit.authentication.TSAuthCallback;
import com.transmit.authentication.TSAuthentication;
import com.transmit.authentication.TSWebAuthnAuthenticationError;
import com.transmit.authentication.TSWebAuthnRegistrationError;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0004 4&\f2&,x,*\u001d\u0019!&\u001a\u0013\u0010\"\u0016\u001b\u0019u\u0012\n{\u000f")
public class DaviPwlsAuthenticationLibUiModule extends ReactContextBaseJavaModule {
    public static final String NAME = "DaviPwlsAuthenticationLibUi";
    private String authenticationResponse;
    private String registrationResponse;

    public DaviPwlsAuthenticationLibUiModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.authenticationResponse = "";
        this.registrationResponse = "";
    }

    private boolean checkPlatformAuthenticatorAvailable() {
        try {
            return TSAuthentication.isWebAuthnSupported();
        } catch (Exception e2) {
            e2.printStackTrace();
            String str = " Exception Verifying Fido2 Support" + e2.getMessage();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showResult(String str) {
        String str2 = "result: " + str;
    }

    @ReactMethod
    public void authenticate(String str, final Promise promise) {
        TSAuthentication.authenticateWebAuthn(getCurrentActivity(), str, new TSAuthCallback<AuthenticationResult, TSWebAuthnAuthenticationError>() { // from class: com.davipwlsauthenticationlibui.DaviPwlsAuthenticationLibUiModule.2
            @Override // com.transmit.authentication.TSAuthCallback
            public void error(TSWebAuthnAuthenticationError tSWebAuthnAuthenticationError) {
                DaviPwlsAuthenticationLibUiModule.this.showResult(tSWebAuthnAuthenticationError.toString());
                tSWebAuthnAuthenticationError.toString();
                DaviPwlsAuthenticationLibUiModule.this.authenticationResponse = "ERROR";
                promise.reject("AUTHENTICATION_ERROR", tSWebAuthnAuthenticationError.toString());
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void success(AuthenticationResult authenticationResult) {
                DaviPwlsAuthenticationLibUiModule.this.showResult("");
                authenticationResult.result().toString();
                DaviPwlsAuthenticationLibUiModule.this.authenticationResponse = authenticationResult.result().toString();
                promise.resolve(DaviPwlsAuthenticationLibUiModule.this.authenticationResponse);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void initSDK(String str, String str2, String str3, Promise promise) {
        try {
            TSAuthentication.initialize(getCurrentActivity(), str2);
            if (checkPlatformAuthenticatorAvailable()) {
                promise.resolve("SDK init exitoso");
            } else {
                promise.reject("SDK init fallido", "No se pudo inicializar el SDK");
            }
        } catch (Exception e2) {
            promise.reject(e2.toString());
        }
    }

    @ReactMethod
    public void register(String str, final Promise promise) {
        if (Build.VERSION.SDK_INT >= 31) {
            String str2 = "Activity Params:" + getCurrentActivity().getParams().toString();
        }
        TSAuthentication.registerWebAuthn(getCurrentActivity(), str, str, new TSAuthCallback<RegistrationResult, TSWebAuthnRegistrationError>() { // from class: com.davipwlsauthenticationlibui.DaviPwlsAuthenticationLibUiModule.1
            @Override // com.transmit.authentication.TSAuthCallback
            public void error(TSWebAuthnRegistrationError tSWebAuthnRegistrationError) {
                DaviPwlsAuthenticationLibUiModule.this.showResult(tSWebAuthnRegistrationError.toString());
                tSWebAuthnRegistrationError.toString();
                DaviPwlsAuthenticationLibUiModule.this.registrationResponse = "ERROR";
                promise.reject("REGISTRATION_ERROR", tSWebAuthnRegistrationError.toString());
            }

            @Override // com.transmit.authentication.TSAuthCallback
            public void success(RegistrationResult registrationResult) {
                DaviPwlsAuthenticationLibUiModule.this.showResult(registrationResult.toString());
                registrationResult.result().toString();
                DaviPwlsAuthenticationLibUiModule.this.registrationResponse = registrationResult.result().toString();
                promise.resolve(DaviPwlsAuthenticationLibUiModule.this.registrationResponse);
            }
        });
    }
}
