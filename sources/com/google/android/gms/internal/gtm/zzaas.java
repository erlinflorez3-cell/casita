package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzaas extends zzaat {
    zzaas(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j2, r5 ? (byte) 1 : (byte) 0);
        } else {
            zzaau.zzE(obj, j2, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j2, b2);
        } else {
            zzaau.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zze(Object obj, long j2, double d2) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzf(Object obj, long j2, float f2) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.gtm.zzaat
    public final boolean zzg(Object obj, long j2) {
        return zzaau.zzb ? zzaau.zzt(obj, j2) : zzaau.zzu(obj, j2);
    }
}
