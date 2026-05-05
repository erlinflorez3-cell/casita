package com.google.android.gms.internal.tapandpay;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest;
import com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest;
import com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest;
import com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.ListTokensRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest;
import com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.TokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* JADX INFO: loaded from: classes8.dex */
public interface zzh extends IInterface {
    void zzA(HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzB(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzd(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zze(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzf(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzg(GetTokenStatusRequest getTokenStatusRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzh(int i2, String str, String str2, int i3, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzi(TokenizeRequest tokenizeRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzj(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzk(RequestSelectTokenRequest requestSelectTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzl(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzm(RequestDeleteTokenRequest requestDeleteTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzn(PushTokenizeRequest pushTokenizeRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzo(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzp(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzq(GetStableHardwareIdRequest getStableHardwareIdRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzr(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzs(GetEnvironmentRequest getEnvironmentRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzt(String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzu(CreatePushProvisionSessionRequest createPushProvisionSessionRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzv(ServerPushProvisionRequest serverPushProvisionRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzw(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzx(ListTokensRequest listTokensRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzy(IsTokenizedRequest isTokenizedRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;

    void zzz(ViewTokenRequest viewTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException;
}
