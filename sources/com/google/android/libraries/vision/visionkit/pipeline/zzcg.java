package com.google.android.libraries.vision.visionkit.pipeline;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbft;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcg extends zzbel implements zzbft {
    private static final zzcg zzb;
    private int zzd;
    private Object zzf;
    private zzdu zzg;
    private boolean zzh;
    private zzj zzi;
    private zzfi zzj;
    private zzg zzk;
    private int zzl;
    private int zze = 0;
    private byte zzm = 2;

    static {
        zzcg zzcgVar = new zzcg();
        zzb = zzcgVar;
        zzbel.zzR(zzcg.class, zzcgVar);
    }

    private zzcg() {
    }

    public static zzcf zzc() {
        return (zzcf) zzb.zzB();
    }

    static /* synthetic */ void zze(zzcg zzcgVar, zzfi zzfiVar) {
        zzfiVar.getClass();
        zzcgVar.zzj = zzfiVar;
        int i2 = zzcgVar.zzd;
        zzcgVar.zzd = (i2 + 8) - (i2 & 8);
    }

    static /* synthetic */ void zzf(zzcg zzcgVar, zzg zzgVar) {
        zzgVar.getClass();
        zzcgVar.zzk = zzgVar;
        zzcgVar.zzd |= 16;
    }

    static /* synthetic */ void zzg(zzcg zzcgVar, zzdu zzduVar) {
        zzduVar.getClass();
        zzcgVar.zzg = zzduVar;
        int i2 = zzcgVar.zzd;
        zzcgVar.zzd = (i2 + 1) - (i2 & 1);
    }

    static /* synthetic */ void zzh(zzcg zzcgVar, zzj zzjVar) {
        zzjVar.getClass();
        zzcgVar.zzi = zzjVar;
        zzcgVar.zzd |= 4;
    }

    public final int zza() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbel
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i3 == 2) {
            return zzO(zzb, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0002\u0005:\u0000\u0006:\u0000\u0007ဉ\u0004\bင\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzj", "zzi", "zzk", "zzl"});
        }
        if (i3 == 3) {
            return new zzcg();
        }
        zzce zzceVar = null;
        if (i3 == 4) {
            return new zzcf(zzceVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final boolean zzi() {
        if (this.zze == 6) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final boolean zzj() {
        if (this.zze == 5) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final boolean zzk() {
        return (-1) - (((-1) - this.zzd) | ((-1) - 32)) != 0;
    }
}
