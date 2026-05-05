package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zziq extends zzbel implements zzbft {
    private static final zziq zzb;
    private zzbet zzd = zzL();

    static {
        zziq zziqVar = new zziq();
        zzb = zziqVar;
        zzbel.zzR(zziq.class, zziqVar);
    }

    private zziq() {
    }

    public static zziq zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzit.class});
        }
        if (i3 == 3) {
            return new zziq();
        }
        if (i3 == 4) {
            return new zzip(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzd() {
        return this.zzd;
    }
}
