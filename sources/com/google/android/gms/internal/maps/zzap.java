package com.google.android.gms.internal.maps;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface zzap extends IInterface {
    @Nullable
    Tile zzb(int i2, int i3, int i4) throws RemoteException;
}
