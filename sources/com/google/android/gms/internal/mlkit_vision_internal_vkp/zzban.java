package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzban extends zzbel implements zzbft {
    private static final zzban zzb;
    private int zzd;
    private float zze = 1.5f;
    private float zzf = 3.0f;
    private float zzg = 3.0f;
    private float zzh = 2.0f;
    private float zzi = 0.5f;
    private float zzj = 1.5f;
    private float zzk = 1.7f;
    private float zzl = 2.0f;
    private boolean zzm;

    static {
        zzban zzbanVar = new zzban();
        zzb = zzbanVar;
        zzbel.zzR(zzban.class, zzbanVar);
    }

    private zzban() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i3 == 3) {
            return new zzban();
        }
        zzazt zzaztVar = null;
        if (i3 == 4) {
            return new zzbam(zzaztVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
