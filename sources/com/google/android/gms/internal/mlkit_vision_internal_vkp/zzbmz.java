package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbmz extends zzbeh implements zzbft {
    private static final zzbmz zzd;
    private int zze;
    private double zzf;
    private int zzg;
    private int zzh;
    private double zzi;
    private double zzj;
    private byte zzk = 2;

    static {
        zzbmz zzbmzVar = new zzbmz();
        zzd = zzbmzVar;
        zzbel.zzR(zzbmz.class, zzbmzVar);
    }

    private zzbmz() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i3 == 2) {
            return zzO(zzd, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004က\u0003\u0005က\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zzbmz();
        }
        if (i3 == 4) {
            return new zzbmy(null);
        }
        if (i3 == 5) {
            return zzd;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
