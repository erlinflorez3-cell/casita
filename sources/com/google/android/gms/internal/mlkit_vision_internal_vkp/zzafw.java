package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafw extends zzbel implements zzbft {
    private static final zzafw zzb;
    private zzber zzd = zzJ();

    static {
        zzafw zzafwVar = new zzafw();
        zzb = zzafwVar;
        zzbel.zzR(zzafw.class, zzafwVar);
    }

    private zzafw() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zzd", zzbci.zza()});
        }
        if (i3 == 3) {
            return new zzafw();
        }
        zzafu zzafuVar = null;
        if (i3 == 4) {
            return new zzafv(zzafuVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
