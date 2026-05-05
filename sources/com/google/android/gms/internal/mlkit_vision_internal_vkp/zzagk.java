package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzagk extends zzbel implements zzbft {
    private static final zzagk zzb;
    private int zzd;
    private float zze;
    private float zzf;

    static {
        zzagk zzagkVar = new zzagk();
        zzb = zzagkVar;
        zzbel.zzR(zzagk.class, zzagkVar);
    }

    private zzagk() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzagk();
        }
        zzagh zzaghVar = null;
        if (i3 == 4) {
            return new zzagj(zzaghVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
