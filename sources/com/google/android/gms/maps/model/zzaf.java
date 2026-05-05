package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzap;

/* JADX INFO: loaded from: classes8.dex */
final class zzaf implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzap zzb;

    zzaf(TileOverlayOptions tileOverlayOptions) {
        this.zza = tileOverlayOptions;
        this.zzb = tileOverlayOptions.zza;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i2, int i3, int i4) {
        try {
            return this.zzb.zzb(i2, i3, i4);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
