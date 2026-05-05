package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbm extends zzbel implements zzbft {
    private static final zzbm zzb;
    private int zzd;
    private float zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzf = "";
    private zzbet zzg = zzL();

    static {
        zzbm zzbmVar = new zzbm();
        zzb = zzbmVar;
        zzbel.zzR(zzbm.class, zzbmVar);
    }

    private zzbm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzbbd.class, "zzh"});
        }
        if (i3 == 3) {
            return new zzbm();
        }
        if (i3 == 4) {
            return new zzbl(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
