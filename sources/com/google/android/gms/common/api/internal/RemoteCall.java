package com.google.android.gms.common.api.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public interface RemoteCall<T, U> {
    void accept(T t2, U u2) throws RemoteException;
}
