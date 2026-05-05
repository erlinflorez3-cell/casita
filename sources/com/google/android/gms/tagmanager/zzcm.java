package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcm extends zzau implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final Map zzb() throws RemoteException {
        Parcel parcelZzk = zzk(11, zza());
        HashMap mapZzb = zzaw.zzb(parcelZzk);
        parcelZzk.recycle();
        return mapZzb;
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zzc(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaw.zzd(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzl(2, parcelZza);
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zzd(zzci zzciVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaw.zze(parcelZza, zzciVar);
        zzl(22, parcelZza);
    }

    @Override // com.google.android.gms.tagmanager.zzco
    public final void zze(zzcl zzclVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaw.zze(parcelZza, zzclVar);
        zzl(21, parcelZza);
    }
}
