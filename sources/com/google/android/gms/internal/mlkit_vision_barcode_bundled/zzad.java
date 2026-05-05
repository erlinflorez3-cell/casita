package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzad extends zzeh implements zzfn {
    private static final zzad zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzeh.zzV(zzad.class, zzadVar);
    }

    private zzad() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzq.zza, "zzf"});
        }
        if (i3 == 3) {
            return new zzad();
        }
        if (i3 == 4) {
            return new zzac(null);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
