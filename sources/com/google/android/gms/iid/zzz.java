package com.google.android.gms.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzz<T> {
    final int what;
    final int zzcp;
    final TaskCompletionSource<T> zzcq = new TaskCompletionSource<>();
    final Bundle zzcr;

    zzz(int i2, int i3, Bundle bundle) {
        this.zzcp = i2;
        this.what = i3;
        this.zzcr = bundle;
    }

    public String toString() {
        int i2 = this.what;
        int i3 = this.zzcp;
        zzw();
        return new StringBuilder(55).append("Request { what=").append(i2).append(" id=").append(i3).append(" oneWay=false}").toString();
    }

    final void zzd(zzaa zzaaVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzaaVar);
            new StringBuilder(String.valueOf(strValueOf).length() + 14 + String.valueOf(strValueOf2).length()).append("Failing ").append(strValueOf).append(" with ").append(strValueOf2).toString();
        }
        this.zzcq.setException(zzaaVar);
    }

    abstract void zzh(Bundle bundle);

    abstract boolean zzw();
}
