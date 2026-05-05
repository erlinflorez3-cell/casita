package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdk extends zzdn {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    public static <T> T zza(Bundle bundle, Class<T> cls) {
        T tCast;
        if (bundle == null || (tCast = (T) bundle.get("r")) == null) {
            return null;
        }
        try {
            tCast = cls.cast(tCast);
            return tCast;
        } catch (ClassCastException e2) {
            String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), tCast.getClass().getCanonicalName());
            throw e2;
        }
    }

    public final Bundle zza(long j2) {
        Bundle bundle;
        synchronized (this.zza) {
            if (!this.zzb) {
                try {
                    this.zza.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.zza.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                this.zza.set(bundle);
                this.zzb = true;
            } finally {
                this.zza.notify();
            }
        }
    }

    public final Long zzb(long j2) {
        return (Long) zza(zza(j2), Long.class);
    }

    public final String zzc(long j2) {
        return (String) zza(zza(j2), String.class);
    }
}
