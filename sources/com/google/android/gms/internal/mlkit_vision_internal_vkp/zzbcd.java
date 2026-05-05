package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbcd extends zzbel implements zzbft {
    private static final zzbcd zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private boolean zzl;
    private float zzm;
    private float zzn;
    private byte zzo = 2;
    private String zzh = "";
    private int zzi = -1;
    private float zzj = -1.0f;
    private float zzk = -1.0f;

    static {
        zzbcd zzbcdVar = new zzbcd();
        zzb = zzbcdVar;
        zzbel.zzR(zzbcd.class, zzbcdVar);
    }

    private zzbcd() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i3 == 3) {
            return new zzbcd();
        }
        zzbcb zzbcbVar = null;
        if (i3 == 4) {
            return new zzbcc(zzbcbVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
