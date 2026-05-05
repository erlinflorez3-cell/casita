package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzwt extends zzbel implements zzbft {
    private static final zzwt zzb;
    private int zzd;
    private zzvc zze;
    private zzafw zzf;
    private zzber zzg = zzJ();
    private zzber zzh = zzJ();
    private zzut zzi;

    static {
        zzwt zzwtVar = new zzwt();
        zzb = zzwtVar;
        zzbel.zzR(zzwt.class, zzwtVar);
    }

    private zzwt() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠞ\u0004ࠞ\u0005ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzwq.zza, "zzh", zzwr.zza, "zzi"});
        }
        if (i3 == 3) {
            return new zzwt();
        }
        if (i3 == 4) {
            return new zzws(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
