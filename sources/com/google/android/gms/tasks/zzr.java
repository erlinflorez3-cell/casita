package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes8.dex */
final class zzr {
    private final Object zza = new Object();
    private Queue zzb;
    private boolean zzc;

    zzr() {
    }

    public final void zza(zzq zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(Task task) {
        zzq zzqVar;
        synchronized (this.zza) {
            if (this.zzb == null || this.zzc) {
                return;
            }
            this.zzc = true;
            while (true) {
                synchronized (this.zza) {
                    zzqVar = (zzq) this.zzb.poll();
                    if (zzqVar == null) {
                        this.zzc = false;
                        return;
                    }
                }
                zzqVar.zzd(task);
            }
        }
    }
}
