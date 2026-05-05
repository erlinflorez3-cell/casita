package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes8.dex */
public final class zzjn extends zzeh implements zzfn {
    private static final zzjn zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzjn zzjnVar = new zzjn();
        zzb = zzjnVar;
        zzeh.zzV(zzjn.class, zzjnVar);
    }

    private zzjn() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzS(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzjn();
        }
        zzhi zzhiVar = null;
        if (i3 == 4) {
            return new zzjm(zzhiVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
