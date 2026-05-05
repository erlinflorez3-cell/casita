package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcj extends zzau implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // com.google.android.gms.tagmanager.zzcl
    public final void zze(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzaw.zzd(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzl(2, parcelZza);
    }
}
