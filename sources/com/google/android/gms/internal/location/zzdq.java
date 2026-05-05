package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.DeviceOrientation;

/* JADX INFO: loaded from: classes8.dex */
final class zzdq extends com.google.android.gms.location.zzs {
    private ListenerHolder zza;

    zzdq(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    final synchronized void zzc(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.zza = listenerHolder;
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.zza;
        }
        listenerHolder.notifyListener(new zzdp(this, deviceOrientation));
    }

    final synchronized void zze() {
        this.zza.clear();
    }
}
