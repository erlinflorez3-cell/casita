package com.google.android.gms.tagmanager;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public interface zzcr extends IInterface {
    void initialize(IObjectWrapper iObjectWrapper, zzco zzcoVar, zzcf zzcfVar) throws RemoteException;

    void preview(Intent intent, IObjectWrapper iObjectWrapper) throws RemoteException;

    void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzco zzcoVar, zzcf zzcfVar) throws RemoteException;
}
