package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.Parcel;
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
public final class zzg extends zza implements zzh {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzA(HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, hasEligibleTokenizationTargetRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(92, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzB(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(96, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzd(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zze(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzf(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzg(GetTokenStatusRequest getTokenStatusRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, getTokenStatusRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(101, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzh(int i2, String str, String str2, int i3, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i3);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzi(TokenizeRequest tokenizeRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, tokenizeRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(93, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzj(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzk(RequestSelectTokenRequest requestSelectTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, requestSelectTokenRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(100, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzl(int i2, String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzm(RequestDeleteTokenRequest requestDeleteTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, requestDeleteTokenRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(99, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzn(PushTokenizeRequest pushTokenizeRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pushTokenizeRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzo(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzp(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzq(GetStableHardwareIdRequest getStableHardwareIdRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, getStableHardwareIdRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(103, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzr(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzs(GetEnvironmentRequest getEnvironmentRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, getEnvironmentRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(104, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzt(String str, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(61, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzu(CreatePushProvisionSessionRequest createPushProvisionSessionRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, createPushProvisionSessionRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzv(ServerPushProvisionRequest serverPushProvisionRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, serverPushProvisionRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(68, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzw(zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzx(ListTokensRequest listTokensRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, listTokensRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(102, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzy(IsTokenizedRequest isTokenizedRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, isTokenizedRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzz(ViewTokenRequest viewTokenRequest, zzj zzjVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, viewTokenRequest);
        zzc.zzd(parcelZza, zzjVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(79, parcelZza);
    }
}
