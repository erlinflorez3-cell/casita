package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* JADX INFO: loaded from: classes9.dex */
public final class BarhopperV3Options extends zzeh<BarhopperV3Options, zzk> implements zzfn {
    private static final BarhopperV3Options zzb;
    private int zzd;
    private zzi zze;
    private zzac zzf;
    private zzq zzg;

    static {
        BarhopperV3Options barhopperV3Options = new BarhopperV3Options();
        zzb = barhopperV3Options;
        zzeh.zzV(BarhopperV3Options.class, barhopperV3Options);
    }

    private BarhopperV3Options() {
    }

    public static zzk zza() {
        return (zzk) zzb.zzG();
    }

    static /* synthetic */ void zzc(BarhopperV3Options barhopperV3Options, zzi zziVar) {
        zziVar.getClass();
        barhopperV3Options.zze = zziVar;
        int i2 = barhopperV3Options.zzd;
        barhopperV3Options.zzd = (i2 + 1) - (i2 & 1);
    }

    static /* synthetic */ void zzd(BarhopperV3Options barhopperV3Options, zzac zzacVar) {
        zzacVar.getClass();
        barhopperV3Options.zzf = zzacVar;
        int i2 = barhopperV3Options.zzd;
        barhopperV3Options.zzd = (i2 + 2) - (i2 & 2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new BarhopperV3Options();
        }
        zzj zzjVar = null;
        if (i3 == 4) {
            return new zzk(zzjVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
