package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaft extends zzbel implements zzbft {
    private static final zzaft zzb;
    private zzbet zzd = zzL();

    static {
        zzaft zzaftVar = new zzaft();
        zzb = zzaftVar;
        zzbel.zzR(zzaft.class, zzaftVar);
    }

    private zzaft() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzafq.class});
        }
        if (i3 == 3) {
            return new zzaft();
        }
        zzafr zzafrVar = null;
        if (i3 == 4) {
            return new zzafs(zzafrVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
