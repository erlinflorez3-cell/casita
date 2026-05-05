package com.google.android.gms.tagmanager;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface zzco extends IInterface {
    Map zzb() throws RemoteException;

    void zzc(String str, String str2, Bundle bundle, long j2) throws RemoteException;

    void zzd(zzci zzciVar) throws RemoteException;

    void zze(zzcl zzclVar) throws RemoteException;
}
