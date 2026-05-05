package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcn extends zzav implements zzco {
    public zzcn() {
        super("com.google.android.gms.tagmanager.IMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.gtm.zzav
    protected final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 2) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) zzaw.zza(parcel, Bundle.CREATOR);
            long j2 = parcel.readLong();
            zzaw.zzc(parcel);
            zzc(string, string2, bundle, j2);
            parcel2.writeNoException();
            return true;
        }
        if (i2 == 11) {
            Map mapZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeMap(mapZzb);
            return true;
        }
        zzcl zzcjVar = null;
        zzci zzcgVar = null;
        if (i2 == 21) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementInterceptor");
                zzcjVar = iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(strongBinder);
            }
            zzaw.zzc(parcel);
            zze(zzcjVar);
            parcel2.writeNoException();
            return true;
        }
        if (i2 != 22) {
            return false;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.tagmanager.IMeasurementEventListener");
            zzcgVar = iInterfaceQueryLocalInterface2 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface2 : new zzcg(strongBinder2);
        }
        zzaw.zzc(parcel);
        zzd(zzcgVar);
        parcel2.writeNoException();
        return true;
    }
}
