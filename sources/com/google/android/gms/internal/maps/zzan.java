package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* JADX INFO: loaded from: classes8.dex */
public final class zzan extends zza implements zzap {
    zzan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzap
    public final Tile zzb(int i2, int i3, int i4) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        parcelZza.writeInt(i4);
        Parcel parcelZzJ = zzJ(1, parcelZza);
        Tile tile = (Tile) zzc.zza(parcelZzJ, Tile.CREATOR);
        parcelZzJ.recycle();
        return tile;
    }
}
