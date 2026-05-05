package com.google.android.gms.tapandpay;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes8.dex */
public interface TapAndPaySingleUserClient extends HasApiKey<Api.ApiOptions.NotRequiredOptions> {
    Task<String> getActiveWalletId();

    Task<String> getLinkingToken(GetLinkingTokenRequest getLinkingTokenRequest);
}
