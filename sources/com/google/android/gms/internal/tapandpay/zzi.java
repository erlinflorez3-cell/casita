package com.google.android.gms.internal.tapandpay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
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
public abstract class zzi extends zzb implements zzj {
    public zzi() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 2:
                Status status = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzc(status);
                return true;
            case 3:
                Status status2 = (Status) zzc.zzb(parcel, Status.CREATOR);
                Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
                zzc.zze(parcel);
                zzd(status2, bundle);
                return true;
            case 4:
                Status status3 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzr zzrVar = (com.google.android.gms.tapandpay.firstparty.zzr) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzr.CREATOR);
                zzc.zze(parcel);
                zze(status3, zzrVar);
                return true;
            case 5:
                Status status4 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzf(status4);
                return true;
            case 6:
                Status status5 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzg(status5);
                return true;
            case 7:
            case 16:
            case 26:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 54:
            case 65:
            default:
                return false;
            case 8:
                Status status6 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzn zznVar = (com.google.android.gms.tapandpay.firstparty.zzn) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzn.CREATOR);
                zzc.zze(parcel);
                zzh(status6, zznVar);
                return true;
            case 9:
                Status status7 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zza(status7);
                return true;
            case 10:
                zzb();
                return true;
            case 11:
                Status status8 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza = zzc.zza(parcel);
                zzc.zze(parcel);
                zzi(status8, zZza);
                return true;
            case 12:
                Status status9 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzj(status9);
                return true;
            case 13:
                Status status10 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza2 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzk(status10, zZza2);
                return true;
            case 14:
                Status status11 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzl(status11);
                return true;
            case 15:
                Status status12 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzp zzpVar = (com.google.android.gms.tapandpay.firstparty.zzp) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzp.CREATOR);
                zzc.zze(parcel);
                zzm(status12, zzpVar);
                return true;
            case 17:
                Status status13 = (Status) zzc.zzb(parcel, Status.CREATOR);
                RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = (RetrieveInAppPaymentCredentialResponse) zzc.zzb(parcel, RetrieveInAppPaymentCredentialResponse.CREATOR);
                zzc.zze(parcel);
                zzn(status13, retrieveInAppPaymentCredentialResponse);
                return true;
            case 18:
                Status status14 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string = parcel.readString();
                zzc.zze(parcel);
                zzo(status14, string);
                return true;
            case 19:
                Status status15 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string2 = parcel.readString();
                zzc.zze(parcel);
                zzp(status15, string2);
                return true;
            case 20:
                Status status16 = (Status) zzc.zzb(parcel, Status.CREATOR);
                TokenStatus tokenStatus = (TokenStatus) zzc.zzb(parcel, TokenStatus.CREATOR);
                zzc.zze(parcel);
                zzq(status16, tokenStatus);
                return true;
            case 21:
                Status status17 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza3 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzr(status17, zZza3);
                return true;
            case 22:
                Status status18 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzs(status18);
                return true;
            case 23:
                Status status19 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string3 = parcel.readString();
                zzc.zze(parcel);
                zzt(status19, string3);
                return true;
            case 24:
                Status status20 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string4 = parcel.readString();
                zzc.zze(parcel);
                zzu(status20, string4);
                return true;
            case 25:
                Status status21 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzv(status21);
                return true;
            case 27:
                Status status22 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzaj zzajVar = (com.google.android.gms.tapandpay.firstparty.zzaj) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzaj.CREATOR);
                zzc.zze(parcel);
                zzw(status22, zzajVar);
                return true;
            case 28:
                Status status23 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzab zzabVar = (com.google.android.gms.tapandpay.firstparty.zzab) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzab.CREATOR);
                zzc.zze(parcel);
                zzx(status23, zzabVar);
                return true;
            case 29:
                Status status24 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzy(status24);
                return true;
            case 30:
                Status status25 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzt zztVar = (com.google.android.gms.tapandpay.firstparty.zzt) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzt.CREATOR);
                zzc.zze(parcel);
                zzz(status25, zztVar);
                return true;
            case 35:
                Status status26 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzah zzahVar = (com.google.android.gms.tapandpay.firstparty.zzah) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzah.CREATOR);
                zzc.zze(parcel);
                zzA(status26, zzahVar);
                return true;
            case 38:
                Status status27 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzB(status27);
                return true;
            case 39:
                Status status28 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzx zzxVar = (com.google.android.gms.tapandpay.firstparty.zzx) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzx.CREATOR);
                zzc.zze(parcel);
                zzC(status28, zzxVar);
                return true;
            case 40:
                Status status29 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzD(status29);
                return true;
            case 41:
                Status status30 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzba zzbaVar = (com.google.android.gms.tapandpay.firstparty.zzba) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzba.CREATOR);
                zzc.zze(parcel);
                zzE(status30, zzbaVar);
                return true;
            case 42:
                Status status31 = (Status) zzc.zzb(parcel, Status.CREATOR);
                GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) zzc.zzb(parcel, GetGlobalActionCardsResponse.CREATOR);
                zzc.zze(parcel);
                zzF(status31, getGlobalActionCardsResponse);
                return true;
            case 43:
                Status status32 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string5 = parcel.readString();
                zzc.zze(parcel);
                zzG(status32, string5);
                return true;
            case 44:
                Status status33 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzH(status33);
                return true;
            case 45:
                Status status34 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzI(status34);
                return true;
            case 46:
                Status status35 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzz zzzVar = (com.google.android.gms.tapandpay.firstparty.zzz) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzz.CREATOR);
                zzc.zze(parcel);
                zzJ(status35, zzzVar);
                return true;
            case 47:
                Status status36 = (Status) zzc.zzb(parcel, Status.CREATOR);
                QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) zzc.zzb(parcel, QuickAccessWalletConfig.CREATOR);
                zzc.zze(parcel);
                zzK(status36, quickAccessWalletConfig);
                return true;
            case 48:
                Status status37 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzv zzvVar = (com.google.android.gms.tapandpay.firstparty.zzv) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzv.CREATOR);
                zzc.zze(parcel);
                zzL(status37, zzvVar);
                return true;
            case 49:
                Status status38 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza4 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzM(status38, zZza4);
                return true;
            case 50:
                Status status39 = (Status) zzc.zzb(parcel, Status.CREATOR);
                TokenInfo[] tokenInfoArr = (TokenInfo[]) parcel.createTypedArray(TokenInfo.CREATOR);
                zzc.zze(parcel);
                zzN(status39, tokenInfoArr);
                return true;
            case 51:
                Status status40 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzk zzkVar = (com.google.android.gms.tapandpay.firstparty.zzk) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzk.CREATOR);
                zzc.zze(parcel);
                zzO(status40, zzkVar);
                return true;
            case 52:
                Status status41 = (Status) zzc.zzb(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zze(parcel);
                zzP(status41, bArrCreateByteArray);
                return true;
            case 53:
                Status status42 = (Status) zzc.zzb(parcel, Status.CREATOR);
                PushProvisionSessionContext pushProvisionSessionContext = (PushProvisionSessionContext) zzc.zzb(parcel, PushProvisionSessionContext.CREATOR);
                zzc.zze(parcel);
                zzQ(status42, pushProvisionSessionContext);
                return true;
            case 55:
                Status status43 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza5 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzR(status43, zZza5);
                return true;
            case 56:
                Status status44 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzal zzalVar = (com.google.android.gms.tapandpay.firstparty.zzal) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzal.CREATOR);
                zzc.zze(parcel);
                zzS(status44, zzalVar);
                return true;
            case 57:
                Status status45 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzT(status45);
                return true;
            case 58:
                Status status46 = (Status) zzc.zzb(parcel, Status.CREATOR);
                String string6 = parcel.readString();
                zzc.zze(parcel);
                zzU(status46, string6);
                return true;
            case 59:
                Status status47 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza6 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzV(status47, zZza6);
                return true;
            case 60:
                Status status48 = (Status) zzc.zzb(parcel, Status.CREATOR);
                ReachableDeviceWalletInfo[] reachableDeviceWalletInfoArr = (ReachableDeviceWalletInfo[]) parcel.createTypedArray(ReachableDeviceWalletInfo.CREATOR);
                zzc.zze(parcel);
                zzW(status48, reachableDeviceWalletInfoArr);
                return true;
            case 61:
                Status status49 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza7 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzX(status49, zZza7);
                return true;
            case 62:
                Status status50 = (Status) zzc.zzb(parcel, Status.CREATOR);
                Intent intent = (Intent) zzc.zzb(parcel, Intent.CREATOR);
                zzc.zze(parcel);
                zzY(status50, intent);
                return true;
            case 63:
                Status status51 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza8 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzZ(status51, zZza8);
                return true;
            case 64:
                Status status52 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzaa(status52);
                return true;
            case 66:
                Status status53 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzaf zzafVar = (com.google.android.gms.tapandpay.firstparty.zzaf) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzaf.CREATOR);
                zzc.zze(parcel);
                zzab(status53, zzafVar);
                return true;
            case 67:
                Status status54 = (Status) zzc.zzb(parcel, Status.CREATOR);
                zzc.zze(parcel);
                zzac(status54);
                return true;
            case 68:
                Status status55 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzas zzasVar = (com.google.android.gms.tapandpay.firstparty.zzas) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzas.CREATOR);
                zzc.zze(parcel);
                zzad(status55, zzasVar);
                return true;
            case 69:
                Status status56 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzbq zzbqVar = (com.google.android.gms.tapandpay.firstparty.zzbq) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzbq.CREATOR);
                zzc.zze(parcel);
                zzae(status56, zzbqVar);
                return true;
            case 70:
                Status status57 = (Status) zzc.zzb(parcel, Status.CREATOR);
                boolean zZza9 = zzc.zza(parcel);
                zzc.zze(parcel);
                zzaf(status57, zZza9);
                return true;
            case 71:
                Status status58 = (Status) zzc.zzb(parcel, Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzad zzadVar = (com.google.android.gms.tapandpay.firstparty.zzad) zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzad.CREATOR);
                zzc.zze(parcel);
                zzag(status58, zzadVar);
                return true;
        }
    }
}
