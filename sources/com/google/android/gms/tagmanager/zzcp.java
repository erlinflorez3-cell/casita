package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaw;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcp extends zzau implements zzcr {
    zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ITagManagerApi");
    }

    @Override // com.google.android.gms.tagmanager.zzcr
    public final void initialize(IObjectWrapper iObjectWrapper, zzco zzcoVar, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaw.zze(parcelZza, iObjectWrapper);
        zzaw.zze(parcelZza, zzcoVar);
        zzaw.zze(parcelZza, zzcfVar);
        zzl(1, parcelZza);
    }

    @Override // com.google.android.gms.tagmanager.zzcr
    public final void preview(Intent intent, IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.tagmanager.zzcr
    public final void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzco zzcoVar, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaw.zzd(parcelZza, intent);
        zzaw.zze(parcelZza, iObjectWrapper);
        zzaw.zze(parcelZza, iObjectWrapper2);
        zzaw.zze(parcelZza, zzcoVar);
        zzaw.zze(parcelZza, zzcfVar);
        zzl(3, parcelZza);
    }
}
