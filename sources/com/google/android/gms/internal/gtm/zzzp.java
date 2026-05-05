package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzzp {
    private static final zzzp zza = new zzzp();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzzu zzb = new zzyy();

    private zzzp() {
    }

    public static zzzp zza() {
        return zza;
    }

    public final zzzt zzb(Class cls) {
        zzye.zzc(cls, "messageType");
        zzzt zzztVarZza = (zzzt) this.zzc.get(cls);
        if (zzztVarZza == null) {
            zzztVarZza = this.zzb.zza(cls);
            zzye.zzc(cls, "messageType");
            zzzt zzztVar = (zzzt) this.zzc.putIfAbsent(cls, zzztVarZza);
            if (zzztVar != null) {
                return zzztVar;
            }
        }
        return zzztVarZza;
    }
}
