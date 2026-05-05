package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzm extends zzeh implements zzfn {
    private static final zzm zzb;
    private int zzd;
    private zzeo zze = zzeh.zzP();
    private String zzf = "";

    static {
        zzm zzmVar = new zzm();
        zzb = zzmVar;
        zzeh.zzV(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzm();
        }
        zzk zzkVar = null;
        if (i3 == 4) {
            return new zzl(zzkVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
