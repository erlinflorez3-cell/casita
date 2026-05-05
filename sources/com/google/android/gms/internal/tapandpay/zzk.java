package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class zzk extends zza implements IInterface {
    zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService");
    }

    public final void zzd(GetLinkingTokenRequest getLinkingTokenRequest, zzm zzmVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, getLinkingTokenRequest);
        zzc.zzd(parcelZza, zzmVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(1, parcelZza);
    }

    public final void zze(zzm zzmVar, ApiMetadata apiMetadata) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmVar);
        zzc.zzc(parcelZza, apiMetadata);
        zzb(2, parcelZza);
    }
}
