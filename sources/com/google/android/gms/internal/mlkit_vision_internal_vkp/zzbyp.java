package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbyp extends zzbel implements zzbft {
    private static final zzbyp zzb;
    private int zzd;
    private zzbhx zze;

    static {
        zzbyp zzbypVar = new zzbyp();
        zzb = zzbypVar;
        zzbel.zzR(zzbyp.class, zzbypVar);
    }

    private zzbyp() {
    }

    public static zzbyp zzf(InputStream inputStream, zzbdv zzbdvVar) throws IOException {
        return (zzbyp) zzbel.zzG(zzb, inputStream, zzbdvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzbyp();
        }
        if (i3 == 4) {
            return new zzbyo(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbhx zzc() {
        zzbhx zzbhxVar = this.zze;
        return zzbhxVar == null ? zzbhx.zze() : zzbhxVar;
    }
}
