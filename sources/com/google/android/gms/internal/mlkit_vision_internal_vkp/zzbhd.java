package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzbhd {
    private static volatile int zza = 100;

    zzbhd() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i2, int i3);

    abstract void zze(Object obj, int i2, long j2);

    abstract void zzf(Object obj, int i2, Object obj2);

    abstract void zzg(Object obj, int i2, zzbdd zzbddVar);

    abstract void zzh(Object obj, int i2, long j2);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzbge zzbgeVar, int i2) throws IOException {
        int iZzd = zzbgeVar.zzd();
        int i3 = iZzd >>> 3;
        int i4 = (iZzd + 7) - (iZzd | 7);
        if (i4 == 0) {
            zzh(obj, i3, zzbgeVar.zzl());
            return true;
        }
        if (i4 == 1) {
            zze(obj, i3, zzbgeVar.zzk());
            return true;
        }
        if (i4 == 2) {
            zzg(obj, i3, zzbgeVar.zzp());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw new zzbev("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i3, zzbgeVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i5 = i3 << 3;
        int i6 = i2 + 1;
        if (i6 >= zza) {
            throw new zzbew("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzbgeVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzbgeVar, i6)) {
        }
        if ((-1) - (((-1) - i5) & ((-1) - 4)) != zzbgeVar.zzd()) {
            throw new zzbew("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i3, zzc(objZzb));
        return true;
    }
}
