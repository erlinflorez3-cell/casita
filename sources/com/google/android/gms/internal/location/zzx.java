package com.google.android.gms.internal.location;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes8.dex */
public interface zzx extends IInterface {
    void zzb(Status status, LocationAvailability locationAvailability) throws RemoteException;
}
