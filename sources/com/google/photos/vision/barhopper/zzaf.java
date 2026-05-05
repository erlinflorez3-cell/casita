package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaf extends zzeh implements zzfn {
    private static final zzaf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        zzaf zzafVar = new zzaf();
        zzb = zzafVar;
        zzeh.zzV(zzaf.class, zzafVar);
    }

    private zzaf() {
    }

    public static zzae zzc() {
        return (zzae) zzb.zzG();
    }

    static /* synthetic */ void zze(zzaf zzafVar, int i2) {
        zzafVar.zzd |= 1;
        zzafVar.zze = i2;
    }

    static /* synthetic */ void zzf(zzaf zzafVar, int i2) {
        int i3 = zzafVar.zzd;
        zzafVar.zzd = (i3 + 2) - (i3 & 2);
        zzafVar.zzf = i2;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔄ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzaf();
        }
        if (i3 == 4) {
            return new zzae(null);
        }
        if (i3 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
