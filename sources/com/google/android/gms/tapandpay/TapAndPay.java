package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.tapandpay.zzbd;
import com.google.android.gms.internal.tapandpay.zzbi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public abstract class TapAndPay {
    public static final String ANDROID_WALLET = "androidpay";
    public static final int CARD_NETWORK_AMEX = 1;
    public static final int CARD_NETWORK_BANCOMAT = 14;
    public static final int CARD_NETWORK_DISCOVER = 2;
    public static final int CARD_NETWORK_EFTPOS = 7;
    public static final int CARD_NETWORK_ELO = 12;
    public static final int CARD_NETWORK_ID = 9;
    public static final int CARD_NETWORK_INTERAC = 5;
    public static final int CARD_NETWORK_JCB = 11;
    public static final int CARD_NETWORK_MADA = 18;
    public static final int CARD_NETWORK_MAESTRO = 8;
    public static final int CARD_NETWORK_MASTERCARD = 3;
    public static final int CARD_NETWORK_MIR = 13;
    public static final int CARD_NETWORK_POSTFINANCE = 22;
    public static final int CARD_NETWORK_PRIVATE_LABEL = 6;
    public static final int CARD_NETWORK_QUICPAY = 10;
    public static final int CARD_NETWORK_VISA = 4;
    public static final String EXTRA_CARD_RESULT = "extra_card_result";
    public static final String EXTRA_ISSUER_TOKEN_ID = "extra_issuer_token_id";
    public static final String EXTRA_PUSH_TOKENIZE_RESULT = "extra_push_tokenize_result";
    public static final String EXTRA_STATUS_LIST = "extra_status_list";
    public static final String EXTRA_TOKENIZATION_SESSION_ID = "extra_tokenization_session_id";
    public static final String EXTRA_TOKEN_RESULT = "extra_token_result";
    public static final String EXTRA_VIRTUAL_CARDS_RESULT = "extra_virtual_cards_result";
    public static final String FITBIT_WALLET = "fitbit";
    public static final int TOKEN_PROVIDER_AMEX = 2;
    public static final int TOKEN_PROVIDER_BANCOMAT = 17;
    public static final int TOKEN_PROVIDER_DISCOVER = 5;
    public static final int TOKEN_PROVIDER_EFTPOS = 6;
    public static final int TOKEN_PROVIDER_ELO = 14;
    public static final int TOKEN_PROVIDER_GEMALTO = 15;
    public static final int TOKEN_PROVIDER_IDEMIA = 19;
    public static final int TOKEN_PROVIDER_INTERAC = 7;
    public static final int TOKEN_PROVIDER_JCB = 13;
    public static final int TOKEN_PROVIDER_MASTERCARD = 3;
    public static final int TOKEN_PROVIDER_MIR = 16;
    public static final int TOKEN_PROVIDER_OBERTHUR = 8;
    public static final int TOKEN_PROVIDER_PAYPAL = 9;
    public static final int TOKEN_PROVIDER_THALES = 20;
    public static final int TOKEN_PROVIDER_VISA = 4;
    public static final int TOKEN_STATE_ACTIVE = 5;
    public static final int TOKEN_STATE_FELICA_PENDING_PROVISIONING = 6;
    public static final int TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION = 3;
    public static final int TOKEN_STATE_PENDING = 2;
    public static final int TOKEN_STATE_SUSPENDED = 4;
    public static final int TOKEN_STATE_UNTOKENIZED = 1;
    public static final Api zza;
    public static final Api zzb;
    private static final Api.ClientKey zzc;
    private static final Api.ClientKey zzd;
    private static final Api.AbstractClientBuilder zze;
    private static final Api.AbstractClientBuilder zzf;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardNetwork {
    }

    public interface DataChangedListener {
        void onDataChanged();
    }

    public interface ServiceListener {
        void onResponse(byte[] bArr);
    }

    public @interface TokenRequestorId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenServiceProvider {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TokenState {
    }

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzc = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        zzd = clientKey2;
        zzb zzbVar = new zzb();
        zze = zzbVar;
        zzc zzcVar = new zzc();
        zzf = zzcVar;
        zza = new Api("TapAndPay.TAP_AND_PAY_API", zzbVar, clientKey);
        zzb = new Api("TapAndPay.TAP_AND_PAY_SINGLE_USER_API", zzcVar, clientKey2);
    }

    private TapAndPay() {
    }

    public static TapAndPayClient getClient(Activity activity) {
        return new zzbd(activity);
    }

    public static TapAndPayClient getClient(Context context) {
        return new zzbd(context);
    }

    public static TapAndPaySingleUserClient getSingleUserClient(Context context) {
        return new zzbi(context);
    }
}
