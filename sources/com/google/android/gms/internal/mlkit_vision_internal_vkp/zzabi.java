package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabi extends zzbel implements zzbft {
    private static final zzabi zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private zzber zzh = zzJ();
    private int zzi;

    static {
        zzabi zzabiVar = new zzabi();
        zzb = zzabiVar;
        zzbel.zzR(zzabi.class, zzabiVar);
    }

    private zzabi() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            zzbep zzbepVar = zzabe.zza;
            zzbep zzbepVar2 = zzabg.zza;
            return zzO(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003", new Object[]{"zzd", "zze", zzbepVar, "zzf", zzbepVar2, "zzg", zzbepVar2, "zzh", zzabf.zza, "zzi", zzabh.zza});
        }
        if (i3 == 3) {
            return new zzabi();
        }
        if (i3 == 4) {
            return new zzabd(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
