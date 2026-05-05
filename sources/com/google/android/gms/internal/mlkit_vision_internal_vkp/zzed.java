package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzed extends zzbel implements zzbft {
    private static final zzed zzb;
    private int zzd;
    private int zze = 3;
    private float zzf = 100000.0f;
    private float zzg;

    static {
        zzed zzedVar = new zzed();
        zzb = zzedVar;
        zzbel.zzR(zzed.class, zzedVar);
    }

    private zzed() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", zzeb.zza, "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzed();
        }
        zzea zzeaVar = null;
        if (i3 == 4) {
            return new zzec(zzeaVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
