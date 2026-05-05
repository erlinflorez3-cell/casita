package com.google.android.gms.tagmanager;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzce extends zzav implements zzcf {
    public zzce() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            String string = parcel.readString();
            HashMap mapZzb = zzaw.zzb(parcel);
            zzaw.zzc(parcel);
            zzc(string, mapZzb);
            parcel2.writeNoException();
        } else {
            if (i2 != 2) {
                return false;
            }
            String string2 = parcel.readString();
            HashMap mapZzb2 = zzaw.zzb(parcel);
            zzaw.zzc(parcel);
            String strZzb = zzb(string2, mapZzb2);
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        }
        return true;
    }
}
