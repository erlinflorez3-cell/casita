package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.gtm.zzho;
import com.google.android.gms.internal.gtm.zzhu;
import com.google.android.gms.internal.gtm.zzjh;

/* JADX INFO: loaded from: classes8.dex */
public class TagManagerApiImpl extends zzcq {
    private zzjh zza;

    @Override // com.google.android.gms.tagmanager.zzcr
    public void initialize(IObjectWrapper iObjectWrapper, zzco zzcoVar, zzcf zzcfVar) throws RemoteException {
        zzjh zzjhVarZzf = zzjh.zzf((Context) ObjectWrapper.unwrap(iObjectWrapper), zzcoVar, zzcfVar);
        this.zza = zzjhVarZzf;
        zzjhVarZzf.zzm(null);
    }

    @Override // com.google.android.gms.tagmanager.zzcr
    @Deprecated
    public void preview(Intent intent, IObjectWrapper iObjectWrapper) {
        zzho.zze("Deprecated. Please use previewIntent instead.");
    }

    @Override // com.google.android.gms.tagmanager.zzcr
    public void previewIntent(Intent intent, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, zzco zzcoVar, zzcf zzcfVar) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
        this.zza = zzjh.zzf(context, zzcoVar, zzcfVar);
        new zzhu(intent, context, context2, this.zza).zzb();
    }
}
