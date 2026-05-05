package com.google.android.gms.internal.tapandpay;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            Status status = (Status) zzc.zzb(parcel, Status.CREATOR);
            String string = parcel.readString();
            zzc.zze(parcel);
            zza(status, string);
        } else {
            if (i2 != 2) {
                return false;
            }
            Status status2 = (Status) zzc.zzb(parcel, Status.CREATOR);
            String string2 = parcel.readString();
            zzc.zze(parcel);
            zzb(status2, string2);
        }
        return true;
    }
}
