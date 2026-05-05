package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhl extends zzav implements zzhm {
    public zzhl() {
        super("com.google.android.gms.tagmanager.internal.ITagManagerService");
    }

    public static zzhm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
        return iInterfaceQueryLocalInterface instanceof zzhm ? (zzhm) iInterfaceQueryLocalInterface : new zzhk(iBinder);
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzhj zzhhVar;
        if (i2 == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            zzaw.zzc(parcel);
            zzg(string, string2, string3);
        } else if (i2 == 2) {
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzhhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerLoadContainerCallback");
                zzhhVar = iInterfaceQueryLocalInterface instanceof zzhj ? (zzhj) iInterfaceQueryLocalInterface : new zzhh(strongBinder);
            }
            zzaw.zzc(parcel);
            zzh(string4, string5, string6, zzhhVar);
        } else if (i2 == 3) {
            zzi();
        } else if (i2 == 101) {
            String string7 = parcel.readString();
            Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
            String string8 = parcel.readString();
            long j2 = parcel.readLong();
            boolean zZzf = zzaw.zzf(parcel);
            zzaw.zzc(parcel);
            zzf(string7, bundle, string8, j2, zZzf);
        } else {
            if (i2 != 102) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
