package com.valid.vssh_android_core.card;

import com.valid.vssh_android_core.basecore.BaseVsshCoreCallback;
import com.valid.vssh_android_core.model.response.CardAccountInfoResponse;
import com.valid.vssh_android_core.model.response.PayResponse;
import com.valid.vssh_android_core.model.response.TransactionsResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface CoreCardCallback extends BaseVsshCoreCallback {

    public class Exception extends RuntimeException {
    }

    void onCardAccountInfoResponse(CardAccountInfoResponse cardAccountInfoResponse);

    void onPayResponse(PayResponse payResponse);

    void onTransactionsResponse(TransactionsResponse transactionsResponse);
}
