package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbck;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbet;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbew;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbli;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends zzbel implements zzbft {
    private static final zzd zzb;
    private byte zze = 2;
    private zzbet zzd = zzL();

    static {
        zzd zzdVar = new zzd();
        zzb = zzdVar;
        zzbel.zzR(zzd.class, zzdVar);
    }

    private zzd() {
    }

    public static zzd zzd() {
        return zzb;
    }

    public static zzd zze(byte[] bArr, zzbdv zzbdvVar) throws zzbew {
        return (zzd) zzbel.zzH(zzb, bArr, zzbdvVar);
    }

    static /* synthetic */ void zzg(zzd zzdVar, Iterable iterable) {
        zzbet zzbetVar = zzdVar.zzd;
        if (!zzbetVar.zzc()) {
            zzdVar.zzd = zzbel.zzM(zzbetVar);
        }
        zzbck.zzu(iterable, zzdVar.zzd);
    }

    public final int zza() {
        return this.zzd.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", zzbli.class});
        }
        if (i3 == 3) {
            return new zzd();
        }
        if (i3 == 4) {
            return new zzc(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List zzf() {
        return this.zzd;
    }
}
