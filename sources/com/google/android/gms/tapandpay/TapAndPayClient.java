package com.google.android.gms.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest;
import com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest;
import com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest;
import com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.ListTokensRequest;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo;
import com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest;
import com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.issuer.TokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface TapAndPayClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {
    public static final String DATA_CHANGED_LISTENER_KEY = "tapAndPayDataChangedListener";
    public static final String SERVICE_LISTENER_KEY_PREFIX = "tapAndPayServiceListener_";

    Task<PushProvisionSessionContext> createPushProvisionSession(CreatePushProvisionSessionRequest createPushProvisionSessionRequest);

    void createWallet(Activity activity, int i2);

    Task<String> getActiveWalletId();

    Task<List<ReachableDeviceWalletInfo>> getActiveWalletInfos();

    @Deprecated
    Task<String> getEnvironment();

    Task<String> getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    Task<String> getLinkingToken(String str);

    @Deprecated
    Task<String> getStableHardwareId();

    Task<String> getStableHardwareId(GetStableHardwareIdRequest getStableHardwareIdRequest);

    @Deprecated
    Task<TokenStatus> getTokenStatus(int i2, String str);

    Task<TokenStatus> getTokenStatus(GetTokenStatusRequest getTokenStatusRequest);

    Task<Boolean> hasEligibleTokenizationTarget(HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest);

    Task<Boolean> isTokenized(IsTokenizedRequest isTokenizedRequest);

    @Deprecated
    Task<List<TokenInfo>> listTokens();

    Task<List<TokenInfo>> listTokens(ListTokensRequest listTokensRequest);

    Task<PendingIntent> pushTokenize(PushTokenizeRequest pushTokenizeRequest);

    void pushTokenize(Activity activity, PushTokenizeRequest pushTokenizeRequest, int i2);

    Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener);

    Task<Void> removeDataChangedListener(TapAndPay.DataChangedListener dataChangedListener);

    void requestDeleteToken(Activity activity, RequestDeleteTokenRequest requestDeleteTokenRequest, int i2);

    @Deprecated
    void requestDeleteToken(Activity activity, String str, int i2, int i3);

    void requestSelectToken(Activity activity, RequestSelectTokenRequest requestSelectTokenRequest, int i2);

    @Deprecated
    void requestSelectToken(Activity activity, String str, int i2, int i3);

    void serverPushProvision(Activity activity, ServerPushProvisionRequest serverPushProvisionRequest, int i2);

    void tokenize(Activity activity, TokenizeRequest tokenizeRequest, int i2);

    @Deprecated
    void tokenize(Activity activity, String str, int i2, String str2, int i3, int i4);

    Task<PendingIntent> viewToken(ViewTokenRequest viewTokenRequest);
}
