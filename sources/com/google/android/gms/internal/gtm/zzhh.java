package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhh extends zzau implements zzhj {
    zzhh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.gtm.zzhj
    public final void zze(boolean z2, String str) throws RemoteException {
        Parcel parcelZza = zza();
        int i2 = zzaw.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeString(str);
        zzm(1, parcelZza);
    }
}
