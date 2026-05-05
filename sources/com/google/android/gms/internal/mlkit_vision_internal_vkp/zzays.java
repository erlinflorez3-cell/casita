package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
public final class zzays extends zzbel implements zzbft {
    private static final zzays zzb;
    private int zzd;
    private double zze;
    private double zzf;

    static {
        zzays zzaysVar = new zzays();
        zzb = zzaysVar;
        zzbel.zzR(zzays.class, zzaysVar);
    }

    private zzays() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzays();
        }
        zzayp zzaypVar = null;
        if (i3 == 4) {
            return new zzayr(zzaypVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
