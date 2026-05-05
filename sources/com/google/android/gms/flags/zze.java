package com.google.android.gms.flags;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zze extends com.google.android.gms.internal.flags.zza implements zzc {
    zze(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // com.google.android.gms.flags.zzc
    public final boolean getBooleanFlagValue(String str, boolean z2, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        com.google.android.gms.internal.flags.zzc.writeBoolean(parcelZza, z2);
        parcelZza.writeInt(i2);
        Parcel parcelZza2 = zza(2, parcelZza);
        boolean zZza = com.google.android.gms.internal.flags.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.flags.zzc
    public final int getIntFlagValue(String str, int i2, int i3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        Parcel parcelZza2 = zza(3, parcelZza);
        int i4 = parcelZza2.readInt();
        parcelZza2.recycle();
        return i4;
    }

    @Override // com.google.android.gms.flags.zzc
    public final long getLongFlagValue(String str, long j2, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j2);
        parcelZza.writeInt(i2);
        Parcel parcelZza2 = zza(4, parcelZza);
        long j3 = parcelZza2.readLong();
        parcelZza2.recycle();
        return j3;
    }

    @Override // com.google.android.gms.flags.zzc
    public final String getStringFlagValue(String str, String str2, int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i2);
        Parcel parcelZza2 = zza(5, parcelZza);
        String string = parcelZza2.readString();
        parcelZza2.recycle();
        return string;
    }

    @Override // com.google.android.gms.flags.zzc
    public final void init(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.flags.zzc.zza(parcelZza, iObjectWrapper);
        zzb(1, parcelZza);
    }
}
