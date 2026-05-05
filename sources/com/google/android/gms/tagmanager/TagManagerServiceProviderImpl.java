package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzhm;
import com.google.android.gms.internal.gtm.zzjl;

/* JADX INFO: loaded from: classes8.dex */
public class TagManagerServiceProviderImpl extends zzct {
    private static volatile zzjl zza = null;

    @Override // com.google.android.gms.tagmanager.zzcu
    public zzhm getService(IObjectWrapper iObjectWrapper, zzco zzcoVar, zzcf zzcfVar) throws RemoteException {
        zzjl zzjlVar = zza;
        if (zzjlVar == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                zzjlVar = zza;
                if (zzjlVar == null) {
                    zzjlVar = new zzjl((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcoVar, zzcfVar);
                    zza = zzjlVar;
                }
            }
        }
        return zzjlVar;
    }
}
