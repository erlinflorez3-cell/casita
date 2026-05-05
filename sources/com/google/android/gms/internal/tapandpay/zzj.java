package com.google.android.gms.internal.tapandpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.TokenStatus;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;

/* JADX INFO: loaded from: classes8.dex */
public interface zzj extends IInterface {
    void zzA(Status status, com.google.android.gms.tapandpay.firstparty.zzah zzahVar) throws RemoteException;

    void zzB(Status status) throws RemoteException;

    void zzC(Status status, com.google.android.gms.tapandpay.firstparty.zzx zzxVar) throws RemoteException;

    void zzD(Status status) throws RemoteException;

    void zzE(Status status, com.google.android.gms.tapandpay.firstparty.zzba zzbaVar) throws RemoteException;

    void zzF(Status status, GetGlobalActionCardsResponse getGlobalActionCardsResponse) throws RemoteException;

    void zzG(Status status, String str) throws RemoteException;

    void zzH(Status status) throws RemoteException;

    void zzI(Status status) throws RemoteException;

    void zzJ(Status status, com.google.android.gms.tapandpay.firstparty.zzz zzzVar) throws RemoteException;

    void zzK(Status status, QuickAccessWalletConfig quickAccessWalletConfig) throws RemoteException;

    void zzL(Status status, com.google.android.gms.tapandpay.firstparty.zzv zzvVar) throws RemoteException;

    void zzM(Status status, boolean z2) throws RemoteException;

    void zzN(Status status, TokenInfo[] tokenInfoArr) throws RemoteException;

    void zzO(Status status, com.google.android.gms.tapandpay.firstparty.zzk zzkVar) throws RemoteException;

    void zzP(Status status, byte[] bArr) throws RemoteException;

    void zzQ(Status status, PushProvisionSessionContext pushProvisionSessionContext) throws RemoteException;

    void zzR(Status status, boolean z2) throws RemoteException;

    void zzS(Status status, com.google.android.gms.tapandpay.firstparty.zzal zzalVar) throws RemoteException;

    void zzT(Status status) throws RemoteException;

    void zzU(Status status, String str) throws RemoteException;

    void zzV(Status status, boolean z2) throws RemoteException;

    void zzW(Status status, ReachableDeviceWalletInfo[] reachableDeviceWalletInfoArr) throws RemoteException;

    void zzX(Status status, boolean z2) throws RemoteException;

    void zzY(Status status, Intent intent) throws RemoteException;

    void zzZ(Status status, boolean z2) throws RemoteException;

    void zza(Status status) throws RemoteException;

    void zzaa(Status status) throws RemoteException;

    void zzab(Status status, com.google.android.gms.tapandpay.firstparty.zzaf zzafVar) throws RemoteException;

    void zzac(Status status) throws RemoteException;

    void zzad(Status status, com.google.android.gms.tapandpay.firstparty.zzas zzasVar) throws RemoteException;

    void zzae(Status status, com.google.android.gms.tapandpay.firstparty.zzbq zzbqVar) throws RemoteException;

    void zzaf(Status status, boolean z2) throws RemoteException;

    void zzag(Status status, com.google.android.gms.tapandpay.firstparty.zzad zzadVar) throws RemoteException;

    void zzb() throws RemoteException;

    void zzc(Status status) throws RemoteException;

    void zzd(Status status, Bundle bundle) throws RemoteException;

    void zze(Status status, com.google.android.gms.tapandpay.firstparty.zzr zzrVar) throws RemoteException;

    void zzf(Status status) throws RemoteException;

    void zzg(Status status) throws RemoteException;

    void zzh(Status status, com.google.android.gms.tapandpay.firstparty.zzn zznVar) throws RemoteException;

    void zzi(Status status, boolean z2) throws RemoteException;

    void zzj(Status status) throws RemoteException;

    void zzk(Status status, boolean z2) throws RemoteException;

    void zzl(Status status) throws RemoteException;

    void zzm(Status status, com.google.android.gms.tapandpay.firstparty.zzp zzpVar) throws RemoteException;

    void zzn(Status status, RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse) throws RemoteException;

    void zzo(Status status, String str) throws RemoteException;

    void zzp(Status status, String str) throws RemoteException;

    void zzq(Status status, TokenStatus tokenStatus) throws RemoteException;

    void zzr(Status status, boolean z2) throws RemoteException;

    void zzs(Status status) throws RemoteException;

    void zzt(Status status, String str) throws RemoteException;

    void zzu(Status status, String str) throws RemoteException;

    void zzv(Status status) throws RemoteException;

    void zzw(Status status, com.google.android.gms.tapandpay.firstparty.zzaj zzajVar) throws RemoteException;

    void zzx(Status status, com.google.android.gms.tapandpay.firstparty.zzab zzabVar) throws RemoteException;

    void zzy(Status status) throws RemoteException;

    void zzz(Status status, com.google.android.gms.tapandpay.firstparty.zzt zztVar) throws RemoteException;
}
