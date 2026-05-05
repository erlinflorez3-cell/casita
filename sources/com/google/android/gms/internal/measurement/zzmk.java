package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzmk<T, B> {
    private static volatile int zza = 100;

    zzmk() {
    }

    abstract int zza(T t2);

    abstract B zza();

    abstract T zza(T t2, T t3);

    abstract void zza(B b2, int i2, int i3);

    abstract void zza(B b2, int i2, long j2);

    abstract void zza(B b2, int i2, zzik zzikVar);

    abstract void zza(B b2, int i2, T t2);

    abstract void zza(T t2, zznb zznbVar) throws IOException;

    abstract boolean zza(zzlr zzlrVar);

    final boolean zza(B b2, zzlr zzlrVar, int i2) throws IOException {
        int iZzd = zzlrVar.zzd();
        int i3 = iZzd >>> 3;
        int i4 = iZzd & 7;
        if (i4 == 0) {
            zzb(b2, i3, zzlrVar.zzl());
            return true;
        }
        if (i4 == 1) {
            zza(b2, i3, zzlrVar.zzk());
            return true;
        }
        if (i4 == 2) {
            zza((Object) b2, i3, zzlrVar.zzp());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw zzkb.zza();
            }
            zza((Object) b2, i3, zzlrVar.zzf());
            return true;
        }
        B bZza = zza();
        int i5 = i3 << 3;
        int i6 = (4 + i5) - (4 & i5);
        int i7 = i2 + 1;
        if (i7 >= zza) {
            throw zzkb.zzh();
        }
        while (zzlrVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzlrVar, i7)) {
        }
        if (i6 != zzlrVar.zzd()) {
            throw zzkb.zzb();
        }
        zza(b2, i3, zze(bZza));
        return true;
    }

    abstract int zzb(T t2);

    abstract void zzb(B b2, int i2, long j2);

    abstract void zzb(T t2, zznb zznbVar) throws IOException;

    abstract void zzb(Object obj, B b2);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t2);

    abstract T zzd(Object obj);

    abstract T zze(B b2);

    abstract void zzf(Object obj);
}
