package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
final class zzaar extends zzaat {
    zzaar(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.gtm.zzaau.zzj(java.lang.Object, long, boolean):void */
    /* JADX WARN: Method inline failed with exception
    java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative
    	at java.base/java.lang.System.arraycopy(Native Method)
    	at java.base/java.util.ArrayList.shiftTailOverGap(Unknown Source)
    	at java.base/java.util.ArrayList.removeIf(Unknown Source)
     */
    @Override // com.google.android.gms.internal.gtm.zzaat
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzaau.zzb) {
            zzaau.zzD(obj, j2, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzaau.zzj(obj, j2, z2);
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
