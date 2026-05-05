package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzaak {
    zzaak() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i2, int i3);

    abstract void zzi(Object obj, int i2, long j2);

    abstract void zzj(Object obj, int i2, Object obj2);

    abstract void zzk(Object obj, int i2, zzud zzudVar);

    abstract void zzl(Object obj, int i2, long j2);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    final boolean zzp(Object obj, zzzs zzzsVar) throws IOException {
        int iZzd = zzzsVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzl(obj, i2, zzzsVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zzi(obj, i2, zzzsVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zzk(obj, i2, zzzsVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzyg.zza();
            }
            zzh(obj, i2, zzzsVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i4 = i2 << 3;
        while (zzzsVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzzsVar)) {
        }
        if ((-1) - (((-1) - 4) & ((-1) - i4)) != zzzsVar.zzd()) {
            throw zzyg.zzb();
        }
        zzg(objZzf);
        zzj(obj, i2, objZzf);
        return true;
    }

    abstract boolean zzq(zzzs zzzsVar);

    abstract void zzr(Object obj, zzur zzurVar) throws IOException;

    abstract void zzs(Object obj, zzur zzurVar) throws IOException;
}
