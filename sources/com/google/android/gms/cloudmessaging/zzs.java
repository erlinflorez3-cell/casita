package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    zzs(int i2, int i3, Bundle bundle) {
        this.zza = i2;
        this.zzc = i3;
        this.zzd = bundle;
    }

    public final String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + zzb() + "}";
    }

    abstract void zza(Bundle bundle);

    abstract boolean zzb();

    final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str = "Failing " + toString() + " with " + zztVar.toString();
        }
        this.zzb.setException(zztVar);
    }

    final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str = "Finishing " + toString() + " with " + String.valueOf(obj);
        }
        this.zzb.setResult(obj);
    }
}
