package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzbz implements zzbg {
    static final /* synthetic */ zzbz zza = new zzbz();

    private /* synthetic */ zzbz() {
    }

    @Override // com.google.android.gms.internal.location.zzbg
    public final /* synthetic */ void zza(zzdz zzdzVar, ListenerHolder.ListenerKey listenerKey, boolean z2, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdzVar.zzw(listenerKey, z2, taskCompletionSource);
    }
}
