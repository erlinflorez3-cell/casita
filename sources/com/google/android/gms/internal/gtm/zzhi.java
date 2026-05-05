package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhi extends zzav implements zzhj {
    public zzhi() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        boolean zZzf = zzaw.zzf(parcel);
        String string = parcel.readString();
        zzaw.zzc(parcel);
        zze(zZzf, string);
        return true;
    }
}
