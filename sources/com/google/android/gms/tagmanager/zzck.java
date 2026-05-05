package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzck extends zzav implements zzcl {
    public zzck() {
        super("com.google.android.gms.tagmanager.IMeasurementInterceptor");
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 2) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
        long j2 = parcel.readLong();
        zzaw.zzc(parcel);
        zze(string, string2, bundle, j2);
        parcel2.writeNoException();
        return true;
    }
}
