package com.google.android.gms.vision.face.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

/* JADX INFO: loaded from: classes8.dex */
public interface zzh extends IInterface {
    void zza() throws RemoteException;

    boolean zza(int i2) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i2, int i3, int i4, int i5, int i6, int i7, zzs zzsVar) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper iObjectWrapper, zzs zzsVar) throws RemoteException;
}
