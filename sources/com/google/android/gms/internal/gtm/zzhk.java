package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhk extends zzau implements zzhm {
    zzhk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zze() throws RemoteException {
        zzl(102, zza());
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzf(String str, Bundle bundle, String str2, long j2, boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaw.zzd(parcelZza, bundle);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j2);
        parcelZza.writeInt(z2 ? 1 : 0);
        zzl(101, parcelZza);
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzg(String str, String str2, String str3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzh(String str, String str2, String str3, zzhj zzhjVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(null);
        zzaw.zze(parcelZza, zzhjVar);
        zzl(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.gtm.zzhm
    public final void zzi() throws RemoteException {
        zzl(3, zza());
    }
}
