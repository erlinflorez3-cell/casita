package com.google.android.gms.internal.tapandpay;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPaySingleUserClient;
import com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbi extends GoogleApi implements TapAndPaySingleUserClient {
    public zzbi(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zzb, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPaySingleUserClient
    public final Task<String> getActiveWalletId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbo zzboVar = (zzbo) obj;
                ((zzk) zzboVar.getService()).zze(new zzbf(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzboVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzW).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPaySingleUserClient
    public final Task<String> getLinkingToken(final GetLinkingTokenRequest getLinkingTokenRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbo zzboVar = (zzbo) obj;
                ((zzk) zzboVar.getService()).zzd(getLinkingTokenRequest, new zzbe(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzboVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzX).setMethodKey(2111).build());
    }
}
