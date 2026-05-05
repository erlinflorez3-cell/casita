package com.google.android.gms.tagmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzau;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcd extends zzau implements zzcf {
    zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // com.google.android.gms.tagmanager.zzcf
    public final String zzb(String str, Map map) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeMap(map);
        Parcel parcelZzk = zzk(2, parcelZza);
        String string = parcelZzk.readString();
        parcelZzk.recycle();
        return string;
    }

    @Override // com.google.android.gms.tagmanager.zzcf
    public final void zzc(String str, Map map) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeMap(map);
        zzl(1, parcelZza);
    }
}
