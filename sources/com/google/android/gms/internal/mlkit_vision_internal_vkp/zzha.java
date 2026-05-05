package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzha extends zzbel implements zzbft {
    private static final zzha zzb;
    private int zzd;
    private int zze;
    private float zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzbel.zzR(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public final float zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzha();
        }
        if (i3 == 4) {
            return new zzgz(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzc() {
        return this.zze;
    }

    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzg;
    }
}
