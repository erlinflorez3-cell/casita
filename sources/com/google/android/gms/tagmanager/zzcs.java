package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzhl;
import com.google.android.gms.internal.gtm.zzhm;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcs extends zzau implements zzcu {
    zzcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    @Override // com.google.android.gms.tagmanager.zzcu
    public final zzhm getService(IObjectWrapper iObjectWrapper, zzco zzcoVar, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaw.zze(parcelZza, iObjectWrapper);
        zzaw.zze(parcelZza, zzcoVar);
        zzaw.zze(parcelZza, zzcfVar);
        Parcel parcelZzk = zzk(1, parcelZza);
        zzhm zzhmVarZzb = zzhl.zzb(parcelZzk.readStrongBinder());
        parcelZzk.recycle();
        return zzhmVarZzb;
    }
}
