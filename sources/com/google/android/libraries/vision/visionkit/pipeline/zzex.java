package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzex extends zzbel implements zzbft {
    private static final zzex zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzbet zzg = zzL();

    static {
        zzex zzexVar = new zzex();
        zzb = zzexVar;
        zzbel.zzR(zzex.class, zzexVar);
    }

    private zzex() {
    }

    public static zzex zzd(byte[] bArr, zzbdv zzbdvVar) throws zzbew {
        return (zzex) zzbel.zzH(zzb, bArr, zzbdvVar);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzag.class});
        }
        if (i3 == 3) {
            return new zzex();
        }
        zzev zzevVar = null;
        if (i3 == 4) {
            return new zzew(zzevVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzg;
    }
}
