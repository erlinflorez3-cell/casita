package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbaj extends zzbel implements zzbft {
    private static final zzbaj zzb;
    private int zzd;
    private zzbal zze;
    private float zzf;
    private byte zzh = 2;
    private zzbeq zzg = zzI();

    static {
        zzbaj zzbajVar = new zzbaj();
        zzb = zzbajVar;
        zzbel.zzR(zzbaj.class, zzbajVar);
    }

    private zzbaj() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ခ\u0001\u0003\u0013", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzbaj();
        }
        if (i3 == 4) {
            return new zzbai(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
