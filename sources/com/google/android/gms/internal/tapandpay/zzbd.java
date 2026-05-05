package com.google.android.gms.internal.tapandpay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
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
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbd extends GoogleApi implements TapAndPayClient {
    public static final /* synthetic */ int zza = 0;

    public zzbd(Activity activity) {
        super(activity, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public zzbd(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) TapAndPay.zza, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PushProvisionSessionContext> createPushProvisionSession(final CreatePushProvisionSessionRequest createPushProvisionSessionRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzae
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzu(createPushProvisionSessionRequest, new zzx(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzJ).setMethodKey(2107).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void createWallet(final Activity activity, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzo(new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2112).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getActiveWalletId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzav
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zze(new zzv(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<List<ReachableDeviceWalletInfo>> getActiveWalletInfos() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzB(new zzw(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2178).setFeatures(com.google.android.gms.tapandpay.zza.zzk).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final Task<String> getEnvironment() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzr(new zzaa(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getEnvironment(final GetEnvironmentRequest getEnvironmentRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzs(getEnvironmentRequest, new zzab(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzo).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getLinkingToken(final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzt(str, new zzn(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzb).setMethodKey(2111).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final Task<String> getStableHardwareId() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzag
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzp(new zzy(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2109).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<String> getStableHardwareId(final GetStableHardwareIdRequest getStableHardwareIdRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzq(getStableHardwareIdRequest, new zzz(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2109).setFeatures(com.google.android.gms.tapandpay.zza.zzr).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final Task<TokenStatus> getTokenStatus(final int i2, final String str) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzf(i2, str, new zzt(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2102).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<TokenStatus> getTokenStatus(final GetTokenStatusRequest getTokenStatusRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzau
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzg(getTokenStatusRequest, new zzu(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2102).setFeatures(com.google.android.gms.tapandpay.zza.zzt).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Boolean> hasEligibleTokenizationTarget(final HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzA(hasEligibleTokenizationTargetRequest, new zzs(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzv).setMethodKey(2175).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Boolean> isTokenized(final IsTokenizedRequest isTokenizedRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzar
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzy(isTokenizedRequest, new zzq(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzZ).setMethodKey(2164).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final Task<List<TokenInfo>> listTokens() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzap
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzw(new zzo(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzZ).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<List<TokenInfo>> listTokens(final ListTokensRequest listTokensRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzx(listTokensRequest, new zzp(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzaa).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PendingIntent> pushTokenize(final PushTokenizeRequest pushTokenizeRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzad
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i2 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzn(pushTokenizeRequest, new zzbk((TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void pushTokenize(final Activity activity, final PushTokenizeRequest pushTokenizeRequest, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzn(pushTokenizeRequest, new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> registerDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        final ListenerHolder listenerHolderRegisterListener = registerListener(dataChangedListener, TapAndPayClient.DATA_CHANGED_LISTENER_KEY);
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i2 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzd(new com.google.android.gms.tapandpay.zze(null, listenerHolderRegisterListener), zzf.zza(zzbmVar.getContext()));
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(zzam.zza).setMethodKey(2155).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<Void> removeDataChangedListener(TapAndPay.DataChangedListener dataChangedListener) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(dataChangedListener, TapAndPayClient.DATA_CHANGED_LISTENER_KEY), 2152));
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestDeleteToken(final Activity activity, final RequestDeleteTokenRequest requestDeleteTokenRequest, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzay
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzm(requestDeleteTokenRequest, new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2104).setFeatures(com.google.android.gms.tapandpay.zza.zzN).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final void requestDeleteToken(final Activity activity, final String str, final int i2, final int i3) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzax
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i4 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzl(i2, str, new zzbl(activity, i3), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2104).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final void requestSelectToken(final Activity activity, final RequestSelectTokenRequest requestSelectTokenRequest, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzba
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzk(requestSelectTokenRequest, new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2105).setFeatures(com.google.android.gms.tapandpay.zza.zzO).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final void requestSelectToken(final Activity activity, final String str, final int i2, final int i3) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i4 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzj(i2, str, new zzbl(activity, i3), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2105).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void serverPushProvision(final Activity activity, final ServerPushProvisionRequest serverPushProvisionRequest, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzv(serverPushProvisionRequest, new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzJ).setMethodKey(2108).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void tokenize(final Activity activity, final TokenizeRequest tokenizeRequest, final int i2) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzac
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i3 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzi(tokenizeRequest, new zzbl(activity, i2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2101).setFeatures(com.google.android.gms.tapandpay.zza.zzy).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @Deprecated
    public final void tokenize(final Activity activity, final String str, final int i2, final String str2, final int i3, final int i4) {
        doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                int i5 = zzbd.zza;
                ((zzh) zzbmVar.getService()).zzh(i2, str, str2, i3, new zzbl(activity, i4), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2101).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final Task<PendingIntent> viewToken(final ViewTokenRequest viewTokenRequest) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                zzbm zzbmVar = (zzbm) obj;
                ((zzh) zzbmVar.getService()).zzz(viewTokenRequest, new zzr(this.zza, (TaskCompletionSource) obj2), zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2160).setFeatures(com.google.android.gms.tapandpay.zza.zzx).build());
    }
}
