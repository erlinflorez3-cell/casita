package com.google.android.gms.internal.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzlu<T, B> {
    zzlu() {
    }

    abstract B zza();

    abstract T zza(B b2);

    abstract void zza(B b2, int i2, int i3);

    abstract void zza(B b2, int i2, long j2);

    abstract void zza(B b2, int i2, zzht zzhtVar);

    abstract void zza(B b2, int i2, T t2);

    abstract void zza(T t2, zzmr zzmrVar) throws IOException;

    abstract void zza(Object obj, T t2);

    abstract boolean zza(zzld zzldVar);

    final boolean zza(B b2, zzld zzldVar) throws IOException {
        int iZzb = zzldVar.zzb();
        int i2 = iZzb >>> 3;
        int i3 = iZzb & 7;
        if (i3 == 0) {
            zza(b2, i2, zzldVar.zzg());
            return true;
        }
        if (i3 == 1) {
            zzb(b2, i2, zzldVar.zzi());
            return true;
        }
        if (i3 == 2) {
            zza((Object) b2, i2, zzldVar.zzn());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzjk.zzf();
            }
            zza((Object) b2, i2, zzldVar.zzj());
            return true;
        }
        B bZza = zza();
        int i4 = 4 | (i2 << 3);
        while (zzldVar.zza() != Integer.MAX_VALUE && zza((Object) bZza, zzldVar)) {
        }
        if (i4 != zzldVar.zzb()) {
            throw zzjk.zze();
        }
        zza(b2, i2, zza(bZza));
        return true;
    }

    abstract T zzb(Object obj);

    abstract void zzb(B b2, int i2, long j2);

    abstract void zzb(T t2, zzmr zzmrVar) throws IOException;

    abstract void zzb(Object obj, B b2);

    abstract B zzc(Object obj);

    abstract T zzc(T t2, T t3);

    abstract void zzd(Object obj);

    abstract int zze(T t2);

    abstract int zzf(T t2);
}
